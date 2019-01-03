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
package com.amazonaws.services.kafka.model;

import javax.annotation.Generated;

/**
 * <p>
 * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT,
 * PER_BROKER, and PER_TOPIC_PER_BROKER.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EnhancedMonitoring {

    DEFAULT("DEFAULT"),
    PER_BROKER("PER_BROKER"),
    PER_TOPIC_PER_BROKER("PER_TOPIC_PER_BROKER");

    private String value;

    private EnhancedMonitoring(String value) {
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
     * @return EnhancedMonitoring corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EnhancedMonitoring fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EnhancedMonitoring enumEntry : EnhancedMonitoring.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
