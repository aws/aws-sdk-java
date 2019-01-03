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
 * Applies only to 29.97 fps outputs. When this feature is enabled, the service will use drop-frame timecode on outputs.
 * If it is not possible to use drop-frame timecode, the system will fall back to non-drop-frame. This setting is
 * enabled by default when Timecode insertion (TimecodeInsertion) is enabled.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DropFrameTimecode {

    DISABLED("DISABLED"),
    ENABLED("ENABLED");

    private String value;

    private DropFrameTimecode(String value) {
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
     * @return DropFrameTimecode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DropFrameTimecode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DropFrameTimecode enumEntry : DropFrameTimecode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
