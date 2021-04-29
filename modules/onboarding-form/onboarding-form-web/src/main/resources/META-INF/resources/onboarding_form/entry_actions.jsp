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
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

OBFormEntry entry = (OBFormEntry)row.getObject();
%>

<liferay-ui:icon-menu
	cssClass='<%= (row == null) ? "entry-options inline" : StringPool.BLANK %>'
	direction="left-side"
	icon="<%= StringPool.BLANK %>"
	markupView="lexicon"
	message="actions"
	showWhenSingleIcon="<%= true %>"
>
	<c:if test="<%= OBFormEntryModelPermission.contains(permissionChecker, entry.getObFormEntryId(), ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editURL">
			<portlet:param name="obFormEntryId" value="<%= String.valueOf(entry.getObFormEntryId()) %>" />
			<portlet:param name="mvcRenderCommandName" value="/onboarding_form/edit_entry" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
		</portlet:renderURL>

		<liferay-ui:icon
			label="<%= true %>"
			message="edit"
			url="<%= editURL.toString() %>"
		/>
	</c:if>

	<c:if test="<%= OBFormEntryModelPermission.contains(permissionChecker, entry.getObFormEntryId(), ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= OBFormEntry.class.getName() %>"
			modelResourceDescription="<%= entry.getName() %>"
			resourceGroupId="<%= String.valueOf(entry.getGroupId()) %>"
			resourcePrimKey="<%= String.valueOf(entry.getObFormEntryId()) %>"
			var="permissionsEntryURL"
			windowState="<%= LiferayWindowState.POP_UP.toString() %>"
		/>

		<liferay-ui:icon
			label="<%= true %>"
			message="permissions"
			method="get"
			url="<%= permissionsEntryURL %>"
			useDialog="<%= true %>"
		/>
	</c:if>

	<c:if test="<%= OBFormEntryModelPermission.contains(permissionChecker, entry.getObFormEntryId(), ActionKeys.DELETE) %>">
		<portlet:actionURL name="deleteEntry" var="deleteURL">
			<portlet:param name="obFormEntryId" value="<%= String.valueOf(entry.getObFormEntryId()) %>" />
		</portlet:actionURL>

		<liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />
	</c:if>
</liferay-ui:icon-menu>