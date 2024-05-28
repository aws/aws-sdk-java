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
 * A data source in an Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Q Business data source.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The identifier of the Amazon Q Business data source.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The type of the Amazon Q Business data source.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The status of the Amazon Q Business data source.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the Amazon Q Business data source.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business data source.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business data source.
     * </p>
     * 
     * @return The name of the Amazon Q Business data source.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business data source.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business data source.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the Amazon Q Business data source.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business data source.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business data source.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business data source.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the Amazon Q Business data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The type of the Amazon Q Business data source.
     * </p>
     * 
     * @param type
     *        The type of the Amazon Q Business data source.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the Amazon Q Business data source.
     * </p>
     * 
     * @return The type of the Amazon Q Business data source.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the Amazon Q Business data source.
     * </p>
     * 
     * @param type
     *        The type of the Amazon Q Business data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business data source was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was created.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business data source was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business data source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business data source was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business data source was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business data source was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business data source was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Q Business data source.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business data source.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon Q Business data source.
     * </p>
     * 
     * @return The status of the Amazon Q Business data source.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon Q Business data source.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Q Business data source.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSource withStatus(DataSourceStatus status) {
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
