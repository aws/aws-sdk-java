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
 * Start Timer Failed Cause
 */
public enum StartTimerFailedCause {
    
    TIMER_ID_ALREADY_IN_USE("TIMER_ID_ALREADY_IN_USE"),
    OPEN_TIMERS_LIMIT_EXCEEDED("OPEN_TIMERS_LIMIT_EXCEEDED"),
    TIMER_CREATION_RATE_EXCEEDED("TIMER_CREATION_RATE_EXCEEDED");

    private String value;

    private StartTimerFailedCause(String value) {
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
     * @return StartTimerFailedCause corresponding to the value
     */
    public static StartTimerFailedCause fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("TIMER_ID_ALREADY_IN_USE".equals(value)) {
            return StartTimerFailedCause.TIMER_ID_ALREADY_IN_USE;
        } else if ("OPEN_TIMERS_LIMIT_EXCEEDED".equals(value)) {
            return StartTimerFailedCause.OPEN_TIMERS_LIMIT_EXCEEDED;
        } else if ("TIMER_CREATION_RATE_EXCEEDED".equals(value)) {
            return StartTimerFailedCause.TIMER_CREATION_RATE_EXCEEDED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    