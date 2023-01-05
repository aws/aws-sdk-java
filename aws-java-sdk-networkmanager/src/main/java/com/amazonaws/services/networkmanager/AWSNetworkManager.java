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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.networkmanager.model.*;

/**
 * Interface for accessing NetworkManager.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.networkmanager.AbstractAWSNetworkManager} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services enables you to centrally manage your Amazon Web Services Cloud WAN core network and your Transit
 * Gateway network across Amazon Web Services accounts, Regions, and on-premises locations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSNetworkManager {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "networkmanager";

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
     * @return Result of the AcceptAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AcceptAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AcceptAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptAttachmentResult acceptAttachment(AcceptAttachmentRequest acceptAttachmentRequest);

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
     * @return Result of the AssociateConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateConnectPeerResult associateConnectPeer(AssociateConnectPeerRequest associateConnectPeerRequest);

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
     * @return Result of the AssociateCustomerGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateCustomerGatewayResult associateCustomerGateway(AssociateCustomerGatewayRequest associateCustomerGatewayRequest);

    /**
     * <p>
     * Associates a link to a device. A device can be associated to multiple links and a link can be associated to
     * multiple devices. The device and link must be in the same global network and the same site.
     * </p>
     * 
     * @param associateLinkRequest
     * @return Result of the AssociateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateLink" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateLinkResult associateLink(AssociateLinkRequest associateLinkRequest);

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
     * @return Result of the AssociateTransitGatewayConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.AssociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AssociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateTransitGatewayConnectPeerResult associateTransitGatewayConnectPeer(
            AssociateTransitGatewayConnectPeerRequest associateTransitGatewayConnectPeerRequest);

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
     * @return Result of the CreateConnectAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectAttachmentResult createConnectAttachment(CreateConnectAttachmentRequest createConnectAttachmentRequest);

    /**
     * <p>
     * Creates a core network Connect peer for a specified core network connect attachment between a core network and an
     * appliance. The peer address and transit gateway address must be the same IP address family (IPv4 or IPv6).
     * </p>
     * 
     * @param createConnectPeerRequest
     * @return Result of the CreateConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectPeerResult createConnectPeer(CreateConnectPeerRequest createConnectPeerRequest);

    /**
     * <p>
     * Creates a connection between two devices. The devices can be a physical or virtual appliance that connects to a
     * third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an
     * on-premises network.
     * </p>
     * 
     * @param createConnectionRequest
     * @return Result of the CreateConnection operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    CreateConnectionResult createConnection(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Creates a core network as part of your global network, and optionally, with a core network policy.
     * </p>
     * 
     * @param createCoreNetworkRequest
     * @return Result of the CreateCoreNetwork operation returned by the service.
     * @throws CoreNetworkPolicyException
     *         Describes a core network policy exception.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCoreNetworkResult createCoreNetwork(CreateCoreNetworkRequest createCoreNetworkRequest);

    /**
     * <p>
     * Creates a new device in a global network. If you specify both a site ID and a location, the location of the site
     * is used for visualization in the Network Manager console.
     * </p>
     * 
     * @param createDeviceRequest
     * @return Result of the CreateDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDeviceResult createDevice(CreateDeviceRequest createDeviceRequest);

    /**
     * <p>
     * Creates a new, empty global network.
     * </p>
     * 
     * @param createGlobalNetworkRequest
     * @return Result of the CreateGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGlobalNetworkResult createGlobalNetwork(CreateGlobalNetworkRequest createGlobalNetworkRequest);

    /**
     * <p>
     * Creates a new link for a specified site.
     * </p>
     * 
     * @param createLinkRequest
     * @return Result of the CreateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLinkResult createLink(CreateLinkRequest createLinkRequest);

    /**
     * <p>
     * Creates a new site in a global network.
     * </p>
     * 
     * @param createSiteRequest
     * @return Result of the CreateSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSiteResult createSite(CreateSiteRequest createSiteRequest);

    /**
     * <p>
     * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
     * </p>
     * 
     * @param createSiteToSiteVpnAttachmentRequest
     * @return Result of the CreateSiteToSiteVpnAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSiteToSiteVpnAttachmentResult createSiteToSiteVpnAttachment(CreateSiteToSiteVpnAttachmentRequest createSiteToSiteVpnAttachmentRequest);

    /**
     * <p>
     * Creates a transit gateway peering connection.
     * </p>
     * 
     * @param createTransitGatewayPeeringRequest
     * @return Result of the CreateTransitGatewayPeering operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayPeeringResult createTransitGatewayPeering(CreateTransitGatewayPeeringRequest createTransitGatewayPeeringRequest);

    /**
     * <p>
     * Creates a transit gateway route table attachment.
     * </p>
     * 
     * @param createTransitGatewayRouteTableAttachmentRequest
     * @return Result of the CreateTransitGatewayRouteTableAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateTransitGatewayRouteTableAttachmentResult createTransitGatewayRouteTableAttachment(
            CreateTransitGatewayRouteTableAttachmentRequest createTransitGatewayRouteTableAttachmentRequest);

    /**
     * <p>
     * Creates a VPC attachment on an edge location of a core network.
     * </p>
     * 
     * @param createVpcAttachmentRequest
     * @return Result of the CreateVpcAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.CreateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CreateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVpcAttachmentResult createVpcAttachment(CreateVpcAttachmentRequest createVpcAttachmentRequest);

    /**
     * <p>
     * Deletes an attachment. Supports all attachment types.
     * </p>
     * 
     * @param deleteAttachmentRequest
     * @return Result of the DeleteAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAttachmentResult deleteAttachment(DeleteAttachmentRequest deleteAttachmentRequest);

    /**
     * <p>
     * Deletes a Connect peer.
     * </p>
     * 
     * @param deleteConnectPeerRequest
     * @return Result of the DeleteConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConnectPeerResult deleteConnectPeer(DeleteConnectPeerRequest deleteConnectPeerRequest);

    /**
     * <p>
     * Deletes the specified connection in your global network.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return Result of the DeleteConnection operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteConnection"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteConnectionResult deleteConnection(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes a core network along with all core network policies. This can only be done if there are no attachments on
     * a core network.
     * </p>
     * 
     * @param deleteCoreNetworkRequest
     * @return Result of the DeleteCoreNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCoreNetworkResult deleteCoreNetwork(DeleteCoreNetworkRequest deleteCoreNetworkRequest);

    /**
     * <p>
     * Deletes a policy version from a core network. You can't delete the current LIVE policy.
     * </p>
     * 
     * @param deleteCoreNetworkPolicyVersionRequest
     * @return Result of the DeleteCoreNetworkPolicyVersion operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.DeleteCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCoreNetworkPolicyVersionResult deleteCoreNetworkPolicyVersion(DeleteCoreNetworkPolicyVersionRequest deleteCoreNetworkPolicyVersionRequest);

    /**
     * <p>
     * Deletes an existing device. You must first disassociate the device from any links and customer gateways.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDeviceResult deleteDevice(DeleteDeviceRequest deleteDeviceRequest);

    /**
     * <p>
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites),
     * deregister all transit gateways, and delete any core networks.
     * </p>
     * 
     * @param deleteGlobalNetworkRequest
     * @return Result of the DeleteGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGlobalNetworkResult deleteGlobalNetwork(DeleteGlobalNetworkRequest deleteGlobalNetworkRequest);

    /**
     * <p>
     * Deletes an existing link. You must first disassociate the link from any devices and customer gateways.
     * </p>
     * 
     * @param deleteLinkRequest
     * @return Result of the DeleteLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLinkResult deleteLink(DeleteLinkRequest deleteLinkRequest);

    /**
     * <p>
     * Deletes an existing peering connection.
     * </p>
     * 
     * @param deletePeeringRequest
     * @return Result of the DeletePeering operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeletePeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeletePeering" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePeeringResult deletePeering(DeletePeeringRequest deletePeeringRequest);

    /**
     * <p>
     * Deletes a resource policy for the specified resource. This revokes the access of the principals specified in the
     * resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes an existing site. The site cannot be associated with any device or link.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSiteResult deleteSite(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Deregisters a transit gateway from your global network. This action does not delete your transit gateway, or
     * modify any of its attachments. This action removes any customer gateway associations.
     * </p>
     * 
     * @param deregisterTransitGatewayRequest
     * @return Result of the DeregisterTransitGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DeregisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeregisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterTransitGatewayResult deregisterTransitGateway(DeregisterTransitGatewayRequest deregisterTransitGatewayRequest);

    /**
     * <p>
     * Describes one or more global networks. By default, all global networks are described. To describe the objects in
     * your global network, you must use the appropriate <code>Get*</code> action. For example, to list the transit
     * gateways in your global network, use <a>GetTransitGatewayRegistrations</a>.
     * </p>
     * 
     * @param describeGlobalNetworksRequest
     * @return Result of the DescribeGlobalNetworks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DescribeGlobalNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DescribeGlobalNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGlobalNetworksResult describeGlobalNetworks(DescribeGlobalNetworksRequest describeGlobalNetworksRequest);

    /**
     * <p>
     * Disassociates a core network Connect peer from a device and a link.
     * </p>
     * 
     * @param disassociateConnectPeerRequest
     * @return Result of the DisassociateConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateConnectPeerResult disassociateConnectPeer(DisassociateConnectPeerRequest disassociateConnectPeerRequest);

    /**
     * <p>
     * Disassociates a customer gateway from a device and a link.
     * </p>
     * 
     * @param disassociateCustomerGatewayRequest
     * @return Result of the DisassociateCustomerGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateCustomerGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateCustomerGateway"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateCustomerGatewayResult disassociateCustomerGateway(DisassociateCustomerGatewayRequest disassociateCustomerGatewayRequest);

    /**
     * <p>
     * Disassociates an existing device from a link. You must first disassociate any customer gateways that are
     * associated with the link.
     * </p>
     * 
     * @param disassociateLinkRequest
     * @return Result of the DisassociateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateLink"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateLinkResult disassociateLink(DisassociateLinkRequest disassociateLinkRequest);

    /**
     * <p>
     * Disassociates a transit gateway Connect peer from a device and link.
     * </p>
     * 
     * @param disassociateTransitGatewayConnectPeerRequest
     * @return Result of the DisassociateTransitGatewayConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.DisassociateTransitGatewayConnectPeer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DisassociateTransitGatewayConnectPeer"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateTransitGatewayConnectPeerResult disassociateTransitGatewayConnectPeer(
            DisassociateTransitGatewayConnectPeerRequest disassociateTransitGatewayConnectPeerRequest);

    /**
     * <p>
     * Executes a change set on your core network. Deploys changes globally based on the policy submitted..
     * </p>
     * 
     * @param executeCoreNetworkChangeSetRequest
     * @return Result of the ExecuteCoreNetworkChangeSet operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.ExecuteCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ExecuteCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    ExecuteCoreNetworkChangeSetResult executeCoreNetworkChangeSet(ExecuteCoreNetworkChangeSetRequest executeCoreNetworkChangeSetRequest);

    /**
     * <p>
     * Returns information about a core network Connect attachment.
     * </p>
     * 
     * @param getConnectAttachmentRequest
     * @return Result of the GetConnectAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    GetConnectAttachmentResult getConnectAttachment(GetConnectAttachmentRequest getConnectAttachmentRequest);

    /**
     * <p>
     * Returns information about a core network Connect peer.
     * </p>
     * 
     * @param getConnectPeerRequest
     * @return Result of the GetConnectPeer operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnectPeer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeer" target="_top">AWS
     *      API Documentation</a>
     */
    GetConnectPeerResult getConnectPeer(GetConnectPeerRequest getConnectPeerRequest);

    /**
     * <p>
     * Returns information about a core network Connect peer associations.
     * </p>
     * 
     * @param getConnectPeerAssociationsRequest
     * @return Result of the GetConnectPeerAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnectPeerAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetConnectPeerAssociationsResult getConnectPeerAssociations(GetConnectPeerAssociationsRequest getConnectPeerAssociationsRequest);

    /**
     * <p>
     * Gets information about one or more of your connections in a global network.
     * </p>
     * 
     * @param getConnectionsRequest
     * @return Result of the GetConnections operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetConnections" target="_top">AWS
     *      API Documentation</a>
     */
    GetConnectionsResult getConnections(GetConnectionsRequest getConnectionsRequest);

    /**
     * <p>
     * Returns information about the LIVE policy for a core network.
     * </p>
     * 
     * @param getCoreNetworkRequest
     * @return Result of the GetCoreNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    GetCoreNetworkResult getCoreNetwork(GetCoreNetworkRequest getCoreNetworkRequest);

    /**
     * <p>
     * Returns information about a core network change event.
     * </p>
     * 
     * @param getCoreNetworkChangeEventsRequest
     * @return Result of the GetCoreNetworkChangeEvents operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetworkChangeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeEvents"
     *      target="_top">AWS API Documentation</a>
     */
    GetCoreNetworkChangeEventsResult getCoreNetworkChangeEvents(GetCoreNetworkChangeEventsRequest getCoreNetworkChangeEventsRequest);

    /**
     * <p>
     * Returns a change set between the LIVE core network policy and a submitted policy.
     * </p>
     * 
     * @param getCoreNetworkChangeSetRequest
     * @return Result of the GetCoreNetworkChangeSet operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetworkChangeSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkChangeSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetCoreNetworkChangeSetResult getCoreNetworkChangeSet(GetCoreNetworkChangeSetRequest getCoreNetworkChangeSetRequest);

    /**
     * <p>
     * Returns details about a core network policy. You can get details about your current live policy or any previous
     * policy version.
     * </p>
     * 
     * @param getCoreNetworkPolicyRequest
     * @return Result of the GetCoreNetworkPolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetCoreNetworkPolicyResult getCoreNetworkPolicy(GetCoreNetworkPolicyRequest getCoreNetworkPolicyRequest);

    /**
     * <p>
     * Gets the association information for customer gateways that are associated with devices and links in your global
     * network.
     * </p>
     * 
     * @param getCustomerGatewayAssociationsRequest
     * @return Result of the GetCustomerGatewayAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetCustomerGatewayAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetCustomerGatewayAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetCustomerGatewayAssociationsResult getCustomerGatewayAssociations(GetCustomerGatewayAssociationsRequest getCustomerGatewayAssociationsRequest);

    /**
     * <p>
     * Gets information about one or more of your devices in a global network.
     * </p>
     * 
     * @param getDevicesRequest
     * @return Result of the GetDevices operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetDevices" target="_top">AWS API
     *      Documentation</a>
     */
    GetDevicesResult getDevices(GetDevicesRequest getDevicesRequest);

    /**
     * <p>
     * Gets the link associations for a device or a link. Either the device ID or the link ID must be specified.
     * </p>
     * 
     * @param getLinkAssociationsRequest
     * @return Result of the GetLinkAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetLinkAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinkAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetLinkAssociationsResult getLinkAssociations(GetLinkAssociationsRequest getLinkAssociationsRequest);

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
     * @return Result of the GetLinks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetLinks" target="_top">AWS API
     *      Documentation</a>
     */
    GetLinksResult getLinks(GetLinksRequest getLinksRequest);

    /**
     * <p>
     * Gets the count of network resources, by resource type, for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceCountsRequest
     * @return Result of the GetNetworkResourceCounts operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkResourceCounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceCounts"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkResourceCountsResult getNetworkResourceCounts(GetNetworkResourceCountsRequest getNetworkResourceCountsRequest);

    /**
     * <p>
     * Gets the network resource relationships for the specified global network.
     * </p>
     * 
     * @param getNetworkResourceRelationshipsRequest
     * @return Result of the GetNetworkResourceRelationships operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkResourceRelationships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResourceRelationships"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkResourceRelationshipsResult getNetworkResourceRelationships(GetNetworkResourceRelationshipsRequest getNetworkResourceRelationshipsRequest);

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
     * @return Result of the GetNetworkResources operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkResourcesResult getNetworkResources(GetNetworkResourcesRequest getNetworkResourcesRequest);

    /**
     * <p>
     * Gets the network routes of the specified global network.
     * </p>
     * 
     * @param getNetworkRoutesRequest
     * @return Result of the GetNetworkRoutes operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkRoutesResult getNetworkRoutes(GetNetworkRoutesRequest getNetworkRoutesRequest);

    /**
     * <p>
     * Gets the network telemetry of the specified global network.
     * </p>
     * 
     * @param getNetworkTelemetryRequest
     * @return Result of the GetNetworkTelemetry operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetNetworkTelemetry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkTelemetry"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkTelemetryResult getNetworkTelemetry(GetNetworkTelemetryRequest getNetworkTelemetryRequest);

    /**
     * <p>
     * Returns information about a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Gets information about the specified route analysis.
     * </p>
     * 
     * @param getRouteAnalysisRequest
     * @return Result of the GetRouteAnalysis operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    GetRouteAnalysisResult getRouteAnalysis(GetRouteAnalysisRequest getRouteAnalysisRequest);

    /**
     * <p>
     * Returns information about a site-to-site VPN attachment.
     * </p>
     * 
     * @param getSiteToSiteVpnAttachmentRequest
     * @return Result of the GetSiteToSiteVpnAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetSiteToSiteVpnAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSiteToSiteVpnAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    GetSiteToSiteVpnAttachmentResult getSiteToSiteVpnAttachment(GetSiteToSiteVpnAttachmentRequest getSiteToSiteVpnAttachmentRequest);

    /**
     * <p>
     * Gets information about one or more of your sites in a global network.
     * </p>
     * 
     * @param getSitesRequest
     * @return Result of the GetSites operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetSites" target="_top">AWS API
     *      Documentation</a>
     */
    GetSitesResult getSites(GetSitesRequest getSitesRequest);

    /**
     * <p>
     * Gets information about one or more of your transit gateway Connect peer associations in a global network.
     * </p>
     * 
     * @param getTransitGatewayConnectPeerAssociationsRequest
     * @return Result of the GetTransitGatewayConnectPeerAssociations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayConnectPeerAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayConnectPeerAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayConnectPeerAssociationsResult getTransitGatewayConnectPeerAssociations(
            GetTransitGatewayConnectPeerAssociationsRequest getTransitGatewayConnectPeerAssociationsRequest);

    /**
     * <p>
     * Returns information about a transit gateway peer.
     * </p>
     * 
     * @param getTransitGatewayPeeringRequest
     * @return Result of the GetTransitGatewayPeering operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayPeering
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayPeering"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayPeeringResult getTransitGatewayPeering(GetTransitGatewayPeeringRequest getTransitGatewayPeeringRequest);

    /**
     * <p>
     * Gets information about the transit gateway registrations in a specified global network.
     * </p>
     * 
     * @param getTransitGatewayRegistrationsRequest
     * @return Result of the GetTransitGatewayRegistrations operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayRegistrations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRegistrations"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayRegistrationsResult getTransitGatewayRegistrations(GetTransitGatewayRegistrationsRequest getTransitGatewayRegistrationsRequest);

    /**
     * <p>
     * Returns information about a transit gateway route table attachment.
     * </p>
     * 
     * @param getTransitGatewayRouteTableAttachmentRequest
     * @return Result of the GetTransitGatewayRouteTableAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetTransitGatewayRouteTableAttachment
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayRouteTableAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    GetTransitGatewayRouteTableAttachmentResult getTransitGatewayRouteTableAttachment(
            GetTransitGatewayRouteTableAttachmentRequest getTransitGatewayRouteTableAttachmentRequest);

    /**
     * <p>
     * Returns information about a VPC attachment.
     * </p>
     * 
     * @param getVpcAttachmentRequest
     * @return Result of the GetVpcAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.GetVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    GetVpcAttachmentResult getVpcAttachment(GetVpcAttachmentRequest getVpcAttachmentRequest);

    /**
     * <p>
     * Returns a list of core network attachments.
     * </p>
     * 
     * @param listAttachmentsRequest
     * @return Result of the ListAttachments operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListAttachments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListAttachments" target="_top">AWS
     *      API Documentation</a>
     */
    ListAttachmentsResult listAttachments(ListAttachmentsRequest listAttachmentsRequest);

    /**
     * <p>
     * Returns a list of core network Connect peers.
     * </p>
     * 
     * @param listConnectPeersRequest
     * @return Result of the ListConnectPeers operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListConnectPeers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListConnectPeers"
     *      target="_top">AWS API Documentation</a>
     */
    ListConnectPeersResult listConnectPeers(ListConnectPeersRequest listConnectPeersRequest);

    /**
     * <p>
     * Returns a list of core network policy versions.
     * </p>
     * 
     * @param listCoreNetworkPolicyVersionsRequest
     * @return Result of the ListCoreNetworkPolicyVersions operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListCoreNetworkPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworkPolicyVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListCoreNetworkPolicyVersionsResult listCoreNetworkPolicyVersions(ListCoreNetworkPolicyVersionsRequest listCoreNetworkPolicyVersionsRequest);

    /**
     * <p>
     * Returns a list of owned and shared core networks.
     * </p>
     * 
     * @param listCoreNetworksRequest
     * @return Result of the ListCoreNetworks operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListCoreNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListCoreNetworks"
     *      target="_top">AWS API Documentation</a>
     */
    ListCoreNetworksResult listCoreNetworks(ListCoreNetworksRequest listCoreNetworksRequest);

    /**
     * <p>
     * Gets the status of the Service Linked Role (SLR) deployment for the accounts in a given Amazon Web Services
     * Organization.
     * </p>
     * 
     * @param listOrganizationServiceAccessStatusRequest
     * @return Result of the ListOrganizationServiceAccessStatus operation returned by the service.
     * @sample AWSNetworkManager.ListOrganizationServiceAccessStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListOrganizationServiceAccessStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationServiceAccessStatusResult listOrganizationServiceAccessStatus(
            ListOrganizationServiceAccessStatusRequest listOrganizationServiceAccessStatusRequest);

    /**
     * <p>
     * Lists the peerings for a core network.
     * </p>
     * 
     * @param listPeeringsRequest
     * @return Result of the ListPeerings operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListPeerings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListPeerings" target="_top">AWS
     *      API Documentation</a>
     */
    ListPeeringsResult listPeerings(ListPeeringsRequest listPeeringsRequest);

    /**
     * <p>
     * Lists the tags for a specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates a new, immutable version of a core network policy. A subsequent change set is created showing the
     * differences between the LIVE policy and the submitted policy.
     * </p>
     * 
     * @param putCoreNetworkPolicyRequest
     * @return Result of the PutCoreNetworkPolicy operation returned by the service.
     * @throws CoreNetworkPolicyException
     *         Describes a core network policy exception.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.PutCoreNetworkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutCoreNetworkPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutCoreNetworkPolicyResult putCoreNetworkPolicy(PutCoreNetworkPolicyRequest putCoreNetworkPolicyRequest);

    /**
     * <p>
     * Creates or updates a resource policy.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Registers a transit gateway in your global network. The transit gateway can be in any Amazon Web Services Region,
     * but it must be owned by the same Amazon Web Services account that owns the global network. You cannot register a
     * transit gateway in more than one global network.
     * </p>
     * 
     * @param registerTransitGatewayRequest
     * @return Result of the RegisterTransitGateway operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.RegisterTransitGateway
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RegisterTransitGateway"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterTransitGatewayResult registerTransitGateway(RegisterTransitGatewayRequest registerTransitGatewayRequest);

    /**
     * <p>
     * Rejects a core network attachment request.
     * </p>
     * 
     * @param rejectAttachmentRequest
     * @return Result of the RejectAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.RejectAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RejectAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    RejectAttachmentResult rejectAttachment(RejectAttachmentRequest rejectAttachmentRequest);

    /**
     * <p>
     * Restores a previous policy version as a new, immutable version of a core network policy. A subsequent change set
     * is created showing the differences between the LIVE policy and restored policy.
     * </p>
     * 
     * @param restoreCoreNetworkPolicyVersionRequest
     * @return Result of the RestoreCoreNetworkPolicyVersion operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @sample AWSNetworkManager.RestoreCoreNetworkPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RestoreCoreNetworkPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreCoreNetworkPolicyVersionResult restoreCoreNetworkPolicyVersion(RestoreCoreNetworkPolicyVersionRequest restoreCoreNetworkPolicyVersionRequest);

    /**
     * <p>
     * Enables the Network Manager service for an Amazon Web Services Organization. This can only be called by a
     * management account within the organization.
     * </p>
     * 
     * @param startOrganizationServiceAccessUpdateRequest
     * @return Result of the StartOrganizationServiceAccessUpdate operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.StartOrganizationServiceAccessUpdate
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartOrganizationServiceAccessUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    StartOrganizationServiceAccessUpdateResult startOrganizationServiceAccessUpdate(
            StartOrganizationServiceAccessUpdateRequest startOrganizationServiceAccessUpdateRequest);

    /**
     * <p>
     * Starts analyzing the routing path between the specified source and destination. For more information, see <a
     * href="https://docs.aws.amazon.com/vpc/latest/tgw/route-analyzer.html">Route Analyzer</a>.
     * </p>
     * 
     * @param startRouteAnalysisRequest
     * @return Result of the StartRouteAnalysis operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.StartRouteAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/StartRouteAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    StartRouteAnalysisResult startRouteAnalysis(StartRouteAnalysisRequest startRouteAnalysisRequest);

    /**
     * <p>
     * Tags a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the information for an existing connection. To remove information for any of the parameters, specify an
     * empty string.
     * </p>
     * 
     * @param updateConnectionRequest
     * @return Result of the UpdateConnection operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateConnection"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateConnectionResult updateConnection(UpdateConnectionRequest updateConnectionRequest);

    /**
     * <p>
     * Updates the description of a core network.
     * </p>
     * 
     * @param updateCoreNetworkRequest
     * @return Result of the UpdateCoreNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateCoreNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateCoreNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateCoreNetworkResult updateCoreNetwork(UpdateCoreNetworkRequest updateCoreNetworkRequest);

    /**
     * <p>
     * Updates the details for an existing device. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDeviceResult updateDevice(UpdateDeviceRequest updateDeviceRequest);

    /**
     * <p>
     * Updates an existing global network. To remove information for any of the parameters, specify an empty string.
     * </p>
     * 
     * @param updateGlobalNetworkRequest
     * @return Result of the UpdateGlobalNetwork operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateGlobalNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateGlobalNetwork"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGlobalNetworkResult updateGlobalNetwork(UpdateGlobalNetworkRequest updateGlobalNetworkRequest);

    /**
     * <p>
     * Updates the details for an existing link. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateLinkRequest
     * @return Result of the UpdateLink operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws ServiceQuotaExceededException
     *         A service limit was exceeded.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLinkResult updateLink(UpdateLinkRequest updateLinkRequest);

    /**
     * <p>
     * Updates the resource metadata for the specified global network.
     * </p>
     * 
     * @param updateNetworkResourceMetadataRequest
     * @return Result of the UpdateNetworkResourceMetadata operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateNetworkResourceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateNetworkResourceMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNetworkResourceMetadataResult updateNetworkResourceMetadata(UpdateNetworkResourceMetadataRequest updateNetworkResourceMetadataRequest);

    /**
     * <p>
     * Updates the information for an existing site. To remove information for any of the parameters, specify an empty
     * string.
     * </p>
     * 
     * @param updateSiteRequest
     * @return Result of the UpdateSite operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSiteResult updateSite(UpdateSiteRequest updateSiteRequest);

    /**
     * <p>
     * Updates a VPC attachment.
     * </p>
     * 
     * @param updateVpcAttachmentRequest
     * @return Result of the UpdateVpcAttachment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The specified resource could not be found.
     * @throws ConflictException
     *         There was a conflict processing the request. Updating or deleting the resource can cause an inconsistent
     *         state.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The request has failed due to an internal error.
     * @sample AWSNetworkManager.UpdateVpcAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateVpcAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVpcAttachmentResult updateVpcAttachment(UpdateVpcAttachmentRequest updateVpcAttachmentRequest);

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
