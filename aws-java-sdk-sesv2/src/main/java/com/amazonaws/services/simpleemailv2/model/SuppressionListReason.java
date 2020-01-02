/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The reason that the address was added to the suppression list for your account. The value can be one of the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>COMPLAINT</code> – Amazon SES added an email address to the suppression list for your account because a message
 * sent to that address results in a complaint.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BOUNCE</code> – Amazon SES added an email address to the suppression list for your account because a message
 * sent to that address results in a hard bounce.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SuppressionListReason {

    BOUNCE("BOUNCE"),
    COMPLAINT("COMPLAINT");

    private String value;

    private SuppressionListReason(String value) {
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
     * @return SuppressionListReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SuppressionListReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SuppressionListReason enumEntry : SuppressionListReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
