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
 * Continue As New Workflow Execution Failed Cause
 */
public enum ContinueAsNewWorkflowExecutionFailedCause {
    
    UNHANDLED_DECISION("UNHANDLED_DECISION"),
    WORKFLOW_TYPE_DEPRECATED("WORKFLOW_TYPE_DEPRECATED"),
    DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED("DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED"),
    DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED("DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED"),
    DEFAULT_TASK_LIST_UNDEFINED("DEFAULT_TASK_LIST_UNDEFINED"),
    DEFAULT_CHILD_POLICY_UNDEFINED("DEFAULT_CHILD_POLICY_UNDEFINED");

    private String value;

    private ContinueAsNewWorkflowExecutionFailedCause(String value) {
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
     * @return ContinueAsNewWorkflowExecutionFailedCause corresponding to the value
     */
    public static ContinueAsNewWorkflowExecutionFailedCause fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("UNHANDLED_DECISION".equals(value)) {
            return ContinueAsNewWorkflowExecutionFailedCause.UNHANDLED_DECISION;
        } else if ("WORKFLOW_TYPE_DEPRECATED".equals(value)) {
            return ContinueAsNewWorkflowExecutionFailedCause.WORKFLOW_TYPE_DEPRECATED;
        } else if ("DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED".equals(value)) {
            return ContinueAsNewWorkflowExecutionFailedCause.DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED;
        } else if ("DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED".equals(value)) {
            return ContinueAsNewWorkflowExecutionFailedCause.DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED;
        } else if ("DEFAULT_TASK_LIST_UNDEFINED".equals(value)) {
            return ContinueAsNewWorkflowExecutionFailedCause.DEFAULT_TASK_LIST_UNDEFINED;
        } else if ("DEFAULT_CHILD_POLICY_UNDEFINED".equals(value)) {
            return ContinueAsNewWorkflowExecutionFailedCause.DEFAULT_CHILD_POLICY_UNDEFINED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    