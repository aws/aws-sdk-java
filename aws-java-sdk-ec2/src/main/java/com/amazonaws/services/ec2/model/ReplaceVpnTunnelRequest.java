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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ReplaceVpnTunnelRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceVpnTunnelRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ReplaceVpnTunnelRequest> {

    /**
     * <p>
     * The ID of the Site-to-Site VPN connection.
     * </p>
     */
    private String vpnConnectionId;
    /**
     * <p>
     * The external IP address of the VPN tunnel.
     * </p>
     */
    private String vpnTunnelOutsideIpAddress;
    /**
     * <p>
     * Trigger pending tunnel endpoint maintenance.
     * </p>
     */
    private Boolean applyPendingMaintenance;

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

    public ReplaceVpnTunnelRequest withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
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

    public ReplaceVpnTunnelRequest withVpnTunnelOutsideIpAddress(String vpnTunnelOutsideIpAddress) {
        setVpnTunnelOutsideIpAddress(vpnTunnelOutsideIpAddress);
        return this;
    }

    /**
     * <p>
     * Trigger pending tunnel endpoint maintenance.
     * </p>
     * 
     * @param applyPendingMaintenance
     *        Trigger pending tunnel endpoint maintenance.
     */

    public void setApplyPendingMaintenance(Boolean applyPendingMaintenance) {
        this.applyPendingMaintenance = applyPendingMaintenance;
    }

    /**
     * <p>
     * Trigger pending tunnel endpoint maintenance.
     * </p>
     * 
     * @return Trigger pending tunnel endpoint maintenance.
     */

    public Boolean getApplyPendingMaintenance() {
        return this.applyPendingMaintenance;
    }

    /**
     * <p>
     * Trigger pending tunnel endpoint maintenance.
     * </p>
     * 
     * @param applyPendingMaintenance
     *        Trigger pending tunnel endpoint maintenance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceVpnTunnelRequest withApplyPendingMaintenance(Boolean applyPendingMaintenance) {
        setApplyPendingMaintenance(applyPendingMaintenance);
        return this;
    }

    /**
     * <p>
     * Trigger pending tunnel endpoint maintenance.
     * </p>
     * 
     * @return Trigger pending tunnel endpoint maintenance.
     */

    public Boolean isApplyPendingMaintenance() {
        return this.applyPendingMaintenance;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ReplaceVpnTunnelRequest> getDryRunRequest() {
        Request<ReplaceVpnTunnelRequest> request = new ReplaceVpnTunnelRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpnTunnelOutsideIpAddress() != null)
            sb.append("VpnTunnelOutsideIpAddress: ").append(getVpnTunnelOutsideIpAddress()).append(",");
        if (getApplyPendingMaintenance() != null)
            sb.append("ApplyPendingMaintenance: ").append(getApplyPendingMaintenance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceVpnTunnelRequest == false)
            return false;
        ReplaceVpnTunnelRequest other = (ReplaceVpnTunnelRequest) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() == null ^ this.getVpnTunnelOutsideIpAddress() == null)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() != null && other.getVpnTunnelOutsideIpAddress().equals(this.getVpnTunnelOutsideIpAddress()) == false)
            return false;
        if (other.getApplyPendingMaintenance() == null ^ this.getApplyPendingMaintenance() == null)
            return false;
        if (other.getApplyPendingMaintenance() != null && other.getApplyPendingMaintenance().equals(this.getApplyPendingMaintenance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getVpnTunnelOutsideIpAddress() == null) ? 0 : getVpnTunnelOutsideIpAddress().hashCode());
        hashCode = prime * hashCode + ((getApplyPendingMaintenance() == null) ? 0 : getApplyPendingMaintenance().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceVpnTunnelRequest clone() {
        return (ReplaceVpnTunnelRequest) super.clone();
    }
}
