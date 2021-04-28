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

package com.liferay.form.onboarding.model.impl;

import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OBFormEntry in entity cache.
 *
 * @author Evan Thibodeau
 * @generated
 */
public class OBFormEntryCacheModel
	implements CacheModel<OBFormEntry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OBFormEntryCacheModel)) {
			return false;
		}

		OBFormEntryCacheModel obFormEntryCacheModel =
			(OBFormEntryCacheModel)object;

		if (obFormEntryId == obFormEntryCacheModel.obFormEntryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, obFormEntryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", obFormEntryId=");
		sb.append(obFormEntryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", formId=");
		sb.append(formId);
		sb.append(", organizationIds=");
		sb.append(organizationIds);
		sb.append(", roleIds=");
		sb.append(roleIds);
		sb.append(", siteIds=");
		sb.append(siteIds);
		sb.append(", userGroupIds=");
		sb.append(userGroupIds);
		sb.append(", sendEmail=");
		sb.append(sendEmail);
		sb.append(", active=");
		sb.append(active);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OBFormEntry toEntityModel() {
		OBFormEntryImpl obFormEntryImpl = new OBFormEntryImpl();

		if (uuid == null) {
			obFormEntryImpl.setUuid("");
		}
		else {
			obFormEntryImpl.setUuid(uuid);
		}

		obFormEntryImpl.setObFormEntryId(obFormEntryId);
		obFormEntryImpl.setGroupId(groupId);
		obFormEntryImpl.setCompanyId(companyId);
		obFormEntryImpl.setUserId(userId);

		if (userName == null) {
			obFormEntryImpl.setUserName("");
		}
		else {
			obFormEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			obFormEntryImpl.setCreateDate(null);
		}
		else {
			obFormEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			obFormEntryImpl.setModifiedDate(null);
		}
		else {
			obFormEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			obFormEntryImpl.setName("");
		}
		else {
			obFormEntryImpl.setName(name);
		}

		obFormEntryImpl.setFormId(formId);

		if (organizationIds == null) {
			obFormEntryImpl.setOrganizationIds("");
		}
		else {
			obFormEntryImpl.setOrganizationIds(organizationIds);
		}

		if (roleIds == null) {
			obFormEntryImpl.setRoleIds("");
		}
		else {
			obFormEntryImpl.setRoleIds(roleIds);
		}

		if (siteIds == null) {
			obFormEntryImpl.setSiteIds("");
		}
		else {
			obFormEntryImpl.setSiteIds(siteIds);
		}

		if (userGroupIds == null) {
			obFormEntryImpl.setUserGroupIds("");
		}
		else {
			obFormEntryImpl.setUserGroupIds(userGroupIds);
		}

		obFormEntryImpl.setSendEmail(sendEmail);
		obFormEntryImpl.setActive(active);

		obFormEntryImpl.resetOriginalValues();

		return obFormEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		obFormEntryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		formId = objectInput.readLong();
		organizationIds = objectInput.readUTF();
		roleIds = objectInput.readUTF();
		siteIds = objectInput.readUTF();
		userGroupIds = objectInput.readUTF();

		sendEmail = objectInput.readBoolean();

		active = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(obFormEntryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(formId);

		if (organizationIds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationIds);
		}

		if (roleIds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roleIds);
		}

		if (siteIds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(siteIds);
		}

		if (userGroupIds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userGroupIds);
		}

		objectOutput.writeBoolean(sendEmail);

		objectOutput.writeBoolean(active);
	}

	public String uuid;
	public long obFormEntryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public long formId;
	public String organizationIds;
	public String roleIds;
	public String siteIds;
	public String userGroupIds;
	public boolean sendEmail;
	public boolean active;

}