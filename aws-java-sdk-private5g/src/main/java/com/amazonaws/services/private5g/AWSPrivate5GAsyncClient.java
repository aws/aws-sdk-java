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

import com.amazonaws.services.private5g.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Private 5G asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon Web Services Private 5G is a managed service that makes it easy to deploy, operate, and scale your own private
 * mobile network at your on-premises location. Private 5G provides the pre-configured hardware and software for mobile
 * networks, helps automate setup, and scales capacity on demand to support additional devices as needed.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSPrivate5GAsyncClient extends AWSPrivate5GClient implements AWSPrivate5GAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSPrivate5GAsyncClientBuilder asyncBuilder() {
        return AWSPrivate5GAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Private 5G using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSPrivate5GAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Private 5G using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSPrivate5GAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AcknowledgeOrderReceiptResult> acknowledgeOrderReceiptAsync(AcknowledgeOrderReceiptRequest request) {

        return acknowledgeOrderReceiptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcknowledgeOrderReceiptResult> acknowledgeOrderReceiptAsync(final AcknowledgeOrderReceiptRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcknowledgeOrderReceiptRequest, AcknowledgeOrderReceiptResult> asyncHandler) {
        final AcknowledgeOrderReceiptRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcknowledgeOrderReceiptResult>() {
            @Override
            public AcknowledgeOrderReceiptResult call() throws Exception {
                AcknowledgeOrderReceiptResult result = null;

                try {
                    result = executeAcknowledgeOrderReceipt(finalRequest);
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
    public java.util.concurrent.Future<ActivateDeviceIdentifierResult> activateDeviceIdentifierAsync(ActivateDeviceIdentifierRequest request) {

        return activateDeviceIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateDeviceIdentifierResult> activateDeviceIdentifierAsync(final ActivateDeviceIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateDeviceIdentifierRequest, ActivateDeviceIdentifierResult> asyncHandler) {
        final ActivateDeviceIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateDeviceIdentifierResult>() {
            @Override
            public ActivateDeviceIdentifierResult call() throws Exception {
                ActivateDeviceIdentifierResult result = null;

                try {
                    result = executeActivateDeviceIdentifier(finalRequest);
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
    public java.util.concurrent.Future<ActivateNetworkSiteResult> activateNetworkSiteAsync(ActivateNetworkSiteRequest request) {

        return activateNetworkSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateNetworkSiteResult> activateNetworkSiteAsync(final ActivateNetworkSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateNetworkSiteRequest, ActivateNetworkSiteResult> asyncHandler) {
        final ActivateNetworkSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateNetworkSiteResult>() {
            @Override
            public ActivateNetworkSiteResult call() throws Exception {
                ActivateNetworkSiteResult result = null;

                try {
                    result = executeActivateNetworkSite(finalRequest);
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
    public java.util.concurrent.Future<ConfigureAccessPointResult> configureAccessPointAsync(ConfigureAccessPointRequest request) {

        return configureAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfigureAccessPointResult> configureAccessPointAsync(final ConfigureAccessPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfigureAccessPointRequest, ConfigureAccessPointResult> asyncHandler) {
        final ConfigureAccessPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ConfigureAccessPointResult>() {
            @Override
            public ConfigureAccessPointResult call() throws Exception {
                ConfigureAccessPointResult result = null;

                try {
                    result = executeConfigureAccessPoint(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(CreateNetworkRequest request) {

        return createNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkResult> createNetworkAsync(final CreateNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkRequest, CreateNetworkResult> asyncHandler) {
        final CreateNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkResult>() {
            @Override
            public CreateNetworkResult call() throws Exception {
                CreateNetworkResult result = null;

                try {
                    result = executeCreateNetwork(finalRequest);
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
    public java.util.concurrent.Future<CreateNetworkSiteResult> createNetworkSiteAsync(CreateNetworkSiteRequest request) {

        return createNetworkSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNetworkSiteResult> createNetworkSiteAsync(final CreateNetworkSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNetworkSiteRequest, CreateNetworkSiteResult> asyncHandler) {
        final CreateNetworkSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNetworkSiteResult>() {
            @Override
            public CreateNetworkSiteResult call() throws Exception {
                CreateNetworkSiteResult result = null;

                try {
                    result = executeCreateNetworkSite(finalRequest);
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
    public java.util.concurrent.Future<DeactivateDeviceIdentifierResult> deactivateDeviceIdentifierAsync(DeactivateDeviceIdentifierRequest request) {

        return deactivateDeviceIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateDeviceIdentifierResult> deactivateDeviceIdentifierAsync(final DeactivateDeviceIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivateDeviceIdentifierRequest, DeactivateDeviceIdentifierResult> asyncHandler) {
        final DeactivateDeviceIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeactivateDeviceIdentifierResult>() {
            @Override
            public DeactivateDeviceIdentifierResult call() throws Exception {
                DeactivateDeviceIdentifierResult result = null;

                try {
                    result = executeDeactivateDeviceIdentifier(finalRequest);
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
    public java.util.concurrent.Future<DeleteNetworkResult> deleteNetworkAsync(DeleteNetworkRequest request) {

        return deleteNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkResult> deleteNetworkAsync(final DeleteNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkRequest, DeleteNetworkResult> asyncHandler) {
        final DeleteNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkResult>() {
            @Override
            public DeleteNetworkResult call() throws Exception {
                DeleteNetworkResult result = null;

                try {
                    result = executeDeleteNetwork(finalRequest);
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
    public java.util.concurrent.Future<DeleteNetworkSiteResult> deleteNetworkSiteAsync(DeleteNetworkSiteRequest request) {

        return deleteNetworkSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNetworkSiteResult> deleteNetworkSiteAsync(final DeleteNetworkSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNetworkSiteRequest, DeleteNetworkSiteResult> asyncHandler) {
        final DeleteNetworkSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNetworkSiteResult>() {
            @Override
            public DeleteNetworkSiteResult call() throws Exception {
                DeleteNetworkSiteResult result = null;

                try {
                    result = executeDeleteNetworkSite(finalRequest);
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
    public java.util.concurrent.Future<GetDeviceIdentifierResult> getDeviceIdentifierAsync(GetDeviceIdentifierRequest request) {

        return getDeviceIdentifierAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceIdentifierResult> getDeviceIdentifierAsync(final GetDeviceIdentifierRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDeviceIdentifierRequest, GetDeviceIdentifierResult> asyncHandler) {
        final GetDeviceIdentifierRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDeviceIdentifierResult>() {
            @Override
            public GetDeviceIdentifierResult call() throws Exception {
                GetDeviceIdentifierResult result = null;

                try {
                    result = executeGetDeviceIdentifier(finalRequest);
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
    public java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(GetNetworkRequest request) {

        return getNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResult> getNetworkAsync(final GetNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkRequest, GetNetworkResult> asyncHandler) {
        final GetNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkResult>() {
            @Override
            public GetNetworkResult call() throws Exception {
                GetNetworkResult result = null;

                try {
                    result = executeGetNetwork(finalRequest);
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
    public java.util.concurrent.Future<GetNetworkResourceResult> getNetworkResourceAsync(GetNetworkResourceRequest request) {

        return getNetworkResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkResourceResult> getNetworkResourceAsync(final GetNetworkResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkResourceRequest, GetNetworkResourceResult> asyncHandler) {
        final GetNetworkResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkResourceResult>() {
            @Override
            public GetNetworkResourceResult call() throws Exception {
                GetNetworkResourceResult result = null;

                try {
                    result = executeGetNetworkResource(finalRequest);
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
    public java.util.concurrent.Future<GetNetworkSiteResult> getNetworkSiteAsync(GetNetworkSiteRequest request) {

        return getNetworkSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetNetworkSiteResult> getNetworkSiteAsync(final GetNetworkSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetNetworkSiteRequest, GetNetworkSiteResult> asyncHandler) {
        final GetNetworkSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetNetworkSiteResult>() {
            @Override
            public GetNetworkSiteResult call() throws Exception {
                GetNetworkSiteResult result = null;

                try {
                    result = executeGetNetworkSite(finalRequest);
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
    public java.util.concurrent.Future<ListDeviceIdentifiersResult> listDeviceIdentifiersAsync(ListDeviceIdentifiersRequest request) {

        return listDeviceIdentifiersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeviceIdentifiersResult> listDeviceIdentifiersAsync(final ListDeviceIdentifiersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeviceIdentifiersRequest, ListDeviceIdentifiersResult> asyncHandler) {
        final ListDeviceIdentifiersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListDeviceIdentifiersResult>() {
            @Override
            public ListDeviceIdentifiersResult call() throws Exception {
                ListDeviceIdentifiersResult result = null;

                try {
                    result = executeListDeviceIdentifiers(finalRequest);
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
    public java.util.concurrent.Future<ListNetworkResourcesResult> listNetworkResourcesAsync(ListNetworkResourcesRequest request) {

        return listNetworkResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkResourcesResult> listNetworkResourcesAsync(final ListNetworkResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNetworkResourcesRequest, ListNetworkResourcesResult> asyncHandler) {
        final ListNetworkResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNetworkResourcesResult>() {
            @Override
            public ListNetworkResourcesResult call() throws Exception {
                ListNetworkResourcesResult result = null;

                try {
                    result = executeListNetworkResources(finalRequest);
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
    public java.util.concurrent.Future<ListNetworkSitesResult> listNetworkSitesAsync(ListNetworkSitesRequest request) {

        return listNetworkSitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNetworkSitesResult> listNetworkSitesAsync(final ListNetworkSitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNetworkSitesRequest, ListNetworkSitesResult> asyncHandler) {
        final ListNetworkSitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNetworkSitesResult>() {
            @Override
            public ListNetworkSitesResult call() throws Exception {
                ListNetworkSitesResult result = null;

                try {
                    result = executeListNetworkSites(finalRequest);
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
    public java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(ListNetworksRequest request) {

        return listNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNetworksResult> listNetworksAsync(final ListNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNetworksRequest, ListNetworksResult> asyncHandler) {
        final ListNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNetworksResult>() {
            @Override
            public ListNetworksResult call() throws Exception {
                ListNetworksResult result = null;

                try {
                    result = executeListNetworks(finalRequest);
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
    public java.util.concurrent.Future<PingResult> pingAsync(PingRequest request) {

        return pingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PingResult> pingAsync(final PingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PingRequest, PingResult> asyncHandler) {
        final PingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PingResult>() {
            @Override
            public PingResult call() throws Exception {
                PingResult result = null;

                try {
                    result = executePing(finalRequest);
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
    public java.util.concurrent.Future<UpdateNetworkSiteResult> updateNetworkSiteAsync(UpdateNetworkSiteRequest request) {

        return updateNetworkSiteAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSiteResult> updateNetworkSiteAsync(final UpdateNetworkSiteRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNetworkSiteRequest, UpdateNetworkSiteResult> asyncHandler) {
        final UpdateNetworkSiteRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNetworkSiteResult>() {
            @Override
            public UpdateNetworkSiteResult call() throws Exception {
                UpdateNetworkSiteResult result = null;

                try {
                    result = executeUpdateNetworkSite(finalRequest);
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
    public java.util.concurrent.Future<UpdateNetworkSitePlanResult> updateNetworkSitePlanAsync(UpdateNetworkSitePlanRequest request) {

        return updateNetworkSitePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNetworkSitePlanResult> updateNetworkSitePlanAsync(final UpdateNetworkSitePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNetworkSitePlanRequest, UpdateNetworkSitePlanResult> asyncHandler) {
        final UpdateNetworkSitePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNetworkSitePlanResult>() {
            @Override
            public UpdateNetworkSitePlanResult call() throws Exception {
                UpdateNetworkSitePlanResult result = null;

                try {
                    result = executeUpdateNetworkSitePlan(finalRequest);
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
