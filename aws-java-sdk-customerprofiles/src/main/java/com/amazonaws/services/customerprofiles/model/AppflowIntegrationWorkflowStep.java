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
 * Workflow step details for <code>APPFLOW_INTEGRATION</code> workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AppflowIntegrationWorkflowStep"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppflowIntegrationWorkflowStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the flow created during execution of workflow step. <code>APPFLOW_INTEGRATION</code> workflow type
     * creates an appflow flow during workflow step execution on the customers behalf.
     * </p>
     */
    private String flowName;
    /**
     * <p>
     * Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Message indicating execution of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private String executionMessage;
    /**
     * <p>
     * Total number of records processed during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     */
    private Long recordsProcessed;
    /**
     * <p>
     * Start datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     */
    private String batchRecordsStartTime;
    /**
     * <p>
     * End datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     */
    private String batchRecordsEndTime;
    /**
     * <p>
     * Creation timestamp of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Last updated timestamp for workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * Name of the flow created during execution of workflow step. <code>APPFLOW_INTEGRATION</code> workflow type
     * creates an appflow flow during workflow step execution on the customers behalf.
     * </p>
     * 
     * @param flowName
     *        Name of the flow created during execution of workflow step. <code>APPFLOW_INTEGRATION</code> workflow type
     *        creates an appflow flow during workflow step execution on the customers behalf.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * Name of the flow created during execution of workflow step. <code>APPFLOW_INTEGRATION</code> workflow type
     * creates an appflow flow during workflow step execution on the customers behalf.
     * </p>
     * 
     * @return Name of the flow created during execution of workflow step. <code>APPFLOW_INTEGRATION</code> workflow
     *         type creates an appflow flow during workflow step execution on the customers behalf.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * Name of the flow created during execution of workflow step. <code>APPFLOW_INTEGRATION</code> workflow type
     * creates an appflow flow during workflow step execution on the customers behalf.
     * </p>
     * 
     * @param flowName
     *        Name of the flow created during execution of workflow step. <code>APPFLOW_INTEGRATION</code> workflow type
     *        creates an appflow flow during workflow step execution on the customers behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowStep withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

    /**
     * <p>
     * Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param status
     *        Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param status
     *        Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AppflowIntegrationWorkflowStep withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param status
     *        Workflow step status for <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public AppflowIntegrationWorkflowStep withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Message indicating execution of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param executionMessage
     *        Message indicating execution of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setExecutionMessage(String executionMessage) {
        this.executionMessage = executionMessage;
    }

    /**
     * <p>
     * Message indicating execution of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Message indicating execution of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public String getExecutionMessage() {
        return this.executionMessage;
    }

    /**
     * <p>
     * Message indicating execution of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param executionMessage
     *        Message indicating execution of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowStep withExecutionMessage(String executionMessage) {
        setExecutionMessage(executionMessage);
        return this;
    }

    /**
     * <p>
     * Total number of records processed during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @param recordsProcessed
     *        Total number of records processed during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     *        workflow.
     */

    public void setRecordsProcessed(Long recordsProcessed) {
        this.recordsProcessed = recordsProcessed;
    }

    /**
     * <p>
     * Total number of records processed during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @return Total number of records processed during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     *         workflow.
     */

    public Long getRecordsProcessed() {
        return this.recordsProcessed;
    }

    /**
     * <p>
     * Total number of records processed during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @param recordsProcessed
     *        Total number of records processed during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     *        workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowStep withRecordsProcessed(Long recordsProcessed) {
        setRecordsProcessed(recordsProcessed);
        return this;
    }

    /**
     * <p>
     * Start datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @param batchRecordsStartTime
     *        Start datetime of records pulled in batch during execution of workflow step for
     *        <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setBatchRecordsStartTime(String batchRecordsStartTime) {
        this.batchRecordsStartTime = batchRecordsStartTime;
    }

    /**
     * <p>
     * Start datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @return Start datetime of records pulled in batch during execution of workflow step for
     *         <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public String getBatchRecordsStartTime() {
        return this.batchRecordsStartTime;
    }

    /**
     * <p>
     * Start datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @param batchRecordsStartTime
     *        Start datetime of records pulled in batch during execution of workflow step for
     *        <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowStep withBatchRecordsStartTime(String batchRecordsStartTime) {
        setBatchRecordsStartTime(batchRecordsStartTime);
        return this;
    }

    /**
     * <p>
     * End datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @param batchRecordsEndTime
     *        End datetime of records pulled in batch during execution of workflow step for
     *        <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setBatchRecordsEndTime(String batchRecordsEndTime) {
        this.batchRecordsEndTime = batchRecordsEndTime;
    }

    /**
     * <p>
     * End datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @return End datetime of records pulled in batch during execution of workflow step for
     *         <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public String getBatchRecordsEndTime() {
        return this.batchRecordsEndTime;
    }

    /**
     * <p>
     * End datetime of records pulled in batch during execution of workflow step for <code>APPFLOW_INTEGRATION</code>
     * workflow.
     * </p>
     * 
     * @param batchRecordsEndTime
     *        End datetime of records pulled in batch during execution of workflow step for
     *        <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowStep withBatchRecordsEndTime(String batchRecordsEndTime) {
        setBatchRecordsEndTime(batchRecordsEndTime);
        return this;
    }

    /**
     * <p>
     * Creation timestamp of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param createdAt
     *        Creation timestamp of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Creation timestamp of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Creation timestamp of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Creation timestamp of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param createdAt
     *        Creation timestamp of workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowStep withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Last updated timestamp for workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Last updated timestamp for workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Last updated timestamp for workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @return Last updated timestamp for workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Last updated timestamp for workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Last updated timestamp for workflow step for <code>APPFLOW_INTEGRATION</code> workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppflowIntegrationWorkflowStep withLastUpdatedAt(java.util.Date lastUpdatedAt) {
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
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getExecutionMessage() != null)
            sb.append("ExecutionMessage: ").append(getExecutionMessage()).append(",");
        if (getRecordsProcessed() != null)
            sb.append("RecordsProcessed: ").append(getRecordsProcessed()).append(",");
        if (getBatchRecordsStartTime() != null)
            sb.append("BatchRecordsStartTime: ").append(getBatchRecordsStartTime()).append(",");
        if (getBatchRecordsEndTime() != null)
            sb.append("BatchRecordsEndTime: ").append(getBatchRecordsEndTime()).append(",");
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

        if (obj instanceof AppflowIntegrationWorkflowStep == false)
            return false;
        AppflowIntegrationWorkflowStep other = (AppflowIntegrationWorkflowStep) obj;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getExecutionMessage() == null ^ this.getExecutionMessage() == null)
            return false;
        if (other.getExecutionMessage() != null && other.getExecutionMessage().equals(this.getExecutionMessage()) == false)
            return false;
        if (other.getRecordsProcessed() == null ^ this.getRecordsProcessed() == null)
            return false;
        if (other.getRecordsProcessed() != null && other.getRecordsProcessed().equals(this.getRecordsProcessed()) == false)
            return false;
        if (other.getBatchRecordsStartTime() == null ^ this.getBatchRecordsStartTime() == null)
            return false;
        if (other.getBatchRecordsStartTime() != null && other.getBatchRecordsStartTime().equals(this.getBatchRecordsStartTime()) == false)
            return false;
        if (other.getBatchRecordsEndTime() == null ^ this.getBatchRecordsEndTime() == null)
            return false;
        if (other.getBatchRecordsEndTime() != null && other.getBatchRecordsEndTime().equals(this.getBatchRecordsEndTime()) == false)
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

        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionMessage() == null) ? 0 : getExecutionMessage().hashCode());
        hashCode = prime * hashCode + ((getRecordsProcessed() == null) ? 0 : getRecordsProcessed().hashCode());
        hashCode = prime * hashCode + ((getBatchRecordsStartTime() == null) ? 0 : getBatchRecordsStartTime().hashCode());
        hashCode = prime * hashCode + ((getBatchRecordsEndTime() == null) ? 0 : getBatchRecordsEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AppflowIntegrationWorkflowStep clone() {
        try {
            return (AppflowIntegrationWorkflowStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.AppflowIntegrationWorkflowStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
