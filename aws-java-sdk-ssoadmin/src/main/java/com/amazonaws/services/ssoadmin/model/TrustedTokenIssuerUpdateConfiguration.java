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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains details to be updated for a trusted token issuer configuration. The structure and settings
 * that you can include depend on the type of the trusted token issuer being updated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/TrustedTokenIssuerUpdateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrustedTokenIssuerUpdateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that describes an updated configuration for a trusted token issuer that uses OpenID Connect (OIDC)
     * with JSON web tokens (JWT).
     * </p>
     */
    private OidcJwtUpdateConfiguration oidcJwtConfiguration;

    /**
     * <p>
     * A structure that describes an updated configuration for a trusted token issuer that uses OpenID Connect (OIDC)
     * with JSON web tokens (JWT).
     * </p>
     * 
     * @param oidcJwtConfiguration
     *        A structure that describes an updated configuration for a trusted token issuer that uses OpenID Connect
     *        (OIDC) with JSON web tokens (JWT).
     */

    public void setOidcJwtConfiguration(OidcJwtUpdateConfiguration oidcJwtConfiguration) {
        this.oidcJwtConfiguration = oidcJwtConfiguration;
    }

    /**
     * <p>
     * A structure that describes an updated configuration for a trusted token issuer that uses OpenID Connect (OIDC)
     * with JSON web tokens (JWT).
     * </p>
     * 
     * @return A structure that describes an updated configuration for a trusted token issuer that uses OpenID Connect
     *         (OIDC) with JSON web tokens (JWT).
     */

    public OidcJwtUpdateConfiguration getOidcJwtConfiguration() {
        return this.oidcJwtConfiguration;
    }

    /**
     * <p>
     * A structure that describes an updated configuration for a trusted token issuer that uses OpenID Connect (OIDC)
     * with JSON web tokens (JWT).
     * </p>
     * 
     * @param oidcJwtConfiguration
     *        A structure that describes an updated configuration for a trusted token issuer that uses OpenID Connect
     *        (OIDC) with JSON web tokens (JWT).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrustedTokenIssuerUpdateConfiguration withOidcJwtConfiguration(OidcJwtUpdateConfiguration oidcJwtConfiguration) {
        setOidcJwtConfiguration(oidcJwtConfiguration);
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
        if (getOidcJwtConfiguration() != null)
            sb.append("OidcJwtConfiguration: ").append(getOidcJwtConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrustedTokenIssuerUpdateConfiguration == false)
            return false;
        TrustedTokenIssuerUpdateConfiguration other = (TrustedTokenIssuerUpdateConfiguration) obj;
        if (other.getOidcJwtConfiguration() == null ^ this.getOidcJwtConfiguration() == null)
            return false;
        if (other.getOidcJwtConfiguration() != null && other.getOidcJwtConfiguration().equals(this.getOidcJwtConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOidcJwtConfiguration() == null) ? 0 : getOidcJwtConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TrustedTokenIssuerUpdateConfiguration clone() {
        try {
            return (TrustedTokenIssuerUpdateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.TrustedTokenIssuerUpdateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
