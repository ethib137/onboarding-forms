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

import com.liferay.portal.kernel.util.StringUtil;

/**
 * The extended model implementation for the OBFormEntry service. Represents a row in the &quot;OBForm_OBFormEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.form.onboarding.model.OBFormEntry</code> interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class OBFormEntryImpl extends OBFormEntryBaseImpl {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a ob form entry model instance should use the {@link com.liferay.form.onboarding.model.OBFormEntry} interface instead.
	 */
	public OBFormEntryImpl() {
	}

	public long[] getOrganizationIdsAsLongs() {
		return StringUtil.split(getOrganizationIds(), 0L);
	}

	public long[] getRoleIdsAsLongs() {
		return StringUtil.split(getRoleIds(), 0L);
	}

	public long[] getSiteIdsAsLongs() {
		return StringUtil.split(getSiteIds(), 0L);
	}

	public long[] getUserGroupIdsAsLongs() {
		return StringUtil.split(getUserGroupIds(), 0L);
	}

	public void setOrganizationIds(long[] organizationIds) {
		setOrganizationIds(StringUtil.merge(organizationIds));
	}

	public void setRoldIds(long[] roleIds) {
		setRoleIds(StringUtil.merge(roleIds));
	}

	public void setSiteIds(long[] siteIds) {
		setSiteIds(StringUtil.merge(siteIds));
	}

	public void setUserGroupIds(long[] userGroupIds) {
		setUserGroupIds(StringUtil.merge(userGroupIds));
	}

}