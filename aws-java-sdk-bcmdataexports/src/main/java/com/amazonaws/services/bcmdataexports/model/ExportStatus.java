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
package com.amazonaws.services.bcmdataexports.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the data export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ExportStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the export was last generated.
     * </p>
     */
    private java.util.Date lastRefreshedAt;
    /**
     * <p>
     * The timestamp of when the export was updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The status code for the request.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * The description for the status code.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the export was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     * 
     * @return The timestamp of when the export was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the export was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatus withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export was last generated.
     * </p>
     * 
     * @param lastRefreshedAt
     *        The timestamp of when the export was last generated.
     */

    public void setLastRefreshedAt(java.util.Date lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
    }

    /**
     * <p>
     * The timestamp of when the export was last generated.
     * </p>
     * 
     * @return The timestamp of when the export was last generated.
     */

    public java.util.Date getLastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * <p>
     * The timestamp of when the export was last generated.
     * </p>
     * 
     * @param lastRefreshedAt
     *        The timestamp of when the export was last generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatus withLastRefreshedAt(java.util.Date lastRefreshedAt) {
        setLastRefreshedAt(lastRefreshedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the export was updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the export was updated.
     * </p>
     * 
     * @return The timestamp of when the export was updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the export was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the export was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportStatus withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The status code for the request.
     * </p>
     * 
     * @param statusCode
     *        The status code for the request.
     * @see ExportStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code for the request.
     * </p>
     * 
     * @return The status code for the request.
     * @see ExportStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code for the request.
     * </p>
     * 
     * @param statusCode
     *        The status code for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatusCode
     */

    public ExportStatus withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code for the request.
     * </p>
     * 
     * @param statusCode
     *        The status code for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatusCode
     */

    public ExportStatus withStatusCode(ExportStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * The description for the status code.
     * </p>
     * 
     * @param statusReason
     *        The description for the status code.
     * @see ExecutionStatusReason
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The description for the status code.
     * </p>
     * 
     * @return The description for the status code.
     * @see ExecutionStatusReason
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The description for the status code.
     * </p>
     * 
     * @param statusReason
     *        The description for the status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatusReason
     */

    public ExportStatus withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The description for the status code.
     * </p>
     * 
     * @param statusReason
     *        The description for the status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatusReason
     */

    public ExportStatus withStatusReason(ExecutionStatusReason statusReason) {
        this.statusReason = statusReason.toString();
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastRefreshedAt() != null)
            sb.append("LastRefreshedAt: ").append(getLastRefreshedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportStatus == false)
            return false;
        ExportStatus other = (ExportStatus) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastRefreshedAt() == null ^ this.getLastRefreshedAt() == null)
            return false;
        if (other.getLastRefreshedAt() != null && other.getLastRefreshedAt().equals(this.getLastRefreshedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastRefreshedAt() == null) ? 0 : getLastRefreshedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public ExportStatus clone() {
        try {
            return (ExportStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bcmdataexports.model.transform.ExportStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
