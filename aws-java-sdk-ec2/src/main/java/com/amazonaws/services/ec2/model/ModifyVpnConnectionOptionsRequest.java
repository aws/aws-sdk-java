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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyVpnConnectionOptionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpnConnectionOptionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVpnConnectionOptionsRequest> {

    /**
     * <p>
     * The ID of the Site-to-Site VPN connection.
     * </p>
     */
    private String vpnConnectionId;
    /**
     * <p>
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     */
    private String localIpv4NetworkCidr;
    /**
     * <p>
     * The IPv4 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     */
    private String remoteIpv4NetworkCidr;
    /**
     * <p>
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     */
    private String localIpv6NetworkCidr;
    /**
     * <p>
     * The IPv6 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     */
    private String remoteIpv6NetworkCidr;

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

    public ModifyVpnConnectionOptionsRequest withVpnConnectionId(String vpnConnectionId) {
        setVpnConnectionId(vpnConnectionId);
        return this;
    }

    /**
     * <p>
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     * 
     * @param localIpv4NetworkCidr
     *        The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.</p>
     *        <p>
     *        Default: <code>0.0.0.0/0</code>
     */

    public void setLocalIpv4NetworkCidr(String localIpv4NetworkCidr) {
        this.localIpv4NetworkCidr = localIpv4NetworkCidr;
    }

    /**
     * <p>
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     * 
     * @return The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.</p>
     *         <p>
     *         Default: <code>0.0.0.0/0</code>
     */

    public String getLocalIpv4NetworkCidr() {
        return this.localIpv4NetworkCidr;
    }

    /**
     * <p>
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     * 
     * @param localIpv4NetworkCidr
     *        The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.</p>
     *        <p>
     *        Default: <code>0.0.0.0/0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionOptionsRequest withLocalIpv4NetworkCidr(String localIpv4NetworkCidr) {
        setLocalIpv4NetworkCidr(localIpv4NetworkCidr);
        return this;
    }

    /**
     * <p>
     * The IPv4 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     * 
     * @param remoteIpv4NetworkCidr
     *        The IPv4 CIDR on the AWS side of the VPN connection.</p>
     *        <p>
     *        Default: <code>0.0.0.0/0</code>
     */

    public void setRemoteIpv4NetworkCidr(String remoteIpv4NetworkCidr) {
        this.remoteIpv4NetworkCidr = remoteIpv4NetworkCidr;
    }

    /**
     * <p>
     * The IPv4 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     * 
     * @return The IPv4 CIDR on the AWS side of the VPN connection.</p>
     *         <p>
     *         Default: <code>0.0.0.0/0</code>
     */

    public String getRemoteIpv4NetworkCidr() {
        return this.remoteIpv4NetworkCidr;
    }

    /**
     * <p>
     * The IPv4 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>0.0.0.0/0</code>
     * </p>
     * 
     * @param remoteIpv4NetworkCidr
     *        The IPv4 CIDR on the AWS side of the VPN connection.</p>
     *        <p>
     *        Default: <code>0.0.0.0/0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionOptionsRequest withRemoteIpv4NetworkCidr(String remoteIpv4NetworkCidr) {
        setRemoteIpv4NetworkCidr(remoteIpv4NetworkCidr);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     * 
     * @param localIpv6NetworkCidr
     *        The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.</p>
     *        <p>
     *        Default: <code>::/0</code>
     */

    public void setLocalIpv6NetworkCidr(String localIpv6NetworkCidr) {
        this.localIpv6NetworkCidr = localIpv6NetworkCidr;
    }

    /**
     * <p>
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     * 
     * @return The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.</p>
     *         <p>
     *         Default: <code>::/0</code>
     */

    public String getLocalIpv6NetworkCidr() {
        return this.localIpv6NetworkCidr;
    }

    /**
     * <p>
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     * 
     * @param localIpv6NetworkCidr
     *        The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.</p>
     *        <p>
     *        Default: <code>::/0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionOptionsRequest withLocalIpv6NetworkCidr(String localIpv6NetworkCidr) {
        setLocalIpv6NetworkCidr(localIpv6NetworkCidr);
        return this;
    }

    /**
     * <p>
     * The IPv6 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     * 
     * @param remoteIpv6NetworkCidr
     *        The IPv6 CIDR on the AWS side of the VPN connection.</p>
     *        <p>
     *        Default: <code>::/0</code>
     */

    public void setRemoteIpv6NetworkCidr(String remoteIpv6NetworkCidr) {
        this.remoteIpv6NetworkCidr = remoteIpv6NetworkCidr;
    }

    /**
     * <p>
     * The IPv6 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     * 
     * @return The IPv6 CIDR on the AWS side of the VPN connection.</p>
     *         <p>
     *         Default: <code>::/0</code>
     */

    public String getRemoteIpv6NetworkCidr() {
        return this.remoteIpv6NetworkCidr;
    }

    /**
     * <p>
     * The IPv6 CIDR on the AWS side of the VPN connection.
     * </p>
     * <p>
     * Default: <code>::/0</code>
     * </p>
     * 
     * @param remoteIpv6NetworkCidr
     *        The IPv6 CIDR on the AWS side of the VPN connection.</p>
     *        <p>
     *        Default: <code>::/0</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpnConnectionOptionsRequest withRemoteIpv6NetworkCidr(String remoteIpv6NetworkCidr) {
        setRemoteIpv6NetworkCidr(remoteIpv6NetworkCidr);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpnConnectionOptionsRequest> getDryRunRequest() {
        Request<ModifyVpnConnectionOptionsRequest> request = new ModifyVpnConnectionOptionsRequestMarshaller().marshall(this);
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
        if (getLocalIpv4NetworkCidr() != null)
            sb.append("LocalIpv4NetworkCidr: ").append(getLocalIpv4NetworkCidr()).append(",");
        if (getRemoteIpv4NetworkCidr() != null)
            sb.append("RemoteIpv4NetworkCidr: ").append(getRemoteIpv4NetworkCidr()).append(",");
        if (getLocalIpv6NetworkCidr() != null)
            sb.append("LocalIpv6NetworkCidr: ").append(getLocalIpv6NetworkCidr()).append(",");
        if (getRemoteIpv6NetworkCidr() != null)
            sb.append("RemoteIpv6NetworkCidr: ").append(getRemoteIpv6NetworkCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpnConnectionOptionsRequest == false)
            return false;
        ModifyVpnConnectionOptionsRequest other = (ModifyVpnConnectionOptionsRequest) obj;
        if (other.getVpnConnectionId() == null ^ this.getVpnConnectionId() == null)
            return false;
        if (other.getVpnConnectionId() != null && other.getVpnConnectionId().equals(this.getVpnConnectionId()) == false)
            return false;
        if (other.getLocalIpv4NetworkCidr() == null ^ this.getLocalIpv4NetworkCidr() == null)
            return false;
        if (other.getLocalIpv4NetworkCidr() != null && other.getLocalIpv4NetworkCidr().equals(this.getLocalIpv4NetworkCidr()) == false)
            return false;
        if (other.getRemoteIpv4NetworkCidr() == null ^ this.getRemoteIpv4NetworkCidr() == null)
            return false;
        if (other.getRemoteIpv4NetworkCidr() != null && other.getRemoteIpv4NetworkCidr().equals(this.getRemoteIpv4NetworkCidr()) == false)
            return false;
        if (other.getLocalIpv6NetworkCidr() == null ^ this.getLocalIpv6NetworkCidr() == null)
            return false;
        if (other.getLocalIpv6NetworkCidr() != null && other.getLocalIpv6NetworkCidr().equals(this.getLocalIpv6NetworkCidr()) == false)
            return false;
        if (other.getRemoteIpv6NetworkCidr() == null ^ this.getRemoteIpv6NetworkCidr() == null)
            return false;
        if (other.getRemoteIpv6NetworkCidr() != null && other.getRemoteIpv6NetworkCidr().equals(this.getRemoteIpv6NetworkCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpnConnectionId() == null) ? 0 : getVpnConnectionId().hashCode());
        hashCode = prime * hashCode + ((getLocalIpv4NetworkCidr() == null) ? 0 : getLocalIpv4NetworkCidr().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpv4NetworkCidr() == null) ? 0 : getRemoteIpv4NetworkCidr().hashCode());
        hashCode = prime * hashCode + ((getLocalIpv6NetworkCidr() == null) ? 0 : getLocalIpv6NetworkCidr().hashCode());
        hashCode = prime * hashCode + ((getRemoteIpv6NetworkCidr() == null) ? 0 : getRemoteIpv6NetworkCidr().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpnConnectionOptionsRequest clone() {
        return (ModifyVpnConnectionOptionsRequest) super.clone();
    }
}
