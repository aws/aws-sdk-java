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
package com.amazonaws.services.pcaconnectorad.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ConnectorStatusReason {

    DIRECTORY_ACCESS_DENIED("DIRECTORY_ACCESS_DENIED"),
    INTERNAL_FAILURE("INTERNAL_FAILURE"),
    PRIVATECA_ACCESS_DENIED("PRIVATECA_ACCESS_DENIED"),
    PRIVATECA_RESOURCE_NOT_FOUND("PRIVATECA_RESOURCE_NOT_FOUND"),
    SECURITY_GROUP_NOT_IN_VPC("SECURITY_GROUP_NOT_IN_VPC"),
    VPC_ACCESS_DENIED("VPC_ACCESS_DENIED"),
    VPC_ENDPOINT_LIMIT_EXCEEDED("VPC_ENDPOINT_LIMIT_EXCEEDED"),
    VPC_RESOURCE_NOT_FOUND("VPC_RESOURCE_NOT_FOUND");

    private String value;

    private ConnectorStatusReason(String value) {
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
     * @return ConnectorStatusReason corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ConnectorStatusReason fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ConnectorStatusReason enumEntry : ConnectorStatusReason.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
