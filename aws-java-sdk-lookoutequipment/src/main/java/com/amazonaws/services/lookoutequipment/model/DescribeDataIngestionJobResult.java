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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataIngestionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataIngestionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Specifies the S3 location configuration for the data input for the data ingestion job.
     * </p>
     */
    private IngestionInputConfiguration ingestionInputConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The time at which the data ingestion job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Indicates the status of the <code>DataIngestionJob</code> operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the reason for failure when a data ingestion job has failed.
     * </p>
     */
    private String failedReason;
    /**
     * <p>
     * Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying incorrect data
     * such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, and
     * DuplicateTimeStamps.
     * </p>
     */
    private DataQualitySummary dataQualitySummary;

    private IngestedFilesSummary ingestedFilesSummary;
    /**
     * <p>
     * Provides details about status of the ingestion job that is currently in progress.
     * </p>
     */
    private String statusDetail;
    /**
     * <p>
     * Indicates the size of the ingested dataset.
     * </p>
     */
    private Long ingestedDataSize;
    /**
     * <p>
     * Indicates the earliest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     */
    private java.util.Date dataStartTime;
    /**
     * <p>
     * Indicates the latest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     */
    private java.util.Date dataEndTime;

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     * 
     * @param jobId
     *        Indicates the job ID of the data ingestion job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     * 
     * @return Indicates the job ID of the data ingestion job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     * 
     * @param jobId
     *        Indicates the job ID of the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset being used in the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * Specifies the S3 location configuration for the data input for the data ingestion job.
     * </p>
     * 
     * @param ingestionInputConfiguration
     *        Specifies the S3 location configuration for the data input for the data ingestion job.
     */

    public void setIngestionInputConfiguration(IngestionInputConfiguration ingestionInputConfiguration) {
        this.ingestionInputConfiguration = ingestionInputConfiguration;
    }

    /**
     * <p>
     * Specifies the S3 location configuration for the data input for the data ingestion job.
     * </p>
     * 
     * @return Specifies the S3 location configuration for the data input for the data ingestion job.
     */

    public IngestionInputConfiguration getIngestionInputConfiguration() {
        return this.ingestionInputConfiguration;
    }

    /**
     * <p>
     * Specifies the S3 location configuration for the data input for the data ingestion job.
     * </p>
     * 
     * @param ingestionInputConfiguration
     *        Specifies the S3 location configuration for the data input for the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withIngestionInputConfiguration(IngestionInputConfiguration ingestionInputConfiguration) {
        setIngestionInputConfiguration(ingestionInputConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role with permission to access the data source being ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The time at which the data ingestion job was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the data ingestion job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the data ingestion job was created.
     * </p>
     * 
     * @return The time at which the data ingestion job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the data ingestion job was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the data ingestion job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>DataIngestionJob</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>DataIngestionJob</code> operation.
     * @see IngestionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the <code>DataIngestionJob</code> operation.
     * </p>
     * 
     * @return Indicates the status of the <code>DataIngestionJob</code> operation.
     * @see IngestionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the <code>DataIngestionJob</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>DataIngestionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public DescribeDataIngestionJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the <code>DataIngestionJob</code> operation.
     * </p>
     * 
     * @param status
     *        Indicates the status of the <code>DataIngestionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public DescribeDataIngestionJobResult withStatus(IngestionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the reason for failure when a data ingestion job has failed.
     * </p>
     * 
     * @param failedReason
     *        Specifies the reason for failure when a data ingestion job has failed.
     */

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    /**
     * <p>
     * Specifies the reason for failure when a data ingestion job has failed.
     * </p>
     * 
     * @return Specifies the reason for failure when a data ingestion job has failed.
     */

    public String getFailedReason() {
        return this.failedReason;
    }

    /**
     * <p>
     * Specifies the reason for failure when a data ingestion job has failed.
     * </p>
     * 
     * @param failedReason
     *        Specifies the reason for failure when a data ingestion job has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withFailedReason(String failedReason) {
        setFailedReason(failedReason);
        return this;
    }

    /**
     * <p>
     * Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying incorrect data
     * such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, and
     * DuplicateTimeStamps.
     * </p>
     * 
     * @param dataQualitySummary
     *        Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying
     *        incorrect data such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats,
     *        InsufficientSensorData, and DuplicateTimeStamps.
     */

    public void setDataQualitySummary(DataQualitySummary dataQualitySummary) {
        this.dataQualitySummary = dataQualitySummary;
    }

    /**
     * <p>
     * Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying incorrect data
     * such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, and
     * DuplicateTimeStamps.
     * </p>
     * 
     * @return Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying
     *         incorrect data such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats,
     *         InsufficientSensorData, and DuplicateTimeStamps.
     */

    public DataQualitySummary getDataQualitySummary() {
        return this.dataQualitySummary;
    }

    /**
     * <p>
     * Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying incorrect data
     * such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats, InsufficientSensorData, and
     * DuplicateTimeStamps.
     * </p>
     * 
     * @param dataQualitySummary
     *        Gives statistics about a completed ingestion job. These statistics primarily relate to quantifying
     *        incorrect data such as MissingCompleteSensorData, MissingSensorData, UnsupportedDateFormats,
     *        InsufficientSensorData, and DuplicateTimeStamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withDataQualitySummary(DataQualitySummary dataQualitySummary) {
        setDataQualitySummary(dataQualitySummary);
        return this;
    }

    /**
     * @param ingestedFilesSummary
     */

    public void setIngestedFilesSummary(IngestedFilesSummary ingestedFilesSummary) {
        this.ingestedFilesSummary = ingestedFilesSummary;
    }

    /**
     * @return
     */

    public IngestedFilesSummary getIngestedFilesSummary() {
        return this.ingestedFilesSummary;
    }

    /**
     * @param ingestedFilesSummary
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withIngestedFilesSummary(IngestedFilesSummary ingestedFilesSummary) {
        setIngestedFilesSummary(ingestedFilesSummary);
        return this;
    }

    /**
     * <p>
     * Provides details about status of the ingestion job that is currently in progress.
     * </p>
     * 
     * @param statusDetail
     *        Provides details about status of the ingestion job that is currently in progress.
     */

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    /**
     * <p>
     * Provides details about status of the ingestion job that is currently in progress.
     * </p>
     * 
     * @return Provides details about status of the ingestion job that is currently in progress.
     */

    public String getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * <p>
     * Provides details about status of the ingestion job that is currently in progress.
     * </p>
     * 
     * @param statusDetail
     *        Provides details about status of the ingestion job that is currently in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withStatusDetail(String statusDetail) {
        setStatusDetail(statusDetail);
        return this;
    }

    /**
     * <p>
     * Indicates the size of the ingested dataset.
     * </p>
     * 
     * @param ingestedDataSize
     *        Indicates the size of the ingested dataset.
     */

    public void setIngestedDataSize(Long ingestedDataSize) {
        this.ingestedDataSize = ingestedDataSize;
    }

    /**
     * <p>
     * Indicates the size of the ingested dataset.
     * </p>
     * 
     * @return Indicates the size of the ingested dataset.
     */

    public Long getIngestedDataSize() {
        return this.ingestedDataSize;
    }

    /**
     * <p>
     * Indicates the size of the ingested dataset.
     * </p>
     * 
     * @param ingestedDataSize
     *        Indicates the size of the ingested dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withIngestedDataSize(Long ingestedDataSize) {
        setIngestedDataSize(ingestedDataSize);
        return this;
    }

    /**
     * <p>
     * Indicates the earliest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     * 
     * @param dataStartTime
     *        Indicates the earliest timestamp corresponding to data that was successfully ingested during this specific
     *        ingestion job.
     */

    public void setDataStartTime(java.util.Date dataStartTime) {
        this.dataStartTime = dataStartTime;
    }

    /**
     * <p>
     * Indicates the earliest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     * 
     * @return Indicates the earliest timestamp corresponding to data that was successfully ingested during this
     *         specific ingestion job.
     */

    public java.util.Date getDataStartTime() {
        return this.dataStartTime;
    }

    /**
     * <p>
     * Indicates the earliest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     * 
     * @param dataStartTime
     *        Indicates the earliest timestamp corresponding to data that was successfully ingested during this specific
     *        ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withDataStartTime(java.util.Date dataStartTime) {
        setDataStartTime(dataStartTime);
        return this;
    }

    /**
     * <p>
     * Indicates the latest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     * 
     * @param dataEndTime
     *        Indicates the latest timestamp corresponding to data that was successfully ingested during this specific
     *        ingestion job.
     */

    public void setDataEndTime(java.util.Date dataEndTime) {
        this.dataEndTime = dataEndTime;
    }

    /**
     * <p>
     * Indicates the latest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     * 
     * @return Indicates the latest timestamp corresponding to data that was successfully ingested during this specific
     *         ingestion job.
     */

    public java.util.Date getDataEndTime() {
        return this.dataEndTime;
    }

    /**
     * <p>
     * Indicates the latest timestamp corresponding to data that was successfully ingested during this specific
     * ingestion job.
     * </p>
     * 
     * @param dataEndTime
     *        Indicates the latest timestamp corresponding to data that was successfully ingested during this specific
     *        ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataIngestionJobResult withDataEndTime(java.util.Date dataEndTime) {
        setDataEndTime(dataEndTime);
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getIngestionInputConfiguration() != null)
            sb.append("IngestionInputConfiguration: ").append(getIngestionInputConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailedReason() != null)
            sb.append("FailedReason: ").append(getFailedReason()).append(",");
        if (getDataQualitySummary() != null)
            sb.append("DataQualitySummary: ").append(getDataQualitySummary()).append(",");
        if (getIngestedFilesSummary() != null)
            sb.append("IngestedFilesSummary: ").append(getIngestedFilesSummary()).append(",");
        if (getStatusDetail() != null)
            sb.append("StatusDetail: ").append(getStatusDetail()).append(",");
        if (getIngestedDataSize() != null)
            sb.append("IngestedDataSize: ").append(getIngestedDataSize()).append(",");
        if (getDataStartTime() != null)
            sb.append("DataStartTime: ").append(getDataStartTime()).append(",");
        if (getDataEndTime() != null)
            sb.append("DataEndTime: ").append(getDataEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataIngestionJobResult == false)
            return false;
        DescribeDataIngestionJobResult other = (DescribeDataIngestionJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getIngestionInputConfiguration() == null ^ this.getIngestionInputConfiguration() == null)
            return false;
        if (other.getIngestionInputConfiguration() != null && other.getIngestionInputConfiguration().equals(this.getIngestionInputConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailedReason() == null ^ this.getFailedReason() == null)
            return false;
        if (other.getFailedReason() != null && other.getFailedReason().equals(this.getFailedReason()) == false)
            return false;
        if (other.getDataQualitySummary() == null ^ this.getDataQualitySummary() == null)
            return false;
        if (other.getDataQualitySummary() != null && other.getDataQualitySummary().equals(this.getDataQualitySummary()) == false)
            return false;
        if (other.getIngestedFilesSummary() == null ^ this.getIngestedFilesSummary() == null)
            return false;
        if (other.getIngestedFilesSummary() != null && other.getIngestedFilesSummary().equals(this.getIngestedFilesSummary()) == false)
            return false;
        if (other.getStatusDetail() == null ^ this.getStatusDetail() == null)
            return false;
        if (other.getStatusDetail() != null && other.getStatusDetail().equals(this.getStatusDetail()) == false)
            return false;
        if (other.getIngestedDataSize() == null ^ this.getIngestedDataSize() == null)
            return false;
        if (other.getIngestedDataSize() != null && other.getIngestedDataSize().equals(this.getIngestedDataSize()) == false)
            return false;
        if (other.getDataStartTime() == null ^ this.getDataStartTime() == null)
            return false;
        if (other.getDataStartTime() != null && other.getDataStartTime().equals(this.getDataStartTime()) == false)
            return false;
        if (other.getDataEndTime() == null ^ this.getDataEndTime() == null)
            return false;
        if (other.getDataEndTime() != null && other.getDataEndTime().equals(this.getDataEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getIngestionInputConfiguration() == null) ? 0 : getIngestionInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailedReason() == null) ? 0 : getFailedReason().hashCode());
        hashCode = prime * hashCode + ((getDataQualitySummary() == null) ? 0 : getDataQualitySummary().hashCode());
        hashCode = prime * hashCode + ((getIngestedFilesSummary() == null) ? 0 : getIngestedFilesSummary().hashCode());
        hashCode = prime * hashCode + ((getStatusDetail() == null) ? 0 : getStatusDetail().hashCode());
        hashCode = prime * hashCode + ((getIngestedDataSize() == null) ? 0 : getIngestedDataSize().hashCode());
        hashCode = prime * hashCode + ((getDataStartTime() == null) ? 0 : getDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataEndTime() == null) ? 0 : getDataEndTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataIngestionJobResult clone() {
        try {
            return (DescribeDataIngestionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
