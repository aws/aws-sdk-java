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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the dataset import job properties used in the <a>ListDatasetImportJobs</a> operation. To get
 * the complete set of properties, call the <a>DescribeDatasetImportJob</a> operation, and provide the
 * <code>DatasetImportJobArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DatasetImportJobSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetImportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job.
     * </p>
     */
    private String datasetImportJobArn;
    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     */
    private String datasetImportJobName;
    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> includes an AWS Key Management Service (KMS) key.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time that the dataset was modified. The time depends on the status of the job, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The same time as <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The Amazon Resource Name (ARN) of the dataset import job.
     */

    public void setDatasetImportJobArn(String datasetImportJobArn) {
        this.datasetImportJobArn = datasetImportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset import job.
     */

    public String getDatasetImportJobArn() {
        return this.datasetImportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The Amazon Resource Name (ARN) of the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJobSummary withDatasetImportJobArn(String datasetImportJobArn) {
        setDatasetImportJobArn(datasetImportJobArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobName
     *        The name of the dataset import job.
     */

    public void setDatasetImportJobName(String datasetImportJobName) {
        this.datasetImportJobName = datasetImportJobName;
    }

    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     * 
     * @return The name of the dataset import job.
     */

    public String getDatasetImportJobName() {
        return this.datasetImportJobName;
    }

    /**
     * <p>
     * The name of the dataset import job.
     * </p>
     * 
     * @param datasetImportJobName
     *        The name of the dataset import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJobSummary withDatasetImportJobName(String datasetImportJobName) {
        setDatasetImportJobName(datasetImportJobName);
        return this;
    }

    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> includes an AWS Key Management Service (KMS) key.
     * </p>
     * 
     * @param dataSource
     *        The location of the training data to import and an AWS Identity and Access Management (IAM) role that
     *        Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3
     *        bucket.</p>
     *        <p>
     *        If encryption is used, <code>DataSource</code> includes an AWS Key Management Service (KMS) key.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> includes an AWS Key Management Service (KMS) key.
     * </p>
     * 
     * @return The location of the training data to import and an AWS Identity and Access Management (IAM) role that
     *         Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3
     *         bucket.</p>
     *         <p>
     *         If encryption is used, <code>DataSource</code> includes an AWS Key Management Service (KMS) key.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The location of the training data to import and an AWS Identity and Access Management (IAM) role that Amazon
     * Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket.
     * </p>
     * <p>
     * If encryption is used, <code>DataSource</code> includes an AWS Key Management Service (KMS) key.
     * </p>
     * 
     * @param dataSource
     *        The location of the training data to import and an AWS Identity and Access Management (IAM) role that
     *        Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3
     *        bucket.</p>
     *        <p>
     *        If encryption is used, <code>DataSource</code> includes an AWS Key Management Service (KMS) key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJobSummary withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dataset import job. The status is reflected in the status of the dataset. For example,
     *        when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     *        <code>UPDATE_IN_PROGRESS</code>. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the dataset import job. The status is reflected in the status of the dataset. For example,
     *         when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     *         <code>UPDATE_IN_PROGRESS</code>. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dataset import job. The status is reflected in the status of the dataset. For example, when the
     * import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     * <code>UPDATE_IN_PROGRESS</code>. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the dataset import job. The status is reflected in the status of the dataset. For example,
     *        when the import job status is <code>CREATE_IN_PROGRESS</code>, the status of the dataset is
     *        <code>UPDATE_IN_PROGRESS</code>. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @return If an error occurred, an informational message about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJobSummary withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset import job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     * 
     * @return When the dataset import job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the dataset import job was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time that the dataset was modified. The time depends on the status of the job, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The same time as <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time that the dataset was modified. The time depends on the status of the job, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The same time as <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *        </p>
     *        </li>
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The last time that the dataset was modified. The time depends on the status of the job, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The same time as <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The last time that the dataset was modified. The time depends on the status of the job, as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code> - The same time as <code>CreationTime</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *         </p>
     *         </li>
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The last time that the dataset was modified. The time depends on the status of the job, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code> - The same time as <code>CreationTime</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastModificationTime
     *        The last time that the dataset was modified. The time depends on the status of the job, as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code> - The same time as <code>CreationTime</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_IN_PROGRESS</code> - The current timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> or <code>CREATE_FAILED</code> - When the job finished or failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetImportJobSummary withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getDatasetImportJobArn() != null)
            sb.append("DatasetImportJobArn: ").append(getDatasetImportJobArn()).append(",");
        if (getDatasetImportJobName() != null)
            sb.append("DatasetImportJobName: ").append(getDatasetImportJobName()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetImportJobSummary == false)
            return false;
        DatasetImportJobSummary other = (DatasetImportJobSummary) obj;
        if (other.getDatasetImportJobArn() == null ^ this.getDatasetImportJobArn() == null)
            return false;
        if (other.getDatasetImportJobArn() != null && other.getDatasetImportJobArn().equals(this.getDatasetImportJobArn()) == false)
            return false;
        if (other.getDatasetImportJobName() == null ^ this.getDatasetImportJobName() == null)
            return false;
        if (other.getDatasetImportJobName() != null && other.getDatasetImportJobName().equals(this.getDatasetImportJobName()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetImportJobArn() == null) ? 0 : getDatasetImportJobArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetImportJobName() == null) ? 0 : getDatasetImportJobName().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DatasetImportJobSummary clone() {
        try {
            return (DatasetImportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.DatasetImportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
