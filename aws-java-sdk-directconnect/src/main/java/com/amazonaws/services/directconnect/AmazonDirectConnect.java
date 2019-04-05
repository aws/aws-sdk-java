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
package com.amazonaws.services.directconnect;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.directconnect.model.*;

/**
 * Interface for accessing AWS Direct Connect.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.directconnect.AbstractAmazonDirectConnect} instead.
 * </p>
 * <p>
 * <p>
 * AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
 * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router. With this
 * connection in place, you can create virtual interfaces directly to the AWS cloud (for example, to Amazon EC2 and
 * Amazon S3) and to Amazon VPC, bypassing Internet service providers in your network path. A connection provides access
 * to all AWS Regions except the China (Beijing) and (China) Ningxia Regions. AWS resources in the China Regions can
 * only be accessed through locations associated with those Regions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonDirectConnect {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "directconnect";

    /**
     * Overrides the default endpoint for this client ("https://directconnect.us-east-1.amazonaws.com/"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "https://directconnect.us-east-1.amazonaws.com/"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "directconnect.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://directconnect.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonDirectConnect#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Accepts a proposal request to attach a virtual private gateway to a Direct Connect gateway.
     * </p>
     * 
     * @param acceptDirectConnectGatewayAssociationProposalRequest
     * @return Result of the AcceptDirectConnectGatewayAssociationProposal operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AcceptDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AcceptDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptDirectConnectGatewayAssociationProposalResult acceptDirectConnectGatewayAssociationProposal(
            AcceptDirectConnectGatewayAssociationProposalRequest acceptDirectConnectGatewayAssociationProposalRequest);

    /**
     * <p>
     * Deprecated. Use <a>AllocateHostedConnection</a> instead.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the specified
     * interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     * @return Result of the AllocateConnectionOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocateConnectionOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateConnectionOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest);

    /**
     * <p>
     * Creates a hosted connection on the specified interconnect or a link aggregation group (LAG) of interconnects.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of capacity (bandwidth) for use by a hosted connection on the
     * specified interconnect or LAG of interconnects. AWS polices the hosted connection for the specified capacity and
     * the AWS Direct Connect Partner must also police the hosted connection for the specified capacity.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     * @return Result of the AllocateHostedConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest allocateHostedConnectionRequest);

    /**
     * <p>
     * Provisions a private virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the owner using
     * <a>ConfirmPrivateVirtualInterface</a>. Until then, the virtual interface is in the <code>Confirming</code> state
     * and is not available to handle traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     * @return Result of the AllocatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Provisions a public virtual interface to be owned by the specified AWS account.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public virtual interface to be owned by the
     * specified AWS account.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the owner using
     * <a>ConfirmPublicVirtualInterface</a>. Until this step has been completed, the virtual interface is in the
     * <code>confirming</code> state and is not available to handle traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface, omit the Amazon address and customer address. IPv6 addresses are
     * automatically assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     * @return Result of the AllocatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AllocatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest);

    /**
     * <p>
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and
     * re-established as a member of the LAG (connectivity to AWS is interrupted). The connection must be hosted on the
     * same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
     * re-associate a connection that's currently associated with a different LAG; however, if removing the connection
     * would cause the original LAG to fall below its setting for minimum number of operational connections, the request
     * fails.
     * </p>
     * <p>
     * Any virtual interfaces that are directly associated with the connection are automatically re-associated with the
     * LAG. If the connection was originally associated with a different LAG, the virtual interfaces remain associated
     * with the original LAG.
     * </p>
     * <p>
     * For interconnects, any hosted connections are automatically re-associated with the LAG. If the interconnect was
     * originally associated with a different LAG, the hosted connections remain associated with the original LAG.
     * </p>
     * 
     * @param associateConnectionWithLagRequest
     * @return Result of the AssociateConnectionWithLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AssociateConnectionWithLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateConnectionWithLag"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateConnectionWithLagResult associateConnectionWithLag(AssociateConnectionWithLagRequest associateConnectionWithLagRequest);

    /**
     * <p>
     * Associates a hosted connection and its virtual interfaces with a link aggregation group (LAG) or interconnect. If
     * the target interconnect or LAG has an existing hosted connection with a conflicting VLAN number or IP address,
     * the operation fails. This action temporarily interrupts the hosted connection's connectivity to AWS as it is
     * being migrated.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     * @return Result of the AssociateHostedConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AssociateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateHostedConnectionResult associateHostedConnection(AssociateHostedConnectionRequest associateHostedConnectionRequest);

    /**
     * <p>
     * Associates a virtual interface with a specified link aggregation group (LAG) or connection. Connectivity to AWS
     * is temporarily interrupted as the virtual interface is being migrated. If the target connection or LAG has an
     * associated virtual interface with a conflicting VLAN number or a conflicting IP address, the operation fails.
     * </p>
     * <p>
     * Virtual interfaces associated with a hosted connection cannot be associated with a LAG; hosted connections must
     * be migrated along with their virtual interfaces using <a>AssociateHostedConnection</a>.
     * </p>
     * <p>
     * To reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
     * interface itself or the connection to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG for the association.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     * @return Result of the AssociateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.AssociateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateVirtualInterfaceResult associateVirtualInterface(AssociateVirtualInterfaceRequest associateVirtualInterfaceRequest);

    /**
     * <p>
     * Confirms the creation of the specified hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the <code>Ordering</code> state, and remains in this state
     * until the owner confirms creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     * @return Result of the ConfirmConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.ConfirmConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmConnection"
     *      target="_top">AWS API Documentation</a>
     */
    ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest confirmConnectionRequest);

    /**
     * <p>
     * Accepts ownership of a private virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the virtual interface is created and attached to the specified
     * virtual private gateway or Direct Connect gateway, and is made available to handle traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     * @return Result of the ConfirmPrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.ConfirmPrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Accepts ownership of a public virtual interface created by another AWS account.
     * </p>
     * <p>
     * After the virtual interface owner makes this call, the specified virtual interface is created and made available
     * to handle traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     * @return Result of the ConfirmPublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.ConfirmPublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a BGP peer on the specified virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family (IPv4/IPv6) in order to access AWS resources that
     * also use that address family.
     * </p>
     * <p>
     * If logical redundancy is not supported by the connection, interconnect, or LAG, the BGP peer cannot be in the
     * same address family as an existing BGP peer on the virtual interface.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, omit the Amazon address and customer address. IPv6 addresses are automatically
     * assigned from the Amazon pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
     * virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     * @return Result of the CreateBGPPeer operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBGPPeerResult createBGPPeer(CreateBGPPeerRequest createBGPPeerRequest);

    /**
     * <p>
     * Creates a connection between a customer network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect location over a standard Ethernet fiber-optic
     * cable. One end of the cable is connected to your router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * To find the locations for your Region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
     * specified LAG. If there are no available ports on the endpoint, the request fails and no connection is created.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateConnection" target="_top">AWS
     *      API Documentation</a>
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a Direct Connect gateway, which is an intermediate object that enables you to connect a set of virtual
     * interfaces and virtual private gateways. A Direct Connect gateway is global and visible in any AWS Region after
     * it is created. The virtual interfaces and virtual private gateways that are connected through a Direct Connect
     * gateway can be in different AWS Regions. This enables you to connect to a VPC in any Region, regardless of the
     * Region in which the virtual interfaces are located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     * @return Result of the CreateDirectConnectGateway operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectConnectGatewayResult createDirectConnectGateway(CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest);

    /**
     * <p>
     * Creates an association between a Direct Connect gateway and a virtual private gateway. The virtual private
     * gateway must be attached to a VPC and must not be associated with another Direct Connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     * @return Result of the CreateDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectConnectGatewayAssociationResult createDirectConnectGatewayAssociation(
            CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Creates a proposal to associate the specified virtual private gateway with the specified Direct Connect gateway.
     * </p>
     * <p>
     * You can only associate a Direct Connect gateway and virtual private gateway when the account that owns the Direct
     * Connect gateway and the account that owns the virtual private gateway have the same payer ID.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationProposalRequest
     * @return Result of the CreateDirectConnectGatewayAssociationProposal operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectConnectGatewayAssociationProposalResult createDirectConnectGatewayAssociationProposal(
            CreateDirectConnectGatewayAssociationProposalRequest createDirectConnectGatewayAssociationProposalRequest);

    /**
     * <p>
     * Creates an interconnect between an AWS Direct Connect Partner's network and a specific AWS Direct Connect
     * location.
     * </p>
     * <p>
     * An interconnect is a connection that is capable of hosting other connections. The AWS Direct Connect partner can
     * use an interconnect to provide AWS Direct Connect hosted connections to customers through their own network
     * services. Like a standard connection, an interconnect links the partner's network to an AWS Direct Connect
     * location over a standard Ethernet fiber-optic cable. One end is connected to the partner's router, the other to
     * an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
     * the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect is
     * created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect Partner provisions a connection on their interconnect by calling
     * <a>AllocateHostedConnection</a>. The end customer can then connect to AWS resources by creating a virtual
     * interface on their connection, using the VLAN assigned to them by the AWS Direct Connect Partner.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     * @return Result of the CreateInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInterconnectResult createInterconnect(CreateInterconnectRequest createInterconnectRequest);

    /**
     * <p>
     * Creates a link aggregation group (LAG) with the specified number of bundled physical connections between the
     * customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
     * Aggregation Control Protocol (LACP) to aggregate multiple interfaces, enabling you to treat them as a single
     * interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth and must terminate at the same AWS Direct Connect endpoint.
     * </p>
     * <p>
     * You can have up to 10 connections per LAG. Regardless of this limit, if you request more connections for the LAG
     * than AWS Direct Connect can allocate on a single endpoint, no LAG is created.
     * </p>
     * <p>
     * You can specify an existing physical connection or interconnect to include in the LAG (which counts towards the
     * total number of connections). Doing so interrupts the current physical connection or hosted connections, and
     * re-establishes them as a member of the LAG. The LAG will be created on the same AWS Direct Connect endpoint to
     * which the connection terminates. Any virtual interfaces associated with the connection are automatically
     * disassociated and re-associated with the LAG. The connection ID does not change.
     * </p>
     * <p>
     * If the AWS account used to create a LAG is a registered AWS Direct Connect Partner, the LAG is automatically
     * enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
     * directly configured.
     * </p>
     * 
     * @param createLagRequest
     * @return Result of the CreateLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateLag" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLagResult createLag(CreateLagRequest createLagRequest);

    /**
     * <p>
     * Creates a private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic.
     * A private virtual interface can be connected to either a Direct Connect gateway or a Virtual Private Gateway
     * (VGW). Connecting the private virtual interface to a Direct Connect gateway enables the possibility for
     * connecting to multiple VPCs, including VPCs in different AWS Regions. Connecting the private virtual interface to
     * a VGW only provides access to a single VPC within the same Region.
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     * @return Result of the CreatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect traffic. A
     * public virtual interface supports sending traffic to public services of AWS such as Amazon S3.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (<code>addressFamily</code> is <code>ipv6</code>), leave the
     * <code>customer</code> and <code>amazon</code> address fields blank to use auto-assigned IPv6 space. Custom IPv6
     * addresses are not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     * @return Result of the CreatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.CreatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePublicVirtualInterfaceResult createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest);

    /**
     * <p>
     * Deletes the specified BGP peer on the specified virtual interface with the specified customer address and ASN.
     * </p>
     * <p>
     * You cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     * @return Result of the DeleteBGPPeer operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBGPPeerResult deleteBGPPeer(DeleteBGPPeerRequest deleteBGPPeerRequest);

    /**
     * <p>
     * Deletes the specified connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. If you are
     * partnering with any third parties to connect with the AWS Direct Connect location, you must cancel your service
     * with them separately.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteConnection" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes the specified Direct Connect gateway. You must first delete all virtual interfaces that are attached to
     * the Direct Connect gateway and disassociate all virtual private gateways that are associated with the Direct
     * Connect gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     * @return Result of the DeleteDirectConnectGateway operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectConnectGatewayResult deleteDirectConnectGateway(DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest);

    /**
     * <p>
     * Deletes the association between the specified Direct Connect gateway and virtual private gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     * @return Result of the DeleteDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectConnectGatewayAssociationResult deleteDirectConnectGatewayAssociation(
            DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Deletes the association proposal request between the specified Direct Connect gateway and virtual private
     * gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationProposalRequest
     * @return Result of the DeleteDirectConnectGatewayAssociationProposal operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteDirectConnectGatewayAssociationProposal
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociationProposal"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectConnectGatewayAssociationProposalResult deleteDirectConnectGatewayAssociationProposal(
            DeleteDirectConnectGatewayAssociationProposalRequest deleteDirectConnectGatewayAssociationProposalRequest);

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     * @return Result of the DeleteInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest deleteInterconnectRequest);

    /**
     * <p>
     * Deletes the specified link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces
     * or hosted connections.
     * </p>
     * 
     * @param deleteLagRequest
     * @return Result of the DeleteLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteLag" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLagResult deleteLag(DeleteLagRequest deleteLagRequest);

    /**
     * <p>
     * Deletes a virtual interface.
     * </p>
     * 
     * @param deleteVirtualInterfaceRequest
     * @return Result of the DeleteVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DeleteVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest);

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for a connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or
     * service provider uses when establishing your cross connect to AWS at the colocation facility. For more
     * information, see <a href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting
     * Cross Connects at AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     * @return Result of the DescribeConnectionLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeConnectionLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DescribeConnectionLoaResult describeConnectionLoa(DescribeConnectionLoaRequest describeConnectionLoaRequest);

    /**
     * <p>
     * Displays the specified connection or all connections in this Region.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @return Result of the DescribeConnections operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeConnectionsResult describeConnections(DescribeConnectionsRequest describeConnectionsRequest);

    /**
     * Simplified method form for invoking the DescribeConnections operation.
     *
     * @see #describeConnections(DescribeConnectionsRequest)
     */
    DescribeConnectionsResult describeConnections();

    /**
     * <p>
     * Deprecated. Use <a>DescribeHostedConnections</a> instead.
     * </p>
     * <p>
     * Lists the connections that have been provisioned on the specified interconnect.
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     * @return Result of the DescribeConnectionsOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeConnectionsOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionsOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest);

    /**
     * <p>
     * Describes one or more association proposals for connection between a virtual private gateway and a Direct Connect
     * gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationProposalsRequest
     * @return Result of the DescribeDirectConnectGatewayAssociationProposals operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAssociationProposals
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociationProposals"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectConnectGatewayAssociationProposalsResult describeDirectConnectGatewayAssociationProposals(
            DescribeDirectConnectGatewayAssociationProposalsRequest describeDirectConnectGatewayAssociationProposalsRequest);

    /**
     * <p>
     * Lists the associations between your Direct Connect gateways and virtual private gateways. You must specify a
     * Direct Connect gateway, a virtual private gateway, or both. If you specify a Direct Connect gateway, the response
     * contains all virtual private gateways associated with the Direct Connect gateway. If you specify a virtual
     * private gateway, the response contains all Direct Connect gateways associated with the virtual private gateway.
     * If you specify both, the response contains the association between the Direct Connect gateway and the virtual
     * private gateway.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     * @return Result of the DescribeDirectConnectGatewayAssociations operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectConnectGatewayAssociationsResult describeDirectConnectGatewayAssociations(
            DescribeDirectConnectGatewayAssociationsRequest describeDirectConnectGatewayAssociationsRequest);

    /**
     * <p>
     * Lists the attachments between your Direct Connect gateways and virtual interfaces. You must specify a Direct
     * Connect gateway, a virtual interface, or both. If you specify a Direct Connect gateway, the response contains all
     * virtual interfaces attached to the Direct Connect gateway. If you specify a virtual interface, the response
     * contains all Direct Connect gateways attached to the virtual interface. If you specify both, the response
     * contains the attachment between the Direct Connect gateway and the virtual interface.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     * @return Result of the DescribeDirectConnectGatewayAttachments operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectConnectGatewayAttachmentsResult describeDirectConnectGatewayAttachments(
            DescribeDirectConnectGatewayAttachmentsRequest describeDirectConnectGatewayAttachmentsRequest);

    /**
     * <p>
     * Lists all your Direct Connect gateways or only the specified Direct Connect gateway. Deleted Direct Connect
     * gateways are not returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     * @return Result of the DescribeDirectConnectGateways operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeDirectConnectGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGateways"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectConnectGatewaysResult describeDirectConnectGateways(DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest);

    /**
     * <p>
     * Lists the hosted connections that have been provisioned on the specified interconnect or link aggregation group
     * (LAG).
     * </p>
     * <note>
     * <p>
     * Intended for use by AWS Direct Connect Partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     * @return Result of the DescribeHostedConnections operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeHostedConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeHostedConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHostedConnectionsResult describeHostedConnections(DescribeHostedConnectionsRequest describeHostedConnectionsRequest);

    /**
     * <p>
     * Deprecated. Use <a>DescribeLoa</a> instead.
     * </p>
     * <p>
     * Gets the LOA-CFA for the specified interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     * @return Result of the DescribeInterconnectLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeInterconnectLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnectLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DescribeInterconnectLoaResult describeInterconnectLoa(DescribeInterconnectLoaRequest describeInterconnectLoaRequest);

    /**
     * <p>
     * Lists the interconnects owned by the AWS account or only the specified interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     * @return Result of the DescribeInterconnects operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeInterconnects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnects"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInterconnectsResult describeInterconnects(DescribeInterconnectsRequest describeInterconnectsRequest);

    /**
     * Simplified method form for invoking the DescribeInterconnects operation.
     *
     * @see #describeInterconnects(DescribeInterconnectsRequest)
     */
    DescribeInterconnectsResult describeInterconnects();

    /**
     * <p>
     * Describes all your link aggregation groups (LAG) or the specified LAG.
     * </p>
     * 
     * @param describeLagsRequest
     * @return Result of the DescribeLags operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeLags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeLagsResult describeLags(DescribeLagsRequest describeLagsRequest);

    /**
     * <p>
     * Gets the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at
     * AWS Direct Connect Locations</a> in the <i>AWS Direct Connect User Guide</i>.
     * </p>
     * 
     * @param describeLoaRequest
     * @return Result of the DescribeLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeLoaResult describeLoa(DescribeLoaRequest describeLoaRequest);

    /**
     * <p>
     * Lists the AWS Direct Connect locations in the current AWS Region. These are the locations that can be selected
     * when calling <a>CreateConnection</a> or <a>CreateInterconnect</a>.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return Result of the DescribeLocations operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLocations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeLocationsResult describeLocations(DescribeLocationsRequest describeLocationsRequest);

    /**
     * Simplified method form for invoking the DescribeLocations operation.
     *
     * @see #describeLocations(DescribeLocationsRequest)
     */
    DescribeLocationsResult describeLocations();

    /**
     * <p>
     * Describes the tags associated with the specified AWS Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     * @return Result of the DescribeTags operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Lists the virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces linked to a virtual private gateway.
     * </p>
     * 
     * @param describeVirtualGatewaysRequest
     * @return Result of the DescribeVirtualGateways operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeVirtualGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualGateways"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVirtualGatewaysResult describeVirtualGateways(DescribeVirtualGatewaysRequest describeVirtualGatewaysRequest);

    /**
     * Simplified method form for invoking the DescribeVirtualGateways operation.
     *
     * @see #describeVirtualGateways(DescribeVirtualGatewaysRequest)
     */
    DescribeVirtualGatewaysResult describeVirtualGateways();

    /**
     * <p>
     * Displays all virtual interfaces for an AWS account. Virtual interfaces deleted fewer than 15 minutes before you
     * make the request are also returned. If you specify a connection ID, only the virtual interfaces associated with
     * the connection are returned. If you specify a virtual interface ID, then only a single virtual interface is
     * returned.
     * </p>
     * <p>
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer
     * network.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     * @return Result of the DescribeVirtualInterfaces operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DescribeVirtualInterfaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeVirtualInterfaces"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVirtualInterfacesResult describeVirtualInterfaces(DescribeVirtualInterfacesRequest describeVirtualInterfacesRequest);

    /**
     * Simplified method form for invoking the DescribeVirtualInterfaces operation.
     *
     * @see #describeVirtualInterfaces(DescribeVirtualInterfacesRequest)
     */
    DescribeVirtualInterfacesResult describeVirtualInterfaces();

    /**
     * <p>
     * Disassociates a connection from a link aggregation group (LAG). The connection is interrupted and re-established
     * as a standalone connection (the connection is not deleted; to delete the connection, use the
     * <a>DeleteConnection</a> request). If the LAG has associated virtual interfaces or hosted connections, they remain
     * associated with the LAG. A disassociated connection owned by an AWS Direct Connect Partner is automatically
     * converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection would cause the LAG to fall below its setting for minimum number of operational
     * connections, the request fails, except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     * @return Result of the DisassociateConnectionFromLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.DisassociateConnectionFromLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DisassociateConnectionFromLag"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest disassociateConnectionFromLagRequest);

    /**
     * <p>
     * Adds the specified tags to the specified AWS Direct Connect resource. Each resource can have a maximum of 50
     * tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @throws TooManyTagsException
     *         You have reached the limit on the number of tags that can be assigned.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified AWS Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified attributes of the Direct Connect gateway association.
     * </p>
     * <p>
     * Add or remove prefixes from the association.
     * </p>
     * 
     * @param updateDirectConnectGatewayAssociationRequest
     * @return Result of the UpdateDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UpdateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDirectConnectGatewayAssociationResult updateDirectConnectGatewayAssociation(
            UpdateDirectConnectGatewayAssociationRequest updateDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Updates the attributes of the specified link aggregation group (LAG).
     * </p>
     * <p>
     * You can update the following attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the LAG.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value for the minimum number of connections that must be operational for the LAG itself to be operational.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you create a LAG, the default value for the minimum number of operational connections is zero (0). If you
     * update this value and the number of operational connections falls below the specified value, the LAG
     * automatically goes down to avoid over-utilization of the remaining connections. Adjust this value with care, as
     * it could force the LAG down if it is set higher than the current number of operational connections.
     * </p>
     * 
     * @param updateLagRequest
     * @return Result of the UpdateLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UpdateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLagResult updateLag(UpdateLagRequest updateLagRequest);

    /**
     * <p>
     * Updates the specified attributes of the specified virtual private interface.
     * </p>
     * <p>
     * Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an update to the underlying physical
     * connection if it wasn't updated to support jumbo frames. Updating the connection disrupts network connectivity
     * for all virtual interfaces associated with the connection for up to 30 seconds. To check whether your connection
     * supports jumbo frames, call <a>DescribeConnections</a>. To check whether your virtual interface supports jumbo
     * frames, call <a>DescribeVirtualInterfaces</a>.
     * </p>
     * 
     * @param updateVirtualInterfaceAttributesRequest
     * @return Result of the UpdateVirtualInterfaceAttributes operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred.
     * @throws DirectConnectClientException
     *         One or more parameters are not valid.
     * @sample AmazonDirectConnect.UpdateVirtualInterfaceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateVirtualInterfaceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVirtualInterfaceAttributesResult updateVirtualInterfaceAttributes(UpdateVirtualInterfaceAttributesRequest updateVirtualInterfaceAttributesRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
