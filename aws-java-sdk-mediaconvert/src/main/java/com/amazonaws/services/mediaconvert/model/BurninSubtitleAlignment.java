/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * If no explicit x_position or y_position is provided, setting alignment to centered will place the captions at the
 * bottom center of the output. Similarly, setting a left alignment will align captions to the bottom left of the
 * output. If x and y positions are given in conjunction with the alignment parameter, the font will be justified
 * (either left or centered) relative to those coordinates. This option is not valid for source captions that are STL,
 * 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and
 * DVB-Sub font settings must match.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BurninSubtitleAlignment {

    CENTERED("CENTERED"),
    LEFT("LEFT");

    private String value;

    private BurninSubtitleAlignment(String value) {
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
     * @return BurninSubtitleAlignment corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BurninSubtitleAlignment fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BurninSubtitleAlignment enumEntry : BurninSubtitleAlignment.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
