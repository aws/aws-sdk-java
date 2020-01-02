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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing NetworkManager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Transit Gateway Network Manager (Network Manager) enables you to create a global network, in which you can monitor
 * your AWS and on-premises networks that are built around transit gateways.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSNetworkManagerAsyncClient extends AWSNetworkManagerClient implements AWSNetworkManagerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSNetworkManagerAsyncClientBuilder asyncBuilder() {
        return AWSNetworkManagerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on NetworkManager using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSNetworkManagerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
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
    public java.util.concurrent.Future<AssociateCustomerGatewayResult> associateCustomerGatewayAsync(AssociateCustomerGatewayRequest request) {

        return associateCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateCustomerGatewayResult> associateCustomerGatewayAsync(final AssociateCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateCustomerGatewayRequest, AssociateCustomerGatewayResult> asyncHandler) {
        final AssociateCustomerGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateCustomerGatewayResult>() {
            @Override
            public AssociateCustomerGatewayResult call() throws Exception {
                AssociateCustomerGatewayResult result = null;

                try {
                    result = executeAssociateCustomerGateway(finalRequest);
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
    public java.util.concurrent.Future<AssociateLinkResult> associateLinkAsync(AssociateLinkRequest request) {

        return associateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateLinkResult> associateLinkAsync(final AssociateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateLinkRequest, AssociateLinkResult> asyncHandler) {
        final AssociateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateLinkResult>() {
            @Override
            public AssociateLinkResult call() throws Exception {
                AssociateLinkResult result = null;

                try {
                    result = executeAssociateLink(finalRequest);
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
    public java.util.concurrent.Future<CreateDeviceResult> createDeviceAsync(CreateDeviceRequest request) {

        return createDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeviceResult> createDeviceAsync(final CreateDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeviceRequest, CreateDeviceResult> asyncHandler) {
        final CreateDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateDeviceResult>() {
            @Override
            public CreateDeviceResult call() throws Exception {
                CreateDeviceResult result = null;

                try {
                    result = executeCreateDevice(finalRequest);
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
    public java.util.concurrent.Future<CreateGlobalNetworkResult> createGlobalNetworkAsync(CreateGlobalNetworkRequest request) {

        return createGlobalNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGlobalNetworkResult> createGlobalNetworkAsync(final CreateGlobalNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGlobalNetworkRequest, CreateGlobalNetworkResult> asyncHandler) {
        final CreateGlobalNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGlobalNetworkResult>() {
            @Override
            public CreateGlobalNetworkResult call() throws Exception {
                CreateGlobalNetworkResult result = null;

                try {
                    result = executeCreateGlobalNetwork(finalRequest);
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
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest request) {

        return createLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(final CreateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLinkRequest, CreateLinkResult> asyncHandler) {
        final CreateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLinkResult>() {
            @Override
            public CreateLinkResult call() throws Exception {
                CreateLinkResult result = null;

                try {
                    result = executeCreateLink(finalRequest);
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
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest request) {

        return deleteDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(final DeleteDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler) {
        final DeleteDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteDeviceResult>() {
            @Override
            public DeleteDeviceResult call() throws Exception {
                DeleteDeviceResult result = null;

                try {
                    result = executeDeleteDevice(finalRequest);
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
    public java.util.concurrent.Future<DeleteGlobalNetworkResult> deleteGlobalNetworkAsync(DeleteGlobalNetworkRequest request) {

        return deleteGlobalNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGlobalNetworkResult> deleteGlobalNetworkAsync(final DeleteGlobalNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGlobalNetworkRequest, DeleteGlobalNetworkResult> asyncHandler) {
        final DeleteGlobalNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGlobalNetworkResult>() {
            @Override
            public DeleteGlobalNetworkResult call() throws Exception {
                DeleteGlobalNetworkResult result = null;

                try {
                    result = executeDeleteGlobalNetwork(finalRequest);
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
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest request) {

        return deleteLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(final DeleteLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLinkRequest, DeleteLinkResult> asyncHandler) {
        final DeleteLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLinkResult>() {
            @Override
            public DeleteLinkResult call() throws Exception {
                DeleteLinkResult result = null;

                try {
                    result = executeDeleteLink(finalRequest);
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
    public java.util.concurrent.Future<DeregisterTransitGatewayResult> deregisterTransitGatewayAsync(DeregisterTransitGatewayRequest request) {

        return deregisterTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterTransitGatewayResult> deregisterTransitGatewayAsync(final DeregisterTransitGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterTransitGatewayRequest, DeregisterTransitGatewayResult> asyncHandler) {
        final DeregisterTransitGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterTransitGatewayResult>() {
            @Override
            public DeregisterTransitGatewayResult call() throws Exception {
                DeregisterTransitGatewayResult result = null;

                try {
                    result = executeDeregisterTransitGateway(finalRequest);
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
    public java.util.concurrent.Future<DescribeGlobalNetworksResult> describeGlobalNetworksAsync(DescribeGlobalNetworksRequest request) {

        return describeGlobalNetworksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalNetworksResult> describeGlobalNetworksAsync(final DescribeGlobalNetworksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGlobalNetworksRequest, DescribeGlobalNetworksResult> asyncHandler) {
        final DescribeGlobalNetworksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGlobalNetworksResult>() {
            @Override
            public DescribeGlobalNetworksResult call() throws Exception {
                DescribeGlobalNetworksResult result = null;

                try {
                    result = executeDescribeGlobalNetworks(finalRequest);
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
    public java.util.concurrent.Future<DisassociateCustomerGatewayResult> disassociateCustomerGatewayAsync(DisassociateCustomerGatewayRequest request) {

        return disassociateCustomerGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateCustomerGatewayResult> disassociateCustomerGatewayAsync(final DisassociateCustomerGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateCustomerGatewayRequest, DisassociateCustomerGatewayResult> asyncHandler) {
        final DisassociateCustomerGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateCustomerGatewayResult>() {
            @Override
            public DisassociateCustomerGatewayResult call() throws Exception {
                DisassociateCustomerGatewayResult result = null;

                try {
                    result = executeDisassociateCustomerGateway(finalRequest);
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
    public java.util.concurrent.Future<DisassociateLinkResult> disassociateLinkAsync(DisassociateLinkRequest request) {

        return disassociateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateLinkResult> disassociateLinkAsync(final DisassociateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateLinkRequest, DisassociateLinkResult> asyncHandler) {
        final DisassociateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateLinkResult>() {
            @Override
            public DisassociateLinkResult call() throws Exception {
                DisassociateLinkResult result = null;

                try {
                    result = executeDisassociateLink(finalRequest);
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
    public java.util.concurrent.Future<GetCustomerGatewayAssociationsResult> getCustomerGatewayAssociationsAsync(GetCustomerGatewayAssociationsRequest request) {

        return getCustomerGatewayAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCustomerGatewayAssociationsResult> getCustomerGatewayAssociationsAsync(
            final GetCustomerGatewayAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCustomerGatewayAssociationsRequest, GetCustomerGatewayAssociationsResult> asyncHandler) {
        final GetCustomerGatewayAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetCustomerGatewayAssociationsResult>() {
            @Override
            public GetCustomerGatewayAssociationsResult call() throws Exception {
                GetCustomerGatewayAssociationsResult result = null;

                try {
                    result = executeGetCustomerGatewayAssociations(finalRequest);
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
    public java.util.concurrent.Future<GetDevicesResult> getDevicesAsync(GetDevicesRequest request) {

        return getDevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicesResult> getDevicesAsync(final GetDevicesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicesRequest, GetDevicesResult> asyncHandler) {
        final GetDevicesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevicesResult>() {
            @Override
            public GetDevicesResult call() throws Exception {
                GetDevicesResult result = null;

                try {
                    result = executeGetDevices(finalRequest);
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
    public java.util.concurrent.Future<GetLinkAssociationsResult> getLinkAssociationsAsync(GetLinkAssociationsRequest request) {

        return getLinkAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLinkAssociationsResult> getLinkAssociationsAsync(final GetLinkAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLinkAssociationsRequest, GetLinkAssociationsResult> asyncHandler) {
        final GetLinkAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLinkAssociationsResult>() {
            @Override
            public GetLinkAssociationsResult call() throws Exception {
                GetLinkAssociationsResult result = null;

                try {
                    result = executeGetLinkAssociations(finalRequest);
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
    public java.util.concurrent.Future<GetLinksResult> getLinksAsync(GetLinksRequest request) {

        return getLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLinksResult> getLinksAsync(final GetLinksRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLinksRequest, GetLinksResult> asyncHandler) {
        final GetLinksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLinksResult>() {
            @Override
            public GetLinksResult call() throws Exception {
                GetLinksResult result = null;

                try {
                    result = executeGetLinks(finalRequest);
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
    public java.util.concurrent.Future<GetSitesResult> getSitesAsync(GetSitesRequest request) {

        return getSitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSitesResult> getSitesAsync(final GetSitesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSitesRequest, GetSitesResult> asyncHandler) {
        final GetSitesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSitesResult>() {
            @Override
            public GetSitesResult call() throws Exception {
                GetSitesResult result = null;

                try {
                    result = executeGetSites(finalRequest);
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
    public java.util.concurrent.Future<GetTransitGatewayRegistrationsResult> getTransitGatewayRegistrationsAsync(GetTransitGatewayRegistrationsRequest request) {

        return getTransitGatewayRegistrationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTransitGatewayRegistrationsResult> getTransitGatewayRegistrationsAsync(
            final GetTransitGatewayRegistrationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTransitGatewayRegistrationsRequest, GetTransitGatewayRegistrationsResult> asyncHandler) {
        final GetTransitGatewayRegistrationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTransitGatewayRegistrationsResult>() {
            @Override
            public GetTransitGatewayRegistrationsResult call() throws Exception {
                GetTransitGatewayRegistrationsResult result = null;

                try {
                    result = executeGetTransitGatewayRegistrations(finalRequest);
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
    public java.util.concurrent.Future<RegisterTransitGatewayResult> registerTransitGatewayAsync(RegisterTransitGatewayRequest request) {

        return registerTransitGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterTransitGatewayResult> registerTransitGatewayAsync(final RegisterTransitGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<RegisterTransitGatewayRequest, RegisterTransitGatewayResult> asyncHandler) {
        final RegisterTransitGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RegisterTransitGatewayResult>() {
            @Override
            public RegisterTransitGatewayResult call() throws Exception {
                RegisterTransitGatewayResult result = null;

                try {
                    result = executeRegisterTransitGateway(finalRequest);
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
    public java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest request) {

        return updateDeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(final UpdateDeviceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeviceRequest, UpdateDeviceResult> asyncHandler) {
        final UpdateDeviceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeviceResult>() {
            @Override
            public UpdateDeviceResult call() throws Exception {
                UpdateDeviceResult result = null;

                try {
                    result = executeUpdateDevice(finalRequest);
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
    public java.util.concurrent.Future<UpdateGlobalNetworkResult> updateGlobalNetworkAsync(UpdateGlobalNetworkRequest request) {

        return updateGlobalNetworkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGlobalNetworkResult> updateGlobalNetworkAsync(final UpdateGlobalNetworkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGlobalNetworkRequest, UpdateGlobalNetworkResult> asyncHandler) {
        final UpdateGlobalNetworkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGlobalNetworkResult>() {
            @Override
            public UpdateGlobalNetworkResult call() throws Exception {
                UpdateGlobalNetworkResult result = null;

                try {
                    result = executeUpdateGlobalNetwork(finalRequest);
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
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest request) {

        return updateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(final UpdateLinkRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLinkRequest, UpdateLinkResult> asyncHandler) {
        final UpdateLinkRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLinkResult>() {
            @Override
            public UpdateLinkResult call() throws Exception {
                UpdateLinkResult result = null;

                try {
                    result = executeUpdateLink(finalRequest);
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
