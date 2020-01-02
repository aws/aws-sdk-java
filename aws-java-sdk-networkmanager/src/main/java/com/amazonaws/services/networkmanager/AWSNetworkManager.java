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
 * Transit Gateway Network Manager (Network Manager) enables you to create a global network, in which you can monitor
 * your AWS and on-premises networks that are built around transit gateways.
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
     * Deletes an existing global network. You must first delete all global network objects (devices, links, and sites)
     * and deregister all transit gateways.
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
     * Registers a transit gateway in your global network. The transit gateway can be in any AWS Region, but it must be
     * owned by the same AWS account that owns the global network. You cannot register a transit gateway in more than
     * one global network.
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
