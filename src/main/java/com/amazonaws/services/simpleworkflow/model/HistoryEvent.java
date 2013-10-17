/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * Event within a workflow execution. A history event can be one of these types:
 * </p>
 * 
 * <ul>
 * <li> <b>WorkflowExecutionStarted</b> : The workflow execution was started. </li>
 * <li> <b>WorkflowExecutionCompleted</b> : The workflow execution was closed due to successful completion. </li>
 * <li> <b>WorkflowExecutionFailed</b> : The workflow execution closed due to a failure. </li>
 * <li> <b>WorkflowExecutionTimedOut</b> : The workflow execution was closed because a time out was exceeded. </li>
 * <li> <b>WorkflowExecutionCanceled</b> : The workflow execution was successfully canceled and closed. </li>
 * <li> <b>WorkflowExecutionTerminated</b> : The workflow execution was terminated. </li>
 * <li> <b>WorkflowExecutionContinuedAsNew</b> : The workflow execution was closed and a new execution of the same type was created with the same
 * workflowId. </li>
 * <li> <b>WorkflowExecutionCancelRequested</b> : A request to cancel this workflow execution was made. </li>
 * <li> <b>DecisionTaskScheduled</b> : A decision task was scheduled for the workflow execution. </li>
 * <li> <b>DecisionTaskStarted</b> : The decision task was dispatched to a decider. </li>
 * <li> <b>DecisionTaskCompleted</b> : The decider successfully completed a decision task by calling RespondDecisionTaskCompleted. </li>
 * <li> <b>DecisionTaskTimedOut</b> : The decision task timed out. </li>
 * <li> <b>ActivityTaskScheduled</b> : An activity task was scheduled for execution. </li>
 * <li> <b>ScheduleActivityTaskFailed</b> : Failed to process ScheduleActivityTask decision. This happens when the decision is not configured properly,
 * for example the activity type specified is not registered. </li>
 * <li> <b>ActivityTaskStarted</b> : The scheduled activity task was dispatched to a worker. </li>
 * <li> <b>ActivityTaskCompleted</b> : An activity worker successfully completed an activity task by calling RespondActivityTaskCompleted. </li>
 * <li> <b>ActivityTaskFailed</b> : An activity worker failed an activity task by calling RespondActivityTaskFailed. </li>
 * <li> <b>ActivityTaskTimedOut</b> : The activity task timed out. </li>
 * <li> <b>ActivityTaskCanceled</b> : The activity task was successfully canceled. </li>
 * <li> <b>ActivityTaskCancelRequested</b> : A <code>RequestCancelActivityTask</code> decision was received by the system. </li>
 * <li> <b>RequestCancelActivityTaskFailed</b> : Failed to process RequestCancelActivityTask decision. This happens when the decision is not configured
 * properly. </li>
 * <li> <b>WorkflowExecutionSignaled</b> : An external signal was received for the workflow execution. </li>
 * <li> <b>MarkerRecorded</b> : A marker was recorded in the workflow history as the result of a <code>RecordMarker</code> decision. </li>
 * <li> <b>TimerStarted</b> : A timer was started for the workflow execution due to a <code>StartTimer</code> decision. </li>
 * <li> <b>StartTimerFailed</b> : Failed to process StartTimer decision. This happens when the decision is not configured properly, for example a timer
 * already exists with the specified timer Id. </li>
 * <li> <b>TimerFired</b> : A timer, previously started for this workflow execution, fired. </li>
 * <li> <b>TimerCanceled</b> : A timer, previously started for this workflow execution, was successfully canceled. </li>
 * <li> <b>CancelTimerFailed</b> : Failed to process CancelTimer decision. This happens when the decision is not configured properly, for example no
 * timer exists with the specified timer Id. </li>
 * <li> <b>StartChildWorkflowExecutionInitiated</b> : A request was made to start a child workflow execution. </li>
 * <li> <b>StartChildWorkflowExecutionFailed</b> : Failed to process StartChildWorkflowExecution decision. This happens when the decision is not
 * configured properly, for example the workflow type specified is not registered. </li>
 * <li> <b>ChildWorkflowExecutionStarted</b> : A child workflow execution was successfully started. </li>
 * <li> <b>ChildWorkflowExecutionCompleted</b> : A child workflow execution, started by this workflow execution, completed successfully and was closed.
 * </li>
 * <li> <b>ChildWorkflowExecutionFailed</b> : A child workflow execution, started by this workflow execution, failed to complete successfully and was
 * closed. </li>
 * <li> <b>ChildWorkflowExecutionTimedOut</b> : A child workflow execution, started by this workflow execution, timed out and was closed. </li>
 * <li> <b>ChildWorkflowExecutionCanceled</b> : A child workflow execution, started by this workflow execution, was canceled and closed. </li>
 * <li> <b>ChildWorkflowExecutionTerminated</b> : A child workflow execution, started by this workflow execution, was terminated. </li>
 * <li> <b>SignalExternalWorkflowExecutionInitiated</b> : A request to signal an external workflow was made. </li>
 * <li> <b>ExternalWorkflowExecutionSignaled</b> : A signal, requested by this workflow execution, was successfully delivered to the target external
 * workflow execution. </li>
 * <li> <b>SignalExternalWorkflowExecutionFailed</b> : The request to signal an external workflow execution failed. </li>
 * <li> <b>RequestCancelExternalWorkflowExecutionInitiated</b> : A request was made to request the cancellation of an external workflow execution. </li>
 * <li> <b>ExternalWorkflowExecutionCancelRequested</b> : Request to cancel an external workflow execution was successfully delivered to the target
 * execution. </li>
 * <li> <b>RequestCancelExternalWorkflowExecutionFailed</b> : Request to cancel an external workflow execution failed. </li>
 * 
 * </ul>
 */
public class HistoryEvent implements Serializable {

    /**
     * The date and time when the event occurred.
     */
    private java.util.Date eventTimestamp;

    /**
     * The type of the history event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WorkflowExecutionStarted, WorkflowExecutionCancelRequested, WorkflowExecutionCompleted, CompleteWorkflowExecutionFailed, WorkflowExecutionFailed, FailWorkflowExecutionFailed, WorkflowExecutionTimedOut, WorkflowExecutionCanceled, CancelWorkflowExecutionFailed, WorkflowExecutionContinuedAsNew, ContinueAsNewWorkflowExecutionFailed, WorkflowExecutionTerminated, DecisionTaskScheduled, DecisionTaskStarted, DecisionTaskCompleted, DecisionTaskTimedOut, ActivityTaskScheduled, ScheduleActivityTaskFailed, ActivityTaskStarted, ActivityTaskCompleted, ActivityTaskFailed, ActivityTaskTimedOut, ActivityTaskCanceled, ActivityTaskCancelRequested, RequestCancelActivityTaskFailed, WorkflowExecutionSignaled, MarkerRecorded, RecordMarkerFailed, TimerStarted, StartTimerFailed, TimerFired, TimerCanceled, CancelTimerFailed, StartChildWorkflowExecutionInitiated, StartChildWorkflowExecutionFailed, ChildWorkflowExecutionStarted, ChildWorkflowExecutionCompleted, ChildWorkflowExecutionFailed, ChildWorkflowExecutionTimedOut, ChildWorkflowExecutionCanceled, ChildWorkflowExecutionTerminated, SignalExternalWorkflowExecutionInitiated, SignalExternalWorkflowExecutionFailed, ExternalWorkflowExecutionSignaled, RequestCancelExternalWorkflowExecutionInitiated, RequestCancelExternalWorkflowExecutionFailed, ExternalWorkflowExecutionCancelRequested
     */
    private String eventType;

    /**
     * The system generated id of the event. This id uniquely identifies the
     * event with in the workflow execution history.
     */
    private Long eventId;

    /**
     * If the event is of type <code>WorkflowExecutionStarted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private WorkflowExecutionStartedEventAttributes workflowExecutionStartedEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionCompleted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private WorkflowExecutionCompletedEventAttributes workflowExecutionCompletedEventAttributes;

    /**
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private CompleteWorkflowExecutionFailedEventAttributes completeWorkflowExecutionFailedEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private WorkflowExecutionFailedEventAttributes workflowExecutionFailedEventAttributes;

    /**
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private FailWorkflowExecutionFailedEventAttributes failWorkflowExecutionFailedEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private WorkflowExecutionTimedOutEventAttributes workflowExecutionTimedOutEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionCanceled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private WorkflowExecutionCanceledEventAttributes workflowExecutionCanceledEventAttributes;

    /**
     * If the event is of type <code>CancelWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private CancelWorkflowExecutionFailedEventAttributes cancelWorkflowExecutionFailedEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private WorkflowExecutionContinuedAsNewEventAttributes workflowExecutionContinuedAsNewEventAttributes;

    /**
     * If the event is of type
     * <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     */
    private ContinueAsNewWorkflowExecutionFailedEventAttributes continueAsNewWorkflowExecutionFailedEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionTerminated</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private WorkflowExecutionTerminatedEventAttributes workflowExecutionTerminatedEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionCancelRequested</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private WorkflowExecutionCancelRequestedEventAttributes workflowExecutionCancelRequestedEventAttributes;

    /**
     * If the event is of type <code>DecisionTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private DecisionTaskScheduledEventAttributes decisionTaskScheduledEventAttributes;

    /**
     * If the event is of type <code>DecisionTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private DecisionTaskStartedEventAttributes decisionTaskStartedEventAttributes;

    /**
     * If the event is of type <code>DecisionTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private DecisionTaskCompletedEventAttributes decisionTaskCompletedEventAttributes;

    /**
     * If the event is of type <code>DecisionTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private DecisionTaskTimedOutEventAttributes decisionTaskTimedOutEventAttributes;

    /**
     * If the event is of type <code>ActivityTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes;

    /**
     * If the event is of type <code>ActivityTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private ActivityTaskStartedEventAttributes activityTaskStartedEventAttributes;

    /**
     * If the event is of type <code>ActivityTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes;

    /**
     * If the event is of type <code>ActivityTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private ActivityTaskFailedEventAttributes activityTaskFailedEventAttributes;

    /**
     * If the event is of type <code>ActivityTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private ActivityTaskTimedOutEventAttributes activityTaskTimedOutEventAttributes;

    /**
     * If the event is of type <code>ActivityTaskCanceled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes;

    /**
     * If the event is of type <code>ActivityTaskcancelRequested</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private ActivityTaskCancelRequestedEventAttributes activityTaskCancelRequestedEventAttributes;

    /**
     * If the event is of type <code>WorkflowExecutionSignaled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private WorkflowExecutionSignaledEventAttributes workflowExecutionSignaledEventAttributes;

    /**
     * If the event is of type <code>MarkerRecorded</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     */
    private MarkerRecordedEventAttributes markerRecordedEventAttributes;

    /**
     * If the event is of type <code>DecisionTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private RecordMarkerFailedEventAttributes recordMarkerFailedEventAttributes;

    /**
     * If the event is of type <code>TimerStarted</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     */
    private TimerStartedEventAttributes timerStartedEventAttributes;

    /**
     * If the event is of type <code>TimerFired</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     */
    private TimerFiredEventAttributes timerFiredEventAttributes;

    /**
     * If the event is of type <code>TimerCanceled</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     */
    private TimerCanceledEventAttributes timerCanceledEventAttributes;

    /**
     * If the event is of type
     * <code>StartChildWorkflowExecutionInitiated</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     */
    private StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes;

    /**
     * If the event is of type <code>ChildWorkflowExecutionStarted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private ChildWorkflowExecutionStartedEventAttributes childWorkflowExecutionStartedEventAttributes;

    /**
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private ChildWorkflowExecutionCompletedEventAttributes childWorkflowExecutionCompletedEventAttributes;

    /**
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes;

    /**
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private ChildWorkflowExecutionTimedOutEventAttributes childWorkflowExecutionTimedOutEventAttributes;

    /**
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private ChildWorkflowExecutionCanceledEventAttributes childWorkflowExecutionCanceledEventAttributes;

    /**
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private ChildWorkflowExecutionTerminatedEventAttributes childWorkflowExecutionTerminatedEventAttributes;

    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionInitiated</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     */
    private SignalExternalWorkflowExecutionInitiatedEventAttributes signalExternalWorkflowExecutionInitiatedEventAttributes;

