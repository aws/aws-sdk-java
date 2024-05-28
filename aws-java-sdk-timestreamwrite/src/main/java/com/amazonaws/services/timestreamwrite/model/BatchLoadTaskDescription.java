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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a batch load task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/BatchLoadTaskDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchLoadTaskDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     */
    private String taskId;
    /** <p/> */
    private String errorMessage;
    /**
     * <p>
     * Configuration details about the data source for a batch load task.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;
    /** <p/> */
    private BatchLoadProgressReport progressReport;
    /**
     * <p>
     * Report configuration for a batch load task. This contains details about where error reports are stored.
     * </p>
     */
    private ReportConfiguration reportConfiguration;
    /**
     * <p>
     * Data model configuration for a batch load task. This contains details about where a data model for a batch load
     * task is stored.
     * </p>
     */
    private DataModelConfiguration dataModelConfiguration;
    /** <p/> */
    private String targetDatabaseName;
    /** <p/> */
    private String targetTableName;
    /**
     * <p>
     * Status of the batch load task.
     * </p>
     */
    private String taskStatus;
    /** <p/> */
    private Long recordVersion;
    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * </p>
     */
    private java.util.Date resumableUntil;

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     * 
     * @param taskId
     *        The ID of the batch load task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     * 
     * @return The ID of the batch load task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     * 
     * @param taskId
     *        The ID of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param errorMessage
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p/>
     * 
     * @param errorMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Configuration details about the data source for a batch load task.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Configuration details about the data source for a batch load task.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Configuration details about the data source for a batch load task.
     * </p>
     * 
     * @return Configuration details about the data source for a batch load task.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Configuration details about the data source for a batch load task.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Configuration details about the data source for a batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        setDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * <p/>
     * 
     * @param progressReport
     */

    public void setProgressReport(BatchLoadProgressReport progressReport) {
        this.progressReport = progressReport;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public BatchLoadProgressReport getProgressReport() {
        return this.progressReport;
    }

    /**
     * <p/>
     * 
     * @param progressReport
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withProgressReport(BatchLoadProgressReport progressReport) {
        setProgressReport(progressReport);
        return this;
    }

    /**
     * <p>
     * Report configuration for a batch load task. This contains details about where error reports are stored.
     * </p>
     * 
     * @param reportConfiguration
     *        Report configuration for a batch load task. This contains details about where error reports are stored.
     */

    public void setReportConfiguration(ReportConfiguration reportConfiguration) {
        this.reportConfiguration = reportConfiguration;
    }

    /**
     * <p>
     * Report configuration for a batch load task. This contains details about where error reports are stored.
     * </p>
     * 
     * @return Report configuration for a batch load task. This contains details about where error reports are stored.
     */

    public ReportConfiguration getReportConfiguration() {
        return this.reportConfiguration;
    }

    /**
     * <p>
     * Report configuration for a batch load task. This contains details about where error reports are stored.
     * </p>
     * 
     * @param reportConfiguration
     *        Report configuration for a batch load task. This contains details about where error reports are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withReportConfiguration(ReportConfiguration reportConfiguration) {
        setReportConfiguration(reportConfiguration);
        return this;
    }

    /**
     * <p>
     * Data model configuration for a batch load task. This contains details about where a data model for a batch load
     * task is stored.
     * </p>
     * 
     * @param dataModelConfiguration
     *        Data model configuration for a batch load task. This contains details about where a data model for a batch
     *        load task is stored.
     */

    public void setDataModelConfiguration(DataModelConfiguration dataModelConfiguration) {
        this.dataModelConfiguration = dataModelConfiguration;
    }

    /**
     * <p>
     * Data model configuration for a batch load task. This contains details about where a data model for a batch load
     * task is stored.
     * </p>
     * 
     * @return Data model configuration for a batch load task. This contains details about where a data model for a
     *         batch load task is stored.
     */

    public DataModelConfiguration getDataModelConfiguration() {
        return this.dataModelConfiguration;
    }

    /**
     * <p>
     * Data model configuration for a batch load task. This contains details about where a data model for a batch load
     * task is stored.
     * </p>
     * 
     * @param dataModelConfiguration
     *        Data model configuration for a batch load task. This contains details about where a data model for a batch
     *        load task is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withDataModelConfiguration(DataModelConfiguration dataModelConfiguration) {
        setDataModelConfiguration(dataModelConfiguration);
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetDatabaseName
     */

    public void setTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTargetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * <p/>
     * 
     * @param targetDatabaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withTargetDatabaseName(String targetDatabaseName) {
        setTargetDatabaseName(targetDatabaseName);
        return this;
    }

    /**
     * <p/>
     * 
     * @param targetTableName
     */

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * <p/>
     * 
     * @param targetTableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withTargetTableName(String targetTableName) {
        setTargetTableName(targetTableName);
        return this;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @see BatchLoadStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @return Status of the batch load task.
     * @see BatchLoadStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadStatus
     */

    public BatchLoadTaskDescription withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadStatus
     */

    public BatchLoadTaskDescription withTaskStatus(BatchLoadStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param recordVersion
     */

    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Long getRecordVersion() {
        return this.recordVersion;
    }

    /**
     * <p/>
     * 
     * @param recordVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withRecordVersion(Long recordVersion) {
        setRecordVersion(recordVersion);
        return this;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Timestream batch load task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     * 
     * @return The time when the Timestream batch load task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Timestream batch load task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the Timestream batch load task was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     * 
     * @return The time when the Timestream batch load task was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the Timestream batch load task was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param resumableUntil
     */

    public void setResumableUntil(java.util.Date resumableUntil) {
        this.resumableUntil = resumableUntil;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public java.util.Date getResumableUntil() {
        return this.resumableUntil;
    }

    /**
     * <p>
     * </p>
     * 
     * @param resumableUntil
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTaskDescription withResumableUntil(java.util.Date resumableUntil) {
        setResumableUntil(resumableUntil);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: ").append(getDataSourceConfiguration()).append(",");
        if (getProgressReport() != null)
            sb.append("ProgressReport: ").append(getProgressReport()).append(",");
        if (getReportConfiguration() != null)
            sb.append("ReportConfiguration: ").append(getReportConfiguration()).append(",");
        if (getDataModelConfiguration() != null)
            sb.append("DataModelConfiguration: ").append(getDataModelConfiguration()).append(",");
        if (getTargetDatabaseName() != null)
            sb.append("TargetDatabaseName: ").append(getTargetDatabaseName()).append(",");
        if (getTargetTableName() != null)
            sb.append("TargetTableName: ").append(getTargetTableName()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getRecordVersion() != null)
            sb.append("RecordVersion: ").append(getRecordVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getResumableUntil() != null)
            sb.append("ResumableUntil: ").append(getResumableUntil());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchLoadTaskDescription == false)
            return false;
        BatchLoadTaskDescription other = (BatchLoadTaskDescription) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
            return false;
        if (other.getProgressReport() == null ^ this.getProgressReport() == null)
            return false;
        if (other.getProgressReport() != null && other.getProgressReport().equals(this.getProgressReport()) == false)
            return false;
        if (other.getReportConfiguration() == null ^ this.getReportConfiguration() == null)
            return false;
        if (other.getReportConfiguration() != null && other.getReportConfiguration().equals(this.getReportConfiguration()) == false)
            return false;
        if (other.getDataModelConfiguration() == null ^ this.getDataModelConfiguration() == null)
            return false;
        if (other.getDataModelConfiguration() != null && other.getDataModelConfiguration().equals(this.getDataModelConfiguration()) == false)
            return false;
        if (other.getTargetDatabaseName() == null ^ this.getTargetDatabaseName() == null)
            return false;
        if (other.getTargetDatabaseName() != null && other.getTargetDatabaseName().equals(this.getTargetDatabaseName()) == false)
            return false;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getRecordVersion() == null ^ this.getRecordVersion() == null)
            return false;
        if (other.getRecordVersion() != null && other.getRecordVersion().equals(this.getRecordVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getResumableUntil() == null ^ this.getResumableUntil() == null)
            return false;
        if (other.getResumableUntil() != null && other.getResumableUntil().equals(this.getResumableUntil()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProgressReport() == null) ? 0 : getProgressReport().hashCode());
        hashCode = prime * hashCode + ((getReportConfiguration() == null) ? 0 : getReportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataModelConfiguration() == null) ? 0 : getDataModelConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTargetDatabaseName() == null) ? 0 : getTargetDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getRecordVersion() == null) ? 0 : getRecordVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getResumableUntil() == null) ? 0 : getResumableUntil().hashCode());
        return hashCode;
    }

    @Override
    public BatchLoadTaskDescription clone() {
        try {
            return (BatchLoadTaskDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.BatchLoadTaskDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
