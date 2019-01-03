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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AccountLimitType {

    MAX_HEALTH_CHECKS_BY_OWNER("MAX_HEALTH_CHECKS_BY_OWNER"),
    MAX_HOSTED_ZONES_BY_OWNER("MAX_HOSTED_ZONES_BY_OWNER"),
    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER("MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER"),
    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER("MAX_REUSABLE_DELEGATION_SETS_BY_OWNER"),
    MAX_TRAFFIC_POLICIES_BY_OWNER("MAX_TRAFFIC_POLICIES_BY_OWNER");

    private String value;

    private AccountLimitType(String value) {
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
     * @return AccountLimitType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AccountLimitType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AccountLimitType enumEntry : AccountLimitType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
