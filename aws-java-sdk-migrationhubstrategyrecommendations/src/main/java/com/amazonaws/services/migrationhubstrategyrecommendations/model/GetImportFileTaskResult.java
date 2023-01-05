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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetImportFileTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImportFileTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time that the import task completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The import file task <code>id</code> returned in the response of <a>StartImportFileTask</a>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the import task given in <a>StartImportFileTask</a>.
     * </p>
     */
    private String importName;
    /**
     * <p>
     * The S3 bucket where import file is located.
     * </p>
     */
    private String inputS3Bucket;
    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     */
    private String inputS3Key;
    /**
     * <p>
     * The number of records that failed to be imported.
     * </p>
     */
    private Integer numberOfRecordsFailed;
    /**
     * <p>
     * The number of records successfully imported.
     * </p>
     */
    private Integer numberOfRecordsSuccess;
    /**
     * <p>
     * Start time of the import task.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Status of import file task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The S3 bucket name for status report of import task.
     * </p>
     */
    private String statusReportS3Bucket;
    /**
     * <p>
     * The Amazon S3 key name for status report of import task. The report contains details about whether each record
     * imported successfully or why it did not.
     * </p>
     */
    private String statusReportS3Key;

    /**
     * <p>
     * The time that the import task completed.
     * </p>
     * 
     * @param completionTime
     *        The time that the import task completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The time that the import task completed.
     * </p>
     * 
     * @return The time that the import task completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The time that the import task completed.
     * </p>
     * 
     * @param completionTime
     *        The time that the import task completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The import file task <code>id</code> returned in the response of <a>StartImportFileTask</a>.
     * </p>
     * 
     * @param id
     *        The import file task <code>id</code> returned in the response of <a>StartImportFileTask</a>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The import file task <code>id</code> returned in the response of <a>StartImportFileTask</a>.
     * </p>
     * 
     * @return The import file task <code>id</code> returned in the response of <a>StartImportFileTask</a>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The import file task <code>id</code> returned in the response of <a>StartImportFileTask</a>.
     * </p>
     * 
     * @param id
     *        The import file task <code>id</code> returned in the response of <a>StartImportFileTask</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the import task given in <a>StartImportFileTask</a>.
     * </p>
     * 
     * @param importName
     *        The name of the import task given in <a>StartImportFileTask</a>.
     */

    public void setImportName(String importName) {
        this.importName = importName;
    }

    /**
     * <p>
     * The name of the import task given in <a>StartImportFileTask</a>.
     * </p>
     * 
     * @return The name of the import task given in <a>StartImportFileTask</a>.
     */

    public String getImportName() {
        return this.importName;
    }

    /**
     * <p>
     * The name of the import task given in <a>StartImportFileTask</a>.
     * </p>
     * 
     * @param importName
     *        The name of the import task given in <a>StartImportFileTask</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withImportName(String importName) {
        setImportName(importName);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where import file is located.
     * </p>
     * 
     * @param inputS3Bucket
     *        The S3 bucket where import file is located.
     */

    public void setInputS3Bucket(String inputS3Bucket) {
        this.inputS3Bucket = inputS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where import file is located.
     * </p>
     * 
     * @return The S3 bucket where import file is located.
     */

    public String getInputS3Bucket() {
        return this.inputS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where import file is located.
     * </p>
     * 
     * @param inputS3Bucket
     *        The S3 bucket where import file is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withInputS3Bucket(String inputS3Bucket) {
        setInputS3Bucket(inputS3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     * 
     * @param inputS3Key
     *        The Amazon S3 key name of the import file.
     */

    public void setInputS3Key(String inputS3Key) {
        this.inputS3Key = inputS3Key;
    }

    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     * 
     * @return The Amazon S3 key name of the import file.
     */

    public String getInputS3Key() {
        return this.inputS3Key;
    }

    /**
     * <p>
     * The Amazon S3 key name of the import file.
     * </p>
     * 
     * @param inputS3Key
     *        The Amazon S3 key name of the import file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withInputS3Key(String inputS3Key) {
        setInputS3Key(inputS3Key);
        return this;
    }

    /**
     * <p>
     * The number of records that failed to be imported.
     * </p>
     * 
     * @param numberOfRecordsFailed
     *        The number of records that failed to be imported.
     */

    public void setNumberOfRecordsFailed(Integer numberOfRecordsFailed) {
        this.numberOfRecordsFailed = numberOfRecordsFailed;
    }

    /**
     * <p>
     * The number of records that failed to be imported.
     * </p>
     * 
     * @return The number of records that failed to be imported.
     */

    public Integer getNumberOfRecordsFailed() {
        return this.numberOfRecordsFailed;
    }

    /**
     * <p>
     * The number of records that failed to be imported.
     * </p>
     * 
     * @param numberOfRecordsFailed
     *        The number of records that failed to be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withNumberOfRecordsFailed(Integer numberOfRecordsFailed) {
        setNumberOfRecordsFailed(numberOfRecordsFailed);
        return this;
    }

    /**
     * <p>
     * The number of records successfully imported.
     * </p>
     * 
     * @param numberOfRecordsSuccess
     *        The number of records successfully imported.
     */

    public void setNumberOfRecordsSuccess(Integer numberOfRecordsSuccess) {
        this.numberOfRecordsSuccess = numberOfRecordsSuccess;
    }

    /**
     * <p>
     * The number of records successfully imported.
     * </p>
     * 
     * @return The number of records successfully imported.
     */

    public Integer getNumberOfRecordsSuccess() {
        return this.numberOfRecordsSuccess;
    }

    /**
     * <p>
     * The number of records successfully imported.
     * </p>
     * 
     * @param numberOfRecordsSuccess
     *        The number of records successfully imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withNumberOfRecordsSuccess(Integer numberOfRecordsSuccess) {
        setNumberOfRecordsSuccess(numberOfRecordsSuccess);
        return this;
    }

    /**
     * <p>
     * Start time of the import task.
     * </p>
     * 
     * @param startTime
     *        Start time of the import task.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Start time of the import task.
     * </p>
     * 
     * @return Start time of the import task.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Start time of the import task.
     * </p>
     * 
     * @param startTime
     *        Start time of the import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Status of import file task.
     * </p>
     * 
     * @param status
     *        Status of import file task.
     * @see ImportFileTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of import file task.
     * </p>
     * 
     * @return Status of import file task.
     * @see ImportFileTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of import file task.
     * </p>
     * 
     * @param status
     *        Status of import file task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportFileTaskStatus
     */

    public GetImportFileTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of import file task.
     * </p>
     * 
     * @param status
     *        Status of import file task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportFileTaskStatus
     */

    public GetImportFileTaskResult withStatus(ImportFileTaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The S3 bucket name for status report of import task.
     * </p>
     * 
     * @param statusReportS3Bucket
     *        The S3 bucket name for status report of import task.
     */

    public void setStatusReportS3Bucket(String statusReportS3Bucket) {
        this.statusReportS3Bucket = statusReportS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket name for status report of import task.
     * </p>
     * 
     * @return The S3 bucket name for status report of import task.
     */

    public String getStatusReportS3Bucket() {
        return this.statusReportS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket name for status report of import task.
     * </p>
     * 
     * @param statusReportS3Bucket
     *        The S3 bucket name for status report of import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withStatusReportS3Bucket(String statusReportS3Bucket) {
        setStatusReportS3Bucket(statusReportS3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 key name for status report of import task. The report contains details about whether each record
     * imported successfully or why it did not.
     * </p>
     * 
     * @param statusReportS3Key
     *        The Amazon S3 key name for status report of import task. The report contains details about whether each
     *        record imported successfully or why it did not.
     */

    public void setStatusReportS3Key(String statusReportS3Key) {
        this.statusReportS3Key = statusReportS3Key;
    }

    /**
     * <p>
     * The Amazon S3 key name for status report of import task. The report contains details about whether each record
     * imported successfully or why it did not.
     * </p>
     * 
     * @return The Amazon S3 key name for status report of import task. The report contains details about whether each
     *         record imported successfully or why it did not.
     */

    public String getStatusReportS3Key() {
        return this.statusReportS3Key;
    }

    /**
     * <p>
     * The Amazon S3 key name for status report of import task. The report contains details about whether each record
     * imported successfully or why it did not.
     * </p>
     * 
     * @param statusReportS3Key
     *        The Amazon S3 key name for status report of import task. The report contains details about whether each
     *        record imported successfully or why it did not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImportFileTaskResult withStatusReportS3Key(String statusReportS3Key) {
        setStatusReportS3Key(statusReportS3Key);
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
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getImportName() != null)
            sb.append("ImportName: ").append(getImportName()).append(",");
        if (getInputS3Bucket() != null)
            sb.append("InputS3Bucket: ").append(getInputS3Bucket()).append(",");
        if (getInputS3Key() != null)
            sb.append("InputS3Key: ").append(getInputS3Key()).append(",");
        if (getNumberOfRecordsFailed() != null)
            sb.append("NumberOfRecordsFailed: ").append(getNumberOfRecordsFailed()).append(",");
        if (getNumberOfRecordsSuccess() != null)
            sb.append("NumberOfRecordsSuccess: ").append(getNumberOfRecordsSuccess()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReportS3Bucket() != null)
            sb.append("StatusReportS3Bucket: ").append(getStatusReportS3Bucket()).append(",");
        if (getStatusReportS3Key() != null)
            sb.append("StatusReportS3Key: ").append(getStatusReportS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImportFileTaskResult == false)
            return false;
        GetImportFileTaskResult other = (GetImportFileTaskResult) obj;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getImportName() == null ^ this.getImportName() == null)
            return false;
        if (other.getImportName() != null && other.getImportName().equals(this.getImportName()) == false)
            return false;
        if (other.getInputS3Bucket() == null ^ this.getInputS3Bucket() == null)
            return false;
        if (other.getInputS3Bucket() != null && other.getInputS3Bucket().equals(this.getInputS3Bucket()) == false)
            return false;
        if (other.getInputS3Key() == null ^ this.getInputS3Key() == null)
            return false;
        if (other.getInputS3Key() != null && other.getInputS3Key().equals(this.getInputS3Key()) == false)
            return false;
        if (other.getNumberOfRecordsFailed() == null ^ this.getNumberOfRecordsFailed() == null)
            return false;
        if (other.getNumberOfRecordsFailed() != null && other.getNumberOfRecordsFailed().equals(this.getNumberOfRecordsFailed()) == false)
            return false;
        if (other.getNumberOfRecordsSuccess() == null ^ this.getNumberOfRecordsSuccess() == null)
            return false;
        if (other.getNumberOfRecordsSuccess() != null && other.getNumberOfRecordsSuccess().equals(this.getNumberOfRecordsSuccess()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReportS3Bucket() == null ^ this.getStatusReportS3Bucket() == null)
            return false;
        if (other.getStatusReportS3Bucket() != null && other.getStatusReportS3Bucket().equals(this.getStatusReportS3Bucket()) == false)
            return false;
        if (other.getStatusReportS3Key() == null ^ this.getStatusReportS3Key() == null)
            return false;
        if (other.getStatusReportS3Key() != null && other.getStatusReportS3Key().equals(this.getStatusReportS3Key()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getImportName() == null) ? 0 : getImportName().hashCode());
        hashCode = prime * hashCode + ((getInputS3Bucket() == null) ? 0 : getInputS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getInputS3Key() == null) ? 0 : getInputS3Key().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRecordsFailed() == null) ? 0 : getNumberOfRecordsFailed().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRecordsSuccess() == null) ? 0 : getNumberOfRecordsSuccess().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReportS3Bucket() == null) ? 0 : getStatusReportS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getStatusReportS3Key() == null) ? 0 : getStatusReportS3Key().hashCode());
        return hashCode;
    }

    @Override
    public GetImportFileTaskResult clone() {
        try {
            return (GetImportFileTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
