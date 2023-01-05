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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the workflow.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     */
    private String workflowType;
    /**
     * <p>
     * Status of workflow execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Workflow error messages during execution (if any).
     * </p>
     */
    private String errorDescription;
    /**
     * <p>
     * The timestamp that represents when workflow execution started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The timestamp that represents when workflow execution last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * Attributes provided for workflow execution.
     * </p>
     */
    private WorkflowAttributes attributes;
    /**
     * <p>
     * Workflow specific execution metrics.
     * </p>
     */
    private WorkflowMetrics metrics;

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

    public GetWorkflowResult withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

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

    public GetWorkflowResult withWorkflowType(String workflowType) {
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

    public GetWorkflowResult withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType.toString();
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

    public GetWorkflowResult withStatus(String status) {
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

    public GetWorkflowResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Workflow error messages during execution (if any).
     * </p>
     * 
     * @param errorDescription
     *        Workflow error messages during execution (if any).
     */

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * <p>
     * Workflow error messages during execution (if any).
     * </p>
     * 
     * @return Workflow error messages during execution (if any).
     */

    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * <p>
     * Workflow error messages during execution (if any).
     * </p>
     * 
     * @param errorDescription
     *        Workflow error messages during execution (if any).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withErrorDescription(String errorDescription) {
        setErrorDescription(errorDescription);
        return this;
    }

    /**
     * <p>
     * The timestamp that represents when workflow execution started.
     * </p>
     * 
     * @param startDate
     *        The timestamp that represents when workflow execution started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The timestamp that represents when workflow execution started.
     * </p>
     * 
     * @return The timestamp that represents when workflow execution started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The timestamp that represents when workflow execution started.
     * </p>
     * 
     * @param startDate
     *        The timestamp that represents when workflow execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The timestamp that represents when workflow execution last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp that represents when workflow execution last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp that represents when workflow execution last updated.
     * </p>
     * 
     * @return The timestamp that represents when workflow execution last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp that represents when workflow execution last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp that represents when workflow execution last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * Attributes provided for workflow execution.
     * </p>
     * 
     * @param attributes
     *        Attributes provided for workflow execution.
     */

    public void setAttributes(WorkflowAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * Attributes provided for workflow execution.
     * </p>
     * 
     * @return Attributes provided for workflow execution.
     */

    public WorkflowAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * <p>
     * Attributes provided for workflow execution.
     * </p>
     * 
     * @param attributes
     *        Attributes provided for workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withAttributes(WorkflowAttributes attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Workflow specific execution metrics.
     * </p>
     * 
     * @param metrics
     *        Workflow specific execution metrics.
     */

    public void setMetrics(WorkflowMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * Workflow specific execution metrics.
     * </p>
     * 
     * @return Workflow specific execution metrics.
     */

    public WorkflowMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * Workflow specific execution metrics.
     * </p>
     * 
     * @param metrics
     *        Workflow specific execution metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkflowResult withMetrics(WorkflowMetrics metrics) {
        setMetrics(metrics);
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
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorDescription() != null)
            sb.append("ErrorDescription: ").append(getErrorDescription()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowResult == false)
            return false;
        GetWorkflowResult other = (GetWorkflowResult) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorDescription() == null ^ this.getErrorDescription() == null)
            return false;
        if (other.getErrorDescription() != null && other.getErrorDescription().equals(this.getErrorDescription()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorDescription() == null) ? 0 : getErrorDescription().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkflowResult clone() {
        try {
            return (GetWorkflowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
