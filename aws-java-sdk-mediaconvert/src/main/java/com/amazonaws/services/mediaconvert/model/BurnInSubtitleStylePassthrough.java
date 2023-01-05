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
 * Set Style passthrough (StylePassthrough) to ENABLED to use the available style, color, and position information from
 * your input captions. MediaConvert uses default settings for any missing style and position information in your input
 * captions. Set Style passthrough to DISABLED, or leave blank, to ignore the style and position information from your
 * input captions and use default settings: white text with black outlining, bottom-center positioning, and automatic
 * sizing. Whether you set Style passthrough to enabled or not, you can also choose to manually override any of the
 * individual style and position settings.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BurnInSubtitleStylePassthrough {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private BurnInSubtitleStylePassthrough(String value) {
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
     * @return BurnInSubtitleStylePassthrough corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BurnInSubtitleStylePassthrough fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BurnInSubtitleStylePassthrough enumEntry : BurnInSubtitleStylePassthrough.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
