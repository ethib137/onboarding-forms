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
 * Provides the local service utility for OBFormEntry. This utility wraps
 * <code>com.liferay.form.onboarding.service.impl.OBFormEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Evan Thibodeau
 * @see OBFormEntryLocalService
 * @generated
 */
public class OBFormEntryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.form.onboarding.service.impl.OBFormEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>OBFormEntryLocalService</code> via injection or a <code>ServiceTracker</code> or use <code>OBFormEntryLocalServiceUtil</code>.
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry addOBFormEntry(
			long userId, String name, long formId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addOBFormEntry(
			userId, name, formId, serviceContext);
	}

	/**
	 * Adds the ob form entry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormEntry the ob form entry
	 * @return the ob form entry that was added
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry addOBFormEntry(
		com.liferay.form.onboarding.model.OBFormEntry obFormEntry) {

		return getService().addOBFormEntry(obFormEntry);
	}

	/**
	 * Creates a new ob form entry with the primary key. Does not add the ob form entry to the database.
	 *
	 * @param obFormEntryId the primary key for the new ob form entry
	 * @return the new ob form entry
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry
		createOBFormEntry(long obFormEntryId) {

		return getService().createOBFormEntry(obFormEntryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ob form entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry that was removed
	 * @throws PortalException if a ob form entry with the primary key could not be found
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry
			deleteOBFormEntry(long obFormEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteOBFormEntry(obFormEntryId);
	}

	/**
	 * Deletes the ob form entry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormEntry the ob form entry
	 * @return the ob form entry that was removed
	 * @throws PortalException
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry
			deleteOBFormEntry(
				com.liferay.form.onboarding.model.OBFormEntry obFormEntry)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteOBFormEntry(obFormEntry);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.form.onboarding.model.impl.OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.form.onboarding.model.impl.OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.form.onboarding.model.OBFormEntry
		fetchOBFormEntry(long obFormEntryId) {

		return getService().fetchOBFormEntry(obFormEntryId);
	}

	public static com.liferay.form.onboarding.model.OBFormEntry
		fetchOBFormEntryByFormId(long formId) {

		return getService().fetchOBFormEntryByFormId(formId);
	}

	/**
	 * Returns the ob form entry matching the UUID and group.
	 *
	 * @param uuid the ob form entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry
		fetchOBFormEntryByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchOBFormEntryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the ob form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.form.onboarding.model.impl.OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of ob form entries
	 */
	public static java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(int start, int end) {

		return getService().getOBFormEntries(start, end);
	}

	public static java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(long groupId) {

		return getService().getOBFormEntries(groupId);
	}

	public static java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(long groupId, int start, int end) {

		return getService().getOBFormEntries(groupId, start, end);
	}

	public static java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.form.onboarding.model.OBFormEntry> obc) {

		return getService().getOBFormEntries(groupId, start, end, obc);
	}

	/**
	 * Returns all the ob form entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the ob form entries
	 * @param companyId the primary key of the company
	 * @return the matching ob form entries, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getOBFormEntriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of ob form entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the ob form entries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ob form entries, or an empty list if no matches were found
	 */
	public static java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.form.onboarding.model.OBFormEntry>
					orderByComparator) {

		return getService().getOBFormEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ob form entries.
	 *
	 * @return the number of ob form entries
	 */
	public static int getOBFormEntriesCount() {
		return getService().getOBFormEntriesCount();
	}

	public static int getOBFormEntriesCount(long groupId) {
		return getService().getOBFormEntriesCount(groupId);
	}

	/**
	 * Returns the ob form entry with the primary key.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry
	 * @throws PortalException if a ob form entry with the primary key could not be found
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry getOBFormEntry(
			long obFormEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOBFormEntry(obFormEntryId);
	}

	public static com.liferay.form.onboarding.model.OBFormEntry
			getOBFormEntryByFormId(long formId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOBFormEntryByFormId(formId);
	}

	/**
	 * Returns the ob form entry matching the UUID and group.
	 *
	 * @param uuid the ob form entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ob form entry
	 * @throws PortalException if a matching ob form entry could not be found
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry
			getOBFormEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOBFormEntryByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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

	/**
	 * Updates the ob form entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormEntryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormEntry the ob form entry
	 * @return the ob form entry that was updated
	 */
	public static com.liferay.form.onboarding.model.OBFormEntry
		updateOBFormEntry(
			com.liferay.form.onboarding.model.OBFormEntry obFormEntry) {

		return getService().updateOBFormEntry(obFormEntry);
	}

	public static OBFormEntryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<OBFormEntryLocalService, OBFormEntryLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(OBFormEntryLocalService.class);

		ServiceTracker<OBFormEntryLocalService, OBFormEntryLocalService>
			serviceTracker =
				new ServiceTracker
					<OBFormEntryLocalService, OBFormEntryLocalService>(
						bundle.getBundleContext(),
						OBFormEntryLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}