/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/JobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each object
     * specifies the account ID for an account and one or more buckets to analyze for that account. A job's definition
     * can contain a bucketDefinitions array or a bucketCriteria object, not both.
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
     * The current status of the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it within 30
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     * doesn't apply to recurring jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to one-time jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive data
     * discovery quota for your account or one or more member accounts that the job analyzes data for.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't resume it
     * within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the job's type. To
     * check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;
    /**
     * <p>
     * The schedule for running the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job runs only once.
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
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run.
     * </p>
     */
    private LastRunErrorStatus lastRunErrorStatus;
    /**
     * <p>
     * The custom name of the job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job or job run
     * will expire and be cancelled if it isn't resumed. This value is present only if the value for jobStatus is
     * USER_PAUSED.
     * </p>
     */
    private UserPausedDetails userPausedDetails;
    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets are included or excluded from the job's
     * analysis. Each time the job runs, the job uses these criteria to determine which buckets to analyze. A job's
     * definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     */
    private S3BucketCriteriaForJob bucketCriteria;

    /**
     * <p>
     * An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each object
     * specifies the account ID for an account and one or more buckets to analyze for that account. A job's definition
     * can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * 
     * @return An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each
     *         object specifies the account ID for an account and one or more buckets to analyze for that account. A
     *         job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
     */

    public java.util.List<S3BucketDefinitionForJob> getBucketDefinitions() {
        return bucketDefinitions;
    }

    /**
     * <p>
     * An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each object
     * specifies the account ID for an account and one or more buckets to analyze for that account. A job's definition
     * can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * 
     * @param bucketDefinitions
     *        An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each
     *        object specifies the account ID for an account and one or more buckets to analyze for that account. A
     *        job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
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
     * An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each object
     * specifies the account ID for an account and one or more buckets to analyze for that account. A job's definition
     * can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBucketDefinitions(java.util.Collection)} or {@link #withBucketDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param bucketDefinitions
     *        An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each
     *        object specifies the account ID for an account and one or more buckets to analyze for that account. A
     *        job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
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
     * An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each object
     * specifies the account ID for an account and one or more buckets to analyze for that account. A job's definition
     * can contain a bucketDefinitions array or a bucketCriteria object, not both.
     * </p>
     * 
     * @param bucketDefinitions
     *        An array of objects, one for each AWS account that owns specific S3 buckets for the job to analyze. Each
     *        object specifies the account ID for an account and one or more buckets to analyze for that account. A
     *        job's definition can contain a bucketDefinitions array or a bucketCriteria object, not both.
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
     * The current status of the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it within 30
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     * doesn't apply to recurring jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to one-time jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive data
     * discovery quota for your account or one or more member accounts that the job analyzes data for.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't resume it
     * within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the job's type. To
     * check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The current status of the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it
     *        within 30 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     *        doesn't apply to recurring jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *        This value doesn't apply to one-time jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive
     *        data discovery quota for your account or one or more member accounts that the job analyzes data for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't
     *        resume it within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the
     *        job's type. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     *        </p>
     *        </li>
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it within 30
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     * doesn't apply to recurring jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to one-time jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive data
     * discovery quota for your account or one or more member accounts that the job analyzes data for.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't resume it
     * within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the job's type. To
     * check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the job. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it
     *         within 30 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This
     *         value doesn't apply to recurring jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *         This value doesn't apply to one-time jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly
     *         sensitive data discovery quota for your account or one or more member accounts that the job analyzes data
     *         for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in
     *         progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't
     *         resume it within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the
     *         job's type. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     *         </p>
     *         </li>
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it within 30
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     * doesn't apply to recurring jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to one-time jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive data
     * discovery quota for your account or one or more member accounts that the job analyzes data for.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't resume it
     * within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the job's type. To
     * check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The current status of the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it
     *        within 30 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     *        doesn't apply to recurring jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *        This value doesn't apply to one-time jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive
     *        data discovery quota for your account or one or more member accounts that the job analyzes data for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't
     *        resume it within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the
     *        job's type. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
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
     * The current status of the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it within 30
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     * doesn't apply to recurring jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending. This
     * value doesn't apply to one-time jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive data
     * discovery quota for your account or one or more member accounts that the job analyzes data for.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't resume it
     * within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the job's type. To
     * check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The current status of the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CANCELLED - You cancelled the job or, if it's a one-time job, you paused the job and didn't resume it
     *        within 30 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPLETE - For a one-time job, Amazon Macie finished processing the data specified for the job. This value
     *        doesn't apply to recurring jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IDLE - For a recurring job, the previous scheduled run is complete and the next scheduled run is pending.
     *        This value doesn't apply to one-time jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PAUSED - Amazon Macie started running the job but additional processing would exceed the monthly sensitive
     *        data discovery quota for your account or one or more member accounts that the job analyzes data for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING - For a one-time job, the job is in progress. For a recurring job, a scheduled run is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PAUSED - You paused the job. If you paused the job while it had a status of RUNNING and you don't
     *        resume it within 30 days of pausing it, the job or job run will expire and be cancelled, depending on the
     *        job's type. To check the expiration date, refer to the UserPausedDetails.jobExpiresAt property.
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
     * The schedule for running the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job runs only once.
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
     *        The schedule for running the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job runs only once.
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
     * The schedule for running the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job runs only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The schedule for running the job. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE_TIME - The job runs only once.
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
     * The schedule for running the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job runs only once.
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
     *        The schedule for running the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job runs only once.
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
     * The schedule for running the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job runs only once.
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
     *        The schedule for running the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job runs only once.
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
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run.
     * </p>
     * 
     * @param lastRunErrorStatus
     *        Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring
     *        job, this value indicates the error status of the job's most recent run.
     */

    public void setLastRunErrorStatus(LastRunErrorStatus lastRunErrorStatus) {
        this.lastRunErrorStatus = lastRunErrorStatus;
    }

    /**
     * <p>
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run.
     * </p>
     * 
     * @return Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring
     *         job, this value indicates the error status of the job's most recent run.
     */

    public LastRunErrorStatus getLastRunErrorStatus() {
        return this.lastRunErrorStatus;
    }

    /**
     * <p>
     * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this
     * value indicates the error status of the job's most recent run.
     * </p>
     * 
     * @param lastRunErrorStatus
     *        Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring
     *        job, this value indicates the error status of the job's most recent run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withLastRunErrorStatus(LastRunErrorStatus lastRunErrorStatus) {
        setLastRunErrorStatus(lastRunErrorStatus);
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
     * <p>
     * If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job or job run
     * will expire and be cancelled if it isn't resumed. This value is present only if the value for jobStatus is
     * USER_PAUSED.
     * </p>
     * 
     * @param userPausedDetails
     *        If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job or job
     *        run will expire and be cancelled if it isn't resumed. This value is present only if the value for
     *        jobStatus is USER_PAUSED.
     */

    public void setUserPausedDetails(UserPausedDetails userPausedDetails) {
        this.userPausedDetails = userPausedDetails;
    }

    /**
     * <p>
     * If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job or job run
     * will expire and be cancelled if it isn't resumed. This value is present only if the value for jobStatus is
     * USER_PAUSED.
     * </p>
     * 
     * @return If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job or
     *         job run will expire and be cancelled if it isn't resumed. This value is present only if the value for
     *         jobStatus is USER_PAUSED.
     */

    public UserPausedDetails getUserPausedDetails() {
        return this.userPausedDetails;
    }

    /**
     * <p>
     * If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job or job run
     * will expire and be cancelled if it isn't resumed. This value is present only if the value for jobStatus is
     * USER_PAUSED.
     * </p>
     * 
     * @param userPausedDetails
     *        If the current status of the job is USER_PAUSED, specifies when the job was paused and when the job or job
     *        run will expire and be cancelled if it isn't resumed. This value is present only if the value for
     *        jobStatus is USER_PAUSED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withUserPausedDetails(UserPausedDetails userPausedDetails) {
        setUserPausedDetails(userPausedDetails);
        return this;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets are included or excluded from the job's
     * analysis. Each time the job runs, the job uses these criteria to determine which buckets to analyze. A job's
     * definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     * 
     * @param bucketCriteria
     *        The property- and tag-based conditions that determine which S3 buckets are included or excluded from the
     *        job's analysis. Each time the job runs, the job uses these criteria to determine which buckets to analyze.
     *        A job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     */

    public void setBucketCriteria(S3BucketCriteriaForJob bucketCriteria) {
        this.bucketCriteria = bucketCriteria;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets are included or excluded from the job's
     * analysis. Each time the job runs, the job uses these criteria to determine which buckets to analyze. A job's
     * definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     * 
     * @return The property- and tag-based conditions that determine which S3 buckets are included or excluded from the
     *         job's analysis. Each time the job runs, the job uses these criteria to determine which buckets to
     *         analyze. A job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     */

    public S3BucketCriteriaForJob getBucketCriteria() {
        return this.bucketCriteria;
    }

    /**
     * <p>
     * The property- and tag-based conditions that determine which S3 buckets are included or excluded from the job's
     * analysis. Each time the job runs, the job uses these criteria to determine which buckets to analyze. A job's
     * definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * </p>
     * 
     * @param bucketCriteria
     *        The property- and tag-based conditions that determine which S3 buckets are included or excluded from the
     *        job's analysis. Each time the job runs, the job uses these criteria to determine which buckets to analyze.
     *        A job's definition can contain a bucketCriteria object or a bucketDefinitions array, not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withBucketCriteria(S3BucketCriteriaForJob bucketCriteria) {
        setBucketCriteria(bucketCriteria);
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
        if (getLastRunErrorStatus() != null)
            sb.append("LastRunErrorStatus: ").append(getLastRunErrorStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUserPausedDetails() != null)
            sb.append("UserPausedDetails: ").append(getUserPausedDetails()).append(",");
        if (getBucketCriteria() != null)
            sb.append("BucketCriteria: ").append(getBucketCriteria());
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
        if (other.getLastRunErrorStatus() == null ^ this.getLastRunErrorStatus() == null)
            return false;
        if (other.getLastRunErrorStatus() != null && other.getLastRunErrorStatus().equals(this.getLastRunErrorStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUserPausedDetails() == null ^ this.getUserPausedDetails() == null)
            return false;
        if (other.getUserPausedDetails() != null && other.getUserPausedDetails().equals(this.getUserPausedDetails()) == false)
            return false;
        if (other.getBucketCriteria() == null ^ this.getBucketCriteria() == null)
            return false;
        if (other.getBucketCriteria() != null && other.getBucketCriteria().equals(this.getBucketCriteria()) == false)
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
        hashCode = prime * hashCode + ((getLastRunErrorStatus() == null) ? 0 : getLastRunErrorStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUserPausedDetails() == null) ? 0 : getUserPausedDetails().hashCode());
        hashCode = prime * hashCode + ((getBucketCriteria() == null) ? 0 : getBucketCriteria().hashCode());
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
