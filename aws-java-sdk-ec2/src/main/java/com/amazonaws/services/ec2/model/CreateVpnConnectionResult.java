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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of CreateVpnConnection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpnConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the VPN connection.
     * </p>
     */
    private VpnConnection vpnConnection;

    /**
     * <p>
     * Information about the VPN connection.
     * </p>
     * 
     * @param vpnConnection
     *        Information about the VPN connection.
     */

    public void setVpnConnection(VpnConnection vpnConnection) {
        this.vpnConnection = vpnConnection;
    }

    /**
     * <p>
     * Information about the VPN connection.
     * </p>
     * 
     * @return Information about the VPN connection.
     */

    public VpnConnection getVpnConnection() {
        return this.vpnConnection;
    }

    /**
     * <p>
     * Information about the VPN connection.
     * </p>
     * 
     * @param vpnConnection
     *        Information about the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpnConnectionResult withVpnConnection(VpnConnection vpnConnection) {
        setVpnConnection(vpnConnection);
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
        if (getVpnConnection() != null)
            sb.append("VpnConnection: ").append(getVpnConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpnConnectionResult == false)
            return false;
        CreateVpnConnectionResult other = (CreateVpnConnectionResult) obj;
        if (other.getVpnConnection() == null ^ this.getVpnConnection() == null)
            return false;
        if (other.getVpnConnection() != null && other.getVpnConnection().equals(this.getVpnConnection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnection() == null) ? 0 : getVpnConnection().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpnConnectionResult clone() {
        try {
            return (CreateVpnConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
