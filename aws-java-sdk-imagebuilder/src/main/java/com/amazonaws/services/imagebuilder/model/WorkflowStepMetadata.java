/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Runtime details and status for the workflow step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/WorkflowStepMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the workflow step, assigned at runtime.
     * </p>
     */
    private String stepExecutionId;
    /**
     * <p>
     * The name of the workflow step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the workflow step.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The step action name.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Runtime status for the workflow step.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Reports on the rollback status of the step, if applicable.
     * </p>
     */
    private String rollbackStatus;
    /**
     * <p>
     * Detailed output message that the workflow step provides at runtime.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Input parameters that Image Builder provides for the workflow step.
     * </p>
     */
    private String inputs;
    /**
     * <p>
     * The file names that the workflow step created as output for this runtime instance of the workflow.
     * </p>
     */
    private String outputs;
    /**
     * <p>
     * The timestamp when the workflow step started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The timestamp when the workflow step finished.
     * </p>
     */
    private String endTime;

    /**
     * <p>
     * A unique identifier for the workflow step, assigned at runtime.
     * </p>
     * 
     * @param stepExecutionId
     *        A unique identifier for the workflow step, assigned at runtime.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * A unique identifier for the workflow step, assigned at runtime.
     * </p>
     * 
     * @return A unique identifier for the workflow step, assigned at runtime.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * A unique identifier for the workflow step, assigned at runtime.
     * </p>
     * 
     * @param stepExecutionId
     *        A unique identifier for the workflow step, assigned at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
        return this;
    }

    /**
     * <p>
     * The name of the workflow step.
     * </p>
     * 
     * @param name
     *        The name of the workflow step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workflow step.
     * </p>
     * 
     * @return The name of the workflow step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workflow step.
     * </p>
     * 
     * @param name
     *        The name of the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the workflow step.
     * </p>
     * 
     * @param description
     *        Description of the workflow step.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the workflow step.
     * </p>
     * 
     * @return Description of the workflow step.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the workflow step.
     * </p>
     * 
     * @param description
     *        Description of the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The step action name.
     * </p>
     * 
     * @param action
     *        The step action name.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The step action name.
     * </p>
     * 
     * @return The step action name.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The step action name.
     * </p>
     * 
     * @param action
     *        The step action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Runtime status for the workflow step.
     * </p>
     * 
     * @param status
     *        Runtime status for the workflow step.
     * @see WorkflowStepExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Runtime status for the workflow step.
     * </p>
     * 
     * @return Runtime status for the workflow step.
     * @see WorkflowStepExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Runtime status for the workflow step.
     * </p>
     * 
     * @param status
     *        Runtime status for the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionStatus
     */

    public WorkflowStepMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Runtime status for the workflow step.
     * </p>
     * 
     * @param status
     *        Runtime status for the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionStatus
     */

    public WorkflowStepMetadata withStatus(WorkflowStepExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Reports on the rollback status of the step, if applicable.
     * </p>
     * 
     * @param rollbackStatus
     *        Reports on the rollback status of the step, if applicable.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public void setRollbackStatus(String rollbackStatus) {
        this.rollbackStatus = rollbackStatus;
    }

    /**
     * <p>
     * Reports on the rollback status of the step, if applicable.
     * </p>
     * 
     * @return Reports on the rollback status of the step, if applicable.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public String getRollbackStatus() {
        return this.rollbackStatus;
    }

    /**
     * <p>
     * Reports on the rollback status of the step, if applicable.
     * </p>
     * 
     * @param rollbackStatus
     *        Reports on the rollback status of the step, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public WorkflowStepMetadata withRollbackStatus(String rollbackStatus) {
        setRollbackStatus(rollbackStatus);
        return this;
    }

    /**
     * <p>
     * Reports on the rollback status of the step, if applicable.
     * </p>
     * 
     * @param rollbackStatus
     *        Reports on the rollback status of the step, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowStepExecutionRollbackStatus
     */

    public WorkflowStepMetadata withRollbackStatus(WorkflowStepExecutionRollbackStatus rollbackStatus) {
        this.rollbackStatus = rollbackStatus.toString();
        return this;
    }

    /**
     * <p>
     * Detailed output message that the workflow step provides at runtime.
     * </p>
     * 
     * @param message
     *        Detailed output message that the workflow step provides at runtime.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Detailed output message that the workflow step provides at runtime.
     * </p>
     * 
     * @return Detailed output message that the workflow step provides at runtime.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Detailed output message that the workflow step provides at runtime.
     * </p>
     * 
     * @param message
     *        Detailed output message that the workflow step provides at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Input parameters that Image Builder provides for the workflow step.
     * </p>
     * 
     * @param inputs
     *        Input parameters that Image Builder provides for the workflow step.
     */

    public void setInputs(String inputs) {
        this.inputs = inputs;
    }

    /**
     * <p>
     * Input parameters that Image Builder provides for the workflow step.
     * </p>
     * 
     * @return Input parameters that Image Builder provides for the workflow step.
     */

    public String getInputs() {
        return this.inputs;
    }

    /**
     * <p>
     * Input parameters that Image Builder provides for the workflow step.
     * </p>
     * 
     * @param inputs
     *        Input parameters that Image Builder provides for the workflow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withInputs(String inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The file names that the workflow step created as output for this runtime instance of the workflow.
     * </p>
     * 
     * @param outputs
     *        The file names that the workflow step created as output for this runtime instance of the workflow.
     */

    public void setOutputs(String outputs) {
        this.outputs = outputs;
    }

    /**
     * <p>
     * The file names that the workflow step created as output for this runtime instance of the workflow.
     * </p>
     * 
     * @return The file names that the workflow step created as output for this runtime instance of the workflow.
     */

    public String getOutputs() {
        return this.outputs;
    }

    /**
     * <p>
     * The file names that the workflow step created as output for this runtime instance of the workflow.
     * </p>
     * 
     * @param outputs
     *        The file names that the workflow step created as output for this runtime instance of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withOutputs(String outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The timestamp when the workflow step started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the workflow step started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when the workflow step started.
     * </p>
     * 
     * @return The timestamp when the workflow step started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when the workflow step started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the workflow step started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when the workflow step finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the workflow step finished.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when the workflow step finished.
     * </p>
     * 
     * @return The timestamp when the workflow step finished.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when the workflow step finished.
     * </p>
     * 
     * @param endTime
     *        The timestamp when the workflow step finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepMetadata withEndTime(String endTime) {
        setEndTime(endTime);
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
        if (getStepExecutionId() != null)
            sb.append("StepExecutionId: ").append(getStepExecutionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRollbackStatus() != null)
            sb.append("RollbackStatus: ").append(getRollbackStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowStepMetadata == false)
            return false;
        WorkflowStepMetadata other = (WorkflowStepMetadata) obj;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRollbackStatus() == null ^ this.getRollbackStatus() == null)
            return false;
        if (other.getRollbackStatus() != null && other.getRollbackStatus().equals(this.getRollbackStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRollbackStatus() == null) ? 0 : getRollbackStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowStepMetadata clone() {
        try {
            return (WorkflowStepMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.WorkflowStepMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
