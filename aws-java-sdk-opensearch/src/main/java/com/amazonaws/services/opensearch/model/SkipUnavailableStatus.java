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
package com.amazonaws.services.opensearch.model;

import javax.annotation.Generated;

/**
 * <p>
 * The status of <code>SkipUnavailable</code> setting for the outbound connection.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>ENABLED</b> - The <code>SkipUnavailable</code> setting is enabled for the connection.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>DISABLED</b> - The <code>SkipUnavailable</code> setting is disabled for the connection.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SkipUnavailableStatus {

    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private String value;

    private SkipUnavailableStatus(String value) {
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
     * @return SkipUnavailableStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SkipUnavailableStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SkipUnavailableStatus enumEntry : SkipUnavailableStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
