/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    ActivityScheduleFailed("ActivityScheduleFailed"),
    ActivityScheduled("ActivityScheduled"),
    ActivityStarted("ActivityStarted"),
    ActivitySucceeded("ActivitySucceeded"),
    ActivityTimedOut("ActivityTimedOut"),
    ChoiceStateEntered("ChoiceStateEntered"),
    ChoiceStateExited("ChoiceStateExited"),
    TaskFailed("TaskFailed"),
    TaskScheduled("TaskScheduled"),
    TaskStartFailed("TaskStartFailed"),
    TaskStarted("TaskStarted"),
    TaskSubmitFailed("TaskSubmitFailed"),
    TaskSubmitted("TaskSubmitted"),
    TaskSucceeded("TaskSucceeded"),
    TaskTimedOut("TaskTimedOut"),
    ExecutionFailed("ExecutionFailed"),
    ExecutionStarted("ExecutionStarted"),
    ExecutionSucceeded("ExecutionSucceeded"),
    ExecutionAborted("ExecutionAborted"),
    ExecutionTimedOut("ExecutionTimedOut"),
    FailStateEntered("FailStateEntered"),
    LambdaFunctionFailed("LambdaFunctionFailed"),
    LambdaFunctionScheduleFailed("LambdaFunctionScheduleFailed"),
    LambdaFunctionScheduled("LambdaFunctionScheduled"),
    LambdaFunctionStartFailed("LambdaFunctionStartFailed"),
    LambdaFunctionStarted("LambdaFunctionStarted"),
    LambdaFunctionSucceeded("LambdaFunctionSucceeded"),
    LambdaFunctionTimedOut("LambdaFunctionTimedOut"),
    SucceedStateEntered("SucceedStateEntered"),
    SucceedStateExited("SucceedStateExited"),
    TaskStateAborted("TaskStateAborted"),
    TaskStateEntered("TaskStateEntered"),
    TaskStateExited("TaskStateExited"),
    PassStateEntered("PassStateEntered"),
    PassStateExited("PassStateExited"),
    ParallelStateAborted("ParallelStateAborted"),
    ParallelStateEntered("ParallelStateEntered"),
    ParallelStateExited("ParallelStateExited"),
    ParallelStateFailed("ParallelStateFailed"),
    ParallelStateStarted("ParallelStateStarted"),
    ParallelStateSucceeded("ParallelStateSucceeded"),
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
