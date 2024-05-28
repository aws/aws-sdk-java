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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filter the datasets based on creation time or dataset status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DatasetFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Filter the datasets to include datasets created before the specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * 
     * @param status
     *        Filter the datasets based on the dataset status.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * 
     * @return Filter the datasets based on the dataset status.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * 
     * @param status
     *        Filter the datasets based on the dataset status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetFilter withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset status.
     * </p>
     * 
     * @param status
     *        Filter the datasets based on the dataset status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetFilter withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * 
     * @param datasetType
     *        Filter the datasets based on the dataset type.
     * @see DatasetType
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * 
     * @return Filter the datasets based on the dataset type.
     * @see DatasetType
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * 
     * @param datasetType
     *        Filter the datasets based on the dataset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DatasetFilter withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * Filter the datasets based on the dataset type.
     * </p>
     * 
     * @param datasetType
     *        Filter the datasets based on the dataset type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DatasetFilter withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Filter the datasets to include datasets created after the specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     * 
     * @return Filter the datasets to include datasets created after the specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Filter the datasets to include datasets created after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetFilter withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Filter the datasets to include datasets created before the specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created before the specified time.
     * </p>
     * 
     * @return Filter the datasets to include datasets created before the specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Filter the datasets to include datasets created before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Filter the datasets to include datasets created before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetFilter withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetFilter == false)
            return false;
        DatasetFilter other = (DatasetFilter) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        return hashCode;
    }

    @Override
    public DatasetFilter clone() {
        try {
            return (DatasetFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DatasetFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
