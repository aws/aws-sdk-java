/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.devicefarm.model;

/**
 * 
 */
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
     */
    public static SampleType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("CPU".equals(value)) {
            return CPU;
        } else if ("MEMORY".equals(value)) {
            return MEMORY;
        } else if ("THREADS".equals(value)) {
            return THREADS;
        } else if ("RX_RATE".equals(value)) {
            return RX_RATE;
        } else if ("TX_RATE".equals(value)) {
            return TX_RATE;
        } else if ("RX".equals(value)) {
            return RX;
        } else if ("TX".equals(value)) {
            return TX;
        } else if ("NATIVE_FRAMES".equals(value)) {
            return NATIVE_FRAMES;
        } else if ("NATIVE_FPS".equals(value)) {
            return NATIVE_FPS;
        } else if ("NATIVE_MIN_DRAWTIME".equals(value)) {
            return NATIVE_MIN_DRAWTIME;
        } else if ("NATIVE_AVG_DRAWTIME".equals(value)) {
            return NATIVE_AVG_DRAWTIME;
        } else if ("NATIVE_MAX_DRAWTIME".equals(value)) {
            return NATIVE_MAX_DRAWTIME;
        } else if ("OPENGL_FRAMES".equals(value)) {
            return OPENGL_FRAMES;
        } else if ("OPENGL_FPS".equals(value)) {
            return OPENGL_FPS;
        } else if ("OPENGL_MIN_DRAWTIME".equals(value)) {
            return OPENGL_MIN_DRAWTIME;
        } else if ("OPENGL_AVG_DRAWTIME".equals(value)) {
            return OPENGL_AVG_DRAWTIME;
        } else if ("OPENGL_MAX_DRAWTIME".equals(value)) {
            return OPENGL_MAX_DRAWTIME;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}