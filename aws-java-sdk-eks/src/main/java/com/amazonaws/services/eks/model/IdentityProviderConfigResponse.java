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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents an identity configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/IdentityProviderConfigResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderConfigResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     */
    private OidcIdentityProviderConfig oidc;

    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @param oidc
     *        An object that represents an OpenID Connect (OIDC) identity provider configuration.
     */

    public void setOidc(OidcIdentityProviderConfig oidc) {
        this.oidc = oidc;
    }

    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @return An object that represents an OpenID Connect (OIDC) identity provider configuration.
     */

    public OidcIdentityProviderConfig getOidc() {
        return this.oidc;
    }

    /**
     * <p>
     * An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * </p>
     * 
     * @param oidc
     *        An object that represents an OpenID Connect (OIDC) identity provider configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderConfigResponse withOidc(OidcIdentityProviderConfig oidc) {
        setOidc(oidc);
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
        if (getOidc() != null)
            sb.append("Oidc: ").append(getOidc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderConfigResponse == false)
            return false;
        IdentityProviderConfigResponse other = (IdentityProviderConfigResponse) obj;
        if (other.getOidc() == null ^ this.getOidc() == null)
            return false;
        if (other.getOidc() != null && other.getOidc().equals(this.getOidc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOidc() == null) ? 0 : getOidc().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderConfigResponse clone() {
        try {
            return (IdentityProviderConfigResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.IdentityProviderConfigResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
