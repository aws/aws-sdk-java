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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssumeImpersonationRole" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeImpersonationRoleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The authentication token for the impersonation role.
     * </p>
     */
    private String token;
    /**
     * <p>
     * The authentication token's validity, in seconds.
     * </p>
     */
    private Long expiresIn;

    /**
     * <p>
     * The authentication token for the impersonation role.
     * </p>
     * 
     * @param token
     *        The authentication token for the impersonation role.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The authentication token for the impersonation role.
     * </p>
     * 
     * @return The authentication token for the impersonation role.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The authentication token for the impersonation role.
     * </p>
     * 
     * @param token
     *        The authentication token for the impersonation role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeImpersonationRoleResult withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * The authentication token's validity, in seconds.
     * </p>
     * 
     * @param expiresIn
     *        The authentication token's validity, in seconds.
     */

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * The authentication token's validity, in seconds.
     * </p>
     * 
     * @return The authentication token's validity, in seconds.
     */

    public Long getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * The authentication token's validity, in seconds.
     * </p>
     * 
     * @param expiresIn
     *        The authentication token's validity, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeImpersonationRoleResult withExpiresIn(Long expiresIn) {
        setExpiresIn(expiresIn);
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
        if (getToken() != null)
            sb.append("Token: ").append(getToken()).append(",");
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: ").append(getExpiresIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeImpersonationRoleResult == false)
            return false;
        AssumeImpersonationRoleResult other = (AssumeImpersonationRoleResult) obj;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        return hashCode;
    }

    @Override
    public AssumeImpersonationRoleResult clone() {
        try {
            return (AssumeImpersonationRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
