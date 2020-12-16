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
package com.amazonaws.services.location;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Location Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Suite of geospatial services including Maps, Places, Tracking, and Geofencing
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLocationAsyncClient extends AmazonLocationClient implements AmazonLocationAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonLocationAsyncClientBuilder asyncBuilder() {
        return AmazonLocationAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Location Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonLocationAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Location Service using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonLocationAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<AssociateTrackerConsumerResult> associateTrackerConsumerAsync(AssociateTrackerConsumerRequest request) {

        return associateTrackerConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateTrackerConsumerResult> associateTrackerConsumerAsync(final AssociateTrackerConsumerRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateTrackerConsumerRequest, AssociateTrackerConsumerResult> asyncHandler) {
        final AssociateTrackerConsumerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateTrackerConsumerResult>() {
            @Override
            public AssociateTrackerConsumerResult call() throws Exception {
                AssociateTrackerConsumerResult result = null;

                try {
                    result = executeAssociateTrackerConsumer(finalRequest);
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
    public java.util.concurrent.Future<BatchDeleteGeofenceResult> batchDeleteGeofenceAsync(BatchDeleteGeofenceRequest request) {

        return batchDeleteGeofenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteGeofenceResult> batchDeleteGeofenceAsync(final BatchDeleteGeofenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteGeofenceRequest, BatchDeleteGeofenceResult> asyncHandler) {
        final BatchDeleteGeofenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteGeofenceResult>() {
            @Override
            public BatchDeleteGeofenceResult call() throws Exception {
                BatchDeleteGeofenceResult result = null;

                try {
                    result = executeBatchDeleteGeofence(finalRequest);
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
    public java.util.concurrent.Future<BatchEvaluateGeofencesResult> batchEvaluateGeofencesAsync(BatchEvaluateGeofencesRequest request) {

        return batchEvaluateGeofencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchEvaluateGeofencesResult> batchEvaluateGeofencesAsync(final BatchEvaluateGeofencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchEvaluateGeofencesRequest, BatchEvaluateGeofencesResult> asyncHandler) {
        final BatchEvaluateGeofencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchEvaluateGeofencesResult>() {
            @Override
            public BatchEvaluateGeofencesResult call() throws Exception {
                BatchEvaluateGeofencesResult result = null;

                try {
                    result = executeBatchEvaluateGeofences(finalRequest);
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
    public java.util.concurrent.Future<BatchGetDevicePositionResult> batchGetDevicePositionAsync(BatchGetDevicePositionRequest request) {

        return batchGetDevicePositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetDevicePositionResult> batchGetDevicePositionAsync(final BatchGetDevicePositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetDevicePositionRequest, BatchGetDevicePositionResult> asyncHandler) {
        final BatchGetDevicePositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetDevicePositionResult>() {
            @Override
            public BatchGetDevicePositionResult call() throws Exception {
                BatchGetDevicePositionResult result = null;

                try {
                    result = executeBatchGetDevicePosition(finalRequest);
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
    public java.util.concurrent.Future<BatchPutGeofenceResult> batchPutGeofenceAsync(BatchPutGeofenceRequest request) {

        return batchPutGeofenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchPutGeofenceResult> batchPutGeofenceAsync(final BatchPutGeofenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchPutGeofenceRequest, BatchPutGeofenceResult> asyncHandler) {
        final BatchPutGeofenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchPutGeofenceResult>() {
            @Override
            public BatchPutGeofenceResult call() throws Exception {
                BatchPutGeofenceResult result = null;

                try {
                    result = executeBatchPutGeofence(finalRequest);
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
    public java.util.concurrent.Future<BatchUpdateDevicePositionResult> batchUpdateDevicePositionAsync(BatchUpdateDevicePositionRequest request) {

        return batchUpdateDevicePositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateDevicePositionResult> batchUpdateDevicePositionAsync(final BatchUpdateDevicePositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateDevicePositionRequest, BatchUpdateDevicePositionResult> asyncHandler) {
        final BatchUpdateDevicePositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateDevicePositionResult>() {
            @Override
            public BatchUpdateDevicePositionResult call() throws Exception {
                BatchUpdateDevicePositionResult result = null;

                try {
                    result = executeBatchUpdateDevicePosition(finalRequest);
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
    public java.util.concurrent.Future<CreateGeofenceCollectionResult> createGeofenceCollectionAsync(CreateGeofenceCollectionRequest request) {

        return createGeofenceCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGeofenceCollectionResult> createGeofenceCollectionAsync(final CreateGeofenceCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGeofenceCollectionRequest, CreateGeofenceCollectionResult> asyncHandler) {
        final CreateGeofenceCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGeofenceCollectionResult>() {
            @Override
            public CreateGeofenceCollectionResult call() throws Exception {
                CreateGeofenceCollectionResult result = null;

                try {
                    result = executeCreateGeofenceCollection(finalRequest);
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
    public java.util.concurrent.Future<CreateMapResult> createMapAsync(CreateMapRequest request) {

        return createMapAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMapResult> createMapAsync(final CreateMapRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMapRequest, CreateMapResult> asyncHandler) {
        final CreateMapRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMapResult>() {
            @Override
            public CreateMapResult call() throws Exception {
                CreateMapResult result = null;

                try {
                    result = executeCreateMap(finalRequest);
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
    public java.util.concurrent.Future<CreatePlaceIndexResult> createPlaceIndexAsync(CreatePlaceIndexRequest request) {

        return createPlaceIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlaceIndexResult> createPlaceIndexAsync(final CreatePlaceIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlaceIndexRequest, CreatePlaceIndexResult> asyncHandler) {
        final CreatePlaceIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlaceIndexResult>() {
            @Override
            public CreatePlaceIndexResult call() throws Exception {
                CreatePlaceIndexResult result = null;

                try {
                    result = executeCreatePlaceIndex(finalRequest);
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
    public java.util.concurrent.Future<CreateTrackerResult> createTrackerAsync(CreateTrackerRequest request) {

        return createTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrackerResult> createTrackerAsync(final CreateTrackerRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrackerRequest, CreateTrackerResult> asyncHandler) {
        final CreateTrackerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrackerResult>() {
            @Override
            public CreateTrackerResult call() throws Exception {
                CreateTrackerResult result = null;

                try {
                    result = executeCreateTracker(finalRequest);
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
    public java.util.concurrent.Future<DeleteGeofenceCollectionResult> deleteGeofenceCollectionAsync(DeleteGeofenceCollectionRequest request) {

        return deleteGeofenceCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGeofenceCollectionResult> deleteGeofenceCollectionAsync(final DeleteGeofenceCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGeofenceCollectionRequest, DeleteGeofenceCollectionResult> asyncHandler) {
        final DeleteGeofenceCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGeofenceCollectionResult>() {
            @Override
            public DeleteGeofenceCollectionResult call() throws Exception {
                DeleteGeofenceCollectionResult result = null;

                try {
                    result = executeDeleteGeofenceCollection(finalRequest);
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
    public java.util.concurrent.Future<DeleteMapResult> deleteMapAsync(DeleteMapRequest request) {

        return deleteMapAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMapResult> deleteMapAsync(final DeleteMapRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMapRequest, DeleteMapResult> asyncHandler) {
        final DeleteMapRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMapResult>() {
            @Override
            public DeleteMapResult call() throws Exception {
                DeleteMapResult result = null;

                try {
                    result = executeDeleteMap(finalRequest);
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
    public java.util.concurrent.Future<DeletePlaceIndexResult> deletePlaceIndexAsync(DeletePlaceIndexRequest request) {

        return deletePlaceIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePlaceIndexResult> deletePlaceIndexAsync(final DeletePlaceIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlaceIndexRequest, DeletePlaceIndexResult> asyncHandler) {
        final DeletePlaceIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePlaceIndexResult>() {
            @Override
            public DeletePlaceIndexResult call() throws Exception {
                DeletePlaceIndexResult result = null;

                try {
                    result = executeDeletePlaceIndex(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrackerResult> deleteTrackerAsync(DeleteTrackerRequest request) {

        return deleteTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrackerResult> deleteTrackerAsync(final DeleteTrackerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrackerRequest, DeleteTrackerResult> asyncHandler) {
        final DeleteTrackerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrackerResult>() {
            @Override
            public DeleteTrackerResult call() throws Exception {
                DeleteTrackerResult result = null;

                try {
                    result = executeDeleteTracker(finalRequest);
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
    public java.util.concurrent.Future<DescribeGeofenceCollectionResult> describeGeofenceCollectionAsync(DescribeGeofenceCollectionRequest request) {

        return describeGeofenceCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGeofenceCollectionResult> describeGeofenceCollectionAsync(final DescribeGeofenceCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGeofenceCollectionRequest, DescribeGeofenceCollectionResult> asyncHandler) {
        final DescribeGeofenceCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGeofenceCollectionResult>() {
            @Override
            public DescribeGeofenceCollectionResult call() throws Exception {
                DescribeGeofenceCollectionResult result = null;

                try {
                    result = executeDescribeGeofenceCollection(finalRequest);
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
    public java.util.concurrent.Future<DescribeMapResult> describeMapAsync(DescribeMapRequest request) {

        return describeMapAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMapResult> describeMapAsync(final DescribeMapRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMapRequest, DescribeMapResult> asyncHandler) {
        final DescribeMapRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMapResult>() {
            @Override
            public DescribeMapResult call() throws Exception {
                DescribeMapResult result = null;

                try {
                    result = executeDescribeMap(finalRequest);
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
    public java.util.concurrent.Future<DescribePlaceIndexResult> describePlaceIndexAsync(DescribePlaceIndexRequest request) {

        return describePlaceIndexAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePlaceIndexResult> describePlaceIndexAsync(final DescribePlaceIndexRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePlaceIndexRequest, DescribePlaceIndexResult> asyncHandler) {
        final DescribePlaceIndexRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePlaceIndexResult>() {
            @Override
            public DescribePlaceIndexResult call() throws Exception {
                DescribePlaceIndexResult result = null;

                try {
                    result = executeDescribePlaceIndex(finalRequest);
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
    public java.util.concurrent.Future<DescribeTrackerResult> describeTrackerAsync(DescribeTrackerRequest request) {

        return describeTrackerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrackerResult> describeTrackerAsync(final DescribeTrackerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTrackerRequest, DescribeTrackerResult> asyncHandler) {
        final DescribeTrackerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeTrackerResult>() {
            @Override
            public DescribeTrackerResult call() throws Exception {
                DescribeTrackerResult result = null;

                try {
                    result = executeDescribeTracker(finalRequest);
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
    public java.util.concurrent.Future<DisassociateTrackerConsumerResult> disassociateTrackerConsumerAsync(DisassociateTrackerConsumerRequest request) {

        return disassociateTrackerConsumerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateTrackerConsumerResult> disassociateTrackerConsumerAsync(final DisassociateTrackerConsumerRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateTrackerConsumerRequest, DisassociateTrackerConsumerResult> asyncHandler) {
        final DisassociateTrackerConsumerRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateTrackerConsumerResult>() {
            @Override
            public DisassociateTrackerConsumerResult call() throws Exception {
                DisassociateTrackerConsumerResult result = null;

                try {
                    result = executeDisassociateTrackerConsumer(finalRequest);
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
    public java.util.concurrent.Future<GetDevicePositionResult> getDevicePositionAsync(GetDevicePositionRequest request) {

        return getDevicePositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePositionResult> getDevicePositionAsync(final GetDevicePositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePositionRequest, GetDevicePositionResult> asyncHandler) {
        final GetDevicePositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevicePositionResult>() {
            @Override
            public GetDevicePositionResult call() throws Exception {
                GetDevicePositionResult result = null;

                try {
                    result = executeGetDevicePosition(finalRequest);
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
    public java.util.concurrent.Future<GetDevicePositionHistoryResult> getDevicePositionHistoryAsync(GetDevicePositionHistoryRequest request) {

        return getDevicePositionHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDevicePositionHistoryResult> getDevicePositionHistoryAsync(final GetDevicePositionHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetDevicePositionHistoryRequest, GetDevicePositionHistoryResult> asyncHandler) {
        final GetDevicePositionHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetDevicePositionHistoryResult>() {
            @Override
            public GetDevicePositionHistoryResult call() throws Exception {
                GetDevicePositionHistoryResult result = null;

                try {
                    result = executeGetDevicePositionHistory(finalRequest);
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
    public java.util.concurrent.Future<GetGeofenceResult> getGeofenceAsync(GetGeofenceRequest request) {

        return getGeofenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGeofenceResult> getGeofenceAsync(final GetGeofenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGeofenceRequest, GetGeofenceResult> asyncHandler) {
        final GetGeofenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGeofenceResult>() {
            @Override
            public GetGeofenceResult call() throws Exception {
                GetGeofenceResult result = null;

                try {
                    result = executeGetGeofence(finalRequest);
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
    public java.util.concurrent.Future<GetMapGlyphsResult> getMapGlyphsAsync(GetMapGlyphsRequest request) {

        return getMapGlyphsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMapGlyphsResult> getMapGlyphsAsync(final GetMapGlyphsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMapGlyphsRequest, GetMapGlyphsResult> asyncHandler) {
        final GetMapGlyphsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMapGlyphsResult>() {
            @Override
            public GetMapGlyphsResult call() throws Exception {
                GetMapGlyphsResult result = null;

                try {
                    result = executeGetMapGlyphs(finalRequest);
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
    public java.util.concurrent.Future<GetMapSpritesResult> getMapSpritesAsync(GetMapSpritesRequest request) {

        return getMapSpritesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMapSpritesResult> getMapSpritesAsync(final GetMapSpritesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMapSpritesRequest, GetMapSpritesResult> asyncHandler) {
        final GetMapSpritesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMapSpritesResult>() {
            @Override
            public GetMapSpritesResult call() throws Exception {
                GetMapSpritesResult result = null;

                try {
                    result = executeGetMapSprites(finalRequest);
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
    public java.util.concurrent.Future<GetMapStyleDescriptorResult> getMapStyleDescriptorAsync(GetMapStyleDescriptorRequest request) {

        return getMapStyleDescriptorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMapStyleDescriptorResult> getMapStyleDescriptorAsync(final GetMapStyleDescriptorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMapStyleDescriptorRequest, GetMapStyleDescriptorResult> asyncHandler) {
        final GetMapStyleDescriptorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMapStyleDescriptorResult>() {
            @Override
            public GetMapStyleDescriptorResult call() throws Exception {
                GetMapStyleDescriptorResult result = null;

                try {
                    result = executeGetMapStyleDescriptor(finalRequest);
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
    public java.util.concurrent.Future<GetMapTileResult> getMapTileAsync(GetMapTileRequest request) {

        return getMapTileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMapTileResult> getMapTileAsync(final GetMapTileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMapTileRequest, GetMapTileResult> asyncHandler) {
        final GetMapTileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMapTileResult>() {
            @Override
            public GetMapTileResult call() throws Exception {
                GetMapTileResult result = null;

                try {
                    result = executeGetMapTile(finalRequest);
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
    public java.util.concurrent.Future<ListGeofenceCollectionsResult> listGeofenceCollectionsAsync(ListGeofenceCollectionsRequest request) {

        return listGeofenceCollectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGeofenceCollectionsResult> listGeofenceCollectionsAsync(final ListGeofenceCollectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGeofenceCollectionsRequest, ListGeofenceCollectionsResult> asyncHandler) {
        final ListGeofenceCollectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGeofenceCollectionsResult>() {
            @Override
            public ListGeofenceCollectionsResult call() throws Exception {
                ListGeofenceCollectionsResult result = null;

                try {
                    result = executeListGeofenceCollections(finalRequest);
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
    public java.util.concurrent.Future<ListGeofencesResult> listGeofencesAsync(ListGeofencesRequest request) {

        return listGeofencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGeofencesResult> listGeofencesAsync(final ListGeofencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGeofencesRequest, ListGeofencesResult> asyncHandler) {
        final ListGeofencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListGeofencesResult>() {
            @Override
            public ListGeofencesResult call() throws Exception {
                ListGeofencesResult result = null;

                try {
                    result = executeListGeofences(finalRequest);
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
    public java.util.concurrent.Future<ListMapsResult> listMapsAsync(ListMapsRequest request) {

        return listMapsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMapsResult> listMapsAsync(final ListMapsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMapsRequest, ListMapsResult> asyncHandler) {
        final ListMapsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMapsResult>() {
            @Override
            public ListMapsResult call() throws Exception {
                ListMapsResult result = null;

                try {
                    result = executeListMaps(finalRequest);
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
    public java.util.concurrent.Future<ListPlaceIndexesResult> listPlaceIndexesAsync(ListPlaceIndexesRequest request) {

        return listPlaceIndexesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlaceIndexesResult> listPlaceIndexesAsync(final ListPlaceIndexesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlaceIndexesRequest, ListPlaceIndexesResult> asyncHandler) {
        final ListPlaceIndexesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPlaceIndexesResult>() {
            @Override
            public ListPlaceIndexesResult call() throws Exception {
                ListPlaceIndexesResult result = null;

                try {
                    result = executeListPlaceIndexes(finalRequest);
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
    public java.util.concurrent.Future<ListTrackerConsumersResult> listTrackerConsumersAsync(ListTrackerConsumersRequest request) {

        return listTrackerConsumersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrackerConsumersResult> listTrackerConsumersAsync(final ListTrackerConsumersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrackerConsumersRequest, ListTrackerConsumersResult> asyncHandler) {
        final ListTrackerConsumersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrackerConsumersResult>() {
            @Override
            public ListTrackerConsumersResult call() throws Exception {
                ListTrackerConsumersResult result = null;

                try {
                    result = executeListTrackerConsumers(finalRequest);
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
    public java.util.concurrent.Future<ListTrackersResult> listTrackersAsync(ListTrackersRequest request) {

        return listTrackersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrackersResult> listTrackersAsync(final ListTrackersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrackersRequest, ListTrackersResult> asyncHandler) {
        final ListTrackersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrackersResult>() {
            @Override
            public ListTrackersResult call() throws Exception {
                ListTrackersResult result = null;

                try {
                    result = executeListTrackers(finalRequest);
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
    public java.util.concurrent.Future<PutGeofenceResult> putGeofenceAsync(PutGeofenceRequest request) {

        return putGeofenceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutGeofenceResult> putGeofenceAsync(final PutGeofenceRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutGeofenceRequest, PutGeofenceResult> asyncHandler) {
        final PutGeofenceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutGeofenceResult>() {
            @Override
            public PutGeofenceResult call() throws Exception {
                PutGeofenceResult result = null;

                try {
                    result = executePutGeofence(finalRequest);
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
    public java.util.concurrent.Future<SearchPlaceIndexForPositionResult> searchPlaceIndexForPositionAsync(SearchPlaceIndexForPositionRequest request) {

        return searchPlaceIndexForPositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchPlaceIndexForPositionResult> searchPlaceIndexForPositionAsync(final SearchPlaceIndexForPositionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchPlaceIndexForPositionRequest, SearchPlaceIndexForPositionResult> asyncHandler) {
        final SearchPlaceIndexForPositionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchPlaceIndexForPositionResult>() {
            @Override
            public SearchPlaceIndexForPositionResult call() throws Exception {
                SearchPlaceIndexForPositionResult result = null;

                try {
                    result = executeSearchPlaceIndexForPosition(finalRequest);
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
    public java.util.concurrent.Future<SearchPlaceIndexForTextResult> searchPlaceIndexForTextAsync(SearchPlaceIndexForTextRequest request) {

        return searchPlaceIndexForTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchPlaceIndexForTextResult> searchPlaceIndexForTextAsync(final SearchPlaceIndexForTextRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchPlaceIndexForTextRequest, SearchPlaceIndexForTextResult> asyncHandler) {
        final SearchPlaceIndexForTextRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchPlaceIndexForTextResult>() {
            @Override
            public SearchPlaceIndexForTextResult call() throws Exception {
                SearchPlaceIndexForTextResult result = null;

                try {
                    result = executeSearchPlaceIndexForText(finalRequest);
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
