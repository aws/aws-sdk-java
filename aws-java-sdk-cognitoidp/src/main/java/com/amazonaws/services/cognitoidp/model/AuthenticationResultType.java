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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authentication result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AuthenticationResultType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationResultType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access token.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     */
    private Integer expiresIn;
    /**
     * <p>
     * The token type.
     * </p>
     */
    private String tokenType;
    /**
     * <p>
     * The refresh token.
     * </p>
     */
    private String refreshToken;
    /**
     * <p>
     * The ID token.
     * </p>
     */
    private String idToken;
    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     */
    private NewDeviceMetadataType newDeviceMetadata;

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @param accessToken
     *        The access token.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @return The access token.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The access token.
     * </p>
     * 
     * @param accessToken
     *        The access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResultType withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     * 
     * @param expiresIn
     *        The expiration period of the authentication result in seconds.
     */

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     * 
     * @return The expiration period of the authentication result in seconds.
     */

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * The expiration period of the authentication result in seconds.
     * </p>
     * 
     * @param expiresIn
     *        The expiration period of the authentication result in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResultType withExpiresIn(Integer expiresIn) {
        setExpiresIn(expiresIn);
        return this;
    }

    /**
     * <p>
     * The token type.
     * </p>
     * 
     * @param tokenType
     *        The token type.
     */

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * <p>
     * The token type.
     * </p>
     * 
     * @return The token type.
     */

    public String getTokenType() {
        return this.tokenType;
    }

    /**
     * <p>
     * The token type.
     * </p>
     * 
     * @param tokenType
     *        The token type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResultType withTokenType(String tokenType) {
        setTokenType(tokenType);
        return this;
    }

    /**
     * <p>
     * The refresh token.
     * </p>
     * 
     * @param refreshToken
     *        The refresh token.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * The refresh token.
     * </p>
     * 
     * @return The refresh token.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * The refresh token.
     * </p>
     * 
     * @param refreshToken
     *        The refresh token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResultType withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * The ID token.
     * </p>
     * 
     * @param idToken
     *        The ID token.
     */

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * <p>
     * The ID token.
     * </p>
     * 
     * @return The ID token.
     */

    public String getIdToken() {
        return this.idToken;
    }

    /**
     * <p>
     * The ID token.
     * </p>
     * 
     * @param idToken
     *        The ID token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResultType withIdToken(String idToken) {
        setIdToken(idToken);
        return this;
    }

    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     * 
     * @param newDeviceMetadata
     *        The new device metadata from an authentication result.
     */

    public void setNewDeviceMetadata(NewDeviceMetadataType newDeviceMetadata) {
        this.newDeviceMetadata = newDeviceMetadata;
    }

    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     * 
     * @return The new device metadata from an authentication result.
     */

    public NewDeviceMetadataType getNewDeviceMetadata() {
        return this.newDeviceMetadata;
    }

    /**
     * <p>
     * The new device metadata from an authentication result.
     * </p>
     * 
     * @param newDeviceMetadata
     *        The new device metadata from an authentication result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationResultType withNewDeviceMetadata(NewDeviceMetadataType newDeviceMetadata) {
        setNewDeviceMetadata(newDeviceMetadata);
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
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: ").append(getExpiresIn()).append(",");
        if (getTokenType() != null)
            sb.append("TokenType: ").append(getTokenType()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdToken() != null)
            sb.append("IdToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getNewDeviceMetadata() != null)
            sb.append("NewDeviceMetadata: ").append(getNewDeviceMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationResultType == false)
            return false;
        AuthenticationResultType other = (AuthenticationResultType) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        if (other.getTokenType() == null ^ this.getTokenType() == null)
            return false;
        if (other.getTokenType() != null && other.getTokenType().equals(this.getTokenType()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getIdToken() == null ^ this.getIdToken() == null)
            return false;
        if (other.getIdToken() != null && other.getIdToken().equals(this.getIdToken()) == false)
            return false;
        if (other.getNewDeviceMetadata() == null ^ this.getNewDeviceMetadata() == null)
            return false;
        if (other.getNewDeviceMetadata() != null && other.getNewDeviceMetadata().equals(this.getNewDeviceMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getIdToken() == null) ? 0 : getIdToken().hashCode());
        hashCode = prime * hashCode + ((getNewDeviceMetadata() == null) ? 0 : getNewDeviceMetadata().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationResultType clone() {
        try {
            return (AuthenticationResultType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AuthenticationResultTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
