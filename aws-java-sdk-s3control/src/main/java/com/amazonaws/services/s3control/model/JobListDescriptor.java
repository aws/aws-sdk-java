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
 * Contains the configuration and status information for a single job retrieved as part of a job list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/JobListDescriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobListDescriptor implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the specified job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The user-specified description that was included in the specified job's <code>Create Job</code> request.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The operation that the specified job is configured to run on each object listed in the manifest.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The current priority for the specified job.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The specified job's current status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A timestamp indicating when the specified job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it
     * succeeded, failed, or was canceled.
     * </p>
     */
    private java.util.Date terminationDate;
    /**
     * <p>
     * Describes the total number of tasks that the specified job has executed, the number of tasks that succeeded, and
     * the number of tasks that failed.
     * </p>
     */
    private JobProgressSummary progressSummary;

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

    public JobListDescriptor withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The user-specified description that was included in the specified job's <code>Create Job</code> request.
     * </p>
     * 
     * @param description
     *        The user-specified description that was included in the specified job's <code>Create Job</code> request.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-specified description that was included in the specified job's <code>Create Job</code> request.
     * </p>
     * 
     * @return The user-specified description that was included in the specified job's <code>Create Job</code> request.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-specified description that was included in the specified job's <code>Create Job</code> request.
     * </p>
     * 
     * @param description
     *        The user-specified description that was included in the specified job's <code>Create Job</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListDescriptor withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The operation that the specified job is configured to run on each object listed in the manifest.
     * </p>
     * 
     * @param operation
     *        The operation that the specified job is configured to run on each object listed in the manifest.
     * @see OperationName
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation that the specified job is configured to run on each object listed in the manifest.
     * </p>
     * 
     * @return The operation that the specified job is configured to run on each object listed in the manifest.
     * @see OperationName
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operation that the specified job is configured to run on each object listed in the manifest.
     * </p>
     * 
     * @param operation
     *        The operation that the specified job is configured to run on each object listed in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationName
     */

    public JobListDescriptor withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The operation that the specified job is configured to run on each object listed in the manifest.
     * </p>
     * 
     * @param operation
     *        The operation that the specified job is configured to run on each object listed in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationName
     */

    public JobListDescriptor withOperation(OperationName operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The current priority for the specified job.
     * </p>
     * 
     * @param priority
     *        The current priority for the specified job.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The current priority for the specified job.
     * </p>
     * 
     * @return The current priority for the specified job.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The current priority for the specified job.
     * </p>
     * 
     * @param priority
     *        The current priority for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListDescriptor withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The specified job's current status.
     * </p>
     * 
     * @param status
     *        The specified job's current status.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The specified job's current status.
     * </p>
     * 
     * @return The specified job's current status.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The specified job's current status.
     * </p>
     * 
     * @param status
     *        The specified job's current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobListDescriptor withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The specified job's current status.
     * </p>
     * 
     * @param status
     *        The specified job's current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobListDescriptor withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when the specified job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when the specified job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when the specified job was created.
     * </p>
     * 
     * @return A timestamp indicating when the specified job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp indicating when the specified job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp indicating when the specified job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListDescriptor withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it
     * succeeded, failed, or was canceled.
     * </p>
     * 
     * @param terminationDate
     *        A timestamp indicating when the specified job terminated. A job's termination date is the date and time
     *        when it succeeded, failed, or was canceled.
     */

    public void setTerminationDate(java.util.Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    /**
     * <p>
     * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it
     * succeeded, failed, or was canceled.
     * </p>
     * 
     * @return A timestamp indicating when the specified job terminated. A job's termination date is the date and time
     *         when it succeeded, failed, or was canceled.
     */

    public java.util.Date getTerminationDate() {
        return this.terminationDate;
    }

    /**
     * <p>
     * A timestamp indicating when the specified job terminated. A job's termination date is the date and time when it
     * succeeded, failed, or was canceled.
     * </p>
     * 
     * @param terminationDate
     *        A timestamp indicating when the specified job terminated. A job's termination date is the date and time
     *        when it succeeded, failed, or was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListDescriptor withTerminationDate(java.util.Date terminationDate) {
        setTerminationDate(terminationDate);
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

    public JobListDescriptor withProgressSummary(JobProgressSummary progressSummary) {
        setProgressSummary(progressSummary);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTerminationDate() != null)
            sb.append("TerminationDate: ").append(getTerminationDate()).append(",");
        if (getProgressSummary() != null)
            sb.append("ProgressSummary: ").append(getProgressSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobListDescriptor == false)
            return false;
        JobListDescriptor other = (JobListDescriptor) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTerminationDate() == null ^ this.getTerminationDate() == null)
            return false;
        if (other.getTerminationDate() != null && other.getTerminationDate().equals(this.getTerminationDate()) == false)
            return false;
        if (other.getProgressSummary() == null ^ this.getProgressSummary() == null)
            return false;
        if (other.getProgressSummary() != null && other.getProgressSummary().equals(this.getProgressSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationDate() == null) ? 0 : getTerminationDate().hashCode());
        hashCode = prime * hashCode + ((getProgressSummary() == null) ? 0 : getProgressSummary().hashCode());
        return hashCode;
    }

    @Override
    public JobListDescriptor clone() {
        try {
            return (JobListDescriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
