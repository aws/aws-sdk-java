/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of a connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ConnectionState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last time the connection status was updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;

    /**
     * <p>
     * The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>.
     * </p>
     * 
     * @param status
     *        The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>
     *        .
     * @see ConnectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>.
     * </p>
     * 
     * @return The connection status of the tunnel. Valid values are <code>CONNECTED</code> and
     *         <code>DISCONNECTED</code>.
     * @see ConnectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>.
     * </p>
     * 
     * @param status
     *        The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public ConnectionState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>.
     * </p>
     * 
     * @param status
     *        The connection status of the tunnel. Valid values are <code>CONNECTED</code> and <code>DISCONNECTED</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public ConnectionState withStatus(ConnectionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The last time the connection status was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The last time the connection status was updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The last time the connection status was updated.
     * </p>
     * 
     * @return The last time the connection status was updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The last time the connection status was updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The last time the connection status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionState withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionState == false)
            return false;
        ConnectionState other = (ConnectionState) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionState clone() {
        try {
            return (ConnectionState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsecuretunneling.model.transform.ConnectionStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
