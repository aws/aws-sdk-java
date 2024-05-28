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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardSnapshotJobResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDashboardSnapshotJobResultResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the snapshot job. The job ARN is generated when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     * <code>COMPLETED</code> or <code>FAILED</code> status.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The time that a snapshot job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time that a snapshot job status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The result of the snapshot job. Jobs that have successfully completed will return the S3Uri where they are
     * located. Jobs that have failedwill return information on the error that caused the job to fail.
     * </p>
     */
    private SnapshotJobResult result;
    /**
     * <p>
     * Displays information for the error that caused a job to fail.
     * </p>
     */
    private SnapshotJobErrorInfo errorInfo;
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

    public DescribeDashboardSnapshotJobResultResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     * <code>COMPLETED</code> or <code>FAILED</code> status.
     * </p>
     * 
     * @param jobStatus
     *        Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     *        <code>COMPLETED</code> or <code>FAILED</code> status.
     * @see SnapshotJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     * <code>COMPLETED</code> or <code>FAILED</code> status.
     * </p>
     * 
     * @return Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen
     *         a <code>COMPLETED</code> or <code>FAILED</code> status.
     * @see SnapshotJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     * <code>COMPLETED</code> or <code>FAILED</code> status.
     * </p>
     * 
     * @param jobStatus
     *        Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     *        <code>COMPLETED</code> or <code>FAILED</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotJobStatus
     */

    public DescribeDashboardSnapshotJobResultResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     * <code>COMPLETED</code> or <code>FAILED</code> status.
     * </p>
     * 
     * @param jobStatus
     *        Indicates the status of a job after it has reached a terminal state. A finished snapshot job will retuen a
     *        <code>COMPLETED</code> or <code>FAILED</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotJobStatus
     */

    public DescribeDashboardSnapshotJobResultResult withJobStatus(SnapshotJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that a snapshot job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that a snapshot job was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that a snapshot job was created.
     * </p>
     * 
     * @return The time that a snapshot job was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that a snapshot job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that a snapshot job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResultResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time that a snapshot job status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that a snapshot job status was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time that a snapshot job status was last updated.
     * </p>
     * 
     * @return The time that a snapshot job status was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time that a snapshot job status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time that a snapshot job status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResultResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The result of the snapshot job. Jobs that have successfully completed will return the S3Uri where they are
     * located. Jobs that have failedwill return information on the error that caused the job to fail.
     * </p>
     * 
     * @param result
     *        The result of the snapshot job. Jobs that have successfully completed will return the S3Uri where they are
     *        located. Jobs that have failedwill return information on the error that caused the job to fail.
     */

    public void setResult(SnapshotJobResult result) {
        this.result = result;
    }

    /**
     * <p>
     * The result of the snapshot job. Jobs that have successfully completed will return the S3Uri where they are
     * located. Jobs that have failedwill return information on the error that caused the job to fail.
     * </p>
     * 
     * @return The result of the snapshot job. Jobs that have successfully completed will return the S3Uri where they
     *         are located. Jobs that have failedwill return information on the error that caused the job to fail.
     */

    public SnapshotJobResult getResult() {
        return this.result;
    }

    /**
     * <p>
     * The result of the snapshot job. Jobs that have successfully completed will return the S3Uri where they are
     * located. Jobs that have failedwill return information on the error that caused the job to fail.
     * </p>
     * 
     * @param result
     *        The result of the snapshot job. Jobs that have successfully completed will return the S3Uri where they are
     *        located. Jobs that have failedwill return information on the error that caused the job to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResultResult withResult(SnapshotJobResult result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * Displays information for the error that caused a job to fail.
     * </p>
     * 
     * @param errorInfo
     *        Displays information for the error that caused a job to fail.
     */

    public void setErrorInfo(SnapshotJobErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Displays information for the error that caused a job to fail.
     * </p>
     * 
     * @return Displays information for the error that caused a job to fail.
     */

    public SnapshotJobErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Displays information for the error that caused a job to fail.
     * </p>
     * 
     * @param errorInfo
     *        Displays information for the error that caused a job to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResultResult withErrorInfo(SnapshotJobErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
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

    public DescribeDashboardSnapshotJobResultResult withRequestId(String requestId) {
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

    public DescribeDashboardSnapshotJobResultResult withStatus(Integer status) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
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

        if (obj instanceof DescribeDashboardSnapshotJobResultResult == false)
            return false;
        DescribeDashboardSnapshotJobResultResult other = (DescribeDashboardSnapshotJobResultResult) obj;
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
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDashboardSnapshotJobResultResult clone() {
        try {
            return (DescribeDashboardSnapshotJobResultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
