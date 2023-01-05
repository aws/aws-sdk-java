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
package com.amazonaws.services.quicksight.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ConditionalFormattingIconSetType {

    PLUS_MINUS("PLUS_MINUS"),
    CHECK_X("CHECK_X"),
    THREE_COLOR_ARROW("THREE_COLOR_ARROW"),
    THREE_GRAY_ARROW("THREE_GRAY_ARROW"),
    CARET_UP_MINUS_DOWN("CARET_UP_MINUS_DOWN"),
    THREE_SHAPE("THREE_SHAPE"),
    THREE_CIRCLE("THREE_CIRCLE"),
    FLAGS("FLAGS"),
    BARS("BARS"),
    FOUR_COLOR_ARROW("FOUR_COLOR_ARROW"),
    FOUR_GRAY_ARROW("FOUR_GRAY_ARROW");

    private String value;

    private ConditionalFormattingIconSetType(String value) {
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
     * @return ConditionalFormattingIconSetType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ConditionalFormattingIconSetType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ConditionalFormattingIconSetType enumEntry : ConditionalFormattingIconSetType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
