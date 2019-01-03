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
 * A container for information about an identity provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/IdentityProviderType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
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
     * The identity provider details, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     */
    private java.util.Map<String, String> providerDetails;
    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     */
    private java.util.Map<String, String> attributeMapping;
    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     */
    private java.util.List<String> idpIdentifiers;
    /**
     * <p>
     * The date the identity provider was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date the identity provider was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

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

    public IdentityProviderType withProviderName(String providerName) {
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

    public IdentityProviderType withProviderType(String providerType) {
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

    public IdentityProviderType withProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The identity provider details, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     * 
     * @return The identity provider details, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     */

    public java.util.Map<String, String> getProviderDetails() {
        return providerDetails;
    }

    /**
     * <p>
     * The identity provider details, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     * 
     * @param providerDetails
     *        The identity provider details, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     */

    public void setProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
    }

    /**
     * <p>
     * The identity provider details, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * </p>
     * 
     * @param providerDetails
     *        The identity provider details, such as <code>MetadataURL</code> and <code>MetadataFile</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withProviderDetails(java.util.Map<String, String> providerDetails) {
        setProviderDetails(providerDetails);
        return this;
    }

    public IdentityProviderType addProviderDetailsEntry(String key, String value) {
        if (null == this.providerDetails) {
            this.providerDetails = new java.util.HashMap<String, String>();
        }
        if (this.providerDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.providerDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProviderDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType clearProviderDetailsEntries() {
        this.providerDetails = null;
        return this;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @return A mapping of identity provider attributes to standard and custom user pool attributes.
     */

    public java.util.Map<String, String> getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @param attributeMapping
     *        A mapping of identity provider attributes to standard and custom user pool attributes.
     */

    public void setAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    /**
     * <p>
     * A mapping of identity provider attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @param attributeMapping
     *        A mapping of identity provider attributes to standard and custom user pool attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withAttributeMapping(java.util.Map<String, String> attributeMapping) {
        setAttributeMapping(attributeMapping);
        return this;
    }

    public IdentityProviderType addAttributeMappingEntry(String key, String value) {
        if (null == this.attributeMapping) {
            this.attributeMapping = new java.util.HashMap<String, String>();
        }
        if (this.attributeMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributeMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType clearAttributeMappingEntries() {
        this.attributeMapping = null;
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @return A list of identity provider identifiers.
     */

    public java.util.List<String> getIdpIdentifiers() {
        return idpIdentifiers;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     */

    public void setIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        if (idpIdentifiers == null) {
            this.idpIdentifiers = null;
            return;
        }

        this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers);
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdpIdentifiers(java.util.Collection)} or {@link #withIdpIdentifiers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withIdpIdentifiers(String... idpIdentifiers) {
        if (this.idpIdentifiers == null) {
            setIdpIdentifiers(new java.util.ArrayList<String>(idpIdentifiers.length));
        }
        for (String ele : idpIdentifiers) {
            this.idpIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identity provider identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of identity provider identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        setIdpIdentifiers(idpIdentifiers);
        return this;
    }

    /**
     * <p>
     * The date the identity provider was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the identity provider was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the identity provider was last modified.
     * </p>
     * 
     * @return The date the identity provider was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the identity provider was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the identity provider was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date the identity provider was created.
     * </p>
     * 
     * @param creationDate
     *        The date the identity provider was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the identity provider was created.
     * </p>
     * 
     * @return The date the identity provider was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the identity provider was created.
     * </p>
     * 
     * @param creationDate
     *        The date the identity provider was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withCreationDate(java.util.Date creationDate) {
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getProviderDetails() != null)
            sb.append("ProviderDetails: ").append(getProviderDetails()).append(",");
        if (getAttributeMapping() != null)
            sb.append("AttributeMapping: ").append(getAttributeMapping()).append(",");
        if (getIdpIdentifiers() != null)
            sb.append("IdpIdentifiers: ").append(getIdpIdentifiers()).append(",");
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

        if (obj instanceof IdentityProviderType == false)
            return false;
        IdentityProviderType other = (IdentityProviderType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getProviderDetails() == null ^ this.getProviderDetails() == null)
            return false;
        if (other.getProviderDetails() != null && other.getProviderDetails().equals(this.getProviderDetails()) == false)
            return false;
        if (other.getAttributeMapping() == null ^ this.getAttributeMapping() == null)
            return false;
        if (other.getAttributeMapping() != null && other.getAttributeMapping().equals(this.getAttributeMapping()) == false)
            return false;
        if (other.getIdpIdentifiers() == null ^ this.getIdpIdentifiers() == null)
            return false;
        if (other.getIdpIdentifiers() != null && other.getIdpIdentifiers().equals(this.getIdpIdentifiers()) == false)
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

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getProviderDetails() == null) ? 0 : getProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getAttributeMapping() == null) ? 0 : getAttributeMapping().hashCode());
        hashCode = prime * hashCode + ((getIdpIdentifiers() == null) ? 0 : getIdpIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderType clone() {
        try {
            return (IdentityProviderType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.IdentityProviderTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
