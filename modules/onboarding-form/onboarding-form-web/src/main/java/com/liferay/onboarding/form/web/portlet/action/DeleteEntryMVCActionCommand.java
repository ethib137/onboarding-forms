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

import com.liferay.form.onboarding.service.OBFormEntryLocalService;
import com.liferay.onboarding.form.web.portlet.OnboardingFormPortlet;
import com.liferay.onboarding.form.web.portlet.constants.OnboardingFormPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.util.logging.Logger;

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
		"mvc.command.name=deleteEntry"
	},
	service = MVCActionCommand.class
)
public class DeleteEntryMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long obFormEntryId = ParamUtil.getLong(actionRequest, "obFormEntryId");

		try {
			_obFormEntryLocalService.deleteOBFormEntry(obFormEntryId);

			actionResponse.setRenderParameter(
				"obFormEntryId", String.valueOf(obFormEntryId));
		}
		catch (Exception e) {
			_logger.warning(
				"Unable to delete OBFormEntry with Id: " + obFormEntryId);

			PortalUtil.copyRequestParameters(actionRequest, actionResponse);

			actionResponse.setRenderParameter("mvcPath", "/edit_entry.jsp");
		}
	}

	private static final Logger _logger = Logger.getLogger(
		OnboardingFormPortlet.class.getName());

	@Reference
	private OBFormEntryLocalService _obFormEntryLocalService;

}