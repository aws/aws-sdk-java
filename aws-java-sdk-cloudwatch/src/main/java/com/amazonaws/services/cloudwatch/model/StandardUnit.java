/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudwatch.model;

/**
 * 
 */
public enum StandardUnit {

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
    Count("Count"),
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
    CountSecond("Count/Second"),
    None("None");

    private String value;

    private StandardUnit(String value) {
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
     * @return StandardUnit corresponding to the value
     */
    public static StandardUnit fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Seconds".equals(value)) {
            return Seconds;
        } else if ("Microseconds".equals(value)) {
            return Microseconds;
        } else if ("Milliseconds".equals(value)) {
            return Milliseconds;
        } else if ("Bytes".equals(value)) {
            return Bytes;
        } else if ("Kilobytes".equals(value)) {
            return Kilobytes;
        } else if ("Megabytes".equals(value)) {
            return Megabytes;
        } else if ("Gigabytes".equals(value)) {
            return Gigabytes;
        } else if ("Terabytes".equals(value)) {
            return Terabytes;
        } else if ("Bits".equals(value)) {
            return Bits;
        } else if ("Kilobits".equals(value)) {
            return Kilobits;
        } else if ("Megabits".equals(value)) {
            return Megabits;
        } else if ("Gigabits".equals(value)) {
            return Gigabits;
        } else if ("Terabits".equals(value)) {
            return Terabits;
        } else if ("Percent".equals(value)) {
            return Percent;
        } else if ("Count".equals(value)) {
            return Count;
        } else if ("Bytes/Second".equals(value)) {
            return BytesSecond;
        } else if ("Kilobytes/Second".equals(value)) {
            return KilobytesSecond;
        } else if ("Megabytes/Second".equals(value)) {
            return MegabytesSecond;
        } else if ("Gigabytes/Second".equals(value)) {
            return GigabytesSecond;
        } else if ("Terabytes/Second".equals(value)) {
            return TerabytesSecond;
        } else if ("Bits/Second".equals(value)) {
            return BitsSecond;
        } else if ("Kilobits/Second".equals(value)) {
            return KilobitsSecond;
        } else if ("Megabits/Second".equals(value)) {
            return MegabitsSecond;
        } else if ("Gigabits/Second".equals(value)) {
            return GigabitsSecond;
        } else if ("Terabits/Second".equals(value)) {
            return TerabitsSecond;
        } else if ("Count/Second".equals(value)) {
            return CountSecond;
        } else if ("None".equals(value)) {
            return None;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}