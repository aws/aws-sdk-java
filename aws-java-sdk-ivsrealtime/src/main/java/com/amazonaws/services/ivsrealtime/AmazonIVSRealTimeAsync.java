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
package com.amazonaws.services.ivsrealtime;

import javax.annotation.Generated;

import com.amazonaws.services.ivsrealtime.model.*;

/**
 * Interface for accessing ivsrealtime asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivsrealtime.AbstractAmazonIVSRealTimeAsync} instead.
 * </p>
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon Interactive Video Service (IVS) real-time API is REST compatible, using a standard HTTP API and an AWS
 * EventBridge event stream for responses. JSON is used for both requests and responses, including errors.
 * </p>
 * <p>
 * Terminology:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A <i>stage</i> is a virtual space where participants can exchange video in real time.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant token</i> is a token that authenticates a participant when they join a stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * A <i>participant object</i> represents participants (people) in the stage and contains information about them. When a
 * token is created, it includes a participant ID; when a participant uses that token to join a stage, the participant
 * is associated with that participant ID. There is a 1:1 mapping between participant tokens and participants.
 * </p>
 * </li>
 * <li>
 * <p>
 * Server-side composition: The <i>composition</i> process composites participants of a stage into a single video and
 * forwards it to a set of outputs (e.g., IVS channels). Composition endpoints support this process.
 * </p>
 * </li>
 * <li>
 * <p>
 * Server-side composition: A <i>composition</i> controls the look of the outputs, including how participants are
 * positioned in the video.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/getting-started.html">Getting Started with Amazon IVS
 * Real-Time Streaming</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Stage</b> — A stage is a virtual space where participants can exchange video in real time.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tagging</b>
 * </p>
 * <p>
 * A <i>tag</i> is a metadata label that you assign to an AWS resource. A tag comprises a <i>key</i> and a <i>value</i>,
 * both set by you. For example, you might set a tag as <code>topic:nature</code> to label a particular video category.
 * See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for more
 * information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS stages
 * has no service-specific constraints beyond what is documented there.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS real-time API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resource supports tagging: Stage.
 * </p>
 * <p>
 * At most 50 tags can be applied to a resource.
 * </p>
 * <p>
 * <b>Stages Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateParticipantToken</a> — Creates an additional token for a specified stage. This can be done after stage
 * creation or when tokens expire.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateStage</a> — Creates a new stage (and optionally participant tokens).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStage</a> — Shuts down and deletes the specified stage (disconnecting all participants).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectParticipant</a> — Disconnects a specified participant and revokes the participant permanently from a
 * specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetParticipant</a> — Gets information about the specified participant token.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStage</a> — Gets information for the specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStageSession</a> — Gets information for the specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipantEvents</a> — Lists events for a specified participant that occurred during a specified stage
 * session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListParticipants</a> — Lists all participants in a specified stage session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStages</a> — Gets summary information about all stages in your account, in the AWS region where the API
 * request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStageSessions</a> — Gets all sessions for a specified stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateStage</a> — Updates a stage’s configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Composition Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetComposition</a> — Gets information about the specified Composition resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListCompositions</a> — Gets summary information about all Compositions in your account, in the AWS region where
 * the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartComposition</a> — Starts a Composition from a stage based on the configuration provided in the request.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopComposition</a> — Stops and deletes a Composition resource. Any broadcast from the Composition resource is
 * stopped.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>EncoderConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateEncoderConfiguration</a> — Creates an EncoderConfiguration object.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteEncoderConfiguration</a> — Deletes an EncoderConfiguration resource. Ensures that no Compositions are using
 * this template; otherwise, returns an error.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetEncoderConfiguration</a> — Gets information about the specified EncoderConfiguration resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListEncoderConfigurations</a> — Gets summary information about all EncoderConfigurations in your account, in the
 * AWS region where the API request is processed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>StorageConfiguration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStorageConfiguration</a> — Creates a new storage configuration, used to enable recording to Amazon S3.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStorageConfiguration</a> — Deletes the storage configuration for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStorageConfiguration</a> — Gets the storage configuration for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStorageConfigurations</a> — Gets summary information about all storage configurations in your account, in the
 * AWS region where the API request is processed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tags Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for the AWS resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from the resource with the specified ARN.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonIVSRealTimeAsync extends AmazonIVSRealTime {

    /**
     * <p>
     * Creates an EncoderConfiguration object.
     * </p>
     * 
     * @param createEncoderConfigurationRequest
     * @return A Java Future containing the result of the CreateEncoderConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.CreateEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEncoderConfigurationResult> createEncoderConfigurationAsync(
            CreateEncoderConfigurationRequest createEncoderConfigurationRequest);

    /**
     * <p>
     * Creates an EncoderConfiguration object.
     * </p>
     * 
     * @param createEncoderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEncoderConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.CreateEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEncoderConfigurationResult> createEncoderConfigurationAsync(
            CreateEncoderConfigurationRequest createEncoderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEncoderConfigurationRequest, CreateEncoderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates an additional token for a specified stage. This can be done after stage creation or when tokens expire.
     * Tokens always are scoped to the stage for which they are created.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS and never used directly by your application.
     * </p>
     * 
     * @param createParticipantTokenRequest
     * @return A Java Future containing the result of the CreateParticipantToken operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.CreateParticipantToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateParticipantToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateParticipantTokenResult> createParticipantTokenAsync(CreateParticipantTokenRequest createParticipantTokenRequest);

    /**
     * <p>
     * Creates an additional token for a specified stage. This can be done after stage creation or when tokens expire.
     * Tokens always are scoped to the stage for which they are created.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS and never used directly by your application.
     * </p>
     * 
     * @param createParticipantTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateParticipantToken operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.CreateParticipantToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateParticipantToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateParticipantTokenResult> createParticipantTokenAsync(CreateParticipantTokenRequest createParticipantTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateParticipantTokenRequest, CreateParticipantTokenResult> asyncHandler);

    /**
     * <p>
     * Creates a new stage (and optionally participant tokens).
     * </p>
     * 
     * @param createStageRequest
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a new stage (and optionally participant tokens).
     * </p>
     * 
     * @param createStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler);

    /**
     * <p>
     * Creates a new storage configuration, used to enable recording to Amazon S3. When a StorageConfiguration is
     * created, IVS will modify the S3 bucketPolicy of the provided bucket. This will ensure that IVS has sufficient
     * permissions to write content to the provided bucket.
     * </p>
     * 
     * @param createStorageConfigurationRequest
     * @return A Java Future containing the result of the CreateStorageConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.CreateStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageConfigurationResult> createStorageConfigurationAsync(
            CreateStorageConfigurationRequest createStorageConfigurationRequest);

    /**
     * <p>
     * Creates a new storage configuration, used to enable recording to Amazon S3. When a StorageConfiguration is
     * created, IVS will modify the S3 bucketPolicy of the provided bucket. This will ensure that IVS has sufficient
     * permissions to write content to the provided bucket.
     * </p>
     * 
     * @param createStorageConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStorageConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.CreateStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageConfigurationResult> createStorageConfigurationAsync(
            CreateStorageConfigurationRequest createStorageConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStorageConfigurationRequest, CreateStorageConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an EncoderConfiguration resource. Ensures that no Compositions are using this template; otherwise,
     * returns an error.
     * </p>
     * 
     * @param deleteEncoderConfigurationRequest
     * @return A Java Future containing the result of the DeleteEncoderConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.DeleteEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEncoderConfigurationResult> deleteEncoderConfigurationAsync(
            DeleteEncoderConfigurationRequest deleteEncoderConfigurationRequest);

    /**
     * <p>
     * Deletes an EncoderConfiguration resource. Ensures that no Compositions are using this template; otherwise,
     * returns an error.
     * </p>
     * 
     * @param deleteEncoderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEncoderConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.DeleteEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEncoderConfigurationResult> deleteEncoderConfigurationAsync(
            DeleteEncoderConfigurationRequest deleteEncoderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEncoderConfigurationRequest, DeleteEncoderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Shuts down and deletes the specified stage (disconnecting all participants).
     * </p>
     * 
     * @param deleteStageRequest
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Shuts down and deletes the specified stage (disconnecting all participants).
     * </p>
     * 
     * @param deleteStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler);

    /**
     * <p>
     * Deletes the storage configuration for the specified ARN.
     * </p>
     * <p>
     * If you try to delete a storage configuration that is used by a Composition, you will get an error (409
     * ConflictException). To avoid this, for all Compositions that reference the storage configuration, first use
     * <a>StopComposition</a> and wait for it to complete, then use DeleteStorageConfiguration.
     * </p>
     * 
     * @param deleteStorageConfigurationRequest
     * @return A Java Future containing the result of the DeleteStorageConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.DeleteStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageConfigurationResult> deleteStorageConfigurationAsync(
            DeleteStorageConfigurationRequest deleteStorageConfigurationRequest);

    /**
     * <p>
     * Deletes the storage configuration for the specified ARN.
     * </p>
     * <p>
     * If you try to delete a storage configuration that is used by a Composition, you will get an error (409
     * ConflictException). To avoid this, for all Compositions that reference the storage configuration, first use
     * <a>StopComposition</a> and wait for it to complete, then use DeleteStorageConfiguration.
     * </p>
     * 
     * @param deleteStorageConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStorageConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.DeleteStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageConfigurationResult> deleteStorageConfigurationAsync(
            DeleteStorageConfigurationRequest deleteStorageConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStorageConfigurationRequest, DeleteStorageConfigurationResult> asyncHandler);

    /**
     * <p>
     * Disconnects a specified participant and revokes the participant permanently from a specified stage.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return A Java Future containing the result of the DisconnectParticipant operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest disconnectParticipantRequest);

    /**
     * <p>
     * Disconnects a specified participant and revokes the participant permanently from a specified stage.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectParticipant operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest disconnectParticipantRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler);

    /**
     * <p>
     * Get information about the specified Composition resource.
     * </p>
     * 
     * @param getCompositionRequest
     * @return A Java Future containing the result of the GetComposition operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.GetComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetComposition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCompositionResult> getCompositionAsync(GetCompositionRequest getCompositionRequest);

    /**
     * <p>
     * Get information about the specified Composition resource.
     * </p>
     * 
     * @param getCompositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComposition operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.GetComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetComposition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCompositionResult> getCompositionAsync(GetCompositionRequest getCompositionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCompositionRequest, GetCompositionResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified EncoderConfiguration resource.
     * </p>
     * 
     * @param getEncoderConfigurationRequest
     * @return A Java Future containing the result of the GetEncoderConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.GetEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEncoderConfigurationResult> getEncoderConfigurationAsync(GetEncoderConfigurationRequest getEncoderConfigurationRequest);

    /**
     * <p>
     * Gets information about the specified EncoderConfiguration resource.
     * </p>
     * 
     * @param getEncoderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEncoderConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.GetEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEncoderConfigurationResult> getEncoderConfigurationAsync(GetEncoderConfigurationRequest getEncoderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetEncoderConfigurationRequest, GetEncoderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets information about the specified participant token.
     * </p>
     * 
     * @param getParticipantRequest
     * @return A Java Future containing the result of the GetParticipant operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.GetParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetParticipant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetParticipantResult> getParticipantAsync(GetParticipantRequest getParticipantRequest);

    /**
     * <p>
     * Gets information about the specified participant token.
     * </p>
     * 
     * @param getParticipantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParticipant operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.GetParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetParticipant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetParticipantResult> getParticipantAsync(GetParticipantRequest getParticipantRequest,
            com.amazonaws.handlers.AsyncHandler<GetParticipantRequest, GetParticipantResult> asyncHandler);

    /**
     * <p>
     * Gets information for the specified stage.
     * </p>
     * 
     * @param getStageRequest
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information for the specified stage.
     * </p>
     * 
     * @param getStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest,
            com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler);

    /**
     * <p>
     * Gets information for the specified stage session.
     * </p>
     * 
     * @param getStageSessionRequest
     * @return A Java Future containing the result of the GetStageSession operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.GetStageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStageSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStageSessionResult> getStageSessionAsync(GetStageSessionRequest getStageSessionRequest);

    /**
     * <p>
     * Gets information for the specified stage session.
     * </p>
     * 
     * @param getStageSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStageSession operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.GetStageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStageSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStageSessionResult> getStageSessionAsync(GetStageSessionRequest getStageSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetStageSessionRequest, GetStageSessionResult> asyncHandler);

    /**
     * <p>
     * Gets the storage configuration for the specified ARN.
     * </p>
     * 
     * @param getStorageConfigurationRequest
     * @return A Java Future containing the result of the GetStorageConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.GetStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageConfigurationResult> getStorageConfigurationAsync(GetStorageConfigurationRequest getStorageConfigurationRequest);

    /**
     * <p>
     * Gets the storage configuration for the specified ARN.
     * </p>
     * 
     * @param getStorageConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStorageConfiguration operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.GetStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageConfigurationResult> getStorageConfigurationAsync(GetStorageConfigurationRequest getStorageConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetStorageConfigurationRequest, GetStorageConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all Compositions in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listCompositionsRequest
     * @return A Java Future containing the result of the ListCompositions operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListCompositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListCompositions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCompositionsResult> listCompositionsAsync(ListCompositionsRequest listCompositionsRequest);

    /**
     * <p>
     * Gets summary information about all Compositions in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listCompositionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCompositions operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListCompositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListCompositions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListCompositionsResult> listCompositionsAsync(ListCompositionsRequest listCompositionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCompositionsRequest, ListCompositionsResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all EncoderConfigurations in your account, in the AWS region where the API request
     * is processed.
     * </p>
     * 
     * @param listEncoderConfigurationsRequest
     * @return A Java Future containing the result of the ListEncoderConfigurations operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListEncoderConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListEncoderConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEncoderConfigurationsResult> listEncoderConfigurationsAsync(
            ListEncoderConfigurationsRequest listEncoderConfigurationsRequest);

    /**
     * <p>
     * Gets summary information about all EncoderConfigurations in your account, in the AWS region where the API request
     * is processed.
     * </p>
     * 
     * @param listEncoderConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEncoderConfigurations operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListEncoderConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListEncoderConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEncoderConfigurationsResult> listEncoderConfigurationsAsync(
            ListEncoderConfigurationsRequest listEncoderConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEncoderConfigurationsRequest, ListEncoderConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists events for a specified participant that occurred during a specified stage session.
     * </p>
     * 
     * @param listParticipantEventsRequest
     * @return A Java Future containing the result of the ListParticipantEvents operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListParticipantEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipantEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListParticipantEventsResult> listParticipantEventsAsync(ListParticipantEventsRequest listParticipantEventsRequest);

    /**
     * <p>
     * Lists events for a specified participant that occurred during a specified stage session.
     * </p>
     * 
     * @param listParticipantEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListParticipantEvents operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListParticipantEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipantEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListParticipantEventsResult> listParticipantEventsAsync(ListParticipantEventsRequest listParticipantEventsRequest,
            com.amazonaws.handlers.AsyncHandler<ListParticipantEventsRequest, ListParticipantEventsResult> asyncHandler);

    /**
     * <p>
     * Lists all participants in a specified stage session.
     * </p>
     * 
     * @param listParticipantsRequest
     * @return A Java Future containing the result of the ListParticipants operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListParticipants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipants" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListParticipantsResult> listParticipantsAsync(ListParticipantsRequest listParticipantsRequest);

    /**
     * <p>
     * Lists all participants in a specified stage session.
     * </p>
     * 
     * @param listParticipantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListParticipants operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListParticipants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipants" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListParticipantsResult> listParticipantsAsync(ListParticipantsRequest listParticipantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListParticipantsRequest, ListParticipantsResult> asyncHandler);

    /**
     * <p>
     * Gets all sessions for a specified stage.
     * </p>
     * 
     * @param listStageSessionsRequest
     * @return A Java Future containing the result of the ListStageSessions operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListStageSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStageSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStageSessionsResult> listStageSessionsAsync(ListStageSessionsRequest listStageSessionsRequest);

    /**
     * <p>
     * Gets all sessions for a specified stage.
     * </p>
     * 
     * @param listStageSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStageSessions operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListStageSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStageSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStageSessionsResult> listStageSessionsAsync(ListStageSessionsRequest listStageSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStageSessionsRequest, ListStageSessionsResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all stages in your account, in the AWS region where the API request is processed.
     * </p>
     * 
     * @param listStagesRequest
     * @return A Java Future containing the result of the ListStages operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest listStagesRequest);

    /**
     * <p>
     * Gets summary information about all stages in your account, in the AWS region where the API request is processed.
     * </p>
     * 
     * @param listStagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStages operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest listStagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStagesRequest, ListStagesResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all storage configurations in your account, in the AWS region where the API
     * request is processed.
     * </p>
     * 
     * @param listStorageConfigurationsRequest
     * @return A Java Future containing the result of the ListStorageConfigurations operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListStorageConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStorageConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageConfigurationsResult> listStorageConfigurationsAsync(
            ListStorageConfigurationsRequest listStorageConfigurationsRequest);

    /**
     * <p>
     * Gets summary information about all storage configurations in your account, in the AWS region where the API
     * request is processed.
     * </p>
     * 
     * @param listStorageConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStorageConfigurations operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListStorageConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStorageConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageConfigurationsResult> listStorageConfigurationsAsync(
            ListStorageConfigurationsRequest listStorageConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStorageConfigurationsRequest, ListStorageConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a Composition from a stage based on the configuration provided in the request.
     * </p>
     * <p>
     * A Composition is an ephemeral resource that exists after this endpoint returns successfully. Composition stops
     * and the resource is deleted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <a>StopComposition</a> is called.
     * </p>
     * </li>
     * <li>
     * <p>
     * After a 1-minute timeout, when all participants are disconnected from the stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * After a 1-minute timeout, if there are no participants in the stage when StartComposition is called.
     * </p>
     * </li>
     * <li>
     * <p>
     * When broadcasting to the IVS channel fails and all retries are exhausted.
     * </p>
     * </li>
     * <li>
     * <p>
     * When broadcasting is disconnected and all attempts to reconnect are exhausted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startCompositionRequest
     * @return A Java Future containing the result of the StartComposition operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.StartComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StartComposition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartCompositionResult> startCompositionAsync(StartCompositionRequest startCompositionRequest);

    /**
     * <p>
     * Starts a Composition from a stage based on the configuration provided in the request.
     * </p>
     * <p>
     * A Composition is an ephemeral resource that exists after this endpoint returns successfully. Composition stops
     * and the resource is deleted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When <a>StopComposition</a> is called.
     * </p>
     * </li>
     * <li>
     * <p>
     * After a 1-minute timeout, when all participants are disconnected from the stage.
     * </p>
     * </li>
     * <li>
     * <p>
     * After a 1-minute timeout, if there are no participants in the stage when StartComposition is called.
     * </p>
     * </li>
     * <li>
     * <p>
     * When broadcasting to the IVS channel fails and all retries are exhausted.
     * </p>
     * </li>
     * <li>
     * <p>
     * When broadcasting is disconnected and all attempts to reconnect are exhausted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param startCompositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartComposition operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.StartComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StartComposition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartCompositionResult> startCompositionAsync(StartCompositionRequest startCompositionRequest,
            com.amazonaws.handlers.AsyncHandler<StartCompositionRequest, StartCompositionResult> asyncHandler);

    /**
     * <p>
     * Stops and deletes a Composition resource. Any broadcast from the Composition resource is stopped.
     * </p>
     * 
     * @param stopCompositionRequest
     * @return A Java Future containing the result of the StopComposition operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.StopComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StopComposition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCompositionResult> stopCompositionAsync(StopCompositionRequest stopCompositionRequest);

    /**
     * <p>
     * Stops and deletes a Composition resource. Any broadcast from the Composition resource is stopped.
     * </p>
     * 
     * @param stopCompositionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopComposition operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.StopComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StopComposition" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopCompositionResult> stopCompositionAsync(StopCompositionRequest stopCompositionRequest,
            com.amazonaws.handlers.AsyncHandler<StopCompositionRequest, StopCompositionResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a stage’s configuration.
     * </p>
     * 
     * @param updateStageRequest
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsync.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest);

    /**
     * <p>
     * Updates a stage’s configuration.
     * </p>
     * 
     * @param updateStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AmazonIVSRealTimeAsyncHandler.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler);

}
