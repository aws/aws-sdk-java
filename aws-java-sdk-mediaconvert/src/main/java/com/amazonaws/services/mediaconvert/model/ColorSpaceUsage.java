/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * There are two sources for color metadata, the input file and the job configuration (in the Color space and HDR master
 * display informaiton settings). The Color space usage setting controls which takes precedence. FORCE: The system will
 * use color metadata supplied by user, if any. If the user does not supply color metadata, the system will use data
 * from the source. FALLBACK: The system will use color metadata from the source. If source has no color metadata, the
 * system will use user-supplied color metadata values if available.
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
