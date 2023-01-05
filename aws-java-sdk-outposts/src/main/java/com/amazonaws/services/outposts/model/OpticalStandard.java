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
package com.amazonaws.services.outposts.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum OpticalStandard {

    OPTIC_10GBASE_SR("OPTIC_10GBASE_SR"),
    OPTIC_10GBASE_IR("OPTIC_10GBASE_IR"),
    OPTIC_10GBASE_LR("OPTIC_10GBASE_LR"),
    OPTIC_40GBASE_SR("OPTIC_40GBASE_SR"),
    OPTIC_40GBASE_ESR("OPTIC_40GBASE_ESR"),
    OPTIC_40GBASE_IR4_LR4L("OPTIC_40GBASE_IR4_LR4L"),
    OPTIC_40GBASE_LR4("OPTIC_40GBASE_LR4"),
    OPTIC_100GBASE_SR4("OPTIC_100GBASE_SR4"),
    OPTIC_100GBASE_CWDM4("OPTIC_100GBASE_CWDM4"),
    OPTIC_100GBASE_LR4("OPTIC_100GBASE_LR4"),
    OPTIC_100G_PSM4_MSA("OPTIC_100G_PSM4_MSA"),
    OPTIC_1000BASE_LX("OPTIC_1000BASE_LX"),
    OPTIC_1000BASE_SX("OPTIC_1000BASE_SX");

    private String value;

    private OpticalStandard(String value) {
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
     * @return OpticalStandard corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static OpticalStandard fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (OpticalStandard enumEntry : OpticalStandard.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
