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

package com.liferay.form.onboarding.service.impl;

import com.liferay.form.onboarding.constants.OnboardingFormConstants;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.service.base.OBFormEntryServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

/**
 * The implementation of the ob form entry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.form.onboarding.service.OBFormEntryService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OBFormEntryServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=obform",
		"json.web.service.context.path=OBFormEntry"
	},
	service = AopService.class
)
public class OBFormEntryServiceImpl extends OBFormEntryServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.form.onboarding.service.OBFormEntryServiceUtil</code> to access the ob form entry remote service.
	 */
	@Override
	public OBFormEntry addOBFormEntry(
			long userId, String name, long formId,
			ServiceContext serviceContext)
		throws PortalException {

		_portletResourcePermission.check(
			getPermissionChecker(), serviceContext.getScopeGroupId(),
			ActionKeys.ADD_ENTRY);

		return obFormEntryLocalService.addOBFormEntry(
			userId, name, formId, serviceContext);
	}

	@Override
	public OBFormEntry deleteOBFormEntry(long obFormEntryId)
		throws PortalException {

		_obFormEntryModelResourcePermission.check(
			getPermissionChecker(), obFormEntryId, ActionKeys.DELETE);

		return obFormEntryLocalService.deleteOBFormEntry(obFormEntryId);
	}

	@Override
	public OBFormEntry updateOBFormEntry(
			long userId, long obFormEntryId, String name,
			long[] organizationIds, long[] roleIds, long[] siteIds,
			long[] userGroupIds, boolean sendEmail, boolean active,
			ServiceContext serviceContext)
		throws PortalException {

		_obFormEntryModelResourcePermission.check(
			getPermissionChecker(), obFormEntryId, ActionKeys.UPDATE);

		return obFormEntryLocalService.updateOBFormEntry(
			userId, obFormEntryId, name, organizationIds, roleIds, siteIds,
			userGroupIds, sendEmail, active, serviceContext);
	}

	@Reference(
		policy = ReferencePolicy.DYNAMIC,
		policyOption = ReferencePolicyOption.GREEDY,
		target = "(model.class.name=com.liferay.form.onboarding.model.OBFormEntry)"
	)
	private volatile ModelResourcePermission<OBFormEntry>
		_obFormEntryModelResourcePermission;

	@Reference(
		policy = ReferencePolicy.DYNAMIC,
		policyOption = ReferencePolicyOption.GREEDY,
		target = "(resource.name=" + OnboardingFormConstants.RESOURCE_NAME + ")"
	)
	private volatile PortletResourcePermission _portletResourcePermission;

}