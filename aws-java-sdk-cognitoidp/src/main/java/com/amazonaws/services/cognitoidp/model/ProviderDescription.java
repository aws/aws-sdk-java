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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for identity provider details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ProviderDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProviderDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identity provider name.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The identity provider type.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param providerName
     *        The identity provider name.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @return The identity provider name.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The identity provider name.
     * </p>
     * 
     * @param providerName
     *        The identity provider name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderDescription withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @see IdentityProviderTypeType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @return The identity provider type.
     * @see IdentityProviderTypeType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderTypeType
     */

    public ProviderDescription withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @see IdentityProviderTypeType
     */

    public void setProviderType(IdentityProviderTypeType providerType) {
        withProviderType(providerType);
    }

    /**
     * <p>
     * The identity provider type.
     * </p>
     * 
     * @param providerType
     *        The identity provider type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderTypeType
     */

    public ProviderDescription withProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the provider was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     * 
     * @return The date the provider was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the provider was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the provider was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     * 
     * @param creationDate
     *        The date the provider was added to the user pool.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     * 
     * @return The date the provider was added to the user pool.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the provider was added to the user pool.
     * </p>
     * 
     * @param creationDate
     *        The date the provider was added to the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderDescription withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProviderDescription == false)
            return false;
        ProviderDescription other = (ProviderDescription) obj;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public ProviderDescription clone() {
        try {
            return (ProviderDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.ProviderDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
