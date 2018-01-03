/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS Direct Connect links your internal network to an AWS Direct Connect location over a standard 1 gigabit or 10
 * gigabit Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct
 * Connect router. With this connection in place, you can create virtual interfaces directly to the AWS cloud (for
 * example, to Amazon Elastic Compute Cloud (Amazon EC2) and Amazon Simple Storage Service (Amazon S3)) and to Amazon
 * Virtual Private Cloud (Amazon VPC), bypassing Internet service providers in your network path. An AWS Direct Connect
 * location provides access to AWS in the region it is associated with, as well as access to other US regions. For
 * example, you can provision a single connection to any AWS Direct Connect location in the US and use it to access
 * public AWS services in all US Regions and AWS GovCloud (US).
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
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
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
     * Deprecated in favor of <a>AllocateHostedConnection</a>.
     * </p>
     * <p>
     * Creates a hosted connection on an interconnect.
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the given
     * interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allocateConnectionOnInterconnectRequest
     *        Container for the parameters to the AllocateConnectionOnInterconnect operation.
     * @return Result of the AllocateConnectionOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AllocateConnectionOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateConnectionOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    AllocateConnectionOnInterconnectResult allocateConnectionOnInterconnect(AllocateConnectionOnInterconnectRequest allocateConnectionOnInterconnectRequest);

    /**
     * <p>
     * Creates a hosted connection on an interconnect or a link aggregation group (LAG).
     * </p>
     * <p>
     * Allocates a VLAN number and a specified amount of bandwidth for use by a hosted connection on the given
     * interconnect or LAG.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param allocateHostedConnectionRequest
     *        Container for the parameters to theHostedConnection operation.
     * @return Result of the AllocateHostedConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AllocateHostedConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocateHostedConnection"
     *      target="_top">AWS API Documentation</a>
     */
    AllocateHostedConnectionResult allocateHostedConnection(AllocateHostedConnectionRequest allocateHostedConnectionRequest);

    /**
     * <p>
     * Provisions a private virtual interface to be owned by another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this action must be confirmed by the virtual interface owner by using the
     * <a>ConfirmPrivateVirtualInterface</a> action. Until then, the virtual interface will be in 'Confirming' state,
     * and will not be available for handling traffic.
     * </p>
     * 
     * @param allocatePrivateVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePrivateVirtualInterface operation.
     * @return Result of the AllocatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AllocatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    AllocatePrivateVirtualInterfaceResult allocatePrivateVirtualInterface(AllocatePrivateVirtualInterfaceRequest allocatePrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Provisions a public virtual interface to be owned by a different customer.
     * </p>
     * <p>
     * The owner of a connection calls this function to provision a public virtual interface which will be owned by
     * another AWS customer.
     * </p>
     * <p>
     * Virtual interfaces created using this function must be confirmed by the virtual interface owner by calling
     * ConfirmPublicVirtualInterface. Until this step has been completed, the virtual interface will be in 'Confirming'
     * state, and will not be available for handling traffic.
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (addressFamily is 'ipv6'), the customer and amazon address fields
     * should be left blank to use auto-assigned IPv6 space. Custom IPv6 Addresses are currently not supported.
     * </p>
     * 
     * @param allocatePublicVirtualInterfaceRequest
     *        Container for the parameters to the AllocatePublicVirtualInterface operation.
     * @return Result of the AllocatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AllocatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AllocatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    AllocatePublicVirtualInterfaceResult allocatePublicVirtualInterface(AllocatePublicVirtualInterfaceRequest allocatePublicVirtualInterfaceRequest);

    /**
     * <p>
     * Associates an existing connection with a link aggregation group (LAG). The connection is interrupted and
     * re-established as a member of the LAG (connectivity to AWS will be interrupted). The connection must be hosted on
     * the same AWS Direct Connect endpoint as the LAG, and its bandwidth must match the bandwidth for the LAG. You can
     * reassociate a connection that's currently associated with a different LAG; however, if removing the connection
     * will cause the original LAG to fall below its setting for minimum number of operational connections, the request
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
     *        Container for the parameters to the AssociateConnectionWithLag operation.
     * @return Result of the AssociateConnectionWithLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param associateHostedConnectionRequest
     *        Container for the parameters to the AssociateHostedConnection operation.
     * @return Result of the AssociateHostedConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     * In order to reassociate a virtual interface to a new connection or LAG, the requester must own either the virtual
     * interface itself or the connection to which the virtual interface is currently associated. Additionally, the
     * requester must own the connection or LAG to which the virtual interface will be newly associated.
     * </p>
     * 
     * @param associateVirtualInterfaceRequest
     *        Container for the parameters to the AssociateVirtualInterface operation.
     * @return Result of the AssociateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.AssociateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateVirtualInterfaceResult associateVirtualInterface(AssociateVirtualInterfaceRequest associateVirtualInterfaceRequest);

    /**
     * <p>
     * Confirm the creation of a hosted connection on an interconnect.
     * </p>
     * <p>
     * Upon creation, the hosted connection is initially in the 'Ordering' state, and will remain in this state until
     * the owner calls ConfirmConnection to confirm creation of the hosted connection.
     * </p>
     * 
     * @param confirmConnectionRequest
     *        Container for the parameters to the ConfirmConnection operation.
     * @return Result of the ConfirmConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.ConfirmConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmConnection"
     *      target="_top">AWS API Documentation</a>
     */
    ConfirmConnectionResult confirmConnection(ConfirmConnectionRequest confirmConnectionRequest);

    /**
     * <p>
     * Accept ownership of a private virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the virtual interface will be created and attached to the
     * given virtual private gateway or direct connect gateway, and will be available for handling traffic.
     * </p>
     * 
     * @param confirmPrivateVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPrivateVirtualInterface operation.
     * @return Result of the ConfirmPrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.ConfirmPrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    ConfirmPrivateVirtualInterfaceResult confirmPrivateVirtualInterface(ConfirmPrivateVirtualInterfaceRequest confirmPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Accept ownership of a public virtual interface created by another customer.
     * </p>
     * <p>
     * After the virtual interface owner calls this function, the specified virtual interface will be created and made
     * available for handling traffic.
     * </p>
     * 
     * @param confirmPublicVirtualInterfaceRequest
     *        Container for the parameters to the ConfirmPublicVirtualInterface operation.
     * @return Result of the ConfirmPublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.ConfirmPublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    ConfirmPublicVirtualInterfaceResult confirmPublicVirtualInterface(ConfirmPublicVirtualInterfaceRequest confirmPublicVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a new BGP peer on a specified virtual interface. The BGP peer cannot be in the same address family
     * (IPv4/IPv6) of an existing BGP peer on the virtual interface.
     * </p>
     * <p>
     * You must create a BGP peer for the corresponding address family in order to access AWS resources that also use
     * that address family.
     * </p>
     * <p>
     * When creating a IPv6 BGP peer, the Amazon address and customer address fields must be left blank. IPv6 addresses
     * are automatically assigned from Amazon's pool of IPv6 addresses; you cannot specify custom IPv6 addresses.
     * </p>
     * <p>
     * For a public virtual interface, the Autonomous System Number (ASN) must be private or already whitelisted for the
     * virtual interface.
     * </p>
     * 
     * @param createBGPPeerRequest
     *        Container for the parameters to the CreateBGPPeer operation.
     * @return Result of the CreateBGPPeer operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBGPPeerResult createBGPPeer(CreateBGPPeerRequest createBGPPeerRequest);

    /**
     * <p>
     * Creates a new connection between the customer network and a specific AWS Direct Connect location.
     * </p>
     * <p>
     * A connection links your internal network to an AWS Direct Connect location over a standard 1 gigabit or 10
     * gigabit Ethernet fiber-optic cable. One end of the cable is connected to your router, the other to an AWS Direct
     * Connect router. An AWS Direct Connect location provides access to Amazon Web Services in the region it is
     * associated with. You can establish connections with AWS Direct Connect locations in multiple regions, but a
     * connection in one region does not provide connectivity to other regions.
     * </p>
     * <p>
     * To find the locations for your region, use <a>DescribeLocations</a>.
     * </p>
     * <p>
     * You can automatically add the new connection to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new connection is allocated on the same AWS Direct Connect endpoint that hosts the
     * specified LAG. If there are no available ports on the endpoint, the request fails and no connection will be
     * created.
     * </p>
     * 
     * @param createConnectionRequest
     *        Container for the parameters to the CreateConnection operation.
     * @return Result of the CreateConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateConnection" target="_top">AWS
     *      API Documentation</a>
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a new direct connect gateway. A direct connect gateway is an intermediate object that enables you to
     * connect a set of virtual interfaces and virtual private gateways. direct connect gateways are global and visible
     * in any AWS region after they are created. The virtual interfaces and virtual private gateways that are connected
     * through a direct connect gateway can be in different regions. This enables you to connect to a VPC in any region,
     * regardless of the region in which the virtual interfaces are located, and pass traffic between them.
     * </p>
     * 
     * @param createDirectConnectGatewayRequest
     *        Container for the parameters to the CreateDirectConnectGateway operation.
     * @return Result of the CreateDirectConnectGateway operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectConnectGatewayResult createDirectConnectGateway(CreateDirectConnectGatewayRequest createDirectConnectGatewayRequest);

    /**
     * <p>
     * Creates an association between a direct connect gateway and a virtual private gateway (VGW). The VGW must be
     * attached to a VPC and must not be associated with another direct connect gateway.
     * </p>
     * 
     * @param createDirectConnectGatewayAssociationRequest
     *        Container for the parameters to the CreateDirectConnectGatewayAssociation operation.
     * @return Result of the CreateDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDirectConnectGatewayAssociationResult createDirectConnectGatewayAssociation(
            CreateDirectConnectGatewayAssociationRequest createDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Creates a new interconnect between a AWS Direct Connect partner's network and a specific AWS Direct Connect
     * location.
     * </p>
     * <p>
     * An interconnect is a connection which is capable of hosting other connections. The AWS Direct Connect partner can
     * use an interconnect to provide sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own
     * connections. Like a standard connection, an interconnect links the AWS Direct Connect partner's network to an AWS
     * Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet fiber-optic cable. One end is connected to the
     * partner's router, the other to an AWS Direct Connect router.
     * </p>
     * <p>
     * You can automatically add the new interconnect to a link aggregation group (LAG) by specifying a LAG ID in the
     * request. This ensures that the new interconnect is allocated on the same AWS Direct Connect endpoint that hosts
     * the specified LAG. If there are no available ports on the endpoint, the request fails and no interconnect will be
     * created.
     * </p>
     * <p>
     * For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling
     * AllocateConnectionOnInterconnect. The end customer can then connect to AWS resources by creating a virtual
     * interface on their connection, using the VLAN assigned to them by the AWS Direct Connect partner.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param createInterconnectRequest
     *        Container for the parameters to the CreateInterconnect operation.
     * @return Result of the CreateInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    CreateInterconnectResult createInterconnect(CreateInterconnectRequest createInterconnectRequest);

    /**
     * <p>
     * Creates a new link aggregation group (LAG) with the specified number of bundled physical connections between the
     * customer network and a specific AWS Direct Connect location. A LAG is a logical interface that uses the Link
     * Aggregation Control Protocol (LACP) to aggregate multiple 1 gigabit or 10 gigabit interfaces, allowing you to
     * treat them as a single interface.
     * </p>
     * <p>
     * All connections in a LAG must use the same bandwidth (for example, 10 Gbps), and must terminate at the same AWS
     * Direct Connect endpoint.
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
     * If the AWS account used to create a LAG is a registered AWS Direct Connect partner, the LAG is automatically
     * enabled to host sub-connections. For a LAG owned by a partner, any associated virtual interfaces cannot be
     * directly configured.
     * </p>
     * 
     * @param createLagRequest
     *        Container for the parameters to the CreateLag operation.
     * @return Result of the CreateLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreateLag" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLagResult createLag(CreateLagRequest createLagRequest);

    /**
     * <p>
     * Creates a new private virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A private virtual interface supports sending traffic to a single virtual private cloud (VPC).
     * </p>
     * 
     * @param createPrivateVirtualInterfaceRequest
     *        Container for the parameters to the CreatePrivateVirtualInterface operation.
     * @return Result of the CreatePrivateVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreatePrivateVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePrivateVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePrivateVirtualInterfaceResult createPrivateVirtualInterface(CreatePrivateVirtualInterfaceRequest createPrivateVirtualInterfaceRequest);

    /**
     * <p>
     * Creates a new public virtual interface. A virtual interface is the VLAN that transports AWS Direct Connect
     * traffic. A public virtual interface supports sending traffic to public services of AWS such as Amazon Simple
     * Storage Service (Amazon S3).
     * </p>
     * <p>
     * When creating an IPv6 public virtual interface (addressFamily is 'ipv6'), the customer and amazon address fields
     * should be left blank to use auto-assigned IPv6 space. Custom IPv6 Addresses are currently not supported.
     * </p>
     * 
     * @param createPublicVirtualInterfaceRequest
     *        Container for the parameters to the CreatePublicVirtualInterface operation.
     * @return Result of the CreatePublicVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.CreatePublicVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/CreatePublicVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePublicVirtualInterfaceResult createPublicVirtualInterface(CreatePublicVirtualInterfaceRequest createPublicVirtualInterfaceRequest);

    /**
     * <p>
     * Deletes a BGP peer on the specified virtual interface that matches the specified customer address and ASN. You
     * cannot delete the last BGP peer from a virtual interface.
     * </p>
     * 
     * @param deleteBGPPeerRequest
     *        Container for the parameters to the DeleteBGPPeer operation.
     * @return Result of the DeleteBGPPeer operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteBGPPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteBGPPeer" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBGPPeerResult deleteBGPPeer(DeleteBGPPeerRequest deleteBGPPeerRequest);

    /**
     * <p>
     * Deletes the connection.
     * </p>
     * <p>
     * Deleting a connection only stops the AWS Direct Connect port hour and data transfer charges. You need to cancel
     * separately with the providers any services or charges for cross-connects or network circuits that connect you to
     * the AWS Direct Connect location.
     * </p>
     * 
     * @param deleteConnectionRequest
     *        Container for the parameters to the DeleteConnection operation.
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteConnection" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes a direct connect gateway. You must first delete all virtual interfaces that are attached to the direct
     * connect gateway and disassociate all virtual private gateways that are associated with the direct connect
     * gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayRequest
     *        Container for the parameters to the DeleteDirectConnectGateway operation.
     * @return Result of the DeleteDirectConnectGateway operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteDirectConnectGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGateway"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectConnectGatewayResult deleteDirectConnectGateway(DeleteDirectConnectGatewayRequest deleteDirectConnectGatewayRequest);

    /**
     * <p>
     * Deletes the association between a direct connect gateway and a virtual private gateway.
     * </p>
     * 
     * @param deleteDirectConnectGatewayAssociationRequest
     *        Container for the parameters to the DeleteDirectConnectGatewayAssociation operation.
     * @return Result of the DeleteDirectConnectGatewayAssociation operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteDirectConnectGatewayAssociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteDirectConnectGatewayAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDirectConnectGatewayAssociationResult deleteDirectConnectGatewayAssociation(
            DeleteDirectConnectGatewayAssociationRequest deleteDirectConnectGatewayAssociationRequest);

    /**
     * <p>
     * Deletes the specified interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param deleteInterconnectRequest
     *        Container for the parameters to the DeleteInterconnect operation.
     * @return Result of the DeleteInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteInterconnectResult deleteInterconnect(DeleteInterconnectRequest deleteInterconnectRequest);

    /**
     * <p>
     * Deletes a link aggregation group (LAG). You cannot delete a LAG if it has active virtual interfaces or hosted
     * connections.
     * </p>
     * 
     * @param deleteLagRequest
     *        Container for the parameters to the DeleteLag operation.
     * @return Result of the DeleteLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     *        Container for the parameters to the DeleteVirtualInterface operation.
     * @return Result of the DeleteVirtualInterface operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DeleteVirtualInterface
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteVirtualInterface"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVirtualInterfaceResult deleteVirtualInterface(DeleteVirtualInterfaceRequest deleteVirtualInterfaceRequest);

    /**
     * <p>
     * Deprecated in favor of <a>DescribeLoa</a>.
     * </p>
     * <p>
     * Returns the LOA-CFA for a Connection.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that your APN partner or
     * service provider uses when establishing your cross connect to AWS at the colocation facility. For more
     * information, see <a href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting
     * Cross Connects at AWS Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeConnectionLoaRequest
     *        Container for the parameters to the DescribeConnectionLoa operation.
     * @return Result of the DescribeConnectionLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeConnectionLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DescribeConnectionLoaResult describeConnectionLoa(DescribeConnectionLoaRequest describeConnectionLoaRequest);

    /**
     * <p>
     * Displays all connections in this region.
     * </p>
     * <p>
     * If a connection ID is provided, the call returns only that particular connection.
     * </p>
     * 
     * @param describeConnectionsRequest
     *        Container for the parameters to the DescribeConnections operation.
     * @return Result of the DescribeConnections operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     * Deprecated in favor of <a>DescribeHostedConnections</a>.
     * </p>
     * <p>
     * Returns a list of connections that have been provisioned on the given interconnect.
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param describeConnectionsOnInterconnectRequest
     *        Container for the parameters to the DescribeConnectionsOnInterconnect operation.
     * @return Result of the DescribeConnectionsOnInterconnect operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeConnectionsOnInterconnect
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeConnectionsOnInterconnect"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DescribeConnectionsOnInterconnectResult describeConnectionsOnInterconnect(DescribeConnectionsOnInterconnectRequest describeConnectionsOnInterconnectRequest);

    /**
     * <p>
     * Returns a list of all direct connect gateway and virtual private gateway (VGW) associations. Either a direct
     * connect gateway ID or a VGW ID must be provided in the request. If a direct connect gateway ID is provided, the
     * response returns all VGWs associated with the direct connect gateway. If a VGW ID is provided, the response
     * returns all direct connect gateways associated with the VGW. If both are provided, the response only returns the
     * association that matches both the direct connect gateway and the VGW.
     * </p>
     * 
     * @param describeDirectConnectGatewayAssociationsRequest
     *        Container for the parameters to the DescribeDirectConnectGatewayAssociations operation.
     * @return Result of the DescribeDirectConnectGatewayAssociations operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectConnectGatewayAssociationsResult describeDirectConnectGatewayAssociations(
            DescribeDirectConnectGatewayAssociationsRequest describeDirectConnectGatewayAssociationsRequest);

    /**
     * <p>
     * Returns a list of all direct connect gateway and virtual interface (VIF) attachments. Either a direct connect
     * gateway ID or a VIF ID must be provided in the request. If a direct connect gateway ID is provided, the response
     * returns all VIFs attached to the direct connect gateway. If a VIF ID is provided, the response returns all direct
     * connect gateways attached to the VIF. If both are provided, the response only returns the attachment that matches
     * both the direct connect gateway and the VIF.
     * </p>
     * 
     * @param describeDirectConnectGatewayAttachmentsRequest
     *        Container for the parameters to the DescribeDirectConnectGatewayAttachments operation.
     * @return Result of the DescribeDirectConnectGatewayAttachments operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeDirectConnectGatewayAttachments
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGatewayAttachments"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectConnectGatewayAttachmentsResult describeDirectConnectGatewayAttachments(
            DescribeDirectConnectGatewayAttachmentsRequest describeDirectConnectGatewayAttachmentsRequest);

    /**
     * <p>
     * Returns a list of direct connect gateways in your account. Deleted direct connect gateways are not returned. You
     * can provide a direct connect gateway ID in the request to return information about the specific direct connect
     * gateway only. Otherwise, if a direct connect gateway ID is not provided, information about all of your direct
     * connect gateways is returned.
     * </p>
     * 
     * @param describeDirectConnectGatewaysRequest
     *        Container for the parameters to the DescribeDirectConnectGateways operation.
     * @return Result of the DescribeDirectConnectGateways operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeDirectConnectGateways
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeDirectConnectGateways"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDirectConnectGatewaysResult describeDirectConnectGateways(DescribeDirectConnectGatewaysRequest describeDirectConnectGatewaysRequest);

    /**
     * <p>
     * Returns a list of hosted connections that have been provisioned on the given interconnect or link aggregation
     * group (LAG).
     * </p>
     * <note>
     * <p>
     * This is intended for use by AWS Direct Connect partners only.
     * </p>
     * </note>
     * 
     * @param describeHostedConnectionsRequest
     *        Container for the parameters to the DescribeHostedConnections operation.
     * @return Result of the DescribeHostedConnections operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeHostedConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeHostedConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHostedConnectionsResult describeHostedConnections(DescribeHostedConnectionsRequest describeHostedConnectionsRequest);

    /**
     * <p>
     * Deprecated in favor of <a>DescribeLoa</a>.
     * </p>
     * <p>
     * Returns the LOA-CFA for an Interconnect.
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at AWS
     * Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeInterconnectLoaRequest
     *        Container for the parameters to the DescribeInterconnectLoa operation.
     * @return Result of the DescribeInterconnectLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeInterconnectLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeInterconnectLoa"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DescribeInterconnectLoaResult describeInterconnectLoa(DescribeInterconnectLoaRequest describeInterconnectLoaRequest);

    /**
     * <p>
     * Returns a list of interconnects owned by the AWS account.
     * </p>
     * <p>
     * If an interconnect ID is provided, it will only return this particular interconnect.
     * </p>
     * 
     * @param describeInterconnectsRequest
     *        Container for the parameters to the DescribeInterconnects operation.
     * @return Result of the DescribeInterconnects operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     * Describes the link aggregation groups (LAGs) in your account.
     * </p>
     * <p>
     * If a LAG ID is provided, only information about the specified LAG is returned.
     * </p>
     * 
     * @param describeLagsRequest
     *        Container for the parameters to the DescribeLags operation.
     * @return Result of the DescribeLags operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeLags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeLagsResult describeLags(DescribeLagsRequest describeLagsRequest);

    /**
     * <p>
     * Returns the LOA-CFA for a connection, interconnect, or link aggregation group (LAG).
     * </p>
     * <p>
     * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a document that is used when
     * establishing your cross connect to AWS at the colocation facility. For more information, see <a
     * href="http://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html">Requesting Cross Connects at AWS
     * Direct Connect Locations</a> in the AWS Direct Connect user guide.
     * </p>
     * 
     * @param describeLoaRequest
     *        Container for the parameters to the DescribeLoa operation.
     * @return Result of the DescribeLoa operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeLoa
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLoa" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeLoaResult describeLoa(DescribeLoaRequest describeLoaRequest);

    /**
     * <p>
     * Returns the list of AWS Direct Connect locations in the current AWS region. These are the locations that may be
     * selected when calling <a>CreateConnection</a> or <a>CreateInterconnect</a>.
     * </p>
     * 
     * @param describeLocationsRequest
     * @return Result of the DescribeLocations operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     * Describes the tags associated with the specified Direct Connect resources.
     * </p>
     * 
     * @param describeTagsRequest
     *        Container for the parameters to the DescribeTags operation.
     * @return Result of the DescribeTags operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DescribeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeTags" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Returns a list of virtual private gateways owned by the AWS account.
     * </p>
     * <p>
     * You can create one or more AWS Direct Connect private virtual interfaces linking to a virtual private gateway. A
     * virtual private gateway can be managed via Amazon Virtual Private Cloud (VPC) console or the <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html">EC2
     * CreateVpnGateway</a> action.
     * </p>
     * 
     * @param describeVirtualGatewaysRequest
     * @return Result of the DescribeVirtualGateways operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     * A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect location and the customer.
     * </p>
     * 
     * @param describeVirtualInterfacesRequest
     *        Container for the parameters to the DescribeVirtualInterfaces operation.
     * @return Result of the DescribeVirtualInterfaces operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
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
     * associated with the LAG. A disassociated connection owned by an AWS Direct Connect partner is automatically
     * converted to an interconnect.
     * </p>
     * <p>
     * If disassociating the connection will cause the LAG to fall below its setting for minimum number of operational
     * connections, the request fails, except when it's the last member of the LAG. If all connections are
     * disassociated, the LAG continues to exist as an empty LAG with no physical connections.
     * </p>
     * 
     * @param disassociateConnectionFromLagRequest
     *        Container for the parameters to the DisassociateConnectionFromLag operation.
     * @return Result of the DisassociateConnectionFromLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.DisassociateConnectionFromLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DisassociateConnectionFromLag"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateConnectionFromLagResult disassociateConnectionFromLag(DisassociateConnectionFromLagRequest disassociateConnectionFromLagRequest);

    /**
     * <p>
     * Adds the specified tags to the specified Direct Connect resource. Each Direct Connect resource can have a maximum
     * of 50 tags.
     * </p>
     * <p>
     * Each tag consists of a key and an optional value. If a tag with the same key is already associated with the
     * Direct Connect resource, this action updates its value.
     * </p>
     * 
     * @param tagResourceRequest
     *        Container for the parameters to the TagResource operation.
     * @return Result of the TagResource operation returned by the service.
     * @throws DuplicateTagKeysException
     *         A tag key was specified more than once.
     * @throws TooManyTagsException
     *         You have reached the limit on the number of tags that can be assigned to a Direct Connect resource.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified Direct Connect resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        Container for the parameters to the UntagResource operation.
     * @return Result of the UntagResource operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the attributes of a link aggregation group (LAG).
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
     * update this value, and the number of operational connections falls below the specified value, the LAG will
     * automatically go down to avoid overutilization of the remaining connections. Adjusting this value should be done
     * with care as it could force the LAG down if the value is set higher than the current number of operational
     * connections.
     * </p>
     * 
     * @param updateLagRequest
     *        Container for the parameters to the UpdateLag operation.
     * @return Result of the UpdateLag operation returned by the service.
     * @throws DirectConnectServerException
     *         A server-side error occurred during the API call. The error message will contain additional details about
     *         the cause.
     * @throws DirectConnectClientException
     *         The API was called with invalid parameters. The error message will contain additional details about the
     *         cause.
     * @sample AmazonDirectConnect.UpdateLag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateLag" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLagResult updateLag(UpdateLagRequest updateLagRequest);

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
