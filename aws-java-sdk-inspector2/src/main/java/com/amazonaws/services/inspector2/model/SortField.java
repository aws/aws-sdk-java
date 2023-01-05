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
package com.amazonaws.services.inspector2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum SortField {

    AWS_ACCOUNT_ID("AWS_ACCOUNT_ID"),
    FINDING_TYPE("FINDING_TYPE"),
    SEVERITY("SEVERITY"),
    FIRST_OBSERVED_AT("FIRST_OBSERVED_AT"),
    LAST_OBSERVED_AT("LAST_OBSERVED_AT"),
    FINDING_STATUS("FINDING_STATUS"),
    RESOURCE_TYPE("RESOURCE_TYPE"),
    ECR_IMAGE_PUSHED_AT("ECR_IMAGE_PUSHED_AT"),
    ECR_IMAGE_REPOSITORY_NAME("ECR_IMAGE_REPOSITORY_NAME"),
    ECR_IMAGE_REGISTRY("ECR_IMAGE_REGISTRY"),
    NETWORK_PROTOCOL("NETWORK_PROTOCOL"),
    COMPONENT_TYPE("COMPONENT_TYPE"),
    VULNERABILITY_ID("VULNERABILITY_ID"),
    VULNERABILITY_SOURCE("VULNERABILITY_SOURCE"),
    INSPECTOR_SCORE("INSPECTOR_SCORE"),
    VENDOR_SEVERITY("VENDOR_SEVERITY");

    private String value;

    private SortField(String value) {
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
     * @return SortField corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static SortField fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (SortField enumEntry : SortField.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
