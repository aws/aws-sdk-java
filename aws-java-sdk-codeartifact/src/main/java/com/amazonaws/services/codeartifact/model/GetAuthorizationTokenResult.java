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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetAuthorizationToken" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAuthorizationTokenResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The returned authentication token.
     * </p>
     */
    private String authorizationToken;
    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token expires.
     * </p>
     */
    private java.util.Date expiration;

    /**
     * <p>
     * The returned authentication token.
     * </p>
     * 
     * @param authorizationToken
     *        The returned authentication token.
     */

    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    /**
     * <p>
     * The returned authentication token.
     * </p>
     * 
     * @return The returned authentication token.
     */

    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    /**
     * <p>
     * The returned authentication token.
     * </p>
     * 
     * @param authorizationToken
     *        The returned authentication token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizationTokenResult withAuthorizationToken(String authorizationToken) {
        setAuthorizationToken(authorizationToken);
        return this;
    }

    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token expires.
     * </p>
     * 
     * @param expiration
     *        A timestamp that specifies the date and time the authorization token expires.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token expires.
     * </p>
     * 
     * @return A timestamp that specifies the date and time the authorization token expires.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * A timestamp that specifies the date and time the authorization token expires.
     * </p>
     * 
     * @param expiration
     *        A timestamp that specifies the date and time the authorization token expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizationTokenResult withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
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
        if (getAuthorizationToken() != null)
            sb.append("AuthorizationToken: ").append(getAuthorizationToken()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizationTokenResult == false)
            return false;
        GetAuthorizationTokenResult other = (GetAuthorizationTokenResult) obj;
        if (other.getAuthorizationToken() == null ^ this.getAuthorizationToken() == null)
            return false;
        if (other.getAuthorizationToken() != null && other.getAuthorizationToken().equals(this.getAuthorizationToken()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationToken() == null) ? 0 : getAuthorizationToken().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthorizationTokenResult clone() {
        try {
            return (GetAuthorizationTokenResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
