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
package com.amazonaws.services.simpleworkflow.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum EventType {

    WorkflowExecutionStarted("WorkflowExecutionStarted"),
    WorkflowExecutionCancelRequested("WorkflowExecutionCancelRequested"),
    WorkflowExecutionCompleted("WorkflowExecutionCompleted"),
    CompleteWorkflowExecutionFailed("CompleteWorkflowExecutionFailed"),
    WorkflowExecutionFailed("WorkflowExecutionFailed"),
    FailWorkflowExecutionFailed("FailWorkflowExecutionFailed"),
    WorkflowExecutionTimedOut("WorkflowExecutionTimedOut"),
    WorkflowExecutionCanceled("WorkflowExecutionCanceled"),
    CancelWorkflowExecutionFailed("CancelWorkflowExecutionFailed"),
    WorkflowExecutionContinuedAsNew("WorkflowExecutionContinuedAsNew"),
    ContinueAsNewWorkflowExecutionFailed("ContinueAsNewWorkflowExecutionFailed"),
    WorkflowExecutionTerminated("WorkflowExecutionTerminated"),
    DecisionTaskScheduled("DecisionTaskScheduled"),
    DecisionTaskStarted("DecisionTaskStarted"),
    DecisionTaskCompleted("DecisionTaskCompleted"),
    DecisionTaskTimedOut("DecisionTaskTimedOut"),
    ActivityTaskScheduled("ActivityTaskScheduled"),
    ScheduleActivityTaskFailed("ScheduleActivityTaskFailed"),
    ActivityTaskStarted("ActivityTaskStarted"),
    ActivityTaskCompleted("ActivityTaskCompleted"),
    ActivityTaskFailed("ActivityTaskFailed"),
    ActivityTaskTimedOut("ActivityTaskTimedOut"),
    ActivityTaskCanceled("ActivityTaskCanceled"),
    ActivityTaskCancelRequested("ActivityTaskCancelRequested"),
    RequestCancelActivityTaskFailed("RequestCancelActivityTaskFailed"),
    WorkflowExecutionSignaled("WorkflowExecutionSignaled"),
    MarkerRecorded("MarkerRecorded"),
    RecordMarkerFailed("RecordMarkerFailed"),
    TimerStarted("TimerStarted"),
    StartTimerFailed("StartTimerFailed"),
    TimerFired("TimerFired"),
    TimerCanceled("TimerCanceled"),
    CancelTimerFailed("CancelTimerFailed"),
    StartChildWorkflowExecutionInitiated("StartChildWorkflowExecutionInitiated"),
    StartChildWorkflowExecutionFailed("StartChildWorkflowExecutionFailed"),
    ChildWorkflowExecutionStarted("ChildWorkflowExecutionStarted"),
    ChildWorkflowExecutionCompleted("ChildWorkflowExecutionCompleted"),
    ChildWorkflowExecutionFailed("ChildWorkflowExecutionFailed"),
    ChildWorkflowExecutionTimedOut("ChildWorkflowExecutionTimedOut"),
    ChildWorkflowExecutionCanceled("ChildWorkflowExecutionCanceled"),
    ChildWorkflowExecutionTerminated("ChildWorkflowExecutionTerminated"),
    SignalExternalWorkflowExecutionInitiated("SignalExternalWorkflowExecutionInitiated"),
    SignalExternalWorkflowExecutionFailed("SignalExternalWorkflowExecutionFailed"),
    ExternalWorkflowExecutionSignaled("ExternalWorkflowExecutionSignaled"),
    RequestCancelExternalWorkflowExecutionInitiated("RequestCancelExternalWorkflowExecutionInitiated"),
    RequestCancelExternalWorkflowExecutionFailed("RequestCancelExternalWorkflowExecutionFailed"),
    ExternalWorkflowExecutionCancelRequested("ExternalWorkflowExecutionCancelRequested"),
    LambdaFunctionScheduled("LambdaFunctionScheduled"),
    LambdaFunctionStarted("LambdaFunctionStarted"),
    LambdaFunctionCompleted("LambdaFunctionCompleted"),
    LambdaFunctionFailed("LambdaFunctionFailed"),
    LambdaFunctionTimedOut("LambdaFunctionTimedOut"),
    ScheduleLambdaFunctionFailed("ScheduleLambdaFunctionFailed"),
    StartLambdaFunctionFailed("StartLambdaFunctionFailed");

    private String value;

    private EventType(String value) {
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
     * @return EventType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static EventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (EventType enumEntry : EventType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
