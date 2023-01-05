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
 * The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert generates
 * thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM, MediaConvert
 * generates thumbnails according to the interval you specify in thumbnailInterval.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HlsIntervalCadence {

    FOLLOW_IFRAME("FOLLOW_IFRAME"),
    FOLLOW_CUSTOM("FOLLOW_CUSTOM");

    private String value;

    private HlsIntervalCadence(String value) {
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
     * @return HlsIntervalCadence corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HlsIntervalCadence fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HlsIntervalCadence enumEntry : HlsIntervalCadence.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
