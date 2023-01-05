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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import javax.annotation.Generated;

/**
 * <p>
 * The deployment status of a resource. Status can be one of the following:
 * </p>
 * <p>
 * PENDING: Amazon Route 53 Application Recovery Controller is creating the resource.
 * </p>
 * <p>
 * DEPLOYED: The resource is deployed and ready to use.
 * </p>
 * <p>
 * PENDING_DELETION: Amazon Route 53 Application Recovery Controller is deleting the resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Status {

    PENDING("PENDING"),
    DEPLOYED("DEPLOYED"),
    PENDING_DELETION("PENDING_DELETION");

    private String value;

    private Status(String value) {
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
     * @return Status corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Status fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Status enumEntry : Status.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
