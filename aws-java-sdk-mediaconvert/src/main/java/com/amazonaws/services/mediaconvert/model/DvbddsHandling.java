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
 * Specify how MediaConvert handles the display definition segment (DDS). Keep the default, None (NONE), to exclude the
 * DDS from this set of captions. Choose No display window (NO_DISPLAY_WINDOW) to have MediaConvert include the DDS but
 * not include display window data. In this case, MediaConvert writes that information to the page composition segment
 * (PCS) instead. Choose Specify (SPECIFIED) to have MediaConvert set up the display window based on the values that you
 * specify in related job settings. For video resolutions that are 576 pixels or smaller in height, MediaConvert doesn't
 * include the DDS, regardless of the value you choose for DDS handling (ddsHandling). In this case, it doesn't write
 * the display window data to the PCS either. Related settings: Use the settings DDS x-coordinate (ddsXCoordinate) and
 * DDS y-coordinate (ddsYCoordinate) to specify the offset between the top left corner of the display window and the top
 * left corner of the video frame. All burn-in and DVB-Sub font settings must match.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbddsHandling {

    NONE("NONE"),
    SPECIFIED("SPECIFIED"),
    NO_DISPLAY_WINDOW("NO_DISPLAY_WINDOW");

    private String value;

    private DvbddsHandling(String value) {
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
     * @return DvbddsHandling corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbddsHandling fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbddsHandling enumEntry : DvbddsHandling.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
