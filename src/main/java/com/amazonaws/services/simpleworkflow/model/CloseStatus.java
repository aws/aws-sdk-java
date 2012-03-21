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
 * Close Status
 */
public enum CloseStatus {
    
    COMPLETED("COMPLETED"),
    FAILED("FAILED"),
    CANCELED("CANCELED"),
    TERMINATED("TERMINATED"),
    CONTINUED_AS_NEW("CONTINUED_AS_NEW"),
    TIMED_OUT("TIMED_OUT");

    private String value;

    private CloseStatus(String value) {
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
     * @return CloseStatus corresponding to the value
     */
    public static CloseStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("COMPLETED".equals(value)) {
            return CloseStatus.COMPLETED;
        } else if ("FAILED".equals(value)) {
            return CloseStatus.FAILED;
        } else if ("CANCELED".equals(value)) {
            return CloseStatus.CANCELED;
        } else if ("TERMINATED".equals(value)) {
            return CloseStatus.TERMINATED;
        } else if ("CONTINUED_AS_NEW".equals(value)) {
            return CloseStatus.CONTINUED_AS_NEW;
        } else if ("TIMED_OUT".equals(value)) {
            return CloseStatus.TIMED_OUT;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    