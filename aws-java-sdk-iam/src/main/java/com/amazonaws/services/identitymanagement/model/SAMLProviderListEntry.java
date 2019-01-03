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
 * Contains the list of SAML providers for this account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/SAMLProviderListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAMLProviderListEntry implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The expiration date and time for the SAML provider.
     * </p>
     */
    private java.util.Date validUntil;
    /**
     * <p>
     * The date and time when the SAML provider was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the SAML provider.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SAML provider.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the SAML provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAMLProviderListEntry withArn(String arn) {
        setArn(arn);
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

    public SAMLProviderListEntry withValidUntil(java.util.Date validUntil) {
        setValidUntil(validUntil);
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

    public SAMLProviderListEntry withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getValidUntil() != null)
            sb.append("ValidUntil: ").append(getValidUntil()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SAMLProviderListEntry == false)
            return false;
        SAMLProviderListEntry other = (SAMLProviderListEntry) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getValidUntil() == null ^ this.getValidUntil() == null)
            return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public SAMLProviderListEntry clone() {
        try {
            return (SAMLProviderListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
