/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardSnapshotJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDashboardSnapshotJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     */
    private String snapshotJobId;
    /**
     * <p>
     * The user configuration for the snapshot job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     */
    private SnapshotUserConfigurationRedacted userConfiguration;
    /**
     * <p>
     * The snapshot configuration of the job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     */
    private SnapshotConfiguration snapshotConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Indicates the status of a job. The status updates as the job executes. This shows one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job failed to execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code> - The job is queued and hasn't started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The job is still running.
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;
    /**
     * <p>
     * The time that the snapshot job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that the snapshot job status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that you have started a snapshot job for.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     * 
     * @return The ID of the dashboard that you have started a snapshot job for.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that you have started a snapshot job for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param snapshotJobId
     *        The ID of the job to be described. The job ID is set when you start a new job with a
     *        <code>StartDashboardSnapshotJob</code> API call.
     */

    public void setSnapshotJobId(String snapshotJobId) {
        this.snapshotJobId = snapshotJobId;
    }

    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @return The ID of the job to be described. The job ID is set when you start a new job with a
     *         <code>StartDashboardSnapshotJob</code> API call.
     */

    public String getSnapshotJobId() {
        return this.snapshotJobId;
    }

    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param snapshotJobId
     *        The ID of the job to be described. The job ID is set when you start a new job with a
     *        <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withSnapshotJobId(String snapshotJobId) {
        setSnapshotJobId(snapshotJobId);
        return this;
    }

    /**
     * <p>
     * The user configuration for the snapshot job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param userConfiguration
     *        The user configuration for the snapshot job. This information is provided when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     */

    public void setUserConfiguration(SnapshotUserConfigurationRedacted userConfiguration) {
        this.userConfiguration = userConfiguration;
    }

    /**
     * <p>
     * The user configuration for the snapshot job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @return The user configuration for the snapshot job. This information is provided when you make a
     *         <code>StartDashboardSnapshotJob</code> API call.
     */

    public SnapshotUserConfigurationRedacted getUserConfiguration() {
        return this.userConfiguration;
    }

    /**
     * <p>
     * The user configuration for the snapshot job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param userConfiguration
     *        The user configuration for the snapshot job. This information is provided when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withUserConfiguration(SnapshotUserConfigurationRedacted userConfiguration) {
        setUserConfiguration(userConfiguration);
        return this;
    }

    /**
     * <p>
     * The snapshot configuration of the job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param snapshotConfiguration
     *        The snapshot configuration of the job. This information is provided when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     */

    public void setSnapshotConfiguration(SnapshotConfiguration snapshotConfiguration) {
        this.snapshotConfiguration = snapshotConfiguration;
    }

    /**
     * <p>
     * The snapshot configuration of the job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @return The snapshot configuration of the job. This information is provided when you make a
     *         <code>StartDashboardSnapshotJob</code> API call.
     */

    public SnapshotConfiguration getSnapshotConfiguration() {
        return this.snapshotConfiguration;
    }

    /**
     * <p>
     * The snapshot configuration of the job. This information is provided when you make a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param snapshotConfiguration
     *        The snapshot configuration of the job. This information is provided when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withSnapshotConfiguration(SnapshotConfiguration snapshotConfiguration) {
        setSnapshotConfiguration(snapshotConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job
     *        with a <code>StartDashboardSnapshotJob</code> API call.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job
     *         with a <code>StartDashboardSnapshotJob</code> API call.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job
     *        with a <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a job. The status updates as the job executes. This shows one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job failed to execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code> - The job is queued and hasn't started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The job is still running.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        Indicates the status of a job. The status updates as the job executes. This shows one of the following
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The job was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The job failed to execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code> - The job is queued and hasn't started yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The job is still running.
     *        </p>
     *        </li>
     * @see SnapshotJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job. The status updates as the job executes. This shows one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job failed to execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code> - The job is queued and hasn't started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The job is still running.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of a job. The status updates as the job executes. This shows one of the following
     *         values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> - The job was completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The job failed to execute.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUEUED</code> - The job is queued and hasn't started yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> - The job is still running.
     *         </p>
     *         </li>
     * @see SnapshotJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job. The status updates as the job executes. This shows one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job failed to execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code> - The job is queued and hasn't started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The job is still running.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        Indicates the status of a job. The status updates as the job executes. This shows one of the following
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The job was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The job failed to execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code> - The job is queued and hasn't started yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The job is still running.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotJobStatus
     */

    public DescribeDashboardSnapshotJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a job. The status updates as the job executes. This shows one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The job was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The job failed to execute.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUEUED</code> - The job is queued and hasn't started yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> - The job is still running.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        Indicates the status of a job. The status updates as the job executes. This shows one of the following
     *        values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The job was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The job failed to execute.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>QUEUED</code> - The job is queued and hasn't started yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> - The job is still running.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotJobStatus
     */

    public DescribeDashboardSnapshotJobResult withJobStatus(SnapshotJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that the snapshot job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the snapshot job was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the snapshot job was created.
     * </p>
     * 
     * @return The time that the snapshot job was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that the snapshot job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the snapshot job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that the snapshot job status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the snapshot job status was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the snapshot job status was last updated.
     * </p>
     * 
     * @return The time that the snapshot job status was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that the snapshot job status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that the snapshot job status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request
     * </p>
     * 
     * @param status
     *        The HTTP status of the request
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request
     * </p>
     * 
     * @return The HTTP status of the request
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request
     * </p>
     * 
     * @param status
     *        The HTTP status of the request
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResult withStatus(Integer status) {
        setStatus(status);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getSnapshotJobId() != null)
            sb.append("SnapshotJobId: ").append(getSnapshotJobId()).append(",");
        if (getUserConfiguration() != null)
            sb.append("UserConfiguration: ").append(getUserConfiguration()).append(",");
        if (getSnapshotConfiguration() != null)
            sb.append("SnapshotConfiguration: ").append(getSnapshotConfiguration()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDashboardSnapshotJobResult == false)
            return false;
        DescribeDashboardSnapshotJobResult other = (DescribeDashboardSnapshotJobResult) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getSnapshotJobId() == null ^ this.getSnapshotJobId() == null)
            return false;
        if (other.getSnapshotJobId() != null && other.getSnapshotJobId().equals(this.getSnapshotJobId()) == false)
            return false;
        if (other.getUserConfiguration() == null ^ this.getUserConfiguration() == null)
            return false;
        if (other.getUserConfiguration() != null && other.getUserConfiguration().equals(this.getUserConfiguration()) == false)
            return false;
        if (other.getSnapshotConfiguration() == null ^ this.getSnapshotConfiguration() == null)
            return false;
        if (other.getSnapshotConfiguration() != null && other.getSnapshotConfiguration().equals(this.getSnapshotConfiguration()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotJobId() == null) ? 0 : getSnapshotJobId().hashCode());
        hashCode = prime * hashCode + ((getUserConfiguration() == null) ? 0 : getUserConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSnapshotConfiguration() == null) ? 0 : getSnapshotConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDashboardSnapshotJobResult clone() {
        try {
            return (DescribeDashboardSnapshotJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
