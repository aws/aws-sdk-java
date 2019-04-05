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
import com.amazonaws.services.ec2.model.transform.CreateClientVpnEndpointRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClientVpnEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateClientVpnEndpointRequest> {

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot
     * overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block
     * should be /22 or greater.
     * </p>
     */
    private String clientCidrBlock;
    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager User Guide</a>.
     * </p>
     */
    private String serverCertificateArn;
    /**
     * <p>
     * Information about the authentication method to be used to authenticate clients.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClientVpnAuthenticationRequest> authenticationOptions;
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
     * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS
     * servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN
     * endpoint is used as the DNS server.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsServers;
    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     */
    private String transportProtocol;
    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"> How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot
     * overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block
     * should be /22 or greater.
     * </p>
     * 
     * @param clientCidrBlock
     *        The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range
     *        cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes
     *        that you add manually. The address range cannot be changed after the Client VPN endpoint has been created.
     *        The CIDR block should be /22 or greater.
     */

    public void setClientCidrBlock(String clientCidrBlock) {
        this.clientCidrBlock = clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot
     * overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block
     * should be /22 or greater.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range
     *         cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes
     *         that you add manually. The address range cannot be changed after the Client VPN endpoint has been
     *         created. The CIDR block should be /22 or greater.
     */

    public String getClientCidrBlock() {
        return this.clientCidrBlock;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot
     * overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add
     * manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block
     * should be /22 or greater.
     * </p>
     * 
     * @param clientCidrBlock
     *        The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range
     *        cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes
     *        that you add manually. The address range cannot be changed after the Client VPN endpoint has been created.
     *        The CIDR block should be /22 or greater.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withClientCidrBlock(String clientCidrBlock) {
        setClientCidrBlock(clientCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager User Guide</a>.
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate. For more information, see the <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager User Guide</a>.
     */

    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager User Guide</a>.
     * </p>
     * 
     * @return The ARN of the server certificate. For more information, see the <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager User Guide</a>.
     */

    public String getServerCertificateArn() {
        return this.serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate. For more information, see the <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager User Guide</a>.
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate. For more information, see the <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withServerCertificateArn(String serverCertificateArn) {
        setServerCertificateArn(serverCertificateArn);
        return this;
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate clients.
     * </p>
     * 
     * @return Information about the authentication method to be used to authenticate clients.
     */

    public java.util.List<ClientVpnAuthenticationRequest> getAuthenticationOptions() {
        if (authenticationOptions == null) {
            authenticationOptions = new com.amazonaws.internal.SdkInternalList<ClientVpnAuthenticationRequest>();
        }
        return authenticationOptions;
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate clients.
     * </p>
     * 
     * @param authenticationOptions
     *        Information about the authentication method to be used to authenticate clients.
     */

    public void setAuthenticationOptions(java.util.Collection<ClientVpnAuthenticationRequest> authenticationOptions) {
        if (authenticationOptions == null) {
            this.authenticationOptions = null;
            return;
        }

        this.authenticationOptions = new com.amazonaws.internal.SdkInternalList<ClientVpnAuthenticationRequest>(authenticationOptions);
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate clients.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthenticationOptions(java.util.Collection)} or
     * {@link #withAuthenticationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param authenticationOptions
     *        Information about the authentication method to be used to authenticate clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withAuthenticationOptions(ClientVpnAuthenticationRequest... authenticationOptions) {
        if (this.authenticationOptions == null) {
            setAuthenticationOptions(new com.amazonaws.internal.SdkInternalList<ClientVpnAuthenticationRequest>(authenticationOptions.length));
        }
        for (ClientVpnAuthenticationRequest ele : authenticationOptions) {
            this.authenticationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the authentication method to be used to authenticate clients.
     * </p>
     * 
     * @param authenticationOptions
     *        Information about the authentication method to be used to authenticate clients.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withAuthenticationOptions(java.util.Collection<ClientVpnAuthenticationRequest> authenticationOptions) {
        setAuthenticationOptions(authenticationOptions);
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

    public CreateClientVpnEndpointRequest withConnectionLogOptions(ConnectionLogOptions connectionLogOptions) {
        setConnectionLogOptions(connectionLogOptions);
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS
     * servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN
     * endpoint is used as the DNS server.
     * </p>
     * 
     * @return Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two
     *         DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with
     *         Client VPN endpoint is used as the DNS server.
     */

    public java.util.List<String> getDnsServers() {
        if (dnsServers == null) {
            dnsServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS
     * servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN
     * endpoint is used as the DNS server.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two
     *        DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with
     *        Client VPN endpoint is used as the DNS server.
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
     * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS
     * servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN
     * endpoint is used as the DNS server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsServers(java.util.Collection)} or {@link #withDnsServers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two
     *        DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with
     *        Client VPN endpoint is used as the DNS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withDnsServers(String... dnsServers) {
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
     * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two DNS
     * servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with Client VPN
     * endpoint is used as the DNS server.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can have up to two
     *        DNS servers. If no DNS server is specified, the DNS address of the VPC that is to be associated with
     *        Client VPN endpoint is used as the DNS server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withDnsServers(java.util.Collection<String> dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * 
     * @param transportProtocol
     *        The transport protocol to be used by the VPN session.</p>
     *        <p>
     *        Default value: <code>udp</code>
     * @see TransportProtocol
     */

    public void setTransportProtocol(String transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * 
     * @return The transport protocol to be used by the VPN session.</p>
     *         <p>
     *         Default value: <code>udp</code>
     * @see TransportProtocol
     */

    public String getTransportProtocol() {
        return this.transportProtocol;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * 
     * @param transportProtocol
     *        The transport protocol to be used by the VPN session.</p>
     *        <p>
     *        Default value: <code>udp</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public CreateClientVpnEndpointRequest withTransportProtocol(String transportProtocol) {
        setTransportProtocol(transportProtocol);
        return this;
    }

    /**
     * <p>
     * The transport protocol to be used by the VPN session.
     * </p>
     * <p>
     * Default value: <code>udp</code>
     * </p>
     * 
     * @param transportProtocol
     *        The transport protocol to be used by the VPN session.</p>
     *        <p>
     *        Default value: <code>udp</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public CreateClientVpnEndpointRequest withTransportProtocol(TransportProtocol transportProtocol) {
        this.transportProtocol = transportProtocol.toString();
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

    public CreateClientVpnEndpointRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"> How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"> How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"> How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"> How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"> How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html"> How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     * 
     * @return The tags to apply to the Client VPN endpoint during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Client VPN endpoint during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Client VPN endpoint during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the Client VPN endpoint during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the Client VPN endpoint during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClientVpnEndpointRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateClientVpnEndpointRequest> getDryRunRequest() {
        Request<CreateClientVpnEndpointRequest> request = new CreateClientVpnEndpointRequestMarshaller().marshall(this);
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
        if (getClientCidrBlock() != null)
            sb.append("ClientCidrBlock: ").append(getClientCidrBlock()).append(",");
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: ").append(getServerCertificateArn()).append(",");
        if (getAuthenticationOptions() != null)
            sb.append("AuthenticationOptions: ").append(getAuthenticationOptions()).append(",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: ").append(getConnectionLogOptions()).append(",");
        if (getDnsServers() != null)
            sb.append("DnsServers: ").append(getDnsServers()).append(",");
        if (getTransportProtocol() != null)
            sb.append("TransportProtocol: ").append(getTransportProtocol()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClientVpnEndpointRequest == false)
            return false;
        CreateClientVpnEndpointRequest other = (CreateClientVpnEndpointRequest) obj;
        if (other.getClientCidrBlock() == null ^ this.getClientCidrBlock() == null)
            return false;
        if (other.getClientCidrBlock() != null && other.getClientCidrBlock().equals(this.getClientCidrBlock()) == false)
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
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getTransportProtocol() == null ^ this.getTransportProtocol() == null)
            return false;
        if (other.getTransportProtocol() != null && other.getTransportProtocol().equals(this.getTransportProtocol()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientCidrBlock() == null) ? 0 : getClientCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationOptions() == null) ? 0 : getAuthenticationOptions().hashCode());
        hashCode = prime * hashCode + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode + ((getTransportProtocol() == null) ? 0 : getTransportProtocol().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateClientVpnEndpointRequest clone() {
        return (CreateClientVpnEndpointRequest) super.clone();
    }
}
