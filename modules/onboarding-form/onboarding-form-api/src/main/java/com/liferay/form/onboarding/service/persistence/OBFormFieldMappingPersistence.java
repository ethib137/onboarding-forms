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

import com.liferay.form.onboarding.exception.NoSuchFieldMappingException;
import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ob form field mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Evan Thibodeau
 * @see OBFormFieldMappingUtil
 * @generated
 */
@ProviderType
public interface OBFormFieldMappingPersistence
	extends BasePersistence<OBFormFieldMapping> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OBFormFieldMappingUtil} to access the ob form field mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ob form field mappings where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mappings
	 */
	public java.util.List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId);

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
	public java.util.List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end);

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
	public java.util.List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
			orderByComparator);

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
	public java.util.List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	public OBFormFieldMapping findByobFormEntryId_First(
			long obFormEntryId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
				orderByComparator)
		throws NoSuchFieldMappingException;

	/**
	 * Returns the first ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public OBFormFieldMapping fetchByobFormEntryId_First(
		long obFormEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
			orderByComparator);

	/**
	 * Returns the last ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	public OBFormFieldMapping findByobFormEntryId_Last(
			long obFormEntryId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
				orderByComparator)
		throws NoSuchFieldMappingException;

	/**
	 * Returns the last ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public OBFormFieldMapping fetchByobFormEntryId_Last(
		long obFormEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
			orderByComparator);

	/**
	 * Returns the ob form field mappings before and after the current ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormFieldMappingId the primary key of the current ob form field mapping
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ob form field mapping
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	public OBFormFieldMapping[] findByobFormEntryId_PrevAndNext(
			long obFormFieldMappingId, long obFormEntryId,
			com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
				orderByComparator)
		throws NoSuchFieldMappingException;

	/**
	 * Removes all the ob form field mappings where obFormEntryId = &#63; from the database.
	 *
	 * @param obFormEntryId the ob form entry ID
	 */
	public void removeByobFormEntryId(long obFormEntryId);

	/**
	 * Returns the number of ob form field mappings where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @return the number of matching ob form field mappings
	 */
	public int countByobFormEntryId(long obFormEntryId);

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or throws a <code>NoSuchFieldMappingException</code> if it could not be found.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	public OBFormFieldMapping findByo_f(
			String formFieldReference, long obFormEntryId)
		throws NoSuchFieldMappingException;

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public OBFormFieldMapping fetchByo_f(
		String formFieldReference, long obFormEntryId);

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	public OBFormFieldMapping fetchByo_f(
		String formFieldReference, long obFormEntryId, boolean useFinderCache);

	/**
	 * Removes the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; from the database.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the ob form field mapping that was removed
	 */
	public OBFormFieldMapping removeByo_f(
			String formFieldReference, long obFormEntryId)
		throws NoSuchFieldMappingException;

	/**
	 * Returns the number of ob form field mappings where formFieldReference = &#63; and obFormEntryId = &#63;.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the number of matching ob form field mappings
	 */
	public int countByo_f(String formFieldReference, long obFormEntryId);

	/**
	 * Caches the ob form field mapping in the entity cache if it is enabled.
	 *
	 * @param obFormFieldMapping the ob form field mapping
	 */
	public void cacheResult(OBFormFieldMapping obFormFieldMapping);

	/**
	 * Caches the ob form field mappings in the entity cache if it is enabled.
	 *
	 * @param obFormFieldMappings the ob form field mappings
	 */
	public void cacheResult(
		java.util.List<OBFormFieldMapping> obFormFieldMappings);

	/**
	 * Creates a new ob form field mapping with the primary key. Does not add the ob form field mapping to the database.
	 *
	 * @param obFormFieldMappingId the primary key for the new ob form field mapping
	 * @return the new ob form field mapping
	 */
	public OBFormFieldMapping create(long obFormFieldMappingId);

	/**
	 * Removes the ob form field mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping that was removed
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	public OBFormFieldMapping remove(long obFormFieldMappingId)
		throws NoSuchFieldMappingException;

	public OBFormFieldMapping updateImpl(OBFormFieldMapping obFormFieldMapping);

	/**
	 * Returns the ob form field mapping with the primary key or throws a <code>NoSuchFieldMappingException</code> if it could not be found.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	public OBFormFieldMapping findByPrimaryKey(long obFormFieldMappingId)
		throws NoSuchFieldMappingException;

	/**
	 * Returns the ob form field mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping, or <code>null</code> if a ob form field mapping with the primary key could not be found
	 */
	public OBFormFieldMapping fetchByPrimaryKey(long obFormFieldMappingId);

	/**
	 * Returns all the ob form field mappings.
	 *
	 * @return the ob form field mappings
	 */
	public java.util.List<OBFormFieldMapping> findAll();

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
	public java.util.List<OBFormFieldMapping> findAll(int start, int end);

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
	public java.util.List<OBFormFieldMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
			orderByComparator);

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
	public java.util.List<OBFormFieldMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OBFormFieldMapping>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ob form field mappings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ob form field mappings.
	 *
	 * @return the number of ob form field mappings
	 */
	public int countAll();

}