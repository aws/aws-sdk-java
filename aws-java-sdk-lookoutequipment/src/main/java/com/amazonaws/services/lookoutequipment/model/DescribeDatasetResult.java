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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DescribeDataset" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset being described.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being described.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Specifies the time the dataset was created in Amazon Lookout for Equipment.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies the time the dataset was last updated, if it was.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * Indicates the status of the dataset.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     */
    private String serverSideKmsKeyId;
    /**
     * <p>
     * Specifies the S3 location configuration for the data input for the data ingestion job.
     * </p>
     */
    private IngestionInputConfiguration ingestionInputConfiguration;

    /**
     * <p>
     * The name of the dataset being described.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being described.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset being described.
     * </p>
     * 
     * @return The name of the dataset being described.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset being described.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being described.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset being described.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset being described.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset being described.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * Specifies the time the dataset was created in Amazon Lookout for Equipment.
     * </p>
     * 
     * @param createdAt
     *        Specifies the time the dataset was created in Amazon Lookout for Equipment.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Specifies the time the dataset was created in Amazon Lookout for Equipment.
     * </p>
     * 
     * @return Specifies the time the dataset was created in Amazon Lookout for Equipment.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Specifies the time the dataset was created in Amazon Lookout for Equipment.
     * </p>
     * 
     * @param createdAt
     *        Specifies the time the dataset was created in Amazon Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies the time the dataset was last updated, if it was.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies the time the dataset was last updated, if it was.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies the time the dataset was last updated, if it was.
     * </p>
     * 
     * @return Specifies the time the dataset was last updated, if it was.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies the time the dataset was last updated, if it was.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies the time the dataset was last updated, if it was.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the dataset.
     * </p>
     * 
     * @param status
     *        Indicates the status of the dataset.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the dataset.
     * </p>
     * 
     * @return Indicates the status of the dataset.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the dataset.
     * </p>
     * 
     * @param status
     *        Indicates the status of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DescribeDatasetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the dataset.
     * </p>
     * 
     * @param status
     *        Indicates the status of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DescribeDatasetResult withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param schema
     *        A JSON description of the data that is in each time series dataset, including names, column names, and
     *        data types.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return A JSON description of the data that is in each time series dataset, including names, column names, and
     *         data types.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * A JSON description of the data that is in each time series dataset, including names, column names, and data
     * types.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param schema
     *        A JSON description of the data that is in each time series dataset, including names, column names, and
     *        data types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon
     *        Lookout for Equipment.
     */

    public void setServerSideKmsKeyId(String serverSideKmsKeyId) {
        this.serverSideKmsKeyId = serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     * 
     * @return Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon
     *         Lookout for Equipment.
     */

    public String getServerSideKmsKeyId() {
        return this.serverSideKmsKeyId;
    }

    /**
     * <p>
     * Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon Lookout
     * for Equipment.
     * </p>
     * 
     * @param serverSideKmsKeyId
     *        Provides the identifier of the AWS KMS customer master key (CMK) used to encrypt dataset data by Amazon
     *        Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withServerSideKmsKeyId(String serverSideKmsKeyId) {
        setServerSideKmsKeyId(serverSideKmsKeyId);
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

    public DescribeDatasetResult withIngestionInputConfiguration(IngestionInputConfiguration ingestionInputConfiguration) {
        setIngestionInputConfiguration(ingestionInputConfiguration);
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getServerSideKmsKeyId() != null)
            sb.append("ServerSideKmsKeyId: ").append(getServerSideKmsKeyId()).append(",");
        if (getIngestionInputConfiguration() != null)
            sb.append("IngestionInputConfiguration: ").append(getIngestionInputConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetResult == false)
            return false;
        DescribeDatasetResult other = (DescribeDatasetResult) obj;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getServerSideKmsKeyId() == null ^ this.getServerSideKmsKeyId() == null)
            return false;
        if (other.getServerSideKmsKeyId() != null && other.getServerSideKmsKeyId().equals(this.getServerSideKmsKeyId()) == false)
            return false;
        if (other.getIngestionInputConfiguration() == null ^ this.getIngestionInputConfiguration() == null)
            return false;
        if (other.getIngestionInputConfiguration() != null && other.getIngestionInputConfiguration().equals(this.getIngestionInputConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getServerSideKmsKeyId() == null) ? 0 : getServerSideKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getIngestionInputConfiguration() == null) ? 0 : getIngestionInputConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetResult clone() {
        try {
            return (DescribeDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
