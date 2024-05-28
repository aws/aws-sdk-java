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
 * Contains runtime details for an instance of a workflow that ran for the associated image build version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/WorkflowStepExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Uniquely identifies the workflow step that ran for the associated image build version.
     * </p>
     */
    private String stepExecutionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that ran the workflow.
     * </p>
     */
    private String imageBuildVersionArn;
    /**
     * <p>
     * Uniquely identifies the runtime instance of the workflow that contains the workflow step that ran for the
     * associated image build version.
     * </p>
     */
    private String workflowExecutionId;
    /**
     * <p>
     * The ARN of the workflow resource that ran.
     * </p>
     */
    private String workflowBuildVersionArn;
    /**
     * <p>
     * The name of the workflow step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the step action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The timestamp when the workflow step started.
     * </p>
     */
    private String startTime;

    /**
     * <p>
     * Uniquely identifies the workflow step that ran for the associated image build version.
     * </p>
     * 
     * @param stepExecutionId
     *        Uniquely identifies the workflow step that ran for the associated image build version.
     */

    public void setStepExecutionId(String stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    /**
     * <p>
     * Uniquely identifies the workflow step that ran for the associated image build version.
     * </p>
     * 
     * @return Uniquely identifies the workflow step that ran for the associated image build version.
     */

    public String getStepExecutionId() {
        return this.stepExecutionId;
    }

    /**
     * <p>
     * Uniquely identifies the workflow step that ran for the associated image build version.
     * </p>
     * 
     * @param stepExecutionId
     *        Uniquely identifies the workflow step that ran for the associated image build version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepExecution withStepExecutionId(String stepExecutionId) {
        setStepExecutionId(stepExecutionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that ran the workflow.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version that ran the workflow.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that ran the workflow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image build version that ran the workflow.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image build version that ran the workflow.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image build version that ran the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepExecution withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
        return this;
    }

    /**
     * <p>
     * Uniquely identifies the runtime instance of the workflow that contains the workflow step that ran for the
     * associated image build version.
     * </p>
     * 
     * @param workflowExecutionId
     *        Uniquely identifies the runtime instance of the workflow that contains the workflow step that ran for the
     *        associated image build version.
     */

    public void setWorkflowExecutionId(String workflowExecutionId) {
        this.workflowExecutionId = workflowExecutionId;
    }

    /**
     * <p>
     * Uniquely identifies the runtime instance of the workflow that contains the workflow step that ran for the
     * associated image build version.
     * </p>
     * 
     * @return Uniquely identifies the runtime instance of the workflow that contains the workflow step that ran for the
     *         associated image build version.
     */

    public String getWorkflowExecutionId() {
        return this.workflowExecutionId;
    }

    /**
     * <p>
     * Uniquely identifies the runtime instance of the workflow that contains the workflow step that ran for the
     * associated image build version.
     * </p>
     * 
     * @param workflowExecutionId
     *        Uniquely identifies the runtime instance of the workflow that contains the workflow step that ran for the
     *        associated image build version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepExecution withWorkflowExecutionId(String workflowExecutionId) {
        setWorkflowExecutionId(workflowExecutionId);
        return this;
    }

    /**
     * <p>
     * The ARN of the workflow resource that ran.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The ARN of the workflow resource that ran.
     */

    public void setWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        this.workflowBuildVersionArn = workflowBuildVersionArn;
    }

    /**
     * <p>
     * The ARN of the workflow resource that ran.
     * </p>
     * 
     * @return The ARN of the workflow resource that ran.
     */

    public String getWorkflowBuildVersionArn() {
        return this.workflowBuildVersionArn;
    }

    /**
     * <p>
     * The ARN of the workflow resource that ran.
     * </p>
     * 
     * @param workflowBuildVersionArn
     *        The ARN of the workflow resource that ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepExecution withWorkflowBuildVersionArn(String workflowBuildVersionArn) {
        setWorkflowBuildVersionArn(workflowBuildVersionArn);
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

    public WorkflowStepExecution withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the step action.
     * </p>
     * 
     * @param action
     *        The name of the step action.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The name of the step action.
     * </p>
     * 
     * @return The name of the step action.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The name of the step action.
     * </p>
     * 
     * @param action
     *        The name of the step action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkflowStepExecution withAction(String action) {
        setAction(action);
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

    public WorkflowStepExecution withStartTime(String startTime) {
        setStartTime(startTime);
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
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn()).append(",");
        if (getWorkflowExecutionId() != null)
            sb.append("WorkflowExecutionId: ").append(getWorkflowExecutionId()).append(",");
        if (getWorkflowBuildVersionArn() != null)
            sb.append("WorkflowBuildVersionArn: ").append(getWorkflowBuildVersionArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkflowStepExecution == false)
            return false;
        WorkflowStepExecution other = (WorkflowStepExecution) obj;
        if (other.getStepExecutionId() == null ^ this.getStepExecutionId() == null)
            return false;
        if (other.getStepExecutionId() != null && other.getStepExecutionId().equals(this.getStepExecutionId()) == false)
            return false;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
            return false;
        if (other.getWorkflowExecutionId() == null ^ this.getWorkflowExecutionId() == null)
            return false;
        if (other.getWorkflowExecutionId() != null && other.getWorkflowExecutionId().equals(this.getWorkflowExecutionId()) == false)
            return false;
        if (other.getWorkflowBuildVersionArn() == null ^ this.getWorkflowBuildVersionArn() == null)
            return false;
        if (other.getWorkflowBuildVersionArn() != null && other.getWorkflowBuildVersionArn().equals(this.getWorkflowBuildVersionArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepExecutionId() == null) ? 0 : getStepExecutionId().hashCode());
        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getWorkflowExecutionId() == null) ? 0 : getWorkflowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowBuildVersionArn() == null) ? 0 : getWorkflowBuildVersionArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public WorkflowStepExecution clone() {
        try {
            return (WorkflowStepExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.WorkflowStepExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
