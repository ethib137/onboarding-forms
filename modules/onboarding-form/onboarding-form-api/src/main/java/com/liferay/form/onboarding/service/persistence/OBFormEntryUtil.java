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

import com.liferay.form.onboarding.model.OBFormEntry;
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
 * The persistence utility for the ob form entry service. This utility wraps <code>com.liferay.form.onboarding.service.persistence.impl.OBFormEntryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Evan Thibodeau
 * @see OBFormEntryPersistence
 * @generated
 */
public class OBFormEntryUtil {

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
	public static void clearCache(OBFormEntry obFormEntry) {
		getPersistence().clearCache(obFormEntry);
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
	public static Map<Serializable, OBFormEntry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OBFormEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OBFormEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OBFormEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OBFormEntry update(OBFormEntry obFormEntry) {
		return getPersistence().update(obFormEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OBFormEntry update(
		OBFormEntry obFormEntry, ServiceContext serviceContext) {

		return getPersistence().update(obFormEntry, serviceContext);
	}

	/**
	 * Returns all the ob form entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the ob form entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the ob form entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ob form entries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByUuid_First(
			String uuid, OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByUuid_First(
		String uuid, OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByUuid_Last(
			String uuid, OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByUuid_Last(
		String uuid, OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry[] findByUuid_PrevAndNext(
			long obFormEntryId, String uuid,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByUuid_PrevAndNext(
			obFormEntryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the ob form entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of ob form entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ob form entries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the ob form entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByUUID_G(String uuid, long groupId)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ob form entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ob form entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the ob form entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ob form entry that was removed
	 */
	public static OBFormEntry removeByUUID_G(String uuid, long groupId)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of ob form entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ob form entries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the ob form entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the ob form entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ob form entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ob form entries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry[] findByUuid_C_PrevAndNext(
			long obFormEntryId, String uuid, long companyId,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			obFormEntryId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the ob form entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of ob form entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ob form entries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the ob form entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching ob form entries
	 */
	public static List<OBFormEntry> findBygroupId(long groupId) {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	 * Returns a range of all the ob form entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of matching ob form entries
	 */
	public static List<OBFormEntry> findBygroupId(
		long groupId, int start, int end) {

		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the ob form entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ob form entries where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findBygroupId_First(
			long groupId, OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchBygroupId_First(
		long groupId, OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchBygroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findBygroupId_Last(
			long groupId, OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchBygroupId_Last(
		long groupId, OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry[] findBygroupId_PrevAndNext(
			long obFormEntryId, long groupId,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findBygroupId_PrevAndNext(
			obFormEntryId, groupId, orderByComparator);
	}

	/**
	 * Returns all the ob form entries that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching ob form entries that the user has permission to view
	 */
	public static List<OBFormEntry> filterFindBygroupId(long groupId) {
		return getPersistence().filterFindBygroupId(groupId);
	}

	/**
	 * Returns a range of all the ob form entries that the user has permission to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of matching ob form entries that the user has permission to view
	 */
	public static List<OBFormEntry> filterFindBygroupId(
		long groupId, int start, int end) {

		return getPersistence().filterFindBygroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the ob form entries that the user has permissions to view where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form entries that the user has permission to view
	 */
	public static List<OBFormEntry> filterFindBygroupId(
		long groupId, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().filterFindBygroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set of ob form entries that the user has permission to view where groupId = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry[] filterFindBygroupId_PrevAndNext(
			long obFormEntryId, long groupId,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().filterFindBygroupId_PrevAndNext(
			obFormEntryId, groupId, orderByComparator);
	}

	/**
	 * Removes all the ob form entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeBygroupId(long groupId) {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	 * Returns the number of ob form entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching ob form entries
	 */
	public static int countBygroupId(long groupId) {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	 * Returns the number of ob form entries that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching ob form entries that the user has permission to view
	 */
	public static int filterCountBygroupId(long groupId) {
		return getPersistence().filterCountBygroupId(groupId);
	}

	/**
	 * Returns the ob form entry where formId = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param formId the form ID
	 * @return the matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByformId(long formId)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByformId(formId);
	}

	/**
	 * Returns the ob form entry where formId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param formId the form ID
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByformId(long formId) {
		return getPersistence().fetchByformId(formId);
	}

	/**
	 * Returns the ob form entry where formId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param formId the form ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByformId(
		long formId, boolean useFinderCache) {

		return getPersistence().fetchByformId(formId, useFinderCache);
	}

	/**
	 * Removes the ob form entry where formId = &#63; from the database.
	 *
	 * @param formId the form ID
	 * @return the ob form entry that was removed
	 */
	public static OBFormEntry removeByformId(long formId)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().removeByformId(formId);
	}

	/**
	 * Returns the number of ob form entries where formId = &#63;.
	 *
	 * @param formId the form ID
	 * @return the number of matching ob form entries
	 */
	public static int countByformId(long formId) {
		return getPersistence().countByformId(formId);
	}

	/**
	 * Returns all the ob form entries where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching ob form entries
	 */
	public static List<OBFormEntry> findByn_g(long groupId, String name) {
		return getPersistence().findByn_g(groupId, name);
	}

	/**
	 * Returns a range of all the ob form entries where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of matching ob form entries
	 */
	public static List<OBFormEntry> findByn_g(
		long groupId, String name, int start, int end) {

		return getPersistence().findByn_g(groupId, name, start, end);
	}

	/**
	 * Returns an ordered range of all the ob form entries where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findByn_g(
		long groupId, String name, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().findByn_g(
			groupId, name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ob form entries where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ob form entries
	 */
	public static List<OBFormEntry> findByn_g(
		long groupId, String name, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByn_g(
			groupId, name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ob form entry in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByn_g_First(
			long groupId, String name,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByn_g_First(
			groupId, name, orderByComparator);
	}

	/**
	 * Returns the first ob form entry in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByn_g_First(
		long groupId, String name,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchByn_g_First(
			groupId, name, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public static OBFormEntry findByn_g_Last(
			long groupId, String name,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByn_g_Last(
			groupId, name, orderByComparator);
	}

	/**
	 * Returns the last ob form entry in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public static OBFormEntry fetchByn_g_Last(
		long groupId, String name,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().fetchByn_g_Last(
			groupId, name, orderByComparator);
	}

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set where groupId = &#63; and name = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry[] findByn_g_PrevAndNext(
			long obFormEntryId, long groupId, String name,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByn_g_PrevAndNext(
			obFormEntryId, groupId, name, orderByComparator);
	}

	/**
	 * Returns all the ob form entries that the user has permission to view where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the matching ob form entries that the user has permission to view
	 */
	public static List<OBFormEntry> filterFindByn_g(long groupId, String name) {
		return getPersistence().filterFindByn_g(groupId, name);
	}

	/**
	 * Returns a range of all the ob form entries that the user has permission to view where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of matching ob form entries that the user has permission to view
	 */
	public static List<OBFormEntry> filterFindByn_g(
		long groupId, String name, int start, int end) {

		return getPersistence().filterFindByn_g(groupId, name, start, end);
	}

	/**
	 * Returns an ordered range of all the ob form entries that the user has permissions to view where groupId = &#63; and name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form entries that the user has permission to view
	 */
	public static List<OBFormEntry> filterFindByn_g(
		long groupId, String name, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().filterFindByn_g(
			groupId, name, start, end, orderByComparator);
	}

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set of ob form entries that the user has permission to view where groupId = &#63; and name = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param groupId the group ID
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry[] filterFindByn_g_PrevAndNext(
			long obFormEntryId, long groupId, String name,
			OrderByComparator<OBFormEntry> orderByComparator)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().filterFindByn_g_PrevAndNext(
			obFormEntryId, groupId, name, orderByComparator);
	}

	/**
	 * Removes all the ob form entries where groupId = &#63; and name = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 */
	public static void removeByn_g(long groupId, String name) {
		getPersistence().removeByn_g(groupId, name);
	}

	/**
	 * Returns the number of ob form entries where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching ob form entries
	 */
	public static int countByn_g(long groupId, String name) {
		return getPersistence().countByn_g(groupId, name);
	}

	/**
	 * Returns the number of ob form entries that the user has permission to view where groupId = &#63; and name = &#63;.
	 *
	 * @param groupId the group ID
	 * @param name the name
	 * @return the number of matching ob form entries that the user has permission to view
	 */
	public static int filterCountByn_g(long groupId, String name) {
		return getPersistence().filterCountByn_g(groupId, name);
	}

	/**
	 * Caches the ob form entry in the entity cache if it is enabled.
	 *
	 * @param obFormEntry the ob form entry
	 */
	public static void cacheResult(OBFormEntry obFormEntry) {
		getPersistence().cacheResult(obFormEntry);
	}

	/**
	 * Caches the ob form entries in the entity cache if it is enabled.
	 *
	 * @param obFormEntries the ob form entries
	 */
	public static void cacheResult(List<OBFormEntry> obFormEntries) {
		getPersistence().cacheResult(obFormEntries);
	}

	/**
	 * Creates a new ob form entry with the primary key. Does not add the ob form entry to the database.
	 *
	 * @param obFormEntryId the primary key for the new ob form entry
	 * @return the new ob form entry
	 */
	public static OBFormEntry create(long obFormEntryId) {
		return getPersistence().create(obFormEntryId);
	}

	/**
	 * Removes the ob form entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry that was removed
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry remove(long obFormEntryId)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().remove(obFormEntryId);
	}

	public static OBFormEntry updateImpl(OBFormEntry obFormEntry) {
		return getPersistence().updateImpl(obFormEntry);
	}

	/**
	 * Returns the ob form entry with the primary key or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry findByPrimaryKey(long obFormEntryId)
		throws com.liferay.form.onboarding.exception.NoSuchEntryException {

		return getPersistence().findByPrimaryKey(obFormEntryId);
	}

	/**
	 * Returns the ob form entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry, or <code>null</code> if a ob form entry with the primary key could not be found
	 */
	public static OBFormEntry fetchByPrimaryKey(long obFormEntryId) {
		return getPersistence().fetchByPrimaryKey(obFormEntryId);
	}

	/**
	 * Returns all the ob form entries.
	 *
	 * @return the ob form entries
	 */
	public static List<OBFormEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ob form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of ob form entries
	 */
	public static List<OBFormEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ob form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ob form entries
	 */
	public static List<OBFormEntry> findAll(
		int start, int end, OrderByComparator<OBFormEntry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ob form entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ob form entries
	 */
	public static List<OBFormEntry> findAll(
		int start, int end, OrderByComparator<OBFormEntry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ob form entries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ob form entries.
	 *
	 * @return the number of ob form entries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OBFormEntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<OBFormEntryPersistence, OBFormEntryPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(OBFormEntryPersistence.class);

		ServiceTracker<OBFormEntryPersistence, OBFormEntryPersistence>
			serviceTracker =
				new ServiceTracker
					<OBFormEntryPersistence, OBFormEntryPersistence>(
						bundle.getBundleContext(), OBFormEntryPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}