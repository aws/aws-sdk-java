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
public enum Icon {

    CARET_UP("CARET_UP"),
    CARET_DOWN("CARET_DOWN"),
    PLUS("PLUS"),
    MINUS("MINUS"),
    ARROW_UP("ARROW_UP"),
    ARROW_DOWN("ARROW_DOWN"),
    ARROW_LEFT("ARROW_LEFT"),
    ARROW_UP_LEFT("ARROW_UP_LEFT"),
    ARROW_DOWN_LEFT("ARROW_DOWN_LEFT"),
    ARROW_RIGHT("ARROW_RIGHT"),
    ARROW_UP_RIGHT("ARROW_UP_RIGHT"),
    ARROW_DOWN_RIGHT("ARROW_DOWN_RIGHT"),
    FACE_UP("FACE_UP"),
    FACE_DOWN("FACE_DOWN"),
    FACE_FLAT("FACE_FLAT"),
    ONE_BAR("ONE_BAR"),
    TWO_BAR("TWO_BAR"),
    THREE_BAR("THREE_BAR"),
    CIRCLE("CIRCLE"),
    TRIANGLE("TRIANGLE"),
    SQUARE("SQUARE"),
    FLAG("FLAG"),
    THUMBS_UP("THUMBS_UP"),
    THUMBS_DOWN("THUMBS_DOWN"),
    CHECKMARK("CHECKMARK"),
    X("X");

    private String value;

    private Icon(String value) {
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
     * @return Icon corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Icon fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Icon enumEntry : Icon.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
