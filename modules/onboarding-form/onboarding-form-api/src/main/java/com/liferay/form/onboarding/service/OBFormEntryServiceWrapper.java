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

package com.liferay.form.onboarding.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OBFormEntryService}.
 *
 * @author Evan Thibodeau
 * @see OBFormEntryService
 * @generated
 */
public class OBFormEntryServiceWrapper
	implements OBFormEntryService, ServiceWrapper<OBFormEntryService> {

	public OBFormEntryServiceWrapper(OBFormEntryService obFormEntryService) {
		_obFormEntryService = obFormEntryService;
	}

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>OBFormEntryServiceUtil</code> to access the ob form entry remote service.
	 */
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry addOBFormEntry(
			long userId, String name, long formId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryService.addOBFormEntry(
			userId, name, formId, serviceContext);
	}

	@Override
	public com.liferay.form.onboarding.model.OBFormEntry deleteOBFormEntry(
			long obFormEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryService.deleteOBFormEntry(obFormEntryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _obFormEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.form.onboarding.model.OBFormEntry updateOBFormEntry(
			long userId, long obFormEntryId, String name,
			long[] organizationIds, long[] roleIds, long[] siteIds,
			long[] userGroupIds, boolean sendEmail, boolean active,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryService.updateOBFormEntry(
			userId, obFormEntryId, name, organizationIds, roleIds, siteIds,
			userGroupIds, sendEmail, active, serviceContext);
	}

	@Override
	public OBFormEntryService getWrappedService() {
		return _obFormEntryService;
	}

	@Override
	public void setWrappedService(OBFormEntryService obFormEntryService) {
		_obFormEntryService = obFormEntryService;
	}

	private OBFormEntryService _obFormEntryService;

}