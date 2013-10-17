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
 * Specifies a decision made by the decider. A decision can be one of these types:
 * </p>
 * 
 * <ul>
 * <li> <b>CancelTimer</b> cancels a previously started timer and records a <code>TimerCanceled</code> event in the history.</li>
 * <li> <b>CancelWorkflowExecution</b> closes the workflow execution and records a <code>WorkflowExecutionCanceled</code> event in the history.</li>
 * <li> <b>CompleteWorkflowExecution</b> closes the workflow execution and records a <code>WorkflowExecutionCompleted</code> event in the history .</li>
 * <li> <b>ContinueAsNewWorkflowExecution</b> closes the workflow execution and starts a new workflow execution of the same type using the same workflow
 * id and a unique run Id. A <code>WorkflowExecutionContinuedAsNew</code> event is recorded in the history.</li>
 * <li> <b>FailWorkflowExecution</b> closes the workflow execution and records a <code>WorkflowExecutionFailed</code> event in the history.</li>
 * <li> <b>RecordMarker</b> records a <code>MarkerRecorded</code> event in the history. Markers can be used for adding custom information in the history
 * for instance to let deciders know that they do not need to look at the history beyond the marker event.</li>
 * <li> <b>RequestCancelActivityTask</b> attempts to cancel a previously scheduled activity task. If the activity task was scheduled but has not been
 * assigned to a worker, then it will be canceled. If the activity task was already assigned to a worker, then the worker will be informed that
 * cancellation has been requested in the response to RecordActivityTaskHeartbeat.</li>
 * <li> <b>RequestCancelExternalWorkflowExecution</b> requests that a request be made to cancel the specified external workflow execution and records a
 * <code>RequestCancelExternalWorkflowExecutionInitiated</code> event in the history.</li>
 * <li> <b>ScheduleActivityTask</b> schedules an activity task.</li>
 * <li> <b>SignalExternalWorkflowExecution</b> requests a signal to be delivered to the specified external workflow execution and records a
 * <code>SignalExternalWorkflowExecutionInitiated</code> event in the history.</li>
 * <li> <b>StartChildWorkflowExecution</b> requests that a child workflow execution be started and records a
 * <code>StartChildWorkflowExecutionInitiated</code> event in the history. The child workflow execution is a separate workflow execution with its own
 * history.</li>
 * <li> <b>StartTimer</b> starts a timer for this workflow execution and records a <code>TimerStarted</code> event in the history. This timer will fire
 * after the specified delay and record a <code>TimerFired</code> event.</li>
 * 
 * </ul>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * If you grant permission to use <code>RespondDecisionTaskCompleted</code> , you can use IAM policies to express permissions for the list of decisions
 * returned by this action as if they were members of the API. Treating decisions as a pseudo API maintains a uniform conceptual model and helps keep
 * policies readable. For details and example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">
 * Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 * <p>
 * <b>Decision Failure</b>
 * </p>
 * <p>
 * Decisions can fail for several reasons
 * </p>
 * 
 * <ul>
 * <li>The ordering of decisions should follow a logical flow. Some decisions might not make sense in the current context of the workflow execution and
 * will therefore fail.</li>
 * <li>A limit on your account was reached.</li>
 * <li>The decision lacks sufficient permissions.</li>
 * 
 * </ul>
 * <p>
 * One of the following events might be added to the history to indicate an error. The event attribute's <b>cause</b> parameter indicates the cause. If
 * <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it lacked sufficient permissions.
 * </p>
 * 
 * <ul>
 * <li> <b>ScheduleActivityTaskFailed</b> a ScheduleActivityTask decision failed. This could happen if the activity type specified in the decision is
 * not registered, is in a deprecated state, or the decision is not properly configured.</li>
 * <li> <b>RequestCancelActivityTaskFailed</b> a RequestCancelActivityTask decision failed. This could happen if there is no open activity task with the
 * specified activityId.</li>
 * <li> <b>StartTimerFailed</b> a StartTimer decision failed. This could happen if there is another open timer with the same timerId.</li>
 * <li> <b>CancelTimerFailed</b> a CancelTimer decision failed. This could happen if there is no open timer with the specified timerId.</li>
 * <li> <b>StartChildWorkflowExecutionFailed</b> a StartChildWorkflowExecution decision failed. This could happen if the workflow type specified is not
 * registered, is deprecated, or the decision is not properly configured.</li>
 * <li> <b>SignalExternalWorkflowExecutionFailed</b> a SignalExternalWorkflowExecution decision failed. This could happen if the <code>workflowID</code>
 * specified in the decision was incorrect. </li>
 * <li> <b>RequestCancelExternalWorkflowExecutionFailed</b> a RequestCancelExternalWorkflowExecution decision failed. This could happen if the
 * <code>workflowID</code> specified in the decision was incorrect. </li>
 * <li> <b>CancelWorkflowExecutionFailed</b> a CancelWorkflowExecution decision failed. This could happen if there is an unhandled decision task pending
 * in the workflow execution. </li>
 * <li> <b>CompleteWorkflowExecutionFailed</b> a CompleteWorkflowExecution decision failed. This could happen if there is an unhandled decision task
 * pending in the workflow execution. </li>
 * <li> <b>ContinueAsNewWorkflowExecutionFailed</b> a ContinueAsNewWorkflowExecution decision failed. This could happen if there is an unhandled
 * decision task pending in the workflow execution or the ContinueAsNewWorkflowExecution decision was not configured correctly. </li>
 * <li> <b>FailWorkflowExecutionFailed</b> a FailWorkflowExecution decision failed. This could happen if there is an unhandled decision task pending in
 * the workflow execution. </li>
 * 
 * </ul>
 * <p>
 * The preceding error events might occur due to an error in the decider logic, which might put the workflow execution in an unstable state The cause
 * field in the event structure for the error event indicates the cause of the error.
 * </p>
 * <p>
 * <b>NOTE:</b> A workflow execution may be closed by the decider by returning one of the following decisions when completing a decision task:
 * CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution and ContinueAsNewWorkflowExecution. An UnhandledDecision fault will be
 * returned if a workflow closing decision is specified and a signal or activity event had been added to the history while the decision task was being
 * performed by the decider. Unlike the above situations which are logic issues, this fault is always possible because of race conditions in a
 * distributed system. The right action here is to call RespondDecisionTaskCompleted without any decisions. This would result in another decision task
 * with these new events included in the history. The decider should handle the new events and may decide to close the workflow execution.
 * </p>
 * <p>
 * <b>How to Code a Decision</b>
 * </p>
 * <p>
 * You code a decision by first setting the decision type field to one of the above decision values, and then set the corresponding attributes field
 * shown below:
 * </p>
 * 
 * <ul>
 * <li> ScheduleActivityTaskDecisionAttributes </li>
 * <li> RequestCancelActivityTaskDecisionAttributes </li>
 * <li> CompleteWorkflowExecutionDecisionAttributes </li>
 * <li> FailWorkflowExecutionDecisionAttributes </li>
 * <li> CancelWorkflowExecutionDecisionAttributes </li>
 * <li> ContinueAsNewWorkflowExecutionDecisionAttributes </li>
 * <li> RecordMarkerDecisionAttributes </li>
 * <li> StartTimerDecisionAttributes </li>
 * <li> CancelTimerDecisionAttributes </li>
 * <li> SignalExternalWorkflowExecutionDecisionAttributes </li>
 * <li> RequestCancelExternalWorkflowExecutionDecisionAttributes </li>
 * <li> StartChildWorkflowExecutionDecisionAttributes </li>
 * 
 * </ul>
 */
