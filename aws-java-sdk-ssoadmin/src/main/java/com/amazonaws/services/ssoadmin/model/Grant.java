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
 * The Grant union represents the set of possible configuration options for the selected grant type. Exactly one member
 * of the union must be specified, and must match the grant type selected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/Grant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Grant implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration options for the <code>authorization_code</code> grant type.
     * </p>
     */
    private AuthorizationCodeGrant authorizationCode;
    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code> grant type.
     * </p>
     */
    private JwtBearerGrant jwtBearer;
    /**
     * <p>
     * Configuration options for the <code>refresh_token</code> grant type.
     * </p>
     */
    private RefreshTokenGrant refreshToken;
    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:token-exchange</code> grant type.
     * </p>
     */
    private TokenExchangeGrant tokenExchange;

    /**
     * <p>
     * Configuration options for the <code>authorization_code</code> grant type.
     * </p>
     * 
     * @param authorizationCode
     *        Configuration options for the <code>authorization_code</code> grant type.
     */

    public void setAuthorizationCode(AuthorizationCodeGrant authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * <p>
     * Configuration options for the <code>authorization_code</code> grant type.
     * </p>
     * 
     * @return Configuration options for the <code>authorization_code</code> grant type.
     */

    public AuthorizationCodeGrant getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * <p>
     * Configuration options for the <code>authorization_code</code> grant type.
     * </p>
     * 
     * @param authorizationCode
     *        Configuration options for the <code>authorization_code</code> grant type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withAuthorizationCode(AuthorizationCodeGrant authorizationCode) {
        setAuthorizationCode(authorizationCode);
        return this;
    }

    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code> grant type.
     * </p>
     * 
     * @param jwtBearer
     *        Configuration options for the <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code> grant type.
     */

    public void setJwtBearer(JwtBearerGrant jwtBearer) {
        this.jwtBearer = jwtBearer;
    }

    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code> grant type.
     * </p>
     * 
     * @return Configuration options for the <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code> grant type.
     */

    public JwtBearerGrant getJwtBearer() {
        return this.jwtBearer;
    }

    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code> grant type.
     * </p>
     * 
     * @param jwtBearer
     *        Configuration options for the <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code> grant type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withJwtBearer(JwtBearerGrant jwtBearer) {
        setJwtBearer(jwtBearer);
        return this;
    }

    /**
     * <p>
     * Configuration options for the <code>refresh_token</code> grant type.
     * </p>
     * 
     * @param refreshToken
     *        Configuration options for the <code>refresh_token</code> grant type.
     */

    public void setRefreshToken(RefreshTokenGrant refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * Configuration options for the <code>refresh_token</code> grant type.
     * </p>
     * 
     * @return Configuration options for the <code>refresh_token</code> grant type.
     */

    public RefreshTokenGrant getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * Configuration options for the <code>refresh_token</code> grant type.
     * </p>
     * 
     * @param refreshToken
     *        Configuration options for the <code>refresh_token</code> grant type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withRefreshToken(RefreshTokenGrant refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:token-exchange</code> grant type.
     * </p>
     * 
     * @param tokenExchange
     *        Configuration options for the <code>urn:ietf:params:oauth:grant-type:token-exchange</code> grant type.
     */

    public void setTokenExchange(TokenExchangeGrant tokenExchange) {
        this.tokenExchange = tokenExchange;
    }

    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:token-exchange</code> grant type.
     * </p>
     * 
     * @return Configuration options for the <code>urn:ietf:params:oauth:grant-type:token-exchange</code> grant type.
     */

    public TokenExchangeGrant getTokenExchange() {
        return this.tokenExchange;
    }

    /**
     * <p>
     * Configuration options for the <code>urn:ietf:params:oauth:grant-type:token-exchange</code> grant type.
     * </p>
     * 
     * @param tokenExchange
     *        Configuration options for the <code>urn:ietf:params:oauth:grant-type:token-exchange</code> grant type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Grant withTokenExchange(TokenExchangeGrant tokenExchange) {
        setTokenExchange(tokenExchange);
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
        if (getAuthorizationCode() != null)
            sb.append("AuthorizationCode: ").append(getAuthorizationCode()).append(",");
        if (getJwtBearer() != null)
            sb.append("JwtBearer: ").append(getJwtBearer()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append(getRefreshToken()).append(",");
        if (getTokenExchange() != null)
            sb.append("TokenExchange: ").append(getTokenExchange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Grant == false)
            return false;
        Grant other = (Grant) obj;
        if (other.getAuthorizationCode() == null ^ this.getAuthorizationCode() == null)
            return false;
        if (other.getAuthorizationCode() != null && other.getAuthorizationCode().equals(this.getAuthorizationCode()) == false)
            return false;
        if (other.getJwtBearer() == null ^ this.getJwtBearer() == null)
            return false;
        if (other.getJwtBearer() != null && other.getJwtBearer().equals(this.getJwtBearer()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getTokenExchange() == null ^ this.getTokenExchange() == null)
            return false;
        if (other.getTokenExchange() != null && other.getTokenExchange().equals(this.getTokenExchange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationCode() == null) ? 0 : getAuthorizationCode().hashCode());
        hashCode = prime * hashCode + ((getJwtBearer() == null) ? 0 : getJwtBearer().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getTokenExchange() == null) ? 0 : getTokenExchange().hashCode());
        return hashCode;
    }

    @Override
    public Grant clone() {
        try {
            return (Grant) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.GrantMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
