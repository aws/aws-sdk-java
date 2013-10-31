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
 * Step State
 */
public enum StepState {
    
    PENDING("PENDING"),
    RUNNING("RUNNING"),
    COMPLETED("COMPLETED"),
    CANCELLED("CANCELLED"),
    FAILED("FAILED"),
    INTERRUPTED("INTERRUPTED");

    private String value;

    private StepState(String value) {
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
     * @return StepState corresponding to the value
     */
    public static StepState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("PENDING".equals(value)) {
            return StepState.PENDING;
        } else if ("RUNNING".equals(value)) {
            return StepState.RUNNING;
        } else if ("COMPLETED".equals(value)) {
            return StepState.COMPLETED;
        } else if ("CANCELLED".equals(value)) {
            return StepState.CANCELLED;
        } else if ("FAILED".equals(value)) {
            return StepState.FAILED;
        } else if ("INTERRUPTED".equals(value)) {
            return StepState.INTERRUPTED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    