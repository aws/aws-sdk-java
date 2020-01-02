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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a synchronization job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DataSourceSyncJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceSyncJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The execution status of the synchronization job. When the <code>Status</code> field is set to
     * <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains a the
     * reason that the synchronization failed.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * If the reason that the synchronization failed is due to an error with the underlying data source, this field
     * contains a code that identifies the error.
     * </p>
     */
    private String dataSourceErrorCode;

    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     * 
     * @param executionId
     *        A unique identifier for the synchronization job.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     * 
     * @return A unique identifier for the synchronization job.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * A unique identifier for the synchronization job.
     * </p>
     * 
     * @param executionId
     *        A unique identifier for the synchronization job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     * 
     * @param startTime
     *        The UNIX datetime that the synchronization job was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     * 
     * @return The UNIX datetime that the synchronization job was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was started.
     * </p>
     * 
     * @param startTime
     *        The UNIX datetime that the synchronization job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     * 
     * @param endTime
     *        The UNIX datetime that the synchronization job was completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     * 
     * @return The UNIX datetime that the synchronization job was completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The UNIX datetime that the synchronization job was completed.
     * </p>
     * 
     * @param endTime
     *        The UNIX datetime that the synchronization job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the <code>Status</code> field is set to
     * <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @param status
     *        The execution status of the synchronization job. When the <code>Status</code> field is set to
     *        <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>,
     *        the <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @see DataSourceSyncJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the <code>Status</code> field is set to
     * <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @return The execution status of the synchronization job. When the <code>Status</code> field is set to
     *         <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>
     *         , the <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @see DataSourceSyncJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the <code>Status</code> field is set to
     * <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @param status
     *        The execution status of the synchronization job. When the <code>Status</code> field is set to
     *        <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>,
     *        the <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceSyncJobStatus
     */

    public DataSourceSyncJob withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The execution status of the synchronization job. When the <code>Status</code> field is set to
     * <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>, the
     * <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * </p>
     * 
     * @param status
     *        The execution status of the synchronization job. When the <code>Status</code> field is set to
     *        <code>SUCCEEDED</code>, the synchronization job is done. If the status code is set to <code>FAILED</code>,
     *        the <code>ErrorCode</code> and <code>ErrorMessage</code> fields give you the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceSyncJobStatus
     */

    public DataSourceSyncJob withStatus(DataSourceSyncJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     * 
     * @param errorMessage
     *        If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the synchronization to fail.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     * 
     * @return If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field
     *         contains a description of the error that caused the synchronization to fail.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     * 
     * @param errorMessage
     *        If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the synchronization to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSyncJob withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains a the
     * reason that the synchronization failed.
     * </p>
     * 
     * @param errorCode
     *        If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains
     *        a the reason that the synchronization failed.
     * @see ErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains a the
     * reason that the synchronization failed.
     * </p>
     * 
     * @return If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains
     *         a the reason that the synchronization failed.
     * @see ErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains a the
     * reason that the synchronization failed.
     * </p>
     * 
     * @param errorCode
     *        If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains
     *        a the reason that the synchronization failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public DataSourceSyncJob withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains a the
     * reason that the synchronization failed.
     * </p>
     * 
     * @param errorCode
     *        If the <code>Status</code> field is set to <code>FAILED</code>, the <code>ErrorCode</code> field contains
     *        a the reason that the synchronization failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public DataSourceSyncJob withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.toString();
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getDataSourceErrorCode() != null)
            sb.append("DataSourceErrorCode: ").append(getDataSourceErrorCode());
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
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getDataSourceErrorCode() == null ^ this.getDataSourceErrorCode() == null)
            return false;
        if (other.getDataSourceErrorCode() != null && other.getDataSourceErrorCode().equals(this.getDataSourceErrorCode()) == false)
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
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getDataSourceErrorCode() == null) ? 0 : getDataSourceErrorCode().hashCode());
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
        com.amazonaws.services.kendra.model.transform.DataSourceSyncJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
