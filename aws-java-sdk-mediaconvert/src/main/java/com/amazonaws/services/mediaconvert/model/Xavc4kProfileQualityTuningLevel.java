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
 * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output
 * video quality. The default behavior is faster, lower quality, single-pass encoding.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Xavc4kProfileQualityTuningLevel {

    SINGLE_PASS("SINGLE_PASS"),
    SINGLE_PASS_HQ("SINGLE_PASS_HQ"),
    MULTI_PASS_HQ("MULTI_PASS_HQ");

    private String value;

    private Xavc4kProfileQualityTuningLevel(String value) {
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
     * @return Xavc4kProfileQualityTuningLevel corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Xavc4kProfileQualityTuningLevel fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Xavc4kProfileQualityTuningLevel enumEntry : Xavc4kProfileQualityTuningLevel.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
