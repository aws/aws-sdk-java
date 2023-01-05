/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content mapping is
 * not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping might occur on HDR
 * devices without Dolby Vision. When you set Content mapping to HDR10 1000, the transcoder creates a 1,000 nits peak
 * HDR10-compatible signal by applying static content mapping to the source. This mode is speed-optimized for PQ10
 * sources with metadata that is created from analysis. For graded Dolby Vision content, be aware that creative intent
 * might not be guaranteed with extreme 1,000 nits trims.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DolbyVisionMapping {

    HDR10_NOMAP("HDR10_NOMAP"),
    HDR10_1000("HDR10_1000");

    private String value;

    private DolbyVisionMapping(String value) {
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
     * @return DolbyVisionMapping corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DolbyVisionMapping fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DolbyVisionMapping enumEntry : DolbyVisionMapping.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
