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
package com.amazonaws.services.chimesdkmediapipelines;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmediapipelines.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Chime SDK Media Pipelines asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * The Amazon Chime SDK media pipeline APIs in this section allow software developers to create Amazon Chime SDK media
 * pipelines that capture, concatenate, or stream your Amazon Chime SDK meetings. For more information about media
 * pipleines, see <a
 * href="http://amazonaws.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Media_Pipelines.html">Amazon
 * Chime SDK media pipelines</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonChimeSDKMediaPipelinesAsyncClient extends AmazonChimeSDKMediaPipelinesClient implements AmazonChimeSDKMediaPipelinesAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonChimeSDKMediaPipelinesAsyncClientBuilder asyncBuilder() {
        return AmazonChimeSDKMediaPipelinesAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Media Pipelines using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonChimeSDKMediaPipelinesAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Chime SDK Media Pipelines using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonChimeSDKMediaPipelinesAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(CreateMediaCapturePipelineRequest request) {

        return createMediaCapturePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(final CreateMediaCapturePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMediaCapturePipelineRequest, CreateMediaCapturePipelineResult> asyncHandler) {
        final CreateMediaCapturePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMediaCapturePipelineResult>() {
            @Override
            public CreateMediaCapturePipelineResult call() throws Exception {
                CreateMediaCapturePipelineResult result = null;

                try {
                    result = executeCreateMediaCapturePipeline(finalRequest);
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
    public java.util.concurrent.Future<CreateMediaConcatenationPipelineResult> createMediaConcatenationPipelineAsync(
            CreateMediaConcatenationPipelineRequest request) {

        return createMediaConcatenationPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaConcatenationPipelineResult> createMediaConcatenationPipelineAsync(
            final CreateMediaConcatenationPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMediaConcatenationPipelineRequest, CreateMediaConcatenationPipelineResult> asyncHandler) {
        final CreateMediaConcatenationPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMediaConcatenationPipelineResult>() {
            @Override
            public CreateMediaConcatenationPipelineResult call() throws Exception {
                CreateMediaConcatenationPipelineResult result = null;

                try {
                    result = executeCreateMediaConcatenationPipeline(finalRequest);
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
    public java.util.concurrent.Future<CreateMediaLiveConnectorPipelineResult> createMediaLiveConnectorPipelineAsync(
            CreateMediaLiveConnectorPipelineRequest request) {

        return createMediaLiveConnectorPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaLiveConnectorPipelineResult> createMediaLiveConnectorPipelineAsync(
            final CreateMediaLiveConnectorPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMediaLiveConnectorPipelineRequest, CreateMediaLiveConnectorPipelineResult> asyncHandler) {
        final CreateMediaLiveConnectorPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMediaLiveConnectorPipelineResult>() {
            @Override
            public CreateMediaLiveConnectorPipelineResult call() throws Exception {
                CreateMediaLiveConnectorPipelineResult result = null;

                try {
                    result = executeCreateMediaLiveConnectorPipeline(finalRequest);
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
    public java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(DeleteMediaCapturePipelineRequest request) {

        return deleteMediaCapturePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(final DeleteMediaCapturePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMediaCapturePipelineRequest, DeleteMediaCapturePipelineResult> asyncHandler) {
        final DeleteMediaCapturePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMediaCapturePipelineResult>() {
            @Override
            public DeleteMediaCapturePipelineResult call() throws Exception {
                DeleteMediaCapturePipelineResult result = null;

                try {
                    result = executeDeleteMediaCapturePipeline(finalRequest);
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
    public java.util.concurrent.Future<DeleteMediaPipelineResult> deleteMediaPipelineAsync(DeleteMediaPipelineRequest request) {

        return deleteMediaPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaPipelineResult> deleteMediaPipelineAsync(final DeleteMediaPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMediaPipelineRequest, DeleteMediaPipelineResult> asyncHandler) {
        final DeleteMediaPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMediaPipelineResult>() {
            @Override
            public DeleteMediaPipelineResult call() throws Exception {
                DeleteMediaPipelineResult result = null;

                try {
                    result = executeDeleteMediaPipeline(finalRequest);
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
    public java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest request) {

        return getMediaCapturePipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(final GetMediaCapturePipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMediaCapturePipelineRequest, GetMediaCapturePipelineResult> asyncHandler) {
        final GetMediaCapturePipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMediaCapturePipelineResult>() {
            @Override
            public GetMediaCapturePipelineResult call() throws Exception {
                GetMediaCapturePipelineResult result = null;

                try {
                    result = executeGetMediaCapturePipeline(finalRequest);
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
    public java.util.concurrent.Future<GetMediaPipelineResult> getMediaPipelineAsync(GetMediaPipelineRequest request) {

        return getMediaPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMediaPipelineResult> getMediaPipelineAsync(final GetMediaPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMediaPipelineRequest, GetMediaPipelineResult> asyncHandler) {
        final GetMediaPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMediaPipelineResult>() {
            @Override
            public GetMediaPipelineResult call() throws Exception {
                GetMediaPipelineResult result = null;

                try {
                    result = executeGetMediaPipeline(finalRequest);
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
    public java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(ListMediaCapturePipelinesRequest request) {

        return listMediaCapturePipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(final ListMediaCapturePipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMediaCapturePipelinesRequest, ListMediaCapturePipelinesResult> asyncHandler) {
        final ListMediaCapturePipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMediaCapturePipelinesResult>() {
            @Override
            public ListMediaCapturePipelinesResult call() throws Exception {
                ListMediaCapturePipelinesResult result = null;

                try {
                    result = executeListMediaCapturePipelines(finalRequest);
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
    public java.util.concurrent.Future<ListMediaPipelinesResult> listMediaPipelinesAsync(ListMediaPipelinesRequest request) {

        return listMediaPipelinesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMediaPipelinesResult> listMediaPipelinesAsync(final ListMediaPipelinesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMediaPipelinesRequest, ListMediaPipelinesResult> asyncHandler) {
        final ListMediaPipelinesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMediaPipelinesResult>() {
            @Override
            public ListMediaPipelinesResult call() throws Exception {
                ListMediaPipelinesResult result = null;

                try {
                    result = executeListMediaPipelines(finalRequest);
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
