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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/GetManagedEndpointSessionCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetManagedEndpointSessionCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the session token returned.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The structure containing the session credentials.
     * </p>
     */
    private Credentials credentials;
    /**
     * <p>
     * The date and time when the session token will expire.
     * </p>
     */
    private java.util.Date expiresAt;

    /**
     * <p>
     * The identifier of the session token returned.
     * </p>
     * 
     * @param id
     *        The identifier of the session token returned.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the session token returned.
     * </p>
     * 
     * @return The identifier of the session token returned.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the session token returned.
     * </p>
     * 
     * @param id
     *        The identifier of the session token returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The structure containing the session credentials.
     * </p>
     * 
     * @param credentials
     *        The structure containing the session credentials.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The structure containing the session credentials.
     * </p>
     * 
     * @return The structure containing the session credentials.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The structure containing the session credentials.
     * </p>
     * 
     * @param credentials
     *        The structure containing the session credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The date and time when the session token will expire.
     * </p>
     * 
     * @param expiresAt
     *        The date and time when the session token will expire.
     */

    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * The date and time when the session token will expire.
     * </p>
     * 
     * @return The date and time when the session token will expire.
     */

    public java.util.Date getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * The date and time when the session token will expire.
     * </p>
     * 
     * @param expiresAt
     *        The date and time when the session token will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedEndpointSessionCredentialsResult withExpiresAt(java.util.Date expiresAt) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof GetManagedEndpointSessionCredentialsResult == false)
            return false;
        GetManagedEndpointSessionCredentialsResult other = (GetManagedEndpointSessionCredentialsResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        return hashCode;
    }

    @Override
    public GetManagedEndpointSessionCredentialsResult clone() {
        try {
            return (GetManagedEndpointSessionCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
