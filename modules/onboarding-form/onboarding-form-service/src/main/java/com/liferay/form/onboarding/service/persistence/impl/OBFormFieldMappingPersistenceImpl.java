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

package com.liferay.form.onboarding.service.persistence.impl;

import com.liferay.form.onboarding.exception.NoSuchFieldMappingException;
import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.form.onboarding.model.impl.OBFormFieldMappingImpl;
import com.liferay.form.onboarding.model.impl.OBFormFieldMappingModelImpl;
import com.liferay.form.onboarding.service.persistence.OBFormFieldMappingPersistence;
import com.liferay.form.onboarding.service.persistence.impl.constants.OBFormPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the ob form field mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Evan Thibodeau
 * @generated
 */
@Component(service = OBFormFieldMappingPersistence.class)
public class OBFormFieldMappingPersistenceImpl
	extends BasePersistenceImpl<OBFormFieldMapping>
	implements OBFormFieldMappingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OBFormFieldMappingUtil</code> to access the ob form field mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OBFormFieldMappingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByobFormEntryId;
	private FinderPath _finderPathWithoutPaginationFindByobFormEntryId;
	private FinderPath _finderPathCountByobFormEntryId;

	/**
	 * Returns all the ob form field mappings where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mappings
	 */
	@Override
	public List<OBFormFieldMapping> findByobFormEntryId(long obFormEntryId) {
		return findByobFormEntryId(
			obFormEntryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end) {

		return findByobFormEntryId(obFormEntryId, start, end, null);
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
	@Override
	public List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		return findByobFormEntryId(
			obFormEntryId, start, end, orderByComparator, true);
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
	@Override
	public List<OBFormFieldMapping> findByobFormEntryId(
		long obFormEntryId, int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByobFormEntryId;
				finderArgs = new Object[] {obFormEntryId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByobFormEntryId;
			finderArgs = new Object[] {
				obFormEntryId, start, end, orderByComparator
			};
		}

		List<OBFormFieldMapping> list = null;

		if (useFinderCache) {
			list = (List<OBFormFieldMapping>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OBFormFieldMapping obFormFieldMapping : list) {
					if (obFormEntryId !=
							obFormFieldMapping.getObFormEntryId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_OBFORMFIELDMAPPING_WHERE);

			sb.append(_FINDER_COLUMN_OBFORMENTRYID_OBFORMENTRYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OBFormFieldMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(obFormEntryId);

				list = (List<OBFormFieldMapping>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	@Override
	public OBFormFieldMapping findByobFormEntryId_First(
			long obFormEntryId,
			OrderByComparator<OBFormFieldMapping> orderByComparator)
		throws NoSuchFieldMappingException {

		OBFormFieldMapping obFormFieldMapping = fetchByobFormEntryId_First(
			obFormEntryId, orderByComparator);

		if (obFormFieldMapping != null) {
			return obFormFieldMapping;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("obFormEntryId=");
		sb.append(obFormEntryId);

		sb.append("}");

		throw new NoSuchFieldMappingException(sb.toString());
	}

	/**
	 * Returns the first ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	@Override
	public OBFormFieldMapping fetchByobFormEntryId_First(
		long obFormEntryId,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		List<OBFormFieldMapping> list = findByobFormEntryId(
			obFormEntryId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	@Override
	public OBFormFieldMapping findByobFormEntryId_Last(
			long obFormEntryId,
			OrderByComparator<OBFormFieldMapping> orderByComparator)
		throws NoSuchFieldMappingException {

		OBFormFieldMapping obFormFieldMapping = fetchByobFormEntryId_Last(
			obFormEntryId, orderByComparator);

		if (obFormFieldMapping != null) {
			return obFormFieldMapping;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("obFormEntryId=");
		sb.append(obFormEntryId);

		sb.append("}");

		throw new NoSuchFieldMappingException(sb.toString());
	}

	/**
	 * Returns the last ob form field mapping in the ordered set where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	@Override
	public OBFormFieldMapping fetchByobFormEntryId_Last(
		long obFormEntryId,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		int count = countByobFormEntryId(obFormEntryId);

		if (count == 0) {
			return null;
		}

		List<OBFormFieldMapping> list = findByobFormEntryId(
			obFormEntryId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public OBFormFieldMapping[] findByobFormEntryId_PrevAndNext(
			long obFormFieldMappingId, long obFormEntryId,
			OrderByComparator<OBFormFieldMapping> orderByComparator)
		throws NoSuchFieldMappingException {

		OBFormFieldMapping obFormFieldMapping = findByPrimaryKey(
			obFormFieldMappingId);

		Session session = null;

		try {
			session = openSession();

			OBFormFieldMapping[] array = new OBFormFieldMappingImpl[3];

			array[0] = getByobFormEntryId_PrevAndNext(
				session, obFormFieldMapping, obFormEntryId, orderByComparator,
				true);

			array[1] = obFormFieldMapping;

			array[2] = getByobFormEntryId_PrevAndNext(
				session, obFormFieldMapping, obFormEntryId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OBFormFieldMapping getByobFormEntryId_PrevAndNext(
		Session session, OBFormFieldMapping obFormFieldMapping,
		long obFormEntryId,
		OrderByComparator<OBFormFieldMapping> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OBFORMFIELDMAPPING_WHERE);

		sb.append(_FINDER_COLUMN_OBFORMENTRYID_OBFORMENTRYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(OBFormFieldMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(obFormEntryId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						obFormFieldMapping)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OBFormFieldMapping> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ob form field mappings where obFormEntryId = &#63; from the database.
	 *
	 * @param obFormEntryId the ob form entry ID
	 */
	@Override
	public void removeByobFormEntryId(long obFormEntryId) {
		for (OBFormFieldMapping obFormFieldMapping :
				findByobFormEntryId(
					obFormEntryId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(obFormFieldMapping);
		}
	}

	/**
	 * Returns the number of ob form field mappings where obFormEntryId = &#63;.
	 *
	 * @param obFormEntryId the ob form entry ID
	 * @return the number of matching ob form field mappings
	 */
	@Override
	public int countByobFormEntryId(long obFormEntryId) {
		FinderPath finderPath = _finderPathCountByobFormEntryId;

		Object[] finderArgs = new Object[] {obFormEntryId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OBFORMFIELDMAPPING_WHERE);

			sb.append(_FINDER_COLUMN_OBFORMENTRYID_OBFORMENTRYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(obFormEntryId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_OBFORMENTRYID_OBFORMENTRYID_2 =
		"obFormFieldMapping.obFormEntryId = ?";

	private FinderPath _finderPathFetchByo_f;
	private FinderPath _finderPathCountByo_f;

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or throws a <code>NoSuchFieldMappingException</code> if it could not be found.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mapping
	 * @throws NoSuchFieldMappingException if a matching ob form field mapping could not be found
	 */
	@Override
	public OBFormFieldMapping findByo_f(
			String formFieldReference, long obFormEntryId)
		throws NoSuchFieldMappingException {

		OBFormFieldMapping obFormFieldMapping = fetchByo_f(
			formFieldReference, obFormEntryId);

		if (obFormFieldMapping == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("formFieldReference=");
			sb.append(formFieldReference);

			sb.append(", obFormEntryId=");
			sb.append(obFormEntryId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFieldMappingException(sb.toString());
		}

		return obFormFieldMapping;
	}

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	@Override
	public OBFormFieldMapping fetchByo_f(
		String formFieldReference, long obFormEntryId) {

		return fetchByo_f(formFieldReference, obFormEntryId, true);
	}

	/**
	 * Returns the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ob form field mapping, or <code>null</code> if a matching ob form field mapping could not be found
	 */
	@Override
	public OBFormFieldMapping fetchByo_f(
		String formFieldReference, long obFormEntryId, boolean useFinderCache) {

		formFieldReference = Objects.toString(formFieldReference, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {formFieldReference, obFormEntryId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByo_f, finderArgs, this);
		}

		if (result instanceof OBFormFieldMapping) {
			OBFormFieldMapping obFormFieldMapping = (OBFormFieldMapping)result;

			if (!Objects.equals(
					formFieldReference,
					obFormFieldMapping.getFormFieldReference()) ||
				(obFormEntryId != obFormFieldMapping.getObFormEntryId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OBFORMFIELDMAPPING_WHERE);

			boolean bindFormFieldReference = false;

			if (formFieldReference.isEmpty()) {
				sb.append(_FINDER_COLUMN_O_F_FORMFIELDREFERENCE_3);
			}
			else {
				bindFormFieldReference = true;

				sb.append(_FINDER_COLUMN_O_F_FORMFIELDREFERENCE_2);
			}

			sb.append(_FINDER_COLUMN_O_F_OBFORMENTRYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindFormFieldReference) {
					queryPos.add(formFieldReference);
				}

				queryPos.add(obFormEntryId);

				List<OBFormFieldMapping> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByo_f, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									formFieldReference, obFormEntryId
								};
							}

							_log.warn(
								"OBFormFieldMappingPersistenceImpl.fetchByo_f(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OBFormFieldMapping obFormFieldMapping = list.get(0);

					result = obFormFieldMapping;

					cacheResult(obFormFieldMapping);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (OBFormFieldMapping)result;
		}
	}

	/**
	 * Removes the ob form field mapping where formFieldReference = &#63; and obFormEntryId = &#63; from the database.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the ob form field mapping that was removed
	 */
	@Override
	public OBFormFieldMapping removeByo_f(
			String formFieldReference, long obFormEntryId)
		throws NoSuchFieldMappingException {

		OBFormFieldMapping obFormFieldMapping = findByo_f(
			formFieldReference, obFormEntryId);

		return remove(obFormFieldMapping);
	}

	/**
	 * Returns the number of ob form field mappings where formFieldReference = &#63; and obFormEntryId = &#63;.
	 *
	 * @param formFieldReference the form field reference
	 * @param obFormEntryId the ob form entry ID
	 * @return the number of matching ob form field mappings
	 */
	@Override
	public int countByo_f(String formFieldReference, long obFormEntryId) {
		formFieldReference = Objects.toString(formFieldReference, "");

		FinderPath finderPath = _finderPathCountByo_f;

		Object[] finderArgs = new Object[] {formFieldReference, obFormEntryId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OBFORMFIELDMAPPING_WHERE);

			boolean bindFormFieldReference = false;

			if (formFieldReference.isEmpty()) {
				sb.append(_FINDER_COLUMN_O_F_FORMFIELDREFERENCE_3);
			}
			else {
				bindFormFieldReference = true;

				sb.append(_FINDER_COLUMN_O_F_FORMFIELDREFERENCE_2);
			}

			sb.append(_FINDER_COLUMN_O_F_OBFORMENTRYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindFormFieldReference) {
					queryPos.add(formFieldReference);
				}

				queryPos.add(obFormEntryId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_O_F_FORMFIELDREFERENCE_2 =
		"obFormFieldMapping.formFieldReference = ? AND ";

	private static final String _FINDER_COLUMN_O_F_FORMFIELDREFERENCE_3 =
		"(obFormFieldMapping.formFieldReference IS NULL OR obFormFieldMapping.formFieldReference = '') AND ";

	private static final String _FINDER_COLUMN_O_F_OBFORMENTRYID_2 =
		"obFormFieldMapping.obFormEntryId = ?";

	public OBFormFieldMappingPersistenceImpl() {
		setModelClass(OBFormFieldMapping.class);

		setModelImplClass(OBFormFieldMappingImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the ob form field mapping in the entity cache if it is enabled.
	 *
	 * @param obFormFieldMapping the ob form field mapping
	 */
	@Override
	public void cacheResult(OBFormFieldMapping obFormFieldMapping) {
		entityCache.putResult(
			OBFormFieldMappingImpl.class, obFormFieldMapping.getPrimaryKey(),
			obFormFieldMapping);

		finderCache.putResult(
			_finderPathFetchByo_f,
			new Object[] {
				obFormFieldMapping.getFormFieldReference(),
				obFormFieldMapping.getObFormEntryId()
			},
			obFormFieldMapping);
	}

	/**
	 * Caches the ob form field mappings in the entity cache if it is enabled.
	 *
	 * @param obFormFieldMappings the ob form field mappings
	 */
	@Override
	public void cacheResult(List<OBFormFieldMapping> obFormFieldMappings) {
		for (OBFormFieldMapping obFormFieldMapping : obFormFieldMappings) {
			if (entityCache.getResult(
					OBFormFieldMappingImpl.class,
					obFormFieldMapping.getPrimaryKey()) == null) {

				cacheResult(obFormFieldMapping);
			}
		}
	}

	/**
	 * Clears the cache for all ob form field mappings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OBFormFieldMappingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the ob form field mapping.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OBFormFieldMapping obFormFieldMapping) {
		entityCache.removeResult(
			OBFormFieldMappingImpl.class, obFormFieldMapping);
	}

	@Override
	public void clearCache(List<OBFormFieldMapping> obFormFieldMappings) {
		for (OBFormFieldMapping obFormFieldMapping : obFormFieldMappings) {
			entityCache.removeResult(
				OBFormFieldMappingImpl.class, obFormFieldMapping);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OBFormFieldMappingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OBFormFieldMappingModelImpl obFormFieldMappingModelImpl) {

		Object[] args = new Object[] {
			obFormFieldMappingModelImpl.getFormFieldReference(),
			obFormFieldMappingModelImpl.getObFormEntryId()
		};

		finderCache.putResult(
			_finderPathCountByo_f, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByo_f, args, obFormFieldMappingModelImpl, false);
	}

	/**
	 * Creates a new ob form field mapping with the primary key. Does not add the ob form field mapping to the database.
	 *
	 * @param obFormFieldMappingId the primary key for the new ob form field mapping
	 * @return the new ob form field mapping
	 */
	@Override
	public OBFormFieldMapping create(long obFormFieldMappingId) {
		OBFormFieldMapping obFormFieldMapping = new OBFormFieldMappingImpl();

		obFormFieldMapping.setNew(true);
		obFormFieldMapping.setPrimaryKey(obFormFieldMappingId);

		return obFormFieldMapping;
	}

	/**
	 * Removes the ob form field mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping that was removed
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	@Override
	public OBFormFieldMapping remove(long obFormFieldMappingId)
		throws NoSuchFieldMappingException {

		return remove((Serializable)obFormFieldMappingId);
	}

	/**
	 * Removes the ob form field mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ob form field mapping
	 * @return the ob form field mapping that was removed
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	@Override
	public OBFormFieldMapping remove(Serializable primaryKey)
		throws NoSuchFieldMappingException {

		Session session = null;

		try {
			session = openSession();

			OBFormFieldMapping obFormFieldMapping =
				(OBFormFieldMapping)session.get(
					OBFormFieldMappingImpl.class, primaryKey);

			if (obFormFieldMapping == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFieldMappingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(obFormFieldMapping);
		}
		catch (NoSuchFieldMappingException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected OBFormFieldMapping removeImpl(
		OBFormFieldMapping obFormFieldMapping) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(obFormFieldMapping)) {
				obFormFieldMapping = (OBFormFieldMapping)session.get(
					OBFormFieldMappingImpl.class,
					obFormFieldMapping.getPrimaryKeyObj());
			}

			if (obFormFieldMapping != null) {
				session.delete(obFormFieldMapping);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (obFormFieldMapping != null) {
			clearCache(obFormFieldMapping);
		}

		return obFormFieldMapping;
	}

	@Override
	public OBFormFieldMapping updateImpl(
		OBFormFieldMapping obFormFieldMapping) {

		boolean isNew = obFormFieldMapping.isNew();

		if (!(obFormFieldMapping instanceof OBFormFieldMappingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(obFormFieldMapping.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					obFormFieldMapping);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in obFormFieldMapping proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OBFormFieldMapping implementation " +
					obFormFieldMapping.getClass());
		}

		OBFormFieldMappingModelImpl obFormFieldMappingModelImpl =
			(OBFormFieldMappingModelImpl)obFormFieldMapping;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(obFormFieldMapping);
			}
			else {
				obFormFieldMapping = (OBFormFieldMapping)session.merge(
					obFormFieldMapping);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OBFormFieldMappingImpl.class, obFormFieldMappingModelImpl, false,
			true);

		cacheUniqueFindersCache(obFormFieldMappingModelImpl);

		if (isNew) {
			obFormFieldMapping.setNew(false);
		}

		obFormFieldMapping.resetOriginalValues();

		return obFormFieldMapping;
	}

	/**
	 * Returns the ob form field mapping with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ob form field mapping
	 * @return the ob form field mapping
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	@Override
	public OBFormFieldMapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFieldMappingException {

		OBFormFieldMapping obFormFieldMapping = fetchByPrimaryKey(primaryKey);

		if (obFormFieldMapping == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFieldMappingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return obFormFieldMapping;
	}

	/**
	 * Returns the ob form field mapping with the primary key or throws a <code>NoSuchFieldMappingException</code> if it could not be found.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping
	 * @throws NoSuchFieldMappingException if a ob form field mapping with the primary key could not be found
	 */
	@Override
	public OBFormFieldMapping findByPrimaryKey(long obFormFieldMappingId)
		throws NoSuchFieldMappingException {

		return findByPrimaryKey((Serializable)obFormFieldMappingId);
	}

	/**
	 * Returns the ob form field mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param obFormFieldMappingId the primary key of the ob form field mapping
	 * @return the ob form field mapping, or <code>null</code> if a ob form field mapping with the primary key could not be found
	 */
	@Override
	public OBFormFieldMapping fetchByPrimaryKey(long obFormFieldMappingId) {
		return fetchByPrimaryKey((Serializable)obFormFieldMappingId);
	}

	/**
	 * Returns all the ob form field mappings.
	 *
	 * @return the ob form field mappings
	 */
	@Override
	public List<OBFormFieldMapping> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<OBFormFieldMapping> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<OBFormFieldMapping> findAll(
		int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<OBFormFieldMapping> findAll(
		int start, int end,
		OrderByComparator<OBFormFieldMapping> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<OBFormFieldMapping> list = null;

		if (useFinderCache) {
			list = (List<OBFormFieldMapping>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OBFORMFIELDMAPPING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OBFORMFIELDMAPPING;

				sql = sql.concat(OBFormFieldMappingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OBFormFieldMapping>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the ob form field mappings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OBFormFieldMapping obFormFieldMapping : findAll()) {
			remove(obFormFieldMapping);
		}
	}

	/**
	 * Returns the number of ob form field mappings.
	 *
	 * @return the number of ob form field mappings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_OBFORMFIELDMAPPING);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "obFormFieldMappingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OBFORMFIELDMAPPING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OBFormFieldMappingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ob form field mapping persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new OBFormFieldMappingModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", OBFormFieldMapping.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByobFormEntryId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByobFormEntryId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"obFormEntryId"}, true);

		_finderPathWithoutPaginationFindByobFormEntryId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByobFormEntryId",
			new String[] {Long.class.getName()}, new String[] {"obFormEntryId"},
			true);

		_finderPathCountByobFormEntryId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByobFormEntryId",
			new String[] {Long.class.getName()}, new String[] {"obFormEntryId"},
			false);

		_finderPathFetchByo_f = _createFinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByo_f",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"formFieldReference", "obFormEntryId"}, true);

		_finderPathCountByo_f = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByo_f",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"formFieldReference", "obFormEntryId"}, false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(OBFormFieldMappingImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = OBFormPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OBFormPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OBFormPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OBFORMFIELDMAPPING =
		"SELECT obFormFieldMapping FROM OBFormFieldMapping obFormFieldMapping";

	private static final String _SQL_SELECT_OBFORMFIELDMAPPING_WHERE =
		"SELECT obFormFieldMapping FROM OBFormFieldMapping obFormFieldMapping WHERE ";

	private static final String _SQL_COUNT_OBFORMFIELDMAPPING =
		"SELECT COUNT(obFormFieldMapping) FROM OBFormFieldMapping obFormFieldMapping";

	private static final String _SQL_COUNT_OBFORMFIELDMAPPING_WHERE =
		"SELECT COUNT(obFormFieldMapping) FROM OBFormFieldMapping obFormFieldMapping WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "obFormFieldMapping.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OBFormFieldMapping exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OBFormFieldMapping exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OBFormFieldMappingPersistenceImpl.class);

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class OBFormFieldMappingModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			OBFormFieldMappingModelImpl obFormFieldMappingModelImpl =
				(OBFormFieldMappingModelImpl)baseModel;

			long columnBitmask = obFormFieldMappingModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					obFormFieldMappingModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						obFormFieldMappingModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					obFormFieldMappingModelImpl, columnNames, original);
			}

			return null;
		}

		private Object[] _getValue(
			OBFormFieldMappingModelImpl obFormFieldMappingModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						obFormFieldMappingModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = obFormFieldMappingModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}