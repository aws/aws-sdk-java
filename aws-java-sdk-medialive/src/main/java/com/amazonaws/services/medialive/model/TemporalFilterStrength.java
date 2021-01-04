/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Temporal Filter Strength
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum TemporalFilterStrength {

    AUTO("AUTO"),
    STRENGTH_1("STRENGTH_1"),
    STRENGTH_2("STRENGTH_2"),
    STRENGTH_3("STRENGTH_3"),
    STRENGTH_4("STRENGTH_4"),
    STRENGTH_5("STRENGTH_5"),
    STRENGTH_6("STRENGTH_6"),
    STRENGTH_7("STRENGTH_7"),
    STRENGTH_8("STRENGTH_8"),
    STRENGTH_9("STRENGTH_9"),
    STRENGTH_10("STRENGTH_10"),
    STRENGTH_11("STRENGTH_11"),
    STRENGTH_12("STRENGTH_12"),
    STRENGTH_13("STRENGTH_13"),
    STRENGTH_14("STRENGTH_14"),
    STRENGTH_15("STRENGTH_15"),
    STRENGTH_16("STRENGTH_16");

    private String value;

    private TemporalFilterStrength(String value) {
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
     * @return TemporalFilterStrength corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TemporalFilterStrength fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TemporalFilterStrength enumEntry : TemporalFilterStrength.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
