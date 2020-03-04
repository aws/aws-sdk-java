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
package com.amazonaws.services.pinpoint;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;

/**
 * Interface for accessing Amazon Pinpoint asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpoint.AbstractAmazonPinpointAsync} instead.
 * </p>
 * <p>
 * <p>
 * Doc Engage API - Amazon Pinpoint API
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpointAsync extends AmazonPinpoint {

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createAppRequest
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AmazonPinpointAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates an application.
     * </p>
     * 
     * @param createAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * <p>
     * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
     * </p>
     * 
     * @param createCampaignRequest
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest);

    /**
     * <p>
     * Creates a new campaign for an application or updates the settings of an existing campaign for an application.
     * </p>
     * 
     * @param createCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateCampaignResult> createCampaignAsync(CreateCampaignRequest createCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCampaignRequest, CreateCampaignResult> asyncHandler);

    /**
     * <p>
     * Creates a message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param createEmailTemplateRequest
     * @return A Java Future containing the result of the CreateEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.CreateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEmailTemplateResult> createEmailTemplateAsync(CreateEmailTemplateRequest createEmailTemplateRequest);

    /**
     * <p>
     * Creates a message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param createEmailTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEmailTemplateResult> createEmailTemplateAsync(CreateEmailTemplateRequest createEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEmailTemplateRequest, CreateEmailTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates an export job for an application.
     * </p>
     * 
     * @param createExportJobRequest
     * @return A Java Future containing the result of the CreateExportJob operation returned by the service.
     * @sample AmazonPinpointAsync.CreateExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExportJobResult> createExportJobAsync(CreateExportJobRequest createExportJobRequest);

    /**
     * <p>
     * Creates an export job for an application.
     * </p>
     * 
     * @param createExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExportJob operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateExportJobResult> createExportJobAsync(CreateExportJobRequest createExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExportJobRequest, CreateExportJobResult> asyncHandler);

    /**
     * <p>
     * Creates an import job for an application.
     * </p>
     * 
     * @param createImportJobRequest
     * @return A Java Future containing the result of the CreateImportJob operation returned by the service.
     * @sample AmazonPinpointAsync.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest createImportJobRequest);

    /**
     * <p>
     * Creates an import job for an application.
     * </p>
     * 
     * @param createImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateImportJob operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateImportJobResult> createImportJobAsync(CreateImportJobRequest createImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateImportJobRequest, CreateImportJobResult> asyncHandler);

    /**
     * <p>
     * Creates a journey for an application.
     * </p>
     * 
     * @param createJourneyRequest
     * @return A Java Future containing the result of the CreateJourney operation returned by the service.
     * @sample AmazonPinpointAsync.CreateJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJourneyResult> createJourneyAsync(CreateJourneyRequest createJourneyRequest);

    /**
     * <p>
     * Creates a journey for an application.
     * </p>
     * 
     * @param createJourneyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJourney operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJourneyResult> createJourneyAsync(CreateJourneyRequest createJourneyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJourneyRequest, CreateJourneyResult> asyncHandler);

    /**
     * <p>
     * Creates a message template for messages that are sent through a push notification channel.
     * </p>
     * 
     * @param createPushTemplateRequest
     * @return A Java Future containing the result of the CreatePushTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.CreatePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreatePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePushTemplateResult> createPushTemplateAsync(CreatePushTemplateRequest createPushTemplateRequest);

    /**
     * <p>
     * Creates a message template for messages that are sent through a push notification channel.
     * </p>
     * 
     * @param createPushTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePushTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreatePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreatePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePushTemplateResult> createPushTemplateAsync(CreatePushTemplateRequest createPushTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePushTemplateRequest, CreatePushTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param createRecommenderConfigurationRequest
     * @return A Java Future containing the result of the CreateRecommenderConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.CreateRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecommenderConfigurationResult> createRecommenderConfigurationAsync(
            CreateRecommenderConfigurationRequest createRecommenderConfigurationRequest);

    /**
     * <p>
     * Creates an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param createRecommenderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRecommenderConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.CreateRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRecommenderConfigurationResult> createRecommenderConfigurationAsync(
            CreateRecommenderConfigurationRequest createRecommenderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRecommenderConfigurationRequest, CreateRecommenderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param createSegmentRequest
     * @return A Java Future containing the result of the CreateSegment operation returned by the service.
     * @sample AmazonPinpointAsync.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest createSegmentRequest);

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param createSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSegmentResult> createSegmentAsync(CreateSegmentRequest createSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSegmentRequest, CreateSegmentResult> asyncHandler);

    /**
     * <p>
     * Creates a message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param createSmsTemplateRequest
     * @return A Java Future containing the result of the CreateSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.CreateSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSmsTemplateResult> createSmsTemplateAsync(CreateSmsTemplateRequest createSmsTemplateRequest);

    /**
     * <p>
     * Creates a message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param createSmsTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSmsTemplateResult> createSmsTemplateAsync(CreateSmsTemplateRequest createSmsTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSmsTemplateRequest, CreateSmsTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param createVoiceTemplateRequest
     * @return A Java Future containing the result of the CreateVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.CreateVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceTemplateResult> createVoiceTemplateAsync(CreateVoiceTemplateRequest createVoiceTemplateRequest);

    /**
     * <p>
     * Creates a message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param createVoiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.CreateVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceTemplateResult> createVoiceTemplateAsync(CreateVoiceTemplateRequest createVoiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVoiceTemplateRequest, CreateVoiceTemplateResult> asyncHandler);

    /**
     * <p>
     * Disables the ADM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteAdmChannelRequest
     * @return A Java Future containing the result of the DeleteAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAdmChannelResult> deleteAdmChannelAsync(DeleteAdmChannelRequest deleteAdmChannelRequest);

    /**
     * <p>
     * Disables the ADM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteAdmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAdmChannelResult> deleteAdmChannelAsync(DeleteAdmChannelRequest deleteAdmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAdmChannelRequest, DeleteAdmChannelResult> asyncHandler);

    /**
     * <p>
     * Disables the APNs channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsChannelRequest
     * @return A Java Future containing the result of the DeleteApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(DeleteApnsChannelRequest deleteApnsChannelRequest);

    /**
     * <p>
     * Disables the APNs channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsChannelResult> deleteApnsChannelAsync(DeleteApnsChannelRequest deleteApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsChannelRequest, DeleteApnsChannelResult> asyncHandler);

    /**
     * <p>
     * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return A Java Future containing the result of the DeleteApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsSandboxChannelResult> deleteApnsSandboxChannelAsync(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest);

    /**
     * <p>
     * Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsSandboxChannelResult> deleteApnsSandboxChannelAsync(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsSandboxChannelRequest, DeleteApnsSandboxChannelResult> asyncHandler);

    /**
     * <p>
     * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipChannelRequest
     * @return A Java Future containing the result of the DeleteApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipChannelResult> deleteApnsVoipChannelAsync(DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest);

    /**
     * <p>
     * Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipChannelResult> deleteApnsVoipChannelAsync(DeleteApnsVoipChannelRequest deleteApnsVoipChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsVoipChannelRequest, DeleteApnsVoipChannelResult> asyncHandler);

    /**
     * <p>
     * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @return A Java Future containing the result of the DeleteApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.DeleteApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipSandboxChannelResult> deleteApnsVoipSandboxChannelAsync(
            DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest);

    /**
     * <p>
     * Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteApnsVoipSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.DeleteApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApnsVoipSandboxChannelResult> deleteApnsVoipSandboxChannelAsync(
            DeleteApnsVoipSandboxChannelRequest deleteApnsVoipSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApnsVoipSandboxChannelRequest, DeleteApnsVoipSandboxChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteAppRequest
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes an application.
     * </p>
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * <p>
     * Disables the Baidu channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteBaiduChannelRequest
     * @return A Java Future containing the result of the DeleteBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBaiduChannelResult> deleteBaiduChannelAsync(DeleteBaiduChannelRequest deleteBaiduChannelRequest);

    /**
     * <p>
     * Disables the Baidu channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteBaiduChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBaiduChannelResult> deleteBaiduChannelAsync(DeleteBaiduChannelRequest deleteBaiduChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBaiduChannelRequest, DeleteBaiduChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes a campaign from an application.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * <p>
     * Deletes a campaign from an application.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCampaignResult> deleteCampaignAsync(DeleteCampaignRequest deleteCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCampaignRequest, DeleteCampaignResult> asyncHandler);

    /**
     * <p>
     * Disables the email channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteEmailChannelRequest
     * @return A Java Future containing the result of the DeleteEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailChannelResult> deleteEmailChannelAsync(DeleteEmailChannelRequest deleteEmailChannelRequest);

    /**
     * <p>
     * Disables the email channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteEmailChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailChannelResult> deleteEmailChannelAsync(DeleteEmailChannelRequest deleteEmailChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEmailChannelRequest, DeleteEmailChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes a message template for messages that were sent through the email channel.
     * </p>
     * 
     * @param deleteEmailTemplateRequest
     * @return A Java Future containing the result of the DeleteEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailTemplateResult> deleteEmailTemplateAsync(DeleteEmailTemplateRequest deleteEmailTemplateRequest);

    /**
     * <p>
     * Deletes a message template for messages that were sent through the email channel.
     * </p>
     * 
     * @param deleteEmailTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEmailTemplateResult> deleteEmailTemplateAsync(DeleteEmailTemplateRequest deleteEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEmailTemplateRequest, DeleteEmailTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes an endpoint from an application.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * Deletes an endpoint from an application.
     * </p>
     * 
     * @param deleteEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes the event stream for an application.
     * </p>
     * 
     * @param deleteEventStreamRequest
     * @return A Java Future containing the result of the DeleteEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventStreamResult> deleteEventStreamAsync(DeleteEventStreamRequest deleteEventStreamRequest);

    /**
     * <p>
     * Deletes the event stream for an application.
     * </p>
     * 
     * @param deleteEventStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventStreamResult> deleteEventStreamAsync(DeleteEventStreamRequest deleteEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventStreamRequest, DeleteEventStreamResult> asyncHandler);

    /**
     * <p>
     * Disables the GCM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteGcmChannelRequest
     * @return A Java Future containing the result of the DeleteGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(DeleteGcmChannelRequest deleteGcmChannelRequest);

    /**
     * <p>
     * Disables the GCM channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteGcmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGcmChannelResult> deleteGcmChannelAsync(DeleteGcmChannelRequest deleteGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGcmChannelRequest, DeleteGcmChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes a journey from an application.
     * </p>
     * 
     * @param deleteJourneyRequest
     * @return A Java Future containing the result of the DeleteJourney operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJourneyResult> deleteJourneyAsync(DeleteJourneyRequest deleteJourneyRequest);

    /**
     * <p>
     * Deletes a journey from an application.
     * </p>
     * 
     * @param deleteJourneyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJourney operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJourneyResult> deleteJourneyAsync(DeleteJourneyRequest deleteJourneyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJourneyRequest, DeleteJourneyResult> asyncHandler);

    /**
     * <p>
     * Deletes a message template for messages that were sent through a push notification channel.
     * </p>
     * 
     * @param deletePushTemplateRequest
     * @return A Java Future containing the result of the DeletePushTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.DeletePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeletePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePushTemplateResult> deletePushTemplateAsync(DeletePushTemplateRequest deletePushTemplateRequest);

    /**
     * <p>
     * Deletes a message template for messages that were sent through a push notification channel.
     * </p>
     * 
     * @param deletePushTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePushTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeletePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeletePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePushTemplateResult> deletePushTemplateAsync(DeletePushTemplateRequest deletePushTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePushTemplateRequest, DeletePushTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param deleteRecommenderConfigurationRequest
     * @return A Java Future containing the result of the DeleteRecommenderConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.DeleteRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommenderConfigurationResult> deleteRecommenderConfigurationAsync(
            DeleteRecommenderConfigurationRequest deleteRecommenderConfigurationRequest);

    /**
     * <p>
     * Deletes an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param deleteRecommenderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecommenderConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.DeleteRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecommenderConfigurationResult> deleteRecommenderConfigurationAsync(
            DeleteRecommenderConfigurationRequest deleteRecommenderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecommenderConfigurationRequest, DeleteRecommenderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a segment from an application.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @return A Java Future containing the result of the DeleteSegment operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest deleteSegmentRequest);

    /**
     * <p>
     * Deletes a segment from an application.
     * </p>
     * 
     * @param deleteSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSegmentResult> deleteSegmentAsync(DeleteSegmentRequest deleteSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSegmentRequest, DeleteSegmentResult> asyncHandler);

    /**
     * <p>
     * Disables the SMS channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteSmsChannelRequest
     * @return A Java Future containing the result of the DeleteSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSmsChannelResult> deleteSmsChannelAsync(DeleteSmsChannelRequest deleteSmsChannelRequest);

    /**
     * <p>
     * Disables the SMS channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteSmsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSmsChannelResult> deleteSmsChannelAsync(DeleteSmsChannelRequest deleteSmsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSmsChannelRequest, DeleteSmsChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes a message template for messages that were sent through the SMS channel.
     * </p>
     * 
     * @param deleteSmsTemplateRequest
     * @return A Java Future containing the result of the DeleteSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSmsTemplateResult> deleteSmsTemplateAsync(DeleteSmsTemplateRequest deleteSmsTemplateRequest);

    /**
     * <p>
     * Deletes a message template for messages that were sent through the SMS channel.
     * </p>
     * 
     * @param deleteSmsTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSmsTemplateResult> deleteSmsTemplateAsync(DeleteSmsTemplateRequest deleteSmsTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSmsTemplateRequest, DeleteSmsTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param deleteUserEndpointsRequest
     * @return A Java Future containing the result of the DeleteUserEndpoints operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteUserEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserEndpointsResult> deleteUserEndpointsAsync(DeleteUserEndpointsRequest deleteUserEndpointsRequest);

    /**
     * <p>
     * Deletes all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param deleteUserEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserEndpoints operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteUserEndpoints" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserEndpointsResult> deleteUserEndpointsAsync(DeleteUserEndpointsRequest deleteUserEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserEndpointsRequest, DeleteUserEndpointsResult> asyncHandler);

    /**
     * <p>
     * Disables the voice channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteVoiceChannelRequest
     * @return A Java Future containing the result of the DeleteVoiceChannel operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceChannelResult> deleteVoiceChannelAsync(DeleteVoiceChannelRequest deleteVoiceChannelRequest);

    /**
     * <p>
     * Disables the voice channel for an application and deletes any existing settings for the channel.
     * </p>
     * 
     * @param deleteVoiceChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceChannelResult> deleteVoiceChannelAsync(DeleteVoiceChannelRequest deleteVoiceChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceChannelRequest, DeleteVoiceChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes a message template for messages that were sent through the voice channel.
     * </p>
     * 
     * @param deleteVoiceTemplateRequest
     * @return A Java Future containing the result of the DeleteVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.DeleteVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceTemplateResult> deleteVoiceTemplateAsync(DeleteVoiceTemplateRequest deleteVoiceTemplateRequest);

    /**
     * <p>
     * Deletes a message template for messages that were sent through the voice channel.
     * </p>
     * 
     * @param deleteVoiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.DeleteVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceTemplateResult> deleteVoiceTemplateAsync(DeleteVoiceTemplateRequest deleteVoiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceTemplateRequest, DeleteVoiceTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the ADM channel for an application.
     * </p>
     * 
     * @param getAdmChannelRequest
     * @return A Java Future containing the result of the GetAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdmChannelResult> getAdmChannelAsync(GetAdmChannelRequest getAdmChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the ADM channel for an application.
     * </p>
     * 
     * @param getAdmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdmChannelResult> getAdmChannelAsync(GetAdmChannelRequest getAdmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdmChannelRequest, GetAdmChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs channel for an application.
     * </p>
     * 
     * @param getApnsChannelRequest
     * @return A Java Future containing the result of the GetApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(GetApnsChannelRequest getApnsChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs channel for an application.
     * </p>
     * 
     * @param getApnsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApnsChannelResult> getApnsChannelAsync(GetApnsChannelRequest getApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsChannelRequest, GetApnsChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs sandbox channel for an application.
     * </p>
     * 
     * @param getApnsSandboxChannelRequest
     * @return A Java Future containing the result of the GetApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsSandboxChannelResult> getApnsSandboxChannelAsync(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs sandbox channel for an application.
     * </p>
     * 
     * @param getApnsSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsSandboxChannelResult> getApnsSandboxChannelAsync(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsSandboxChannelRequest, GetApnsSandboxChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP channel for an application.
     * </p>
     * 
     * @param getApnsVoipChannelRequest
     * @return A Java Future containing the result of the GetApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipChannelResult> getApnsVoipChannelAsync(GetApnsVoipChannelRequest getApnsVoipChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP channel for an application.
     * </p>
     * 
     * @param getApnsVoipChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipChannelResult> getApnsVoipChannelAsync(GetApnsVoipChannelRequest getApnsVoipChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsVoipChannelRequest, GetApnsVoipChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
     * </p>
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @return A Java Future containing the result of the GetApnsVoipSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipSandboxChannelResult> getApnsVoipSandboxChannelAsync(
            GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.
     * </p>
     * 
     * @param getApnsVoipSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApnsVoipSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApnsVoipSandboxChannelResult> getApnsVoipSandboxChannelAsync(
            GetApnsVoipSandboxChannelRequest getApnsVoipSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetApnsVoipSandboxChannelRequest, GetApnsVoipSandboxChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an application.
     * </p>
     * 
     * @param getAppRequest
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AmazonPinpointAsync.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest);

    /**
     * <p>
     * Retrieves information about an application.
     * </p>
     * 
     * @param getAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApp operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppResult> getAppAsync(GetAppRequest getAppRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppRequest, GetAppResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.
     * </p>
     * 
     * @param getApplicationDateRangeKpiRequest
     * @return A Java Future containing the result of the GetApplicationDateRangeKpi operation returned by the service.
     * @sample AmazonPinpointAsync.GetApplicationDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationDateRangeKpiResult> getApplicationDateRangeKpiAsync(
            GetApplicationDateRangeKpiRequest getApplicationDateRangeKpiRequest);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.
     * </p>
     * 
     * @param getApplicationDateRangeKpiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationDateRangeKpi operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApplicationDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationDateRangeKpiResult> getApplicationDateRangeKpiAsync(
            GetApplicationDateRangeKpiRequest getApplicationDateRangeKpiRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationDateRangeKpiRequest, GetApplicationDateRangeKpiResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the settings for an application.
     * </p>
     * 
     * @param getApplicationSettingsRequest
     * @return A Java Future containing the result of the GetApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsync.GetApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(GetApplicationSettingsRequest getApplicationSettingsRequest);

    /**
     * <p>
     * Retrieves information about the settings for an application.
     * </p>
     * 
     * @param getApplicationSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationSettingsResult> getApplicationSettingsAsync(GetApplicationSettingsRequest getApplicationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationSettingsRequest, GetApplicationSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all the applications that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param getAppsRequest
     * @return A Java Future containing the result of the GetApps operation returned by the service.
     * @sample AmazonPinpointAsync.GetApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppsResult> getAppsAsync(GetAppsRequest getAppsRequest);

    /**
     * <p>
     * Retrieves information about all the applications that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param getAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApps operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppsResult> getAppsAsync(GetAppsRequest getAppsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppsRequest, GetAppsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the Baidu channel for an application.
     * </p>
     * 
     * @param getBaiduChannelRequest
     * @return A Java Future containing the result of the GetBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBaiduChannelResult> getBaiduChannelAsync(GetBaiduChannelRequest getBaiduChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the Baidu channel for an application.
     * </p>
     * 
     * @param getBaiduChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBaiduChannelResult> getBaiduChannelAsync(GetBaiduChannelRequest getBaiduChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetBaiduChannelRequest, GetBaiduChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @return A Java Future containing the result of the GetCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest getCampaignRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a campaign.
     * </p>
     * 
     * @param getCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignResult> getCampaignAsync(GetCampaignRequest getCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignRequest, GetCampaignResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all the activities for a campaign.
     * </p>
     * 
     * @param getCampaignActivitiesRequest
     * @return A Java Future containing the result of the GetCampaignActivities operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(GetCampaignActivitiesRequest getCampaignActivitiesRequest);

    /**
     * <p>
     * Retrieves information about all the activities for a campaign.
     * </p>
     * 
     * @param getCampaignActivitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignActivities operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaignActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignActivitiesResult> getCampaignActivitiesAsync(GetCampaignActivitiesRequest getCampaignActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignActivitiesRequest, GetCampaignActivitiesResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.
     * </p>
     * 
     * @param getCampaignDateRangeKpiRequest
     * @return A Java Future containing the result of the GetCampaignDateRangeKpi operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignDateRangeKpiResult> getCampaignDateRangeKpiAsync(GetCampaignDateRangeKpiRequest getCampaignDateRangeKpiRequest);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.
     * </p>
     * 
     * @param getCampaignDateRangeKpiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignDateRangeKpi operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaignDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignDateRangeKpiResult> getCampaignDateRangeKpiAsync(GetCampaignDateRangeKpiRequest getCampaignDateRangeKpiRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignDateRangeKpiRequest, GetCampaignDateRangeKpiResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
     * </p>
     * 
     * @param getCampaignVersionRequest
     * @return A Java Future containing the result of the GetCampaignVersion operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(GetCampaignVersionRequest getCampaignVersionRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a specific version of a campaign.
     * </p>
     * 
     * @param getCampaignVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignVersion operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaignVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionResult> getCampaignVersionAsync(GetCampaignVersionRequest getCampaignVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignVersionRequest, GetCampaignVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all versions of a campaign.
     * </p>
     * 
     * @param getCampaignVersionsRequest
     * @return A Java Future containing the result of the GetCampaignVersions operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaignVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(GetCampaignVersionsRequest getCampaignVersionsRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all versions of a campaign.
     * </p>
     * 
     * @param getCampaignVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaignVersions operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaignVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignVersionsResult> getCampaignVersionsAsync(GetCampaignVersionsRequest getCampaignVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignVersionsRequest, GetCampaignVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all the campaigns that are
     * associated with an application.
     * </p>
     * 
     * @param getCampaignsRequest
     * @return A Java Future containing the result of the GetCampaigns operation returned by the service.
     * @sample AmazonPinpointAsync.GetCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(GetCampaignsRequest getCampaignsRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all the campaigns that are
     * associated with an application.
     * </p>
     * 
     * @param getCampaignsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCampaigns operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCampaignsResult> getCampaignsAsync(GetCampaignsRequest getCampaignsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCampaignsRequest, GetCampaignsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the history and status of each channel for an application.
     * </p>
     * 
     * @param getChannelsRequest
     * @return A Java Future containing the result of the GetChannels operation returned by the service.
     * @sample AmazonPinpointAsync.GetChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelsResult> getChannelsAsync(GetChannelsRequest getChannelsRequest);

    /**
     * <p>
     * Retrieves information about the history and status of each channel for an application.
     * </p>
     * 
     * @param getChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannels operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelsResult> getChannelsAsync(GetChannelsRequest getChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelsRequest, GetChannelsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the email channel for an application.
     * </p>
     * 
     * @param getEmailChannelRequest
     * @return A Java Future containing the result of the GetEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailChannelResult> getEmailChannelAsync(GetEmailChannelRequest getEmailChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the email channel for an application.
     * </p>
     * 
     * @param getEmailChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailChannelResult> getEmailChannelAsync(GetEmailChannelRequest getEmailChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetEmailChannelRequest, GetEmailChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param getEmailTemplateRequest
     * @return A Java Future containing the result of the GetEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.GetEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailTemplateResult> getEmailTemplateAsync(GetEmailTemplateRequest getEmailTemplateRequest);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param getEmailTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEmailTemplateResult> getEmailTemplateAsync(GetEmailTemplateRequest getEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetEmailTemplateRequest, GetEmailTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the settings and attributes of a specific endpoint for an application.
     * </p>
     * 
     * @param getEndpointRequest
     * @return A Java Future containing the result of the GetEndpoint operation returned by the service.
     * @sample AmazonPinpointAsync.GetEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(GetEndpointRequest getEndpointRequest);

    /**
     * <p>
     * Retrieves information about the settings and attributes of a specific endpoint for an application.
     * </p>
     * 
     * @param getEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEndpoint operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEndpointResult> getEndpointAsync(GetEndpointRequest getEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetEndpointRequest, GetEndpointResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the event stream settings for an application.
     * </p>
     * 
     * @param getEventStreamRequest
     * @return A Java Future containing the result of the GetEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.GetEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(GetEventStreamRequest getEventStreamRequest);

    /**
     * <p>
     * Retrieves information about the event stream settings for an application.
     * </p>
     * 
     * @param getEventStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEventStreamResult> getEventStreamAsync(GetEventStreamRequest getEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventStreamRequest, GetEventStreamResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of a specific export job for an application.
     * </p>
     * 
     * @param getExportJobRequest
     * @return A Java Future containing the result of the GetExportJob operation returned by the service.
     * @sample AmazonPinpointAsync.GetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportJobResult> getExportJobAsync(GetExportJobRequest getExportJobRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of a specific export job for an application.
     * </p>
     * 
     * @param getExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExportJob operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportJobResult> getExportJobAsync(GetExportJobRequest getExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetExportJobRequest, GetExportJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of all the export jobs for an application.
     * </p>
     * 
     * @param getExportJobsRequest
     * @return A Java Future containing the result of the GetExportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportJobsResult> getExportJobsAsync(GetExportJobsRequest getExportJobsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of all the export jobs for an application.
     * </p>
     * 
     * @param getExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExportJobs operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetExportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportJobsResult> getExportJobsAsync(GetExportJobsRequest getExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetExportJobsRequest, GetExportJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the GCM channel for an application.
     * </p>
     * 
     * @param getGcmChannelRequest
     * @return A Java Future containing the result of the GetGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(GetGcmChannelRequest getGcmChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the GCM channel for an application.
     * </p>
     * 
     * @param getGcmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGcmChannelResult> getGcmChannelAsync(GetGcmChannelRequest getGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetGcmChannelRequest, GetGcmChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of a specific import job for an application.
     * </p>
     * 
     * @param getImportJobRequest
     * @return A Java Future containing the result of the GetImportJob operation returned by the service.
     * @sample AmazonPinpointAsync.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest getImportJobRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of a specific import job for an application.
     * </p>
     * 
     * @param getImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImportJob operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobResult> getImportJobAsync(GetImportJobRequest getImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportJobRequest, GetImportJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of all the import jobs for an application.
     * </p>
     * 
     * @param getImportJobsRequest
     * @return A Java Future containing the result of the GetImportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(GetImportJobsRequest getImportJobsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of all the import jobs for an application.
     * </p>
     * 
     * @param getImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetImportJobs operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetImportJobsResult> getImportJobsAsync(GetImportJobsRequest getImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetImportJobsRequest, GetImportJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a journey.
     * </p>
     * 
     * @param getJourneyRequest
     * @return A Java Future containing the result of the GetJourney operation returned by the service.
     * @sample AmazonPinpointAsync.GetJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyResult> getJourneyAsync(GetJourneyRequest getJourneyRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for a journey.
     * </p>
     * 
     * @param getJourneyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJourney operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyResult> getJourneyAsync(GetJourneyRequest getJourneyRequest,
            com.amazonaws.handlers.AsyncHandler<GetJourneyRequest, GetJourneyResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard engagement metric that applies to a journey.
     * </p>
     * 
     * @param getJourneyDateRangeKpiRequest
     * @return A Java Future containing the result of the GetJourneyDateRangeKpi operation returned by the service.
     * @sample AmazonPinpointAsync.GetJourneyDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyDateRangeKpiResult> getJourneyDateRangeKpiAsync(GetJourneyDateRangeKpiRequest getJourneyDateRangeKpiRequest);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard engagement metric that applies to a journey.
     * </p>
     * 
     * @param getJourneyDateRangeKpiRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJourneyDateRangeKpi operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetJourneyDateRangeKpi
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyDateRangeKpi"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyDateRangeKpiResult> getJourneyDateRangeKpiAsync(GetJourneyDateRangeKpiRequest getJourneyDateRangeKpiRequest,
            com.amazonaws.handlers.AsyncHandler<GetJourneyDateRangeKpiRequest, GetJourneyDateRangeKpiResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey activity.
     * </p>
     * 
     * @param getJourneyExecutionActivityMetricsRequest
     * @return A Java Future containing the result of the GetJourneyExecutionActivityMetrics operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.GetJourneyExecutionActivityMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyExecutionActivityMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyExecutionActivityMetricsResult> getJourneyExecutionActivityMetricsAsync(
            GetJourneyExecutionActivityMetricsRequest getJourneyExecutionActivityMetricsRequest);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey activity.
     * </p>
     * 
     * @param getJourneyExecutionActivityMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJourneyExecutionActivityMetrics operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.GetJourneyExecutionActivityMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyExecutionActivityMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyExecutionActivityMetricsResult> getJourneyExecutionActivityMetricsAsync(
            GetJourneyExecutionActivityMetricsRequest getJourneyExecutionActivityMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetJourneyExecutionActivityMetricsRequest, GetJourneyExecutionActivityMetricsResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey.
     * </p>
     * 
     * @param getJourneyExecutionMetricsRequest
     * @return A Java Future containing the result of the GetJourneyExecutionMetrics operation returned by the service.
     * @sample AmazonPinpointAsync.GetJourneyExecutionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyExecutionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyExecutionMetricsResult> getJourneyExecutionMetricsAsync(
            GetJourneyExecutionMetricsRequest getJourneyExecutionMetricsRequest);

    /**
     * <p>
     * Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey.
     * </p>
     * 
     * @param getJourneyExecutionMetricsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJourneyExecutionMetrics operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetJourneyExecutionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyExecutionMetrics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetJourneyExecutionMetricsResult> getJourneyExecutionMetricsAsync(
            GetJourneyExecutionMetricsRequest getJourneyExecutionMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetJourneyExecutionMetricsRequest, GetJourneyExecutionMetricsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through a push notification
     * channel.
     * </p>
     * 
     * @param getPushTemplateRequest
     * @return A Java Future containing the result of the GetPushTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.GetPushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetPushTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPushTemplateResult> getPushTemplateAsync(GetPushTemplateRequest getPushTemplateRequest);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through a push notification
     * channel.
     * </p>
     * 
     * @param getPushTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPushTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetPushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetPushTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPushTemplateResult> getPushTemplateAsync(GetPushTemplateRequest getPushTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetPushTemplateRequest, GetPushTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param getRecommenderConfigurationRequest
     * @return A Java Future containing the result of the GetRecommenderConfiguration operation returned by the service.
     * @sample AmazonPinpointAsync.GetRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommenderConfigurationResult> getRecommenderConfigurationAsync(
            GetRecommenderConfigurationRequest getRecommenderConfigurationRequest);

    /**
     * <p>
     * Retrieves information about an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param getRecommenderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommenderConfiguration operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommenderConfigurationResult> getRecommenderConfigurationAsync(
            GetRecommenderConfigurationRequest getRecommenderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommenderConfigurationRequest, GetRecommenderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all the recommender model configurations that are associated with your Amazon
     * Pinpoint account.
     * </p>
     * 
     * @param getRecommenderConfigurationsRequest
     * @return A Java Future containing the result of the GetRecommenderConfigurations operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.GetRecommenderConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetRecommenderConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommenderConfigurationsResult> getRecommenderConfigurationsAsync(
            GetRecommenderConfigurationsRequest getRecommenderConfigurationsRequest);

    /**
     * <p>
     * Retrieves information about all the recommender model configurations that are associated with your Amazon
     * Pinpoint account.
     * </p>
     * 
     * @param getRecommenderConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecommenderConfigurations operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.GetRecommenderConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetRecommenderConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecommenderConfigurationsResult> getRecommenderConfigurationsAsync(
            GetRecommenderConfigurationsRequest getRecommenderConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecommenderConfigurationsRequest, GetRecommenderConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific segment that's
     * associated with an application.
     * </p>
     * 
     * @param getSegmentRequest
     * @return A Java Future containing the result of the GetSegment operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest getSegmentRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific segment that's
     * associated with an application.
     * </p>
     * 
     * @param getSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentResult> getSegmentAsync(GetSegmentRequest getSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentRequest, GetSegmentResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the export jobs for a segment.
     * </p>
     * 
     * @param getSegmentExportJobsRequest
     * @return A Java Future containing the result of the GetSegmentExportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentExportJobsResult> getSegmentExportJobsAsync(GetSegmentExportJobsRequest getSegmentExportJobsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the export jobs for a segment.
     * </p>
     * 
     * @param getSegmentExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentExportJobs operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegmentExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentExportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentExportJobsResult> getSegmentExportJobsAsync(GetSegmentExportJobsRequest getSegmentExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentExportJobsRequest, GetSegmentExportJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the import jobs for a segment.
     * </p>
     * 
     * @param getSegmentImportJobsRequest
     * @return A Java Future containing the result of the GetSegmentImportJobs operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(GetSegmentImportJobsRequest getSegmentImportJobsRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the import jobs for a segment.
     * </p>
     * 
     * @param getSegmentImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentImportJobs operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegmentImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentImportJobsResult> getSegmentImportJobsAsync(GetSegmentImportJobsRequest getSegmentImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentImportJobsRequest, GetSegmentImportJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment
     * that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionRequest
     * @return A Java Future containing the result of the GetSegmentVersion operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(GetSegmentVersionRequest getSegmentVersionRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for a specific version of a segment
     * that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentVersion operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegmentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersion" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionResult> getSegmentVersionAsync(GetSegmentVersionRequest getSegmentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentVersionRequest, GetSegmentVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all the versions of a specific
     * segment that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionsRequest
     * @return A Java Future containing the result of the GetSegmentVersions operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegmentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(GetSegmentVersionsRequest getSegmentVersionsRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all the versions of a specific
     * segment that's associated with an application.
     * </p>
     * 
     * @param getSegmentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegmentVersions operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegmentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentVersionsResult> getSegmentVersionsAsync(GetSegmentVersionsRequest getSegmentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentVersionsRequest, GetSegmentVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all the segments that are
     * associated with an application.
     * </p>
     * 
     * @param getSegmentsRequest
     * @return A Java Future containing the result of the GetSegments operation returned by the service.
     * @sample AmazonPinpointAsync.GetSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(GetSegmentsRequest getSegmentsRequest);

    /**
     * <p>
     * Retrieves information about the configuration, dimension, and other settings for all the segments that are
     * associated with an application.
     * </p>
     * 
     * @param getSegmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSegments operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSegmentsResult> getSegmentsAsync(GetSegmentsRequest getSegmentsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSegmentsRequest, GetSegmentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the SMS channel for an application.
     * </p>
     * 
     * @param getSmsChannelRequest
     * @return A Java Future containing the result of the GetSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSmsChannelResult> getSmsChannelAsync(GetSmsChannelRequest getSmsChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the SMS channel for an application.
     * </p>
     * 
     * @param getSmsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSmsChannelResult> getSmsChannelAsync(GetSmsChannelRequest getSmsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetSmsChannelRequest, GetSmsChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param getSmsTemplateRequest
     * @return A Java Future containing the result of the GetSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.GetSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSmsTemplateResult> getSmsTemplateAsync(GetSmsTemplateRequest getSmsTemplateRequest);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param getSmsTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSmsTemplateResult> getSmsTemplateAsync(GetSmsTemplateRequest getSmsTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetSmsTemplateRequest, GetSmsTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param getUserEndpointsRequest
     * @return A Java Future containing the result of the GetUserEndpoints operation returned by the service.
     * @sample AmazonPinpointAsync.GetUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetUserEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserEndpointsResult> getUserEndpointsAsync(GetUserEndpointsRequest getUserEndpointsRequest);

    /**
     * <p>
     * Retrieves information about all the endpoints that are associated with a specific user ID.
     * </p>
     * 
     * @param getUserEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserEndpoints operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetUserEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetUserEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserEndpointsResult> getUserEndpointsAsync(GetUserEndpointsRequest getUserEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserEndpointsRequest, GetUserEndpointsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status and settings of the voice channel for an application.
     * </p>
     * 
     * @param getVoiceChannelRequest
     * @return A Java Future containing the result of the GetVoiceChannel operation returned by the service.
     * @sample AmazonPinpointAsync.GetVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetVoiceChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceChannelResult> getVoiceChannelAsync(GetVoiceChannelRequest getVoiceChannelRequest);

    /**
     * <p>
     * Retrieves information about the status and settings of the voice channel for an application.
     * </p>
     * 
     * @param getVoiceChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetVoiceChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceChannelResult> getVoiceChannelAsync(GetVoiceChannelRequest getVoiceChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceChannelRequest, GetVoiceChannelResult> asyncHandler);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param getVoiceTemplateRequest
     * @return A Java Future containing the result of the GetVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.GetVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetVoiceTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceTemplateResult> getVoiceTemplateAsync(GetVoiceTemplateRequest getVoiceTemplateRequest);

    /**
     * <p>
     * Retrieves the content and settings of a message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param getVoiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.GetVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetVoiceTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceTemplateResult> getVoiceTemplateAsync(GetVoiceTemplateRequest getVoiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceTemplateRequest, GetVoiceTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all the journeys that are
     * associated with an application.
     * </p>
     * 
     * @param listJourneysRequest
     * @return A Java Future containing the result of the ListJourneys operation returned by the service.
     * @sample AmazonPinpointAsync.ListJourneys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListJourneys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJourneysResult> listJourneysAsync(ListJourneysRequest listJourneysRequest);

    /**
     * <p>
     * Retrieves information about the status, configuration, and other settings for all the journeys that are
     * associated with an application.
     * </p>
     * 
     * @param listJourneysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJourneys operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.ListJourneys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListJourneys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJourneysResult> listJourneysAsync(ListJourneysRequest listJourneysRequest,
            com.amazonaws.handlers.AsyncHandler<ListJourneysRequest, ListJourneysResult> asyncHandler);

    /**
     * <p>
     * Retrieves all the tags (keys and values) that are associated with an application, campaign, message template, or
     * segment.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpointAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves all the tags (keys and values) that are associated with an application, campaign, message template, or
     * segment.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all the versions of a specific message template.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @return A Java Future containing the result of the ListTemplateVersions operation returned by the service.
     * @sample AmazonPinpointAsync.ListTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplateVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateVersionsResult> listTemplateVersionsAsync(ListTemplateVersionsRequest listTemplateVersionsRequest);

    /**
     * <p>
     * Retrieves information about all the versions of a specific message template.
     * </p>
     * 
     * @param listTemplateVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplateVersions operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.ListTemplateVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplateVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTemplateVersionsResult> listTemplateVersionsAsync(ListTemplateVersionsRequest listTemplateVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplateVersionsRequest, ListTemplateVersionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all the message templates that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonPinpointAsync.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Retrieves information about all the message templates that are associated with your Amazon Pinpoint account.
     * </p>
     * 
     * @param listTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTemplates operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTemplatesResult> listTemplatesAsync(ListTemplatesRequest listTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTemplatesRequest, ListTemplatesResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a phone number.
     * </p>
     * 
     * @param phoneNumberValidateRequest
     * @return A Java Future containing the result of the PhoneNumberValidate operation returned by the service.
     * @sample AmazonPinpointAsync.PhoneNumberValidate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PhoneNumberValidate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PhoneNumberValidateResult> phoneNumberValidateAsync(PhoneNumberValidateRequest phoneNumberValidateRequest);

    /**
     * <p>
     * Retrieves information about a phone number.
     * </p>
     * 
     * @param phoneNumberValidateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PhoneNumberValidate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.PhoneNumberValidate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PhoneNumberValidate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PhoneNumberValidateResult> phoneNumberValidateAsync(PhoneNumberValidateRequest phoneNumberValidateRequest,
            com.amazonaws.handlers.AsyncHandler<PhoneNumberValidateRequest, PhoneNumberValidateResult> asyncHandler);

    /**
     * <p>
     * Creates a new event stream for an application or updates the settings of an existing event stream for an
     * application.
     * </p>
     * 
     * @param putEventStreamRequest
     * @return A Java Future containing the result of the PutEventStream operation returned by the service.
     * @sample AmazonPinpointAsync.PutEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(PutEventStreamRequest putEventStreamRequest);

    /**
     * <p>
     * Creates a new event stream for an application or updates the settings of an existing event stream for an
     * application.
     * </p>
     * 
     * @param putEventStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEventStream operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.PutEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventStreamResult> putEventStreamAsync(PutEventStreamRequest putEventStreamRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventStreamRequest, PutEventStreamResult> asyncHandler);

    /**
     * <p>
     * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are
     * associated with.
     * </p>
     * 
     * @param putEventsRequest
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonPinpointAsync.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are
     * associated with.
     * </p>
     * 
     * @param putEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler);

    /**
     * <p>
     * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an
     * application.
     * </p>
     * 
     * @param removeAttributesRequest
     * @return A Java Future containing the result of the RemoveAttributes operation returned by the service.
     * @sample AmazonPinpointAsync.RemoveAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RemoveAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveAttributesResult> removeAttributesAsync(RemoveAttributesRequest removeAttributesRequest);

    /**
     * <p>
     * Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an
     * application.
     * </p>
     * 
     * @param removeAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveAttributes operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.RemoveAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/RemoveAttributes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveAttributesResult> removeAttributesAsync(RemoveAttributesRequest removeAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveAttributesRequest, RemoveAttributesResult> asyncHandler);

    /**
     * <p>
     * Creates and sends a direct message.
     * </p>
     * 
     * @param sendMessagesRequest
     * @return A Java Future containing the result of the SendMessages operation returned by the service.
     * @sample AmazonPinpointAsync.SendMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendMessagesResult> sendMessagesAsync(SendMessagesRequest sendMessagesRequest);

    /**
     * <p>
     * Creates and sends a direct message.
     * </p>
     * 
     * @param sendMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendMessages operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.SendMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendMessagesResult> sendMessagesAsync(SendMessagesRequest sendMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<SendMessagesRequest, SendMessagesResult> asyncHandler);

    /**
     * <p>
     * Creates and sends a message to a list of users.
     * </p>
     * 
     * @param sendUsersMessagesRequest
     * @return A Java Future containing the result of the SendUsersMessages operation returned by the service.
     * @sample AmazonPinpointAsync.SendUsersMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendUsersMessagesResult> sendUsersMessagesAsync(SendUsersMessagesRequest sendUsersMessagesRequest);

    /**
     * <p>
     * Creates and sends a message to a list of users.
     * </p>
     * 
     * @param sendUsersMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendUsersMessages operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.SendUsersMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendUsersMessagesResult> sendUsersMessagesAsync(SendUsersMessagesRequest sendUsersMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<SendUsersMessagesRequest, SendUsersMessagesResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags (keys and values) to an application, campaign, message template, or segment.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPinpointAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags (keys and values) to an application, campaign, message template, or segment.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an application, campaign, message template, or segment.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPinpointAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an application, campaign, message template, or segment.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Enables the ADM channel for an application or updates the status and settings of the ADM channel for an
     * application.
     * </p>
     * 
     * @param updateAdmChannelRequest
     * @return A Java Future containing the result of the UpdateAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAdmChannelResult> updateAdmChannelAsync(UpdateAdmChannelRequest updateAdmChannelRequest);

    /**
     * <p>
     * Enables the ADM channel for an application or updates the status and settings of the ADM channel for an
     * application.
     * </p>
     * 
     * @param updateAdmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAdmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAdmChannelResult> updateAdmChannelAsync(UpdateAdmChannelRequest updateAdmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAdmChannelRequest, UpdateAdmChannelResult> asyncHandler);

    /**
     * <p>
     * Enables the APNs channel for an application or updates the status and settings of the APNs channel for an
     * application.
     * </p>
     * 
     * @param updateApnsChannelRequest
     * @return A Java Future containing the result of the UpdateApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(UpdateApnsChannelRequest updateApnsChannelRequest);

    /**
     * <p>
     * Enables the APNs channel for an application or updates the status and settings of the APNs channel for an
     * application.
     * </p>
     * 
     * @param updateApnsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsChannelResult> updateApnsChannelAsync(UpdateApnsChannelRequest updateApnsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsChannelRequest, UpdateApnsChannelResult> asyncHandler);

    /**
     * <p>
     * Enables the APNs sandbox channel for an application or updates the status and settings of the APNs sandbox
     * channel for an application.
     * </p>
     * 
     * @param updateApnsSandboxChannelRequest
     * @return A Java Future containing the result of the UpdateApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsSandboxChannelResult> updateApnsSandboxChannelAsync(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest);

    /**
     * <p>
     * Enables the APNs sandbox channel for an application or updates the status and settings of the APNs sandbox
     * channel for an application.
     * </p>
     * 
     * @param updateApnsSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsSandboxChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsSandboxChannelResult> updateApnsSandboxChannelAsync(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsSandboxChannelRequest, UpdateApnsSandboxChannelResult> asyncHandler);

    /**
     * <p>
     * Enables the APNs VoIP channel for an application or updates the status and settings of the APNs VoIP channel for
     * an application.
     * </p>
     * 
     * @param updateApnsVoipChannelRequest
     * @return A Java Future containing the result of the UpdateApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipChannelResult> updateApnsVoipChannelAsync(UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest);

    /**
     * <p>
     * Enables the APNs VoIP channel for an application or updates the status and settings of the APNs VoIP channel for
     * an application.
     * </p>
     * 
     * @param updateApnsVoipChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsVoipChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsVoipChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipChannelResult> updateApnsVoipChannelAsync(UpdateApnsVoipChannelRequest updateApnsVoipChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsVoipChannelRequest, UpdateApnsVoipChannelResult> asyncHandler);

    /**
     * <p>
     * Enables the APNs VoIP sandbox channel for an application or updates the status and settings of the APNs VoIP
     * sandbox channel for an application.
     * </p>
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @return A Java Future containing the result of the UpdateApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.UpdateApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipSandboxChannelResult> updateApnsVoipSandboxChannelAsync(
            UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest);

    /**
     * <p>
     * Enables the APNs VoIP sandbox channel for an application or updates the status and settings of the APNs VoIP
     * sandbox channel for an application.
     * </p>
     * 
     * @param updateApnsVoipSandboxChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApnsVoipSandboxChannel operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.UpdateApnsVoipSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsVoipSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApnsVoipSandboxChannelResult> updateApnsVoipSandboxChannelAsync(
            UpdateApnsVoipSandboxChannelRequest updateApnsVoipSandboxChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApnsVoipSandboxChannelRequest, UpdateApnsVoipSandboxChannelResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for an application.
     * </p>
     * 
     * @param updateApplicationSettingsRequest
     * @return A Java Future containing the result of the UpdateApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest);

    /**
     * <p>
     * Updates the settings for an application.
     * </p>
     * 
     * @param updateApplicationSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplicationSettings operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationSettingsResult> updateApplicationSettingsAsync(
            UpdateApplicationSettingsRequest updateApplicationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationSettingsRequest, UpdateApplicationSettingsResult> asyncHandler);

    /**
     * <p>
     * Enables the Baidu channel for an application or updates the status and settings of the Baidu channel for an
     * application.
     * </p>
     * 
     * @param updateBaiduChannelRequest
     * @return A Java Future containing the result of the UpdateBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBaiduChannelResult> updateBaiduChannelAsync(UpdateBaiduChannelRequest updateBaiduChannelRequest);

    /**
     * <p>
     * Enables the Baidu channel for an application or updates the status and settings of the Baidu channel for an
     * application.
     * </p>
     * 
     * @param updateBaiduChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBaiduChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateBaiduChannelResult> updateBaiduChannelAsync(UpdateBaiduChannelRequest updateBaiduChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBaiduChannelRequest, UpdateBaiduChannelResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration and other settings for a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest);

    /**
     * <p>
     * Updates the configuration and other settings for a campaign.
     * </p>
     * 
     * @param updateCampaignRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateCampaign operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateCampaignResult> updateCampaignAsync(UpdateCampaignRequest updateCampaignRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateCampaignRequest, UpdateCampaignResult> asyncHandler);

    /**
     * <p>
     * Enables the email channel for an application or updates the status and settings of the email channel for an
     * application.
     * </p>
     * 
     * @param updateEmailChannelRequest
     * @return A Java Future containing the result of the UpdateEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmailChannelResult> updateEmailChannelAsync(UpdateEmailChannelRequest updateEmailChannelRequest);

    /**
     * <p>
     * Enables the email channel for an application or updates the status and settings of the email channel for an
     * application.
     * </p>
     * 
     * @param updateEmailChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEmailChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmailChannelResult> updateEmailChannelAsync(UpdateEmailChannelRequest updateEmailChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEmailChannelRequest, UpdateEmailChannelResult> asyncHandler);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param updateEmailTemplateRequest
     * @return A Java Future containing the result of the UpdateEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmailTemplateResult> updateEmailTemplateAsync(UpdateEmailTemplateRequest updateEmailTemplateRequest);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the email channel.
     * </p>
     * 
     * @param updateEmailTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEmailTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateEmailTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmailTemplateResult> updateEmailTemplateAsync(UpdateEmailTemplateRequest updateEmailTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEmailTemplateRequest, UpdateEmailTemplateResult> asyncHandler);

    /**
     * <p>
     * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an
     * application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes
     * properties) for an endpoint.
     * </p>
     * 
     * @param updateEndpointRequest
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest);

    /**
     * <p>
     * Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an
     * application. You can also use this operation to define custom attributes (Attributes, Metrics, and UserAttributes
     * properties) for an endpoint.
     * </p>
     * 
     * @param updateEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpoint operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointResult> updateEndpointAsync(UpdateEndpointRequest updateEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing
     * endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics,
     * and UserAttributes properties) for a batch of endpoints.
     * </p>
     * 
     * @param updateEndpointsBatchRequest
     * @return A Java Future containing the result of the UpdateEndpointsBatch operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateEndpointsBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpointsBatch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(UpdateEndpointsBatchRequest updateEndpointsBatchRequest);

    /**
     * <p>
     * Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing
     * endpoints for an application. You can also use this operation to define custom attributes (Attributes, Metrics,
     * and UserAttributes properties) for a batch of endpoints.
     * </p>
     * 
     * @param updateEndpointsBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEndpointsBatch operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateEndpointsBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpointsBatch" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEndpointsBatchResult> updateEndpointsBatchAsync(UpdateEndpointsBatchRequest updateEndpointsBatchRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEndpointsBatchRequest, UpdateEndpointsBatchResult> asyncHandler);

    /**
     * <p>
     * Enables the GCM channel for an application or updates the status and settings of the GCM channel for an
     * application.
     * </p>
     * 
     * @param updateGcmChannelRequest
     * @return A Java Future containing the result of the UpdateGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(UpdateGcmChannelRequest updateGcmChannelRequest);

    /**
     * <p>
     * Enables the GCM channel for an application or updates the status and settings of the GCM channel for an
     * application.
     * </p>
     * 
     * @param updateGcmChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGcmChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGcmChannelResult> updateGcmChannelAsync(UpdateGcmChannelRequest updateGcmChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGcmChannelRequest, UpdateGcmChannelResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration and other settings for a journey.
     * </p>
     * 
     * @param updateJourneyRequest
     * @return A Java Future containing the result of the UpdateJourney operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJourneyResult> updateJourneyAsync(UpdateJourneyRequest updateJourneyRequest);

    /**
     * <p>
     * Updates the configuration and other settings for a journey.
     * </p>
     * 
     * @param updateJourneyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJourney operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateJourney
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateJourney" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJourneyResult> updateJourneyAsync(UpdateJourneyRequest updateJourneyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJourneyRequest, UpdateJourneyResult> asyncHandler);

    /**
     * <p>
     * Cancels (stops) an active journey.
     * </p>
     * 
     * @param updateJourneyStateRequest
     * @return A Java Future containing the result of the UpdateJourneyState operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateJourneyState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateJourneyState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJourneyStateResult> updateJourneyStateAsync(UpdateJourneyStateRequest updateJourneyStateRequest);

    /**
     * <p>
     * Cancels (stops) an active journey.
     * </p>
     * 
     * @param updateJourneyStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJourneyState operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateJourneyState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateJourneyState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJourneyStateResult> updateJourneyStateAsync(UpdateJourneyStateRequest updateJourneyStateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJourneyStateRequest, UpdateJourneyStateResult> asyncHandler);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through a push notification channel.
     * </p>
     * 
     * @param updatePushTemplateRequest
     * @return A Java Future containing the result of the UpdatePushTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.UpdatePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdatePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePushTemplateResult> updatePushTemplateAsync(UpdatePushTemplateRequest updatePushTemplateRequest);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through a push notification channel.
     * </p>
     * 
     * @param updatePushTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePushTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdatePushTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdatePushTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePushTemplateResult> updatePushTemplateAsync(UpdatePushTemplateRequest updatePushTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePushTemplateRequest, UpdatePushTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param updateRecommenderConfigurationRequest
     * @return A Java Future containing the result of the UpdateRecommenderConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointAsync.UpdateRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecommenderConfigurationResult> updateRecommenderConfigurationAsync(
            UpdateRecommenderConfigurationRequest updateRecommenderConfigurationRequest);

    /**
     * <p>
     * Updates an Amazon Pinpoint configuration for a recommender model.
     * </p>
     * 
     * @param updateRecommenderConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecommenderConfiguration operation returned by the
     *         service.
     * @sample AmazonPinpointAsyncHandler.UpdateRecommenderConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateRecommenderConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecommenderConfigurationResult> updateRecommenderConfigurationAsync(
            UpdateRecommenderConfigurationRequest updateRecommenderConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecommenderConfigurationRequest, UpdateRecommenderConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param updateSegmentRequest
     * @return A Java Future containing the result of the UpdateSegment operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(UpdateSegmentRequest updateSegmentRequest);

    /**
     * <p>
     * Creates a new segment for an application or updates the configuration, dimension, and other settings for an
     * existing segment that's associated with an application.
     * </p>
     * 
     * @param updateSegmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSegment operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSegmentResult> updateSegmentAsync(UpdateSegmentRequest updateSegmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSegmentRequest, UpdateSegmentResult> asyncHandler);

    /**
     * <p>
     * Enables the SMS channel for an application or updates the status and settings of the SMS channel for an
     * application.
     * </p>
     * 
     * @param updateSmsChannelRequest
     * @return A Java Future containing the result of the UpdateSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSmsChannelResult> updateSmsChannelAsync(UpdateSmsChannelRequest updateSmsChannelRequest);

    /**
     * <p>
     * Enables the SMS channel for an application or updates the status and settings of the SMS channel for an
     * application.
     * </p>
     * 
     * @param updateSmsChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSmsChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSmsChannelResult> updateSmsChannelAsync(UpdateSmsChannelRequest updateSmsChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSmsChannelRequest, UpdateSmsChannelResult> asyncHandler);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param updateSmsTemplateRequest
     * @return A Java Future containing the result of the UpdateSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSmsTemplateResult> updateSmsTemplateAsync(UpdateSmsTemplateRequest updateSmsTemplateRequest);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the SMS channel.
     * </p>
     * 
     * @param updateSmsTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSmsTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateSmsTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSmsTemplateResult> updateSmsTemplateAsync(UpdateSmsTemplateRequest updateSmsTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSmsTemplateRequest, UpdateSmsTemplateResult> asyncHandler);

    /**
     * <p>
     * Changes the status of a specific version of a message template to <i>active</i>.
     * </p>
     * 
     * @param updateTemplateActiveVersionRequest
     * @return A Java Future containing the result of the UpdateTemplateActiveVersion operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateTemplateActiveVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateTemplateActiveVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateActiveVersionResult> updateTemplateActiveVersionAsync(
            UpdateTemplateActiveVersionRequest updateTemplateActiveVersionRequest);

    /**
     * <p>
     * Changes the status of a specific version of a message template to <i>active</i>.
     * </p>
     * 
     * @param updateTemplateActiveVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTemplateActiveVersion operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateTemplateActiveVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateTemplateActiveVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTemplateActiveVersionResult> updateTemplateActiveVersionAsync(
            UpdateTemplateActiveVersionRequest updateTemplateActiveVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTemplateActiveVersionRequest, UpdateTemplateActiveVersionResult> asyncHandler);

    /**
     * <p>
     * Enables the voice channel for an application or updates the status and settings of the voice channel for an
     * application.
     * </p>
     * 
     * @param updateVoiceChannelRequest
     * @return A Java Future containing the result of the UpdateVoiceChannel operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceChannelResult> updateVoiceChannelAsync(UpdateVoiceChannelRequest updateVoiceChannelRequest);

    /**
     * <p>
     * Enables the voice channel for an application or updates the status and settings of the voice channel for an
     * application.
     * </p>
     * 
     * @param updateVoiceChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceChannel operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateVoiceChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateVoiceChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceChannelResult> updateVoiceChannelAsync(UpdateVoiceChannelRequest updateVoiceChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceChannelRequest, UpdateVoiceChannelResult> asyncHandler);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param updateVoiceTemplateRequest
     * @return A Java Future containing the result of the UpdateVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsync.UpdateVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceTemplateResult> updateVoiceTemplateAsync(UpdateVoiceTemplateRequest updateVoiceTemplateRequest);

    /**
     * <p>
     * Updates an existing message template for messages that are sent through the voice channel.
     * </p>
     * 
     * @param updateVoiceTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceTemplate operation returned by the service.
     * @sample AmazonPinpointAsyncHandler.UpdateVoiceTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateVoiceTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceTemplateResult> updateVoiceTemplateAsync(UpdateVoiceTemplateRequest updateVoiceTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceTemplateRequest, UpdateVoiceTemplateResult> asyncHandler);

}
