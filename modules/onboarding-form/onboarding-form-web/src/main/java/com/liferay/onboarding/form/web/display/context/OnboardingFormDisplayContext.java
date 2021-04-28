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

package com.liferay.onboarding.form.web.display.context;

import com.liferay.dynamic.data.mapping.model.DDMFormField;
import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.service.DDMFormInstanceService;
import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.form.onboarding.service.OBFormFieldMappingLocalService;
import com.liferay.onboarding.form.web.portlet.constants.OnboardingFormConstants;
import com.liferay.onboarding.form.web.util.OnboardingFormUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.OrganizationConstants;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.OrganizationLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserGroupLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.LinkedHashMapBuilder;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Evan Thibodeau
 */
public class OnboardingFormDisplayContext {

	public OnboardingFormDisplayContext(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse,
		DDMFormInstanceService ddmFormInstanceService,
		OBFormFieldMappingLocalService obFormFieldMappingLocalService,
		GroupLocalService groupLocalService,
		OrganizationLocalService organizationLocalService,
		RoleLocalService roleLocalService,
		UserGroupLocalService userGroupLocalService) {

		_liferayPortletRequest = liferayPortletRequest;
		_liferayPortletResponse = liferayPortletResponse;

		_httpServletRequest = _liferayPortletRequest.getHttpServletRequest();

		_ddmFormInstanceService = ddmFormInstanceService;
		_obFormFieldMappingLocalService = obFormFieldMappingLocalService;
		_groupLocalService = groupLocalService;
		_organizationLocalService = organizationLocalService;
		_roleLocalService = roleLocalService;
		_userGroupLocalService = userGroupLocalService;

		_themeDisplay = (ThemeDisplay)_httpServletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
	}

	public Map<String, Object> getData() throws Exception {
		return HashMapBuilder.<String, Object>put(
			"generalRoles", _getGeneralRoles()
		).put(
			"organizations", _getOrganizationsJSONArray()
		).put(
			"sites", _getSitesJSONArray()
		).put(
			"userGroups", _getUserGroupsJSONArray()
		).build();
	}

	public String getDDMFormInstanceDescription(long ddmFormInstanceId) {
		String description = StringPool.BLANK;

		try {
			DDMFormInstance ddmFormInstance =
				_ddmFormInstanceService.getFormInstance(ddmFormInstanceId);

			ThemeDisplay themeDisplay =
				(ThemeDisplay)_httpServletRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			description = ddmFormInstance.getDescription(
				themeDisplay.getLocale());
		}
		catch (PortalException e) {
			e.printStackTrace();
		}

		return description;
	}

	public List<DDMFormField> getDDMFormInstanceFields(long ddmFormInstanceId) {
		List<DDMFormField> ddmFormFields = null;

		try {
			DDMFormInstance ddmFormInstance =
				_ddmFormInstanceService.getFormInstance(ddmFormInstanceId);

			DDMStructure ddmStructure = ddmFormInstance.getStructure();

			ddmFormFields = ddmStructure.getDDMFormFields(true);

			ddmFormFields = ListUtil.filter(
				ddmFormFields,
				ddmFormField -> OnboardingFormConstants.isMappableFieldType(
					ddmFormField.getType()));
		}
		catch (PortalException e) {
			e.printStackTrace();
		}

		return ddmFormFields;
	}

	public List<DDMFormInstance> getDDMFormInstances() {
		return _ddmFormInstanceService.getFormInstances(
			_themeDisplay.getCompanyId(), _themeDisplay.getScopeGroupId(), -1,
			-1);
	}

	public List<Map<String, String>> getMappableFields() {
		return new ArrayList<Map<String, String>>() {
			{
				add(
					LinkedHashMapBuilder.put(
						"label", "unmapped"
					).put(
						"value", OnboardingFormConstants.MAPPABLE_FIELD_UNMAPPED
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "first-name"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_FIRST_NAME
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "middle-name"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_MIDDLE_NAME
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "last-name"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_LAST_NAME
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "email"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_EMAIL_ADDRESS
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "screen-name"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_SCREEN_NAME
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "birthday"
					).put(
						"value", OnboardingFormConstants.MAPPABLE_FIELD_BIRTHDAY
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "male"
					).put(
						"value", OnboardingFormConstants.MAPPABLE_FIELD_MALE
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "job-title"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_JOB_TITLE
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "password-1"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_PASSWORD1
					).build());

				add(
					LinkedHashMapBuilder.put(
						"label", "password-2"
					).put(
						"value",
						OnboardingFormConstants.MAPPABLE_FIELD_PASSWORD2
					).build());
			}
		};
	}

	public Map<String, String> getOBFormFieldMappingsMap(long obFormEntryId) {
		List<OBFormFieldMapping> obFormFieldMappings =
			_obFormFieldMappingLocalService.getOBFormFieldMappings(
				obFormEntryId);

		return OnboardingFormUtil.getOBFormFieldMappingsMap(
			obFormFieldMappings);
	}

	private JSONArray _getGeneralRoles() {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		List<Role> generalRoles = _roleLocalService.getRoles(
			_themeDisplay.getCompanyId(), RoleConstants.TYPES_REGULAR);

		Locale locale = _themeDisplay.getLocale();

		for (Role role : generalRoles) {
			jsonArray.put(
				JSONUtil.put(
					"label", role.getTitle(locale)
				).put(
					"value", role.getRoleId()
				));
		}

		return jsonArray;
	}

	private JSONArray _getOrganizationsJSONArray() {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		List<Organization> organizations =
			_organizationLocalService.getOrganizations(
				_themeDisplay.getCompanyId(),
				OrganizationConstants.ANY_PARENT_ORGANIZATION_ID);

		for (Organization organization : organizations) {
			jsonArray.put(
				JSONUtil.put(
					"label", organization.getName()
				).put(
					"value", organization.getOrganizationId()
				));
		}

		return jsonArray;
	}

	private JSONArray _getSitesJSONArray() {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		List<Group> sites = _groupLocalService.getGroups(
			_themeDisplay.getCompanyId(), GroupConstants.ANY_PARENT_GROUP_ID,
			true);

		Locale locale = _themeDisplay.getLocale();

		for (Group site : sites) {
			jsonArray.put(
				JSONUtil.put(
					"label", site.getName(locale)
				).put(
					"value", site.getGroupId()
				));
		}

		return jsonArray;
	}

	private JSONArray _getUserGroupsJSONArray() {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		List<UserGroup> userGroups = _userGroupLocalService.getUserGroups(
			_themeDisplay.getCompanyId());

		for (UserGroup userGroup : userGroups) {
			jsonArray.put(
				JSONUtil.put(
					"label", userGroup.getName()
				).put(
					"value", userGroup.getUserGroupId()
				));
		}

		return jsonArray;
	}

	private final DDMFormInstanceService _ddmFormInstanceService;
	private final GroupLocalService _groupLocalService;
	private final HttpServletRequest _httpServletRequest;
	private final LiferayPortletRequest _liferayPortletRequest;
	private final LiferayPortletResponse _liferayPortletResponse;
	private final OBFormFieldMappingLocalService
		_obFormFieldMappingLocalService;
	private final OrganizationLocalService _organizationLocalService;
	private final RoleLocalService _roleLocalService;
	private final ThemeDisplay _themeDisplay;
	private final UserGroupLocalService _userGroupLocalService;

}