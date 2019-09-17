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
 * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify,
 * choose Auto (AUTO).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264CodecLevel {

    AUTO("AUTO"),
    LEVEL_1("LEVEL_1"),
    LEVEL_1_1("LEVEL_1_1"),
    LEVEL_1_2("LEVEL_1_2"),
    LEVEL_1_3("LEVEL_1_3"),
    LEVEL_2("LEVEL_2"),
    LEVEL_2_1("LEVEL_2_1"),
    LEVEL_2_2("LEVEL_2_2"),
    LEVEL_3("LEVEL_3"),
    LEVEL_3_1("LEVEL_3_1"),
    LEVEL_3_2("LEVEL_3_2"),
    LEVEL_4("LEVEL_4"),
    LEVEL_4_1("LEVEL_4_1"),
    LEVEL_4_2("LEVEL_4_2"),
    LEVEL_5("LEVEL_5"),
    LEVEL_5_1("LEVEL_5_1"),
    LEVEL_5_2("LEVEL_5_2");

    private String value;

    private H264CodecLevel(String value) {
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
     * @return H264CodecLevel corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264CodecLevel fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264CodecLevel enumEntry : H264CodecLevel.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
