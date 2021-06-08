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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sumary information for an Amazon Lookout for Vision dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DatasetMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the dataset.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The status for the dataset.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the dataset.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset.
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * 
     * @return The type of the dataset.
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the date and time that the dataset was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     * 
     * @return The Unix timestamp for the date and time that the dataset was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the date and time that the dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The status for the dataset.
     * </p>
     * 
     * @param status
     *        The status for the dataset.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for the dataset.
     * </p>
     * 
     * @return The status for the dataset.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for the dataset.
     * </p>
     * 
     * @param status
     *        The status for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for the dataset.
     * </p>
     * 
     * @param status
     *        The status for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetMetadata withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the dataset.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     * 
     * @return The status message for the dataset.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetMetadata == false)
            return false;
        DatasetMetadata other = (DatasetMetadata) obj;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public DatasetMetadata clone() {
        try {
            return (DatasetMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.DatasetMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
