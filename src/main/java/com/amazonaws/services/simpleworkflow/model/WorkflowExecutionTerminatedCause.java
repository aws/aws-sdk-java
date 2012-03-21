/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

/**
 * Workflow Execution Terminated Cause
 */
public enum WorkflowExecutionTerminatedCause {
    
    CHILD_POLICY_APPLIED("CHILD_POLICY_APPLIED"),
    EVENT_LIMIT_EXCEEDED("EVENT_LIMIT_EXCEEDED"),
    OPERATOR_INITIATED("OPERATOR_INITIATED");

    private String value;

    private WorkflowExecutionTerminatedCause(String value) {
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
     * @return WorkflowExecutionTerminatedCause corresponding to the value
     */
    public static WorkflowExecutionTerminatedCause fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("CHILD_POLICY_APPLIED".equals(value)) {
            return WorkflowExecutionTerminatedCause.CHILD_POLICY_APPLIED;
        } else if ("EVENT_LIMIT_EXCEEDED".equals(value)) {
            return WorkflowExecutionTerminatedCause.EVENT_LIMIT_EXCEEDED;
        } else if ("OPERATOR_INITIATED".equals(value)) {
            return WorkflowExecutionTerminatedCause.OPERATOR_INITIATED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    