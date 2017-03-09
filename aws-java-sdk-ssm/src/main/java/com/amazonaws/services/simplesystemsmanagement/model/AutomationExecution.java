/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the current state of an individual Automation execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AutomationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution ID.
     * </p>
     */
    private String automationExecutionId;
    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The time the execution started.
     * </p>
     */
    private java.util.Date executionStartTime;
    /**
     * <p>
     * The time the execution finished.
     * </p>
     */
    private java.util.Date executionEndTime;
    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     */
    private String automationExecutionStatus;
    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are executed in order.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StepExecution> stepExecutions;
    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling <code>StartAutomationExecution</code>
     * .
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> outputs;
    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     */
    private String failureMessage;

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param automationExecutionId
     *        The execution ID.
     */

    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @return The execution ID.
     */

    public String getAutomationExecutionId() {
        return this.automationExecutionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param automationExecutionId
     *        The execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withAutomationExecutionId(String automationExecutionId) {
        setAutomationExecutionId(automationExecutionId);
        return this;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document used during the execution.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * 
     * @return The name of the Automation document used during the execution.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the Automation document used during the execution.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation document used during the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document to use during execution.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * 
     * @return The version of the document to use during execution.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the document to use during execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of the document to use during execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @param executionStartTime
     *        The time the execution started.
     */

    public void setExecutionStartTime(java.util.Date executionStartTime) {
        this.executionStartTime = executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @return The time the execution started.
     */

    public java.util.Date getExecutionStartTime() {
        return this.executionStartTime;
    }

    /**
     * <p>
     * The time the execution started.
     * </p>
     * 
     * @param executionStartTime
     *        The time the execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withExecutionStartTime(java.util.Date executionStartTime) {
        setExecutionStartTime(executionStartTime);
        return this;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     * 
     * @param executionEndTime
     *        The time the execution finished.
     */

    public void setExecutionEndTime(java.util.Date executionEndTime) {
        this.executionEndTime = executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     * 
     * @return The time the execution finished.
     */

    public java.util.Date getExecutionEndTime() {
        return this.executionEndTime;
    }

    /**
     * <p>
     * The time the execution finished.
     * </p>
     * 
     * @param executionEndTime
     *        The time the execution finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withExecutionEndTime(java.util.Date executionEndTime) {
        setExecutionEndTime(executionEndTime);
        return this;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @see AutomationExecutionStatus
     */

    public void setAutomationExecutionStatus(String automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @return The execution status of the Automation.
     * @see AutomationExecutionStatus
     */

    public String getAutomationExecutionStatus() {
        return this.automationExecutionStatus;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public AutomationExecution withAutomationExecutionStatus(String automationExecutionStatus) {
        setAutomationExecutionStatus(automationExecutionStatus);
        return this;
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @see AutomationExecutionStatus
     */

    public void setAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        this.automationExecutionStatus = automationExecutionStatus.toString();
    }

    /**
     * <p>
     * The execution status of the Automation.
     * </p>
     * 
     * @param automationExecutionStatus
     *        The execution status of the Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationExecutionStatus
     */

    public AutomationExecution withAutomationExecutionStatus(AutomationExecutionStatus automationExecutionStatus) {
        setAutomationExecutionStatus(automationExecutionStatus);
        return this;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are executed in order.
     * </p>
     * 
     * @return A list of details about the current state of all steps that comprise an execution. An Automation document
     *         contains a list of steps that are executed in order.
     */

    public java.util.List<StepExecution> getStepExecutions() {
        if (stepExecutions == null) {
            stepExecutions = new com.amazonaws.internal.SdkInternalList<StepExecution>();
        }
        return stepExecutions;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are executed in order.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that comprise an execution. An Automation document
     *        contains a list of steps that are executed in order.
     */

    public void setStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        if (stepExecutions == null) {
            this.stepExecutions = null;
            return;
        }

        this.stepExecutions = new com.amazonaws.internal.SdkInternalList<StepExecution>(stepExecutions);
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are executed in order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepExecutions(java.util.Collection)} or {@link #withStepExecutions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that comprise an execution. An Automation document
     *        contains a list of steps that are executed in order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withStepExecutions(StepExecution... stepExecutions) {
        if (this.stepExecutions == null) {
            setStepExecutions(new com.amazonaws.internal.SdkInternalList<StepExecution>(stepExecutions.length));
        }
        for (StepExecution ele : stepExecutions) {
            this.stepExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of details about the current state of all steps that comprise an execution. An Automation document
     * contains a list of steps that are executed in order.
     * </p>
     * 
     * @param stepExecutions
     *        A list of details about the current state of all steps that comprise an execution. An Automation document
     *        contains a list of steps that are executed in order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withStepExecutions(java.util.Collection<StepExecution> stepExecutions) {
        setStepExecutions(stepExecutions);
        return this;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling <code>StartAutomationExecution</code>
     * .
     * </p>
     * 
     * @return The key-value map of execution parameters, which were supplied when calling
     *         <code>StartAutomationExecution</code>.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling <code>StartAutomationExecution</code>
     * .
     * </p>
     * 
     * @param parameters
     *        The key-value map of execution parameters, which were supplied when calling
     *        <code>StartAutomationExecution</code>.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling <code>StartAutomationExecution</code>
     * .
     * </p>
     * 
     * @param parameters
     *        The key-value map of execution parameters, which were supplied when calling
     *        <code>StartAutomationExecution</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public AutomationExecution addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * 
     * @return The list of execution outputs as defined in the automation document.
     */

    public java.util.Map<String, java.util.List<String>> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * 
     * @param outputs
     *        The list of execution outputs as defined in the automation document.
     */

    public void setOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The list of execution outputs as defined in the automation document.
     * </p>
     * 
     * @param outputs
     *        The list of execution outputs as defined in the automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withOutputs(java.util.Map<String, java.util.List<String>> outputs) {
        setOutputs(outputs);
        return this;
    }

    public AutomationExecution addOutputsEntry(String key, java.util.List<String> value) {
        if (null == this.outputs) {
            this.outputs = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.outputs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.outputs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Outputs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution clearOutputsEntries() {
        this.outputs = null;
        return this;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     * 
     * @param failureMessage
     *        A message describing why an execution has failed, if the status is set to Failed.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     * 
     * @return A message describing why an execution has failed, if the status is set to Failed.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * A message describing why an execution has failed, if the status is set to Failed.
     * </p>
     * 
     * @param failureMessage
     *        A message describing why an execution has failed, if the status is set to Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: ").append(getAutomationExecutionId()).append(",");
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getExecutionStartTime() != null)
            sb.append("ExecutionStartTime: ").append(getExecutionStartTime()).append(",");
        if (getExecutionEndTime() != null)
            sb.append("ExecutionEndTime: ").append(getExecutionEndTime()).append(",");
        if (getAutomationExecutionStatus() != null)
            sb.append("AutomationExecutionStatus: ").append(getAutomationExecutionStatus()).append(",");
        if (getStepExecutions() != null)
            sb.append("StepExecutions: ").append(getStepExecutions()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationExecution == false)
            return false;
        AutomationExecution other = (AutomationExecution) obj;
        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getExecutionStartTime() == null ^ this.getExecutionStartTime() == null)
            return false;
        if (other.getExecutionStartTime() != null && other.getExecutionStartTime().equals(this.getExecutionStartTime()) == false)
            return false;
        if (other.getExecutionEndTime() == null ^ this.getExecutionEndTime() == null)
            return false;
        if (other.getExecutionEndTime() != null && other.getExecutionEndTime().equals(this.getExecutionEndTime()) == false)
            return false;
        if (other.getAutomationExecutionStatus() == null ^ this.getAutomationExecutionStatus() == null)
            return false;
        if (other.getAutomationExecutionStatus() != null && other.getAutomationExecutionStatus().equals(this.getAutomationExecutionStatus()) == false)
            return false;
        if (other.getStepExecutions() == null ^ this.getStepExecutions() == null)
            return false;
        if (other.getStepExecutions() != null && other.getStepExecutions().equals(this.getStepExecutions()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartTime() == null) ? 0 : getExecutionStartTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionEndTime() == null) ? 0 : getExecutionEndTime().hashCode());
        hashCode = prime * hashCode + ((getAutomationExecutionStatus() == null) ? 0 : getAutomationExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getStepExecutions() == null) ? 0 : getStepExecutions().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public AutomationExecution clone() {
        try {
            return (AutomationExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AutomationExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
