/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;

/**
 * Interface for accessing NetworkManager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.networkmanager.AbstractAWSNetworkManagerAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services enables you to centrally manage your Amazon Web Services Cloud WAN core network and your Transit
 * Gateway network across Amazon Web Services accounts, Regions, and on-premises locations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSNetworkManagerAsync extends AWSNetworkManager {

    /**
     * <p>
     * Accepts a core network attachment request.
     * </p>
     * <p>
     * Once the attachment request is accepted by a core network owner, the attachment is created and connected to a
     * core network.
     * </p>
     * 
     * @param acceptAttachmentRequest
     * @return A Java Future containing the result of the AcceptAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.AcceptAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AcceptAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAttachmentResult> acceptAttachmentAsync(AcceptAttachmentRequest acceptAttachmentRequest);

    /**
     * <p>
     * Accepts a core network attachment request.
     * </p>
     * <p>
     * Once the attachment request is accepted by a core network owner, the attachment is created and connected to a
     * core network.
     * </p>
     * 
     * @param acceptAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.AcceptAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AcceptAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAttachmentResult> acceptAttachmentAsync(AcceptAttachmentRequest acceptAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptAttachmentRequest, AcceptAttachmentResult> asyncHandler);

    /**
     * <p>
     * Associates a core network Connect peer with a device and optionally, with a link.
     * </p>
     * <p>
     * If you specify a link, it must be associated with the specified device. You can only associate core network
     * Connect peers that have been created on a core network Connect attachment on a core network.
     * </p>
     * 
     * @param associateConnectPeerRequest
     * @return A Java Future containing the result of the AssociateConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsync.AssociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateConnectPeerResult> associateConnectPeerAsync(AssociateConnectPeerRequest associateConnectPeerRequest);

    /**
     * <p>
     * Associates a core network Connect peer with a device and optionally, with a link.
     * </p>
     * <p>
     * If you specify a link, it must be associated with the specified device. You can only associate core network
     * Connect peers that have been created on a core network Connect attachment on a core network.
     * </p>
     * 
     * @param associateConnectPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.AssociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateConnectPeerResult> associateConnectPeerAsync(AssociateConnectPeerRequest associateConnectPeerRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateConnectPeerRequest, AssociateConnectPeerResult> asyncHandler);

    /**
     * <p>
     * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be
     * associated with the specified device.
     * </p>
     * <p>
     * You can only associate customer gateways that are connected to a VPN attachment on a transit gateway or core
     * network registered in your global network. When you register a transit gateway or core network, customer gateways
     * that are connected to the transit gateway are automatically included in the global network. To list customer
     * gateways that are connected to a transit gateway, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnConnections.html"
     * >DescribeVpnConnections</a> EC2 API and filter by <code>transit-gateway-id</code>.
     * </p>
     * <p>
     * You cannot associate a customer gateway with more than one device and link.
     * </p>
     * 
     * @param associateCustomerGatewayRequest
     * @return A Java Future containing the result of the AssociateCustomerGateway operation returned by the service.
     * @sample AWSNetworkManagerAsync.AssociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCustomerGatewayResult> associateCustomerGatewayAsync(AssociateCustomerGatewayRequest associateCustomerGatewayRequest);

    /**
     * <p>
     * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be
     * associated with the specified device.
     * </p>
     * <p>
     * You can only associate customer gateways that are connected to a VPN attachment on a transit gateway or core
     * network registered in your global network. When you register a transit gateway or core network, customer gateways
     * that are connected to the transit gateway are automatically included in the global network. To list customer
     * gateways that are connected to a transit gateway, use the <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnConnections.html"
     * >DescribeVpnConnections</a> EC2 API and filter by <code>transit-gateway-id</code>.
     * </p>
     * <p>
     * You cannot associate a customer gateway with more than one device and link.
     * </p>
     * 
     * @param associateCustomerGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateCustomerGateway operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.AssociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCustomerGatewayResult> associateCustomerGatewayAsync(AssociateCustomerGatewayRequest associateCustomerGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateCustomerGatewayRequest, AssociateCustomerGatewayResult> asyncHandler);

    /**
     * <p>
     * Associates a link to a device. A device can be associated to multiple links and a link can be associated to
     * multiple devices. The device and link must be in the same global network and the same site.
     * </p>
     * 
     * @param associateLinkRequest
     * @return A Java Future containing the result of the AssociateLink operation returned by the service.
     * @sample AWSNetworkManagerAsync.AssociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateLink" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateLinkResult> associateLinkAsync(AssociateLinkRequest associateLinkRequest);

    /**
     * <p>
     * Associates a link to a device. A device can be associated to multiple links and a link can be associated to
     * multiple devices. The device and link must be in the same global network and the same site.
     * </p>
     * 
     * @param associateLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateLink operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.AssociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateLink" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateLinkResult> associateLinkAsync(AssociateLinkRequest associateLinkRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateLinkRequest, AssociateLinkResult> asyncHandler);

    /**
     * <p>
     * Associates a transit gateway Connect peer with a device, and optionally, with a link. If you specify a link, it
     * must be associated with the specified device.
     * </p>
     * <p>
     * You can only associate transit gateway Connect peers that have been created on a transit gateway that's
     * registered in your global network.
     * </p>
     * <p>
     * You cannot associate a transit gateway Connect peer with more than one device and link.
     * </p>
     * 
     * @param associateTransitGatewayConnectPeerRequest
     * @return A Java Future containing the result of the AssociateTransitGatewayConnectPeer operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.AssociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTransitGatewayConnectPeerResult> associateTransitGatewayConnectPeerAsync(
            AssociateTransitGatewayConnectPeerRequest associateTransitGatewayConnectPeerRequest);

    /**
     * <p>
     * Associates a transit gateway Connect peer with a device, and optionally, with a link. If you specify a link, it
     * must be associated with the specified device.
     * </p>
     * <p>
     * You can only associate transit gateway Connect peers that have been created on a transit gateway that's
     * registered in your global network.
     * </p>
     * <p>
     * You cannot associate a transit gateway Connect peer with more than one device and link.
     * </p>
     * 
     * @param associateTransitGatewayConnectPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateTransitGatewayConnectPeer operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.AssociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateTransitGatewayConnectPeerResult> associateTransitGatewayConnectPeerAsync(
            AssociateTransitGatewayConnectPeerRequest associateTransitGatewayConnectPeerRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateTransitGatewayConnectPeerRequest, AssociateTransitGatewayConnectPeerResult> asyncHandler);

    /**
     * <p>
     * Creates a core network Connect attachment from a specified core network attachment.
     * </p>
     * <p>
     * A core network Connect attachment is a GRE-based tunnel attachment that you can use to establish a connection
     * between a core network and an appliance. A core network Connect attachment uses an existing VPC attachment as the
     * underlying transport mechanism.
     * </p>
     * 
     * @param createConnectAttachmentRequest
     * @return A Java Future containing the result of the CreateConnectAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectAttachmentResult> createConnectAttachmentAsync(CreateConnectAttachmentRequest createConnectAttachmentRequest);

    /**
     * <p>
     * Creates a core network Connect attachment from a specified core network attachment.
     * </p>
     * <p>
     * A core network Connect attachment is a GRE-based tunnel attachment that you can use to establish a connection
     * between a core network and an appliance. A core network Connect attachment uses an existing VPC attachment as the
     * underlying transport mechanism.
     * </p>
     * 
     * @param createConnectAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnectAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectAttachmentResult> createConnectAttachmentAsync(CreateConnectAttachmentRequest createConnectAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectAttachmentRequest, CreateConnectAttachmentResult> asyncHandler);

    /**
     * <p>
     * Creates a core network Connect peer for a specified core network connect attachment between a core network and an
     * appliance. The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
     * </p>
     * 
     * @param createConnectPeerRequest
     * @return A Java Future containing the result of the CreateConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectPeerResult> createConnectPeerAsync(CreateConnectPeerRequest createConnectPeerRequest);

    /**
     * <p>
     * Creates a core network Connect peer for a specified core network connect attachment between a core network and an
     * appliance. The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
     * </p>
     * 
     * @param createConnectPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectPeerResult> createConnectPeerAsync(CreateConnectPeerRequest createConnectPeerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectPeerRequest, CreateConnectPeerResult> asyncHandler);

    /**
     * <p>
     * Creates a connection between two devices. The devices can be a physical or virtual appliance that connects to a
     * third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an
     * on-premises network.
     * </p>
     * 
     * @param createConnectionRequest
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a connection between two devices. The devices can be a physical or virtual appliance that connects to a
     * third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an
     * on-premises network.
     * </p>
     * 
     * @param createConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler);

    /**
     * <p>
     * Creates a core network as part of your global network, and optionally, with a core network policy.
     * </p>
     * 
     * @param createCoreNetworkRequest
     * @return A Java Future containing the result of the CreateCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCoreNetworkResult> createCoreNetworkAsync(CreateCoreNetworkRequest createCoreNetworkRequest);

    /**
     * <p>
     * Creates a core network as part of your global network, and optionally, with a core network policy.
     * </p>
     * 
     * @param createCoreNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCoreNetworkResult> createCoreNetworkAsync(CreateCoreNetworkRequest createCoreNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCoreNetworkRequest, CreateCoreNetworkResult> asyncHandler);

    /**
     * <p>
     * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site
     * is used for visualization in the Network Manager console.
     * </p>
     * 
     * @param createDeviceRequest
     * @return A Java Future containing the result of the CreateDevice operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceResult> createDeviceAsync(CreateDeviceRequest createDeviceRequest);

    /**
     * <p>
     * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site
     * is used for visualization in the Network Manager console.
     * </p>
     * 
     * @param createDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDevice operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeviceResult> createDeviceAsync(CreateDeviceRequest createDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeviceRequest, CreateDeviceResult> asyncHandler);

    /**
     * <p>
     * Creates a new, empty global network.
     * </p>
     * 
     * @param createGlobalNetworkRequest
     * @return A Java Future containing the result of the CreateGlobalNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGlobalNetworkResult> createGlobalNetworkAsync(CreateGlobalNetworkRequest createGlobalNetworkRequest);

    /**
     * <p>
     * Creates a new, empty global network.
     * </p>
     * 
     * @param createGlobalNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGlobalNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGlobalNetworkResult> createGlobalNetworkAsync(CreateGlobalNetworkRequest createGlobalNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGlobalNetworkRequest, CreateGlobalNetworkResult> asyncHandler);

    /**
     * <p>
     * Creates a new link for a specified site.
     * </p>
     * 
     * @param createLinkRequest
     * @return A Java Future containing the result of the CreateLink operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest createLinkRequest);

    /**
     * <p>
     * Creates a new link for a specified site.
     * </p>
     * 
     * @param createLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLink operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest createLinkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLinkRequest, CreateLinkResult> asyncHandler);

    /**
     * <p>
     * Creates a new site in a global network.
     * </p>
     * 
     * @param createSiteRequest
     * @return A Java Future containing the result of the CreateSite operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest createSiteRequest);

    /**
     * <p>
     * Creates a new site in a global network.
     * </p>
     * 
     * @param createSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSite operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest createSiteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSiteRequest, CreateSiteResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
     * </p>
     * 
     * @param createSiteToSiteVpnAttachmentRequest
     * @return A Java Future containing the result of the CreateSiteToSiteVpnAttachment operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.CreateSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteToSiteVpnAttachmentResult> createSiteToSiteVpnAttachmentAsync(
            CreateSiteToSiteVpnAttachmentRequest createSiteToSiteVpnAttachmentRequest);

    /**
     * <p>
     * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
     * </p>
     * 
     * @param createSiteToSiteVpnAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSiteToSiteVpnAttachment operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.CreateSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteToSiteVpnAttachmentResult> createSiteToSiteVpnAttachmentAsync(
            CreateSiteToSiteVpnAttachmentRequest createSiteToSiteVpnAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSiteToSiteVpnAttachmentRequest, CreateSiteToSiteVpnAttachmentResult> asyncHandler);

    /**
     * <p>
     * Creates a transit gateway peering connection.
     * </p>
     * 
     * @param createTransitGatewayPeeringRequest
     * @return A Java Future containing the result of the CreateTransitGatewayPeering operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransitGatewayPeeringResult> createTransitGatewayPeeringAsync(
            CreateTransitGatewayPeeringRequest createTransitGatewayPeeringRequest);

    /**
     * <p>
     * Creates a transit gateway peering connection.
     * </p>
     * 
     * @param createTransitGatewayPeeringRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTransitGatewayPeering operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransitGatewayPeeringResult> createTransitGatewayPeeringAsync(
            CreateTransitGatewayPeeringRequest createTransitGatewayPeeringRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayPeeringRequest, CreateTransitGatewayPeeringResult> asyncHandler);

    /**
     * <p>
     * Creates a transit gateway route table attachment.
     * </p>
     * 
     * @param createTransitGatewayRouteTableAttachmentRequest
     * @return A Java Future containing the result of the CreateTransitGatewayRouteTableAttachment operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsync.CreateTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransitGatewayRouteTableAttachmentResult> createTransitGatewayRouteTableAttachmentAsync(
            CreateTransitGatewayRouteTableAttachmentRequest createTransitGatewayRouteTableAttachmentRequest);

    /**
     * <p>
     * Creates a transit gateway route table attachment.
     * </p>
     * 
     * @param createTransitGatewayRouteTableAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTransitGatewayRouteTableAttachment operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTransitGatewayRouteTableAttachmentResult> createTransitGatewayRouteTableAttachmentAsync(
            CreateTransitGatewayRouteTableAttachmentRequest createTransitGatewayRouteTableAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTransitGatewayRouteTableAttachmentRequest, CreateTransitGatewayRouteTableAttachmentResult> asyncHandler);

    /**
     * <p>
     * Creates a VPC attachment on an edge location of a core network.
     * </p>
     * 
     * @param createVpcAttachmentRequest
     * @return A Java Future containing the result of the CreateVpcAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.CreateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcAttachmentResult> createVpcAttachmentAsync(CreateVpcAttachmentRequest createVpcAttachmentRequest);

    /**
     * <p>
     * Creates a VPC attachment on an edge location of a core network.
     * </p>
     * 
     * @param createVpcAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.CreateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcAttachmentResult> createVpcAttachmentAsync(CreateVpcAttachmentRequest createVpcAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcAttachmentRequest, CreateVpcAttachmentResult> asyncHandler);

    /**
     * <p>
     * Deletes an attachment. Supports all attachment types.
     * </p>
     * 
     * @param deleteAttachmentRequest
     * @return A Java Future containing the result of the DeleteAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttachmentResult> deleteAttachmentAsync(DeleteAttachmentRequest deleteAttachmentRequest);

    /**
     * <p>
     * Deletes an attachment. Supports all attachment types.
     * </p>
     * 
     * @param deleteAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttachmentResult> deleteAttachmentAsync(DeleteAttachmentRequest deleteAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAttachmentRequest, DeleteAttachmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a Connect peer.
     * </p>
     * 
     * @param deleteConnectPeerRequest
     * @return A Java Future containing the result of the DeleteConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectPeerResult> deleteConnectPeerAsync(DeleteConnectPeerRequest deleteConnectPeerRequest);

    /**
     * <p>
     * Deletes a Connect peer.
     * </p>
     * 
     * @param deleteConnectPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectPeerResult> deleteConnectPeerAsync(DeleteConnectPeerRequest deleteConnectPeerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectPeerRequest, DeleteConnectPeerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified connection in your global network.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes the specified connection in your global network.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes a core network along with all core network policies. This can only be done if there are no attachments on
     * a core network.
     * </p>
     * 
     * @param deleteCoreNetworkRequest
     * @return A Java Future containing the result of the DeleteCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreNetworkResult> deleteCoreNetworkAsync(DeleteCoreNetworkRequest deleteCoreNetworkRequest);

    /**
     * <p>
     * Deletes a core network along with all core network policies. This can only be done if there are no attachments on
     * a core network.
     * </p>
     * 
     * @param deleteCoreNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreNetworkResult> deleteCoreNetworkAsync(DeleteCoreNetworkRequest deleteCoreNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCoreNetworkRequest, DeleteCoreNetworkResult> asyncHandler);

    /**
     * <p>
     * Deletes a policy version from a core network. You can't delete the current LIVE policy.
     * </p>
     * 
     * @param deleteCoreNetworkPolicyVersionRequest
     * @return A Java Future containing the result of the DeleteCoreNetworkPolicyVersion operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.DeleteCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreNetworkPolicyVersionResult> deleteCoreNetworkPolicyVersionAsync(
            DeleteCoreNetworkPolicyVersionRequest deleteCoreNetworkPolicyVersionRequest);

    /**
     * <p>
     * Deletes a policy version from a core network. You can't delete the current LIVE policy.
     * </p>
     * 
     * @param deleteCoreNetworkPolicyVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCoreNetworkPolicyVersion operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCoreNetworkPolicyVersionResult> deleteCoreNetworkPolicyVersionAsync(
            DeleteCoreNetworkPolicyVersionRequest deleteCoreNetworkPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCoreNetworkPolicyVersionRequest, DeleteCoreNetworkPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest);

    /**
     * <p>
     * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites),
     * deregister all transit gateways, and delete any core networks.
     * </p>
     * 
     * @param deleteGlobalNetworkRequest
     * @return A Java Future containing the result of the DeleteGlobalNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGlobalNetworkResult> deleteGlobalNetworkAsync(DeleteGlobalNetworkRequest deleteGlobalNetworkRequest);

    /**
     * <p>
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites),
     * deregister all transit gateways, and delete any core networks.
     * </p>
     * 
     * @param deleteGlobalNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGlobalNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGlobalNetworkResult> deleteGlobalNetworkAsync(DeleteGlobalNetworkRequest deleteGlobalNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGlobalNetworkRequest, DeleteGlobalNetworkResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
     * </p>
     * 
     * @param deleteLinkRequest
     * @return A Java Future containing the result of the DeleteLink operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest deleteLinkRequest);

    /**
     * <p>
     * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
     * </p>
     * 
     * @param deleteLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLink operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest deleteLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLinkRequest, DeleteLinkResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing peering connection.
     * </p>
     * 
     * @param deletePeeringRequest
     * @return A Java Future containing the result of the DeletePeering operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeletePeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeletePeering" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePeeringResult> deletePeeringAsync(DeletePeeringRequest deletePeeringRequest);

    /**
     * <p>
     * Deletes an existing peering connection.
     * </p>
     * 
     * @param deletePeeringRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePeering operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeletePeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeletePeering" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePeeringResult> deletePeeringAsync(DeletePeeringRequest deletePeeringRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePeeringRequest, DeletePeeringResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource policy for the specified resource. This revokes the access of the principals specified in the
     * resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a resource policy for the specified resource. This revokes the access of the principals specified in the
     * resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourcePolicy operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest deleteResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing site. The site cannot be associated with any device or link.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Deletes an existing site. The site cannot be associated with any device or link.
     * </p>
     * 
     * @param deleteSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler);

    /**
     * <p>
     * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or
     * modify any of its attachments. This action removes any customer gateway associations.
     * </p>
     * 
     * @param deregisterTransitGatewayRequest
     * @return A Java Future containing the result of the DeregisterTransitGateway operation returned by the service.
     * @sample AWSNetworkManagerAsync.DeregisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeregisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTransitGatewayResult> deregisterTransitGatewayAsync(DeregisterTransitGatewayRequest deregisterTransitGatewayRequest);

    /**
     * <p>
     * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or
     * modify any of its attachments. This action removes any customer gateway associations.
     * </p>
     * 
     * @param deregisterTransitGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterTransitGateway operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DeregisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeregisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterTransitGatewayResult> deregisterTransitGatewayAsync(DeregisterTransitGatewayRequest deregisterTransitGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterTransitGatewayRequest, DeregisterTransitGatewayResult> asyncHandler);

    /**
     * <p>
     * Describes one or more global networks. By default, all global networks are described. To describe the objects in
     * your global network, you must use the appropriate <code>Get*</code> action. For example, to list the transit
     * gateways in your global network, use <a>GetTransitGatewayRegistrations</a>.
     * </p>
     * 
     * @param describeGlobalNetworksRequest
     * @return A Java Future containing the result of the DescribeGlobalNetworks operation returned by the service.
     * @sample AWSNetworkManagerAsync.DescribeGlobalNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DescribeGlobalNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalNetworksResult> describeGlobalNetworksAsync(DescribeGlobalNetworksRequest describeGlobalNetworksRequest);

    /**
     * <p>
     * Describes one or more global networks. By default, all global networks are described. To describe the objects in
     * your global network, you must use the appropriate <code>Get*</code> action. For example, to list the transit
     * gateways in your global network, use <a>GetTransitGatewayRegistrations</a>.
     * </p>
     * 
     * @param describeGlobalNetworksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGlobalNetworks operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DescribeGlobalNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DescribeGlobalNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGlobalNetworksResult> describeGlobalNetworksAsync(DescribeGlobalNetworksRequest describeGlobalNetworksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGlobalNetworksRequest, DescribeGlobalNetworksResult> asyncHandler);

    /**
     * <p>
     * Disassociates a core network Connect peer from a device and a link.
     * </p>
     * 
     * @param disassociateConnectPeerRequest
     * @return A Java Future containing the result of the DisassociateConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsync.DisassociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectPeerResult> disassociateConnectPeerAsync(DisassociateConnectPeerRequest disassociateConnectPeerRequest);

    /**
     * <p>
     * Disassociates a core network Connect peer from a device and a link.
     * </p>
     * 
     * @param disassociateConnectPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DisassociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateConnectPeerResult> disassociateConnectPeerAsync(DisassociateConnectPeerRequest disassociateConnectPeerRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateConnectPeerRequest, DisassociateConnectPeerResult> asyncHandler);

    /**
     * <p>
     * Disassociates a customer gateway from a device and a link.
     * </p>
     * 
     * @param disassociateCustomerGatewayRequest
     * @return A Java Future containing the result of the DisassociateCustomerGateway operation returned by the service.
     * @sample AWSNetworkManagerAsync.DisassociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCustomerGatewayResult> disassociateCustomerGatewayAsync(
            DisassociateCustomerGatewayRequest disassociateCustomerGatewayRequest);

    /**
     * <p>
     * Disassociates a customer gateway from a device and a link.
     * </p>
     * 
     * @param disassociateCustomerGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateCustomerGateway operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DisassociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCustomerGatewayResult> disassociateCustomerGatewayAsync(
            DisassociateCustomerGatewayRequest disassociateCustomerGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateCustomerGatewayRequest, DisassociateCustomerGatewayResult> asyncHandler);

    /**
     * <p>
     * Disassociates an existing device from a link. You must first disassociate any customer gateways that are
     * associated with the link.
     * </p>
     * 
     * @param disassociateLinkRequest
     * @return A Java Future containing the result of the DisassociateLink operation returned by the service.
     * @sample AWSNetworkManagerAsync.DisassociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLinkResult> disassociateLinkAsync(DisassociateLinkRequest disassociateLinkRequest);

    /**
     * <p>
     * Disassociates an existing device from a link. You must first disassociate any customer gateways that are
     * associated with the link.
     * </p>
     * 
     * @param disassociateLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateLink operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.DisassociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateLink"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateLinkResult> disassociateLinkAsync(DisassociateLinkRequest disassociateLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateLinkRequest, DisassociateLinkResult> asyncHandler);

    /**
     * <p>
     * Disassociates a transit gateway Connect peer from a device and link.
     * </p>
     * 
     * @param disassociateTransitGatewayConnectPeerRequest
     * @return A Java Future containing the result of the DisassociateTransitGatewayConnectPeer operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsync.DisassociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTransitGatewayConnectPeerResult> disassociateTransitGatewayConnectPeerAsync(
            DisassociateTransitGatewayConnectPeerRequest disassociateTransitGatewayConnectPeerRequest);

    /**
     * <p>
     * Disassociates a transit gateway Connect peer from a device and link.
     * </p>
     * 
     * @param disassociateTransitGatewayConnectPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateTransitGatewayConnectPeer operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsyncHandler.DisassociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateTransitGatewayConnectPeerResult> disassociateTransitGatewayConnectPeerAsync(
            DisassociateTransitGatewayConnectPeerRequest disassociateTransitGatewayConnectPeerRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateTransitGatewayConnectPeerRequest, DisassociateTransitGatewayConnectPeerResult> asyncHandler);

    /**
     * <p>
     * Executes a change set on your core network. Deploys changes globally based on the policy submitted..
     * </p>
     * 
     * @param executeCoreNetworkChangeSetRequest
     * @return A Java Future containing the result of the ExecuteCoreNetworkChangeSet operation returned by the service.
     * @sample AWSNetworkManagerAsync.ExecuteCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ExecuteCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteCoreNetworkChangeSetResult> executeCoreNetworkChangeSetAsync(
            ExecuteCoreNetworkChangeSetRequest executeCoreNetworkChangeSetRequest);

    /**
     * <p>
     * Executes a change set on your core network. Deploys changes globally based on the policy submitted..
     * </p>
     * 
     * @param executeCoreNetworkChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteCoreNetworkChangeSet operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.ExecuteCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ExecuteCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteCoreNetworkChangeSetResult> executeCoreNetworkChangeSetAsync(
            ExecuteCoreNetworkChangeSetRequest executeCoreNetworkChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteCoreNetworkChangeSetRequest, ExecuteCoreNetworkChangeSetResult> asyncHandler);

    /**
     * <p>
     * Returns information about a core network Connect attachment.
     * </p>
     * 
     * @param getConnectAttachmentRequest
     * @return A Java Future containing the result of the GetConnectAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectAttachmentResult> getConnectAttachmentAsync(GetConnectAttachmentRequest getConnectAttachmentRequest);

    /**
     * <p>
     * Returns information about a core network Connect attachment.
     * </p>
     * 
     * @param getConnectAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectAttachmentResult> getConnectAttachmentAsync(GetConnectAttachmentRequest getConnectAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectAttachmentRequest, GetConnectAttachmentResult> asyncHandler);

    /**
     * <p>
     * Returns information about a core network Connect peer.
     * </p>
     * 
     * @param getConnectPeerRequest
     * @return A Java Future containing the result of the GetConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectPeerResult> getConnectPeerAsync(GetConnectPeerRequest getConnectPeerRequest);

    /**
     * <p>
     * Returns information about a core network Connect peer.
     * </p>
     * 
     * @param getConnectPeerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectPeer operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectPeerResult> getConnectPeerAsync(GetConnectPeerRequest getConnectPeerRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectPeerRequest, GetConnectPeerResult> asyncHandler);

    /**
     * <p>
     * Returns information about a core network Connect peer associations.
     * </p>
     * 
     * @param getConnectPeerAssociationsRequest
     * @return A Java Future containing the result of the GetConnectPeerAssociations operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetConnectPeerAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectPeerAssociationsResult> getConnectPeerAssociationsAsync(
            GetConnectPeerAssociationsRequest getConnectPeerAssociationsRequest);

    /**
     * <p>
     * Returns information about a core network Connect peer associations.
     * </p>
     * 
     * @param getConnectPeerAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnectPeerAssociations operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetConnectPeerAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectPeerAssociationsResult> getConnectPeerAssociationsAsync(
            GetConnectPeerAssociationsRequest getConnectPeerAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectPeerAssociationsRequest, GetConnectPeerAssociationsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more of your connections in a global network.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return A Java Future containing the result of the GetConnections operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnections" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(GetConnectionsRequest getConnectionsRequest);

    /**
     * <p>
     * Gets information about one or more of your connections in a global network.
     * </p>
     * 
     * @param getConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnections operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnections" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionsResult> getConnectionsAsync(GetConnectionsRequest getConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectionsRequest, GetConnectionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the LIVE policy for a core network.
     * </p>
     * 
     * @param getCoreNetworkRequest
     * @return A Java Future containing the result of the GetCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkResult> getCoreNetworkAsync(GetCoreNetworkRequest getCoreNetworkRequest);

    /**
     * <p>
     * Returns information about the LIVE policy for a core network.
     * </p>
     * 
     * @param getCoreNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkResult> getCoreNetworkAsync(GetCoreNetworkRequest getCoreNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoreNetworkRequest, GetCoreNetworkResult> asyncHandler);

    /**
     * <p>
     * Returns information about a core network change event.
     * </p>
     * 
     * @param getCoreNetworkChangeEventsRequest
     * @return A Java Future containing the result of the GetCoreNetworkChangeEvents operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetCoreNetworkChangeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkChangeEventsResult> getCoreNetworkChangeEventsAsync(
            GetCoreNetworkChangeEventsRequest getCoreNetworkChangeEventsRequest);

    /**
     * <p>
     * Returns information about a core network change event.
     * </p>
     * 
     * @param getCoreNetworkChangeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoreNetworkChangeEvents operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetCoreNetworkChangeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkChangeEventsResult> getCoreNetworkChangeEventsAsync(
            GetCoreNetworkChangeEventsRequest getCoreNetworkChangeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoreNetworkChangeEventsRequest, GetCoreNetworkChangeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a change set between the LIVE core network policy and a submitted policy.
     * </p>
     * 
     * @param getCoreNetworkChangeSetRequest
     * @return A Java Future containing the result of the GetCoreNetworkChangeSet operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkChangeSetResult> getCoreNetworkChangeSetAsync(GetCoreNetworkChangeSetRequest getCoreNetworkChangeSetRequest);

    /**
     * <p>
     * Returns a change set between the LIVE core network policy and a submitted policy.
     * </p>
     * 
     * @param getCoreNetworkChangeSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoreNetworkChangeSet operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkChangeSetResult> getCoreNetworkChangeSetAsync(GetCoreNetworkChangeSetRequest getCoreNetworkChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoreNetworkChangeSetRequest, GetCoreNetworkChangeSetResult> asyncHandler);

    /**
     * <p>
     * Returns details about a core network policy. You can get details about your current live policy or any previous
     * policy version.
     * </p>
     * 
     * @param getCoreNetworkPolicyRequest
     * @return A Java Future containing the result of the GetCoreNetworkPolicy operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkPolicyResult> getCoreNetworkPolicyAsync(GetCoreNetworkPolicyRequest getCoreNetworkPolicyRequest);

    /**
     * <p>
     * Returns details about a core network policy. You can get details about your current live policy or any previous
     * policy version.
     * </p>
     * 
     * @param getCoreNetworkPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoreNetworkPolicy operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoreNetworkPolicyResult> getCoreNetworkPolicyAsync(GetCoreNetworkPolicyRequest getCoreNetworkPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoreNetworkPolicyRequest, GetCoreNetworkPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets the association information for customer gateways that are associated with devices and links in your global
     * network.
     * </p>
     * 
     * @param getCustomerGatewayAssociationsRequest
     * @return A Java Future containing the result of the GetCustomerGatewayAssociations operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.GetCustomerGatewayAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCustomerGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCustomerGatewayAssociationsResult> getCustomerGatewayAssociationsAsync(
            GetCustomerGatewayAssociationsRequest getCustomerGatewayAssociationsRequest);

    /**
     * <p>
     * Gets the association information for customer gateways that are associated with devices and links in your global
     * network.
     * </p>
     * 
     * @param getCustomerGatewayAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCustomerGatewayAssociations operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.GetCustomerGatewayAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCustomerGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCustomerGatewayAssociationsResult> getCustomerGatewayAssociationsAsync(
            GetCustomerGatewayAssociationsRequest getCustomerGatewayAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCustomerGatewayAssociationsRequest, GetCustomerGatewayAssociationsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more of your devices in a global network.
     * </p>
     * 
     * @param getDevicesRequest
     * @return A Java Future containing the result of the GetDevices operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevicesResult> getDevicesAsync(GetDevicesRequest getDevicesRequest);

    /**
     * <p>
     * Gets information about one or more of your devices in a global network.
     * </p>
     * 
     * @param getDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevices operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDevicesResult> getDevicesAsync(GetDevicesRequest getDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicesRequest, GetDevicesResult> asyncHandler);

    /**
     * <p>
     * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
     * </p>
     * 
     * @param getLinkAssociationsRequest
     * @return A Java Future containing the result of the GetLinkAssociations operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetLinkAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinkAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLinkAssociationsResult> getLinkAssociationsAsync(GetLinkAssociationsRequest getLinkAssociationsRequest);

    /**
     * <p>
     * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
     * </p>
     * 
     * @param getLinkAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLinkAssociations operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetLinkAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinkAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLinkAssociationsResult> getLinkAssociationsAsync(GetLinkAssociationsRequest getLinkAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetLinkAssociationsRequest, GetLinkAssociationsResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more links in a specified global network.
     * </p>
     * <p>
     * If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type
     * and provider in the same request.
     * </p>
     * 
     * @param getLinksRequest
     * @return A Java Future containing the result of the GetLinks operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLinksResult> getLinksAsync(GetLinksRequest getLinksRequest);

    /**
     * <p>
     * Gets information about one or more links in a specified global network.
     * </p>
     * <p>
     * If you specify the site ID, you cannot specify the type or provider in the same request. You can specify the type
     * and provider in the same request.
     * </p>
     * 
     * @param getLinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLinks operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLinksResult> getLinksAsync(GetLinksRequest getLinksRequest,
            com.amazonaws.handlers.AsyncHandler<GetLinksRequest, GetLinksResult> asyncHandler);

    /**
     * <p>
     * Gets the count of network resources, by resource type, for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceCountsRequest
     * @return A Java Future containing the result of the GetNetworkResourceCounts operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetNetworkResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourceCountsResult> getNetworkResourceCountsAsync(GetNetworkResourceCountsRequest getNetworkResourceCountsRequest);

    /**
     * <p>
     * Gets the count of network resources, by resource type, for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceCountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkResourceCounts operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetNetworkResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourceCountsResult> getNetworkResourceCountsAsync(GetNetworkResourceCountsRequest getNetworkResourceCountsRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkResourceCountsRequest, GetNetworkResourceCountsResult> asyncHandler);

    /**
     * <p>
     * Gets the network resource relationships for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceRelationshipsRequest
     * @return A Java Future containing the result of the GetNetworkResourceRelationships operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.GetNetworkResourceRelationships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceRelationships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourceRelationshipsResult> getNetworkResourceRelationshipsAsync(
            GetNetworkResourceRelationshipsRequest getNetworkResourceRelationshipsRequest);

    /**
     * <p>
     * Gets the network resource relationships for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceRelationshipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkResourceRelationships operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.GetNetworkResourceRelationships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceRelationships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourceRelationshipsResult> getNetworkResourceRelationshipsAsync(
            GetNetworkResourceRelationshipsRequest getNetworkResourceRelationshipsRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkResourceRelationshipsRequest, GetNetworkResourceRelationshipsResult> asyncHandler);

    /**
     * <p>
     * Describes the network resources for the specified global network.
     * </p>
     * <p>
     * The results include information from the corresponding Describe call for the resource, minus any sensitive
     * information such as pre-shared keys.
     * </p>
     * 
     * @param getNetworkResourcesRequest
     * @return A Java Future containing the result of the GetNetworkResources operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourcesResult> getNetworkResourcesAsync(GetNetworkResourcesRequest getNetworkResourcesRequest);

    /**
     * <p>
     * Describes the network resources for the specified global network.
     * </p>
     * <p>
     * The results include information from the corresponding Describe call for the resource, minus any sensitive
     * information such as pre-shared keys.
     * </p>
     * 
     * @param getNetworkResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkResources operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkResourcesResult> getNetworkResourcesAsync(GetNetworkResourcesRequest getNetworkResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkResourcesRequest, GetNetworkResourcesResult> asyncHandler);

    /**
     * <p>
     * Gets the network routes of the specified global network.
     * </p>
     * 
     * @param getNetworkRoutesRequest
     * @return A Java Future containing the result of the GetNetworkRoutes operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetNetworkRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkRoutesResult> getNetworkRoutesAsync(GetNetworkRoutesRequest getNetworkRoutesRequest);

    /**
     * <p>
     * Gets the network routes of the specified global network.
     * </p>
     * 
     * @param getNetworkRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkRoutes operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetNetworkRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkRoutesResult> getNetworkRoutesAsync(GetNetworkRoutesRequest getNetworkRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkRoutesRequest, GetNetworkRoutesResult> asyncHandler);

    /**
     * <p>
     * Gets the network telemetry of the specified global network.
     * </p>
     * 
     * @param getNetworkTelemetryRequest
     * @return A Java Future containing the result of the GetNetworkTelemetry operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetNetworkTelemetry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkTelemetry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkTelemetryResult> getNetworkTelemetryAsync(GetNetworkTelemetryRequest getNetworkTelemetryRequest);

    /**
     * <p>
     * Gets the network telemetry of the specified global network.
     * </p>
     * 
     * @param getNetworkTelemetryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNetworkTelemetry operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetNetworkTelemetry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkTelemetry"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNetworkTelemetryResult> getNetworkTelemetryAsync(GetNetworkTelemetryRequest getNetworkTelemetryRequest,
            com.amazonaws.handlers.AsyncHandler<GetNetworkTelemetryRequest, GetNetworkTelemetryResult> asyncHandler);

    /**
     * <p>
     * Returns information about a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Returns information about a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourcePolicy operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourcePolicyResult> getResourcePolicyAsync(GetResourcePolicyRequest getResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourcePolicyRequest, GetResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified route analysis.
     * </p>
     * 
     * @param getRouteAnalysisRequest
     * @return A Java Future containing the result of the GetRouteAnalysis operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRouteAnalysisResult> getRouteAnalysisAsync(GetRouteAnalysisRequest getRouteAnalysisRequest);

    /**
     * <p>
     * Gets information about the specified route analysis.
     * </p>
     * 
     * @param getRouteAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRouteAnalysis operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRouteAnalysisResult> getRouteAnalysisAsync(GetRouteAnalysisRequest getRouteAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<GetRouteAnalysisRequest, GetRouteAnalysisResult> asyncHandler);

    /**
     * <p>
     * Returns information about a site-to-site VPN attachment.
     * </p>
     * 
     * @param getSiteToSiteVpnAttachmentRequest
     * @return A Java Future containing the result of the GetSiteToSiteVpnAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSiteToSiteVpnAttachmentResult> getSiteToSiteVpnAttachmentAsync(
            GetSiteToSiteVpnAttachmentRequest getSiteToSiteVpnAttachmentRequest);

    /**
     * <p>
     * Returns information about a site-to-site VPN attachment.
     * </p>
     * 
     * @param getSiteToSiteVpnAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSiteToSiteVpnAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSiteToSiteVpnAttachmentResult> getSiteToSiteVpnAttachmentAsync(
            GetSiteToSiteVpnAttachmentRequest getSiteToSiteVpnAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetSiteToSiteVpnAttachmentRequest, GetSiteToSiteVpnAttachmentResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more of your sites in a global network.
     * </p>
     * 
     * @param getSitesRequest
     * @return A Java Future containing the result of the GetSites operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSitesResult> getSitesAsync(GetSitesRequest getSitesRequest);

    /**
     * <p>
     * Gets information about one or more of your sites in a global network.
     * </p>
     * 
     * @param getSitesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSites operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSitesResult> getSitesAsync(GetSitesRequest getSitesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSitesRequest, GetSitesResult> asyncHandler);

    /**
     * <p>
     * Gets information about one or more of your transit gateway Connect peer associations in a global network.
     * </p>
     * 
     * @param getTransitGatewayConnectPeerAssociationsRequest
     * @return A Java Future containing the result of the GetTransitGatewayConnectPeerAssociations operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsync.GetTransitGatewayConnectPeerAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayConnectPeerAssociationsResult> getTransitGatewayConnectPeerAssociationsAsync(
            GetTransitGatewayConnectPeerAssociationsRequest getTransitGatewayConnectPeerAssociationsRequest);

    /**
     * <p>
     * Gets information about one or more of your transit gateway Connect peer associations in a global network.
     * </p>
     * 
     * @param getTransitGatewayConnectPeerAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTransitGatewayConnectPeerAssociations operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsyncHandler.GetTransitGatewayConnectPeerAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayConnectPeerAssociationsResult> getTransitGatewayConnectPeerAssociationsAsync(
            GetTransitGatewayConnectPeerAssociationsRequest getTransitGatewayConnectPeerAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTransitGatewayConnectPeerAssociationsRequest, GetTransitGatewayConnectPeerAssociationsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a transit gateway peer.
     * </p>
     * 
     * @param getTransitGatewayPeeringRequest
     * @return A Java Future containing the result of the GetTransitGatewayPeering operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayPeeringResult> getTransitGatewayPeeringAsync(GetTransitGatewayPeeringRequest getTransitGatewayPeeringRequest);

    /**
     * <p>
     * Returns information about a transit gateway peer.
     * </p>
     * 
     * @param getTransitGatewayPeeringRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTransitGatewayPeering operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayPeeringResult> getTransitGatewayPeeringAsync(GetTransitGatewayPeeringRequest getTransitGatewayPeeringRequest,
            com.amazonaws.handlers.AsyncHandler<GetTransitGatewayPeeringRequest, GetTransitGatewayPeeringResult> asyncHandler);

    /**
     * <p>
     * Gets information about the transit gateway registrations in a specified global network.
     * </p>
     * 
     * @param getTransitGatewayRegistrationsRequest
     * @return A Java Future containing the result of the GetTransitGatewayRegistrations operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.GetTransitGatewayRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayRegistrationsResult> getTransitGatewayRegistrationsAsync(
            GetTransitGatewayRegistrationsRequest getTransitGatewayRegistrationsRequest);

    /**
     * <p>
     * Gets information about the transit gateway registrations in a specified global network.
     * </p>
     * 
     * @param getTransitGatewayRegistrationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTransitGatewayRegistrations operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.GetTransitGatewayRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayRegistrationsResult> getTransitGatewayRegistrationsAsync(
            GetTransitGatewayRegistrationsRequest getTransitGatewayRegistrationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRegistrationsRequest, GetTransitGatewayRegistrationsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a transit gateway route table attachment.
     * </p>
     * 
     * @param getTransitGatewayRouteTableAttachmentRequest
     * @return A Java Future containing the result of the GetTransitGatewayRouteTableAttachment operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsync.GetTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayRouteTableAttachmentResult> getTransitGatewayRouteTableAttachmentAsync(
            GetTransitGatewayRouteTableAttachmentRequest getTransitGatewayRouteTableAttachmentRequest);

    /**
     * <p>
     * Returns information about a transit gateway route table attachment.
     * </p>
     * 
     * @param getTransitGatewayRouteTableAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTransitGatewayRouteTableAttachment operation returned by
     *         the service.
     * @sample AWSNetworkManagerAsyncHandler.GetTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTransitGatewayRouteTableAttachmentResult> getTransitGatewayRouteTableAttachmentAsync(
            GetTransitGatewayRouteTableAttachmentRequest getTransitGatewayRouteTableAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRouteTableAttachmentRequest, GetTransitGatewayRouteTableAttachmentResult> asyncHandler);

    /**
     * <p>
     * Returns information about a VPC attachment.
     * </p>
     * 
     * @param getVpcAttachmentRequest
     * @return A Java Future containing the result of the GetVpcAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.GetVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVpcAttachmentResult> getVpcAttachmentAsync(GetVpcAttachmentRequest getVpcAttachmentRequest);

    /**
     * <p>
     * Returns information about a VPC attachment.
     * </p>
     * 
     * @param getVpcAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVpcAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.GetVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVpcAttachmentResult> getVpcAttachmentAsync(GetVpcAttachmentRequest getVpcAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetVpcAttachmentRequest, GetVpcAttachmentResult> asyncHandler);

    /**
     * <p>
     * Returns a list of core network attachments.
     * </p>
     * 
     * @param listAttachmentsRequest
     * @return A Java Future containing the result of the ListAttachments operation returned by the service.
     * @sample AWSNetworkManagerAsync.ListAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListAttachments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAttachmentsResult> listAttachmentsAsync(ListAttachmentsRequest listAttachmentsRequest);

    /**
     * <p>
     * Returns a list of core network attachments.
     * </p>
     * 
     * @param listAttachmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttachments operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.ListAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListAttachments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAttachmentsResult> listAttachmentsAsync(ListAttachmentsRequest listAttachmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttachmentsRequest, ListAttachmentsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of core network Connect peers.
     * </p>
     * 
     * @param listConnectPeersRequest
     * @return A Java Future containing the result of the ListConnectPeers operation returned by the service.
     * @sample AWSNetworkManagerAsync.ListConnectPeers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListConnectPeers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectPeersResult> listConnectPeersAsync(ListConnectPeersRequest listConnectPeersRequest);

    /**
     * <p>
     * Returns a list of core network Connect peers.
     * </p>
     * 
     * @param listConnectPeersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConnectPeers operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.ListConnectPeers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListConnectPeers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConnectPeersResult> listConnectPeersAsync(ListConnectPeersRequest listConnectPeersRequest,
            com.amazonaws.handlers.AsyncHandler<ListConnectPeersRequest, ListConnectPeersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of core network policy versions.
     * </p>
     * 
     * @param listCoreNetworkPolicyVersionsRequest
     * @return A Java Future containing the result of the ListCoreNetworkPolicyVersions operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.ListCoreNetworkPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworkPolicyVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreNetworkPolicyVersionsResult> listCoreNetworkPolicyVersionsAsync(
            ListCoreNetworkPolicyVersionsRequest listCoreNetworkPolicyVersionsRequest);

    /**
     * <p>
     * Returns a list of core network policy versions.
     * </p>
     * 
     * @param listCoreNetworkPolicyVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoreNetworkPolicyVersions operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.ListCoreNetworkPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworkPolicyVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreNetworkPolicyVersionsResult> listCoreNetworkPolicyVersionsAsync(
            ListCoreNetworkPolicyVersionsRequest listCoreNetworkPolicyVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoreNetworkPolicyVersionsRequest, ListCoreNetworkPolicyVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of owned and shared core networks.
     * </p>
     * 
     * @param listCoreNetworksRequest
     * @return A Java Future containing the result of the ListCoreNetworks operation returned by the service.
     * @sample AWSNetworkManagerAsync.ListCoreNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreNetworksResult> listCoreNetworksAsync(ListCoreNetworksRequest listCoreNetworksRequest);

    /**
     * <p>
     * Returns a list of owned and shared core networks.
     * </p>
     * 
     * @param listCoreNetworksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoreNetworks operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.ListCoreNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoreNetworksResult> listCoreNetworksAsync(ListCoreNetworksRequest listCoreNetworksRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoreNetworksRequest, ListCoreNetworksResult> asyncHandler);

    /**
     * <p>
     * Gets the status of the Service Linked Role (SLR) deployment for the accounts in a given Amazon Web Services
     * Organization.
     * </p>
     * 
     * @param listOrganizationServiceAccessStatusRequest
     * @return A Java Future containing the result of the ListOrganizationServiceAccessStatus operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.ListOrganizationServiceAccessStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListOrganizationServiceAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationServiceAccessStatusResult> listOrganizationServiceAccessStatusAsync(
            ListOrganizationServiceAccessStatusRequest listOrganizationServiceAccessStatusRequest);

    /**
     * <p>
     * Gets the status of the Service Linked Role (SLR) deployment for the accounts in a given Amazon Web Services
     * Organization.
     * </p>
     * 
     * @param listOrganizationServiceAccessStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationServiceAccessStatus operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.ListOrganizationServiceAccessStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListOrganizationServiceAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationServiceAccessStatusResult> listOrganizationServiceAccessStatusAsync(
            ListOrganizationServiceAccessStatusRequest listOrganizationServiceAccessStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationServiceAccessStatusRequest, ListOrganizationServiceAccessStatusResult> asyncHandler);

    /**
     * <p>
     * Lists the peerings for a core network.
     * </p>
     * 
     * @param listPeeringsRequest
     * @return A Java Future containing the result of the ListPeerings operation returned by the service.
     * @sample AWSNetworkManagerAsync.ListPeerings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListPeerings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPeeringsResult> listPeeringsAsync(ListPeeringsRequest listPeeringsRequest);

    /**
     * <p>
     * Lists the peerings for a core network.
     * </p>
     * 
     * @param listPeeringsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPeerings operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.ListPeerings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListPeerings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPeeringsResult> listPeeringsAsync(ListPeeringsRequest listPeeringsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPeeringsRequest, ListPeeringsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSNetworkManagerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new, immutable version of a core network policy. A subsequent change set is created showing the
     * differences between the LIVE policy and the submitted policy.
     * </p>
     * 
     * @param putCoreNetworkPolicyRequest
     * @return A Java Future containing the result of the PutCoreNetworkPolicy operation returned by the service.
     * @sample AWSNetworkManagerAsync.PutCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutCoreNetworkPolicyResult> putCoreNetworkPolicyAsync(PutCoreNetworkPolicyRequest putCoreNetworkPolicyRequest);

    /**
     * <p>
     * Creates a new, immutable version of a core network policy. A subsequent change set is created showing the
     * differences between the LIVE policy and the submitted policy.
     * </p>
     * 
     * @param putCoreNetworkPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutCoreNetworkPolicy operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.PutCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutCoreNetworkPolicyResult> putCoreNetworkPolicyAsync(PutCoreNetworkPolicyRequest putCoreNetworkPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutCoreNetworkPolicyRequest, PutCoreNetworkPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a resource policy.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSNetworkManagerAsync.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Creates or updates a resource policy.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourcePolicy operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest putResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Registers a transit gateway in your global network. The transit gateway can be in any Amazon Web Services Region,
     * but it must be owned by the same Amazon Web Services account that owns the global network. You cannot register a
     * transit gateway in more than one global network.
     * </p>
     * 
     * @param registerTransitGatewayRequest
     * @return A Java Future containing the result of the RegisterTransitGateway operation returned by the service.
     * @sample AWSNetworkManagerAsync.RegisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RegisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTransitGatewayResult> registerTransitGatewayAsync(RegisterTransitGatewayRequest registerTransitGatewayRequest);

    /**
     * <p>
     * Registers a transit gateway in your global network. The transit gateway can be in any Amazon Web Services Region,
     * but it must be owned by the same Amazon Web Services account that owns the global network. You cannot register a
     * transit gateway in more than one global network.
     * </p>
     * 
     * @param registerTransitGatewayRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterTransitGateway operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.RegisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RegisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterTransitGatewayResult> registerTransitGatewayAsync(RegisterTransitGatewayRequest registerTransitGatewayRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterTransitGatewayRequest, RegisterTransitGatewayResult> asyncHandler);

    /**
     * <p>
     * Rejects a core network attachment request.
     * </p>
     * 
     * @param rejectAttachmentRequest
     * @return A Java Future containing the result of the RejectAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.RejectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RejectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectAttachmentResult> rejectAttachmentAsync(RejectAttachmentRequest rejectAttachmentRequest);

    /**
     * <p>
     * Rejects a core network attachment request.
     * </p>
     * 
     * @param rejectAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RejectAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.RejectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RejectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RejectAttachmentResult> rejectAttachmentAsync(RejectAttachmentRequest rejectAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<RejectAttachmentRequest, RejectAttachmentResult> asyncHandler);

    /**
     * <p>
     * Restores a previous policy version as a new, immutable version of a core network policy. A subsequent change set
     * is created showing the differences between the LIVE policy and restored policy.
     * </p>
     * 
     * @param restoreCoreNetworkPolicyVersionRequest
     * @return A Java Future containing the result of the RestoreCoreNetworkPolicyVersion operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.RestoreCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RestoreCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreCoreNetworkPolicyVersionResult> restoreCoreNetworkPolicyVersionAsync(
            RestoreCoreNetworkPolicyVersionRequest restoreCoreNetworkPolicyVersionRequest);

    /**
     * <p>
     * Restores a previous policy version as a new, immutable version of a core network policy. A subsequent change set
     * is created showing the differences between the LIVE policy and restored policy.
     * </p>
     * 
     * @param restoreCoreNetworkPolicyVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreCoreNetworkPolicyVersion operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.RestoreCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RestoreCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreCoreNetworkPolicyVersionResult> restoreCoreNetworkPolicyVersionAsync(
            RestoreCoreNetworkPolicyVersionRequest restoreCoreNetworkPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreCoreNetworkPolicyVersionRequest, RestoreCoreNetworkPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Enables the Network Manager service for an Amazon Web Services Organization. This can only be called by a
     * management account within the organization.
     * </p>
     * 
     * @param startOrganizationServiceAccessUpdateRequest
     * @return A Java Future containing the result of the StartOrganizationServiceAccessUpdate operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.StartOrganizationServiceAccessUpdate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartOrganizationServiceAccessUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOrganizationServiceAccessUpdateResult> startOrganizationServiceAccessUpdateAsync(
            StartOrganizationServiceAccessUpdateRequest startOrganizationServiceAccessUpdateRequest);

    /**
     * <p>
     * Enables the Network Manager service for an Amazon Web Services Organization. This can only be called by a
     * management account within the organization.
     * </p>
     * 
     * @param startOrganizationServiceAccessUpdateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartOrganizationServiceAccessUpdate operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.StartOrganizationServiceAccessUpdate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartOrganizationServiceAccessUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartOrganizationServiceAccessUpdateResult> startOrganizationServiceAccessUpdateAsync(
            StartOrganizationServiceAccessUpdateRequest startOrganizationServiceAccessUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<StartOrganizationServiceAccessUpdateRequest, StartOrganizationServiceAccessUpdateResult> asyncHandler);

    /**
     * <p>
     * Starts analyzing the routing path between the specified source and destination. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/route-analyzer.html">Route Analyzer</a>.
     * </p>
     * 
     * @param startRouteAnalysisRequest
     * @return A Java Future containing the result of the StartRouteAnalysis operation returned by the service.
     * @sample AWSNetworkManagerAsync.StartRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRouteAnalysisResult> startRouteAnalysisAsync(StartRouteAnalysisRequest startRouteAnalysisRequest);

    /**
     * <p>
     * Starts analyzing the routing path between the specified source and destination. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/route-analyzer.html">Route Analyzer</a>.
     * </p>
     * 
     * @param startRouteAnalysisRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRouteAnalysis operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.StartRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartRouteAnalysisResult> startRouteAnalysisAsync(StartRouteAnalysisRequest startRouteAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<StartRouteAnalysisRequest, StartRouteAnalysisResult> asyncHandler);

    /**
     * <p>
     * Tags a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSNetworkManagerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSNetworkManagerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the information for an existing connection. To remove information for any of the parameters, specify an
     * empty string.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return A Java Future containing the result of the UpdateConnection operation returned by the service.
     * @sample AWSNetworkManagerAsync.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest updateConnectionRequest);

    /**
     * <p>
     * Updates the information for an existing connection. To remove information for any of the parameters, specify an
     * empty string.
     * </p>
     * 
     * @param updateConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConnection operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest updateConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResult> asyncHandler);

    /**
     * <p>
     * Updates the description of a core network.
     * </p>
     * 
     * @param updateCoreNetworkRequest
     * @return A Java Future containing the result of the UpdateCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsync.UpdateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCoreNetworkResult> updateCoreNetworkAsync(UpdateCoreNetworkRequest updateCoreNetworkRequest);

    /**
     * <p>
     * Updates the description of a core network.
     * </p>
     * 
     * @param updateCoreNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCoreNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateCoreNetworkResult> updateCoreNetworkAsync(UpdateCoreNetworkRequest updateCoreNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCoreNetworkRequest, UpdateCoreNetworkResult> asyncHandler);

    /**
     * <p>
     * Updates the details for an existing device. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return A Java Future containing the result of the UpdateDevice operation returned by the service.
     * @sample AWSNetworkManagerAsync.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest updateDeviceRequest);

    /**
     * <p>
     * Updates the details for an existing device. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDevice operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest updateDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceRequest, UpdateDeviceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
     * </p>
     * 
     * @param updateGlobalNetworkRequest
     * @return A Java Future containing the result of the UpdateGlobalNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsync.UpdateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalNetworkResult> updateGlobalNetworkAsync(UpdateGlobalNetworkRequest updateGlobalNetworkRequest);

    /**
     * <p>
     * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
     * </p>
     * 
     * @param updateGlobalNetworkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlobalNetwork operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalNetworkResult> updateGlobalNetworkAsync(UpdateGlobalNetworkRequest updateGlobalNetworkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalNetworkRequest, UpdateGlobalNetworkResult> asyncHandler);

    /**
     * <p>
     * Updates the details for an existing link. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateLinkRequest
     * @return A Java Future containing the result of the UpdateLink operation returned by the service.
     * @sample AWSNetworkManagerAsync.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest updateLinkRequest);

    /**
     * <p>
     * Updates the details for an existing link. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLink operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest updateLinkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLinkRequest, UpdateLinkResult> asyncHandler);

    /**
     * <p>
     * Updates the resource metadata for the specified global network.
     * </p>
     * 
     * @param updateNetworkResourceMetadataRequest
     * @return A Java Future containing the result of the UpdateNetworkResourceMetadata operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsync.UpdateNetworkResourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateNetworkResourceMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkResourceMetadataResult> updateNetworkResourceMetadataAsync(
            UpdateNetworkResourceMetadataRequest updateNetworkResourceMetadataRequest);

    /**
     * <p>
     * Updates the resource metadata for the specified global network.
     * </p>
     * 
     * @param updateNetworkResourceMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNetworkResourceMetadata operation returned by the
     *         service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateNetworkResourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateNetworkResourceMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNetworkResourceMetadataResult> updateNetworkResourceMetadataAsync(
            UpdateNetworkResourceMetadataRequest updateNetworkResourceMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNetworkResourceMetadataRequest, UpdateNetworkResourceMetadataResult> asyncHandler);

    /**
     * <p>
     * Updates the information for an existing site. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateSiteRequest
     * @return A Java Future containing the result of the UpdateSite operation returned by the service.
     * @sample AWSNetworkManagerAsync.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest updateSiteRequest);

    /**
     * <p>
     * Updates the information for an existing site. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSite operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest updateSiteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSiteRequest, UpdateSiteResult> asyncHandler);

    /**
     * <p>
     * Updates a VPC attachment.
     * </p>
     * 
     * @param updateVpcAttachmentRequest
     * @return A Java Future containing the result of the UpdateVpcAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsync.UpdateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVpcAttachmentResult> updateVpcAttachmentAsync(UpdateVpcAttachmentRequest updateVpcAttachmentRequest);

    /**
     * <p>
     * Updates a VPC attachment.
     * </p>
     * 
     * @param updateVpcAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVpcAttachment operation returned by the service.
     * @sample AWSNetworkManagerAsyncHandler.UpdateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVpcAttachmentResult> updateVpcAttachmentAsync(UpdateVpcAttachmentRequest updateVpcAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResult> asyncHandler);

}
