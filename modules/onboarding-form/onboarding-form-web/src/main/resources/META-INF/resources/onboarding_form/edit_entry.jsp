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
String redirect = ParamUtil.getString(request, "redirect");

OnboardingFormDisplayContext onboardingFormDisplayContext = (OnboardingFormDisplayContext)request.getAttribute(OnboardingFormWebKeys.ONBOARDING_FORM_DISPLAY_CONTEXT);

List<DDMFormInstance> ddmFormInstances = onboardingFormDisplayContext.getDDMFormInstances();
Map<String, Object> data = onboardingFormDisplayContext.getData();

List<Map<String, String>> mappableFields = onboardingFormDisplayContext.getMappableFields();

long obFormEntryId = ParamUtil.getLong(renderRequest, "obFormEntryId");

OBFormEntry obFormEntry = null;

long formId = -1;
List<DDMFormField> ddmFormFields = null;
Map<String, String> obFormFieldMappingsMap = new HashMap<>();

String pageTitle = LanguageUtil.get(request, "new-onboarding-form-entry");

if (obFormEntryId > 0) {
	obFormEntry = OBFormEntryLocalServiceUtil.getOBFormEntry(obFormEntryId);

	obFormFieldMappingsMap = onboardingFormDisplayContext.getOBFormFieldMappingsMap(obFormEntryId);

	formId = obFormEntry.getFormId();

	ddmFormFields = onboardingFormDisplayContext.getDDMFormInstanceFields(formId);

	pageTitle = obFormEntry.getName();
}

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

renderResponse.setTitle(pageTitle);
%>

<portlet:actionURL name="editEntry" var="editEntryURL" />

<clay:container-fluid cssClass="main-content-body">
	<aui:form action="<%= editEntryURL %>" name="<portlet:namespace />fm">
		<%@ include file="/onboarding_form/edit_messages.jspf" %>

		<clay:sheet>
			<clay:sheet-section>
				<aui:model-context bean="<%= obFormEntry %>" model="<%= OBFormEntry.class %>" />

				<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

				<aui:input name="obFormEntryId" type="hidden" value="<%= obFormEntryId %>" />

				<aui:input name="name" required="true" />

				<aui:select disabled="true" label="selected-form" name="formId" required="true">

					<%
					for (DDMFormInstance ddmFormInstance : ddmFormInstances) {
					%>

						<aui:option label="<%= ddmFormInstance.getName(themeDisplay.getLocale()) %>" selected="<%= ddmFormInstance.getPrimaryKey() == formId %>" value="<%= ddmFormInstance.getPrimaryKey() %>" />

					<%
					}
					%>

				</aui:select>

				<aui:input
					label="active"
					name="active"
					type="toggle-switch"
					value="<%= obFormEntry.getActive() %>"
				/>

				<div>
					<p class="text-secondary">
						<%= onboardingFormDisplayContext.getDDMFormInstanceDescription(formId) %>
					</p>
				</div>

				<h4><liferay-ui:message key="form-field-mappings" /></h4>

				<%
				for (DDMFormField ddmFormField : ddmFormFields) {
				%>

					<aui:select
						id="<%= ddmFormField.getFieldReference() %>"
						label="<%= ddmFormField.getLabel().getString(themeDisplay.getLocale()) %>"
						name="mappableField"
						value="<%= obFormFieldMappingsMap.get(ddmFormField.getFieldReference()) %>"
					>

						<%
						for (Map<String, String> mappableField : mappableFields) {
						%>

							<aui:option
								label='<%= mappableField.get("label") %>'
								selected='<%= obFormFieldMappingsMap.get(ddmFormField.getFieldReference()) == mappableField.get("value") %>'
								value='<%= mappableField.get("value") %>'
							/>

						<%
						}
						%>

					</aui:select>

					<aui:input name="mappableFieldReference" type="hidden" value="<%= ddmFormField.getFieldReference() %>" />

				<%
				}
				%>

				<h4><liferay-ui:message key="new-user-settings" /></h4>

				<aui:input
					label="send-email"
					name="sendEmail"
					type="toggle-switch"
					value="<%= obFormEntry.getSendEmail() %>"
				/>

				<div id="<portlet:namespace />-sites"></div>

				<div id="<portlet:namespace />-regularRoles"></div>

				<div id="<portlet:namespace />-organizations"></div>

				<div id="<portlet:namespace />-userGroups"></div>
			</clay:sheet-section>

			<clay:sheet-footer>
				<aui:button-row>
					<aui:button type="submit"></aui:button>
					<aui:button onClick="<%= redirect.toString() %>" type="cancel"></aui:button>
				</aui:button-row>
			</clay:sheet-footer>
		</clay:sheet>
	</aui:form>
</clay:container-fluid>

<aui:script require="<%= mainRequire %>">
	main.multiSelect('<portlet:namespace />-sites', {
		initialItems: "<%= obFormEntry.getSiteIds() %>".split(','),
		sourceItems: <%= data.get("sites") %>,
		name: "<portlet:namespace />siteIds",
		label: "<liferay-ui:message key="site-memberships" />"
	});

	main.multiSelect('<portlet:namespace />-regularRoles', {
		initialItems: "<%= obFormEntry.getRoleIds() %>".split(','),
		sourceItems: <%= data.get("generalRoles") %>,
		name: "<portlet:namespace />roleIds",
		label: "<liferay-ui:message key="regular-roles" />"
	});

	main.multiSelect('<portlet:namespace />-organizations', {
		initialItems: "<%= obFormEntry.getOrganizationIds() %>".split(','),
		sourceItems: <%= data.get("organizations") %>,
		name: "<portlet:namespace />organizationIds",
		label: "<liferay-ui:message key="organizations" />"
	});

	main.multiSelect('<portlet:namespace />-userGroups', {
		initialItems: "<%= obFormEntry.getUserGroupIds() %>".split(','),
		sourceItems: <%= data.get("userGroups") %>,
		name: "<portlet:namespace />userGroupIds",
		label: "<liferay-ui:message key="user-groups" />"
	});
</aui:script>