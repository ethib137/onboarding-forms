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
 * Provides a wrapper for {@link OBFormEntryLocalService}.
 *
 * @author Evan Thibodeau
 * @see OBFormEntryLocalService
 * @generated
 */
public class OBFormEntryLocalServiceWrapper
	implements OBFormEntryLocalService,
			   ServiceWrapper<OBFormEntryLocalService> {

	public OBFormEntryLocalServiceWrapper(
		OBFormEntryLocalService obFormEntryLocalService) {

		_obFormEntryLocalService = obFormEntryLocalService;
	}

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>OBFormEntryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>OBFormEntryLocalServiceUtil</code>.
	 */
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry addOBFormEntry(
			long userId, String name, long formId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.addOBFormEntry(
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
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry addOBFormEntry(
		com.liferay.form.onboarding.model.OBFormEntry obFormEntry) {

		return _obFormEntryLocalService.addOBFormEntry(obFormEntry);
	}

	/**
	 * Creates a new ob form entry with the primary key. Does not add the ob form entry to the database.
	 *
	 * @param obFormEntryId the primary key for the new ob form entry
	 * @return the new ob form entry
	 */
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry createOBFormEntry(
		long obFormEntryId) {

		return _obFormEntryLocalService.createOBFormEntry(obFormEntryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry deleteOBFormEntry(
			long obFormEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.deleteOBFormEntry(obFormEntryId);
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
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry deleteOBFormEntry(
			com.liferay.form.onboarding.model.OBFormEntry obFormEntry)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.deleteOBFormEntry(obFormEntry);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _obFormEntryLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _obFormEntryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _obFormEntryLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _obFormEntryLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _obFormEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _obFormEntryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.form.onboarding.model.OBFormEntry fetchOBFormEntry(
		long obFormEntryId) {

		return _obFormEntryLocalService.fetchOBFormEntry(obFormEntryId);
	}

	@Override
	public com.liferay.form.onboarding.model.OBFormEntry
		fetchOBFormEntryByFormId(long formId) {

		return _obFormEntryLocalService.fetchOBFormEntryByFormId(formId);
	}

	/**
	 * Returns the ob form entry matching the UUID and group.
	 *
	 * @param uuid the ob form entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry
		fetchOBFormEntryByUuidAndGroupId(String uuid, long groupId) {

		return _obFormEntryLocalService.fetchOBFormEntryByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _obFormEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _obFormEntryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _obFormEntryLocalService.getIndexableActionableDynamicQuery();
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
	@Override
	public java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(int start, int end) {

		return _obFormEntryLocalService.getOBFormEntries(start, end);
	}

	@Override
	public java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(long groupId) {

		return _obFormEntryLocalService.getOBFormEntries(groupId);
	}

	@Override
	public java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(long groupId, int start, int end) {

		return _obFormEntryLocalService.getOBFormEntries(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntries(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.form.onboarding.model.OBFormEntry> obc) {

		return _obFormEntryLocalService.getOBFormEntries(
			groupId, start, end, obc);
	}

	/**
	 * Returns all the ob form entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the ob form entries
	 * @param companyId the primary key of the company
	 * @return the matching ob form entries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntriesByUuidAndCompanyId(String uuid, long companyId) {

		return _obFormEntryLocalService.getOBFormEntriesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.form.onboarding.model.OBFormEntry>
		getOBFormEntriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.form.onboarding.model.OBFormEntry>
					orderByComparator) {

		return _obFormEntryLocalService.getOBFormEntriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ob form entries.
	 *
	 * @return the number of ob form entries
	 */
	@Override
	public int getOBFormEntriesCount() {
		return _obFormEntryLocalService.getOBFormEntriesCount();
	}

	@Override
	public int getOBFormEntriesCount(long groupId) {
		return _obFormEntryLocalService.getOBFormEntriesCount(groupId);
	}

	/**
	 * Returns the ob form entry with the primary key.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry
	 * @throws PortalException if a ob form entry with the primary key could not be found
	 */
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry getOBFormEntry(
			long obFormEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.getOBFormEntry(obFormEntryId);
	}

	@Override
	public com.liferay.form.onboarding.model.OBFormEntry getOBFormEntryByFormId(
			long formId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.getOBFormEntryByFormId(formId);
	}

	/**
	 * Returns the ob form entry matching the UUID and group.
	 *
	 * @param uuid the ob form entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ob form entry
	 * @throws PortalException if a matching ob form entry could not be found
	 */
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry
			getOBFormEntryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.getOBFormEntryByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _obFormEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.form.onboarding.model.OBFormEntry updateOBFormEntry(
			long userId, long obFormEntryId, String name,
			long[] organizationIds, long[] roleIds, long[] siteIds,
			long[] userGroupIds, boolean sendEmail, boolean active,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _obFormEntryLocalService.updateOBFormEntry(
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
	@Override
	public com.liferay.form.onboarding.model.OBFormEntry updateOBFormEntry(
		com.liferay.form.onboarding.model.OBFormEntry obFormEntry) {

		return _obFormEntryLocalService.updateOBFormEntry(obFormEntry);
	}

	@Override
	public OBFormEntryLocalService getWrappedService() {
		return _obFormEntryLocalService;
	}

	@Override
	public void setWrappedService(
		OBFormEntryLocalService obFormEntryLocalService) {

		_obFormEntryLocalService = obFormEntryLocalService;
	}

	private OBFormEntryLocalService _obFormEntryLocalService;

}