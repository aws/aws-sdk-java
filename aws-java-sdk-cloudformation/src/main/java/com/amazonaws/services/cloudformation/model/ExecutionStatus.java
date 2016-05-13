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

package com.amazonaws.services.cloudformation.model;

/**
 * 
 */
public enum ExecutionStatus {

    UNAVAILABLE("UNAVAILABLE"),
    AVAILABLE("AVAILABLE"),
    EXECUTE_IN_PROGRESS("EXECUTE_IN_PROGRESS"),
    EXECUTE_COMPLETE("EXECUTE_COMPLETE"),
    EXECUTE_FAILED("EXECUTE_FAILED"),
    OBSOLETE("OBSOLETE");

    private String value;

    private ExecutionStatus(String value) {
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
     * @return ExecutionStatus corresponding to the value
     */
    public static ExecutionStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("UNAVAILABLE".equals(value)) {
            return UNAVAILABLE;
        } else if ("AVAILABLE".equals(value)) {
            return AVAILABLE;
        } else if ("EXECUTE_IN_PROGRESS".equals(value)) {
            return EXECUTE_IN_PROGRESS;
        } else if ("EXECUTE_COMPLETE".equals(value)) {
            return EXECUTE_COMPLETE;
        } else if ("EXECUTE_FAILED".equals(value)) {
            return EXECUTE_FAILED;
        } else if ("OBSOLETE".equals(value)) {
            return OBSOLETE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}