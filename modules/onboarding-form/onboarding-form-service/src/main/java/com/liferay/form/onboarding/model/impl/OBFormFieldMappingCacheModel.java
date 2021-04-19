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

import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OBFormFieldMapping in entity cache.
 *
 * @author Evan Thibodeau
 * @generated
 */
public class OBFormFieldMappingCacheModel
	implements CacheModel<OBFormFieldMapping>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OBFormFieldMappingCacheModel)) {
			return false;
		}

		OBFormFieldMappingCacheModel obFormFieldMappingCacheModel =
			(OBFormFieldMappingCacheModel)object;

		if (obFormFieldId == obFormFieldMappingCacheModel.obFormFieldId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, obFormFieldId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{obFormFieldId=");
		sb.append(obFormFieldId);
		sb.append(", userPropertyName=");
		sb.append(userPropertyName);
		sb.append(", formFieldId=");
		sb.append(formFieldId);
		sb.append(", obFormEntryId=");
		sb.append(obFormEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OBFormFieldMapping toEntityModel() {
		OBFormFieldMappingImpl obFormFieldMappingImpl =
			new OBFormFieldMappingImpl();

		obFormFieldMappingImpl.setObFormFieldId(obFormFieldId);

		if (userPropertyName == null) {
			obFormFieldMappingImpl.setUserPropertyName("");
		}
		else {
			obFormFieldMappingImpl.setUserPropertyName(userPropertyName);
		}

		obFormFieldMappingImpl.setFormFieldId(formFieldId);
		obFormFieldMappingImpl.setObFormEntryId(obFormEntryId);

		obFormFieldMappingImpl.resetOriginalValues();

		return obFormFieldMappingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		obFormFieldId = objectInput.readLong();
		userPropertyName = objectInput.readUTF();

		formFieldId = objectInput.readLong();

		obFormEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(obFormFieldId);

		if (userPropertyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userPropertyName);
		}

		objectOutput.writeLong(formFieldId);

		objectOutput.writeLong(obFormEntryId);
	}

	public long obFormFieldId;
	public String userPropertyName;
	public long formFieldId;
	public long obFormEntryId;

}