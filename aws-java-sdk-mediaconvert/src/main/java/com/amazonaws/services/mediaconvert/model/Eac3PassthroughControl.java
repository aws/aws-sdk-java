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
 * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is
 * dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent
 * DD+ output as the system alternates between passthrough and encoding.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Eac3PassthroughControl {

    WHEN_POSSIBLE("WHEN_POSSIBLE"),
    NO_PASSTHROUGH("NO_PASSTHROUGH");

    private String value;

    private Eac3PassthroughControl(String value) {
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
     * @return Eac3PassthroughControl corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Eac3PassthroughControl fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Eac3PassthroughControl enumEntry : Eac3PassthroughControl.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
