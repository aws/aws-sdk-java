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
package com.amazonaws.services.inspector.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum AccessDeniedErrorCode {

    ACCESS_DENIED_TO_ASSESSMENT_TARGET("ACCESS_DENIED_TO_ASSESSMENT_TARGET"),
    ACCESS_DENIED_TO_ASSESSMENT_TEMPLATE("ACCESS_DENIED_TO_ASSESSMENT_TEMPLATE"),
    ACCESS_DENIED_TO_ASSESSMENT_RUN("ACCESS_DENIED_TO_ASSESSMENT_RUN"),
    ACCESS_DENIED_TO_FINDING("ACCESS_DENIED_TO_FINDING"),
    ACCESS_DENIED_TO_RESOURCE_GROUP("ACCESS_DENIED_TO_RESOURCE_GROUP"),
    ACCESS_DENIED_TO_RULES_PACKAGE("ACCESS_DENIED_TO_RULES_PACKAGE"),
    ACCESS_DENIED_TO_SNS_TOPIC("ACCESS_DENIED_TO_SNS_TOPIC"),
    ACCESS_DENIED_TO_IAM_ROLE("ACCESS_DENIED_TO_IAM_ROLE");

    private String value;

    private AccessDeniedErrorCode(String value) {
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
     * @return AccessDeniedErrorCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static AccessDeniedErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (AccessDeniedErrorCode enumEntry : AccessDeniedErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
