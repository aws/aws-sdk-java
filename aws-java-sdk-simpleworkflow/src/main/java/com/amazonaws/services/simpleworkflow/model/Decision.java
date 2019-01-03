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
 * Specifies a decision made by the decider. A decision can be one of these types:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CancelTimer</code> – Cancels a previously started timer and records a <code>TimerCanceled</code> event in the
 * history.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CancelWorkflowExecution</code> – Closes the workflow execution and records a
 * <code>WorkflowExecutionCanceled</code> event in the history.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CompleteWorkflowExecution</code> – Closes the workflow execution and records a
 * <code>WorkflowExecutionCompleted</code> event in the history .
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ContinueAsNewWorkflowExecution</code> – Closes the workflow execution and starts a new workflow execution of
 * the same type using the same workflow ID and a unique run Id. A <code>WorkflowExecutionContinuedAsNew</code> event is
 * recorded in the history.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FailWorkflowExecution</code> – Closes the workflow execution and records a <code>WorkflowExecutionFailed</code>
 * event in the history.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RecordMarker</code> – Records a <code>MarkerRecorded</code> event in the history. Markers can be used for
 * adding custom information in the history for instance to let deciders know that they don't need to look at the
 * history beyond the marker event.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RequestCancelActivityTask</code> – Attempts to cancel a previously scheduled activity task. If the activity
 * task was scheduled but has not been assigned to a worker, then it is canceled. If the activity task was already
 * assigned to a worker, then the worker is informed that cancellation has been requested in the response to
 * <a>RecordActivityTaskHeartbeat</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RequestCancelExternalWorkflowExecution</code> – Requests that a request be made to cancel the specified
 * external workflow execution and records a <code>RequestCancelExternalWorkflowExecutionInitiated</code> event in the
 * history.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ScheduleActivityTask</code> – Schedules an activity task.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SignalExternalWorkflowExecution</code> – Requests a signal to be delivered to the specified external workflow
 * execution and records a <code>SignalExternalWorkflowExecutionInitiated</code> event in the history.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartChildWorkflowExecution</code> – Requests that a child workflow execution be started and records a
 * <code>StartChildWorkflowExecutionInitiated</code> event in the history. The child workflow execution is a separate
 * workflow execution with its own history.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartTimer</code> – Starts a timer for this workflow execution and records a <code>TimerStarted</code> event in
 * the history. This timer fires after the specified delay and record a <code>TimerFired</code> event.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * If you grant permission to use <code>RespondDecisionTaskCompleted</code>, you can use IAM policies to express
 * permissions for the list of decisions returned by this action as if they were members of the API. Treating decisions
 * as a pseudo API maintains a uniform conceptual model and helps keep policies readable. For details and example IAM
 * policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to
 * Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
 * </p>
 * <p>
 * <b>Decision Failure</b>
 * </p>
 * <p>
 * Decisions can fail for several reasons
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ordering of decisions should follow a logical flow. Some decisions might not make sense in the current context of
 * the workflow execution and therefore fails.
 * </p>
 * </li>
 * <li>
 * <p>
 * A limit on your account was reached.
 * </p>
 * </li>
 * <li>
 * <p>
 * The decision lacks sufficient permissions.
 * </p>
 * </li>
 * </ul>
 * <p>
 * One of the following events might be added to the history to indicate an error. The event attribute's
 * <code>cause</code> parameter indicates the cause. If <code>cause</code> is set to
 * <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked sufficient permissions. For details and
 * example IAM policies, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
 * IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ScheduleActivityTaskFailed</code> – A <code>ScheduleActivityTask</code> decision failed. This could happen if
 * the activity type specified in the decision isn't registered, is in a deprecated state, or the decision isn't
 * properly configured.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RequestCancelActivityTaskFailed</code> – A <code>RequestCancelActivityTask</code> decision failed. This could
 * happen if there is no open activity task with the specified activityId.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartTimerFailed</code> – A <code>StartTimer</code> decision failed. This could happen if there is another open
 * timer with the same timerId.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CancelTimerFailed</code> – A <code>CancelTimer</code> decision failed. This could happen if there is no open
 * timer with the specified timerId.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>StartChildWorkflowExecutionFailed</code> – A <code>StartChildWorkflowExecution</code> decision failed. This
 * could happen if the workflow type specified isn't registered, is deprecated, or the decision isn't properly
 * configured.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SignalExternalWorkflowExecutionFailed</code> – A <code>SignalExternalWorkflowExecution</code> decision failed.
 * This could happen if the <code>workflowID</code> specified in the decision was incorrect.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RequestCancelExternalWorkflowExecutionFailed</code> – A <code>RequestCancelExternalWorkflowExecution</code>
 * decision failed. This could happen if the <code>workflowID</code> specified in the decision was incorrect.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CancelWorkflowExecutionFailed</code> – A <code>CancelWorkflowExecution</code> decision failed. This could
 * happen if there is an unhandled decision task pending in the workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CompleteWorkflowExecutionFailed</code> – A <code>CompleteWorkflowExecution</code> decision failed. This could
 * happen if there is an unhandled decision task pending in the workflow execution.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ContinueAsNewWorkflowExecutionFailed</code> – A <code>ContinueAsNewWorkflowExecution</code> decision failed.
 * This could happen if there is an unhandled decision task pending in the workflow execution or the
 * ContinueAsNewWorkflowExecution decision was not configured correctly.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FailWorkflowExecutionFailed</code> – A <code>FailWorkflowExecution</code> decision failed. This could happen if
 * there is an unhandled decision task pending in the workflow execution.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The preceding error events might occur due to an error in the decider logic, which might put the workflow execution
 * in an unstable state The cause field in the event structure for the error event indicates the cause of the error.
 * </p>
 * <note>
 * <p>
 * A workflow execution may be closed by the decider by returning one of the following decisions when completing a
 * decision task: <code>CompleteWorkflowExecution</code>, <code>FailWorkflowExecution</code>,
 * <code>CancelWorkflowExecution</code> and <code>ContinueAsNewWorkflowExecution</code>. An
 * <code>UnhandledDecision</code> fault is returned if a workflow closing decision is specified and a signal or activity
 * event had been added to the history while the decision task was being performed by the decider. Unlike the above
 * situations which are logic issues, this fault is always possible because of race conditions in a distributed system.
 * The right action here is to call <a>RespondDecisionTaskCompleted</a> without any decisions. This would result in
 * another decision task with these new events included in the history. The decider should handle the new events and may
 * decide to close the workflow execution.
 * </p>
 * </note>
 * <p>
 * <b>How to Code a Decision</b>
 * </p>
 * <p>
 * You code a decision by first setting the decision type field to one of the above decision values, and then set the
 * corresponding attributes field shown below:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <a>ScheduleActivityTaskDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>RequestCancelActivityTaskDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>CompleteWorkflowExecutionDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>FailWorkflowExecutionDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>CancelWorkflowExecutionDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>ContinueAsNewWorkflowExecutionDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>RecordMarkerDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>StartTimerDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>CancelTimerDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>SignalExternalWorkflowExecutionDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>RequestCancelExternalWorkflowExecutionDecisionAttributes</a> </code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <a>StartChildWorkflowExecutionDecisionAttributes</a> </code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/Decision" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Decision implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the type of the decision.
     * </p>
     */
    private String decisionType;
    /**
     * <p>
     * Provides the details of the <code>ScheduleActivityTask</code> decision. It isn't set for other decision types.
     * </p>
     */
    private ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>RequestCancelActivityTask</code> decision. It isn't set for other decision
     * types.
     * </p>
     */
    private RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>CompleteWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     */
    private CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>FailWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     */
    private FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>CancelWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     */
    private CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     */
    private ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>RecordMarker</code> decision. It isn't set for other decision types.
     * </p>
     */
    private RecordMarkerDecisionAttributes recordMarkerDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>StartTimer</code> decision. It isn't set for other decision types.
     * </p>
     */
    private StartTimerDecisionAttributes startTimerDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>CancelTimer</code> decision. It isn't set for other decision types.
     * </p>
     */
    private CancelTimerDecisionAttributes cancelTimerDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>SignalExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     */
    private SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     */
    private RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>StartChildWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     */
    private StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes;
    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunction</code> decision. It isn't set for other decision types.
     * </p>
     */
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
        withDecisionType(decisionType);
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
        this.decisionType = decisionType.toString();
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleActivityTask</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param scheduleActivityTaskDecisionAttributes
     *        Provides the details of the <code>ScheduleActivityTask</code> decision. It isn't set for other decision
     *        types.
     */

    public void setScheduleActivityTaskDecisionAttributes(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes) {
        this.scheduleActivityTaskDecisionAttributes = scheduleActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleActivityTask</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @return Provides the details of the <code>ScheduleActivityTask</code> decision. It isn't set for other decision
     *         types.
     */

    public ScheduleActivityTaskDecisionAttributes getScheduleActivityTaskDecisionAttributes() {
        return this.scheduleActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleActivityTask</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param scheduleActivityTaskDecisionAttributes
     *        Provides the details of the <code>ScheduleActivityTask</code> decision. It isn't set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withScheduleActivityTaskDecisionAttributes(ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes) {
        setScheduleActivityTaskDecisionAttributes(scheduleActivityTaskDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>RequestCancelActivityTask</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param requestCancelActivityTaskDecisionAttributes
     *        Provides the details of the <code>RequestCancelActivityTask</code> decision. It isn't set for other
     *        decision types.
     */

    public void setRequestCancelActivityTaskDecisionAttributes(RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes) {
        this.requestCancelActivityTaskDecisionAttributes = requestCancelActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>RequestCancelActivityTask</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @return Provides the details of the <code>RequestCancelActivityTask</code> decision. It isn't set for other
     *         decision types.
     */

    public RequestCancelActivityTaskDecisionAttributes getRequestCancelActivityTaskDecisionAttributes() {
        return this.requestCancelActivityTaskDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>RequestCancelActivityTask</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param requestCancelActivityTaskDecisionAttributes
     *        Provides the details of the <code>RequestCancelActivityTask</code> decision. It isn't set for other
     *        decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withRequestCancelActivityTaskDecisionAttributes(RequestCancelActivityTaskDecisionAttributes requestCancelActivityTaskDecisionAttributes) {
        setRequestCancelActivityTaskDecisionAttributes(requestCancelActivityTaskDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>CompleteWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param completeWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>CompleteWorkflowExecution</code> decision. It isn't set for other
     *        decision types.
     */

    public void setCompleteWorkflowExecutionDecisionAttributes(CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes) {
        this.completeWorkflowExecutionDecisionAttributes = completeWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>CompleteWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @return Provides the details of the <code>CompleteWorkflowExecution</code> decision. It isn't set for other
     *         decision types.
     */

    public CompleteWorkflowExecutionDecisionAttributes getCompleteWorkflowExecutionDecisionAttributes() {
        return this.completeWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>CompleteWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param completeWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>CompleteWorkflowExecution</code> decision. It isn't set for other
     *        decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withCompleteWorkflowExecutionDecisionAttributes(CompleteWorkflowExecutionDecisionAttributes completeWorkflowExecutionDecisionAttributes) {
        setCompleteWorkflowExecutionDecisionAttributes(completeWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>FailWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param failWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>FailWorkflowExecution</code> decision. It isn't set for other decision
     *        types.
     */

    public void setFailWorkflowExecutionDecisionAttributes(FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes) {
        this.failWorkflowExecutionDecisionAttributes = failWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>FailWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @return Provides the details of the <code>FailWorkflowExecution</code> decision. It isn't set for other decision
     *         types.
     */

    public FailWorkflowExecutionDecisionAttributes getFailWorkflowExecutionDecisionAttributes() {
        return this.failWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>FailWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param failWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>FailWorkflowExecution</code> decision. It isn't set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withFailWorkflowExecutionDecisionAttributes(FailWorkflowExecutionDecisionAttributes failWorkflowExecutionDecisionAttributes) {
        setFailWorkflowExecutionDecisionAttributes(failWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>CancelWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param cancelWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>CancelWorkflowExecution</code> decision. It isn't set for other decision
     *        types.
     */

    public void setCancelWorkflowExecutionDecisionAttributes(CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes) {
        this.cancelWorkflowExecutionDecisionAttributes = cancelWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>CancelWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @return Provides the details of the <code>CancelWorkflowExecution</code> decision. It isn't set for other
     *         decision types.
     */

    public CancelWorkflowExecutionDecisionAttributes getCancelWorkflowExecutionDecisionAttributes() {
        return this.cancelWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>CancelWorkflowExecution</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param cancelWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>CancelWorkflowExecution</code> decision. It isn't set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withCancelWorkflowExecutionDecisionAttributes(CancelWorkflowExecutionDecisionAttributes cancelWorkflowExecutionDecisionAttributes) {
        setCancelWorkflowExecutionDecisionAttributes(cancelWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param continueAsNewWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision. It isn't set for other
     *        decision types.
     */

    public void setContinueAsNewWorkflowExecutionDecisionAttributes(
            ContinueAsNewWorkflowExecutionDecisionAttributes continueAsNewWorkflowExecutionDecisionAttributes) {
        this.continueAsNewWorkflowExecutionDecisionAttributes = continueAsNewWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @return Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision. It isn't set for other
     *         decision types.
     */

    public ContinueAsNewWorkflowExecutionDecisionAttributes getContinueAsNewWorkflowExecutionDecisionAttributes() {
        return this.continueAsNewWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param continueAsNewWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>ContinueAsNewWorkflowExecution</code> decision. It isn't set for other
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
     * Provides the details of the <code>RecordMarker</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param recordMarkerDecisionAttributes
     *        Provides the details of the <code>RecordMarker</code> decision. It isn't set for other decision types.
     */

    public void setRecordMarkerDecisionAttributes(RecordMarkerDecisionAttributes recordMarkerDecisionAttributes) {
        this.recordMarkerDecisionAttributes = recordMarkerDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>RecordMarker</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @return Provides the details of the <code>RecordMarker</code> decision. It isn't set for other decision types.
     */

    public RecordMarkerDecisionAttributes getRecordMarkerDecisionAttributes() {
        return this.recordMarkerDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>RecordMarker</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param recordMarkerDecisionAttributes
     *        Provides the details of the <code>RecordMarker</code> decision. It isn't set for other decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withRecordMarkerDecisionAttributes(RecordMarkerDecisionAttributes recordMarkerDecisionAttributes) {
        setRecordMarkerDecisionAttributes(recordMarkerDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>StartTimer</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param startTimerDecisionAttributes
     *        Provides the details of the <code>StartTimer</code> decision. It isn't set for other decision types.
     */

    public void setStartTimerDecisionAttributes(StartTimerDecisionAttributes startTimerDecisionAttributes) {
        this.startTimerDecisionAttributes = startTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>StartTimer</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @return Provides the details of the <code>StartTimer</code> decision. It isn't set for other decision types.
     */

    public StartTimerDecisionAttributes getStartTimerDecisionAttributes() {
        return this.startTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>StartTimer</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param startTimerDecisionAttributes
     *        Provides the details of the <code>StartTimer</code> decision. It isn't set for other decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withStartTimerDecisionAttributes(StartTimerDecisionAttributes startTimerDecisionAttributes) {
        setStartTimerDecisionAttributes(startTimerDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>CancelTimer</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param cancelTimerDecisionAttributes
     *        Provides the details of the <code>CancelTimer</code> decision. It isn't set for other decision types.
     */

    public void setCancelTimerDecisionAttributes(CancelTimerDecisionAttributes cancelTimerDecisionAttributes) {
        this.cancelTimerDecisionAttributes = cancelTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>CancelTimer</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @return Provides the details of the <code>CancelTimer</code> decision. It isn't set for other decision types.
     */

    public CancelTimerDecisionAttributes getCancelTimerDecisionAttributes() {
        return this.cancelTimerDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>CancelTimer</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param cancelTimerDecisionAttributes
     *        Provides the details of the <code>CancelTimer</code> decision. It isn't set for other decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withCancelTimerDecisionAttributes(CancelTimerDecisionAttributes cancelTimerDecisionAttributes) {
        setCancelTimerDecisionAttributes(cancelTimerDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>SignalExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>SignalExternalWorkflowExecution</code> decision. It isn't set for other
     *        decision types.
     */

    public void setSignalExternalWorkflowExecutionDecisionAttributes(
            SignalExternalWorkflowExecutionDecisionAttributes signalExternalWorkflowExecutionDecisionAttributes) {
        this.signalExternalWorkflowExecutionDecisionAttributes = signalExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>SignalExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     * 
     * @return Provides the details of the <code>SignalExternalWorkflowExecution</code> decision. It isn't set for other
     *         decision types.
     */

    public SignalExternalWorkflowExecutionDecisionAttributes getSignalExternalWorkflowExecutionDecisionAttributes() {
        return this.signalExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>SignalExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     * 
     * @param signalExternalWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>SignalExternalWorkflowExecution</code> decision. It isn't set for other
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
     * Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It isn't set for
     *        other decision types.
     */

    public void setRequestCancelExternalWorkflowExecutionDecisionAttributes(
            RequestCancelExternalWorkflowExecutionDecisionAttributes requestCancelExternalWorkflowExecutionDecisionAttributes) {
        this.requestCancelExternalWorkflowExecutionDecisionAttributes = requestCancelExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     * 
     * @return Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It isn't set
     *         for other decision types.
     */

    public RequestCancelExternalWorkflowExecutionDecisionAttributes getRequestCancelExternalWorkflowExecutionDecisionAttributes() {
        return this.requestCancelExternalWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It isn't set for other
     * decision types.
     * </p>
     * 
     * @param requestCancelExternalWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision. It isn't set for
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
     * Provides the details of the <code>StartChildWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param startChildWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>StartChildWorkflowExecution</code> decision. It isn't set for other
     *        decision types.
     */

    public void setStartChildWorkflowExecutionDecisionAttributes(StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes) {
        this.startChildWorkflowExecutionDecisionAttributes = startChildWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>StartChildWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @return Provides the details of the <code>StartChildWorkflowExecution</code> decision. It isn't set for other
     *         decision types.
     */

    public StartChildWorkflowExecutionDecisionAttributes getStartChildWorkflowExecutionDecisionAttributes() {
        return this.startChildWorkflowExecutionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>StartChildWorkflowExecution</code> decision. It isn't set for other decision
     * types.
     * </p>
     * 
     * @param startChildWorkflowExecutionDecisionAttributes
     *        Provides the details of the <code>StartChildWorkflowExecution</code> decision. It isn't set for other
     *        decision types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withStartChildWorkflowExecutionDecisionAttributes(
            StartChildWorkflowExecutionDecisionAttributes startChildWorkflowExecutionDecisionAttributes) {
        setStartChildWorkflowExecutionDecisionAttributes(startChildWorkflowExecutionDecisionAttributes);
        return this;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunction</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param scheduleLambdaFunctionDecisionAttributes
     *        Provides the details of the <code>ScheduleLambdaFunction</code> decision. It isn't set for other decision
     *        types.
     */

    public void setScheduleLambdaFunctionDecisionAttributes(ScheduleLambdaFunctionDecisionAttributes scheduleLambdaFunctionDecisionAttributes) {
        this.scheduleLambdaFunctionDecisionAttributes = scheduleLambdaFunctionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunction</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @return Provides the details of the <code>ScheduleLambdaFunction</code> decision. It isn't set for other decision
     *         types.
     */

    public ScheduleLambdaFunctionDecisionAttributes getScheduleLambdaFunctionDecisionAttributes() {
        return this.scheduleLambdaFunctionDecisionAttributes;
    }

    /**
     * <p>
     * Provides the details of the <code>ScheduleLambdaFunction</code> decision. It isn't set for other decision types.
     * </p>
     * 
     * @param scheduleLambdaFunctionDecisionAttributes
     *        Provides the details of the <code>ScheduleLambdaFunction</code> decision. It isn't set for other decision
     *        types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Decision withScheduleLambdaFunctionDecisionAttributes(ScheduleLambdaFunctionDecisionAttributes scheduleLambdaFunctionDecisionAttributes) {
        setScheduleLambdaFunctionDecisionAttributes(scheduleLambdaFunctionDecisionAttributes);
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
        if (getDecisionType() != null)
            sb.append("DecisionType: ").append(getDecisionType()).append(",");
        if (getScheduleActivityTaskDecisionAttributes() != null)
            sb.append("ScheduleActivityTaskDecisionAttributes: ").append(getScheduleActivityTaskDecisionAttributes()).append(",");
        if (getRequestCancelActivityTaskDecisionAttributes() != null)
            sb.append("RequestCancelActivityTaskDecisionAttributes: ").append(getRequestCancelActivityTaskDecisionAttributes()).append(",");
        if (getCompleteWorkflowExecutionDecisionAttributes() != null)
            sb.append("CompleteWorkflowExecutionDecisionAttributes: ").append(getCompleteWorkflowExecutionDecisionAttributes()).append(",");
        if (getFailWorkflowExecutionDecisionAttributes() != null)
            sb.append("FailWorkflowExecutionDecisionAttributes: ").append(getFailWorkflowExecutionDecisionAttributes()).append(",");
        if (getCancelWorkflowExecutionDecisionAttributes() != null)
            sb.append("CancelWorkflowExecutionDecisionAttributes: ").append(getCancelWorkflowExecutionDecisionAttributes()).append(",");
        if (getContinueAsNewWorkflowExecutionDecisionAttributes() != null)
            sb.append("ContinueAsNewWorkflowExecutionDecisionAttributes: ").append(getContinueAsNewWorkflowExecutionDecisionAttributes()).append(",");
        if (getRecordMarkerDecisionAttributes() != null)
            sb.append("RecordMarkerDecisionAttributes: ").append(getRecordMarkerDecisionAttributes()).append(",");
        if (getStartTimerDecisionAttributes() != null)
            sb.append("StartTimerDecisionAttributes: ").append(getStartTimerDecisionAttributes()).append(",");
        if (getCancelTimerDecisionAttributes() != null)
            sb.append("CancelTimerDecisionAttributes: ").append(getCancelTimerDecisionAttributes()).append(",");
        if (getSignalExternalWorkflowExecutionDecisionAttributes() != null)
            sb.append("SignalExternalWorkflowExecutionDecisionAttributes: ").append(getSignalExternalWorkflowExecutionDecisionAttributes()).append(",");
        if (getRequestCancelExternalWorkflowExecutionDecisionAttributes() != null)
            sb.append("RequestCancelExternalWorkflowExecutionDecisionAttributes: ").append(getRequestCancelExternalWorkflowExecutionDecisionAttributes())
                    .append(",");
        if (getStartChildWorkflowExecutionDecisionAttributes() != null)
            sb.append("StartChildWorkflowExecutionDecisionAttributes: ").append(getStartChildWorkflowExecutionDecisionAttributes()).append(",");
        if (getScheduleLambdaFunctionDecisionAttributes() != null)
            sb.append("ScheduleLambdaFunctionDecisionAttributes: ").append(getScheduleLambdaFunctionDecisionAttributes());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.DecisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
