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
 * To place the MOOV atom at the beginning of your output, which is useful for progressive downloading: Leave blank or
 * choose Progressive download. To place the MOOV at the end of your output: Choose Normal.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum F4vMoovPlacement {

    PROGRESSIVE_DOWNLOAD("PROGRESSIVE_DOWNLOAD"),
    NORMAL("NORMAL");

    private String value;

    private F4vMoovPlacement(String value) {
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
     * @return F4vMoovPlacement corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static F4vMoovPlacement fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (F4vMoovPlacement enumEntry : F4vMoovPlacement.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
