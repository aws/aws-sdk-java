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
 * Transit Gateway Network Manager (Network Manager) enables you to create a global network, in which you can monitor
 * your AWS and on-premises networks that are built around transit gateways.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSNetworkManagerAsync extends AWSNetworkManager {

    /**
     * <p>
     * Associates a customer gateway with a device and optionally, with a link. If you specify a link, it must be
     * associated with the specified device.
     * </p>
     * <p>
     * You can only associate customer gateways that are connected to a VPN attachment on a transit gateway. The transit
     * gateway must be registered in your global network. When you register a transit gateway, customer gateways that
     * are connected to the transit gateway are automatically included in the global network. To list customer gateways
     * that are connected to a transit gateway, use the <a
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
     * You can only associate customer gateways that are connected to a VPN attachment on a transit gateway. The transit
     * gateway must be registered in your global network. When you register a transit gateway, customer gateways that
     * are connected to the transit gateway are automatically included in the global network. To list customer gateways
     * that are connected to a transit gateway, use the <a
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
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites)
     * and deregister all transit gateways.
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
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites)
     * and deregister all transit gateways.
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
     * Registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be
     * owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than
     * one global network.
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
     * Registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be
     * owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than
     * one global network.
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

}
