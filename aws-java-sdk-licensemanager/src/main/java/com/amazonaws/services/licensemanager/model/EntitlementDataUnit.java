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
package com.amazonaws.services.licensemanager.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EntitlementDataUnit {

    Count("Count"),
    None("None"),
    Seconds("Seconds"),
    Microseconds("Microseconds"),
    Milliseconds("Milliseconds"),
    Bytes("Bytes"),
    Kilobytes("Kilobytes"),
    Megabytes("Megabytes"),
    Gigabytes("Gigabytes"),
    Terabytes("Terabytes"),
    Bits("Bits"),
    Kilobits("Kilobits"),
    Megabits("Megabits"),
    Gigabits("Gigabits"),
    Terabits("Terabits"),
    Percent("Percent"),
    BytesSecond("Bytes/Second"),
    KilobytesSecond("Kilobytes/Second"),
    MegabytesSecond("Megabytes/Second"),
    GigabytesSecond("Gigabytes/Second"),
    TerabytesSecond("Terabytes/Second"),
    BitsSecond("Bits/Second"),
    KilobitsSecond("Kilobits/Second"),
    MegabitsSecond("Megabits/Second"),
    GigabitsSecond("Gigabits/Second"),
    TerabitsSecond("Terabits/Second"),
    CountSecond("Count/Second");

    private String value;

    private EntitlementDataUnit(String value) {
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
     * @return EntitlementDataUnit corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EntitlementDataUnit fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EntitlementDataUnit enumEntry : EntitlementDataUnit.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
