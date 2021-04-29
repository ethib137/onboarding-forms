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

import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for OBFormEntry. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Evan Thibodeau
 * @see OBFormEntryServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface OBFormEntryService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.liferay.form.onboarding.service.impl.OBFormEntryServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the ob form entry remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link OBFormEntryServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>OBFormEntryServiceUtil</code> to access the ob form entry remote service.
	 */
	public OBFormEntry addOBFormEntry(
			long userId, String name, long formId,
			ServiceContext serviceContext)
		throws PortalException;

	public OBFormEntry deleteOBFormEntry(long obFormEntryId)
		throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public OBFormEntry updateOBFormEntry(
			long userId, long obFormEntryId, String name,
			long[] organizationIds, long[] roleIds, long[] siteIds,
			long[] userGroupIds, boolean sendEmail, boolean active,
			ServiceContext serviceContext)
		throws PortalException;

}