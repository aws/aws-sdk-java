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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ErrorResourceType {

    ENVIRONMENT("ENVIRONMENT"),
    APPLICATION("APPLICATION"),
    ROUTE("ROUTE"),
    SERVICE("SERVICE"),
    TRANSIT_GATEWAY("TRANSIT_GATEWAY"),
    TRANSIT_GATEWAY_ATTACHMENT("TRANSIT_GATEWAY_ATTACHMENT"),
    API_GATEWAY("API_GATEWAY"),
    NLB("NLB"),
    TARGET_GROUP("TARGET_GROUP"),
    LOAD_BALANCER_LISTENER("LOAD_BALANCER_LISTENER"),
    VPC_LINK("VPC_LINK"),
    LAMBDA("LAMBDA"),
    VPC("VPC"),
    SUBNET("SUBNET"),
    ROUTE_TABLE("ROUTE_TABLE"),
    SECURITY_GROUP("SECURITY_GROUP"),
    VPC_ENDPOINT_SERVICE_CONFIGURATION("VPC_ENDPOINT_SERVICE_CONFIGURATION"),
    RESOURCE_SHARE("RESOURCE_SHARE"),
    IAM_ROLE("IAM_ROLE");

    private String value;

    private ErrorResourceType(String value) {
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
     * @return ErrorResourceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ErrorResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ErrorResourceType enumEntry : ErrorResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
