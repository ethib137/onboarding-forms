/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.onboarding.form.web.model.listener;

import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.dynamic.data.mapping.model.DDMFormInstanceRecord;
import com.liferay.dynamic.data.mapping.model.Value;
import com.liferay.dynamic.data.mapping.storage.DDMFormFieldValue;
import com.liferay.dynamic.data.mapping.storage.DDMFormValues;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.form.onboarding.service.OBFormEntryLocalService;
import com.liferay.form.onboarding.service.OBFormFieldMappingLocalService;
import com.liferay.onboarding.form.web.portlet.constants.OnboardingFormConstants;
import com.liferay.onboarding.form.web.util.OnboardingFormUtil;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.UserScreenNameException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.LocaleThreadLocal;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Evan Thibodeau
 */
@Component(immediate = true, service = ModelListener.class)
public class OnboardingFormInstanceRecordModelListener
	extends BaseModelListener<DDMFormInstanceRecord> {

	@Override
	public void onAfterUpdate(DDMFormInstanceRecord formRecord)
		throws ModelListenerException {

		try {
			if (formRecord.getStatus() == WorkflowConstants.STATUS_APPROVED) {
				OBFormEntry obFormEntry =
					_obFormEntryLocalService.fetchOBFormEntryByFormId(
						formRecord.getFormInstanceId());

				if (obFormEntry == null) {
					return;
				}

				if (!obFormEntry.isActive()) {
					return;
				}

				Map<String, Value> formRecordMappedValues =
					_getFormRecordMappedValues(formRecord);

				if (!formRecordMappedValues.containsKey(
						OnboardingFormConstants.MAPPABLE_FIELD_EMAIL_ADDRESS)) {

					return;
				}

				long companyId = formRecord.getCompanyId();

				String emailAddress = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_EMAIL_ADDRESS);

				User user = _userLocalService.fetchUserByEmailAddress(
					companyId, emailAddress);

				if (user != null) {
					return;
				}

				Locale locale = LocaleThreadLocal.getThemeDisplayLocale();

				DDMFormInstance ddmFormInstance = formRecord.getFormInstance();

				long creatorUserId = ddmFormInstance.getUserId();

				String password1 = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_PASSWORD1);
				String password2 = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_PASSWORD2);

				boolean autoPassword = StringUtil.equals(password1, password2);

				String screenName = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_SCREEN_NAME);

				boolean autoScreenName = false;

				if (Validator.isBlank(screenName)) {
					autoScreenName = true;
					screenName = null;
				}

				String firstName = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_FIRST_NAME);
				String middleName = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_MIDDLE_NAME);
				String lastName = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_LAST_NAME);
				long prefixId = 0;
				long suffixId = 0;

				boolean male = _getBooleanValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_MALE);

				Calendar birthdayCalendar = _getCalendarValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_BIRTHDAY);

				int birthdayMonth = birthdayCalendar.get(Calendar.MONTH);
				int birthdayDay = birthdayCalendar.get(Calendar.DAY_OF_MONTH);
				int birthdayYear = birthdayCalendar.get(Calendar.YEAR);

				String jobTitle = _getStringValue(
					formRecordMappedValues,
					OnboardingFormConstants.MAPPABLE_FIELD_JOB_TITLE);
				long[] groupIds = obFormEntry.getSiteIdsAsLongs();
				long[] organizationIds =
					obFormEntry.getOrganizationIdsAsLongs();
				long[] roleIds = obFormEntry.getRoleIdsAsLongs();
				long[] userGroupIds = obFormEntry.getUserGroupIdsAsLongs();
				boolean sendEmail = obFormEntry.getSendEmail();
				ServiceContext serviceContext =
					ServiceContextThreadLocal.getServiceContext();

				try {
					_userLocalService.addUserWithWorkflow(
						creatorUserId, companyId, autoPassword, password1,
						password2, autoScreenName, screenName, emailAddress,
						locale, firstName, middleName, lastName, prefixId,
						suffixId, male, birthdayMonth, birthdayDay,
						birthdayYear, jobTitle, groupIds, organizationIds,
						roleIds, userGroupIds, sendEmail, serviceContext);
				}
				catch (UserScreenNameException usne) {
					autoScreenName = true;
					screenName = null;

					_userLocalService.addUserWithWorkflow(
						creatorUserId, companyId, autoPassword, password1,
						password2, autoScreenName, screenName, emailAddress,
						locale, firstName, middleName, lastName, prefixId,
						suffixId, male, birthdayMonth, birthdayDay,
						birthdayYear, jobTitle, groupIds, organizationIds,
						roleIds, userGroupIds, sendEmail, serviceContext);
				}
			}
		}
		catch (PortalException e) {
			e.printStackTrace();
		}

		System.out.println("onAfterUpdate");
	}

	private boolean _getBooleanValue(
		Map<String, Value> formRecordMappedValues, String mappableField) {

		boolean bool = Boolean.FALSE;

		String stringValue = _getStringValue(
			formRecordMappedValues, mappableField);

		try {
			JSONArray jsonArray = JSONFactoryUtil.createJSONArray(stringValue);

			bool = jsonArray.length() > 0;
		}
		catch (JSONException e) {
			e.printStackTrace();
		}

		return bool;
	}

	private Calendar _getCalendarValue(
		Map<String, Value> formRecordMappedValues, String mappableField) {

		Calendar calendar = Calendar.getInstance();

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		String stringValue = _getStringValue(
			formRecordMappedValues, mappableField);

		try {
			Date dateOfBirth = df.parse(stringValue);

			calendar.setTime(dateOfBirth);
		}
		catch (ParseException e) {
		}

		return calendar;
	}

	private Map<String, Value> _getFormRecordMappedValues(
			DDMFormInstanceRecord formRecord)
		throws PortalException {

		Map<String, Value> formRecordMappedValues = new HashMap<>();

		OBFormEntry obFormEntry =
			_obFormEntryLocalService.getOBFormEntryByFormId(
				formRecord.getFormInstanceId());

		List<OBFormFieldMapping> obFormFieldMappings =
			_obFormFieldMappingLocalService.getOBFormFieldMappings(
				obFormEntry.getObFormEntryId());

		Map<String, String> obFormFieldMappingsMap =
			OnboardingFormUtil.getOBFormFieldMappingsMap(obFormFieldMappings);

		DDMFormValues ddmFormValues = formRecord.getDDMFormValues();

		return _getFormRecordMappedValues(
			formRecordMappedValues, ddmFormValues.getDDMFormFieldValues(),
			obFormFieldMappingsMap);
	}

	private Map<String, Value> _getFormRecordMappedValues(
		Map<String, Value> formRecordMappedValues,
		List<DDMFormFieldValue> ddmFormFieldValues,
		Map<String, String> obFormFieldMappingsMap) {

		for (DDMFormFieldValue ddmFormFieldValue : ddmFormFieldValues) {
			String fieldReference = ddmFormFieldValue.getFieldReference();

			List<DDMFormFieldValue> nestedDDMFormFieldValues =
				ddmFormFieldValue.getNestedDDMFormFieldValues();

			if (!nestedDDMFormFieldValues.isEmpty()) {
				formRecordMappedValues = _getFormRecordMappedValues(
					formRecordMappedValues, nestedDDMFormFieldValues,
					obFormFieldMappingsMap);
			}

			if (obFormFieldMappingsMap.containsKey(fieldReference)) {
				formRecordMappedValues.put(
					obFormFieldMappingsMap.get(fieldReference),
					ddmFormFieldValue.getValue());
			}
		}

		return formRecordMappedValues;
	}

	private String _getStringValue(
		Map<String, Value> formRecordMappedValues, String mappableField) {

		Value value = formRecordMappedValues.get(mappableField);

		if (value != null) {
			return value.getString(value.getDefaultLocale());
		}

		return null;
	}

	@Reference
	private OBFormEntryLocalService _obFormEntryLocalService;

	@Reference
	private OBFormFieldMappingLocalService _obFormFieldMappingLocalService;

	@Reference
	private UserLocalService _userLocalService;

}