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
 * When you set Adaptive Quantization (H265AdaptiveQuantization) to Auto (AUTO), or leave blank, MediaConvert
 * automatically applies quantization to improve the video quality of your output. Set Adaptive Quantization to Low
 * (LOW), Medium (MEDIUM), High (HIGH), Higher (HIGHER), or Max (MAX) to manually control the strength of the
 * quantization filter. When you do, you can specify a value for Spatial Adaptive Quantization
 * (H265SpatialAdaptiveQuantization), Temporal Adaptive Quantization (H265TemporalAdaptiveQuantization), and Flicker
 * Adaptive Quantization (H265FlickerAdaptiveQuantization), to further control the quantization filter. Set Adaptive
 * Quantization to Off (OFF) to apply no quantization to your output.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H265AdaptiveQuantization {

    OFF("OFF"),
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH"),
    HIGHER("HIGHER"),
    MAX("MAX"),
    AUTO("AUTO");

    private String value;

    private H265AdaptiveQuantization(String value) {
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
     * @return H265AdaptiveQuantization corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H265AdaptiveQuantization fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H265AdaptiveQuantization enumEntry : H265AdaptiveQuantization.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
