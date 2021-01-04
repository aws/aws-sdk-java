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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Token ID.
     * </p>
     */
    private String tokenId;
    /**
     * <p>
     * Token type.
     * </p>
     */
    private String tokenType;
    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     */
    private String token;

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @param tokenId
     *        Token ID.
     */

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @return Token ID.
     */

    public String getTokenId() {
        return this.tokenId;
    }

    /**
     * <p>
     * Token ID.
     * </p>
     * 
     * @param tokenId
     *        Token ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenResult withTokenId(String tokenId) {
        setTokenId(tokenId);
        return this;
    }

    /**
     * <p>
     * Token type.
     * </p>
     * 
     * @param tokenType
     *        Token type.
     * @see TokenType
     */

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * <p>
     * Token type.
     * </p>
     * 
     * @return Token type.
     * @see TokenType
     */

    public String getTokenType() {
        return this.tokenType;
    }

    /**
     * <p>
     * Token type.
     * </p>
     * 
     * @param tokenType
     *        Token type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TokenType
     */

    public CreateTokenResult withTokenType(String tokenType) {
        setTokenType(tokenType);
        return this;
    }

    /**
     * <p>
     * Token type.
     * </p>
     * 
     * @param tokenType
     *        Token type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TokenType
     */

    public CreateTokenResult withTokenType(TokenType tokenType) {
        this.tokenType = tokenType.toString();
        return this;
    }

    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     * 
     * @param token
     *        Refresh token, encoded as a JWT token.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     * 
     * @return Refresh token, encoded as a JWT token.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * Refresh token, encoded as a JWT token.
     * </p>
     * 
     * @param token
     *        Refresh token, encoded as a JWT token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenResult withToken(String token) {
        setToken(token);
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
        if (getTokenId() != null)
            sb.append("TokenId: ").append(getTokenId()).append(",");
        if (getTokenType() != null)
            sb.append("TokenType: ").append(getTokenType()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken());
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
        if (other.getTokenId() == null ^ this.getTokenId() == null)
            return false;
        if (other.getTokenId() != null && other.getTokenId().equals(this.getTokenId()) == false)
            return false;
        if (other.getTokenType() == null ^ this.getTokenType() == null)
            return false;
        if (other.getTokenType() != null && other.getTokenType().equals(this.getTokenType()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        hashCode = prime * hashCode + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
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
