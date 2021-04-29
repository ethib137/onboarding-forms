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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for OBFormEntry. This utility wraps
 * <code>com.liferay.form.onboarding.service.impl.OBFormEntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Evan Thibodeau
 * @see OBFormEntryService
 * @generated
 */
public class OBFormEntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.form.onboarding.service.impl.OBFormEntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>OBFormEntryServiceUtil</code> to access the ob form entry remote service.
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry addOBFormEntry(
			long userId, String name, long formId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addOBFormEntry(
			userId, name, formId, serviceContext);
	}

	public static com.liferay.form.onboarding.model.OBFormEntry
			deleteOBFormEntry(long obFormEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteOBFormEntry(obFormEntryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.form.onboarding.model.OBFormEntry
			updateOBFormEntry(
				long userId, long obFormEntryId, String name,
				long[] organizationIds, long[] roleIds, long[] siteIds,
				long[] userGroupIds, boolean sendEmail, boolean active,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateOBFormEntry(
			userId, obFormEntryId, name, organizationIds, roleIds, siteIds,
			userGroupIds, sendEmail, active, serviceContext);
	}

	public static OBFormEntryService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OBFormEntryService, OBFormEntryService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(OBFormEntryService.class);

		ServiceTracker<OBFormEntryService, OBFormEntryService> serviceTracker =
			new ServiceTracker<OBFormEntryService, OBFormEntryService>(
				bundle.getBundleContext(), OBFormEntryService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}