    /**
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private ExternalWorkflowExecutionSignaledEventAttributes externalWorkflowExecutionSignaledEventAttributes;

    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     */
    private SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes;

    /**
     * If the event is of type
     * <code>ExternalWorkflowExecutionCancelRequested</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     */
    private ExternalWorkflowExecutionCancelRequestedEventAttributes externalWorkflowExecutionCancelRequestedEventAttributes;

    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private RequestCancelExternalWorkflowExecutionInitiatedEventAttributes requestCancelExternalWorkflowExecutionInitiatedEventAttributes;

    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private RequestCancelExternalWorkflowExecutionFailedEventAttributes requestCancelExternalWorkflowExecutionFailedEventAttributes;

    /**
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     */
    private ScheduleActivityTaskFailedEventAttributes scheduleActivityTaskFailedEventAttributes;

    /**
     * If the event is of type <code>RequestCancelActivityTaskFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private RequestCancelActivityTaskFailedEventAttributes requestCancelActivityTaskFailedEventAttributes;

    /**
     * If the event is of type <code>StartTimerFailed</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     */
    private StartTimerFailedEventAttributes startTimerFailedEventAttributes;

    /**
     * If the event is of type <code>CancelTimerFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     */
    private CancelTimerFailedEventAttributes cancelTimerFailedEventAttributes;

    /**
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     */
    private StartChildWorkflowExecutionFailedEventAttributes startChildWorkflowExecutionFailedEventAttributes;

    /**
     * The date and time when the event occurred.
     *
     * @return The date and time when the event occurred.
     */
    public java.util.Date getEventTimestamp() {
        return eventTimestamp;
    }
    
    /**
     * The date and time when the event occurred.
     *
     * @param eventTimestamp The date and time when the event occurred.
     */
    public void setEventTimestamp(java.util.Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }
    
    /**
     * The date and time when the event occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventTimestamp The date and time when the event occurred.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withEventTimestamp(java.util.Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
        return this;
    }

    /**
     * The type of the history event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WorkflowExecutionStarted, WorkflowExecutionCancelRequested, WorkflowExecutionCompleted, CompleteWorkflowExecutionFailed, WorkflowExecutionFailed, FailWorkflowExecutionFailed, WorkflowExecutionTimedOut, WorkflowExecutionCanceled, CancelWorkflowExecutionFailed, WorkflowExecutionContinuedAsNew, ContinueAsNewWorkflowExecutionFailed, WorkflowExecutionTerminated, DecisionTaskScheduled, DecisionTaskStarted, DecisionTaskCompleted, DecisionTaskTimedOut, ActivityTaskScheduled, ScheduleActivityTaskFailed, ActivityTaskStarted, ActivityTaskCompleted, ActivityTaskFailed, ActivityTaskTimedOut, ActivityTaskCanceled, ActivityTaskCancelRequested, RequestCancelActivityTaskFailed, WorkflowExecutionSignaled, MarkerRecorded, RecordMarkerFailed, TimerStarted, StartTimerFailed, TimerFired, TimerCanceled, CancelTimerFailed, StartChildWorkflowExecutionInitiated, StartChildWorkflowExecutionFailed, ChildWorkflowExecutionStarted, ChildWorkflowExecutionCompleted, ChildWorkflowExecutionFailed, ChildWorkflowExecutionTimedOut, ChildWorkflowExecutionCanceled, ChildWorkflowExecutionTerminated, SignalExternalWorkflowExecutionInitiated, SignalExternalWorkflowExecutionFailed, ExternalWorkflowExecutionSignaled, RequestCancelExternalWorkflowExecutionInitiated, RequestCancelExternalWorkflowExecutionFailed, ExternalWorkflowExecutionCancelRequested
     *
     * @return The type of the history event.
     *
     * @see EventType
     */
    public String getEventType() {
        return eventType;
    }
    
