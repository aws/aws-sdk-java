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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * When you use the setting Time delta (TimeDelta) to adjust the sync between your sidecar captions and your video, use
 * this setting to specify the units for the delta that you specify. When you don't specify a value for Time delta units
 * (TimeDeltaUnits), MediaConvert uses seconds by default.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FileSourceTimeDeltaUnits {

    SECONDS("SECONDS"),
    MILLISECONDS("MILLISECONDS");

    private String value;

    private FileSourceTimeDeltaUnits(String value) {
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
     * @return FileSourceTimeDeltaUnits corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FileSourceTimeDeltaUnits fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FileSourceTimeDeltaUnits enumEntry : FileSourceTimeDeltaUnits.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
