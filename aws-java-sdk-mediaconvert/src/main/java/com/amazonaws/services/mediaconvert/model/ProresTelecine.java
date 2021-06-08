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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is
 * interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default
 * value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field
 * polarity to create a smoother picture.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ProresTelecine {

    NONE("NONE"),
    HARD("HARD");

    private String value;

    private ProresTelecine(String value) {
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
     * @return ProresTelecine corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ProresTelecine fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ProresTelecine enumEntry : ProresTelecine.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
