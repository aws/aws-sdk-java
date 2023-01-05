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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/CreateWorkflowStepGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkflowStepGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the migration workflow that contains the step group.
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
     * The ID of the step group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description of the step group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * List of AWS services utilized in a migration workflow.
     * </p>
     */
    private java.util.List<Tool> tools;
    /**
     * <p>
     * The next step group.
     * </p>
     */
    private java.util.List<String> next;
    /**
     * <p>
     * The previous step group.
     * </p>
     */
    private java.util.List<String> previous;
    /**
     * <p>
     * The time at which the step group is created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ID of the migration workflow that contains the step group.
     * </p>
     * 
     * @param workflowId
     *        The ID of the migration workflow that contains the step group.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The ID of the migration workflow that contains the step group.
     * </p>
     * 
     * @return The ID of the migration workflow that contains the step group.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The ID of the migration workflow that contains the step group.
     * </p>
     * 
     * @param workflowId
     *        The ID of the migration workflow that contains the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowStepGroupResult withWorkflowId(String workflowId) {
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

    public CreateWorkflowStepGroupResult withName(String name) {
        setName(name);
        return this;
    }

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

    public CreateWorkflowStepGroupResult withId(String id) {
        setId(id);
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

    public CreateWorkflowStepGroupResult withDescription(String description) {
        setDescription(description);
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

    public CreateWorkflowStepGroupResult withTools(Tool... tools) {
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

    public CreateWorkflowStepGroupResult withTools(java.util.Collection<Tool> tools) {
        setTools(tools);
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

    public CreateWorkflowStepGroupResult withNext(String... next) {
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

    public CreateWorkflowStepGroupResult withNext(java.util.Collection<String> next) {
        setNext(next);
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

    public CreateWorkflowStepGroupResult withPrevious(String... previous) {
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

    public CreateWorkflowStepGroupResult withPrevious(java.util.Collection<String> previous) {
        setPrevious(previous);
        return this;
    }

    /**
     * <p>
     * The time at which the step group is created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the step group is created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the step group is created.
     * </p>
     * 
     * @return The time at which the step group is created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the step group is created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the step group is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowStepGroupResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTools() != null)
            sb.append("Tools: ").append(getTools()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext()).append(",");
        if (getPrevious() != null)
            sb.append("Previous: ").append(getPrevious()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkflowStepGroupResult == false)
            return false;
        CreateWorkflowStepGroupResult other = (CreateWorkflowStepGroupResult) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTools() == null ^ this.getTools() == null)
            return false;
        if (other.getTools() != null && other.getTools().equals(this.getTools()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        if (other.getPrevious() == null ^ this.getPrevious() == null)
            return false;
        if (other.getPrevious() != null && other.getPrevious().equals(this.getPrevious()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTools() == null) ? 0 : getTools().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        hashCode = prime * hashCode + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkflowStepGroupResult clone() {
        try {
            return (CreateWorkflowStepGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
