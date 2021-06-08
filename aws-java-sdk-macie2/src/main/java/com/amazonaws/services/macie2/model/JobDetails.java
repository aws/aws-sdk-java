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
 * Specifies whether any one-time or recurring classification jobs are configured to analyze data in an S3 bucket, and,
 * if so, the details of the job that ran most recently.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/JobDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more jobs
     * and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the bucket criteria
     * (S3BucketCriteriaForJob) for at least one job that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any jobs,
     * all the jobs that explicitly include the bucket in their bucket definitions have a status of CANCELLED, or the
     * bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     */
    private String isDefinedInJob;
    /**
     * <p>
     * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more
     * recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more recurring jobs.
     * At least one of those jobs has a status other than CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     * recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring jobs, or
     * all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String isMonitoredByJob;
    /**
     * <p>
     * The unique identifier for the job that ran most recently and is configured to analyze data in the bucket, either
     * the latest run of a recurring job or the only run of a one-time job.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     */
    private String lastJobId;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a
     * recurring job, this value indicates when the most recent run started.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     */
    private java.util.Date lastJobRunTime;

    /**
     * <p>
     * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more jobs
     * and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the bucket criteria
     * (S3BucketCriteriaForJob) for at least one job that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any jobs,
     * all the jobs that explicitly include the bucket in their bucket definitions have a status of CANCELLED, or the
     * bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param isDefinedInJob
     *        Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *        more jobs and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the
     *        bucket criteria (S3BucketCriteriaForJob) for at least one job that previously ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *        jobs, all the jobs that explicitly include the bucket in their bucket definitions have a status of
     *        CANCELLED, or the bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that
     *        previously ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @see IsDefinedInJob
     */

    public void setIsDefinedInJob(String isDefinedInJob) {
        this.isDefinedInJob = isDefinedInJob;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more jobs
     * and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the bucket criteria
     * (S3BucketCriteriaForJob) for at least one job that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any jobs,
     * all the jobs that explicitly include the bucket in their bucket definitions have a status of CANCELLED, or the
     * bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @return Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible
     *         values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *         more jobs and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the
     *         bucket criteria (S3BucketCriteriaForJob) for at least one job that previously ran.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *         jobs, all the jobs that explicitly include the bucket in their bucket definitions have a status of
     *         CANCELLED, or the bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that
     *         previously ran.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     * @see IsDefinedInJob
     */

    public String getIsDefinedInJob() {
        return this.isDefinedInJob;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more jobs
     * and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the bucket criteria
     * (S3BucketCriteriaForJob) for at least one job that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any jobs,
     * all the jobs that explicitly include the bucket in their bucket definitions have a status of CANCELLED, or the
     * bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param isDefinedInJob
     *        Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *        more jobs and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the
     *        bucket criteria (S3BucketCriteriaForJob) for at least one job that previously ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *        jobs, all the jobs that explicitly include the bucket in their bucket definitions have a status of
     *        CANCELLED, or the bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that
     *        previously ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IsDefinedInJob
     */

    public JobDetails withIsDefinedInJob(String isDefinedInJob) {
        setIsDefinedInJob(isDefinedInJob);
        return this;
    }

    /**
     * <p>
     * Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more jobs
     * and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the bucket criteria
     * (S3BucketCriteriaForJob) for at least one job that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any jobs,
     * all the jobs that explicitly include the bucket in their bucket definitions have a status of CANCELLED, or the
     * bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that previously ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * </p>
     * 
     * @param isDefinedInJob
     *        Specifies whether any one-time or recurring jobs are configured to analyze data in the bucket. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *        more jobs and at least one of those jobs has a status other than CANCELLED. Or the bucket matched the
     *        bucket criteria (S3BucketCriteriaForJob) for at least one job that previously ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *        jobs, all the jobs that explicitly include the bucket in their bucket definitions have a status of
     *        CANCELLED, or the bucket didn't match the bucket criteria (S3BucketCriteriaForJob) for any jobs that
     *        previously ran.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IsDefinedInJob
     */

    public JobDetails withIsDefinedInJob(IsDefinedInJob isDefinedInJob) {
        this.isDefinedInJob = isDefinedInJob.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more
     * recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more recurring jobs.
     * At least one of those jobs has a status other than CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     * recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring jobs, or
     * all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param isMonitoredByJob
     *        Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *        more recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more
     *        recurring jobs. At least one of those jobs has a status other than CANCELLED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *        recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring
     *        jobs, or all the recurring jobs that are configured to analyze data in the bucket have a status of
     *        CANCELLED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *        </p>
     *        </li>
     * @see IsMonitoredByJob
     */

    public void setIsMonitoredByJob(String isMonitoredByJob) {
        this.isMonitoredByJob = isMonitoredByJob;
    }

    /**
     * <p>
     * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more
     * recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more recurring jobs.
     * At least one of those jobs has a status other than CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     * recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring jobs, or
     * all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values
     *         are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *         more recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more
     *         recurring jobs. At least one of those jobs has a status other than CANCELLED.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *         recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring
     *         jobs, or all the recurring jobs that are configured to analyze data in the bucket have a status of
     *         CANCELLED.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *         </p>
     *         </li>
     * @see IsMonitoredByJob
     */

    public String getIsMonitoredByJob() {
        return this.isMonitoredByJob;
    }

    /**
     * <p>
     * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more
     * recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more recurring jobs.
     * At least one of those jobs has a status other than CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     * recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring jobs, or
     * all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param isMonitoredByJob
     *        Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *        more recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more
     *        recurring jobs. At least one of those jobs has a status other than CANCELLED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *        recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring
     *        jobs, or all the recurring jobs that are configured to analyze data in the bucket have a status of
     *        CANCELLED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IsMonitoredByJob
     */

    public JobDetails withIsMonitoredByJob(String isMonitoredByJob) {
        setIsMonitoredByJob(isMonitoredByJob);
        return this;
    }

    /**
     * <p>
     * Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or more
     * recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more recurring jobs.
     * At least one of those jobs has a status other than CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     * recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring jobs, or
     * all the recurring jobs that are configured to analyze data in the bucket have a status of CANCELLED.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param isMonitoredByJob
     *        Specifies whether any recurring jobs are configured to analyze data in the bucket. Possible values
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        TRUE - The bucket is explicitly included in the bucket definition (S3BucketDefinitionForJob) for one or
     *        more recurring jobs or the bucket matches the bucket criteria (S3BucketCriteriaForJob) for one or more
     *        recurring jobs. At least one of those jobs has a status other than CANCELLED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FALSE - The bucket isn't explicitly included in the bucket definition (S3BucketDefinitionForJob) for any
     *        recurring jobs, the bucket doesn't match the bucket criteria (S3BucketCriteriaForJob) for any recurring
     *        jobs, or all the recurring jobs that are configured to analyze data in the bucket have a status of
     *        CANCELLED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - An exception occurred when Amazon Macie attempted to retrieve job data for the bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IsMonitoredByJob
     */

    public JobDetails withIsMonitoredByJob(IsMonitoredByJob isMonitoredByJob) {
        this.isMonitoredByJob = isMonitoredByJob.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the job that ran most recently and is configured to analyze data in the bucket, either
     * the latest run of a recurring job or the only run of a one-time job.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     * 
     * @param lastJobId
     *        The unique identifier for the job that ran most recently and is configured to analyze data in the bucket,
     *        either the latest run of a recurring job or the only run of a one-time job.</p>
     *        <p>
     *        This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     */

    public void setLastJobId(String lastJobId) {
        this.lastJobId = lastJobId;
    }

    /**
     * <p>
     * The unique identifier for the job that ran most recently and is configured to analyze data in the bucket, either
     * the latest run of a recurring job or the only run of a one-time job.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     * 
     * @return The unique identifier for the job that ran most recently and is configured to analyze data in the bucket,
     *         either the latest run of a recurring job or the only run of a one-time job.</p>
     *         <p>
     *         This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     */

    public String getLastJobId() {
        return this.lastJobId;
    }

    /**
     * <p>
     * The unique identifier for the job that ran most recently and is configured to analyze data in the bucket, either
     * the latest run of a recurring job or the only run of a one-time job.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     * 
     * @param lastJobId
     *        The unique identifier for the job that ran most recently and is configured to analyze data in the bucket,
     *        either the latest run of a recurring job or the only run of a one-time job.</p>
     *        <p>
     *        This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withLastJobId(String lastJobId) {
        setLastJobId(lastJobId);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a
     * recurring job, this value indicates when the most recent run started.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     * 
     * @param lastJobRunTime
     *        The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a
     *        recurring job, this value indicates when the most recent run started.</p>
     *        <p>
     *        This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     */

    public void setLastJobRunTime(java.util.Date lastJobRunTime) {
        this.lastJobRunTime = lastJobRunTime;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a
     * recurring job, this value indicates when the most recent run started.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a
     *         recurring job, this value indicates when the most recent run started.</p>
     *         <p>
     *         This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     */

    public java.util.Date getLastJobRunTime() {
        return this.lastJobRunTime;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a
     * recurring job, this value indicates when the most recent run started.
     * </p>
     * <p>
     * This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * </p>
     * 
     * @param lastJobRunTime
     *        The date and time, in UTC and extended ISO 8601 format, when the job (lastJobId) started. If the job is a
     *        recurring job, this value indicates when the most recent run started.</p>
     *        <p>
     *        This value is typically null if the value for the isDefinedInJob property is FALSE or UNKNOWN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withLastJobRunTime(java.util.Date lastJobRunTime) {
        setLastJobRunTime(lastJobRunTime);
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
        if (getIsDefinedInJob() != null)
            sb.append("IsDefinedInJob: ").append(getIsDefinedInJob()).append(",");
        if (getIsMonitoredByJob() != null)
            sb.append("IsMonitoredByJob: ").append(getIsMonitoredByJob()).append(",");
        if (getLastJobId() != null)
            sb.append("LastJobId: ").append(getLastJobId()).append(",");
        if (getLastJobRunTime() != null)
            sb.append("LastJobRunTime: ").append(getLastJobRunTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDetails == false)
            return false;
        JobDetails other = (JobDetails) obj;
        if (other.getIsDefinedInJob() == null ^ this.getIsDefinedInJob() == null)
            return false;
        if (other.getIsDefinedInJob() != null && other.getIsDefinedInJob().equals(this.getIsDefinedInJob()) == false)
            return false;
        if (other.getIsMonitoredByJob() == null ^ this.getIsMonitoredByJob() == null)
            return false;
        if (other.getIsMonitoredByJob() != null && other.getIsMonitoredByJob().equals(this.getIsMonitoredByJob()) == false)
            return false;
        if (other.getLastJobId() == null ^ this.getLastJobId() == null)
            return false;
        if (other.getLastJobId() != null && other.getLastJobId().equals(this.getLastJobId()) == false)
            return false;
        if (other.getLastJobRunTime() == null ^ this.getLastJobRunTime() == null)
            return false;
        if (other.getLastJobRunTime() != null && other.getLastJobRunTime().equals(this.getLastJobRunTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsDefinedInJob() == null) ? 0 : getIsDefinedInJob().hashCode());
        hashCode = prime * hashCode + ((getIsMonitoredByJob() == null) ? 0 : getIsMonitoredByJob().hashCode());
        hashCode = prime * hashCode + ((getLastJobId() == null) ? 0 : getLastJobId().hashCode());
        hashCode = prime * hashCode + ((getLastJobRunTime() == null) ? 0 : getLastJobRunTime().hashCode());
        return hashCode;
    }

    @Override
    public JobDetails clone() {
        try {
            return (JobDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.JobDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
