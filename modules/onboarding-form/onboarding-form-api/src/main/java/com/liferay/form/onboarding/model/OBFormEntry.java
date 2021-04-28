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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OBFormEntry service. Represents a row in the &quot;OBForm_OBFormEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Evan Thibodeau
 * @see OBFormEntryModel
 * @generated
 */
@ImplementationClassName(
	"com.liferay.form.onboarding.model.impl.OBFormEntryImpl"
)
@ProviderType
public interface OBFormEntry extends OBFormEntryModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.liferay.form.onboarding.model.impl.OBFormEntryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OBFormEntry, Long> OB_FORM_ENTRY_ID_ACCESSOR =
		new Accessor<OBFormEntry, Long>() {

			@Override
			public Long get(OBFormEntry obFormEntry) {
				return obFormEntry.getObFormEntryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OBFormEntry> getTypeClass() {
				return OBFormEntry.class;
			}

		};

	public long[] getOrganizationIdsAsLongs();

	public long[] getRoleIdsAsLongs();

	public long[] getSiteIdsAsLongs();

	public long[] getUserGroupIdsAsLongs();

	public void setOrganizationIds(long[] organizationIds);

	public void setRoldIds(long[] roleIds);

	public void setSiteIds(long[] siteIds);

	public void setUserGroupIds(long[] userGroupIds);

}