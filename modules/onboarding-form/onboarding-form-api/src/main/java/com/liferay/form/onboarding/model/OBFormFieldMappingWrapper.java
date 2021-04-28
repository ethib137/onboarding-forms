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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OBFormFieldMapping}.
 * </p>
 *
 * @author Evan Thibodeau
 * @see OBFormFieldMapping
 * @generated
 */
public class OBFormFieldMappingWrapper
	extends BaseModelWrapper<OBFormFieldMapping>
	implements ModelWrapper<OBFormFieldMapping>, OBFormFieldMapping {

	public OBFormFieldMappingWrapper(OBFormFieldMapping obFormFieldMapping) {
		super(obFormFieldMapping);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("obFormFieldMappingId", getObFormFieldMappingId());
		attributes.put("userPropertyName", getUserPropertyName());
		attributes.put("formFieldReference", getFormFieldReference());
		attributes.put("obFormEntryId", getObFormEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long obFormFieldMappingId = (Long)attributes.get(
			"obFormFieldMappingId");

		if (obFormFieldMappingId != null) {
			setObFormFieldMappingId(obFormFieldMappingId);
		}

		String userPropertyName = (String)attributes.get("userPropertyName");

		if (userPropertyName != null) {
			setUserPropertyName(userPropertyName);
		}

		String formFieldReference = (String)attributes.get(
			"formFieldReference");

		if (formFieldReference != null) {
			setFormFieldReference(formFieldReference);
		}

		Long obFormEntryId = (Long)attributes.get("obFormEntryId");

		if (obFormEntryId != null) {
			setObFormEntryId(obFormEntryId);
		}
	}

	/**
	 * Returns the form field reference of this ob form field mapping.
	 *
	 * @return the form field reference of this ob form field mapping
	 */
	@Override
	public String getFormFieldReference() {
		return model.getFormFieldReference();
	}

	/**
	 * Returns the ob form entry ID of this ob form field mapping.
	 *
	 * @return the ob form entry ID of this ob form field mapping
	 */
	@Override
	public long getObFormEntryId() {
		return model.getObFormEntryId();
	}

	/**
	 * Returns the ob form field mapping ID of this ob form field mapping.
	 *
	 * @return the ob form field mapping ID of this ob form field mapping
	 */
	@Override
	public long getObFormFieldMappingId() {
		return model.getObFormFieldMappingId();
	}

	/**
	 * Returns the primary key of this ob form field mapping.
	 *
	 * @return the primary key of this ob form field mapping
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user property name of this ob form field mapping.
	 *
	 * @return the user property name of this ob form field mapping
	 */
	@Override
	public String getUserPropertyName() {
		return model.getUserPropertyName();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the form field reference of this ob form field mapping.
	 *
	 * @param formFieldReference the form field reference of this ob form field mapping
	 */
	@Override
	public void setFormFieldReference(String formFieldReference) {
		model.setFormFieldReference(formFieldReference);
	}

	/**
	 * Sets the ob form entry ID of this ob form field mapping.
	 *
	 * @param obFormEntryId the ob form entry ID of this ob form field mapping
	 */
	@Override
	public void setObFormEntryId(long obFormEntryId) {
		model.setObFormEntryId(obFormEntryId);
	}

	/**
	 * Sets the ob form field mapping ID of this ob form field mapping.
	 *
	 * @param obFormFieldMappingId the ob form field mapping ID of this ob form field mapping
	 */
	@Override
	public void setObFormFieldMappingId(long obFormFieldMappingId) {
		model.setObFormFieldMappingId(obFormFieldMappingId);
	}

	/**
	 * Sets the primary key of this ob form field mapping.
	 *
	 * @param primaryKey the primary key of this ob form field mapping
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user property name of this ob form field mapping.
	 *
	 * @param userPropertyName the user property name of this ob form field mapping
	 */
	@Override
	public void setUserPropertyName(String userPropertyName) {
		model.setUserPropertyName(userPropertyName);
	}

	@Override
	protected OBFormFieldMappingWrapper wrap(
		OBFormFieldMapping obFormFieldMapping) {

		return new OBFormFieldMappingWrapper(obFormFieldMapping);
	}

}