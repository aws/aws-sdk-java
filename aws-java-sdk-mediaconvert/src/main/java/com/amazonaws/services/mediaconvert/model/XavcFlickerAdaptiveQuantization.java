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
 * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive
 * quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of
 * quantization for your video content. Include this setting in your JSON job specification only when you choose to
 * change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop.
 * I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many
 * times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates
 * these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related
 * setting: In addition to enabling this setting, you must also set Adaptive quantization (adaptiveQuantization) to a
 * value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the degree of smoothing that Flicker
 * adaptive quantization provides.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum XavcFlickerAdaptiveQuantization {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private XavcFlickerAdaptiveQuantization(String value) {
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
     * @return XavcFlickerAdaptiveQuantization corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static XavcFlickerAdaptiveQuantization fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (XavcFlickerAdaptiveQuantization enumEntry : XavcFlickerAdaptiveQuantization.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
