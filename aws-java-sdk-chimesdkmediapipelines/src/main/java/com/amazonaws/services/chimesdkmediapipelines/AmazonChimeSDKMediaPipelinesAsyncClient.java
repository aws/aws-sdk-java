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
 * pipelines, see <a href=
 * "https://docs.aws.amazon.com/chime-sdk/latest/APIReference/API_Operations_Amazon_Chime_SDK_Media_Pipelines.html"
 * >Amazon Chime SDK media pipelines</a>.
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
    public java.util.concurrent.Future<CreateMediaInsightsPipelineResult> createMediaInsightsPipelineAsync(CreateMediaInsightsPipelineRequest request) {

        return createMediaInsightsPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaInsightsPipelineResult> createMediaInsightsPipelineAsync(final CreateMediaInsightsPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMediaInsightsPipelineRequest, CreateMediaInsightsPipelineResult> asyncHandler) {
        final CreateMediaInsightsPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMediaInsightsPipelineResult>() {
            @Override
            public CreateMediaInsightsPipelineResult call() throws Exception {
                CreateMediaInsightsPipelineResult result = null;

                try {
                    result = executeCreateMediaInsightsPipeline(finalRequest);
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
    public java.util.concurrent.Future<CreateMediaInsightsPipelineConfigurationResult> createMediaInsightsPipelineConfigurationAsync(
            CreateMediaInsightsPipelineConfigurationRequest request) {

        return createMediaInsightsPipelineConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaInsightsPipelineConfigurationResult> createMediaInsightsPipelineConfigurationAsync(
            final CreateMediaInsightsPipelineConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMediaInsightsPipelineConfigurationRequest, CreateMediaInsightsPipelineConfigurationResult> asyncHandler) {
        final CreateMediaInsightsPipelineConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMediaInsightsPipelineConfigurationResult>() {
            @Override
            public CreateMediaInsightsPipelineConfigurationResult call() throws Exception {
                CreateMediaInsightsPipelineConfigurationResult result = null;

                try {
                    result = executeCreateMediaInsightsPipelineConfiguration(finalRequest);
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
    public java.util.concurrent.Future<CreateMediaPipelineKinesisVideoStreamPoolResult> createMediaPipelineKinesisVideoStreamPoolAsync(
            CreateMediaPipelineKinesisVideoStreamPoolRequest request) {

        return createMediaPipelineKinesisVideoStreamPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaPipelineKinesisVideoStreamPoolResult> createMediaPipelineKinesisVideoStreamPoolAsync(
            final CreateMediaPipelineKinesisVideoStreamPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMediaPipelineKinesisVideoStreamPoolRequest, CreateMediaPipelineKinesisVideoStreamPoolResult> asyncHandler) {
        final CreateMediaPipelineKinesisVideoStreamPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMediaPipelineKinesisVideoStreamPoolResult>() {
            @Override
            public CreateMediaPipelineKinesisVideoStreamPoolResult call() throws Exception {
                CreateMediaPipelineKinesisVideoStreamPoolResult result = null;

                try {
                    result = executeCreateMediaPipelineKinesisVideoStreamPool(finalRequest);
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
    public java.util.concurrent.Future<CreateMediaStreamPipelineResult> createMediaStreamPipelineAsync(CreateMediaStreamPipelineRequest request) {

        return createMediaStreamPipelineAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMediaStreamPipelineResult> createMediaStreamPipelineAsync(final CreateMediaStreamPipelineRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMediaStreamPipelineRequest, CreateMediaStreamPipelineResult> asyncHandler) {
        final CreateMediaStreamPipelineRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMediaStreamPipelineResult>() {
            @Override
            public CreateMediaStreamPipelineResult call() throws Exception {
                CreateMediaStreamPipelineResult result = null;

                try {
                    result = executeCreateMediaStreamPipeline(finalRequest);
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
    public java.util.concurrent.Future<DeleteMediaInsightsPipelineConfigurationResult> deleteMediaInsightsPipelineConfigurationAsync(
            DeleteMediaInsightsPipelineConfigurationRequest request) {

        return deleteMediaInsightsPipelineConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaInsightsPipelineConfigurationResult> deleteMediaInsightsPipelineConfigurationAsync(
            final DeleteMediaInsightsPipelineConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMediaInsightsPipelineConfigurationRequest, DeleteMediaInsightsPipelineConfigurationResult> asyncHandler) {
        final DeleteMediaInsightsPipelineConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMediaInsightsPipelineConfigurationResult>() {
            @Override
            public DeleteMediaInsightsPipelineConfigurationResult call() throws Exception {
                DeleteMediaInsightsPipelineConfigurationResult result = null;

                try {
                    result = executeDeleteMediaInsightsPipelineConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteMediaPipelineKinesisVideoStreamPoolResult> deleteMediaPipelineKinesisVideoStreamPoolAsync(
            DeleteMediaPipelineKinesisVideoStreamPoolRequest request) {

        return deleteMediaPipelineKinesisVideoStreamPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMediaPipelineKinesisVideoStreamPoolResult> deleteMediaPipelineKinesisVideoStreamPoolAsync(
            final DeleteMediaPipelineKinesisVideoStreamPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMediaPipelineKinesisVideoStreamPoolRequest, DeleteMediaPipelineKinesisVideoStreamPoolResult> asyncHandler) {
        final DeleteMediaPipelineKinesisVideoStreamPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMediaPipelineKinesisVideoStreamPoolResult>() {
            @Override
            public DeleteMediaPipelineKinesisVideoStreamPoolResult call() throws Exception {
                DeleteMediaPipelineKinesisVideoStreamPoolResult result = null;

                try {
                    result = executeDeleteMediaPipelineKinesisVideoStreamPool(finalRequest);
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
    public java.util.concurrent.Future<GetMediaInsightsPipelineConfigurationResult> getMediaInsightsPipelineConfigurationAsync(
            GetMediaInsightsPipelineConfigurationRequest request) {

        return getMediaInsightsPipelineConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMediaInsightsPipelineConfigurationResult> getMediaInsightsPipelineConfigurationAsync(
            final GetMediaInsightsPipelineConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMediaInsightsPipelineConfigurationRequest, GetMediaInsightsPipelineConfigurationResult> asyncHandler) {
        final GetMediaInsightsPipelineConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMediaInsightsPipelineConfigurationResult>() {
            @Override
            public GetMediaInsightsPipelineConfigurationResult call() throws Exception {
                GetMediaInsightsPipelineConfigurationResult result = null;

                try {
                    result = executeGetMediaInsightsPipelineConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetMediaPipelineKinesisVideoStreamPoolResult> getMediaPipelineKinesisVideoStreamPoolAsync(
            GetMediaPipelineKinesisVideoStreamPoolRequest request) {

        return getMediaPipelineKinesisVideoStreamPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMediaPipelineKinesisVideoStreamPoolResult> getMediaPipelineKinesisVideoStreamPoolAsync(
            final GetMediaPipelineKinesisVideoStreamPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMediaPipelineKinesisVideoStreamPoolRequest, GetMediaPipelineKinesisVideoStreamPoolResult> asyncHandler) {
        final GetMediaPipelineKinesisVideoStreamPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMediaPipelineKinesisVideoStreamPoolResult>() {
            @Override
            public GetMediaPipelineKinesisVideoStreamPoolResult call() throws Exception {
                GetMediaPipelineKinesisVideoStreamPoolResult result = null;

                try {
                    result = executeGetMediaPipelineKinesisVideoStreamPool(finalRequest);
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
    public java.util.concurrent.Future<GetSpeakerSearchTaskResult> getSpeakerSearchTaskAsync(GetSpeakerSearchTaskRequest request) {

        return getSpeakerSearchTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSpeakerSearchTaskResult> getSpeakerSearchTaskAsync(final GetSpeakerSearchTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSpeakerSearchTaskRequest, GetSpeakerSearchTaskResult> asyncHandler) {
        final GetSpeakerSearchTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSpeakerSearchTaskResult>() {
            @Override
            public GetSpeakerSearchTaskResult call() throws Exception {
                GetSpeakerSearchTaskResult result = null;

                try {
                    result = executeGetSpeakerSearchTask(finalRequest);
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
    public java.util.concurrent.Future<GetVoiceToneAnalysisTaskResult> getVoiceToneAnalysisTaskAsync(GetVoiceToneAnalysisTaskRequest request) {

        return getVoiceToneAnalysisTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetVoiceToneAnalysisTaskResult> getVoiceToneAnalysisTaskAsync(final GetVoiceToneAnalysisTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetVoiceToneAnalysisTaskRequest, GetVoiceToneAnalysisTaskResult> asyncHandler) {
        final GetVoiceToneAnalysisTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetVoiceToneAnalysisTaskResult>() {
            @Override
            public GetVoiceToneAnalysisTaskResult call() throws Exception {
                GetVoiceToneAnalysisTaskResult result = null;

                try {
                    result = executeGetVoiceToneAnalysisTask(finalRequest);
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
    public java.util.concurrent.Future<ListMediaInsightsPipelineConfigurationsResult> listMediaInsightsPipelineConfigurationsAsync(
            ListMediaInsightsPipelineConfigurationsRequest request) {

        return listMediaInsightsPipelineConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMediaInsightsPipelineConfigurationsResult> listMediaInsightsPipelineConfigurationsAsync(
            final ListMediaInsightsPipelineConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMediaInsightsPipelineConfigurationsRequest, ListMediaInsightsPipelineConfigurationsResult> asyncHandler) {
        final ListMediaInsightsPipelineConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMediaInsightsPipelineConfigurationsResult>() {
            @Override
            public ListMediaInsightsPipelineConfigurationsResult call() throws Exception {
                ListMediaInsightsPipelineConfigurationsResult result = null;

                try {
                    result = executeListMediaInsightsPipelineConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListMediaPipelineKinesisVideoStreamPoolsResult> listMediaPipelineKinesisVideoStreamPoolsAsync(
            ListMediaPipelineKinesisVideoStreamPoolsRequest request) {

        return listMediaPipelineKinesisVideoStreamPoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMediaPipelineKinesisVideoStreamPoolsResult> listMediaPipelineKinesisVideoStreamPoolsAsync(
            final ListMediaPipelineKinesisVideoStreamPoolsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMediaPipelineKinesisVideoStreamPoolsRequest, ListMediaPipelineKinesisVideoStreamPoolsResult> asyncHandler) {
        final ListMediaPipelineKinesisVideoStreamPoolsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMediaPipelineKinesisVideoStreamPoolsResult>() {
            @Override
            public ListMediaPipelineKinesisVideoStreamPoolsResult call() throws Exception {
                ListMediaPipelineKinesisVideoStreamPoolsResult result = null;

                try {
                    result = executeListMediaPipelineKinesisVideoStreamPools(finalRequest);
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
    public java.util.concurrent.Future<StartSpeakerSearchTaskResult> startSpeakerSearchTaskAsync(StartSpeakerSearchTaskRequest request) {

        return startSpeakerSearchTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSpeakerSearchTaskResult> startSpeakerSearchTaskAsync(final StartSpeakerSearchTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartSpeakerSearchTaskRequest, StartSpeakerSearchTaskResult> asyncHandler) {
        final StartSpeakerSearchTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartSpeakerSearchTaskResult>() {
            @Override
            public StartSpeakerSearchTaskResult call() throws Exception {
                StartSpeakerSearchTaskResult result = null;

                try {
                    result = executeStartSpeakerSearchTask(finalRequest);
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
    public java.util.concurrent.Future<StartVoiceToneAnalysisTaskResult> startVoiceToneAnalysisTaskAsync(StartVoiceToneAnalysisTaskRequest request) {

        return startVoiceToneAnalysisTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartVoiceToneAnalysisTaskResult> startVoiceToneAnalysisTaskAsync(final StartVoiceToneAnalysisTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartVoiceToneAnalysisTaskRequest, StartVoiceToneAnalysisTaskResult> asyncHandler) {
        final StartVoiceToneAnalysisTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartVoiceToneAnalysisTaskResult>() {
            @Override
            public StartVoiceToneAnalysisTaskResult call() throws Exception {
                StartVoiceToneAnalysisTaskResult result = null;

                try {
                    result = executeStartVoiceToneAnalysisTask(finalRequest);
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
    public java.util.concurrent.Future<StopSpeakerSearchTaskResult> stopSpeakerSearchTaskAsync(StopSpeakerSearchTaskRequest request) {

        return stopSpeakerSearchTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopSpeakerSearchTaskResult> stopSpeakerSearchTaskAsync(final StopSpeakerSearchTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopSpeakerSearchTaskRequest, StopSpeakerSearchTaskResult> asyncHandler) {
        final StopSpeakerSearchTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopSpeakerSearchTaskResult>() {
            @Override
            public StopSpeakerSearchTaskResult call() throws Exception {
                StopSpeakerSearchTaskResult result = null;

                try {
                    result = executeStopSpeakerSearchTask(finalRequest);
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
    public java.util.concurrent.Future<StopVoiceToneAnalysisTaskResult> stopVoiceToneAnalysisTaskAsync(StopVoiceToneAnalysisTaskRequest request) {

        return stopVoiceToneAnalysisTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopVoiceToneAnalysisTaskResult> stopVoiceToneAnalysisTaskAsync(final StopVoiceToneAnalysisTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopVoiceToneAnalysisTaskRequest, StopVoiceToneAnalysisTaskResult> asyncHandler) {
        final StopVoiceToneAnalysisTaskRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopVoiceToneAnalysisTaskResult>() {
            @Override
            public StopVoiceToneAnalysisTaskResult call() throws Exception {
                StopVoiceToneAnalysisTaskResult result = null;

                try {
                    result = executeStopVoiceToneAnalysisTask(finalRequest);
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
    public java.util.concurrent.Future<UpdateMediaInsightsPipelineConfigurationResult> updateMediaInsightsPipelineConfigurationAsync(
            UpdateMediaInsightsPipelineConfigurationRequest request) {

        return updateMediaInsightsPipelineConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaInsightsPipelineConfigurationResult> updateMediaInsightsPipelineConfigurationAsync(
            final UpdateMediaInsightsPipelineConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMediaInsightsPipelineConfigurationRequest, UpdateMediaInsightsPipelineConfigurationResult> asyncHandler) {
        final UpdateMediaInsightsPipelineConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMediaInsightsPipelineConfigurationResult>() {
            @Override
            public UpdateMediaInsightsPipelineConfigurationResult call() throws Exception {
                UpdateMediaInsightsPipelineConfigurationResult result = null;

                try {
                    result = executeUpdateMediaInsightsPipelineConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateMediaInsightsPipelineStatusResult> updateMediaInsightsPipelineStatusAsync(
            UpdateMediaInsightsPipelineStatusRequest request) {

        return updateMediaInsightsPipelineStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaInsightsPipelineStatusResult> updateMediaInsightsPipelineStatusAsync(
            final UpdateMediaInsightsPipelineStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMediaInsightsPipelineStatusRequest, UpdateMediaInsightsPipelineStatusResult> asyncHandler) {
        final UpdateMediaInsightsPipelineStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMediaInsightsPipelineStatusResult>() {
            @Override
            public UpdateMediaInsightsPipelineStatusResult call() throws Exception {
                UpdateMediaInsightsPipelineStatusResult result = null;

                try {
                    result = executeUpdateMediaInsightsPipelineStatus(finalRequest);
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
    public java.util.concurrent.Future<UpdateMediaPipelineKinesisVideoStreamPoolResult> updateMediaPipelineKinesisVideoStreamPoolAsync(
            UpdateMediaPipelineKinesisVideoStreamPoolRequest request) {

        return updateMediaPipelineKinesisVideoStreamPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMediaPipelineKinesisVideoStreamPoolResult> updateMediaPipelineKinesisVideoStreamPoolAsync(
            final UpdateMediaPipelineKinesisVideoStreamPoolRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMediaPipelineKinesisVideoStreamPoolRequest, UpdateMediaPipelineKinesisVideoStreamPoolResult> asyncHandler) {
        final UpdateMediaPipelineKinesisVideoStreamPoolRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMediaPipelineKinesisVideoStreamPoolResult>() {
            @Override
            public UpdateMediaPipelineKinesisVideoStreamPoolResult call() throws Exception {
                UpdateMediaPipelineKinesisVideoStreamPoolResult result = null;

                try {
                    result = executeUpdateMediaPipelineKinesisVideoStreamPool(finalRequest);
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
