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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The attachments for the job.
     * </p>
     */
    private Attachments attachments;
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
     * The description of the job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time the resource ended running.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The life cycle status for the job.
     * </p>
     */
    private String lifecycleStatus;
    /**
     * <p>
     * A message that communicates the status of the life cycle for the job.
     * </p>
     */
    private String lifecycleStatusMessage;
    /**
     * <p>
     * The number of task failures before the job stops running and is marked as <code>FAILED</code>.
     * </p>
     */
    private Integer maxFailedTasksCount;
    /**
     * <p>
     * The maximum number of retries per failed tasks.
     * </p>
     */
    private Integer maxRetriesPerTask;
    /**
     * <p>
     * The name of the job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The parameters for the job.
     * </p>
     */
    private java.util.Map<String, JobParameter> parameters;
    /**
     * <p>
     * The job priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The storage profile ID associated with the job.
     * </p>
     */
    private String storageProfileId;
    /**
     * <p>
     * The task status with which the job started.
     * </p>
     */
    private String targetTaskRunStatus;
    /**
     * <p>
     * The task run status for the job.
     * </p>
     */
    private String taskRunStatus;
    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     */
    private java.util.Map<String, Integer> taskRunStatusCounts;
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
     * The attachments for the job.
     * </p>
     * 
     * @param attachments
     *        The attachments for the job.
     */

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    /**
     * <p>
     * The attachments for the job.
     * </p>
     * 
     * @return The attachments for the job.
     */

    public Attachments getAttachments() {
        return this.attachments;
    }

    /**
     * <p>
     * The attachments for the job.
     * </p>
     * 
     * @param attachments
     *        The attachments for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withAttachments(Attachments attachments) {
        setAttachments(attachments);
        return this;
    }

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

    public GetJobResult withCreatedAt(java.util.Date createdAt) {
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

    public GetJobResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The description of the job.
     * </p>
     * 
     * @param description
     *        The description of the job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the job.
     * </p>
     * 
     * @return The description of the job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the job.
     * </p>
     * 
     * @param description
     *        The description of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withDescription(String description) {
        setDescription(description);
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

    public GetJobResult withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
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

    public GetJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The life cycle status for the job.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status for the job.
     * @see JobLifecycleStatus
     */

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status for the job.
     * </p>
     * 
     * @return The life cycle status for the job.
     * @see JobLifecycleStatus
     */

    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status for the job.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobLifecycleStatus
     */

    public GetJobResult withLifecycleStatus(String lifecycleStatus) {
        setLifecycleStatus(lifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status for the job.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobLifecycleStatus
     */

    public GetJobResult withLifecycleStatus(JobLifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message that communicates the status of the life cycle for the job.
     * </p>
     * 
     * @param lifecycleStatusMessage
     *        A message that communicates the status of the life cycle for the job.
     */

    public void setLifecycleStatusMessage(String lifecycleStatusMessage) {
        this.lifecycleStatusMessage = lifecycleStatusMessage;
    }

    /**
     * <p>
     * A message that communicates the status of the life cycle for the job.
     * </p>
     * 
     * @return A message that communicates the status of the life cycle for the job.
     */

    public String getLifecycleStatusMessage() {
        return this.lifecycleStatusMessage;
    }

    /**
     * <p>
     * A message that communicates the status of the life cycle for the job.
     * </p>
     * 
     * @param lifecycleStatusMessage
     *        A message that communicates the status of the life cycle for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withLifecycleStatusMessage(String lifecycleStatusMessage) {
        setLifecycleStatusMessage(lifecycleStatusMessage);
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

    public GetJobResult withMaxFailedTasksCount(Integer maxFailedTasksCount) {
        setMaxFailedTasksCount(maxFailedTasksCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of retries per failed tasks.
     * </p>
     * 
     * @param maxRetriesPerTask
     *        The maximum number of retries per failed tasks.
     */

    public void setMaxRetriesPerTask(Integer maxRetriesPerTask) {
        this.maxRetriesPerTask = maxRetriesPerTask;
    }

    /**
     * <p>
     * The maximum number of retries per failed tasks.
     * </p>
     * 
     * @return The maximum number of retries per failed tasks.
     */

    public Integer getMaxRetriesPerTask() {
        return this.maxRetriesPerTask;
    }

    /**
     * <p>
     * The maximum number of retries per failed tasks.
     * </p>
     * 
     * @param maxRetriesPerTask
     *        The maximum number of retries per failed tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withMaxRetriesPerTask(Integer maxRetriesPerTask) {
        setMaxRetriesPerTask(maxRetriesPerTask);
        return this;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param name
     *        The name of the job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @return The name of the job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param name
     *        The name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The parameters for the job.
     * </p>
     * 
     * @return The parameters for the job.
     */

    public java.util.Map<String, JobParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the job.
     * </p>
     * 
     * @param parameters
     *        The parameters for the job.
     */

    public void setParameters(java.util.Map<String, JobParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the job.
     * </p>
     * 
     * @param parameters
     *        The parameters for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withParameters(java.util.Map<String, JobParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see GetJobResult#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult addParametersEntry(String key, JobParameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, JobParameter>();
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

    public GetJobResult clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The job priority.
     * </p>
     * 
     * @param priority
     *        The job priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The job priority.
     * </p>
     * 
     * @return The job priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The job priority.
     * </p>
     * 
     * @param priority
     *        The job priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withPriority(Integer priority) {
        setPriority(priority);
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

    public GetJobResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The storage profile ID associated with the job.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID associated with the job.
     */

    public void setStorageProfileId(String storageProfileId) {
        this.storageProfileId = storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID associated with the job.
     * </p>
     * 
     * @return The storage profile ID associated with the job.
     */

    public String getStorageProfileId() {
        return this.storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID associated with the job.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withStorageProfileId(String storageProfileId) {
        setStorageProfileId(storageProfileId);
        return this;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status with which the job started.
     * @see JobTargetTaskRunStatus
     */

    public void setTargetTaskRunStatus(String targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @return The task status with which the job started.
     * @see JobTargetTaskRunStatus
     */

    public String getTargetTaskRunStatus() {
        return this.targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status with which the job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTargetTaskRunStatus
     */

    public GetJobResult withTargetTaskRunStatus(String targetTaskRunStatus) {
        setTargetTaskRunStatus(targetTaskRunStatus);
        return this;
    }

    /**
     * <p>
     * The task status with which the job started.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status with which the job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTargetTaskRunStatus
     */

    public GetJobResult withTargetTaskRunStatus(JobTargetTaskRunStatus targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @param taskRunStatus
     *        The task run status for the job.
     * @see TaskRunStatus
     */

    public void setTaskRunStatus(String taskRunStatus) {
        this.taskRunStatus = taskRunStatus;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @return The task run status for the job.
     * @see TaskRunStatus
     */

    public String getTaskRunStatus() {
        return this.taskRunStatus;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @param taskRunStatus
     *        The task run status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public GetJobResult withTaskRunStatus(String taskRunStatus) {
        setTaskRunStatus(taskRunStatus);
        return this;
    }

    /**
     * <p>
     * The task run status for the job.
     * </p>
     * 
     * @param taskRunStatus
     *        The task run status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public GetJobResult withTaskRunStatus(TaskRunStatus taskRunStatus) {
        this.taskRunStatus = taskRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     * 
     * @return The number of tasks running on the job.
     */

    public java.util.Map<String, Integer> getTaskRunStatusCounts() {
        return taskRunStatusCounts;
    }

    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     * 
     * @param taskRunStatusCounts
     *        The number of tasks running on the job.
     */

    public void setTaskRunStatusCounts(java.util.Map<String, Integer> taskRunStatusCounts) {
        this.taskRunStatusCounts = taskRunStatusCounts;
    }

    /**
     * <p>
     * The number of tasks running on the job.
     * </p>
     * 
     * @param taskRunStatusCounts
     *        The number of tasks running on the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult withTaskRunStatusCounts(java.util.Map<String, Integer> taskRunStatusCounts) {
        setTaskRunStatusCounts(taskRunStatusCounts);
        return this;
    }

    /**
     * Add a single TaskRunStatusCounts entry
     *
     * @see GetJobResult#withTaskRunStatusCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult addTaskRunStatusCountsEntry(String key, Integer value) {
        if (null == this.taskRunStatusCounts) {
            this.taskRunStatusCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.taskRunStatusCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.taskRunStatusCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TaskRunStatusCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJobResult clearTaskRunStatusCountsEntries() {
        this.taskRunStatusCounts = null;
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

    public GetJobResult withUpdatedAt(java.util.Date updatedAt) {
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

    public GetJobResult withUpdatedBy(String updatedBy) {
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
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getLifecycleStatus() != null)
            sb.append("LifecycleStatus: ").append(getLifecycleStatus()).append(",");
        if (getLifecycleStatusMessage() != null)
            sb.append("LifecycleStatusMessage: ").append(getLifecycleStatusMessage()).append(",");
        if (getMaxFailedTasksCount() != null)
            sb.append("MaxFailedTasksCount: ").append(getMaxFailedTasksCount()).append(",");
        if (getMaxRetriesPerTask() != null)
            sb.append("MaxRetriesPerTask: ").append(getMaxRetriesPerTask()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStorageProfileId() != null)
            sb.append("StorageProfileId: ").append(getStorageProfileId()).append(",");
        if (getTargetTaskRunStatus() != null)
            sb.append("TargetTaskRunStatus: ").append(getTargetTaskRunStatus()).append(",");
        if (getTaskRunStatus() != null)
            sb.append("TaskRunStatus: ").append(getTaskRunStatus()).append(",");
        if (getTaskRunStatusCounts() != null)
            sb.append("TaskRunStatusCounts: ").append(getTaskRunStatusCounts()).append(",");
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

        if (obj instanceof GetJobResult == false)
            return false;
        GetJobResult other = (GetJobResult) obj;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getLifecycleStatus() == null ^ this.getLifecycleStatus() == null)
            return false;
        if (other.getLifecycleStatus() != null && other.getLifecycleStatus().equals(this.getLifecycleStatus()) == false)
            return false;
        if (other.getLifecycleStatusMessage() == null ^ this.getLifecycleStatusMessage() == null)
            return false;
        if (other.getLifecycleStatusMessage() != null && other.getLifecycleStatusMessage().equals(this.getLifecycleStatusMessage()) == false)
            return false;
        if (other.getMaxFailedTasksCount() == null ^ this.getMaxFailedTasksCount() == null)
            return false;
        if (other.getMaxFailedTasksCount() != null && other.getMaxFailedTasksCount().equals(this.getMaxFailedTasksCount()) == false)
            return false;
        if (other.getMaxRetriesPerTask() == null ^ this.getMaxRetriesPerTask() == null)
            return false;
        if (other.getMaxRetriesPerTask() != null && other.getMaxRetriesPerTask().equals(this.getMaxRetriesPerTask()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStorageProfileId() == null ^ this.getStorageProfileId() == null)
            return false;
        if (other.getStorageProfileId() != null && other.getStorageProfileId().equals(this.getStorageProfileId()) == false)
            return false;
        if (other.getTargetTaskRunStatus() == null ^ this.getTargetTaskRunStatus() == null)
            return false;
        if (other.getTargetTaskRunStatus() != null && other.getTargetTaskRunStatus().equals(this.getTargetTaskRunStatus()) == false)
            return false;
        if (other.getTaskRunStatus() == null ^ this.getTaskRunStatus() == null)
            return false;
        if (other.getTaskRunStatus() != null && other.getTaskRunStatus().equals(this.getTaskRunStatus()) == false)
            return false;
        if (other.getTaskRunStatusCounts() == null ^ this.getTaskRunStatusCounts() == null)
            return false;
        if (other.getTaskRunStatusCounts() != null && other.getTaskRunStatusCounts().equals(this.getTaskRunStatusCounts()) == false)
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

        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatus() == null) ? 0 : getLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatusMessage() == null) ? 0 : getLifecycleStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getMaxFailedTasksCount() == null) ? 0 : getMaxFailedTasksCount().hashCode());
        hashCode = prime * hashCode + ((getMaxRetriesPerTask() == null) ? 0 : getMaxRetriesPerTask().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        hashCode = prime * hashCode + ((getTargetTaskRunStatus() == null) ? 0 : getTargetTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatus() == null) ? 0 : getTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatusCounts() == null) ? 0 : getTaskRunStatusCounts().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GetJobResult clone() {
        try {
            return (GetJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
