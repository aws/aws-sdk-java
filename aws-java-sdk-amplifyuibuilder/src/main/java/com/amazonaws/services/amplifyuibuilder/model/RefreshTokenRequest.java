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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/RefreshToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The third-party provider for the token. The only valid value is <code>figma</code>.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * Information about the refresh token request.
     * </p>
     */
    private RefreshTokenRequestBody refreshTokenBody;

    /**
     * <p>
     * The third-party provider for the token. The only valid value is <code>figma</code>.
     * </p>
     * 
     * @param provider
     *        The third-party provider for the token. The only valid value is <code>figma</code>.
     * @see TokenProviders
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The third-party provider for the token. The only valid value is <code>figma</code>.
     * </p>
     * 
     * @return The third-party provider for the token. The only valid value is <code>figma</code>.
     * @see TokenProviders
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The third-party provider for the token. The only valid value is <code>figma</code>.
     * </p>
     * 
     * @param provider
     *        The third-party provider for the token. The only valid value is <code>figma</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TokenProviders
     */

    public RefreshTokenRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The third-party provider for the token. The only valid value is <code>figma</code>.
     * </p>
     * 
     * @param provider
     *        The third-party provider for the token. The only valid value is <code>figma</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TokenProviders
     */

    public RefreshTokenRequest withProvider(TokenProviders provider) {
        this.provider = provider.toString();
        return this;
    }

    /**
     * <p>
     * Information about the refresh token request.
     * </p>
     * 
     * @param refreshTokenBody
     *        Information about the refresh token request.
     */

    public void setRefreshTokenBody(RefreshTokenRequestBody refreshTokenBody) {
        this.refreshTokenBody = refreshTokenBody;
    }

    /**
     * <p>
     * Information about the refresh token request.
     * </p>
     * 
     * @return Information about the refresh token request.
     */

    public RefreshTokenRequestBody getRefreshTokenBody() {
        return this.refreshTokenBody;
    }

    /**
     * <p>
     * Information about the refresh token request.
     * </p>
     * 
     * @param refreshTokenBody
     *        Information about the refresh token request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshTokenRequest withRefreshTokenBody(RefreshTokenRequestBody refreshTokenBody) {
        setRefreshTokenBody(refreshTokenBody);
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
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getRefreshTokenBody() != null)
            sb.append("RefreshTokenBody: ").append(getRefreshTokenBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshTokenRequest == false)
            return false;
        RefreshTokenRequest other = (RefreshTokenRequest) obj;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getRefreshTokenBody() == null ^ this.getRefreshTokenBody() == null)
            return false;
        if (other.getRefreshTokenBody() != null && other.getRefreshTokenBody().equals(this.getRefreshTokenBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getRefreshTokenBody() == null) ? 0 : getRefreshTokenBody().hashCode());
        return hashCode;
    }

    @Override
    public RefreshTokenRequest clone() {
        return (RefreshTokenRequest) super.clone();
    }

}
