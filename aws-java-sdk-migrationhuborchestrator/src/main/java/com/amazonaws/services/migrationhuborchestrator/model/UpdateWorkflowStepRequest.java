/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhuborchestrator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStep"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkflowStepRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the step.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the step group.
     * </p>
     */
    private String stepGroupId;
    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The name of the step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the step.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     */
    private String stepActionType;
    /**
     * <p>
     * The custom script to run tests on the source and target environments.
     * </p>
     */
    private WorkflowStepAutomationConfiguration workflowStepAutomationConfiguration;
    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     */
    private java.util.List<String> stepTarget;
    /**
     * <p>
     * The outputs of a step.
     * </p>
     */
    private java.util.List<WorkflowStepOutput> outputs;
    /**
     * <p>
     * The previous step.
     * </p>
     */
    private java.util.List<String> previous;
    /**
     * <p>
     * The next step.
     * </p>
     */
    private java.util.List<String> next;
    /**
     * <p>
     * The status of the step.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the step.
     * </p>
     * 
     * @param id
     *        The ID of the step.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the step.
     * </p>
     * 
     * @return The ID of the step.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the step.
     * </p>
     * 
     * @param id
     *        The ID of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @param stepGroupId
     *        The ID of the step group.
     */

    public void setStepGroupId(String stepGroupId) {
        this.stepGroupId = stepGroupId;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @return The ID of the step group.
     */

    public String getStepGroupId() {
        return this.stepGroupId;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @param stepGroupId
     *        The ID of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withStepGroupId(String stepGroupId) {
        setStepGroupId(stepGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param workflowId
     *        The ID of the migration workflow.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @return The ID of the migration workflow.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     * 
     * @param workflowId
     *        The ID of the migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @return The name of the step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param name
     *        The name of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @param description
     *        The description of the step.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @return The description of the step.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the step.
     * </p>
     * 
     * @param description
     *        The description of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @param stepActionType
     *        The action type of the step. You must run and update the status of a manual step for the workflow to
     *        continue after the completion of the step.
     * @see StepActionType
     */

    public void setStepActionType(String stepActionType) {
        this.stepActionType = stepActionType;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @return The action type of the step. You must run and update the status of a manual step for the workflow to
     *         continue after the completion of the step.
     * @see StepActionType
     */

    public String getStepActionType() {
        return this.stepActionType;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @param stepActionType
     *        The action type of the step. You must run and update the status of a manual step for the workflow to
     *        continue after the completion of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepActionType
     */

    public UpdateWorkflowStepRequest withStepActionType(String stepActionType) {
        setStepActionType(stepActionType);
        return this;
    }

    /**
     * <p>
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     * 
     * @param stepActionType
     *        The action type of the step. You must run and update the status of a manual step for the workflow to
     *        continue after the completion of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepActionType
     */

    public UpdateWorkflowStepRequest withStepActionType(StepActionType stepActionType) {
        this.stepActionType = stepActionType.toString();
        return this;
    }

    /**
     * <p>
     * The custom script to run tests on the source and target environments.
     * </p>
     * 
     * @param workflowStepAutomationConfiguration
     *        The custom script to run tests on the source and target environments.
     */

    public void setWorkflowStepAutomationConfiguration(WorkflowStepAutomationConfiguration workflowStepAutomationConfiguration) {
        this.workflowStepAutomationConfiguration = workflowStepAutomationConfiguration;
    }

    /**
     * <p>
     * The custom script to run tests on the source and target environments.
     * </p>
     * 
     * @return The custom script to run tests on the source and target environments.
     */

    public WorkflowStepAutomationConfiguration getWorkflowStepAutomationConfiguration() {
        return this.workflowStepAutomationConfiguration;
    }

    /**
     * <p>
     * The custom script to run tests on the source and target environments.
     * </p>
     * 
     * @param workflowStepAutomationConfiguration
     *        The custom script to run tests on the source and target environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withWorkflowStepAutomationConfiguration(WorkflowStepAutomationConfiguration workflowStepAutomationConfiguration) {
        setWorkflowStepAutomationConfiguration(workflowStepAutomationConfiguration);
        return this;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @return The servers on which a step will be run.
     */

    public java.util.List<String> getStepTarget() {
        return stepTarget;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @param stepTarget
     *        The servers on which a step will be run.
     */

    public void setStepTarget(java.util.Collection<String> stepTarget) {
        if (stepTarget == null) {
            this.stepTarget = null;
            return;
        }

        this.stepTarget = new java.util.ArrayList<String>(stepTarget);
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepTarget(java.util.Collection)} or {@link #withStepTarget(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stepTarget
     *        The servers on which a step will be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withStepTarget(String... stepTarget) {
        if (this.stepTarget == null) {
            setStepTarget(new java.util.ArrayList<String>(stepTarget.length));
        }
        for (String ele : stepTarget) {
            this.stepTarget.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The servers on which a step will be run.
     * </p>
     * 
     * @param stepTarget
     *        The servers on which a step will be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withStepTarget(java.util.Collection<String> stepTarget) {
        setStepTarget(stepTarget);
        return this;
    }

    /**
     * <p>
     * The outputs of a step.
     * </p>
     * 
     * @return The outputs of a step.
     */

    public java.util.List<WorkflowStepOutput> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The outputs of a step.
     * </p>
     * 
     * @param outputs
     *        The outputs of a step.
     */

    public void setOutputs(java.util.Collection<WorkflowStepOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<WorkflowStepOutput>(outputs);
    }

    /**
     * <p>
     * The outputs of a step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs of a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withOutputs(WorkflowStepOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<WorkflowStepOutput>(outputs.length));
        }
        for (WorkflowStepOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outputs of a step.
     * </p>
     * 
     * @param outputs
     *        The outputs of a step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withOutputs(java.util.Collection<WorkflowStepOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * 
     * @return The previous step.
     */

    public java.util.List<String> getPrevious() {
        return previous;
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * 
     * @param previous
     *        The previous step.
     */

    public void setPrevious(java.util.Collection<String> previous) {
        if (previous == null) {
            this.previous = null;
            return;
        }

        this.previous = new java.util.ArrayList<String>(previous);
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrevious(java.util.Collection)} or {@link #withPrevious(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param previous
     *        The previous step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withPrevious(String... previous) {
        if (this.previous == null) {
            setPrevious(new java.util.ArrayList<String>(previous.length));
        }
        for (String ele : previous) {
            this.previous.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The previous step.
     * </p>
     * 
     * @param previous
     *        The previous step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withPrevious(java.util.Collection<String> previous) {
        setPrevious(previous);
        return this;
    }

    /**
     * <p>
     * The next step.
     * </p>
     * 
     * @return The next step.
     */

    public java.util.List<String> getNext() {
        return next;
    }

    /**
     * <p>
     * The next step.
     * </p>
     * 
     * @param next
     *        The next step.
     */

    public void setNext(java.util.Collection<String> next) {
        if (next == null) {
            this.next = null;
            return;
        }

        this.next = new java.util.ArrayList<String>(next);
    }

    /**
     * <p>
     * The next step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNext(java.util.Collection)} or {@link #withNext(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param next
     *        The next step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withNext(String... next) {
        if (this.next == null) {
            setNext(new java.util.ArrayList<String>(next.length));
        }
        for (String ele : next) {
            this.next.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The next step.
     * </p>
     * 
     * @param next
     *        The next step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkflowStepRequest withNext(java.util.Collection<String> next) {
        setNext(next);
        return this;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @param status
     *        The status of the step.
     * @see StepStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @return The status of the step.
     * @see StepStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @param status
     *        The status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepStatus
     */

    public UpdateWorkflowStepRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the step.
     * </p>
     * 
     * @param status
     *        The status of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepStatus
     */

    public UpdateWorkflowStepRequest withStatus(StepStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStepGroupId() != null)
            sb.append("StepGroupId: ").append(getStepGroupId()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStepActionType() != null)
            sb.append("StepActionType: ").append(getStepActionType()).append(",");
        if (getWorkflowStepAutomationConfiguration() != null)
            sb.append("WorkflowStepAutomationConfiguration: ").append(getWorkflowStepAutomationConfiguration()).append(",");
        if (getStepTarget() != null)
            sb.append("StepTarget: ").append(getStepTarget()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getPrevious() != null)
            sb.append("Previous: ").append(getPrevious()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkflowStepRequest == false)
            return false;
        UpdateWorkflowStepRequest other = (UpdateWorkflowStepRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStepGroupId() == null ^ this.getStepGroupId() == null)
            return false;
        if (other.getStepGroupId() != null && other.getStepGroupId().equals(this.getStepGroupId()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStepActionType() == null ^ this.getStepActionType() == null)
            return false;
        if (other.getStepActionType() != null && other.getStepActionType().equals(this.getStepActionType()) == false)
            return false;
        if (other.getWorkflowStepAutomationConfiguration() == null ^ this.getWorkflowStepAutomationConfiguration() == null)
            return false;
        if (other.getWorkflowStepAutomationConfiguration() != null
                && other.getWorkflowStepAutomationConfiguration().equals(this.getWorkflowStepAutomationConfiguration()) == false)
            return false;
        if (other.getStepTarget() == null ^ this.getStepTarget() == null)
            return false;
        if (other.getStepTarget() != null && other.getStepTarget().equals(this.getStepTarget()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getPrevious() == null ^ this.getPrevious() == null)
            return false;
        if (other.getPrevious() != null && other.getPrevious().equals(this.getPrevious()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStepGroupId() == null) ? 0 : getStepGroupId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStepActionType() == null) ? 0 : getStepActionType().hashCode());
        hashCode = prime * hashCode + ((getWorkflowStepAutomationConfiguration() == null) ? 0 : getWorkflowStepAutomationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStepTarget() == null) ? 0 : getStepTarget().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkflowStepRequest clone() {
        return (UpdateWorkflowStepRequest) super.clone();
    }

}
