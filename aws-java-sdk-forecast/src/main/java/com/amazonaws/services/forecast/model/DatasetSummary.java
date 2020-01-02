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
 * Provides a summary of the dataset properties used in the <a>ListDatasets</a> operation. To get the complete set of
 * properties, call the <a>DescribeDataset</a> operation, and provide the <code>DatasetArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DatasetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The dataset type.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The domain associated with the dataset.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * When the dataset was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When you create a dataset, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. While data
     * is being imported to the dataset, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasets</code> call. After a <a>CreateDatasetImportJob</a> operation has finished,
     * <code>LastModificationTime</code> is when the import job completed or failed.
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @param datasetType
     *        The dataset type.
     * @see DatasetType
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @return The dataset type.
     * @see DatasetType
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @param datasetType
     *        The dataset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DatasetSummary withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The dataset type.
     * </p>
     * 
     * @param datasetType
     *        The dataset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DatasetSummary withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain associated with the dataset.
     * </p>
     * 
     * @return The domain associated with the dataset.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain associated with the dataset.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DatasetSummary withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DatasetSummary withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * When the dataset was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the dataset was created.
     * </p>
     * 
     * @return When the dataset was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the dataset was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When you create a dataset, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. While data
     * is being imported to the dataset, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasets</code> call. After a <a>CreateDatasetImportJob</a> operation has finished,
     * <code>LastModificationTime</code> is when the import job completed or failed.
     * </p>
     * 
     * @param lastModificationTime
     *        When you create a dataset, <code>LastModificationTime</code> is the same as <code>CreationTime</code>.
     *        While data is being imported to the dataset, <code>LastModificationTime</code> is the current time of the
     *        <code>ListDatasets</code> call. After a <a>CreateDatasetImportJob</a> operation has finished,
     *        <code>LastModificationTime</code> is when the import job completed or failed.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * When you create a dataset, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. While data
     * is being imported to the dataset, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasets</code> call. After a <a>CreateDatasetImportJob</a> operation has finished,
     * <code>LastModificationTime</code> is when the import job completed or failed.
     * </p>
     * 
     * @return When you create a dataset, <code>LastModificationTime</code> is the same as <code>CreationTime</code>.
     *         While data is being imported to the dataset, <code>LastModificationTime</code> is the current time of the
     *         <code>ListDatasets</code> call. After a <a>CreateDatasetImportJob</a> operation has finished,
     *         <code>LastModificationTime</code> is when the import job completed or failed.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * When you create a dataset, <code>LastModificationTime</code> is the same as <code>CreationTime</code>. While data
     * is being imported to the dataset, <code>LastModificationTime</code> is the current time of the
     * <code>ListDatasets</code> call. After a <a>CreateDatasetImportJob</a> operation has finished,
     * <code>LastModificationTime</code> is when the import job completed or failed.
     * </p>
     * 
     * @param lastModificationTime
     *        When you create a dataset, <code>LastModificationTime</code> is the same as <code>CreationTime</code>.
     *        While data is being imported to the dataset, <code>LastModificationTime</code> is the current time of the
     *        <code>ListDatasets</code> call. After a <a>CreateDatasetImportJob</a> operation has finished,
     *        <code>LastModificationTime</code> is when the import job completed or failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withLastModificationTime(java.util.Date lastModificationTime) {
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
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

        if (obj instanceof DatasetSummary == false)
            return false;
        DatasetSummary other = (DatasetSummary) obj;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
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

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DatasetSummary clone() {
        try {
            return (DatasetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.DatasetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
