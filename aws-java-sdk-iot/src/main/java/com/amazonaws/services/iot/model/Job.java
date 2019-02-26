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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>Job</code> object contains details about a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a device when the thing representing the device is added to
     * a target group, even after the job was completed by all things originally in the group.
     * </p>
     */
    private String targetSelection;
    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code>
     * or <code>COMPLETED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     * <code>true</code>.
     * </p>
     */
    private Boolean forceCanceled;
    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     */
    private String reasonCode;
    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     */
    private java.util.List<String> targets;
    /**
     * <p>
     * A short text description of the job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     */
    private PresignedUrlConfig presignedUrlConfig;
    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     */
    private JobExecutionsRolloutConfig jobExecutionsRolloutConfig;
    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     */
    private AbortConfig abortConfig;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job was completed.
     * </p>
     */
    private java.util.Date completedAt;
    /**
     * <p>
     * Details about the job process.
     * </p>
     */
    private JobProcessDetails jobProcessDetails;
    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job
     * execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal
     * state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     */
    private TimeoutConfig timeoutConfig;

    /**
     * <p>
     * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
     * </p>
     * 
     * @param jobArn
     *        An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
     * </p>
     * 
     * @return An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
     * </p>
     * 
     * @param jobArn
     *        An ARN identifying the job with format "arn:aws:iot:region:account:job/jobId".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @return The unique identifier you assigned to this job when it was created.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a device when the thing representing the device is added to
     * a target group, even after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a device when the thing representing
     *        the device is added to a target group, even after the job was completed by all things originally in the
     *        group.
     * @see TargetSelection
     */

    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a device when the thing representing the device is added to
     * a target group, even after the job was completed by all things originally in the group.
     * </p>
     * 
     * @return Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *         specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *         when a change is detected in a target. For example, a job will run on a device when the thing
     *         representing the device is added to a target group, even after the job was completed by all things
     *         originally in the group.
     * @see TargetSelection
     */

    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a device when the thing representing the device is added to
     * a target group, even after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a device when the thing representing
     *        the device is added to a target group, even after the job was completed by all things originally in the
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public Job withTargetSelection(String targetSelection) {
        setTargetSelection(targetSelection);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a device when the thing representing the device is added to
     * a target group, even after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a device when the thing representing
     *        the device is added to a target group, even after the job was completed by all things originally in the
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public Job withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code>
     * or <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>,
     *        <code>DELETION_IN_PROGRESS</code> or <code>COMPLETED</code>.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code>
     * or <code>COMPLETED</code>.
     * </p>
     * 
     * @return The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>,
     *         <code>DELETION_IN_PROGRESS</code> or <code>COMPLETED</code>.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code>
     * or <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>,
     *        <code>DELETION_IN_PROGRESS</code> or <code>COMPLETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, <code>DELETION_IN_PROGRESS</code>
     * or <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>,
     *        <code>DELETION_IN_PROGRESS</code> or <code>COMPLETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     * <code>true</code>.
     * </p>
     * 
     * @param forceCanceled
     *        Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     *        <code>true</code>.
     */

    public void setForceCanceled(Boolean forceCanceled) {
        this.forceCanceled = forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     * <code>true</code>.
     * </p>
     * 
     * @return Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     *         <code>true</code>.
     */

    public Boolean getForceCanceled() {
        return this.forceCanceled;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     * <code>true</code>.
     * </p>
     * 
     * @param forceCanceled
     *        Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withForceCanceled(Boolean forceCanceled) {
        setForceCanceled(forceCanceled);
        return this;
    }

    /**
     * <p>
     * Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     * <code>true</code>.
     * </p>
     * 
     * @return Will be <code>true</code> if the job was canceled with the optional <code>force</code> parameter set to
     *         <code>true</code>.
     */

    public Boolean isForceCanceled() {
        return this.forceCanceled;
    }

    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     * 
     * @param reasonCode
     *        If the job was updated, provides the reason code for the update.
     */

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     * 
     * @return If the job was updated, provides the reason code for the update.
     */

    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * <p>
     * If the job was updated, provides the reason code for the update.
     * </p>
     * 
     * @param reasonCode
     *        If the job was updated, provides the reason code for the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withReasonCode(String reasonCode) {
        setReasonCode(reasonCode);
        return this;
    }

    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     * 
     * @param comment
     *        If the job was updated, describes the reason for the update.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     * 
     * @return If the job was updated, describes the reason for the update.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * If the job was updated, describes the reason for the update.
     * </p>
     * 
     * @param comment
     *        If the job was updated, describes the reason for the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     * 
     * @return A list of IoT things and thing groups to which the job should be sent.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     * 
     * @param targets
     *        A list of IoT things and thing groups to which the job should be sent.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A list of IoT things and thing groups to which the job should be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IoT things and thing groups to which the job should be sent.
     * </p>
     * 
     * @param targets
     *        A list of IoT things and thing groups to which the job should be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * 
     * @param description
     *        A short text description of the job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * 
     * @return A short text description of the job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A short text description of the job.
     * </p>
     * 
     * @param description
     *        A short text description of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     * 
     * @param presignedUrlConfig
     *        Configuration for pre-signed S3 URLs.
     */

    public void setPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        this.presignedUrlConfig = presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     * 
     * @return Configuration for pre-signed S3 URLs.
     */

    public PresignedUrlConfig getPresignedUrlConfig() {
        return this.presignedUrlConfig;
    }

    /**
     * <p>
     * Configuration for pre-signed S3 URLs.
     * </p>
     * 
     * @param presignedUrlConfig
     *        Configuration for pre-signed S3 URLs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withPresignedUrlConfig(PresignedUrlConfig presignedUrlConfig) {
        setPresignedUrlConfig(presignedUrlConfig);
        return this;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     * 
     * @param jobExecutionsRolloutConfig
     *        Allows you to create a staged rollout of a job.
     */

    public void setJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     * 
     * @return Allows you to create a staged rollout of a job.
     */

    public JobExecutionsRolloutConfig getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Allows you to create a staged rollout of a job.
     * </p>
     * 
     * @param jobExecutionsRolloutConfig
     *        Allows you to create a staged rollout of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobExecutionsRolloutConfig(JobExecutionsRolloutConfig jobExecutionsRolloutConfig) {
        setJobExecutionsRolloutConfig(jobExecutionsRolloutConfig);
        return this;
    }

    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     * 
     * @param abortConfig
     *        Configuration for criteria to abort the job.
     */

    public void setAbortConfig(AbortConfig abortConfig) {
        this.abortConfig = abortConfig;
    }

    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     * 
     * @return Configuration for criteria to abort the job.
     */

    public AbortConfig getAbortConfig() {
        return this.abortConfig;
    }

    /**
     * <p>
     * Configuration for criteria to abort the job.
     * </p>
     * 
     * @param abortConfig
     *        Configuration for criteria to abort the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withAbortConfig(AbortConfig abortConfig) {
        setAbortConfig(abortConfig);
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in seconds since the epoch, when the job was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in seconds since the epoch, when the job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was completed.
     * </p>
     * 
     * @param completedAt
     *        The time, in seconds since the epoch, when the job was completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was completed.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job was completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was completed.
     * </p>
     * 
     * @param completedAt
     *        The time, in seconds since the epoch, when the job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
        return this;
    }

    /**
     * <p>
     * Details about the job process.
     * </p>
     * 
     * @param jobProcessDetails
     *        Details about the job process.
     */

    public void setJobProcessDetails(JobProcessDetails jobProcessDetails) {
        this.jobProcessDetails = jobProcessDetails;
    }

    /**
     * <p>
     * Details about the job process.
     * </p>
     * 
     * @return Details about the job process.
     */

    public JobProcessDetails getJobProcessDetails() {
        return this.jobProcessDetails;
    }

    /**
     * <p>
     * Details about the job process.
     * </p>
     * 
     * @param jobProcessDetails
     *        Details about the job process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobProcessDetails(JobProcessDetails jobProcessDetails) {
        setJobProcessDetails(jobProcessDetails);
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job
     * execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal
     * state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     * 
     * @param timeoutConfig
     *        Specifies the amount of time each device has to finish its execution of the job. A timer is started when
     *        the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to
     *        another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
     */

    public void setTimeoutConfig(TimeoutConfig timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job
     * execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal
     * state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     * 
     * @return Specifies the amount of time each device has to finish its execution of the job. A timer is started when
     *         the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to
     *         another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
     */

    public TimeoutConfig getTimeoutConfig() {
        return this.timeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job
     * execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to another terminal
     * state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
     * </p>
     * 
     * @param timeoutConfig
     *        Specifies the amount of time each device has to finish its execution of the job. A timer is started when
     *        the job execution status is set to <code>IN_PROGRESS</code>. If the job execution status is not set to
     *        another terminal state before the timer expires, it will be automatically set to <code>TIMED_OUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTimeoutConfig(TimeoutConfig timeoutConfig) {
        setTimeoutConfig(timeoutConfig);
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
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getTargetSelection() != null)
            sb.append("TargetSelection: ").append(getTargetSelection()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getForceCanceled() != null)
            sb.append("ForceCanceled: ").append(getForceCanceled()).append(",");
        if (getReasonCode() != null)
            sb.append("ReasonCode: ").append(getReasonCode()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPresignedUrlConfig() != null)
            sb.append("PresignedUrlConfig: ").append(getPresignedUrlConfig()).append(",");
        if (getJobExecutionsRolloutConfig() != null)
            sb.append("JobExecutionsRolloutConfig: ").append(getJobExecutionsRolloutConfig()).append(",");
        if (getAbortConfig() != null)
            sb.append("AbortConfig: ").append(getAbortConfig()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getJobProcessDetails() != null)
            sb.append("JobProcessDetails: ").append(getJobProcessDetails()).append(",");
        if (getTimeoutConfig() != null)
            sb.append("TimeoutConfig: ").append(getTimeoutConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getForceCanceled() == null ^ this.getForceCanceled() == null)
            return false;
        if (other.getForceCanceled() != null && other.getForceCanceled().equals(this.getForceCanceled()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPresignedUrlConfig() == null ^ this.getPresignedUrlConfig() == null)
            return false;
        if (other.getPresignedUrlConfig() != null && other.getPresignedUrlConfig().equals(this.getPresignedUrlConfig()) == false)
            return false;
        if (other.getJobExecutionsRolloutConfig() == null ^ this.getJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getJobExecutionsRolloutConfig() != null && other.getJobExecutionsRolloutConfig().equals(this.getJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getAbortConfig() == null ^ this.getAbortConfig() == null)
            return false;
        if (other.getAbortConfig() != null && other.getAbortConfig().equals(this.getAbortConfig()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        if (other.getJobProcessDetails() == null ^ this.getJobProcessDetails() == null)
            return false;
        if (other.getJobProcessDetails() != null && other.getJobProcessDetails().equals(this.getJobProcessDetails()) == false)
            return false;
        if (other.getTimeoutConfig() == null ^ this.getTimeoutConfig() == null)
            return false;
        if (other.getTimeoutConfig() != null && other.getTimeoutConfig().equals(this.getTimeoutConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getForceCanceled() == null) ? 0 : getForceCanceled().hashCode());
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getAbortConfig() == null) ? 0 : getAbortConfig().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getJobProcessDetails() == null) ? 0 : getJobProcessDetails().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConfig() == null) ? 0 : getTimeoutConfig().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
