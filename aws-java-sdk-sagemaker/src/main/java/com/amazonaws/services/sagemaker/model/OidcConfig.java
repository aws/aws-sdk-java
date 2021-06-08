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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this parameter to configure your OIDC Identity Provider (IdP).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OidcConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OidcConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OIDC IdP client ID used to configure your private workforce.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The OIDC IdP client secret used to configure your private workforce.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * The OIDC IdP issuer used to configure your private workforce.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The OIDC IdP authorization endpoint used to configure your private workforce.
     * </p>
     */
    private String authorizationEndpoint;
    /**
     * <p>
     * The OIDC IdP token endpoint used to configure your private workforce.
     * </p>
     */
    private String tokenEndpoint;
    /**
     * <p>
     * The OIDC IdP user information endpoint used to configure your private workforce.
     * </p>
     */
    private String userInfoEndpoint;
    /**
     * <p>
     * The OIDC IdP logout endpoint used to configure your private workforce.
     * </p>
     */
    private String logoutEndpoint;
    /**
     * <p>
     * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * </p>
     */
    private String jwksUri;

    /**
     * <p>
     * The OIDC IdP client ID used to configure your private workforce.
     * </p>
     * 
     * @param clientId
     *        The OIDC IdP client ID used to configure your private workforce.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The OIDC IdP client ID used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP client ID used to configure your private workforce.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The OIDC IdP client ID used to configure your private workforce.
     * </p>
     * 
     * @param clientId
     *        The OIDC IdP client ID used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The OIDC IdP client secret used to configure your private workforce.
     * </p>
     * 
     * @param clientSecret
     *        The OIDC IdP client secret used to configure your private workforce.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The OIDC IdP client secret used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP client secret used to configure your private workforce.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The OIDC IdP client secret used to configure your private workforce.
     * </p>
     * 
     * @param clientSecret
     *        The OIDC IdP client secret used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * The OIDC IdP issuer used to configure your private workforce.
     * </p>
     * 
     * @param issuer
     *        The OIDC IdP issuer used to configure your private workforce.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The OIDC IdP issuer used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP issuer used to configure your private workforce.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The OIDC IdP issuer used to configure your private workforce.
     * </p>
     * 
     * @param issuer
     *        The OIDC IdP issuer used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The OIDC IdP authorization endpoint used to configure your private workforce.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The OIDC IdP authorization endpoint used to configure your private workforce.
     */

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP authorization endpoint used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP authorization endpoint used to configure your private workforce.
     */

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP authorization endpoint used to configure your private workforce.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The OIDC IdP authorization endpoint used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withAuthorizationEndpoint(String authorizationEndpoint) {
        setAuthorizationEndpoint(authorizationEndpoint);
        return this;
    }

    /**
     * <p>
     * The OIDC IdP token endpoint used to configure your private workforce.
     * </p>
     * 
     * @param tokenEndpoint
     *        The OIDC IdP token endpoint used to configure your private workforce.
     */

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP token endpoint used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP token endpoint used to configure your private workforce.
     */

    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP token endpoint used to configure your private workforce.
     * </p>
     * 
     * @param tokenEndpoint
     *        The OIDC IdP token endpoint used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withTokenEndpoint(String tokenEndpoint) {
        setTokenEndpoint(tokenEndpoint);
        return this;
    }

    /**
     * <p>
     * The OIDC IdP user information endpoint used to configure your private workforce.
     * </p>
     * 
     * @param userInfoEndpoint
     *        The OIDC IdP user information endpoint used to configure your private workforce.
     */

    public void setUserInfoEndpoint(String userInfoEndpoint) {
        this.userInfoEndpoint = userInfoEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP user information endpoint used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP user information endpoint used to configure your private workforce.
     */

    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP user information endpoint used to configure your private workforce.
     * </p>
     * 
     * @param userInfoEndpoint
     *        The OIDC IdP user information endpoint used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withUserInfoEndpoint(String userInfoEndpoint) {
        setUserInfoEndpoint(userInfoEndpoint);
        return this;
    }

    /**
     * <p>
     * The OIDC IdP logout endpoint used to configure your private workforce.
     * </p>
     * 
     * @param logoutEndpoint
     *        The OIDC IdP logout endpoint used to configure your private workforce.
     */

    public void setLogoutEndpoint(String logoutEndpoint) {
        this.logoutEndpoint = logoutEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP logout endpoint used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP logout endpoint used to configure your private workforce.
     */

    public String getLogoutEndpoint() {
        return this.logoutEndpoint;
    }

    /**
     * <p>
     * The OIDC IdP logout endpoint used to configure your private workforce.
     * </p>
     * 
     * @param logoutEndpoint
     *        The OIDC IdP logout endpoint used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withLogoutEndpoint(String logoutEndpoint) {
        setLogoutEndpoint(logoutEndpoint);
        return this;
    }

    /**
     * <p>
     * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * </p>
     * 
     * @param jwksUri
     *        The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     */

    public void setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
    }

    /**
     * <p>
     * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * </p>
     * 
     * @return The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     */

    public String getJwksUri() {
        return this.jwksUri;
    }

    /**
     * <p>
     * The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * </p>
     * 
     * @param jwksUri
     *        The OIDC IdP JSON Web Key Set (Jwks) URI used to configure your private workforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcConfig withJwksUri(String jwksUri) {
        setJwksUri(jwksUri);
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
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append("***Sensitive Data Redacted***").append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getAuthorizationEndpoint() != null)
            sb.append("AuthorizationEndpoint: ").append(getAuthorizationEndpoint()).append(",");
        if (getTokenEndpoint() != null)
            sb.append("TokenEndpoint: ").append(getTokenEndpoint()).append(",");
        if (getUserInfoEndpoint() != null)
            sb.append("UserInfoEndpoint: ").append(getUserInfoEndpoint()).append(",");
        if (getLogoutEndpoint() != null)
            sb.append("LogoutEndpoint: ").append(getLogoutEndpoint()).append(",");
        if (getJwksUri() != null)
            sb.append("JwksUri: ").append(getJwksUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OidcConfig == false)
            return false;
        OidcConfig other = (OidcConfig) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getAuthorizationEndpoint() == null ^ this.getAuthorizationEndpoint() == null)
            return false;
        if (other.getAuthorizationEndpoint() != null && other.getAuthorizationEndpoint().equals(this.getAuthorizationEndpoint()) == false)
            return false;
        if (other.getTokenEndpoint() == null ^ this.getTokenEndpoint() == null)
            return false;
        if (other.getTokenEndpoint() != null && other.getTokenEndpoint().equals(this.getTokenEndpoint()) == false)
            return false;
        if (other.getUserInfoEndpoint() == null ^ this.getUserInfoEndpoint() == null)
            return false;
        if (other.getUserInfoEndpoint() != null && other.getUserInfoEndpoint().equals(this.getUserInfoEndpoint()) == false)
            return false;
        if (other.getLogoutEndpoint() == null ^ this.getLogoutEndpoint() == null)
            return false;
        if (other.getLogoutEndpoint() != null && other.getLogoutEndpoint().equals(this.getLogoutEndpoint()) == false)
            return false;
        if (other.getJwksUri() == null ^ this.getJwksUri() == null)
            return false;
        if (other.getJwksUri() != null && other.getJwksUri().equals(this.getJwksUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationEndpoint() == null) ? 0 : getAuthorizationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTokenEndpoint() == null) ? 0 : getTokenEndpoint().hashCode());
        hashCode = prime * hashCode + ((getUserInfoEndpoint() == null) ? 0 : getUserInfoEndpoint().hashCode());
        hashCode = prime * hashCode + ((getLogoutEndpoint() == null) ? 0 : getLogoutEndpoint().hashCode());
        hashCode = prime * hashCode + ((getJwksUri() == null) ? 0 : getJwksUri().hashCode());
        return hashCode;
    }

    @Override
    public OidcConfig clone() {
        try {
            return (OidcConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OidcConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
