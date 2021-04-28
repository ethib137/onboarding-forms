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

package com.liferay.onboarding.form.web.portlet.action;

import com.liferay.form.onboarding.exception.OBFormEntryFormException;
import com.liferay.form.onboarding.exception.OBFormEntryNameException;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.form.onboarding.service.OBFormEntryLocalService;
import com.liferay.form.onboarding.service.OBFormFieldMappingLocalService;
import com.liferay.onboarding.form.web.portlet.constants.OnboardingFormPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Evan Thibodeau
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + OnboardingFormPortletKeys.ONBOARDING_FORM,
		"mvc.command.name=editEntry"
	},
	service = MVCActionCommand.class
)
public class EditEntryMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			OBFormEntry.class.getName(), actionRequest);

		System.out.println("TEST FormOnboardingEditEntryMVCAction");

		try {
			String name = ParamUtil.getString(actionRequest, "name");

			if (Validator.isNull(name)) {
				throw new OBFormEntryNameException(
					"you-must-include-a-valid-name");
			}

			long obFormEntryId = ParamUtil.getLong(
				actionRequest, "obFormEntryId");

			long userId = serviceContext.getUserId();

			if (obFormEntryId > 0) {
				long[] organizationIds = ParamUtil.getLongValues(
					actionRequest, "organizationIds");
				long[] roleIds = ParamUtil.getLongValues(
					actionRequest, "roleIds");
				long[] siteIds = ParamUtil.getLongValues(
					actionRequest, "siteIds");
				long[] userGroupIds = ParamUtil.getLongValues(
					actionRequest, "userGroupIds");
				boolean sendEmail = ParamUtil.getBoolean(
					actionRequest, "sendEmail");
				boolean active = ParamUtil.getBoolean(actionRequest, "active");

				_obFormEntryLocalService.updateOBFormEntry(
					userId, obFormEntryId, name, organizationIds, roleIds,
					siteIds, userGroupIds, sendEmail, active, serviceContext);

				String[] mappableFields = ParamUtil.getStringValues(
					actionRequest, "mappableField");

				String[] mappableFieldReferences = ParamUtil.getStringValues(
					actionRequest, "mappableFieldReference");

				_updateMappableFields(
					obFormEntryId, mappableFields, mappableFieldReferences);

				actionResponse.setRenderParameter(
					"obFormEntryId", String.valueOf(obFormEntryId));
			}
			else {
				long formId = ParamUtil.getLong(actionRequest, "formId");

				if (formId <= 0) {
					throw new OBFormEntryFormException(
						"you-must-select-a-form");
				}

				OBFormEntry obFormEntry =
					_obFormEntryLocalService.addOBFormEntry(
						userId, name, formId, serviceContext);

				actionResponse.setRenderParameter(
					"obFormEntryId",
					String.valueOf(obFormEntry.getObFormEntryId()));

				actionResponse.setRenderParameter(
					"mvcRenderCommandName", "/onboarding_form/edit_entry");
			}
		}
		catch (Exception e) {
			SessionErrors.add(actionRequest, e.getClass());

			actionResponse.setRenderParameter(
				"mvcRenderCommandName", "/onboarding_form/create_entry");

			hideDefaultSuccessMessage(actionRequest);
		}
	}

	private void _updateMappableFields(
		long obFormEntryId, String[] mappableFields,
		String[] mappableFieldReferences) {

		Map<String, String> mappableFieldsMap = new HashMap<>();

		for (int i = 0; i < mappableFields.length; i++) {
			String mappableField = mappableFields[i];
			String mappableFieldReference = mappableFieldReferences[i];

			mappableFieldsMap.put(mappableFieldReference, mappableField);
		}

		List<OBFormFieldMapping> obFormFieldMappings =
			_obFormFieldMappingLocalService.getOBFormFieldMappings(
				obFormEntryId);

		for (OBFormFieldMapping obFormFieldMapping : obFormFieldMappings) {
			String formFieldReference =
				obFormFieldMapping.getFormFieldReference();

			if (mappableFieldsMap.containsKey(formFieldReference)) {
				obFormFieldMapping.setUserPropertyName(
					mappableFieldsMap.get(formFieldReference));

				_obFormFieldMappingLocalService.updateOBFormFieldMapping(
					obFormFieldMapping);

				mappableFieldsMap.remove(formFieldReference);
			}
			else {
				try {
					_obFormFieldMappingLocalService.deleteOBFormFieldMapping(
						obFormEntryId, formFieldReference);
				}
				catch (PortalException e) {
					e.printStackTrace();
				}
			}
		}

		mappableFieldsMap.forEach(
			(String formFieldReference, String userProperty) ->
				_obFormFieldMappingLocalService.addOBFormFieldMapping(
					obFormEntryId, formFieldReference, userProperty));
	}

	@Reference
	private OBFormEntryLocalService _obFormEntryLocalService;

	@Reference
	private OBFormFieldMappingLocalService _obFormFieldMappingLocalService;

}