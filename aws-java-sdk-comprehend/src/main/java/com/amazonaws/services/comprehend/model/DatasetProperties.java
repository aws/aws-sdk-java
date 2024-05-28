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
 * Properties associated with the dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DatasetProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the dataset.
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
     * The dataset type (training data or test data).
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     */
    private String datasetS3Uri;
    /**
     * <p>
     * Description of the dataset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the dataset
     * is ready to use, the status changes to <code>COMPLETED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     */
    private Long numberOfDocuments;
    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The ARN of the dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @return The ARN of the dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The ARN of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetProperties withDatasetArn(String datasetArn) {
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

    public DatasetProperties withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * 
     * @param datasetType
     *        The dataset type (training data or test data).
     * @see DatasetType
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * 
     * @return The dataset type (training data or test data).
     * @see DatasetType
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * 
     * @param datasetType
     *        The dataset type (training data or test data).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DatasetProperties withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The dataset type (training data or test data).
     * </p>
     * 
     * @param datasetType
     *        The dataset type (training data or test data).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public DatasetProperties withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     * 
     * @param datasetS3Uri
     *        The S3 URI where the dataset is stored.
     */

    public void setDatasetS3Uri(String datasetS3Uri) {
        this.datasetS3Uri = datasetS3Uri;
    }

    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     * 
     * @return The S3 URI where the dataset is stored.
     */

    public String getDatasetS3Uri() {
        return this.datasetS3Uri;
    }

    /**
     * <p>
     * The S3 URI where the dataset is stored.
     * </p>
     * 
     * @param datasetS3Uri
     *        The S3 URI where the dataset is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetProperties withDatasetS3Uri(String datasetS3Uri) {
        setDatasetS3Uri(datasetS3Uri);
        return this;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * 
     * @param description
     *        Description of the dataset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * 
     * @return Description of the dataset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the dataset.
     * </p>
     * 
     * @param description
     *        Description of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetProperties withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the dataset
     * is ready to use, the status changes to <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the
     *        dataset is ready to use, the status changes to <code>COMPLETED</code>.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the dataset
     * is ready to use, the status changes to <code>COMPLETED</code>.
     * </p>
     * 
     * @return The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the
     *         dataset is ready to use, the status changes to <code>COMPLETED</code>.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the dataset
     * is ready to use, the status changes to <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the
     *        dataset is ready to use, the status changes to <code>COMPLETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the dataset
     * is ready to use, the status changes to <code>COMPLETED</code>.
     * </p>
     * 
     * @param status
     *        The dataset status. While the system creates the dataset, the status is <code>CREATING</code>. When the
     *        dataset is ready to use, the status changes to <code>COMPLETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetProperties withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     * 
     * @param message
     *        A description of the status of the dataset.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     * 
     * @return A description of the status of the dataset.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A description of the status of the dataset.
     * </p>
     * 
     * @param message
     *        A description of the status of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     * 
     * @param numberOfDocuments
     *        The number of documents in the dataset.
     */

    public void setNumberOfDocuments(Long numberOfDocuments) {
        this.numberOfDocuments = numberOfDocuments;
    }

    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     * 
     * @return The number of documents in the dataset.
     */

    public Long getNumberOfDocuments() {
        return this.numberOfDocuments;
    }

    /**
     * <p>
     * The number of documents in the dataset.
     * </p>
     * 
     * @param numberOfDocuments
     *        The number of documents in the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetProperties withNumberOfDocuments(Long numberOfDocuments) {
        setNumberOfDocuments(numberOfDocuments);
        return this;
    }

    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the dataset.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     * 
     * @return Creation time of the dataset.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Creation time of the dataset.
     * </p>
     * 
     * @param creationTime
     *        Creation time of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetProperties withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     * 
     * @param endTime
     *        Time when the data from the dataset becomes available in the data lake.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     * 
     * @return Time when the data from the dataset becomes available in the data lake.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Time when the data from the dataset becomes available in the data lake.
     * </p>
     * 
     * @param endTime
     *        Time when the data from the dataset becomes available in the data lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetProperties withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getDatasetS3Uri() != null)
            sb.append("DatasetS3Uri: ").append(getDatasetS3Uri()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getNumberOfDocuments() != null)
            sb.append("NumberOfDocuments: ").append(getNumberOfDocuments()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetProperties == false)
            return false;
        DatasetProperties other = (DatasetProperties) obj;
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
        if (other.getDatasetS3Uri() == null ^ this.getDatasetS3Uri() == null)
            return false;
        if (other.getDatasetS3Uri() != null && other.getDatasetS3Uri().equals(this.getDatasetS3Uri()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getNumberOfDocuments() == null ^ this.getNumberOfDocuments() == null)
            return false;
        if (other.getNumberOfDocuments() != null && other.getNumberOfDocuments().equals(this.getNumberOfDocuments()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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
        hashCode = prime * hashCode + ((getDatasetS3Uri() == null) ? 0 : getDatasetS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDocuments() == null) ? 0 : getNumberOfDocuments().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public DatasetProperties clone() {
        try {
            return (DatasetProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DatasetPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
