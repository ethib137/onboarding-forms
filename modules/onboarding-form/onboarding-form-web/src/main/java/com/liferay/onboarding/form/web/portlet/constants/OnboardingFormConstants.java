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

package com.liferay.onboarding.form.web.portlet.constants;

import com.liferay.dynamic.data.mapping.model.DDMFormFieldType;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evan Thibodeau
 */
public class OnboardingFormConstants {

	public static final String MAPPABLE_FIELD_BIRTHDAY =
		"MAPPABLE_FIELD_BIRTHDAY";

	public static final String MAPPABLE_FIELD_EMAIL_ADDRESS =
		"MAPPABLE_FIELD_EMAIL_ADDRESS";

	public static final String MAPPABLE_FIELD_FIRST_NAME =
		"MAPPABLE_FIELD_FIRST_NAME";

	public static final String MAPPABLE_FIELD_JOB_TITLE =
		"MAPPABLE_FIELD_JOB_TITLE";

	public static final String MAPPABLE_FIELD_LAST_NAME =
		"MAPPABLE_FIELD_LAST_NAME";

	public static final String MAPPABLE_FIELD_MALE = "MAPPABLE_FIELD_MALE";

	public static final String MAPPABLE_FIELD_MIDDLE_NAME =
		"MAPPABLE_FIELD_MIDDLE_NAME";

	public static final String MAPPABLE_FIELD_PASSWORD1 =
		"MAPPABLE_FIELD_PASSWORD1";

	public static final String MAPPABLE_FIELD_PASSWORD2 =
		"MAPPABLE_FIELD_PASSWORD2";

	public static final String MAPPABLE_FIELD_SCREEN_NAME =
		"MAPPABLE_FIELD_SCREEN_NAME";

	public static final String MAPPABLE_FIELD_UNMAPPED =
		"MAPPABLE_FIELD_UNMAPPED";

	public static final String[] NON_MAPPABLE_FIELD_TYPES = {
		DDMFormFieldType.FIELDSET
	};

	public static boolean isMappableFieldType(String fieldType) {
		List<String> nonMappableFieldTypes = Arrays.asList(
			NON_MAPPABLE_FIELD_TYPES);

		if (nonMappableFieldTypes.contains(fieldType)) {
			return false;
		}

		return true;
	}

}