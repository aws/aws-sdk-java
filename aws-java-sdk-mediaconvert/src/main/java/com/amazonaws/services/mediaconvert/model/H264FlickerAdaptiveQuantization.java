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
 * Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you
 * keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job
 * specification, MediaConvert automatically applies the best types of quantization for your video content. When you set
 * H264AdaptiveQuantization to a value other than AUTO, the default value for H264FlickerAdaptiveQuantization is
 * Disabled (DISABLED). Change this value to Enabled (ENABLED) to reduce I-frame pop. I-frame pop appears as a visual
 * flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and
 * then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more
 * often to smooth out the flicker. To manually enable or disable H264FlickerAdaptiveQuantization, you must set Adaptive
 * quantization (H264AdaptiveQuantization) to a value other than AUTO.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264FlickerAdaptiveQuantization {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private H264FlickerAdaptiveQuantization(String value) {
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
     * @return H264FlickerAdaptiveQuantization corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264FlickerAdaptiveQuantization fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264FlickerAdaptiveQuantization enumEntry : H264FlickerAdaptiveQuantization.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
