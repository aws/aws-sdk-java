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
package com.amazonaws.services.mediapackagevod.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PresetSpeke20Video {

    PRESETVIDEO1("PRESET-VIDEO-1"),
    PRESETVIDEO2("PRESET-VIDEO-2"),
    PRESETVIDEO3("PRESET-VIDEO-3"),
    PRESETVIDEO4("PRESET-VIDEO-4"),
    PRESETVIDEO5("PRESET-VIDEO-5"),
    PRESETVIDEO6("PRESET-VIDEO-6"),
    PRESETVIDEO7("PRESET-VIDEO-7"),
    PRESETVIDEO8("PRESET-VIDEO-8"),
    SHARED("SHARED"),
    UNENCRYPTED("UNENCRYPTED");

    private String value;

    private PresetSpeke20Video(String value) {
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
     * @return PresetSpeke20Video corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PresetSpeke20Video fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PresetSpeke20Video enumEntry : PresetSpeke20Video.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
