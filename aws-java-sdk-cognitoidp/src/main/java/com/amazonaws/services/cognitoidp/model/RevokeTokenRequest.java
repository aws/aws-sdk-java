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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RevokeToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token that you want to revoke.
     * </p>
     */
    private String token;
    /**
     * <p>
     * The client ID for the token that you want to revoke.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The secret for the client ID. This is required only if the client ID has a secret.
     * </p>
     */
    private String clientSecret;

    /**
     * <p>
     * The token that you want to revoke.
     * </p>
     * 
     * @param token
     *        The token that you want to revoke.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The token that you want to revoke.
     * </p>
     * 
     * @return The token that you want to revoke.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The token that you want to revoke.
     * </p>
     * 
     * @param token
     *        The token that you want to revoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeTokenRequest withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * The client ID for the token that you want to revoke.
     * </p>
     * 
     * @param clientId
     *        The client ID for the token that you want to revoke.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client ID for the token that you want to revoke.
     * </p>
     * 
     * @return The client ID for the token that you want to revoke.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client ID for the token that you want to revoke.
     * </p>
     * 
     * @param clientId
     *        The client ID for the token that you want to revoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeTokenRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The secret for the client ID. This is required only if the client ID has a secret.
     * </p>
     * 
     * @param clientSecret
     *        The secret for the client ID. This is required only if the client ID has a secret.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The secret for the client ID. This is required only if the client ID has a secret.
     * </p>
     * 
     * @return The secret for the client ID. This is required only if the client ID has a secret.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The secret for the client ID. This is required only if the client ID has a secret.
     * </p>
     * 
     * @param clientSecret
     *        The secret for the client ID. This is required only if the client ID has a secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeTokenRequest withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
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
        if (getToken() != null)
            sb.append("Token: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeTokenRequest == false)
            return false;
        RevokeTokenRequest other = (RevokeTokenRequest) obj;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        return hashCode;
    }

    @Override
    public RevokeTokenRequest clone() {
        return (RevokeTokenRequest) super.clone();
    }

}
