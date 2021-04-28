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

package com.liferay.onboarding.form.web.util;

import com.liferay.form.onboarding.model.OBFormFieldMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Evan Thibodeau
 */
public class OnboardingFormUtil {

	public static Map<String, String> getOBFormFieldMappingsMap(
		List<OBFormFieldMapping> obFormFieldMappings) {

		Map<String, String> obFormFieldMappingsMap = new HashMap<>();

		for (OBFormFieldMapping obFormFieldMapping : obFormFieldMappings) {
			obFormFieldMappingsMap.put(
				obFormFieldMapping.getFormFieldReference(),
				obFormFieldMapping.getUserPropertyName());
		}

		return obFormFieldMappingsMap;
	}

}