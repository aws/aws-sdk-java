/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum RetentionPeriod {

    THREE_MONTHS("THREE_MONTHS"),
    SIX_MONTHS("SIX_MONTHS"),
    NINE_MONTHS("NINE_MONTHS"),
    ONE_YEAR("ONE_YEAR"),
    EIGHTEEN_MONTHS("EIGHTEEN_MONTHS"),
    TWO_YEARS("TWO_YEARS"),
    THIRTY_MONTHS("THIRTY_MONTHS"),
    THREE_YEARS("THREE_YEARS"),
    FOUR_YEARS("FOUR_YEARS"),
    FIVE_YEARS("FIVE_YEARS"),
    SIX_YEARS("SIX_YEARS"),
    SEVEN_YEARS("SEVEN_YEARS"),
    EIGHT_YEARS("EIGHT_YEARS"),
    NINE_YEARS("NINE_YEARS"),
    TEN_YEARS("TEN_YEARS"),
    PERMANENT("PERMANENT");

    private String value;

    private RetentionPeriod(String value) {
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
     * @return RetentionPeriod corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static RetentionPeriod fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (RetentionPeriod enumEntry : RetentionPeriod.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
