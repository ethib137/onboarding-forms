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

package com.liferay.form.onboarding.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OBFormEntry}.
 * </p>
 *
 * @author Evan Thibodeau
 * @see OBFormEntry
 * @generated
 */
public class OBFormEntryWrapper
	extends BaseModelWrapper<OBFormEntry>
	implements ModelWrapper<OBFormEntry>, OBFormEntry {

	public OBFormEntryWrapper(OBFormEntry obFormEntry) {
		super(obFormEntry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("obFormEntryId", getObFormEntryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("formId", getFormId());
		attributes.put("organizationIds", getOrganizationIds());
		attributes.put("roleIds", getRoleIds());
		attributes.put("siteIds", getSiteIds());
		attributes.put("userGroupIds", getUserGroupIds());
		attributes.put("sendEmail", isSendEmail());
		attributes.put("active", isActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long obFormEntryId = (Long)attributes.get("obFormEntryId");

		if (obFormEntryId != null) {
			setObFormEntryId(obFormEntryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long formId = (Long)attributes.get("formId");

		if (formId != null) {
			setFormId(formId);
		}

		String organizationIds = (String)attributes.get("organizationIds");

		if (organizationIds != null) {
			setOrganizationIds(organizationIds);
		}

		String roleIds = (String)attributes.get("roleIds");

		if (roleIds != null) {
			setRoleIds(roleIds);
		}

		String siteIds = (String)attributes.get("siteIds");

		if (siteIds != null) {
			setSiteIds(siteIds);
		}

		String userGroupIds = (String)attributes.get("userGroupIds");

		if (userGroupIds != null) {
			setUserGroupIds(userGroupIds);
		}

		Boolean sendEmail = (Boolean)attributes.get("sendEmail");

		if (sendEmail != null) {
			setSendEmail(sendEmail);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	/**
	 * Returns the active of this ob form entry.
	 *
	 * @return the active of this ob form entry
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the company ID of this ob form entry.
	 *
	 * @return the company ID of this ob form entry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ob form entry.
	 *
	 * @return the create date of this ob form entry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the form ID of this ob form entry.
	 *
	 * @return the form ID of this ob form entry
	 */
	@Override
	public long getFormId() {
		return model.getFormId();
	}

	/**
	 * Returns the group ID of this ob form entry.
	 *
	 * @return the group ID of this ob form entry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ob form entry.
	 *
	 * @return the modified date of this ob form entry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this ob form entry.
	 *
	 * @return the name of this ob form entry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the ob form entry ID of this ob form entry.
	 *
	 * @return the ob form entry ID of this ob form entry
	 */
	@Override
	public long getObFormEntryId() {
		return model.getObFormEntryId();
	}

	/**
	 * Returns the organization IDs of this ob form entry.
	 *
	 * @return the organization IDs of this ob form entry
	 */
	@Override
	public String getOrganizationIds() {
		return model.getOrganizationIds();
	}

	@Override
	public long[] getOrganizationIdsAsLongs() {
		return model.getOrganizationIdsAsLongs();
	}

	/**
	 * Returns the primary key of this ob form entry.
	 *
	 * @return the primary key of this ob form entry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the role IDs of this ob form entry.
	 *
	 * @return the role IDs of this ob form entry
	 */
	@Override
	public String getRoleIds() {
		return model.getRoleIds();
	}

	@Override
	public long[] getRoleIdsAsLongs() {
		return model.getRoleIdsAsLongs();
	}

	/**
	 * Returns the send email of this ob form entry.
	 *
	 * @return the send email of this ob form entry
	 */
	@Override
	public boolean getSendEmail() {
		return model.getSendEmail();
	}

	/**
	 * Returns the site IDs of this ob form entry.
	 *
	 * @return the site IDs of this ob form entry
	 */
	@Override
	public String getSiteIds() {
		return model.getSiteIds();
	}

	@Override
	public long[] getSiteIdsAsLongs() {
		return model.getSiteIdsAsLongs();
	}

	/**
	 * Returns the user group IDs of this ob form entry.
	 *
	 * @return the user group IDs of this ob form entry
	 */
	@Override
	public String getUserGroupIds() {
		return model.getUserGroupIds();
	}

	@Override
	public long[] getUserGroupIdsAsLongs() {
		return model.getUserGroupIdsAsLongs();
	}

	/**
	 * Returns the user ID of this ob form entry.
	 *
	 * @return the user ID of this ob form entry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ob form entry.
	 *
	 * @return the user name of this ob form entry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ob form entry.
	 *
	 * @return the user uuid of this ob form entry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this ob form entry.
	 *
	 * @return the uuid of this ob form entry
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this ob form entry is active.
	 *
	 * @return <code>true</code> if this ob form entry is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	/**
	 * Returns <code>true</code> if this ob form entry is send email.
	 *
	 * @return <code>true</code> if this ob form entry is send email; <code>false</code> otherwise
	 */
	@Override
	public boolean isSendEmail() {
		return model.isSendEmail();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this ob form entry is active.
	 *
	 * @param active the active of this ob form entry
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the company ID of this ob form entry.
	 *
	 * @param companyId the company ID of this ob form entry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ob form entry.
	 *
	 * @param createDate the create date of this ob form entry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the form ID of this ob form entry.
	 *
	 * @param formId the form ID of this ob form entry
	 */
	@Override
	public void setFormId(long formId) {
		model.setFormId(formId);
	}

	/**
	 * Sets the group ID of this ob form entry.
	 *
	 * @param groupId the group ID of this ob form entry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ob form entry.
	 *
	 * @param modifiedDate the modified date of this ob form entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this ob form entry.
	 *
	 * @param name the name of this ob form entry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the ob form entry ID of this ob form entry.
	 *
	 * @param obFormEntryId the ob form entry ID of this ob form entry
	 */
	@Override
	public void setObFormEntryId(long obFormEntryId) {
		model.setObFormEntryId(obFormEntryId);
	}

	@Override
	public void setOrganizationIds(long[] organizationIds) {
		model.setOrganizationIds(organizationIds);
	}

	/**
	 * Sets the organization IDs of this ob form entry.
	 *
	 * @param organizationIds the organization IDs of this ob form entry
	 */
	@Override
	public void setOrganizationIds(String organizationIds) {
		model.setOrganizationIds(organizationIds);
	}

	/**
	 * Sets the primary key of this ob form entry.
	 *
	 * @param primaryKey the primary key of this ob form entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	public void setRoldIds(long[] roleIds) {
		model.setRoldIds(roleIds);
	}

	/**
	 * Sets the role IDs of this ob form entry.
	 *
	 * @param roleIds the role IDs of this ob form entry
	 */
	@Override
	public void setRoleIds(String roleIds) {
		model.setRoleIds(roleIds);
	}

	/**
	 * Sets whether this ob form entry is send email.
	 *
	 * @param sendEmail the send email of this ob form entry
	 */
	@Override
	public void setSendEmail(boolean sendEmail) {
		model.setSendEmail(sendEmail);
	}

	@Override
	public void setSiteIds(long[] siteIds) {
		model.setSiteIds(siteIds);
	}

	/**
	 * Sets the site IDs of this ob form entry.
	 *
	 * @param siteIds the site IDs of this ob form entry
	 */
	@Override
	public void setSiteIds(String siteIds) {
		model.setSiteIds(siteIds);
	}

	@Override
	public void setUserGroupIds(long[] userGroupIds) {
		model.setUserGroupIds(userGroupIds);
	}

	/**
	 * Sets the user group IDs of this ob form entry.
	 *
	 * @param userGroupIds the user group IDs of this ob form entry
	 */
	@Override
	public void setUserGroupIds(String userGroupIds) {
		model.setUserGroupIds(userGroupIds);
	}

	/**
	 * Sets the user ID of this ob form entry.
	 *
	 * @param userId the user ID of this ob form entry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ob form entry.
	 *
	 * @param userName the user name of this ob form entry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ob form entry.
	 *
	 * @param userUuid the user uuid of this ob form entry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this ob form entry.
	 *
	 * @param uuid the uuid of this ob form entry
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected OBFormEntryWrapper wrap(OBFormEntry obFormEntry) {
		return new OBFormEntryWrapper(obFormEntry);
	}

}