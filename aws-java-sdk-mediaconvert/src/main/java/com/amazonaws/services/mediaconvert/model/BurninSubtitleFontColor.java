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
 * Specifies the color of the burned-in captions. This option is not valid for source captions that are STL,
 * 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and
 * DVB-Sub font settings must match.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BurninSubtitleFontColor {

    WHITE("WHITE"),
    BLACK("BLACK"),
    YELLOW("YELLOW"),
    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE");

    private String value;

    private BurninSubtitleFontColor(String value) {
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
     * @return BurninSubtitleFontColor corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BurninSubtitleFontColor fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BurninSubtitleFontColor enumEntry : BurninSubtitleFontColor.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
