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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so
 * "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum H265CodecProfile {

    MAIN_MAIN("MAIN_MAIN"),
    MAIN_HIGH("MAIN_HIGH"),
    MAIN10_MAIN("MAIN10_MAIN"),
    MAIN10_HIGH("MAIN10_HIGH"),
    MAIN_422_8BIT_MAIN("MAIN_422_8BIT_MAIN"),
    MAIN_422_8BIT_HIGH("MAIN_422_8BIT_HIGH"),
    MAIN_422_10BIT_MAIN("MAIN_422_10BIT_MAIN"),
    MAIN_422_10BIT_HIGH("MAIN_422_10BIT_HIGH");

    private String value;

    private H265CodecProfile(String value) {
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
     * @return H265CodecProfile corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static H265CodecProfile fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (H265CodecProfile enumEntry : H265CodecProfile.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
