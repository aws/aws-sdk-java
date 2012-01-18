/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Standard Unit
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
     *            real value
     * @return StandardUnit corresponding to the value
     */
    public static StandardUnit fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Seconds".equals(value)) {
            return StandardUnit.Seconds;
        } else if ("Microseconds".equals(value)) {
            return StandardUnit.Microseconds;
        } else if ("Milliseconds".equals(value)) {
            return StandardUnit.Milliseconds;
        } else if ("Bytes".equals(value)) {
            return StandardUnit.Bytes;
        } else if ("Kilobytes".equals(value)) {
            return StandardUnit.Kilobytes;
        } else if ("Megabytes".equals(value)) {
            return StandardUnit.Megabytes;
        } else if ("Gigabytes".equals(value)) {
            return StandardUnit.Gigabytes;
        } else if ("Terabytes".equals(value)) {
            return StandardUnit.Terabytes;
        } else if ("Bits".equals(value)) {
            return StandardUnit.Bits;
        } else if ("Kilobits".equals(value)) {
            return StandardUnit.Kilobits;
        } else if ("Megabits".equals(value)) {
            return StandardUnit.Megabits;
        } else if ("Gigabits".equals(value)) {
            return StandardUnit.Gigabits;
        } else if ("Terabits".equals(value)) {
            return StandardUnit.Terabits;
        } else if ("Percent".equals(value)) {
            return StandardUnit.Percent;
        } else if ("Count".equals(value)) {
            return StandardUnit.Count;
        } else if ("Bytes/Second".equals(value)) {
            return StandardUnit.BytesSecond;
        } else if ("Kilobytes/Second".equals(value)) {
            return StandardUnit.KilobytesSecond;
        } else if ("Megabytes/Second".equals(value)) {
            return StandardUnit.MegabytesSecond;
        } else if ("Gigabytes/Second".equals(value)) {
            return StandardUnit.GigabytesSecond;
        } else if ("Terabytes/Second".equals(value)) {
            return StandardUnit.TerabytesSecond;
        } else if ("Bits/Second".equals(value)) {
            return StandardUnit.BitsSecond;
        } else if ("Kilobits/Second".equals(value)) {
            return StandardUnit.KilobitsSecond;
        } else if ("Megabits/Second".equals(value)) {
            return StandardUnit.MegabitsSecond;
        } else if ("Gigabits/Second".equals(value)) {
            return StandardUnit.GigabitsSecond;
        } else if ("Terabits/Second".equals(value)) {
            return StandardUnit.TerabitsSecond;
        } else if ("Count/Second".equals(value)) {
            return StandardUnit.CountSecond;
        } else if ("None".equals(value)) {
            return StandardUnit.None;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    