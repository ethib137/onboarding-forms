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

import com.liferay.onboarding.form.web.display.context.OBFormEntriesDisplayContext;
import com.liferay.onboarding.form.web.portlet.constants.OnboardingFormPortletKeys;
import com.liferay.onboarding.form.web.portlet.constants.OnboardingFormWebKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.Portal;

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
		"mvc.command.name=/", "mvc.command.name=/onboarding_form/view"
	},
	service = MVCRenderCommand.class
)
public class ViewMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(
		RenderRequest renderRequest, RenderResponse renderResponse) {

		renderRequest.setAttribute(
			OnboardingFormWebKeys.ONBOARDING_FORM_ENTRIES_DISPLAY_CONTEXT,
			new OBFormEntriesDisplayContext(
				_portal.getLiferayPortletRequest(renderRequest),
				_portal.getLiferayPortletResponse(renderResponse)));

		return "/onboarding_form/view.jsp";
	}

	@Reference
	private Portal _portal;

}