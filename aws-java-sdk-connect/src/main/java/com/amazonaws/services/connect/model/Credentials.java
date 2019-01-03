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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The credentials to use for federation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Credentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Credentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * A token generated with an expiration time for the session a user is logged in to Amazon Connect
     * </p>
     */
    private java.util.Date accessTokenExpiration;
    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect instance.
     * </p>
     */
    private String refreshToken;
    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     */
    private java.util.Date refreshTokenExpiration;

    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect
     * </p>
     * 
     * @param accessToken
     *        An access token generated for a federated user to access Amazon Connect
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect
     * </p>
     * 
     * @return An access token generated for a federated user to access Amazon Connect
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * An access token generated for a federated user to access Amazon Connect
     * </p>
     * 
     * @param accessToken
     *        An access token generated for a federated user to access Amazon Connect
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * A token generated with an expiration time for the session a user is logged in to Amazon Connect
     * </p>
     * 
     * @param accessTokenExpiration
     *        A token generated with an expiration time for the session a user is logged in to Amazon Connect
     */

    public void setAccessTokenExpiration(java.util.Date accessTokenExpiration) {
        this.accessTokenExpiration = accessTokenExpiration;
    }

    /**
     * <p>
     * A token generated with an expiration time for the session a user is logged in to Amazon Connect
     * </p>
     * 
     * @return A token generated with an expiration time for the session a user is logged in to Amazon Connect
     */

    public java.util.Date getAccessTokenExpiration() {
        return this.accessTokenExpiration;
    }

    /**
     * <p>
     * A token generated with an expiration time for the session a user is logged in to Amazon Connect
     * </p>
     * 
     * @param accessTokenExpiration
     *        A token generated with an expiration time for the session a user is logged in to Amazon Connect
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withAccessTokenExpiration(java.util.Date accessTokenExpiration) {
        setAccessTokenExpiration(accessTokenExpiration);
        return this;
    }

    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect instance.
     * </p>
     * 
     * @param refreshToken
     *        Renews a token generated for a user to access the Amazon Connect instance.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect instance.
     * </p>
     * 
     * @return Renews a token generated for a user to access the Amazon Connect instance.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * Renews a token generated for a user to access the Amazon Connect instance.
     * </p>
     * 
     * @param refreshToken
     *        Renews a token generated for a user to access the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     * 
     * @param refreshTokenExpiration
     *        Renews the expiration timer for a generated token.
     */

    public void setRefreshTokenExpiration(java.util.Date refreshTokenExpiration) {
        this.refreshTokenExpiration = refreshTokenExpiration;
    }

    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     * 
     * @return Renews the expiration timer for a generated token.
     */

    public java.util.Date getRefreshTokenExpiration() {
        return this.refreshTokenExpiration;
    }

    /**
     * <p>
     * Renews the expiration timer for a generated token.
     * </p>
     * 
     * @param refreshTokenExpiration
     *        Renews the expiration timer for a generated token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Credentials withRefreshTokenExpiration(java.util.Date refreshTokenExpiration) {
        setRefreshTokenExpiration(refreshTokenExpiration);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccessTokenExpiration() != null)
            sb.append("AccessTokenExpiration: ").append(getAccessTokenExpiration()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getRefreshTokenExpiration() != null)
            sb.append("RefreshTokenExpiration: ").append(getRefreshTokenExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Credentials == false)
            return false;
        Credentials other = (Credentials) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getAccessTokenExpiration() == null ^ this.getAccessTokenExpiration() == null)
            return false;
        if (other.getAccessTokenExpiration() != null && other.getAccessTokenExpiration().equals(this.getAccessTokenExpiration()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getRefreshTokenExpiration() == null ^ this.getRefreshTokenExpiration() == null)
            return false;
        if (other.getRefreshTokenExpiration() != null && other.getRefreshTokenExpiration().equals(this.getRefreshTokenExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getAccessTokenExpiration() == null) ? 0 : getAccessTokenExpiration().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getRefreshTokenExpiration() == null) ? 0 : getRefreshTokenExpiration().hashCode());
        return hashCode;
    }

    @Override
    public Credentials clone() {
        try {
            return (Credentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
