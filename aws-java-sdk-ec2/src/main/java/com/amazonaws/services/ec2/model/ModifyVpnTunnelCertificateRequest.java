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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVpnTunnelCertificateRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpnTunnelCertificateRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVpnTunnelCertificateRequest> {

    /**
     * <p>
     * The ID of the AWS Site-to-Site VPN connection.
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
     * The ID of the AWS Site-to-Site VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the AWS Site-to-Site VPN connection.
     */

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the AWS Site-to-Site VPN connection.
     * </p>
     * 
     * @return The ID of the AWS Site-to-Site VPN connection.
     */

    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * <p>
     * The ID of the AWS Site-to-Site VPN connection.
     * </p>
     * 
     * @param vpnConnectionId
     *        The ID of the AWS Site-to-Site VPN connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnTunnelCertificateRequest withVpnConnectionId(String vpnConnectionId) {
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

    public ModifyVpnTunnelCertificateRequest withVpnTunnelOutsideIpAddress(String vpnTunnelOutsideIpAddress) {
        setVpnTunnelOutsideIpAddress(vpnTunnelOutsideIpAddress);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpnTunnelCertificateRequest> getDryRunRequest() {
        Request<ModifyVpnTunnelCertificateRequest> request = new ModifyVpnTunnelCertificateRequestMarshaller().marshall(this);
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
            sb.append("VpnTunnelOutsideIpAddress: ").append(getVpnTunnelOutsideIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpnTunnelCertificateRequest == false)
            return false;
        ModifyVpnTunnelCertificateRequest other = (ModifyVpnTunnelCertificateRequest) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() == null ^ this.getVpnTunnelOutsideIpAddress() == null)
            return false;
        if (other.getVpnTunnelOutsideIpAddress() != null && other.getVpnTunnelOutsideIpAddress().equals(this.getVpnTunnelOutsideIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getVpnTunnelOutsideIpAddress() == null) ? 0 : getVpnTunnelOutsideIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpnTunnelCertificateRequest clone() {
        return (ModifyVpnTunnelCertificateRequest) super.clone();
    }
}
