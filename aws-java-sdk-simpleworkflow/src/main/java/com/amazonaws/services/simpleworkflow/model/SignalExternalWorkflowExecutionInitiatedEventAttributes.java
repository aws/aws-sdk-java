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
 * Provides the details of the <code>SignalExternalWorkflowExecutionInitiated</code> event.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/SignalExternalWorkflowExecutionInitiatedEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalExternalWorkflowExecutionInitiatedEventAttributes implements Serializable, Cloneable, StructuredPojo {

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
     * The input provided to the signal.
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
     * Data attached to the event that can be used by the decider in subsequent decision tasks.
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
     * The input provided to the signal.
     * </p>
     * 
     * @param input
     *        The input provided to the signal.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The input provided to the signal.
     * </p>
     * 
     * @return The input provided to the signal.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The input provided to the signal.
     * </p>
     * 
     * @param input
     *        The input provided to the signal.
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
     * Data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @param control
     *        Data attached to the event that can be used by the decider in subsequent decision tasks.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * Data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @return Data attached to the event that can be used by the decider in subsequent decision tasks.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * Data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @param control
     *        Data attached to the event that can be used by the decider in subsequent decision tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionInitiatedEventAttributes withControl(String control) {
        setControl(control);
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getSignalName() != null)
            sb.append("SignalName: ").append(getSignalName()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.SignalExternalWorkflowExecutionInitiatedEventAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
