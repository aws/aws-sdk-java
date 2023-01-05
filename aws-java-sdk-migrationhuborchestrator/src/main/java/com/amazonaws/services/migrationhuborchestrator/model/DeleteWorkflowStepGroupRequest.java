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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/DeleteWorkflowStepGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWorkflowStepGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The ID of the step group you want to delete.
     * </p>
     */
    private String id;

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

    public DeleteWorkflowStepGroupRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The ID of the step group you want to delete.
     * </p>
     * 
     * @param id
     *        The ID of the step group you want to delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the step group you want to delete.
     * </p>
     * 
     * @return The ID of the step group you want to delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the step group you want to delete.
     * </p>
     * 
     * @param id
     *        The ID of the step group you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWorkflowStepGroupRequest withId(String id) {
        setId(id);
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
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkflowStepGroupRequest == false)
            return false;
        DeleteWorkflowStepGroupRequest other = (DeleteWorkflowStepGroupRequest) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWorkflowStepGroupRequest clone() {
        return (DeleteWorkflowStepGroupRequest) super.clone();
    }

}
