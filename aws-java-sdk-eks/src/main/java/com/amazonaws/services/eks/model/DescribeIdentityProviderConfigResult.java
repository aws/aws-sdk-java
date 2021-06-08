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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeIdentityProviderConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIdentityProviderConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     */
    private IdentityProviderConfigResponse identityProviderConfig;

    /**
     * <p>
     * The object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @param identityProviderConfig
     *        The object that represents an OpenID Connect (OIDC) identity provider configuration.
     */

    public void setIdentityProviderConfig(IdentityProviderConfigResponse identityProviderConfig) {
        this.identityProviderConfig = identityProviderConfig;
    }

    /**
     * <p>
     * The object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @return The object that represents an OpenID Connect (OIDC) identity provider configuration.
     */

    public IdentityProviderConfigResponse getIdentityProviderConfig() {
        return this.identityProviderConfig;
    }

    /**
     * <p>
     * The object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @param identityProviderConfig
     *        The object that represents an OpenID Connect (OIDC) identity provider configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIdentityProviderConfigResult withIdentityProviderConfig(IdentityProviderConfigResponse identityProviderConfig) {
        setIdentityProviderConfig(identityProviderConfig);
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
        if (getIdentityProviderConfig() != null)
            sb.append("IdentityProviderConfig: ").append(getIdentityProviderConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIdentityProviderConfigResult == false)
            return false;
        DescribeIdentityProviderConfigResult other = (DescribeIdentityProviderConfigResult) obj;
        if (other.getIdentityProviderConfig() == null ^ this.getIdentityProviderConfig() == null)
            return false;
        if (other.getIdentityProviderConfig() != null && other.getIdentityProviderConfig().equals(this.getIdentityProviderConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProviderConfig() == null) ? 0 : getIdentityProviderConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIdentityProviderConfigResult clone() {
        try {
            return (DescribeIdentityProviderConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
