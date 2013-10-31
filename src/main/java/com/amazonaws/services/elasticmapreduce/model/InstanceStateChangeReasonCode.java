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
 * Instance State Change Reason Code
 */
public enum InstanceStateChangeReasonCode {
    
    INTERNAL_ERROR("INTERNAL_ERROR"),
    VALIDATION_ERROR("VALIDATION_ERROR"),
    INSTANCE_FAILURE("INSTANCE_FAILURE"),
    BOOTSTRAP_FAILURE("BOOTSTRAP_FAILURE"),
    CLUSTER_TERMINATED("CLUSTER_TERMINATED");

    private String value;

    private InstanceStateChangeReasonCode(String value) {
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
     * @return InstanceStateChangeReasonCode corresponding to the value
     */
    public static InstanceStateChangeReasonCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("INTERNAL_ERROR".equals(value)) {
            return InstanceStateChangeReasonCode.INTERNAL_ERROR;
        } else if ("VALIDATION_ERROR".equals(value)) {
            return InstanceStateChangeReasonCode.VALIDATION_ERROR;
        } else if ("INSTANCE_FAILURE".equals(value)) {
            return InstanceStateChangeReasonCode.INSTANCE_FAILURE;
        } else if ("BOOTSTRAP_FAILURE".equals(value)) {
            return InstanceStateChangeReasonCode.BOOTSTRAP_FAILURE;
        } else if ("CLUSTER_TERMINATED".equals(value)) {
            return InstanceStateChangeReasonCode.CLUSTER_TERMINATED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    