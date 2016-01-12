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

package com.amazonaws.services.codedeploy.model;

/**
 * 
 */
public enum ErrorCode {

    DEPLOYMENT_GROUP_MISSING("DEPLOYMENT_GROUP_MISSING"),
    APPLICATION_MISSING("APPLICATION_MISSING"),
    REVISION_MISSING("REVISION_MISSING"),
    IAM_ROLE_MISSING("IAM_ROLE_MISSING"),
    IAM_ROLE_PERMISSIONS("IAM_ROLE_PERMISSIONS"),
    NO_EC2_SUBSCRIPTION("NO_EC2_SUBSCRIPTION"),
    OVER_MAX_INSTANCES("OVER_MAX_INSTANCES"),
    NO_INSTANCES("NO_INSTANCES"),
    TIMEOUT("TIMEOUT"),
    HEALTH_CONSTRAINTS_INVALID("HEALTH_CONSTRAINTS_INVALID"),
    HEALTH_CONSTRAINTS("HEALTH_CONSTRAINTS"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    THROTTLED("THROTTLED");

    private String value;

    private ErrorCode(String value) {
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
     * @return ErrorCode corresponding to the value
     */
    public static ErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("DEPLOYMENT_GROUP_MISSING".equals(value)) {
            return DEPLOYMENT_GROUP_MISSING;
        } else if ("APPLICATION_MISSING".equals(value)) {
            return APPLICATION_MISSING;
        } else if ("REVISION_MISSING".equals(value)) {
            return REVISION_MISSING;
        } else if ("IAM_ROLE_MISSING".equals(value)) {
            return IAM_ROLE_MISSING;
        } else if ("IAM_ROLE_PERMISSIONS".equals(value)) {
            return IAM_ROLE_PERMISSIONS;
        } else if ("NO_EC2_SUBSCRIPTION".equals(value)) {
            return NO_EC2_SUBSCRIPTION;
        } else if ("OVER_MAX_INSTANCES".equals(value)) {
            return OVER_MAX_INSTANCES;
        } else if ("NO_INSTANCES".equals(value)) {
            return NO_INSTANCES;
        } else if ("TIMEOUT".equals(value)) {
            return TIMEOUT;
        } else if ("HEALTH_CONSTRAINTS_INVALID".equals(value)) {
            return HEALTH_CONSTRAINTS_INVALID;
        } else if ("HEALTH_CONSTRAINTS".equals(value)) {
            return HEALTH_CONSTRAINTS;
        } else if ("INTERNAL_ERROR".equals(value)) {
            return INTERNAL_ERROR;
        } else if ("THROTTLED".equals(value)) {
            return THROTTLED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}