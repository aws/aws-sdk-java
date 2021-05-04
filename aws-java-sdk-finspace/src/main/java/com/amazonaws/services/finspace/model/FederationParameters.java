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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information when authentication mode is FEDERATED.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/FederationParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * SAML 2.0 Metadata document from identity provider (IdP).
     * </p>
     */
    private String samlMetadataDocument;
    /**
     * <p>
     * Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     * </p>
     */
    private String samlMetadataURL;
    /**
     * <p>
     * The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider configuration
     * (IdP).
     * </p>
     */
    private String applicationCallBackURL;
    /**
     * <p>
     * The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service Provider Entity
     * ID.
     * </p>
     */
    private String federationURN;
    /**
     * <p>
     * Name of the identity provider (IdP).
     * </p>
     */
    private String federationProviderName;
    /**
     * <p>
     * SAML attribute name and value. The name must always be <code>Email</code> and the value should be set to the
     * attribute definition in which user email is set. For example, name would be <code>Email</code> and value
     * <code>http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress</code>. Please check your SAML 2.0
     * compliant identity provider (IdP) documentation for details.
     * </p>
     */
    private java.util.Map<String, String> attributeMap;

    /**
     * <p>
     * SAML 2.0 Metadata document from identity provider (IdP).
     * </p>
     * 
     * @param samlMetadataDocument
     *        SAML 2.0 Metadata document from identity provider (IdP).
     */

    public void setSamlMetadataDocument(String samlMetadataDocument) {
        this.samlMetadataDocument = samlMetadataDocument;
    }

    /**
     * <p>
     * SAML 2.0 Metadata document from identity provider (IdP).
     * </p>
     * 
     * @return SAML 2.0 Metadata document from identity provider (IdP).
     */

    public String getSamlMetadataDocument() {
        return this.samlMetadataDocument;
    }

    /**
     * <p>
     * SAML 2.0 Metadata document from identity provider (IdP).
     * </p>
     * 
     * @param samlMetadataDocument
     *        SAML 2.0 Metadata document from identity provider (IdP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters withSamlMetadataDocument(String samlMetadataDocument) {
        setSamlMetadataDocument(samlMetadataDocument);
        return this;
    }

    /**
     * <p>
     * Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     * </p>
     * 
     * @param samlMetadataURL
     *        Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     */

    public void setSamlMetadataURL(String samlMetadataURL) {
        this.samlMetadataURL = samlMetadataURL;
    }

    /**
     * <p>
     * Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     * </p>
     * 
     * @return Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     */

    public String getSamlMetadataURL() {
        return this.samlMetadataURL;
    }

    /**
     * <p>
     * Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     * </p>
     * 
     * @param samlMetadataURL
     *        Provide the metadata URL from your SAML 2.0 compliant identity provider (IdP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters withSamlMetadataURL(String samlMetadataURL) {
        setSamlMetadataURL(samlMetadataURL);
        return this;
    }

    /**
     * <p>
     * The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider configuration
     * (IdP).
     * </p>
     * 
     * @param applicationCallBackURL
     *        The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider
     *        configuration (IdP).
     */

    public void setApplicationCallBackURL(String applicationCallBackURL) {
        this.applicationCallBackURL = applicationCallBackURL;
    }

    /**
     * <p>
     * The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider configuration
     * (IdP).
     * </p>
     * 
     * @return The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider
     *         configuration (IdP).
     */

    public String getApplicationCallBackURL() {
        return this.applicationCallBackURL;
    }

    /**
     * <p>
     * The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider configuration
     * (IdP).
     * </p>
     * 
     * @param applicationCallBackURL
     *        The redirect or sign-in URL that should be entered into the SAML 2.0 compliant identity provider
     *        configuration (IdP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters withApplicationCallBackURL(String applicationCallBackURL) {
        setApplicationCallBackURL(applicationCallBackURL);
        return this;
    }

    /**
     * <p>
     * The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service Provider Entity
     * ID.
     * </p>
     * 
     * @param federationURN
     *        The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service Provider
     *        Entity ID.
     */

    public void setFederationURN(String federationURN) {
        this.federationURN = federationURN;
    }

    /**
     * <p>
     * The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service Provider Entity
     * ID.
     * </p>
     * 
     * @return The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service
     *         Provider Entity ID.
     */

    public String getFederationURN() {
        return this.federationURN;
    }

    /**
     * <p>
     * The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service Provider Entity
     * ID.
     * </p>
     * 
     * @param federationURN
     *        The Uniform Resource Name (URN). Also referred as Service Provider URN or Audience URI or Service Provider
     *        Entity ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters withFederationURN(String federationURN) {
        setFederationURN(federationURN);
        return this;
    }

    /**
     * <p>
     * Name of the identity provider (IdP).
     * </p>
     * 
     * @param federationProviderName
     *        Name of the identity provider (IdP).
     */

    public void setFederationProviderName(String federationProviderName) {
        this.federationProviderName = federationProviderName;
    }

    /**
     * <p>
     * Name of the identity provider (IdP).
     * </p>
     * 
     * @return Name of the identity provider (IdP).
     */

    public String getFederationProviderName() {
        return this.federationProviderName;
    }

    /**
     * <p>
     * Name of the identity provider (IdP).
     * </p>
     * 
     * @param federationProviderName
     *        Name of the identity provider (IdP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters withFederationProviderName(String federationProviderName) {
        setFederationProviderName(federationProviderName);
        return this;
    }

    /**
     * <p>
     * SAML attribute name and value. The name must always be <code>Email</code> and the value should be set to the
     * attribute definition in which user email is set. For example, name would be <code>Email</code> and value
     * <code>http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress</code>. Please check your SAML 2.0
     * compliant identity provider (IdP) documentation for details.
     * </p>
     * 
     * @return SAML attribute name and value. The name must always be <code>Email</code> and the value should be set to
     *         the attribute definition in which user email is set. For example, name would be <code>Email</code> and
     *         value <code>http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress</code>. Please check your
     *         SAML 2.0 compliant identity provider (IdP) documentation for details.
     */

    public java.util.Map<String, String> getAttributeMap() {
        return attributeMap;
    }

    /**
     * <p>
     * SAML attribute name and value. The name must always be <code>Email</code> and the value should be set to the
     * attribute definition in which user email is set. For example, name would be <code>Email</code> and value
     * <code>http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress</code>. Please check your SAML 2.0
     * compliant identity provider (IdP) documentation for details.
     * </p>
     * 
     * @param attributeMap
     *        SAML attribute name and value. The name must always be <code>Email</code> and the value should be set to
     *        the attribute definition in which user email is set. For example, name would be <code>Email</code> and
     *        value <code>http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress</code>. Please check your
     *        SAML 2.0 compliant identity provider (IdP) documentation for details.
     */

    public void setAttributeMap(java.util.Map<String, String> attributeMap) {
        this.attributeMap = attributeMap;
    }

    /**
     * <p>
     * SAML attribute name and value. The name must always be <code>Email</code> and the value should be set to the
     * attribute definition in which user email is set. For example, name would be <code>Email</code> and value
     * <code>http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress</code>. Please check your SAML 2.0
     * compliant identity provider (IdP) documentation for details.
     * </p>
     * 
     * @param attributeMap
     *        SAML attribute name and value. The name must always be <code>Email</code> and the value should be set to
     *        the attribute definition in which user email is set. For example, name would be <code>Email</code> and
     *        value <code>http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress</code>. Please check your
     *        SAML 2.0 compliant identity provider (IdP) documentation for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters withAttributeMap(java.util.Map<String, String> attributeMap) {
        setAttributeMap(attributeMap);
        return this;
    }

    /**
     * Add a single AttributeMap entry
     *
     * @see FederationParameters#withAttributeMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters addAttributeMapEntry(String key, String value) {
        if (null == this.attributeMap) {
            this.attributeMap = new java.util.HashMap<String, String>();
        }
        if (this.attributeMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributeMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederationParameters clearAttributeMapEntries() {
        this.attributeMap = null;
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
        if (getSamlMetadataDocument() != null)
            sb.append("SamlMetadataDocument: ").append(getSamlMetadataDocument()).append(",");
        if (getSamlMetadataURL() != null)
            sb.append("SamlMetadataURL: ").append(getSamlMetadataURL()).append(",");
        if (getApplicationCallBackURL() != null)
            sb.append("ApplicationCallBackURL: ").append(getApplicationCallBackURL()).append(",");
        if (getFederationURN() != null)
            sb.append("FederationURN: ").append(getFederationURN()).append(",");
        if (getFederationProviderName() != null)
            sb.append("FederationProviderName: ").append(getFederationProviderName()).append(",");
        if (getAttributeMap() != null)
            sb.append("AttributeMap: ").append(getAttributeMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederationParameters == false)
            return false;
        FederationParameters other = (FederationParameters) obj;
        if (other.getSamlMetadataDocument() == null ^ this.getSamlMetadataDocument() == null)
            return false;
        if (other.getSamlMetadataDocument() != null && other.getSamlMetadataDocument().equals(this.getSamlMetadataDocument()) == false)
            return false;
        if (other.getSamlMetadataURL() == null ^ this.getSamlMetadataURL() == null)
            return false;
        if (other.getSamlMetadataURL() != null && other.getSamlMetadataURL().equals(this.getSamlMetadataURL()) == false)
            return false;
        if (other.getApplicationCallBackURL() == null ^ this.getApplicationCallBackURL() == null)
            return false;
        if (other.getApplicationCallBackURL() != null && other.getApplicationCallBackURL().equals(this.getApplicationCallBackURL()) == false)
            return false;
        if (other.getFederationURN() == null ^ this.getFederationURN() == null)
            return false;
        if (other.getFederationURN() != null && other.getFederationURN().equals(this.getFederationURN()) == false)
            return false;
        if (other.getFederationProviderName() == null ^ this.getFederationProviderName() == null)
            return false;
        if (other.getFederationProviderName() != null && other.getFederationProviderName().equals(this.getFederationProviderName()) == false)
            return false;
        if (other.getAttributeMap() == null ^ this.getAttributeMap() == null)
            return false;
        if (other.getAttributeMap() != null && other.getAttributeMap().equals(this.getAttributeMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamlMetadataDocument() == null) ? 0 : getSamlMetadataDocument().hashCode());
        hashCode = prime * hashCode + ((getSamlMetadataURL() == null) ? 0 : getSamlMetadataURL().hashCode());
        hashCode = prime * hashCode + ((getApplicationCallBackURL() == null) ? 0 : getApplicationCallBackURL().hashCode());
        hashCode = prime * hashCode + ((getFederationURN() == null) ? 0 : getFederationURN().hashCode());
        hashCode = prime * hashCode + ((getFederationProviderName() == null) ? 0 : getFederationProviderName().hashCode());
        hashCode = prime * hashCode + ((getAttributeMap() == null) ? 0 : getAttributeMap().hashCode());
        return hashCode;
    }

    @Override
    public FederationParameters clone() {
        try {
            return (FederationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.FederationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
