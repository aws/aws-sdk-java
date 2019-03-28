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
 * Fixed Afd
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FixedAfd {

    AFD_0000("AFD_0000"),
    AFD_0010("AFD_0010"),
    AFD_0011("AFD_0011"),
    AFD_0100("AFD_0100"),
    AFD_1000("AFD_1000"),
    AFD_1001("AFD_1001"),
    AFD_1010("AFD_1010"),
    AFD_1011("AFD_1011"),
    AFD_1101("AFD_1101"),
    AFD_1110("AFD_1110"),
    AFD_1111("AFD_1111");

    private String value;

    private FixedAfd(String value) {
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
     * @return FixedAfd corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FixedAfd fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FixedAfd enumEntry : FixedAfd.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
