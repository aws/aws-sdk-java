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
 * To use the available style, color, and position information from your input captions: Set Style passthrough
 * (stylePassthrough) to Enabled (ENABLED). MediaConvert uses default settings when style and position information is
 * missing from your input captions. To recreate the input captions exactly: Set Style passthrough to Strict (STRICT).
 * MediaConvert automatically applies timing adjustments, including adjustments for frame rate conversion, ad avails,
 * and input clipping. Your input captions format must be WebVTT. To ignore the style and position information from your
 * input captions and use simplified output captions: Set Style passthrough to Disabled (DISABLED), or leave blank.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum WebvttStylePassthrough {

    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    STRICT("STRICT");

    private String value;

    private WebvttStylePassthrough(String value) {
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
     * @return WebvttStylePassthrough corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static WebvttStylePassthrough fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (WebvttStylePassthrough enumEntry : WebvttStylePassthrough.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
