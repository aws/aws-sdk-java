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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/GetClusterSessionCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterSessionCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The credentials that you can use to connect to cluster endpoints that support username-based and password-based
     * authentication.
     * </p>
     */
    private Credentials credentials;
    /**
     * <p>
     * The time when the credentials that are returned by the <code>GetClusterSessionCredentials</code> API expire.
     * </p>
     */
    private java.util.Date expiresAt;

    /**
     * <p>
     * The credentials that you can use to connect to cluster endpoints that support username-based and password-based
     * authentication.
     * </p>
     * 
     * @param credentials
     *        The credentials that you can use to connect to cluster endpoints that support username-based and
     *        password-based authentication.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials that you can use to connect to cluster endpoints that support username-based and password-based
     * authentication.
     * </p>
     * 
     * @return The credentials that you can use to connect to cluster endpoints that support username-based and
     *         password-based authentication.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The credentials that you can use to connect to cluster endpoints that support username-based and password-based
     * authentication.
     * </p>
     * 
     * @param credentials
     *        The credentials that you can use to connect to cluster endpoints that support username-based and
     *        password-based authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterSessionCredentialsResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The time when the credentials that are returned by the <code>GetClusterSessionCredentials</code> API expire.
     * </p>
     * 
     * @param expiresAt
     *        The time when the credentials that are returned by the <code>GetClusterSessionCredentials</code> API
     *        expire.
     */

    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * The time when the credentials that are returned by the <code>GetClusterSessionCredentials</code> API expire.
     * </p>
     * 
     * @return The time when the credentials that are returned by the <code>GetClusterSessionCredentials</code> API
     *         expire.
     */

    public java.util.Date getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * The time when the credentials that are returned by the <code>GetClusterSessionCredentials</code> API expire.
     * </p>
     * 
     * @param expiresAt
     *        The time when the credentials that are returned by the <code>GetClusterSessionCredentials</code> API
     *        expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterSessionCredentialsResult withExpiresAt(java.util.Date expiresAt) {
        setExpiresAt(expiresAt);
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
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: ").append(getExpiresAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClusterSessionCredentialsResult == false)
            return false;
        GetClusterSessionCredentialsResult other = (GetClusterSessionCredentialsResult) obj;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        return hashCode;
    }

    @Override
    public GetClusterSessionCredentialsResult clone() {
        try {
            return (GetClusterSessionCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
