/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Maintenance Window execution.
     * </p>
     */
    private String windowExecutionId;
    /**
     * <p>
     * The ID of the task executions from the Maintenance Window execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> taskIds;
    /**
     * <p>
     * The status of the Maintenance Window execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * The time the Maintenance Window started running.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time the Maintenance Window finished running.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ID of the Maintenance Window execution.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution.
     */

    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution.
     * </p>
     * 
     * @return The ID of the Maintenance Window execution.
     */

    public String getWindowExecutionId() {
        return this.windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionResult withWindowExecutionId(String windowExecutionId) {
        setWindowExecutionId(windowExecutionId);
        return this;
    }

    /**
     * <p>
     * The ID of the task executions from the Maintenance Window execution.
     * </p>
     * 
     * @return The ID of the task executions from the Maintenance Window execution.
     */

    public java.util.List<String> getTaskIds() {
        if (taskIds == null) {
            taskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return taskIds;
    }

    /**
     * <p>
     * The ID of the task executions from the Maintenance Window execution.
     * </p>
     * 
     * @param taskIds
     *        The ID of the task executions from the Maintenance Window execution.
     */

    public void setTaskIds(java.util.Collection<String> taskIds) {
        if (taskIds == null) {
            this.taskIds = null;
            return;
        }

        this.taskIds = new com.amazonaws.internal.SdkInternalList<String>(taskIds);
    }

    /**
     * <p>
     * The ID of the task executions from the Maintenance Window execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskIds(java.util.Collection)} or {@link #withTaskIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param taskIds
     *        The ID of the task executions from the Maintenance Window execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionResult withTaskIds(String... taskIds) {
        if (this.taskIds == null) {
            setTaskIds(new com.amazonaws.internal.SdkInternalList<String>(taskIds.length));
        }
        for (String ele : taskIds) {
            this.taskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the task executions from the Maintenance Window execution.
     * </p>
     * 
     * @param taskIds
     *        The ID of the task executions from the Maintenance Window execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionResult withTaskIds(java.util.Collection<String> taskIds) {
        setTaskIds(taskIds);
        return this;
    }

    /**
     * <p>
     * The status of the Maintenance Window execution.
     * </p>
     * 
     * @param status
     *        The status of the Maintenance Window execution.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Maintenance Window execution.
     * </p>
     * 
     * @return The status of the Maintenance Window execution.
     * @see MaintenanceWindowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Maintenance Window execution.
     * </p>
     * 
     * @param status
     *        The status of the Maintenance Window execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public GetMaintenanceWindowExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Maintenance Window execution.
     * </p>
     * 
     * @param status
     *        The status of the Maintenance Window execution.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(MaintenanceWindowExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the Maintenance Window execution.
     * </p>
     * 
     * @param status
     *        The status of the Maintenance Window execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public GetMaintenanceWindowExecutionResult withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the Status. Only available for certain status values.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     * 
     * @return The details explaining the Status. Only available for certain status values.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * The details explaining the Status. Only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the Status. Only available for certain status values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionResult withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The time the Maintenance Window started running.
     * </p>
     * 
     * @param startTime
     *        The time the Maintenance Window started running.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the Maintenance Window started running.
     * </p>
     * 
     * @return The time the Maintenance Window started running.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the Maintenance Window started running.
     * </p>
     * 
     * @param startTime
     *        The time the Maintenance Window started running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the Maintenance Window finished running.
     * </p>
     * 
     * @param endTime
     *        The time the Maintenance Window finished running.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the Maintenance Window finished running.
     * </p>
     * 
     * @return The time the Maintenance Window finished running.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time the Maintenance Window finished running.
     * </p>
     * 
     * @param endTime
     *        The time the Maintenance Window finished running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getWindowExecutionId() != null)
            sb.append("WindowExecutionId: ").append(getWindowExecutionId()).append(",");
        if (getTaskIds() != null)
            sb.append("TaskIds: ").append(getTaskIds()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMaintenanceWindowExecutionResult == false)
            return false;
        GetMaintenanceWindowExecutionResult other = (GetMaintenanceWindowExecutionResult) obj;
        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
            return false;
        if (other.getTaskIds() == null ^ this.getTaskIds() == null)
            return false;
        if (other.getTaskIds() != null && other.getTaskIds().equals(this.getTaskIds()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskIds() == null) ? 0 : getTaskIds().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public GetMaintenanceWindowExecutionResult clone() {
        try {
            return (GetMaintenanceWindowExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
