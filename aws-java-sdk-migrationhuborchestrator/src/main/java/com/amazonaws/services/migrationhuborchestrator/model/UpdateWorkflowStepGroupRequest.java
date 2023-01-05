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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/UpdateWorkflowStepGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkflowStepGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The ID of the step group.
     * </p>
     */
    private String id;
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

    public UpdateWorkflowStepGroupRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
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

    public UpdateWorkflowStepGroupRequest withId(String id) {
        setId(id);
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

    public UpdateWorkflowStepGroupRequest withName(String name) {
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

    public UpdateWorkflowStepGroupRequest withDescription(String description) {
        setDescription(description);
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

    public UpdateWorkflowStepGroupRequest withNext(String... next) {
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

    public UpdateWorkflowStepGroupRequest withNext(java.util.Collection<String> next) {
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

    public UpdateWorkflowStepGroupRequest withPrevious(String... previous) {
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

    public UpdateWorkflowStepGroupRequest withPrevious(java.util.Collection<String> previous) {
        setPrevious(previous);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNext() != null)
            sb.append("Next: ").append(getNext()).append(",");
        if (getPrevious() != null)
            sb.append("Previous: ").append(getPrevious());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkflowStepGroupRequest == false)
            return false;
        UpdateWorkflowStepGroupRequest other = (UpdateWorkflowStepGroupRequest) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNext() == null ^ this.getNext() == null)
            return false;
        if (other.getNext() != null && other.getNext().equals(this.getNext()) == false)
            return false;
        if (other.getPrevious() == null ^ this.getPrevious() == null)
            return false;
        if (other.getPrevious() != null && other.getPrevious().equals(this.getPrevious()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNext() == null) ? 0 : getNext().hashCode());
        hashCode = prime * hashCode + ((getPrevious() == null) ? 0 : getPrevious().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkflowStepGroupRequest clone() {
        return (UpdateWorkflowStepGroupRequest) super.clone();
    }

}
