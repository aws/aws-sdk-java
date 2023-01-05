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
package com.amazonaws.services.elasticsearch.model;

import javax.annotation.Generated;

/**
 * <p>
 * Specifies the error code of the failure encountered while describing the VPC endpoint:
 * <ul>
 * <li>ENDPOINT_NOT_FOUND: Indicates that the requested VPC endpoint does not exist.</li>
 * <li>SERVER_ERROR: Indicates the describe endpoint operation failed due to an internal server error.</li>
 * </ul>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum VpcEndpointErrorCode {

    ENDPOINT_NOT_FOUND("ENDPOINT_NOT_FOUND"),
    SERVER_ERROR("SERVER_ERROR");

    private String value;

    private VpcEndpointErrorCode(String value) {
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
     * @return VpcEndpointErrorCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static VpcEndpointErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (VpcEndpointErrorCode enumEntry : VpcEndpointErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
