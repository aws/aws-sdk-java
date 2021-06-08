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
 * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of
 * quantization for your video content. When you want to apply your quantization settings manually, you must set
 * H264AdaptiveQuantization to a value other than Auto (AUTO). Use this setting to specify the strength of any adaptive
 * quantization filters that you enable. If you don't want MediaConvert to do any adaptive quantization in this
 * transcode, set Adaptive quantization (H264AdaptiveQuantization) to Off (OFF). Related settings: The value that you
 * choose here applies to the following settings: H264FlickerAdaptiveQuantization, H264SpatialAdaptiveQuantization, and
 * H264TemporalAdaptiveQuantization.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264AdaptiveQuantization {

    OFF("OFF"),
    AUTO("AUTO"),
    LOW("LOW"),
    MEDIUM("MEDIUM"),
    HIGH("HIGH"),
    HIGHER("HIGHER"),
    MAX("MAX");

    private String value;

    private H264AdaptiveQuantization(String value) {
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
     * @return H264AdaptiveQuantization corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264AdaptiveQuantization fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264AdaptiveQuantization enumEntry : H264AdaptiveQuantization.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
