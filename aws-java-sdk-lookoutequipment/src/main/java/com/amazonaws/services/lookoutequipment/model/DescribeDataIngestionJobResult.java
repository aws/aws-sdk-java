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
            sb.append("FailedReason: ").append(getFailedReason());
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
