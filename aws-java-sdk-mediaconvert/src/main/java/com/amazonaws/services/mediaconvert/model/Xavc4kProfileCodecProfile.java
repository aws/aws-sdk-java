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
 * Specify the codec profile for this output. Choose High, 8-bit, 4:2:0 (HIGH) or High, 10-bit, 4:2:2 (HIGH_422). These
 * profiles are specified in ITU-T H.264.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Xavc4kProfileCodecProfile {

    HIGH("HIGH"),
    HIGH_422("HIGH_422");

    private String value;

    private Xavc4kProfileCodecProfile(String value) {
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
     * @return Xavc4kProfileCodecProfile corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Xavc4kProfileCodecProfile fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Xavc4kProfileCodecProfile enumEntry : Xavc4kProfileCodecProfile.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
