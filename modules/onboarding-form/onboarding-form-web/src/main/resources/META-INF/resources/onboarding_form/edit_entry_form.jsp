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

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

renderResponse.setTitle(LanguageUtil.get(request, "new-onboarding-form-entry"));
%>

<portlet:actionURL name="editEntry" var="editEntryURL" />

<clay:container-fluid cssClass="main-content-body">
	<aui:form action="<%= editEntryURL %>" name="<portlet:namespace />fm">
		<%@ include file="/onboarding_form/edit_messages.jspf" %>

		<clay:sheet>
			<clay:sheet-section>
				<aui:model-context bean="<%= null %>" model="<%= OBFormEntry.class %>" />

				<aui:fieldset>
					<aui:input name="redirect" type="hidden" value="<%= redirect %>" />

					<aui:input name="name" required="true" />

					<aui:select label="select-a-form" name="formId" required="true">

						<%
						for (DDMFormInstance ddmFormInstance : ddmFormInstances) {
						%>

							<aui:option label="<%= ddmFormInstance.getName(themeDisplay.getLocale()) %>" value="<%= ddmFormInstance.getPrimaryKey() %>" />

						<%
						}
						%>

					</aui:select>
				</aui:fieldset>
			</clay:sheet-section>

			<clay:sheet-footer>
				<aui:button-row>
					<aui:button type="submit" value="next"></aui:button>
					<aui:button onClick="<%= redirect.toString() %>" type="cancel"></aui:button>
				</aui:button-row>
			</clay:sheet-footer>
		</clay:sheet>
	</aui:form>
</clay:container-fluid>