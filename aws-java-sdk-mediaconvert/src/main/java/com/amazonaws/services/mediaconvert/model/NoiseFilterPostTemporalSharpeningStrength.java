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
 * Use Post temporal sharpening strength (postTemporalSharpeningStrength) to define the amount of sharpening the
 * transcoder applies to your output. Set Post temporal sharpening strength to Low (LOW), Medium (MEDIUM), or High
 * (HIGH) to indicate the amount of sharpening.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NoiseFilterPostTemporalSharpeningStrength {

    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH");

    private String value;

    private NoiseFilterPostTemporalSharpeningStrength(String value) {
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
     * @return NoiseFilterPostTemporalSharpeningStrength corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NoiseFilterPostTemporalSharpeningStrength fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NoiseFilterPostTemporalSharpeningStrength enumEntry : NoiseFilterPostTemporalSharpeningStrength.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
