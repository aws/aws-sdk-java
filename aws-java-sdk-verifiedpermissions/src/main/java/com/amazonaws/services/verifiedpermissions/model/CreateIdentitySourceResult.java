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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/CreateIdentitySource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdentitySourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time the identity source was originally created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The unique ID of the new identity source.
     * </p>
     */
    private String identitySourceId;
    /**
     * <p>
     * The date and time the identity source was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * The ID of the policy store that contains the identity source.
     * </p>
     */
    private String policyStoreId;

    /**
     * <p>
     * The date and time the identity source was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time the identity source was originally created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time the identity source was originally created.
     * </p>
     * 
     * @return The date and time the identity source was originally created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time the identity source was originally created.
     * </p>
     * 
     * @param createdDate
     *        The date and time the identity source was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The unique ID of the new identity source.
     * </p>
     * 
     * @param identitySourceId
     *        The unique ID of the new identity source.
     */

    public void setIdentitySourceId(String identitySourceId) {
        this.identitySourceId = identitySourceId;
    }

    /**
     * <p>
     * The unique ID of the new identity source.
     * </p>
     * 
     * @return The unique ID of the new identity source.
     */

    public String getIdentitySourceId() {
        return this.identitySourceId;
    }

    /**
     * <p>
     * The unique ID of the new identity source.
     * </p>
     * 
     * @param identitySourceId
     *        The unique ID of the new identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceResult withIdentitySourceId(String identitySourceId) {
        setIdentitySourceId(identitySourceId);
        return this;
    }

    /**
     * <p>
     * The date and time the identity source was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time the identity source was most recently updated.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time the identity source was most recently updated.
     * </p>
     * 
     * @return The date and time the identity source was most recently updated.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date and time the identity source was most recently updated.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date and time the identity source was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The ID of the policy store that contains the identity source.
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the policy store that contains the identity source.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * The ID of the policy store that contains the identity source.
     * </p>
     * 
     * @return The ID of the policy store that contains the identity source.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * The ID of the policy store that contains the identity source.
     * </p>
     * 
     * @param policyStoreId
     *        The ID of the policy store that contains the identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentitySourceResult withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getIdentitySourceId() != null)
            sb.append("IdentitySourceId: ").append(getIdentitySourceId()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentitySourceResult == false)
            return false;
        CreateIdentitySourceResult other = (CreateIdentitySourceResult) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getIdentitySourceId() == null ^ this.getIdentitySourceId() == null)
            return false;
        if (other.getIdentitySourceId() != null && other.getIdentitySourceId().equals(this.getIdentitySourceId()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getIdentitySourceId() == null) ? 0 : getIdentitySourceId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        return hashCode;
    }

    @Override
    public CreateIdentitySourceResult clone() {
        try {
            return (CreateIdentitySourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
