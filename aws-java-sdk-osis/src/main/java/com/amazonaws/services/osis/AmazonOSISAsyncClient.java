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
package com.amazonaws.services.osis;

import javax.annotation.Generated;

import com.amazonaws.services.osis.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon OpenSearch Ingestion asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Use the Amazon OpenSearch Ingestion API to create and manage ingestion pipelines. OpenSearch Ingestion is a fully
 * managed data collector that delivers real-time log and trace data to OpenSearch Service domains. For more
 * information, see <a
 * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ingestion.html">Getting data into your
 * cluster using OpenSearch Ingestion</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOSISAsyncClient extends AmazonOSISClient implements AmazonOSISAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonOSISAsyncClientBuilder asyncBuilder() {
        return AmazonOSISAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon OpenSearch Ingestion using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonOSISAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon OpenSearch Ingestion using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonOSISAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(CreatePipelineRequest request) {

        return createPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePipelineResult> createPipelineAsync(final CreatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePipelineRequest, CreatePipelineResult> asyncHandler) {
        final CreatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePipelineResult>() {
            @Override
            public CreatePipelineResult call() throws Exception {
                CreatePipelineResult result = null;

                try {
                    result = executeCreatePipeline(finalRequest);
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
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(DeletePipelineRequest request) {

        return deletePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePipelineResult> deletePipelineAsync(final DeletePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePipelineRequest, DeletePipelineResult> asyncHandler) {
        final DeletePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePipelineResult>() {
            @Override
            public DeletePipelineResult call() throws Exception {
                DeletePipelineResult result = null;

                try {
                    result = executeDeletePipeline(finalRequest);
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
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(GetPipelineRequest request) {

        return getPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineResult> getPipelineAsync(final GetPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPipelineRequest, GetPipelineResult> asyncHandler) {
        final GetPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPipelineResult>() {
            @Override
            public GetPipelineResult call() throws Exception {
                GetPipelineResult result = null;

                try {
                    result = executeGetPipeline(finalRequest);
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
    public java.util.concurrent.Future<GetPipelineBlueprintResult> getPipelineBlueprintAsync(GetPipelineBlueprintRequest request) {

        return getPipelineBlueprintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineBlueprintResult> getPipelineBlueprintAsync(final GetPipelineBlueprintRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPipelineBlueprintRequest, GetPipelineBlueprintResult> asyncHandler) {
        final GetPipelineBlueprintRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPipelineBlueprintResult>() {
            @Override
            public GetPipelineBlueprintResult call() throws Exception {
                GetPipelineBlueprintResult result = null;

                try {
                    result = executeGetPipelineBlueprint(finalRequest);
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
    public java.util.concurrent.Future<GetPipelineChangeProgressResult> getPipelineChangeProgressAsync(GetPipelineChangeProgressRequest request) {

        return getPipelineChangeProgressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPipelineChangeProgressResult> getPipelineChangeProgressAsync(final GetPipelineChangeProgressRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPipelineChangeProgressRequest, GetPipelineChangeProgressResult> asyncHandler) {
        final GetPipelineChangeProgressRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetPipelineChangeProgressResult>() {
            @Override
            public GetPipelineChangeProgressResult call() throws Exception {
                GetPipelineChangeProgressResult result = null;

                try {
                    result = executeGetPipelineChangeProgress(finalRequest);
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
    public java.util.concurrent.Future<ListPipelineBlueprintsResult> listPipelineBlueprintsAsync(ListPipelineBlueprintsRequest request) {

        return listPipelineBlueprintsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelineBlueprintsResult> listPipelineBlueprintsAsync(final ListPipelineBlueprintsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelineBlueprintsRequest, ListPipelineBlueprintsResult> asyncHandler) {
        final ListPipelineBlueprintsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelineBlueprintsResult>() {
            @Override
            public ListPipelineBlueprintsResult call() throws Exception {
                ListPipelineBlueprintsResult result = null;

                try {
                    result = executeListPipelineBlueprints(finalRequest);
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
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(ListPipelinesRequest request) {

        return listPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPipelinesResult> listPipelinesAsync(final ListPipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPipelinesRequest, ListPipelinesResult> asyncHandler) {
        final ListPipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPipelinesResult>() {
            @Override
            public ListPipelinesResult call() throws Exception {
                ListPipelinesResult result = null;

                try {
                    result = executeListPipelines(finalRequest);
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
    public java.util.concurrent.Future<StartPipelineResult> startPipelineAsync(StartPipelineRequest request) {

        return startPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartPipelineResult> startPipelineAsync(final StartPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartPipelineRequest, StartPipelineResult> asyncHandler) {
        final StartPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartPipelineResult>() {
            @Override
            public StartPipelineResult call() throws Exception {
                StartPipelineResult result = null;

                try {
                    result = executeStartPipeline(finalRequest);
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
    public java.util.concurrent.Future<StopPipelineResult> stopPipelineAsync(StopPipelineRequest request) {

        return stopPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopPipelineResult> stopPipelineAsync(final StopPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopPipelineRequest, StopPipelineResult> asyncHandler) {
        final StopPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopPipelineResult>() {
            @Override
            public StopPipelineResult call() throws Exception {
                StopPipelineResult result = null;

                try {
                    result = executeStopPipeline(finalRequest);
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
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(UpdatePipelineRequest request) {

        return updatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdatePipelineResult> updatePipelineAsync(final UpdatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResult> asyncHandler) {
        final UpdatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdatePipelineResult>() {
            @Override
            public UpdatePipelineResult call() throws Exception {
                UpdatePipelineResult result = null;

                try {
                    result = executeUpdatePipeline(finalRequest);
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
    public java.util.concurrent.Future<ValidatePipelineResult> validatePipelineAsync(ValidatePipelineRequest request) {

        return validatePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidatePipelineResult> validatePipelineAsync(final ValidatePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidatePipelineRequest, ValidatePipelineResult> asyncHandler) {
        final ValidatePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidatePipelineResult>() {
            @Override
            public ValidatePipelineResult call() throws Exception {
                ValidatePipelineResult result = null;

                try {
                    result = executeValidatePipeline(finalRequest);
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
