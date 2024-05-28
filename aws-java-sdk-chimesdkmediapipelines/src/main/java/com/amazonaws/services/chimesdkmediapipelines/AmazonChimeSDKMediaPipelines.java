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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chimesdkmediapipelines.model.*;

/**
 * Interface for accessing Amazon Chime SDK Media Pipelines.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmediapipelines.AbstractAmazonChimeSDKMediaPipelines} instead.
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
public interface AmazonChimeSDKMediaPipelines {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "media-pipelines-chime";

    /**
     * <p>
     * Creates a media pipeline.
     * </p>
     * 
     * @param createMediaCapturePipelineRequest
     * @return Result of the CreateMediaCapturePipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMediaCapturePipelineResult createMediaCapturePipeline(CreateMediaCapturePipelineRequest createMediaCapturePipelineRequest);

    /**
     * <p>
     * Creates a media concatenation pipeline.
     * </p>
     * 
     * @param createMediaConcatenationPipelineRequest
     * @return Result of the CreateMediaConcatenationPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaConcatenationPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaConcatenationPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMediaConcatenationPipelineResult createMediaConcatenationPipeline(CreateMediaConcatenationPipelineRequest createMediaConcatenationPipelineRequest);

    /**
     * <p>
     * Creates a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineRequest
     * @return Result of the CreateMediaInsightsPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaInsightsPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMediaInsightsPipelineResult createMediaInsightsPipeline(CreateMediaInsightsPipelineRequest createMediaInsightsPipelineRequest);

    /**
     * <p>
     * A structure that contains the static configurations for a media insights pipeline.
     * </p>
     * 
     * @param createMediaInsightsPipelineConfigurationRequest
     * @return Result of the CreateMediaInsightsPipelineConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMediaInsightsPipelineConfigurationResult createMediaInsightsPipelineConfiguration(
            CreateMediaInsightsPipelineConfigurationRequest createMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Creates a media live connector pipeline in an Amazon Chime SDK meeting.
     * </p>
     * 
     * @param createMediaLiveConnectorPipelineRequest
     * @return Result of the CreateMediaLiveConnectorPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaLiveConnectorPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaLiveConnectorPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMediaLiveConnectorPipelineResult createMediaLiveConnectorPipeline(CreateMediaLiveConnectorPipelineRequest createMediaLiveConnectorPipelineRequest);

    /**
     * <p>
     * Creates an Kinesis video stream pool for the media pipeline.
     * </p>
     * 
     * @param createMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the CreateMediaPipelineKinesisVideoStreamPool operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMediaPipelineKinesisVideoStreamPoolResult createMediaPipelineKinesisVideoStreamPool(
            CreateMediaPipelineKinesisVideoStreamPoolRequest createMediaPipelineKinesisVideoStreamPoolRequest);

    /**
     * <p>
     * Creates a streaming media pipeline.
     * </p>
     * 
     * @param createMediaStreamPipelineRequest
     * @return Result of the CreateMediaStreamPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.CreateMediaStreamPipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaStreamPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMediaStreamPipelineResult createMediaStreamPipeline(CreateMediaStreamPipelineRequest createMediaStreamPipelineRequest);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaCapturePipelineRequest
     * @return Result of the DeleteMediaCapturePipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMediaCapturePipelineResult deleteMediaCapturePipeline(DeleteMediaCapturePipelineRequest deleteMediaCapturePipelineRequest);

    /**
     * <p>
     * Deletes the specified configuration settings.
     * </p>
     * 
     * @param deleteMediaInsightsPipelineConfigurationRequest
     * @return Result of the DeleteMediaInsightsPipelineConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMediaInsightsPipelineConfigurationResult deleteMediaInsightsPipelineConfiguration(
            DeleteMediaInsightsPipelineConfigurationRequest deleteMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Deletes the media pipeline.
     * </p>
     * 
     * @param deleteMediaPipelineRequest
     * @return Result of the DeleteMediaPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMediaPipelineResult deleteMediaPipeline(DeleteMediaPipelineRequest deleteMediaPipelineRequest);

    /**
     * <p>
     * Deletes an Kinesis video stream pool.
     * </p>
     * 
     * @param deleteMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the DeleteMediaPipelineKinesisVideoStreamPool operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.DeleteMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/DeleteMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMediaPipelineKinesisVideoStreamPoolResult deleteMediaPipelineKinesisVideoStreamPool(
            DeleteMediaPipelineKinesisVideoStreamPoolRequest deleteMediaPipelineKinesisVideoStreamPoolRequest);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaCapturePipelineRequest
     * @return Result of the GetMediaCapturePipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetMediaCapturePipeline
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaCapturePipeline"
     *      target="_top">AWS API Documentation</a>
     */
    GetMediaCapturePipelineResult getMediaCapturePipeline(GetMediaCapturePipelineRequest getMediaCapturePipelineRequest);

    /**
     * <p>
     * Gets the configuration settings for a media insights pipeline.
     * </p>
     * 
     * @param getMediaInsightsPipelineConfigurationRequest
     * @return Result of the GetMediaInsightsPipelineConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetMediaInsightsPipelineConfigurationResult getMediaInsightsPipelineConfiguration(
            GetMediaInsightsPipelineConfigurationRequest getMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Gets an existing media pipeline.
     * </p>
     * 
     * @param getMediaPipelineRequest
     * @return Result of the GetMediaPipeline operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetMediaPipeline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipeline"
     *      target="_top">AWS API Documentation</a>
     */
    GetMediaPipelineResult getMediaPipeline(GetMediaPipelineRequest getMediaPipelineRequest);

    /**
     * <p>
     * Gets an Kinesis video stream pool.
     * </p>
     * 
     * @param getMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the GetMediaPipelineKinesisVideoStreamPool operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    GetMediaPipelineKinesisVideoStreamPoolResult getMediaPipelineKinesisVideoStreamPool(
            GetMediaPipelineKinesisVideoStreamPoolRequest getMediaPipelineKinesisVideoStreamPoolRequest);

    /**
     * <p>
     * Retrieves the details of the specified speaker search task.
     * </p>
     * 
     * @param getSpeakerSearchTaskRequest
     * @return Result of the GetSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetSpeakerSearchTaskResult getSpeakerSearchTask(GetSpeakerSearchTaskRequest getSpeakerSearchTaskRequest);

    /**
     * <p>
     * Retrieves the details of a voice tone analysis task.
     * </p>
     * 
     * @param getVoiceToneAnalysisTaskRequest
     * @return Result of the GetVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.GetVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/GetVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceToneAnalysisTaskResult getVoiceToneAnalysisTask(GetVoiceToneAnalysisTaskRequest getVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaCapturePipelinesRequest
     * @return Result of the ListMediaCapturePipelines operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaCapturePipelines
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaCapturePipelines"
     *      target="_top">AWS API Documentation</a>
     */
    ListMediaCapturePipelinesResult listMediaCapturePipelines(ListMediaCapturePipelinesRequest listMediaCapturePipelinesRequest);

    /**
     * <p>
     * Lists the available media insights pipeline configurations.
     * </p>
     * 
     * @param listMediaInsightsPipelineConfigurationsRequest
     * @return Result of the ListMediaInsightsPipelineConfigurations operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaInsightsPipelineConfigurations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaInsightsPipelineConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListMediaInsightsPipelineConfigurationsResult listMediaInsightsPipelineConfigurations(
            ListMediaInsightsPipelineConfigurationsRequest listMediaInsightsPipelineConfigurationsRequest);

    /**
     * <p>
     * Lists the video stream pools in the media pipeline.
     * </p>
     * 
     * @param listMediaPipelineKinesisVideoStreamPoolsRequest
     * @return Result of the ListMediaPipelineKinesisVideoStreamPools operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaPipelineKinesisVideoStreamPools
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelineKinesisVideoStreamPools"
     *      target="_top">AWS API Documentation</a>
     */
    ListMediaPipelineKinesisVideoStreamPoolsResult listMediaPipelineKinesisVideoStreamPools(
            ListMediaPipelineKinesisVideoStreamPoolsRequest listMediaPipelineKinesisVideoStreamPoolsRequest);

    /**
     * <p>
     * Returns a list of media pipelines.
     * </p>
     * 
     * @param listMediaPipelinesRequest
     * @return Result of the ListMediaPipelines operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListMediaPipelines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListMediaPipelines"
     *      target="_top">AWS API Documentation</a>
     */
    ListMediaPipelinesResult listMediaPipelines(ListMediaPipelinesRequest listMediaPipelinesRequest);

    /**
     * <p>
     * Lists the tags available for a media pipeline.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the StartSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StartSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    StartSpeakerSearchTaskResult startSpeakerSearchTask(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest);

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
     * @return Result of the StartVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StartVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StartVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    StartVoiceToneAnalysisTaskResult startVoiceToneAnalysisTask(StartVoiceToneAnalysisTaskRequest startVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * Stops a speaker search task.
     * </p>
     * 
     * @param stopSpeakerSearchTaskRequest
     * @return Result of the StopSpeakerSearchTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StopSpeakerSearchTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopSpeakerSearchTask"
     *      target="_top">AWS API Documentation</a>
     */
    StopSpeakerSearchTaskResult stopSpeakerSearchTask(StopSpeakerSearchTaskRequest stopSpeakerSearchTaskRequest);

    /**
     * <p>
     * Stops a voice tone analysis task.
     * </p>
     * 
     * @param stopVoiceToneAnalysisTaskRequest
     * @return Result of the StopVoiceToneAnalysisTask operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.StopVoiceToneAnalysisTask
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StopVoiceToneAnalysisTask"
     *      target="_top">AWS API Documentation</a>
     */
    StopVoiceToneAnalysisTaskResult stopVoiceToneAnalysisTask(StopVoiceToneAnalysisTaskRequest stopVoiceToneAnalysisTaskRequest);

    /**
     * <p>
     * The ARN of the media pipeline that you want to tag. Consists of the pipeline's endpoint region, resource ID, and
     * pipeline ID.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes any tags from a media pipeline.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the media insights pipeline's configuration settings.
     * </p>
     * 
     * @param updateMediaInsightsPipelineConfigurationRequest
     * @return Result of the UpdateMediaInsightsPipelineConfiguration operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.UpdateMediaInsightsPipelineConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMediaInsightsPipelineConfigurationResult updateMediaInsightsPipelineConfiguration(
            UpdateMediaInsightsPipelineConfigurationRequest updateMediaInsightsPipelineConfigurationRequest);

    /**
     * <p>
     * Updates the status of a media insights pipeline.
     * </p>
     * 
     * @param updateMediaInsightsPipelineStatusRequest
     * @return Result of the UpdateMediaInsightsPipelineStatus operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.UpdateMediaInsightsPipelineStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMediaInsightsPipelineStatusResult updateMediaInsightsPipelineStatus(UpdateMediaInsightsPipelineStatusRequest updateMediaInsightsPipelineStatusRequest);

    /**
     * <p>
     * Updates an Kinesis video stream pool in a media pipeline.
     * </p>
     * 
     * @param updateMediaPipelineKinesisVideoStreamPoolRequest
     * @return Result of the UpdateMediaPipelineKinesisVideoStreamPool operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMediaPipelines.UpdateMediaPipelineKinesisVideoStreamPool
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaPipelineKinesisVideoStreamPool"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMediaPipelineKinesisVideoStreamPoolResult updateMediaPipelineKinesisVideoStreamPool(
            UpdateMediaPipelineKinesisVideoStreamPoolRequest updateMediaPipelineKinesisVideoStreamPoolRequest);

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
