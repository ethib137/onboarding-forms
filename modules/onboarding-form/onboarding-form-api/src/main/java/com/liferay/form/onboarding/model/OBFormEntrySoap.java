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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.form.onboarding.service.http.OBFormEntryServiceSoap}.
 *
 * @author Evan Thibodeau
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class OBFormEntrySoap implements Serializable {

	public static OBFormEntrySoap toSoapModel(OBFormEntry model) {
		OBFormEntrySoap soapModel = new OBFormEntrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setObFormEntryId(model.getObFormEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setFormId(model.getFormId());
		soapModel.setOrganizationIds(model.getOrganizationIds());
		soapModel.setRoleIds(model.getRoleIds());
		soapModel.setSiteIds(model.getSiteIds());
		soapModel.setUserGroupIds(model.getUserGroupIds());
		soapModel.setSendEmail(model.isSendEmail());
		soapModel.setActive(model.isActive());

		return soapModel;
	}

	public static OBFormEntrySoap[] toSoapModels(OBFormEntry[] models) {
		OBFormEntrySoap[] soapModels = new OBFormEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OBFormEntrySoap[][] toSoapModels(OBFormEntry[][] models) {
		OBFormEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OBFormEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new OBFormEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OBFormEntrySoap[] toSoapModels(List<OBFormEntry> models) {
		List<OBFormEntrySoap> soapModels = new ArrayList<OBFormEntrySoap>(
			models.size());

		for (OBFormEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OBFormEntrySoap[soapModels.size()]);
	}

	public OBFormEntrySoap() {
	}

	public long getPrimaryKey() {
		return _obFormEntryId;
	}

	public void setPrimaryKey(long pk) {
		setObFormEntryId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getObFormEntryId() {
		return _obFormEntryId;
	}

	public void setObFormEntryId(long obFormEntryId) {
		_obFormEntryId = obFormEntryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getFormId() {
		return _formId;
	}

	public void setFormId(long formId) {
		_formId = formId;
	}

	public String getOrganizationIds() {
		return _organizationIds;
	}

	public void setOrganizationIds(String organizationIds) {
		_organizationIds = organizationIds;
	}

	public String getRoleIds() {
		return _roleIds;
	}

	public void setRoleIds(String roleIds) {
		_roleIds = roleIds;
	}

	public String getSiteIds() {
		return _siteIds;
	}

	public void setSiteIds(String siteIds) {
		_siteIds = siteIds;
	}

	public String getUserGroupIds() {
		return _userGroupIds;
	}

	public void setUserGroupIds(String userGroupIds) {
		_userGroupIds = userGroupIds;
	}

	public boolean getSendEmail() {
		return _sendEmail;
	}

	public boolean isSendEmail() {
		return _sendEmail;
	}

	public void setSendEmail(boolean sendEmail) {
		_sendEmail = sendEmail;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	private String _uuid;
	private long _obFormEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private long _formId;
	private String _organizationIds;
	private String _roleIds;
	private String _siteIds;
	private String _userGroupIds;
	private boolean _sendEmail;
	private boolean _active;

}