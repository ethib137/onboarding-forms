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

package com.liferay.form.onboarding.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.service.OBFormEntryLocalService;
import com.liferay.form.onboarding.service.persistence.OBFormEntryPersistence;
import com.liferay.form.onboarding.service.persistence.OBFormFieldMappingPersistence;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ob form entry local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.form.onboarding.service.impl.OBFormEntryLocalServiceImpl}.
 * </p>
 *
 * @author Evan Thibodeau
 * @see com.liferay.form.onboarding.service.impl.OBFormEntryLocalServiceImpl
 * @generated
 */
public abstract class OBFormEntryLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, OBFormEntryLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OBFormEntryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.form.onboarding.service.OBFormEntryLocalServiceUtil</code>.
	 */

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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OBFormEntry addOBFormEntry(OBFormEntry obFormEntry) {
		obFormEntry.setNew(true);

		return obFormEntryPersistence.update(obFormEntry);
	}

	/**
	 * Creates a new ob form entry with the primary key. Does not add the ob form entry to the database.
	 *
	 * @param obFormEntryId the primary key for the new ob form entry
	 * @return the new ob form entry
	 */
	@Override
	@Transactional(enabled = false)
	public OBFormEntry createOBFormEntry(long obFormEntryId) {
		return obFormEntryPersistence.create(obFormEntryId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OBFormEntry deleteOBFormEntry(long obFormEntryId)
		throws PortalException {

		return obFormEntryPersistence.remove(obFormEntryId);
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
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OBFormEntry deleteOBFormEntry(OBFormEntry obFormEntry)
		throws PortalException {

		return obFormEntryPersistence.remove(obFormEntry);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			OBFormEntry.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return obFormEntryPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return obFormEntryPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return obFormEntryPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return obFormEntryPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return obFormEntryPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public OBFormEntry fetchOBFormEntry(long obFormEntryId) {
		return obFormEntryPersistence.fetchByPrimaryKey(obFormEntryId);
	}

	/**
	 * Returns the ob form entry matching the UUID and group.
	 *
	 * @param uuid the ob form entry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ob form entry, or <code>null</code> if a matching ob form entry could not be found
	 */
	@Override
	public OBFormEntry fetchOBFormEntryByUuidAndGroupId(
		String uuid, long groupId) {

		return obFormEntryPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ob form entry with the primary key.
	 *
	 * @param obFormEntryId the primary key of the ob form entry
	 * @return the ob form entry
	 * @throws PortalException if a ob form entry with the primary key could not be found
	 */
	@Override
	public OBFormEntry getOBFormEntry(long obFormEntryId)
		throws PortalException {

		return obFormEntryPersistence.findByPrimaryKey(obFormEntryId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(obFormEntryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OBFormEntry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("obFormEntryId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			obFormEntryLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(OBFormEntry.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"obFormEntryId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(obFormEntryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OBFormEntry.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("obFormEntryId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<OBFormEntry>() {

				@Override
				public void performAction(OBFormEntry obFormEntry)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, obFormEntry);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(OBFormEntry.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return obFormEntryPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return obFormEntryLocalService.deleteOBFormEntry(
			(OBFormEntry)persistedModel);
	}

	public BasePersistence<OBFormEntry> getBasePersistence() {
		return obFormEntryPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return obFormEntryPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the ob form entries matching the UUID and company.
	 *
	 * @param uuid the UUID of the ob form entries
	 * @param companyId the primary key of the company
	 * @return the matching ob form entries, or an empty list if no matches were found
	 */
	@Override
	public List<OBFormEntry> getOBFormEntriesByUuidAndCompanyId(
		String uuid, long companyId) {

		return obFormEntryPersistence.findByUuid_C(uuid, companyId);
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
	public List<OBFormEntry> getOBFormEntriesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OBFormEntry> orderByComparator) {

		return obFormEntryPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public OBFormEntry getOBFormEntryByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return obFormEntryPersistence.findByUUID_G(uuid, groupId);
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
	public List<OBFormEntry> getOBFormEntries(int start, int end) {
		return obFormEntryPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ob form entries.
	 *
	 * @return the number of ob form entries
	 */
	@Override
	public int getOBFormEntriesCount() {
		return obFormEntryPersistence.countAll();
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
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OBFormEntry updateOBFormEntry(OBFormEntry obFormEntry) {
		return obFormEntryPersistence.update(obFormEntry);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OBFormEntryLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		obFormEntryLocalService = (OBFormEntryLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OBFormEntryLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OBFormEntry.class;
	}

	protected String getModelClassName() {
		return OBFormEntry.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = obFormEntryPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected OBFormEntryLocalService obFormEntryLocalService;

	@Reference
	protected OBFormEntryPersistence obFormEntryPersistence;

	@Reference
	protected OBFormFieldMappingPersistence obFormFieldMappingPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.GroupLocalService
		groupLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}