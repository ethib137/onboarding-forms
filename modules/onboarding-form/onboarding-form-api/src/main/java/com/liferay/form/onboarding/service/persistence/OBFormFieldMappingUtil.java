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

package com.liferay.form.onboarding.service.persistence;

import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the ob form field mapping service. This utility wraps <code>com.liferay.form.onboarding.service.persistence.impl.OBFormFieldMappingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Evan Thibodeau
 * @see OBFormFieldMappingPersistence
 * @generated
 */
public class OBFormFieldMappingUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(OBFormFieldMapping obFormFieldMapping) {
		getPersistence().clearCache(obFormFieldMapping);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, OBFormFieldMapping> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OBFormFieldMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OBFormFieldMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OBFormFieldMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OBFormFieldMapping update(
		OBFormFieldMapping obFormFieldMapping) {

		return getPersistence().update(obFormFieldMapping);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OBFormFieldMapping update(
		OBFormFieldMapping obFormFieldMapping, ServiceContext serviceContext) {

		return getPersistence().update(obFormFieldMapping, serviceContext);
	}

	/**
	 * Returns all the ob form field mappings where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mappings
	 */
	public static List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId) {

		return getPersistence().findByobFormEntryId(obFormEntryId);
	}

	/**
	 * Returns a range of all the ob form field mappings where obFormEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormFieldMappingModelImpl</code>.
	 * </p>
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param start the lower bound of the range of ob form field mappings
	 * @param end the upper bound of the range of ob form field mappings (not inclusive)
	 * @return the range of matching ob form field mappings
	 */
	public static List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end) {

		return getPersistence().findByobFormEntryId(obFormEntryId, start, end);
	}

	/**
	 * Returns an ordered range of all the ob form field mappings where obFormEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormFieldMappingModelImpl</code>.
	 * </p>
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param start the lower bound of the range of ob form field mappings
	 * @param end the upper bound of the range of ob form field mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form field mappings
	 */
	public static List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		return getPersistence().findByobFormEntryId(
			obFormEntryId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ob form field mappings where obFormEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormFieldMappingModelImpl</code>.
	 * </p>
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param start the lower bound of the range of ob form field mappings
	 * @param end the upper bound of the range of ob form field mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ob form field mappings
	 */
	public static List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByobFormEntryId(
			obFormEntryId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	public static OBFormFieldMapping findByobFormEntryId_First(
			long obFormEntryId,
			OrderByComparator<OBFormFieldMapping> orderByComparator)
		throws com.liferay.form.onboarding.exception.
			NoSuchFieldMappingException {

		return getPersistence().findByobFormEntryId_First(
			obFormEntryId, orderByComparator);
	}

	/**
	 * Returns the first ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public static OBFormFieldMapping fetchByobFormEntryId_First(
		long obFormEntryId,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		return getPersistence().fetchByobFormEntryId_First(
			obFormEntryId, orderByComparator);
	}

	/**
	 * Returns the last ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	public static OBFormFieldMapping findByobFormEntryId_Last(
			long obFormEntryId,
			OrderByComparator<OBFormFieldMapping> orderByComparator)
		throws com.liferay.form.onboarding.exception.
			NoSuchFieldMappingException {

		return getPersistence().findByobFormEntryId_Last(
			obFormEntryId, orderByComparator);
	}

	/**
	 * Returns the last ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public static OBFormFieldMapping fetchByobFormEntryId_Last(
		long obFormEntryId,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		return getPersistence().fetchByobFormEntryId_Last(
			obFormEntryId, orderByComparator);
	}

	/**
	 * Returns the ob form field mappings before and after the current ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormFieldMappingId the primary key of the current ob form field mapping
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form field mapping
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	public static OBFormFieldMapping[] findByobFormEntryId_PrevAndNext(
			long obFormFieldMappingId, long obFormEntryId,
			OrderByComparator<OBFormFieldMapping> orderByComparator)
		throws com.liferay.form.onboarding.exception.
			NoSuchFieldMappingException {

		return getPersistence().findByobFormEntryId_PrevAndNext(
			obFormFieldMappingId, obFormEntryId, orderByComparator);
	}

	/**
	 * Removes all the ob form field mappings where obFormEntryId = &#63; from the database.
	 *
	 * @param obFormEntryId the ob form entry ID
	 */
	public static void removeByobFormEntryId(long obFormEntryId) {
		getPersistence().removeByobFormEntryId(obFormEntryId);
	}

	/**
	 * Returns the number of ob form field mappings where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @return the number of matching ob form field mappings
	 */
	public static int countByobFormEntryId(long obFormEntryId) {
		return getPersistence().countByobFormEntryId(obFormEntryId);
	}

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or throws a <code>NoSuchFieldMappingException</code> if it could not be found.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	public static OBFormFieldMapping findByo_f(
			String formFieldReference, long obFormEntryId)
		throws com.liferay.form.onboarding.exception.
			NoSuchFieldMappingException {

		return getPersistence().findByo_f(formFieldReference, obFormEntryId);
	}

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public static OBFormFieldMapping fetchByo_f(
		String formFieldReference, long obFormEntryId) {

		return getPersistence().fetchByo_f(formFieldReference, obFormEntryId);
	}

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public static OBFormFieldMapping fetchByo_f(
		String formFieldReference, long obFormEntryId, boolean useFinderCache) {

		return getPersistence().fetchByo_f(
			formFieldReference, obFormEntryId, useFinderCache);
	}

	/**
	 * Removes the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; from the database.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the ob form field mapping that was removed
	 */
	public static OBFormFieldMapping removeByo_f(
			String formFieldReference, long obFormEntryId)
		throws com.liferay.form.onboarding.exception.
			NoSuchFieldMappingException {

		return getPersistence().removeByo_f(formFieldReference, obFormEntryId);
	}

	/**
	 * Returns the number of ob form field mappings where formFieldReference = &#63; and obFormEntryId = &#63;.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the number of matching ob form field mappings
	 */
	public static int countByo_f(
		String formFieldReference, long obFormEntryId) {

		return getPersistence().countByo_f(formFieldReference, obFormEntryId);
	}

	/**
	 * Caches the ob form field mapping in the entity cache if it is enabled.
	 *
	 * @param obFormFieldMapping the ob form field mapping
	 */
	public static void cacheResult(OBFormFieldMapping obFormFieldMapping) {
		getPersistence().cacheResult(obFormFieldMapping);
	}

	/**
	 * Caches the ob form field mappings in the entity cache if it is enabled.
	 *
	 * @param obFormFieldMappings the ob form field mappings
	 */
	public static void cacheResult(
		List<OBFormFieldMapping> obFormFieldMappings) {

		getPersistence().cacheResult(obFormFieldMappings);
	}

	/**
	 * Creates a new ob form field mapping with the primary key. Does not add the ob form field mapping to the database.
	 *
	 * @param obFormFieldMappingId the primary key for the new ob form field mapping
	 * @return the new ob form field mapping
	 */
	public static OBFormFieldMapping create(long obFormFieldMappingId) {
		return getPersistence().create(obFormFieldMappingId);
	}

	/**
	 * Removes the ob form field mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping that was removed
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	public static OBFormFieldMapping remove(long obFormFieldMappingId)
		throws com.liferay.form.onboarding.exception.
			NoSuchFieldMappingException {

		return getPersistence().remove(obFormFieldMappingId);
	}

	public static OBFormFieldMapping updateImpl(
		OBFormFieldMapping obFormFieldMapping) {

		return getPersistence().updateImpl(obFormFieldMapping);
	}

	/**
	 * Returns the ob form field mapping with the primary key or throws a <code>NoSuchFieldMappingException</code> if it could not be found.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	public static OBFormFieldMapping findByPrimaryKey(long obFormFieldMappingId)
		throws com.liferay.form.onboarding.exception.
			NoSuchFieldMappingException {

		return getPersistence().findByPrimaryKey(obFormFieldMappingId);
	}

	/**
	 * Returns the ob form field mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping, or <code>null</code> if a ob form field mapping with the primary key could not be found
	 */
	public static OBFormFieldMapping fetchByPrimaryKey(
		long obFormFieldMappingId) {

		return getPersistence().fetchByPrimaryKey(obFormFieldMappingId);
	}

	/**
	 * Returns all the ob form field mappings.
	 *
	 * @return the ob form field mappings
	 */
	public static List<OBFormFieldMapping> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ob form field mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormFieldMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form field mappings
	 * @param end the upper bound of the range of ob form field mappings (not inclusive)
	 * @return the range of ob form field mappings
	 */
	public static List<OBFormFieldMapping> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ob form field mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormFieldMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form field mappings
	 * @param end the upper bound of the range of ob form field mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ob form field mappings
	 */
	public static List<OBFormFieldMapping> findAll(
		int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ob form field mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormFieldMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form field mappings
	 * @param end the upper bound of the range of ob form field mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ob form field mappings
	 */
	public static List<OBFormFieldMapping> findAll(
		int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ob form field mappings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ob form field mappings.
	 *
	 * @return the number of ob form field mappings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OBFormFieldMappingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<OBFormFieldMappingPersistence, OBFormFieldMappingPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			OBFormFieldMappingPersistence.class);

		ServiceTracker
			<OBFormFieldMappingPersistence, OBFormFieldMappingPersistence>
				serviceTracker =
					new ServiceTracker
						<OBFormFieldMappingPersistence,
						 OBFormFieldMappingPersistence>(
							 bundle.getBundleContext(),
							 OBFormFieldMappingPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}