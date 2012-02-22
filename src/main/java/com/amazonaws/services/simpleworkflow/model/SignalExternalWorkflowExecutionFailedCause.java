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
 * Signal External Workflow Execution Failed Cause
 */
public enum SignalExternalWorkflowExecutionFailedCause {
    
    UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION("UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION"),
    SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED("SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED");

    private String value;

    private SignalExternalWorkflowExecutionFailedCause(String value) {
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
     * @return SignalExternalWorkflowExecutionFailedCause corresponding to the value
     */
    public static SignalExternalWorkflowExecutionFailedCause fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION".equals(value)) {
            return SignalExternalWorkflowExecutionFailedCause.UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION;
        } else if ("SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED".equals(value)) {
            return SignalExternalWorkflowExecutionFailedCause.SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    