public class Decision implements Serializable {

    /**
     * Specifies the type of the decision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ScheduleActivityTask, RequestCancelActivityTask, CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution, ContinueAsNewWorkflowExecution, RecordMarker, StartTimer, CancelTimer, SignalExternalWorkflowExecution, RequestCancelExternalWorkflowExecution, StartChildWorkflowExecution
     */
    private String decisionType;

    /**
     * Provides details of the <code>ScheduleActivityTask</code> decision. It
     * is not set for other decision types.
     */
    private ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes;

    /**
     * Provides details of the <code>RequestCancelActivityTask</code>
     * decision. It is not set for other decision types.
     */
    private RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes;

    /**
     * Provides details of the <code>CompleteWorkflowExecution</code>
     * decision. It is not set for other decision types.
     */
    private CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes;

    /**
     * Provides details of the <code>FailWorkflowExecution</code> decision.
     * It is not set for other decision types.
     */
    private FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes;

    /**
     * Provides details of the <code>CancelWorkflowExecution</code> decision.
     * It is not set for other decision types.
     */
    private CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes;

    /**
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code>
     * decision. It is not set for other decision types.
     */
    private ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes;

    /**
     * Provides details of the <code>RecordMarker</code> decision. It is not
     * set for other decision types.
     */
    private RecordMarkerDecisionAttributes recordMarkerDecisionAttributes;

