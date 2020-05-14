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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a classification job, including the current status of the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/JobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     */
    private java.util.List<S3BucketDefinitionForJob> bucketDefinitions;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also
     * be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's
     * access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to jobs that occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;
    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     */
    private String jobType;
    /**
     * <p>
     * The custom name of the job.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     * 
     * @return The S3 buckets that the job is configured to analyze.
     */

    public java.util.List<S3BucketDefinitionForJob> getBucketDefinitions() {
        return bucketDefinitions;
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     * 
     * @param bucketDefinitions
     *        The S3 buckets that the job is configured to analyze.
     */

    public void setBucketDefinitions(java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        if (bucketDefinitions == null) {
            this.bucketDefinitions = null;
            return;
        }

        this.bucketDefinitions = new java.util.ArrayList<S3BucketDefinitionForJob>(bucketDefinitions);
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBucketDefinitions(java.util.Collection)} or {@link #withBucketDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param bucketDefinitions
     *        The S3 buckets that the job is configured to analyze.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withBucketDefinitions(S3BucketDefinitionForJob... bucketDefinitions) {
        if (this.bucketDefinitions == null) {
            setBucketDefinitions(new java.util.ArrayList<S3BucketDefinitionForJob>(bucketDefinitions.length));
        }
        for (S3BucketDefinitionForJob ele : bucketDefinitions) {
            this.bucketDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze.
     * </p>
     * 
     * @param bucketDefinitions
     *        The S3 buckets that the job is configured to analyze.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withBucketDefinitions(java.util.Collection<S3BucketDefinitionForJob> bucketDefinitions) {
        setBucketDefinitions(bucketDefinitions);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was created.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * 
     * @return The unique identifier for the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier for the job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also
     * be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's
     * access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to jobs that occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The current status of the job. Possible value are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job
     *        might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change
     *        affected the job's access to the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie finished processing all the data specified for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *        This value doesn't apply to jobs that occur only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - The job is in progress.
     *        </p>
     *        </li>
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also
     * be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's
     * access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to jobs that occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the job. Possible value are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job
     *         might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change
     *         affected the job's access to the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETE - Amazon Macie finished processing all the data specified for the job.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *         This value doesn't apply to jobs that occur only once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     *         account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING - The job is in progress.
     *         </p>
     *         </li>
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also
     * be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's
     * access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to jobs that occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The current status of the job. Possible value are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job
     *        might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change
     *        affected the job's access to the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie finished processing all the data specified for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *        This value doesn't apply to jobs that occur only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - The job is in progress.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job might also
     * be cancelled if ownership of an S3 bucket changed while the job was running, and that change affected the job's
     * access to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - Amazon Macie finished processing all the data specified for the job.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to jobs that occur only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - The job is in progress.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The current status of the job. Possible value are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - The job was cancelled by you or a user of the master account for your organization. A job
     *        might also be cancelled if ownership of an S3 bucket changed while the job was running, and that change
     *        affected the job's access to the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - Amazon Macie finished processing all the data specified for the job.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *        This value doesn't apply to jobs that occur only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAUSED - Amazon Macie started the job, but completion of the job would exceed one or more quotas for your
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - The job is in progress.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Possible value are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job ran or will run only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *        </p>
     *        </li>
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The schedule for running the job. Possible value are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE_TIME - The job ran or will run only once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *         </p>
     *         </li>
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Possible value are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job ran or will run only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobSummary withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The schedule for running the job. Possible value are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Possible value are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job ran or will run only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobSummary withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The custom name of the job.
     * </p>
     * 
     * @param name
     *        The custom name of the job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the job.
     * </p>
     * 
     * @return The custom name of the job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the job.
     * </p>
     * 
     * @param name
     *        The custom name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withName(String name) {
        setName(name);
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
        if (getBucketDefinitions() != null)
            sb.append("BucketDefinitions: ").append(getBucketDefinitions()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSummary == false)
            return false;
        JobSummary other = (JobSummary) obj;
        if (other.getBucketDefinitions() == null ^ this.getBucketDefinitions() == null)
            return false;
        if (other.getBucketDefinitions() != null && other.getBucketDefinitions().equals(this.getBucketDefinitions()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketDefinitions() == null) ? 0 : getBucketDefinitions().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public JobSummary clone() {
        try {
            return (JobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.JobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
