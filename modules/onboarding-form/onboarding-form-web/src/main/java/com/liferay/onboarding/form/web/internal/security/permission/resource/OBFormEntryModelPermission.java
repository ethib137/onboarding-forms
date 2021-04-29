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

package com.liferay.onboarding.form.web.internal.security.permission.resource;

import com.liferay.form.onboarding.model.OBFormEntry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Evan Thibodeau
 */
@Component(immediate = true, service = OBFormEntryModelPermission.class)
public class OBFormEntryModelPermission {

	public static boolean contains(
			PermissionChecker permissionChecker, long guestbookId,
			String actionId)
		throws PortalException {

		return _obFormEntryModelResourcePermission.contains(
			permissionChecker, guestbookId, actionId);
	}

	public static boolean contains(
			PermissionChecker permissionChecker, OBFormEntry guestbook,
			String actionId)
		throws PortalException {

		return _obFormEntryModelResourcePermission.contains(
			permissionChecker, guestbook, actionId);
	}

	@Reference(
		target = "(model.class.name=com.liferay.form.onboarding.model.OBFormEntry)",
		unbind = "-"
	)
	protected void setEntryModelPermission(
		ModelResourcePermission<OBFormEntry> modelResourcePermission) {

		_obFormEntryModelResourcePermission = modelResourcePermission;
	}

	private static ModelResourcePermission<OBFormEntry>
		_obFormEntryModelResourcePermission;

}