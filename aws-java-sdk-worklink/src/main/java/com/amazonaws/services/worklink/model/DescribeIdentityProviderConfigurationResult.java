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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeIdentityProviderConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIdentityProviderConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The type of identity provider.
     * </p>
     */
    private String identityProviderType;
    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     */
    private String serviceProviderSamlMetadata;
    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     */
    private String identityProviderSamlMetadata;

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @param identityProviderType
     *        The type of identity provider.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @return The type of identity provider.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @param identityProviderType
     *        The type of identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribeIdentityProviderConfigurationResult withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * The type of identity provider.
     * </p>
     * 
     * @param identityProviderType
     *        The type of identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribeIdentityProviderConfigurationResult withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     * 
     * @param serviceProviderSamlMetadata
     *        The SAML metadata document uploaded to the user’s identity provider.
     */

    public void setServiceProviderSamlMetadata(String serviceProviderSamlMetadata) {
        this.serviceProviderSamlMetadata = serviceProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     * 
     * @return The SAML metadata document uploaded to the user’s identity provider.
     */

    public String getServiceProviderSamlMetadata() {
        return this.serviceProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document uploaded to the user’s identity provider.
     * </p>
     * 
     * @param serviceProviderSamlMetadata
     *        The SAML metadata document uploaded to the user’s identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityProviderConfigurationResult withServiceProviderSamlMetadata(String serviceProviderSamlMetadata) {
        setServiceProviderSamlMetadata(serviceProviderSamlMetadata);
        return this;
    }

    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     * 
     * @param identityProviderSamlMetadata
     *        The SAML metadata document provided by the user’s identity provider.
     */

    public void setIdentityProviderSamlMetadata(String identityProviderSamlMetadata) {
        this.identityProviderSamlMetadata = identityProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     * 
     * @return The SAML metadata document provided by the user’s identity provider.
     */

    public String getIdentityProviderSamlMetadata() {
        return this.identityProviderSamlMetadata;
    }

    /**
     * <p>
     * The SAML metadata document provided by the user’s identity provider.
     * </p>
     * 
     * @param identityProviderSamlMetadata
     *        The SAML metadata document provided by the user’s identity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityProviderConfigurationResult withIdentityProviderSamlMetadata(String identityProviderSamlMetadata) {
        setIdentityProviderSamlMetadata(identityProviderSamlMetadata);
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
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType()).append(",");
        if (getServiceProviderSamlMetadata() != null)
            sb.append("ServiceProviderSamlMetadata: ").append(getServiceProviderSamlMetadata()).append(",");
        if (getIdentityProviderSamlMetadata() != null)
            sb.append("IdentityProviderSamlMetadata: ").append(getIdentityProviderSamlMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityProviderConfigurationResult == false)
            return false;
        DescribeIdentityProviderConfigurationResult other = (DescribeIdentityProviderConfigurationResult) obj;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getServiceProviderSamlMetadata() == null ^ this.getServiceProviderSamlMetadata() == null)
            return false;
        if (other.getServiceProviderSamlMetadata() != null && other.getServiceProviderSamlMetadata().equals(this.getServiceProviderSamlMetadata()) == false)
            return false;
        if (other.getIdentityProviderSamlMetadata() == null ^ this.getIdentityProviderSamlMetadata() == null)
            return false;
        if (other.getIdentityProviderSamlMetadata() != null && other.getIdentityProviderSamlMetadata().equals(this.getIdentityProviderSamlMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getServiceProviderSamlMetadata() == null) ? 0 : getServiceProviderSamlMetadata().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderSamlMetadata() == null) ? 0 : getIdentityProviderSamlMetadata().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityProviderConfigurationResult clone() {
        try {
            return (DescribeIdentityProviderConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
