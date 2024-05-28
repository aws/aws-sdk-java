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
 * Choose the presentation style of your input SCC captions. To use the same presentation style as your input: Keep the
 * default value, Disabled. To convert paint-on captions to pop-on: Choose Enabled. We also recommend that you choose
 * Enabled if you notice additional repeated lines in your output captions.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CaptionSourceConvertPaintOnToPopOn {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private CaptionSourceConvertPaintOnToPopOn(String value) {
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
     * @return CaptionSourceConvertPaintOnToPopOn corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CaptionSourceConvertPaintOnToPopOn fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CaptionSourceConvertPaintOnToPopOn enumEntry : CaptionSourceConvertPaintOnToPopOn.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
