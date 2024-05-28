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
 * Optionally include or suppress markers at the end of your output that signal the end of the video stream. To include
 * end of stream markers: Leave blank or keep the default value, Include. To not include end of stream markers: Choose
 * Suppress. This is useful when your output will be inserted into another stream.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H264EndOfStreamMarkers {

    INCLUDE("INCLUDE"),
    SUPPRESS("SUPPRESS");

    private String value;

    private H264EndOfStreamMarkers(String value) {
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
     * @return H264EndOfStreamMarkers corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H264EndOfStreamMarkers fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H264EndOfStreamMarkers enumEntry : H264EndOfStreamMarkers.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
