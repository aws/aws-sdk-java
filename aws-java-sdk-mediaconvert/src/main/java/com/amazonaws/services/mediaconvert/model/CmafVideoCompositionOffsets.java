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
 * Specify the video sample composition time offset mode in the output fMP4 TRUN box. For wider player compatibility,
 * set Video composition offsets to Unsigned or leave blank. The earliest presentation time may be greater than zero,
 * and sample composition time offsets will increment using unsigned integers. For strict fMP4 video and audio timing,
 * set Video composition offsets to Signed. The earliest presentation time will be equal to zero, and sample composition
 * time offsets will increment using signed integers.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CmafVideoCompositionOffsets {

    SIGNED("SIGNED"),
    UNSIGNED("UNSIGNED");

    private String value;

    private CmafVideoCompositionOffsets(String value) {
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
     * @return CmafVideoCompositionOffsets corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CmafVideoCompositionOffsets fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CmafVideoCompositionOffsets enumEntry : CmafVideoCompositionOffsets.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
