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

import com.amazonaws.services.outposts.model.*;

/**
 * Interface for accessing Outposts asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.outposts.AbstractAWSOutpostsAsync} instead.
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
public interface AWSOutpostsAsync extends AWSOutposts {

    /**
     * <p>
     * Cancels the specified order for an Outpost.
     * </p>
     * 
     * @param cancelOrderRequest
     * @return A Java Future containing the result of the CancelOrder operation returned by the service.
     * @sample AWSOutpostsAsync.CancelOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CancelOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelOrderResult> cancelOrderAsync(CancelOrderRequest cancelOrderRequest);

    /**
     * <p>
     * Cancels the specified order for an Outpost.
     * </p>
     * 
     * @param cancelOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelOrder operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.CancelOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CancelOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CancelOrderResult> cancelOrderAsync(CancelOrderRequest cancelOrderRequest,
            com.amazonaws.handlers.AsyncHandler<CancelOrderRequest, CancelOrderResult> asyncHandler);

    /**
     * <p>
     * Creates an order for an Outpost.
     * </p>
     * 
     * @param createOrderRequest
     * @return A Java Future containing the result of the CreateOrder operation returned by the service.
     * @sample AWSOutpostsAsync.CreateOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOrderResult> createOrderAsync(CreateOrderRequest createOrderRequest);

    /**
     * <p>
     * Creates an order for an Outpost.
     * </p>
     * 
     * @param createOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOrder operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.CreateOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOrderResult> createOrderAsync(CreateOrderRequest createOrderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrderRequest, CreateOrderResult> asyncHandler);

    /**
     * <p>
     * Creates an Outpost.
     * </p>
     * <p>
     * You can specify either an Availability one or an AZ ID.
     * </p>
     * 
     * @param createOutpostRequest
     * @return A Java Future containing the result of the CreateOutpost operation returned by the service.
     * @sample AWSOutpostsAsync.CreateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest createOutpostRequest);

    /**
     * <p>
     * Creates an Outpost.
     * </p>
     * <p>
     * You can specify either an Availability one or an AZ ID.
     * </p>
     * 
     * @param createOutpostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOutpost operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.CreateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest createOutpostRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOutpostRequest, CreateOutpostResult> asyncHandler);

    /**
     * <p>
     * Creates a site for an Outpost.
     * </p>
     * 
     * @param createSiteRequest
     * @return A Java Future containing the result of the CreateSite operation returned by the service.
     * @sample AWSOutpostsAsync.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest createSiteRequest);

    /**
     * <p>
     * Creates a site for an Outpost.
     * </p>
     * 
     * @param createSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSite operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.CreateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CreateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest createSiteRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSiteRequest, CreateSiteResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Outpost.
     * </p>
     * 
     * @param deleteOutpostRequest
     * @return A Java Future containing the result of the DeleteOutpost operation returned by the service.
     * @sample AWSOutpostsAsync.DeleteOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest deleteOutpostRequest);

    /**
     * <p>
     * Deletes the specified Outpost.
     * </p>
     * 
     * @param deleteOutpostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteOutpost operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.DeleteOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest deleteOutpostRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOutpostRequest, DeleteOutpostResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified site.
     * </p>
     * 
     * @param deleteSiteRequest
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSOutpostsAsync.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest);

    /**
     * <p>
     * Deletes the specified site.
     * </p>
     * 
     * @param deleteSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSite operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.DeleteSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/DeleteSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest deleteSiteRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified catalog item.
     * </p>
     * 
     * @param getCatalogItemRequest
     * @return A Java Future containing the result of the GetCatalogItem operation returned by the service.
     * @sample AWSOutpostsAsync.GetCatalogItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetCatalogItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCatalogItemResult> getCatalogItemAsync(GetCatalogItemRequest getCatalogItemRequest);

    /**
     * <p>
     * Gets information about the specified catalog item.
     * </p>
     * 
     * @param getCatalogItemRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCatalogItem operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetCatalogItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetCatalogItem" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCatalogItemResult> getCatalogItemAsync(GetCatalogItemRequest getCatalogItemRequest,
            com.amazonaws.handlers.AsyncHandler<GetCatalogItemRequest, GetCatalogItemResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetConnection operation returned by the service.
     * @sample AWSOutpostsAsync.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest getConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConnection operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest getConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @return A Java Future containing the result of the GetOrder operation returned by the service.
     * @sample AWSOutpostsAsync.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOrderResult> getOrderAsync(GetOrderRequest getOrderRequest);

    /**
     * <p>
     * Gets information about the specified order.
     * </p>
     * 
     * @param getOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOrder operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOrderResult> getOrderAsync(GetOrderRequest getOrderRequest,
            com.amazonaws.handlers.AsyncHandler<GetOrderRequest, GetOrderResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified Outpost.
     * </p>
     * 
     * @param getOutpostRequest
     * @return A Java Future containing the result of the GetOutpost operation returned by the service.
     * @sample AWSOutpostsAsync.GetOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest getOutpostRequest);

    /**
     * <p>
     * Gets information about the specified Outpost.
     * </p>
     * 
     * @param getOutpostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOutpost operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest getOutpostRequest,
            com.amazonaws.handlers.AsyncHandler<GetOutpostRequest, GetOutpostResult> asyncHandler);

    /**
     * <p>
     * Gets the instance types for the specified Outpost.
     * </p>
     * 
     * @param getOutpostInstanceTypesRequest
     * @return A Java Future containing the result of the GetOutpostInstanceTypes operation returned by the service.
     * @sample AWSOutpostsAsync.GetOutpostInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostInstanceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest getOutpostInstanceTypesRequest);

    /**
     * <p>
     * Gets the instance types for the specified Outpost.
     * </p>
     * 
     * @param getOutpostInstanceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOutpostInstanceTypes operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetOutpostInstanceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetOutpostInstanceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest getOutpostInstanceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetOutpostInstanceTypesRequest, GetOutpostInstanceTypesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified Outpost site.
     * </p>
     * 
     * @param getSiteRequest
     * @return A Java Future containing the result of the GetSite operation returned by the service.
     * @sample AWSOutpostsAsync.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSiteResult> getSiteAsync(GetSiteRequest getSiteRequest);

    /**
     * <p>
     * Gets information about the specified Outpost site.
     * </p>
     * 
     * @param getSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSite operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSiteResult> getSiteAsync(GetSiteRequest getSiteRequest,
            com.amazonaws.handlers.AsyncHandler<GetSiteRequest, GetSiteResult> asyncHandler);

    /**
     * <p>
     * Gets the site address of the specified site.
     * </p>
     * 
     * @param getSiteAddressRequest
     * @return A Java Future containing the result of the GetSiteAddress operation returned by the service.
     * @sample AWSOutpostsAsync.GetSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSiteAddressResult> getSiteAddressAsync(GetSiteAddressRequest getSiteAddressRequest);

    /**
     * <p>
     * Gets the site address of the specified site.
     * </p>
     * 
     * @param getSiteAddressRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSiteAddress operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.GetSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSiteAddressResult> getSiteAddressAsync(GetSiteAddressRequest getSiteAddressRequest,
            com.amazonaws.handlers.AsyncHandler<GetSiteAddressRequest, GetSiteAddressResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListAssets operation returned by the service.
     * @sample AWSOutpostsAsync.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest listAssetsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAssets operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListAssets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListAssets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest listAssetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAssetsRequest, ListAssetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListCatalogItems operation returned by the service.
     * @sample AWSOutpostsAsync.ListCatalogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCatalogItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCatalogItemsResult> listCatalogItemsAsync(ListCatalogItemsRequest listCatalogItemsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCatalogItems operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListCatalogItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCatalogItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCatalogItemsResult> listCatalogItemsAsync(ListCatalogItemsRequest listCatalogItemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCatalogItemsRequest, ListCatalogItemsResult> asyncHandler);

    /**
     * <p>
     * Lists the Outpost orders for your Amazon Web Services account.
     * </p>
     * 
     * @param listOrdersRequest
     * @return A Java Future containing the result of the ListOrders operation returned by the service.
     * @sample AWSOutpostsAsync.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOrders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrdersResult> listOrdersAsync(ListOrdersRequest listOrdersRequest);

    /**
     * <p>
     * Lists the Outpost orders for your Amazon Web Services account.
     * </p>
     * 
     * @param listOrdersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrders operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOrders" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOrdersResult> listOrdersAsync(ListOrdersRequest listOrdersRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrdersRequest, ListOrdersResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListOutposts operation returned by the service.
     * @sample AWSOutpostsAsync.ListOutposts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest listOutpostsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOutposts operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListOutposts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListOutposts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest listOutpostsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOutpostsRequest, ListOutpostsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListSites operation returned by the service.
     * @sample AWSOutpostsAsync.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest listSitesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSites operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListSites
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest listSitesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSitesRequest, ListSitesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOutpostsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartConnection operation returned by the service.
     * @sample AWSOutpostsAsync.StartConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/StartConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartConnectionResult> startConnectionAsync(StartConnectionRequest startConnectionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConnection operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.StartConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/StartConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartConnectionResult> startConnectionAsync(StartConnectionRequest startConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<StartConnectionRequest, StartConnectionResult> asyncHandler);

    /**
     * <p>
     * Adds tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOutpostsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOutpostsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an Outpost.
     * </p>
     * 
     * @param updateOutpostRequest
     * @return A Java Future containing the result of the UpdateOutpost operation returned by the service.
     * @sample AWSOutpostsAsync.UpdateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateOutpostResult> updateOutpostAsync(UpdateOutpostRequest updateOutpostRequest);

    /**
     * <p>
     * Updates an Outpost.
     * </p>
     * 
     * @param updateOutpostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOutpost operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.UpdateOutpost
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateOutpost" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateOutpostResult> updateOutpostAsync(UpdateOutpostRequest updateOutpostRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOutpostRequest, UpdateOutpostResult> asyncHandler);

    /**
     * <p>
     * Updates the specified site.
     * </p>
     * 
     * @param updateSiteRequest
     * @return A Java Future containing the result of the UpdateSite operation returned by the service.
     * @sample AWSOutpostsAsync.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest updateSiteRequest);

    /**
     * <p>
     * Updates the specified site.
     * </p>
     * 
     * @param updateSiteRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSite operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.UpdateSite
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSite" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest updateSiteRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSiteRequest, UpdateSiteResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSiteAddress operation returned by the service.
     * @sample AWSOutpostsAsync.UpdateSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteAddressResult> updateSiteAddressAsync(UpdateSiteAddressRequest updateSiteAddressRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSiteAddress operation returned by the service.
     * @sample AWSOutpostsAsyncHandler.UpdateSiteAddress
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteAddress" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteAddressResult> updateSiteAddressAsync(UpdateSiteAddressRequest updateSiteAddressRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSiteAddressRequest, UpdateSiteAddressResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSiteRackPhysicalProperties operation returned by the
     *         service.
     * @sample AWSOutpostsAsync.UpdateSiteRackPhysicalProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteRackPhysicalProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteRackPhysicalPropertiesResult> updateSiteRackPhysicalPropertiesAsync(
            UpdateSiteRackPhysicalPropertiesRequest updateSiteRackPhysicalPropertiesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSiteRackPhysicalProperties operation returned by the
     *         service.
     * @sample AWSOutpostsAsyncHandler.UpdateSiteRackPhysicalProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/UpdateSiteRackPhysicalProperties"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSiteRackPhysicalPropertiesResult> updateSiteRackPhysicalPropertiesAsync(
            UpdateSiteRackPhysicalPropertiesRequest updateSiteRackPhysicalPropertiesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSiteRackPhysicalPropertiesRequest, UpdateSiteRackPhysicalPropertiesResult> asyncHandler);

}
