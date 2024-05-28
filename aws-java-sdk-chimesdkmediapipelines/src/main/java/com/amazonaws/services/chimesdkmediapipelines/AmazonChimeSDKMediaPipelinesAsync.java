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

/**
 * Interface for accessing Amazon Chime SDK Media Pipelines asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmediapipelines.AbstractAmazonChimeSDKMediaPipelinesAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK media pipeline APIs in this section allow software developers to create Amazon Chime SDK media
 * pipelines that capture, concatenate, or stream your Amazon Chime SDK meetings. For more information about media
 * pipelines, see <a href=
 * "https://docs.aws.amazon.com/chime-sdk/latest/APIReference/API_Operations_Amazon_Chime_SDK_Media_Pipelines.html"
 * >Amazon Chime SDK media pipelines</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKMediaPipelinesAsync extends AmazonChimeSDKMediaPipelines {

    /**
     * <p>
     * Creates a media pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @return A Java Future containing the result of the CreateMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(
            CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest);

    /**
     * <p>
     * Creates a media pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaCapturePipelineResult> createMediaCapturePipelineAsync(
            CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaCapturePipelineRequest, CreateMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Creates a media concatenation pipeline.
     * </p>
     * 
     * @param createMediaConcatenationPipelineRequest
     * @return A Java Future containing the result of the CreateMediaConcatenationPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaConcatenationPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaConcatenationPipelineResult> createMediaConcatenationPipelineAsync(
            CreateMediaConcatenationPipelineRequest createMediaConcatenationPipelineRequest);

    /**
     * <p>
     * Creates a media concatenation pipeline.
     * </p>
     * 
     * @param createMediaConcatenationPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaConcatenationPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaConcatenationPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaConcatenationPipelineResult> createMediaConcatenationPipelineAsync(
            CreateMediaConcatenationPipelineRequest createMediaConcatenationPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaConcatenationPipelineRequest, CreateMediaConcatenationPipelineResult> asyncHandler);

    /**
     * <p>
     * Creates a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineRequest
     * @return A Java Future containing the result of the CreateMediaInsightsPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaInsightsPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineResult> createMediaInsightsPipelineAsync(
            CreateMediaInsightsPipelineRequest createMediaInsightsPipelineRequest);

    /**
     * <p>
     * Creates a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaInsightsPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaInsightsPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineResult> createMediaInsightsPipelineAsync(
            CreateMediaInsightsPipelineRequest createMediaInsightsPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaInsightsPipelineRequest, CreateMediaInsightsPipelineResult> asyncHandler);

    /**
     * <p>
     * A structure that contains the static configurations for a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the CreateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineConfigurationResult> createMediaInsightsPipelineConfigurationAsync(
            CreateMediaInsightsPipelineConfigurationRequest createMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * A structure that contains the static configurations for a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaInsightsPipelineConfigurationResult> createMediaInsightsPipelineConfigurationAsync(
            CreateMediaInsightsPipelineConfigurationRequest createMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaInsightsPipelineConfigurationRequest, CreateMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a media live connector pipeline in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param createMediaLiveConnectorPipelineRequest
     * @return A Java Future containing the result of the CreateMediaLiveConnectorPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaLiveConnectorPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaLiveConnectorPipelineResult> createMediaLiveConnectorPipelineAsync(
            CreateMediaLiveConnectorPipelineRequest createMediaLiveConnectorPipelineRequest);

    /**
     * <p>
     * Creates a media live connector pipeline in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param createMediaLiveConnectorPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaLiveConnectorPipeline operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaLiveConnectorPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaLiveConnectorPipelineResult> createMediaLiveConnectorPipelineAsync(
            CreateMediaLiveConnectorPipelineRequest createMediaLiveConnectorPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaLiveConnectorPipelineRequest, CreateMediaLiveConnectorPipelineResult> asyncHandler);

    /**
     * <p>
     * Creates an Kinesis video stream pool for the media pipeline.
     * </p>
     * 
     * @param createMediaPipelineKinesisVideoStreamPoolRequest
     * @return A Java Future containing the result of the CreateMediaPipelineKinesisVideoStreamPool operation returned
     *         by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaPipelineKinesisVideoStreamPoolResult> createMediaPipelineKinesisVideoStreamPoolAsync(
            CreateMediaPipelineKinesisVideoStreamPoolRequest createMediaPipelineKinesisVideoStreamPoolRequest);

    /**
     * <p>
     * Creates an Kinesis video stream pool for the media pipeline.
     * </p>
     * 
     * @param createMediaPipelineKinesisVideoStreamPoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaPipelineKinesisVideoStreamPool operation returned
     *         by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaPipelineKinesisVideoStreamPoolResult> createMediaPipelineKinesisVideoStreamPoolAsync(
            CreateMediaPipelineKinesisVideoStreamPoolRequest createMediaPipelineKinesisVideoStreamPoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaPipelineKinesisVideoStreamPoolRequest, CreateMediaPipelineKinesisVideoStreamPoolResult> asyncHandler);

    /**
     * <p>
     * Creates a streaming media pipeline.
     * </p>
     * 
     * @param createMediaStreamPipelineRequest
     * @return A Java Future containing the result of the CreateMediaStreamPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.CreateMediaStreamPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaStreamPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaStreamPipelineResult> createMediaStreamPipelineAsync(
            CreateMediaStreamPipelineRequest createMediaStreamPipelineRequest);

    /**
     * <p>
     * Creates a streaming media pipeline.
     * </p>
     * 
     * @param createMediaStreamPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMediaStreamPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.CreateMediaStreamPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaStreamPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMediaStreamPipelineResult> createMediaStreamPipelineAsync(
            CreateMediaStreamPipelineRequest createMediaStreamPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMediaStreamPipelineRequest, CreateMediaStreamPipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @return A Java Future containing the result of the DeleteMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(
            DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaCapturePipelineResult> deleteMediaCapturePipelineAsync(
            DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaCapturePipelineRequest, DeleteMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified configuration settings.
     * </p>
     * 
     * @param deleteMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the DeleteMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaInsightsPipelineConfigurationResult> deleteMediaInsightsPipelineConfigurationAsync(
            DeleteMediaInsightsPipelineConfigurationRequest deleteMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Deletes the specified configuration settings.
     * </p>
     * 
     * @param deleteMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaInsightsPipelineConfigurationResult> deleteMediaInsightsPipelineConfigurationAsync(
            DeleteMediaInsightsPipelineConfigurationRequest deleteMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaInsightsPipelineConfigurationRequest, DeleteMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaPipelineRequest
     * @return A Java Future containing the result of the DeleteMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaPipelineResult> deleteMediaPipelineAsync(DeleteMediaPipelineRequest deleteMediaPipelineRequest);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaPipelineResult> deleteMediaPipelineAsync(DeleteMediaPipelineRequest deleteMediaPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaPipelineRequest, DeleteMediaPipelineResult> asyncHandler);

    /**
     * <p>
     * Deletes an Kinesis video stream pool.
     * </p>
     * 
     * @param deleteMediaPipelineKinesisVideoStreamPoolRequest
     * @return A Java Future containing the result of the DeleteMediaPipelineKinesisVideoStreamPool operation returned
     *         by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.DeleteMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaPipelineKinesisVideoStreamPoolResult> deleteMediaPipelineKinesisVideoStreamPoolAsync(
            DeleteMediaPipelineKinesisVideoStreamPoolRequest deleteMediaPipelineKinesisVideoStreamPoolRequest);

    /**
     * <p>
     * Deletes an Kinesis video stream pool.
     * </p>
     * 
     * @param deleteMediaPipelineKinesisVideoStreamPoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMediaPipelineKinesisVideoStreamPool operation returned
     *         by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.DeleteMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMediaPipelineKinesisVideoStreamPoolResult> deleteMediaPipelineKinesisVideoStreamPoolAsync(
            DeleteMediaPipelineKinesisVideoStreamPoolRequest deleteMediaPipelineKinesisVideoStreamPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMediaPipelineKinesisVideoStreamPoolRequest, DeleteMediaPipelineKinesisVideoStreamPoolResult> asyncHandler);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @return A Java Future containing the result of the GetMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaCapturePipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaCapturePipelineResult> getMediaCapturePipelineAsync(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaCapturePipelineRequest, GetMediaCapturePipelineResult> asyncHandler);

    /**
     * <p>
     * Gets the configuration settings for a media insights pipeline.
     * </p>
     * 
     * @param getMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the GetMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaInsightsPipelineConfigurationResult> getMediaInsightsPipelineConfigurationAsync(
            GetMediaInsightsPipelineConfigurationRequest getMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Gets the configuration settings for a media insights pipeline.
     * </p>
     * 
     * @param getMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaInsightsPipelineConfigurationResult> getMediaInsightsPipelineConfigurationAsync(
            GetMediaInsightsPipelineConfigurationRequest getMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaInsightsPipelineConfigurationRequest, GetMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaPipelineRequest
     * @return A Java Future containing the result of the GetMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaPipelineResult> getMediaPipelineAsync(GetMediaPipelineRequest getMediaPipelineRequest);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaPipelineRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaPipeline operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaPipelineResult> getMediaPipelineAsync(GetMediaPipelineRequest getMediaPipelineRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaPipelineRequest, GetMediaPipelineResult> asyncHandler);

    /**
     * <p>
     * Gets an Kinesis video stream pool.
     * </p>
     * 
     * @param getMediaPipelineKinesisVideoStreamPoolRequest
     * @return A Java Future containing the result of the GetMediaPipelineKinesisVideoStreamPool operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaPipelineKinesisVideoStreamPoolResult> getMediaPipelineKinesisVideoStreamPoolAsync(
            GetMediaPipelineKinesisVideoStreamPoolRequest getMediaPipelineKinesisVideoStreamPoolRequest);

    /**
     * <p>
     * Gets an Kinesis video stream pool.
     * </p>
     * 
     * @param getMediaPipelineKinesisVideoStreamPoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMediaPipelineKinesisVideoStreamPool operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMediaPipelineKinesisVideoStreamPoolResult> getMediaPipelineKinesisVideoStreamPoolAsync(
            GetMediaPipelineKinesisVideoStreamPoolRequest getMediaPipelineKinesisVideoStreamPoolRequest,
            com.amazonaws.handlers.AsyncHandler<GetMediaPipelineKinesisVideoStreamPoolRequest, GetMediaPipelineKinesisVideoStreamPoolResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @return A Java Future containing the result of the GetSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSpeakerSearchTaskResult> getSpeakerSearchTaskAsync(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest);

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSpeakerSearchTaskResult> getSpeakerSearchTaskAsync(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetSpeakerSearchTaskRequest, GetSpeakerSearchTaskResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @return A Java Future containing the result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.GetVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceToneAnalysisTaskResult> getVoiceToneAnalysisTaskAsync(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.GetVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceToneAnalysisTaskResult> getVoiceToneAnalysisTaskAsync(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceToneAnalysisTaskRequest, GetVoiceToneAnalysisTaskResult> asyncHandler);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @return A Java Future containing the result of the ListMediaCapturePipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(
            ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaCapturePipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaCapturePipelinesResult> listMediaCapturePipelinesAsync(
            ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaCapturePipelinesRequest, ListMediaCapturePipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists the available media insights pipeline configurations.
     * </p>
     * 
     * @param listMediaInsightsPipelineConfigurationsRequest
     * @return A Java Future containing the result of the ListMediaInsightsPipelineConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaInsightsPipelineConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaInsightsPipelineConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaInsightsPipelineConfigurationsResult> listMediaInsightsPipelineConfigurationsAsync(
            ListMediaInsightsPipelineConfigurationsRequest listMediaInsightsPipelineConfigurationsRequest);

    /**
     * <p>
     * Lists the available media insights pipeline configurations.
     * </p>
     * 
     * @param listMediaInsightsPipelineConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaInsightsPipelineConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaInsightsPipelineConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaInsightsPipelineConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaInsightsPipelineConfigurationsResult> listMediaInsightsPipelineConfigurationsAsync(
            ListMediaInsightsPipelineConfigurationsRequest listMediaInsightsPipelineConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaInsightsPipelineConfigurationsRequest, ListMediaInsightsPipelineConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists the video stream pools in the media pipeline.
     * </p>
     * 
     * @param listMediaPipelineKinesisVideoStreamPoolsRequest
     * @return A Java Future containing the result of the ListMediaPipelineKinesisVideoStreamPools operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaPipelineKinesisVideoStreamPools
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelineKinesisVideoStreamPools"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaPipelineKinesisVideoStreamPoolsResult> listMediaPipelineKinesisVideoStreamPoolsAsync(
            ListMediaPipelineKinesisVideoStreamPoolsRequest listMediaPipelineKinesisVideoStreamPoolsRequest);

    /**
     * <p>
     * Lists the video stream pools in the media pipeline.
     * </p>
     * 
     * @param listMediaPipelineKinesisVideoStreamPoolsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaPipelineKinesisVideoStreamPools operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaPipelineKinesisVideoStreamPools
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelineKinesisVideoStreamPools"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaPipelineKinesisVideoStreamPoolsResult> listMediaPipelineKinesisVideoStreamPoolsAsync(
            ListMediaPipelineKinesisVideoStreamPoolsRequest listMediaPipelineKinesisVideoStreamPoolsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaPipelineKinesisVideoStreamPoolsRequest, ListMediaPipelineKinesisVideoStreamPoolsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaPipelinesRequest
     * @return A Java Future containing the result of the ListMediaPipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListMediaPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaPipelinesResult> listMediaPipelinesAsync(ListMediaPipelinesRequest listMediaPipelinesRequest);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaPipelinesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMediaPipelines operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListMediaPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelines"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMediaPipelinesResult> listMediaPipelinesAsync(ListMediaPipelinesRequest listMediaPipelinesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMediaPipelinesRequest, ListMediaPipelinesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags available for a media pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags available for a media pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a speaker search task.
     * </p>
     * <important>
     * <p>
     * Before starting any speaker search tasks, you must provide all notices and obtain all consents from the speaker
     * as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startSpeakerSearchTaskRequest
     * @return A Java Future containing the result of the StartSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeakerSearchTaskResult> startSpeakerSearchTaskAsync(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest);

    /**
     * <p>
     * Starts a speaker search task.
     * </p>
     * <important>
     * <p>
     * Before starting any speaker search tasks, you must provide all notices and obtain all consents from the speaker
     * as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startSpeakerSearchTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartSpeakerSearchTaskResult> startSpeakerSearchTaskAsync(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartSpeakerSearchTaskRequest, StartSpeakerSearchTaskResult> asyncHandler);

    /**
     * <p>
     * Starts a voice tone analysis task. For more information about voice tone analysis, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/voice-analytics.html">Using Amazon Chime SDK voice
     * analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Before starting any voice tone analysis tasks, you must provide all notices and obtain all consents from the
     * speaker as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startVoiceToneAnalysisTaskRequest
     * @return A Java Future containing the result of the StartVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.StartVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVoiceToneAnalysisTaskResult> startVoiceToneAnalysisTaskAsync(
            StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Starts a voice tone analysis task. For more information about voice tone analysis, see <a
     * href="https://docs.aws.amazon.com/chime-sdk/latest/dg/voice-analytics.html">Using Amazon Chime SDK voice
     * analytics</a> in the <i>Amazon Chime SDK Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Before starting any voice tone analysis tasks, you must provide all notices and obtain all consents from the
     * speaker as required under applicable privacy and biometrics laws, and as required under the <a
     * href="https://aws.amazon.com/service-terms/">AWS service terms</a> for the Amazon Chime SDK.
     * </p>
     * </important>
     * 
     * @param startVoiceToneAnalysisTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.StartVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartVoiceToneAnalysisTaskResult> startVoiceToneAnalysisTaskAsync(
            StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartVoiceToneAnalysisTaskRequest, StartVoiceToneAnalysisTaskResult> asyncHandler);

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @return A Java Future containing the result of the StopSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSpeakerSearchTaskResult> stopSpeakerSearchTaskAsync(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest);

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopSpeakerSearchTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopSpeakerSearchTaskResult> stopSpeakerSearchTaskAsync(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StopSpeakerSearchTaskRequest, StopSpeakerSearchTaskResult> asyncHandler);

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @return A Java Future containing the result of the StopVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.StopVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopVoiceToneAnalysisTaskResult> stopVoiceToneAnalysisTaskAsync(
            StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopVoiceToneAnalysisTask operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.StopVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopVoiceToneAnalysisTaskResult> stopVoiceToneAnalysisTaskAsync(
            StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StopVoiceToneAnalysisTaskRequest, StopVoiceToneAnalysisTaskResult> asyncHandler);

    /**
     * <p>
     * The ARN of the media pipeline that you want to tag. Consists of the pipeline's endpoint region, resource ID, and
     * pipeline ID.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The ARN of the media pipeline that you want to tag. Consists of the pipeline's endpoint region, resource ID, and
     * pipeline ID.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes any tags from a media pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes any tags from a media pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the media insights pipeline's configuration settings.
     * </p>
     * 
     * @param updateMediaInsightsPipelineConfigurationRequest
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UpdateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineConfigurationResult> updateMediaInsightsPipelineConfigurationAsync(
            UpdateMediaInsightsPipelineConfigurationRequest updateMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Updates the media insights pipeline's configuration settings.
     * </p>
     * 
     * @param updateMediaInsightsPipelineConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UpdateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineConfigurationResult> updateMediaInsightsPipelineConfigurationAsync(
            UpdateMediaInsightsPipelineConfigurationRequest updateMediaInsightsPipelineConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMediaInsightsPipelineConfigurationRequest, UpdateMediaInsightsPipelineConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the status of a media insights pipeline.
     * </p>
     * 
     * @param updateMediaInsightsPipelineStatusRequest
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineStatus operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UpdateMediaInsightsPipelineStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineStatusResult> updateMediaInsightsPipelineStatusAsync(
            UpdateMediaInsightsPipelineStatusRequest updateMediaInsightsPipelineStatusRequest);

    /**
     * <p>
     * Updates the status of a media insights pipeline.
     * </p>
     * 
     * @param updateMediaInsightsPipelineStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMediaInsightsPipelineStatus operation returned by the
     *         service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UpdateMediaInsightsPipelineStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaInsightsPipelineStatusResult> updateMediaInsightsPipelineStatusAsync(
            UpdateMediaInsightsPipelineStatusRequest updateMediaInsightsPipelineStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMediaInsightsPipelineStatusRequest, UpdateMediaInsightsPipelineStatusResult> asyncHandler);

    /**
     * <p>
     * Updates an Kinesis video stream pool in a media pipeline.
     * </p>
     * 
     * @param updateMediaPipelineKinesisVideoStreamPoolRequest
     * @return A Java Future containing the result of the UpdateMediaPipelineKinesisVideoStreamPool operation returned
     *         by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsync.UpdateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaPipelineKinesisVideoStreamPoolResult> updateMediaPipelineKinesisVideoStreamPoolAsync(
            UpdateMediaPipelineKinesisVideoStreamPoolRequest updateMediaPipelineKinesisVideoStreamPoolRequest);

    /**
     * <p>
     * Updates an Kinesis video stream pool in a media pipeline.
     * </p>
     * 
     * @param updateMediaPipelineKinesisVideoStreamPoolRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMediaPipelineKinesisVideoStreamPool operation returned
     *         by the service.
     * @sample AmazonChimeSDKMediaPipelinesAsyncHandler.UpdateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaPipelineKinesisVideoStreamPoolResult> updateMediaPipelineKinesisVideoStreamPoolAsync(
            UpdateMediaPipelineKinesisVideoStreamPoolRequest updateMediaPipelineKinesisVideoStreamPoolRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMediaPipelineKinesisVideoStreamPoolRequest, UpdateMediaPipelineKinesisVideoStreamPoolResult> asyncHandler);

}
