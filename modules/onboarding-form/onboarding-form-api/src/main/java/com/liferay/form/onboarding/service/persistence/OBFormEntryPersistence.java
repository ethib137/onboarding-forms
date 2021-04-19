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

import com.liferay.form.onboarding.exception.NoSuchEntryException;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ob form entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Evan Thibodeau
 * @see OBFormEntryUtil
 * @generated
 */
@ProviderType
public interface OBFormEntryPersistence extends BasePersistence<OBFormEntry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OBFormEntryUtil} to access the ob form entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ob form entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ob form entries
	 */
	public java.util.List<OBFormEntry> findByUuid(String uuid);

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
	public java.util.List<OBFormEntry> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<OBFormEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

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
	public java.util.List<OBFormEntry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set where uuid = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public OBFormEntry[] findByUuid_PrevAndNext(
			long obFormEntryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the ob form entries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of ob form entries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ob form entries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ob form entry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findByUUID_G(String uuid, long groupId)
		throws NoSuchEntryException;

	/**
	 * Returns the ob form entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ob form entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ob form entry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ob form entry that was removed
	 */
	public OBFormEntry removeByUUID_G(String uuid, long groupId)
		throws NoSuchEntryException;

	/**
	 * Returns the number of ob form entries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ob form entries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the ob form entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ob form entries
	 */
	public java.util.List<OBFormEntry> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<OBFormEntry> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<OBFormEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

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
	public java.util.List<OBFormEntry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last ob form entry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

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
	public OBFormEntry[] findByUuid_C_PrevAndNext(
			long obFormEntryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the ob form entries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of ob form entries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ob form entries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the ob form entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching ob form entries
	 */
	public java.util.List<OBFormEntry> findBygroupId(long groupId);

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
	public java.util.List<OBFormEntry> findBygroupId(
		long groupId, int start, int end);

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
	public java.util.List<OBFormEntry> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

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
	public java.util.List<OBFormEntry> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findBygroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns the last ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findBygroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set where groupId = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public OBFormEntry[] findBygroupId_PrevAndNext(
			long obFormEntryId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the ob form entries where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeBygroupId(long groupId);

	/**
	 * Returns the number of ob form entries where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching ob form entries
	 */
	public int countBygroupId(long groupId);

	/**
	 * Returns all the ob form entries where name = &#63; and groupId = &#63;.
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @return the matching ob form entries
	 */
	public java.util.List<OBFormEntry> findByn_g(String name, long groupId);

	/**
	 * Returns a range of all the ob form entries where name = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @return the range of matching ob form entries
	 */
	public java.util.List<OBFormEntry> findByn_g(
		String name, long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the ob form entries where name = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ob form entries
	 */
	public java.util.List<OBFormEntry> findByn_g(
		String name, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ob form entries where name = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OBFormEntryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @param start the lower bound of the range of ob form entries
	 * @param end the upper bound of the range of ob form entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ob form entries
	 */
	public java.util.List<OBFormEntry> findByn_g(
		String name, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ob form entry in the ordered set where name = &#63; and groupId = &#63;.
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findByn_g_First(
			String name, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the first ob form entry in the ordered set where name = &#63; and groupId = &#63;.
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByn_g_First(
		String name, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns the last ob form entry in the ordered set where name = &#63; and groupId = &#63;.
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry
	 * @throws NoSuchEntryException if a matching ob form entry could not be found
	 */
	public OBFormEntry findByn_g_Last(
			String name, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Returns the last ob form entry in the ordered set where name = &#63; and groupId = &#63;.
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	public OBFormEntry fetchByn_g_Last(
		String name, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

	/**
	 * Returns the ob form entries before and after the current ob form entry in the ordered set where name = &#63; and groupId = &#63;.
	 *
	 * @param obFormEntryId the primary key of the current ob form entry
	 * @param name the name
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public OBFormEntry[] findByn_g_PrevAndNext(
			long obFormEntryId, String name, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
				orderByComparator)
		throws NoSuchEntryException;

	/**
	 * Removes all the ob form entries where name = &#63; and groupId = &#63; from the database.
	 *
	 * @param name the name
	 * @param groupId the group ID
	 */
	public void removeByn_g(String name, long groupId);

	/**
	 * Returns the number of ob form entries where name = &#63; and groupId = &#63;.
	 *
	 * @param name the name
	 * @param groupId the group ID
	 * @return the number of matching ob form entries
	 */
	public int countByn_g(String name, long groupId);

	/**
	 * Caches the ob form entry in the entity cache if it is enabled.
	 *
	 * @param obFormEntry the ob form entry
	 */
	public void cacheResult(OBFormEntry obFormEntry);

	/**
	 * Caches the ob form entries in the entity cache if it is enabled.
	 *
	 * @param obFormEntries the ob form entries
	 */
	public void cacheResult(java.util.List<OBFormEntry> obFormEntries);

	/**
	 * Creates a new ob form entry with the primary key. Does not add the ob form entry to the database.
	 *
	 * @param obFormEntryId the primary key for the new ob form entry
	 * @return the new ob form entry
	 */
	public OBFormEntry create(long obFormEntryId);

	/**
	 * Removes the ob form entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry that was removed
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public OBFormEntry remove(long obFormEntryId) throws NoSuchEntryException;

	public OBFormEntry updateImpl(OBFormEntry obFormEntry);

	/**
	 * Returns the ob form entry with the primary key or throws a <code>NoSuchEntryException</code> if it could not be found.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry
	 * @throws NoSuchEntryException if a ob form entry with the primary key could not be found
	 */
	public OBFormEntry findByPrimaryKey(long obFormEntryId)
		throws NoSuchEntryException;

	/**
	 * Returns the ob form entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry, or <code>null</code> if a ob form entry with the primary key could not be found
	 */
	public OBFormEntry fetchByPrimaryKey(long obFormEntryId);

	/**
	 * Returns all the ob form entries.
	 *
	 * @return the ob form entries
	 */
	public java.util.List<OBFormEntry> findAll();

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
	public java.util.List<OBFormEntry> findAll(int start, int end);

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
	public java.util.List<OBFormEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator);

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
	public java.util.List<OBFormEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormEntry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ob form entries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ob form entries.
	 *
	 * @return the number of ob form entries
	 */
	public int countAll();

}