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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTaskInvocation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionTaskInvocationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Maintenance Window execution ID.
     * </p>
     */
    private String windowExecutionId;
    /**
     * <p>
     * The task execution ID.
     * </p>
     */
    private String taskExecutionId;
    /**
     * <p>
     * The invocation ID.
     * </p>
     */
    private String invocationId;
    /**
     * <p>
     * The execution ID.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     * AUTOMATION, RUN_COMMAND.
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * The parameters used at the time that the task ran.
     * </p>
     */
    private String parameters;
    /**
     * <p>
     * The task status for an invocation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The details explaining the status. Details are only available for certain status values.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * The time that the task started running on the target.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time that the task finished running on the target.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this
     * Maintenance Window.
     * </p>
     */
    private String ownerInformation;
    /**
     * <p>
     * The Maintenance Window target ID.
     * </p>
     */
    private String windowTargetId;

    /**
     * <p>
     * The Maintenance Window execution ID.
     * </p>
     * 
     * @param windowExecutionId
     *        The Maintenance Window execution ID.
     */

    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The Maintenance Window execution ID.
     * </p>
     * 
     * @return The Maintenance Window execution ID.
     */

    public String getWindowExecutionId() {
        return this.windowExecutionId;
    }

    /**
     * <p>
     * The Maintenance Window execution ID.
     * </p>
     * 
     * @param windowExecutionId
     *        The Maintenance Window execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withWindowExecutionId(String windowExecutionId) {
        setWindowExecutionId(windowExecutionId);
        return this;
    }

    /**
     * <p>
     * The task execution ID.
     * </p>
     * 
     * @param taskExecutionId
     *        The task execution ID.
     */

    public void setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
    }

    /**
     * <p>
     * The task execution ID.
     * </p>
     * 
     * @return The task execution ID.
     */

    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    /**
     * <p>
     * The task execution ID.
     * </p>
     * 
     * @param taskExecutionId
     *        The task execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withTaskExecutionId(String taskExecutionId) {
        setTaskExecutionId(taskExecutionId);
        return this;
    }

    /**
     * <p>
     * The invocation ID.
     * </p>
     * 
     * @param invocationId
     *        The invocation ID.
     */

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    /**
     * <p>
     * The invocation ID.
     * </p>
     * 
     * @return The invocation ID.
     */

    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * <p>
     * The invocation ID.
     * </p>
     * 
     * @param invocationId
     *        The invocation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withInvocationId(String invocationId) {
        setInvocationId(invocationId);
        return this;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param executionId
     *        The execution ID.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @return The execution ID.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The execution ID.
     * </p>
     * 
     * @param executionId
     *        The execution ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     * AUTOMATION, RUN_COMMAND.
     * </p>
     * 
     * @param taskType
     *        Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     *        AUTOMATION, RUN_COMMAND.
     * @see MaintenanceWindowTaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     * AUTOMATION, RUN_COMMAND.
     * </p>
     * 
     * @return Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA,
     *         STEP_FUNCTION, AUTOMATION, RUN_COMMAND.
     * @see MaintenanceWindowTaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     * AUTOMATION, RUN_COMMAND.
     * </p>
     * 
     * @param taskType
     *        Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     *        AUTOMATION, RUN_COMMAND.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     * AUTOMATION, RUN_COMMAND.
     * </p>
     * 
     * @param taskType
     *        Retrieves the task type for a Maintenance Window. Task types include the following: LAMBDA, STEP_FUNCTION,
     *        AUTOMATION, RUN_COMMAND.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowTaskType
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withTaskType(MaintenanceWindowTaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The parameters used at the time that the task ran.
     * </p>
     * 
     * @param parameters
     *        The parameters used at the time that the task ran.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters used at the time that the task ran.
     * </p>
     * 
     * @return The parameters used at the time that the task ran.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The parameters used at the time that the task ran.
     * </p>
     * 
     * @param parameters
     *        The parameters used at the time that the task ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The task status for an invocation.
     * </p>
     * 
     * @param status
     *        The task status for an invocation.
     * @see MaintenanceWindowExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The task status for an invocation.
     * </p>
     * 
     * @return The task status for an invocation.
     * @see MaintenanceWindowExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The task status for an invocation.
     * </p>
     * 
     * @param status
     *        The task status for an invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The task status for an invocation.
     * </p>
     * 
     * @param status
     *        The task status for an invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceWindowExecutionStatus
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withStatus(MaintenanceWindowExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The details explaining the status. Details are only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the status. Details are only available for certain status values.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * The details explaining the status. Details are only available for certain status values.
     * </p>
     * 
     * @return The details explaining the status. Details are only available for certain status values.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * The details explaining the status. Details are only available for certain status values.
     * </p>
     * 
     * @param statusDetails
     *        The details explaining the status. Details are only available for certain status values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The time that the task started running on the target.
     * </p>
     * 
     * @param startTime
     *        The time that the task started running on the target.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time that the task started running on the target.
     * </p>
     * 
     * @return The time that the task started running on the target.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time that the task started running on the target.
     * </p>
     * 
     * @param startTime
     *        The time that the task started running on the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time that the task finished running on the target.
     * </p>
     * 
     * @param endTime
     *        The time that the task finished running on the target.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time that the task finished running on the target.
     * </p>
     * 
     * @return The time that the task finished running on the target.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time that the task finished running on the target.
     * </p>
     * 
     * @param endTime
     *        The time that the task finished running on the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this
     * Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value to be included in any CloudWatch events raised while running tasks for these targets
     *        in this Maintenance Window.
     */

    public void setOwnerInformation(String ownerInformation) {
        this.ownerInformation = ownerInformation;
    }

    /**
     * <p>
     * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this
     * Maintenance Window.
     * </p>
     * 
     * @return User-provided value to be included in any CloudWatch events raised while running tasks for these targets
     *         in this Maintenance Window.
     */

    public String getOwnerInformation() {
        return this.ownerInformation;
    }

    /**
     * <p>
     * User-provided value to be included in any CloudWatch events raised while running tasks for these targets in this
     * Maintenance Window.
     * </p>
     * 
     * @param ownerInformation
     *        User-provided value to be included in any CloudWatch events raised while running tasks for these targets
     *        in this Maintenance Window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withOwnerInformation(String ownerInformation) {
        setOwnerInformation(ownerInformation);
        return this;
    }

    /**
     * <p>
     * The Maintenance Window target ID.
     * </p>
     * 
     * @param windowTargetId
     *        The Maintenance Window target ID.
     */

    public void setWindowTargetId(String windowTargetId) {
        this.windowTargetId = windowTargetId;
    }

    /**
     * <p>
     * The Maintenance Window target ID.
     * </p>
     * 
     * @return The Maintenance Window target ID.
     */

    public String getWindowTargetId() {
        return this.windowTargetId;
    }

    /**
     * <p>
     * The Maintenance Window target ID.
     * </p>
     * 
     * @param windowTargetId
     *        The Maintenance Window target ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionTaskInvocationResult withWindowTargetId(String windowTargetId) {
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

        if (obj instanceof GetMaintenanceWindowExecutionTaskInvocationResult == false)
            return false;
        GetMaintenanceWindowExecutionTaskInvocationResult other = (GetMaintenanceWindowExecutionTaskInvocationResult) obj;
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
    public GetMaintenanceWindowExecutionTaskInvocationResult clone() {
        try {
            return (GetMaintenanceWindowExecutionTaskInvocationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
