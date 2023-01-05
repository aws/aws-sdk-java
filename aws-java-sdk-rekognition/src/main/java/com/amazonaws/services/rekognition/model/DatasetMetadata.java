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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for an Amazon Rekognition Custom Labels dataset. For more information, see
 * <a>ProjectDescription</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The type of the dataset.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     */
    private String datasetArn;
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
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     */
    private String statusMessageCode;

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
     * The type of the dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset.
     * @see DatasetType
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
     * @see DatasetType
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
     * @see DatasetType
     */

    public DatasetMetadata withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The type of the dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DatasetMetadata withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) for the dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
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
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @param statusMessageCode
     *        The status message code for the dataset operation. If a service error occurs, try the API call again
     *        later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @see DatasetStatusMessageCode
     */

    public void setStatusMessageCode(String statusMessageCode) {
        this.statusMessageCode = statusMessageCode;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @return The status message code for the dataset operation. If a service error occurs, try the API call again
     *         later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @see DatasetStatusMessageCode
     */

    public String getStatusMessageCode() {
        return this.statusMessageCode;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @param statusMessageCode
     *        The status message code for the dataset operation. If a service error occurs, try the API call again
     *        later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatusMessageCode
     */

    public DatasetMetadata withStatusMessageCode(String statusMessageCode) {
        setStatusMessageCode(statusMessageCode);
        return this;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @param statusMessageCode
     *        The status message code for the dataset operation. If a service error occurs, try the API call again
     *        later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatusMessageCode
     */

    public DatasetMetadata withStatusMessageCode(DatasetStatusMessageCode statusMessageCode) {
        this.statusMessageCode = statusMessageCode.toString();
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
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStatusMessageCode() != null)
            sb.append("StatusMessageCode: ").append(getStatusMessageCode());
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
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStatusMessageCode() == null ^ this.getStatusMessageCode() == null)
            return false;
        if (other.getStatusMessageCode() != null && other.getStatusMessageCode().equals(this.getStatusMessageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusMessageCode() == null) ? 0 : getStatusMessageCode().hashCode());
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
        com.amazonaws.services.rekognition.model.transform.DatasetMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
