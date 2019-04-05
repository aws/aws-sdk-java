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
 * Describes a Client VPN endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClientVpnEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpnEndpoint implements Serializable, Cloneable {

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
     * The current state of the Client VPN endpoint.
     * </p>
     */
    private ClientVpnEndpointStatus status;
    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     */
    private String deletionTime;
    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN endpoint.
     * </p>
     */
    private String dnsName;
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
    private com.amazonaws.internal.SdkInternalList<String> dnsServers;
    /**
     * <p>
     * Indicates whether VPN split tunneling is supported.
     * </p>
     */
    private Boolean splitTunnel;
    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     */
    private String vpnProtocol;
    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     */
    private String transportProtocol;
    /**
     * <p>
     * Information about the associated target networks. A target network is a subnet in a VPC.
     * </p>
     */
    @Deprecated
    private com.amazonaws.internal.SdkInternalList<AssociatedTargetNetwork> associatedTargetNetworks;
    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     */
    private String serverCertificateArn;
    /**
     * <p>
     * Information about the authentication method used by the Client VPN endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClientVpnAuthentication> authenticationOptions;
    /**
     * <p>
     * Information about the client connection logging options for the Client VPN endpoint.
     * </p>
     */
    private ConnectionLogResponseOptions connectionLogOptions;
    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public ClientVpnEndpoint withClientVpnEndpointId(String clientVpnEndpointId) {
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

    public ClientVpnEndpoint withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * 
     * @param status
     *        The current state of the Client VPN endpoint.
     */

    public void setStatus(ClientVpnEndpointStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * 
     * @return The current state of the Client VPN endpoint.
     */

    public ClientVpnEndpointStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the Client VPN endpoint.
     * </p>
     * 
     * @param status
     *        The current state of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withStatus(ClientVpnEndpointStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the Client VPN endpoint was created.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     * 
     * @return The date and time the Client VPN endpoint was created.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the Client VPN endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     * 
     * @param deletionTime
     *        The date and time the Client VPN endpoint was deleted, if applicable.
     */

    public void setDeletionTime(String deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     * 
     * @return The date and time the Client VPN endpoint was deleted, if applicable.
     */

    public String getDeletionTime() {
        return this.deletionTime;
    }

    /**
     * <p>
     * The date and time the Client VPN endpoint was deleted, if applicable.
     * </p>
     * 
     * @param deletionTime
     *        The date and time the Client VPN endpoint was deleted, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withDeletionTime(String deletionTime) {
        setDeletionTime(deletionTime);
        return this;
    }

    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN endpoint.
     * </p>
     * 
     * @param dnsName
     *        The DNS name to be used by clients when connecting to the Client VPN endpoint.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN endpoint.
     * </p>
     * 
     * @return The DNS name to be used by clients when connecting to the Client VPN endpoint.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name to be used by clients when connecting to the Client VPN endpoint.
     * </p>
     * 
     * @param dnsName
     *        The DNS name to be used by clients when connecting to the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withDnsName(String dnsName) {
        setDnsName(dnsName);
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

    public ClientVpnEndpoint withClientCidrBlock(String clientCidrBlock) {
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

    public java.util.List<String> getDnsServers() {
        if (dnsServers == null) {
            dnsServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used for DNS resolution.
     */

    public void setDnsServers(java.util.Collection<String> dnsServers) {
        if (dnsServers == null) {
            this.dnsServers = null;
            return;
        }

        this.dnsServers = new com.amazonaws.internal.SdkInternalList<String>(dnsServers);
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsServers(java.util.Collection)} or {@link #withDnsServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used for DNS resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withDnsServers(String... dnsServers) {
        if (this.dnsServers == null) {
            setDnsServers(new com.amazonaws.internal.SdkInternalList<String>(dnsServers.length));
        }
        for (String ele : dnsServers) {
            this.dnsServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used for DNS resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withDnsServers(java.util.Collection<String> dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * Indicates whether VPN split tunneling is supported.
     * </p>
     * 
     * @param splitTunnel
     *        Indicates whether VPN split tunneling is supported.
     */

    public void setSplitTunnel(Boolean splitTunnel) {
        this.splitTunnel = splitTunnel;
    }

    /**
     * <p>
     * Indicates whether VPN split tunneling is supported.
     * </p>
     * 
     * @return Indicates whether VPN split tunneling is supported.
     */

    public Boolean getSplitTunnel() {
        return this.splitTunnel;
    }

    /**
     * <p>
     * Indicates whether VPN split tunneling is supported.
     * </p>
     * 
     * @param splitTunnel
     *        Indicates whether VPN split tunneling is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withSplitTunnel(Boolean splitTunnel) {
        setSplitTunnel(splitTunnel);
        return this;
    }

    /**
     * <p>
     * Indicates whether VPN split tunneling is supported.
     * </p>
     * 
     * @return Indicates whether VPN split tunneling is supported.
     */

    public Boolean isSplitTunnel() {
        return this.splitTunnel;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * 
     * @param vpnProtocol
     *        The protocol used by the VPN session.
     * @see VpnProtocol
     */

    public void setVpnProtocol(String vpnProtocol) {
        this.vpnProtocol = vpnProtocol;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * 
     * @return The protocol used by the VPN session.
     * @see VpnProtocol
     */

    public String getVpnProtocol() {
        return this.vpnProtocol;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * 
     * @param vpnProtocol
     *        The protocol used by the VPN session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnProtocol
     */

    public ClientVpnEndpoint withVpnProtocol(String vpnProtocol) {
        setVpnProtocol(vpnProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol used by the VPN session.
     * </p>
     * 
     * @param vpnProtocol
     *        The protocol used by the VPN session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpnProtocol
     */

    public ClientVpnEndpoint withVpnProtocol(VpnProtocol vpnProtocol) {
        this.vpnProtocol = vpnProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * 
     * @param transportProtocol
     *        The transport protocol used by the Client VPN endpoint.
     * @see TransportProtocol
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
     * @see TransportProtocol
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
     * @see TransportProtocol
     */

    public ClientVpnEndpoint withTransportProtocol(String transportProtocol) {
        setTransportProtocol(transportProtocol);
        return this;
    }

    /**
     * <p>
     * The transport protocol used by the Client VPN endpoint.
     * </p>
     * 
     * @param transportProtocol
     *        The transport protocol used by the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public ClientVpnEndpoint withTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol.toString();
        return this;
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a subnet in a VPC.
     * </p>
     * 
     * @return Information about the associated target networks. A target network is a subnet in a VPC.
     */
    @Deprecated
    public java.util.List<AssociatedTargetNetwork> getAssociatedTargetNetworks() {
        if (associatedTargetNetworks == null) {
            associatedTargetNetworks = new com.amazonaws.internal.SdkInternalList<AssociatedTargetNetwork>();
        }
        return associatedTargetNetworks;
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a subnet in a VPC.
     * </p>
     * 
     * @param associatedTargetNetworks
     *        Information about the associated target networks. A target network is a subnet in a VPC.
     */
    @Deprecated
    public void setAssociatedTargetNetworks(java.util.Collection<AssociatedTargetNetwork> associatedTargetNetworks) {
        if (associatedTargetNetworks == null) {
            this.associatedTargetNetworks = null;
            return;
        }

        this.associatedTargetNetworks = new com.amazonaws.internal.SdkInternalList<AssociatedTargetNetwork>(associatedTargetNetworks);
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a subnet in a VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedTargetNetworks(java.util.Collection)} or
     * {@link #withAssociatedTargetNetworks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedTargetNetworks
     *        Information about the associated target networks. A target network is a subnet in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ClientVpnEndpoint withAssociatedTargetNetworks(AssociatedTargetNetwork... associatedTargetNetworks) {
        if (this.associatedTargetNetworks == null) {
            setAssociatedTargetNetworks(new com.amazonaws.internal.SdkInternalList<AssociatedTargetNetwork>(associatedTargetNetworks.length));
        }
        for (AssociatedTargetNetwork ele : associatedTargetNetworks) {
            this.associatedTargetNetworks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associated target networks. A target network is a subnet in a VPC.
     * </p>
     * 
     * @param associatedTargetNetworks
     *        Information about the associated target networks. A target network is a subnet in a VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ClientVpnEndpoint withAssociatedTargetNetworks(java.util.Collection<AssociatedTargetNetwork> associatedTargetNetworks) {
        setAssociatedTargetNetworks(associatedTargetNetworks);
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate.
     */

    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @return The ARN of the server certificate.
     */

    public String getServerCertificateArn() {
        return this.serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate.
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withServerCertificateArn(String serverCertificateArn) {
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

    public java.util.List<ClientVpnAuthentication> getAuthenticationOptions() {
        if (authenticationOptions == null) {
            authenticationOptions = new com.amazonaws.internal.SdkInternalList<ClientVpnAuthentication>();
        }
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

    public void setAuthenticationOptions(java.util.Collection<ClientVpnAuthentication> authenticationOptions) {
        if (authenticationOptions == null) {
            this.authenticationOptions = null;
            return;
        }

        this.authenticationOptions = new com.amazonaws.internal.SdkInternalList<ClientVpnAuthentication>(authenticationOptions);
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

    public ClientVpnEndpoint withAuthenticationOptions(ClientVpnAuthentication... authenticationOptions) {
        if (this.authenticationOptions == null) {
            setAuthenticationOptions(new com.amazonaws.internal.SdkInternalList<ClientVpnAuthentication>(authenticationOptions.length));
        }
        for (ClientVpnAuthentication ele : authenticationOptions) {
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

    public ClientVpnEndpoint withAuthenticationOptions(java.util.Collection<ClientVpnAuthentication> authenticationOptions) {
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

    public void setConnectionLogOptions(ConnectionLogResponseOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options for the Client VPN endpoint.
     * </p>
     * 
     * @return Information about the client connection logging options for the Client VPN endpoint.
     */

    public ConnectionLogResponseOptions getConnectionLogOptions() {
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

    public ClientVpnEndpoint withConnectionLogOptions(ConnectionLogResponseOptions connectionLogOptions) {
        setConnectionLogOptions(connectionLogOptions);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     * 
     * @return Any tags assigned to the Client VPN endpoint.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Client VPN endpoint.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Client VPN endpoint.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpoint withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: ").append(getDeletionTime()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getClientCidrBlock() != null)
            sb.append("ClientCidrBlock: ").append(getClientCidrBlock()).append(",");
        if (getDnsServers() != null)
            sb.append("DnsServers: ").append(getDnsServers()).append(",");
        if (getSplitTunnel() != null)
            sb.append("SplitTunnel: ").append(getSplitTunnel()).append(",");
        if (getVpnProtocol() != null)
            sb.append("VpnProtocol: ").append(getVpnProtocol()).append(",");
        if (getTransportProtocol() != null)
            sb.append("TransportProtocol: ").append(getTransportProtocol()).append(",");
        if (getAssociatedTargetNetworks() != null)
            sb.append("AssociatedTargetNetworks: ").append(getAssociatedTargetNetworks()).append(",");
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: ").append(getServerCertificateArn()).append(",");
        if (getAuthenticationOptions() != null)
            sb.append("AuthenticationOptions: ").append(getAuthenticationOptions()).append(",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: ").append(getConnectionLogOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnEndpoint == false)
            return false;
        ClientVpnEndpoint other = (ClientVpnEndpoint) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getClientCidrBlock() == null ^ this.getClientCidrBlock() == null)
            return false;
        if (other.getClientCidrBlock() != null && other.getClientCidrBlock().equals(this.getClientCidrBlock()) == false)
            return false;
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getSplitTunnel() == null ^ this.getSplitTunnel() == null)
            return false;
        if (other.getSplitTunnel() != null && other.getSplitTunnel().equals(this.getSplitTunnel()) == false)
            return false;
        if (other.getVpnProtocol() == null ^ this.getVpnProtocol() == null)
            return false;
        if (other.getVpnProtocol() != null && other.getVpnProtocol().equals(this.getVpnProtocol()) == false)
            return false;
        if (other.getTransportProtocol() == null ^ this.getTransportProtocol() == null)
            return false;
        if (other.getTransportProtocol() != null && other.getTransportProtocol().equals(this.getTransportProtocol()) == false)
            return false;
        if (other.getAssociatedTargetNetworks() == null ^ this.getAssociatedTargetNetworks() == null)
            return false;
        if (other.getAssociatedTargetNetworks() != null && other.getAssociatedTargetNetworks().equals(this.getAssociatedTargetNetworks()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getClientCidrBlock() == null) ? 0 : getClientCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode + ((getSplitTunnel() == null) ? 0 : getSplitTunnel().hashCode());
        hashCode = prime * hashCode + ((getVpnProtocol() == null) ? 0 : getVpnProtocol().hashCode());
        hashCode = prime * hashCode + ((getTransportProtocol() == null) ? 0 : getTransportProtocol().hashCode());
        hashCode = prime * hashCode + ((getAssociatedTargetNetworks() == null) ? 0 : getAssociatedTargetNetworks().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationOptions() == null) ? 0 : getAuthenticationOptions().hashCode());
        hashCode = prime * hashCode + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ClientVpnEndpoint clone() {
        try {
            return (ClientVpnEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
