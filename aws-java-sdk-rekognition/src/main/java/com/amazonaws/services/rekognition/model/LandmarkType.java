/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

/**
 * 
 */
public enum LandmarkType {

    EYE_LEFT("EYE_LEFT"),
    EYE_RIGHT("EYE_RIGHT"),
    NOSE("NOSE"),
    MOUTH_LEFT("MOUTH_LEFT"),
    MOUTH_RIGHT("MOUTH_RIGHT"),
    LEFT_EYEBROW_LEFT("LEFT_EYEBROW_LEFT"),
    LEFT_EYEBROW_RIGHT("LEFT_EYEBROW_RIGHT"),
    LEFT_EYEBROW_UP("LEFT_EYEBROW_UP"),
    RIGHT_EYEBROW_LEFT("RIGHT_EYEBROW_LEFT"),
    RIGHT_EYEBROW_RIGHT("RIGHT_EYEBROW_RIGHT"),
    RIGHT_EYEBROW_UP("RIGHT_EYEBROW_UP"),
    LEFT_EYE_LEFT("LEFT_EYE_LEFT"),
    LEFT_EYE_RIGHT("LEFT_EYE_RIGHT"),
    LEFT_EYE_UP("LEFT_EYE_UP"),
    LEFT_EYE_DOWN("LEFT_EYE_DOWN"),
    RIGHT_EYE_LEFT("RIGHT_EYE_LEFT"),
    RIGHT_EYE_RIGHT("RIGHT_EYE_RIGHT"),
    RIGHT_EYE_UP("RIGHT_EYE_UP"),
    RIGHT_EYE_DOWN("RIGHT_EYE_DOWN"),
    NOSE_LEFT("NOSE_LEFT"),
    NOSE_RIGHT("NOSE_RIGHT"),
    MOUTH_UP("MOUTH_UP"),
    MOUTH_DOWN("MOUTH_DOWN"),
    LEFT_PUPIL("LEFT_PUPIL"),
    RIGHT_PUPIL("RIGHT_PUPIL");

    private String value;

    private LandmarkType(String value) {
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
     * @return LandmarkType corresponding to the value
     */
    public static LandmarkType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (LandmarkType enumEntry : LandmarkType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
