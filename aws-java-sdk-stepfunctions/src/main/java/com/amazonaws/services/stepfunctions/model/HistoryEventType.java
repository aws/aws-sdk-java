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
package com.amazonaws.services.stepfunctions.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum HistoryEventType {

    ActivityFailed("ActivityFailed"),
    ActivityScheduled("ActivityScheduled"),
    ActivityScheduleFailed("ActivityScheduleFailed"),
    ActivityStarted("ActivityStarted"),
    ActivitySucceeded("ActivitySucceeded"),
    ActivityTimedOut("ActivityTimedOut"),
    ChoiceStateEntered("ChoiceStateEntered"),
    ChoiceStateExited("ChoiceStateExited"),
    ExecutionAborted("ExecutionAborted"),
    ExecutionFailed("ExecutionFailed"),
    ExecutionStarted("ExecutionStarted"),
    ExecutionSucceeded("ExecutionSucceeded"),
    ExecutionTimedOut("ExecutionTimedOut"),
    FailStateEntered("FailStateEntered"),
    LambdaFunctionFailed("LambdaFunctionFailed"),
    LambdaFunctionScheduled("LambdaFunctionScheduled"),
    LambdaFunctionScheduleFailed("LambdaFunctionScheduleFailed"),
    LambdaFunctionStarted("LambdaFunctionStarted"),
    LambdaFunctionStartFailed("LambdaFunctionStartFailed"),
    LambdaFunctionSucceeded("LambdaFunctionSucceeded"),
    LambdaFunctionTimedOut("LambdaFunctionTimedOut"),
    MapIterationAborted("MapIterationAborted"),
    MapIterationFailed("MapIterationFailed"),
    MapIterationStarted("MapIterationStarted"),
    MapIterationSucceeded("MapIterationSucceeded"),
    MapStateAborted("MapStateAborted"),
    MapStateEntered("MapStateEntered"),
    MapStateExited("MapStateExited"),
    MapStateFailed("MapStateFailed"),
    MapStateStarted("MapStateStarted"),
    MapStateSucceeded("MapStateSucceeded"),
    ParallelStateAborted("ParallelStateAborted"),
    ParallelStateEntered("ParallelStateEntered"),
    ParallelStateExited("ParallelStateExited"),
    ParallelStateFailed("ParallelStateFailed"),
    ParallelStateStarted("ParallelStateStarted"),
    ParallelStateSucceeded("ParallelStateSucceeded"),
    PassStateEntered("PassStateEntered"),
    PassStateExited("PassStateExited"),
    SucceedStateEntered("SucceedStateEntered"),
    SucceedStateExited("SucceedStateExited"),
    TaskFailed("TaskFailed"),
    TaskScheduled("TaskScheduled"),
    TaskStarted("TaskStarted"),
    TaskStartFailed("TaskStartFailed"),
    TaskStateAborted("TaskStateAborted"),
    TaskStateEntered("TaskStateEntered"),
    TaskStateExited("TaskStateExited"),
    TaskSubmitFailed("TaskSubmitFailed"),
    TaskSubmitted("TaskSubmitted"),
    TaskSucceeded("TaskSucceeded"),
    TaskTimedOut("TaskTimedOut"),
    WaitStateAborted("WaitStateAborted"),
    WaitStateEntered("WaitStateEntered"),
    WaitStateExited("WaitStateExited");

    private String value;

    private HistoryEventType(String value) {
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
     * @return HistoryEventType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static HistoryEventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (HistoryEventType enumEntry : HistoryEventType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
