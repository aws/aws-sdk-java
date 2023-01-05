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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhuborchestrator-2021-08-28/GetWorkflowStep"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the migration workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * desThe ID of the step group.
     * </p>
     */
    private String stepGroupId;
    /**
     * <p>
     * The ID of the step.
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

    public GetWorkflowStepRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * desThe ID of the step group.
     * </p>
     * 
     * @param stepGroupId
     *        desThe ID of the step group.
     */

    public void setStepGroupId(String stepGroupId) {
        this.stepGroupId = stepGroupId;
    }

    /**
     * <p>
     * desThe ID of the step group.
     * </p>
     * 
     * @return desThe ID of the step group.
     */

    public String getStepGroupId() {
        return this.stepGroupId;
    }

    /**
     * <p>
     * desThe ID of the step group.
     * </p>
     * 
     * @param stepGroupId
     *        desThe ID of the step group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowStepRequest withStepGroupId(String stepGroupId) {
        setStepGroupId(stepGroupId);
        return this;
    }

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

    public GetWorkflowStepRequest withId(String id) {
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
        if (getStepGroupId() != null)
            sb.append("StepGroupId: ").append(getStepGroupId()).append(",");
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

        if (obj instanceof GetWorkflowStepRequest == false)
            return false;
        GetWorkflowStepRequest other = (GetWorkflowStepRequest) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getStepGroupId() == null ^ this.getStepGroupId() == null)
            return false;
        if (other.getStepGroupId() != null && other.getStepGroupId().equals(this.getStepGroupId()) == false)
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
        hashCode = prime * hashCode + ((getStepGroupId() == null) ? 0 : getStepGroupId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowStepRequest clone() {
        return (GetWorkflowStepRequest) super.clone();
    }

}
