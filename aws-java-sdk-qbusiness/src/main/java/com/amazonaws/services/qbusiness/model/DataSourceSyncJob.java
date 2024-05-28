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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon Q Business data source connector synchronization job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DataSourceSyncJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceSyncJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of a data source synchronization job.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The Unix time stamp when the data source synchronization job started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The Unix timestamp when the synchronization job completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field indicates the
     * reason the synchronization failed.
     * </p>
     */
    private ErrorDetail error;
    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the underlying data source, this field
     * contains a code that identifies the error.
     * </p>
     */
    private String dataSourceErrorCode;
    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job. This is optional and should only be
     * supplied when documents are deleted by a data source connector.
     * </p>
     */
    private DataSourceSyncJobMetrics metrics;

    /**
     * <p>
     * The identifier of a data source synchronization job.
     * </p>
     * 
     * @param executionId
     *        The identifier of a data source synchronization job.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The identifier of a data source synchronization job.
     * </p>
     * 
     * @return The identifier of a data source synchronization job.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The identifier of a data source synchronization job.
     * </p>
     * 
     * @param executionId
     *        The identifier of a data source synchronization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The Unix time stamp when the data source synchronization job started.
     * </p>
     * 
     * @param startTime
     *        The Unix time stamp when the data source synchronization job started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The Unix time stamp when the data source synchronization job started.
     * </p>
     * 
     * @return The Unix time stamp when the data source synchronization job started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The Unix time stamp when the data source synchronization job started.
     * </p>
     * 
     * @param startTime
     *        The Unix time stamp when the data source synchronization job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the synchronization job completed.
     * </p>
     * 
     * @param endTime
     *        The Unix timestamp when the synchronization job completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The Unix timestamp when the synchronization job completed.
     * </p>
     * 
     * @return The Unix timestamp when the synchronization job completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The Unix timestamp when the synchronization job completed.
     * </p>
     * 
     * @param endTime
     *        The Unix timestamp when the synchronization job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @param status
     *        The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>
     *        , the synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code>
     *        and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @see DataSourceSyncJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @return The status of the synchronization job. When the <code>Status</code> field is set to
     *         <code>SUCCEEDED</code>, the synchronization job is done. If the status code is <code>FAILED</code>, the
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @see DataSourceSyncJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @param status
     *        The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>
     *        , the synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code>
     *        and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceSyncJobStatus
     */

    public DataSourceSyncJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>, the
     * synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code> and
     * <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @param status
     *        The status of the synchronization job. When the <code>Status</code> field is set to <code>SUCCEEDED</code>
     *        , the synchronization job is done. If the status code is <code>FAILED</code>, the <code>ErrorCode</code>
     *        and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceSyncJobStatus
     */

    public DataSourceSyncJob withStatus(DataSourceSyncJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field indicates the
     * reason the synchronization failed.
     * </p>
     * 
     * @param error
     *        If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field indicates
     *        the reason the synchronization failed.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field indicates the
     * reason the synchronization failed.
     * </p>
     * 
     * @return If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field
     *         indicates the reason the synchronization failed.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field indicates the
     * reason the synchronization failed.
     * </p>
     * 
     * @param error
     *        If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field indicates
     *        the reason the synchronization failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withError(ErrorDetail error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the underlying data source, this field
     * contains a code that identifies the error.
     * </p>
     * 
     * @param dataSourceErrorCode
     *        If the reason that the synchronization failed is due to an error with the underlying data source, this
     *        field contains a code that identifies the error.
     */

    public void setDataSourceErrorCode(String dataSourceErrorCode) {
        this.dataSourceErrorCode = dataSourceErrorCode;
    }

    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the underlying data source, this field
     * contains a code that identifies the error.
     * </p>
     * 
     * @return If the reason that the synchronization failed is due to an error with the underlying data source, this
     *         field contains a code that identifies the error.
     */

    public String getDataSourceErrorCode() {
        return this.dataSourceErrorCode;
    }

    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the underlying data source, this field
     * contains a code that identifies the error.
     * </p>
     * 
     * @param dataSourceErrorCode
     *        If the reason that the synchronization failed is due to an error with the underlying data source, this
     *        field contains a code that identifies the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withDataSourceErrorCode(String dataSourceErrorCode) {
        setDataSourceErrorCode(dataSourceErrorCode);
        return this;
    }

    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job. This is optional and should only be
     * supplied when documents are deleted by a data source connector.
     * </p>
     * 
     * @param metrics
     *        Maps a batch delete document request to a specific data source sync job. This is optional and should only
     *        be supplied when documents are deleted by a data source connector.
     */

    public void setMetrics(DataSourceSyncJobMetrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job. This is optional and should only be
     * supplied when documents are deleted by a data source connector.
     * </p>
     * 
     * @return Maps a batch delete document request to a specific data source sync job. This is optional and should only
     *         be supplied when documents are deleted by a data source connector.
     */

    public DataSourceSyncJobMetrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * Maps a batch delete document request to a specific data source sync job. This is optional and should only be
     * supplied when documents are deleted by a data source connector.
     * </p>
     * 
     * @param metrics
     *        Maps a batch delete document request to a specific data source sync job. This is optional and should only
     *        be supplied when documents are deleted by a data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withMetrics(DataSourceSyncJobMetrics metrics) {
        setMetrics(metrics);
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
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getDataSourceErrorCode() != null)
            sb.append("DataSourceErrorCode: ").append(getDataSourceErrorCode()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceSyncJob == false)
            return false;
        DataSourceSyncJob other = (DataSourceSyncJob) obj;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getDataSourceErrorCode() == null ^ this.getDataSourceErrorCode() == null)
            return false;
        if (other.getDataSourceErrorCode() != null && other.getDataSourceErrorCode().equals(this.getDataSourceErrorCode()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getDataSourceErrorCode() == null) ? 0 : getDataSourceErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceSyncJob clone() {
        try {
            return (DataSourceSyncJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DataSourceSyncJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
