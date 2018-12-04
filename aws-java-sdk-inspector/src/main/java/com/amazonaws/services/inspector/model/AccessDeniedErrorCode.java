/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

/**
 * 
 */
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
     */
    public static AccessDeniedErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("ACCESS_DENIED_TO_ASSESSMENT_TARGET".equals(value)) {
            return ACCESS_DENIED_TO_ASSESSMENT_TARGET;
        } else if ("ACCESS_DENIED_TO_ASSESSMENT_TEMPLATE".equals(value)) {
            return ACCESS_DENIED_TO_ASSESSMENT_TEMPLATE;
        } else if ("ACCESS_DENIED_TO_ASSESSMENT_RUN".equals(value)) {
            return ACCESS_DENIED_TO_ASSESSMENT_RUN;
        } else if ("ACCESS_DENIED_TO_FINDING".equals(value)) {
            return ACCESS_DENIED_TO_FINDING;
        } else if ("ACCESS_DENIED_TO_RESOURCE_GROUP".equals(value)) {
            return ACCESS_DENIED_TO_RESOURCE_GROUP;
        } else if ("ACCESS_DENIED_TO_RULES_PACKAGE".equals(value)) {
            return ACCESS_DENIED_TO_RULES_PACKAGE;
        } else if ("ACCESS_DENIED_TO_SNS_TOPIC".equals(value)) {
            return ACCESS_DENIED_TO_SNS_TOPIC;
        } else if ("ACCESS_DENIED_TO_IAM_ROLE".equals(value)) {
            return ACCESS_DENIED_TO_IAM_ROLE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}