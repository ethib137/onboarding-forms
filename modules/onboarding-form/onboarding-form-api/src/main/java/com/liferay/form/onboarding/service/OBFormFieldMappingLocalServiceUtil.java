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
 * Provides the local service utility for OBFormFieldMapping. This utility wraps
 * <code>com.liferay.form.onboarding.service.impl.OBFormFieldMappingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Evan Thibodeau
 * @see OBFormFieldMappingLocalService
 * @generated
 */
public class OBFormFieldMappingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.form.onboarding.service.impl.OBFormFieldMappingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>OBFormFieldMappingLocalService</code> via injection or a <code>ServiceTracker</code> or use <code>OBFormFieldMappingLocalServiceUtil</code>.
	 */
	public static com.liferay.form.onboarding.model.OBFormFieldMapping
		addOBFormFieldMapping(
			long obFormEntryId, String formFieldReference,
			String userPropertyName) {

		return getService().addOBFormFieldMapping(
			obFormEntryId, formFieldReference, userPropertyName);
	}

	/**
	 * Adds the ob form field mapping to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormFieldMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormFieldMapping the ob form field mapping
	 * @return the ob form field mapping that was added
	 */
	public static com.liferay.form.onboarding.model.OBFormFieldMapping
		addOBFormFieldMapping(
			com.liferay.form.onboarding.model.OBFormFieldMapping
				obFormFieldMapping) {

		return getService().addOBFormFieldMapping(obFormFieldMapping);
	}

	/**
	 * Creates a new ob form field mapping with the primary key. Does not add the ob form field mapping to the database.
	 *
	 * @param obFormFieldMappingId the primary key for the new ob form field mapping
	 * @return the new ob form field mapping
	 */
	public static com.liferay.form.onboarding.model.OBFormFieldMapping
		createOBFormFieldMapping(long obFormFieldMappingId) {

		return getService().createOBFormFieldMapping(obFormFieldMappingId);
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
	 * Deletes the ob form field mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormFieldMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping that was removed
	 * @throws PortalException if a ob form field mapping with the primary key could not be found
	 */
	public static com.liferay.form.onboarding.model.OBFormFieldMapping
			deleteOBFormFieldMapping(long obFormFieldMappingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteOBFormFieldMapping(obFormFieldMappingId);
	}

	public static com.liferay.form.onboarding.model.OBFormFieldMapping
			deleteOBFormFieldMapping(
				long obFormEntryId, String formFieldReference)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteOBFormFieldMapping(
			obFormEntryId, formFieldReference);
	}

	/**
	 * Deletes the ob form field mapping from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormFieldMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormFieldMapping the ob form field mapping
	 * @return the ob form field mapping that was removed
	 */
	public static com.liferay.form.onboarding.model.OBFormFieldMapping
		deleteOBFormFieldMapping(
			com.liferay.form.onboarding.model.OBFormFieldMapping
				obFormFieldMapping) {

		return getService().deleteOBFormFieldMapping(obFormFieldMapping);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.form.onboarding.model.impl.OBFormFieldMappingModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.form.onboarding.model.impl.OBFormFieldMappingModelImpl</code>.
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

	public static com.liferay.form.onboarding.model.OBFormFieldMapping
		fetchOBFormFieldMapping(long obFormFieldMappingId) {

		return getService().fetchOBFormFieldMapping(obFormFieldMappingId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ob form field mapping with the primary key.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping
	 * @throws PortalException if a ob form field mapping with the primary key could not be found
	 */
	public static com.liferay.form.onboarding.model.OBFormFieldMapping
			getOBFormFieldMapping(long obFormFieldMappingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOBFormFieldMapping(obFormFieldMappingId);
	}

	public static com.liferay.form.onboarding.model.OBFormFieldMapping
			getOBFormFieldMapping(long obFormEntryId, String formFieldReference)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getOBFormFieldMapping(
			obFormEntryId, formFieldReference);
	}

	/**
	 * Returns a range of all the ob form field mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.form.onboarding.model.impl.OBFormFieldMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form field mappings
	 * @param end the upper bound of the range of ob form field mappings (not inclusive)
	 * @return the range of ob form field mappings
	 */
	public static java.util.List
		<com.liferay.form.onboarding.model.OBFormFieldMapping>
			getOBFormFieldMappings(int start, int end) {

		return getService().getOBFormFieldMappings(start, end);
	}

	public static java.util.List
		<com.liferay.form.onboarding.model.OBFormFieldMapping>
			getOBFormFieldMappings(long obFormEntryId) {

		return getService().getOBFormFieldMappings(obFormEntryId);
	}

	public static java.util.List
		<com.liferay.form.onboarding.model.OBFormFieldMapping>
			getOBFormFieldMappings(long obFormEntryId, int start, int end) {

		return getService().getOBFormFieldMappings(obFormEntryId, start, end);
	}

	/**
	 * Returns the number of ob form field mappings.
	 *
	 * @return the number of ob form field mappings
	 */
	public static int getOBFormFieldMappingsCount() {
		return getService().getOBFormFieldMappingsCount();
	}

	public static int getOBFormFieldMappingsCount(long obFormEntryId) {
		return getService().getOBFormFieldMappingsCount(obFormEntryId);
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

	public static com.liferay.form.onboarding.model.OBFormFieldMapping
			updateOBFormFieldMapping(
				long obFormFieldMappingId, String formFieldReference,
				String userPropertyName)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateOBFormFieldMapping(
			obFormFieldMappingId, formFieldReference, userPropertyName);
	}

	/**
	 * Updates the ob form field mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OBFormFieldMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param obFormFieldMapping the ob form field mapping
	 * @return the ob form field mapping that was updated
	 */
	public static com.liferay.form.onboarding.model.OBFormFieldMapping
		updateOBFormFieldMapping(
			com.liferay.form.onboarding.model.OBFormFieldMapping
				obFormFieldMapping) {

		return getService().updateOBFormFieldMapping(obFormFieldMapping);
	}

	public static OBFormFieldMappingLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<OBFormFieldMappingLocalService, OBFormFieldMappingLocalService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			OBFormFieldMappingLocalService.class);

		ServiceTracker
			<OBFormFieldMappingLocalService, OBFormFieldMappingLocalService>
				serviceTracker =
					new ServiceTracker
						<OBFormFieldMappingLocalService,
						 OBFormFieldMappingLocalService>(
							 bundle.getBundleContext(),
							 OBFormFieldMappingLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}