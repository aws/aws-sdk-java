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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * Information about the connection.
     * </p>
     */
    private ConnectionDetails connectionDetails;

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @return The ID of the connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionResult withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * Information about the connection.
     * </p>
     * 
     * @param connectionDetails
     *        Information about the connection.
     */

    public void setConnectionDetails(ConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
    }

    /**
     * <p>
     * Information about the connection.
     * </p>
     * 
     * @return Information about the connection.
     */

    public ConnectionDetails getConnectionDetails() {
        return this.connectionDetails;
    }

    /**
     * <p>
     * Information about the connection.
     * </p>
     * 
     * @param connectionDetails
     *        Information about the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionResult withConnectionDetails(ConnectionDetails connectionDetails) {
        setConnectionDetails(connectionDetails);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getConnectionDetails() != null)
            sb.append("ConnectionDetails: ").append(getConnectionDetails());
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
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionDetails() == null ^ this.getConnectionDetails() == null)
            return false;
        if (other.getConnectionDetails() != null && other.getConnectionDetails().equals(this.getConnectionDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionDetails() == null) ? 0 : getConnectionDetails().hashCode());
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
