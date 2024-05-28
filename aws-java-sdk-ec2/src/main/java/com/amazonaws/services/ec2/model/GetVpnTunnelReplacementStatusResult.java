/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpnTunnelReplacementStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the Site-to-Site VPN connection.
     * </p>
     */
    private String vpnConnectionId;
    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     */
    private String customerGatewayId;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String vpnGatewayId;
    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     */
    private String vpnTunnelOutsideIpAddress;
    /**
     * <p>
     * Get details of pending tunnel endpoint maintenance.
     * </p>
     */
    private MaintenanceDetails maintenanceDetails;

    /**
     * <p>
     * The ID of the Site-to-Site VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the Site-to-Site VPN connection.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the Site-to-Site VPN connection.
     * </p>
     * 
     * @return The ID of the Site-to-Site VPN connection.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the Site-to-Site VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the Site-to-Site VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnTunnelReplacementStatusResult withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway associated with the VPN connection.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     * 
     * @return The ID of the transit gateway associated with the VPN connection.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway associated with the VPN connection.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway associated with the VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnTunnelReplacementStatusResult withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     */

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @return The ID of the customer gateway.
     */

    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnTunnelReplacementStatusResult withCustomerGatewayId(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway.
     */

    public void setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param vpnGatewayId
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnTunnelReplacementStatusResult withVpnGatewayId(String vpnGatewayId) {
        setVpnGatewayId(vpnGatewayId);
        return this;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * 
     * @param vpnTunnelOutsideIpAddress
     *        The external IP address of the VPN tunnel.
     */

    public void setVpnTunnelOutsideIpAddress(String vpnTunnelOutsideIpAddress) {
        this.vpnTunnelOutsideIpAddress = vpnTunnelOutsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * 
     * @return The external IP address of the VPN tunnel.
     */

    public String getVpnTunnelOutsideIpAddress() {
        return this.vpnTunnelOutsideIpAddress;
    }

    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     * 
     * @param vpnTunnelOutsideIpAddress
     *        The external IP address of the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnTunnelReplacementStatusResult withVpnTunnelOutsideIpAddress(String vpnTunnelOutsideIpAddress) {
        setVpnTunnelOutsideIpAddress(vpnTunnelOutsideIpAddress);
        return this;
    }

    /**
     * <p>
     * Get details of pending tunnel endpoint maintenance.
     * </p>
     * 
     * @param maintenanceDetails
     *        Get details of pending tunnel endpoint maintenance.
     */

    public void setMaintenanceDetails(MaintenanceDetails maintenanceDetails) {
        this.maintenanceDetails = maintenanceDetails;
    }

    /**
     * <p>
     * Get details of pending tunnel endpoint maintenance.
     * </p>
     * 
     * @return Get details of pending tunnel endpoint maintenance.
     */

    public MaintenanceDetails getMaintenanceDetails() {
        return this.maintenanceDetails;
    }

    /**
     * <p>
     * Get details of pending tunnel endpoint maintenance.
     * </p>
     * 
     * @param maintenanceDetails
     *        Get details of pending tunnel endpoint maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnTunnelReplacementStatusResult withMaintenanceDetails(MaintenanceDetails maintenanceDetails) {
        setMaintenanceDetails(maintenanceDetails);
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
        if (getVpnConnectionId() != null)
            sb.append("VpnConnectionId: ").append(getVpnConnectionId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: ").append(getCustomerGatewayId()).append(",");
        if (getVpnGatewayId() != null)
            sb.append("VpnGatewayId: ").append(getVpnGatewayId()).append(",");
        if (getVpnTunnelOutsideIpAddress() != null)
            sb.append("VpnTunnelOutsideIpAddress: ").append(getVpnTunnelOutsideIpAddress()).append(",");
        if (getMaintenanceDetails() != null)
            sb.append("MaintenanceDetails: ").append(getMaintenanceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVpnTunnelReplacementStatusResult == false)
            return false;
        GetVpnTunnelReplacementStatusResult other = (GetVpnTunnelReplacementStatusResult) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        if (other.getVpnGatewayId() == null ^ this.getVpnGatewayId() == null)
            return false;
        if (other.getVpnGatewayId() != null && other.getVpnGatewayId().equals(this.getVpnGatewayId()) == false)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() == null ^ this.getVpnTunnelOutsideIpAddress() == null)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() != null && other.getVpnTunnelOutsideIpAddress().equals(this.getVpnTunnelOutsideIpAddress()) == false)
            return false;
        if (other.getMaintenanceDetails() == null ^ this.getMaintenanceDetails() == null)
            return false;
        if (other.getMaintenanceDetails() != null && other.getMaintenanceDetails().equals(this.getMaintenanceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpnGatewayId() == null) ? 0 : getVpnGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpnTunnelOutsideIpAddress() == null) ? 0 : getVpnTunnelOutsideIpAddress().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceDetails() == null) ? 0 : getMaintenanceDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetVpnTunnelReplacementStatusResult clone() {
        try {
            return (GetVpnTunnelReplacementStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
