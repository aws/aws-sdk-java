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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The farm ID of the job to update.
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
     * The status of a job in its lifecycle.
     * </p>
     */
    private String lifecycleStatus;
    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     */
    private Integer maxFailedTasksCount;
    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     */
    private Integer maxRetriesPerTask;
    /**
     * <p>
     * The job priority to update.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The queue ID of the job to update.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The task status to update the job's tasks to.
     * </p>
     */
    private String targetTaskRunStatus;

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

    public UpdateJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The farm ID of the job to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the job to update.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the job to update.
     * </p>
     * 
     * @return The farm ID of the job to update.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the job to update.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the job to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withFarmId(String farmId) {
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

    public UpdateJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status of a job in its lifecycle.
     * </p>
     * 
     * @param lifecycleStatus
     *        The status of a job in its lifecycle.
     * @see UpdateJobLifecycleStatus
     */

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    /**
     * <p>
     * The status of a job in its lifecycle.
     * </p>
     * 
     * @return The status of a job in its lifecycle.
     * @see UpdateJobLifecycleStatus
     */

    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    /**
     * <p>
     * The status of a job in its lifecycle.
     * </p>
     * 
     * @param lifecycleStatus
     *        The status of a job in its lifecycle.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateJobLifecycleStatus
     */

    public UpdateJobRequest withLifecycleStatus(String lifecycleStatus) {
        setLifecycleStatus(lifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The status of a job in its lifecycle.
     * </p>
     * 
     * @param lifecycleStatus
     *        The status of a job in its lifecycle.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateJobLifecycleStatus
     */

    public UpdateJobRequest withLifecycleStatus(UpdateJobLifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     * 
     * @param maxFailedTasksCount
     *        The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     */

    public void setMaxFailedTasksCount(Integer maxFailedTasksCount) {
        this.maxFailedTasksCount = maxFailedTasksCount;
    }

    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     * 
     * @return The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     */

    public Integer getMaxFailedTasksCount() {
        return this.maxFailedTasksCount;
    }

    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     * 
     * @param maxFailedTasksCount
     *        The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withMaxFailedTasksCount(Integer maxFailedTasksCount) {
        setMaxFailedTasksCount(maxFailedTasksCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     * 
     * @param maxRetriesPerTask
     *        The maximum number of retries for a job.
     */

    public void setMaxRetriesPerTask(Integer maxRetriesPerTask) {
        this.maxRetriesPerTask = maxRetriesPerTask;
    }

    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     * 
     * @return The maximum number of retries for a job.
     */

    public Integer getMaxRetriesPerTask() {
        return this.maxRetriesPerTask;
    }

    /**
     * <p>
     * The maximum number of retries for a job.
     * </p>
     * 
     * @param maxRetriesPerTask
     *        The maximum number of retries for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withMaxRetriesPerTask(Integer maxRetriesPerTask) {
        setMaxRetriesPerTask(maxRetriesPerTask);
        return this;
    }

    /**
     * <p>
     * The job priority to update.
     * </p>
     * 
     * @param priority
     *        The job priority to update.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The job priority to update.
     * </p>
     * 
     * @return The job priority to update.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The job priority to update.
     * </p>
     * 
     * @param priority
     *        The job priority to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The queue ID of the job to update.
     * </p>
     * 
     * @param queueId
     *        The queue ID of the job to update.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID of the job to update.
     * </p>
     * 
     * @return The queue ID of the job to update.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID of the job to update.
     * </p>
     * 
     * @param queueId
     *        The queue ID of the job to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The task status to update the job's tasks to.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status to update the job's tasks to.
     * @see JobTargetTaskRunStatus
     */

    public void setTargetTaskRunStatus(String targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status to update the job's tasks to.
     * </p>
     * 
     * @return The task status to update the job's tasks to.
     * @see JobTargetTaskRunStatus
     */

    public String getTargetTaskRunStatus() {
        return this.targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status to update the job's tasks to.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status to update the job's tasks to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTargetTaskRunStatus
     */

    public UpdateJobRequest withTargetTaskRunStatus(String targetTaskRunStatus) {
        setTargetTaskRunStatus(targetTaskRunStatus);
        return this;
    }

    /**
     * <p>
     * The task status to update the job's tasks to.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status to update the job's tasks to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTargetTaskRunStatus
     */

    public UpdateJobRequest withTargetTaskRunStatus(JobTargetTaskRunStatus targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus.toString();
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
        if (getLifecycleStatus() != null)
            sb.append("LifecycleStatus: ").append(getLifecycleStatus()).append(",");
        if (getMaxFailedTasksCount() != null)
            sb.append("MaxFailedTasksCount: ").append(getMaxFailedTasksCount()).append(",");
        if (getMaxRetriesPerTask() != null)
            sb.append("MaxRetriesPerTask: ").append(getMaxRetriesPerTask()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getTargetTaskRunStatus() != null)
            sb.append("TargetTaskRunStatus: ").append(getTargetTaskRunStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobRequest == false)
            return false;
        UpdateJobRequest other = (UpdateJobRequest) obj;
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
        if (other.getLifecycleStatus() == null ^ this.getLifecycleStatus() == null)
            return false;
        if (other.getLifecycleStatus() != null && other.getLifecycleStatus().equals(this.getLifecycleStatus()) == false)
            return false;
        if (other.getMaxFailedTasksCount() == null ^ this.getMaxFailedTasksCount() == null)
            return false;
        if (other.getMaxFailedTasksCount() != null && other.getMaxFailedTasksCount().equals(this.getMaxFailedTasksCount()) == false)
            return false;
        if (other.getMaxRetriesPerTask() == null ^ this.getMaxRetriesPerTask() == null)
            return false;
        if (other.getMaxRetriesPerTask() != null && other.getMaxRetriesPerTask().equals(this.getMaxRetriesPerTask()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getTargetTaskRunStatus() == null ^ this.getTargetTaskRunStatus() == null)
            return false;
        if (other.getTargetTaskRunStatus() != null && other.getTargetTaskRunStatus().equals(this.getTargetTaskRunStatus()) == false)
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
        hashCode = prime * hashCode + ((getLifecycleStatus() == null) ? 0 : getLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxFailedTasksCount() == null) ? 0 : getMaxFailedTasksCount().hashCode());
        hashCode = prime * hashCode + ((getMaxRetriesPerTask() == null) ? 0 : getMaxRetriesPerTask().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getTargetTaskRunStatus() == null) ? 0 : getTargetTaskRunStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobRequest clone() {
        return (UpdateJobRequest) super.clone();
    }

}
