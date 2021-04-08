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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a specified data ingestion job, including dataset information, data ingestion
 * configuration, and status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DataIngestionJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataIngestionJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the job ID of the data ingestion job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the dataset used for the data ingestion job.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used in the data ingestion job.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Specifies information for the input data for the data inference job, including data S3 location parameters.
     * </p>
     */
    private IngestionInputConfiguration ingestionInputConfiguration;
    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     */
    private String status;

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

    public DataIngestionJobSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the dataset used for the data ingestion job.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset used for the data ingestion job.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset used for the data ingestion job.
     * </p>
     * 
     * @return The name of the dataset used for the data ingestion job.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset used for the data ingestion job.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset used for the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIngestionJobSummary withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used in the data ingestion job.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset used in the data ingestion job.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used in the data ingestion job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset used in the data ingestion job.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset used in the data ingestion job.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset used in the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIngestionJobSummary withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * Specifies information for the input data for the data inference job, including data S3 location parameters.
     * </p>
     * 
     * @param ingestionInputConfiguration
     *        Specifies information for the input data for the data inference job, including data S3 location
     *        parameters.
     */

    public void setIngestionInputConfiguration(IngestionInputConfiguration ingestionInputConfiguration) {
        this.ingestionInputConfiguration = ingestionInputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the input data for the data inference job, including data S3 location parameters.
     * </p>
     * 
     * @return Specifies information for the input data for the data inference job, including data S3 location
     *         parameters.
     */

    public IngestionInputConfiguration getIngestionInputConfiguration() {
        return this.ingestionInputConfiguration;
    }

    /**
     * <p>
     * Specifies information for the input data for the data inference job, including data S3 location parameters.
     * </p>
     * 
     * @param ingestionInputConfiguration
     *        Specifies information for the input data for the data inference job, including data S3 location
     *        parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataIngestionJobSummary withIngestionInputConfiguration(IngestionInputConfiguration ingestionInputConfiguration) {
        setIngestionInputConfiguration(ingestionInputConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @param status
     *        Indicates the status of the data ingestion job.
     * @see IngestionJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @return Indicates the status of the data ingestion job.
     * @see IngestionJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @param status
     *        Indicates the status of the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public DataIngestionJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the data ingestion job.
     * </p>
     * 
     * @param status
     *        Indicates the status of the data ingestion job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobStatus
     */

    public DataIngestionJobSummary withStatus(IngestionJobStatus status) {
        this.status = status.toString();
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
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getIngestionInputConfiguration() != null)
            sb.append("IngestionInputConfiguration: ").append(getIngestionInputConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataIngestionJobSummary == false)
            return false;
        DataIngestionJobSummary other = (DataIngestionJobSummary) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getIngestionInputConfiguration() == null ^ this.getIngestionInputConfiguration() == null)
            return false;
        if (other.getIngestionInputConfiguration() != null && other.getIngestionInputConfiguration().equals(this.getIngestionInputConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getIngestionInputConfiguration() == null) ? 0 : getIngestionInputConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DataIngestionJobSummary clone() {
        try {
            return (DataIngestionJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.DataIngestionJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
