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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a partner integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/PartnerIntegrationInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartnerIntegrationInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database that receives data from a partner.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the partner.
     * </p>
     */
    private String partnerName;
    /**
     * <p>
     * The partner integration status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message provided by the partner.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The date (UTC) that the partner integration was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date (UTC) that the partner integration status was last updated by the partner.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The name of the database that receives data from a partner.
     * </p>
     * 
     * @param databaseName
     *        The name of the database that receives data from a partner.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database that receives data from a partner.
     * </p>
     * 
     * @return The name of the database that receives data from a partner.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database that receives data from a partner.
     * </p>
     * 
     * @param databaseName
     *        The name of the database that receives data from a partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerIntegrationInfo withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the partner.
     * </p>
     * 
     * @param partnerName
     *        The name of the partner.
     */

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * <p>
     * The name of the partner.
     * </p>
     * 
     * @return The name of the partner.
     */

    public String getPartnerName() {
        return this.partnerName;
    }

    /**
     * <p>
     * The name of the partner.
     * </p>
     * 
     * @param partnerName
     *        The name of the partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerIntegrationInfo withPartnerName(String partnerName) {
        setPartnerName(partnerName);
        return this;
    }

    /**
     * <p>
     * The partner integration status.
     * </p>
     * 
     * @param status
     *        The partner integration status.
     * @see PartnerIntegrationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The partner integration status.
     * </p>
     * 
     * @return The partner integration status.
     * @see PartnerIntegrationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The partner integration status.
     * </p>
     * 
     * @param status
     *        The partner integration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartnerIntegrationStatus
     */

    public PartnerIntegrationInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The partner integration status.
     * </p>
     * 
     * @param status
     *        The partner integration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartnerIntegrationStatus
     */

    public PartnerIntegrationInfo withStatus(PartnerIntegrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message provided by the partner.
     * </p>
     * 
     * @param statusMessage
     *        The status message provided by the partner.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message provided by the partner.
     * </p>
     * 
     * @return The status message provided by the partner.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message provided by the partner.
     * </p>
     * 
     * @param statusMessage
     *        The status message provided by the partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerIntegrationInfo withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The date (UTC) that the partner integration was created.
     * </p>
     * 
     * @param createdAt
     *        The date (UTC) that the partner integration was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date (UTC) that the partner integration was created.
     * </p>
     * 
     * @return The date (UTC) that the partner integration was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date (UTC) that the partner integration was created.
     * </p>
     * 
     * @param createdAt
     *        The date (UTC) that the partner integration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerIntegrationInfo withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date (UTC) that the partner integration status was last updated by the partner.
     * </p>
     * 
     * @param updatedAt
     *        The date (UTC) that the partner integration status was last updated by the partner.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date (UTC) that the partner integration status was last updated by the partner.
     * </p>
     * 
     * @return The date (UTC) that the partner integration status was last updated by the partner.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date (UTC) that the partner integration status was last updated by the partner.
     * </p>
     * 
     * @param updatedAt
     *        The date (UTC) that the partner integration status was last updated by the partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartnerIntegrationInfo withUpdatedAt(java.util.Date updatedAt) {
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getPartnerName() != null)
            sb.append("PartnerName: ").append(getPartnerName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
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

        if (obj instanceof PartnerIntegrationInfo == false)
            return false;
        PartnerIntegrationInfo other = (PartnerIntegrationInfo) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getPartnerName() == null ^ this.getPartnerName() == null)
            return false;
        if (other.getPartnerName() != null && other.getPartnerName().equals(this.getPartnerName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getPartnerName() == null) ? 0 : getPartnerName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public PartnerIntegrationInfo clone() {
        try {
            return (PartnerIntegrationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
