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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * H265 Level
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H265Level {

    H265_LEVEL_1("H265_LEVEL_1"),
    H265_LEVEL_2("H265_LEVEL_2"),
    H265_LEVEL_2_1("H265_LEVEL_2_1"),
    H265_LEVEL_3("H265_LEVEL_3"),
    H265_LEVEL_3_1("H265_LEVEL_3_1"),
    H265_LEVEL_4("H265_LEVEL_4"),
    H265_LEVEL_4_1("H265_LEVEL_4_1"),
    H265_LEVEL_5("H265_LEVEL_5"),
    H265_LEVEL_5_1("H265_LEVEL_5_1"),
    H265_LEVEL_5_2("H265_LEVEL_5_2"),
    H265_LEVEL_6("H265_LEVEL_6"),
    H265_LEVEL_6_1("H265_LEVEL_6_1"),
    H265_LEVEL_6_2("H265_LEVEL_6_2"),
    H265_LEVEL_AUTO("H265_LEVEL_AUTO");

    private String value;

    private H265Level(String value) {
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
     * @return H265Level corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H265Level fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H265Level enumEntry : H265Level.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
