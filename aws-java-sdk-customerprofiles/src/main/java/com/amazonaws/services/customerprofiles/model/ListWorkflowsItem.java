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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A workflow in list of workflows.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListWorkflowsItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkflowsItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     */
    private String workflowType;
    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * Status of workflow execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Description for workflow execution status.
     * </p>
     */
    private String statusDescription;
    /**
     * <p>
     * Creation timestamp for workflow.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Last updated timestamp for workflow.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public void setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @return The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public ListWorkflowsItem withWorkflowType(String workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public ListWorkflowsItem withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType.toString();
        return this;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        Unique identifier for the workflow.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @return Unique identifier for the workflow.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     * 
     * @param workflowId
     *        Unique identifier for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsItem withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @param status
     *        Status of workflow execution.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @return Status of workflow execution.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @param status
     *        Status of workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ListWorkflowsItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of workflow execution.
     * </p>
     * 
     * @param status
     *        Status of workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ListWorkflowsItem withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Description for workflow execution status.
     * </p>
     * 
     * @param statusDescription
     *        Description for workflow execution status.
     */

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * <p>
     * Description for workflow execution status.
     * </p>
     * 
     * @return Description for workflow execution status.
     */

    public String getStatusDescription() {
        return this.statusDescription;
    }

    /**
     * <p>
     * Description for workflow execution status.
     * </p>
     * 
     * @param statusDescription
     *        Description for workflow execution status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsItem withStatusDescription(String statusDescription) {
        setStatusDescription(statusDescription);
        return this;
    }

    /**
     * <p>
     * Creation timestamp for workflow.
     * </p>
     * 
     * @param createdAt
     *        Creation timestamp for workflow.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Creation timestamp for workflow.
     * </p>
     * 
     * @return Creation timestamp for workflow.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Creation timestamp for workflow.
     * </p>
     * 
     * @param createdAt
     *        Creation timestamp for workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsItem withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Last updated timestamp for workflow.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Last updated timestamp for workflow.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Last updated timestamp for workflow.
     * </p>
     * 
     * @return Last updated timestamp for workflow.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Last updated timestamp for workflow.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Last updated timestamp for workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkflowsItem withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDescription() != null)
            sb.append("StatusDescription: ").append(getStatusDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkflowsItem == false)
            return false;
        ListWorkflowsItem other = (ListWorkflowsItem) obj;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDescription() == null ^ this.getStatusDescription() == null)
            return false;
        if (other.getStatusDescription() != null && other.getStatusDescription().equals(this.getStatusDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDescription() == null) ? 0 : getStatusDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkflowsItem clone() {
        try {
            return (ListWorkflowsItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ListWorkflowsItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
