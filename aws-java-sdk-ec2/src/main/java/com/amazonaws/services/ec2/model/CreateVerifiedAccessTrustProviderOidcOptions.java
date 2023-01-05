/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for an OIDC-based, user-identity type trust provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVerifiedAccessTrustProviderOidcOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessTrustProviderOidcOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The OIDC issuer.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The OIDC authorization endpoint.
     * </p>
     */
    private String authorizationEndpoint;
    /**
     * <p>
     * The OIDC token endpoint.
     * </p>
     */
    private String tokenEndpoint;
    /**
     * <p>
     * The OIDC user info endpoint.
     * </p>
     */
    private String userInfoEndpoint;
    /**
     * <p>
     * The client identifier.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The client secret.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * The OIDC issuer.
     * </p>
     * 
     * @param issuer
     *        The OIDC issuer.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The OIDC issuer.
     * </p>
     * 
     * @return The OIDC issuer.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The OIDC issuer.
     * </p>
     * 
     * @param issuer
     *        The OIDC issuer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The OIDC authorization endpoint.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The OIDC authorization endpoint.
     */

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    /**
     * <p>
     * The OIDC authorization endpoint.
     * </p>
     * 
     * @return The OIDC authorization endpoint.
     */

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * <p>
     * The OIDC authorization endpoint.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The OIDC authorization endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions withAuthorizationEndpoint(String authorizationEndpoint) {
        setAuthorizationEndpoint(authorizationEndpoint);
        return this;
    }

    /**
     * <p>
     * The OIDC token endpoint.
     * </p>
     * 
     * @param tokenEndpoint
     *        The OIDC token endpoint.
     */

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    /**
     * <p>
     * The OIDC token endpoint.
     * </p>
     * 
     * @return The OIDC token endpoint.
     */

    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * <p>
     * The OIDC token endpoint.
     * </p>
     * 
     * @param tokenEndpoint
     *        The OIDC token endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions withTokenEndpoint(String tokenEndpoint) {
        setTokenEndpoint(tokenEndpoint);
        return this;
    }

    /**
     * <p>
     * The OIDC user info endpoint.
     * </p>
     * 
     * @param userInfoEndpoint
     *        The OIDC user info endpoint.
     */

    public void setUserInfoEndpoint(String userInfoEndpoint) {
        this.userInfoEndpoint = userInfoEndpoint;
    }

    /**
     * <p>
     * The OIDC user info endpoint.
     * </p>
     * 
     * @return The OIDC user info endpoint.
     */

    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    /**
     * <p>
     * The OIDC user info endpoint.
     * </p>
     * 
     * @param userInfoEndpoint
     *        The OIDC user info endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions withUserInfoEndpoint(String userInfoEndpoint) {
        setUserInfoEndpoint(userInfoEndpoint);
        return this;
    }

    /**
     * <p>
     * The client identifier.
     * </p>
     * 
     * @param clientId
     *        The client identifier.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client identifier.
     * </p>
     * 
     * @return The client identifier.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client identifier.
     * </p>
     * 
     * @param clientId
     *        The client identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The client secret.
     * </p>
     * 
     * @param clientSecret
     *        The client secret.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The client secret.
     * </p>
     * 
     * @return The client secret.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The client secret.
     * </p>
     * 
     * @param clientSecret
     *        The client secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     * 
     * @param scope
     *        OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a
     *        user's details. Each scope returns a specific set of user attributes.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     * 
     * @return OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a
     *         user's details. Each scope returns a specific set of user attributes.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a user's
     * details. Each scope returns a specific set of user attributes.
     * </p>
     * 
     * @param scope
     *        OpenID Connect (OIDC) scopes are used by an application during authentication to authorize access to a
     *        user's details. Each scope returns a specific set of user attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessTrustProviderOidcOptions withScope(String scope) {
        setScope(scope);
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
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getAuthorizationEndpoint() != null)
            sb.append("AuthorizationEndpoint: ").append(getAuthorizationEndpoint()).append(",");
        if (getTokenEndpoint() != null)
            sb.append("TokenEndpoint: ").append(getTokenEndpoint()).append(",");
        if (getUserInfoEndpoint() != null)
            sb.append("UserInfoEndpoint: ").append(getUserInfoEndpoint()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append(getClientSecret()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVerifiedAccessTrustProviderOidcOptions == false)
            return false;
        CreateVerifiedAccessTrustProviderOidcOptions other = (CreateVerifiedAccessTrustProviderOidcOptions) obj;
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
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationEndpoint() == null) ? 0 : getAuthorizationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTokenEndpoint() == null) ? 0 : getTokenEndpoint().hashCode());
        hashCode = prime * hashCode + ((getUserInfoEndpoint() == null) ? 0 : getUserInfoEndpoint().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public CreateVerifiedAccessTrustProviderOidcOptions clone() {
        try {
            return (CreateVerifiedAccessTrustProviderOidcOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
