/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Specifies a decision made by the decider. A decision can be one of these types:
 * </p>
 * <ul>
 * <li><b>CancelTimer</b>: cancels a previously started timer and records a <code>TimerCanceled</code> event in the
 * history.</li>
 * <li><b>CancelWorkflowExecution</b>: closes the workflow execution and records a
 * <code>WorkflowExecutionCanceled</code> event in the history.</li>
 * <li><b>CompleteWorkflowExecution</b>: closes the workflow execution and records a
 * <code>WorkflowExecutionCompleted</code> event in the history .</li>
 * <li><b>ContinueAsNewWorkflowExecution</b>: closes the workflow execution and starts a new workflow execution of the
 * same type using the same workflow ID and a unique run ID. A <code>WorkflowExecutionContinuedAsNew</code> event is
 * recorded in the history.</li>
 * <li><b>FailWorkflowExecution</b>: closes the workflow execution and records a <code>WorkflowExecutionFailed</code>
 * event in the history.</li>
 * <li><b>RecordMarker</b>: records a <code>MarkerRecorded</code> event in the history. Markers can be used for adding
 * custom information in the history for instance to let deciders know that they do not need to look at the history
 * beyond the marker event.</li>
 * <li><b>RequestCancelActivityTask</b>: attempts to cancel a previously scheduled activity task. If the activity task
 * was scheduled but has not been assigned to a worker, then it will be canceled. If the activity task was already
 * assigned to a worker, then the worker will be informed that cancellation has been requested in the response to
 * <a>RecordActivityTaskHeartbeat</a>.</li>
 * <li><b>RequestCancelExternalWorkflowExecution</b>: requests that a request be made to cancel the specified external
 * workflow execution and records a <code>RequestCancelExternalWorkflowExecutionInitiated</code> event in the history.</li>
 * <li><b>ScheduleActivityTask</b>: schedules an activity task.</li>
 * <li><b>ScheduleLambdaFunction</b>: schedules a AWS Lambda function.</li>
 * <li><b>SignalExternalWorkflowExecution</b>: requests a signal to be delivered to the specified external workflow
 * execution and records a <code>SignalExternalWorkflowExecutionInitiated</code> event in the history.</li>
 * <li><b>StartChildWorkflowExecution</b>: requests that a child workflow execution be started and records a
 * <code>StartChildWorkflowExecutionInitiated</code> event in the history. The child workflow execution is a separate
 * workflow execution with its own history.</li>
 * <li><b>StartTimer</b>: starts a timer for this workflow execution and records a <code>TimerStarted</code> event in
 * the history. This timer will fire after the specified delay and record a <code>TimerFired</code> event.</li>
 * </ul>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * If you grant permission to use <code>RespondDecisionTaskCompleted</code>, you can use IAM policies to express
 * permissions for the list of decisions returned by this action as if they were members of the API. Treating decisions
 * as a pseudo API maintains a uniform conceptual model and helps keep policies readable. For details and example IAM
 * policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to
 * Manage Access to Amazon SWF Workflows</a>.
 * </p>
 * <p>
 * <b>Decision Failure</b>
 * </p>
 * <p>
 * Decisions can fail for several reasons
 * </p>
 * <ul>
 * <li>The ordering of decisions should follow a logical flow. Some decisions might not make sense in the current
 * context of the workflow execution and will therefore fail.</li>
 * <li>A limit on your account was reached.</li>
 * <li>The decision lacks sufficient permissions.</li>
 * </ul>
 * <p>
 * One of the following events might be added to the history to indicate an error. The event attribute's <b>cause</b>
 * parameter indicates the cause. If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision failed because it
 * lacked sufficient permissions. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a>.
 * </p>
 * <ul>
 * <li><b>ScheduleActivityTaskFailed</b>: a ScheduleActivityTask decision failed. This could happen if the activity type
 * specified in the decision is not registered, is in a deprecated state, or the decision is not properly configured.</li>
 * <li><b>ScheduleLambdaFunctionFailed</b>: a ScheduleLambdaFunctionFailed decision failed. This could happen if the AWS
 * Lambda function specified in the decision does not exist, or the AWS Lambda service's limits are exceeded.</li>
 * <li><b>RequestCancelActivityTaskFailed</b>: a RequestCancelActivityTask decision failed. This could happen if there
 * is no open activity task with the specified activityId.</li>
 * <li><b>StartTimerFailed</b>: a StartTimer decision failed. This could happen if there is another open timer with the
 * same timerId.</li>
 * <li><b>CancelTimerFailed</b>: a CancelTimer decision failed. This could happen if there is no open timer with the
 * specified timerId.</li>
 * <li><b>StartChildWorkflowExecutionFailed</b>: a StartChildWorkflowExecution decision failed. This could happen if the
 * workflow type specified is not registered, is deprecated, or the decision is not properly configured.</li>
 * <li><b>SignalExternalWorkflowExecutionFailed</b>: a SignalExternalWorkflowExecution decision failed. This could
 * happen if the <code>workflowID</code> specified in the decision was incorrect.</li>
 * <li><b>RequestCancelExternalWorkflowExecutionFailed</b>: a RequestCancelExternalWorkflowExecution decision failed.
 * This could happen if the <code>workflowID</code> specified in the decision was incorrect.</li>
 * <li><b>CancelWorkflowExecutionFailed</b>: a CancelWorkflowExecution decision failed. This could happen if there is an
 * unhandled decision task pending in the workflow execution.</li>
 * <li><b>CompleteWorkflowExecutionFailed</b>: a CompleteWorkflowExecution decision failed. This could happen if there
 * is an unhandled decision task pending in the workflow execution.</li>
 * <li><b>ContinueAsNewWorkflowExecutionFailed</b>: a ContinueAsNewWorkflowExecution decision failed. This could happen
 * if there is an unhandled decision task pending in the workflow execution or the ContinueAsNewWorkflowExecution
 * decision was not configured correctly.</li>
 * <li><b>FailWorkflowExecutionFailed</b>: a FailWorkflowExecution decision failed. This could happen if there is an
 * unhandled decision task pending in the workflow execution.</li>
 * </ul>
 * <p>
 * The preceding error events might occur due to an error in the decider logic, which might put the workflow execution
 * in an unstable state The cause field in the event structure for the error event indicates the cause of the error.
 * </p>
 * <note>A workflow execution may be closed by the decider by returning one of the following decisions when completing a
 * decision task: <code>CompleteWorkflowExecution</code>, <code>FailWorkflowExecution</code>,
 * <code>CancelWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>. An UnhandledDecision fault will
 * be returned if a workflow closing decision is specified and a signal or activity event had been added to the history
 * while the decision task was being performed by the decider. Unlike the above situations which are logic issues, this
 * fault is always possible because of race conditions in a distributed system. The right action here is to call
 * <a>RespondDecisionTaskCompleted</a> without any decisions. This would result in another decision task with these new
 * events included in the history. The decider should handle the new events and may decide to close the workflow
 * execution.</note>
 * <p>
 * <b>How to code a decision</b>
 * </p>
 * <p>
 * You code a decision by first setting the decision type field to one of the above decision values, and then set the
 * corresponding attributes field shown below:
 * </p>
 * <ul>
 * <li><a>ScheduleActivityTaskDecisionAttributes</a></li>
 * <li><a>ScheduleLambdaFunctionDecisionAttributes</a></li>
 * <li><a>RequestCancelActivityTaskDecisionAttributes</a></li>
 * <li><a>CompleteWorkflowExecutionDecisionAttributes</a></li>
 * <li><a>FailWorkflowExecutionDecisionAttributes</a></li>
 * <li><a>CancelWorkflowExecutionDecisionAttributes</a></li>
 * <li><a>ContinueAsNewWorkflowExecutionDecisionAttributes</a></li>
 * <li><a>RecordMarkerDecisionAttributes</a></li>
 * <li><a>StartTimerDecisionAttributes</a></li>
 * <li><a>CancelTimerDecisionAttributes</a></li>
 * <li><a>SignalExternalWorkflowExecutionDecisionAttributes</a></li>
 * <li><a>RequestCancelExternalWorkflowExecutionDecisionAttributes</a></li>
 * <li><a>StartChildWorkflowExecutionDecisionAttributes</a></li>
 * </ul>
 */
