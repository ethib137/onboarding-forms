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

		attributes.put("obFormFieldId", getObFormFieldId());
		attributes.put("userPropertyName", getUserPropertyName());
		attributes.put("formFieldId", getFormFieldId());
		attributes.put("obFormEntryId", getObFormEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long obFormFieldId = (Long)attributes.get("obFormFieldId");

		if (obFormFieldId != null) {
			setObFormFieldId(obFormFieldId);
		}

		String userPropertyName = (String)attributes.get("userPropertyName");

		if (userPropertyName != null) {
			setUserPropertyName(userPropertyName);
		}

		Long formFieldId = (Long)attributes.get("formFieldId");

		if (formFieldId != null) {
			setFormFieldId(formFieldId);
		}

		Long obFormEntryId = (Long)attributes.get("obFormEntryId");

		if (obFormEntryId != null) {
			setObFormEntryId(obFormEntryId);
		}
	}

	/**
	 * Returns the form field ID of this ob form field mapping.
	 *
	 * @return the form field ID of this ob form field mapping
	 */
	@Override
	public long getFormFieldId() {
		return model.getFormFieldId();
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
	 * Returns the ob form field ID of this ob form field mapping.
	 *
	 * @return the ob form field ID of this ob form field mapping
	 */
	@Override
	public long getObFormFieldId() {
		return model.getObFormFieldId();
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
	 * Sets the form field ID of this ob form field mapping.
	 *
	 * @param formFieldId the form field ID of this ob form field mapping
	 */
	@Override
	public void setFormFieldId(long formFieldId) {
		model.setFormFieldId(formFieldId);
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
	 * Sets the ob form field ID of this ob form field mapping.
	 *
	 * @param obFormFieldId the ob form field ID of this ob form field mapping
	 */
	@Override
	public void setObFormFieldId(long obFormFieldId) {
		model.setObFormFieldId(obFormFieldId);
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