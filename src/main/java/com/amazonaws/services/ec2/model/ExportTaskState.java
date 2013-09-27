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
package com.amazonaws.services.ec2.model;

/**
 * Export Task State
 */
public enum ExportTaskState {
    
    Active("active"),
    Cancelling("cancelling"),
    Cancelled("cancelled"),
    Completed("completed");

    private String value;

    private ExportTaskState(String value) {
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
     * @return ExportTaskState corresponding to the value
     */
    public static ExportTaskState fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("active".equals(value)) {
            return ExportTaskState.Active;
        } else if ("cancelling".equals(value)) {
            return ExportTaskState.Cancelling;
        } else if ("cancelled".equals(value)) {
            return ExportTaskState.Cancelled;
        } else if ("completed".equals(value)) {
            return ExportTaskState.Completed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    