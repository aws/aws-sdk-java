/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetIdentityResolutionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityResolutionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The unique identifier of the Identity Resolution Job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status of the Identity Resolution Job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off the
     * Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify profiles
     * that belong to the same matching group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity Resolution
     * Job writes a message indicating the source of the problem.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating the
     * source of the problem.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The error messages that are generated when the Identity Resolution Job runs.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was started or will be started.
     * </p>
     */
    private java.util.Date jobStartTime;
    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was completed.
     * </p>
     */
    private java.util.Date jobEndTime;
    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was most recently edited.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The timestamp of when the Identity Resolution Job will expire.
     * </p>
     */
    private java.util.Date jobExpirationTime;
    /**
     * <p>
     * Configuration settings for how to perform the auto-merging of profiles.
     * </p>
     */
    private AutoMerging autoMerging;
    /**
     * <p>
     * The S3 location where the Identity Resolution Job writes result files.
     * </p>
     */
    private ExportingLocation exportingLocation;
    /**
     * <p>
     * Statistics about the Identity Resolution Job.
     * </p>
     */
    private JobStats jobStats;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Identity Resolution Job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier of the Identity Resolution Job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier of the Identity Resolution Job.
     * </p>
     * 
     * @return The unique identifier of the Identity Resolution Job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier of the Identity Resolution Job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier of the Identity Resolution Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status of the Identity Resolution Job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off the
     * Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify profiles
     * that belong to the same matching group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity Resolution
     * Job writes a message indicating the source of the problem.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating the
     * source of the problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the Identity Resolution Job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off
     *        the Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify
     *        profiles that belong to the same matching group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity
     *        Resolution Job writes a message indicating the source of the problem.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating
     *        the source of the problem.
     *        </p>
     *        </li>
     * @see IdentityResolutionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Identity Resolution Job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off the
     * Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify profiles
     * that belong to the same matching group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity Resolution
     * Job writes a message indicating the source of the problem.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating the
     * source of the problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the Identity Resolution Job.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off
     *         the Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify
     *         profiles that belong to the same matching group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity
     *         Resolution Job writes a message indicating the source of the problem.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating
     *         the source of the problem.
     *         </p>
     *         </li>
     * @see IdentityResolutionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Identity Resolution Job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off the
     * Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify profiles
     * that belong to the same matching group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity Resolution
     * Job writes a message indicating the source of the problem.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating the
     * source of the problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the Identity Resolution Job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off
     *        the Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify
     *        profiles that belong to the same matching group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity
     *        Resolution Job writes a message indicating the source of the problem.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating
     *        the source of the problem.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityResolutionJobStatus
     */

    public GetIdentityResolutionJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Identity Resolution Job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off the
     * Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify profiles
     * that belong to the same matching group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity Resolution
     * Job writes a message indicating the source of the problem.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating the
     * source of the problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the Identity Resolution Job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The Identity Resolution Job is scheduled but has not started yet. If you turn off
     *        the Identity Resolution feature in your domain, jobs in the <code>PENDING</code> state are deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PREPROCESSING</code>: The Identity Resolution Job is loading your data.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIND_MATCHING</code>: The Identity Resolution Job is using the machine learning model to identify
     *        profiles that belong to the same matching group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MERGING</code>: The Identity Resolution Job is merging duplicate profiles.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The Identity Resolution Job completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARTIAL_SUCCESS</code>: There's a system error and not all of the data is merged. The Identity
     *        Resolution Job writes a message indicating the source of the problem.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The Identity Resolution Job did not merge any data. It writes a message indicating
     *        the source of the problem.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityResolutionJobStatus
     */

    public GetIdentityResolutionJobResult withStatus(IdentityResolutionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error messages that are generated when the Identity Resolution Job runs.
     * </p>
     * 
     * @param message
     *        The error messages that are generated when the Identity Resolution Job runs.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error messages that are generated when the Identity Resolution Job runs.
     * </p>
     * 
     * @return The error messages that are generated when the Identity Resolution Job runs.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error messages that are generated when the Identity Resolution Job runs.
     * </p>
     * 
     * @param message
     *        The error messages that are generated when the Identity Resolution Job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was started or will be started.
     * </p>
     * 
     * @param jobStartTime
     *        The timestamp of when the Identity Resolution Job was started or will be started.
     */

    public void setJobStartTime(java.util.Date jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was started or will be started.
     * </p>
     * 
     * @return The timestamp of when the Identity Resolution Job was started or will be started.
     */

    public java.util.Date getJobStartTime() {
        return this.jobStartTime;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was started or will be started.
     * </p>
     * 
     * @param jobStartTime
     *        The timestamp of when the Identity Resolution Job was started or will be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withJobStartTime(java.util.Date jobStartTime) {
        setJobStartTime(jobStartTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was completed.
     * </p>
     * 
     * @param jobEndTime
     *        The timestamp of when the Identity Resolution Job was completed.
     */

    public void setJobEndTime(java.util.Date jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was completed.
     * </p>
     * 
     * @return The timestamp of when the Identity Resolution Job was completed.
     */

    public java.util.Date getJobEndTime() {
        return this.jobEndTime;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was completed.
     * </p>
     * 
     * @param jobEndTime
     *        The timestamp of when the Identity Resolution Job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withJobEndTime(java.util.Date jobEndTime) {
        setJobEndTime(jobEndTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the Identity Resolution Job was most recently edited.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was most recently edited.
     * </p>
     * 
     * @return The timestamp of when the Identity Resolution Job was most recently edited.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the Identity Resolution Job was most recently edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job will expire.
     * </p>
     * 
     * @param jobExpirationTime
     *        The timestamp of when the Identity Resolution Job will expire.
     */

    public void setJobExpirationTime(java.util.Date jobExpirationTime) {
        this.jobExpirationTime = jobExpirationTime;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job will expire.
     * </p>
     * 
     * @return The timestamp of when the Identity Resolution Job will expire.
     */

    public java.util.Date getJobExpirationTime() {
        return this.jobExpirationTime;
    }

    /**
     * <p>
     * The timestamp of when the Identity Resolution Job will expire.
     * </p>
     * 
     * @param jobExpirationTime
     *        The timestamp of when the Identity Resolution Job will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withJobExpirationTime(java.util.Date jobExpirationTime) {
        setJobExpirationTime(jobExpirationTime);
        return this;
    }

    /**
     * <p>
     * Configuration settings for how to perform the auto-merging of profiles.
     * </p>
     * 
     * @param autoMerging
     *        Configuration settings for how to perform the auto-merging of profiles.
     */

    public void setAutoMerging(AutoMerging autoMerging) {
        this.autoMerging = autoMerging;
    }

    /**
     * <p>
     * Configuration settings for how to perform the auto-merging of profiles.
     * </p>
     * 
     * @return Configuration settings for how to perform the auto-merging of profiles.
     */

    public AutoMerging getAutoMerging() {
        return this.autoMerging;
    }

    /**
     * <p>
     * Configuration settings for how to perform the auto-merging of profiles.
     * </p>
     * 
     * @param autoMerging
     *        Configuration settings for how to perform the auto-merging of profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withAutoMerging(AutoMerging autoMerging) {
        setAutoMerging(autoMerging);
        return this;
    }

    /**
     * <p>
     * The S3 location where the Identity Resolution Job writes result files.
     * </p>
     * 
     * @param exportingLocation
     *        The S3 location where the Identity Resolution Job writes result files.
     */

    public void setExportingLocation(ExportingLocation exportingLocation) {
        this.exportingLocation = exportingLocation;
    }

    /**
     * <p>
     * The S3 location where the Identity Resolution Job writes result files.
     * </p>
     * 
     * @return The S3 location where the Identity Resolution Job writes result files.
     */

    public ExportingLocation getExportingLocation() {
        return this.exportingLocation;
    }

    /**
     * <p>
     * The S3 location where the Identity Resolution Job writes result files.
     * </p>
     * 
     * @param exportingLocation
     *        The S3 location where the Identity Resolution Job writes result files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withExportingLocation(ExportingLocation exportingLocation) {
        setExportingLocation(exportingLocation);
        return this;
    }

    /**
     * <p>
     * Statistics about the Identity Resolution Job.
     * </p>
     * 
     * @param jobStats
     *        Statistics about the Identity Resolution Job.
     */

    public void setJobStats(JobStats jobStats) {
        this.jobStats = jobStats;
    }

    /**
     * <p>
     * Statistics about the Identity Resolution Job.
     * </p>
     * 
     * @return Statistics about the Identity Resolution Job.
     */

    public JobStats getJobStats() {
        return this.jobStats;
    }

    /**
     * <p>
     * Statistics about the Identity Resolution Job.
     * </p>
     * 
     * @param jobStats
     *        Statistics about the Identity Resolution Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityResolutionJobResult withJobStats(JobStats jobStats) {
        setJobStats(jobStats);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getJobStartTime() != null)
            sb.append("JobStartTime: ").append(getJobStartTime()).append(",");
        if (getJobEndTime() != null)
            sb.append("JobEndTime: ").append(getJobEndTime()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getJobExpirationTime() != null)
            sb.append("JobExpirationTime: ").append(getJobExpirationTime()).append(",");
        if (getAutoMerging() != null)
            sb.append("AutoMerging: ").append(getAutoMerging()).append(",");
        if (getExportingLocation() != null)
            sb.append("ExportingLocation: ").append(getExportingLocation()).append(",");
        if (getJobStats() != null)
            sb.append("JobStats: ").append(getJobStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityResolutionJobResult == false)
            return false;
        GetIdentityResolutionJobResult other = (GetIdentityResolutionJobResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getJobStartTime() == null ^ this.getJobStartTime() == null)
            return false;
        if (other.getJobStartTime() != null && other.getJobStartTime().equals(this.getJobStartTime()) == false)
            return false;
        if (other.getJobEndTime() == null ^ this.getJobEndTime() == null)
            return false;
        if (other.getJobEndTime() != null && other.getJobEndTime().equals(this.getJobEndTime()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getJobExpirationTime() == null ^ this.getJobExpirationTime() == null)
            return false;
        if (other.getJobExpirationTime() != null && other.getJobExpirationTime().equals(this.getJobExpirationTime()) == false)
            return false;
        if (other.getAutoMerging() == null ^ this.getAutoMerging() == null)
            return false;
        if (other.getAutoMerging() != null && other.getAutoMerging().equals(this.getAutoMerging()) == false)
            return false;
        if (other.getExportingLocation() == null ^ this.getExportingLocation() == null)
            return false;
        if (other.getExportingLocation() != null && other.getExportingLocation().equals(this.getExportingLocation()) == false)
            return false;
        if (other.getJobStats() == null ^ this.getJobStats() == null)
            return false;
        if (other.getJobStats() != null && other.getJobStats().equals(this.getJobStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getJobStartTime() == null) ? 0 : getJobStartTime().hashCode());
        hashCode = prime * hashCode + ((getJobEndTime() == null) ? 0 : getJobEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getJobExpirationTime() == null) ? 0 : getJobExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getAutoMerging() == null) ? 0 : getAutoMerging().hashCode());
        hashCode = prime * hashCode + ((getExportingLocation() == null) ? 0 : getExportingLocation().hashCode());
        hashCode = prime * hashCode + ((getJobStats() == null) ? 0 : getJobStats().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityResolutionJobResult clone() {
        try {
            return (GetIdentityResolutionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
