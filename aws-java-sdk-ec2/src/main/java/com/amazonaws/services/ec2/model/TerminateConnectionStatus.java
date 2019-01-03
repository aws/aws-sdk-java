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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a terminated Client VPN endpoint client connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TerminateConnectionStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateConnectionStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The state of the client connection.
     * </p>
     */
    private ClientVpnConnectionStatus previousStatus;
    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     */
    private ClientVpnConnectionStatus currentStatus;

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the client connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * 
     * @return The ID of the client connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the client connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the client connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateConnectionStatus withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The state of the client connection.
     * </p>
     * 
     * @param previousStatus
     *        The state of the client connection.
     */

    public void setPreviousStatus(ClientVpnConnectionStatus previousStatus) {
        this.previousStatus = previousStatus;
    }

    /**
     * <p>
     * The state of the client connection.
     * </p>
     * 
     * @return The state of the client connection.
     */

    public ClientVpnConnectionStatus getPreviousStatus() {
        return this.previousStatus;
    }

    /**
     * <p>
     * The state of the client connection.
     * </p>
     * 
     * @param previousStatus
     *        The state of the client connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateConnectionStatus withPreviousStatus(ClientVpnConnectionStatus previousStatus) {
        setPreviousStatus(previousStatus);
        return this;
    }

    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     * 
     * @param currentStatus
     *        A message about the status of the client connection, if applicable.
     */

    public void setCurrentStatus(ClientVpnConnectionStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     * 
     * @return A message about the status of the client connection, if applicable.
     */

    public ClientVpnConnectionStatus getCurrentStatus() {
        return this.currentStatus;
    }

    /**
     * <p>
     * A message about the status of the client connection, if applicable.
     * </p>
     * 
     * @param currentStatus
     *        A message about the status of the client connection, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateConnectionStatus withCurrentStatus(ClientVpnConnectionStatus currentStatus) {
        setCurrentStatus(currentStatus);
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
        if (getPreviousStatus() != null)
            sb.append("PreviousStatus: ").append(getPreviousStatus()).append(",");
        if (getCurrentStatus() != null)
            sb.append("CurrentStatus: ").append(getCurrentStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateConnectionStatus == false)
            return false;
        TerminateConnectionStatus other = (TerminateConnectionStatus) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getPreviousStatus() == null ^ this.getPreviousStatus() == null)
            return false;
        if (other.getPreviousStatus() != null && other.getPreviousStatus().equals(this.getPreviousStatus()) == false)
            return false;
        if (other.getCurrentStatus() == null ^ this.getCurrentStatus() == null)
            return false;
        if (other.getCurrentStatus() != null && other.getCurrentStatus().equals(this.getCurrentStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getPreviousStatus() == null) ? 0 : getPreviousStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentStatus() == null) ? 0 : getCurrentStatus().hashCode());
        return hashCode;
    }

    @Override
    public TerminateConnectionStatus clone() {
        try {
            return (TerminateConnectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
