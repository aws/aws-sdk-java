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
 * Contains the output of DescribeVpnConnections.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpnConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpnConnection> vpnConnections;

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     * 
     * @return Information about one or more VPN connections.
     */

    public java.util.List<VpnConnection> getVpnConnections() {
        if (vpnConnections == null) {
            vpnConnections = new com.amazonaws.internal.SdkInternalList<VpnConnection>();
        }
        return vpnConnections;
    }

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     * 
     * @param vpnConnections
     *        Information about one or more VPN connections.
     */

    public void setVpnConnections(java.util.Collection<VpnConnection> vpnConnections) {
        if (vpnConnections == null) {
            this.vpnConnections = null;
            return;
        }

        this.vpnConnections = new com.amazonaws.internal.SdkInternalList<VpnConnection>(vpnConnections);
    }

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpnConnections(java.util.Collection)} or {@link #withVpnConnections(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpnConnections
     *        Information about one or more VPN connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnConnectionsResult withVpnConnections(VpnConnection... vpnConnections) {
        if (this.vpnConnections == null) {
            setVpnConnections(new com.amazonaws.internal.SdkInternalList<VpnConnection>(vpnConnections.length));
        }
        for (VpnConnection ele : vpnConnections) {
            this.vpnConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more VPN connections.
     * </p>
     * 
     * @param vpnConnections
     *        Information about one or more VPN connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpnConnectionsResult withVpnConnections(java.util.Collection<VpnConnection> vpnConnections) {
        setVpnConnections(vpnConnections);
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
        if (getVpnConnections() != null)
            sb.append("VpnConnections: ").append(getVpnConnections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpnConnectionsResult == false)
            return false;
        DescribeVpnConnectionsResult other = (DescribeVpnConnectionsResult) obj;
        if (other.getVpnConnections() == null ^ this.getVpnConnections() == null)
            return false;
        if (other.getVpnConnections() != null && other.getVpnConnections().equals(this.getVpnConnections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnections() == null) ? 0 : getVpnConnections().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpnConnectionsResult clone() {
        try {
            return (DescribeVpnConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
