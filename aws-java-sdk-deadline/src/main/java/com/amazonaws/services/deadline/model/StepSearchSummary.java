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
 * The details of a step search.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StepSearchSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepSearchSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
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
     * The step name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The parameters and combination expressions for the search.
     * </p>
     */
    private ParameterSpace parameterSpace;
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
     * The step ID.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The task status to start with on the job.
     * </p>
     */
    private String targetTaskRunStatus;
    /**
     * <p>
     * The task run status for the job.
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

    public StepSearchSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public StepSearchSummary withEndedAt(java.util.Date endedAt) {
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

    public StepSearchSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The life cycle status.
     * </p>
     * 
     * @param lifecycleStatus
     *        The life cycle status.
     * @see StepLifecycleStatus
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
     * @see StepLifecycleStatus
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
     * @see StepLifecycleStatus
     */

    public StepSearchSummary withLifecycleStatus(String lifecycleStatus) {
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
     * @see StepLifecycleStatus
     */

    public StepSearchSummary withLifecycleStatus(StepLifecycleStatus lifecycleStatus) {
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

    public StepSearchSummary withLifecycleStatusMessage(String lifecycleStatusMessage) {
        setLifecycleStatusMessage(lifecycleStatusMessage);
        return this;
    }

    /**
     * <p>
     * The step name.
     * </p>
     * 
     * @param name
     *        The step name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The step name.
     * </p>
     * 
     * @return The step name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The step name.
     * </p>
     * 
     * @param name
     *        The step name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepSearchSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The parameters and combination expressions for the search.
     * </p>
     * 
     * @param parameterSpace
     *        The parameters and combination expressions for the search.
     */

    public void setParameterSpace(ParameterSpace parameterSpace) {
        this.parameterSpace = parameterSpace;
    }

    /**
     * <p>
     * The parameters and combination expressions for the search.
     * </p>
     * 
     * @return The parameters and combination expressions for the search.
     */

    public ParameterSpace getParameterSpace() {
        return this.parameterSpace;
    }

    /**
     * <p>
     * The parameters and combination expressions for the search.
     * </p>
     * 
     * @param parameterSpace
     *        The parameters and combination expressions for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepSearchSummary withParameterSpace(ParameterSpace parameterSpace) {
        setParameterSpace(parameterSpace);
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

    public StepSearchSummary withQueueId(String queueId) {
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

    public StepSearchSummary withStartedAt(java.util.Date startedAt) {
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

    public StepSearchSummary withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The task status to start with on the job.
     * </p>
     * 
     * @param targetTaskRunStatus
     *        The task status to start with on the job.
     * @see StepTargetTaskRunStatus
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
     * @see StepTargetTaskRunStatus
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
     * @see StepTargetTaskRunStatus
     */

    public StepSearchSummary withTargetTaskRunStatus(String targetTaskRunStatus) {
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
     * @see StepTargetTaskRunStatus
     */

    public StepSearchSummary withTargetTaskRunStatus(StepTargetTaskRunStatus targetTaskRunStatus) {
        this.targetTaskRunStatus = targetTaskRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The task run status for the job.
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
     *        The task run status for the job.</p>
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
     * The task run status for the job.
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
     * @return The task run status for the job.</p>
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
     * The task run status for the job.
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
     *        The task run status for the job.</p>
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

    public StepSearchSummary withTaskRunStatus(String taskRunStatus) {
        setTaskRunStatus(taskRunStatus);
        return this;
    }

    /**
     * <p>
     * The task run status for the job.
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
     *        The task run status for the job.</p>
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

    public StepSearchSummary withTaskRunStatus(TaskRunStatus taskRunStatus) {
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

    public StepSearchSummary withTaskRunStatusCounts(java.util.Map<String, Integer> taskRunStatusCounts) {
        setTaskRunStatusCounts(taskRunStatusCounts);
        return this;
    }

    /**
     * Add a single TaskRunStatusCounts entry
     *
     * @see StepSearchSummary#withTaskRunStatusCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StepSearchSummary addTaskRunStatusCountsEntry(String key, Integer value) {
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

    public StepSearchSummary clearTaskRunStatusCountsEntries() {
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
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getLifecycleStatus() != null)
            sb.append("LifecycleStatus: ").append(getLifecycleStatus()).append(",");
        if (getLifecycleStatusMessage() != null)
            sb.append("LifecycleStatusMessage: ").append(getLifecycleStatusMessage()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParameterSpace() != null)
            sb.append("ParameterSpace: ").append(getParameterSpace()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
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

        if (obj instanceof StepSearchSummary == false)
            return false;
        StepSearchSummary other = (StepSearchSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameterSpace() == null ^ this.getParameterSpace() == null)
            return false;
        if (other.getParameterSpace() != null && other.getParameterSpace().equals(this.getParameterSpace()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
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
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatus() == null) ? 0 : getLifecycleStatus().hashCode());
        hashCode = prime * hashCode + ((getLifecycleStatusMessage() == null) ? 0 : getLifecycleStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameterSpace() == null) ? 0 : getParameterSpace().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getTargetTaskRunStatus() == null) ? 0 : getTargetTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatus() == null) ? 0 : getTaskRunStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskRunStatusCounts() == null) ? 0 : getTaskRunStatusCounts().hashCode());
        return hashCode;
    }

    @Override
    public StepSearchSummary clone() {
        try {
            return (StepSearchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StepSearchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
