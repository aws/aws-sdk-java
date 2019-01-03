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
 * A container for information about an identity provider for a user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ProviderUserIdentifierType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProviderUserIdentifierType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with Amazon.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The name of the provider attribute to link to, for example, <code>NameID</code>.
     * </p>
     */
    private String providerAttributeName;
    /**
     * <p>
     * The value of the provider attribute to link to, for example, <code>xxxxx_account</code>.
     * </p>
     */
    private String providerAttributeValue;

    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with Amazon.
     * </p>
     * 
     * @param providerName
     *        The name of the provider, for example, Facebook, Google, or Login with Amazon.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with Amazon.
     * </p>
     * 
     * @return The name of the provider, for example, Facebook, Google, or Login with Amazon.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the provider, for example, Facebook, Google, or Login with Amazon.
     * </p>
     * 
     * @param providerName
     *        The name of the provider, for example, Facebook, Google, or Login with Amazon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderUserIdentifierType withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The name of the provider attribute to link to, for example, <code>NameID</code>.
     * </p>
     * 
     * @param providerAttributeName
     *        The name of the provider attribute to link to, for example, <code>NameID</code>.
     */

    public void setProviderAttributeName(String providerAttributeName) {
        this.providerAttributeName = providerAttributeName;
    }

    /**
     * <p>
     * The name of the provider attribute to link to, for example, <code>NameID</code>.
     * </p>
     * 
     * @return The name of the provider attribute to link to, for example, <code>NameID</code>.
     */

    public String getProviderAttributeName() {
        return this.providerAttributeName;
    }

    /**
     * <p>
     * The name of the provider attribute to link to, for example, <code>NameID</code>.
     * </p>
     * 
     * @param providerAttributeName
     *        The name of the provider attribute to link to, for example, <code>NameID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderUserIdentifierType withProviderAttributeName(String providerAttributeName) {
        setProviderAttributeName(providerAttributeName);
        return this;
    }

    /**
     * <p>
     * The value of the provider attribute to link to, for example, <code>xxxxx_account</code>.
     * </p>
     * 
     * @param providerAttributeValue
     *        The value of the provider attribute to link to, for example, <code>xxxxx_account</code>.
     */

    public void setProviderAttributeValue(String providerAttributeValue) {
        this.providerAttributeValue = providerAttributeValue;
    }

    /**
     * <p>
     * The value of the provider attribute to link to, for example, <code>xxxxx_account</code>.
     * </p>
     * 
     * @return The value of the provider attribute to link to, for example, <code>xxxxx_account</code>.
     */

    public String getProviderAttributeValue() {
        return this.providerAttributeValue;
    }

    /**
     * <p>
     * The value of the provider attribute to link to, for example, <code>xxxxx_account</code>.
     * </p>
     * 
     * @param providerAttributeValue
     *        The value of the provider attribute to link to, for example, <code>xxxxx_account</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderUserIdentifierType withProviderAttributeValue(String providerAttributeValue) {
        setProviderAttributeValue(providerAttributeValue);
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
        if (getProviderAttributeName() != null)
            sb.append("ProviderAttributeName: ").append(getProviderAttributeName()).append(",");
        if (getProviderAttributeValue() != null)
            sb.append("ProviderAttributeValue: ").append(getProviderAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProviderUserIdentifierType == false)
            return false;
        ProviderUserIdentifierType other = (ProviderUserIdentifierType) obj;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderAttributeName() == null ^ this.getProviderAttributeName() == null)
            return false;
        if (other.getProviderAttributeName() != null && other.getProviderAttributeName().equals(this.getProviderAttributeName()) == false)
            return false;
        if (other.getProviderAttributeValue() == null ^ this.getProviderAttributeValue() == null)
            return false;
        if (other.getProviderAttributeValue() != null && other.getProviderAttributeValue().equals(this.getProviderAttributeValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getProviderAttributeName() == null) ? 0 : getProviderAttributeName().hashCode());
        hashCode = prime * hashCode + ((getProviderAttributeValue() == null) ? 0 : getProviderAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public ProviderUserIdentifierType clone() {
        try {
            return (ProviderUserIdentifierType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.ProviderUserIdentifierTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
