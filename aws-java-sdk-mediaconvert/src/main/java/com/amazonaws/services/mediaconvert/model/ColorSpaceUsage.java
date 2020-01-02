/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * There are two sources for color metadata, the input file and the job input settings Color space (ColorSpace) and HDR
 * master display information settings(Hdr10Metadata). The Color space usage setting determines which takes precedence.
 * Choose Force (FORCE) to use color metadata from the input job settings. If you don't specify values for those
 * settings, the service defaults to using metadata from your input. FALLBACK - Choose Fallback (FALLBACK) to use color
 * metadata from the source when it is present. If there's no color metadata in your input file, the service defaults to
 * using values you specify in the input settings.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ColorSpaceUsage {

    FORCE("FORCE"),
    FALLBACK("FALLBACK");

    private String value;

    private ColorSpaceUsage(String value) {
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
     * @return ColorSpaceUsage corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ColorSpaceUsage fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ColorSpaceUsage enumEntry : ColorSpaceUsage.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
