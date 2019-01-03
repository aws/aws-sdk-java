/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Resource Data Sync configuration, including its current status and last successful sync.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ResourceDataSyncItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     */
    private String syncName;
    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     */
    private ResourceDataSyncS3Destination s3Destination;
    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     */
    private java.util.Date lastSyncTime;
    /**
     * <p>
     * The last time the sync operations returned a status of <code>SUCCESSFUL</code> (UTC).
     * </p>
     */
    private java.util.Date lastSuccessfulSyncTime;
    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     */
    private String lastStatus;
    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     */
    private java.util.Date syncCreatedTime;
    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     */
    private String lastSyncStatusMessage;

    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     * 
     * @param syncName
     *        The name of the Resource Data Sync.
     */

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     * 
     * @return The name of the Resource Data Sync.
     */

    public String getSyncName() {
        return this.syncName;
    }

    /**
     * <p>
     * The name of the Resource Data Sync.
     * </p>
     * 
     * @param syncName
     *        The name of the Resource Data Sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncItem withSyncName(String syncName) {
        setSyncName(syncName);
        return this;
    }

    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     * 
     * @param s3Destination
     *        Configuration information for the target Amazon S3 bucket.
     */

    public void setS3Destination(ResourceDataSyncS3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     * 
     * @return Configuration information for the target Amazon S3 bucket.
     */

    public ResourceDataSyncS3Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * <p>
     * Configuration information for the target Amazon S3 bucket.
     * </p>
     * 
     * @param s3Destination
     *        Configuration information for the target Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncItem withS3Destination(ResourceDataSyncS3Destination s3Destination) {
        setS3Destination(s3Destination);
        return this;
    }

    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     * 
     * @param lastSyncTime
     *        The last time the configuration attempted to sync (UTC).
     */

    public void setLastSyncTime(java.util.Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     * 
     * @return The last time the configuration attempted to sync (UTC).
     */

    public java.util.Date getLastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * <p>
     * The last time the configuration attempted to sync (UTC).
     * </p>
     * 
     * @param lastSyncTime
     *        The last time the configuration attempted to sync (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncItem withLastSyncTime(java.util.Date lastSyncTime) {
        setLastSyncTime(lastSyncTime);
        return this;
    }

    /**
     * <p>
     * The last time the sync operations returned a status of <code>SUCCESSFUL</code> (UTC).
     * </p>
     * 
     * @param lastSuccessfulSyncTime
     *        The last time the sync operations returned a status of <code>SUCCESSFUL</code> (UTC).
     */

    public void setLastSuccessfulSyncTime(java.util.Date lastSuccessfulSyncTime) {
        this.lastSuccessfulSyncTime = lastSuccessfulSyncTime;
    }

    /**
     * <p>
     * The last time the sync operations returned a status of <code>SUCCESSFUL</code> (UTC).
     * </p>
     * 
     * @return The last time the sync operations returned a status of <code>SUCCESSFUL</code> (UTC).
     */

    public java.util.Date getLastSuccessfulSyncTime() {
        return this.lastSuccessfulSyncTime;
    }

    /**
     * <p>
     * The last time the sync operations returned a status of <code>SUCCESSFUL</code> (UTC).
     * </p>
     * 
     * @param lastSuccessfulSyncTime
     *        The last time the sync operations returned a status of <code>SUCCESSFUL</code> (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncItem withLastSuccessfulSyncTime(java.util.Date lastSuccessfulSyncTime) {
        setLastSuccessfulSyncTime(lastSuccessfulSyncTime);
        return this;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * 
     * @param lastStatus
     *        The status reported by the last sync.
     * @see LastResourceDataSyncStatus
     */

    public void setLastStatus(String lastStatus) {
        this.lastStatus = lastStatus;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * 
     * @return The status reported by the last sync.
     * @see LastResourceDataSyncStatus
     */

    public String getLastStatus() {
        return this.lastStatus;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * 
     * @param lastStatus
     *        The status reported by the last sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastResourceDataSyncStatus
     */

    public ResourceDataSyncItem withLastStatus(String lastStatus) {
        setLastStatus(lastStatus);
        return this;
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * 
     * @param lastStatus
     *        The status reported by the last sync.
     * @see LastResourceDataSyncStatus
     */

    public void setLastStatus(LastResourceDataSyncStatus lastStatus) {
        withLastStatus(lastStatus);
    }

    /**
     * <p>
     * The status reported by the last sync.
     * </p>
     * 
     * @param lastStatus
     *        The status reported by the last sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastResourceDataSyncStatus
     */

    public ResourceDataSyncItem withLastStatus(LastResourceDataSyncStatus lastStatus) {
        this.lastStatus = lastStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     * 
     * @param syncCreatedTime
     *        The date and time the configuration was created (UTC).
     */

    public void setSyncCreatedTime(java.util.Date syncCreatedTime) {
        this.syncCreatedTime = syncCreatedTime;
    }

    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     * 
     * @return The date and time the configuration was created (UTC).
     */

    public java.util.Date getSyncCreatedTime() {
        return this.syncCreatedTime;
    }

    /**
     * <p>
     * The date and time the configuration was created (UTC).
     * </p>
     * 
     * @param syncCreatedTime
     *        The date and time the configuration was created (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncItem withSyncCreatedTime(java.util.Date syncCreatedTime) {
        setSyncCreatedTime(syncCreatedTime);
        return this;
    }

    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     * 
     * @param lastSyncStatusMessage
     *        The status message details reported by the last sync.
     */

    public void setLastSyncStatusMessage(String lastSyncStatusMessage) {
        this.lastSyncStatusMessage = lastSyncStatusMessage;
    }

    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     * 
     * @return The status message details reported by the last sync.
     */

    public String getLastSyncStatusMessage() {
        return this.lastSyncStatusMessage;
    }

    /**
     * <p>
     * The status message details reported by the last sync.
     * </p>
     * 
     * @param lastSyncStatusMessage
     *        The status message details reported by the last sync.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDataSyncItem withLastSyncStatusMessage(String lastSyncStatusMessage) {
        setLastSyncStatusMessage(lastSyncStatusMessage);
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
        if (getSyncName() != null)
            sb.append("SyncName: ").append(getSyncName()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination()).append(",");
        if (getLastSyncTime() != null)
            sb.append("LastSyncTime: ").append(getLastSyncTime()).append(",");
        if (getLastSuccessfulSyncTime() != null)
            sb.append("LastSuccessfulSyncTime: ").append(getLastSuccessfulSyncTime()).append(",");
        if (getLastStatus() != null)
            sb.append("LastStatus: ").append(getLastStatus()).append(",");
        if (getSyncCreatedTime() != null)
            sb.append("SyncCreatedTime: ").append(getSyncCreatedTime()).append(",");
        if (getLastSyncStatusMessage() != null)
            sb.append("LastSyncStatusMessage: ").append(getLastSyncStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDataSyncItem == false)
            return false;
        ResourceDataSyncItem other = (ResourceDataSyncItem) obj;
        if (other.getSyncName() == null ^ this.getSyncName() == null)
            return false;
        if (other.getSyncName() != null && other.getSyncName().equals(this.getSyncName()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        if (other.getLastSyncTime() == null ^ this.getLastSyncTime() == null)
            return false;
        if (other.getLastSyncTime() != null && other.getLastSyncTime().equals(this.getLastSyncTime()) == false)
            return false;
        if (other.getLastSuccessfulSyncTime() == null ^ this.getLastSuccessfulSyncTime() == null)
            return false;
        if (other.getLastSuccessfulSyncTime() != null && other.getLastSuccessfulSyncTime().equals(this.getLastSuccessfulSyncTime()) == false)
            return false;
        if (other.getLastStatus() == null ^ this.getLastStatus() == null)
            return false;
        if (other.getLastStatus() != null && other.getLastStatus().equals(this.getLastStatus()) == false)
            return false;
        if (other.getSyncCreatedTime() == null ^ this.getSyncCreatedTime() == null)
            return false;
        if (other.getSyncCreatedTime() != null && other.getSyncCreatedTime().equals(this.getSyncCreatedTime()) == false)
            return false;
        if (other.getLastSyncStatusMessage() == null ^ this.getLastSyncStatusMessage() == null)
            return false;
        if (other.getLastSyncStatusMessage() != null && other.getLastSyncStatusMessage().equals(this.getLastSyncStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSyncName() == null) ? 0 : getSyncName().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        hashCode = prime * hashCode + ((getLastSyncTime() == null) ? 0 : getLastSyncTime().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulSyncTime() == null) ? 0 : getLastSuccessfulSyncTime().hashCode());
        hashCode = prime * hashCode + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        hashCode = prime * hashCode + ((getSyncCreatedTime() == null) ? 0 : getSyncCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastSyncStatusMessage() == null) ? 0 : getLastSyncStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDataSyncItem clone() {
        try {
            return (ResourceDataSyncItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ResourceDataSyncItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
