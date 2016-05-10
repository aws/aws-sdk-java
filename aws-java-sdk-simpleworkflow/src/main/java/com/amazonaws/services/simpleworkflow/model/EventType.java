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

package com.amazonaws.services.simpleworkflow.model;

/**
 * 
 */
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
    SignalExternalWorkflowExecutionInitiated(
            "SignalExternalWorkflowExecutionInitiated"),
    SignalExternalWorkflowExecutionFailed(
            "SignalExternalWorkflowExecutionFailed"),
    ExternalWorkflowExecutionSignaled("ExternalWorkflowExecutionSignaled"),
    RequestCancelExternalWorkflowExecutionInitiated(
            "RequestCancelExternalWorkflowExecutionInitiated"),
    RequestCancelExternalWorkflowExecutionFailed(
            "RequestCancelExternalWorkflowExecutionFailed"),
    ExternalWorkflowExecutionCancelRequested(
            "ExternalWorkflowExecutionCancelRequested"),
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
     */
    public static EventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("WorkflowExecutionStarted".equals(value)) {
            return WorkflowExecutionStarted;
        } else if ("WorkflowExecutionCancelRequested".equals(value)) {
            return WorkflowExecutionCancelRequested;
        } else if ("WorkflowExecutionCompleted".equals(value)) {
            return WorkflowExecutionCompleted;
        } else if ("CompleteWorkflowExecutionFailed".equals(value)) {
            return CompleteWorkflowExecutionFailed;
        } else if ("WorkflowExecutionFailed".equals(value)) {
            return WorkflowExecutionFailed;
        } else if ("FailWorkflowExecutionFailed".equals(value)) {
            return FailWorkflowExecutionFailed;
        } else if ("WorkflowExecutionTimedOut".equals(value)) {
            return WorkflowExecutionTimedOut;
        } else if ("WorkflowExecutionCanceled".equals(value)) {
            return WorkflowExecutionCanceled;
        } else if ("CancelWorkflowExecutionFailed".equals(value)) {
            return CancelWorkflowExecutionFailed;
        } else if ("WorkflowExecutionContinuedAsNew".equals(value)) {
            return WorkflowExecutionContinuedAsNew;
        } else if ("ContinueAsNewWorkflowExecutionFailed".equals(value)) {
            return ContinueAsNewWorkflowExecutionFailed;
        } else if ("WorkflowExecutionTerminated".equals(value)) {
            return WorkflowExecutionTerminated;
        } else if ("DecisionTaskScheduled".equals(value)) {
            return DecisionTaskScheduled;
        } else if ("DecisionTaskStarted".equals(value)) {
            return DecisionTaskStarted;
        } else if ("DecisionTaskCompleted".equals(value)) {
            return DecisionTaskCompleted;
        } else if ("DecisionTaskTimedOut".equals(value)) {
            return DecisionTaskTimedOut;
        } else if ("ActivityTaskScheduled".equals(value)) {
            return ActivityTaskScheduled;
        } else if ("ScheduleActivityTaskFailed".equals(value)) {
            return ScheduleActivityTaskFailed;
        } else if ("ActivityTaskStarted".equals(value)) {
            return ActivityTaskStarted;
        } else if ("ActivityTaskCompleted".equals(value)) {
            return ActivityTaskCompleted;
        } else if ("ActivityTaskFailed".equals(value)) {
            return ActivityTaskFailed;
        } else if ("ActivityTaskTimedOut".equals(value)) {
            return ActivityTaskTimedOut;
        } else if ("ActivityTaskCanceled".equals(value)) {
            return ActivityTaskCanceled;
        } else if ("ActivityTaskCancelRequested".equals(value)) {
            return ActivityTaskCancelRequested;
        } else if ("RequestCancelActivityTaskFailed".equals(value)) {
            return RequestCancelActivityTaskFailed;
        } else if ("WorkflowExecutionSignaled".equals(value)) {
            return WorkflowExecutionSignaled;
        } else if ("MarkerRecorded".equals(value)) {
            return MarkerRecorded;
        } else if ("RecordMarkerFailed".equals(value)) {
            return RecordMarkerFailed;
        } else if ("TimerStarted".equals(value)) {
            return TimerStarted;
        } else if ("StartTimerFailed".equals(value)) {
            return StartTimerFailed;
        } else if ("TimerFired".equals(value)) {
            return TimerFired;
        } else if ("TimerCanceled".equals(value)) {
            return TimerCanceled;
        } else if ("CancelTimerFailed".equals(value)) {
            return CancelTimerFailed;
        } else if ("StartChildWorkflowExecutionInitiated".equals(value)) {
            return StartChildWorkflowExecutionInitiated;
        } else if ("StartChildWorkflowExecutionFailed".equals(value)) {
            return StartChildWorkflowExecutionFailed;
        } else if ("ChildWorkflowExecutionStarted".equals(value)) {
            return ChildWorkflowExecutionStarted;
        } else if ("ChildWorkflowExecutionCompleted".equals(value)) {
            return ChildWorkflowExecutionCompleted;
        } else if ("ChildWorkflowExecutionFailed".equals(value)) {
            return ChildWorkflowExecutionFailed;
        } else if ("ChildWorkflowExecutionTimedOut".equals(value)) {
            return ChildWorkflowExecutionTimedOut;
        } else if ("ChildWorkflowExecutionCanceled".equals(value)) {
            return ChildWorkflowExecutionCanceled;
        } else if ("ChildWorkflowExecutionTerminated".equals(value)) {
            return ChildWorkflowExecutionTerminated;
        } else if ("SignalExternalWorkflowExecutionInitiated".equals(value)) {
            return SignalExternalWorkflowExecutionInitiated;
        } else if ("SignalExternalWorkflowExecutionFailed".equals(value)) {
            return SignalExternalWorkflowExecutionFailed;
        } else if ("ExternalWorkflowExecutionSignaled".equals(value)) {
            return ExternalWorkflowExecutionSignaled;
        } else if ("RequestCancelExternalWorkflowExecutionInitiated"
                .equals(value)) {
            return RequestCancelExternalWorkflowExecutionInitiated;
        } else if ("RequestCancelExternalWorkflowExecutionFailed".equals(value)) {
            return RequestCancelExternalWorkflowExecutionFailed;
        } else if ("ExternalWorkflowExecutionCancelRequested".equals(value)) {
            return ExternalWorkflowExecutionCancelRequested;
        } else if ("LambdaFunctionScheduled".equals(value)) {
            return LambdaFunctionScheduled;
        } else if ("LambdaFunctionStarted".equals(value)) {
            return LambdaFunctionStarted;
        } else if ("LambdaFunctionCompleted".equals(value)) {
            return LambdaFunctionCompleted;
        } else if ("LambdaFunctionFailed".equals(value)) {
            return LambdaFunctionFailed;
        } else if ("LambdaFunctionTimedOut".equals(value)) {
            return LambdaFunctionTimedOut;
        } else if ("ScheduleLambdaFunctionFailed".equals(value)) {
            return ScheduleLambdaFunctionFailed;
        } else if ("StartLambdaFunctionFailed".equals(value)) {
            return StartLambdaFunctionFailed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}