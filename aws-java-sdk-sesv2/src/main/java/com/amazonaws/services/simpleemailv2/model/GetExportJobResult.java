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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An HTTP 200 response if the request succeeds, or an error message if the request fails.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The export job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The type of source of the export job.
     * </p>
     */
    private String exportSourceType;
    /**
     * <p>
     * The status of the export job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The destination of the export job.
     * </p>
     */
    private ExportDestination exportDestination;
    /**
     * <p>
     * The data source of the export job.
     * </p>
     */
    private ExportDataSource exportDataSource;
    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The timestamp of when the export job was completed.
     * </p>
     */
    private java.util.Date completedTimestamp;
    /**
     * <p>
     * The failure details about an export job.
     * </p>
     */
    private FailureInfo failureInfo;
    /**
     * <p>
     * The statistics about the export job.
     * </p>
     */
    private ExportStatistics statistics;

    /**
     * <p>
     * The export job ID.
     * </p>
     * 
     * @param jobId
     *        The export job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The export job ID.
     * </p>
     * 
     * @return The export job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The export job ID.
     * </p>
     * 
     * @param jobId
     *        The export job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The type of source of the export job.
     * </p>
     * 
     * @param exportSourceType
     *        The type of source of the export job.
     * @see ExportSourceType
     */

    public void setExportSourceType(String exportSourceType) {
        this.exportSourceType = exportSourceType;
    }

    /**
     * <p>
     * The type of source of the export job.
     * </p>
     * 
     * @return The type of source of the export job.
     * @see ExportSourceType
     */

    public String getExportSourceType() {
        return this.exportSourceType;
    }

    /**
     * <p>
     * The type of source of the export job.
     * </p>
     * 
     * @param exportSourceType
     *        The type of source of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportSourceType
     */

    public GetExportJobResult withExportSourceType(String exportSourceType) {
        setExportSourceType(exportSourceType);
        return this;
    }

    /**
     * <p>
     * The type of source of the export job.
     * </p>
     * 
     * @param exportSourceType
     *        The type of source of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportSourceType
     */

    public GetExportJobResult withExportSourceType(ExportSourceType exportSourceType) {
        this.exportSourceType = exportSourceType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the export job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @return The status of the export job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetExportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the export job.
     * </p>
     * 
     * @param jobStatus
     *        The status of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public GetExportJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The destination of the export job.
     * </p>
     * 
     * @param exportDestination
     *        The destination of the export job.
     */

    public void setExportDestination(ExportDestination exportDestination) {
        this.exportDestination = exportDestination;
    }

    /**
     * <p>
     * The destination of the export job.
     * </p>
     * 
     * @return The destination of the export job.
     */

    public ExportDestination getExportDestination() {
        return this.exportDestination;
    }

    /**
     * <p>
     * The destination of the export job.
     * </p>
     * 
     * @param exportDestination
     *        The destination of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportJobResult withExportDestination(ExportDestination exportDestination) {
        setExportDestination(exportDestination);
        return this;
    }

    /**
     * <p>
     * The data source of the export job.
     * </p>
     * 
     * @param exportDataSource
     *        The data source of the export job.
     */

    public void setExportDataSource(ExportDataSource exportDataSource) {
        this.exportDataSource = exportDataSource;
    }

    /**
     * <p>
     * The data source of the export job.
     * </p>
     * 
     * @return The data source of the export job.
     */

    public ExportDataSource getExportDataSource() {
        return this.exportDataSource;
    }

    /**
     * <p>
     * The data source of the export job.
     * </p>
     * 
     * @param exportDataSource
     *        The data source of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportJobResult withExportDataSource(ExportDataSource exportDataSource) {
        setExportDataSource(exportDataSource);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the export job was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     * 
     * @return The timestamp of when the export job was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportJobResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export job was completed.
     * </p>
     * 
     * @param completedTimestamp
     *        The timestamp of when the export job was completed.
     */

    public void setCompletedTimestamp(java.util.Date completedTimestamp) {
        this.completedTimestamp = completedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was completed.
     * </p>
     * 
     * @return The timestamp of when the export job was completed.
     */

    public java.util.Date getCompletedTimestamp() {
        return this.completedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the export job was completed.
     * </p>
     * 
     * @param completedTimestamp
     *        The timestamp of when the export job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportJobResult withCompletedTimestamp(java.util.Date completedTimestamp) {
        setCompletedTimestamp(completedTimestamp);
        return this;
    }

    /**
     * <p>
     * The failure details about an export job.
     * </p>
     * 
     * @param failureInfo
     *        The failure details about an export job.
     */

    public void setFailureInfo(FailureInfo failureInfo) {
        this.failureInfo = failureInfo;
    }

    /**
     * <p>
     * The failure details about an export job.
     * </p>
     * 
     * @return The failure details about an export job.
     */

    public FailureInfo getFailureInfo() {
        return this.failureInfo;
    }

    /**
     * <p>
     * The failure details about an export job.
     * </p>
     * 
     * @param failureInfo
     *        The failure details about an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportJobResult withFailureInfo(FailureInfo failureInfo) {
        setFailureInfo(failureInfo);
        return this;
    }

    /**
     * <p>
     * The statistics about the export job.
     * </p>
     * 
     * @param statistics
     *        The statistics about the export job.
     */

    public void setStatistics(ExportStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The statistics about the export job.
     * </p>
     * 
     * @return The statistics about the export job.
     */

    public ExportStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The statistics about the export job.
     * </p>
     * 
     * @param statistics
     *        The statistics about the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportJobResult withStatistics(ExportStatistics statistics) {
        setStatistics(statistics);
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
        if (getExportSourceType() != null)
            sb.append("ExportSourceType: ").append(getExportSourceType()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getExportDestination() != null)
            sb.append("ExportDestination: ").append(getExportDestination()).append(",");
        if (getExportDataSource() != null)
            sb.append("ExportDataSource: ").append(getExportDataSource()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getCompletedTimestamp() != null)
            sb.append("CompletedTimestamp: ").append(getCompletedTimestamp()).append(",");
        if (getFailureInfo() != null)
            sb.append("FailureInfo: ").append(getFailureInfo()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportJobResult == false)
            return false;
        GetExportJobResult other = (GetExportJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getExportSourceType() == null ^ this.getExportSourceType() == null)
            return false;
        if (other.getExportSourceType() != null && other.getExportSourceType().equals(this.getExportSourceType()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getExportDestination() == null ^ this.getExportDestination() == null)
            return false;
        if (other.getExportDestination() != null && other.getExportDestination().equals(this.getExportDestination()) == false)
            return false;
        if (other.getExportDataSource() == null ^ this.getExportDataSource() == null)
            return false;
        if (other.getExportDataSource() != null && other.getExportDataSource().equals(this.getExportDataSource()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getCompletedTimestamp() == null ^ this.getCompletedTimestamp() == null)
            return false;
        if (other.getCompletedTimestamp() != null && other.getCompletedTimestamp().equals(this.getCompletedTimestamp()) == false)
            return false;
        if (other.getFailureInfo() == null ^ this.getFailureInfo() == null)
            return false;
        if (other.getFailureInfo() != null && other.getFailureInfo().equals(this.getFailureInfo()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getExportSourceType() == null) ? 0 : getExportSourceType().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getExportDestination() == null) ? 0 : getExportDestination().hashCode());
        hashCode = prime * hashCode + ((getExportDataSource() == null) ? 0 : getExportDataSource().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCompletedTimestamp() == null) ? 0 : getCompletedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFailureInfo() == null) ? 0 : getFailureInfo().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetExportJobResult clone() {
        try {
            return (GetExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
