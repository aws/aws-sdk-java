/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotthingsgraph.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum FlowExecutionEventType {

    EXECUTION_STARTED("EXECUTION_STARTED"),
    EXECUTION_FAILED("EXECUTION_FAILED"),
    EXECUTION_ABORTED("EXECUTION_ABORTED"),
    EXECUTION_SUCCEEDED("EXECUTION_SUCCEEDED"),
    STEP_STARTED("STEP_STARTED"),
    STEP_FAILED("STEP_FAILED"),
    STEP_SUCCEEDED("STEP_SUCCEEDED"),
    ACTIVITY_SCHEDULED("ACTIVITY_SCHEDULED"),
    ACTIVITY_STARTED("ACTIVITY_STARTED"),
    ACTIVITY_FAILED("ACTIVITY_FAILED"),
    ACTIVITY_SUCCEEDED("ACTIVITY_SUCCEEDED"),
    START_FLOW_EXECUTION_TASK("START_FLOW_EXECUTION_TASK"),
    SCHEDULE_NEXT_READY_STEPS_TASK("SCHEDULE_NEXT_READY_STEPS_TASK"),
    THING_ACTION_TASK("THING_ACTION_TASK"),
    THING_ACTION_TASK_FAILED("THING_ACTION_TASK_FAILED"),
    THING_ACTION_TASK_SUCCEEDED("THING_ACTION_TASK_SUCCEEDED"),
    ACKNOWLEDGE_TASK_MESSAGE("ACKNOWLEDGE_TASK_MESSAGE");

    private String value;

    private FlowExecutionEventType(String value) {
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
     * @return FlowExecutionEventType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static FlowExecutionEventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (FlowExecutionEventType enumEntry : FlowExecutionEventType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
