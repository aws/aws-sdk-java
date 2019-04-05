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
package com.amazonaws.services.devicefarm.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SampleType {

    CPU("CPU"),
    MEMORY("MEMORY"),
    THREADS("THREADS"),
    RX_RATE("RX_RATE"),
    TX_RATE("TX_RATE"),
    RX("RX"),
    TX("TX"),
    NATIVE_FRAMES("NATIVE_FRAMES"),
    NATIVE_FPS("NATIVE_FPS"),
    NATIVE_MIN_DRAWTIME("NATIVE_MIN_DRAWTIME"),
    NATIVE_AVG_DRAWTIME("NATIVE_AVG_DRAWTIME"),
    NATIVE_MAX_DRAWTIME("NATIVE_MAX_DRAWTIME"),
    OPENGL_FRAMES("OPENGL_FRAMES"),
    OPENGL_FPS("OPENGL_FPS"),
    OPENGL_MIN_DRAWTIME("OPENGL_MIN_DRAWTIME"),
    OPENGL_AVG_DRAWTIME("OPENGL_AVG_DRAWTIME"),
    OPENGL_MAX_DRAWTIME("OPENGL_MAX_DRAWTIME");

    private String value;

    private SampleType(String value) {
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
     * @return SampleType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SampleType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SampleType enumEntry : SampleType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
