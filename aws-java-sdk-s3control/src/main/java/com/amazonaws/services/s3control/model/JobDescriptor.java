/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container element for the job configuration and status information returned by a <code>Describe Job</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDescriptor implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the specified job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is
     * required only for jobs created through the Amazon S3 console.
     * </p>
     */
    private Boolean confirmationRequired;
    /**
     * <p>
     * The description for this job, if one was provided in this job's <code>Create Job</code> request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for this job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The current status of the specified job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The configuration information for the specified job's manifest object.
     * </p>
     */
    private JobManifest manifest;
    /**
     * <p>
     * The operation that the specified job is configured to execute on the objects listed in the manifest.
     * </p>
     */
    private JobOperation operation;
    /**
     * <p>
     * The priority of the specified job.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and
     * the number of tasks that failed.
     * </p>
     */
    private JobProgressSummary progressSummary;
    /** <p/> */
    private String statusUpdateReason;
    /**
     * <p>
     * If the specified job failed, this field contains information describing the failure.
     * </p>
     */
    private java.util.List<JobFailure> failureReasons;
    /**
     * <p>
     * Contains the configuration information for the job-completion report if you requested one in the
     * <code>Create Job</code> request.
     * </p>
     */
    private JobReport report;
    /**
     * <p>
     * A timestamp indicating when this job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded,
     * failed, or was canceled.
     * </p>
     */
    private java.util.Date terminationDate;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the tasks
     * for this job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The timestamp when this job was suspended, if it has been suspended.
     * </p>
     */
    private java.util.Date suspendedDate;
    /**
     * <p>
     * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3
     * console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before
     * running. After you confirm the job, it automatically exits the <code>Suspended</code> state.
     * </p>
     */
    private String suspendedCause;

    /**
     * <p>
     * The ID for the specified job.
     * </p>
     * 
     * @param jobId
     *        The ID for the specified job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the specified job.
     * </p>
     * 
     * @return The ID for the specified job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the specified job.
     * </p>
     * 
     * @param jobId
     *        The ID for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is
     * required only for jobs created through the Amazon S3 console.
     * </p>
     * 
     * @param confirmationRequired
     *        Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation
     *        is required only for jobs created through the Amazon S3 console.
     */

    public void setConfirmationRequired(Boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is
     * required only for jobs created through the Amazon S3 console.
     * </p>
     * 
     * @return Indicates whether confirmation is required before Amazon S3 begins running the specified job.
     *         Confirmation is required only for jobs created through the Amazon S3 console.
     */

    public Boolean getConfirmationRequired() {
        return this.confirmationRequired;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is
     * required only for jobs created through the Amazon S3 console.
     * </p>
     * 
     * @param confirmationRequired
     *        Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation
     *        is required only for jobs created through the Amazon S3 console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withConfirmationRequired(Boolean confirmationRequired) {
        setConfirmationRequired(confirmationRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 begins running the specified job. Confirmation is
     * required only for jobs created through the Amazon S3 console.
     * </p>
     * 
     * @return Indicates whether confirmation is required before Amazon S3 begins running the specified job.
     *         Confirmation is required only for jobs created through the Amazon S3 console.
     */

    public Boolean isConfirmationRequired() {
        return this.confirmationRequired;
    }

    /**
     * <p>
     * The description for this job, if one was provided in this job's <code>Create Job</code> request.
     * </p>
     * 
     * @param description
     *        The description for this job, if one was provided in this job's <code>Create Job</code> request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for this job, if one was provided in this job's <code>Create Job</code> request.
     * </p>
     * 
     * @return The description for this job, if one was provided in this job's <code>Create Job</code> request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for this job, if one was provided in this job's <code>Create Job</code> request.
     * </p>
     * 
     * @param description
     *        The description for this job, if one was provided in this job's <code>Create Job</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) for this job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for this job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for this job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * The current status of the specified job.
     * </p>
     * 
     * @param status
     *        The current status of the specified job.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the specified job.
     * </p>
     * 
     * @return The current status of the specified job.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the specified job.
     * </p>
     * 
     * @param status
     *        The current status of the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobDescriptor withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the specified job.
     * </p>
     * 
     * @param status
     *        The current status of the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobDescriptor withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The configuration information for the specified job's manifest object.
     * </p>
     * 
     * @param manifest
     *        The configuration information for the specified job's manifest object.
     */

    public void setManifest(JobManifest manifest) {
        this.manifest = manifest;
    }

    /**
     * <p>
     * The configuration information for the specified job's manifest object.
     * </p>
     * 
     * @return The configuration information for the specified job's manifest object.
     */

    public JobManifest getManifest() {
        return this.manifest;
    }

    /**
     * <p>
     * The configuration information for the specified job's manifest object.
     * </p>
     * 
     * @param manifest
     *        The configuration information for the specified job's manifest object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withManifest(JobManifest manifest) {
        setManifest(manifest);
        return this;
    }

    /**
     * <p>
     * The operation that the specified job is configured to execute on the objects listed in the manifest.
     * </p>
     * 
     * @param operation
     *        The operation that the specified job is configured to execute on the objects listed in the manifest.
     */

    public void setOperation(JobOperation operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation that the specified job is configured to execute on the objects listed in the manifest.
     * </p>
     * 
     * @return The operation that the specified job is configured to execute on the objects listed in the manifest.
     */

    public JobOperation getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operation that the specified job is configured to execute on the objects listed in the manifest.
     * </p>
     * 
     * @param operation
     *        The operation that the specified job is configured to execute on the objects listed in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withOperation(JobOperation operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The priority of the specified job.
     * </p>
     * 
     * @param priority
     *        The priority of the specified job.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the specified job.
     * </p>
     * 
     * @return The priority of the specified job.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the specified job.
     * </p>
     * 
     * @param priority
     *        The priority of the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and
     * the number of tasks that failed.
     * </p>
     * 
     * @param progressSummary
     *        Describes the total number of tasks that the specified job has executed, the number of tasks that
     *        succeeded, and the number of tasks that failed.
     */

    public void setProgressSummary(JobProgressSummary progressSummary) {
        this.progressSummary = progressSummary;
    }

    /**
     * <p>
     * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and
     * the number of tasks that failed.
     * </p>
     * 
     * @return Describes the total number of tasks that the specified job has executed, the number of tasks that
     *         succeeded, and the number of tasks that failed.
     */

    public JobProgressSummary getProgressSummary() {
        return this.progressSummary;
    }

    /**
     * <p>
     * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and
     * the number of tasks that failed.
     * </p>
     * 
     * @param progressSummary
     *        Describes the total number of tasks that the specified job has executed, the number of tasks that
     *        succeeded, and the number of tasks that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withProgressSummary(JobProgressSummary progressSummary) {
        setProgressSummary(progressSummary);
        return this;
    }

    /**
     * <p/>
     * 
     * @param statusUpdateReason
     */

    public void setStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getStatusUpdateReason() {
        return this.statusUpdateReason;
    }

    /**
     * <p/>
     * 
     * @param statusUpdateReason
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withStatusUpdateReason(String statusUpdateReason) {
        setStatusUpdateReason(statusUpdateReason);
        return this;
    }

    /**
     * <p>
     * If the specified job failed, this field contains information describing the failure.
     * </p>
     * 
     * @return If the specified job failed, this field contains information describing the failure.
     */

    public java.util.List<JobFailure> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * If the specified job failed, this field contains information describing the failure.
     * </p>
     * 
     * @param failureReasons
     *        If the specified job failed, this field contains information describing the failure.
     */

    public void setFailureReasons(java.util.Collection<JobFailure> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<JobFailure>(failureReasons);
    }

    /**
     * <p>
     * If the specified job failed, this field contains information describing the failure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        If the specified job failed, this field contains information describing the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withFailureReasons(JobFailure... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<JobFailure>(failureReasons.length));
        }
        for (JobFailure ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the specified job failed, this field contains information describing the failure.
     * </p>
     * 
     * @param failureReasons
     *        If the specified job failed, this field contains information describing the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withFailureReasons(java.util.Collection<JobFailure> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information for the job-completion report if you requested one in the
     * <code>Create Job</code> request.
     * </p>
     * 
     * @param report
     *        Contains the configuration information for the job-completion report if you requested one in the
     *        <code>Create Job</code> request.
     */

    public void setReport(JobReport report) {
        this.report = report;
    }

    /**
     * <p>
     * Contains the configuration information for the job-completion report if you requested one in the
     * <code>Create Job</code> request.
     * </p>
     * 
     * @return Contains the configuration information for the job-completion report if you requested one in the
     *         <code>Create Job</code> request.
     */

    public JobReport getReport() {
        return this.report;
    }

    /**
     * <p>
     * Contains the configuration information for the job-completion report if you requested one in the
     * <code>Create Job</code> request.
     * </p>
     * 
     * @param report
     *        Contains the configuration information for the job-completion report if you requested one in the
     *        <code>Create Job</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withReport(JobReport report) {
        setReport(report);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when this job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when this job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when this job was created.
     * </p>
     * 
     * @return A timestamp indicating when this job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when this job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when this job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded,
     * failed, or was canceled.
     * </p>
     * 
     * @param terminationDate
     *        A timestamp indicating when this job terminated. A job's termination date is the date and time when it
     *        succeeded, failed, or was canceled.
     */

    public void setTerminationDate(java.util.Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    /**
     * <p>
     * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded,
     * failed, or was canceled.
     * </p>
     * 
     * @return A timestamp indicating when this job terminated. A job's termination date is the date and time when it
     *         succeeded, failed, or was canceled.
     */

    public java.util.Date getTerminationDate() {
        return this.terminationDate;
    }

    /**
     * <p>
     * A timestamp indicating when this job terminated. A job's termination date is the date and time when it succeeded,
     * failed, or was canceled.
     * </p>
     * 
     * @param terminationDate
     *        A timestamp indicating when this job terminated. A job's termination date is the date and time when it
     *        succeeded, failed, or was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withTerminationDate(java.util.Date terminationDate) {
        setTerminationDate(terminationDate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the tasks
     * for this job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the
     *        tasks for this job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the tasks
     * for this job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the
     *         tasks for this job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the tasks
     * for this job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role assigned to execute the
     *        tasks for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The timestamp when this job was suspended, if it has been suspended.
     * </p>
     * 
     * @param suspendedDate
     *        The timestamp when this job was suspended, if it has been suspended.
     */

    public void setSuspendedDate(java.util.Date suspendedDate) {
        this.suspendedDate = suspendedDate;
    }

    /**
     * <p>
     * The timestamp when this job was suspended, if it has been suspended.
     * </p>
     * 
     * @return The timestamp when this job was suspended, if it has been suspended.
     */

    public java.util.Date getSuspendedDate() {
        return this.suspendedDate;
    }

    /**
     * <p>
     * The timestamp when this job was suspended, if it has been suspended.
     * </p>
     * 
     * @param suspendedDate
     *        The timestamp when this job was suspended, if it has been suspended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withSuspendedDate(java.util.Date suspendedDate) {
        setSuspendedDate(suspendedDate);
        return this;
    }

    /**
     * <p>
     * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3
     * console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before
     * running. After you confirm the job, it automatically exits the <code>Suspended</code> state.
     * </p>
     * 
     * @param suspendedCause
     *        The reason why the specified job was suspended. A job is only suspended if you create it through the
     *        Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await
     *        confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code>
     *        state.
     */

    public void setSuspendedCause(String suspendedCause) {
        this.suspendedCause = suspendedCause;
    }

    /**
     * <p>
     * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3
     * console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before
     * running. After you confirm the job, it automatically exits the <code>Suspended</code> state.
     * </p>
     * 
     * @return The reason why the specified job was suspended. A job is only suspended if you create it through the
     *         Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await
     *         confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code>
     *         state.
     */

    public String getSuspendedCause() {
        return this.suspendedCause;
    }

    /**
     * <p>
     * The reason why the specified job was suspended. A job is only suspended if you create it through the Amazon S3
     * console. When you create the job, it enters the <code>Suspended</code> state to await confirmation before
     * running. After you confirm the job, it automatically exits the <code>Suspended</code> state.
     * </p>
     * 
     * @param suspendedCause
     *        The reason why the specified job was suspended. A job is only suspended if you create it through the
     *        Amazon S3 console. When you create the job, it enters the <code>Suspended</code> state to await
     *        confirmation before running. After you confirm the job, it automatically exits the <code>Suspended</code>
     *        state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDescriptor withSuspendedCause(String suspendedCause) {
        setSuspendedCause(suspendedCause);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getConfirmationRequired() != null)
            sb.append("ConfirmationRequired: ").append(getConfirmationRequired()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getManifest() != null)
            sb.append("Manifest: ").append(getManifest()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getProgressSummary() != null)
            sb.append("ProgressSummary: ").append(getProgressSummary()).append(",");
        if (getStatusUpdateReason() != null)
            sb.append("StatusUpdateReason: ").append(getStatusUpdateReason()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getReport() != null)
            sb.append("Report: ").append(getReport()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTerminationDate() != null)
            sb.append("TerminationDate: ").append(getTerminationDate()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSuspendedDate() != null)
            sb.append("SuspendedDate: ").append(getSuspendedDate()).append(",");
        if (getSuspendedCause() != null)
            sb.append("SuspendedCause: ").append(getSuspendedCause());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDescriptor == false)
            return false;
        JobDescriptor other = (JobDescriptor) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getConfirmationRequired() == null ^ this.getConfirmationRequired() == null)
            return false;
        if (other.getConfirmationRequired() != null && other.getConfirmationRequired().equals(this.getConfirmationRequired()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getManifest() == null ^ this.getManifest() == null)
            return false;
        if (other.getManifest() != null && other.getManifest().equals(this.getManifest()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getProgressSummary() == null ^ this.getProgressSummary() == null)
            return false;
        if (other.getProgressSummary() != null && other.getProgressSummary().equals(this.getProgressSummary()) == false)
            return false;
        if (other.getStatusUpdateReason() == null ^ this.getStatusUpdateReason() == null)
            return false;
        if (other.getStatusUpdateReason() != null && other.getStatusUpdateReason().equals(this.getStatusUpdateReason()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getReport() == null ^ this.getReport() == null)
            return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTerminationDate() == null ^ this.getTerminationDate() == null)
            return false;
        if (other.getTerminationDate() != null && other.getTerminationDate().equals(this.getTerminationDate()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSuspendedDate() == null ^ this.getSuspendedDate() == null)
            return false;
        if (other.getSuspendedDate() != null && other.getSuspendedDate().equals(this.getSuspendedDate()) == false)
            return false;
        if (other.getSuspendedCause() == null ^ this.getSuspendedCause() == null)
            return false;
        if (other.getSuspendedCause() != null && other.getSuspendedCause().equals(this.getSuspendedCause()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getConfirmationRequired() == null) ? 0 : getConfirmationRequired().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getProgressSummary() == null) ? 0 : getProgressSummary().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateReason() == null) ? 0 : getStatusUpdateReason().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationDate() == null) ? 0 : getTerminationDate().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSuspendedDate() == null) ? 0 : getSuspendedDate().hashCode());
        hashCode = prime * hashCode + ((getSuspendedCause() == null) ? 0 : getSuspendedCause().hashCode());
        return hashCode;
    }

    @Override
    public JobDescriptor clone() {
        try {
            return (JobDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
