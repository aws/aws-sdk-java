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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * Dvb Dash Accessibility
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbDashAccessibility {

    DVBDASH_1_VISUALLY_IMPAIRED("DVBDASH_1_VISUALLY_IMPAIRED"),
    DVBDASH_2_HARD_OF_HEARING("DVBDASH_2_HARD_OF_HEARING"),
    DVBDASH_3_SUPPLEMENTAL_COMMENTARY("DVBDASH_3_SUPPLEMENTAL_COMMENTARY"),
    DVBDASH_4_DIRECTORS_COMMENTARY("DVBDASH_4_DIRECTORS_COMMENTARY"),
    DVBDASH_5_EDUCATIONAL_NOTES("DVBDASH_5_EDUCATIONAL_NOTES"),
    DVBDASH_6_MAIN_PROGRAM("DVBDASH_6_MAIN_PROGRAM"),
    DVBDASH_7_CLEAN_FEED("DVBDASH_7_CLEAN_FEED");

    private String value;

    private DvbDashAccessibility(String value) {
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
     * @return DvbDashAccessibility corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbDashAccessibility fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbDashAccessibility enumEntry : DvbDashAccessibility.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