    /**
     * Provides details of the <code>StartTimer</code> decision. It is not
     * set for other decision types.
     */
    private StartTimerDecisionAttributes startTimerDecisionAttributes;

    /**
     * Provides details of the <code>CancelTimer</code> decision. It is not
     * set for other decision types.
     */
    private CancelTimerDecisionAttributes cancelTimerDecisionAttributes;

    /**
     * Provides details of the <code>SignalExternalWorkflowExecution</code>
     * decision. It is not set for other decision types.
     */
    private SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes;

    /**
     * Provides details of the
     * <code>RequestCancelExternalWorkflowExecution</code> decision. It is
     * not set for other decision types.
     */
    private RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes;

    /**
     * Provides details of the <code>StartChildWorkflowExecution</code>
     * decision. It is not set for other decision types.
     */
    private StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes;

    /**
     * Specifies the type of the decision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ScheduleActivityTask, RequestCancelActivityTask, CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution, ContinueAsNewWorkflowExecution, RecordMarker, StartTimer, CancelTimer, SignalExternalWorkflowExecution, RequestCancelExternalWorkflowExecution, StartChildWorkflowExecution
     *
     * @return Specifies the type of the decision.
     *
     * @see DecisionType
     */
    public String getDecisionType() {
        return decisionType;
    }
    
    /**
     * Specifies the type of the decision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ScheduleActivityTask, RequestCancelActivityTask, CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution, ContinueAsNewWorkflowExecution, RecordMarker, StartTimer, CancelTimer, SignalExternalWorkflowExecution, RequestCancelExternalWorkflowExecution, StartChildWorkflowExecution
     *
     * @param decisionType Specifies the type of the decision.
     *
     * @see DecisionType
     */
    public void setDecisionType(String decisionType) {
        this.decisionType = decisionType;
    }
    
    /**
     * Specifies the type of the decision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ScheduleActivityTask, RequestCancelActivityTask, CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution, ContinueAsNewWorkflowExecution, RecordMarker, StartTimer, CancelTimer, SignalExternalWorkflowExecution, RequestCancelExternalWorkflowExecution, StartChildWorkflowExecution
     *
     * @param decisionType Specifies the type of the decision.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DecisionType
     */
    public Decision withDecisionType(String decisionType) {
        this.decisionType = decisionType;
        return this;
    }

