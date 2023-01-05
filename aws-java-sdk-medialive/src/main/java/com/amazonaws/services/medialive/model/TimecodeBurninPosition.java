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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * Timecode Burnin Position
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum TimecodeBurninPosition {

    BOTTOM_CENTER("BOTTOM_CENTER"),
    BOTTOM_LEFT("BOTTOM_LEFT"),
    BOTTOM_RIGHT("BOTTOM_RIGHT"),
    MIDDLE_CENTER("MIDDLE_CENTER"),
    MIDDLE_LEFT("MIDDLE_LEFT"),
    MIDDLE_RIGHT("MIDDLE_RIGHT"),
    TOP_CENTER("TOP_CENTER"),
    TOP_LEFT("TOP_LEFT"),
    TOP_RIGHT("TOP_RIGHT");

    private String value;

    private TimecodeBurninPosition(String value) {
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
     * @return TimecodeBurninPosition corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static TimecodeBurninPosition fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (TimecodeBurninPosition enumEntry : TimecodeBurninPosition.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
