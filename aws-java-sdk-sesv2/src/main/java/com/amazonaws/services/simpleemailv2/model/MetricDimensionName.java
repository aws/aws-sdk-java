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
package com.amazonaws.services.simpleemailv2.model;

import javax.annotation.Generated;

/**
 * <p>
 * The <code>BatchGetMetricDataQuery</code> dimension name. This can be one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>EMAIL_IDENTITY</code> – The email identity used when sending messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CONFIGURATION_SET</code> – The configuration set used when sending messages (if one was used).
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ISP</code> – The recipient ISP (e.g. <code>Gmail</code>, <code>Yahoo</code>, etc.).
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MetricDimensionName {

    EMAIL_IDENTITY("EMAIL_IDENTITY"),
    CONFIGURATION_SET("CONFIGURATION_SET"),
    ISP("ISP");

    private String value;

    private MetricDimensionName(String value) {
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
     * @return MetricDimensionName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MetricDimensionName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MetricDimensionName enumEntry : MetricDimensionName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