    /**
     * Specifies the type of the decision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ScheduleActivityTask, RequestCancelActivityTask, CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution, ContinueAsNewWorkflowExecution, RecordMarker, StartTimer, CancelTimer, SignalExternalWorkflowExecution, RequestCancelExternalWorkflowExecution, StartChildWorkflowExecution
     *
     * @param decisionType Specifies the type of the decision.
     *
     * @see DecisionType
     */
    public void setDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType.toString();
    }
    
    /**
     * Specifies the type of the decision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ScheduleActivityTask, RequestCancelActivityTask, CompleteWorkflowExecution, FailWorkflowExecution, CancelWorkflowExecution, ContinueAsNewWorkflowExecution, RecordMarker, StartTimer, CancelTimer, SignalExternalWorkflowExecution, RequestCancelExternalWorkflowExecution, StartChildWorkflowExecution
     *
     * @param decisionType Specifies the type of the decision.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DecisionType
     */
    public Decision withDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType.toString();
        return this;
    }

    /**
     * Provides details of the <code>ScheduleActivityTask</code> decision. It
     * is not set for other decision types.
     *
     * @return Provides details of the <code>ScheduleActivityTask</code> decision. It
     *         is not set for other decision types.
     */
    public ScheduleActivityTaskDecisionAttributes getScheduleActivityTaskDecisionAttributes() {
        return scheduleActivityTaskDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>ScheduleActivityTask</code> decision. It
     * is not set for other decision types.
     *
     * @param scheduleActivityTaskDecisionAttributes Provides details of the <code>ScheduleActivityTask</code> decision. It
     *         is not set for other decision types.
     */
    public void setScheduleActivityTaskDecisionAttributes(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes) {
        this.scheduleActivityTaskDecisionAttributes = scheduleActivityTaskDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>ScheduleActivityTask</code> decision. It
     * is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduleActivityTaskDecisionAttributes Provides details of the <code>ScheduleActivityTask</code> decision. It
     *         is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withScheduleActivityTaskDecisionAttributes(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes) {
        this.scheduleActivityTaskDecisionAttributes = scheduleActivityTaskDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>RequestCancelActivityTask</code>
     * decision. It is not set for other decision types.
     *
     * @return Provides details of the <code>RequestCancelActivityTask</code>
     *         decision. It is not set for other decision types.
     */
    public RequestCancelActivityTaskDecisionAttributes getRequestCancelActivityTaskDecisionAttributes() {
        return requestCancelActivityTaskDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>RequestCancelActivityTask</code>
     * decision. It is not set for other decision types.
     *
     * @param requestCancelActivityTaskDecisionAttributes Provides details of the <code>RequestCancelActivityTask</code>
     *         decision. It is not set for other decision types.
     */
    public void setRequestCancelActivityTaskDecisionAttributes(RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes) {
        this.requestCancelActivityTaskDecisionAttributes = requestCancelActivityTaskDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>RequestCancelActivityTask</code>
     * decision. It is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestCancelActivityTaskDecisionAttributes Provides details of the <code>RequestCancelActivityTask</code>
     *         decision. It is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withRequestCancelActivityTaskDecisionAttributes(RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes) {
        this.requestCancelActivityTaskDecisionAttributes = requestCancelActivityTaskDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>CompleteWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @return Provides details of the <code>CompleteWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public CompleteWorkflowExecutionDecisionAttributes getCompleteWorkflowExecutionDecisionAttributes() {
        return completeWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>CompleteWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @param completeWorkflowExecutionDecisionAttributes Provides details of the <code>CompleteWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public void setCompleteWorkflowExecutionDecisionAttributes(CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes) {
        this.completeWorkflowExecutionDecisionAttributes = completeWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>CompleteWorkflowExecution</code>
     * decision. It is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completeWorkflowExecutionDecisionAttributes Provides details of the <code>CompleteWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withCompleteWorkflowExecutionDecisionAttributes(CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes) {
        this.completeWorkflowExecutionDecisionAttributes = completeWorkflowExecutionDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>FailWorkflowExecution</code> decision.
     * It is not set for other decision types.
     *
     * @return Provides details of the <code>FailWorkflowExecution</code> decision.
     *         It is not set for other decision types.
     */
    public FailWorkflowExecutionDecisionAttributes getFailWorkflowExecutionDecisionAttributes() {
        return failWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>FailWorkflowExecution</code> decision.
     * It is not set for other decision types.
     *
     * @param failWorkflowExecutionDecisionAttributes Provides details of the <code>FailWorkflowExecution</code> decision.
     *         It is not set for other decision types.
     */
    public void setFailWorkflowExecutionDecisionAttributes(FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes) {
        this.failWorkflowExecutionDecisionAttributes = failWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>FailWorkflowExecution</code> decision.
     * It is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failWorkflowExecutionDecisionAttributes Provides details of the <code>FailWorkflowExecution</code> decision.
     *         It is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withFailWorkflowExecutionDecisionAttributes(FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes) {
        this.failWorkflowExecutionDecisionAttributes = failWorkflowExecutionDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>CancelWorkflowExecution</code> decision.
     * It is not set for other decision types.
     *
     * @return Provides details of the <code>CancelWorkflowExecution</code> decision.
     *         It is not set for other decision types.
     */
    public CancelWorkflowExecutionDecisionAttributes getCancelWorkflowExecutionDecisionAttributes() {
        return cancelWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>CancelWorkflowExecution</code> decision.
     * It is not set for other decision types.
     *
     * @param cancelWorkflowExecutionDecisionAttributes Provides details of the <code>CancelWorkflowExecution</code> decision.
     *         It is not set for other decision types.
     */
    public void setCancelWorkflowExecutionDecisionAttributes(CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes) {
        this.cancelWorkflowExecutionDecisionAttributes = cancelWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>CancelWorkflowExecution</code> decision.
     * It is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelWorkflowExecutionDecisionAttributes Provides details of the <code>CancelWorkflowExecution</code> decision.
     *         It is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withCancelWorkflowExecutionDecisionAttributes(CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes) {
        this.cancelWorkflowExecutionDecisionAttributes = cancelWorkflowExecutionDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @return Provides details of the <code>ContinueAsNewWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public ContinueAsNewWorkflowExecutionDecisionAttributes getContinueAsNewWorkflowExecutionDecisionAttributes() {
        return continueAsNewWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @param continueAsNewWorkflowExecutionDecisionAttributes Provides details of the <code>ContinueAsNewWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public void setContinueAsNewWorkflowExecutionDecisionAttributes(ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes) {
        this.continueAsNewWorkflowExecutionDecisionAttributes = continueAsNewWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code>
     * decision. It is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param continueAsNewWorkflowExecutionDecisionAttributes Provides details of the <code>ContinueAsNewWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withContinueAsNewWorkflowExecutionDecisionAttributes(ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes) {
        this.continueAsNewWorkflowExecutionDecisionAttributes = continueAsNewWorkflowExecutionDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>RecordMarker</code> decision. It is not
     * set for other decision types.
     *
     * @return Provides details of the <code>RecordMarker</code> decision. It is not
     *         set for other decision types.
     */
    public RecordMarkerDecisionAttributes getRecordMarkerDecisionAttributes() {
        return recordMarkerDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>RecordMarker</code> decision. It is not
     * set for other decision types.
     *
     * @param recordMarkerDecisionAttributes Provides details of the <code>RecordMarker</code> decision. It is not
     *         set for other decision types.
     */
    public void setRecordMarkerDecisionAttributes(RecordMarkerDecisionAttributes recordMarkerDecisionAttributes) {
        this.recordMarkerDecisionAttributes = recordMarkerDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>RecordMarker</code> decision. It is not
     * set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recordMarkerDecisionAttributes Provides details of the <code>RecordMarker</code> decision. It is not
     *         set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withRecordMarkerDecisionAttributes(RecordMarkerDecisionAttributes recordMarkerDecisionAttributes) {
        this.recordMarkerDecisionAttributes = recordMarkerDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>StartTimer</code> decision. It is not
     * set for other decision types.
     *
     * @return Provides details of the <code>StartTimer</code> decision. It is not
     *         set for other decision types.
     */
    public StartTimerDecisionAttributes getStartTimerDecisionAttributes() {
        return startTimerDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>StartTimer</code> decision. It is not
     * set for other decision types.
     *
     * @param startTimerDecisionAttributes Provides details of the <code>StartTimer</code> decision. It is not
     *         set for other decision types.
     */
    public void setStartTimerDecisionAttributes(StartTimerDecisionAttributes startTimerDecisionAttributes) {
        this.startTimerDecisionAttributes = startTimerDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>StartTimer</code> decision. It is not
     * set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTimerDecisionAttributes Provides details of the <code>StartTimer</code> decision. It is not
     *         set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withStartTimerDecisionAttributes(StartTimerDecisionAttributes startTimerDecisionAttributes) {
        this.startTimerDecisionAttributes = startTimerDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>CancelTimer</code> decision. It is not
     * set for other decision types.
     *
     * @return Provides details of the <code>CancelTimer</code> decision. It is not
     *         set for other decision types.
     */
    public CancelTimerDecisionAttributes getCancelTimerDecisionAttributes() {
        return cancelTimerDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>CancelTimer</code> decision. It is not
     * set for other decision types.
     *
     * @param cancelTimerDecisionAttributes Provides details of the <code>CancelTimer</code> decision. It is not
     *         set for other decision types.
     */
    public void setCancelTimerDecisionAttributes(CancelTimerDecisionAttributes cancelTimerDecisionAttributes) {
        this.cancelTimerDecisionAttributes = cancelTimerDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>CancelTimer</code> decision. It is not
     * set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelTimerDecisionAttributes Provides details of the <code>CancelTimer</code> decision. It is not
     *         set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withCancelTimerDecisionAttributes(CancelTimerDecisionAttributes cancelTimerDecisionAttributes) {
        this.cancelTimerDecisionAttributes = cancelTimerDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>SignalExternalWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @return Provides details of the <code>SignalExternalWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public SignalExternalWorkflowExecutionDecisionAttributes getSignalExternalWorkflowExecutionDecisionAttributes() {
        return signalExternalWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>SignalExternalWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @param signalExternalWorkflowExecutionDecisionAttributes Provides details of the <code>SignalExternalWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public void setSignalExternalWorkflowExecutionDecisionAttributes(SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes) {
        this.signalExternalWorkflowExecutionDecisionAttributes = signalExternalWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>SignalExternalWorkflowExecution</code>
     * decision. It is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signalExternalWorkflowExecutionDecisionAttributes Provides details of the <code>SignalExternalWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withSignalExternalWorkflowExecutionDecisionAttributes(SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes) {
        this.signalExternalWorkflowExecutionDecisionAttributes = signalExternalWorkflowExecutionDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the
     * <code>RequestCancelExternalWorkflowExecution</code> decision. It is
     * not set for other decision types.
     *
     * @return Provides details of the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision. It is
     *         not set for other decision types.
     */
    public RequestCancelExternalWorkflowExecutionDecisionAttributes getRequestCancelExternalWorkflowExecutionDecisionAttributes() {
        return requestCancelExternalWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the
     * <code>RequestCancelExternalWorkflowExecution</code> decision. It is
     * not set for other decision types.
     *
     * @param requestCancelExternalWorkflowExecutionDecisionAttributes Provides details of the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision. It is
     *         not set for other decision types.
     */
    public void setRequestCancelExternalWorkflowExecutionDecisionAttributes(RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes) {
        this.requestCancelExternalWorkflowExecutionDecisionAttributes = requestCancelExternalWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the
     * <code>RequestCancelExternalWorkflowExecution</code> decision. It is
     * not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestCancelExternalWorkflowExecutionDecisionAttributes Provides details of the
     *         <code>RequestCancelExternalWorkflowExecution</code> decision. It is
     *         not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withRequestCancelExternalWorkflowExecutionDecisionAttributes(RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes) {
        this.requestCancelExternalWorkflowExecutionDecisionAttributes = requestCancelExternalWorkflowExecutionDecisionAttributes;
        return this;
    }

    /**
     * Provides details of the <code>StartChildWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @return Provides details of the <code>StartChildWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public StartChildWorkflowExecutionDecisionAttributes getStartChildWorkflowExecutionDecisionAttributes() {
        return startChildWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>StartChildWorkflowExecution</code>
     * decision. It is not set for other decision types.
     *
     * @param startChildWorkflowExecutionDecisionAttributes Provides details of the <code>StartChildWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     */
    public void setStartChildWorkflowExecutionDecisionAttributes(StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes) {
        this.startChildWorkflowExecutionDecisionAttributes = startChildWorkflowExecutionDecisionAttributes;
    }
    
    /**
     * Provides details of the <code>StartChildWorkflowExecution</code>
     * decision. It is not set for other decision types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startChildWorkflowExecutionDecisionAttributes Provides details of the <code>StartChildWorkflowExecution</code>
     *         decision. It is not set for other decision types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Decision withStartChildWorkflowExecutionDecisionAttributes(StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes) {
        this.startChildWorkflowExecutionDecisionAttributes = startChildWorkflowExecutionDecisionAttributes;
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
        if (getDecisionType() != null) sb.append("DecisionType: " + getDecisionType() + ",");
        if (getScheduleActivityTaskDecisionAttributes() != null) sb.append("ScheduleActivityTaskDecisionAttributes: " + getScheduleActivityTaskDecisionAttributes() + ",");
        if (getRequestCancelActivityTaskDecisionAttributes() != null) sb.append("RequestCancelActivityTaskDecisionAttributes: " + getRequestCancelActivityTaskDecisionAttributes() + ",");
        if (getCompleteWorkflowExecutionDecisionAttributes() != null) sb.append("CompleteWorkflowExecutionDecisionAttributes: " + getCompleteWorkflowExecutionDecisionAttributes() + ",");
        if (getFailWorkflowExecutionDecisionAttributes() != null) sb.append("FailWorkflowExecutionDecisionAttributes: " + getFailWorkflowExecutionDecisionAttributes() + ",");
        if (getCancelWorkflowExecutionDecisionAttributes() != null) sb.append("CancelWorkflowExecutionDecisionAttributes: " + getCancelWorkflowExecutionDecisionAttributes() + ",");
        if (getContinueAsNewWorkflowExecutionDecisionAttributes() != null) sb.append("ContinueAsNewWorkflowExecutionDecisionAttributes: " + getContinueAsNewWorkflowExecutionDecisionAttributes() + ",");
        if (getRecordMarkerDecisionAttributes() != null) sb.append("RecordMarkerDecisionAttributes: " + getRecordMarkerDecisionAttributes() + ",");
        if (getStartTimerDecisionAttributes() != null) sb.append("StartTimerDecisionAttributes: " + getStartTimerDecisionAttributes() + ",");
        if (getCancelTimerDecisionAttributes() != null) sb.append("CancelTimerDecisionAttributes: " + getCancelTimerDecisionAttributes() + ",");
        if (getSignalExternalWorkflowExecutionDecisionAttributes() != null) sb.append("SignalExternalWorkflowExecutionDecisionAttributes: " + getSignalExternalWorkflowExecutionDecisionAttributes() + ",");
        if (getRequestCancelExternalWorkflowExecutionDecisionAttributes() != null) sb.append("RequestCancelExternalWorkflowExecutionDecisionAttributes: " + getRequestCancelExternalWorkflowExecutionDecisionAttributes() + ",");
        if (getStartChildWorkflowExecutionDecisionAttributes() != null) sb.append("StartChildWorkflowExecutionDecisionAttributes: " + getStartChildWorkflowExecutionDecisionAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDecisionType() == null) ? 0 : getDecisionType().hashCode()); 
        hashCode = prime * hashCode + ((getScheduleActivityTaskDecisionAttributes() == null) ? 0 : getScheduleActivityTaskDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getRequestCancelActivityTaskDecisionAttributes() == null) ? 0 : getRequestCancelActivityTaskDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCompleteWorkflowExecutionDecisionAttributes() == null) ? 0 : getCompleteWorkflowExecutionDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getFailWorkflowExecutionDecisionAttributes() == null) ? 0 : getFailWorkflowExecutionDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCancelWorkflowExecutionDecisionAttributes() == null) ? 0 : getCancelWorkflowExecutionDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getContinueAsNewWorkflowExecutionDecisionAttributes() == null) ? 0 : getContinueAsNewWorkflowExecutionDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getRecordMarkerDecisionAttributes() == null) ? 0 : getRecordMarkerDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getStartTimerDecisionAttributes() == null) ? 0 : getStartTimerDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getCancelTimerDecisionAttributes() == null) ? 0 : getCancelTimerDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getSignalExternalWorkflowExecutionDecisionAttributes() == null) ? 0 : getSignalExternalWorkflowExecutionDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getRequestCancelExternalWorkflowExecutionDecisionAttributes() == null) ? 0 : getRequestCancelExternalWorkflowExecutionDecisionAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getStartChildWorkflowExecutionDecisionAttributes() == null) ? 0 : getStartChildWorkflowExecutionDecisionAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Decision == false) return false;
        Decision other = (Decision)obj;
        
        if (other.getDecisionType() == null ^ this.getDecisionType() == null) return false;
        if (other.getDecisionType() != null && other.getDecisionType().equals(this.getDecisionType()) == false) return false; 
        if (other.getScheduleActivityTaskDecisionAttributes() == null ^ this.getScheduleActivityTaskDecisionAttributes() == null) return false;
        if (other.getScheduleActivityTaskDecisionAttributes() != null && other.getScheduleActivityTaskDecisionAttributes().equals(this.getScheduleActivityTaskDecisionAttributes()) == false) return false; 
        if (other.getRequestCancelActivityTaskDecisionAttributes() == null ^ this.getRequestCancelActivityTaskDecisionAttributes() == null) return false;
        if (other.getRequestCancelActivityTaskDecisionAttributes() != null && other.getRequestCancelActivityTaskDecisionAttributes().equals(this.getRequestCancelActivityTaskDecisionAttributes()) == false) return false; 
        if (other.getCompleteWorkflowExecutionDecisionAttributes() == null ^ this.getCompleteWorkflowExecutionDecisionAttributes() == null) return false;
        if (other.getCompleteWorkflowExecutionDecisionAttributes() != null && other.getCompleteWorkflowExecutionDecisionAttributes().equals(this.getCompleteWorkflowExecutionDecisionAttributes()) == false) return false; 
        if (other.getFailWorkflowExecutionDecisionAttributes() == null ^ this.getFailWorkflowExecutionDecisionAttributes() == null) return false;
        if (other.getFailWorkflowExecutionDecisionAttributes() != null && other.getFailWorkflowExecutionDecisionAttributes().equals(this.getFailWorkflowExecutionDecisionAttributes()) == false) return false; 
        if (other.getCancelWorkflowExecutionDecisionAttributes() == null ^ this.getCancelWorkflowExecutionDecisionAttributes() == null) return false;
        if (other.getCancelWorkflowExecutionDecisionAttributes() != null && other.getCancelWorkflowExecutionDecisionAttributes().equals(this.getCancelWorkflowExecutionDecisionAttributes()) == false) return false; 
        if (other.getContinueAsNewWorkflowExecutionDecisionAttributes() == null ^ this.getContinueAsNewWorkflowExecutionDecisionAttributes() == null) return false;
        if (other.getContinueAsNewWorkflowExecutionDecisionAttributes() != null && other.getContinueAsNewWorkflowExecutionDecisionAttributes().equals(this.getContinueAsNewWorkflowExecutionDecisionAttributes()) == false) return false; 
        if (other.getRecordMarkerDecisionAttributes() == null ^ this.getRecordMarkerDecisionAttributes() == null) return false;
        if (other.getRecordMarkerDecisionAttributes() != null && other.getRecordMarkerDecisionAttributes().equals(this.getRecordMarkerDecisionAttributes()) == false) return false; 
        if (other.getStartTimerDecisionAttributes() == null ^ this.getStartTimerDecisionAttributes() == null) return false;
        if (other.getStartTimerDecisionAttributes() != null && other.getStartTimerDecisionAttributes().equals(this.getStartTimerDecisionAttributes()) == false) return false; 
        if (other.getCancelTimerDecisionAttributes() == null ^ this.getCancelTimerDecisionAttributes() == null) return false;
        if (other.getCancelTimerDecisionAttributes() != null && other.getCancelTimerDecisionAttributes().equals(this.getCancelTimerDecisionAttributes()) == false) return false; 
        if (other.getSignalExternalWorkflowExecutionDecisionAttributes() == null ^ this.getSignalExternalWorkflowExecutionDecisionAttributes() == null) return false;
        if (other.getSignalExternalWorkflowExecutionDecisionAttributes() != null && other.getSignalExternalWorkflowExecutionDecisionAttributes().equals(this.getSignalExternalWorkflowExecutionDecisionAttributes()) == false) return false; 
        if (other.getRequestCancelExternalWorkflowExecutionDecisionAttributes() == null ^ this.getRequestCancelExternalWorkflowExecutionDecisionAttributes() == null) return false;
        if (other.getRequestCancelExternalWorkflowExecutionDecisionAttributes() != null && other.getRequestCancelExternalWorkflowExecutionDecisionAttributes().equals(this.getRequestCancelExternalWorkflowExecutionDecisionAttributes()) == false) return false; 
        if (other.getStartChildWorkflowExecutionDecisionAttributes() == null ^ this.getStartChildWorkflowExecutionDecisionAttributes() == null) return false;
        if (other.getStartChildWorkflowExecutionDecisionAttributes() != null && other.getStartChildWorkflowExecutionDecisionAttributes().equals(this.getStartChildWorkflowExecutionDecisionAttributes()) == false) return false; 
        return true;
    }
    
}
    