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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/CreateToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An opaque token to access AWS SSO resources assigned to a user.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * Used to notify the client that the returned token is an access token. The supported type is
     * <code>BearerToken</code>.
     * </p>
     */
    private String tokenType;
    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     */
    private Integer expiresIn;
    /**
     * <p>
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * </p>
     */
    private String refreshToken;
    /**
     * <p>
     * The identifier of the user that associated with the access token, if present.
     * </p>
     */
    private String idToken;

    /**
     * <p>
     * An opaque token to access AWS SSO resources assigned to a user.
     * </p>
     * 
     * @param accessToken
     *        An opaque token to access AWS SSO resources assigned to a user.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * An opaque token to access AWS SSO resources assigned to a user.
     * </p>
     * 
     * @return An opaque token to access AWS SSO resources assigned to a user.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * An opaque token to access AWS SSO resources assigned to a user.
     * </p>
     * 
     * @param accessToken
     *        An opaque token to access AWS SSO resources assigned to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenResult withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * Used to notify the client that the returned token is an access token. The supported type is
     * <code>BearerToken</code>.
     * </p>
     * 
     * @param tokenType
     *        Used to notify the client that the returned token is an access token. The supported type is
     *        <code>BearerToken</code>.
     */

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * <p>
     * Used to notify the client that the returned token is an access token. The supported type is
     * <code>BearerToken</code>.
     * </p>
     * 
     * @return Used to notify the client that the returned token is an access token. The supported type is
     *         <code>BearerToken</code>.
     */

    public String getTokenType() {
        return this.tokenType;
    }

    /**
     * <p>
     * Used to notify the client that the returned token is an access token. The supported type is
     * <code>BearerToken</code>.
     * </p>
     * 
     * @param tokenType
     *        Used to notify the client that the returned token is an access token. The supported type is
     *        <code>BearerToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenResult withTokenType(String tokenType) {
        setTokenType(tokenType);
        return this;
    }

    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     * 
     * @param expiresIn
     *        Indicates the time in seconds when an access token will expire.
     */

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     * 
     * @return Indicates the time in seconds when an access token will expire.
     */

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     * 
     * @param expiresIn
     *        Indicates the time in seconds when an access token will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenResult withExpiresIn(Integer expiresIn) {
        setExpiresIn(expiresIn);
        return this;
    }

    /**
     * <p>
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshToken
     *        A token that, if present, can be used to refresh a previously issued access token that might have expired.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * </p>
     * 
     * @return A token that, if present, can be used to refresh a previously issued access token that might have
     *         expired.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshToken
     *        A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenResult withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the user that associated with the access token, if present.
     * </p>
     * 
     * @param idToken
     *        The identifier of the user that associated with the access token, if present.
     */

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * <p>
     * The identifier of the user that associated with the access token, if present.
     * </p>
     * 
     * @return The identifier of the user that associated with the access token, if present.
     */

    public String getIdToken() {
        return this.idToken;
    }

    /**
     * <p>
     * The identifier of the user that associated with the access token, if present.
     * </p>
     * 
     * @param idToken
     *        The identifier of the user that associated with the access token, if present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenResult withIdToken(String idToken) {
        setIdToken(idToken);
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
            sb.append("AccessToken: ").append(getAccessToken()).append(",");
        if (getTokenType() != null)
            sb.append("TokenType: ").append(getTokenType()).append(",");
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: ").append(getExpiresIn()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append(getRefreshToken()).append(",");
        if (getIdToken() != null)
            sb.append("IdToken: ").append(getIdToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTokenResult == false)
            return false;
        CreateTokenResult other = (CreateTokenResult) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getTokenType() == null ^ this.getTokenType() == null)
            return false;
        if (other.getTokenType() != null && other.getTokenType().equals(this.getTokenType()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getIdToken() == null ^ this.getIdToken() == null)
            return false;
        if (other.getIdToken() != null && other.getIdToken().equals(this.getIdToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getIdToken() == null) ? 0 : getIdToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateTokenResult clone() {
        try {
            return (CreateTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