public class Decision implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the type of the decision.
     * </p>
     */
    private String decisionType;
    /**
     * <p>
     * Provides details of the <code>ScheduleActivityTask</code> decision. It is not set for other decision types.
     * </p>
     */
    private ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>RequestCancelActivityTask</code> decision. It is not set for other decision types.
     * </p>
     */
    private RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>CompleteWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     */
    private CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>FailWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     */
    private FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>CancelWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     */
    private CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     */
    private ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>RecordMarker</code> decision. It is not set for other decision types.
     * </p>
     */
    private RecordMarkerDecisionAttributes recordMarkerDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>StartTimer</code> decision. It is not set for other decision types.
     * </p>
     */
    private StartTimerDecisionAttributes startTimerDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>CancelTimer</code> decision. It is not set for other decision types.
     * </p>
     */
    private CancelTimerDecisionAttributes cancelTimerDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>SignalExternalWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     */
    private SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It is not set for other
     * decision types.
     * </p>
     */
    private RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides details of the <code>StartChildWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     */
    private StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes;

    private ScheduleLambdaFunctionDecisionAttributes scheduleLambdaFunctionDecisionAttributes;

    /**
     * <p>
     * Specifies the type of the decision.
     * </p>
     * 
     * @param decisionType
     *        Specifies the type of the decision.
     * @see DecisionType
     */

    public void setDecisionType(String decisionType) {
        this.decisionType = decisionType;
    }

    /**
     * <p>
     * Specifies the type of the decision.
     * </p>
     * 
     * @return Specifies the type of the decision.
     * @see DecisionType
     */

    public String getDecisionType() {
        return this.decisionType;
    }

    /**
     * <p>
     * Specifies the type of the decision.
     * </p>
     * 
     * @param decisionType
     *        Specifies the type of the decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecisionType
     */

    public Decision withDecisionType(String decisionType) {
        setDecisionType(decisionType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the decision.
     * </p>
     * 
     * @param decisionType
     *        Specifies the type of the decision.
     * @see DecisionType
     */

    public void setDecisionType(DecisionType decisionType) {
        this.decisionType = decisionType.toString();
    }

    /**
     * <p>
     * Specifies the type of the decision.
     * </p>
     * 
     * @param decisionType
     *        Specifies the type of the decision.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecisionType
     */

    public Decision withDecisionType(DecisionType decisionType) {
        setDecisionType(decisionType);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>ScheduleActivityTask</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param scheduleActivityTaskDecisionAttributes
     *        Provides details of the <code>ScheduleActivityTask</code> decision. It is not set for other decision
     *        types.
     */

    public void setScheduleActivityTaskDecisionAttributes(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes) {
        this.scheduleActivityTaskDecisionAttributes = scheduleActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>ScheduleActivityTask</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>ScheduleActivityTask</code> decision. It is not set for other decision
     *         types.
     */

    public ScheduleActivityTaskDecisionAttributes getScheduleActivityTaskDecisionAttributes() {
        return this.scheduleActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>ScheduleActivityTask</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param scheduleActivityTaskDecisionAttributes
     *        Provides details of the <code>ScheduleActivityTask</code> decision. It is not set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withScheduleActivityTaskDecisionAttributes(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes) {
        setScheduleActivityTaskDecisionAttributes(scheduleActivityTaskDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>RequestCancelActivityTask</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param requestCancelActivityTaskDecisionAttributes
     *        Provides details of the <code>RequestCancelActivityTask</code> decision. It is not set for other decision
     *        types.
     */

    public void setRequestCancelActivityTaskDecisionAttributes(RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes) {
        this.requestCancelActivityTaskDecisionAttributes = requestCancelActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>RequestCancelActivityTask</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>RequestCancelActivityTask</code> decision. It is not set for other decision
     *         types.
     */

    public RequestCancelActivityTaskDecisionAttributes getRequestCancelActivityTaskDecisionAttributes() {
        return this.requestCancelActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>RequestCancelActivityTask</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param requestCancelActivityTaskDecisionAttributes
     *        Provides details of the <code>RequestCancelActivityTask</code> decision. It is not set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withRequestCancelActivityTaskDecisionAttributes(RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes) {
        setRequestCancelActivityTaskDecisionAttributes(requestCancelActivityTaskDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>CompleteWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param completeWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>CompleteWorkflowExecution</code> decision. It is not set for other decision
     *        types.
     */

    public void setCompleteWorkflowExecutionDecisionAttributes(CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes) {
        this.completeWorkflowExecutionDecisionAttributes = completeWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>CompleteWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>CompleteWorkflowExecution</code> decision. It is not set for other decision
     *         types.
     */

    public CompleteWorkflowExecutionDecisionAttributes getCompleteWorkflowExecutionDecisionAttributes() {
        return this.completeWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>CompleteWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param completeWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>CompleteWorkflowExecution</code> decision. It is not set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withCompleteWorkflowExecutionDecisionAttributes(CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes) {
        setCompleteWorkflowExecutionDecisionAttributes(completeWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>FailWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param failWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>FailWorkflowExecution</code> decision. It is not set for other decision
     *        types.
     */

    public void setFailWorkflowExecutionDecisionAttributes(FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes) {
        this.failWorkflowExecutionDecisionAttributes = failWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>FailWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>FailWorkflowExecution</code> decision. It is not set for other decision
     *         types.
     */

    public FailWorkflowExecutionDecisionAttributes getFailWorkflowExecutionDecisionAttributes() {
        return this.failWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>FailWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param failWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>FailWorkflowExecution</code> decision. It is not set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withFailWorkflowExecutionDecisionAttributes(FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes) {
        setFailWorkflowExecutionDecisionAttributes(failWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>CancelWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param cancelWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>CancelWorkflowExecution</code> decision. It is not set for other decision
     *        types.
     */

    public void setCancelWorkflowExecutionDecisionAttributes(CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes) {
        this.cancelWorkflowExecutionDecisionAttributes = cancelWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>CancelWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>CancelWorkflowExecution</code> decision. It is not set for other decision
     *         types.
     */

    public CancelWorkflowExecutionDecisionAttributes getCancelWorkflowExecutionDecisionAttributes() {
        return this.cancelWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>CancelWorkflowExecution</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param cancelWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>CancelWorkflowExecution</code> decision. It is not set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withCancelWorkflowExecutionDecisionAttributes(CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes) {
        setCancelWorkflowExecutionDecisionAttributes(cancelWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @param continueAsNewWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision. It is not set for other
     *        decision types.
     */

    public void setContinueAsNewWorkflowExecutionDecisionAttributes(
            ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes) {
        this.continueAsNewWorkflowExecutionDecisionAttributes = continueAsNewWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @return Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision. It is not set for other
     *         decision types.
     */

    public ContinueAsNewWorkflowExecutionDecisionAttributes getContinueAsNewWorkflowExecutionDecisionAttributes() {
        return this.continueAsNewWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @param continueAsNewWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>ContinueAsNewWorkflowExecution</code> decision. It is not set for other
     *        decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withContinueAsNewWorkflowExecutionDecisionAttributes(
            ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes) {
        setContinueAsNewWorkflowExecutionDecisionAttributes(continueAsNewWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>RecordMarker</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param recordMarkerDecisionAttributes
     *        Provides details of the <code>RecordMarker</code> decision. It is not set for other decision types.
     */

    public void setRecordMarkerDecisionAttributes(RecordMarkerDecisionAttributes recordMarkerDecisionAttributes) {
        this.recordMarkerDecisionAttributes = recordMarkerDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>RecordMarker</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>RecordMarker</code> decision. It is not set for other decision types.
     */

    public RecordMarkerDecisionAttributes getRecordMarkerDecisionAttributes() {
        return this.recordMarkerDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>RecordMarker</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param recordMarkerDecisionAttributes
     *        Provides details of the <code>RecordMarker</code> decision. It is not set for other decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withRecordMarkerDecisionAttributes(RecordMarkerDecisionAttributes recordMarkerDecisionAttributes) {
        setRecordMarkerDecisionAttributes(recordMarkerDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>StartTimer</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param startTimerDecisionAttributes
     *        Provides details of the <code>StartTimer</code> decision. It is not set for other decision types.
     */

    public void setStartTimerDecisionAttributes(StartTimerDecisionAttributes startTimerDecisionAttributes) {
        this.startTimerDecisionAttributes = startTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>StartTimer</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>StartTimer</code> decision. It is not set for other decision types.
     */

    public StartTimerDecisionAttributes getStartTimerDecisionAttributes() {
        return this.startTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>StartTimer</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param startTimerDecisionAttributes
     *        Provides details of the <code>StartTimer</code> decision. It is not set for other decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withStartTimerDecisionAttributes(StartTimerDecisionAttributes startTimerDecisionAttributes) {
        setStartTimerDecisionAttributes(startTimerDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>CancelTimer</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param cancelTimerDecisionAttributes
     *        Provides details of the <code>CancelTimer</code> decision. It is not set for other decision types.
     */

    public void setCancelTimerDecisionAttributes(CancelTimerDecisionAttributes cancelTimerDecisionAttributes) {
        this.cancelTimerDecisionAttributes = cancelTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>CancelTimer</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @return Provides details of the <code>CancelTimer</code> decision. It is not set for other decision types.
     */

    public CancelTimerDecisionAttributes getCancelTimerDecisionAttributes() {
        return this.cancelTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>CancelTimer</code> decision. It is not set for other decision types.
     * </p>
     * 
     * @param cancelTimerDecisionAttributes
     *        Provides details of the <code>CancelTimer</code> decision. It is not set for other decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withCancelTimerDecisionAttributes(CancelTimerDecisionAttributes cancelTimerDecisionAttributes) {
        setCancelTimerDecisionAttributes(cancelTimerDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>SignalExternalWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>SignalExternalWorkflowExecution</code> decision. It is not set for other
     *        decision types.
     */

    public void setSignalExternalWorkflowExecutionDecisionAttributes(
            SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes) {
        this.signalExternalWorkflowExecutionDecisionAttributes = signalExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>SignalExternalWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @return Provides details of the <code>SignalExternalWorkflowExecution</code> decision. It is not set for other
     *         decision types.
     */

    public SignalExternalWorkflowExecutionDecisionAttributes getSignalExternalWorkflowExecutionDecisionAttributes() {
        return this.signalExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>SignalExternalWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>SignalExternalWorkflowExecution</code> decision. It is not set for other
     *        decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withSignalExternalWorkflowExecutionDecisionAttributes(
            SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes) {
        setSignalExternalWorkflowExecutionDecisionAttributes(signalExternalWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It is not set for other
     * decision types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It is not set for
     *        other decision types.
     */

    public void setRequestCancelExternalWorkflowExecutionDecisionAttributes(
            RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes) {
        this.requestCancelExternalWorkflowExecutionDecisionAttributes = requestCancelExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It is not set for other
     * decision types.
     * </p>
     * 
     * @return Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It is not set for
     *         other decision types.
     */

    public RequestCancelExternalWorkflowExecutionDecisionAttributes getRequestCancelExternalWorkflowExecutionDecisionAttributes() {
        return this.requestCancelExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It is not set for other
     * decision types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It is not set for
     *        other decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withRequestCancelExternalWorkflowExecutionDecisionAttributes(
            RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes) {
        setRequestCancelExternalWorkflowExecutionDecisionAttributes(requestCancelExternalWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides details of the <code>StartChildWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @param startChildWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>StartChildWorkflowExecution</code> decision. It is not set for other
     *        decision types.
     */

    public void setStartChildWorkflowExecutionDecisionAttributes(StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes) {
        this.startChildWorkflowExecutionDecisionAttributes = startChildWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>StartChildWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @return Provides details of the <code>StartChildWorkflowExecution</code> decision. It is not set for other
     *         decision types.
     */

    public StartChildWorkflowExecutionDecisionAttributes getStartChildWorkflowExecutionDecisionAttributes() {
        return this.startChildWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides details of the <code>StartChildWorkflowExecution</code> decision. It is not set for other decision
     * types.
     * </p>
     * 
     * @param startChildWorkflowExecutionDecisionAttributes
     *        Provides details of the <code>StartChildWorkflowExecution</code> decision. It is not set for other
     *        decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withStartChildWorkflowExecutionDecisionAttributes(
            StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes) {
        setStartChildWorkflowExecutionDecisionAttributes(startChildWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * @param scheduleLambdaFunctionDecisionAttributes
     */

    public void setScheduleLambdaFunctionDecisionAttributes(ScheduleLambdaFunctionDecisionAttributes scheduleLambdaFunctionDecisionAttributes) {
        this.scheduleLambdaFunctionDecisionAttributes = scheduleLambdaFunctionDecisionAttributes;
    }

    /**
     * @return
     */

    public ScheduleLambdaFunctionDecisionAttributes getScheduleLambdaFunctionDecisionAttributes() {
        return this.scheduleLambdaFunctionDecisionAttributes;
    }

    /**
     * @param scheduleLambdaFunctionDecisionAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withScheduleLambdaFunctionDecisionAttributes(ScheduleLambdaFunctionDecisionAttributes scheduleLambdaFunctionDecisionAttributes) {
        setScheduleLambdaFunctionDecisionAttributes(scheduleLambdaFunctionDecisionAttributes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDecisionType() != null)
            sb.append("DecisionType: " + getDecisionType() + ",");
        if (getScheduleActivityTaskDecisionAttributes() != null)
            sb.append("ScheduleActivityTaskDecisionAttributes: " + getScheduleActivityTaskDecisionAttributes() + ",");
        if (getRequestCancelActivityTaskDecisionAttributes() != null)
            sb.append("RequestCancelActivityTaskDecisionAttributes: " + getRequestCancelActivityTaskDecisionAttributes() + ",");
        if (getCompleteWorkflowExecutionDecisionAttributes() != null)
            sb.append("CompleteWorkflowExecutionDecisionAttributes: " + getCompleteWorkflowExecutionDecisionAttributes() + ",");
        if (getFailWorkflowExecutionDecisionAttributes() != null)
            sb.append("FailWorkflowExecutionDecisionAttributes: " + getFailWorkflowExecutionDecisionAttributes() + ",");
        if (getCancelWorkflowExecutionDecisionAttributes() != null)
            sb.append("CancelWorkflowExecutionDecisionAttributes: " + getCancelWorkflowExecutionDecisionAttributes() + ",");
        if (getContinueAsNewWorkflowExecutionDecisionAttributes() != null)
            sb.append("ContinueAsNewWorkflowExecutionDecisionAttributes: " + getContinueAsNewWorkflowExecutionDecisionAttributes() + ",");
        if (getRecordMarkerDecisionAttributes() != null)
            sb.append("RecordMarkerDecisionAttributes: " + getRecordMarkerDecisionAttributes() + ",");
        if (getStartTimerDecisionAttributes() != null)
            sb.append("StartTimerDecisionAttributes: " + getStartTimerDecisionAttributes() + ",");
        if (getCancelTimerDecisionAttributes() != null)
            sb.append("CancelTimerDecisionAttributes: " + getCancelTimerDecisionAttributes() + ",");
        if (getSignalExternalWorkflowExecutionDecisionAttributes() != null)
            sb.append("SignalExternalWorkflowExecutionDecisionAttributes: " + getSignalExternalWorkflowExecutionDecisionAttributes() + ",");
        if (getRequestCancelExternalWorkflowExecutionDecisionAttributes() != null)
            sb.append("RequestCancelExternalWorkflowExecutionDecisionAttributes: " + getRequestCancelExternalWorkflowExecutionDecisionAttributes() + ",");
        if (getStartChildWorkflowExecutionDecisionAttributes() != null)
            sb.append("StartChildWorkflowExecutionDecisionAttributes: " + getStartChildWorkflowExecutionDecisionAttributes() + ",");
        if (getScheduleLambdaFunctionDecisionAttributes() != null)
            sb.append("ScheduleLambdaFunctionDecisionAttributes: " + getScheduleLambdaFunctionDecisionAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Decision == false)
            return false;
        Decision other = (Decision) obj;
        if (other.getDecisionType() == null ^ this.getDecisionType() == null)
            return false;
        if (other.getDecisionType() != null && other.getDecisionType().equals(this.getDecisionType()) == false)
            return false;
        if (other.getScheduleActivityTaskDecisionAttributes() == null ^ this.getScheduleActivityTaskDecisionAttributes() == null)
            return false;
        if (other.getScheduleActivityTaskDecisionAttributes() != null
                && other.getScheduleActivityTaskDecisionAttributes().equals(this.getScheduleActivityTaskDecisionAttributes()) == false)
            return false;
        if (other.getRequestCancelActivityTaskDecisionAttributes() == null ^ this.getRequestCancelActivityTaskDecisionAttributes() == null)
            return false;
        if (other.getRequestCancelActivityTaskDecisionAttributes() != null
                && other.getRequestCancelActivityTaskDecisionAttributes().equals(this.getRequestCancelActivityTaskDecisionAttributes()) == false)
            return false;
        if (other.getCompleteWorkflowExecutionDecisionAttributes() == null ^ this.getCompleteWorkflowExecutionDecisionAttributes() == null)
            return false;
        if (other.getCompleteWorkflowExecutionDecisionAttributes() != null
                && other.getCompleteWorkflowExecutionDecisionAttributes().equals(this.getCompleteWorkflowExecutionDecisionAttributes()) == false)
            return false;
        if (other.getFailWorkflowExecutionDecisionAttributes() == null ^ this.getFailWorkflowExecutionDecisionAttributes() == null)
            return false;
        if (other.getFailWorkflowExecutionDecisionAttributes() != null
                && other.getFailWorkflowExecutionDecisionAttributes().equals(this.getFailWorkflowExecutionDecisionAttributes()) == false)
            return false;
        if (other.getCancelWorkflowExecutionDecisionAttributes() == null ^ this.getCancelWorkflowExecutionDecisionAttributes() == null)
            return false;
        if (other.getCancelWorkflowExecutionDecisionAttributes() != null
                && other.getCancelWorkflowExecutionDecisionAttributes().equals(this.getCancelWorkflowExecutionDecisionAttributes()) == false)
            return false;
        if (other.getContinueAsNewWorkflowExecutionDecisionAttributes() == null ^ this.getContinueAsNewWorkflowExecutionDecisionAttributes() == null)
            return false;
        if (other.getContinueAsNewWorkflowExecutionDecisionAttributes() != null
                && other.getContinueAsNewWorkflowExecutionDecisionAttributes().equals(this.getContinueAsNewWorkflowExecutionDecisionAttributes()) == false)
            return false;
        if (other.getRecordMarkerDecisionAttributes() == null ^ this.getRecordMarkerDecisionAttributes() == null)
            return false;
        if (other.getRecordMarkerDecisionAttributes() != null
                && other.getRecordMarkerDecisionAttributes().equals(this.getRecordMarkerDecisionAttributes()) == false)
            return false;
        if (other.getStartTimerDecisionAttributes() == null ^ this.getStartTimerDecisionAttributes() == null)
            return false;
        if (other.getStartTimerDecisionAttributes() != null && other.getStartTimerDecisionAttributes().equals(this.getStartTimerDecisionAttributes()) == false)
            return false;
        if (other.getCancelTimerDecisionAttributes() == null ^ this.getCancelTimerDecisionAttributes() == null)
            return false;
        if (other.getCancelTimerDecisionAttributes() != null
                && other.getCancelTimerDecisionAttributes().equals(this.getCancelTimerDecisionAttributes()) == false)
            return false;
        if (other.getSignalExternalWorkflowExecutionDecisionAttributes() == null ^ this.getSignalExternalWorkflowExecutionDecisionAttributes() == null)
            return false;
        if (other.getSignalExternalWorkflowExecutionDecisionAttributes() != null
                && other.getSignalExternalWorkflowExecutionDecisionAttributes().equals(this.getSignalExternalWorkflowExecutionDecisionAttributes()) == false)
            return false;
        if (other.getRequestCancelExternalWorkflowExecutionDecisionAttributes() == null
                ^ this.getRequestCancelExternalWorkflowExecutionDecisionAttributes() == null)
            return false;
        if (other.getRequestCancelExternalWorkflowExecutionDecisionAttributes() != null
                && other.getRequestCancelExternalWorkflowExecutionDecisionAttributes().equals(
                        this.getRequestCancelExternalWorkflowExecutionDecisionAttributes()) == false)
            return false;
        if (other.getStartChildWorkflowExecutionDecisionAttributes() == null ^ this.getStartChildWorkflowExecutionDecisionAttributes() == null)
            return false;
        if (other.getStartChildWorkflowExecutionDecisionAttributes() != null
                && other.getStartChildWorkflowExecutionDecisionAttributes().equals(this.getStartChildWorkflowExecutionDecisionAttributes()) == false)
            return false;
        if (other.getScheduleLambdaFunctionDecisionAttributes() == null ^ this.getScheduleLambdaFunctionDecisionAttributes() == null)
            return false;
        if (other.getScheduleLambdaFunctionDecisionAttributes() != null
                && other.getScheduleLambdaFunctionDecisionAttributes().equals(this.getScheduleLambdaFunctionDecisionAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecisionType() == null) ? 0 : getDecisionType().hashCode());
        hashCode = prime * hashCode + ((getScheduleActivityTaskDecisionAttributes() == null) ? 0 : getScheduleActivityTaskDecisionAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCancelActivityTaskDecisionAttributes() == null) ? 0 : getRequestCancelActivityTaskDecisionAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getCompleteWorkflowExecutionDecisionAttributes() == null) ? 0 : getCompleteWorkflowExecutionDecisionAttributes().hashCode());
        hashCode = prime * hashCode + ((getFailWorkflowExecutionDecisionAttributes() == null) ? 0 : getFailWorkflowExecutionDecisionAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getCancelWorkflowExecutionDecisionAttributes() == null) ? 0 : getCancelWorkflowExecutionDecisionAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getContinueAsNewWorkflowExecutionDecisionAttributes() == null) ? 0 : getContinueAsNewWorkflowExecutionDecisionAttributes().hashCode());
        hashCode = prime * hashCode + ((getRecordMarkerDecisionAttributes() == null) ? 0 : getRecordMarkerDecisionAttributes().hashCode());
        hashCode = prime * hashCode + ((getStartTimerDecisionAttributes() == null) ? 0 : getStartTimerDecisionAttributes().hashCode());
        hashCode = prime * hashCode + ((getCancelTimerDecisionAttributes() == null) ? 0 : getCancelTimerDecisionAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getSignalExternalWorkflowExecutionDecisionAttributes() == null) ? 0 : getSignalExternalWorkflowExecutionDecisionAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestCancelExternalWorkflowExecutionDecisionAttributes() == null) ? 0 : getRequestCancelExternalWorkflowExecutionDecisionAttributes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStartChildWorkflowExecutionDecisionAttributes() == null) ? 0 : getStartChildWorkflowExecutionDecisionAttributes().hashCode());
        hashCode = prime * hashCode + ((getScheduleLambdaFunctionDecisionAttributes() == null) ? 0 : getScheduleLambdaFunctionDecisionAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Decision clone() {
        try {
            return (Decision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
