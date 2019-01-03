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
package com.amazonaws.services.fsx.model;

import javax.annotation.Generated;

/**
 * <p>
 * The type of error relating to Microsoft Active Directory. NOT_FOUND means that no directory was found by specifying
 * the given directory. INCOMPATIBLE_MODE means that the directory specified is not a Microsoft AD directory. WRONG_VPC
 * means that the specified directory isn't accessible from the specified VPC. WRONG_STAGE means that the specified
 * directory isn't currently in the ACTIVE state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ActiveDirectoryErrorType {

    DOMAIN_NOT_FOUND("DOMAIN_NOT_FOUND"),
    INCOMPATIBLE_DOMAIN_MODE("INCOMPATIBLE_DOMAIN_MODE"),
    WRONG_VPC("WRONG_VPC"),
    INVALID_DOMAIN_STAGE("INVALID_DOMAIN_STAGE");

    private String value;

    private ActiveDirectoryErrorType(String value) {
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
     * @return ActiveDirectoryErrorType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ActiveDirectoryErrorType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ActiveDirectoryErrorType enumEntry : ActiveDirectoryErrorType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
