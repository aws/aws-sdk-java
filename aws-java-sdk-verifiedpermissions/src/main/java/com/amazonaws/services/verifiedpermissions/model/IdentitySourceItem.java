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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines an identity source.
 * </p>
 * <p>
 * This data type is a response parameter to the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_ListIdentitySources.html"
 * >ListIdentitySources</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IdentitySourceItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentitySourceItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the identity source was originally created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * A structure that contains the details of the associated identity provider (IdP).
     * </p>
     */
    @Deprecated
    private IdentitySourceItemDetails details;
    /**
     * <p>
     * The unique identifier of the identity source.
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
     * The identifier of the policy store that contains the identity source.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * The Cedar entity type of the principals returned from the IdP associated with this identity source.
     * </p>
     */
    private String principalEntityType;
    /**
     * <p>
     * Contains configuration information about an identity source.
     * </p>
     */
    private ConfigurationItem configuration;

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

    public IdentitySourceItem withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * A structure that contains the details of the associated identity provider (IdP).
     * </p>
     * 
     * @param details
     *        A structure that contains the details of the associated identity provider (IdP).
     */
    @Deprecated
    public void setDetails(IdentitySourceItemDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * A structure that contains the details of the associated identity provider (IdP).
     * </p>
     * 
     * @return A structure that contains the details of the associated identity provider (IdP).
     */
    @Deprecated
    public IdentitySourceItemDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * A structure that contains the details of the associated identity provider (IdP).
     * </p>
     * 
     * @param details
     *        A structure that contains the details of the associated identity provider (IdP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public IdentitySourceItem withDetails(IdentitySourceItemDetails details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the identity source.
     * </p>
     * 
     * @param identitySourceId
     *        The unique identifier of the identity source.
     */

    public void setIdentitySourceId(String identitySourceId) {
        this.identitySourceId = identitySourceId;
    }

    /**
     * <p>
     * The unique identifier of the identity source.
     * </p>
     * 
     * @return The unique identifier of the identity source.
     */

    public String getIdentitySourceId() {
        return this.identitySourceId;
    }

    /**
     * <p>
     * The unique identifier of the identity source.
     * </p>
     * 
     * @param identitySourceId
     *        The unique identifier of the identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentitySourceItem withIdentitySourceId(String identitySourceId) {
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

    public IdentitySourceItem withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The identifier of the policy store that contains the identity source.
     * </p>
     * 
     * @param policyStoreId
     *        The identifier of the policy store that contains the identity source.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * The identifier of the policy store that contains the identity source.
     * </p>
     * 
     * @return The identifier of the policy store that contains the identity source.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * The identifier of the policy store that contains the identity source.
     * </p>
     * 
     * @param policyStoreId
     *        The identifier of the policy store that contains the identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentitySourceItem withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * The Cedar entity type of the principals returned from the IdP associated with this identity source.
     * </p>
     * 
     * @param principalEntityType
     *        The Cedar entity type of the principals returned from the IdP associated with this identity source.
     */

    public void setPrincipalEntityType(String principalEntityType) {
        this.principalEntityType = principalEntityType;
    }

    /**
     * <p>
     * The Cedar entity type of the principals returned from the IdP associated with this identity source.
     * </p>
     * 
     * @return The Cedar entity type of the principals returned from the IdP associated with this identity source.
     */

    public String getPrincipalEntityType() {
        return this.principalEntityType;
    }

    /**
     * <p>
     * The Cedar entity type of the principals returned from the IdP associated with this identity source.
     * </p>
     * 
     * @param principalEntityType
     *        The Cedar entity type of the principals returned from the IdP associated with this identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentitySourceItem withPrincipalEntityType(String principalEntityType) {
        setPrincipalEntityType(principalEntityType);
        return this;
    }

    /**
     * <p>
     * Contains configuration information about an identity source.
     * </p>
     * 
     * @param configuration
     *        Contains configuration information about an identity source.
     */

    public void setConfiguration(ConfigurationItem configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Contains configuration information about an identity source.
     * </p>
     * 
     * @return Contains configuration information about an identity source.
     */

    public ConfigurationItem getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Contains configuration information about an identity source.
     * </p>
     * 
     * @param configuration
     *        Contains configuration information about an identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentitySourceItem withConfiguration(ConfigurationItem configuration) {
        setConfiguration(configuration);
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getIdentitySourceId() != null)
            sb.append("IdentitySourceId: ").append(getIdentitySourceId()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getPrincipalEntityType() != null)
            sb.append("PrincipalEntityType: ").append("***Sensitive Data Redacted***").append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentitySourceItem == false)
            return false;
        IdentitySourceItem other = (IdentitySourceItem) obj;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
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
        if (other.getPrincipalEntityType() == null ^ this.getPrincipalEntityType() == null)
            return false;
        if (other.getPrincipalEntityType() != null && other.getPrincipalEntityType().equals(this.getPrincipalEntityType()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getIdentitySourceId() == null) ? 0 : getIdentitySourceId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalEntityType() == null) ? 0 : getPrincipalEntityType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public IdentitySourceItem clone() {
        try {
            return (IdentitySourceItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.IdentitySourceItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
