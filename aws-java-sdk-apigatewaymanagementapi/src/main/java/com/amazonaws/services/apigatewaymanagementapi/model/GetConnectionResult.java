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
package com.amazonaws.services.apigatewaymanagementapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apigatewaymanagementapi-2018-11-29/GetConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time in ISO 8601 format for when the connection was established.
     * </p>
     */
    private java.util.Date connectedAt;

    private Identity identity;
    /**
     * <p>
     * The time in ISO 8601 format for when the connection was last active.
     * </p>
     */
    private java.util.Date lastActiveAt;

    /**
     * <p>
     * The time in ISO 8601 format for when the connection was established.
     * </p>
     * 
     * @param connectedAt
     *        The time in ISO 8601 format for when the connection was established.
     */

    public void setConnectedAt(java.util.Date connectedAt) {
        this.connectedAt = connectedAt;
    }

    /**
     * <p>
     * The time in ISO 8601 format for when the connection was established.
     * </p>
     * 
     * @return The time in ISO 8601 format for when the connection was established.
     */

    public java.util.Date getConnectedAt() {
        return this.connectedAt;
    }

    /**
     * <p>
     * The time in ISO 8601 format for when the connection was established.
     * </p>
     * 
     * @param connectedAt
     *        The time in ISO 8601 format for when the connection was established.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionResult withConnectedAt(java.util.Date connectedAt) {
        setConnectedAt(connectedAt);
        return this;
    }

    /**
     * @param identity
     */

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    /**
     * @return
     */

    public Identity getIdentity() {
        return this.identity;
    }

    /**
     * @param identity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionResult withIdentity(Identity identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * The time in ISO 8601 format for when the connection was last active.
     * </p>
     * 
     * @param lastActiveAt
     *        The time in ISO 8601 format for when the connection was last active.
     */

    public void setLastActiveAt(java.util.Date lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
    }

    /**
     * <p>
     * The time in ISO 8601 format for when the connection was last active.
     * </p>
     * 
     * @return The time in ISO 8601 format for when the connection was last active.
     */

    public java.util.Date getLastActiveAt() {
        return this.lastActiveAt;
    }

    /**
     * <p>
     * The time in ISO 8601 format for when the connection was last active.
     * </p>
     * 
     * @param lastActiveAt
     *        The time in ISO 8601 format for when the connection was last active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionResult withLastActiveAt(java.util.Date lastActiveAt) {
        setLastActiveAt(lastActiveAt);
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
        if (getConnectedAt() != null)
            sb.append("ConnectedAt: ").append(getConnectedAt()).append(",");
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getLastActiveAt() != null)
            sb.append("LastActiveAt: ").append(getLastActiveAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionResult == false)
            return false;
        GetConnectionResult other = (GetConnectionResult) obj;
        if (other.getConnectedAt() == null ^ this.getConnectedAt() == null)
            return false;
        if (other.getConnectedAt() != null && other.getConnectedAt().equals(this.getConnectedAt()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getLastActiveAt() == null ^ this.getLastActiveAt() == null)
            return false;
        if (other.getLastActiveAt() != null && other.getLastActiveAt().equals(this.getLastActiveAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectedAt() == null) ? 0 : getConnectedAt().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getLastActiveAt() == null) ? 0 : getLastActiveAt().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectionResult clone() {
        try {
            return (GetConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
