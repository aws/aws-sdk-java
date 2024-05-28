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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ivsrealtime.model.*;

/**
 * Interface for accessing ivsrealtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivsrealtime.AbstractAmazonIVSRealTime} instead.
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
public interface AmazonIVSRealTime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ivsrealtime";

    /**
     * <p>
     * Creates an EncoderConfiguration object.
     * </p>
     * 
     * @param createEncoderConfigurationRequest
     * @return Result of the CreateEncoderConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEncoderConfigurationResult createEncoderConfiguration(CreateEncoderConfigurationRequest createEncoderConfigurationRequest);

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
     * @return Result of the CreateParticipantToken operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateParticipantToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateParticipantToken"
     *      target="_top">AWS API Documentation</a>
     */
    CreateParticipantTokenResult createParticipantToken(CreateParticipantTokenRequest createParticipantTokenRequest);

    /**
     * <p>
     * Creates a new stage (and optionally participant tokens).
     * </p>
     * 
     * @param createStageRequest
     * @return Result of the CreateStage operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a new storage configuration, used to enable recording to Amazon S3. When a StorageConfiguration is
     * created, IVS will modify the S3 bucketPolicy of the provided bucket. This will ensure that IVS has sufficient
     * permissions to write content to the provided bucket.
     * </p>
     * 
     * @param createStorageConfigurationRequest
     * @return Result of the CreateStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.CreateStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/CreateStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateStorageConfigurationResult createStorageConfiguration(CreateStorageConfigurationRequest createStorageConfigurationRequest);

    /**
     * <p>
     * Deletes an EncoderConfiguration resource. Ensures that no Compositions are using this template; otherwise,
     * returns an error.
     * </p>
     * 
     * @param deleteEncoderConfigurationRequest
     * @return Result of the DeleteEncoderConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.DeleteEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEncoderConfigurationResult deleteEncoderConfiguration(DeleteEncoderConfigurationRequest deleteEncoderConfigurationRequest);

    /**
     * <p>
     * Shuts down and deletes the specified stage (disconnecting all participants).
     * </p>
     * 
     * @param deleteStageRequest
     * @return Result of the DeleteStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStageResult deleteStage(DeleteStageRequest deleteStageRequest);

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
     * @return Result of the DeleteStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.DeleteStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DeleteStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteStorageConfigurationResult deleteStorageConfiguration(DeleteStorageConfigurationRequest deleteStorageConfigurationRequest);

    /**
     * <p>
     * Disconnects a specified participant and revokes the participant permanently from a specified stage.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return Result of the DisconnectParticipant operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    DisconnectParticipantResult disconnectParticipant(DisconnectParticipantRequest disconnectParticipantRequest);

    /**
     * <p>
     * Get information about the specified Composition resource.
     * </p>
     * 
     * @param getCompositionRequest
     * @return Result of the GetComposition operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.GetComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetComposition" target="_top">AWS
     *      API Documentation</a>
     */
    GetCompositionResult getComposition(GetCompositionRequest getCompositionRequest);

    /**
     * <p>
     * Gets information about the specified EncoderConfiguration resource.
     * </p>
     * 
     * @param getEncoderConfigurationRequest
     * @return Result of the GetEncoderConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.GetEncoderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetEncoderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetEncoderConfigurationResult getEncoderConfiguration(GetEncoderConfigurationRequest getEncoderConfigurationRequest);

    /**
     * <p>
     * Gets information about the specified participant token.
     * </p>
     * 
     * @param getParticipantRequest
     * @return Result of the GetParticipant operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetParticipant" target="_top">AWS
     *      API Documentation</a>
     */
    GetParticipantResult getParticipant(GetParticipantRequest getParticipantRequest);

    /**
     * <p>
     * Gets information for the specified stage.
     * </p>
     * 
     * @param getStageRequest
     * @return Result of the GetStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    GetStageResult getStage(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information for the specified stage session.
     * </p>
     * 
     * @param getStageSessionRequest
     * @return Result of the GetStageSession operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.GetStageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStageSession" target="_top">AWS
     *      API Documentation</a>
     */
    GetStageSessionResult getStageSession(GetStageSessionRequest getStageSessionRequest);

    /**
     * <p>
     * Gets the storage configuration for the specified ARN.
     * </p>
     * 
     * @param getStorageConfigurationRequest
     * @return Result of the GetStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.GetStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GetStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetStorageConfigurationResult getStorageConfiguration(GetStorageConfigurationRequest getStorageConfigurationRequest);

    /**
     * <p>
     * Gets summary information about all Compositions in your account, in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listCompositionsRequest
     * @return Result of the ListCompositions operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListCompositions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListCompositions" target="_top">AWS
     *      API Documentation</a>
     */
    ListCompositionsResult listCompositions(ListCompositionsRequest listCompositionsRequest);

    /**
     * <p>
     * Gets summary information about all EncoderConfigurations in your account, in the AWS region where the API request
     * is processed.
     * </p>
     * 
     * @param listEncoderConfigurationsRequest
     * @return Result of the ListEncoderConfigurations operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListEncoderConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListEncoderConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListEncoderConfigurationsResult listEncoderConfigurations(ListEncoderConfigurationsRequest listEncoderConfigurationsRequest);

    /**
     * <p>
     * Lists events for a specified participant that occurred during a specified stage session.
     * </p>
     * 
     * @param listParticipantEventsRequest
     * @return Result of the ListParticipantEvents operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListParticipantEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipantEvents"
     *      target="_top">AWS API Documentation</a>
     */
    ListParticipantEventsResult listParticipantEvents(ListParticipantEventsRequest listParticipantEventsRequest);

    /**
     * <p>
     * Lists all participants in a specified stage session.
     * </p>
     * 
     * @param listParticipantsRequest
     * @return Result of the ListParticipants operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListParticipants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipants" target="_top">AWS
     *      API Documentation</a>
     */
    ListParticipantsResult listParticipants(ListParticipantsRequest listParticipantsRequest);

    /**
     * <p>
     * Gets all sessions for a specified stage.
     * </p>
     * 
     * @param listStageSessionsRequest
     * @return Result of the ListStageSessions operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @sample AmazonIVSRealTime.ListStageSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStageSessions" target="_top">AWS
     *      API Documentation</a>
     */
    ListStageSessionsResult listStageSessions(ListStageSessionsRequest listStageSessionsRequest);

    /**
     * <p>
     * Gets summary information about all stages in your account, in the AWS region where the API request is processed.
     * </p>
     * 
     * @param listStagesRequest
     * @return Result of the ListStages operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    ListStagesResult listStages(ListStagesRequest listStagesRequest);

    /**
     * <p>
     * Gets summary information about all storage configurations in your account, in the AWS region where the API
     * request is processed.
     * </p>
     * 
     * @param listStorageConfigurationsRequest
     * @return Result of the ListStorageConfigurations operation returned by the service.
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.ListStorageConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListStorageConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListStorageConfigurationsResult listStorageConfigurations(ListStorageConfigurationsRequest listStorageConfigurationsRequest);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the StartComposition operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.StartComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StartComposition" target="_top">AWS
     *      API Documentation</a>
     */
    StartCompositionResult startComposition(StartCompositionRequest startCompositionRequest);

    /**
     * <p>
     * Stops and deletes a Composition resource. Any broadcast from the Composition resource is stopped.
     * </p>
     * 
     * @param stopCompositionRequest
     * @return Result of the StopComposition operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AmazonIVSRealTime.StopComposition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StopComposition" target="_top">AWS
     *      API Documentation</a>
     */
    StopCompositionResult stopComposition(StopCompositionRequest stopCompositionRequest);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws InternalServerException
     * @sample AmazonIVSRealTime.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a stage’s configuration.
     * </p>
     * 
     * @param updateStageRequest
     * @return Result of the UpdateStage operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws PendingVerificationException
     * @sample AmazonIVSRealTime.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
