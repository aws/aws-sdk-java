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
 * Usage information for the identity.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/IdentityUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityId;
    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityPoolId;
    /** Date on which the identity was last modified. */
    private java.util.Date lastModifiedDate;
    /** Number of datasets for the identity. */
    private Integer datasetCount;
    /** Total data storage for this identity. */
    private Long dataStorage;

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityUsage withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

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

    public IdentityUsage withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * Date on which the identity was last modified.
     * 
     * @param lastModifiedDate
     *        Date on which the identity was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Date on which the identity was last modified.
     * 
     * @return Date on which the identity was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Date on which the identity was last modified.
     * 
     * @param lastModifiedDate
     *        Date on which the identity was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityUsage withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * Number of datasets for the identity.
     * 
     * @param datasetCount
     *        Number of datasets for the identity.
     */

    public void setDatasetCount(Integer datasetCount) {
        this.datasetCount = datasetCount;
    }

    /**
     * Number of datasets for the identity.
     * 
     * @return Number of datasets for the identity.
     */

    public Integer getDatasetCount() {
        return this.datasetCount;
    }

    /**
     * Number of datasets for the identity.
     * 
     * @param datasetCount
     *        Number of datasets for the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityUsage withDatasetCount(Integer datasetCount) {
        setDatasetCount(datasetCount);
        return this;
    }

    /**
     * Total data storage for this identity.
     * 
     * @param dataStorage
     *        Total data storage for this identity.
     */

    public void setDataStorage(Long dataStorage) {
        this.dataStorage = dataStorage;
    }

    /**
     * Total data storage for this identity.
     * 
     * @return Total data storage for this identity.
     */

    public Long getDataStorage() {
        return this.dataStorage;
    }

    /**
     * Total data storage for this identity.
     * 
     * @param dataStorage
     *        Total data storage for this identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityUsage withDataStorage(Long dataStorage) {
        setDataStorage(dataStorage);
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
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getDatasetCount() != null)
            sb.append("DatasetCount: ").append(getDatasetCount()).append(",");
        if (getDataStorage() != null)
            sb.append("DataStorage: ").append(getDataStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityUsage == false)
            return false;
        IdentityUsage other = (IdentityUsage) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getDatasetCount() == null ^ this.getDatasetCount() == null)
            return false;
        if (other.getDatasetCount() != null && other.getDatasetCount().equals(this.getDatasetCount()) == false)
            return false;
        if (other.getDataStorage() == null ^ this.getDataStorage() == null)
            return false;
        if (other.getDataStorage() != null && other.getDataStorage().equals(this.getDataStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getDatasetCount() == null) ? 0 : getDatasetCount().hashCode());
        hashCode = prime * hashCode + ((getDataStorage() == null) ? 0 : getDataStorage().hashCode());
        return hashCode;
    }

    @Override
    public IdentityUsage clone() {
        try {
            return (IdentityUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitosync.model.transform.IdentityUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
