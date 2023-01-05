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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStepGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the step group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The name of the step group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the step group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the step group.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The owner of the step group.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The time at which the step group was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the step group was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The time at which the step group ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     */
    private java.util.List<Tool> tools;
    /**
     * <p>
     * The previous step group.
     * </p>
     */
    private java.util.List<String> previous;
    /**
     * <p>
     * The next step group.
     * </p>
     */
    private java.util.List<String> next;

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @param id
     *        The ID of the step group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @return The ID of the step group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the step group.
     * </p>
     * 
     * @param id
     *        The ID of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withId(String id) {
        setId(id);
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

    public GetWorkflowStepGroupResult withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The name of the step group.
     * </p>
     * 
     * @param name
     *        The name of the step group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step group.
     * </p>
     * 
     * @return The name of the step group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step group.
     * </p>
     * 
     * @param name
     *        The name of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the step group.
     * </p>
     * 
     * @param description
     *        The description of the step group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the step group.
     * </p>
     * 
     * @return The description of the step group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the step group.
     * </p>
     * 
     * @param description
     *        The description of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the step group.
     * </p>
     * 
     * @param status
     *        The status of the step group.
     * @see StepGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the step group.
     * </p>
     * 
     * @return The status of the step group.
     * @see StepGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the step group.
     * </p>
     * 
     * @param status
     *        The status of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepGroupStatus
     */

    public GetWorkflowStepGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the step group.
     * </p>
     * 
     * @param status
     *        The status of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StepGroupStatus
     */

    public GetWorkflowStepGroupResult withStatus(StepGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the step group.
     * </p>
     * 
     * @param owner
     *        The owner of the step group.
     * @see Owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the step group.
     * </p>
     * 
     * @return The owner of the step group.
     * @see Owner
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the step group.
     * </p>
     * 
     * @param owner
     *        The owner of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public GetWorkflowStepGroupResult withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The owner of the step group.
     * </p>
     * 
     * @param owner
     *        The owner of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public GetWorkflowStepGroupResult withOwner(Owner owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the step group was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the step group was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the step group was created.
     * </p>
     * 
     * @return The time at which the step group was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the step group was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the step group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the step group was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the step group was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the step group was last modified.
     * </p>
     * 
     * @return The time at which the step group was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the step group was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the step group was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The time at which the step group ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the step group ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the step group ended.
     * </p>
     * 
     * @return The time at which the step group ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the step group ended.
     * </p>
     * 
     * @param endTime
     *        The time at which the step group ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * 
     * @return List of AWS services utilized in a migration workflow.
     */

    public java.util.List<Tool> getTools() {
        return tools;
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * 
     * @param tools
     *        List of AWS services utilized in a migration workflow.
     */

    public void setTools(java.util.Collection<Tool> tools) {
        if (tools == null) {
            this.tools = null;
            return;
        }

        this.tools = new java.util.ArrayList<Tool>(tools);
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTools(java.util.Collection)} or {@link #withTools(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tools
     *        List of AWS services utilized in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withTools(Tool... tools) {
        if (this.tools == null) {
            setTools(new java.util.ArrayList<Tool>(tools.length));
        }
        for (Tool ele : tools) {
            this.tools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     * 
     * @param tools
     *        List of AWS services utilized in a migration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withTools(java.util.Collection<Tool> tools) {
        setTools(tools);
        return this;
    }

    /**
     * <p>
     * The previous step group.
     * </p>
     * 
     * @return The previous step group.
     */

    public java.util.List<String> getPrevious() {
        return previous;
    }

    /**
     * <p>
     * The previous step group.
     * </p>
     * 
     * @param previous
     *        The previous step group.
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
     * The previous step group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrevious(java.util.Collection)} or {@link #withPrevious(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param previous
     *        The previous step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withPrevious(String... previous) {
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
     * The previous step group.
     * </p>
     * 
     * @param previous
     *        The previous step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withPrevious(java.util.Collection<String> previous) {
        setPrevious(previous);
        return this;
    }

    /**
     * <p>
     * The next step group.
     * </p>
     * 
     * @return The next step group.
     */

    public java.util.List<String> getNext() {
        return next;
    }

    /**
     * <p>
     * The next step group.
     * </p>
     * 
     * @param next
     *        The next step group.
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
     * The next step group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNext(java.util.Collection)} or {@link #withNext(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param next
     *        The next step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withNext(String... next) {
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
     * The next step group.
     * </p>
     * 
     * @param next
     *        The next step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepGroupResult withNext(java.util.Collection<String> next) {
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTools() != null)
            sb.append("Tools: ").append(getTools()).append(",");
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

        if (obj instanceof GetWorkflowStepGroupResult == false)
            return false;
        GetWorkflowStepGroupResult other = (GetWorkflowStepGroupResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getTools() == null ^ this.getTools() == null)
            return false;
        if (other.getTools() != null && other.getTools().equals(this.getTools()) == false)
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
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTools() == null) ? 0 : getTools().hashCode());
        hashCode = prime * hashCode + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowStepGroupResult clone() {
        try {
            return (GetWorkflowStepGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
