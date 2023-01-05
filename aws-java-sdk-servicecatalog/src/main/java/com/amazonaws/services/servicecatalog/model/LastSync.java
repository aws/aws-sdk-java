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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the product's connection sync and contains the following sub-fields.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>LastSyncTime</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>LastSyncStatus</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>LastSyncStatusMessage</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>LastSuccessfulSyncTime</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>LastSuccessfulSyncProvisioningArtifactID</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/LastSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LastSync implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time of the last attempted sync from the repository to the Service Catalog product.
     * </p>
     */
    private java.util.Date lastSyncTime;
    /**
     * <p>
     * The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     */
    private String lastSyncStatus;
    /**
     * <p>
     * The sync's status message.
     * </p>
     */
    private String lastSyncStatusMessage;
    /**
     * <p>
     * The time of the latest successful sync from the source repo artifact to the Service Catalog product.
     * </p>
     */
    private java.util.Date lastSuccessfulSyncTime;
    /**
     * <p>
     * The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync.
     * </p>
     */
    private String lastSuccessfulSyncProvisioningArtifactId;

    /**
     * <p>
     * The time of the last attempted sync from the repository to the Service Catalog product.
     * </p>
     * 
     * @param lastSyncTime
     *        The time of the last attempted sync from the repository to the Service Catalog product.
     */

    public void setLastSyncTime(java.util.Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    /**
     * <p>
     * The time of the last attempted sync from the repository to the Service Catalog product.
     * </p>
     * 
     * @return The time of the last attempted sync from the repository to the Service Catalog product.
     */

    public java.util.Date getLastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * <p>
     * The time of the last attempted sync from the repository to the Service Catalog product.
     * </p>
     * 
     * @param lastSyncTime
     *        The time of the last attempted sync from the repository to the Service Catalog product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastSync withLastSyncTime(java.util.Date lastSyncTime) {
        setLastSyncTime(lastSyncTime);
        return this;
    }

    /**
     * <p>
     * The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param lastSyncStatus
     *        The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * @see LastSyncStatus
     */

    public void setLastSyncStatus(String lastSyncStatus) {
        this.lastSyncStatus = lastSyncStatus;
    }

    /**
     * <p>
     * The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     * 
     * @return The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * @see LastSyncStatus
     */

    public String getLastSyncStatus() {
        return this.lastSyncStatus;
    }

    /**
     * <p>
     * The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param lastSyncStatus
     *        The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastSyncStatus
     */

    public LastSync withLastSyncStatus(String lastSyncStatus) {
        setLastSyncStatus(lastSyncStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param lastSyncStatus
     *        The current status of the sync. Responses include <code>SUCCEEDED</code> or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastSyncStatus
     */

    public LastSync withLastSyncStatus(LastSyncStatus lastSyncStatus) {
        this.lastSyncStatus = lastSyncStatus.toString();
        return this;
    }

    /**
     * <p>
     * The sync's status message.
     * </p>
     * 
     * @param lastSyncStatusMessage
     *        The sync's status message.
     */

    public void setLastSyncStatusMessage(String lastSyncStatusMessage) {
        this.lastSyncStatusMessage = lastSyncStatusMessage;
    }

    /**
     * <p>
     * The sync's status message.
     * </p>
     * 
     * @return The sync's status message.
     */

    public String getLastSyncStatusMessage() {
        return this.lastSyncStatusMessage;
    }

    /**
     * <p>
     * The sync's status message.
     * </p>
     * 
     * @param lastSyncStatusMessage
     *        The sync's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastSync withLastSyncStatusMessage(String lastSyncStatusMessage) {
        setLastSyncStatusMessage(lastSyncStatusMessage);
        return this;
    }

    /**
     * <p>
     * The time of the latest successful sync from the source repo artifact to the Service Catalog product.
     * </p>
     * 
     * @param lastSuccessfulSyncTime
     *        The time of the latest successful sync from the source repo artifact to the Service Catalog product.
     */

    public void setLastSuccessfulSyncTime(java.util.Date lastSuccessfulSyncTime) {
        this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
    }

    /**
     * <p>
     * The time of the latest successful sync from the source repo artifact to the Service Catalog product.
     * </p>
     * 
     * @return The time of the latest successful sync from the source repo artifact to the Service Catalog product.
     */

    public java.util.Date getLastSuccessfulSyncTime() {
        return this.lastSuccessfulSyncTime;
    }

    /**
     * <p>
     * The time of the latest successful sync from the source repo artifact to the Service Catalog product.
     * </p>
     * 
     * @param lastSuccessfulSyncTime
     *        The time of the latest successful sync from the source repo artifact to the Service Catalog product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastSync withLastSuccessfulSyncTime(java.util.Date lastSuccessfulSyncTime) {
        setLastSuccessfulSyncTime(lastSuccessfulSyncTime);
        return this;
    }

    /**
     * <p>
     * The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync.
     * </p>
     * 
     * @param lastSuccessfulSyncProvisioningArtifactId
     *        The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync.
     */

    public void setLastSuccessfulSyncProvisioningArtifactId(String lastSuccessfulSyncProvisioningArtifactId) {
        this.lastSuccessfulSyncProvisioningArtifactId = lastSuccessfulSyncProvisioningArtifactId;
    }

    /**
     * <p>
     * The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync.
     * </p>
     * 
     * @return The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync.
     */

    public String getLastSuccessfulSyncProvisioningArtifactId() {
        return this.lastSuccessfulSyncProvisioningArtifactId;
    }

    /**
     * <p>
     * The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync.
     * </p>
     * 
     * @param lastSuccessfulSyncProvisioningArtifactId
     *        The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LastSync withLastSuccessfulSyncProvisioningArtifactId(String lastSuccessfulSyncProvisioningArtifactId) {
        setLastSuccessfulSyncProvisioningArtifactId(lastSuccessfulSyncProvisioningArtifactId);
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
        if (getLastSyncTime() != null)
            sb.append("LastSyncTime: ").append(getLastSyncTime()).append(",");
        if (getLastSyncStatus() != null)
            sb.append("LastSyncStatus: ").append(getLastSyncStatus()).append(",");
        if (getLastSyncStatusMessage() != null)
            sb.append("LastSyncStatusMessage: ").append(getLastSyncStatusMessage()).append(",");
        if (getLastSuccessfulSyncTime() != null)
            sb.append("LastSuccessfulSyncTime: ").append(getLastSuccessfulSyncTime()).append(",");
        if (getLastSuccessfulSyncProvisioningArtifactId() != null)
            sb.append("LastSuccessfulSyncProvisioningArtifactId: ").append(getLastSuccessfulSyncProvisioningArtifactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastSync == false)
            return false;
        LastSync other = (LastSync) obj;
        if (other.getLastSyncTime() == null ^ this.getLastSyncTime() == null)
            return false;
        if (other.getLastSyncTime() != null && other.getLastSyncTime().equals(this.getLastSyncTime()) == false)
            return false;
        if (other.getLastSyncStatus() == null ^ this.getLastSyncStatus() == null)
            return false;
        if (other.getLastSyncStatus() != null && other.getLastSyncStatus().equals(this.getLastSyncStatus()) == false)
            return false;
        if (other.getLastSyncStatusMessage() == null ^ this.getLastSyncStatusMessage() == null)
            return false;
        if (other.getLastSyncStatusMessage() != null && other.getLastSyncStatusMessage().equals(this.getLastSyncStatusMessage()) == false)
            return false;
        if (other.getLastSuccessfulSyncTime() == null ^ this.getLastSuccessfulSyncTime() == null)
            return false;
        if (other.getLastSuccessfulSyncTime() != null && other.getLastSuccessfulSyncTime().equals(this.getLastSuccessfulSyncTime()) == false)
            return false;
        if (other.getLastSuccessfulSyncProvisioningArtifactId() == null ^ this.getLastSuccessfulSyncProvisioningArtifactId() == null)
            return false;
        if (other.getLastSuccessfulSyncProvisioningArtifactId() != null
                && other.getLastSuccessfulSyncProvisioningArtifactId().equals(this.getLastSuccessfulSyncProvisioningArtifactId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastSyncTime() == null) ? 0 : getLastSyncTime().hashCode());
        hashCode = prime * hashCode + ((getLastSyncStatus() == null) ? 0 : getLastSyncStatus().hashCode());
        hashCode = prime * hashCode + ((getLastSyncStatusMessage() == null) ? 0 : getLastSyncStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulSyncTime() == null) ? 0 : getLastSuccessfulSyncTime().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulSyncProvisioningArtifactId() == null) ? 0 : getLastSuccessfulSyncProvisioningArtifactId().hashCode());
        return hashCode;
    }

    @Override
    public LastSync clone() {
        try {
            return (LastSync) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.LastSyncMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
