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
package com.amazonaws.services.codedeploy.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
    THROTTLED("THROTTLED"),
    ALARM_ACTIVE("ALARM_ACTIVE"),
    AGENT_ISSUE("AGENT_ISSUE"),
    AUTO_SCALING_IAM_ROLE_PERMISSIONS("AUTO_SCALING_IAM_ROLE_PERMISSIONS"),
    AUTO_SCALING_CONFIGURATION("AUTO_SCALING_CONFIGURATION"),
    MANUAL_STOP("MANUAL_STOP"),
    MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION("MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION"),
    MISSING_ELB_INFORMATION("MISSING_ELB_INFORMATION"),
    MISSING_GITHUB_TOKEN("MISSING_GITHUB_TOKEN"),
    ELASTIC_LOAD_BALANCING_INVALID("ELASTIC_LOAD_BALANCING_INVALID"),
    ELB_INVALID_INSTANCE("ELB_INVALID_INSTANCE"),
    INVALID_LAMBDA_CONFIGURATION("INVALID_LAMBDA_CONFIGURATION"),
    INVALID_LAMBDA_FUNCTION("INVALID_LAMBDA_FUNCTION"),
    HOOK_EXECUTION_FAILURE("HOOK_EXECUTION_FAILURE"),
    AUTOSCALING_VALIDATION_ERROR("AUTOSCALING_VALIDATION_ERROR"),
    INVALID_ECS_SERVICE("INVALID_ECS_SERVICE"),
    ECS_UPDATE_ERROR("ECS_UPDATE_ERROR"),
    INVALID_REVISION("INVALID_REVISION");

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
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ErrorCode enumEntry : ErrorCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
