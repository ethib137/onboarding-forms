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

package com.liferay.form.onboarding.internal.security.permission.resource;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.form.onboarding.constants.OnboardingFormConstants;
import com.liferay.form.onboarding.constants.OnboardingFormPortletKeys;
import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.form.onboarding.service.OBFormEntryLocalService;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.StagedModelPermissionLogic;
import com.liferay.portal.kernel.security.permission.resource.WorkflowedModelPermissionLogic;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.workflow.permission.WorkflowPermission;

import java.util.Dictionary;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Evan Thibodeau
 */
@Component(immediate = true)
public class OBFormEntryModelResourcePermissionRegistrar {

	@Activate
	public void activate(BundleContext bundleContext) {
		Dictionary<String, Object> properties = new HashMapDictionary<>();

		properties.put("model.class.name", OBFormEntry.class.getName());

		_serviceRegistration = bundleContext.registerService(
			ModelResourcePermission.class,
			ModelResourcePermissionFactory.create(
				OBFormEntry.class, OBFormEntry::getObFormEntryId,
				_obFormEntryLocalService::getOBFormEntry,
				_portletResourcePermission,
				(modelResourcePermission, consumer) -> {
					consumer.accept(
						new StagedModelPermissionLogic<>(
							_stagingPermission,
							OnboardingFormPortletKeys.ONBOARDING_FORM,
							OBFormEntry::getObFormEntryId));
					consumer.accept(
						new WorkflowedModelPermissionLogic<>(
							_workflowPermission, modelResourcePermission,
							_groupLocalService, OBFormEntry::getObFormEntryId));
				}),
			properties);
	}

	@Deactivate
	public void deactivate() {
		_serviceRegistration.unregister();
	}

	@Reference
	private GroupLocalService _groupLocalService;

	@Reference
	private OBFormEntryLocalService _obFormEntryLocalService;

	@Reference(
		target = "(resource.name=" + OnboardingFormConstants.RESOURCE_NAME + ")"
	)
	private PortletResourcePermission _portletResourcePermission;

	private ServiceRegistration<ModelResourcePermission> _serviceRegistration;

	@Reference
	private StagingPermission _stagingPermission;

	@Reference
	private WorkflowPermission _workflowPermission;

}