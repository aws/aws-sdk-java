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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing an AWS Batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/JobDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The ID for the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
     * </p>
     */
    private String jobQueue;
    /**
     * <p>
     * The current status for the job.
     * </p>
     * <note>
     * <p>
     * If your jobs do not progress to <code>STARTING</code>, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs Stuck
     * in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * A list of job attempts associated with this job.
     * </p>
     */
    private java.util.List<AttemptDetail> attempts;
    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent
     * array jobs, this is when the job entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was
     * called). For array child jobs, this is when the child job was spawned by its parent and entered the
     * <code>PENDING</code> state.
     * </p>
     */
    private Long createdAt;
    /**
     * <p>
     * The retry strategy to use for this job if an attempt fails.
     * </p>
     */
    private RetryStrategy retryStrategy;
    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     */
    private Long startedAt;
    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the
     * <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     */
    private Long stoppedAt;
    /**
     * <p>
     * A list of job names or IDs on which this job depends.
     * </p>
     */
    private java.util.List<JobDependency> dependsOn;
    /**
     * <p>
     * The job definition that is used by this job.
     * </p>
     */
    private String jobDefinition;
    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders or override any
     * corresponding parameter defaults from the job definition.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     */
    private ContainerDetail container;
    /**
     * <p>
     * An object representing the details of a node that is associated with a multi-node parallel job.
     * </p>
     */
    private NodeDetails nodeDetails;
    /**
     * <p>
     * An object representing the node properties of a multi-node parallel job.
     * </p>
     */
    private NodeProperties nodeProperties;
    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     */
    private ArrayPropertiesDetail arrayProperties;
    /**
     * <p>
     * The timeout configuration for the job.
     * </p>
     */
    private JobTimeout timeout;

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @return The name of the job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @return The ID for the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job.
     * </p>
     * 
     * @param jobId
     *        The ID for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
     * </p>
     * 
     * @param jobQueue
     *        The Amazon Resource Name (ARN) of the job queue with which the job is associated.
     */

    public void setJobQueue(String jobQueue) {
        this.jobQueue = jobQueue;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the job queue with which the job is associated.
     */

    public String getJobQueue() {
        return this.jobQueue;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue with which the job is associated.
     * </p>
     * 
     * @param jobQueue
     *        The Amazon Resource Name (ARN) of the job queue with which the job is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withJobQueue(String jobQueue) {
        setJobQueue(jobQueue);
        return this;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <note>
     * <p>
     * If your jobs do not progress to <code>STARTING</code>, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs Stuck
     * in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param status
     *        The current status for the job. </p> <note>
     *        <p>
     *        If your jobs do not progress to <code>STARTING</code>, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs
     *        Stuck in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User
     *        Guide</i>.
     *        </p>
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <note>
     * <p>
     * If your jobs do not progress to <code>STARTING</code>, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs Stuck
     * in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The current status for the job. </p> <note>
     *         <p>
     *         If your jobs do not progress to <code>STARTING</code>, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs
     *         Stuck in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User
     *         Guide</i>.
     *         </p>
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <note>
     * <p>
     * If your jobs do not progress to <code>STARTING</code>, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs Stuck
     * in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param status
     *        The current status for the job. </p> <note>
     *        <p>
     *        If your jobs do not progress to <code>STARTING</code>, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs
     *        Stuck in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <note>
     * <p>
     * If your jobs do not progress to <code>STARTING</code>, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs Stuck
     * in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param status
     *        The current status for the job. </p> <note>
     *        <p>
     *        If your jobs do not progress to <code>STARTING</code>, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs
     *        Stuck in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User
     *        Guide</i>.
     *        </p>
     * @see JobStatus
     */

    public void setStatus(JobStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * <note>
     * <p>
     * If your jobs do not progress to <code>STARTING</code>, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs Stuck
     * in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User Guide</i>.
     * </p>
     * </note>
     * 
     * @param status
     *        The current status for the job. </p> <note>
     *        <p>
     *        If your jobs do not progress to <code>STARTING</code>, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable">Jobs
     *        Stuck in <code>RUNNABLE</code> Status</a> in the troubleshooting section of the <i>AWS Batch User
     *        Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobDetail withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of job attempts associated with this job.
     * </p>
     * 
     * @return A list of job attempts associated with this job.
     */

    public java.util.List<AttemptDetail> getAttempts() {
        return attempts;
    }

    /**
     * <p>
     * A list of job attempts associated with this job.
     * </p>
     * 
     * @param attempts
     *        A list of job attempts associated with this job.
     */

    public void setAttempts(java.util.Collection<AttemptDetail> attempts) {
        if (attempts == null) {
            this.attempts = null;
            return;
        }

        this.attempts = new java.util.ArrayList<AttemptDetail>(attempts);
    }

    /**
     * <p>
     * A list of job attempts associated with this job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttempts(java.util.Collection)} or {@link #withAttempts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param attempts
     *        A list of job attempts associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withAttempts(AttemptDetail... attempts) {
        if (this.attempts == null) {
            setAttempts(new java.util.ArrayList<AttemptDetail>(attempts.length));
        }
        for (AttemptDetail ele : attempts) {
            this.attempts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job attempts associated with this job.
     * </p>
     * 
     * @param attempts
     *        A list of job attempts associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withAttempts(java.util.Collection<AttemptDetail> attempts) {
        setAttempts(attempts);
        return this;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     * 
     * @return A short, human-readable string to provide additional details about the current status of the job.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent
     * array jobs, this is when the job entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was
     * called). For array child jobs, this is when the child job was spawned by its parent and entered the
     * <code>PENDING</code> state.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and
     *        parent array jobs, this is when the job entered the <code>SUBMITTED</code> state (at the time
     *        <a>SubmitJob</a> was called). For array child jobs, this is when the child job was spawned by its parent
     *        and entered the <code>PENDING</code> state.
     */

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent
     * array jobs, this is when the job entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was
     * called). For array child jobs, this is when the child job was spawned by its parent and entered the
     * <code>PENDING</code> state.
     * </p>
     * 
     * @return The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and
     *         parent array jobs, this is when the job entered the <code>SUBMITTED</code> state (at the time
     *         <a>SubmitJob</a> was called). For array child jobs, this is when the child job was spawned by its parent
     *         and entered the <code>PENDING</code> state.
     */

    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and parent
     * array jobs, this is when the job entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was
     * called). For array child jobs, this is when the child job was spawned by its parent and entered the
     * <code>PENDING</code> state.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp (in seconds and milliseconds) for when the job was created. For non-array jobs and
     *        parent array jobs, this is when the job entered the <code>SUBMITTED</code> state (at the time
     *        <a>SubmitJob</a> was called). For array child jobs, this is when the child job was spawned by its parent
     *        and entered the <code>PENDING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withCreatedAt(Long createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The retry strategy to use for this job if an attempt fails.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for this job if an attempt fails.
     */

    public void setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for this job if an attempt fails.
     * </p>
     * 
     * @return The retry strategy to use for this job if an attempt fails.
     */

    public RetryStrategy getRetryStrategy() {
        return this.retryStrategy;
    }

    /**
     * <p>
     * The retry strategy to use for this job if an attempt fails.
     * </p>
     * 
     * @param retryStrategy
     *        The retry strategy to use for this job if an attempt fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withRetryStrategy(RetryStrategy retryStrategy) {
        setRetryStrategy(retryStrategy);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned
     *        from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     */

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @return The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned
     *         from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     */

    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned from the
     * <code>STARTING</code> state to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the job was started (when the job transitioned
     *        from the <code>STARTING</code> state to the <code>RUNNING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withStartedAt(Long startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the
     * <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned
     *        from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *        <code>FAILED</code>).
     */

    public void setStoppedAt(Long stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the
     * <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @return The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned
     *         from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *         <code>FAILED</code>).
     */

    public Long getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned from the
     * <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp (in seconds and milliseconds) for when the job was stopped (when the job transitioned
     *        from the <code>RUNNING</code> state to a terminal state, such as <code>SUCCEEDED</code> or
     *        <code>FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withStoppedAt(Long stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * A list of job names or IDs on which this job depends.
     * </p>
     * 
     * @return A list of job names or IDs on which this job depends.
     */

    public java.util.List<JobDependency> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * A list of job names or IDs on which this job depends.
     * </p>
     * 
     * @param dependsOn
     *        A list of job names or IDs on which this job depends.
     */

    public void setDependsOn(java.util.Collection<JobDependency> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new java.util.ArrayList<JobDependency>(dependsOn);
    }

    /**
     * <p>
     * A list of job names or IDs on which this job depends.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        A list of job names or IDs on which this job depends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withDependsOn(JobDependency... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new java.util.ArrayList<JobDependency>(dependsOn.length));
        }
        for (JobDependency ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job names or IDs on which this job depends.
     * </p>
     * 
     * @param dependsOn
     *        A list of job names or IDs on which this job depends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withDependsOn(java.util.Collection<JobDependency> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    /**
     * <p>
     * The job definition that is used by this job.
     * </p>
     * 
     * @param jobDefinition
     *        The job definition that is used by this job.
     */

    public void setJobDefinition(String jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    /**
     * <p>
     * The job definition that is used by this job.
     * </p>
     * 
     * @return The job definition that is used by this job.
     */

    public String getJobDefinition() {
        return this.jobDefinition;
    }

    /**
     * <p>
     * The job definition that is used by this job.
     * </p>
     * 
     * @param jobDefinition
     *        The job definition that is used by this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withJobDefinition(String jobDefinition) {
        setJobDefinition(jobDefinition);
        return this;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders or override any
     * corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @return Additional parameters passed to the job that replace parameter substitution placeholders or override any
     *         corresponding parameter defaults from the job definition.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders or override any
     * corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @param parameters
     *        Additional parameters passed to the job that replace parameter substitution placeholders or override any
     *        corresponding parameter defaults from the job definition.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Additional parameters passed to the job that replace parameter substitution placeholders or override any
     * corresponding parameter defaults from the job definition.
     * </p>
     * 
     * @param parameters
     *        Additional parameters passed to the job that replace parameter substitution placeholders or override any
     *        corresponding parameter defaults from the job definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public JobDetail addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
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

    public JobDetail clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     * 
     * @param container
     *        An object representing the details of the container that is associated with the job.
     */

    public void setContainer(ContainerDetail container) {
        this.container = container;
    }

    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     * 
     * @return An object representing the details of the container that is associated with the job.
     */

    public ContainerDetail getContainer() {
        return this.container;
    }

    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     * 
     * @param container
     *        An object representing the details of the container that is associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withContainer(ContainerDetail container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * An object representing the details of a node that is associated with a multi-node parallel job.
     * </p>
     * 
     * @param nodeDetails
     *        An object representing the details of a node that is associated with a multi-node parallel job.
     */

    public void setNodeDetails(NodeDetails nodeDetails) {
        this.nodeDetails = nodeDetails;
    }

    /**
     * <p>
     * An object representing the details of a node that is associated with a multi-node parallel job.
     * </p>
     * 
     * @return An object representing the details of a node that is associated with a multi-node parallel job.
     */

    public NodeDetails getNodeDetails() {
        return this.nodeDetails;
    }

    /**
     * <p>
     * An object representing the details of a node that is associated with a multi-node parallel job.
     * </p>
     * 
     * @param nodeDetails
     *        An object representing the details of a node that is associated with a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withNodeDetails(NodeDetails nodeDetails) {
        setNodeDetails(nodeDetails);
        return this;
    }

    /**
     * <p>
     * An object representing the node properties of a multi-node parallel job.
     * </p>
     * 
     * @param nodeProperties
     *        An object representing the node properties of a multi-node parallel job.
     */

    public void setNodeProperties(NodeProperties nodeProperties) {
        this.nodeProperties = nodeProperties;
    }

    /**
     * <p>
     * An object representing the node properties of a multi-node parallel job.
     * </p>
     * 
     * @return An object representing the node properties of a multi-node parallel job.
     */

    public NodeProperties getNodeProperties() {
        return this.nodeProperties;
    }

    /**
     * <p>
     * An object representing the node properties of a multi-node parallel job.
     * </p>
     * 
     * @param nodeProperties
     *        An object representing the node properties of a multi-node parallel job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withNodeProperties(NodeProperties nodeProperties) {
        setNodeProperties(nodeProperties);
        return this;
    }

    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties of the job, if it is an array job.
     */

    public void setArrayProperties(ArrayPropertiesDetail arrayProperties) {
        this.arrayProperties = arrayProperties;
    }

    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     * 
     * @return The array properties of the job, if it is an array job.
     */

    public ArrayPropertiesDetail getArrayProperties() {
        return this.arrayProperties;
    }

    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties of the job, if it is an array job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withArrayProperties(ArrayPropertiesDetail arrayProperties) {
        setArrayProperties(arrayProperties);
        return this;
    }

    /**
     * <p>
     * The timeout configuration for the job.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for the job.
     */

    public void setTimeout(JobTimeout timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The timeout configuration for the job.
     * </p>
     * 
     * @return The timeout configuration for the job.
     */

    public JobTimeout getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The timeout configuration for the job.
     * </p>
     * 
     * @param timeout
     *        The timeout configuration for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetail withTimeout(JobTimeout timeout) {
        setTimeout(timeout);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobQueue() != null)
            sb.append("JobQueue: ").append(getJobQueue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAttempts() != null)
            sb.append("Attempts: ").append(getAttempts()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getRetryStrategy() != null)
            sb.append("RetryStrategy: ").append(getRetryStrategy()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: ").append(getStoppedAt()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn()).append(",");
        if (getJobDefinition() != null)
            sb.append("JobDefinition: ").append(getJobDefinition()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getNodeDetails() != null)
            sb.append("NodeDetails: ").append(getNodeDetails()).append(",");
        if (getNodeProperties() != null)
            sb.append("NodeProperties: ").append(getNodeProperties()).append(",");
        if (getArrayProperties() != null)
            sb.append("ArrayProperties: ").append(getArrayProperties()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDetail == false)
            return false;
        JobDetail other = (JobDetail) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobQueue() == null ^ this.getJobQueue() == null)
            return false;
        if (other.getJobQueue() != null && other.getJobQueue().equals(this.getJobQueue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAttempts() == null ^ this.getAttempts() == null)
            return false;
        if (other.getAttempts() != null && other.getAttempts().equals(this.getAttempts()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getRetryStrategy() == null ^ this.getRetryStrategy() == null)
            return false;
        if (other.getRetryStrategy() != null && other.getRetryStrategy().equals(this.getRetryStrategy()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        if (other.getJobDefinition() == null ^ this.getJobDefinition() == null)
            return false;
        if (other.getJobDefinition() != null && other.getJobDefinition().equals(this.getJobDefinition()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getNodeDetails() == null ^ this.getNodeDetails() == null)
            return false;
        if (other.getNodeDetails() != null && other.getNodeDetails().equals(this.getNodeDetails()) == false)
            return false;
        if (other.getNodeProperties() == null ^ this.getNodeProperties() == null)
            return false;
        if (other.getNodeProperties() != null && other.getNodeProperties().equals(this.getNodeProperties()) == false)
            return false;
        if (other.getArrayProperties() == null ^ this.getArrayProperties() == null)
            return false;
        if (other.getArrayProperties() != null && other.getArrayProperties().equals(this.getArrayProperties()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobQueue() == null) ? 0 : getJobQueue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAttempts() == null) ? 0 : getAttempts().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getRetryStrategy() == null) ? 0 : getRetryStrategy().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        hashCode = prime * hashCode + ((getJobDefinition() == null) ? 0 : getJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getNodeDetails() == null) ? 0 : getNodeDetails().hashCode());
        hashCode = prime * hashCode + ((getNodeProperties() == null) ? 0 : getNodeProperties().hashCode());
        hashCode = prime * hashCode + ((getArrayProperties() == null) ? 0 : getArrayProperties().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public JobDetail clone() {
        try {
            return (JobDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.JobDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
