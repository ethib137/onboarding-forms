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

import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.service.OBFormEntryLocalServiceUtil;
import com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Evan Thibodeau
 */
public class OBFormEntriesDisplayContext {

	public OBFormEntriesDisplayContext(
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse) {

		_liferayPortletRequest = liferayPortletRequest;
		_liferayPortletResponse = liferayPortletResponse;

		_httpServletRequest = _liferayPortletRequest.getHttpServletRequest();
	}

	public SearchContainer<OBFormEntry> getSearchContainer()
		throws PortalException, PortletException {

		PortletURL portletURL = _liferayPortletResponse.createRenderURL();

		portletURL.setParameter(
			"mvcRenderCommandName", "/onboarding_form/view");

		SearchContainer<OBFormEntry> entriesSearchContainer =
			new SearchContainer<>(
				_liferayPortletRequest,
				PortletURLUtil.clone(portletURL, _liferayPortletResponse), null,
				"no-entries-were-found");

		entriesSearchContainer.setRowChecker(
			new EmptyOnClickRowChecker(_liferayPortletResponse));

		ThemeDisplay themeDisplay =
			(ThemeDisplay)_httpServletRequest.getAttribute(
				WebKeys.THEME_DISPLAY);

		long scopeGroupId = themeDisplay.getScopeGroupId();

		entriesSearchContainer.setTotal(
			OBFormEntryLocalServiceUtil.getOBFormEntriesCount(scopeGroupId));

		List<OBFormEntry> obFormEntries =
			OBFormEntryLocalServiceUtil.getOBFormEntries(
				scopeGroupId, entriesSearchContainer.getStart(),
				entriesSearchContainer.getEnd());

		entriesSearchContainer.setResults(obFormEntries);

		return entriesSearchContainer;
	}

	private final HttpServletRequest _httpServletRequest;
	private final LiferayPortletRequest _liferayPortletRequest;
	private final LiferayPortletResponse _liferayPortletResponse;

}