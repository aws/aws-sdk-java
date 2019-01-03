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
package com.amazonaws.services.mq.model;

import javax.annotation.Generated;

/**
 * The reason for which the XML elements or attributes were sanitized.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SanitizationWarningReason {

    DISALLOWED_ELEMENT_REMOVED("DISALLOWED_ELEMENT_REMOVED"),
    DISALLOWED_ATTRIBUTE_REMOVED("DISALLOWED_ATTRIBUTE_REMOVED"),
    INVALID_ATTRIBUTE_VALUE_REMOVED("INVALID_ATTRIBUTE_VALUE_REMOVED");

    private String value;

    private SanitizationWarningReason(String value) {
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
     * @return SanitizationWarningReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SanitizationWarningReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SanitizationWarningReason enumEntry : SanitizationWarningReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
