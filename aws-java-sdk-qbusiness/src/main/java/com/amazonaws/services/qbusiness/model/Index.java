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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for your Amazon Q Business index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/Index" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Index implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the index.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The identifier for the index.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the index was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param displayName
     *        The name of the index.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @return The name of the index.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param displayName
     *        The name of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Index withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The identifier for the index.
     * </p>
     * 
     * @param indexId
     *        The identifier for the index.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier for the index.
     * </p>
     * 
     * @return The identifier for the index.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier for the index.
     * </p>
     * 
     * @param indexId
     *        The identifier for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Index withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the index was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     * 
     * @return The Unix timestamp when the index was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the index was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Index withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the index was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the index was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the index was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the index was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Index withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * @see IndexStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * </p>
     * 
     * @return The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * @see IndexStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public Index withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the status is <code>ACTIVE</code>, the index is ready.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public Index withStatus(IndexStatus status) {
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
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

        if (obj instanceof Index == false)
            return false;
        Index other = (Index) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
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

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Index clone() {
        try {
            return (Index) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.IndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
