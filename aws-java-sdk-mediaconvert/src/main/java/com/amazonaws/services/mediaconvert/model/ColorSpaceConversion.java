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
 * Specify the color space you want for this output. The service supports conversion between HDR formats, between SDR
 * formats, and from SDR to HDR. The service doesn't support conversion from HDR to SDR. SDR to HDR conversion doesn't
 * upgrade the dynamic range. The converted video has an HDR format, but visually appears the same as an unconverted
 * output.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ColorSpaceConversion {

    NONE("NONE"),
    FORCE_601("FORCE_601"),
    FORCE_709("FORCE_709"),
    FORCE_HDR10("FORCE_HDR10"),
    FORCE_HLG_2020("FORCE_HLG_2020");

    private String value;

    private ColorSpaceConversion(String value) {
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
     * @return ColorSpaceConversion corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ColorSpaceConversion fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ColorSpaceConversion enumEntry : ColorSpaceConversion.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
