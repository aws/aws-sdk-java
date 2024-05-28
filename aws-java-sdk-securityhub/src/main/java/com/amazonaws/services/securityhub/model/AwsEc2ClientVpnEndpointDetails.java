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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Client VPN endpoint. A Client VPN endpoint is the resource that you create and configure to enable and
 * manage client VPN sessions. It's the termination point for all client VPN sessions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2ClientVpnEndpointDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2ClientVpnEndpointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     * </p>
     */
    private String clientCidrBlock;
    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     */
    private java.util.List<String> dnsServer;
    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     * </p>
     */
    private Boolean splitTunnel;
    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     */
    private String transportProtocol;
    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     */
    private Integer vpnPort;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     */
    private String serverCertificateArn;
    /**
     * <p>
     * Information about the authentication method used by the Client VPN endpoint.
     * </p>
     */
    private java.util.List<AwsEc2ClientVpnEndpointAuthenticationOptionsDetails> authenticationOptions;
    /**
     * <p>
     * Information about the client connection logging options for the Client VPN endpoint.
     * </p>
     */
    private AwsEc2ClientVpnEndpointConnectionLogOptionsDetails connectionLogOptions;
    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     */
    private java.util.List<String> securityGroupIdSet;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The URL of the self-service portal.
     * </p>
     */
    private String selfServicePortalUrl;
    /**
     * <p>
     * The options for managing connection authorization for new client connections.
     * </p>
     */
    private AwsEc2ClientVpnEndpointClientConnectOptionsDetails clientConnectOptions;
    /**
     * <p>
     * The maximum VPN session duration time in hours.
     * </p>
     */
    private Integer sessionTimeoutHours;
    /**
     * <p>
     * Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided clients
     * when a VPN session is established.
     * </p>
     */
    private AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetails clientLoginBannerOptions;

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     * 
     * @param description
     *        A brief description of the endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     * 
     * @return A brief description of the endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the endpoint.
     * </p>
     * 
     * @param description
     *        A brief description of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     * </p>
     * 
     * @param clientCidrBlock
     *        The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     */

    public void setClientCidrBlock(String clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     */

    public String getClientCidrBlock() {
        return this.clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     * </p>
     * 
     * @param clientCidrBlock
     *        The IPv4 address range, in CIDR notation, from which client IP addresses are assigned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withClientCidrBlock(String clientCidrBlock) {
        setClientCidrBlock(clientCidrBlock);
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * 
     * @return Information about the DNS servers to be used for DNS resolution.
     */

    public java.util.List<String> getDnsServer() {
        return dnsServer;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * 
     * @param dnsServer
     *        Information about the DNS servers to be used for DNS resolution.
     */

    public void setDnsServer(java.util.Collection<String> dnsServer) {
        if (dnsServer == null) {
            this.dnsServer = null;
            return;
        }

        this.dnsServer = new java.util.ArrayList<String>(dnsServer);
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsServer(java.util.Collection)} or {@link #withDnsServer(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsServer
     *        Information about the DNS servers to be used for DNS resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withDnsServer(String... dnsServer) {
        if (this.dnsServer == null) {
            setDnsServer(new java.util.ArrayList<String>(dnsServer.length));
        }
        for (String ele : dnsServer) {
            this.dnsServer.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * 
     * @param dnsServer
     *        Information about the DNS servers to be used for DNS resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withDnsServer(java.util.Collection<String> dnsServer) {
        setDnsServer(dnsServer);
        return this;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     * </p>
     * 
     * @param splitTunnel
     *        Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     */

    public void setSplitTunnel(Boolean splitTunnel) {
        this.splitTunnel = splitTunnel;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     * </p>
     * 
     * @return Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     */

    public Boolean getSplitTunnel() {
        return this.splitTunnel;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     * </p>
     * 
     * @param splitTunnel
     *        Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withSplitTunnel(Boolean splitTunnel) {
        setSplitTunnel(splitTunnel);
        return this;
    }

    /**
     * <p>
     * Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     * </p>
     * 
     * @return Indicates whether split-tunnel is enabled in the Client VPN endpoint.
     */

    public Boolean isSplitTunnel() {
        return this.splitTunnel;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * 
     * @param transportProtocol
     *        The transport protocol used by the Client VPN endpoint.
     */

    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * 
     * @return The transport protocol used by the Client VPN endpoint.
     */

    public String getTransportProtocol() {
        return this.transportProtocol;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * 
     * @param transportProtocol
     *        The transport protocol used by the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withTransportProtocol(String transportProtocol) {
        setTransportProtocol(transportProtocol);
        return this;
    }

    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     * 
     * @param vpnPort
     *        The port number for the Client VPN endpoint.
     */

    public void setVpnPort(Integer vpnPort) {
        this.vpnPort = vpnPort;
    }

    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     * 
     * @return The port number for the Client VPN endpoint.
     */

    public Integer getVpnPort() {
        return this.vpnPort;
    }

    /**
     * <p>
     * The port number for the Client VPN endpoint.
     * </p>
     * 
     * @param vpnPort
     *        The port number for the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withVpnPort(Integer vpnPort) {
        setVpnPort(vpnPort);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     * 
     * @param serverCertificateArn
     *        The Amazon Resource Name (ARN) of the server certificate.
     */

    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the server certificate.
     */

    public String getServerCertificateArn() {
        return this.serverCertificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the server certificate.
     * </p>
     * 
     * @param serverCertificateArn
     *        The Amazon Resource Name (ARN) of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withServerCertificateArn(String serverCertificateArn) {
        setServerCertificateArn(serverCertificateArn);
        return this;
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN endpoint.
     * </p>
     * 
     * @return Information about the authentication method used by the Client VPN endpoint.
     */

    public java.util.List<AwsEc2ClientVpnEndpointAuthenticationOptionsDetails> getAuthenticationOptions() {
        return authenticationOptions;
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN endpoint.
     * </p>
     * 
     * @param authenticationOptions
     *        Information about the authentication method used by the Client VPN endpoint.
     */

    public void setAuthenticationOptions(java.util.Collection<AwsEc2ClientVpnEndpointAuthenticationOptionsDetails> authenticationOptions) {
        if (authenticationOptions == null) {
            this.authenticationOptions = null;
            return;
        }

        this.authenticationOptions = new java.util.ArrayList<AwsEc2ClientVpnEndpointAuthenticationOptionsDetails>(authenticationOptions);
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthenticationOptions(java.util.Collection)} or
     * {@link #withAuthenticationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authenticationOptions
     *        Information about the authentication method used by the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withAuthenticationOptions(AwsEc2ClientVpnEndpointAuthenticationOptionsDetails... authenticationOptions) {
        if (this.authenticationOptions == null) {
            setAuthenticationOptions(new java.util.ArrayList<AwsEc2ClientVpnEndpointAuthenticationOptionsDetails>(authenticationOptions.length));
        }
        for (AwsEc2ClientVpnEndpointAuthenticationOptionsDetails ele : authenticationOptions) {
            this.authenticationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the authentication method used by the Client VPN endpoint.
     * </p>
     * 
     * @param authenticationOptions
     *        Information about the authentication method used by the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withAuthenticationOptions(
            java.util.Collection<AwsEc2ClientVpnEndpointAuthenticationOptionsDetails> authenticationOptions) {
        setAuthenticationOptions(authenticationOptions);
        return this;
    }

    /**
     * <p>
     * Information about the client connection logging options for the Client VPN endpoint.
     * </p>
     * 
     * @param connectionLogOptions
     *        Information about the client connection logging options for the Client VPN endpoint.
     */

    public void setConnectionLogOptions(AwsEc2ClientVpnEndpointConnectionLogOptionsDetails connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options for the Client VPN endpoint.
     * </p>
     * 
     * @return Information about the client connection logging options for the Client VPN endpoint.
     */

    public AwsEc2ClientVpnEndpointConnectionLogOptionsDetails getConnectionLogOptions() {
        return this.connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options for the Client VPN endpoint.
     * </p>
     * 
     * @param connectionLogOptions
     *        Information about the client connection logging options for the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withConnectionLogOptions(AwsEc2ClientVpnEndpointConnectionLogOptionsDetails connectionLogOptions) {
        setConnectionLogOptions(connectionLogOptions);
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     * 
     * @return The IDs of the security groups for the target network.
     */

    public java.util.List<String> getSecurityGroupIdSet() {
        return securityGroupIdSet;
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     * 
     * @param securityGroupIdSet
     *        The IDs of the security groups for the target network.
     */

    public void setSecurityGroupIdSet(java.util.Collection<String> securityGroupIdSet) {
        if (securityGroupIdSet == null) {
            this.securityGroupIdSet = null;
            return;
        }

        this.securityGroupIdSet = new java.util.ArrayList<String>(securityGroupIdSet);
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIdSet(java.util.Collection)} or {@link #withSecurityGroupIdSet(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupIdSet
     *        The IDs of the security groups for the target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withSecurityGroupIdSet(String... securityGroupIdSet) {
        if (this.securityGroupIdSet == null) {
            setSecurityGroupIdSet(new java.util.ArrayList<String>(securityGroupIdSet.length));
        }
        for (String ele : securityGroupIdSet) {
            this.securityGroupIdSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the security groups for the target network.
     * </p>
     * 
     * @param securityGroupIdSet
     *        The IDs of the security groups for the target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withSecurityGroupIdSet(java.util.Collection<String> securityGroupIdSet) {
        setSecurityGroupIdSet(securityGroupIdSet);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The URL of the self-service portal.
     * </p>
     * 
     * @param selfServicePortalUrl
     *        The URL of the self-service portal.
     */

    public void setSelfServicePortalUrl(String selfServicePortalUrl) {
        this.selfServicePortalUrl = selfServicePortalUrl;
    }

    /**
     * <p>
     * The URL of the self-service portal.
     * </p>
     * 
     * @return The URL of the self-service portal.
     */

    public String getSelfServicePortalUrl() {
        return this.selfServicePortalUrl;
    }

    /**
     * <p>
     * The URL of the self-service portal.
     * </p>
     * 
     * @param selfServicePortalUrl
     *        The URL of the self-service portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withSelfServicePortalUrl(String selfServicePortalUrl) {
        setSelfServicePortalUrl(selfServicePortalUrl);
        return this;
    }

    /**
     * <p>
     * The options for managing connection authorization for new client connections.
     * </p>
     * 
     * @param clientConnectOptions
     *        The options for managing connection authorization for new client connections.
     */

    public void setClientConnectOptions(AwsEc2ClientVpnEndpointClientConnectOptionsDetails clientConnectOptions) {
        this.clientConnectOptions = clientConnectOptions;
    }

    /**
     * <p>
     * The options for managing connection authorization for new client connections.
     * </p>
     * 
     * @return The options for managing connection authorization for new client connections.
     */

    public AwsEc2ClientVpnEndpointClientConnectOptionsDetails getClientConnectOptions() {
        return this.clientConnectOptions;
    }

    /**
     * <p>
     * The options for managing connection authorization for new client connections.
     * </p>
     * 
     * @param clientConnectOptions
     *        The options for managing connection authorization for new client connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withClientConnectOptions(AwsEc2ClientVpnEndpointClientConnectOptionsDetails clientConnectOptions) {
        setClientConnectOptions(clientConnectOptions);
        return this;
    }

    /**
     * <p>
     * The maximum VPN session duration time in hours.
     * </p>
     * 
     * @param sessionTimeoutHours
     *        The maximum VPN session duration time in hours.
     */

    public void setSessionTimeoutHours(Integer sessionTimeoutHours) {
        this.sessionTimeoutHours = sessionTimeoutHours;
    }

    /**
     * <p>
     * The maximum VPN session duration time in hours.
     * </p>
     * 
     * @return The maximum VPN session duration time in hours.
     */

    public Integer getSessionTimeoutHours() {
        return this.sessionTimeoutHours;
    }

    /**
     * <p>
     * The maximum VPN session duration time in hours.
     * </p>
     * 
     * @param sessionTimeoutHours
     *        The maximum VPN session duration time in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withSessionTimeoutHours(Integer sessionTimeoutHours) {
        setSessionTimeoutHours(sessionTimeoutHours);
        return this;
    }

    /**
     * <p>
     * Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided clients
     * when a VPN session is established.
     * </p>
     * 
     * @param clientLoginBannerOptions
     *        Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided
     *        clients when a VPN session is established.
     */

    public void setClientLoginBannerOptions(AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetails clientLoginBannerOptions) {
        this.clientLoginBannerOptions = clientLoginBannerOptions;
    }

    /**
     * <p>
     * Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided clients
     * when a VPN session is established.
     * </p>
     * 
     * @return Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided
     *         clients when a VPN session is established.
     */

    public AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetails getClientLoginBannerOptions() {
        return this.clientLoginBannerOptions;
    }

    /**
     * <p>
     * Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided clients
     * when a VPN session is established.
     * </p>
     * 
     * @param clientLoginBannerOptions
     *        Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided
     *        clients when a VPN session is established.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2ClientVpnEndpointDetails withClientLoginBannerOptions(AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetails clientLoginBannerOptions) {
        setClientLoginBannerOptions(clientLoginBannerOptions);
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientCidrBlock() != null)
            sb.append("ClientCidrBlock: ").append(getClientCidrBlock()).append(",");
        if (getDnsServer() != null)
            sb.append("DnsServer: ").append(getDnsServer()).append(",");
        if (getSplitTunnel() != null)
            sb.append("SplitTunnel: ").append(getSplitTunnel()).append(",");
        if (getTransportProtocol() != null)
            sb.append("TransportProtocol: ").append(getTransportProtocol()).append(",");
        if (getVpnPort() != null)
            sb.append("VpnPort: ").append(getVpnPort()).append(",");
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: ").append(getServerCertificateArn()).append(",");
        if (getAuthenticationOptions() != null)
            sb.append("AuthenticationOptions: ").append(getAuthenticationOptions()).append(",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: ").append(getConnectionLogOptions()).append(",");
        if (getSecurityGroupIdSet() != null)
            sb.append("SecurityGroupIdSet: ").append(getSecurityGroupIdSet()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSelfServicePortalUrl() != null)
            sb.append("SelfServicePortalUrl: ").append(getSelfServicePortalUrl()).append(",");
        if (getClientConnectOptions() != null)
            sb.append("ClientConnectOptions: ").append(getClientConnectOptions()).append(",");
        if (getSessionTimeoutHours() != null)
            sb.append("SessionTimeoutHours: ").append(getSessionTimeoutHours()).append(",");
        if (getClientLoginBannerOptions() != null)
            sb.append("ClientLoginBannerOptions: ").append(getClientLoginBannerOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2ClientVpnEndpointDetails == false)
            return false;
        AwsEc2ClientVpnEndpointDetails other = (AwsEc2ClientVpnEndpointDetails) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientCidrBlock() == null ^ this.getClientCidrBlock() == null)
            return false;
        if (other.getClientCidrBlock() != null && other.getClientCidrBlock().equals(this.getClientCidrBlock()) == false)
            return false;
        if (other.getDnsServer() == null ^ this.getDnsServer() == null)
            return false;
        if (other.getDnsServer() != null && other.getDnsServer().equals(this.getDnsServer()) == false)
            return false;
        if (other.getSplitTunnel() == null ^ this.getSplitTunnel() == null)
            return false;
        if (other.getSplitTunnel() != null && other.getSplitTunnel().equals(this.getSplitTunnel()) == false)
            return false;
        if (other.getTransportProtocol() == null ^ this.getTransportProtocol() == null)
            return false;
        if (other.getTransportProtocol() != null && other.getTransportProtocol().equals(this.getTransportProtocol()) == false)
            return false;
        if (other.getVpnPort() == null ^ this.getVpnPort() == null)
            return false;
        if (other.getVpnPort() != null && other.getVpnPort().equals(this.getVpnPort()) == false)
            return false;
        if (other.getServerCertificateArn() == null ^ this.getServerCertificateArn() == null)
            return false;
        if (other.getServerCertificateArn() != null && other.getServerCertificateArn().equals(this.getServerCertificateArn()) == false)
            return false;
        if (other.getAuthenticationOptions() == null ^ this.getAuthenticationOptions() == null)
            return false;
        if (other.getAuthenticationOptions() != null && other.getAuthenticationOptions().equals(this.getAuthenticationOptions()) == false)
            return false;
        if (other.getConnectionLogOptions() == null ^ this.getConnectionLogOptions() == null)
            return false;
        if (other.getConnectionLogOptions() != null && other.getConnectionLogOptions().equals(this.getConnectionLogOptions()) == false)
            return false;
        if (other.getSecurityGroupIdSet() == null ^ this.getSecurityGroupIdSet() == null)
            return false;
        if (other.getSecurityGroupIdSet() != null && other.getSecurityGroupIdSet().equals(this.getSecurityGroupIdSet()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSelfServicePortalUrl() == null ^ this.getSelfServicePortalUrl() == null)
            return false;
        if (other.getSelfServicePortalUrl() != null && other.getSelfServicePortalUrl().equals(this.getSelfServicePortalUrl()) == false)
            return false;
        if (other.getClientConnectOptions() == null ^ this.getClientConnectOptions() == null)
            return false;
        if (other.getClientConnectOptions() != null && other.getClientConnectOptions().equals(this.getClientConnectOptions()) == false)
            return false;
        if (other.getSessionTimeoutHours() == null ^ this.getSessionTimeoutHours() == null)
            return false;
        if (other.getSessionTimeoutHours() != null && other.getSessionTimeoutHours().equals(this.getSessionTimeoutHours()) == false)
            return false;
        if (other.getClientLoginBannerOptions() == null ^ this.getClientLoginBannerOptions() == null)
            return false;
        if (other.getClientLoginBannerOptions() != null && other.getClientLoginBannerOptions().equals(this.getClientLoginBannerOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientCidrBlock() == null) ? 0 : getClientCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDnsServer() == null) ? 0 : getDnsServer().hashCode());
        hashCode = prime * hashCode + ((getSplitTunnel() == null) ? 0 : getSplitTunnel().hashCode());
        hashCode = prime * hashCode + ((getTransportProtocol() == null) ? 0 : getTransportProtocol().hashCode());
        hashCode = prime * hashCode + ((getVpnPort() == null) ? 0 : getVpnPort().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationOptions() == null) ? 0 : getAuthenticationOptions().hashCode());
        hashCode = prime * hashCode + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIdSet() == null) ? 0 : getSecurityGroupIdSet().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSelfServicePortalUrl() == null) ? 0 : getSelfServicePortalUrl().hashCode());
        hashCode = prime * hashCode + ((getClientConnectOptions() == null) ? 0 : getClientConnectOptions().hashCode());
        hashCode = prime * hashCode + ((getSessionTimeoutHours() == null) ? 0 : getSessionTimeoutHours().hashCode());
        hashCode = prime * hashCode + ((getClientLoginBannerOptions() == null) ? 0 : getClientLoginBannerOptions().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2ClientVpnEndpointDetails clone() {
        try {
            return (AwsEc2ClientVpnEndpointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2ClientVpnEndpointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
