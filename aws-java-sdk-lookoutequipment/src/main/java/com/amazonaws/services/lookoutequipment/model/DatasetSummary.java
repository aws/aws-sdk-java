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
 * Contains information about the specific data set, including name, ARN, and status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/DatasetSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * Indicates the status of the dataset.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the dataset was created in Amazon Lookout for Equipment.
     * </p>
     */
    private java.util.Date createdAt;

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
     * The Amazon Resource Name (ARN) of the specified dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the specified dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the specified dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
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

    public DatasetSummary withStatus(String status) {
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

    public DatasetSummary withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the dataset was created in Amazon Lookout for Equipment.
     * </p>
     * 
     * @param createdAt
     *        The time at which the dataset was created in Amazon Lookout for Equipment.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the dataset was created in Amazon Lookout for Equipment.
     * </p>
     * 
     * @return The time at which the dataset was created in Amazon Lookout for Equipment.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the dataset was created in Amazon Lookout for Equipment.
     * </p>
     * 
     * @param createdAt
     *        The time at which the dataset was created in Amazon Lookout for Equipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
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
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
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
        com.amazonaws.services.lookoutequipment.model.transform.DatasetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
