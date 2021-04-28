<%--
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
--%>

<%@ include file="/META-INF/resources/onboarding_form/init.jsp" %>

<%
OBFormEntriesDisplayContext obFormEntriesDisplayContext = (OBFormEntriesDisplayContext)request.getAttribute(OnboardingFormWebKeys.ONBOARDING_FORM_ENTRIES_DISPLAY_CONTEXT);

SearchContainer<OBFormEntry> entriesSearchContainer = obFormEntriesDisplayContext.getSearchContainer();
%>

<clay:management-toolbar
	displayContext="<%= new OBFormEntriesManagementToolbarDisplayContext(request, liferayPortletRequest, liferayPortletResponse, entriesSearchContainer) %>"
	searchContainerId="obFormEntries"
/>

<clay:container-fluid cssClass="main-content-body">
	<liferay-ui:search-container
		id="obFormEntries"
		searchContainer="<%= entriesSearchContainer %>"
	>
		<liferay-ui:search-container-row
			className="com.liferay.form.onboarding.model.OBFormEntry"
			modelVar="entry"
		>
			<portlet:renderURL var="editURL">
				<portlet:param name="obFormEntryId" value="<%= String.valueOf(entry.getObFormEntryId()) %>" />
				<portlet:param name="mvcRenderCommandName" value="/onboarding_form/edit_entry" />
				<portlet:param name="redirect" value="<%= currentURL %>" />
			</portlet:renderURL>

			<liferay-ui:search-container-column-text href="<%= editURL.toString() %>" property="name" />

			<liferay-ui:search-container-column-text name="form-id" property="formId" />
			<liferay-ui:search-container-column-text property="active" />

			<liferay-ui:search-container-column-jsp
				align="right"
				path="/onboarding_form/entry_actions.jsp"
			/>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator
			markupView="lexicon"
		/>
	</liferay-ui:search-container>
</clay:container-fluid>