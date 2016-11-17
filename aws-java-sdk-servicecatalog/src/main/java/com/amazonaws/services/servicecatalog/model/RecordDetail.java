/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The full details of a specific ProvisionedProduct object.
 * </p>
 */
public class RecordDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the ProvisionedProduct object record.
     * </p>
     */
    private String recordId;
    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     */
    private String provisionedProductName;
    /**
     * <p>
     * The status of the ProvisionedProduct object.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time when the record for the ProvisionedProduct object was last updated.
     * </p>
     */
    private java.util.Date updatedTime;
    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     */
    private String provisionedProductType;
    /**
     * <p>
     * The record type for this record.
     * </p>
     */
    private String recordType;
    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     */
    private String provisionedProductId;
    /**
     * <p>
     * The product identifier.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     */
    private String provisioningArtifactId;
    /**
     * <p>
     * The identifier of the path for this product's provisioning.
     * </p>
     */
    private String pathId;
    /**
     * <p>
     * A list of errors that occurred while processing the request.
     * </p>
     */
    private java.util.List<RecordError> recordErrors;
    /**
     * <p>
     * List of tags associated with this record.
     * </p>
     */
    private java.util.List<RecordTag> recordTags;

    /**
     * <p>
     * The identifier of the ProvisionedProduct object record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the ProvisionedProduct object record.
     */

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object record.
     * </p>
     * 
     * @return The identifier of the ProvisionedProduct object record.
     */

    public String getRecordId() {
        return this.recordId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object record.
     * </p>
     * 
     * @param recordId
     *        The identifier of the ProvisionedProduct object record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordId(String recordId) {
        setRecordId(recordId);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     * 
     * @param provisionedProductName
     *        The user-friendly name of the ProvisionedProduct object.
     */

    public void setProvisionedProductName(String provisionedProductName) {
        this.provisionedProductName = provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     * 
     * @return The user-friendly name of the ProvisionedProduct object.
     */

    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * <p>
     * The user-friendly name of the ProvisionedProduct object.
     * </p>
     * 
     * @param provisionedProductName
     *        The user-friendly name of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisionedProductName(String provisionedProductName) {
        setProvisionedProductName(provisionedProductName);
        return this;
    }

    /**
     * <p>
     * The status of the ProvisionedProduct object.
     * </p>
     * 
     * @param status
     *        The status of the ProvisionedProduct object.
     * @see RecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the ProvisionedProduct object.
     * </p>
     * 
     * @return The status of the ProvisionedProduct object.
     * @see RecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the ProvisionedProduct object.
     * </p>
     * 
     * @param status
     *        The status of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public RecordDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the ProvisionedProduct object.
     * </p>
     * 
     * @param status
     *        The status of the ProvisionedProduct object.
     * @see RecordStatus
     */

    public void setStatus(RecordStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the ProvisionedProduct object.
     * </p>
     * 
     * @param status
     *        The status of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordStatus
     */

    public RecordDetail withStatus(RecordStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @return The UTC timestamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time when the record for the ProvisionedProduct object was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the record for the ProvisionedProduct object was last updated.
     */

    public void setUpdatedTime(java.util.Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The time when the record for the ProvisionedProduct object was last updated.
     * </p>
     * 
     * @return The time when the record for the ProvisionedProduct object was last updated.
     */

    public java.util.Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The time when the record for the ProvisionedProduct object was last updated.
     * </p>
     * 
     * @param updatedTime
     *        The time when the record for the ProvisionedProduct object was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withUpdatedTime(java.util.Date updatedTime) {
        setUpdatedTime(updatedTime);
        return this;
    }

    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     * 
     * @param provisionedProductType
     *        The type of the ProvisionedProduct object.
     */

    public void setProvisionedProductType(String provisionedProductType) {
        this.provisionedProductType = provisionedProductType;
    }

    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     * 
     * @return The type of the ProvisionedProduct object.
     */

    public String getProvisionedProductType() {
        return this.provisionedProductType;
    }

    /**
     * <p>
     * The type of the ProvisionedProduct object.
     * </p>
     * 
     * @param provisionedProductType
     *        The type of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisionedProductType(String provisionedProductType) {
        setProvisionedProductType(provisionedProductType);
        return this;
    }

    /**
     * <p>
     * The record type for this record.
     * </p>
     * 
     * @param recordType
     *        The record type for this record.
     */

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * <p>
     * The record type for this record.
     * </p>
     * 
     * @return The record type for this record.
     */

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * <p>
     * The record type for this record.
     * </p>
     * 
     * @param recordType
     *        The record type for this record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordType(String recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the ProvisionedProduct object.
     */

    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @return The identifier of the ProvisionedProduct object.
     */

    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * <p>
     * The identifier of the ProvisionedProduct object.
     * </p>
     * 
     * @param provisionedProductId
     *        The identifier of the ProvisionedProduct object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisionedProductId(String provisionedProductId) {
        setProvisionedProductId(provisionedProductId);
        return this;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @return The product identifier.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier.
     * </p>
     * 
     * @param productId
     *        The product identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     */

    public void setProvisioningArtifactId(String provisioningArtifactId) {
        this.provisioningArtifactId = provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @return The provisioning artifact identifier for this product.
     */

    public String getProvisioningArtifactId() {
        return this.provisioningArtifactId;
    }

    /**
     * <p>
     * The provisioning artifact identifier for this product.
     * </p>
     * 
     * @param provisioningArtifactId
     *        The provisioning artifact identifier for this product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withProvisioningArtifactId(String provisioningArtifactId) {
        setProvisioningArtifactId(provisioningArtifactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path for this product's provisioning.
     */

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning.
     * </p>
     * 
     * @return The identifier of the path for this product's provisioning.
     */

    public String getPathId() {
        return this.pathId;
    }

    /**
     * <p>
     * The identifier of the path for this product's provisioning.
     * </p>
     * 
     * @param pathId
     *        The identifier of the path for this product's provisioning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withPathId(String pathId) {
        setPathId(pathId);
        return this;
    }

    /**
     * <p>
     * A list of errors that occurred while processing the request.
     * </p>
     * 
     * @return A list of errors that occurred while processing the request.
     */

    public java.util.List<RecordError> getRecordErrors() {
        return recordErrors;
    }

    /**
     * <p>
     * A list of errors that occurred while processing the request.
     * </p>
     * 
     * @param recordErrors
     *        A list of errors that occurred while processing the request.
     */

    public void setRecordErrors(java.util.Collection<RecordError> recordErrors) {
        if (recordErrors == null) {
            this.recordErrors = null;
            return;
        }

        this.recordErrors = new java.util.ArrayList<RecordError>(recordErrors);
    }

    /**
     * <p>
     * A list of errors that occurred while processing the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordErrors(java.util.Collection)} or {@link #withRecordErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recordErrors
     *        A list of errors that occurred while processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordErrors(RecordError... recordErrors) {
        if (this.recordErrors == null) {
            setRecordErrors(new java.util.ArrayList<RecordError>(recordErrors.length));
        }
        for (RecordError ele : recordErrors) {
            this.recordErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors that occurred while processing the request.
     * </p>
     * 
     * @param recordErrors
     *        A list of errors that occurred while processing the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordErrors(java.util.Collection<RecordError> recordErrors) {
        setRecordErrors(recordErrors);
        return this;
    }

    /**
     * <p>
     * List of tags associated with this record.
     * </p>
     * 
     * @return List of tags associated with this record.
     */

    public java.util.List<RecordTag> getRecordTags() {
        return recordTags;
    }

    /**
     * <p>
     * List of tags associated with this record.
     * </p>
     * 
     * @param recordTags
     *        List of tags associated with this record.
     */

    public void setRecordTags(java.util.Collection<RecordTag> recordTags) {
        if (recordTags == null) {
            this.recordTags = null;
            return;
        }

        this.recordTags = new java.util.ArrayList<RecordTag>(recordTags);
    }

    /**
     * <p>
     * List of tags associated with this record.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordTags(java.util.Collection)} or {@link #withRecordTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recordTags
     *        List of tags associated with this record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordTags(RecordTag... recordTags) {
        if (this.recordTags == null) {
            setRecordTags(new java.util.ArrayList<RecordTag>(recordTags.length));
        }
        for (RecordTag ele : recordTags) {
            this.recordTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of tags associated with this record.
     * </p>
     * 
     * @param recordTags
     *        List of tags associated with this record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordDetail withRecordTags(java.util.Collection<RecordTag> recordTags) {
        setRecordTags(recordTags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecordId() != null)
            sb.append("RecordId: " + getRecordId() + ",");
        if (getProvisionedProductName() != null)
            sb.append("ProvisionedProductName: " + getProvisionedProductName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: " + getUpdatedTime() + ",");
        if (getProvisionedProductType() != null)
            sb.append("ProvisionedProductType: " + getProvisionedProductType() + ",");
        if (getRecordType() != null)
            sb.append("RecordType: " + getRecordType() + ",");
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getProvisioningArtifactId() != null)
            sb.append("ProvisioningArtifactId: " + getProvisioningArtifactId() + ",");
        if (getPathId() != null)
            sb.append("PathId: " + getPathId() + ",");
        if (getRecordErrors() != null)
            sb.append("RecordErrors: " + getRecordErrors() + ",");
        if (getRecordTags() != null)
            sb.append("RecordTags: " + getRecordTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordDetail == false)
            return false;
        RecordDetail other = (RecordDetail) obj;
        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
            return false;
        if (other.getProvisionedProductName() == null ^ this.getProvisionedProductName() == null)
            return false;
        if (other.getProvisionedProductName() != null && other.getProvisionedProductName().equals(this.getProvisionedProductName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        if (other.getProvisionedProductType() == null ^ this.getProvisionedProductType() == null)
            return false;
        if (other.getProvisionedProductType() != null && other.getProvisionedProductType().equals(this.getProvisionedProductType()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProvisioningArtifactId() == null ^ this.getProvisioningArtifactId() == null)
            return false;
        if (other.getProvisioningArtifactId() != null && other.getProvisioningArtifactId().equals(this.getProvisioningArtifactId()) == false)
            return false;
        if (other.getPathId() == null ^ this.getPathId() == null)
            return false;
        if (other.getPathId() != null && other.getPathId().equals(this.getPathId()) == false)
            return false;
        if (other.getRecordErrors() == null ^ this.getRecordErrors() == null)
            return false;
        if (other.getRecordErrors() != null && other.getRecordErrors().equals(this.getRecordErrors()) == false)
            return false;
        if (other.getRecordTags() == null ^ this.getRecordTags() == null)
            return false;
        if (other.getRecordTags() != null && other.getRecordTags().equals(this.getRecordTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductName() == null) ? 0 : getProvisionedProductName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductType() == null) ? 0 : getProvisionedProductType().hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProvisioningArtifactId() == null) ? 0 : getProvisioningArtifactId().hashCode());
        hashCode = prime * hashCode + ((getPathId() == null) ? 0 : getPathId().hashCode());
        hashCode = prime * hashCode + ((getRecordErrors() == null) ? 0 : getRecordErrors().hashCode());
        hashCode = prime * hashCode + ((getRecordTags() == null) ? 0 : getRecordTags().hashCode());
        return hashCode;
    }

    @Override
    public RecordDetail clone() {
        try {
            return (RecordDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
