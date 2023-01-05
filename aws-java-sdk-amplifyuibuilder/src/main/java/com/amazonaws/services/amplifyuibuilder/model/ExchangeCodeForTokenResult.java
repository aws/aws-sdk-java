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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ExchangeCodeForToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExchangeCodeForTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The access token.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The date and time when the new access token expires.
     * </p>
     */
    private Integer expiresIn;
    /**
     * <p>
     * The token to use to refresh a previously issued access token that might have expired.
     * </p>
     */
    private String refreshToken;

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

    public ExchangeCodeForTokenResult withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The date and time when the new access token expires.
     * </p>
     * 
     * @param expiresIn
     *        The date and time when the new access token expires.
     */

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * The date and time when the new access token expires.
     * </p>
     * 
     * @return The date and time when the new access token expires.
     */

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * The date and time when the new access token expires.
     * </p>
     * 
     * @param expiresIn
     *        The date and time when the new access token expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExchangeCodeForTokenResult withExpiresIn(Integer expiresIn) {
        setExpiresIn(expiresIn);
        return this;
    }

    /**
     * <p>
     * The token to use to refresh a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshToken
     *        The token to use to refresh a previously issued access token that might have expired.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * The token to use to refresh a previously issued access token that might have expired.
     * </p>
     * 
     * @return The token to use to refresh a previously issued access token that might have expired.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * The token to use to refresh a previously issued access token that might have expired.
     * </p>
     * 
     * @param refreshToken
     *        The token to use to refresh a previously issued access token that might have expired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExchangeCodeForTokenResult withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
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
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExchangeCodeForTokenResult == false)
            return false;
        ExchangeCodeForTokenResult other = (ExchangeCodeForTokenResult) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        return hashCode;
    }

    @Override
    public ExchangeCodeForTokenResult clone() {
        try {
            return (ExchangeCodeForTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
