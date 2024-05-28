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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The farm ID to update.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job ID to update.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The queue ID to update.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The step ID to update.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The run status with which to start the task.
     * </p>
     */
    private String targetRunStatus;
    /**
     * <p>
     * The task ID to update.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @return The farm ID to update.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job ID to update.
     * </p>
     * 
     * @param jobId
     *        The job ID to update.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID to update.
     * </p>
     * 
     * @return The job ID to update.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID to update.
     * </p>
     * 
     * @param jobId
     *        The job ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The queue ID to update.
     * </p>
     * 
     * @param queueId
     *        The queue ID to update.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID to update.
     * </p>
     * 
     * @return The queue ID to update.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID to update.
     * </p>
     * 
     * @param queueId
     *        The queue ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The step ID to update.
     * </p>
     * 
     * @param stepId
     *        The step ID to update.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID to update.
     * </p>
     * 
     * @return The step ID to update.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID to update.
     * </p>
     * 
     * @param stepId
     *        The step ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The run status with which to start the task.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status with which to start the task.
     * @see TaskTargetRunStatus
     */

    public void setTargetRunStatus(String targetRunStatus) {
        this.targetRunStatus = targetRunStatus;
    }

    /**
     * <p>
     * The run status with which to start the task.
     * </p>
     * 
     * @return The run status with which to start the task.
     * @see TaskTargetRunStatus
     */

    public String getTargetRunStatus() {
        return this.targetRunStatus;
    }

    /**
     * <p>
     * The run status with which to start the task.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status with which to start the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTargetRunStatus
     */

    public UpdateTaskRequest withTargetRunStatus(String targetRunStatus) {
        setTargetRunStatus(targetRunStatus);
        return this;
    }

    /**
     * <p>
     * The run status with which to start the task.
     * </p>
     * 
     * @param targetRunStatus
     *        The run status with which to start the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTargetRunStatus
     */

    public UpdateTaskRequest withTargetRunStatus(TaskTargetRunStatus targetRunStatus) {
        this.targetRunStatus = targetRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The task ID to update.
     * </p>
     * 
     * @param taskId
     *        The task ID to update.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task ID to update.
     * </p>
     * 
     * @return The task ID to update.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task ID to update.
     * </p>
     * 
     * @param taskId
     *        The task ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTaskRequest withTaskId(String taskId) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
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

        if (obj instanceof UpdateTaskRequest == false)
            return false;
        UpdateTaskRequest other = (UpdateTaskRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getTargetRunStatus() == null) ? 0 : getTargetRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTaskRequest clone() {
        return (UpdateTaskRequest) super.clone();
    }

}
