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
package com.amazonaws.services.sagemakergeospatial;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon SageMaker geospatial capabilities asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing SageMaker geospatial resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonSageMakerGeospatialAsyncClient extends AmazonSageMakerGeospatialClient implements AmazonSageMakerGeospatialAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonSageMakerGeospatialAsyncClientBuilder asyncBuilder() {
        return AmazonSageMakerGeospatialAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SageMaker geospatial capabilities using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonSageMakerGeospatialAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon SageMaker geospatial capabilities using
     * the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonSageMakerGeospatialAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteEarthObservationJobResult> deleteEarthObservationJobAsync(DeleteEarthObservationJobRequest request) {

        return deleteEarthObservationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEarthObservationJobResult> deleteEarthObservationJobAsync(final DeleteEarthObservationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEarthObservationJobRequest, DeleteEarthObservationJobResult> asyncHandler) {
        final DeleteEarthObservationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEarthObservationJobResult>() {
            @Override
            public DeleteEarthObservationJobResult call() throws Exception {
                DeleteEarthObservationJobResult result = null;

                try {
                    result = executeDeleteEarthObservationJob(finalRequest);
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
    public java.util.concurrent.Future<DeleteVectorEnrichmentJobResult> deleteVectorEnrichmentJobAsync(DeleteVectorEnrichmentJobRequest request) {

        return deleteVectorEnrichmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVectorEnrichmentJobResult> deleteVectorEnrichmentJobAsync(final DeleteVectorEnrichmentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVectorEnrichmentJobRequest, DeleteVectorEnrichmentJobResult> asyncHandler) {
        final DeleteVectorEnrichmentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVectorEnrichmentJobResult>() {
            @Override
            public DeleteVectorEnrichmentJobResult call() throws Exception {
                DeleteVectorEnrichmentJobResult result = null;

                try {
                    result = executeDeleteVectorEnrichmentJob(finalRequest);
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
    public java.util.concurrent.Future<ExportEarthObservationJobResult> exportEarthObservationJobAsync(ExportEarthObservationJobRequest request) {

        return exportEarthObservationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportEarthObservationJobResult> exportEarthObservationJobAsync(final ExportEarthObservationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportEarthObservationJobRequest, ExportEarthObservationJobResult> asyncHandler) {
        final ExportEarthObservationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportEarthObservationJobResult>() {
            @Override
            public ExportEarthObservationJobResult call() throws Exception {
                ExportEarthObservationJobResult result = null;

                try {
                    result = executeExportEarthObservationJob(finalRequest);
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
    public java.util.concurrent.Future<ExportVectorEnrichmentJobResult> exportVectorEnrichmentJobAsync(ExportVectorEnrichmentJobRequest request) {

        return exportVectorEnrichmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportVectorEnrichmentJobResult> exportVectorEnrichmentJobAsync(final ExportVectorEnrichmentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportVectorEnrichmentJobRequest, ExportVectorEnrichmentJobResult> asyncHandler) {
        final ExportVectorEnrichmentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportVectorEnrichmentJobResult>() {
            @Override
            public ExportVectorEnrichmentJobResult call() throws Exception {
                ExportVectorEnrichmentJobResult result = null;

                try {
                    result = executeExportVectorEnrichmentJob(finalRequest);
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
    public java.util.concurrent.Future<GetEarthObservationJobResult> getEarthObservationJobAsync(GetEarthObservationJobRequest request) {

        return getEarthObservationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEarthObservationJobResult> getEarthObservationJobAsync(final GetEarthObservationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEarthObservationJobRequest, GetEarthObservationJobResult> asyncHandler) {
        final GetEarthObservationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEarthObservationJobResult>() {
            @Override
            public GetEarthObservationJobResult call() throws Exception {
                GetEarthObservationJobResult result = null;

                try {
                    result = executeGetEarthObservationJob(finalRequest);
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
    public java.util.concurrent.Future<GetRasterDataCollectionResult> getRasterDataCollectionAsync(GetRasterDataCollectionRequest request) {

        return getRasterDataCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRasterDataCollectionResult> getRasterDataCollectionAsync(final GetRasterDataCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRasterDataCollectionRequest, GetRasterDataCollectionResult> asyncHandler) {
        final GetRasterDataCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRasterDataCollectionResult>() {
            @Override
            public GetRasterDataCollectionResult call() throws Exception {
                GetRasterDataCollectionResult result = null;

                try {
                    result = executeGetRasterDataCollection(finalRequest);
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
    public java.util.concurrent.Future<GetTileResult> getTileAsync(GetTileRequest request) {

        return getTileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTileResult> getTileAsync(final GetTileRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTileRequest, GetTileResult> asyncHandler) {
        final GetTileRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTileResult>() {
            @Override
            public GetTileResult call() throws Exception {
                GetTileResult result = null;

                try {
                    result = executeGetTile(finalRequest);
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
    public java.util.concurrent.Future<GetVectorEnrichmentJobResult> getVectorEnrichmentJobAsync(GetVectorEnrichmentJobRequest request) {

        return getVectorEnrichmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVectorEnrichmentJobResult> getVectorEnrichmentJobAsync(final GetVectorEnrichmentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVectorEnrichmentJobRequest, GetVectorEnrichmentJobResult> asyncHandler) {
        final GetVectorEnrichmentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVectorEnrichmentJobResult>() {
            @Override
            public GetVectorEnrichmentJobResult call() throws Exception {
                GetVectorEnrichmentJobResult result = null;

                try {
                    result = executeGetVectorEnrichmentJob(finalRequest);
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
    public java.util.concurrent.Future<ListEarthObservationJobsResult> listEarthObservationJobsAsync(ListEarthObservationJobsRequest request) {

        return listEarthObservationJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEarthObservationJobsResult> listEarthObservationJobsAsync(final ListEarthObservationJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEarthObservationJobsRequest, ListEarthObservationJobsResult> asyncHandler) {
        final ListEarthObservationJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEarthObservationJobsResult>() {
            @Override
            public ListEarthObservationJobsResult call() throws Exception {
                ListEarthObservationJobsResult result = null;

                try {
                    result = executeListEarthObservationJobs(finalRequest);
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
    public java.util.concurrent.Future<ListRasterDataCollectionsResult> listRasterDataCollectionsAsync(ListRasterDataCollectionsRequest request) {

        return listRasterDataCollectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRasterDataCollectionsResult> listRasterDataCollectionsAsync(final ListRasterDataCollectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRasterDataCollectionsRequest, ListRasterDataCollectionsResult> asyncHandler) {
        final ListRasterDataCollectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRasterDataCollectionsResult>() {
            @Override
            public ListRasterDataCollectionsResult call() throws Exception {
                ListRasterDataCollectionsResult result = null;

                try {
                    result = executeListRasterDataCollections(finalRequest);
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
    public java.util.concurrent.Future<ListVectorEnrichmentJobsResult> listVectorEnrichmentJobsAsync(ListVectorEnrichmentJobsRequest request) {

        return listVectorEnrichmentJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVectorEnrichmentJobsResult> listVectorEnrichmentJobsAsync(final ListVectorEnrichmentJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListVectorEnrichmentJobsRequest, ListVectorEnrichmentJobsResult> asyncHandler) {
        final ListVectorEnrichmentJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListVectorEnrichmentJobsResult>() {
            @Override
            public ListVectorEnrichmentJobsResult call() throws Exception {
                ListVectorEnrichmentJobsResult result = null;

                try {
                    result = executeListVectorEnrichmentJobs(finalRequest);
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
    public java.util.concurrent.Future<SearchRasterDataCollectionResult> searchRasterDataCollectionAsync(SearchRasterDataCollectionRequest request) {

        return searchRasterDataCollectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchRasterDataCollectionResult> searchRasterDataCollectionAsync(final SearchRasterDataCollectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchRasterDataCollectionRequest, SearchRasterDataCollectionResult> asyncHandler) {
        final SearchRasterDataCollectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchRasterDataCollectionResult>() {
            @Override
            public SearchRasterDataCollectionResult call() throws Exception {
                SearchRasterDataCollectionResult result = null;

                try {
                    result = executeSearchRasterDataCollection(finalRequest);
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
    public java.util.concurrent.Future<StartEarthObservationJobResult> startEarthObservationJobAsync(StartEarthObservationJobRequest request) {

        return startEarthObservationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartEarthObservationJobResult> startEarthObservationJobAsync(final StartEarthObservationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartEarthObservationJobRequest, StartEarthObservationJobResult> asyncHandler) {
        final StartEarthObservationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartEarthObservationJobResult>() {
            @Override
            public StartEarthObservationJobResult call() throws Exception {
                StartEarthObservationJobResult result = null;

                try {
                    result = executeStartEarthObservationJob(finalRequest);
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
    public java.util.concurrent.Future<StartVectorEnrichmentJobResult> startVectorEnrichmentJobAsync(StartVectorEnrichmentJobRequest request) {

        return startVectorEnrichmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartVectorEnrichmentJobResult> startVectorEnrichmentJobAsync(final StartVectorEnrichmentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartVectorEnrichmentJobRequest, StartVectorEnrichmentJobResult> asyncHandler) {
        final StartVectorEnrichmentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartVectorEnrichmentJobResult>() {
            @Override
            public StartVectorEnrichmentJobResult call() throws Exception {
                StartVectorEnrichmentJobResult result = null;

                try {
                    result = executeStartVectorEnrichmentJob(finalRequest);
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
    public java.util.concurrent.Future<StopEarthObservationJobResult> stopEarthObservationJobAsync(StopEarthObservationJobRequest request) {

        return stopEarthObservationJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopEarthObservationJobResult> stopEarthObservationJobAsync(final StopEarthObservationJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopEarthObservationJobRequest, StopEarthObservationJobResult> asyncHandler) {
        final StopEarthObservationJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopEarthObservationJobResult>() {
            @Override
            public StopEarthObservationJobResult call() throws Exception {
                StopEarthObservationJobResult result = null;

                try {
                    result = executeStopEarthObservationJob(finalRequest);
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
    public java.util.concurrent.Future<StopVectorEnrichmentJobResult> stopVectorEnrichmentJobAsync(StopVectorEnrichmentJobRequest request) {

        return stopVectorEnrichmentJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopVectorEnrichmentJobResult> stopVectorEnrichmentJobAsync(final StopVectorEnrichmentJobRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopVectorEnrichmentJobRequest, StopVectorEnrichmentJobResult> asyncHandler) {
        final StopVectorEnrichmentJobRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopVectorEnrichmentJobResult>() {
            @Override
            public StopVectorEnrichmentJobResult call() throws Exception {
                StopVectorEnrichmentJobResult result = null;

                try {
                    result = executeStopVectorEnrichmentJob(finalRequest);
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
