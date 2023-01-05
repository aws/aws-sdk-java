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
package com.amazonaws.services.panorama.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum StatusFilter {

    DEPLOYMENT_SUCCEEDED("DEPLOYMENT_SUCCEEDED"),
    DEPLOYMENT_ERROR("DEPLOYMENT_ERROR"),
    REMOVAL_SUCCEEDED("REMOVAL_SUCCEEDED"),
    REMOVAL_FAILED("REMOVAL_FAILED"),
    PROCESSING_DEPLOYMENT("PROCESSING_DEPLOYMENT"),
    PROCESSING_REMOVAL("PROCESSING_REMOVAL"),
    DEPLOYMENT_FAILED("DEPLOYMENT_FAILED");

    private String value;

    private StatusFilter(String value) {
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
     * @return StatusFilter corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static StatusFilter fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (StatusFilter enumEntry : StatusFilter.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
