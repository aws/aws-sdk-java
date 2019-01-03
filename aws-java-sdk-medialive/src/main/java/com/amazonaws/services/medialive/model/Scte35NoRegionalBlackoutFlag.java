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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * Corresponds to the no_regional_blackout_flag parameter. A value of REGIONAL_BLACKOUT corresponds to 0 (false) in the
 * SCTE-35 specification. If you include one of the "restriction" flags then you must include all four of them.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Scte35NoRegionalBlackoutFlag {

    REGIONAL_BLACKOUT("REGIONAL_BLACKOUT"),
    NO_REGIONAL_BLACKOUT("NO_REGIONAL_BLACKOUT");

    private String value;

    private Scte35NoRegionalBlackoutFlag(String value) {
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
     * @return Scte35NoRegionalBlackoutFlag corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Scte35NoRegionalBlackoutFlag fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Scte35NoRegionalBlackoutFlag enumEntry : Scte35NoRegionalBlackoutFlag.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
