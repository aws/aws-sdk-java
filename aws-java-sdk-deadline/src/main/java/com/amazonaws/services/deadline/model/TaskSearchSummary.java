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
 * The details of a task search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/TaskSearchSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSearchSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The parameters to search for.
     * </p>
     */
    private java.util.Map<String, TaskParameterValue> parameters;
    /**
     * <p>
     * The queue ID.
     * </p>
     */
    private String queueId;
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
     * The step ID.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The run status that the task is being updated to.
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

    public TaskSearchSummary withEndedAt(java.util.Date endedAt) {
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

    public TaskSearchSummary withFailureRetryCount(Integer failureRetryCount) {
        setFailureRetryCount(failureRetryCount);
        return this;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @return The job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSearchSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The parameters to search for.
     * </p>
     * 
     * @return The parameters to search for.
     */

    public java.util.Map<String, TaskParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters to search for.
     * </p>
     * 
     * @param parameters
     *        The parameters to search for.
     */

    public void setParameters(java.util.Map<String, TaskParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters to search for.
     * </p>
     * 
     * @param parameters
     *        The parameters to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSearchSummary withParameters(java.util.Map<String, TaskParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see TaskSearchSummary#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TaskSearchSummary addParametersEntry(String key, TaskParameterValue value) {
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

    public TaskSearchSummary clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @return The queue ID.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSearchSummary withQueueId(String queueId) {
        setQueueId(queueId);
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

    public TaskSearchSummary withRunStatus(String runStatus) {
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

    public TaskSearchSummary withRunStatus(TaskRunStatus runStatus) {
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

    public TaskSearchSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @return The step ID.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSearchSummary withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The run status that the task is being updated to.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status that the task is being updated to.
     * @see TaskTargetRunStatus
     */

    public void setTargetRunStatus(String targetRunStatus) {
        this.targetRunStatus = targetRunStatus;
    }

    /**
     * <p>
     * The run status that the task is being updated to.
     * </p>
     * 
     * @return The run status that the task is being updated to.
     * @see TaskTargetRunStatus
     */

    public String getTargetRunStatus() {
        return this.targetRunStatus;
    }

    /**
     * <p>
     * The run status that the task is being updated to.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status that the task is being updated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTargetRunStatus
     */

    public TaskSearchSummary withTargetRunStatus(String targetRunStatus) {
        setTargetRunStatus(targetRunStatus);
        return this;
    }

    /**
     * <p>
     * The run status that the task is being updated to.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status that the task is being updated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTargetRunStatus
     */

    public TaskSearchSummary withTargetRunStatus(TaskTargetRunStatus targetRunStatus) {
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

    public TaskSearchSummary withTaskId(String taskId) {
        setTaskId(taskId);
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
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getFailureRetryCount() != null)
            sb.append("FailureRetryCount: ").append(getFailureRetryCount()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getRunStatus() != null)
            sb.append("RunStatus: ").append(getRunStatus()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
        if (getTargetRunStatus() != null)
            sb.append("TargetRunStatus: ").append(getTargetRunStatus()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskSearchSummary == false)
            return false;
        TaskSearchSummary other = (TaskSearchSummary) obj;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getFailureRetryCount() == null ^ this.getFailureRetryCount() == null)
            return false;
        if (other.getFailureRetryCount() != null && other.getFailureRetryCount().equals(this.getFailureRetryCount()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getRunStatus() == null ^ this.getRunStatus() == null)
            return false;
        if (other.getRunStatus() != null && other.getRunStatus().equals(this.getRunStatus()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        if (other.getTargetRunStatus() == null ^ this.getTargetRunStatus() == null)
            return false;
        if (other.getTargetRunStatus() != null && other.getTargetRunStatus().equals(this.getTargetRunStatus()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getFailureRetryCount() == null) ? 0 : getFailureRetryCount().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getRunStatus() == null) ? 0 : getRunStatus().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getTargetRunStatus() == null) ? 0 : getTargetRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public TaskSearchSummary clone() {
        try {
            return (TaskSearchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.TaskSearchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
