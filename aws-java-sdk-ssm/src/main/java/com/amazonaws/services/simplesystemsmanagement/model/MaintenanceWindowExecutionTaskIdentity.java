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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a task execution performed as part of a Maintenance Window execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowExecutionTaskIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowExecutionTaskIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Maintenance Window execution that ran the task.
     * </p>
     */
    private String windowExecutionId;
    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window execution.
     * </p>
     */
    private String taskExecutionId;
    /**
     * <p>
     * The status of the task execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The details explaining the status of the task execution. Only available for certain status values.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * The time the task execution started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time the task execution finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     */
    private String taskArn;
    /**
     * <p>
     * The type of task that ran.
     * </p>
     */
    private String taskType;

    /**
     * <p>
     * The ID of the Maintenance Window execution that ran the task.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution that ran the task.
     */

    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution that ran the task.
     * </p>
     * 
     * @return The ID of the Maintenance Window execution that ran the task.
     */

    public String getWindowExecutionId() {
        return this.windowExecutionId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window execution that ran the task.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the Maintenance Window execution that ran the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskIdentity withWindowExecutionId(String windowExecutionId) {
        setWindowExecutionId(windowExecutionId);
        return this;
    }

    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window execution.
     * </p>
     * 
     * @param taskExecutionId
     *        The ID of the specific task execution in the Maintenance Window execution.
     */

    public void setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window execution.
     * </p>
     * 
     * @return The ID of the specific task execution in the Maintenance Window execution.
     */

    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    /**
     * <p>
     * The ID of the specific task execution in the Maintenance Window execution.
     * </p>
     * 
     * @param taskExecutionId
     *        The ID of the specific task execution in the Maintenance Window execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskIdentity withTaskExecutionId(String taskExecutionId) {
        setTaskExecutionId(taskExecutionId);
        return this;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @param status
     *        The status of the task execution.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @return The status of the task execution.
     * @see MaintenanceWindowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @param status
     *        The status of the task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public MaintenanceWindowExecutionTaskIdentity withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @param status
     *        The status of the task execution.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(MaintenanceWindowExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the task execution.
     * </p>
     * 
     * @param status
     *        The status of the task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public MaintenanceWindowExecutionTaskIdentity withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details explaining the status of the task execution. Only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the status of the task execution. Only available for certain status values.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * The details explaining the status of the task execution. Only available for certain status values.
     * </p>
     * 
     * @return The details explaining the status of the task execution. Only available for certain status values.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * The details explaining the status of the task execution. Only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the status of the task execution. Only available for certain status values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskIdentity withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     * 
     * @param startTime
     *        The time the task execution started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     * 
     * @return The time the task execution started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the task execution started.
     * </p>
     * 
     * @param startTime
     *        The time the task execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskIdentity withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the task execution finished.
     * </p>
     * 
     * @param endTime
     *        The time the task execution finished.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the task execution finished.
     * </p>
     * 
     * @return The time the task execution finished.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time the task execution finished.
     * </p>
     * 
     * @param endTime
     *        The time the task execution finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskIdentity withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task that ran.
     */

    public void setTaskArn(String taskArn) {
        this.taskArn = taskArn;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * 
     * @return The ARN of the task that ran.
     */

    public String getTaskArn() {
        return this.taskArn;
    }

    /**
     * <p>
     * The ARN of the task that ran.
     * </p>
     * 
     * @param taskArn
     *        The ARN of the task that ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskIdentity withTaskArn(String taskArn) {
        setTaskArn(taskArn);
        return this;
    }

    /**
     * <p>
     * The type of task that ran.
     * </p>
     * 
     * @param taskType
     *        The type of task that ran.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of task that ran.
     * </p>
     * 
     * @return The type of task that ran.
     * @see MaintenanceWindowTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The type of task that ran.
     * </p>
     * 
     * @param taskType
     *        The type of task that ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public MaintenanceWindowExecutionTaskIdentity withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The type of task that ran.
     * </p>
     * 
     * @param taskType
     *        The type of task that ran.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(MaintenanceWindowTaskType taskType) {
        withTaskType(taskType);
    }

    /**
     * <p>
     * The type of task that ran.
     * </p>
     * 
     * @param taskType
     *        The type of task that ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public MaintenanceWindowExecutionTaskIdentity withTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
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
        if (getTaskExecutionId() != null)
            sb.append("TaskExecutionId: ").append(getTaskExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getTaskArn() != null)
            sb.append("TaskArn: ").append(getTaskArn()).append(",");
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowExecutionTaskIdentity == false)
            return false;
        MaintenanceWindowExecutionTaskIdentity other = (MaintenanceWindowExecutionTaskIdentity) obj;
        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
            return false;
        if (other.getTaskExecutionId() == null ^ this.getTaskExecutionId() == null)
            return false;
        if (other.getTaskExecutionId() != null && other.getTaskExecutionId().equals(this.getTaskExecutionId()) == false)
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
        if (other.getTaskArn() == null ^ this.getTaskArn() == null)
            return false;
        if (other.getTaskArn() != null && other.getTaskArn().equals(this.getTaskArn()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskExecutionId() == null) ? 0 : getTaskExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getTaskArn() == null) ? 0 : getTaskArn().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowExecutionTaskIdentity clone() {
        try {
            return (MaintenanceWindowExecutionTaskIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowExecutionTaskIdentityMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