    /**
     * The type of the history event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WorkflowExecutionStarted, WorkflowExecutionCancelRequested, WorkflowExecutionCompleted, CompleteWorkflowExecutionFailed, WorkflowExecutionFailed, FailWorkflowExecutionFailed, WorkflowExecutionTimedOut, WorkflowExecutionCanceled, CancelWorkflowExecutionFailed, WorkflowExecutionContinuedAsNew, ContinueAsNewWorkflowExecutionFailed, WorkflowExecutionTerminated, DecisionTaskScheduled, DecisionTaskStarted, DecisionTaskCompleted, DecisionTaskTimedOut, ActivityTaskScheduled, ScheduleActivityTaskFailed, ActivityTaskStarted, ActivityTaskCompleted, ActivityTaskFailed, ActivityTaskTimedOut, ActivityTaskCanceled, ActivityTaskCancelRequested, RequestCancelActivityTaskFailed, WorkflowExecutionSignaled, MarkerRecorded, RecordMarkerFailed, TimerStarted, StartTimerFailed, TimerFired, TimerCanceled, CancelTimerFailed, StartChildWorkflowExecutionInitiated, StartChildWorkflowExecutionFailed, ChildWorkflowExecutionStarted, ChildWorkflowExecutionCompleted, ChildWorkflowExecutionFailed, ChildWorkflowExecutionTimedOut, ChildWorkflowExecutionCanceled, ChildWorkflowExecutionTerminated, SignalExternalWorkflowExecutionInitiated, SignalExternalWorkflowExecutionFailed, ExternalWorkflowExecutionSignaled, RequestCancelExternalWorkflowExecutionInitiated, RequestCancelExternalWorkflowExecutionFailed, ExternalWorkflowExecutionCancelRequested
     *
     * @param eventType The type of the history event.
     *
     * @see EventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    /**
     * The type of the history event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WorkflowExecutionStarted, WorkflowExecutionCancelRequested, WorkflowExecutionCompleted, CompleteWorkflowExecutionFailed, WorkflowExecutionFailed, FailWorkflowExecutionFailed, WorkflowExecutionTimedOut, WorkflowExecutionCanceled, CancelWorkflowExecutionFailed, WorkflowExecutionContinuedAsNew, ContinueAsNewWorkflowExecutionFailed, WorkflowExecutionTerminated, DecisionTaskScheduled, DecisionTaskStarted, DecisionTaskCompleted, DecisionTaskTimedOut, ActivityTaskScheduled, ScheduleActivityTaskFailed, ActivityTaskStarted, ActivityTaskCompleted, ActivityTaskFailed, ActivityTaskTimedOut, ActivityTaskCanceled, ActivityTaskCancelRequested, RequestCancelActivityTaskFailed, WorkflowExecutionSignaled, MarkerRecorded, RecordMarkerFailed, TimerStarted, StartTimerFailed, TimerFired, TimerCanceled, CancelTimerFailed, StartChildWorkflowExecutionInitiated, StartChildWorkflowExecutionFailed, ChildWorkflowExecutionStarted, ChildWorkflowExecutionCompleted, ChildWorkflowExecutionFailed, ChildWorkflowExecutionTimedOut, ChildWorkflowExecutionCanceled, ChildWorkflowExecutionTerminated, SignalExternalWorkflowExecutionInitiated, SignalExternalWorkflowExecutionFailed, ExternalWorkflowExecutionSignaled, RequestCancelExternalWorkflowExecutionInitiated, RequestCancelExternalWorkflowExecutionFailed, ExternalWorkflowExecutionCancelRequested
     *
     * @param eventType The type of the history event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EventType
     */
    public HistoryEvent withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The type of the history event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WorkflowExecutionStarted, WorkflowExecutionCancelRequested, WorkflowExecutionCompleted, CompleteWorkflowExecutionFailed, WorkflowExecutionFailed, FailWorkflowExecutionFailed, WorkflowExecutionTimedOut, WorkflowExecutionCanceled, CancelWorkflowExecutionFailed, WorkflowExecutionContinuedAsNew, ContinueAsNewWorkflowExecutionFailed, WorkflowExecutionTerminated, DecisionTaskScheduled, DecisionTaskStarted, DecisionTaskCompleted, DecisionTaskTimedOut, ActivityTaskScheduled, ScheduleActivityTaskFailed, ActivityTaskStarted, ActivityTaskCompleted, ActivityTaskFailed, ActivityTaskTimedOut, ActivityTaskCanceled, ActivityTaskCancelRequested, RequestCancelActivityTaskFailed, WorkflowExecutionSignaled, MarkerRecorded, RecordMarkerFailed, TimerStarted, StartTimerFailed, TimerFired, TimerCanceled, CancelTimerFailed, StartChildWorkflowExecutionInitiated, StartChildWorkflowExecutionFailed, ChildWorkflowExecutionStarted, ChildWorkflowExecutionCompleted, ChildWorkflowExecutionFailed, ChildWorkflowExecutionTimedOut, ChildWorkflowExecutionCanceled, ChildWorkflowExecutionTerminated, SignalExternalWorkflowExecutionInitiated, SignalExternalWorkflowExecutionFailed, ExternalWorkflowExecutionSignaled, RequestCancelExternalWorkflowExecutionInitiated, RequestCancelExternalWorkflowExecutionFailed, ExternalWorkflowExecutionCancelRequested
     *
     * @param eventType The type of the history event.
     *
     * @see EventType
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType.toString();
    }
    
    /**
     * The type of the history event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WorkflowExecutionStarted, WorkflowExecutionCancelRequested, WorkflowExecutionCompleted, CompleteWorkflowExecutionFailed, WorkflowExecutionFailed, FailWorkflowExecutionFailed, WorkflowExecutionTimedOut, WorkflowExecutionCanceled, CancelWorkflowExecutionFailed, WorkflowExecutionContinuedAsNew, ContinueAsNewWorkflowExecutionFailed, WorkflowExecutionTerminated, DecisionTaskScheduled, DecisionTaskStarted, DecisionTaskCompleted, DecisionTaskTimedOut, ActivityTaskScheduled, ScheduleActivityTaskFailed, ActivityTaskStarted, ActivityTaskCompleted, ActivityTaskFailed, ActivityTaskTimedOut, ActivityTaskCanceled, ActivityTaskCancelRequested, RequestCancelActivityTaskFailed, WorkflowExecutionSignaled, MarkerRecorded, RecordMarkerFailed, TimerStarted, StartTimerFailed, TimerFired, TimerCanceled, CancelTimerFailed, StartChildWorkflowExecutionInitiated, StartChildWorkflowExecutionFailed, ChildWorkflowExecutionStarted, ChildWorkflowExecutionCompleted, ChildWorkflowExecutionFailed, ChildWorkflowExecutionTimedOut, ChildWorkflowExecutionCanceled, ChildWorkflowExecutionTerminated, SignalExternalWorkflowExecutionInitiated, SignalExternalWorkflowExecutionFailed, ExternalWorkflowExecutionSignaled, RequestCancelExternalWorkflowExecutionInitiated, RequestCancelExternalWorkflowExecutionFailed, ExternalWorkflowExecutionCancelRequested
     *
     * @param eventType The type of the history event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EventType
     */
    public HistoryEvent withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * The system generated id of the event. This id uniquely identifies the
     * event with in the workflow execution history.
     *
     * @return The system generated id of the event. This id uniquely identifies the
     *         event with in the workflow execution history.
     */
    public Long getEventId() {
        return eventId;
    }
    
    /**
     * The system generated id of the event. This id uniquely identifies the
     * event with in the workflow execution history.
     *
     * @param eventId The system generated id of the event. This id uniquely identifies the
     *         event with in the workflow execution history.
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
    
    /**
     * The system generated id of the event. This id uniquely identifies the
     * event with in the workflow execution history.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventId The system generated id of the event. This id uniquely identifies the
     *         event with in the workflow execution history.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionStarted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionStarted</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public WorkflowExecutionStartedEventAttributes getWorkflowExecutionStartedEventAttributes() {
        return workflowExecutionStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionStarted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param workflowExecutionStartedEventAttributes If the event is of type <code>WorkflowExecutionStarted</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setWorkflowExecutionStartedEventAttributes(WorkflowExecutionStartedEventAttributes workflowExecutionStartedEventAttributes) {
        this.workflowExecutionStartedEventAttributes = workflowExecutionStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionStarted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionStartedEventAttributes If the event is of type <code>WorkflowExecutionStarted</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionStartedEventAttributes(WorkflowExecutionStartedEventAttributes workflowExecutionStartedEventAttributes) {
        this.workflowExecutionStartedEventAttributes = workflowExecutionStartedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionCompleted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionCompleted</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public WorkflowExecutionCompletedEventAttributes getWorkflowExecutionCompletedEventAttributes() {
        return workflowExecutionCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionCompleted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param workflowExecutionCompletedEventAttributes If the event is of type <code>WorkflowExecutionCompleted</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setWorkflowExecutionCompletedEventAttributes(WorkflowExecutionCompletedEventAttributes workflowExecutionCompletedEventAttributes) {
        this.workflowExecutionCompletedEventAttributes = workflowExecutionCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionCompleted</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionCompletedEventAttributes If the event is of type <code>WorkflowExecutionCompleted</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionCompletedEventAttributes(WorkflowExecutionCompletedEventAttributes workflowExecutionCompletedEventAttributes) {
        this.workflowExecutionCompletedEventAttributes = workflowExecutionCompletedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>CompleteWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public CompleteWorkflowExecutionFailedEventAttributes getCompleteWorkflowExecutionFailedEventAttributes() {
        return completeWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param completeWorkflowExecutionFailedEventAttributes If the event is of type <code>CompleteWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setCompleteWorkflowExecutionFailedEventAttributes(CompleteWorkflowExecutionFailedEventAttributes completeWorkflowExecutionFailedEventAttributes) {
        this.completeWorkflowExecutionFailedEventAttributes = completeWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completeWorkflowExecutionFailedEventAttributes If the event is of type <code>CompleteWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withCompleteWorkflowExecutionFailedEventAttributes(CompleteWorkflowExecutionFailedEventAttributes completeWorkflowExecutionFailedEventAttributes) {
        this.completeWorkflowExecutionFailedEventAttributes = completeWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public WorkflowExecutionFailedEventAttributes getWorkflowExecutionFailedEventAttributes() {
        return workflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param workflowExecutionFailedEventAttributes If the event is of type <code>WorkflowExecutionFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setWorkflowExecutionFailedEventAttributes(WorkflowExecutionFailedEventAttributes workflowExecutionFailedEventAttributes) {
        this.workflowExecutionFailedEventAttributes = workflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionFailedEventAttributes If the event is of type <code>WorkflowExecutionFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionFailedEventAttributes(WorkflowExecutionFailedEventAttributes workflowExecutionFailedEventAttributes) {
        this.workflowExecutionFailedEventAttributes = workflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>FailWorkflowExecutionFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public FailWorkflowExecutionFailedEventAttributes getFailWorkflowExecutionFailedEventAttributes() {
        return failWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param failWorkflowExecutionFailedEventAttributes If the event is of type <code>FailWorkflowExecutionFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setFailWorkflowExecutionFailedEventAttributes(FailWorkflowExecutionFailedEventAttributes failWorkflowExecutionFailedEventAttributes) {
        this.failWorkflowExecutionFailedEventAttributes = failWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failWorkflowExecutionFailedEventAttributes If the event is of type <code>FailWorkflowExecutionFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withFailWorkflowExecutionFailedEventAttributes(FailWorkflowExecutionFailedEventAttributes failWorkflowExecutionFailedEventAttributes) {
        this.failWorkflowExecutionFailedEventAttributes = failWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionTimedOut</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public WorkflowExecutionTimedOutEventAttributes getWorkflowExecutionTimedOutEventAttributes() {
        return workflowExecutionTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param workflowExecutionTimedOutEventAttributes If the event is of type <code>WorkflowExecutionTimedOut</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setWorkflowExecutionTimedOutEventAttributes(WorkflowExecutionTimedOutEventAttributes workflowExecutionTimedOutEventAttributes) {
        this.workflowExecutionTimedOutEventAttributes = workflowExecutionTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionTimedOutEventAttributes If the event is of type <code>WorkflowExecutionTimedOut</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionTimedOutEventAttributes(WorkflowExecutionTimedOutEventAttributes workflowExecutionTimedOutEventAttributes) {
        this.workflowExecutionTimedOutEventAttributes = workflowExecutionTimedOutEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionCanceled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionCanceled</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public WorkflowExecutionCanceledEventAttributes getWorkflowExecutionCanceledEventAttributes() {
        return workflowExecutionCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionCanceled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param workflowExecutionCanceledEventAttributes If the event is of type <code>WorkflowExecutionCanceled</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setWorkflowExecutionCanceledEventAttributes(WorkflowExecutionCanceledEventAttributes workflowExecutionCanceledEventAttributes) {
        this.workflowExecutionCanceledEventAttributes = workflowExecutionCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionCanceled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionCanceledEventAttributes If the event is of type <code>WorkflowExecutionCanceled</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionCanceledEventAttributes(WorkflowExecutionCanceledEventAttributes workflowExecutionCanceledEventAttributes) {
        this.workflowExecutionCanceledEventAttributes = workflowExecutionCanceledEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>CancelWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>CancelWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public CancelWorkflowExecutionFailedEventAttributes getCancelWorkflowExecutionFailedEventAttributes() {
        return cancelWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>CancelWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param cancelWorkflowExecutionFailedEventAttributes If the event is of type <code>CancelWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setCancelWorkflowExecutionFailedEventAttributes(CancelWorkflowExecutionFailedEventAttributes cancelWorkflowExecutionFailedEventAttributes) {
        this.cancelWorkflowExecutionFailedEventAttributes = cancelWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>CancelWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelWorkflowExecutionFailedEventAttributes If the event is of type <code>CancelWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withCancelWorkflowExecutionFailedEventAttributes(CancelWorkflowExecutionFailedEventAttributes cancelWorkflowExecutionFailedEventAttributes) {
        this.cancelWorkflowExecutionFailedEventAttributes = cancelWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionContinuedAsNew</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public WorkflowExecutionContinuedAsNewEventAttributes getWorkflowExecutionContinuedAsNewEventAttributes() {
        return workflowExecutionContinuedAsNewEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param workflowExecutionContinuedAsNewEventAttributes If the event is of type <code>WorkflowExecutionContinuedAsNew</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setWorkflowExecutionContinuedAsNewEventAttributes(WorkflowExecutionContinuedAsNewEventAttributes workflowExecutionContinuedAsNewEventAttributes) {
        this.workflowExecutionContinuedAsNewEventAttributes = workflowExecutionContinuedAsNewEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionContinuedAsNewEventAttributes If the event is of type <code>WorkflowExecutionContinuedAsNew</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionContinuedAsNewEventAttributes(WorkflowExecutionContinuedAsNewEventAttributes workflowExecutionContinuedAsNewEventAttributes) {
        this.workflowExecutionContinuedAsNewEventAttributes = workflowExecutionContinuedAsNewEventAttributes;
        return this;
    }

    /**
     * If the event is of type
     * <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @return If the event is of type
     *         <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public ContinueAsNewWorkflowExecutionFailedEventAttributes getContinueAsNewWorkflowExecutionFailedEventAttributes() {
        return continueAsNewWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @param continueAsNewWorkflowExecutionFailedEventAttributes If the event is of type
     *         <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public void setContinueAsNewWorkflowExecutionFailedEventAttributes(ContinueAsNewWorkflowExecutionFailedEventAttributes continueAsNewWorkflowExecutionFailedEventAttributes) {
        this.continueAsNewWorkflowExecutionFailedEventAttributes = continueAsNewWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param continueAsNewWorkflowExecutionFailedEventAttributes If the event is of type
     *         <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withContinueAsNewWorkflowExecutionFailedEventAttributes(ContinueAsNewWorkflowExecutionFailedEventAttributes continueAsNewWorkflowExecutionFailedEventAttributes) {
        this.continueAsNewWorkflowExecutionFailedEventAttributes = continueAsNewWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionTerminated</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionTerminated</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public WorkflowExecutionTerminatedEventAttributes getWorkflowExecutionTerminatedEventAttributes() {
        return workflowExecutionTerminatedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionTerminated</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param workflowExecutionTerminatedEventAttributes If the event is of type <code>WorkflowExecutionTerminated</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setWorkflowExecutionTerminatedEventAttributes(WorkflowExecutionTerminatedEventAttributes workflowExecutionTerminatedEventAttributes) {
        this.workflowExecutionTerminatedEventAttributes = workflowExecutionTerminatedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionTerminated</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionTerminatedEventAttributes If the event is of type <code>WorkflowExecutionTerminated</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionTerminatedEventAttributes(WorkflowExecutionTerminatedEventAttributes workflowExecutionTerminatedEventAttributes) {
        this.workflowExecutionTerminatedEventAttributes = workflowExecutionTerminatedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionCancelRequested</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionCancelRequested</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public WorkflowExecutionCancelRequestedEventAttributes getWorkflowExecutionCancelRequestedEventAttributes() {
        return workflowExecutionCancelRequestedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionCancelRequested</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param workflowExecutionCancelRequestedEventAttributes If the event is of type <code>WorkflowExecutionCancelRequested</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setWorkflowExecutionCancelRequestedEventAttributes(WorkflowExecutionCancelRequestedEventAttributes workflowExecutionCancelRequestedEventAttributes) {
        this.workflowExecutionCancelRequestedEventAttributes = workflowExecutionCancelRequestedEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionCancelRequested</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionCancelRequestedEventAttributes If the event is of type <code>WorkflowExecutionCancelRequested</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionCancelRequestedEventAttributes(WorkflowExecutionCancelRequestedEventAttributes workflowExecutionCancelRequestedEventAttributes) {
        this.workflowExecutionCancelRequestedEventAttributes = workflowExecutionCancelRequestedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>DecisionTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>DecisionTaskScheduled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public DecisionTaskScheduledEventAttributes getDecisionTaskScheduledEventAttributes() {
        return decisionTaskScheduledEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param decisionTaskScheduledEventAttributes If the event is of type <code>DecisionTaskScheduled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setDecisionTaskScheduledEventAttributes(DecisionTaskScheduledEventAttributes decisionTaskScheduledEventAttributes) {
        this.decisionTaskScheduledEventAttributes = decisionTaskScheduledEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskScheduledEventAttributes If the event is of type <code>DecisionTaskScheduled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withDecisionTaskScheduledEventAttributes(DecisionTaskScheduledEventAttributes decisionTaskScheduledEventAttributes) {
        this.decisionTaskScheduledEventAttributes = decisionTaskScheduledEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>DecisionTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>DecisionTaskStarted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public DecisionTaskStartedEventAttributes getDecisionTaskStartedEventAttributes() {
        return decisionTaskStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param decisionTaskStartedEventAttributes If the event is of type <code>DecisionTaskStarted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setDecisionTaskStartedEventAttributes(DecisionTaskStartedEventAttributes decisionTaskStartedEventAttributes) {
        this.decisionTaskStartedEventAttributes = decisionTaskStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskStartedEventAttributes If the event is of type <code>DecisionTaskStarted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withDecisionTaskStartedEventAttributes(DecisionTaskStartedEventAttributes decisionTaskStartedEventAttributes) {
        this.decisionTaskStartedEventAttributes = decisionTaskStartedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>DecisionTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>DecisionTaskCompleted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public DecisionTaskCompletedEventAttributes getDecisionTaskCompletedEventAttributes() {
        return decisionTaskCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param decisionTaskCompletedEventAttributes If the event is of type <code>DecisionTaskCompleted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setDecisionTaskCompletedEventAttributes(DecisionTaskCompletedEventAttributes decisionTaskCompletedEventAttributes) {
        this.decisionTaskCompletedEventAttributes = decisionTaskCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventAttributes If the event is of type <code>DecisionTaskCompleted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withDecisionTaskCompletedEventAttributes(DecisionTaskCompletedEventAttributes decisionTaskCompletedEventAttributes) {
        this.decisionTaskCompletedEventAttributes = decisionTaskCompletedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>DecisionTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>DecisionTaskTimedOut</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public DecisionTaskTimedOutEventAttributes getDecisionTaskTimedOutEventAttributes() {
        return decisionTaskTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param decisionTaskTimedOutEventAttributes If the event is of type <code>DecisionTaskTimedOut</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setDecisionTaskTimedOutEventAttributes(DecisionTaskTimedOutEventAttributes decisionTaskTimedOutEventAttributes) {
        this.decisionTaskTimedOutEventAttributes = decisionTaskTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskTimedOutEventAttributes If the event is of type <code>DecisionTaskTimedOut</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withDecisionTaskTimedOutEventAttributes(DecisionTaskTimedOutEventAttributes decisionTaskTimedOutEventAttributes) {
        this.decisionTaskTimedOutEventAttributes = decisionTaskTimedOutEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ActivityTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>ActivityTaskScheduled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public ActivityTaskScheduledEventAttributes getActivityTaskScheduledEventAttributes() {
        return activityTaskScheduledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param activityTaskScheduledEventAttributes If the event is of type <code>ActivityTaskScheduled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setActivityTaskScheduledEventAttributes(ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes) {
        this.activityTaskScheduledEventAttributes = activityTaskScheduledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskScheduled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityTaskScheduledEventAttributes If the event is of type <code>ActivityTaskScheduled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withActivityTaskScheduledEventAttributes(ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes) {
        this.activityTaskScheduledEventAttributes = activityTaskScheduledEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ActivityTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>ActivityTaskStarted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public ActivityTaskStartedEventAttributes getActivityTaskStartedEventAttributes() {
        return activityTaskStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param activityTaskStartedEventAttributes If the event is of type <code>ActivityTaskStarted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setActivityTaskStartedEventAttributes(ActivityTaskStartedEventAttributes activityTaskStartedEventAttributes) {
        this.activityTaskStartedEventAttributes = activityTaskStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskStarted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityTaskStartedEventAttributes If the event is of type <code>ActivityTaskStarted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withActivityTaskStartedEventAttributes(ActivityTaskStartedEventAttributes activityTaskStartedEventAttributes) {
        this.activityTaskStartedEventAttributes = activityTaskStartedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ActivityTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>ActivityTaskCompleted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public ActivityTaskCompletedEventAttributes getActivityTaskCompletedEventAttributes() {
        return activityTaskCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param activityTaskCompletedEventAttributes If the event is of type <code>ActivityTaskCompleted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setActivityTaskCompletedEventAttributes(ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes) {
        this.activityTaskCompletedEventAttributes = activityTaskCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskCompleted</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityTaskCompletedEventAttributes If the event is of type <code>ActivityTaskCompleted</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withActivityTaskCompletedEventAttributes(ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes) {
        this.activityTaskCompletedEventAttributes = activityTaskCompletedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ActivityTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>ActivityTaskFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public ActivityTaskFailedEventAttributes getActivityTaskFailedEventAttributes() {
        return activityTaskFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param activityTaskFailedEventAttributes If the event is of type <code>ActivityTaskFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setActivityTaskFailedEventAttributes(ActivityTaskFailedEventAttributes activityTaskFailedEventAttributes) {
        this.activityTaskFailedEventAttributes = activityTaskFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityTaskFailedEventAttributes If the event is of type <code>ActivityTaskFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withActivityTaskFailedEventAttributes(ActivityTaskFailedEventAttributes activityTaskFailedEventAttributes) {
        this.activityTaskFailedEventAttributes = activityTaskFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ActivityTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>ActivityTaskTimedOut</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public ActivityTaskTimedOutEventAttributes getActivityTaskTimedOutEventAttributes() {
        return activityTaskTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param activityTaskTimedOutEventAttributes If the event is of type <code>ActivityTaskTimedOut</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setActivityTaskTimedOutEventAttributes(ActivityTaskTimedOutEventAttributes activityTaskTimedOutEventAttributes) {
        this.activityTaskTimedOutEventAttributes = activityTaskTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskTimedOut</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityTaskTimedOutEventAttributes If the event is of type <code>ActivityTaskTimedOut</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withActivityTaskTimedOutEventAttributes(ActivityTaskTimedOutEventAttributes activityTaskTimedOutEventAttributes) {
        this.activityTaskTimedOutEventAttributes = activityTaskTimedOutEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ActivityTaskCanceled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>ActivityTaskCanceled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public ActivityTaskCanceledEventAttributes getActivityTaskCanceledEventAttributes() {
        return activityTaskCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskCanceled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param activityTaskCanceledEventAttributes If the event is of type <code>ActivityTaskCanceled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setActivityTaskCanceledEventAttributes(ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes) {
        this.activityTaskCanceledEventAttributes = activityTaskCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskCanceled</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityTaskCanceledEventAttributes If the event is of type <code>ActivityTaskCanceled</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withActivityTaskCanceledEventAttributes(ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes) {
        this.activityTaskCanceledEventAttributes = activityTaskCanceledEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ActivityTaskcancelRequested</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>ActivityTaskcancelRequested</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public ActivityTaskCancelRequestedEventAttributes getActivityTaskCancelRequestedEventAttributes() {
        return activityTaskCancelRequestedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskcancelRequested</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param activityTaskCancelRequestedEventAttributes If the event is of type <code>ActivityTaskcancelRequested</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setActivityTaskCancelRequestedEventAttributes(ActivityTaskCancelRequestedEventAttributes activityTaskCancelRequestedEventAttributes) {
        this.activityTaskCancelRequestedEventAttributes = activityTaskCancelRequestedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ActivityTaskcancelRequested</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityTaskCancelRequestedEventAttributes If the event is of type <code>ActivityTaskcancelRequested</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withActivityTaskCancelRequestedEventAttributes(ActivityTaskCancelRequestedEventAttributes activityTaskCancelRequestedEventAttributes) {
        this.activityTaskCancelRequestedEventAttributes = activityTaskCancelRequestedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>WorkflowExecutionSignaled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>WorkflowExecutionSignaled</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public WorkflowExecutionSignaledEventAttributes getWorkflowExecutionSignaledEventAttributes() {
        return workflowExecutionSignaledEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionSignaled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param workflowExecutionSignaledEventAttributes If the event is of type <code>WorkflowExecutionSignaled</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setWorkflowExecutionSignaledEventAttributes(WorkflowExecutionSignaledEventAttributes workflowExecutionSignaledEventAttributes) {
        this.workflowExecutionSignaledEventAttributes = workflowExecutionSignaledEventAttributes;
    }
    
    /**
     * If the event is of type <code>WorkflowExecutionSignaled</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowExecutionSignaledEventAttributes If the event is of type <code>WorkflowExecutionSignaled</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withWorkflowExecutionSignaledEventAttributes(WorkflowExecutionSignaledEventAttributes workflowExecutionSignaledEventAttributes) {
        this.workflowExecutionSignaledEventAttributes = workflowExecutionSignaledEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>MarkerRecorded</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @return If the event is of type <code>MarkerRecorded</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public MarkerRecordedEventAttributes getMarkerRecordedEventAttributes() {
        return markerRecordedEventAttributes;
    }
    
    /**
     * If the event is of type <code>MarkerRecorded</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @param markerRecordedEventAttributes If the event is of type <code>MarkerRecorded</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public void setMarkerRecordedEventAttributes(MarkerRecordedEventAttributes markerRecordedEventAttributes) {
        this.markerRecordedEventAttributes = markerRecordedEventAttributes;
    }
    
    /**
     * If the event is of type <code>MarkerRecorded</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param markerRecordedEventAttributes If the event is of type <code>MarkerRecorded</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withMarkerRecordedEventAttributes(MarkerRecordedEventAttributes markerRecordedEventAttributes) {
        this.markerRecordedEventAttributes = markerRecordedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>DecisionTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>DecisionTaskFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public RecordMarkerFailedEventAttributes getRecordMarkerFailedEventAttributes() {
        return recordMarkerFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param recordMarkerFailedEventAttributes If the event is of type <code>DecisionTaskFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setRecordMarkerFailedEventAttributes(RecordMarkerFailedEventAttributes recordMarkerFailedEventAttributes) {
        this.recordMarkerFailedEventAttributes = recordMarkerFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>DecisionTaskFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recordMarkerFailedEventAttributes If the event is of type <code>DecisionTaskFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withRecordMarkerFailedEventAttributes(RecordMarkerFailedEventAttributes recordMarkerFailedEventAttributes) {
        this.recordMarkerFailedEventAttributes = recordMarkerFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>TimerStarted</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @return If the event is of type <code>TimerStarted</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public TimerStartedEventAttributes getTimerStartedEventAttributes() {
        return timerStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>TimerStarted</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @param timerStartedEventAttributes If the event is of type <code>TimerStarted</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public void setTimerStartedEventAttributes(TimerStartedEventAttributes timerStartedEventAttributes) {
        this.timerStartedEventAttributes = timerStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>TimerStarted</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timerStartedEventAttributes If the event is of type <code>TimerStarted</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withTimerStartedEventAttributes(TimerStartedEventAttributes timerStartedEventAttributes) {
        this.timerStartedEventAttributes = timerStartedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>TimerFired</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @return If the event is of type <code>TimerFired</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public TimerFiredEventAttributes getTimerFiredEventAttributes() {
        return timerFiredEventAttributes;
    }
    
    /**
     * If the event is of type <code>TimerFired</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @param timerFiredEventAttributes If the event is of type <code>TimerFired</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public void setTimerFiredEventAttributes(TimerFiredEventAttributes timerFiredEventAttributes) {
        this.timerFiredEventAttributes = timerFiredEventAttributes;
    }
    
    /**
     * If the event is of type <code>TimerFired</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timerFiredEventAttributes If the event is of type <code>TimerFired</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withTimerFiredEventAttributes(TimerFiredEventAttributes timerFiredEventAttributes) {
        this.timerFiredEventAttributes = timerFiredEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>TimerCanceled</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @return If the event is of type <code>TimerCanceled</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public TimerCanceledEventAttributes getTimerCanceledEventAttributes() {
        return timerCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>TimerCanceled</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @param timerCanceledEventAttributes If the event is of type <code>TimerCanceled</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public void setTimerCanceledEventAttributes(TimerCanceledEventAttributes timerCanceledEventAttributes) {
        this.timerCanceledEventAttributes = timerCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>TimerCanceled</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timerCanceledEventAttributes If the event is of type <code>TimerCanceled</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withTimerCanceledEventAttributes(TimerCanceledEventAttributes timerCanceledEventAttributes) {
        this.timerCanceledEventAttributes = timerCanceledEventAttributes;
        return this;
    }

    /**
     * If the event is of type
     * <code>StartChildWorkflowExecutionInitiated</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @return If the event is of type
     *         <code>StartChildWorkflowExecutionInitiated</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public StartChildWorkflowExecutionInitiatedEventAttributes getStartChildWorkflowExecutionInitiatedEventAttributes() {
        return startChildWorkflowExecutionInitiatedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>StartChildWorkflowExecutionInitiated</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @param startChildWorkflowExecutionInitiatedEventAttributes If the event is of type
     *         <code>StartChildWorkflowExecutionInitiated</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public void setStartChildWorkflowExecutionInitiatedEventAttributes(StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes) {
        this.startChildWorkflowExecutionInitiatedEventAttributes = startChildWorkflowExecutionInitiatedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>StartChildWorkflowExecutionInitiated</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startChildWorkflowExecutionInitiatedEventAttributes If the event is of type
     *         <code>StartChildWorkflowExecutionInitiated</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withStartChildWorkflowExecutionInitiatedEventAttributes(StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes) {
        this.startChildWorkflowExecutionInitiatedEventAttributes = startChildWorkflowExecutionInitiatedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ChildWorkflowExecutionStarted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>ChildWorkflowExecutionStarted</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public ChildWorkflowExecutionStartedEventAttributes getChildWorkflowExecutionStartedEventAttributes() {
        return childWorkflowExecutionStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionStarted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param childWorkflowExecutionStartedEventAttributes If the event is of type <code>ChildWorkflowExecutionStarted</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setChildWorkflowExecutionStartedEventAttributes(ChildWorkflowExecutionStartedEventAttributes childWorkflowExecutionStartedEventAttributes) {
        this.childWorkflowExecutionStartedEventAttributes = childWorkflowExecutionStartedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionStarted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param childWorkflowExecutionStartedEventAttributes If the event is of type <code>ChildWorkflowExecutionStarted</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withChildWorkflowExecutionStartedEventAttributes(ChildWorkflowExecutionStartedEventAttributes childWorkflowExecutionStartedEventAttributes) {
        this.childWorkflowExecutionStartedEventAttributes = childWorkflowExecutionStartedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>ChildWorkflowExecutionCompleted</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public ChildWorkflowExecutionCompletedEventAttributes getChildWorkflowExecutionCompletedEventAttributes() {
        return childWorkflowExecutionCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param childWorkflowExecutionCompletedEventAttributes If the event is of type <code>ChildWorkflowExecutionCompleted</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setChildWorkflowExecutionCompletedEventAttributes(ChildWorkflowExecutionCompletedEventAttributes childWorkflowExecutionCompletedEventAttributes) {
        this.childWorkflowExecutionCompletedEventAttributes = childWorkflowExecutionCompletedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param childWorkflowExecutionCompletedEventAttributes If the event is of type <code>ChildWorkflowExecutionCompleted</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withChildWorkflowExecutionCompletedEventAttributes(ChildWorkflowExecutionCompletedEventAttributes childWorkflowExecutionCompletedEventAttributes) {
        this.childWorkflowExecutionCompletedEventAttributes = childWorkflowExecutionCompletedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>ChildWorkflowExecutionFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public ChildWorkflowExecutionFailedEventAttributes getChildWorkflowExecutionFailedEventAttributes() {
        return childWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param childWorkflowExecutionFailedEventAttributes If the event is of type <code>ChildWorkflowExecutionFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setChildWorkflowExecutionFailedEventAttributes(ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes) {
        this.childWorkflowExecutionFailedEventAttributes = childWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param childWorkflowExecutionFailedEventAttributes If the event is of type <code>ChildWorkflowExecutionFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withChildWorkflowExecutionFailedEventAttributes(ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes) {
        this.childWorkflowExecutionFailedEventAttributes = childWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>ChildWorkflowExecutionTimedOut</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public ChildWorkflowExecutionTimedOutEventAttributes getChildWorkflowExecutionTimedOutEventAttributes() {
        return childWorkflowExecutionTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param childWorkflowExecutionTimedOutEventAttributes If the event is of type <code>ChildWorkflowExecutionTimedOut</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setChildWorkflowExecutionTimedOutEventAttributes(ChildWorkflowExecutionTimedOutEventAttributes childWorkflowExecutionTimedOutEventAttributes) {
        this.childWorkflowExecutionTimedOutEventAttributes = childWorkflowExecutionTimedOutEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param childWorkflowExecutionTimedOutEventAttributes If the event is of type <code>ChildWorkflowExecutionTimedOut</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withChildWorkflowExecutionTimedOutEventAttributes(ChildWorkflowExecutionTimedOutEventAttributes childWorkflowExecutionTimedOutEventAttributes) {
        this.childWorkflowExecutionTimedOutEventAttributes = childWorkflowExecutionTimedOutEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>ChildWorkflowExecutionCanceled</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public ChildWorkflowExecutionCanceledEventAttributes getChildWorkflowExecutionCanceledEventAttributes() {
        return childWorkflowExecutionCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param childWorkflowExecutionCanceledEventAttributes If the event is of type <code>ChildWorkflowExecutionCanceled</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setChildWorkflowExecutionCanceledEventAttributes(ChildWorkflowExecutionCanceledEventAttributes childWorkflowExecutionCanceledEventAttributes) {
        this.childWorkflowExecutionCanceledEventAttributes = childWorkflowExecutionCanceledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param childWorkflowExecutionCanceledEventAttributes If the event is of type <code>ChildWorkflowExecutionCanceled</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withChildWorkflowExecutionCanceledEventAttributes(ChildWorkflowExecutionCanceledEventAttributes childWorkflowExecutionCanceledEventAttributes) {
        this.childWorkflowExecutionCanceledEventAttributes = childWorkflowExecutionCanceledEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>ChildWorkflowExecutionTerminated</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public ChildWorkflowExecutionTerminatedEventAttributes getChildWorkflowExecutionTerminatedEventAttributes() {
        return childWorkflowExecutionTerminatedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param childWorkflowExecutionTerminatedEventAttributes If the event is of type <code>ChildWorkflowExecutionTerminated</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setChildWorkflowExecutionTerminatedEventAttributes(ChildWorkflowExecutionTerminatedEventAttributes childWorkflowExecutionTerminatedEventAttributes) {
        this.childWorkflowExecutionTerminatedEventAttributes = childWorkflowExecutionTerminatedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param childWorkflowExecutionTerminatedEventAttributes If the event is of type <code>ChildWorkflowExecutionTerminated</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withChildWorkflowExecutionTerminatedEventAttributes(ChildWorkflowExecutionTerminatedEventAttributes childWorkflowExecutionTerminatedEventAttributes) {
        this.childWorkflowExecutionTerminatedEventAttributes = childWorkflowExecutionTerminatedEventAttributes;
        return this;
    }

    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionInitiated</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @return If the event is of type
     *         <code>SignalExternalWorkflowExecutionInitiated</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public SignalExternalWorkflowExecutionInitiatedEventAttributes getSignalExternalWorkflowExecutionInitiatedEventAttributes() {
        return signalExternalWorkflowExecutionInitiatedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionInitiated</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @param signalExternalWorkflowExecutionInitiatedEventAttributes If the event is of type
     *         <code>SignalExternalWorkflowExecutionInitiated</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public void setSignalExternalWorkflowExecutionInitiatedEventAttributes(SignalExternalWorkflowExecutionInitiatedEventAttributes signalExternalWorkflowExecutionInitiatedEventAttributes) {
        this.signalExternalWorkflowExecutionInitiatedEventAttributes = signalExternalWorkflowExecutionInitiatedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionInitiated</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signalExternalWorkflowExecutionInitiatedEventAttributes If the event is of type
     *         <code>SignalExternalWorkflowExecutionInitiated</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withSignalExternalWorkflowExecutionInitiatedEventAttributes(SignalExternalWorkflowExecutionInitiatedEventAttributes signalExternalWorkflowExecutionInitiatedEventAttributes) {
        this.signalExternalWorkflowExecutionInitiatedEventAttributes = signalExternalWorkflowExecutionInitiatedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>ExternalWorkflowExecutionSignaled</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public ExternalWorkflowExecutionSignaledEventAttributes getExternalWorkflowExecutionSignaledEventAttributes() {
        return externalWorkflowExecutionSignaledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param externalWorkflowExecutionSignaledEventAttributes If the event is of type <code>ExternalWorkflowExecutionSignaled</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setExternalWorkflowExecutionSignaledEventAttributes(ExternalWorkflowExecutionSignaledEventAttributes externalWorkflowExecutionSignaledEventAttributes) {
        this.externalWorkflowExecutionSignaledEventAttributes = externalWorkflowExecutionSignaledEventAttributes;
    }
    
    /**
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param externalWorkflowExecutionSignaledEventAttributes If the event is of type <code>ExternalWorkflowExecutionSignaled</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withExternalWorkflowExecutionSignaledEventAttributes(ExternalWorkflowExecutionSignaledEventAttributes externalWorkflowExecutionSignaledEventAttributes) {
        this.externalWorkflowExecutionSignaledEventAttributes = externalWorkflowExecutionSignaledEventAttributes;
        return this;
    }

    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @return If the event is of type
     *         <code>SignalExternalWorkflowExecutionFailed</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public SignalExternalWorkflowExecutionFailedEventAttributes getSignalExternalWorkflowExecutionFailedEventAttributes() {
        return signalExternalWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     *
     * @param signalExternalWorkflowExecutionFailedEventAttributes If the event is of type
     *         <code>SignalExternalWorkflowExecutionFailed</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     */
    public void setSignalExternalWorkflowExecutionFailedEventAttributes(SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes) {
        this.signalExternalWorkflowExecutionFailedEventAttributes = signalExternalWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>SignalExternalWorkflowExecutionFailed</code> then this member is
     * set and provides detailed information about the event. It is not set
     * for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signalExternalWorkflowExecutionFailedEventAttributes If the event is of type
     *         <code>SignalExternalWorkflowExecutionFailed</code> then this member is
     *         set and provides detailed information about the event. It is not set
     *         for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withSignalExternalWorkflowExecutionFailedEventAttributes(SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes) {
        this.signalExternalWorkflowExecutionFailedEventAttributes = signalExternalWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type
     * <code>ExternalWorkflowExecutionCancelRequested</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @return If the event is of type
     *         <code>ExternalWorkflowExecutionCancelRequested</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public ExternalWorkflowExecutionCancelRequestedEventAttributes getExternalWorkflowExecutionCancelRequestedEventAttributes() {
        return externalWorkflowExecutionCancelRequestedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>ExternalWorkflowExecutionCancelRequested</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @param externalWorkflowExecutionCancelRequestedEventAttributes If the event is of type
     *         <code>ExternalWorkflowExecutionCancelRequested</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public void setExternalWorkflowExecutionCancelRequestedEventAttributes(ExternalWorkflowExecutionCancelRequestedEventAttributes externalWorkflowExecutionCancelRequestedEventAttributes) {
        this.externalWorkflowExecutionCancelRequestedEventAttributes = externalWorkflowExecutionCancelRequestedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>ExternalWorkflowExecutionCancelRequested</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param externalWorkflowExecutionCancelRequestedEventAttributes If the event is of type
     *         <code>ExternalWorkflowExecutionCancelRequested</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withExternalWorkflowExecutionCancelRequestedEventAttributes(ExternalWorkflowExecutionCancelRequestedEventAttributes externalWorkflowExecutionCancelRequestedEventAttributes) {
        this.externalWorkflowExecutionCancelRequestedEventAttributes = externalWorkflowExecutionCancelRequestedEventAttributes;
        return this;
    }

    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public RequestCancelExternalWorkflowExecutionInitiatedEventAttributes getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() {
        return requestCancelExternalWorkflowExecutionInitiatedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param requestCancelExternalWorkflowExecutionInitiatedEventAttributes If the event is of type
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(RequestCancelExternalWorkflowExecutionInitiatedEventAttributes requestCancelExternalWorkflowExecutionInitiatedEventAttributes) {
        this.requestCancelExternalWorkflowExecutionInitiatedEventAttributes = requestCancelExternalWorkflowExecutionInitiatedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestCancelExternalWorkflowExecutionInitiatedEventAttributes If the event is of type
     *         <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(RequestCancelExternalWorkflowExecutionInitiatedEventAttributes requestCancelExternalWorkflowExecutionInitiatedEventAttributes) {
        this.requestCancelExternalWorkflowExecutionInitiatedEventAttributes = requestCancelExternalWorkflowExecutionInitiatedEventAttributes;
        return this;
    }

    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type
     *         <code>RequestCancelExternalWorkflowExecutionFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public RequestCancelExternalWorkflowExecutionFailedEventAttributes getRequestCancelExternalWorkflowExecutionFailedEventAttributes() {
        return requestCancelExternalWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param requestCancelExternalWorkflowExecutionFailedEventAttributes If the event is of type
     *         <code>RequestCancelExternalWorkflowExecutionFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setRequestCancelExternalWorkflowExecutionFailedEventAttributes(RequestCancelExternalWorkflowExecutionFailedEventAttributes requestCancelExternalWorkflowExecutionFailedEventAttributes) {
        this.requestCancelExternalWorkflowExecutionFailedEventAttributes = requestCancelExternalWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type
     * <code>RequestCancelExternalWorkflowExecutionFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestCancelExternalWorkflowExecutionFailedEventAttributes If the event is of type
     *         <code>RequestCancelExternalWorkflowExecutionFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withRequestCancelExternalWorkflowExecutionFailedEventAttributes(RequestCancelExternalWorkflowExecutionFailedEventAttributes requestCancelExternalWorkflowExecutionFailedEventAttributes) {
        this.requestCancelExternalWorkflowExecutionFailedEventAttributes = requestCancelExternalWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @return If the event is of type <code>ScheduleActivityTaskFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public ScheduleActivityTaskFailedEventAttributes getScheduleActivityTaskFailedEventAttributes() {
        return scheduleActivityTaskFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     *
     * @param scheduleActivityTaskFailedEventAttributes If the event is of type <code>ScheduleActivityTaskFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     */
    public void setScheduleActivityTaskFailedEventAttributes(ScheduleActivityTaskFailedEventAttributes scheduleActivityTaskFailedEventAttributes) {
        this.scheduleActivityTaskFailedEventAttributes = scheduleActivityTaskFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then
     * this member is set and provides detailed information about the event.
     * It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduleActivityTaskFailedEventAttributes If the event is of type <code>ScheduleActivityTaskFailed</code> then
     *         this member is set and provides detailed information about the event.
     *         It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withScheduleActivityTaskFailedEventAttributes(ScheduleActivityTaskFailedEventAttributes scheduleActivityTaskFailedEventAttributes) {
        this.scheduleActivityTaskFailedEventAttributes = scheduleActivityTaskFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>RequestCancelActivityTaskFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>RequestCancelActivityTaskFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public RequestCancelActivityTaskFailedEventAttributes getRequestCancelActivityTaskFailedEventAttributes() {
        return requestCancelActivityTaskFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>RequestCancelActivityTaskFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param requestCancelActivityTaskFailedEventAttributes If the event is of type <code>RequestCancelActivityTaskFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setRequestCancelActivityTaskFailedEventAttributes(RequestCancelActivityTaskFailedEventAttributes requestCancelActivityTaskFailedEventAttributes) {
        this.requestCancelActivityTaskFailedEventAttributes = requestCancelActivityTaskFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>RequestCancelActivityTaskFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestCancelActivityTaskFailedEventAttributes If the event is of type <code>RequestCancelActivityTaskFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withRequestCancelActivityTaskFailedEventAttributes(RequestCancelActivityTaskFailedEventAttributes requestCancelActivityTaskFailedEventAttributes) {
        this.requestCancelActivityTaskFailedEventAttributes = requestCancelActivityTaskFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>StartTimerFailed</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @return If the event is of type <code>StartTimerFailed</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public StartTimerFailedEventAttributes getStartTimerFailedEventAttributes() {
        return startTimerFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>StartTimerFailed</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     *
     * @param startTimerFailedEventAttributes If the event is of type <code>StartTimerFailed</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     */
    public void setStartTimerFailedEventAttributes(StartTimerFailedEventAttributes startTimerFailedEventAttributes) {
        this.startTimerFailedEventAttributes = startTimerFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>StartTimerFailed</code> then this member
     * is set and provides detailed information about the event. It is not
     * set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimerFailedEventAttributes If the event is of type <code>StartTimerFailed</code> then this member
     *         is set and provides detailed information about the event. It is not
     *         set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withStartTimerFailedEventAttributes(StartTimerFailedEventAttributes startTimerFailedEventAttributes) {
        this.startTimerFailedEventAttributes = startTimerFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>CancelTimerFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @return If the event is of type <code>CancelTimerFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public CancelTimerFailedEventAttributes getCancelTimerFailedEventAttributes() {
        return cancelTimerFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>CancelTimerFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     *
     * @param cancelTimerFailedEventAttributes If the event is of type <code>CancelTimerFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     */
    public void setCancelTimerFailedEventAttributes(CancelTimerFailedEventAttributes cancelTimerFailedEventAttributes) {
        this.cancelTimerFailedEventAttributes = cancelTimerFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>CancelTimerFailed</code> then this
     * member is set and provides detailed information about the event. It is
     * not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelTimerFailedEventAttributes If the event is of type <code>CancelTimerFailed</code> then this
     *         member is set and provides detailed information about the event. It is
     *         not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withCancelTimerFailedEventAttributes(CancelTimerFailedEventAttributes cancelTimerFailedEventAttributes) {
        this.cancelTimerFailedEventAttributes = cancelTimerFailedEventAttributes;
        return this;
    }

    /**
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @return If the event is of type <code>StartChildWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public StartChildWorkflowExecutionFailedEventAttributes getStartChildWorkflowExecutionFailedEventAttributes() {
        return startChildWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     *
     * @param startChildWorkflowExecutionFailedEventAttributes If the event is of type <code>StartChildWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     */
    public void setStartChildWorkflowExecutionFailedEventAttributes(StartChildWorkflowExecutionFailedEventAttributes startChildWorkflowExecutionFailedEventAttributes) {
        this.startChildWorkflowExecutionFailedEventAttributes = startChildWorkflowExecutionFailedEventAttributes;
    }
    
    /**
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code>
     * then this member is set and provides detailed information about the
     * event. It is not set for other event types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startChildWorkflowExecutionFailedEventAttributes If the event is of type <code>StartChildWorkflowExecutionFailed</code>
     *         then this member is set and provides detailed information about the
     *         event. It is not set for other event types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HistoryEvent withStartChildWorkflowExecutionFailedEventAttributes(StartChildWorkflowExecutionFailedEventAttributes startChildWorkflowExecutionFailedEventAttributes) {
        this.startChildWorkflowExecutionFailedEventAttributes = startChildWorkflowExecutionFailedEventAttributes;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventTimestamp() != null) sb.append("EventTimestamp: " + getEventTimestamp() + ",");
        if (getEventType() != null) sb.append("EventType: " + getEventType() + ",");
        if (getEventId() != null) sb.append("EventId: " + getEventId() + ",");
        if (getWorkflowExecutionStartedEventAttributes() != null) sb.append("WorkflowExecutionStartedEventAttributes: " + getWorkflowExecutionStartedEventAttributes() + ",");
        if (getWorkflowExecutionCompletedEventAttributes() != null) sb.append("WorkflowExecutionCompletedEventAttributes: " + getWorkflowExecutionCompletedEventAttributes() + ",");
        if (getCompleteWorkflowExecutionFailedEventAttributes() != null) sb.append("CompleteWorkflowExecutionFailedEventAttributes: " + getCompleteWorkflowExecutionFailedEventAttributes() + ",");
        if (getWorkflowExecutionFailedEventAttributes() != null) sb.append("WorkflowExecutionFailedEventAttributes: " + getWorkflowExecutionFailedEventAttributes() + ",");
        if (getFailWorkflowExecutionFailedEventAttributes() != null) sb.append("FailWorkflowExecutionFailedEventAttributes: " + getFailWorkflowExecutionFailedEventAttributes() + ",");
        if (getWorkflowExecutionTimedOutEventAttributes() != null) sb.append("WorkflowExecutionTimedOutEventAttributes: " + getWorkflowExecutionTimedOutEventAttributes() + ",");
        if (getWorkflowExecutionCanceledEventAttributes() != null) sb.append("WorkflowExecutionCanceledEventAttributes: " + getWorkflowExecutionCanceledEventAttributes() + ",");
        if (getCancelWorkflowExecutionFailedEventAttributes() != null) sb.append("CancelWorkflowExecutionFailedEventAttributes: " + getCancelWorkflowExecutionFailedEventAttributes() + ",");
        if (getWorkflowExecutionContinuedAsNewEventAttributes() != null) sb.append("WorkflowExecutionContinuedAsNewEventAttributes: " + getWorkflowExecutionContinuedAsNewEventAttributes() + ",");
        if (getContinueAsNewWorkflowExecutionFailedEventAttributes() != null) sb.append("ContinueAsNewWorkflowExecutionFailedEventAttributes: " + getContinueAsNewWorkflowExecutionFailedEventAttributes() + ",");
        if (getWorkflowExecutionTerminatedEventAttributes() != null) sb.append("WorkflowExecutionTerminatedEventAttributes: " + getWorkflowExecutionTerminatedEventAttributes() + ",");
        if (getWorkflowExecutionCancelRequestedEventAttributes() != null) sb.append("WorkflowExecutionCancelRequestedEventAttributes: " + getWorkflowExecutionCancelRequestedEventAttributes() + ",");
        if (getDecisionTaskScheduledEventAttributes() != null) sb.append("DecisionTaskScheduledEventAttributes: " + getDecisionTaskScheduledEventAttributes() + ",");
        if (getDecisionTaskStartedEventAttributes() != null) sb.append("DecisionTaskStartedEventAttributes: " + getDecisionTaskStartedEventAttributes() + ",");
        if (getDecisionTaskCompletedEventAttributes() != null) sb.append("DecisionTaskCompletedEventAttributes: " + getDecisionTaskCompletedEventAttributes() + ",");
        if (getDecisionTaskTimedOutEventAttributes() != null) sb.append("DecisionTaskTimedOutEventAttributes: " + getDecisionTaskTimedOutEventAttributes() + ",");
        if (getActivityTaskScheduledEventAttributes() != null) sb.append("ActivityTaskScheduledEventAttributes: " + getActivityTaskScheduledEventAttributes() + ",");
        if (getActivityTaskStartedEventAttributes() != null) sb.append("ActivityTaskStartedEventAttributes: " + getActivityTaskStartedEventAttributes() + ",");
        if (getActivityTaskCompletedEventAttributes() != null) sb.append("ActivityTaskCompletedEventAttributes: " + getActivityTaskCompletedEventAttributes() + ",");
        if (getActivityTaskFailedEventAttributes() != null) sb.append("ActivityTaskFailedEventAttributes: " + getActivityTaskFailedEventAttributes() + ",");
        if (getActivityTaskTimedOutEventAttributes() != null) sb.append("ActivityTaskTimedOutEventAttributes: " + getActivityTaskTimedOutEventAttributes() + ",");
        if (getActivityTaskCanceledEventAttributes() != null) sb.append("ActivityTaskCanceledEventAttributes: " + getActivityTaskCanceledEventAttributes() + ",");
        if (getActivityTaskCancelRequestedEventAttributes() != null) sb.append("ActivityTaskCancelRequestedEventAttributes: " + getActivityTaskCancelRequestedEventAttributes() + ",");
        if (getWorkflowExecutionSignaledEventAttributes() != null) sb.append("WorkflowExecutionSignaledEventAttributes: " + getWorkflowExecutionSignaledEventAttributes() + ",");
        if (getMarkerRecordedEventAttributes() != null) sb.append("MarkerRecordedEventAttributes: " + getMarkerRecordedEventAttributes() + ",");
        if (getRecordMarkerFailedEventAttributes() != null) sb.append("RecordMarkerFailedEventAttributes: " + getRecordMarkerFailedEventAttributes() + ",");
        if (getTimerStartedEventAttributes() != null) sb.append("TimerStartedEventAttributes: " + getTimerStartedEventAttributes() + ",");
        if (getTimerFiredEventAttributes() != null) sb.append("TimerFiredEventAttributes: " + getTimerFiredEventAttributes() + ",");
        if (getTimerCanceledEventAttributes() != null) sb.append("TimerCanceledEventAttributes: " + getTimerCanceledEventAttributes() + ",");
        if (getStartChildWorkflowExecutionInitiatedEventAttributes() != null) sb.append("StartChildWorkflowExecutionInitiatedEventAttributes: " + getStartChildWorkflowExecutionInitiatedEventAttributes() + ",");
        if (getChildWorkflowExecutionStartedEventAttributes() != null) sb.append("ChildWorkflowExecutionStartedEventAttributes: " + getChildWorkflowExecutionStartedEventAttributes() + ",");
        if (getChildWorkflowExecutionCompletedEventAttributes() != null) sb.append("ChildWorkflowExecutionCompletedEventAttributes: " + getChildWorkflowExecutionCompletedEventAttributes() + ",");
        if (getChildWorkflowExecutionFailedEventAttributes() != null) sb.append("ChildWorkflowExecutionFailedEventAttributes: " + getChildWorkflowExecutionFailedEventAttributes() + ",");
        if (getChildWorkflowExecutionTimedOutEventAttributes() != null) sb.append("ChildWorkflowExecutionTimedOutEventAttributes: " + getChildWorkflowExecutionTimedOutEventAttributes() + ",");
        if (getChildWorkflowExecutionCanceledEventAttributes() != null) sb.append("ChildWorkflowExecutionCanceledEventAttributes: " + getChildWorkflowExecutionCanceledEventAttributes() + ",");
        if (getChildWorkflowExecutionTerminatedEventAttributes() != null) sb.append("ChildWorkflowExecutionTerminatedEventAttributes: " + getChildWorkflowExecutionTerminatedEventAttributes() + ",");
        if (getSignalExternalWorkflowExecutionInitiatedEventAttributes() != null) sb.append("SignalExternalWorkflowExecutionInitiatedEventAttributes: " + getSignalExternalWorkflowExecutionInitiatedEventAttributes() + ",");
        if (getExternalWorkflowExecutionSignaledEventAttributes() != null) sb.append("ExternalWorkflowExecutionSignaledEventAttributes: " + getExternalWorkflowExecutionSignaledEventAttributes() + ",");
        if (getSignalExternalWorkflowExecutionFailedEventAttributes() != null) sb.append("SignalExternalWorkflowExecutionFailedEventAttributes: " + getSignalExternalWorkflowExecutionFailedEventAttributes() + ",");
        if (getExternalWorkflowExecutionCancelRequestedEventAttributes() != null) sb.append("ExternalWorkflowExecutionCancelRequestedEventAttributes: " + getExternalWorkflowExecutionCancelRequestedEventAttributes() + ",");
        if (getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() != null) sb.append("RequestCancelExternalWorkflowExecutionInitiatedEventAttributes: " + getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() + ",");
        if (getRequestCancelExternalWorkflowExecutionFailedEventAttributes() != null) sb.append("RequestCancelExternalWorkflowExecutionFailedEventAttributes: " + getRequestCancelExternalWorkflowExecutionFailedEventAttributes() + ",");
        if (getScheduleActivityTaskFailedEventAttributes() != null) sb.append("ScheduleActivityTaskFailedEventAttributes: " + getScheduleActivityTaskFailedEventAttributes() + ",");
        if (getRequestCancelActivityTaskFailedEventAttributes() != null) sb.append("RequestCancelActivityTaskFailedEventAttributes: " + getRequestCancelActivityTaskFailedEventAttributes() + ",");
        if (getStartTimerFailedEventAttributes() != null) sb.append("StartTimerFailedEventAttributes: " + getStartTimerFailedEventAttributes() + ",");
        if (getCancelTimerFailedEventAttributes() != null) sb.append("CancelTimerFailedEventAttributes: " + getCancelTimerFailedEventAttributes() + ",");
        if (getStartChildWorkflowExecutionFailedEventAttributes() != null) sb.append("StartChildWorkflowExecutionFailedEventAttributes: " + getStartChildWorkflowExecutionFailedEventAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode()); 
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode()); 
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionStartedEventAttributes() == null) ? 0 : getWorkflowExecutionStartedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionCompletedEventAttributes() == null) ? 0 : getWorkflowExecutionCompletedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCompleteWorkflowExecutionFailedEventAttributes() == null) ? 0 : getCompleteWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionFailedEventAttributes() == null) ? 0 : getWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getFailWorkflowExecutionFailedEventAttributes() == null) ? 0 : getFailWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionTimedOutEventAttributes() == null) ? 0 : getWorkflowExecutionTimedOutEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionCanceledEventAttributes() == null) ? 0 : getWorkflowExecutionCanceledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCancelWorkflowExecutionFailedEventAttributes() == null) ? 0 : getCancelWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionContinuedAsNewEventAttributes() == null) ? 0 : getWorkflowExecutionContinuedAsNewEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getContinueAsNewWorkflowExecutionFailedEventAttributes() == null) ? 0 : getContinueAsNewWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionTerminatedEventAttributes() == null) ? 0 : getWorkflowExecutionTerminatedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionCancelRequestedEventAttributes() == null) ? 0 : getWorkflowExecutionCancelRequestedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskScheduledEventAttributes() == null) ? 0 : getDecisionTaskScheduledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskStartedEventAttributes() == null) ? 0 : getDecisionTaskStartedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventAttributes() == null) ? 0 : getDecisionTaskCompletedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskTimedOutEventAttributes() == null) ? 0 : getDecisionTaskTimedOutEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getActivityTaskScheduledEventAttributes() == null) ? 0 : getActivityTaskScheduledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getActivityTaskStartedEventAttributes() == null) ? 0 : getActivityTaskStartedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getActivityTaskCompletedEventAttributes() == null) ? 0 : getActivityTaskCompletedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getActivityTaskFailedEventAttributes() == null) ? 0 : getActivityTaskFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getActivityTaskTimedOutEventAttributes() == null) ? 0 : getActivityTaskTimedOutEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getActivityTaskCanceledEventAttributes() == null) ? 0 : getActivityTaskCanceledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getActivityTaskCancelRequestedEventAttributes() == null) ? 0 : getActivityTaskCancelRequestedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowExecutionSignaledEventAttributes() == null) ? 0 : getWorkflowExecutionSignaledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getMarkerRecordedEventAttributes() == null) ? 0 : getMarkerRecordedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getRecordMarkerFailedEventAttributes() == null) ? 0 : getRecordMarkerFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getTimerStartedEventAttributes() == null) ? 0 : getTimerStartedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getTimerFiredEventAttributes() == null) ? 0 : getTimerFiredEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getTimerCanceledEventAttributes() == null) ? 0 : getTimerCanceledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getStartChildWorkflowExecutionInitiatedEventAttributes() == null) ? 0 : getStartChildWorkflowExecutionInitiatedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getChildWorkflowExecutionStartedEventAttributes() == null) ? 0 : getChildWorkflowExecutionStartedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getChildWorkflowExecutionCompletedEventAttributes() == null) ? 0 : getChildWorkflowExecutionCompletedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getChildWorkflowExecutionFailedEventAttributes() == null) ? 0 : getChildWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getChildWorkflowExecutionTimedOutEventAttributes() == null) ? 0 : getChildWorkflowExecutionTimedOutEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getChildWorkflowExecutionCanceledEventAttributes() == null) ? 0 : getChildWorkflowExecutionCanceledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getChildWorkflowExecutionTerminatedEventAttributes() == null) ? 0 : getChildWorkflowExecutionTerminatedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getSignalExternalWorkflowExecutionInitiatedEventAttributes() == null) ? 0 : getSignalExternalWorkflowExecutionInitiatedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getExternalWorkflowExecutionSignaledEventAttributes() == null) ? 0 : getExternalWorkflowExecutionSignaledEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getSignalExternalWorkflowExecutionFailedEventAttributes() == null) ? 0 : getSignalExternalWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getExternalWorkflowExecutionCancelRequestedEventAttributes() == null) ? 0 : getExternalWorkflowExecutionCancelRequestedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() == null) ? 0 : getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getRequestCancelExternalWorkflowExecutionFailedEventAttributes() == null) ? 0 : getRequestCancelExternalWorkflowExecutionFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getScheduleActivityTaskFailedEventAttributes() == null) ? 0 : getScheduleActivityTaskFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getRequestCancelActivityTaskFailedEventAttributes() == null) ? 0 : getRequestCancelActivityTaskFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getStartTimerFailedEventAttributes() == null) ? 0 : getStartTimerFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCancelTimerFailedEventAttributes() == null) ? 0 : getCancelTimerFailedEventAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getStartChildWorkflowExecutionFailedEventAttributes() == null) ? 0 : getStartChildWorkflowExecutionFailedEventAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HistoryEvent == false) return false;
        HistoryEvent other = (HistoryEvent)obj;
        
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null) return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false) return false; 
        if (other.getEventType() == null ^ this.getEventType() == null) return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false) return false; 
        if (other.getEventId() == null ^ this.getEventId() == null) return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false) return false; 
        if (other.getWorkflowExecutionStartedEventAttributes() == null ^ this.getWorkflowExecutionStartedEventAttributes() == null) return false;
        if (other.getWorkflowExecutionStartedEventAttributes() != null && other.getWorkflowExecutionStartedEventAttributes().equals(this.getWorkflowExecutionStartedEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionCompletedEventAttributes() == null ^ this.getWorkflowExecutionCompletedEventAttributes() == null) return false;
        if (other.getWorkflowExecutionCompletedEventAttributes() != null && other.getWorkflowExecutionCompletedEventAttributes().equals(this.getWorkflowExecutionCompletedEventAttributes()) == false) return false; 
        if (other.getCompleteWorkflowExecutionFailedEventAttributes() == null ^ this.getCompleteWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getCompleteWorkflowExecutionFailedEventAttributes() != null && other.getCompleteWorkflowExecutionFailedEventAttributes().equals(this.getCompleteWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionFailedEventAttributes() == null ^ this.getWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getWorkflowExecutionFailedEventAttributes() != null && other.getWorkflowExecutionFailedEventAttributes().equals(this.getWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getFailWorkflowExecutionFailedEventAttributes() == null ^ this.getFailWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getFailWorkflowExecutionFailedEventAttributes() != null && other.getFailWorkflowExecutionFailedEventAttributes().equals(this.getFailWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionTimedOutEventAttributes() == null ^ this.getWorkflowExecutionTimedOutEventAttributes() == null) return false;
        if (other.getWorkflowExecutionTimedOutEventAttributes() != null && other.getWorkflowExecutionTimedOutEventAttributes().equals(this.getWorkflowExecutionTimedOutEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionCanceledEventAttributes() == null ^ this.getWorkflowExecutionCanceledEventAttributes() == null) return false;
        if (other.getWorkflowExecutionCanceledEventAttributes() != null && other.getWorkflowExecutionCanceledEventAttributes().equals(this.getWorkflowExecutionCanceledEventAttributes()) == false) return false; 
        if (other.getCancelWorkflowExecutionFailedEventAttributes() == null ^ this.getCancelWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getCancelWorkflowExecutionFailedEventAttributes() != null && other.getCancelWorkflowExecutionFailedEventAttributes().equals(this.getCancelWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionContinuedAsNewEventAttributes() == null ^ this.getWorkflowExecutionContinuedAsNewEventAttributes() == null) return false;
        if (other.getWorkflowExecutionContinuedAsNewEventAttributes() != null && other.getWorkflowExecutionContinuedAsNewEventAttributes().equals(this.getWorkflowExecutionContinuedAsNewEventAttributes()) == false) return false; 
        if (other.getContinueAsNewWorkflowExecutionFailedEventAttributes() == null ^ this.getContinueAsNewWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getContinueAsNewWorkflowExecutionFailedEventAttributes() != null && other.getContinueAsNewWorkflowExecutionFailedEventAttributes().equals(this.getContinueAsNewWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionTerminatedEventAttributes() == null ^ this.getWorkflowExecutionTerminatedEventAttributes() == null) return false;
        if (other.getWorkflowExecutionTerminatedEventAttributes() != null && other.getWorkflowExecutionTerminatedEventAttributes().equals(this.getWorkflowExecutionTerminatedEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionCancelRequestedEventAttributes() == null ^ this.getWorkflowExecutionCancelRequestedEventAttributes() == null) return false;
        if (other.getWorkflowExecutionCancelRequestedEventAttributes() != null && other.getWorkflowExecutionCancelRequestedEventAttributes().equals(this.getWorkflowExecutionCancelRequestedEventAttributes()) == false) return false; 
        if (other.getDecisionTaskScheduledEventAttributes() == null ^ this.getDecisionTaskScheduledEventAttributes() == null) return false;
        if (other.getDecisionTaskScheduledEventAttributes() != null && other.getDecisionTaskScheduledEventAttributes().equals(this.getDecisionTaskScheduledEventAttributes()) == false) return false; 
        if (other.getDecisionTaskStartedEventAttributes() == null ^ this.getDecisionTaskStartedEventAttributes() == null) return false;
        if (other.getDecisionTaskStartedEventAttributes() != null && other.getDecisionTaskStartedEventAttributes().equals(this.getDecisionTaskStartedEventAttributes()) == false) return false; 
        if (other.getDecisionTaskCompletedEventAttributes() == null ^ this.getDecisionTaskCompletedEventAttributes() == null) return false;
        if (other.getDecisionTaskCompletedEventAttributes() != null && other.getDecisionTaskCompletedEventAttributes().equals(this.getDecisionTaskCompletedEventAttributes()) == false) return false; 
        if (other.getDecisionTaskTimedOutEventAttributes() == null ^ this.getDecisionTaskTimedOutEventAttributes() == null) return false;
        if (other.getDecisionTaskTimedOutEventAttributes() != null && other.getDecisionTaskTimedOutEventAttributes().equals(this.getDecisionTaskTimedOutEventAttributes()) == false) return false; 
        if (other.getActivityTaskScheduledEventAttributes() == null ^ this.getActivityTaskScheduledEventAttributes() == null) return false;
        if (other.getActivityTaskScheduledEventAttributes() != null && other.getActivityTaskScheduledEventAttributes().equals(this.getActivityTaskScheduledEventAttributes()) == false) return false; 
        if (other.getActivityTaskStartedEventAttributes() == null ^ this.getActivityTaskStartedEventAttributes() == null) return false;
        if (other.getActivityTaskStartedEventAttributes() != null && other.getActivityTaskStartedEventAttributes().equals(this.getActivityTaskStartedEventAttributes()) == false) return false; 
        if (other.getActivityTaskCompletedEventAttributes() == null ^ this.getActivityTaskCompletedEventAttributes() == null) return false;
        if (other.getActivityTaskCompletedEventAttributes() != null && other.getActivityTaskCompletedEventAttributes().equals(this.getActivityTaskCompletedEventAttributes()) == false) return false; 
        if (other.getActivityTaskFailedEventAttributes() == null ^ this.getActivityTaskFailedEventAttributes() == null) return false;
        if (other.getActivityTaskFailedEventAttributes() != null && other.getActivityTaskFailedEventAttributes().equals(this.getActivityTaskFailedEventAttributes()) == false) return false; 
        if (other.getActivityTaskTimedOutEventAttributes() == null ^ this.getActivityTaskTimedOutEventAttributes() == null) return false;
        if (other.getActivityTaskTimedOutEventAttributes() != null && other.getActivityTaskTimedOutEventAttributes().equals(this.getActivityTaskTimedOutEventAttributes()) == false) return false; 
        if (other.getActivityTaskCanceledEventAttributes() == null ^ this.getActivityTaskCanceledEventAttributes() == null) return false;
        if (other.getActivityTaskCanceledEventAttributes() != null && other.getActivityTaskCanceledEventAttributes().equals(this.getActivityTaskCanceledEventAttributes()) == false) return false; 
        if (other.getActivityTaskCancelRequestedEventAttributes() == null ^ this.getActivityTaskCancelRequestedEventAttributes() == null) return false;
        if (other.getActivityTaskCancelRequestedEventAttributes() != null && other.getActivityTaskCancelRequestedEventAttributes().equals(this.getActivityTaskCancelRequestedEventAttributes()) == false) return false; 
        if (other.getWorkflowExecutionSignaledEventAttributes() == null ^ this.getWorkflowExecutionSignaledEventAttributes() == null) return false;
        if (other.getWorkflowExecutionSignaledEventAttributes() != null && other.getWorkflowExecutionSignaledEventAttributes().equals(this.getWorkflowExecutionSignaledEventAttributes()) == false) return false; 
        if (other.getMarkerRecordedEventAttributes() == null ^ this.getMarkerRecordedEventAttributes() == null) return false;
        if (other.getMarkerRecordedEventAttributes() != null && other.getMarkerRecordedEventAttributes().equals(this.getMarkerRecordedEventAttributes()) == false) return false; 
        if (other.getRecordMarkerFailedEventAttributes() == null ^ this.getRecordMarkerFailedEventAttributes() == null) return false;
        if (other.getRecordMarkerFailedEventAttributes() != null && other.getRecordMarkerFailedEventAttributes().equals(this.getRecordMarkerFailedEventAttributes()) == false) return false; 
        if (other.getTimerStartedEventAttributes() == null ^ this.getTimerStartedEventAttributes() == null) return false;
        if (other.getTimerStartedEventAttributes() != null && other.getTimerStartedEventAttributes().equals(this.getTimerStartedEventAttributes()) == false) return false; 
        if (other.getTimerFiredEventAttributes() == null ^ this.getTimerFiredEventAttributes() == null) return false;
        if (other.getTimerFiredEventAttributes() != null && other.getTimerFiredEventAttributes().equals(this.getTimerFiredEventAttributes()) == false) return false; 
        if (other.getTimerCanceledEventAttributes() == null ^ this.getTimerCanceledEventAttributes() == null) return false;
        if (other.getTimerCanceledEventAttributes() != null && other.getTimerCanceledEventAttributes().equals(this.getTimerCanceledEventAttributes()) == false) return false; 
        if (other.getStartChildWorkflowExecutionInitiatedEventAttributes() == null ^ this.getStartChildWorkflowExecutionInitiatedEventAttributes() == null) return false;
        if (other.getStartChildWorkflowExecutionInitiatedEventAttributes() != null && other.getStartChildWorkflowExecutionInitiatedEventAttributes().equals(this.getStartChildWorkflowExecutionInitiatedEventAttributes()) == false) return false; 
        if (other.getChildWorkflowExecutionStartedEventAttributes() == null ^ this.getChildWorkflowExecutionStartedEventAttributes() == null) return false;
        if (other.getChildWorkflowExecutionStartedEventAttributes() != null && other.getChildWorkflowExecutionStartedEventAttributes().equals(this.getChildWorkflowExecutionStartedEventAttributes()) == false) return false; 
        if (other.getChildWorkflowExecutionCompletedEventAttributes() == null ^ this.getChildWorkflowExecutionCompletedEventAttributes() == null) return false;
        if (other.getChildWorkflowExecutionCompletedEventAttributes() != null && other.getChildWorkflowExecutionCompletedEventAttributes().equals(this.getChildWorkflowExecutionCompletedEventAttributes()) == false) return false; 
        if (other.getChildWorkflowExecutionFailedEventAttributes() == null ^ this.getChildWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getChildWorkflowExecutionFailedEventAttributes() != null && other.getChildWorkflowExecutionFailedEventAttributes().equals(this.getChildWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getChildWorkflowExecutionTimedOutEventAttributes() == null ^ this.getChildWorkflowExecutionTimedOutEventAttributes() == null) return false;
        if (other.getChildWorkflowExecutionTimedOutEventAttributes() != null && other.getChildWorkflowExecutionTimedOutEventAttributes().equals(this.getChildWorkflowExecutionTimedOutEventAttributes()) == false) return false; 
        if (other.getChildWorkflowExecutionCanceledEventAttributes() == null ^ this.getChildWorkflowExecutionCanceledEventAttributes() == null) return false;
        if (other.getChildWorkflowExecutionCanceledEventAttributes() != null && other.getChildWorkflowExecutionCanceledEventAttributes().equals(this.getChildWorkflowExecutionCanceledEventAttributes()) == false) return false; 
        if (other.getChildWorkflowExecutionTerminatedEventAttributes() == null ^ this.getChildWorkflowExecutionTerminatedEventAttributes() == null) return false;
        if (other.getChildWorkflowExecutionTerminatedEventAttributes() != null && other.getChildWorkflowExecutionTerminatedEventAttributes().equals(this.getChildWorkflowExecutionTerminatedEventAttributes()) == false) return false; 
        if (other.getSignalExternalWorkflowExecutionInitiatedEventAttributes() == null ^ this.getSignalExternalWorkflowExecutionInitiatedEventAttributes() == null) return false;
        if (other.getSignalExternalWorkflowExecutionInitiatedEventAttributes() != null && other.getSignalExternalWorkflowExecutionInitiatedEventAttributes().equals(this.getSignalExternalWorkflowExecutionInitiatedEventAttributes()) == false) return false; 
        if (other.getExternalWorkflowExecutionSignaledEventAttributes() == null ^ this.getExternalWorkflowExecutionSignaledEventAttributes() == null) return false;
        if (other.getExternalWorkflowExecutionSignaledEventAttributes() != null && other.getExternalWorkflowExecutionSignaledEventAttributes().equals(this.getExternalWorkflowExecutionSignaledEventAttributes()) == false) return false; 
        if (other.getSignalExternalWorkflowExecutionFailedEventAttributes() == null ^ this.getSignalExternalWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getSignalExternalWorkflowExecutionFailedEventAttributes() != null && other.getSignalExternalWorkflowExecutionFailedEventAttributes().equals(this.getSignalExternalWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getExternalWorkflowExecutionCancelRequestedEventAttributes() == null ^ this.getExternalWorkflowExecutionCancelRequestedEventAttributes() == null) return false;
        if (other.getExternalWorkflowExecutionCancelRequestedEventAttributes() != null && other.getExternalWorkflowExecutionCancelRequestedEventAttributes().equals(this.getExternalWorkflowExecutionCancelRequestedEventAttributes()) == false) return false; 
        if (other.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() == null ^ this.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() == null) return false;
        if (other.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() != null && other.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes().equals(this.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes()) == false) return false; 
        if (other.getRequestCancelExternalWorkflowExecutionFailedEventAttributes() == null ^ this.getRequestCancelExternalWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getRequestCancelExternalWorkflowExecutionFailedEventAttributes() != null && other.getRequestCancelExternalWorkflowExecutionFailedEventAttributes().equals(this.getRequestCancelExternalWorkflowExecutionFailedEventAttributes()) == false) return false; 
        if (other.getScheduleActivityTaskFailedEventAttributes() == null ^ this.getScheduleActivityTaskFailedEventAttributes() == null) return false;
        if (other.getScheduleActivityTaskFailedEventAttributes() != null && other.getScheduleActivityTaskFailedEventAttributes().equals(this.getScheduleActivityTaskFailedEventAttributes()) == false) return false; 
        if (other.getRequestCancelActivityTaskFailedEventAttributes() == null ^ this.getRequestCancelActivityTaskFailedEventAttributes() == null) return false;
        if (other.getRequestCancelActivityTaskFailedEventAttributes() != null && other.getRequestCancelActivityTaskFailedEventAttributes().equals(this.getRequestCancelActivityTaskFailedEventAttributes()) == false) return false; 
        if (other.getStartTimerFailedEventAttributes() == null ^ this.getStartTimerFailedEventAttributes() == null) return false;
        if (other.getStartTimerFailedEventAttributes() != null && other.getStartTimerFailedEventAttributes().equals(this.getStartTimerFailedEventAttributes()) == false) return false; 
        if (other.getCancelTimerFailedEventAttributes() == null ^ this.getCancelTimerFailedEventAttributes() == null) return false;
        if (other.getCancelTimerFailedEventAttributes() != null && other.getCancelTimerFailedEventAttributes().equals(this.getCancelTimerFailedEventAttributes()) == false) return false; 
        if (other.getStartChildWorkflowExecutionFailedEventAttributes() == null ^ this.getStartChildWorkflowExecutionFailedEventAttributes() == null) return false;
        if (other.getStartChildWorkflowExecutionFailedEventAttributes() != null && other.getStartChildWorkflowExecutionFailedEventAttributes().equals(this.getStartChildWorkflowExecutionFailedEventAttributes()) == false) return false; 
        return true;
    }
    
}
    