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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An HTTP 200 response if the request succeeds, or an error message if the request fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string that represents the import job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The destination of the import job.
     * </p>
     */
    private ImportDestination importDestination;
    /**
     * <p>
     * The data source of the import job.
     * </p>
     */
    private ImportDataSource importDataSource;
    /**
     * <p>
     * The failure details about an import job.
     * </p>
     */
    private FailureInfo failureInfo;
    /**
     * <p>
     * The status of the import job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The time stamp of when the import job was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time stamp of when the import job was completed.
     * </p>
     */
    private java.util.Date completedTimestamp;
    /**
     * <p>
     * The current number of records processed.
     * </p>
     */
    private Integer processedRecordsCount;
    /**
     * <p>
     * The number of records that failed processing because of invalid input or other reasons.
     * </p>
     */
    private Integer failedRecordsCount;

    /**
     * <p>
     * A string that represents the import job ID.
     * </p>
     * 
     * @param jobId
     *        A string that represents the import job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A string that represents the import job ID.
     * </p>
     * 
     * @return A string that represents the import job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * A string that represents the import job ID.
     * </p>
     * 
     * @param jobId
     *        A string that represents the import job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The destination of the import job.
     * </p>
     * 
     * @param importDestination
     *        The destination of the import job.
     */

    public void setImportDestination(ImportDestination importDestination) {
        this.importDestination = importDestination;
    }

    /**
     * <p>
     * The destination of the import job.
     * </p>
     * 
     * @return The destination of the import job.
     */

    public ImportDestination getImportDestination() {
        return this.importDestination;
    }

    /**
     * <p>
     * The destination of the import job.
     * </p>
     * 
     * @param importDestination
     *        The destination of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withImportDestination(ImportDestination importDestination) {
        setImportDestination(importDestination);
        return this;
    }

    /**
     * <p>
     * The data source of the import job.
     * </p>
     * 
     * @param importDataSource
     *        The data source of the import job.
     */

    public void setImportDataSource(ImportDataSource importDataSource) {
        this.importDataSource = importDataSource;
    }

    /**
     * <p>
     * The data source of the import job.
     * </p>
     * 
     * @return The data source of the import job.
     */

    public ImportDataSource getImportDataSource() {
        return this.importDataSource;
    }

    /**
     * <p>
     * The data source of the import job.
     * </p>
     * 
     * @param importDataSource
     *        The data source of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withImportDataSource(ImportDataSource importDataSource) {
        setImportDataSource(importDataSource);
        return this;
    }

    /**
     * <p>
     * The failure details about an import job.
     * </p>
     * 
     * @param failureInfo
     *        The failure details about an import job.
     */

    public void setFailureInfo(FailureInfo failureInfo) {
        this.failureInfo = failureInfo;
    }

    /**
     * <p>
     * The failure details about an import job.
     * </p>
     * 
     * @return The failure details about an import job.
     */

    public FailureInfo getFailureInfo() {
        return this.failureInfo;
    }

    /**
     * <p>
     * The failure details about an import job.
     * </p>
     * 
     * @param failureInfo
     *        The failure details about an import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withFailureInfo(FailureInfo failureInfo) {
        setFailureInfo(failureInfo);
        return this;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the import job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @return The status of the import job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetImportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetImportJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time stamp of when the import job was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time stamp of when the import job was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the import job was created.
     * </p>
     * 
     * @return The time stamp of when the import job was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the import job was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time stamp of when the import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time stamp of when the import job was completed.
     * </p>
     * 
     * @param completedTimestamp
     *        The time stamp of when the import job was completed.
     */

    public void setCompletedTimestamp(java.util.Date completedTimestamp) {
        this.completedTimestamp = completedTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the import job was completed.
     * </p>
     * 
     * @return The time stamp of when the import job was completed.
     */

    public java.util.Date getCompletedTimestamp() {
        return this.completedTimestamp;
    }

    /**
     * <p>
     * The time stamp of when the import job was completed.
     * </p>
     * 
     * @param completedTimestamp
     *        The time stamp of when the import job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withCompletedTimestamp(java.util.Date completedTimestamp) {
        setCompletedTimestamp(completedTimestamp);
        return this;
    }

    /**
     * <p>
     * The current number of records processed.
     * </p>
     * 
     * @param processedRecordsCount
     *        The current number of records processed.
     */

    public void setProcessedRecordsCount(Integer processedRecordsCount) {
        this.processedRecordsCount = processedRecordsCount;
    }

    /**
     * <p>
     * The current number of records processed.
     * </p>
     * 
     * @return The current number of records processed.
     */

    public Integer getProcessedRecordsCount() {
        return this.processedRecordsCount;
    }

    /**
     * <p>
     * The current number of records processed.
     * </p>
     * 
     * @param processedRecordsCount
     *        The current number of records processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withProcessedRecordsCount(Integer processedRecordsCount) {
        setProcessedRecordsCount(processedRecordsCount);
        return this;
    }

    /**
     * <p>
     * The number of records that failed processing because of invalid input or other reasons.
     * </p>
     * 
     * @param failedRecordsCount
     *        The number of records that failed processing because of invalid input or other reasons.
     */

    public void setFailedRecordsCount(Integer failedRecordsCount) {
        this.failedRecordsCount = failedRecordsCount;
    }

    /**
     * <p>
     * The number of records that failed processing because of invalid input or other reasons.
     * </p>
     * 
     * @return The number of records that failed processing because of invalid input or other reasons.
     */

    public Integer getFailedRecordsCount() {
        return this.failedRecordsCount;
    }

    /**
     * <p>
     * The number of records that failed processing because of invalid input or other reasons.
     * </p>
     * 
     * @param failedRecordsCount
     *        The number of records that failed processing because of invalid input or other reasons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportJobResult withFailedRecordsCount(Integer failedRecordsCount) {
        setFailedRecordsCount(failedRecordsCount);
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
        if (getImportDestination() != null)
            sb.append("ImportDestination: ").append(getImportDestination()).append(",");
        if (getImportDataSource() != null)
            sb.append("ImportDataSource: ").append(getImportDataSource()).append(",");
        if (getFailureInfo() != null)
            sb.append("FailureInfo: ").append(getFailureInfo()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getCompletedTimestamp() != null)
            sb.append("CompletedTimestamp: ").append(getCompletedTimestamp()).append(",");
        if (getProcessedRecordsCount() != null)
            sb.append("ProcessedRecordsCount: ").append(getProcessedRecordsCount()).append(",");
        if (getFailedRecordsCount() != null)
            sb.append("FailedRecordsCount: ").append(getFailedRecordsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImportJobResult == false)
            return false;
        GetImportJobResult other = (GetImportJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getImportDestination() == null ^ this.getImportDestination() == null)
            return false;
        if (other.getImportDestination() != null && other.getImportDestination().equals(this.getImportDestination()) == false)
            return false;
        if (other.getImportDataSource() == null ^ this.getImportDataSource() == null)
            return false;
        if (other.getImportDataSource() != null && other.getImportDataSource().equals(this.getImportDataSource()) == false)
            return false;
        if (other.getFailureInfo() == null ^ this.getFailureInfo() == null)
            return false;
        if (other.getFailureInfo() != null && other.getFailureInfo().equals(this.getFailureInfo()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getCompletedTimestamp() == null ^ this.getCompletedTimestamp() == null)
            return false;
        if (other.getCompletedTimestamp() != null && other.getCompletedTimestamp().equals(this.getCompletedTimestamp()) == false)
            return false;
        if (other.getProcessedRecordsCount() == null ^ this.getProcessedRecordsCount() == null)
            return false;
        if (other.getProcessedRecordsCount() != null && other.getProcessedRecordsCount().equals(this.getProcessedRecordsCount()) == false)
            return false;
        if (other.getFailedRecordsCount() == null ^ this.getFailedRecordsCount() == null)
            return false;
        if (other.getFailedRecordsCount() != null && other.getFailedRecordsCount().equals(this.getFailedRecordsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getImportDestination() == null) ? 0 : getImportDestination().hashCode());
        hashCode = prime * hashCode + ((getImportDataSource() == null) ? 0 : getImportDataSource().hashCode());
        hashCode = prime * hashCode + ((getFailureInfo() == null) ? 0 : getFailureInfo().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCompletedTimestamp() == null) ? 0 : getCompletedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getProcessedRecordsCount() == null) ? 0 : getProcessedRecordsCount().hashCode());
        hashCode = prime * hashCode + ((getFailedRecordsCount() == null) ? 0 : getFailedRecordsCount().hashCode());
        return hashCode;
    }

    @Override
    public GetImportJobResult clone() {
        try {
            return (GetImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
