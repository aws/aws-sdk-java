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
package com.amazonaws.services.guardduty.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CoverageFilterCriterionKey {

    ACCOUNT_ID("ACCOUNT_ID"),
    CLUSTER_NAME("CLUSTER_NAME"),
    RESOURCE_TYPE("RESOURCE_TYPE"),
    COVERAGE_STATUS("COVERAGE_STATUS"),
    ADDON_VERSION("ADDON_VERSION"),
    MANAGEMENT_TYPE("MANAGEMENT_TYPE"),
    EKS_CLUSTER_NAME("EKS_CLUSTER_NAME"),
    ECS_CLUSTER_NAME("ECS_CLUSTER_NAME"),
    AGENT_VERSION("AGENT_VERSION"),
    INSTANCE_ID("INSTANCE_ID"),
    CLUSTER_ARN("CLUSTER_ARN");

    private String value;

    private CoverageFilterCriterionKey(String value) {
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
     * @return CoverageFilterCriterionKey corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static CoverageFilterCriterionKey fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (CoverageFilterCriterionKey enumEntry : CoverageFilterCriterionKey.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
