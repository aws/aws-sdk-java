/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Using the API, set FramerateControl to INITIALIZE_FROM_SOURCE if you want the service to use the framerate from the
 * input. Using the console, do this by choosing INITIALIZE_FROM_SOURCE for Framerate.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Mpeg2FramerateControl {

    INITIALIZE_FROM_SOURCE("INITIALIZE_FROM_SOURCE"),
    SPECIFIED("SPECIFIED");

    private String value;

    private Mpeg2FramerateControl(String value) {
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
     * @return Mpeg2FramerateControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Mpeg2FramerateControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Mpeg2FramerateControl enumEntry : Mpeg2FramerateControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
