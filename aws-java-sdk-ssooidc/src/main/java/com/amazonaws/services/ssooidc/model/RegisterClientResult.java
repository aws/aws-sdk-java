/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssooidc.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/RegisterClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterClientResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier string for each client. This client uses this identifier to get authenticated by the
     * service in subsequent calls.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * A secret string generated for the client. The client will use this string to get authenticated by the service in
     * subsequent calls.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were issued.
     * </p>
     */
    private Long clientIdIssuedAt;
    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will become invalid.
     * </p>
     */
    private Long clientSecretExpiresAt;
    /**
     * <p>
     * The endpoint where the client can request authorization.
     * </p>
     */
    private String authorizationEndpoint;
    /**
     * <p>
     * The endpoint where the client can get an access token.
     * </p>
     */
    private String tokenEndpoint;

    /**
     * <p>
     * The unique identifier string for each client. This client uses this identifier to get authenticated by the
     * service in subsequent calls.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for each client. This client uses this identifier to get authenticated by the
     *        service in subsequent calls.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The unique identifier string for each client. This client uses this identifier to get authenticated by the
     * service in subsequent calls.
     * </p>
     * 
     * @return The unique identifier string for each client. This client uses this identifier to get authenticated by
     *         the service in subsequent calls.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The unique identifier string for each client. This client uses this identifier to get authenticated by the
     * service in subsequent calls.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for each client. This client uses this identifier to get authenticated by the
     *        service in subsequent calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientResult withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * A secret string generated for the client. The client will use this string to get authenticated by the service in
     * subsequent calls.
     * </p>
     * 
     * @param clientSecret
     *        A secret string generated for the client. The client will use this string to get authenticated by the
     *        service in subsequent calls.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * A secret string generated for the client. The client will use this string to get authenticated by the service in
     * subsequent calls.
     * </p>
     * 
     * @return A secret string generated for the client. The client will use this string to get authenticated by the
     *         service in subsequent calls.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * A secret string generated for the client. The client will use this string to get authenticated by the service in
     * subsequent calls.
     * </p>
     * 
     * @param clientSecret
     *        A secret string generated for the client. The client will use this string to get authenticated by the
     *        service in subsequent calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientResult withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were issued.
     * </p>
     * 
     * @param clientIdIssuedAt
     *        Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were issued.
     */

    public void setClientIdIssuedAt(Long clientIdIssuedAt) {
        this.clientIdIssuedAt = clientIdIssuedAt;
    }

    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were issued.
     * </p>
     * 
     * @return Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were issued.
     */

    public Long getClientIdIssuedAt() {
        return this.clientIdIssuedAt;
    }

    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were issued.
     * </p>
     * 
     * @param clientIdIssuedAt
     *        Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> were issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientResult withClientIdIssuedAt(Long clientIdIssuedAt) {
        setClientIdIssuedAt(clientIdIssuedAt);
        return this;
    }

    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will become invalid.
     * </p>
     * 
     * @param clientSecretExpiresAt
     *        Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will become invalid.
     */

    public void setClientSecretExpiresAt(Long clientSecretExpiresAt) {
        this.clientSecretExpiresAt = clientSecretExpiresAt;
    }

    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will become invalid.
     * </p>
     * 
     * @return Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will become invalid.
     */

    public Long getClientSecretExpiresAt() {
        return this.clientSecretExpiresAt;
    }

    /**
     * <p>
     * Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will become invalid.
     * </p>
     * 
     * @param clientSecretExpiresAt
     *        Indicates the time at which the <code>clientId</code> and <code>clientSecret</code> will become invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientResult withClientSecretExpiresAt(Long clientSecretExpiresAt) {
        setClientSecretExpiresAt(clientSecretExpiresAt);
        return this;
    }

    /**
     * <p>
     * The endpoint where the client can request authorization.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The endpoint where the client can request authorization.
     */

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    /**
     * <p>
     * The endpoint where the client can request authorization.
     * </p>
     * 
     * @return The endpoint where the client can request authorization.
     */

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * <p>
     * The endpoint where the client can request authorization.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The endpoint where the client can request authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientResult withAuthorizationEndpoint(String authorizationEndpoint) {
        setAuthorizationEndpoint(authorizationEndpoint);
        return this;
    }

    /**
     * <p>
     * The endpoint where the client can get an access token.
     * </p>
     * 
     * @param tokenEndpoint
     *        The endpoint where the client can get an access token.
     */

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    /**
     * <p>
     * The endpoint where the client can get an access token.
     * </p>
     * 
     * @return The endpoint where the client can get an access token.
     */

    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * <p>
     * The endpoint where the client can get an access token.
     * </p>
     * 
     * @param tokenEndpoint
     *        The endpoint where the client can get an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterClientResult withTokenEndpoint(String tokenEndpoint) {
        setTokenEndpoint(tokenEndpoint);
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
            sb.append("ClientSecret: ").append(getClientSecret()).append(",");
        if (getClientIdIssuedAt() != null)
            sb.append("ClientIdIssuedAt: ").append(getClientIdIssuedAt()).append(",");
        if (getClientSecretExpiresAt() != null)
            sb.append("ClientSecretExpiresAt: ").append(getClientSecretExpiresAt()).append(",");
        if (getAuthorizationEndpoint() != null)
            sb.append("AuthorizationEndpoint: ").append(getAuthorizationEndpoint()).append(",");
        if (getTokenEndpoint() != null)
            sb.append("TokenEndpoint: ").append(getTokenEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterClientResult == false)
            return false;
        RegisterClientResult other = (RegisterClientResult) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getClientIdIssuedAt() == null ^ this.getClientIdIssuedAt() == null)
            return false;
        if (other.getClientIdIssuedAt() != null && other.getClientIdIssuedAt().equals(this.getClientIdIssuedAt()) == false)
            return false;
        if (other.getClientSecretExpiresAt() == null ^ this.getClientSecretExpiresAt() == null)
            return false;
        if (other.getClientSecretExpiresAt() != null && other.getClientSecretExpiresAt().equals(this.getClientSecretExpiresAt()) == false)
            return false;
        if (other.getAuthorizationEndpoint() == null ^ this.getAuthorizationEndpoint() == null)
            return false;
        if (other.getAuthorizationEndpoint() != null && other.getAuthorizationEndpoint().equals(this.getAuthorizationEndpoint()) == false)
            return false;
        if (other.getTokenEndpoint() == null ^ this.getTokenEndpoint() == null)
            return false;
        if (other.getTokenEndpoint() != null && other.getTokenEndpoint().equals(this.getTokenEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getClientIdIssuedAt() == null) ? 0 : getClientIdIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getClientSecretExpiresAt() == null) ? 0 : getClientSecretExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationEndpoint() == null) ? 0 : getAuthorizationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTokenEndpoint() == null) ? 0 : getTokenEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public RegisterClientResult clone() {
        try {
            return (RegisterClientResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
