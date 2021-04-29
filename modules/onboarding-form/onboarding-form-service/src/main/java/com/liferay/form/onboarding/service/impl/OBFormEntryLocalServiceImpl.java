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

package com.liferay.form.onboarding.service.impl;

import com.liferay.form.onboarding.exception.OBFormEntryFormException;
import com.liferay.form.onboarding.exception.OBFormEntryNameException;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.service.base.OBFormEntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the ob form entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.form.onboarding.service.OBFormEntryLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OBFormEntryLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.form.onboarding.model.OBFormEntry",
	service = AopService.class
)
public class OBFormEntryLocalServiceImpl
	extends OBFormEntryLocalServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.form.onboarding.service.OBFormEntryLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.form.onboarding.service.OBFormEntryLocalServiceUtil</code>.
	 */
	public OBFormEntry addOBFormEntry(
			long userId, String name, long formId,
			ServiceContext serviceContext)
		throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(name, formId);

		long obFormEntryId = counterLocalService.increment();

		OBFormEntry obFormEntry = obFormEntryPersistence.create(obFormEntryId);

		obFormEntry.setUserId(userId);
		obFormEntry.setGroupId(groupId);
		obFormEntry.setCompanyId(user.getCompanyId());
		obFormEntry.setUserName(user.getFullName());
		obFormEntry.setCreateDate(serviceContext.getCreateDate(now));
		obFormEntry.setModifiedDate(serviceContext.getModifiedDate(now));
		obFormEntry.setName(name);
		obFormEntry.setFormId(formId);
		obFormEntry.setActive(true);
		obFormEntry.setExpandoBridgeAttributes(serviceContext);

		resourceLocalService.addResources(
			user.getCompanyId(), groupId, userId, OBFormEntry.class.getName(),
			obFormEntryId, false, true, true);

		return obFormEntryPersistence.update(obFormEntry);
	}

	public OBFormEntry deleteOBFormEntry(long obFormEntryId)
		throws PortalException {

		return deleteOBFormEntry(getOBFormEntry(obFormEntryId));
	}

	public OBFormEntry deleteOBFormEntry(OBFormEntry obFormEntry)
		throws PortalException {

		obFormEntryPersistence.remove(obFormEntry);

		resourceLocalService.deleteResource(
			obFormEntry.getCompanyId(), OBFormEntry.class.getName(),
			ResourceConstants.SCOPE_INDIVIDUAL, obFormEntry.getObFormEntryId());

		return obFormEntry;
	}

	public OBFormEntry fetchOBFormEntryByFormId(long formId) {
		return obFormEntryPersistence.fetchByformId(formId);
	}

	public List<OBFormEntry> getOBFormEntries(long groupId) {
		return obFormEntryPersistence.findBygroupId(groupId);
	}

	public List<OBFormEntry> getOBFormEntries(
		long groupId, int start, int end) {

		return obFormEntryPersistence.findBygroupId(groupId, start, end);
	}

	public List<OBFormEntry> getOBFormEntries(
		long groupId, int start, int end, OrderByComparator<OBFormEntry> obc) {

		return obFormEntryPersistence.findBygroupId(groupId, start, end, obc);
	}

	public int getOBFormEntriesCount(long groupId) {
		return obFormEntryPersistence.countBygroupId(groupId);
	}

	public OBFormEntry getOBFormEntry(long obFormEntryId)
		throws PortalException {

		return obFormEntryPersistence.findByPrimaryKey(obFormEntryId);
	}

	public OBFormEntry getOBFormEntryByFormId(long formId)
		throws PortalException {

		return obFormEntryPersistence.findByformId(formId);
	}

	public OBFormEntry updateOBFormEntry(
			long userId, long obFormEntryId, String name,
			long[] organizationIds, long[] roleIds, long[] siteIds,
			long[] userGroupIds, boolean sendEmail, boolean active,
			ServiceContext serviceContext)
		throws PortalException {

		Date now = new Date();

		validate(name);

		OBFormEntry obFormEntry = getOBFormEntry(obFormEntryId);

		User user = userLocalService.getUserById(userId);

		obFormEntry.setUserId(userId);
		obFormEntry.setCompanyId(user.getCompanyId());
		obFormEntry.setUserName(user.getFullName());
		obFormEntry.setCreateDate(serviceContext.getCreateDate(now));
		obFormEntry.setModifiedDate(serviceContext.getModifiedDate(now));
		obFormEntry.setName(name);
		obFormEntry.setOrganizationIds(organizationIds);
		obFormEntry.setRoldIds(roleIds);
		obFormEntry.setSiteIds(siteIds);
		obFormEntry.setUserGroupIds(userGroupIds);
		obFormEntry.setSendEmail(sendEmail);
		obFormEntry.setActive(active);
		obFormEntry.setExpandoBridgeAttributes(serviceContext);

		resourceLocalService.updateResources(
			serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
			OBFormEntry.class.getName(), obFormEntryId,
			serviceContext.getModelPermissions());

		return updateOBFormEntry(obFormEntry);
	}

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
			throw new OBFormEntryNameException();
		}
	}

	protected void validate(String name, long formId) throws PortalException {
		if (formId <= 0) {
			throw new OBFormEntryFormException();
		}

		OBFormEntry obFormEntry = fetchOBFormEntryByFormId(formId);

		if (obFormEntry != null) {
			throw new OBFormEntryFormException();
		}

		validate(name);
	}

}