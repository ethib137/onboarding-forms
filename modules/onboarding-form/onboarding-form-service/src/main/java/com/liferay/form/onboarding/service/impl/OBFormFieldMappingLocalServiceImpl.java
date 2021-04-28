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

import com.liferay.form.onboarding.model.OBFormFieldMapping;
import com.liferay.form.onboarding.service.base.OBFormFieldMappingLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the ob form field mapping local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.form.onboarding.service.OBFormFieldMappingLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OBFormFieldMappingLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.form.onboarding.model.OBFormFieldMapping",
	service = AopService.class
)
public class OBFormFieldMappingLocalServiceImpl
	extends OBFormFieldMappingLocalServiceBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.form.onboarding.service.OBFormFieldMappingLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.form.onboarding.service.OBFormFieldMappingLocalServiceUtil</code>.
	 */
	public OBFormFieldMapping addOBFormFieldMapping(
		long obFormEntryId, String formFieldReference,
		String userPropertyName) {

		long obFormFieldMappingId = counterLocalService.increment();

		OBFormFieldMapping obFormFieldMapping =
			obFormFieldMappingPersistence.create(obFormFieldMappingId);

		obFormFieldMapping.setObFormEntryId(obFormEntryId);
		obFormFieldMapping.setFormFieldReference(formFieldReference);
		obFormFieldMapping.setUserPropertyName(userPropertyName);

		return updateOBFormFieldMapping(obFormFieldMapping);
	}

	public OBFormFieldMapping deleteOBFormFieldMapping(
			long obFormFieldMappingId)
		throws PortalException {

		OBFormFieldMapping obFormFieldMapping = getOBFormFieldMapping(
			obFormFieldMappingId);

		return deleteOBFormFieldMapping(obFormFieldMapping);
	}

	public OBFormFieldMapping deleteOBFormFieldMapping(
			long obFormEntryId, String formFieldReference)
		throws PortalException {

		OBFormFieldMapping obFormFieldMapping = getOBFormFieldMapping(
			obFormEntryId, formFieldReference);

		return obFormFieldMappingPersistence.remove(obFormFieldMapping);
	}

	public OBFormFieldMapping deleteOBFormFieldMapping(
		OBFormFieldMapping obFormFieldMapping) {

		return obFormFieldMappingPersistence.remove(obFormFieldMapping);
	}

	public OBFormFieldMapping getOBFormFieldMapping(long obFormFieldMappingId)
		throws PortalException {

		return obFormFieldMappingPersistence.findByPrimaryKey(
			obFormFieldMappingId);
	}

	public OBFormFieldMapping getOBFormFieldMapping(
			long obFormEntryId, String formFieldReference)
		throws PortalException {

		return obFormFieldMappingPersistence.findByo_f(
			formFieldReference, obFormEntryId);
	}

	public List<OBFormFieldMapping> getOBFormFieldMappings(long obFormEntryId) {
		return obFormFieldMappingPersistence.findByobFormEntryId(obFormEntryId);
	}

	public List<OBFormFieldMapping> getOBFormFieldMappings(
		long obFormEntryId, int start, int end) {

		return obFormFieldMappingPersistence.findByobFormEntryId(
			obFormEntryId, start, end);
	}

	public int getOBFormFieldMappingsCount(long obFormEntryId) {
		return obFormFieldMappingPersistence.countByobFormEntryId(
			obFormEntryId);
	}

	public OBFormFieldMapping updateOBFormFieldMapping(
			long obFormFieldMappingId, String formFieldReference,
			String userPropertyName)
		throws PortalException {

		OBFormFieldMapping obFormFieldMapping = getOBFormFieldMapping(
			obFormFieldMappingId);

		obFormFieldMapping.setFormFieldReference(formFieldReference);
		obFormFieldMapping.setUserPropertyName(userPropertyName);

		return updateOBFormFieldMapping(obFormFieldMapping);
	}

	public OBFormFieldMapping updateOBFormFieldMapping(
		OBFormFieldMapping obFormFieldMapping) {

		return obFormFieldMappingPersistence.update(obFormFieldMapping);
	}

}