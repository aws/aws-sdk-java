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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>GetSAMLProvider</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/GetSAMLProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSAMLProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The XML metadata document that includes information about an identity provider.
     * </p>
     */
    private String sAMLMetadataDocument;
    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     */
    private java.util.Date validUntil;

    /**
     * <p>
     * The XML metadata document that includes information about an identity provider.
     * </p>
     * 
     * @param sAMLMetadataDocument
     *        The XML metadata document that includes information about an identity provider.
     */

    public void setSAMLMetadataDocument(String sAMLMetadataDocument) {
        this.sAMLMetadataDocument = sAMLMetadataDocument;
    }

    /**
     * <p>
     * The XML metadata document that includes information about an identity provider.
     * </p>
     * 
     * @return The XML metadata document that includes information about an identity provider.
     */

    public String getSAMLMetadataDocument() {
        return this.sAMLMetadataDocument;
    }

    /**
     * <p>
     * The XML metadata document that includes information about an identity provider.
     * </p>
     * 
     * @param sAMLMetadataDocument
     *        The XML metadata document that includes information about an identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSAMLProviderResult withSAMLMetadataDocument(String sAMLMetadataDocument) {
        setSAMLMetadataDocument(sAMLMetadataDocument);
        return this;
    }

    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     * 
     * @param createDate
     *        The date and time when the SAML provider was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     * 
     * @return The date and time when the SAML provider was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     * 
     * @param createDate
     *        The date and time when the SAML provider was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSAMLProviderResult withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     * 
     * @param validUntil
     *        The expiration date and time for the SAML provider.
     */

    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     * 
     * @return The expiration date and time for the SAML provider.
     */

    public java.util.Date getValidUntil() {
        return this.validUntil;
    }

    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     * 
     * @param validUntil
     *        The expiration date and time for the SAML provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSAMLProviderResult withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
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
        if (getSAMLMetadataDocument() != null)
            sb.append("SAMLMetadataDocument: ").append(getSAMLMetadataDocument()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: ").append(getValidUntil());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSAMLProviderResult == false)
            return false;
        GetSAMLProviderResult other = (GetSAMLProviderResult) obj;
        if (other.getSAMLMetadataDocument() == null ^ this.getSAMLMetadataDocument() == null)
            return false;
        if (other.getSAMLMetadataDocument() != null && other.getSAMLMetadataDocument().equals(this.getSAMLMetadataDocument()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSAMLMetadataDocument() == null) ? 0 : getSAMLMetadataDocument().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        return hashCode;
    }

    @Override
    public GetSAMLProviderResult clone() {
        try {
            return (GetSAMLProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
