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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetTemplateStep"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateStepResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The ID of the template.
     * </p>
     */
    private String templateId;
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
     * The time at which the step was created.
     * </p>
     */
    private String creationTime;
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
     * The outputs of the step.
     * </p>
     */
    private java.util.List<StepOutput> outputs;
    /**
     * <p>
     * The custom script to run tests on source or target environments.
     * </p>
     */
    private StepAutomationConfiguration stepAutomationConfiguration;

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

    public GetTemplateStepResult withId(String id) {
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

    public GetTemplateStepResult withStepGroupId(String stepGroupId) {
        setStepGroupId(stepGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     */

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @return The ID of the template.
     */

    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * <p>
     * The ID of the template.
     * </p>
     * 
     * @param templateId
     *        The ID of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateStepResult withTemplateId(String templateId) {
        setTemplateId(templateId);
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

    public GetTemplateStepResult withName(String name) {
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

    public GetTemplateStepResult withDescription(String description) {
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

    public GetTemplateStepResult withStepActionType(String stepActionType) {
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

    public GetTemplateStepResult withStepActionType(StepActionType stepActionType) {
        this.stepActionType = stepActionType.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the step was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the step was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the step was created.
     * </p>
     * 
     * @return The time at which the step was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the step was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the step was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateStepResult withCreationTime(String creationTime) {
        setCreationTime(creationTime);
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

    public GetTemplateStepResult withPrevious(String... previous) {
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

    public GetTemplateStepResult withPrevious(java.util.Collection<String> previous) {
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

    public GetTemplateStepResult withNext(String... next) {
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

    public GetTemplateStepResult withNext(java.util.Collection<String> next) {
        setNext(next);
        return this;
    }

    /**
     * <p>
     * The outputs of the step.
     * </p>
     * 
     * @return The outputs of the step.
     */

    public java.util.List<StepOutput> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * The outputs of the step.
     * </p>
     * 
     * @param outputs
     *        The outputs of the step.
     */

    public void setOutputs(java.util.Collection<StepOutput> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<StepOutput>(outputs);
    }

    /**
     * <p>
     * The outputs of the step.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        The outputs of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateStepResult withOutputs(StepOutput... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<StepOutput>(outputs.length));
        }
        for (StepOutput ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outputs of the step.
     * </p>
     * 
     * @param outputs
     *        The outputs of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateStepResult withOutputs(java.util.Collection<StepOutput> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The custom script to run tests on source or target environments.
     * </p>
     * 
     * @param stepAutomationConfiguration
     *        The custom script to run tests on source or target environments.
     */

    public void setStepAutomationConfiguration(StepAutomationConfiguration stepAutomationConfiguration) {
        this.stepAutomationConfiguration = stepAutomationConfiguration;
    }

    /**
     * <p>
     * The custom script to run tests on source or target environments.
     * </p>
     * 
     * @return The custom script to run tests on source or target environments.
     */

    public StepAutomationConfiguration getStepAutomationConfiguration() {
        return this.stepAutomationConfiguration;
    }

    /**
     * <p>
     * The custom script to run tests on source or target environments.
     * </p>
     * 
     * @param stepAutomationConfiguration
     *        The custom script to run tests on source or target environments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemplateStepResult withStepAutomationConfiguration(StepAutomationConfiguration stepAutomationConfiguration) {
        setStepAutomationConfiguration(stepAutomationConfiguration);
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
        if (getTemplateId() != null)
            sb.append("TemplateId: ").append(getTemplateId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStepActionType() != null)
            sb.append("StepActionType: ").append(getStepActionType()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getPrevious() != null)
            sb.append("Previous: ").append(getPrevious()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getStepAutomationConfiguration() != null)
            sb.append("StepAutomationConfiguration: ").append(getStepAutomationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateStepResult == false)
            return false;
        GetTemplateStepResult other = (GetTemplateStepResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStepGroupId() == null ^ this.getStepGroupId() == null)
            return false;
        if (other.getStepGroupId() != null && other.getStepGroupId().equals(this.getStepGroupId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null && other.getTemplateId().equals(this.getTemplateId()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getPrevious() == null ^ this.getPrevious() == null)
            return false;
        if (other.getPrevious() != null && other.getPrevious().equals(this.getPrevious()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getStepAutomationConfiguration() == null ^ this.getStepAutomationConfiguration() == null)
            return false;
        if (other.getStepAutomationConfiguration() != null && other.getStepAutomationConfiguration().equals(this.getStepAutomationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStepGroupId() == null) ? 0 : getStepGroupId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStepActionType() == null) ? 0 : getStepActionType().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getStepAutomationConfiguration() == null) ? 0 : getStepAutomationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateStepResult clone() {
        try {
            return (GetTemplateStepResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
