/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose
 * Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the
 * 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AncillaryConvert608To708 {

    UPCONVERT("UPCONVERT"),
    DISABLED("DISABLED");

    private String value;

    private AncillaryConvert608To708(String value) {
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
     * @return AncillaryConvert608To708 corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AncillaryConvert608To708 fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AncillaryConvert608To708 enumEntry : AncillaryConvert608To708.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
