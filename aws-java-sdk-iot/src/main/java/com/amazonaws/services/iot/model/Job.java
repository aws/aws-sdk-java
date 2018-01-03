/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * </p>
     */
    private String status;
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
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
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
     * The parameters specified for the job document.
     * </p>
     */
    private java.util.Map<String, String> documentParameters;

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
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * </p>
     * 
     * @return The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the job, one of <code>IN_PROGRESS</code>, <code>CANCELED</code>, or <code>COMPLETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(JobStatus status) {
        this.status = status.toString();
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
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the job was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
     * </p>
     * 
     * @param completedAt
     *        The time, in milliseconds since the epoch, when the job was completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job was completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job was completed.
     * </p>
     * 
     * @param completedAt
     *        The time, in milliseconds since the epoch, when the job was completed.
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
     * The parameters specified for the job document.
     * </p>
     * 
     * @return The parameters specified for the job document.
     */

    public java.util.Map<String, String> getDocumentParameters() {
        return documentParameters;
    }

    /**
     * <p>
     * The parameters specified for the job document.
     * </p>
     * 
     * @param documentParameters
     *        The parameters specified for the job document.
     */

    public void setDocumentParameters(java.util.Map<String, String> documentParameters) {
        this.documentParameters = documentParameters;
    }

    /**
     * <p>
     * The parameters specified for the job document.
     * </p>
     * 
     * @param documentParameters
     *        The parameters specified for the job document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDocumentParameters(java.util.Map<String, String> documentParameters) {
        setDocumentParameters(documentParameters);
        return this;
    }

    public Job addDocumentParametersEntry(String key, String value) {
        if (null == this.documentParameters) {
            this.documentParameters = new java.util.HashMap<String, String>();
        }
        if (this.documentParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.documentParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DocumentParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearDocumentParametersEntries() {
        this.documentParameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt()).append(",");
        if (getJobProcessDetails() != null)
            sb.append("JobProcessDetails: ").append(getJobProcessDetails()).append(",");
        if (getDocumentParameters() != null)
            sb.append("DocumentParameters: ").append(getDocumentParameters());
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
        if (other.getDocumentParameters() == null ^ this.getDocumentParameters() == null)
            return false;
        if (other.getDocumentParameters() != null && other.getDocumentParameters().equals(this.getDocumentParameters()) == false)
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
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPresignedUrlConfig() == null) ? 0 : getPresignedUrlConfig().hashCode());
        hashCode = prime * hashCode + ((getJobExecutionsRolloutConfig() == null) ? 0 : getJobExecutionsRolloutConfig().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
        hashCode = prime * hashCode + ((getJobProcessDetails() == null) ? 0 : getJobProcessDetails().hashCode());
        hashCode = prime * hashCode + ((getDocumentParameters() == null) ? 0 : getDocumentParameters().hashCode());
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
