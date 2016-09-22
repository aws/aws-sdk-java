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
 * Provides details of the <code>SignalExternalWorkflowExecutionInitiated</code> event.
 * </p>
 */
public class SignalExternalWorkflowExecutionInitiatedEventAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to send the signal to.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The name of the signal.
     * </p>
     */
    private String signalName;
    /**
     * <p>
     * Input provided to the signal (if any).
     * </p>
     */
    private String input;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;
    /**
     * <p>
     * <i>Optional.</i> data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     */
    private String control;

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution.
     * </p>
     * 
     * @param workflowId
     *        The <code>workflowId</code> of the external workflow execution.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution.
     * </p>
     * 
     * @return The <code>workflowId</code> of the external workflow execution.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution.
     * </p>
     * 
     * @param workflowId
     *        The <code>workflowId</code> of the external workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to send the signal to.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the external workflow execution to send the signal to.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to send the signal to.
     * </p>
     * 
     * @return The <code>runId</code> of the external workflow execution to send the signal to.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to send the signal to.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the external workflow execution to send the signal to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @param signalName
     *        The name of the signal.
     */

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @return The name of the signal.
     */

    public String getSignalName() {
        return this.signalName;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @param signalName
     *        The name of the signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes withSignalName(String signalName) {
        setSignalName(signalName);
        return this;
    }

    /**
     * <p>
     * Input provided to the signal (if any).
     * </p>
     * 
     * @param input
     *        Input provided to the signal (if any).
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * Input provided to the signal (if any).
     * </p>
     * 
     * @return Input provided to the signal (if any).
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * Input provided to the signal (if any).
     * </p>
     * 
     * @param input
     *        Input provided to the signal (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful
     *        for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted
     *         in the <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be
     *         useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>SignalExternalWorkflowExecution</code> decision for this signal. This information can be useful
     *        for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @param control
     *        Optional.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * <i>Optional.</i> data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @return Optional.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * <i>Optional.</i> data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @param control
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes withControl(String control) {
        setControl(control);
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getRunId() != null)
            sb.append("RunId: " + getRunId() + ",");
        if (getSignalName() != null)
            sb.append("SignalName: " + getSignalName() + ",");
        if (getInput() != null)
            sb.append("Input: " + getInput() + ",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() + ",");
        if (getControl() != null)
            sb.append("Control: " + getControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignalExternalWorkflowExecutionInitiatedEventAttributes == false)
            return false;
        SignalExternalWorkflowExecutionInitiatedEventAttributes other = (SignalExternalWorkflowExecutionInitiatedEventAttributes) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getSignalName() == null ^ this.getSignalName() == null)
            return false;
        if (other.getSignalName() != null && other.getSignalName().equals(this.getSignalName()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getSignalName() == null) ? 0 : getSignalName().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        return hashCode;
    }

    @Override
    public SignalExternalWorkflowExecutionInitiatedEventAttributes clone() {
        try {
            return (SignalExternalWorkflowExecutionInitiatedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
