/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * Cluster State Change Reason Code
 */
public enum ClusterStateChangeReasonCode {
    
    INTERNAL_ERROR("INTERNAL_ERROR"),
    VALIDATION_ERROR("VALIDATION_ERROR"),
    INSTANCE_FAILURE("INSTANCE_FAILURE"),
    BOOTSTRAP_FAILURE("BOOTSTRAP_FAILURE"),
    USER_REQUEST("USER_REQUEST"),
    STEP_FAILURE("STEP_FAILURE"),
    ALL_STEPS_COMPLETED("ALL_STEPS_COMPLETED");

    private String value;

    private ClusterStateChangeReasonCode(String value) {
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
     *            real value
     * @return ClusterStateChangeReasonCode corresponding to the value
     */
    public static ClusterStateChangeReasonCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("INTERNAL_ERROR".equals(value)) {
            return ClusterStateChangeReasonCode.INTERNAL_ERROR;
        } else if ("VALIDATION_ERROR".equals(value)) {
            return ClusterStateChangeReasonCode.VALIDATION_ERROR;
        } else if ("INSTANCE_FAILURE".equals(value)) {
            return ClusterStateChangeReasonCode.INSTANCE_FAILURE;
        } else if ("BOOTSTRAP_FAILURE".equals(value)) {
            return ClusterStateChangeReasonCode.BOOTSTRAP_FAILURE;
        } else if ("USER_REQUEST".equals(value)) {
            return ClusterStateChangeReasonCode.USER_REQUEST;
        } else if ("STEP_FAILURE".equals(value)) {
            return ClusterStateChangeReasonCode.STEP_FAILURE;
        } else if ("ALL_STEPS_COMPLETED".equals(value)) {
            return ClusterStateChangeReasonCode.ALL_STEPS_COMPLETED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    