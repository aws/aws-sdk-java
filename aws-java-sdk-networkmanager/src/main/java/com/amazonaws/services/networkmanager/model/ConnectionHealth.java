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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes connection health.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ConnectionHealth" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connection type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The connection status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the status was last updated.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The connection type.
     * </p>
     * 
     * @param type
     *        The connection type.
     * @see ConnectionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The connection type.
     * </p>
     * 
     * @return The connection type.
     * @see ConnectionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The connection type.
     * </p>
     * 
     * @param type
     *        The connection type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public ConnectionHealth withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The connection type.
     * </p>
     * 
     * @param type
     *        The connection type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public ConnectionHealth withType(ConnectionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The connection status.
     * </p>
     * 
     * @param status
     *        The connection status.
     * @see ConnectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The connection status.
     * </p>
     * 
     * @return The connection status.
     * @see ConnectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The connection status.
     * </p>
     * 
     * @param status
     *        The connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public ConnectionHealth withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The connection status.
     * </p>
     * 
     * @param status
     *        The connection status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionStatus
     */

    public ConnectionHealth withStatus(ConnectionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time the status was last updated.
     * </p>
     * 
     * @param timestamp
     *        The time the status was last updated.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the status was last updated.
     * </p>
     * 
     * @return The time the status was last updated.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time the status was last updated.
     * </p>
     * 
     * @param timestamp
     *        The time the status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionHealth withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionHealth == false)
            return false;
        ConnectionHealth other = (ConnectionHealth) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionHealth clone() {
        try {
            return (ConnectionHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ConnectionHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
