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
 * Event Type
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
    ExternalWorkflowExecutionCancelRequested("ExternalWorkflowExecutionCancelRequested");

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
     *            real value
     * @return EventType corresponding to the value
     */
    public static EventType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("WorkflowExecutionStarted".equals(value)) {
            return EventType.WorkflowExecutionStarted;
        } else if ("WorkflowExecutionCancelRequested".equals(value)) {
            return EventType.WorkflowExecutionCancelRequested;
        } else if ("WorkflowExecutionCompleted".equals(value)) {
            return EventType.WorkflowExecutionCompleted;
        } else if ("CompleteWorkflowExecutionFailed".equals(value)) {
            return EventType.CompleteWorkflowExecutionFailed;
        } else if ("WorkflowExecutionFailed".equals(value)) {
            return EventType.WorkflowExecutionFailed;
        } else if ("FailWorkflowExecutionFailed".equals(value)) {
            return EventType.FailWorkflowExecutionFailed;
        } else if ("WorkflowExecutionTimedOut".equals(value)) {
            return EventType.WorkflowExecutionTimedOut;
        } else if ("WorkflowExecutionCanceled".equals(value)) {
            return EventType.WorkflowExecutionCanceled;
        } else if ("CancelWorkflowExecutionFailed".equals(value)) {
            return EventType.CancelWorkflowExecutionFailed;
        } else if ("WorkflowExecutionContinuedAsNew".equals(value)) {
            return EventType.WorkflowExecutionContinuedAsNew;
        } else if ("ContinueAsNewWorkflowExecutionFailed".equals(value)) {
            return EventType.ContinueAsNewWorkflowExecutionFailed;
        } else if ("WorkflowExecutionTerminated".equals(value)) {
            return EventType.WorkflowExecutionTerminated;
        } else if ("DecisionTaskScheduled".equals(value)) {
            return EventType.DecisionTaskScheduled;
        } else if ("DecisionTaskStarted".equals(value)) {
            return EventType.DecisionTaskStarted;
        } else if ("DecisionTaskCompleted".equals(value)) {
            return EventType.DecisionTaskCompleted;
        } else if ("DecisionTaskTimedOut".equals(value)) {
            return EventType.DecisionTaskTimedOut;
        } else if ("ActivityTaskScheduled".equals(value)) {
            return EventType.ActivityTaskScheduled;
        } else if ("ScheduleActivityTaskFailed".equals(value)) {
            return EventType.ScheduleActivityTaskFailed;
        } else if ("ActivityTaskStarted".equals(value)) {
            return EventType.ActivityTaskStarted;
        } else if ("ActivityTaskCompleted".equals(value)) {
            return EventType.ActivityTaskCompleted;
        } else if ("ActivityTaskFailed".equals(value)) {
            return EventType.ActivityTaskFailed;
        } else if ("ActivityTaskTimedOut".equals(value)) {
            return EventType.ActivityTaskTimedOut;
        } else if ("ActivityTaskCanceled".equals(value)) {
            return EventType.ActivityTaskCanceled;
        } else if ("ActivityTaskCancelRequested".equals(value)) {
            return EventType.ActivityTaskCancelRequested;
        } else if ("RequestCancelActivityTaskFailed".equals(value)) {
            return EventType.RequestCancelActivityTaskFailed;
        } else if ("WorkflowExecutionSignaled".equals(value)) {
            return EventType.WorkflowExecutionSignaled;
        } else if ("MarkerRecorded".equals(value)) {
            return EventType.MarkerRecorded;
        } else if ("TimerStarted".equals(value)) {
            return EventType.TimerStarted;
        } else if ("StartTimerFailed".equals(value)) {
            return EventType.StartTimerFailed;
        } else if ("TimerFired".equals(value)) {
            return EventType.TimerFired;
        } else if ("TimerCanceled".equals(value)) {
            return EventType.TimerCanceled;
        } else if ("CancelTimerFailed".equals(value)) {
            return EventType.CancelTimerFailed;
        } else if ("StartChildWorkflowExecutionInitiated".equals(value)) {
            return EventType.StartChildWorkflowExecutionInitiated;
        } else if ("StartChildWorkflowExecutionFailed".equals(value)) {
            return EventType.StartChildWorkflowExecutionFailed;
        } else if ("ChildWorkflowExecutionStarted".equals(value)) {
            return EventType.ChildWorkflowExecutionStarted;
        } else if ("ChildWorkflowExecutionCompleted".equals(value)) {
            return EventType.ChildWorkflowExecutionCompleted;
        } else if ("ChildWorkflowExecutionFailed".equals(value)) {
            return EventType.ChildWorkflowExecutionFailed;
        } else if ("ChildWorkflowExecutionTimedOut".equals(value)) {
            return EventType.ChildWorkflowExecutionTimedOut;
        } else if ("ChildWorkflowExecutionCanceled".equals(value)) {
            return EventType.ChildWorkflowExecutionCanceled;
        } else if ("ChildWorkflowExecutionTerminated".equals(value)) {
            return EventType.ChildWorkflowExecutionTerminated;
        } else if ("SignalExternalWorkflowExecutionInitiated".equals(value)) {
            return EventType.SignalExternalWorkflowExecutionInitiated;
        } else if ("SignalExternalWorkflowExecutionFailed".equals(value)) {
            return EventType.SignalExternalWorkflowExecutionFailed;
        } else if ("ExternalWorkflowExecutionSignaled".equals(value)) {
            return EventType.ExternalWorkflowExecutionSignaled;
        } else if ("RequestCancelExternalWorkflowExecutionInitiated".equals(value)) {
            return EventType.RequestCancelExternalWorkflowExecutionInitiated;
        } else if ("RequestCancelExternalWorkflowExecutionFailed".equals(value)) {
            return EventType.RequestCancelExternalWorkflowExecutionFailed;
        } else if ("ExternalWorkflowExecutionCancelRequested".equals(value)) {
            return EventType.ExternalWorkflowExecutionCancelRequested;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    