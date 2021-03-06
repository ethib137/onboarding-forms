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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.form.onboarding.service.http.OBFormFieldMappingServiceSoap}.
 *
 * @author Evan Thibodeau
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class OBFormFieldMappingSoap implements Serializable {

	public static OBFormFieldMappingSoap toSoapModel(OBFormFieldMapping model) {
		OBFormFieldMappingSoap soapModel = new OBFormFieldMappingSoap();

		soapModel.setObFormFieldMappingId(model.getObFormFieldMappingId());
		soapModel.setUserPropertyName(model.getUserPropertyName());
		soapModel.setFormFieldReference(model.getFormFieldReference());
		soapModel.setObFormEntryId(model.getObFormEntryId());

		return soapModel;
	}

	public static OBFormFieldMappingSoap[] toSoapModels(
		OBFormFieldMapping[] models) {

		OBFormFieldMappingSoap[] soapModels =
			new OBFormFieldMappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OBFormFieldMappingSoap[][] toSoapModels(
		OBFormFieldMapping[][] models) {

		OBFormFieldMappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new OBFormFieldMappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OBFormFieldMappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OBFormFieldMappingSoap[] toSoapModels(
		List<OBFormFieldMapping> models) {

		List<OBFormFieldMappingSoap> soapModels =
			new ArrayList<OBFormFieldMappingSoap>(models.size());

		for (OBFormFieldMapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new OBFormFieldMappingSoap[soapModels.size()]);
	}

	public OBFormFieldMappingSoap() {
	}

	public long getPrimaryKey() {
		return _obFormFieldMappingId;
	}

	public void setPrimaryKey(long pk) {
		setObFormFieldMappingId(pk);
	}

	public long getObFormFieldMappingId() {
		return _obFormFieldMappingId;
	}

	public void setObFormFieldMappingId(long obFormFieldMappingId) {
		_obFormFieldMappingId = obFormFieldMappingId;
	}

	public String getUserPropertyName() {
		return _userPropertyName;
	}

	public void setUserPropertyName(String userPropertyName) {
		_userPropertyName = userPropertyName;
	}

	public String getFormFieldReference() {
		return _formFieldReference;
	}

	public void setFormFieldReference(String formFieldReference) {
		_formFieldReference = formFieldReference;
	}

	public long getObFormEntryId() {
		return _obFormEntryId;
	}

	public void setObFormEntryId(long obFormEntryId) {
		_obFormEntryId = obFormEntryId;
	}

	private long _obFormFieldMappingId;
	private String _userPropertyName;
	private String _formFieldReference;
	private long _obFormEntryId;

}