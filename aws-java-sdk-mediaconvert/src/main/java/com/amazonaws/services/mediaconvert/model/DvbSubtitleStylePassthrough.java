/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * To use the available style, color, and position information from your input captions: Set Style passthrough to
 * Enabled. Note that MediaConvert uses default settings for any missing style or position information in your input
 * captions To ignore the style and position information from your input captions and use default settings: Leave blank
 * or keep the default value, Disabled. Default settings include white text with black outlining, bottom-center
 * positioning, and automatic sizing. Whether you set Style passthrough to enabled or not, you can also choose to
 * manually override any of the individual style and position settings. You can also override any fonts by manually
 * specifying custom font files.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbSubtitleStylePassthrough {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private DvbSubtitleStylePassthrough(String value) {
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
     * @return DvbSubtitleStylePassthrough corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbSubtitleStylePassthrough fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbSubtitleStylePassthrough enumEntry : DvbSubtitleStylePassthrough.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
