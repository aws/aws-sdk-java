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
 * Job Flow Execution State
 */
public enum JobFlowExecutionState {
    
    STARTING("STARTING"),
    BOOTSTRAPPING("BOOTSTRAPPING"),
    RUNNING("RUNNING"),
    WAITING("WAITING"),
    SHUTTING_DOWN("SHUTTING_DOWN"),
    TERMINATED("TERMINATED"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED");

    private String value;

    private JobFlowExecutionState(String value) {
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
     * @return JobFlowExecutionState corresponding to the value
     */
    public static JobFlowExecutionState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("STARTING".equals(value)) {
            return JobFlowExecutionState.STARTING;
        } else if ("BOOTSTRAPPING".equals(value)) {
            return JobFlowExecutionState.BOOTSTRAPPING;
        } else if ("RUNNING".equals(value)) {
            return JobFlowExecutionState.RUNNING;
        } else if ("WAITING".equals(value)) {
            return JobFlowExecutionState.WAITING;
        } else if ("SHUTTING_DOWN".equals(value)) {
            return JobFlowExecutionState.SHUTTING_DOWN;
        } else if ("TERMINATED".equals(value)) {
            return JobFlowExecutionState.TERMINATED;
        } else if ("COMPLETED".equals(value)) {
            return JobFlowExecutionState.COMPLETED;
        } else if ("FAILED".equals(value)) {
            return JobFlowExecutionState.FAILED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    