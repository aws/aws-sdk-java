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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of summaries of data stores.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DatastoreSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastoreSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The data store name.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * The data store status.
     * </p>
     */
    private String datastoreStatus;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data store.
     * </p>
     */
    private String datastoreArn;
    /**
     * <p>
     * The timestamp when the data store was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp when the data store was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The data store name.
     * </p>
     * 
     * @param datastoreName
     *        The data store name.
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * The data store name.
     * </p>
     * 
     * @return The data store name.
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * The data store name.
     * </p>
     * 
     * @param datastoreName
     *        The data store name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @see DatastoreStatus
     */

    public void setDatastoreStatus(String datastoreStatus) {
        this.datastoreStatus = datastoreStatus;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @return The data store status.
     * @see DatastoreStatus
     */

    public String getDatastoreStatus() {
        return this.datastoreStatus;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreSummary withDatastoreStatus(String datastoreStatus) {
        setDatastoreStatus(datastoreStatus);
        return this;
    }

    /**
     * <p>
     * The data store status.
     * </p>
     * 
     * @param datastoreStatus
     *        The data store status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public DatastoreSummary withDatastoreStatus(DatastoreStatus datastoreStatus) {
        this.datastoreStatus = datastoreStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data store.
     * </p>
     * 
     * @param datastoreArn
     *        The Amazon Resource Name (ARN) for the data store.
     */

    public void setDatastoreArn(String datastoreArn) {
        this.datastoreArn = datastoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the data store.
     */

    public String getDatastoreArn() {
        return this.datastoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the data store.
     * </p>
     * 
     * @param datastoreArn
     *        The Amazon Resource Name (ARN) for the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withDatastoreArn(String datastoreArn) {
        setDatastoreArn(datastoreArn);
        return this;
    }

    /**
     * <p>
     * The timestamp when the data store was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the data store was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the data store was created.
     * </p>
     * 
     * @return The timestamp when the data store was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the data store was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the data store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when the data store was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the data store was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp when the data store was last updated.
     * </p>
     * 
     * @return The timestamp when the data store was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp when the data store was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the data store was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getDatastoreName() != null)
            sb.append("DatastoreName: ").append(getDatastoreName()).append(",");
        if (getDatastoreStatus() != null)
            sb.append("DatastoreStatus: ").append(getDatastoreStatus()).append(",");
        if (getDatastoreArn() != null)
            sb.append("DatastoreArn: ").append(getDatastoreArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastoreSummary == false)
            return false;
        DatastoreSummary other = (DatastoreSummary) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getDatastoreStatus() == null ^ this.getDatastoreStatus() == null)
            return false;
        if (other.getDatastoreStatus() != null && other.getDatastoreStatus().equals(this.getDatastoreStatus()) == false)
            return false;
        if (other.getDatastoreArn() == null ^ this.getDatastoreArn() == null)
            return false;
        if (other.getDatastoreArn() != null && other.getDatastoreArn().equals(this.getDatastoreArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getDatastoreStatus() == null) ? 0 : getDatastoreStatus().hashCode());
        hashCode = prime * hashCode + ((getDatastoreArn() == null) ? 0 : getDatastoreArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DatastoreSummary clone() {
        try {
            return (DatastoreSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medicalimaging.model.transform.DatastoreSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
