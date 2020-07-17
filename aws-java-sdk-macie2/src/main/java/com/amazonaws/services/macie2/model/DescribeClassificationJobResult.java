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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeClassificationJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClassificationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that was provided to ensure the idempotency of the request to create the job.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The custom data identifiers that the job uses to analyze data.
     * </p>
     */
    private java.util.List<String> customDataIdentifierIds;
    /**
     * <p>
     * The custom description of the job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the job has run for the first time.
     * </p>
     */
    private Boolean initialRun;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     */
    private String jobArn;
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
     * The schedule for running the job. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     */
    private String jobType;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job last ran.
     * </p>
     */
    private java.util.Date lastRunTime;
    /**
     * <p>
     * The custom name of the job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The S3 buckets that the job is configured to analyze, and the scope of that analysis.
     * </p>
     */
    private S3JobDefinition s3JobDefinition;
    /**
     * <p>
     * The sampling depth, as a percentage, that the job applies when it processes objects.
     * </p>
     */
    private Integer samplingPercentage;
    /**
     * <p>
     * The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
     * </p>
     */
    private JobScheduleFrequency scheduleFrequency;
    /**
     * <p>
     * The number of times that the job has run and processing statistics for the job's most recent run.
     * </p>
     */
    private Statistics statistics;
    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the classification
     * job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The token that was provided to ensure the idempotency of the request to create the job.
     * </p>
     * 
     * @param clientToken
     *        The token that was provided to ensure the idempotency of the request to create the job.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The token that was provided to ensure the idempotency of the request to create the job.
     * </p>
     * 
     * @return The token that was provided to ensure the idempotency of the request to create the job.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The token that was provided to ensure the idempotency of the request to create the job.
     * </p>
     * 
     * @param clientToken
     *        The token that was provided to ensure the idempotency of the request to create the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public DescribeClassificationJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The custom data identifiers that the job uses to analyze data.
     * </p>
     * 
     * @return The custom data identifiers that the job uses to analyze data.
     */

    public java.util.List<String> getCustomDataIdentifierIds() {
        return customDataIdentifierIds;
    }

    /**
     * <p>
     * The custom data identifiers that the job uses to analyze data.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        The custom data identifiers that the job uses to analyze data.
     */

    public void setCustomDataIdentifierIds(java.util.Collection<String> customDataIdentifierIds) {
        if (customDataIdentifierIds == null) {
            this.customDataIdentifierIds = null;
            return;
        }

        this.customDataIdentifierIds = new java.util.ArrayList<String>(customDataIdentifierIds);
    }

    /**
     * <p>
     * The custom data identifiers that the job uses to analyze data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDataIdentifierIds(java.util.Collection)} or
     * {@link #withCustomDataIdentifierIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        The custom data identifiers that the job uses to analyze data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withCustomDataIdentifierIds(String... customDataIdentifierIds) {
        if (this.customDataIdentifierIds == null) {
            setCustomDataIdentifierIds(new java.util.ArrayList<String>(customDataIdentifierIds.length));
        }
        for (String ele : customDataIdentifierIds) {
            this.customDataIdentifierIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom data identifiers that the job uses to analyze data.
     * </p>
     * 
     * @param customDataIdentifierIds
     *        The custom data identifiers that the job uses to analyze data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withCustomDataIdentifierIds(java.util.Collection<String> customDataIdentifierIds) {
        setCustomDataIdentifierIds(customDataIdentifierIds);
        return this;
    }

    /**
     * <p>
     * The custom description of the job.
     * </p>
     * 
     * @param description
     *        The custom description of the job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the job.
     * </p>
     * 
     * @return The custom description of the job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the job.
     * </p>
     * 
     * @param description
     *        The custom description of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job has run for the first time.
     * </p>
     * 
     * @param initialRun
     *        Specifies whether the job has run for the first time.
     */

    public void setInitialRun(Boolean initialRun) {
        this.initialRun = initialRun;
    }

    /**
     * <p>
     * Specifies whether the job has run for the first time.
     * </p>
     * 
     * @return Specifies whether the job has run for the first time.
     */

    public Boolean getInitialRun() {
        return this.initialRun;
    }

    /**
     * <p>
     * Specifies whether the job has run for the first time.
     * </p>
     * 
     * @param initialRun
     *        Specifies whether the job has run for the first time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withInitialRun(Boolean initialRun) {
        setInitialRun(initialRun);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job has run for the first time.
     * </p>
     * 
     * @return Specifies whether the job has run for the first time.
     */

    public Boolean isInitialRun() {
        return this.initialRun;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param jobArn
     *        The Amazon Resource Name (ARN) of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withJobArn(String jobArn) {
        setJobArn(jobArn);
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

    public DescribeClassificationJobResult withJobId(String jobId) {
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
     *        The current status of the job. Possible values are:</p>
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
     * The current status of the job. Possible values are:
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
     * @return The current status of the job. Possible values are:</p>
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
     * The current status of the job. Possible values are:
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
     *        The current status of the job. Possible values are:</p>
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

    public DescribeClassificationJobResult withJobStatus(String jobStatus) {
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
     *        The current status of the job. Possible values are:</p>
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

    public DescribeClassificationJobResult withJobStatus(JobStatus jobStatus) {
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
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job ran or will run only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates
     *        the recurrence pattern for the job.
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
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The schedule for running the job. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ONE_TIME - The job ran or will run only once.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates
     *         the recurrence pattern for the job.
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
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job ran or will run only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates
     *        the recurrence pattern for the job.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public DescribeClassificationJobResult withJobType(String jobType) {
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
     * ONE_TIME - The job ran or will run only once.
     * </p>
     * </li>
     * <li>
     * <p>
     * SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates the
     * recurrence pattern for the job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobType
     *        The schedule for running the job. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ONE_TIME - The job ran or will run only once.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SCHEDULED - The job runs on a daily, weekly, or monthly basis. The scheduleFrequency property indicates
     *        the recurrence pattern for the job.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public DescribeClassificationJobResult withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job last ran.
     * </p>
     * 
     * @param lastRunTime
     *        The date and time, in UTC and extended ISO 8601 format, when the job last ran.
     */

    public void setLastRunTime(java.util.Date lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job last ran.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the job last ran.
     */

    public java.util.Date getLastRunTime() {
        return this.lastRunTime;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job last ran.
     * </p>
     * 
     * @param lastRunTime
     *        The date and time, in UTC and extended ISO 8601 format, when the job last ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withLastRunTime(java.util.Date lastRunTime) {
        setLastRunTime(lastRunTime);
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

    public DescribeClassificationJobResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze, and the scope of that analysis.
     * </p>
     * 
     * @param s3JobDefinition
     *        The S3 buckets that the job is configured to analyze, and the scope of that analysis.
     */

    public void setS3JobDefinition(S3JobDefinition s3JobDefinition) {
        this.s3JobDefinition = s3JobDefinition;
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze, and the scope of that analysis.
     * </p>
     * 
     * @return The S3 buckets that the job is configured to analyze, and the scope of that analysis.
     */

    public S3JobDefinition getS3JobDefinition() {
        return this.s3JobDefinition;
    }

    /**
     * <p>
     * The S3 buckets that the job is configured to analyze, and the scope of that analysis.
     * </p>
     * 
     * @param s3JobDefinition
     *        The S3 buckets that the job is configured to analyze, and the scope of that analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withS3JobDefinition(S3JobDefinition s3JobDefinition) {
        setS3JobDefinition(s3JobDefinition);
        return this;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, that the job applies when it processes objects.
     * </p>
     * 
     * @param samplingPercentage
     *        The sampling depth, as a percentage, that the job applies when it processes objects.
     */

    public void setSamplingPercentage(Integer samplingPercentage) {
        this.samplingPercentage = samplingPercentage;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, that the job applies when it processes objects.
     * </p>
     * 
     * @return The sampling depth, as a percentage, that the job applies when it processes objects.
     */

    public Integer getSamplingPercentage() {
        return this.samplingPercentage;
    }

    /**
     * <p>
     * The sampling depth, as a percentage, that the job applies when it processes objects.
     * </p>
     * 
     * @param samplingPercentage
     *        The sampling depth, as a percentage, that the job applies when it processes objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withSamplingPercentage(Integer samplingPercentage) {
        setSamplingPercentage(samplingPercentage);
        return this;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
     * </p>
     * 
     * @param scheduleFrequency
     *        The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
     */

    public void setScheduleFrequency(JobScheduleFrequency scheduleFrequency) {
        this.scheduleFrequency = scheduleFrequency;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
     * </p>
     * 
     * @return The recurrence pattern for running the job. If the job is configured to run only once, this value is
     *         null.
     */

    public JobScheduleFrequency getScheduleFrequency() {
        return this.scheduleFrequency;
    }

    /**
     * <p>
     * The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
     * </p>
     * 
     * @param scheduleFrequency
     *        The recurrence pattern for running the job. If the job is configured to run only once, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withScheduleFrequency(JobScheduleFrequency scheduleFrequency) {
        setScheduleFrequency(scheduleFrequency);
        return this;
    }

    /**
     * <p>
     * The number of times that the job has run and processing statistics for the job's most recent run.
     * </p>
     * 
     * @param statistics
     *        The number of times that the job has run and processing statistics for the job's most recent run.
     */

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The number of times that the job has run and processing statistics for the job's most recent run.
     * </p>
     * 
     * @return The number of times that the job has run and processing statistics for the job's most recent run.
     */

    public Statistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The number of times that the job has run and processing statistics for the job's most recent run.
     * </p>
     * 
     * @param statistics
     *        The number of times that the job has run and processing statistics for the job's most recent run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withStatistics(Statistics statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the classification
     * job.
     * </p>
     * 
     * @return A map of key-value pairs that identifies the tags (keys and values) that are associated with the
     *         classification job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the classification
     * job.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the
     *        classification job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the classification
     * job.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the
     *        classification job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeClassificationJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClassificationJobResult clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCustomDataIdentifierIds() != null)
            sb.append("CustomDataIdentifierIds: ").append(getCustomDataIdentifierIds()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInitialRun() != null)
            sb.append("InitialRun: ").append(getInitialRun()).append(",");
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getLastRunTime() != null)
            sb.append("LastRunTime: ").append(getLastRunTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3JobDefinition() != null)
            sb.append("S3JobDefinition: ").append(getS3JobDefinition()).append(",");
        if (getSamplingPercentage() != null)
            sb.append("SamplingPercentage: ").append(getSamplingPercentage()).append(",");
        if (getScheduleFrequency() != null)
            sb.append("ScheduleFrequency: ").append(getScheduleFrequency()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClassificationJobResult == false)
            return false;
        DescribeClassificationJobResult other = (DescribeClassificationJobResult) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCustomDataIdentifierIds() == null ^ this.getCustomDataIdentifierIds() == null)
            return false;
        if (other.getCustomDataIdentifierIds() != null && other.getCustomDataIdentifierIds().equals(this.getCustomDataIdentifierIds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInitialRun() == null ^ this.getInitialRun() == null)
            return false;
        if (other.getInitialRun() != null && other.getInitialRun().equals(this.getInitialRun()) == false)
            return false;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
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
        if (other.getLastRunTime() == null ^ this.getLastRunTime() == null)
            return false;
        if (other.getLastRunTime() != null && other.getLastRunTime().equals(this.getLastRunTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3JobDefinition() == null ^ this.getS3JobDefinition() == null)
            return false;
        if (other.getS3JobDefinition() != null && other.getS3JobDefinition().equals(this.getS3JobDefinition()) == false)
            return false;
        if (other.getSamplingPercentage() == null ^ this.getSamplingPercentage() == null)
            return false;
        if (other.getSamplingPercentage() != null && other.getSamplingPercentage().equals(this.getSamplingPercentage()) == false)
            return false;
        if (other.getScheduleFrequency() == null ^ this.getScheduleFrequency() == null)
            return false;
        if (other.getScheduleFrequency() != null && other.getScheduleFrequency().equals(this.getScheduleFrequency()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCustomDataIdentifierIds() == null) ? 0 : getCustomDataIdentifierIds().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInitialRun() == null) ? 0 : getInitialRun().hashCode());
        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getLastRunTime() == null) ? 0 : getLastRunTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3JobDefinition() == null) ? 0 : getS3JobDefinition().hashCode());
        hashCode = prime * hashCode + ((getSamplingPercentage() == null) ? 0 : getSamplingPercentage().hashCode());
        hashCode = prime * hashCode + ((getScheduleFrequency() == null) ? 0 : getScheduleFrequency().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClassificationJobResult clone() {
        try {
            return (DescribeClassificationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
