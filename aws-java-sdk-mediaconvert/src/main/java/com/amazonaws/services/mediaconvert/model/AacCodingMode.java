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
 * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile.
 * "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono
 * AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AacCodingMode {

    AD_RECEIVER_MIX("AD_RECEIVER_MIX"),
    CODING_MODE_1_0("CODING_MODE_1_0"),
    CODING_MODE_1_1("CODING_MODE_1_1"),
    CODING_MODE_2_0("CODING_MODE_2_0"),
    CODING_MODE_5_1("CODING_MODE_5_1");

    private String value;

    private AacCodingMode(String value) {
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
     * @return AacCodingMode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AacCodingMode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AacCodingMode enumEntry : AacCodingMode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
