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
package com.amazonaws.services.private5g;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.private5g.model.*;

/**
 * Interface for accessing AWS Private 5G.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.private5g.AbstractAWSPrivate5G} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Private 5G is a managed service that makes it easy to deploy, operate, and scale your own private
 * mobile network at your on-premises location. Private 5G provides the pre-configured hardware and software for mobile
 * networks, helps automate setup, and scales capacity on demand to support additional devices as needed.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPrivate5G {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "private-networks";

    /**
     * <p>
     * Acknowledges that the specified network order was received.
     * </p>
     * 
     * @param acknowledgeOrderReceiptRequest
     * @return Result of the AcknowledgeOrderReceipt operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.AcknowledgeOrderReceipt
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/AcknowledgeOrderReceipt"
     *      target="_top">AWS API Documentation</a>
     */
    AcknowledgeOrderReceiptResult acknowledgeOrderReceipt(AcknowledgeOrderReceiptRequest acknowledgeOrderReceiptRequest);

    /**
     * <p>
     * Activates the specified device identifier.
     * </p>
     * 
     * @param activateDeviceIdentifierRequest
     * @return Result of the ActivateDeviceIdentifier operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ActivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    ActivateDeviceIdentifierResult activateDeviceIdentifier(ActivateDeviceIdentifierRequest activateDeviceIdentifierRequest);

    /**
     * <p>
     * Activates the specified network site.
     * </p>
     * 
     * @param activateNetworkSiteRequest
     * @return Result of the ActivateNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ActivateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ActivateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    ActivateNetworkSiteResult activateNetworkSite(ActivateNetworkSiteRequest activateNetworkSiteRequest);

    /**
     * <p>
     * Configures the specified network resource.
     * </p>
     * <p>
     * Use this action to specify the geographic position of the hardware. You must provide Certified Professional
     * Installer (CPI) credentials in the request so that we can obtain spectrum grants. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html">Radio units</a> in the
     * <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param configureAccessPointRequest
     * @return Result of the ConfigureAccessPoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ConfigureAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ConfigureAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    ConfigureAccessPointResult configureAccessPoint(ConfigureAccessPointRequest configureAccessPointRequest);

    /**
     * <p>
     * Creates a network.
     * </p>
     * 
     * @param createNetworkRequest
     * @return Result of the CreateNetwork operation returned by the service.
     * @throws LimitExceededException
     *         The limit was exceeded.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.CreateNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    CreateNetworkResult createNetwork(CreateNetworkRequest createNetworkRequest);

    /**
     * <p>
     * Creates a network site.
     * </p>
     * 
     * @param createNetworkSiteRequest
     * @return Result of the CreateNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.CreateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/CreateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNetworkSiteResult createNetworkSite(CreateNetworkSiteRequest createNetworkSiteRequest);

    /**
     * <p>
     * Deactivates the specified device identifier.
     * </p>
     * 
     * @param deactivateDeviceIdentifierRequest
     * @return Result of the DeactivateDeviceIdentifier operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.DeactivateDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeactivateDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    DeactivateDeviceIdentifierResult deactivateDeviceIdentifier(DeactivateDeviceIdentifierRequest deactivateDeviceIdentifierRequest);

    /**
     * <p>
     * Deletes the specified network. You must delete network sites before you delete the network. For more information,
     * see <a href="https://docs.aws.amazon.com/private-networks/latest/APIReference/API_DeleteNetworkSite.html">
     * DeleteNetworkSite</a> in the <i>API Reference for Amazon Web Services Private 5G</i>.
     * </p>
     * 
     * @param deleteNetworkRequest
     * @return Result of the DeleteNetwork operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.DeleteNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetwork" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteNetworkResult deleteNetwork(DeleteNetworkRequest deleteNetworkRequest);

    /**
     * <p>
     * Deletes the specified network site. Return the hardware after you delete the network site. You are responsible
     * for minimum charges. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/hardware-maintenance.html">Hardware
     * returns</a> in the <i>Amazon Web Services Private 5G User Guide</i>.
     * </p>
     * 
     * @param deleteNetworkSiteRequest
     * @return Result of the DeleteNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.DeleteNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/DeleteNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNetworkSiteResult deleteNetworkSite(DeleteNetworkSiteRequest deleteNetworkSiteRequest);

    /**
     * <p>
     * Gets the specified device identifier.
     * </p>
     * 
     * @param getDeviceIdentifierRequest
     * @return Result of the GetDeviceIdentifier operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetDeviceIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetDeviceIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeviceIdentifierResult getDeviceIdentifier(GetDeviceIdentifierRequest getDeviceIdentifierRequest);

    /**
     * <p>
     * Gets the specified network.
     * </p>
     * 
     * @param getNetworkRequest
     * @return Result of the GetNetwork operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetNetwork
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetwork" target="_top">AWS API
     *      Documentation</a>
     */
    GetNetworkResult getNetwork(GetNetworkRequest getNetworkRequest);

    /**
     * <p>
     * Gets the specified network resource.
     * </p>
     * 
     * @param getNetworkResourceRequest
     * @return Result of the GetNetworkResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetNetworkResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkResource"
     *      target="_top">AWS API Documentation</a>
     */
    GetNetworkResourceResult getNetworkResource(GetNetworkResourceRequest getNetworkResourceRequest);

    /**
     * <p>
     * Gets the specified network site.
     * </p>
     * 
     * @param getNetworkSiteRequest
     * @return Result of the GetNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetNetworkSite" target="_top">AWS
     *      API Documentation</a>
     */
    GetNetworkSiteResult getNetworkSite(GetNetworkSiteRequest getNetworkSiteRequest);

    /**
     * <p>
     * Gets the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @return Result of the GetOrder operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetOrder" target="_top">AWS API
     *      Documentation</a>
     */
    GetOrderResult getOrder(GetOrderRequest getOrderRequest);

    /**
     * <p>
     * Lists device identifiers. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order, the status of device identifiers, or the ARN of the traffic
     * group.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;If you specify multiple filters, filters are joined with an OR, and the request </code>
     * </pre>
     * <p>
     * returns results that match all of the specified filters.
     * </p>
     * </p>
     * 
     * @param listDeviceIdentifiersRequest
     * @return Result of the ListDeviceIdentifiers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListDeviceIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListDeviceIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    ListDeviceIdentifiersResult listDeviceIdentifiers(ListDeviceIdentifiersRequest listDeviceIdentifiersRequest);

    /**
     * <p>
     * Lists network resources. Add filters to your request to return a more specific list of results. Use filters to
     * match the Amazon Resource Name (ARN) of an order or the status of network resources.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listNetworkResourcesRequest
     * @return Result of the ListNetworkResources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListNetworkResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkResources"
     *      target="_top">AWS API Documentation</a>
     */
    ListNetworkResourcesResult listNetworkResources(ListNetworkResourcesRequest listNetworkResourcesRequest);

    /**
     * <p>
     * Lists network sites. Add filters to your request to return a more specific list of results. Use filters to match
     * the status of the network site.
     * </p>
     * 
     * @param listNetworkSitesRequest
     * @return Result of the ListNetworkSites operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListNetworkSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkSites"
     *      target="_top">AWS API Documentation</a>
     */
    ListNetworkSitesResult listNetworkSites(ListNetworkSitesRequest listNetworkSitesRequest);

    /**
     * <p>
     * Lists networks. Add filters to your request to return a more specific list of results. Use filters to match the
     * status of the network.
     * </p>
     * 
     * @param listNetworksRequest
     * @return Result of the ListNetworks operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListNetworks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworks" target="_top">AWS
     *      API Documentation</a>
     */
    ListNetworksResult listNetworks(ListNetworksRequest listNetworksRequest);

    /**
     * <p>
     * Lists orders. Add filters to your request to return a more specific list of results. Use filters to match the
     * Amazon Resource Name (ARN) of the network site or the status of the order.
     * </p>
     * <p>
     * If you specify multiple filters, filters are joined with an OR, and the request returns results that match all of
     * the specified filters.
     * </p>
     * 
     * @param listOrdersRequest
     * @return Result of the ListOrders operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListOrders" target="_top">AWS API
     *      Documentation</a>
     */
    ListOrdersResult listOrders(ListOrdersRequest listOrdersRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSPrivate5G.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Checks the health of the service.
     * </p>
     * 
     * @param pingRequest
     * @return Result of the Ping operation returned by the service.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.Ping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Ping" target="_top">AWS API
     *      Documentation</a>
     */
    PingResult ping(PingRequest pingRequest);

    /**
     * <p>
     * Adds tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSPrivate5G.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSPrivate5G.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified network site.
     * </p>
     * 
     * @param updateNetworkSiteRequest
     * @return Result of the UpdateNetworkSite operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.UpdateNetworkSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSite"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNetworkSiteResult updateNetworkSite(UpdateNetworkSiteRequest updateNetworkSiteRequest);

    /**
     * <p>
     * Updates the specified network site plan.
     * </p>
     * 
     * @param updateNetworkSitePlanRequest
     * @return Result of the UpdateNetworkSitePlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The request failed validation.
     * @throws InternalServerException
     *         Information about an internal error.
     * @sample AWSPrivate5G.UpdateNetworkSitePlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/UpdateNetworkSitePlan"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNetworkSitePlanResult updateNetworkSitePlan(UpdateNetworkSitePlanRequest updateNetworkSitePlanRequest);

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
