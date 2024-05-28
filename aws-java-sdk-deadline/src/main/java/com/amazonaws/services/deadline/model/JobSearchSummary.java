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
 * The details of a job search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/JobSearchSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSearchSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The job parameters.
     * </p>
     */
    private java.util.Map<String, JobParameter> jobParameters;
    /**
     * <p>
     * The life cycle status.
     * </p>
     */
    private String lifecycleStatus;
    /**
     * <p>
     * The life cycle status message.
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
     * The maximum number of retries for a job.
     * </p>
     */
    private Integer maxRetriesPerTask;
    /**
     * <p>
     * The job name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The job priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The queue ID.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The date and time the resource started running.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The task status to start with on the job.
     * </p>
     */
    private String targetTaskRunStatus;
    /**
     * <p>
     * task run status for the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>–pending and waiting for resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code>–ready to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code>–assigned and will run next on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code>–scheduled to be run on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERRUPTING</code>–being interrupted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>–running on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>–the task is suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>–the task has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>–the task has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>–the task has succeeded.
     * </p>
     * </li>
     * </ul>
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

    public JobSearchSummary withCreatedAt(java.util.Date createdAt) {
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

    public JobSearchSummary withCreatedBy(String createdBy) {
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

    public JobSearchSummary withEndedAt(java.util.Date endedAt) {
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

    public JobSearchSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The job parameters.
     * </p>
     * 
     * @return The job parameters.
     */

    public java.util.Map<String, JobParameter> getJobParameters() {
        return jobParameters;
    }

    /**
     * <p>
     * The job parameters.
     * </p>
     * 
     * @param jobParameters
     *        The job parameters.
     */

    public void setJobParameters(java.util.Map<String, JobParameter> jobParameters) {
        this.jobParameters = jobParameters;
    }

    /**
     * <p>
     * The job parameters.
     * </p>
     * 
     * @param jobParameters
     *        The job parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSearchSummary withJobParameters(java.util.Map<String, JobParameter> jobParameters) {
        setJobParameters(jobParameters);
        return this;
    }

    /**
     * Add a single JobParameters entry
     *
     * @see JobSearchSummary#withJobParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobSearchSummary addJobParametersEntry(String key, JobParameter value) {
        if (null == this.jobParameters) {
            this.jobParameters = new java.util.HashMap<String, JobParameter>();
        }
        if (this.jobParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.jobParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into JobParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSearchSummary clearJobParametersEntries() {
        this.jobParameters = null;
        return this;
    }

    /**
     * <p>
     * The life cycle status.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status.
     * @see JobLifecycleStatus
     */

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status.
     * </p>
     * 
     * @return The life cycle status.
     * @see JobLifecycleStatus
     */

    public String getLifecycleStatus() {
        return this.lifecycleStatus;
    }

    /**
     * <p>
     * The life cycle status.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobLifecycleStatus
     */

    public JobSearchSummary withLifecycleStatus(String lifecycleStatus) {
        setLifecycleStatus(lifecycleStatus);
        return this;
    }

    /**
     * <p>
     * The life cycle status.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobLifecycleStatus
     */

    public JobSearchSummary withLifecycleStatus(JobLifecycleStatus lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus.toString();
        return this;
    }

    /**
     * <p>
     * The life cycle status message.
     * </p>
     * 
     * @param lifecycleStatusMessage
     *        The life cycle status message.
     */

    public void setLifecycleStatusMessage(String lifecycleStatusMessage) {
        this.lifecycleStatusMessage = lifecycleStatusMessage;
    }

    /**
     * <p>
     * The life cycle status message.
     * </p>
     * 
     * @return The life cycle status message.
     */

    public String getLifecycleStatusMessage() {
        return this.lifecycleStatusMessage;
    }

    /**
     * <p>
     * The life cycle status message.
     * </p>
     * 
     * @param lifecycleStatusMessage
     *        The life cycle status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSearchSummary withLifecycleStatusMessage(String lifecycleStatusMessage) {
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

    public JobSearchSummary withMaxFailedTasksCount(Integer maxFailedTasksCount) {
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

    public JobSearchSummary withMaxRetriesPerTask(Integer maxRetriesPerTask) {
        setMaxRetriesPerTask(maxRetriesPerTask);
        return this;
    }

    /**
     * <p>
     * The job name.
     * </p>
     * 
     * @param name
     *        The job name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The job name.
     * </p>
     * 
     * @return The job name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The job name.
     * </p>
     * 
     * @param name
     *        The job name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSearchSummary withName(String name) {
        setName(name);
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

    public JobSearchSummary withPriority(Integer priority) {
        setPriority(priority);
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

    public JobSearchSummary withQueueId(String queueId) {
        setQueueId(queueId);
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

    public JobSearchSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The task status to start with on the job.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status to start with on the job.
     * @see JobTargetTaskRunStatus
     */

    public void setTargetTaskRunStatus(String targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status to start with on the job.
     * </p>
     * 
     * @return The task status to start with on the job.
     * @see JobTargetTaskRunStatus
     */

    public String getTargetTaskRunStatus() {
        return this.targetTaskRunStatus;
    }

    /**
     * <p>
     * The task status to start with on the job.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status to start with on the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTargetTaskRunStatus
     */

    public JobSearchSummary withTargetTaskRunStatus(String targetTaskRunStatus) {
        setTargetTaskRunStatus(targetTaskRunStatus);
        return this;
    }

    /**
     * <p>
     * The task status to start with on the job.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status to start with on the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobTargetTaskRunStatus
     */

    public JobSearchSummary withTargetTaskRunStatus(JobTargetTaskRunStatus targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * task run status for the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>–pending and waiting for resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code>–ready to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code>–assigned and will run next on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code>–scheduled to be run on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERRUPTING</code>–being interrupted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>–running on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>–the task is suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>–the task has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>–the task has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>–the task has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param taskRunStatus
     *        task run status for the job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>–pending and waiting for resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code>–ready to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSIGNED</code>–assigned and will run next on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED</code>–scheduled to be run on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERRUPTING</code>–being interrupted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>–running on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code>–the task is suspended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code>–the task has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>–the task has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>–the task has succeeded.
     *        </p>
     *        </li>
     * @see TaskRunStatus
     */

    public void setTaskRunStatus(String taskRunStatus) {
        this.taskRunStatus = taskRunStatus;
    }

    /**
     * <p>
     * task run status for the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>–pending and waiting for resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code>–ready to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code>–assigned and will run next on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code>–scheduled to be run on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERRUPTING</code>–being interrupted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>–running on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>–the task is suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>–the task has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>–the task has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>–the task has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @return task run status for the job.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code>–pending and waiting for resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READY</code>–ready to be processed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASSIGNED</code>–assigned and will run next on a worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SCHEDULED</code>–scheduled to be run on a worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTERRUPTING</code>–being interrupted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>–running on a worker.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUSPENDED</code>–the task is suspended.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELED</code>–the task has been canceled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>–the task has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>–the task has succeeded.
     *         </p>
     *         </li>
     * @see TaskRunStatus
     */

    public String getTaskRunStatus() {
        return this.taskRunStatus;
    }

    /**
     * <p>
     * task run status for the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>–pending and waiting for resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code>–ready to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code>–assigned and will run next on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code>–scheduled to be run on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERRUPTING</code>–being interrupted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>–running on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>–the task is suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>–the task has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>–the task has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>–the task has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param taskRunStatus
     *        task run status for the job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>–pending and waiting for resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code>–ready to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSIGNED</code>–assigned and will run next on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED</code>–scheduled to be run on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERRUPTING</code>–being interrupted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>–running on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code>–the task is suspended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code>–the task has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>–the task has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>–the task has succeeded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public JobSearchSummary withTaskRunStatus(String taskRunStatus) {
        setTaskRunStatus(taskRunStatus);
        return this;
    }

    /**
     * <p>
     * task run status for the job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>–pending and waiting for resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code>–ready to be processed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASSIGNED</code>–assigned and will run next on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULED</code>–scheduled to be run on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERRUPTING</code>–being interrupted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>–running on a worker.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>–the task is suspended.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELED</code>–the task has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>–the task has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>–the task has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param taskRunStatus
     *        task run status for the job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>–pending and waiting for resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code>–ready to be processed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASSIGNED</code>–assigned and will run next on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULED</code>–scheduled to be run on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERRUPTING</code>–being interrupted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>–running on a worker.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code>–the task is suspended.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELED</code>–the task has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>–the task has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>–the task has succeeded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskRunStatus
     */

    public JobSearchSummary withTaskRunStatus(TaskRunStatus taskRunStatus) {
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

    public JobSearchSummary withTaskRunStatusCounts(java.util.Map<String, Integer> taskRunStatusCounts) {
        setTaskRunStatusCounts(taskRunStatusCounts);
        return this;
    }

    /**
     * Add a single TaskRunStatusCounts entry
     *
     * @see JobSearchSummary#withTaskRunStatusCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobSearchSummary addTaskRunStatusCountsEntry(String key, Integer value) {
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

    public JobSearchSummary clearTaskRunStatusCountsEntries() {
        this.taskRunStatusCounts = null;
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobParameters() != null)
            sb.append("JobParameters: ").append("***Sensitive Data Redacted***").append(",");
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
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getTargetTaskRunStatus() != null)
            sb.append("TargetTaskRunStatus: ").append(getTargetTaskRunStatus()).append(",");
        if (getTaskRunStatus() != null)
            sb.append("TaskRunStatus: ").append(getTaskRunStatus()).append(",");
        if (getTaskRunStatusCounts() != null)
            sb.append("TaskRunStatusCounts: ").append(getTaskRunStatusCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSearchSummary == false)
            return false;
        JobSearchSummary other = (JobSearchSummary) obj;
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
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobParameters() == null ^ this.getJobParameters() == null)
            return false;
        if (other.getJobParameters() != null && other.getJobParameters().equals(this.getJobParameters()) == false)
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
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobParameters() == null) ? 0 : getJobParameters().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatus() == null) ? 0 : getLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatusMessage() == null) ? 0 : getLifecycleStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getMaxFailedTasksCount() == null) ? 0 : getMaxFailedTasksCount().hashCode());
        hashCode = prime * hashCode + ((getMaxRetriesPerTask() == null) ? 0 : getMaxRetriesPerTask().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getTargetTaskRunStatus() == null) ? 0 : getTargetTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatus() == null) ? 0 : getTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatusCounts() == null) ? 0 : getTaskRunStatusCounts().hashCode());
        return hashCode;
    }

    @Override
    public JobSearchSummary clone() {
        try {
            return (JobSearchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.JobSearchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
