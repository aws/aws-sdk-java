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
 * Schedule Activity Task Failed Cause
 */
public enum ScheduleActivityTaskFailedCause {
    
    ACTIVITY_TYPE_DEPRECATED("ACTIVITY_TYPE_DEPRECATED"),
    ACTIVITY_TYPE_DOES_NOT_EXIST("ACTIVITY_TYPE_DOES_NOT_EXIST"),
    ACTIVITY_ID_ALREADY_IN_USE("ACTIVITY_ID_ALREADY_IN_USE"),
    OPEN_ACTIVITIES_LIMIT_EXCEEDED("OPEN_ACTIVITIES_LIMIT_EXCEEDED"),
    ACTIVITY_CREATION_RATE_EXCEEDED("ACTIVITY_CREATION_RATE_EXCEEDED"),
    DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED("DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED"),
    DEFAULT_TASK_LIST_UNDEFINED("DEFAULT_TASK_LIST_UNDEFINED"),
    DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED("DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED"),
    DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED("DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED"),
    DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED("DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED");

    private String value;

    private ScheduleActivityTaskFailedCause(String value) {
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
     * @return ScheduleActivityTaskFailedCause corresponding to the value
     */
    public static ScheduleActivityTaskFailedCause fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("ACTIVITY_TYPE_DEPRECATED".equals(value)) {
            return ScheduleActivityTaskFailedCause.ACTIVITY_TYPE_DEPRECATED;
        } else if ("ACTIVITY_TYPE_DOES_NOT_EXIST".equals(value)) {
            return ScheduleActivityTaskFailedCause.ACTIVITY_TYPE_DOES_NOT_EXIST;
        } else if ("ACTIVITY_ID_ALREADY_IN_USE".equals(value)) {
            return ScheduleActivityTaskFailedCause.ACTIVITY_ID_ALREADY_IN_USE;
        } else if ("OPEN_ACTIVITIES_LIMIT_EXCEEDED".equals(value)) {
            return ScheduleActivityTaskFailedCause.OPEN_ACTIVITIES_LIMIT_EXCEEDED;
        } else if ("ACTIVITY_CREATION_RATE_EXCEEDED".equals(value)) {
            return ScheduleActivityTaskFailedCause.ACTIVITY_CREATION_RATE_EXCEEDED;
        } else if ("DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED".equals(value)) {
            return ScheduleActivityTaskFailedCause.DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED;
        } else if ("DEFAULT_TASK_LIST_UNDEFINED".equals(value)) {
            return ScheduleActivityTaskFailedCause.DEFAULT_TASK_LIST_UNDEFINED;
        } else if ("DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED".equals(value)) {
            return ScheduleActivityTaskFailedCause.DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED;
        } else if ("DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED".equals(value)) {
            return ScheduleActivityTaskFailedCause.DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED;
        } else if ("DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED".equals(value)) {
            return ScheduleActivityTaskFailedCause.DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    