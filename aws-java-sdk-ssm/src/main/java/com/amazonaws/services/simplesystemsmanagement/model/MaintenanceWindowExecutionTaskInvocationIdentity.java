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
 * Describes the information about a task invocation for a particular target as part of a task execution performed as
 * part of a Maintenance Window execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowExecutionTaskInvocationIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowExecutionTaskInvocationIdentity implements Serializable, Cloneable, StructuredPojo {

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
     * The ID of the task invocation.
     * </p>
     */
    private String invocationId;
    /**
     * <p>
     * The ID of the action performed in the service that actually handled the task invocation. If the task type is
     * RUN_COMMAND, this value is the command ID.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The task type.
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * The parameters that were provided for the invocation when it was run.
     * </p>
     */
    private String parameters;
    /**
     * <p>
     * The status of the task invocation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The details explaining the status of the task invocation. Only available for certain Status values.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * The time the invocation started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time the invocation finished.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * User-provided value that was specified when the target was registered with the Maintenance Window. This was also
     * included in any CloudWatch events raised during the task invocation.
     * </p>
     */
    private String ownerInformation;
    /**
     * <p>
     * The ID of the target definition in this Maintenance Window the invocation was performed for.
     * </p>
     */
    private String windowTargetId;

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

    public MaintenanceWindowExecutionTaskInvocationIdentity withWindowExecutionId(String windowExecutionId) {
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

    public MaintenanceWindowExecutionTaskInvocationIdentity withTaskExecutionId(String taskExecutionId) {
        setTaskExecutionId(taskExecutionId);
        return this;
    }

    /**
     * <p>
     * The ID of the task invocation.
     * </p>
     * 
     * @param invocationId
     *        The ID of the task invocation.
     */

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    /**
     * <p>
     * The ID of the task invocation.
     * </p>
     * 
     * @return The ID of the task invocation.
     */

    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * <p>
     * The ID of the task invocation.
     * </p>
     * 
     * @param invocationId
     *        The ID of the task invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withInvocationId(String invocationId) {
        setInvocationId(invocationId);
        return this;
    }

    /**
     * <p>
     * The ID of the action performed in the service that actually handled the task invocation. If the task type is
     * RUN_COMMAND, this value is the command ID.
     * </p>
     * 
     * @param executionId
     *        The ID of the action performed in the service that actually handled the task invocation. If the task type
     *        is RUN_COMMAND, this value is the command ID.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The ID of the action performed in the service that actually handled the task invocation. If the task type is
     * RUN_COMMAND, this value is the command ID.
     * </p>
     * 
     * @return The ID of the action performed in the service that actually handled the task invocation. If the task type
     *         is RUN_COMMAND, this value is the command ID.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The ID of the action performed in the service that actually handled the task invocation. If the task type is
     * RUN_COMMAND, this value is the command ID.
     * </p>
     * 
     * @param executionId
     *        The ID of the action performed in the service that actually handled the task invocation. If the task type
     *        is RUN_COMMAND, this value is the command ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The task type.
     * </p>
     * 
     * @param taskType
     *        The task type.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The task type.
     * </p>
     * 
     * @return The task type.
     * @see MaintenanceWindowTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The task type.
     * </p>
     * 
     * @param taskType
     *        The task type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The task type.
     * </p>
     * 
     * @param taskType
     *        The task type.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(MaintenanceWindowTaskType taskType) {
        withTaskType(taskType);
    }

    /**
     * <p>
     * The task type.
     * </p>
     * 
     * @param taskType
     *        The task type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The parameters that were provided for the invocation when it was run.
     * </p>
     * 
     * @param parameters
     *        The parameters that were provided for the invocation when it was run.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters that were provided for the invocation when it was run.
     * </p>
     * 
     * @return The parameters that were provided for the invocation when it was run.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The parameters that were provided for the invocation when it was run.
     * </p>
     * 
     * @param parameters
     *        The parameters that were provided for the invocation when it was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The status of the task invocation.
     * </p>
     * 
     * @param status
     *        The status of the task invocation.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task invocation.
     * </p>
     * 
     * @return The status of the task invocation.
     * @see MaintenanceWindowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task invocation.
     * </p>
     * 
     * @param status
     *        The status of the task invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task invocation.
     * </p>
     * 
     * @param status
     *        The status of the task invocation.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(MaintenanceWindowExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the task invocation.
     * </p>
     * 
     * @param status
     *        The status of the task invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details explaining the status of the task invocation. Only available for certain Status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the status of the task invocation. Only available for certain Status values.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * The details explaining the status of the task invocation. Only available for certain Status values.
     * </p>
     * 
     * @return The details explaining the status of the task invocation. Only available for certain Status values.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * The details explaining the status of the task invocation. Only available for certain Status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the status of the task invocation. Only available for certain Status values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The time the invocation started.
     * </p>
     * 
     * @param startTime
     *        The time the invocation started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the invocation started.
     * </p>
     * 
     * @return The time the invocation started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the invocation started.
     * </p>
     * 
     * @param startTime
     *        The time the invocation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the invocation finished.
     * </p>
     * 
     * @param endTime
     *        The time the invocation finished.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the invocation finished.
     * </p>
     * 
     * @return The time the invocation finished.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time the invocation finished.
     * </p>
     * 
     * @param endTime
     *        The time the invocation finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * User-provided value that was specified when the target was registered with the Maintenance Window. This was also
     * included in any CloudWatch events raised during the task invocation.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value that was specified when the target was registered with the Maintenance Window. This
     *        was also included in any CloudWatch events raised during the task invocation.
     */

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * User-provided value that was specified when the target was registered with the Maintenance Window. This was also
     * included in any CloudWatch events raised during the task invocation.
     * </p>
     * 
     * @return User-provided value that was specified when the target was registered with the Maintenance Window. This
     *         was also included in any CloudWatch events raised during the task invocation.
     */

    public String getOwnerInformation() {
        return this.ownerInformation;
    }

    /**
     * <p>
     * User-provided value that was specified when the target was registered with the Maintenance Window. This was also
     * included in any CloudWatch events raised during the task invocation.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value that was specified when the target was registered with the Maintenance Window. This
     *        was also included in any CloudWatch events raised during the task invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
        return this;
    }

    /**
     * <p>
     * The ID of the target definition in this Maintenance Window the invocation was performed for.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target definition in this Maintenance Window the invocation was performed for.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The ID of the target definition in this Maintenance Window the invocation was performed for.
     * </p>
     * 
     * @return The ID of the target definition in this Maintenance Window the invocation was performed for.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The ID of the target definition in this Maintenance Window the invocation was performed for.
     * </p>
     * 
     * @param windowTargetId
     *        The ID of the target definition in this Maintenance Window the invocation was performed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowExecutionTaskInvocationIdentity withWindowTargetId(String windowTargetId) {
        setWindowTargetId(windowTargetId);
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
        if (getInvocationId() != null)
            sb.append("InvocationId: ").append(getInvocationId()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getOwnerInformation() != null)
            sb.append("OwnerInformation: ").append("***Sensitive Data Redacted***").append(",");
        if (getWindowTargetId() != null)
            sb.append("WindowTargetId: ").append(getWindowTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowExecutionTaskInvocationIdentity == false)
            return false;
        MaintenanceWindowExecutionTaskInvocationIdentity other = (MaintenanceWindowExecutionTaskInvocationIdentity) obj;
        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
            return false;
        if (other.getTaskExecutionId() == null ^ this.getTaskExecutionId() == null)
            return false;
        if (other.getTaskExecutionId() != null && other.getTaskExecutionId().equals(this.getTaskExecutionId()) == false)
            return false;
        if (other.getInvocationId() == null ^ this.getInvocationId() == null)
            return false;
        if (other.getInvocationId() != null && other.getInvocationId().equals(this.getInvocationId()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
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
        if (other.getOwnerInformation() == null ^ this.getOwnerInformation() == null)
            return false;
        if (other.getOwnerInformation() != null && other.getOwnerInformation().equals(this.getOwnerInformation()) == false)
            return false;
        if (other.getWindowTargetId() == null ^ this.getWindowTargetId() == null)
            return false;
        if (other.getWindowTargetId() != null && other.getWindowTargetId().equals(this.getWindowTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskExecutionId() == null) ? 0 : getTaskExecutionId().hashCode());
        hashCode = prime * hashCode + ((getInvocationId() == null) ? 0 : getInvocationId().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getOwnerInformation() == null) ? 0 : getOwnerInformation().hashCode());
        hashCode = prime * hashCode + ((getWindowTargetId() == null) ? 0 : getWindowTargetId().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowExecutionTaskInvocationIdentity clone() {
        try {
            return (MaintenanceWindowExecutionTaskInvocationIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowExecutionTaskInvocationIdentityMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
