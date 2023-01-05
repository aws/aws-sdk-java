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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains details about the accepted inbound connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptInboundConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the accepted inbound connection.
     * </p>
     */
    private InboundConnection connection;

    /**
     * <p>
     * Information about the accepted inbound connection.
     * </p>
     * 
     * @param connection
     *        Information about the accepted inbound connection.
     */

    public void setConnection(InboundConnection connection) {
        this.connection = connection;
    }

    /**
     * <p>
     * Information about the accepted inbound connection.
     * </p>
     * 
     * @return Information about the accepted inbound connection.
     */

    public InboundConnection getConnection() {
        return this.connection;
    }

    /**
     * <p>
     * Information about the accepted inbound connection.
     * </p>
     * 
     * @param connection
     *        Information about the accepted inbound connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptInboundConnectionResult withConnection(InboundConnection connection) {
        setConnection(connection);
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
        if (getConnection() != null)
            sb.append("Connection: ").append(getConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptInboundConnectionResult == false)
            return false;
        AcceptInboundConnectionResult other = (AcceptInboundConnectionResult) obj;
        if (other.getConnection() == null ^ this.getConnection() == null)
            return false;
        if (other.getConnection() != null && other.getConnection().equals(this.getConnection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnection() == null) ? 0 : getConnection().hashCode());
        return hashCode;
    }

    @Override
    public AcceptInboundConnectionResult clone() {
        try {
            return (AcceptInboundConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
