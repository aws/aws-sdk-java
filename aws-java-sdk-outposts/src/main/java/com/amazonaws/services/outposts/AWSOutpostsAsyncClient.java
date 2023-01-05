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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Outposts asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Outposts is a fully managed service that extends Amazon Web Services infrastructure, APIs, and
 * tools to customer premises. By providing local access to Amazon Web Services managed infrastructure, Amazon Web
 * Services Outposts enables customers to build and run applications on premises using the same programming interfaces
 * as in Amazon Web Services Regions, while using local compute and storage resources for lower latency and local data
 * processing needs.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSOutpostsAsyncClient extends AWSOutpostsClient implements AWSOutpostsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSOutpostsAsyncClientBuilder asyncBuilder() {
        return AWSOutpostsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Outposts using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSOutpostsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Outposts using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSOutpostsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CancelOrderResult> cancelOrderAsync(CancelOrderRequest request) {

        return cancelOrderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelOrderResult> cancelOrderAsync(final CancelOrderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelOrderRequest, CancelOrderResult> asyncHandler) {
        final CancelOrderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CancelOrderResult>() {
            @Override
            public CancelOrderResult call() throws Exception {
                CancelOrderResult result = null;

                try {
                    result = executeCancelOrder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateOrderResult> createOrderAsync(CreateOrderRequest request) {

        return createOrderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOrderResult> createOrderAsync(final CreateOrderRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOrderRequest, CreateOrderResult> asyncHandler) {
        final CreateOrderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOrderResult>() {
            @Override
            public CreateOrderResult call() throws Exception {
                CreateOrderResult result = null;

                try {
                    result = executeCreateOrder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(CreateOutpostRequest request) {

        return createOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOutpostResult> createOutpostAsync(final CreateOutpostRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateOutpostRequest, CreateOutpostResult> asyncHandler) {
        final CreateOutpostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateOutpostResult>() {
            @Override
            public CreateOutpostResult call() throws Exception {
                CreateOutpostResult result = null;

                try {
                    result = executeCreateOutpost(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateSiteResult> createSiteAsync(CreateSiteRequest request) {

        return createSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSiteResult> createSiteAsync(final CreateSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSiteRequest, CreateSiteResult> asyncHandler) {
        final CreateSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSiteResult>() {
            @Override
            public CreateSiteResult call() throws Exception {
                CreateSiteResult result = null;

                try {
                    result = executeCreateSite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(DeleteOutpostRequest request) {

        return deleteOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOutpostResult> deleteOutpostAsync(final DeleteOutpostRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteOutpostRequest, DeleteOutpostResult> asyncHandler) {
        final DeleteOutpostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteOutpostResult>() {
            @Override
            public DeleteOutpostResult call() throws Exception {
                DeleteOutpostResult result = null;

                try {
                    result = executeDeleteOutpost(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(DeleteSiteRequest request) {

        return deleteSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSiteResult> deleteSiteAsync(final DeleteSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSiteRequest, DeleteSiteResult> asyncHandler) {
        final DeleteSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSiteResult>() {
            @Override
            public DeleteSiteResult call() throws Exception {
                DeleteSiteResult result = null;

                try {
                    result = executeDeleteSite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetCatalogItemResult> getCatalogItemAsync(GetCatalogItemRequest request) {

        return getCatalogItemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCatalogItemResult> getCatalogItemAsync(final GetCatalogItemRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCatalogItemRequest, GetCatalogItemResult> asyncHandler) {
        final GetCatalogItemRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCatalogItemResult>() {
            @Override
            public GetCatalogItemResult call() throws Exception {
                GetCatalogItemResult result = null;

                try {
                    result = executeGetCatalogItem(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest request) {

        return getConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(final GetConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler) {
        final GetConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConnectionResult>() {
            @Override
            public GetConnectionResult call() throws Exception {
                GetConnectionResult result = null;

                try {
                    result = executeGetConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOrderResult> getOrderAsync(GetOrderRequest request) {

        return getOrderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOrderResult> getOrderAsync(final GetOrderRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOrderRequest, GetOrderResult> asyncHandler) {
        final GetOrderRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOrderResult>() {
            @Override
            public GetOrderResult call() throws Exception {
                GetOrderResult result = null;

                try {
                    result = executeGetOrder(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(GetOutpostRequest request) {

        return getOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutpostResult> getOutpostAsync(final GetOutpostRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOutpostRequest, GetOutpostResult> asyncHandler) {
        final GetOutpostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOutpostResult>() {
            @Override
            public GetOutpostResult call() throws Exception {
                GetOutpostResult result = null;

                try {
                    result = executeGetOutpost(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(GetOutpostInstanceTypesRequest request) {

        return getOutpostInstanceTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOutpostInstanceTypesResult> getOutpostInstanceTypesAsync(final GetOutpostInstanceTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetOutpostInstanceTypesRequest, GetOutpostInstanceTypesResult> asyncHandler) {
        final GetOutpostInstanceTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetOutpostInstanceTypesResult>() {
            @Override
            public GetOutpostInstanceTypesResult call() throws Exception {
                GetOutpostInstanceTypesResult result = null;

                try {
                    result = executeGetOutpostInstanceTypes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSiteResult> getSiteAsync(GetSiteRequest request) {

        return getSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSiteResult> getSiteAsync(final GetSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSiteRequest, GetSiteResult> asyncHandler) {
        final GetSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSiteResult>() {
            @Override
            public GetSiteResult call() throws Exception {
                GetSiteResult result = null;

                try {
                    result = executeGetSite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSiteAddressResult> getSiteAddressAsync(GetSiteAddressRequest request) {

        return getSiteAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSiteAddressResult> getSiteAddressAsync(final GetSiteAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSiteAddressRequest, GetSiteAddressResult> asyncHandler) {
        final GetSiteAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSiteAddressResult>() {
            @Override
            public GetSiteAddressResult call() throws Exception {
                GetSiteAddressResult result = null;

                try {
                    result = executeGetSiteAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(ListAssetsRequest request) {

        return listAssetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssetsResult> listAssetsAsync(final ListAssetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssetsRequest, ListAssetsResult> asyncHandler) {
        final ListAssetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssetsResult>() {
            @Override
            public ListAssetsResult call() throws Exception {
                ListAssetsResult result = null;

                try {
                    result = executeListAssets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCatalogItemsResult> listCatalogItemsAsync(ListCatalogItemsRequest request) {

        return listCatalogItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCatalogItemsResult> listCatalogItemsAsync(final ListCatalogItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCatalogItemsRequest, ListCatalogItemsResult> asyncHandler) {
        final ListCatalogItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCatalogItemsResult>() {
            @Override
            public ListCatalogItemsResult call() throws Exception {
                ListCatalogItemsResult result = null;

                try {
                    result = executeListCatalogItems(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOrdersResult> listOrdersAsync(ListOrdersRequest request) {

        return listOrdersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrdersResult> listOrdersAsync(final ListOrdersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrdersRequest, ListOrdersResult> asyncHandler) {
        final ListOrdersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrdersResult>() {
            @Override
            public ListOrdersResult call() throws Exception {
                ListOrdersResult result = null;

                try {
                    result = executeListOrders(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(ListOutpostsRequest request) {

        return listOutpostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOutpostsResult> listOutpostsAsync(final ListOutpostsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOutpostsRequest, ListOutpostsResult> asyncHandler) {
        final ListOutpostsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOutpostsResult>() {
            @Override
            public ListOutpostsResult call() throws Exception {
                ListOutpostsResult result = null;

                try {
                    result = executeListOutposts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(ListSitesRequest request) {

        return listSitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSitesResult> listSitesAsync(final ListSitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSitesRequest, ListSitesResult> asyncHandler) {
        final ListSitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSitesResult>() {
            @Override
            public ListSitesResult call() throws Exception {
                ListSitesResult result = null;

                try {
                    result = executeListSites(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartConnectionResult> startConnectionAsync(StartConnectionRequest request) {

        return startConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConnectionResult> startConnectionAsync(final StartConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartConnectionRequest, StartConnectionResult> asyncHandler) {
        final StartConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartConnectionResult>() {
            @Override
            public StartConnectionResult call() throws Exception {
                StartConnectionResult result = null;

                try {
                    result = executeStartConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateOutpostResult> updateOutpostAsync(UpdateOutpostRequest request) {

        return updateOutpostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOutpostResult> updateOutpostAsync(final UpdateOutpostRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOutpostRequest, UpdateOutpostResult> asyncHandler) {
        final UpdateOutpostRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOutpostResult>() {
            @Override
            public UpdateOutpostResult call() throws Exception {
                UpdateOutpostResult result = null;

                try {
                    result = executeUpdateOutpost(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(UpdateSiteRequest request) {

        return updateSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteResult> updateSiteAsync(final UpdateSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSiteRequest, UpdateSiteResult> asyncHandler) {
        final UpdateSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSiteResult>() {
            @Override
            public UpdateSiteResult call() throws Exception {
                UpdateSiteResult result = null;

                try {
                    result = executeUpdateSite(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteAddressResult> updateSiteAddressAsync(UpdateSiteAddressRequest request) {

        return updateSiteAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteAddressResult> updateSiteAddressAsync(final UpdateSiteAddressRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSiteAddressRequest, UpdateSiteAddressResult> asyncHandler) {
        final UpdateSiteAddressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSiteAddressResult>() {
            @Override
            public UpdateSiteAddressResult call() throws Exception {
                UpdateSiteAddressResult result = null;

                try {
                    result = executeUpdateSiteAddress(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteRackPhysicalPropertiesResult> updateSiteRackPhysicalPropertiesAsync(
            UpdateSiteRackPhysicalPropertiesRequest request) {

        return updateSiteRackPhysicalPropertiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSiteRackPhysicalPropertiesResult> updateSiteRackPhysicalPropertiesAsync(
            final UpdateSiteRackPhysicalPropertiesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSiteRackPhysicalPropertiesRequest, UpdateSiteRackPhysicalPropertiesResult> asyncHandler) {
        final UpdateSiteRackPhysicalPropertiesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSiteRackPhysicalPropertiesResult>() {
            @Override
            public UpdateSiteRackPhysicalPropertiesResult call() throws Exception {
                UpdateSiteRackPhysicalPropertiesResult result = null;

                try {
                    result = executeUpdateSiteRackPhysicalProperties(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
