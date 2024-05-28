/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/TaskSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The number of times that the task failed and was retried.
     * </p>
     */
    private Integer failureRetryCount;
    /**
     * <p>
     * The latest session action for the task.
     * </p>
     */
    private String latestSessionActionId;
    /**
     * <p>
     * The task parameters.
     * </p>
     */
    private java.util.Map<String, TaskParameterValue> parameters;
    /**
     * <p>
     * The run status of the task.
     * </p>
     */
    private String runStatus;
    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The run status on which the started.
     * </p>
     */
    private String targetRunStatus;
    /**
     * <p>
     * The task ID.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @return The date and time the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @return The user or system that created this resource.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @param endedAt
     *        The date and time the resource ended running.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @return The date and time the resource ended running.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     * 
     * @param endedAt
     *        The date and time the resource ended running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The number of times that the task failed and was retried.
     * </p>
     * 
     * @param failureRetryCount
     *        The number of times that the task failed and was retried.
     */

    public void setFailureRetryCount(Integer failureRetryCount) {
        this.failureRetryCount = failureRetryCount;
    }

    /**
     * <p>
     * The number of times that the task failed and was retried.
     * </p>
     * 
     * @return The number of times that the task failed and was retried.
     */

    public Integer getFailureRetryCount() {
        return this.failureRetryCount;
    }

    /**
     * <p>
     * The number of times that the task failed and was retried.
     * </p>
     * 
     * @param failureRetryCount
     *        The number of times that the task failed and was retried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withFailureRetryCount(Integer failureRetryCount) {
        setFailureRetryCount(failureRetryCount);
        return this;
    }

    /**
     * <p>
     * The latest session action for the task.
     * </p>
     * 
     * @param latestSessionActionId
     *        The latest session action for the task.
     */

    public void setLatestSessionActionId(String latestSessionActionId) {
        this.latestSessionActionId = latestSessionActionId;
    }

    /**
     * <p>
     * The latest session action for the task.
     * </p>
     * 
     * @return The latest session action for the task.
     */

    public String getLatestSessionActionId() {
        return this.latestSessionActionId;
    }

    /**
     * <p>
     * The latest session action for the task.
     * </p>
     * 
     * @param latestSessionActionId
     *        The latest session action for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withLatestSessionActionId(String latestSessionActionId) {
        setLatestSessionActionId(latestSessionActionId);
        return this;
    }

    /**
     * <p>
     * The task parameters.
     * </p>
     * 
     * @return The task parameters.
     */

    public java.util.Map<String, TaskParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The task parameters.
     * </p>
     * 
     * @param parameters
     *        The task parameters.
     */

    public void setParameters(java.util.Map<String, TaskParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The task parameters.
     * </p>
     * 
     * @param parameters
     *        The task parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withParameters(java.util.Map<String, TaskParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see TaskSummary#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary addParametersEntry(String key, TaskParameterValue value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, TaskParameterValue>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The run status of the task.
     * </p>
     * 
     * @param runStatus
     *        The run status of the task.
     * @see TaskRunStatus
     */

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    /**
     * <p>
     * The run status of the task.
     * </p>
     * 
     * @return The run status of the task.
     * @see TaskRunStatus
     */

    public String getRunStatus() {
        return this.runStatus;
    }

    /**
     * <p>
     * The run status of the task.
     * </p>
     * 
     * @param runStatus
     *        The run status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public TaskSummary withRunStatus(String runStatus) {
        setRunStatus(runStatus);
        return this;
    }

    /**
     * <p>
     * The run status of the task.
     * </p>
     * 
     * @param runStatus
     *        The run status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public TaskSummary withRunStatus(TaskRunStatus runStatus) {
        this.runStatus = runStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @param startedAt
     *        The date and time the resource started running.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @return The date and time the resource started running.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     * 
     * @param startedAt
     *        The date and time the resource started running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The run status on which the started.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status on which the started.
     * @see TaskTargetRunStatus
     */

    public void setTargetRunStatus(String targetRunStatus) {
        this.targetRunStatus = targetRunStatus;
    }

    /**
     * <p>
     * The run status on which the started.
     * </p>
     * 
     * @return The run status on which the started.
     * @see TaskTargetRunStatus
     */

    public String getTargetRunStatus() {
        return this.targetRunStatus;
    }

    /**
     * <p>
     * The run status on which the started.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status on which the started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTargetRunStatus
     */

    public TaskSummary withTargetRunStatus(String targetRunStatus) {
        setTargetRunStatus(targetRunStatus);
        return this;
    }

    /**
     * <p>
     * The run status on which the started.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status on which the started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTargetRunStatus
     */

    public TaskSummary withTargetRunStatus(TaskTargetRunStatus targetRunStatus) {
        this.targetRunStatus = targetRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @return The task ID.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSummary withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getFailureRetryCount() != null)
            sb.append("FailureRetryCount: ").append(getFailureRetryCount()).append(",");
        if (getLatestSessionActionId() != null)
            sb.append("LatestSessionActionId: ").append(getLatestSessionActionId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getRunStatus() != null)
            sb.append("RunStatus: ").append(getRunStatus()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getTargetRunStatus() != null)
            sb.append("TargetRunStatus: ").append(getTargetRunStatus()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskSummary == false)
            return false;
        TaskSummary other = (TaskSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getFailureRetryCount() == null ^ this.getFailureRetryCount() == null)
            return false;
        if (other.getFailureRetryCount() != null && other.getFailureRetryCount().equals(this.getFailureRetryCount()) == false)
            return false;
        if (other.getLatestSessionActionId() == null ^ this.getLatestSessionActionId() == null)
            return false;
        if (other.getLatestSessionActionId() != null && other.getLatestSessionActionId().equals(this.getLatestSessionActionId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getRunStatus() == null ^ this.getRunStatus() == null)
            return false;
        if (other.getRunStatus() != null && other.getRunStatus().equals(this.getRunStatus()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getTargetRunStatus() == null ^ this.getTargetRunStatus() == null)
            return false;
        if (other.getTargetRunStatus() != null && other.getTargetRunStatus().equals(this.getTargetRunStatus()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getFailureRetryCount() == null) ? 0 : getFailureRetryCount().hashCode());
        hashCode = prime * hashCode + ((getLatestSessionActionId() == null) ? 0 : getLatestSessionActionId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getRunStatus() == null) ? 0 : getRunStatus().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getTargetRunStatus() == null) ? 0 : getTargetRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public TaskSummary clone() {
        try {
            return (TaskSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.TaskSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
