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
package com.amazonaws.services.outposts;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.outposts.model.*;

/**
 * Interface for accessing Outposts.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.outposts.AbstractAWSOutposts} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Outposts is a fully managed service that extends Amazon Web Services infrastructure, APIs, and
 * tools to customer premises. By providing local access to Amazon Web Services managed infrastructure, Amazon Web
 * Services Outposts enables customers to build and run applications on premises using the same programming interfaces
 * as in Amazon Web Services Regions, while using local compute and storage resources for lower latency and local data
 * processing needs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOutposts {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "outposts";

    /**
     * <p>
     * Cancels the specified order for an Outpost.
     * </p>
     * 
     * @param cancelOrderRequest
     * @return Result of the CancelOrder operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.CancelOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CancelOrder" target="_top">AWS API
     *      Documentation</a>
     */
    CancelOrderResult cancelOrder(CancelOrderRequest cancelOrderRequest);

    /**
     * <p>
     * Creates an order for an Outpost.
     * </p>
     * 
     * @param createOrderRequest
     * @return Result of the CreateOrder operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ServiceQuotaExceededException
     *         You have exceeded a service quota.
     * @sample AWSOutposts.CreateOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOrder" target="_top">AWS API
     *      Documentation</a>
     */
    CreateOrderResult createOrder(CreateOrderRequest createOrderRequest);

    /**
     * <p>
     * Creates an Outpost.
     * </p>
     * <p>
     * You can specify either an Availability one or an AZ ID.
     * </p>
     * 
     * @param createOutpostRequest
     * @return Result of the CreateOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ServiceQuotaExceededException
     *         You have exceeded a service quota.
     * @sample AWSOutposts.CreateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    CreateOutpostResult createOutpost(CreateOutpostRequest createOutpostRequest);

    /**
     * <p>
     * Creates a site for an Outpost.
     * </p>
     * 
     * @param createSiteRequest
     * @return Result of the CreateSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ServiceQuotaExceededException
     *         You have exceeded a service quota.
     * @sample AWSOutposts.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSiteResult createSite(CreateSiteRequest createSiteRequest);

    /**
     * <p>
     * Deletes the specified Outpost.
     * </p>
     * 
     * @param deleteOutpostRequest
     * @return Result of the DeleteOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.DeleteOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteOutpostResult deleteOutpost(DeleteOutpostRequest deleteOutpostRequest);

    /**
     * <p>
     * Deletes the specified site.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return Result of the DeleteSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSiteResult deleteSite(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Gets information about the specified catalog item.
     * </p>
     * 
     * @param getCatalogItemRequest
     * @return Result of the GetCatalogItem operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetCatalogItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetCatalogItem" target="_top">AWS API
     *      Documentation</a>
     */
    GetCatalogItemResult getCatalogItem(GetCatalogItemRequest getCatalogItemRequest);

    /**
     * <note>
     * <p>
     * Amazon Web Services uses this action to install Outpost servers.
     * </p>
     * </note>
     * <p>
     * Gets information about the specified connection.
     * </p>
     * <p>
     * Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to
     * secure it. For more information, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/security-iam-awsmanpol.html"> Amazon Web Services
     * managed policies for Amazon Web Services Outposts</a> and <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/logging-using-cloudtrail.html"> Logging Amazon Web
     * Services Outposts API calls with Amazon Web Services CloudTrail</a> in the <i>Amazon Web Services Outposts User
     * Guide</i>.
     * </p>
     * 
     * @param getConnectionRequest
     * @return Result of the GetConnection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    GetConnectionResult getConnection(GetConnectionRequest getConnectionRequest);

    /**
     * <p>
     * Gets information about the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @return Result of the GetOrder operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOrder" target="_top">AWS API
     *      Documentation</a>
     */
    GetOrderResult getOrder(GetOrderRequest getOrderRequest);

    /**
     * <p>
     * Gets information about the specified Outpost.
     * </p>
     * 
     * @param getOutpostRequest
     * @return Result of the GetOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    GetOutpostResult getOutpost(GetOutpostRequest getOutpostRequest);

    /**
     * <p>
     * Gets the instance types for the specified Outpost.
     * </p>
     * 
     * @param getOutpostInstanceTypesRequest
     * @return Result of the GetOutpostInstanceTypes operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetOutpostInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostInstanceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    GetOutpostInstanceTypesResult getOutpostInstanceTypes(GetOutpostInstanceTypesRequest getOutpostInstanceTypesRequest);

    /**
     * <p>
     * Gets information about the specified Outpost site.
     * </p>
     * 
     * @param getSiteRequest
     * @return Result of the GetSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    GetSiteResult getSite(GetSiteRequest getSiteRequest);

    /**
     * <p>
     * Gets the site address of the specified site.
     * </p>
     * 
     * @param getSiteAddressRequest
     * @return Result of the GetSiteAddress operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.GetSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    GetSiteAddressResult getSiteAddress(GetSiteAddressRequest getSiteAddressRequest);

    /**
     * <p>
     * Lists the hardware assets for the specified Outpost.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listAssetsRequest
     * @return Result of the ListAssets operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    ListAssetsResult listAssets(ListAssetsRequest listAssetsRequest);

    /**
     * <p>
     * Lists the items in the catalog.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listCatalogItemsRequest
     * @return Result of the ListCatalogItems operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListCatalogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCatalogItems" target="_top">AWS API
     *      Documentation</a>
     */
    ListCatalogItemsResult listCatalogItems(ListCatalogItemsRequest listCatalogItemsRequest);

    /**
     * <p>
     * Lists the Outpost orders for your Amazon Web Services account.
     * </p>
     * 
     * @param listOrdersRequest
     * @return Result of the ListOrders operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOrders" target="_top">AWS API
     *      Documentation</a>
     */
    ListOrdersResult listOrders(ListOrdersRequest listOrdersRequest);

    /**
     * <p>
     * Lists the Outposts for your Amazon Web Services account.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listOutpostsRequest
     * @return Result of the ListOutposts operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListOutposts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
     *      Documentation</a>
     */
    ListOutpostsResult listOutposts(ListOutpostsRequest listOutpostsRequest);

    /**
     * <p>
     * Lists the Outpost sites for your Amazon Web Services account. Use filters to return specific results.
     * </p>
     * <p>
     * Use filters to return specific results. If you specify multiple filters, the results include only the resources
     * that match all of the specified filters. For a filter where you can specify multiple values, the results include
     * items that match any of the values that you specify for the filter.
     * </p>
     * 
     * @param listSitesRequest
     * @return Result of the ListSites operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    ListSitesResult listSites(ListSitesRequest listSitesRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @sample AWSOutposts.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <note>
     * <p>
     * Amazon Web Services uses this action to install Outpost servers.
     * </p>
     * </note>
     * <p>
     * Starts the connection required for Outpost server installation.
     * </p>
     * <p>
     * Use CloudTrail to monitor this action or Amazon Web Services managed policy for Amazon Web Services Outposts to
     * secure it. For more information, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/security-iam-awsmanpol.html"> Amazon Web Services
     * managed policies for Amazon Web Services Outposts</a> and <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/logging-using-cloudtrail.html"> Logging Amazon Web
     * Services Outposts API calls with Amazon Web Services CloudTrail</a> in the <i>Amazon Web Services Outposts User
     * Guide</i>.
     * </p>
     * 
     * @param startConnectionRequest
     * @return Result of the StartConnection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.StartConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/StartConnection" target="_top">AWS API
     *      Documentation</a>
     */
    StartConnectionResult startConnection(StartConnectionRequest startConnectionRequest);

    /**
     * <p>
     * Adds tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @sample AWSOutposts.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @sample AWSOutposts.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an Outpost.
     * </p>
     * 
     * @param updateOutpostRequest
     * @return Result of the UpdateOutpost operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateOutpostResult updateOutpost(UpdateOutpostRequest updateOutpostRequest);

    /**
     * <p>
     * Updates the specified site.
     * </p>
     * 
     * @param updateSiteRequest
     * @return Result of the UpdateSite operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSiteResult updateSite(UpdateSiteRequest updateSiteRequest);

    /**
     * <p>
     * Updates the address of the specified site.
     * </p>
     * <p>
     * You can't update a site address if there is an order in progress. You must wait for the order to complete or
     * cancel the order.
     * </p>
     * <p>
     * You can update the operating address before you place an order at the site, or after all Outposts that belong to
     * the site have been deactivated.
     * </p>
     * 
     * @param updateSiteAddressRequest
     * @return Result of the UpdateSiteAddress operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSiteAddressResult updateSiteAddress(UpdateSiteAddressRequest updateSiteAddressRequest);

    /**
     * <p>
     * Update the physical and logistical details for a rack at a site. For more information about hardware requirements
     * for racks, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/outposts-requirements.html#checklist">Network
     * readiness checklist</a> in the Amazon Web Services Outposts User Guide.
     * </p>
     * <p>
     * To update a rack at a site with an order of <code>IN_PROGRESS</code>, you must wait for the order to complete or
     * cancel the order.
     * </p>
     * 
     * @param updateSiteRackPhysicalPropertiesRequest
     * @return Result of the UpdateSiteRackPhysicalProperties operation returned by the service.
     * @throws ValidationException
     *         A parameter is not valid.
     * @throws ConflictException
     *         Updating or deleting this resource can cause an inconsistent state.
     * @throws NotFoundException
     *         The specified request is not valid.
     * @throws AccessDeniedException
     *         You do not have permission to perform this operation.
     * @throws InternalServerException
     *         An internal error has occurred.
     * @sample AWSOutposts.UpdateSiteRackPhysicalProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteRackPhysicalProperties"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSiteRackPhysicalPropertiesResult updateSiteRackPhysicalProperties(UpdateSiteRackPhysicalPropertiesRequest updateSiteRackPhysicalPropertiesRequest);

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
