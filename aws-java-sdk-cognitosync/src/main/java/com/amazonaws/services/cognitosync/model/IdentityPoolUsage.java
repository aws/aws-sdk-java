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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Usage information for the identity pool.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/IdentityPoolUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityPoolUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityPoolId;
    /** Number of sync sessions for the identity pool. */
    private Long syncSessionsCount;
    /** Data storage information for the identity pool. */
    private Long dataStorage;
    /** Date on which the identity pool was last modified. */
    private java.util.Date lastModifiedDate;

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityPoolUsage withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * Number of sync sessions for the identity pool.
     * 
     * @param syncSessionsCount
     *        Number of sync sessions for the identity pool.
     */

    public void setSyncSessionsCount(Long syncSessionsCount) {
        this.syncSessionsCount = syncSessionsCount;
    }

    /**
     * Number of sync sessions for the identity pool.
     * 
     * @return Number of sync sessions for the identity pool.
     */

    public Long getSyncSessionsCount() {
        return this.syncSessionsCount;
    }

    /**
     * Number of sync sessions for the identity pool.
     * 
     * @param syncSessionsCount
     *        Number of sync sessions for the identity pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityPoolUsage withSyncSessionsCount(Long syncSessionsCount) {
        setSyncSessionsCount(syncSessionsCount);
        return this;
    }

    /**
     * Data storage information for the identity pool.
     * 
     * @param dataStorage
     *        Data storage information for the identity pool.
     */

    public void setDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
    }

    /**
     * Data storage information for the identity pool.
     * 
     * @return Data storage information for the identity pool.
     */

    public Long getDataStorage() {
        return this.dataStorage;
    }

    /**
     * Data storage information for the identity pool.
     * 
     * @param dataStorage
     *        Data storage information for the identity pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityPoolUsage withDataStorage(Long dataStorage) {
        setDataStorage(dataStorage);
        return this;
    }

    /**
     * Date on which the identity pool was last modified.
     * 
     * @param lastModifiedDate
     *        Date on which the identity pool was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Date on which the identity pool was last modified.
     * 
     * @return Date on which the identity pool was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Date on which the identity pool was last modified.
     * 
     * @param lastModifiedDate
     *        Date on which the identity pool was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityPoolUsage withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getSyncSessionsCount() != null)
            sb.append("SyncSessionsCount: ").append(getSyncSessionsCount()).append(",");
        if (getDataStorage() != null)
            sb.append("DataStorage: ").append(getDataStorage()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityPoolUsage == false)
            return false;
        IdentityPoolUsage other = (IdentityPoolUsage) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getSyncSessionsCount() == null ^ this.getSyncSessionsCount() == null)
            return false;
        if (other.getSyncSessionsCount() != null && other.getSyncSessionsCount().equals(this.getSyncSessionsCount()) == false)
            return false;
        if (other.getDataStorage() == null ^ this.getDataStorage() == null)
            return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getSyncSessionsCount() == null) ? 0 : getSyncSessionsCount().hashCode());
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public IdentityPoolUsage clone() {
        try {
            return (IdentityPoolUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitosync.model.transform.IdentityPoolUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
