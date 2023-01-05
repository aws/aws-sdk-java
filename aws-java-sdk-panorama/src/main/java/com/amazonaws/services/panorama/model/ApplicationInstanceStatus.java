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
public enum ApplicationInstanceStatus {

    DEPLOYMENT_PENDING("DEPLOYMENT_PENDING"),
    DEPLOYMENT_REQUESTED("DEPLOYMENT_REQUESTED"),
    DEPLOYMENT_IN_PROGRESS("DEPLOYMENT_IN_PROGRESS"),
    DEPLOYMENT_ERROR("DEPLOYMENT_ERROR"),
    DEPLOYMENT_SUCCEEDED("DEPLOYMENT_SUCCEEDED"),
    REMOVAL_PENDING("REMOVAL_PENDING"),
    REMOVAL_REQUESTED("REMOVAL_REQUESTED"),
    REMOVAL_IN_PROGRESS("REMOVAL_IN_PROGRESS"),
    REMOVAL_FAILED("REMOVAL_FAILED"),
    REMOVAL_SUCCEEDED("REMOVAL_SUCCEEDED"),
    DEPLOYMENT_FAILED("DEPLOYMENT_FAILED");

    private String value;

    private ApplicationInstanceStatus(String value) {
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
     * @return ApplicationInstanceStatus corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ApplicationInstanceStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ApplicationInstanceStatus enumEntry : ApplicationInstanceStatus.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
