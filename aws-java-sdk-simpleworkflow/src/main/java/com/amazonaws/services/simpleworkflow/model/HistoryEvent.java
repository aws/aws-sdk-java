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

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Event within a workflow execution. A history event can be one of these types:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ActivityTaskCancelRequested</code> – A <code>RequestCancelActivityTask</code> decision was received by the
 * system.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ActivityTaskCanceled</code> – The activity task was successfully canceled.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ActivityTaskCompleted</code> – An activity worker successfully completed an activity task by calling
 * <a>RespondActivityTaskCompleted</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ActivityTaskFailed</code> – An activity worker failed an activity task by calling
 * <a>RespondActivityTaskFailed</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ActivityTaskScheduled</code> – An activity task was scheduled for execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ActivityTaskStarted</code> – The scheduled activity task was dispatched to a worker.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ActivityTaskTimedOut</code> – The activity task timed out.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CancelTimerFailed</code> – Failed to process CancelTimer decision. This happens when the decision isn't
 * configured properly, for example no timer exists with the specified timer Id.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CancelWorkflowExecutionFailed</code> – A request to cancel a workflow execution failed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ChildWorkflowExecutionCanceled</code> – A child workflow execution, started by this workflow execution, was
 * canceled and closed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ChildWorkflowExecutionCompleted</code> – A child workflow execution, started by this workflow execution,
 * completed successfully and was closed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ChildWorkflowExecutionFailed</code> – A child workflow execution, started by this workflow execution, failed to
 * complete successfully and was closed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ChildWorkflowExecutionStarted</code> – A child workflow execution was successfully started.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ChildWorkflowExecutionTerminated</code> – A child workflow execution, started by this workflow execution, was
 * terminated.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ChildWorkflowExecutionTimedOut</code> – A child workflow execution, started by this workflow execution, timed
 * out and was closed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CompleteWorkflowExecutionFailed</code> – The workflow execution failed to complete.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ContinueAsNewWorkflowExecutionFailed</code> – The workflow execution failed to complete after being continued
 * as a new workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DecisionTaskCompleted</code> – The decider successfully completed a decision task by calling
 * <a>RespondDecisionTaskCompleted</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DecisionTaskScheduled</code> – A decision task was scheduled for the workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DecisionTaskStarted</code> – The decision task was dispatched to a decider.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DecisionTaskTimedOut</code> – The decision task timed out.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ExternalWorkflowExecutionCancelRequested</code> – Request to cancel an external workflow execution was
 * successfully delivered to the target execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ExternalWorkflowExecutionSignaled</code> – A signal, requested by this workflow execution, was successfully
 * delivered to the target external workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FailWorkflowExecutionFailed</code> – A request to mark a workflow execution as failed, itself failed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>MarkerRecorded</code> – A marker was recorded in the workflow history as the result of a
 * <code>RecordMarker</code> decision.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RecordMarkerFailed</code> – A <code>RecordMarker</code> decision was returned as failed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RequestCancelActivityTaskFailed</code> – Failed to process RequestCancelActivityTask decision. This happens
 * when the decision isn't configured properly.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RequestCancelExternalWorkflowExecutionFailed</code> – Request to cancel an external workflow execution failed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RequestCancelExternalWorkflowExecutionInitiated</code> – A request was made to request the cancellation of an
 * external workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ScheduleActivityTaskFailed</code> – Failed to process ScheduleActivityTask decision. This happens when the
 * decision isn't configured properly, for example the activity type specified isn't registered.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SignalExternalWorkflowExecutionFailed</code> – The request to signal an external workflow execution failed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SignalExternalWorkflowExecutionInitiated</code> – A request to signal an external workflow was made.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartActivityTaskFailed</code> – A scheduled activity task failed to start.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartChildWorkflowExecutionFailed</code> – Failed to process StartChildWorkflowExecution decision. This happens
 * when the decision isn't configured properly, for example the workflow type specified isn't registered.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartChildWorkflowExecutionInitiated</code> – A request was made to start a child workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartTimerFailed</code> – Failed to process StartTimer decision. This happens when the decision isn't
 * configured properly, for example a timer already exists with the specified timer Id.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TimerCanceled</code> – A timer, previously started for this workflow execution, was successfully canceled.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TimerFired</code> – A timer, previously started for this workflow execution, fired.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>TimerStarted</code> – A timer was started for the workflow execution due to a <code>StartTimer</code> decision.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionCancelRequested</code> – A request to cancel this workflow execution was made.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionCanceled</code> – The workflow execution was successfully canceled and closed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionCompleted</code> – The workflow execution was closed due to successful completion.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionContinuedAsNew</code> – The workflow execution was closed and a new execution of the same type
 * was created with the same workflowId.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionFailed</code> – The workflow execution closed due to a failure.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionSignaled</code> – An external signal was received for the workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionStarted</code> – The workflow execution was started.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionTerminated</code> – The workflow execution was terminated.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WorkflowExecutionTimedOut</code> – The workflow execution was closed because a time out was exceeded.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/HistoryEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoryEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     */
    private java.util.Date eventTimestamp;
    /**
     * <p>
     * The type of the history event.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution
     * history.
     * </p>
     */
    private Long eventId;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionStartedEventAttributes workflowExecutionStartedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionCompletedEventAttributes workflowExecutionCompletedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private CompleteWorkflowExecutionFailedEventAttributes completeWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionFailedEventAttributes workflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private FailWorkflowExecutionFailedEventAttributes failWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionTimedOutEventAttributes workflowExecutionTimedOutEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionCanceledEventAttributes workflowExecutionCanceledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>CancelWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private CancelWorkflowExecutionFailedEventAttributes cancelWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionContinuedAsNewEventAttributes workflowExecutionContinuedAsNewEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private ContinueAsNewWorkflowExecutionFailedEventAttributes continueAsNewWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTerminated</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionTerminatedEventAttributes workflowExecutionTerminatedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCancelRequested</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionCancelRequestedEventAttributes workflowExecutionCancelRequestedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>DecisionTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private DecisionTaskScheduledEventAttributes decisionTaskScheduledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>DecisionTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private DecisionTaskStartedEventAttributes decisionTaskStartedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>DecisionTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private DecisionTaskCompletedEventAttributes decisionTaskCompletedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>DecisionTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private DecisionTaskTimedOutEventAttributes decisionTaskTimedOutEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ActivityTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ActivityTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ActivityTaskStartedEventAttributes activityTaskStartedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ActivityTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ActivityTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     */
    private ActivityTaskFailedEventAttributes activityTaskFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ActivityTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ActivityTaskTimedOutEventAttributes activityTaskTimedOutEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ActivityTaskCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ActivityTaskcancelRequested</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ActivityTaskCancelRequestedEventAttributes activityTaskCancelRequestedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionSignaled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private WorkflowExecutionSignaledEventAttributes workflowExecutionSignaledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>MarkerRecorded</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     */
    private MarkerRecordedEventAttributes markerRecordedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>DecisionTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     */
    private RecordMarkerFailedEventAttributes recordMarkerFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>TimerStarted</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     */
    private TimerStartedEventAttributes timerStartedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>TimerFired</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     */
    private TimerFiredEventAttributes timerFiredEventAttributes;
    /**
     * <p>
     * If the event is of type <code>TimerCanceled</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     */
    private TimerCanceledEventAttributes timerCanceledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionInitiated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ChildWorkflowExecutionStartedEventAttributes childWorkflowExecutionStartedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private ChildWorkflowExecutionCompletedEventAttributes childWorkflowExecutionCompletedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ChildWorkflowExecutionTimedOutEventAttributes childWorkflowExecutionTimedOutEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ChildWorkflowExecutionCanceledEventAttributes childWorkflowExecutionCanceledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private ChildWorkflowExecutionTerminatedEventAttributes childWorkflowExecutionTerminatedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private SignalExternalWorkflowExecutionInitiatedEventAttributes signalExternalWorkflowExecutionInitiatedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private ExternalWorkflowExecutionSignaledEventAttributes externalWorkflowExecutionSignaledEventAttributes;
    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionCancelRequested</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private ExternalWorkflowExecutionCancelRequestedEventAttributes externalWorkflowExecutionCancelRequestedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private RequestCancelExternalWorkflowExecutionInitiatedEventAttributes requestCancelExternalWorkflowExecutionInitiatedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionFailed</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private RequestCancelExternalWorkflowExecutionFailedEventAttributes requestCancelExternalWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     */
    private ScheduleActivityTaskFailedEventAttributes scheduleActivityTaskFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>RequestCancelActivityTaskFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private RequestCancelActivityTaskFailedEventAttributes requestCancelActivityTaskFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>StartTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     */
    private StartTimerFailedEventAttributes startTimerFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>CancelTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     */
    private CancelTimerFailedEventAttributes cancelTimerFailedEventAttributes;
    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     */
    private StartChildWorkflowExecutionFailedEventAttributes startChildWorkflowExecutionFailedEventAttributes;
    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.
     * </p>
     */
    private LambdaFunctionScheduledEventAttributes lambdaFunctionScheduledEventAttributes;
    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
     * </p>
     */
    private LambdaFunctionStartedEventAttributes lambdaFunctionStartedEventAttributes;
    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event types.
     * </p>
     */
    private LambdaFunctionCompletedEventAttributes lambdaFunctionCompletedEventAttributes;
    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     */
    private LambdaFunctionFailedEventAttributes lambdaFunctionFailedEventAttributes;
    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionTimedOut</code> event. It isn't set for other event types.
     * </p>
     */
    private LambdaFunctionTimedOutEventAttributes lambdaFunctionTimedOutEventAttributes;
    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     */
    private ScheduleLambdaFunctionFailedEventAttributes scheduleLambdaFunctionFailedEventAttributes;
    /**
     * <p>
     * Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     */
    private StartLambdaFunctionFailedEventAttributes startLambdaFunctionFailedEventAttributes;

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @param eventTimestamp
     *        The date and time when the event occurred.
     */

    public void setEventTimestamp(java.util.Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @return The date and time when the event occurred.
     */

    public java.util.Date getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The date and time when the event occurred.
     * </p>
     * 
     * @param eventTimestamp
     *        The date and time when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withEventTimestamp(java.util.Date eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * The type of the history event.
     * </p>
     * 
     * @param eventType
     *        The type of the history event.
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of the history event.
     * </p>
     * 
     * @return The type of the history event.
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of the history event.
     * </p>
     * 
     * @param eventType
     *        The type of the history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public HistoryEvent withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of the history event.
     * </p>
     * 
     * @param eventType
     *        The type of the history event.
     * @see EventType
     */

    public void setEventType(EventType eventType) {
        withEventType(eventType);
    }

    /**
     * <p>
     * The type of the history event.
     * </p>
     * 
     * @param eventType
     *        The type of the history event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public HistoryEvent withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution
     * history.
     * </p>
     * 
     * @param eventId
     *        The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution
     *        history.
     */

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution
     * history.
     * </p>
     * 
     * @return The system generated ID of the event. This ID uniquely identifies the event with in the workflow
     *         execution history.
     */

    public Long getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution
     * history.
     * </p>
     * 
     * @param eventId
     *        The system generated ID of the event. This ID uniquely identifies the event with in the workflow execution
     *        history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withEventId(Long eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionStartedEventAttributes
     *        If the event is of type <code>WorkflowExecutionStarted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionStartedEventAttributes(WorkflowExecutionStartedEventAttributes workflowExecutionStartedEventAttributes) {
        this.workflowExecutionStartedEventAttributes = workflowExecutionStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionStarted</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionStartedEventAttributes getWorkflowExecutionStartedEventAttributes() {
        return this.workflowExecutionStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionStartedEventAttributes
     *        If the event is of type <code>WorkflowExecutionStarted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionStartedEventAttributes(WorkflowExecutionStartedEventAttributes workflowExecutionStartedEventAttributes) {
        setWorkflowExecutionStartedEventAttributes(workflowExecutionStartedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionCompletedEventAttributes
     *        If the event is of type <code>WorkflowExecutionCompleted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionCompletedEventAttributes(WorkflowExecutionCompletedEventAttributes workflowExecutionCompletedEventAttributes) {
        this.workflowExecutionCompletedEventAttributes = workflowExecutionCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionCompleted</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionCompletedEventAttributes getWorkflowExecutionCompletedEventAttributes() {
        return this.workflowExecutionCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionCompletedEventAttributes
     *        If the event is of type <code>WorkflowExecutionCompleted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionCompletedEventAttributes(WorkflowExecutionCompletedEventAttributes workflowExecutionCompletedEventAttributes) {
        setWorkflowExecutionCompletedEventAttributes(workflowExecutionCompletedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param completeWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>CompleteWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setCompleteWorkflowExecutionFailedEventAttributes(CompleteWorkflowExecutionFailedEventAttributes completeWorkflowExecutionFailedEventAttributes) {
        this.completeWorkflowExecutionFailedEventAttributes = completeWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>CompleteWorkflowExecutionFailed</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public CompleteWorkflowExecutionFailedEventAttributes getCompleteWorkflowExecutionFailedEventAttributes() {
        return this.completeWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>CompleteWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param completeWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>CompleteWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withCompleteWorkflowExecutionFailedEventAttributes(
            CompleteWorkflowExecutionFailedEventAttributes completeWorkflowExecutionFailedEventAttributes) {
        setCompleteWorkflowExecutionFailedEventAttributes(completeWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionFailedEventAttributes
     *        If the event is of type <code>WorkflowExecutionFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionFailedEventAttributes(WorkflowExecutionFailedEventAttributes workflowExecutionFailedEventAttributes) {
        this.workflowExecutionFailedEventAttributes = workflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionFailed</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionFailedEventAttributes getWorkflowExecutionFailedEventAttributes() {
        return this.workflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionFailedEventAttributes
     *        If the event is of type <code>WorkflowExecutionFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionFailedEventAttributes(WorkflowExecutionFailedEventAttributes workflowExecutionFailedEventAttributes) {
        setWorkflowExecutionFailedEventAttributes(workflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param failWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>FailWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setFailWorkflowExecutionFailedEventAttributes(FailWorkflowExecutionFailedEventAttributes failWorkflowExecutionFailedEventAttributes) {
        this.failWorkflowExecutionFailedEventAttributes = failWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>FailWorkflowExecutionFailed</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public FailWorkflowExecutionFailedEventAttributes getFailWorkflowExecutionFailedEventAttributes() {
        return this.failWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>FailWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param failWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>FailWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withFailWorkflowExecutionFailedEventAttributes(FailWorkflowExecutionFailedEventAttributes failWorkflowExecutionFailedEventAttributes) {
        setFailWorkflowExecutionFailedEventAttributes(failWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionTimedOutEventAttributes
     *        If the event is of type <code>WorkflowExecutionTimedOut</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionTimedOutEventAttributes(WorkflowExecutionTimedOutEventAttributes workflowExecutionTimedOutEventAttributes) {
        this.workflowExecutionTimedOutEventAttributes = workflowExecutionTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionTimedOut</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionTimedOutEventAttributes getWorkflowExecutionTimedOutEventAttributes() {
        return this.workflowExecutionTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionTimedOutEventAttributes
     *        If the event is of type <code>WorkflowExecutionTimedOut</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionTimedOutEventAttributes(WorkflowExecutionTimedOutEventAttributes workflowExecutionTimedOutEventAttributes) {
        setWorkflowExecutionTimedOutEventAttributes(workflowExecutionTimedOutEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionCanceledEventAttributes
     *        If the event is of type <code>WorkflowExecutionCanceled</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionCanceledEventAttributes(WorkflowExecutionCanceledEventAttributes workflowExecutionCanceledEventAttributes) {
        this.workflowExecutionCanceledEventAttributes = workflowExecutionCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionCanceled</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionCanceledEventAttributes getWorkflowExecutionCanceledEventAttributes() {
        return this.workflowExecutionCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionCanceledEventAttributes
     *        If the event is of type <code>WorkflowExecutionCanceled</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionCanceledEventAttributes(WorkflowExecutionCanceledEventAttributes workflowExecutionCanceledEventAttributes) {
        setWorkflowExecutionCanceledEventAttributes(workflowExecutionCanceledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>CancelWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param cancelWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>CancelWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setCancelWorkflowExecutionFailedEventAttributes(CancelWorkflowExecutionFailedEventAttributes cancelWorkflowExecutionFailedEventAttributes) {
        this.cancelWorkflowExecutionFailedEventAttributes = cancelWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>CancelWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>CancelWorkflowExecutionFailed</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public CancelWorkflowExecutionFailedEventAttributes getCancelWorkflowExecutionFailedEventAttributes() {
        return this.cancelWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>CancelWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param cancelWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>CancelWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withCancelWorkflowExecutionFailedEventAttributes(
            CancelWorkflowExecutionFailedEventAttributes cancelWorkflowExecutionFailedEventAttributes) {
        setCancelWorkflowExecutionFailedEventAttributes(cancelWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionContinuedAsNewEventAttributes
     *        If the event is of type <code>WorkflowExecutionContinuedAsNew</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionContinuedAsNewEventAttributes(WorkflowExecutionContinuedAsNewEventAttributes workflowExecutionContinuedAsNewEventAttributes) {
        this.workflowExecutionContinuedAsNewEventAttributes = workflowExecutionContinuedAsNewEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionContinuedAsNew</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionContinuedAsNewEventAttributes getWorkflowExecutionContinuedAsNewEventAttributes() {
        return this.workflowExecutionContinuedAsNewEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionContinuedAsNew</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionContinuedAsNewEventAttributes
     *        If the event is of type <code>WorkflowExecutionContinuedAsNew</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionContinuedAsNewEventAttributes(
            WorkflowExecutionContinuedAsNewEventAttributes workflowExecutionContinuedAsNewEventAttributes) {
        setWorkflowExecutionContinuedAsNewEventAttributes(workflowExecutionContinuedAsNewEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param continueAsNewWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     */

    public void setContinueAsNewWorkflowExecutionFailedEventAttributes(
            ContinueAsNewWorkflowExecutionFailedEventAttributes continueAsNewWorkflowExecutionFailedEventAttributes) {
        this.continueAsNewWorkflowExecutionFailedEventAttributes = continueAsNewWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public ContinueAsNewWorkflowExecutionFailedEventAttributes getContinueAsNewWorkflowExecutionFailedEventAttributes() {
        return this.continueAsNewWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param continueAsNewWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>ContinueAsNewWorkflowExecutionFailed</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withContinueAsNewWorkflowExecutionFailedEventAttributes(
            ContinueAsNewWorkflowExecutionFailedEventAttributes continueAsNewWorkflowExecutionFailedEventAttributes) {
        setContinueAsNewWorkflowExecutionFailedEventAttributes(continueAsNewWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTerminated</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionTerminatedEventAttributes
     *        If the event is of type <code>WorkflowExecutionTerminated</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionTerminatedEventAttributes(WorkflowExecutionTerminatedEventAttributes workflowExecutionTerminatedEventAttributes) {
        this.workflowExecutionTerminatedEventAttributes = workflowExecutionTerminatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTerminated</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionTerminated</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionTerminatedEventAttributes getWorkflowExecutionTerminatedEventAttributes() {
        return this.workflowExecutionTerminatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionTerminated</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionTerminatedEventAttributes
     *        If the event is of type <code>WorkflowExecutionTerminated</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionTerminatedEventAttributes(WorkflowExecutionTerminatedEventAttributes workflowExecutionTerminatedEventAttributes) {
        setWorkflowExecutionTerminatedEventAttributes(workflowExecutionTerminatedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCancelRequested</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionCancelRequestedEventAttributes
     *        If the event is of type <code>WorkflowExecutionCancelRequested</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionCancelRequestedEventAttributes(
            WorkflowExecutionCancelRequestedEventAttributes workflowExecutionCancelRequestedEventAttributes) {
        this.workflowExecutionCancelRequestedEventAttributes = workflowExecutionCancelRequestedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCancelRequested</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionCancelRequested</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionCancelRequestedEventAttributes getWorkflowExecutionCancelRequestedEventAttributes() {
        return this.workflowExecutionCancelRequestedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionCancelRequested</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionCancelRequestedEventAttributes
     *        If the event is of type <code>WorkflowExecutionCancelRequested</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionCancelRequestedEventAttributes(
            WorkflowExecutionCancelRequestedEventAttributes workflowExecutionCancelRequestedEventAttributes) {
        setWorkflowExecutionCancelRequestedEventAttributes(workflowExecutionCancelRequestedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskScheduledEventAttributes
     *        If the event is of type <code>DecisionTaskScheduled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setDecisionTaskScheduledEventAttributes(DecisionTaskScheduledEventAttributes decisionTaskScheduledEventAttributes) {
        this.decisionTaskScheduledEventAttributes = decisionTaskScheduledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>DecisionTaskScheduled</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public DecisionTaskScheduledEventAttributes getDecisionTaskScheduledEventAttributes() {
        return this.decisionTaskScheduledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskScheduledEventAttributes
     *        If the event is of type <code>DecisionTaskScheduled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withDecisionTaskScheduledEventAttributes(DecisionTaskScheduledEventAttributes decisionTaskScheduledEventAttributes) {
        setDecisionTaskScheduledEventAttributes(decisionTaskScheduledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskStartedEventAttributes
     *        If the event is of type <code>DecisionTaskStarted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setDecisionTaskStartedEventAttributes(DecisionTaskStartedEventAttributes decisionTaskStartedEventAttributes) {
        this.decisionTaskStartedEventAttributes = decisionTaskStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>DecisionTaskStarted</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public DecisionTaskStartedEventAttributes getDecisionTaskStartedEventAttributes() {
        return this.decisionTaskStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskStartedEventAttributes
     *        If the event is of type <code>DecisionTaskStarted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withDecisionTaskStartedEventAttributes(DecisionTaskStartedEventAttributes decisionTaskStartedEventAttributes) {
        setDecisionTaskStartedEventAttributes(decisionTaskStartedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskCompletedEventAttributes
     *        If the event is of type <code>DecisionTaskCompleted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setDecisionTaskCompletedEventAttributes(DecisionTaskCompletedEventAttributes decisionTaskCompletedEventAttributes) {
        this.decisionTaskCompletedEventAttributes = decisionTaskCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>DecisionTaskCompleted</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public DecisionTaskCompletedEventAttributes getDecisionTaskCompletedEventAttributes() {
        return this.decisionTaskCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskCompletedEventAttributes
     *        If the event is of type <code>DecisionTaskCompleted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withDecisionTaskCompletedEventAttributes(DecisionTaskCompletedEventAttributes decisionTaskCompletedEventAttributes) {
        setDecisionTaskCompletedEventAttributes(decisionTaskCompletedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskTimedOutEventAttributes
     *        If the event is of type <code>DecisionTaskTimedOut</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setDecisionTaskTimedOutEventAttributes(DecisionTaskTimedOutEventAttributes decisionTaskTimedOutEventAttributes) {
        this.decisionTaskTimedOutEventAttributes = decisionTaskTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>DecisionTaskTimedOut</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public DecisionTaskTimedOutEventAttributes getDecisionTaskTimedOutEventAttributes() {
        return this.decisionTaskTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param decisionTaskTimedOutEventAttributes
     *        If the event is of type <code>DecisionTaskTimedOut</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withDecisionTaskTimedOutEventAttributes(DecisionTaskTimedOutEventAttributes decisionTaskTimedOutEventAttributes) {
        setDecisionTaskTimedOutEventAttributes(decisionTaskTimedOutEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskScheduledEventAttributes
     *        If the event is of type <code>ActivityTaskScheduled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setActivityTaskScheduledEventAttributes(ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes) {
        this.activityTaskScheduledEventAttributes = activityTaskScheduledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ActivityTaskScheduled</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public ActivityTaskScheduledEventAttributes getActivityTaskScheduledEventAttributes() {
        return this.activityTaskScheduledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskScheduled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskScheduledEventAttributes
     *        If the event is of type <code>ActivityTaskScheduled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTaskScheduledEventAttributes(ActivityTaskScheduledEventAttributes activityTaskScheduledEventAttributes) {
        setActivityTaskScheduledEventAttributes(activityTaskScheduledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskStartedEventAttributes
     *        If the event is of type <code>ActivityTaskStarted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setActivityTaskStartedEventAttributes(ActivityTaskStartedEventAttributes activityTaskStartedEventAttributes) {
        this.activityTaskStartedEventAttributes = activityTaskStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ActivityTaskStarted</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public ActivityTaskStartedEventAttributes getActivityTaskStartedEventAttributes() {
        return this.activityTaskStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskStartedEventAttributes
     *        If the event is of type <code>ActivityTaskStarted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTaskStartedEventAttributes(ActivityTaskStartedEventAttributes activityTaskStartedEventAttributes) {
        setActivityTaskStartedEventAttributes(activityTaskStartedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskCompletedEventAttributes
     *        If the event is of type <code>ActivityTaskCompleted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setActivityTaskCompletedEventAttributes(ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes) {
        this.activityTaskCompletedEventAttributes = activityTaskCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ActivityTaskCompleted</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public ActivityTaskCompletedEventAttributes getActivityTaskCompletedEventAttributes() {
        return this.activityTaskCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskCompleted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskCompletedEventAttributes
     *        If the event is of type <code>ActivityTaskCompleted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTaskCompletedEventAttributes(ActivityTaskCompletedEventAttributes activityTaskCompletedEventAttributes) {
        setActivityTaskCompletedEventAttributes(activityTaskCompletedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskFailedEventAttributes
     *        If the event is of type <code>ActivityTaskFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setActivityTaskFailedEventAttributes(ActivityTaskFailedEventAttributes activityTaskFailedEventAttributes) {
        this.activityTaskFailedEventAttributes = activityTaskFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ActivityTaskFailed</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public ActivityTaskFailedEventAttributes getActivityTaskFailedEventAttributes() {
        return this.activityTaskFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskFailedEventAttributes
     *        If the event is of type <code>ActivityTaskFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTaskFailedEventAttributes(ActivityTaskFailedEventAttributes activityTaskFailedEventAttributes) {
        setActivityTaskFailedEventAttributes(activityTaskFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskTimedOutEventAttributes
     *        If the event is of type <code>ActivityTaskTimedOut</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setActivityTaskTimedOutEventAttributes(ActivityTaskTimedOutEventAttributes activityTaskTimedOutEventAttributes) {
        this.activityTaskTimedOutEventAttributes = activityTaskTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ActivityTaskTimedOut</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public ActivityTaskTimedOutEventAttributes getActivityTaskTimedOutEventAttributes() {
        return this.activityTaskTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskTimedOutEventAttributes
     *        If the event is of type <code>ActivityTaskTimedOut</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTaskTimedOutEventAttributes(ActivityTaskTimedOutEventAttributes activityTaskTimedOutEventAttributes) {
        setActivityTaskTimedOutEventAttributes(activityTaskTimedOutEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskCanceledEventAttributes
     *        If the event is of type <code>ActivityTaskCanceled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setActivityTaskCanceledEventAttributes(ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes) {
        this.activityTaskCanceledEventAttributes = activityTaskCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ActivityTaskCanceled</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public ActivityTaskCanceledEventAttributes getActivityTaskCanceledEventAttributes() {
        return this.activityTaskCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskCanceledEventAttributes
     *        If the event is of type <code>ActivityTaskCanceled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTaskCanceledEventAttributes(ActivityTaskCanceledEventAttributes activityTaskCanceledEventAttributes) {
        setActivityTaskCanceledEventAttributes(activityTaskCanceledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskcancelRequested</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskCancelRequestedEventAttributes
     *        If the event is of type <code>ActivityTaskcancelRequested</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setActivityTaskCancelRequestedEventAttributes(ActivityTaskCancelRequestedEventAttributes activityTaskCancelRequestedEventAttributes) {
        this.activityTaskCancelRequestedEventAttributes = activityTaskCancelRequestedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskcancelRequested</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ActivityTaskcancelRequested</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public ActivityTaskCancelRequestedEventAttributes getActivityTaskCancelRequestedEventAttributes() {
        return this.activityTaskCancelRequestedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ActivityTaskcancelRequested</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param activityTaskCancelRequestedEventAttributes
     *        If the event is of type <code>ActivityTaskcancelRequested</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTaskCancelRequestedEventAttributes(ActivityTaskCancelRequestedEventAttributes activityTaskCancelRequestedEventAttributes) {
        setActivityTaskCancelRequestedEventAttributes(activityTaskCancelRequestedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionSignaled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionSignaledEventAttributes
     *        If the event is of type <code>WorkflowExecutionSignaled</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setWorkflowExecutionSignaledEventAttributes(WorkflowExecutionSignaledEventAttributes workflowExecutionSignaledEventAttributes) {
        this.workflowExecutionSignaledEventAttributes = workflowExecutionSignaledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionSignaled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>WorkflowExecutionSignaled</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public WorkflowExecutionSignaledEventAttributes getWorkflowExecutionSignaledEventAttributes() {
        return this.workflowExecutionSignaledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>WorkflowExecutionSignaled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param workflowExecutionSignaledEventAttributes
     *        If the event is of type <code>WorkflowExecutionSignaled</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withWorkflowExecutionSignaledEventAttributes(WorkflowExecutionSignaledEventAttributes workflowExecutionSignaledEventAttributes) {
        setWorkflowExecutionSignaledEventAttributes(workflowExecutionSignaledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>MarkerRecorded</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param markerRecordedEventAttributes
     *        If the event is of type <code>MarkerRecorded</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setMarkerRecordedEventAttributes(MarkerRecordedEventAttributes markerRecordedEventAttributes) {
        this.markerRecordedEventAttributes = markerRecordedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>MarkerRecorded</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>MarkerRecorded</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public MarkerRecordedEventAttributes getMarkerRecordedEventAttributes() {
        return this.markerRecordedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>MarkerRecorded</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param markerRecordedEventAttributes
     *        If the event is of type <code>MarkerRecorded</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withMarkerRecordedEventAttributes(MarkerRecordedEventAttributes markerRecordedEventAttributes) {
        setMarkerRecordedEventAttributes(markerRecordedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param recordMarkerFailedEventAttributes
     *        If the event is of type <code>DecisionTaskFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setRecordMarkerFailedEventAttributes(RecordMarkerFailedEventAttributes recordMarkerFailedEventAttributes) {
        this.recordMarkerFailedEventAttributes = recordMarkerFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>DecisionTaskFailed</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public RecordMarkerFailedEventAttributes getRecordMarkerFailedEventAttributes() {
        return this.recordMarkerFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>DecisionTaskFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param recordMarkerFailedEventAttributes
     *        If the event is of type <code>DecisionTaskFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withRecordMarkerFailedEventAttributes(RecordMarkerFailedEventAttributes recordMarkerFailedEventAttributes) {
        setRecordMarkerFailedEventAttributes(recordMarkerFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>TimerStarted</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     * 
     * @param timerStartedEventAttributes
     *        If the event is of type <code>TimerStarted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setTimerStartedEventAttributes(TimerStartedEventAttributes timerStartedEventAttributes) {
        this.timerStartedEventAttributes = timerStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>TimerStarted</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>TimerStarted</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public TimerStartedEventAttributes getTimerStartedEventAttributes() {
        return this.timerStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>TimerStarted</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     * 
     * @param timerStartedEventAttributes
     *        If the event is of type <code>TimerStarted</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTimerStartedEventAttributes(TimerStartedEventAttributes timerStartedEventAttributes) {
        setTimerStartedEventAttributes(timerStartedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>TimerFired</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     * 
     * @param timerFiredEventAttributes
     *        If the event is of type <code>TimerFired</code> then this member is set and provides detailed information
     *        about the event. It isn't set for other event types.
     */

    public void setTimerFiredEventAttributes(TimerFiredEventAttributes timerFiredEventAttributes) {
        this.timerFiredEventAttributes = timerFiredEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>TimerFired</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>TimerFired</code> then this member is set and provides detailed information
     *         about the event. It isn't set for other event types.
     */

    public TimerFiredEventAttributes getTimerFiredEventAttributes() {
        return this.timerFiredEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>TimerFired</code> then this member is set and provides detailed information about
     * the event. It isn't set for other event types.
     * </p>
     * 
     * @param timerFiredEventAttributes
     *        If the event is of type <code>TimerFired</code> then this member is set and provides detailed information
     *        about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTimerFiredEventAttributes(TimerFiredEventAttributes timerFiredEventAttributes) {
        setTimerFiredEventAttributes(timerFiredEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>TimerCanceled</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param timerCanceledEventAttributes
     *        If the event is of type <code>TimerCanceled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setTimerCanceledEventAttributes(TimerCanceledEventAttributes timerCanceledEventAttributes) {
        this.timerCanceledEventAttributes = timerCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>TimerCanceled</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>TimerCanceled</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public TimerCanceledEventAttributes getTimerCanceledEventAttributes() {
        return this.timerCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>TimerCanceled</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param timerCanceledEventAttributes
     *        If the event is of type <code>TimerCanceled</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTimerCanceledEventAttributes(TimerCanceledEventAttributes timerCanceledEventAttributes) {
        setTimerCanceledEventAttributes(timerCanceledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionInitiated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param startChildWorkflowExecutionInitiatedEventAttributes
     *        If the event is of type <code>StartChildWorkflowExecutionInitiated</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     */

    public void setStartChildWorkflowExecutionInitiatedEventAttributes(
            StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes) {
        this.startChildWorkflowExecutionInitiatedEventAttributes = startChildWorkflowExecutionInitiatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionInitiated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>StartChildWorkflowExecutionInitiated</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public StartChildWorkflowExecutionInitiatedEventAttributes getStartChildWorkflowExecutionInitiatedEventAttributes() {
        return this.startChildWorkflowExecutionInitiatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionInitiated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param startChildWorkflowExecutionInitiatedEventAttributes
     *        If the event is of type <code>StartChildWorkflowExecutionInitiated</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStartChildWorkflowExecutionInitiatedEventAttributes(
            StartChildWorkflowExecutionInitiatedEventAttributes startChildWorkflowExecutionInitiatedEventAttributes) {
        setStartChildWorkflowExecutionInitiatedEventAttributes(startChildWorkflowExecutionInitiatedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionStartedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionStarted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setChildWorkflowExecutionStartedEventAttributes(ChildWorkflowExecutionStartedEventAttributes childWorkflowExecutionStartedEventAttributes) {
        this.childWorkflowExecutionStartedEventAttributes = childWorkflowExecutionStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ChildWorkflowExecutionStarted</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public ChildWorkflowExecutionStartedEventAttributes getChildWorkflowExecutionStartedEventAttributes() {
        return this.childWorkflowExecutionStartedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionStarted</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionStartedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionStarted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withChildWorkflowExecutionStartedEventAttributes(
            ChildWorkflowExecutionStartedEventAttributes childWorkflowExecutionStartedEventAttributes) {
        setChildWorkflowExecutionStartedEventAttributes(childWorkflowExecutionStartedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionCompletedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionCompleted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setChildWorkflowExecutionCompletedEventAttributes(ChildWorkflowExecutionCompletedEventAttributes childWorkflowExecutionCompletedEventAttributes) {
        this.childWorkflowExecutionCompletedEventAttributes = childWorkflowExecutionCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ChildWorkflowExecutionCompleted</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public ChildWorkflowExecutionCompletedEventAttributes getChildWorkflowExecutionCompletedEventAttributes() {
        return this.childWorkflowExecutionCompletedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCompleted</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionCompletedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionCompleted</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withChildWorkflowExecutionCompletedEventAttributes(
            ChildWorkflowExecutionCompletedEventAttributes childWorkflowExecutionCompletedEventAttributes) {
        setChildWorkflowExecutionCompletedEventAttributes(childWorkflowExecutionCompletedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setChildWorkflowExecutionFailedEventAttributes(ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes) {
        this.childWorkflowExecutionFailedEventAttributes = childWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ChildWorkflowExecutionFailed</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public ChildWorkflowExecutionFailedEventAttributes getChildWorkflowExecutionFailedEventAttributes() {
        return this.childWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withChildWorkflowExecutionFailedEventAttributes(ChildWorkflowExecutionFailedEventAttributes childWorkflowExecutionFailedEventAttributes) {
        setChildWorkflowExecutionFailedEventAttributes(childWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionTimedOutEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionTimedOut</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setChildWorkflowExecutionTimedOutEventAttributes(ChildWorkflowExecutionTimedOutEventAttributes childWorkflowExecutionTimedOutEventAttributes) {
        this.childWorkflowExecutionTimedOutEventAttributes = childWorkflowExecutionTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ChildWorkflowExecutionTimedOut</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public ChildWorkflowExecutionTimedOutEventAttributes getChildWorkflowExecutionTimedOutEventAttributes() {
        return this.childWorkflowExecutionTimedOutEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTimedOut</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionTimedOutEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionTimedOut</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withChildWorkflowExecutionTimedOutEventAttributes(
            ChildWorkflowExecutionTimedOutEventAttributes childWorkflowExecutionTimedOutEventAttributes) {
        setChildWorkflowExecutionTimedOutEventAttributes(childWorkflowExecutionTimedOutEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionCanceledEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionCanceled</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setChildWorkflowExecutionCanceledEventAttributes(ChildWorkflowExecutionCanceledEventAttributes childWorkflowExecutionCanceledEventAttributes) {
        this.childWorkflowExecutionCanceledEventAttributes = childWorkflowExecutionCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ChildWorkflowExecutionCanceled</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public ChildWorkflowExecutionCanceledEventAttributes getChildWorkflowExecutionCanceledEventAttributes() {
        return this.childWorkflowExecutionCanceledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionCanceled</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionCanceledEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionCanceled</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withChildWorkflowExecutionCanceledEventAttributes(
            ChildWorkflowExecutionCanceledEventAttributes childWorkflowExecutionCanceledEventAttributes) {
        setChildWorkflowExecutionCanceledEventAttributes(childWorkflowExecutionCanceledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionTerminatedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionTerminated</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setChildWorkflowExecutionTerminatedEventAttributes(
            ChildWorkflowExecutionTerminatedEventAttributes childWorkflowExecutionTerminatedEventAttributes) {
        this.childWorkflowExecutionTerminatedEventAttributes = childWorkflowExecutionTerminatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ChildWorkflowExecutionTerminated</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public ChildWorkflowExecutionTerminatedEventAttributes getChildWorkflowExecutionTerminatedEventAttributes() {
        return this.childWorkflowExecutionTerminatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ChildWorkflowExecutionTerminated</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param childWorkflowExecutionTerminatedEventAttributes
     *        If the event is of type <code>ChildWorkflowExecutionTerminated</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withChildWorkflowExecutionTerminatedEventAttributes(
            ChildWorkflowExecutionTerminatedEventAttributes childWorkflowExecutionTerminatedEventAttributes) {
        setChildWorkflowExecutionTerminatedEventAttributes(childWorkflowExecutionTerminatedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionInitiatedEventAttributes
     *        If the event is of type <code>SignalExternalWorkflowExecutionInitiated</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     */

    public void setSignalExternalWorkflowExecutionInitiatedEventAttributes(
            SignalExternalWorkflowExecutionInitiatedEventAttributes signalExternalWorkflowExecutionInitiatedEventAttributes) {
        this.signalExternalWorkflowExecutionInitiatedEventAttributes = signalExternalWorkflowExecutionInitiatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>SignalExternalWorkflowExecutionInitiated</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes getSignalExternalWorkflowExecutionInitiatedEventAttributes() {
        return this.signalExternalWorkflowExecutionInitiatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionInitiatedEventAttributes
     *        If the event is of type <code>SignalExternalWorkflowExecutionInitiated</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withSignalExternalWorkflowExecutionInitiatedEventAttributes(
            SignalExternalWorkflowExecutionInitiatedEventAttributes signalExternalWorkflowExecutionInitiatedEventAttributes) {
        setSignalExternalWorkflowExecutionInitiatedEventAttributes(signalExternalWorkflowExecutionInitiatedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param externalWorkflowExecutionSignaledEventAttributes
     *        If the event is of type <code>ExternalWorkflowExecutionSignaled</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     */

    public void setExternalWorkflowExecutionSignaledEventAttributes(
            ExternalWorkflowExecutionSignaledEventAttributes externalWorkflowExecutionSignaledEventAttributes) {
        this.externalWorkflowExecutionSignaledEventAttributes = externalWorkflowExecutionSignaledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ExternalWorkflowExecutionSignaled</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public ExternalWorkflowExecutionSignaledEventAttributes getExternalWorkflowExecutionSignaledEventAttributes() {
        return this.externalWorkflowExecutionSignaledEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionSignaled</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param externalWorkflowExecutionSignaledEventAttributes
     *        If the event is of type <code>ExternalWorkflowExecutionSignaled</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExternalWorkflowExecutionSignaledEventAttributes(
            ExternalWorkflowExecutionSignaledEventAttributes externalWorkflowExecutionSignaledEventAttributes) {
        setExternalWorkflowExecutionSignaledEventAttributes(externalWorkflowExecutionSignaledEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>SignalExternalWorkflowExecutionFailed</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     */

    public void setSignalExternalWorkflowExecutionFailedEventAttributes(
            SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes) {
        this.signalExternalWorkflowExecutionFailedEventAttributes = signalExternalWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>SignalExternalWorkflowExecutionFailed</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public SignalExternalWorkflowExecutionFailedEventAttributes getSignalExternalWorkflowExecutionFailedEventAttributes() {
        return this.signalExternalWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>SignalExternalWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>SignalExternalWorkflowExecutionFailed</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withSignalExternalWorkflowExecutionFailedEventAttributes(
            SignalExternalWorkflowExecutionFailedEventAttributes signalExternalWorkflowExecutionFailedEventAttributes) {
        setSignalExternalWorkflowExecutionFailedEventAttributes(signalExternalWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionCancelRequested</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param externalWorkflowExecutionCancelRequestedEventAttributes
     *        If the event is of type <code>ExternalWorkflowExecutionCancelRequested</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     */

    public void setExternalWorkflowExecutionCancelRequestedEventAttributes(
            ExternalWorkflowExecutionCancelRequestedEventAttributes externalWorkflowExecutionCancelRequestedEventAttributes) {
        this.externalWorkflowExecutionCancelRequestedEventAttributes = externalWorkflowExecutionCancelRequestedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionCancelRequested</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ExternalWorkflowExecutionCancelRequested</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public ExternalWorkflowExecutionCancelRequestedEventAttributes getExternalWorkflowExecutionCancelRequestedEventAttributes() {
        return this.externalWorkflowExecutionCancelRequestedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ExternalWorkflowExecutionCancelRequested</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param externalWorkflowExecutionCancelRequestedEventAttributes
     *        If the event is of type <code>ExternalWorkflowExecutionCancelRequested</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExternalWorkflowExecutionCancelRequestedEventAttributes(
            ExternalWorkflowExecutionCancelRequestedEventAttributes externalWorkflowExecutionCancelRequestedEventAttributes) {
        setExternalWorkflowExecutionCancelRequestedEventAttributes(externalWorkflowExecutionCancelRequestedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionInitiatedEventAttributes
     *        If the event is of type <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this member is
     *        set and provides detailed information about the event. It isn't set for other event types.
     */

    public void setRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(
            RequestCancelExternalWorkflowExecutionInitiatedEventAttributes requestCancelExternalWorkflowExecutionInitiatedEventAttributes) {
        this.requestCancelExternalWorkflowExecutionInitiatedEventAttributes = requestCancelExternalWorkflowExecutionInitiatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this member is
     *         set and provides detailed information about the event. It isn't set for other event types.
     */

    public RequestCancelExternalWorkflowExecutionInitiatedEventAttributes getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() {
        return this.requestCancelExternalWorkflowExecutionInitiatedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionInitiatedEventAttributes
     *        If the event is of type <code>RequestCancelExternalWorkflowExecutionInitiated</code> then this member is
     *        set and provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(
            RequestCancelExternalWorkflowExecutionInitiatedEventAttributes requestCancelExternalWorkflowExecutionInitiatedEventAttributes) {
        setRequestCancelExternalWorkflowExecutionInitiatedEventAttributes(requestCancelExternalWorkflowExecutionInitiatedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionFailed</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>RequestCancelExternalWorkflowExecutionFailed</code> then this member is set
     *        and provides detailed information about the event. It isn't set for other event types.
     */

    public void setRequestCancelExternalWorkflowExecutionFailedEventAttributes(
            RequestCancelExternalWorkflowExecutionFailedEventAttributes requestCancelExternalWorkflowExecutionFailedEventAttributes) {
        this.requestCancelExternalWorkflowExecutionFailedEventAttributes = requestCancelExternalWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionFailed</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>RequestCancelExternalWorkflowExecutionFailed</code> then this member is set
     *         and provides detailed information about the event. It isn't set for other event types.
     */

    public RequestCancelExternalWorkflowExecutionFailedEventAttributes getRequestCancelExternalWorkflowExecutionFailedEventAttributes() {
        return this.requestCancelExternalWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelExternalWorkflowExecutionFailed</code> then this member is set and
     * provides detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>RequestCancelExternalWorkflowExecutionFailed</code> then this member is set
     *        and provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withRequestCancelExternalWorkflowExecutionFailedEventAttributes(
            RequestCancelExternalWorkflowExecutionFailedEventAttributes requestCancelExternalWorkflowExecutionFailedEventAttributes) {
        setRequestCancelExternalWorkflowExecutionFailedEventAttributes(requestCancelExternalWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param scheduleActivityTaskFailedEventAttributes
     *        If the event is of type <code>ScheduleActivityTaskFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setScheduleActivityTaskFailedEventAttributes(ScheduleActivityTaskFailedEventAttributes scheduleActivityTaskFailedEventAttributes) {
        this.scheduleActivityTaskFailedEventAttributes = scheduleActivityTaskFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>ScheduleActivityTaskFailed</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public ScheduleActivityTaskFailedEventAttributes getScheduleActivityTaskFailedEventAttributes() {
        return this.scheduleActivityTaskFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>ScheduleActivityTaskFailed</code> then this member is set and provides detailed
     * information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param scheduleActivityTaskFailedEventAttributes
     *        If the event is of type <code>ScheduleActivityTaskFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withScheduleActivityTaskFailedEventAttributes(ScheduleActivityTaskFailedEventAttributes scheduleActivityTaskFailedEventAttributes) {
        setScheduleActivityTaskFailedEventAttributes(scheduleActivityTaskFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelActivityTaskFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param requestCancelActivityTaskFailedEventAttributes
     *        If the event is of type <code>RequestCancelActivityTaskFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     */

    public void setRequestCancelActivityTaskFailedEventAttributes(RequestCancelActivityTaskFailedEventAttributes requestCancelActivityTaskFailedEventAttributes) {
        this.requestCancelActivityTaskFailedEventAttributes = requestCancelActivityTaskFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelActivityTaskFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>RequestCancelActivityTaskFailed</code> then this member is set and provides
     *         detailed information about the event. It isn't set for other event types.
     */

    public RequestCancelActivityTaskFailedEventAttributes getRequestCancelActivityTaskFailedEventAttributes() {
        return this.requestCancelActivityTaskFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>RequestCancelActivityTaskFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param requestCancelActivityTaskFailedEventAttributes
     *        If the event is of type <code>RequestCancelActivityTaskFailed</code> then this member is set and provides
     *        detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withRequestCancelActivityTaskFailedEventAttributes(
            RequestCancelActivityTaskFailedEventAttributes requestCancelActivityTaskFailedEventAttributes) {
        setRequestCancelActivityTaskFailedEventAttributes(requestCancelActivityTaskFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>StartTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param startTimerFailedEventAttributes
     *        If the event is of type <code>StartTimerFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setStartTimerFailedEventAttributes(StartTimerFailedEventAttributes startTimerFailedEventAttributes) {
        this.startTimerFailedEventAttributes = startTimerFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>StartTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>StartTimerFailed</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public StartTimerFailedEventAttributes getStartTimerFailedEventAttributes() {
        return this.startTimerFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>StartTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param startTimerFailedEventAttributes
     *        If the event is of type <code>StartTimerFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStartTimerFailedEventAttributes(StartTimerFailedEventAttributes startTimerFailedEventAttributes) {
        setStartTimerFailedEventAttributes(startTimerFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>CancelTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param cancelTimerFailedEventAttributes
     *        If the event is of type <code>CancelTimerFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     */

    public void setCancelTimerFailedEventAttributes(CancelTimerFailedEventAttributes cancelTimerFailedEventAttributes) {
        this.cancelTimerFailedEventAttributes = cancelTimerFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>CancelTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>CancelTimerFailed</code> then this member is set and provides detailed
     *         information about the event. It isn't set for other event types.
     */

    public CancelTimerFailedEventAttributes getCancelTimerFailedEventAttributes() {
        return this.cancelTimerFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>CancelTimerFailed</code> then this member is set and provides detailed information
     * about the event. It isn't set for other event types.
     * </p>
     * 
     * @param cancelTimerFailedEventAttributes
     *        If the event is of type <code>CancelTimerFailed</code> then this member is set and provides detailed
     *        information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withCancelTimerFailedEventAttributes(CancelTimerFailedEventAttributes cancelTimerFailedEventAttributes) {
        setCancelTimerFailedEventAttributes(cancelTimerFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param startChildWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>StartChildWorkflowExecutionFailed</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     */

    public void setStartChildWorkflowExecutionFailedEventAttributes(
            StartChildWorkflowExecutionFailedEventAttributes startChildWorkflowExecutionFailedEventAttributes) {
        this.startChildWorkflowExecutionFailedEventAttributes = startChildWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @return If the event is of type <code>StartChildWorkflowExecutionFailed</code> then this member is set and
     *         provides detailed information about the event. It isn't set for other event types.
     */

    public StartChildWorkflowExecutionFailedEventAttributes getStartChildWorkflowExecutionFailedEventAttributes() {
        return this.startChildWorkflowExecutionFailedEventAttributes;
    }

    /**
     * <p>
     * If the event is of type <code>StartChildWorkflowExecutionFailed</code> then this member is set and provides
     * detailed information about the event. It isn't set for other event types.
     * </p>
     * 
     * @param startChildWorkflowExecutionFailedEventAttributes
     *        If the event is of type <code>StartChildWorkflowExecutionFailed</code> then this member is set and
     *        provides detailed information about the event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStartChildWorkflowExecutionFailedEventAttributes(
            StartChildWorkflowExecutionFailedEventAttributes startChildWorkflowExecutionFailedEventAttributes) {
        setStartChildWorkflowExecutionFailedEventAttributes(startChildWorkflowExecutionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionScheduledEventAttributes
     *        Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event
     *        types.
     */

    public void setLambdaFunctionScheduledEventAttributes(LambdaFunctionScheduledEventAttributes lambdaFunctionScheduledEventAttributes) {
        this.lambdaFunctionScheduledEventAttributes = lambdaFunctionScheduledEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.
     * </p>
     * 
     * @return Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event
     *         types.
     */

    public LambdaFunctionScheduledEventAttributes getLambdaFunctionScheduledEventAttributes() {
        return this.lambdaFunctionScheduledEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionScheduledEventAttributes
     *        Provides the details of the <code>LambdaFunctionScheduled</code> event. It isn't set for other event
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionScheduledEventAttributes(LambdaFunctionScheduledEventAttributes lambdaFunctionScheduledEventAttributes) {
        setLambdaFunctionScheduledEventAttributes(lambdaFunctionScheduledEventAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionStartedEventAttributes
     *        Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
     */

    public void setLambdaFunctionStartedEventAttributes(LambdaFunctionStartedEventAttributes lambdaFunctionStartedEventAttributes) {
        this.lambdaFunctionStartedEventAttributes = lambdaFunctionStartedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
     * </p>
     * 
     * @return Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
     */

    public LambdaFunctionStartedEventAttributes getLambdaFunctionStartedEventAttributes() {
        return this.lambdaFunctionStartedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionStartedEventAttributes
     *        Provides the details of the <code>LambdaFunctionStarted</code> event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionStartedEventAttributes(LambdaFunctionStartedEventAttributes lambdaFunctionStartedEventAttributes) {
        setLambdaFunctionStartedEventAttributes(lambdaFunctionStartedEventAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionCompletedEventAttributes
     *        Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event
     *        types.
     */

    public void setLambdaFunctionCompletedEventAttributes(LambdaFunctionCompletedEventAttributes lambdaFunctionCompletedEventAttributes) {
        this.lambdaFunctionCompletedEventAttributes = lambdaFunctionCompletedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event types.
     * </p>
     * 
     * @return Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event
     *         types.
     */

    public LambdaFunctionCompletedEventAttributes getLambdaFunctionCompletedEventAttributes() {
        return this.lambdaFunctionCompletedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionCompletedEventAttributes
     *        Provides the details of the <code>LambdaFunctionCompleted</code> event. It isn't set for other event
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionCompletedEventAttributes(LambdaFunctionCompletedEventAttributes lambdaFunctionCompletedEventAttributes) {
        setLambdaFunctionCompletedEventAttributes(lambdaFunctionCompletedEventAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionFailedEventAttributes
     *        Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
     */

    public void setLambdaFunctionFailedEventAttributes(LambdaFunctionFailedEventAttributes lambdaFunctionFailedEventAttributes) {
        this.lambdaFunctionFailedEventAttributes = lambdaFunctionFailedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @return Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
     */

    public LambdaFunctionFailedEventAttributes getLambdaFunctionFailedEventAttributes() {
        return this.lambdaFunctionFailedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionFailedEventAttributes
     *        Provides the details of the <code>LambdaFunctionFailed</code> event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionFailedEventAttributes(LambdaFunctionFailedEventAttributes lambdaFunctionFailedEventAttributes) {
        setLambdaFunctionFailedEventAttributes(lambdaFunctionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionTimedOut</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionTimedOutEventAttributes
     *        Provides the details of the <code>LambdaFunctionTimedOut</code> event. It isn't set for other event types.
     */

    public void setLambdaFunctionTimedOutEventAttributes(LambdaFunctionTimedOutEventAttributes lambdaFunctionTimedOutEventAttributes) {
        this.lambdaFunctionTimedOutEventAttributes = lambdaFunctionTimedOutEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionTimedOut</code> event. It isn't set for other event types.
     * </p>
     * 
     * @return Provides the details of the <code>LambdaFunctionTimedOut</code> event. It isn't set for other event
     *         types.
     */

    public LambdaFunctionTimedOutEventAttributes getLambdaFunctionTimedOutEventAttributes() {
        return this.lambdaFunctionTimedOutEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>LambdaFunctionTimedOut</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param lambdaFunctionTimedOutEventAttributes
     *        Provides the details of the <code>LambdaFunctionTimedOut</code> event. It isn't set for other event types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionTimedOutEventAttributes(LambdaFunctionTimedOutEventAttributes lambdaFunctionTimedOutEventAttributes) {
        setLambdaFunctionTimedOutEventAttributes(lambdaFunctionTimedOutEventAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param scheduleLambdaFunctionFailedEventAttributes
     *        Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event
     *        types.
     */

    public void setScheduleLambdaFunctionFailedEventAttributes(ScheduleLambdaFunctionFailedEventAttributes scheduleLambdaFunctionFailedEventAttributes) {
        this.scheduleLambdaFunctionFailedEventAttributes = scheduleLambdaFunctionFailedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @return Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event
     *         types.
     */

    public ScheduleLambdaFunctionFailedEventAttributes getScheduleLambdaFunctionFailedEventAttributes() {
        return this.scheduleLambdaFunctionFailedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param scheduleLambdaFunctionFailedEventAttributes
     *        Provides the details of the <code>ScheduleLambdaFunctionFailed</code> event. It isn't set for other event
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withScheduleLambdaFunctionFailedEventAttributes(ScheduleLambdaFunctionFailedEventAttributes scheduleLambdaFunctionFailedEventAttributes) {
        setScheduleLambdaFunctionFailedEventAttributes(scheduleLambdaFunctionFailedEventAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param startLambdaFunctionFailedEventAttributes
     *        Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event
     *        types.
     */

    public void setStartLambdaFunctionFailedEventAttributes(StartLambdaFunctionFailedEventAttributes startLambdaFunctionFailedEventAttributes) {
        this.startLambdaFunctionFailedEventAttributes = startLambdaFunctionFailedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @return Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event
     *         types.
     */

    public StartLambdaFunctionFailedEventAttributes getStartLambdaFunctionFailedEventAttributes() {
        return this.startLambdaFunctionFailedEventAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event types.
     * </p>
     * 
     * @param startLambdaFunctionFailedEventAttributes
     *        Provides the details of the <code>StartLambdaFunctionFailed</code> event. It isn't set for other event
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStartLambdaFunctionFailedEventAttributes(StartLambdaFunctionFailedEventAttributes startLambdaFunctionFailedEventAttributes) {
        setStartLambdaFunctionFailedEventAttributes(startLambdaFunctionFailedEventAttributes);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getWorkflowExecutionStartedEventAttributes() != null)
            sb.append("WorkflowExecutionStartedEventAttributes: ").append(getWorkflowExecutionStartedEventAttributes()).append(",");
        if (getWorkflowExecutionCompletedEventAttributes() != null)
            sb.append("WorkflowExecutionCompletedEventAttributes: ").append(getWorkflowExecutionCompletedEventAttributes()).append(",");
        if (getCompleteWorkflowExecutionFailedEventAttributes() != null)
            sb.append("CompleteWorkflowExecutionFailedEventAttributes: ").append(getCompleteWorkflowExecutionFailedEventAttributes()).append(",");
        if (getWorkflowExecutionFailedEventAttributes() != null)
            sb.append("WorkflowExecutionFailedEventAttributes: ").append(getWorkflowExecutionFailedEventAttributes()).append(",");
        if (getFailWorkflowExecutionFailedEventAttributes() != null)
            sb.append("FailWorkflowExecutionFailedEventAttributes: ").append(getFailWorkflowExecutionFailedEventAttributes()).append(",");
        if (getWorkflowExecutionTimedOutEventAttributes() != null)
            sb.append("WorkflowExecutionTimedOutEventAttributes: ").append(getWorkflowExecutionTimedOutEventAttributes()).append(",");
        if (getWorkflowExecutionCanceledEventAttributes() != null)
            sb.append("WorkflowExecutionCanceledEventAttributes: ").append(getWorkflowExecutionCanceledEventAttributes()).append(",");
        if (getCancelWorkflowExecutionFailedEventAttributes() != null)
            sb.append("CancelWorkflowExecutionFailedEventAttributes: ").append(getCancelWorkflowExecutionFailedEventAttributes()).append(",");
        if (getWorkflowExecutionContinuedAsNewEventAttributes() != null)
            sb.append("WorkflowExecutionContinuedAsNewEventAttributes: ").append(getWorkflowExecutionContinuedAsNewEventAttributes()).append(",");
        if (getContinueAsNewWorkflowExecutionFailedEventAttributes() != null)
            sb.append("ContinueAsNewWorkflowExecutionFailedEventAttributes: ").append(getContinueAsNewWorkflowExecutionFailedEventAttributes()).append(",");
        if (getWorkflowExecutionTerminatedEventAttributes() != null)
            sb.append("WorkflowExecutionTerminatedEventAttributes: ").append(getWorkflowExecutionTerminatedEventAttributes()).append(",");
        if (getWorkflowExecutionCancelRequestedEventAttributes() != null)
            sb.append("WorkflowExecutionCancelRequestedEventAttributes: ").append(getWorkflowExecutionCancelRequestedEventAttributes()).append(",");
        if (getDecisionTaskScheduledEventAttributes() != null)
            sb.append("DecisionTaskScheduledEventAttributes: ").append(getDecisionTaskScheduledEventAttributes()).append(",");
        if (getDecisionTaskStartedEventAttributes() != null)
            sb.append("DecisionTaskStartedEventAttributes: ").append(getDecisionTaskStartedEventAttributes()).append(",");
        if (getDecisionTaskCompletedEventAttributes() != null)
            sb.append("DecisionTaskCompletedEventAttributes: ").append(getDecisionTaskCompletedEventAttributes()).append(",");
        if (getDecisionTaskTimedOutEventAttributes() != null)
            sb.append("DecisionTaskTimedOutEventAttributes: ").append(getDecisionTaskTimedOutEventAttributes()).append(",");
        if (getActivityTaskScheduledEventAttributes() != null)
            sb.append("ActivityTaskScheduledEventAttributes: ").append(getActivityTaskScheduledEventAttributes()).append(",");
        if (getActivityTaskStartedEventAttributes() != null)
            sb.append("ActivityTaskStartedEventAttributes: ").append(getActivityTaskStartedEventAttributes()).append(",");
        if (getActivityTaskCompletedEventAttributes() != null)
            sb.append("ActivityTaskCompletedEventAttributes: ").append(getActivityTaskCompletedEventAttributes()).append(",");
        if (getActivityTaskFailedEventAttributes() != null)
            sb.append("ActivityTaskFailedEventAttributes: ").append(getActivityTaskFailedEventAttributes()).append(",");
        if (getActivityTaskTimedOutEventAttributes() != null)
            sb.append("ActivityTaskTimedOutEventAttributes: ").append(getActivityTaskTimedOutEventAttributes()).append(",");
        if (getActivityTaskCanceledEventAttributes() != null)
            sb.append("ActivityTaskCanceledEventAttributes: ").append(getActivityTaskCanceledEventAttributes()).append(",");
        if (getActivityTaskCancelRequestedEventAttributes() != null)
            sb.append("ActivityTaskCancelRequestedEventAttributes: ").append(getActivityTaskCancelRequestedEventAttributes()).append(",");
        if (getWorkflowExecutionSignaledEventAttributes() != null)
            sb.append("WorkflowExecutionSignaledEventAttributes: ").append(getWorkflowExecutionSignaledEventAttributes()).append(",");
        if (getMarkerRecordedEventAttributes() != null)
            sb.append("MarkerRecordedEventAttributes: ").append(getMarkerRecordedEventAttributes()).append(",");
        if (getRecordMarkerFailedEventAttributes() != null)
            sb.append("RecordMarkerFailedEventAttributes: ").append(getRecordMarkerFailedEventAttributes()).append(",");
        if (getTimerStartedEventAttributes() != null)
            sb.append("TimerStartedEventAttributes: ").append(getTimerStartedEventAttributes()).append(",");
        if (getTimerFiredEventAttributes() != null)
            sb.append("TimerFiredEventAttributes: ").append(getTimerFiredEventAttributes()).append(",");
        if (getTimerCanceledEventAttributes() != null)
            sb.append("TimerCanceledEventAttributes: ").append(getTimerCanceledEventAttributes()).append(",");
        if (getStartChildWorkflowExecutionInitiatedEventAttributes() != null)
            sb.append("StartChildWorkflowExecutionInitiatedEventAttributes: ").append(getStartChildWorkflowExecutionInitiatedEventAttributes()).append(",");
        if (getChildWorkflowExecutionStartedEventAttributes() != null)
            sb.append("ChildWorkflowExecutionStartedEventAttributes: ").append(getChildWorkflowExecutionStartedEventAttributes()).append(",");
        if (getChildWorkflowExecutionCompletedEventAttributes() != null)
            sb.append("ChildWorkflowExecutionCompletedEventAttributes: ").append(getChildWorkflowExecutionCompletedEventAttributes()).append(",");
        if (getChildWorkflowExecutionFailedEventAttributes() != null)
            sb.append("ChildWorkflowExecutionFailedEventAttributes: ").append(getChildWorkflowExecutionFailedEventAttributes()).append(",");
        if (getChildWorkflowExecutionTimedOutEventAttributes() != null)
            sb.append("ChildWorkflowExecutionTimedOutEventAttributes: ").append(getChildWorkflowExecutionTimedOutEventAttributes()).append(",");
        if (getChildWorkflowExecutionCanceledEventAttributes() != null)
            sb.append("ChildWorkflowExecutionCanceledEventAttributes: ").append(getChildWorkflowExecutionCanceledEventAttributes()).append(",");
        if (getChildWorkflowExecutionTerminatedEventAttributes() != null)
            sb.append("ChildWorkflowExecutionTerminatedEventAttributes: ").append(getChildWorkflowExecutionTerminatedEventAttributes()).append(",");
        if (getSignalExternalWorkflowExecutionInitiatedEventAttributes() != null)
            sb.append("SignalExternalWorkflowExecutionInitiatedEventAttributes: ").append(getSignalExternalWorkflowExecutionInitiatedEventAttributes())
                    .append(",");
        if (getExternalWorkflowExecutionSignaledEventAttributes() != null)
            sb.append("ExternalWorkflowExecutionSignaledEventAttributes: ").append(getExternalWorkflowExecutionSignaledEventAttributes()).append(",");
        if (getSignalExternalWorkflowExecutionFailedEventAttributes() != null)
            sb.append("SignalExternalWorkflowExecutionFailedEventAttributes: ").append(getSignalExternalWorkflowExecutionFailedEventAttributes()).append(",");
        if (getExternalWorkflowExecutionCancelRequestedEventAttributes() != null)
            sb.append("ExternalWorkflowExecutionCancelRequestedEventAttributes: ").append(getExternalWorkflowExecutionCancelRequestedEventAttributes())
                    .append(",");
        if (getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() != null)
            sb.append("RequestCancelExternalWorkflowExecutionInitiatedEventAttributes: ")
                    .append(getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes()).append(",");
        if (getRequestCancelExternalWorkflowExecutionFailedEventAttributes() != null)
            sb.append("RequestCancelExternalWorkflowExecutionFailedEventAttributes: ").append(getRequestCancelExternalWorkflowExecutionFailedEventAttributes())
                    .append(",");
        if (getScheduleActivityTaskFailedEventAttributes() != null)
            sb.append("ScheduleActivityTaskFailedEventAttributes: ").append(getScheduleActivityTaskFailedEventAttributes()).append(",");
        if (getRequestCancelActivityTaskFailedEventAttributes() != null)
            sb.append("RequestCancelActivityTaskFailedEventAttributes: ").append(getRequestCancelActivityTaskFailedEventAttributes()).append(",");
        if (getStartTimerFailedEventAttributes() != null)
            sb.append("StartTimerFailedEventAttributes: ").append(getStartTimerFailedEventAttributes()).append(",");
        if (getCancelTimerFailedEventAttributes() != null)
            sb.append("CancelTimerFailedEventAttributes: ").append(getCancelTimerFailedEventAttributes()).append(",");
        if (getStartChildWorkflowExecutionFailedEventAttributes() != null)
            sb.append("StartChildWorkflowExecutionFailedEventAttributes: ").append(getStartChildWorkflowExecutionFailedEventAttributes()).append(",");
        if (getLambdaFunctionScheduledEventAttributes() != null)
            sb.append("LambdaFunctionScheduledEventAttributes: ").append(getLambdaFunctionScheduledEventAttributes()).append(",");
        if (getLambdaFunctionStartedEventAttributes() != null)
            sb.append("LambdaFunctionStartedEventAttributes: ").append(getLambdaFunctionStartedEventAttributes()).append(",");
        if (getLambdaFunctionCompletedEventAttributes() != null)
            sb.append("LambdaFunctionCompletedEventAttributes: ").append(getLambdaFunctionCompletedEventAttributes()).append(",");
        if (getLambdaFunctionFailedEventAttributes() != null)
            sb.append("LambdaFunctionFailedEventAttributes: ").append(getLambdaFunctionFailedEventAttributes()).append(",");
        if (getLambdaFunctionTimedOutEventAttributes() != null)
            sb.append("LambdaFunctionTimedOutEventAttributes: ").append(getLambdaFunctionTimedOutEventAttributes()).append(",");
        if (getScheduleLambdaFunctionFailedEventAttributes() != null)
            sb.append("ScheduleLambdaFunctionFailedEventAttributes: ").append(getScheduleLambdaFunctionFailedEventAttributes()).append(",");
        if (getStartLambdaFunctionFailedEventAttributes() != null)
            sb.append("StartLambdaFunctionFailedEventAttributes: ").append(getStartLambdaFunctionFailedEventAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoryEvent == false)
            return false;
        HistoryEvent other = (HistoryEvent) obj;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getWorkflowExecutionStartedEventAttributes() == null ^ this.getWorkflowExecutionStartedEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionStartedEventAttributes() != null
                && other.getWorkflowExecutionStartedEventAttributes().equals(this.getWorkflowExecutionStartedEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionCompletedEventAttributes() == null ^ this.getWorkflowExecutionCompletedEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionCompletedEventAttributes() != null
                && other.getWorkflowExecutionCompletedEventAttributes().equals(this.getWorkflowExecutionCompletedEventAttributes()) == false)
            return false;
        if (other.getCompleteWorkflowExecutionFailedEventAttributes() == null ^ this.getCompleteWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getCompleteWorkflowExecutionFailedEventAttributes() != null
                && other.getCompleteWorkflowExecutionFailedEventAttributes().equals(this.getCompleteWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionFailedEventAttributes() == null ^ this.getWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionFailedEventAttributes() != null
                && other.getWorkflowExecutionFailedEventAttributes().equals(this.getWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getFailWorkflowExecutionFailedEventAttributes() == null ^ this.getFailWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getFailWorkflowExecutionFailedEventAttributes() != null
                && other.getFailWorkflowExecutionFailedEventAttributes().equals(this.getFailWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionTimedOutEventAttributes() == null ^ this.getWorkflowExecutionTimedOutEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionTimedOutEventAttributes() != null
                && other.getWorkflowExecutionTimedOutEventAttributes().equals(this.getWorkflowExecutionTimedOutEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionCanceledEventAttributes() == null ^ this.getWorkflowExecutionCanceledEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionCanceledEventAttributes() != null
                && other.getWorkflowExecutionCanceledEventAttributes().equals(this.getWorkflowExecutionCanceledEventAttributes()) == false)
            return false;
        if (other.getCancelWorkflowExecutionFailedEventAttributes() == null ^ this.getCancelWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getCancelWorkflowExecutionFailedEventAttributes() != null
                && other.getCancelWorkflowExecutionFailedEventAttributes().equals(this.getCancelWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionContinuedAsNewEventAttributes() == null ^ this.getWorkflowExecutionContinuedAsNewEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionContinuedAsNewEventAttributes() != null
                && other.getWorkflowExecutionContinuedAsNewEventAttributes().equals(this.getWorkflowExecutionContinuedAsNewEventAttributes()) == false)
            return false;
        if (other.getContinueAsNewWorkflowExecutionFailedEventAttributes() == null ^ this.getContinueAsNewWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getContinueAsNewWorkflowExecutionFailedEventAttributes() != null
                && other.getContinueAsNewWorkflowExecutionFailedEventAttributes().equals(this.getContinueAsNewWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionTerminatedEventAttributes() == null ^ this.getWorkflowExecutionTerminatedEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionTerminatedEventAttributes() != null
                && other.getWorkflowExecutionTerminatedEventAttributes().equals(this.getWorkflowExecutionTerminatedEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionCancelRequestedEventAttributes() == null ^ this.getWorkflowExecutionCancelRequestedEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionCancelRequestedEventAttributes() != null
                && other.getWorkflowExecutionCancelRequestedEventAttributes().equals(this.getWorkflowExecutionCancelRequestedEventAttributes()) == false)
            return false;
        if (other.getDecisionTaskScheduledEventAttributes() == null ^ this.getDecisionTaskScheduledEventAttributes() == null)
            return false;
        if (other.getDecisionTaskScheduledEventAttributes() != null
                && other.getDecisionTaskScheduledEventAttributes().equals(this.getDecisionTaskScheduledEventAttributes()) == false)
            return false;
        if (other.getDecisionTaskStartedEventAttributes() == null ^ this.getDecisionTaskStartedEventAttributes() == null)
            return false;
        if (other.getDecisionTaskStartedEventAttributes() != null
                && other.getDecisionTaskStartedEventAttributes().equals(this.getDecisionTaskStartedEventAttributes()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventAttributes() == null ^ this.getDecisionTaskCompletedEventAttributes() == null)
            return false;
        if (other.getDecisionTaskCompletedEventAttributes() != null
                && other.getDecisionTaskCompletedEventAttributes().equals(this.getDecisionTaskCompletedEventAttributes()) == false)
            return false;
        if (other.getDecisionTaskTimedOutEventAttributes() == null ^ this.getDecisionTaskTimedOutEventAttributes() == null)
            return false;
        if (other.getDecisionTaskTimedOutEventAttributes() != null
                && other.getDecisionTaskTimedOutEventAttributes().equals(this.getDecisionTaskTimedOutEventAttributes()) == false)
            return false;
        if (other.getActivityTaskScheduledEventAttributes() == null ^ this.getActivityTaskScheduledEventAttributes() == null)
            return false;
        if (other.getActivityTaskScheduledEventAttributes() != null
                && other.getActivityTaskScheduledEventAttributes().equals(this.getActivityTaskScheduledEventAttributes()) == false)
            return false;
        if (other.getActivityTaskStartedEventAttributes() == null ^ this.getActivityTaskStartedEventAttributes() == null)
            return false;
        if (other.getActivityTaskStartedEventAttributes() != null
                && other.getActivityTaskStartedEventAttributes().equals(this.getActivityTaskStartedEventAttributes()) == false)
            return false;
        if (other.getActivityTaskCompletedEventAttributes() == null ^ this.getActivityTaskCompletedEventAttributes() == null)
            return false;
        if (other.getActivityTaskCompletedEventAttributes() != null
                && other.getActivityTaskCompletedEventAttributes().equals(this.getActivityTaskCompletedEventAttributes()) == false)
            return false;
        if (other.getActivityTaskFailedEventAttributes() == null ^ this.getActivityTaskFailedEventAttributes() == null)
            return false;
        if (other.getActivityTaskFailedEventAttributes() != null
                && other.getActivityTaskFailedEventAttributes().equals(this.getActivityTaskFailedEventAttributes()) == false)
            return false;
        if (other.getActivityTaskTimedOutEventAttributes() == null ^ this.getActivityTaskTimedOutEventAttributes() == null)
            return false;
        if (other.getActivityTaskTimedOutEventAttributes() != null
                && other.getActivityTaskTimedOutEventAttributes().equals(this.getActivityTaskTimedOutEventAttributes()) == false)
            return false;
        if (other.getActivityTaskCanceledEventAttributes() == null ^ this.getActivityTaskCanceledEventAttributes() == null)
            return false;
        if (other.getActivityTaskCanceledEventAttributes() != null
                && other.getActivityTaskCanceledEventAttributes().equals(this.getActivityTaskCanceledEventAttributes()) == false)
            return false;
        if (other.getActivityTaskCancelRequestedEventAttributes() == null ^ this.getActivityTaskCancelRequestedEventAttributes() == null)
            return false;
        if (other.getActivityTaskCancelRequestedEventAttributes() != null
                && other.getActivityTaskCancelRequestedEventAttributes().equals(this.getActivityTaskCancelRequestedEventAttributes()) == false)
            return false;
        if (other.getWorkflowExecutionSignaledEventAttributes() == null ^ this.getWorkflowExecutionSignaledEventAttributes() == null)
            return false;
        if (other.getWorkflowExecutionSignaledEventAttributes() != null
                && other.getWorkflowExecutionSignaledEventAttributes().equals(this.getWorkflowExecutionSignaledEventAttributes()) == false)
            return false;
        if (other.getMarkerRecordedEventAttributes() == null ^ this.getMarkerRecordedEventAttributes() == null)
            return false;
        if (other.getMarkerRecordedEventAttributes() != null
                && other.getMarkerRecordedEventAttributes().equals(this.getMarkerRecordedEventAttributes()) == false)
            return false;
        if (other.getRecordMarkerFailedEventAttributes() == null ^ this.getRecordMarkerFailedEventAttributes() == null)
            return false;
        if (other.getRecordMarkerFailedEventAttributes() != null
                && other.getRecordMarkerFailedEventAttributes().equals(this.getRecordMarkerFailedEventAttributes()) == false)
            return false;
        if (other.getTimerStartedEventAttributes() == null ^ this.getTimerStartedEventAttributes() == null)
            return false;
        if (other.getTimerStartedEventAttributes() != null && other.getTimerStartedEventAttributes().equals(this.getTimerStartedEventAttributes()) == false)
            return false;
        if (other.getTimerFiredEventAttributes() == null ^ this.getTimerFiredEventAttributes() == null)
            return false;
        if (other.getTimerFiredEventAttributes() != null && other.getTimerFiredEventAttributes().equals(this.getTimerFiredEventAttributes()) == false)
            return false;
        if (other.getTimerCanceledEventAttributes() == null ^ this.getTimerCanceledEventAttributes() == null)
            return false;
        if (other.getTimerCanceledEventAttributes() != null && other.getTimerCanceledEventAttributes().equals(this.getTimerCanceledEventAttributes()) == false)
            return false;
        if (other.getStartChildWorkflowExecutionInitiatedEventAttributes() == null ^ this.getStartChildWorkflowExecutionInitiatedEventAttributes() == null)
            return false;
        if (other.getStartChildWorkflowExecutionInitiatedEventAttributes() != null
                && other.getStartChildWorkflowExecutionInitiatedEventAttributes().equals(this.getStartChildWorkflowExecutionInitiatedEventAttributes()) == false)
            return false;
        if (other.getChildWorkflowExecutionStartedEventAttributes() == null ^ this.getChildWorkflowExecutionStartedEventAttributes() == null)
            return false;
        if (other.getChildWorkflowExecutionStartedEventAttributes() != null
                && other.getChildWorkflowExecutionStartedEventAttributes().equals(this.getChildWorkflowExecutionStartedEventAttributes()) == false)
            return false;
        if (other.getChildWorkflowExecutionCompletedEventAttributes() == null ^ this.getChildWorkflowExecutionCompletedEventAttributes() == null)
            return false;
        if (other.getChildWorkflowExecutionCompletedEventAttributes() != null
                && other.getChildWorkflowExecutionCompletedEventAttributes().equals(this.getChildWorkflowExecutionCompletedEventAttributes()) == false)
            return false;
        if (other.getChildWorkflowExecutionFailedEventAttributes() == null ^ this.getChildWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getChildWorkflowExecutionFailedEventAttributes() != null
                && other.getChildWorkflowExecutionFailedEventAttributes().equals(this.getChildWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getChildWorkflowExecutionTimedOutEventAttributes() == null ^ this.getChildWorkflowExecutionTimedOutEventAttributes() == null)
            return false;
        if (other.getChildWorkflowExecutionTimedOutEventAttributes() != null
                && other.getChildWorkflowExecutionTimedOutEventAttributes().equals(this.getChildWorkflowExecutionTimedOutEventAttributes()) == false)
            return false;
        if (other.getChildWorkflowExecutionCanceledEventAttributes() == null ^ this.getChildWorkflowExecutionCanceledEventAttributes() == null)
            return false;
        if (other.getChildWorkflowExecutionCanceledEventAttributes() != null
                && other.getChildWorkflowExecutionCanceledEventAttributes().equals(this.getChildWorkflowExecutionCanceledEventAttributes()) == false)
            return false;
        if (other.getChildWorkflowExecutionTerminatedEventAttributes() == null ^ this.getChildWorkflowExecutionTerminatedEventAttributes() == null)
            return false;
        if (other.getChildWorkflowExecutionTerminatedEventAttributes() != null
                && other.getChildWorkflowExecutionTerminatedEventAttributes().equals(this.getChildWorkflowExecutionTerminatedEventAttributes()) == false)
            return false;
        if (other.getSignalExternalWorkflowExecutionInitiatedEventAttributes() == null
                ^ this.getSignalExternalWorkflowExecutionInitiatedEventAttributes() == null)
            return false;
        if (other.getSignalExternalWorkflowExecutionInitiatedEventAttributes() != null
                && other.getSignalExternalWorkflowExecutionInitiatedEventAttributes().equals(this.getSignalExternalWorkflowExecutionInitiatedEventAttributes()) == false)
            return false;
        if (other.getExternalWorkflowExecutionSignaledEventAttributes() == null ^ this.getExternalWorkflowExecutionSignaledEventAttributes() == null)
            return false;
        if (other.getExternalWorkflowExecutionSignaledEventAttributes() != null
                && other.getExternalWorkflowExecutionSignaledEventAttributes().equals(this.getExternalWorkflowExecutionSignaledEventAttributes()) == false)
            return false;
        if (other.getSignalExternalWorkflowExecutionFailedEventAttributes() == null ^ this.getSignalExternalWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getSignalExternalWorkflowExecutionFailedEventAttributes() != null
                && other.getSignalExternalWorkflowExecutionFailedEventAttributes().equals(this.getSignalExternalWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getExternalWorkflowExecutionCancelRequestedEventAttributes() == null
                ^ this.getExternalWorkflowExecutionCancelRequestedEventAttributes() == null)
            return false;
        if (other.getExternalWorkflowExecutionCancelRequestedEventAttributes() != null
                && other.getExternalWorkflowExecutionCancelRequestedEventAttributes().equals(this.getExternalWorkflowExecutionCancelRequestedEventAttributes()) == false)
            return false;
        if (other.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() == null
                ^ this.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() == null)
            return false;
        if (other.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() != null
                && other.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes().equals(
                        this.getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes()) == false)
            return false;
        if (other.getRequestCancelExternalWorkflowExecutionFailedEventAttributes() == null
                ^ this.getRequestCancelExternalWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getRequestCancelExternalWorkflowExecutionFailedEventAttributes() != null
                && other.getRequestCancelExternalWorkflowExecutionFailedEventAttributes().equals(
                        this.getRequestCancelExternalWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getScheduleActivityTaskFailedEventAttributes() == null ^ this.getScheduleActivityTaskFailedEventAttributes() == null)
            return false;
        if (other.getScheduleActivityTaskFailedEventAttributes() != null
                && other.getScheduleActivityTaskFailedEventAttributes().equals(this.getScheduleActivityTaskFailedEventAttributes()) == false)
            return false;
        if (other.getRequestCancelActivityTaskFailedEventAttributes() == null ^ this.getRequestCancelActivityTaskFailedEventAttributes() == null)
            return false;
        if (other.getRequestCancelActivityTaskFailedEventAttributes() != null
                && other.getRequestCancelActivityTaskFailedEventAttributes().equals(this.getRequestCancelActivityTaskFailedEventAttributes()) == false)
            return false;
        if (other.getStartTimerFailedEventAttributes() == null ^ this.getStartTimerFailedEventAttributes() == null)
            return false;
        if (other.getStartTimerFailedEventAttributes() != null
                && other.getStartTimerFailedEventAttributes().equals(this.getStartTimerFailedEventAttributes()) == false)
            return false;
        if (other.getCancelTimerFailedEventAttributes() == null ^ this.getCancelTimerFailedEventAttributes() == null)
            return false;
        if (other.getCancelTimerFailedEventAttributes() != null
                && other.getCancelTimerFailedEventAttributes().equals(this.getCancelTimerFailedEventAttributes()) == false)
            return false;
        if (other.getStartChildWorkflowExecutionFailedEventAttributes() == null ^ this.getStartChildWorkflowExecutionFailedEventAttributes() == null)
            return false;
        if (other.getStartChildWorkflowExecutionFailedEventAttributes() != null
                && other.getStartChildWorkflowExecutionFailedEventAttributes().equals(this.getStartChildWorkflowExecutionFailedEventAttributes()) == false)
            return false;
        if (other.getLambdaFunctionScheduledEventAttributes() == null ^ this.getLambdaFunctionScheduledEventAttributes() == null)
            return false;
        if (other.getLambdaFunctionScheduledEventAttributes() != null
                && other.getLambdaFunctionScheduledEventAttributes().equals(this.getLambdaFunctionScheduledEventAttributes()) == false)
            return false;
        if (other.getLambdaFunctionStartedEventAttributes() == null ^ this.getLambdaFunctionStartedEventAttributes() == null)
            return false;
        if (other.getLambdaFunctionStartedEventAttributes() != null
                && other.getLambdaFunctionStartedEventAttributes().equals(this.getLambdaFunctionStartedEventAttributes()) == false)
            return false;
        if (other.getLambdaFunctionCompletedEventAttributes() == null ^ this.getLambdaFunctionCompletedEventAttributes() == null)
            return false;
        if (other.getLambdaFunctionCompletedEventAttributes() != null
                && other.getLambdaFunctionCompletedEventAttributes().equals(this.getLambdaFunctionCompletedEventAttributes()) == false)
            return false;
        if (other.getLambdaFunctionFailedEventAttributes() == null ^ this.getLambdaFunctionFailedEventAttributes() == null)
            return false;
        if (other.getLambdaFunctionFailedEventAttributes() != null
                && other.getLambdaFunctionFailedEventAttributes().equals(this.getLambdaFunctionFailedEventAttributes()) == false)
            return false;
        if (other.getLambdaFunctionTimedOutEventAttributes() == null ^ this.getLambdaFunctionTimedOutEventAttributes() == null)
            return false;
        if (other.getLambdaFunctionTimedOutEventAttributes() != null
                && other.getLambdaFunctionTimedOutEventAttributes().equals(this.getLambdaFunctionTimedOutEventAttributes()) == false)
            return false;
        if (other.getScheduleLambdaFunctionFailedEventAttributes() == null ^ this.getScheduleLambdaFunctionFailedEventAttributes() == null)
            return false;
        if (other.getScheduleLambdaFunctionFailedEventAttributes() != null
                && other.getScheduleLambdaFunctionFailedEventAttributes().equals(this.getScheduleLambdaFunctionFailedEventAttributes()) == false)
            return false;
        if (other.getStartLambdaFunctionFailedEventAttributes() == null ^ this.getStartLambdaFunctionFailedEventAttributes() == null)
            return false;
        if (other.getStartLambdaFunctionFailedEventAttributes() != null
                && other.getStartLambdaFunctionFailedEventAttributes().equals(this.getStartLambdaFunctionFailedEventAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionStartedEventAttributes() == null) ? 0 : getWorkflowExecutionStartedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getWorkflowExecutionCompletedEventAttributes() == null) ? 0 : getWorkflowExecutionCompletedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getCompleteWorkflowExecutionFailedEventAttributes() == null) ? 0 : getCompleteWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionFailedEventAttributes() == null) ? 0 : getWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getFailWorkflowExecutionFailedEventAttributes() == null) ? 0 : getFailWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionTimedOutEventAttributes() == null) ? 0 : getWorkflowExecutionTimedOutEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionCanceledEventAttributes() == null) ? 0 : getWorkflowExecutionCanceledEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getCancelWorkflowExecutionFailedEventAttributes() == null) ? 0 : getCancelWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getWorkflowExecutionContinuedAsNewEventAttributes() == null) ? 0 : getWorkflowExecutionContinuedAsNewEventAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getContinueAsNewWorkflowExecutionFailedEventAttributes() == null) ? 0 : getContinueAsNewWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getWorkflowExecutionTerminatedEventAttributes() == null) ? 0 : getWorkflowExecutionTerminatedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getWorkflowExecutionCancelRequestedEventAttributes() == null) ? 0 : getWorkflowExecutionCancelRequestedEventAttributes().hashCode());
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
        hashCode = prime * hashCode
                + ((getActivityTaskCancelRequestedEventAttributes() == null) ? 0 : getActivityTaskCancelRequestedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionSignaledEventAttributes() == null) ? 0 : getWorkflowExecutionSignaledEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getMarkerRecordedEventAttributes() == null) ? 0 : getMarkerRecordedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getRecordMarkerFailedEventAttributes() == null) ? 0 : getRecordMarkerFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getTimerStartedEventAttributes() == null) ? 0 : getTimerStartedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getTimerFiredEventAttributes() == null) ? 0 : getTimerFiredEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getTimerCanceledEventAttributes() == null) ? 0 : getTimerCanceledEventAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getStartChildWorkflowExecutionInitiatedEventAttributes() == null) ? 0 : getStartChildWorkflowExecutionInitiatedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChildWorkflowExecutionStartedEventAttributes() == null) ? 0 : getChildWorkflowExecutionStartedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChildWorkflowExecutionCompletedEventAttributes() == null) ? 0 : getChildWorkflowExecutionCompletedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChildWorkflowExecutionFailedEventAttributes() == null) ? 0 : getChildWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChildWorkflowExecutionTimedOutEventAttributes() == null) ? 0 : getChildWorkflowExecutionTimedOutEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChildWorkflowExecutionCanceledEventAttributes() == null) ? 0 : getChildWorkflowExecutionCanceledEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getChildWorkflowExecutionTerminatedEventAttributes() == null) ? 0 : getChildWorkflowExecutionTerminatedEventAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSignalExternalWorkflowExecutionInitiatedEventAttributes() == null) ? 0 : getSignalExternalWorkflowExecutionInitiatedEventAttributes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExternalWorkflowExecutionSignaledEventAttributes() == null) ? 0 : getExternalWorkflowExecutionSignaledEventAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSignalExternalWorkflowExecutionFailedEventAttributes() == null) ? 0 : getSignalExternalWorkflowExecutionFailedEventAttributes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalWorkflowExecutionCancelRequestedEventAttributes() == null) ? 0 : getExternalWorkflowExecutionCancelRequestedEventAttributes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes() == null) ? 0
                        : getRequestCancelExternalWorkflowExecutionInitiatedEventAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestCancelExternalWorkflowExecutionFailedEventAttributes() == null) ? 0
                        : getRequestCancelExternalWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleActivityTaskFailedEventAttributes() == null) ? 0 : getScheduleActivityTaskFailedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCancelActivityTaskFailedEventAttributes() == null) ? 0 : getRequestCancelActivityTaskFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getStartTimerFailedEventAttributes() == null) ? 0 : getStartTimerFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getCancelTimerFailedEventAttributes() == null) ? 0 : getCancelTimerFailedEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getStartChildWorkflowExecutionFailedEventAttributes() == null) ? 0 : getStartChildWorkflowExecutionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionScheduledEventAttributes() == null) ? 0 : getLambdaFunctionScheduledEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionStartedEventAttributes() == null) ? 0 : getLambdaFunctionStartedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionCompletedEventAttributes() == null) ? 0 : getLambdaFunctionCompletedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionFailedEventAttributes() == null) ? 0 : getLambdaFunctionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionTimedOutEventAttributes() == null) ? 0 : getLambdaFunctionTimedOutEventAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getScheduleLambdaFunctionFailedEventAttributes() == null) ? 0 : getScheduleLambdaFunctionFailedEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getStartLambdaFunctionFailedEventAttributes() == null) ? 0 : getStartLambdaFunctionFailedEventAttributes().hashCode());
        return hashCode;
    }

    @Override
    public HistoryEvent clone() {
        try {
            return (HistoryEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.HistoryEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
