/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * When you want to add Dolby dynamic range compression (DRC) signaling to your output stream, we recommend that you use
 * the mode-specific settings instead of Dynamic range compression profile (DynamicRangeCompressionProfile). The
 * mode-specific settings are Dynamic range compression profile, line mode (dynamicRangeCompressionLine) and Dynamic
 * range compression profile, RF mode (dynamicRangeCompressionRf). Note that when you specify values for all three
 * settings, MediaConvert ignores the value of this setting in favor of the mode-specific settings. If you do use this
 * setting instead of the mode-specific settings, choose None (NONE) to leave out DRC signaling. Keep the default Film
 * standard (FILM_STANDARD) to set the profile to Dolby's film standard profile for all operating modes.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Ac3DynamicRangeCompressionProfile {

    FILM_STANDARD("FILM_STANDARD"),
    NONE("NONE");

    private String value;

    private Ac3DynamicRangeCompressionProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return Ac3DynamicRangeCompressionProfile corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Ac3DynamicRangeCompressionProfile fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Ac3DynamicRangeCompressionProfile enumEntry : Ac3DynamicRangeCompressionProfile.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
