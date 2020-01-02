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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
 * </p>
 * <p>
 * For more information about RDS on VMware, see the <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"> <i>RDS on VMware User
 * Guide.</i> </a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/VpnDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the VPN.
     * </p>
     */
    private String vpnId;
    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     */
    private String vpnTunnelOriginatorIP;
    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data center.
     * </p>
     */
    private String vpnGatewayIp;
    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     */
    private String vpnPSK;
    /**
     * <p>
     * The name of the VPN.
     * </p>
     */
    private String vpnName;
    /**
     * <p>
     * The state of the VPN.
     * </p>
     */
    private String vpnState;

    /**
     * <p>
     * The ID of the VPN.
     * </p>
     * 
     * @param vpnId
     *        The ID of the VPN.
     */

    public void setVpnId(String vpnId) {
        this.vpnId = vpnId;
    }

    /**
     * <p>
     * The ID of the VPN.
     * </p>
     * 
     * @return The ID of the VPN.
     */

    public String getVpnId() {
        return this.vpnId;
    }

    /**
     * <p>
     * The ID of the VPN.
     * </p>
     * 
     * @param vpnId
     *        The ID of the VPN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnDetails withVpnId(String vpnId) {
        setVpnId(vpnId);
        return this;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     * 
     * @param vpnTunnelOriginatorIP
     *        The IP address of network traffic from your on-premises data center. A custom AZ receives the network
     *        traffic.
     */

    public void setVpnTunnelOriginatorIP(String vpnTunnelOriginatorIP) {
        this.vpnTunnelOriginatorIP = vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     * 
     * @return The IP address of network traffic from your on-premises data center. A custom AZ receives the network
     *         traffic.
     */

    public String getVpnTunnelOriginatorIP() {
        return this.vpnTunnelOriginatorIP;
    }

    /**
     * <p>
     * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
     * </p>
     * 
     * @param vpnTunnelOriginatorIP
     *        The IP address of network traffic from your on-premises data center. A custom AZ receives the network
     *        traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnDetails withVpnTunnelOriginatorIP(String vpnTunnelOriginatorIP) {
        setVpnTunnelOriginatorIP(vpnTunnelOriginatorIP);
        return this;
    }

    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data center.
     * </p>
     * 
     * @param vpnGatewayIp
     *        The IP address of network traffic from AWS to your on-premises data center.
     */

    public void setVpnGatewayIp(String vpnGatewayIp) {
        this.vpnGatewayIp = vpnGatewayIp;
    }

    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data center.
     * </p>
     * 
     * @return The IP address of network traffic from AWS to your on-premises data center.
     */

    public String getVpnGatewayIp() {
        return this.vpnGatewayIp;
    }

    /**
     * <p>
     * The IP address of network traffic from AWS to your on-premises data center.
     * </p>
     * 
     * @param vpnGatewayIp
     *        The IP address of network traffic from AWS to your on-premises data center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnDetails withVpnGatewayIp(String vpnGatewayIp) {
        setVpnGatewayIp(vpnGatewayIp);
        return this;
    }

    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     * 
     * @param vpnPSK
     *        The preshared key (PSK) for the VPN.
     */

    public void setVpnPSK(String vpnPSK) {
        this.vpnPSK = vpnPSK;
    }

    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     * 
     * @return The preshared key (PSK) for the VPN.
     */

    public String getVpnPSK() {
        return this.vpnPSK;
    }

    /**
     * <p>
     * The preshared key (PSK) for the VPN.
     * </p>
     * 
     * @param vpnPSK
     *        The preshared key (PSK) for the VPN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnDetails withVpnPSK(String vpnPSK) {
        setVpnPSK(vpnPSK);
        return this;
    }

    /**
     * <p>
     * The name of the VPN.
     * </p>
     * 
     * @param vpnName
     *        The name of the VPN.
     */

    public void setVpnName(String vpnName) {
        this.vpnName = vpnName;
    }

    /**
     * <p>
     * The name of the VPN.
     * </p>
     * 
     * @return The name of the VPN.
     */

    public String getVpnName() {
        return this.vpnName;
    }

    /**
     * <p>
     * The name of the VPN.
     * </p>
     * 
     * @param vpnName
     *        The name of the VPN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnDetails withVpnName(String vpnName) {
        setVpnName(vpnName);
        return this;
    }

    /**
     * <p>
     * The state of the VPN.
     * </p>
     * 
     * @param vpnState
     *        The state of the VPN.
     */

    public void setVpnState(String vpnState) {
        this.vpnState = vpnState;
    }

    /**
     * <p>
     * The state of the VPN.
     * </p>
     * 
     * @return The state of the VPN.
     */

    public String getVpnState() {
        return this.vpnState;
    }

    /**
     * <p>
     * The state of the VPN.
     * </p>
     * 
     * @param vpnState
     *        The state of the VPN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnDetails withVpnState(String vpnState) {
        setVpnState(vpnState);
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
        if (getVpnId() != null)
            sb.append("VpnId: ").append(getVpnId()).append(",");
        if (getVpnTunnelOriginatorIP() != null)
            sb.append("VpnTunnelOriginatorIP: ").append(getVpnTunnelOriginatorIP()).append(",");
        if (getVpnGatewayIp() != null)
            sb.append("VpnGatewayIp: ").append(getVpnGatewayIp()).append(",");
        if (getVpnPSK() != null)
            sb.append("VpnPSK: ").append("***Sensitive Data Redacted***").append(",");
        if (getVpnName() != null)
            sb.append("VpnName: ").append(getVpnName()).append(",");
        if (getVpnState() != null)
            sb.append("VpnState: ").append(getVpnState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnDetails == false)
            return false;
        VpnDetails other = (VpnDetails) obj;
        if (other.getVpnId() == null ^ this.getVpnId() == null)
            return false;
        if (other.getVpnId() != null && other.getVpnId().equals(this.getVpnId()) == false)
            return false;
        if (other.getVpnTunnelOriginatorIP() == null ^ this.getVpnTunnelOriginatorIP() == null)
            return false;
        if (other.getVpnTunnelOriginatorIP() != null && other.getVpnTunnelOriginatorIP().equals(this.getVpnTunnelOriginatorIP()) == false)
            return false;
        if (other.getVpnGatewayIp() == null ^ this.getVpnGatewayIp() == null)
            return false;
        if (other.getVpnGatewayIp() != null && other.getVpnGatewayIp().equals(this.getVpnGatewayIp()) == false)
            return false;
        if (other.getVpnPSK() == null ^ this.getVpnPSK() == null)
            return false;
        if (other.getVpnPSK() != null && other.getVpnPSK().equals(this.getVpnPSK()) == false)
            return false;
        if (other.getVpnName() == null ^ this.getVpnName() == null)
            return false;
        if (other.getVpnName() != null && other.getVpnName().equals(this.getVpnName()) == false)
            return false;
        if (other.getVpnState() == null ^ this.getVpnState() == null)
            return false;
        if (other.getVpnState() != null && other.getVpnState().equals(this.getVpnState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnId() == null) ? 0 : getVpnId().hashCode());
        hashCode = prime * hashCode + ((getVpnTunnelOriginatorIP() == null) ? 0 : getVpnTunnelOriginatorIP().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayIp() == null) ? 0 : getVpnGatewayIp().hashCode());
        hashCode = prime * hashCode + ((getVpnPSK() == null) ? 0 : getVpnPSK().hashCode());
        hashCode = prime * hashCode + ((getVpnName() == null) ? 0 : getVpnName().hashCode());
        hashCode = prime * hashCode + ((getVpnState() == null) ? 0 : getVpnState().hashCode());
        return hashCode;
    }

    @Override
    public VpnDetails clone() {
        try {
            return (VpnDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
