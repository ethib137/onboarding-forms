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

import com.liferay.dynamic.data.mapping.service.DDMFormInstanceService;
import com.liferay.form.onboarding.constants.OnboardingFormPortletKeys;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.service.OBFormEntryLocalService;
import com.liferay.form.onboarding.service.OBFormFieldMappingLocalService;
import com.liferay.onboarding.form.web.display.context.OnboardingFormDisplayContext;
import com.liferay.onboarding.form.web.portlet.constants.OnboardingFormWebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.OrganizationLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserGroupLocalService;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Evan Thibodeau
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=" + OnboardingFormPortletKeys.ONBOARDING_FORM,
		"mvc.command.name=/onboarding_form/edit_entry"
	},
	service = MVCRenderCommand.class
)
public class EditEntryMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		try {
			long obFormEntryId = ParamUtil.getLong(
				renderRequest, "obFormEntryId");

			OBFormEntry obFormEntry = _obFormEntryLocalService.fetchOBFormEntry(
				obFormEntryId);

			if (obFormEntry != null) {
				ThemeDisplay themeDisplay =
					(ThemeDisplay)renderRequest.getAttribute(
						WebKeys.THEME_DISPLAY);

				_obFormEntryModelResourcePermission.check(
					themeDisplay.getPermissionChecker(), obFormEntry,
					ActionKeys.UPDATE);
			}
		}
		catch (PortalException pe) {
			SessionErrors.add(renderRequest, pe.getClass());

			return "/onboarding_form/error.jsp";
		}

		renderRequest.setAttribute(
			OnboardingFormWebKeys.ONBOARDING_FORM_DISPLAY_CONTEXT,
			new OnboardingFormDisplayContext(
				_portal.getLiferayPortletRequest(renderRequest),
				_portal.getLiferayPortletResponse(renderResponse),
				_ddmFormInstanceService, _obFormFieldMappingLocalService,
				_groupLocalService, _organizationLocalService,
				_roleLocalService, _userGroupLocalService));

		return "/onboarding_form/edit_entry.jsp";
	}

	@Reference
	private DDMFormInstanceService _ddmFormInstanceService;

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private OBFormEntryLocalService _obFormEntryLocalService;

	@Reference(
		target = "(model.class.name=com.liferay.form.onboarding.model.OBFormEntry)"
	)
	private volatile ModelResourcePermission<OBFormEntry>
		_obFormEntryModelResourcePermission;

	@Reference
	private OBFormFieldMappingLocalService _obFormFieldMappingLocalService;

	@Reference
	private OrganizationLocalService _organizationLocalService;

	@Reference
	private Portal _portal;

	@Reference
	private RoleLocalService _roleLocalService;

	@Reference
	private UserGroupLocalService _userGroupLocalService;

}