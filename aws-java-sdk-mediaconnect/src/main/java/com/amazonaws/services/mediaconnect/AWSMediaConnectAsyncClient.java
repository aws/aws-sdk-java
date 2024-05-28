/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS MediaConnect asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * API for AWS Elemental MediaConnect
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMediaConnectAsyncClient extends AWSMediaConnectClient implements AWSMediaConnectAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMediaConnectAsyncClientBuilder asyncBuilder() {
        return AWSMediaConnectAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS MediaConnect using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMediaConnectAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS MediaConnect using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMediaConnectAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AddBridgeOutputsResult> addBridgeOutputsAsync(AddBridgeOutputsRequest request) {

        return addBridgeOutputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddBridgeOutputsResult> addBridgeOutputsAsync(final AddBridgeOutputsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddBridgeOutputsRequest, AddBridgeOutputsResult> asyncHandler) {
        final AddBridgeOutputsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddBridgeOutputsResult>() {
            @Override
            public AddBridgeOutputsResult call() throws Exception {
                AddBridgeOutputsResult result = null;

                try {
                    result = executeAddBridgeOutputs(finalRequest);
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
    public java.util.concurrent.Future<AddBridgeSourcesResult> addBridgeSourcesAsync(AddBridgeSourcesRequest request) {

        return addBridgeSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddBridgeSourcesResult> addBridgeSourcesAsync(final AddBridgeSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddBridgeSourcesRequest, AddBridgeSourcesResult> asyncHandler) {
        final AddBridgeSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddBridgeSourcesResult>() {
            @Override
            public AddBridgeSourcesResult call() throws Exception {
                AddBridgeSourcesResult result = null;

                try {
                    result = executeAddBridgeSources(finalRequest);
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
    public java.util.concurrent.Future<AddFlowMediaStreamsResult> addFlowMediaStreamsAsync(AddFlowMediaStreamsRequest request) {

        return addFlowMediaStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddFlowMediaStreamsResult> addFlowMediaStreamsAsync(final AddFlowMediaStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddFlowMediaStreamsRequest, AddFlowMediaStreamsResult> asyncHandler) {
        final AddFlowMediaStreamsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddFlowMediaStreamsResult>() {
            @Override
            public AddFlowMediaStreamsResult call() throws Exception {
                AddFlowMediaStreamsResult result = null;

                try {
                    result = executeAddFlowMediaStreams(finalRequest);
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
    public java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(AddFlowOutputsRequest request) {

        return addFlowOutputsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddFlowOutputsResult> addFlowOutputsAsync(final AddFlowOutputsRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddFlowOutputsRequest, AddFlowOutputsResult> asyncHandler) {
        final AddFlowOutputsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddFlowOutputsResult>() {
            @Override
            public AddFlowOutputsResult call() throws Exception {
                AddFlowOutputsResult result = null;

                try {
                    result = executeAddFlowOutputs(finalRequest);
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
    public java.util.concurrent.Future<AddFlowSourcesResult> addFlowSourcesAsync(AddFlowSourcesRequest request) {

        return addFlowSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddFlowSourcesResult> addFlowSourcesAsync(final AddFlowSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddFlowSourcesRequest, AddFlowSourcesResult> asyncHandler) {
        final AddFlowSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddFlowSourcesResult>() {
            @Override
            public AddFlowSourcesResult call() throws Exception {
                AddFlowSourcesResult result = null;

                try {
                    result = executeAddFlowSources(finalRequest);
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
    public java.util.concurrent.Future<AddFlowVpcInterfacesResult> addFlowVpcInterfacesAsync(AddFlowVpcInterfacesRequest request) {

        return addFlowVpcInterfacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddFlowVpcInterfacesResult> addFlowVpcInterfacesAsync(final AddFlowVpcInterfacesRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddFlowVpcInterfacesRequest, AddFlowVpcInterfacesResult> asyncHandler) {
        final AddFlowVpcInterfacesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AddFlowVpcInterfacesResult>() {
            @Override
            public AddFlowVpcInterfacesResult call() throws Exception {
                AddFlowVpcInterfacesResult result = null;

                try {
                    result = executeAddFlowVpcInterfaces(finalRequest);
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
    public java.util.concurrent.Future<CreateBridgeResult> createBridgeAsync(CreateBridgeRequest request) {

        return createBridgeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBridgeResult> createBridgeAsync(final CreateBridgeRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBridgeRequest, CreateBridgeResult> asyncHandler) {
        final CreateBridgeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBridgeResult>() {
            @Override
            public CreateBridgeResult call() throws Exception {
                CreateBridgeResult result = null;

                try {
                    result = executeCreateBridge(finalRequest);
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
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(CreateFlowRequest request) {

        return createFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFlowResult> createFlowAsync(final CreateFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFlowRequest, CreateFlowResult> asyncHandler) {
        final CreateFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFlowResult>() {
            @Override
            public CreateFlowResult call() throws Exception {
                CreateFlowResult result = null;

                try {
                    result = executeCreateFlow(finalRequest);
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
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(CreateGatewayRequest request) {

        return createGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGatewayResult> createGatewayAsync(final CreateGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGatewayRequest, CreateGatewayResult> asyncHandler) {
        final CreateGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGatewayResult>() {
            @Override
            public CreateGatewayResult call() throws Exception {
                CreateGatewayResult result = null;

                try {
                    result = executeCreateGateway(finalRequest);
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
    public java.util.concurrent.Future<DeleteBridgeResult> deleteBridgeAsync(DeleteBridgeRequest request) {

        return deleteBridgeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBridgeResult> deleteBridgeAsync(final DeleteBridgeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBridgeRequest, DeleteBridgeResult> asyncHandler) {
        final DeleteBridgeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBridgeResult>() {
            @Override
            public DeleteBridgeResult call() throws Exception {
                DeleteBridgeResult result = null;

                try {
                    result = executeDeleteBridge(finalRequest);
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
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(DeleteFlowRequest request) {

        return deleteFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFlowResult> deleteFlowAsync(final DeleteFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFlowRequest, DeleteFlowResult> asyncHandler) {
        final DeleteFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFlowResult>() {
            @Override
            public DeleteFlowResult call() throws Exception {
                DeleteFlowResult result = null;

                try {
                    result = executeDeleteFlow(finalRequest);
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
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest request) {

        return deleteGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGatewayResult> deleteGatewayAsync(final DeleteGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler) {
        final DeleteGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGatewayResult>() {
            @Override
            public DeleteGatewayResult call() throws Exception {
                DeleteGatewayResult result = null;

                try {
                    result = executeDeleteGateway(finalRequest);
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
    public java.util.concurrent.Future<DeregisterGatewayInstanceResult> deregisterGatewayInstanceAsync(DeregisterGatewayInstanceRequest request) {

        return deregisterGatewayInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterGatewayInstanceResult> deregisterGatewayInstanceAsync(final DeregisterGatewayInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeregisterGatewayInstanceRequest, DeregisterGatewayInstanceResult> asyncHandler) {
        final DeregisterGatewayInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeregisterGatewayInstanceResult>() {
            @Override
            public DeregisterGatewayInstanceResult call() throws Exception {
                DeregisterGatewayInstanceResult result = null;

                try {
                    result = executeDeregisterGatewayInstance(finalRequest);
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
    public java.util.concurrent.Future<DescribeBridgeResult> describeBridgeAsync(DescribeBridgeRequest request) {

        return describeBridgeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBridgeResult> describeBridgeAsync(final DescribeBridgeRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBridgeRequest, DescribeBridgeResult> asyncHandler) {
        final DescribeBridgeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBridgeResult>() {
            @Override
            public DescribeBridgeResult call() throws Exception {
                DescribeBridgeResult result = null;

                try {
                    result = executeDescribeBridge(finalRequest);
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
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(DescribeFlowRequest request) {

        return describeFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowResult> describeFlowAsync(final DescribeFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowRequest, DescribeFlowResult> asyncHandler) {
        final DescribeFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowResult>() {
            @Override
            public DescribeFlowResult call() throws Exception {
                DescribeFlowResult result = null;

                try {
                    result = executeDescribeFlow(finalRequest);
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
    public java.util.concurrent.Future<DescribeFlowSourceMetadataResult> describeFlowSourceMetadataAsync(DescribeFlowSourceMetadataRequest request) {

        return describeFlowSourceMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFlowSourceMetadataResult> describeFlowSourceMetadataAsync(final DescribeFlowSourceMetadataRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFlowSourceMetadataRequest, DescribeFlowSourceMetadataResult> asyncHandler) {
        final DescribeFlowSourceMetadataRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFlowSourceMetadataResult>() {
            @Override
            public DescribeFlowSourceMetadataResult call() throws Exception {
                DescribeFlowSourceMetadataResult result = null;

                try {
                    result = executeDescribeFlowSourceMetadata(finalRequest);
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
    public java.util.concurrent.Future<DescribeGatewayResult> describeGatewayAsync(DescribeGatewayRequest request) {

        return describeGatewayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayResult> describeGatewayAsync(final DescribeGatewayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGatewayRequest, DescribeGatewayResult> asyncHandler) {
        final DescribeGatewayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGatewayResult>() {
            @Override
            public DescribeGatewayResult call() throws Exception {
                DescribeGatewayResult result = null;

                try {
                    result = executeDescribeGateway(finalRequest);
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
    public java.util.concurrent.Future<DescribeGatewayInstanceResult> describeGatewayInstanceAsync(DescribeGatewayInstanceRequest request) {

        return describeGatewayInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGatewayInstanceResult> describeGatewayInstanceAsync(final DescribeGatewayInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGatewayInstanceRequest, DescribeGatewayInstanceResult> asyncHandler) {
        final DescribeGatewayInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGatewayInstanceResult>() {
            @Override
            public DescribeGatewayInstanceResult call() throws Exception {
                DescribeGatewayInstanceResult result = null;

                try {
                    result = executeDescribeGatewayInstance(finalRequest);
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
    public java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(DescribeOfferingRequest request) {

        return describeOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOfferingResult> describeOfferingAsync(final DescribeOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOfferingRequest, DescribeOfferingResult> asyncHandler) {
        final DescribeOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOfferingResult>() {
            @Override
            public DescribeOfferingResult call() throws Exception {
                DescribeOfferingResult result = null;

                try {
                    result = executeDescribeOffering(finalRequest);
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
    public java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(DescribeReservationRequest request) {

        return describeReservationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservationResult> describeReservationAsync(final DescribeReservationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeReservationRequest, DescribeReservationResult> asyncHandler) {
        final DescribeReservationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeReservationResult>() {
            @Override
            public DescribeReservationResult call() throws Exception {
                DescribeReservationResult result = null;

                try {
                    result = executeDescribeReservation(finalRequest);
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
    public java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(GrantFlowEntitlementsRequest request) {

        return grantFlowEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GrantFlowEntitlementsResult> grantFlowEntitlementsAsync(final GrantFlowEntitlementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GrantFlowEntitlementsRequest, GrantFlowEntitlementsResult> asyncHandler) {
        final GrantFlowEntitlementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GrantFlowEntitlementsResult>() {
            @Override
            public GrantFlowEntitlementsResult call() throws Exception {
                GrantFlowEntitlementsResult result = null;

                try {
                    result = executeGrantFlowEntitlements(finalRequest);
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
    public java.util.concurrent.Future<ListBridgesResult> listBridgesAsync(ListBridgesRequest request) {

        return listBridgesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBridgesResult> listBridgesAsync(final ListBridgesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBridgesRequest, ListBridgesResult> asyncHandler) {
        final ListBridgesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBridgesResult>() {
            @Override
            public ListBridgesResult call() throws Exception {
                ListBridgesResult result = null;

                try {
                    result = executeListBridges(finalRequest);
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
    public java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(ListEntitlementsRequest request) {

        return listEntitlementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitlementsResult> listEntitlementsAsync(final ListEntitlementsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEntitlementsRequest, ListEntitlementsResult> asyncHandler) {
        final ListEntitlementsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEntitlementsResult>() {
            @Override
            public ListEntitlementsResult call() throws Exception {
                ListEntitlementsResult result = null;

                try {
                    result = executeListEntitlements(finalRequest);
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
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(ListFlowsRequest request) {

        return listFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFlowsResult> listFlowsAsync(final ListFlowsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFlowsRequest, ListFlowsResult> asyncHandler) {
        final ListFlowsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFlowsResult>() {
            @Override
            public ListFlowsResult call() throws Exception {
                ListFlowsResult result = null;

                try {
                    result = executeListFlows(finalRequest);
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
    public java.util.concurrent.Future<ListGatewayInstancesResult> listGatewayInstancesAsync(ListGatewayInstancesRequest request) {

        return listGatewayInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewayInstancesResult> listGatewayInstancesAsync(final ListGatewayInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewayInstancesRequest, ListGatewayInstancesResult> asyncHandler) {
        final ListGatewayInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGatewayInstancesResult>() {
            @Override
            public ListGatewayInstancesResult call() throws Exception {
                ListGatewayInstancesResult result = null;

                try {
                    result = executeListGatewayInstances(finalRequest);
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
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest request) {

        return listGatewaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGatewaysResult> listGatewaysAsync(final ListGatewaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler) {
        final ListGatewaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGatewaysResult>() {
            @Override
            public ListGatewaysResult call() throws Exception {
                ListGatewaysResult result = null;

                try {
                    result = executeListGateways(finalRequest);
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
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(ListOfferingsRequest request) {

        return listOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOfferingsResult> listOfferingsAsync(final ListOfferingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOfferingsRequest, ListOfferingsResult> asyncHandler) {
        final ListOfferingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOfferingsResult>() {
            @Override
            public ListOfferingsResult call() throws Exception {
                ListOfferingsResult result = null;

                try {
                    result = executeListOfferings(finalRequest);
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
    public java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(ListReservationsRequest request) {

        return listReservationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReservationsResult> listReservationsAsync(final ListReservationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReservationsRequest, ListReservationsResult> asyncHandler) {
        final ListReservationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReservationsResult>() {
            @Override
            public ListReservationsResult call() throws Exception {
                ListReservationsResult result = null;

                try {
                    result = executeListReservations(finalRequest);
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
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(PurchaseOfferingRequest request) {

        return purchaseOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseOfferingResult> purchaseOfferingAsync(final PurchaseOfferingRequest request,
            final com.amazonaws.handlers.AsyncHandler<PurchaseOfferingRequest, PurchaseOfferingResult> asyncHandler) {
        final PurchaseOfferingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PurchaseOfferingResult>() {
            @Override
            public PurchaseOfferingResult call() throws Exception {
                PurchaseOfferingResult result = null;

                try {
                    result = executePurchaseOffering(finalRequest);
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
    public java.util.concurrent.Future<RemoveBridgeOutputResult> removeBridgeOutputAsync(RemoveBridgeOutputRequest request) {

        return removeBridgeOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveBridgeOutputResult> removeBridgeOutputAsync(final RemoveBridgeOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveBridgeOutputRequest, RemoveBridgeOutputResult> asyncHandler) {
        final RemoveBridgeOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveBridgeOutputResult>() {
            @Override
            public RemoveBridgeOutputResult call() throws Exception {
                RemoveBridgeOutputResult result = null;

                try {
                    result = executeRemoveBridgeOutput(finalRequest);
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
    public java.util.concurrent.Future<RemoveBridgeSourceResult> removeBridgeSourceAsync(RemoveBridgeSourceRequest request) {

        return removeBridgeSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveBridgeSourceResult> removeBridgeSourceAsync(final RemoveBridgeSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveBridgeSourceRequest, RemoveBridgeSourceResult> asyncHandler) {
        final RemoveBridgeSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveBridgeSourceResult>() {
            @Override
            public RemoveBridgeSourceResult call() throws Exception {
                RemoveBridgeSourceResult result = null;

                try {
                    result = executeRemoveBridgeSource(finalRequest);
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
    public java.util.concurrent.Future<RemoveFlowMediaStreamResult> removeFlowMediaStreamAsync(RemoveFlowMediaStreamRequest request) {

        return removeFlowMediaStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFlowMediaStreamResult> removeFlowMediaStreamAsync(final RemoveFlowMediaStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveFlowMediaStreamRequest, RemoveFlowMediaStreamResult> asyncHandler) {
        final RemoveFlowMediaStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveFlowMediaStreamResult>() {
            @Override
            public RemoveFlowMediaStreamResult call() throws Exception {
                RemoveFlowMediaStreamResult result = null;

                try {
                    result = executeRemoveFlowMediaStream(finalRequest);
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
    public java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(RemoveFlowOutputRequest request) {

        return removeFlowOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFlowOutputResult> removeFlowOutputAsync(final RemoveFlowOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveFlowOutputRequest, RemoveFlowOutputResult> asyncHandler) {
        final RemoveFlowOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveFlowOutputResult>() {
            @Override
            public RemoveFlowOutputResult call() throws Exception {
                RemoveFlowOutputResult result = null;

                try {
                    result = executeRemoveFlowOutput(finalRequest);
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
    public java.util.concurrent.Future<RemoveFlowSourceResult> removeFlowSourceAsync(RemoveFlowSourceRequest request) {

        return removeFlowSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFlowSourceResult> removeFlowSourceAsync(final RemoveFlowSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveFlowSourceRequest, RemoveFlowSourceResult> asyncHandler) {
        final RemoveFlowSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveFlowSourceResult>() {
            @Override
            public RemoveFlowSourceResult call() throws Exception {
                RemoveFlowSourceResult result = null;

                try {
                    result = executeRemoveFlowSource(finalRequest);
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
    public java.util.concurrent.Future<RemoveFlowVpcInterfaceResult> removeFlowVpcInterfaceAsync(RemoveFlowVpcInterfaceRequest request) {

        return removeFlowVpcInterfaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveFlowVpcInterfaceResult> removeFlowVpcInterfaceAsync(final RemoveFlowVpcInterfaceRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveFlowVpcInterfaceRequest, RemoveFlowVpcInterfaceResult> asyncHandler) {
        final RemoveFlowVpcInterfaceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveFlowVpcInterfaceResult>() {
            @Override
            public RemoveFlowVpcInterfaceResult call() throws Exception {
                RemoveFlowVpcInterfaceResult result = null;

                try {
                    result = executeRemoveFlowVpcInterface(finalRequest);
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
    public java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(RevokeFlowEntitlementRequest request) {

        return revokeFlowEntitlementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RevokeFlowEntitlementResult> revokeFlowEntitlementAsync(final RevokeFlowEntitlementRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeFlowEntitlementRequest, RevokeFlowEntitlementResult> asyncHandler) {
        final RevokeFlowEntitlementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RevokeFlowEntitlementResult>() {
            @Override
            public RevokeFlowEntitlementResult call() throws Exception {
                RevokeFlowEntitlementResult result = null;

                try {
                    result = executeRevokeFlowEntitlement(finalRequest);
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
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(StartFlowRequest request) {

        return startFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFlowResult> startFlowAsync(final StartFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFlowRequest, StartFlowResult> asyncHandler) {
        final StartFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFlowResult>() {
            @Override
            public StartFlowResult call() throws Exception {
                StartFlowResult result = null;

                try {
                    result = executeStartFlow(finalRequest);
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
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(StopFlowRequest request) {

        return stopFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFlowResult> stopFlowAsync(final StopFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopFlowRequest, StopFlowResult> asyncHandler) {
        final StopFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopFlowResult>() {
            @Override
            public StopFlowResult call() throws Exception {
                StopFlowResult result = null;

                try {
                    result = executeStopFlow(finalRequest);
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
    public java.util.concurrent.Future<UpdateBridgeResult> updateBridgeAsync(UpdateBridgeRequest request) {

        return updateBridgeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBridgeResult> updateBridgeAsync(final UpdateBridgeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBridgeRequest, UpdateBridgeResult> asyncHandler) {
        final UpdateBridgeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBridgeResult>() {
            @Override
            public UpdateBridgeResult call() throws Exception {
                UpdateBridgeResult result = null;

                try {
                    result = executeUpdateBridge(finalRequest);
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
    public java.util.concurrent.Future<UpdateBridgeOutputResult> updateBridgeOutputAsync(UpdateBridgeOutputRequest request) {

        return updateBridgeOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBridgeOutputResult> updateBridgeOutputAsync(final UpdateBridgeOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBridgeOutputRequest, UpdateBridgeOutputResult> asyncHandler) {
        final UpdateBridgeOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBridgeOutputResult>() {
            @Override
            public UpdateBridgeOutputResult call() throws Exception {
                UpdateBridgeOutputResult result = null;

                try {
                    result = executeUpdateBridgeOutput(finalRequest);
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
    public java.util.concurrent.Future<UpdateBridgeSourceResult> updateBridgeSourceAsync(UpdateBridgeSourceRequest request) {

        return updateBridgeSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBridgeSourceResult> updateBridgeSourceAsync(final UpdateBridgeSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBridgeSourceRequest, UpdateBridgeSourceResult> asyncHandler) {
        final UpdateBridgeSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBridgeSourceResult>() {
            @Override
            public UpdateBridgeSourceResult call() throws Exception {
                UpdateBridgeSourceResult result = null;

                try {
                    result = executeUpdateBridgeSource(finalRequest);
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
    public java.util.concurrent.Future<UpdateBridgeStateResult> updateBridgeStateAsync(UpdateBridgeStateRequest request) {

        return updateBridgeStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBridgeStateResult> updateBridgeStateAsync(final UpdateBridgeStateRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBridgeStateRequest, UpdateBridgeStateResult> asyncHandler) {
        final UpdateBridgeStateRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBridgeStateResult>() {
            @Override
            public UpdateBridgeStateResult call() throws Exception {
                UpdateBridgeStateResult result = null;

                try {
                    result = executeUpdateBridgeState(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(UpdateFlowRequest request) {

        return updateFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowResult> updateFlowAsync(final UpdateFlowRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowRequest, UpdateFlowResult> asyncHandler) {
        final UpdateFlowRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowResult>() {
            @Override
            public UpdateFlowResult call() throws Exception {
                UpdateFlowResult result = null;

                try {
                    result = executeUpdateFlow(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(UpdateFlowEntitlementRequest request) {

        return updateFlowEntitlementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowEntitlementResult> updateFlowEntitlementAsync(final UpdateFlowEntitlementRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowEntitlementRequest, UpdateFlowEntitlementResult> asyncHandler) {
        final UpdateFlowEntitlementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowEntitlementResult>() {
            @Override
            public UpdateFlowEntitlementResult call() throws Exception {
                UpdateFlowEntitlementResult result = null;

                try {
                    result = executeUpdateFlowEntitlement(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowMediaStreamResult> updateFlowMediaStreamAsync(UpdateFlowMediaStreamRequest request) {

        return updateFlowMediaStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowMediaStreamResult> updateFlowMediaStreamAsync(final UpdateFlowMediaStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowMediaStreamRequest, UpdateFlowMediaStreamResult> asyncHandler) {
        final UpdateFlowMediaStreamRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowMediaStreamResult>() {
            @Override
            public UpdateFlowMediaStreamResult call() throws Exception {
                UpdateFlowMediaStreamResult result = null;

                try {
                    result = executeUpdateFlowMediaStream(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(UpdateFlowOutputRequest request) {

        return updateFlowOutputAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowOutputResult> updateFlowOutputAsync(final UpdateFlowOutputRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowOutputRequest, UpdateFlowOutputResult> asyncHandler) {
        final UpdateFlowOutputRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowOutputResult>() {
            @Override
            public UpdateFlowOutputResult call() throws Exception {
                UpdateFlowOutputResult result = null;

                try {
                    result = executeUpdateFlowOutput(finalRequest);
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
    public java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(UpdateFlowSourceRequest request) {

        return updateFlowSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFlowSourceResult> updateFlowSourceAsync(final UpdateFlowSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFlowSourceRequest, UpdateFlowSourceResult> asyncHandler) {
        final UpdateFlowSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFlowSourceResult>() {
            @Override
            public UpdateFlowSourceResult call() throws Exception {
                UpdateFlowSourceResult result = null;

                try {
                    result = executeUpdateFlowSource(finalRequest);
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
    public java.util.concurrent.Future<UpdateGatewayInstanceResult> updateGatewayInstanceAsync(UpdateGatewayInstanceRequest request) {

        return updateGatewayInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGatewayInstanceResult> updateGatewayInstanceAsync(final UpdateGatewayInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGatewayInstanceRequest, UpdateGatewayInstanceResult> asyncHandler) {
        final UpdateGatewayInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGatewayInstanceResult>() {
            @Override
            public UpdateGatewayInstanceResult call() throws Exception {
                UpdateGatewayInstanceResult result = null;

                try {
                    result = executeUpdateGatewayInstance(finalRequest);
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
