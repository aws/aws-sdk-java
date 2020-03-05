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
import com.amazonaws.services.ec2.model.transform.ModifyClientVpnEndpointRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClientVpnEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyClientVpnEndpointRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     */
    private String serverCertificateArn;
    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     */
    private ConnectionLogOptions connectionLogOptions;
    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     */
    private DnsServersOptionsModifyStructure dnsServers;
    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     */
    private Integer vpnPort;
    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS Client VPN
     * Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     */
    private Boolean splitTunnel;
    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to modify.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint to modify.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate to be used. The server certificate must be provisioned in AWS
     *        Certificate Manager (ACM).
     */

    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     * 
     * @return The ARN of the server certificate to be used. The server certificate must be provisioned in AWS
     *         Certificate Manager (ACM).
     */

    public String getServerCertificateArn() {
        return this.serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate to be used. The server certificate must be provisioned in AWS
     *        Certificate Manager (ACM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withServerCertificateArn(String serverCertificateArn) {
        setServerCertificateArn(serverCertificateArn);
        return this;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionLogOptions
     *        Information about the client connection logging options.</p>
     *        <p>
     *        If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log
     *        stream. The following information is logged:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection results (successful and unsuccessful)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Reasons for unsuccessful client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection termination time
     *        </p>
     *        </li>
     */

    public void setConnectionLogOptions(ConnectionLogOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the client connection logging options.</p>
     *         <p>
     *         If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log
     *         stream. The following information is logged:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Client connection requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Client connection results (successful and unsuccessful)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Reasons for unsuccessful client connection requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Client connection termination time
     *         </p>
     *         </li>
     */

    public ConnectionLogOptions getConnectionLogOptions() {
        return this.connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionLogOptions
     *        Information about the client connection logging options.</p>
     *        <p>
     *        If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log
     *        stream. The following information is logged:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection results (successful and unsuccessful)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Reasons for unsuccessful client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection termination time
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withConnectionLogOptions(ConnectionLogOptions connectionLogOptions) {
        setConnectionLogOptions(connectionLogOptions);
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up
     *        to two DNS servers.
     */

    public void setDnsServers(DnsServersOptionsModifyStructure dnsServers) {
        this.dnsServers = dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     * 
     * @return Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up
     *         to two DNS servers.
     */

    public DnsServersOptionsModifyStructure getDnsServers() {
        return this.dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up
     *        to two DNS servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withDnsServers(DnsServersOptionsModifyStructure dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     * 
     * @param vpnPort
     *        The port number to assign to the Client VPN endpoint for TCP and UDP traffic.</p>
     *        <p>
     *        Valid Values: <code>443</code> | <code>1194</code>
     *        </p>
     *        <p>
     *        Default Value: <code>443</code>
     */

    public void setVpnPort(Integer vpnPort) {
        this.vpnPort = vpnPort;
    }

    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     * 
     * @return The port number to assign to the Client VPN endpoint for TCP and UDP traffic.</p>
     *         <p>
     *         Valid Values: <code>443</code> | <code>1194</code>
     *         </p>
     *         <p>
     *         Default Value: <code>443</code>
     */

    public Integer getVpnPort() {
        return this.vpnPort;
    }

    /**
     * <p>
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * </p>
     * <p>
     * Valid Values: <code>443</code> | <code>1194</code>
     * </p>
     * <p>
     * Default Value: <code>443</code>
     * </p>
     * 
     * @param vpnPort
     *        The port number to assign to the Client VPN endpoint for TCP and UDP traffic.</p>
     *        <p>
     *        Valid Values: <code>443</code> | <code>1194</code>
     *        </p>
     *        <p>
     *        Default Value: <code>443</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withVpnPort(Integer vpnPort) {
        setVpnPort(vpnPort);
        return this;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     * 
     * @param description
     *        A brief description of the Client VPN endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     * 
     * @return A brief description of the Client VPN endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     * 
     * @param description
     *        A brief description of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS Client VPN
     * Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     * 
     * @param splitTunnel
     *        Indicates whether the VPN is split-tunnel.</p>
     *        <p>
     *        For information about split-tunnel VPN endpoints, see <a
     *        href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS
     *        Client VPN Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     */

    public void setSplitTunnel(Boolean splitTunnel) {
        this.splitTunnel = splitTunnel;
    }

    /**
     * <p>
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS Client VPN
     * Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     * 
     * @return Indicates whether the VPN is split-tunnel.</p>
     *         <p>
     *         For information about split-tunnel VPN endpoints, see <a
     *         href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS
     *         Client VPN Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     */

    public Boolean getSplitTunnel() {
        return this.splitTunnel;
    }

    /**
     * <p>
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS Client VPN
     * Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     * 
     * @param splitTunnel
     *        Indicates whether the VPN is split-tunnel.</p>
     *        <p>
     *        For information about split-tunnel VPN endpoints, see <a
     *        href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS
     *        Client VPN Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withSplitTunnel(Boolean splitTunnel) {
        setSplitTunnel(splitTunnel);
        return this;
    }

    /**
     * <p>
     * Indicates whether the VPN is split-tunnel.
     * </p>
     * <p>
     * For information about split-tunnel VPN endpoints, see <a
     * href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS Client VPN
     * Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     * 
     * @return Indicates whether the VPN is split-tunnel.</p>
     *         <p>
     *         For information about split-tunnel VPN endpoints, see <a
     *         href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-Tunnel AWS
     *         Client VPN Endpoint</a> in the <i>AWS Client VPN Administrator Guide</i>.
     */

    public Boolean isSplitTunnel() {
        return this.splitTunnel;
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     * 
     * @return The IDs of one or more security groups to apply to the target network.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of one or more security groups to apply to the target network.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of one or more security groups to apply to the target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more security groups to apply to the target network.
     * </p>
     * 
     * @param securityGroupIds
     *        The IDs of one or more security groups to apply to the target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to associate with the Client VPN endpoint.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     * 
     * @return The ID of the VPC to associate with the Client VPN endpoint.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC to associate with the Client VPN endpoint.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC to associate with the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyClientVpnEndpointRequest> getDryRunRequest() {
        Request<ModifyClientVpnEndpointRequest> request = new ModifyClientVpnEndpointRequestMarshaller().marshall(this);
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: ").append(getServerCertificateArn()).append(",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: ").append(getConnectionLogOptions()).append(",");
        if (getDnsServers() != null)
            sb.append("DnsServers: ").append(getDnsServers()).append(",");
        if (getVpnPort() != null)
            sb.append("VpnPort: ").append(getVpnPort()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSplitTunnel() != null)
            sb.append("SplitTunnel: ").append(getSplitTunnel()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClientVpnEndpointRequest == false)
            return false;
        ModifyClientVpnEndpointRequest other = (ModifyClientVpnEndpointRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getServerCertificateArn() == null ^ this.getServerCertificateArn() == null)
            return false;
        if (other.getServerCertificateArn() != null && other.getServerCertificateArn().equals(this.getServerCertificateArn()) == false)
            return false;
        if (other.getConnectionLogOptions() == null ^ this.getConnectionLogOptions() == null)
            return false;
        if (other.getConnectionLogOptions() != null && other.getConnectionLogOptions().equals(this.getConnectionLogOptions()) == false)
            return false;
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getVpnPort() == null ^ this.getVpnPort() == null)
            return false;
        if (other.getVpnPort() != null && other.getVpnPort().equals(this.getVpnPort()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSplitTunnel() == null ^ this.getSplitTunnel() == null)
            return false;
        if (other.getSplitTunnel() != null && other.getSplitTunnel().equals(this.getSplitTunnel()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode + ((getVpnPort() == null) ? 0 : getVpnPort().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSplitTunnel() == null) ? 0 : getSplitTunnel().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClientVpnEndpointRequest clone() {
        return (ModifyClientVpnEndpointRequest) super.clone();
    }
}
