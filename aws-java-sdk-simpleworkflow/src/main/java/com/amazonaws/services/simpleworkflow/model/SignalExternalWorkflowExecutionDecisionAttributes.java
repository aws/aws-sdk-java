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
 * Provides details of the <code>SignalExternalWorkflowExecution</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
 * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a>.
 * </p>
 */
public class SignalExternalWorkflowExecutionDecisionAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution to be signaled.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The <code>runId</code> of the workflow execution to be signaled.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * <b>Required.</b> The name of the signal.The target workflow execution will use the signal name and input to
     * process the signal.
     * </p>
     */
    private String signalName;
    /**
     * <p>
     * <i>Optional.</i> Input data to be provided with the signal. The target workflow execution will use the signal
     * name and input data to process the signal.
     * </p>
     */
    private String input;
    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     */
    private String control;

    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution to be signaled.
     * </p>
     * 
     * @param workflowId
     *        Required.</b> The <code>workflowId
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution to be signaled.
     * </p>
     * 
     * @return Required.</b> The <code>workflowId
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * <b>Required.</b> The <code>workflowId</code> of the workflow execution to be signaled.
     * </p>
     * 
     * @param workflowId
     *        Required.</b> The <code>workflowId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionDecisionAttributes withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The <code>runId</code> of the workflow execution to be signaled.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the workflow execution to be signaled.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the workflow execution to be signaled.
     * </p>
     * 
     * @return The <code>runId</code> of the workflow execution to be signaled.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the workflow execution to be signaled.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the workflow execution to be signaled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionDecisionAttributes withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * <b>Required.</b> The name of the signal.The target workflow execution will use the signal name and input to
     * process the signal.
     * </p>
     * 
     * @param signalName
     *        Required.
     */

    public void setSignalName(String signalName) {
        this.signalName = signalName;
    }

    /**
     * <p>
     * <b>Required.</b> The name of the signal.The target workflow execution will use the signal name and input to
     * process the signal.
     * </p>
     * 
     * @return Required.
     */

    public String getSignalName() {
        return this.signalName;
    }

    /**
     * <p>
     * <b>Required.</b> The name of the signal.The target workflow execution will use the signal name and input to
     * process the signal.
     * </p>
     * 
     * @param signalName
     *        Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionDecisionAttributes withSignalName(String signalName) {
        setSignalName(signalName);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> Input data to be provided with the signal. The target workflow execution will use the signal
     * name and input data to process the signal.
     * </p>
     * 
     * @param input
     *        Optional.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * <i>Optional.</i> Input data to be provided with the signal. The target workflow execution will use the signal
     * name and input data to process the signal.
     * </p>
     * 
     * @return Optional.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * <i>Optional.</i> Input data to be provided with the signal. The target workflow execution will use the signal
     * name and input data to process the signal.
     * </p>
     * 
     * @param input
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionDecisionAttributes withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent decision tasks.
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
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @return Optional.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * <i>Optional.</i> Data attached to the event that can be used by the decider in subsequent decision tasks.
     * </p>
     * 
     * @param control
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalExternalWorkflowExecutionDecisionAttributes withControl(String control) {
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

        if (obj instanceof SignalExternalWorkflowExecutionDecisionAttributes == false)
            return false;
        SignalExternalWorkflowExecutionDecisionAttributes other = (SignalExternalWorkflowExecutionDecisionAttributes) obj;
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
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        return hashCode;
    }

    @Override
    public SignalExternalWorkflowExecutionDecisionAttributes clone() {
        try {
            return (SignalExternalWorkflowExecutionDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
