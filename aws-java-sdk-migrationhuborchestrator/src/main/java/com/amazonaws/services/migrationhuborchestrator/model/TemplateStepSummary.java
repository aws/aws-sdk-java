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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/TemplateStepSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateStepSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The action type of the step. You must run and update the status of a manual step for the workflow to continue
     * after the completion of the step.
     * </p>
     */
    private String stepActionType;
    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * The owner of the step.
     * </p>
     */
    private String owner;
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

    public TemplateStepSummary withId(String id) {
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

    public TemplateStepSummary withStepGroupId(String stepGroupId) {
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

    public TemplateStepSummary withTemplateId(String templateId) {
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

    public TemplateStepSummary withName(String name) {
        setName(name);
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

    public TemplateStepSummary withStepActionType(String stepActionType) {
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

    public TemplateStepSummary withStepActionType(StepActionType stepActionType) {
        this.stepActionType = stepActionType.toString();
        return this;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @param targetType
     *        The servers on which to run the script.
     * @see TargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @return The servers on which to run the script.
     * @see TargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @param targetType
     *        The servers on which to run the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public TemplateStepSummary withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The servers on which to run the script.
     * </p>
     * 
     * @param targetType
     *        The servers on which to run the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public TemplateStepSummary withTargetType(TargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @param owner
     *        The owner of the step.
     * @see Owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @return The owner of the step.
     * @see Owner
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @param owner
     *        The owner of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public TemplateStepSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The owner of the step.
     * </p>
     * 
     * @param owner
     *        The owner of the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public TemplateStepSummary withOwner(Owner owner) {
        this.owner = owner.toString();
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

    public TemplateStepSummary withPrevious(String... previous) {
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

    public TemplateStepSummary withPrevious(java.util.Collection<String> previous) {
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

    public TemplateStepSummary withNext(String... next) {
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

    public TemplateStepSummary withNext(java.util.Collection<String> next) {
        setNext(next);
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
        if (getStepActionType() != null)
            sb.append("StepActionType: ").append(getStepActionType()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getPrevious() != null)
            sb.append("Previous: ").append(getPrevious()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateStepSummary == false)
            return false;
        TemplateStepSummary other = (TemplateStepSummary) obj;
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
        if (other.getStepActionType() == null ^ this.getStepActionType() == null)
            return false;
        if (other.getStepActionType() != null && other.getStepActionType().equals(this.getStepActionType()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getPrevious() == null ^ this.getPrevious() == null)
            return false;
        if (other.getPrevious() != null && other.getPrevious().equals(this.getPrevious()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
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
        hashCode = prime * hashCode + ((getStepActionType() == null) ? 0 : getStepActionType().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        return hashCode;
    }

    @Override
    public TemplateStepSummary clone() {
        try {
            return (TemplateStepSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhuborchestrator.model.transform.TemplateStepSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
