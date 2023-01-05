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
package com.amazonaws.services.mediatailor;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;

/**
 * Interface for accessing MediaTailor asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediatailor.AbstractAWSMediaTailorAsync} instead.
 * </p>
 * <p>
 * <p>
 * Use the AWS Elemental MediaTailor SDKs and CLI to configure scalable ad insertion and linear channels. With
 * MediaTailor, you can assemble existing content into a linear stream and serve targeted ads to viewers while
 * maintaining broadcast quality in over-the-top (OTT) video applications. For information about using the service,
 * including detailed information about the settings covered in this guide, see the <a
 * href="https://docs.aws.amazon.com/mediatailor/latest/ug/">AWS Elemental MediaTailor User Guide</a>.
 * </p>
 * <p>
 * Through the SDKs and the CLI you manage AWS Elemental MediaTailor configurations and channels the same as you do
 * through the console. For example, you specify ad insertion behavior and mapping information for the origin server and
 * the ad decision server (ADS).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaTailorAsync extends AWSMediaTailor {

    /**
     * <p>
     * Amazon CloudWatch log settings for a playback configuration.
     * </p>
     * 
     * @param configureLogsForPlaybackConfigurationRequest
     *        Configures Amazon CloudWatch log settings for a playback configuration.
     * @return A Java Future containing the result of the ConfigureLogsForPlaybackConfiguration operation returned by
     *         the service.
     * @sample AWSMediaTailorAsync.ConfigureLogsForPlaybackConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ConfigureLogsForPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureLogsForPlaybackConfigurationResult> configureLogsForPlaybackConfigurationAsync(
            ConfigureLogsForPlaybackConfigurationRequest configureLogsForPlaybackConfigurationRequest);

    /**
     * <p>
     * Amazon CloudWatch log settings for a playback configuration.
     * </p>
     * 
     * @param configureLogsForPlaybackConfigurationRequest
     *        Configures Amazon CloudWatch log settings for a playback configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfigureLogsForPlaybackConfiguration operation returned by
     *         the service.
     * @sample AWSMediaTailorAsyncHandler.ConfigureLogsForPlaybackConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ConfigureLogsForPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfigureLogsForPlaybackConfigurationResult> configureLogsForPlaybackConfigurationAsync(
            ConfigureLogsForPlaybackConfigurationRequest configureLogsForPlaybackConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ConfigureLogsForPlaybackConfigurationRequest, ConfigureLogsForPlaybackConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createChannelRequest
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaTailorAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Creates a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * <p>
     * The live source configuration.
     * </p>
     * 
     * @param createLiveSourceRequest
     * @return A Java Future containing the result of the CreateLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsync.CreateLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLiveSourceResult> createLiveSourceAsync(CreateLiveSourceRequest createLiveSourceRequest);

    /**
     * <p>
     * The live source configuration.
     * </p>
     * 
     * @param createLiveSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.CreateLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateLiveSourceResult> createLiveSourceAsync(CreateLiveSourceRequest createLiveSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLiveSourceRequest, CreateLiveSourceResult> asyncHandler);

    /**
     * <p>
     * Creates a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to
     * fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createPrefetchScheduleRequest
     * @return A Java Future containing the result of the CreatePrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailorAsync.CreatePrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreatePrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrefetchScheduleResult> createPrefetchScheduleAsync(CreatePrefetchScheduleRequest createPrefetchScheduleRequest);

    /**
     * <p>
     * Creates a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to
     * fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createPrefetchScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.CreatePrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreatePrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrefetchScheduleResult> createPrefetchScheduleAsync(CreatePrefetchScheduleRequest createPrefetchScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePrefetchScheduleRequest, CreatePrefetchScheduleResult> asyncHandler);

    /**
     * <p>
     * Creates a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createProgramRequest
     * @return A Java Future containing the result of the CreateProgram operation returned by the service.
     * @sample AWSMediaTailorAsync.CreateProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateProgram" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProgramResult> createProgramAsync(CreateProgramRequest createProgramRequest);

    /**
     * <p>
     * Creates a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createProgramRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProgram operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.CreateProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateProgram" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProgramResult> createProgramAsync(CreateProgramRequest createProgramRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProgramRequest, CreateProgramResult> asyncHandler);

    /**
     * <p>
     * Creates a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createSourceLocationRequest
     * @return A Java Future containing the result of the CreateSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsync.CreateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSourceLocationResult> createSourceLocationAsync(CreateSourceLocationRequest createSourceLocationRequest);

    /**
     * <p>
     * Creates a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createSourceLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.CreateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSourceLocationResult> createSourceLocationAsync(CreateSourceLocationRequest createSourceLocationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSourceLocationRequest, CreateSourceLocationResult> asyncHandler);

    /**
     * <p>
     * The VOD source configuration parameters.
     * </p>
     * 
     * @param createVodSourceRequest
     * @return A Java Future containing the result of the CreateVodSource operation returned by the service.
     * @sample AWSMediaTailorAsync.CreateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVodSourceResult> createVodSourceAsync(CreateVodSourceRequest createVodSourceRequest);

    /**
     * <p>
     * The VOD source configuration parameters.
     * </p>
     * 
     * @param createVodSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVodSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.CreateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateVodSourceResult> createVodSourceAsync(CreateVodSourceRequest createVodSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVodSourceRequest, CreateVodSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaTailorAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Deletes a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * <p>
     * The channel policy to delete.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @return A Java Future containing the result of the DeleteChannelPolicy operation returned by the service.
     * @sample AWSMediaTailorAsync.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(DeleteChannelPolicyRequest deleteChannelPolicyRequest);

    /**
     * <p>
     * The channel policy to delete.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelPolicy operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelPolicyResult> deleteChannelPolicyAsync(DeleteChannelPolicyRequest deleteChannelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelPolicyRequest, DeleteChannelPolicyResult> asyncHandler);

    /**
     * <p>
     * The live source to delete.
     * </p>
     * 
     * @param deleteLiveSourceRequest
     * @return A Java Future containing the result of the DeleteLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsync.DeleteLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLiveSourceResult> deleteLiveSourceAsync(DeleteLiveSourceRequest deleteLiveSourceRequest);

    /**
     * <p>
     * The live source to delete.
     * </p>
     * 
     * @param deleteLiveSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeleteLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLiveSourceResult> deleteLiveSourceAsync(DeleteLiveSourceRequest deleteLiveSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLiveSourceRequest, DeleteLiveSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @return A Java Future containing the result of the DeletePlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsync.DeletePlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(
            DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest);

    /**
     * <p>
     * Deletes a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeletePlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlaybackConfigurationResult> deletePlaybackConfigurationAsync(
            DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePlaybackConfigurationRequest, DeletePlaybackConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes a prefetch schedule for a specific playback configuration. If you call
     * <code>DeletePrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
     * For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deletePrefetchScheduleRequest
     * @return A Java Future containing the result of the DeletePrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailorAsync.DeletePrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePrefetchScheduleResult> deletePrefetchScheduleAsync(DeletePrefetchScheduleRequest deletePrefetchScheduleRequest);

    /**
     * <p>
     * Deletes a prefetch schedule for a specific playback configuration. If you call
     * <code>DeletePrefetchSchedule</code> on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
     * For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deletePrefetchScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeletePrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePrefetchScheduleResult> deletePrefetchScheduleAsync(DeletePrefetchScheduleRequest deletePrefetchScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePrefetchScheduleRequest, DeletePrefetchScheduleResult> asyncHandler);

    /**
     * <p>
     * Deletes a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteProgramRequest
     * @return A Java Future containing the result of the DeleteProgram operation returned by the service.
     * @sample AWSMediaTailorAsync.DeleteProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteProgram" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProgramResult> deleteProgramAsync(DeleteProgramRequest deleteProgramRequest);

    /**
     * <p>
     * Deletes a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteProgramRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProgram operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeleteProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteProgram" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProgramResult> deleteProgramAsync(DeleteProgramRequest deleteProgramRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProgramRequest, DeleteProgramResult> asyncHandler);

    /**
     * <p>
     * Deletes a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteSourceLocationRequest
     * @return A Java Future containing the result of the DeleteSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsync.DeleteSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceLocationResult> deleteSourceLocationAsync(DeleteSourceLocationRequest deleteSourceLocationRequest);

    /**
     * <p>
     * Deletes a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteSourceLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeleteSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSourceLocationResult> deleteSourceLocationAsync(DeleteSourceLocationRequest deleteSourceLocationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSourceLocationRequest, DeleteSourceLocationResult> asyncHandler);

    /**
     * <p>
     * The video on demand (VOD) source to delete.
     * </p>
     * 
     * @param deleteVodSourceRequest
     * @return A Java Future containing the result of the DeleteVodSource operation returned by the service.
     * @sample AWSMediaTailorAsync.DeleteVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVodSourceResult> deleteVodSourceAsync(DeleteVodSourceRequest deleteVodSourceRequest);

    /**
     * <p>
     * The video on demand (VOD) source to delete.
     * </p>
     * 
     * @param deleteVodSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVodSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DeleteVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVodSourceResult> deleteVodSourceAsync(DeleteVodSourceRequest deleteVodSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVodSourceRequest, DeleteVodSourceResult> asyncHandler);

    /**
     * <p>
     * Describes a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeChannelRequest
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaTailorAsync.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest);

    /**
     * <p>
     * Describes a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler);

    /**
     * <p>
     * The live source to describe.
     * </p>
     * 
     * @param describeLiveSourceRequest
     * @return A Java Future containing the result of the DescribeLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsync.DescribeLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLiveSourceResult> describeLiveSourceAsync(DescribeLiveSourceRequest describeLiveSourceRequest);

    /**
     * <p>
     * The live source to describe.
     * </p>
     * 
     * @param describeLiveSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DescribeLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLiveSourceResult> describeLiveSourceAsync(DescribeLiveSourceRequest describeLiveSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLiveSourceRequest, DescribeLiveSourceResult> asyncHandler);

    /**
     * <p>
     * Describes a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeProgramRequest
     * @return A Java Future containing the result of the DescribeProgram operation returned by the service.
     * @sample AWSMediaTailorAsync.DescribeProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeProgram" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProgramResult> describeProgramAsync(DescribeProgramRequest describeProgramRequest);

    /**
     * <p>
     * Describes a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeProgramRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProgram operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DescribeProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeProgram" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProgramResult> describeProgramAsync(DescribeProgramRequest describeProgramRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProgramRequest, DescribeProgramResult> asyncHandler);

    /**
     * <p>
     * Describes a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeSourceLocationRequest
     * @return A Java Future containing the result of the DescribeSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsync.DescribeSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceLocationResult> describeSourceLocationAsync(DescribeSourceLocationRequest describeSourceLocationRequest);

    /**
     * <p>
     * Describes a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeSourceLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DescribeSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSourceLocationResult> describeSourceLocationAsync(DescribeSourceLocationRequest describeSourceLocationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSourceLocationRequest, DescribeSourceLocationResult> asyncHandler);

    /**
     * <p>
     * Provides details about a specific video on demand (VOD) source in a specific source location.
     * </p>
     * 
     * @param describeVodSourceRequest
     * @return A Java Future containing the result of the DescribeVodSource operation returned by the service.
     * @sample AWSMediaTailorAsync.DescribeVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVodSourceResult> describeVodSourceAsync(DescribeVodSourceRequest describeVodSourceRequest);

    /**
     * <p>
     * Provides details about a specific video on demand (VOD) source in a specific source location.
     * </p>
     * 
     * @param describeVodSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVodSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.DescribeVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVodSourceResult> describeVodSourceAsync(DescribeVodSourceRequest describeVodSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVodSourceRequest, DescribeVodSourceResult> asyncHandler);

    /**
     * <p>
     * Returns the channel's IAM policy. IAM policies are used to control access to your channel.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @return A Java Future containing the result of the GetChannelPolicy operation returned by the service.
     * @sample AWSMediaTailorAsync.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(GetChannelPolicyRequest getChannelPolicyRequest);

    /**
     * <p>
     * Returns the channel's IAM policy. IAM policies are used to control access to your channel.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannelPolicy operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelPolicyResult> getChannelPolicyAsync(GetChannelPolicyRequest getChannelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelPolicyRequest, GetChannelPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about your channel's schedule.
     * </p>
     * 
     * @param getChannelScheduleRequest
     * @return A Java Future containing the result of the GetChannelSchedule operation returned by the service.
     * @sample AWSMediaTailorAsync.GetChannelSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelScheduleResult> getChannelScheduleAsync(GetChannelScheduleRequest getChannelScheduleRequest);

    /**
     * <p>
     * Retrieves information about your channel's schedule.
     * </p>
     * 
     * @param getChannelScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannelSchedule operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.GetChannelSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelScheduleResult> getChannelScheduleAsync(GetChannelScheduleRequest getChannelScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelScheduleRequest, GetChannelScheduleResult> asyncHandler);

    /**
     * <p>
     * Retrieves a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @return A Java Future containing the result of the GetPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsync.GetPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest getPlaybackConfigurationRequest);

    /**
     * <p>
     * Retrieves a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.GetPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlaybackConfigurationResult> getPlaybackConfigurationAsync(GetPlaybackConfigurationRequest getPlaybackConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetPlaybackConfigurationRequest, GetPlaybackConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to
     * fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param getPrefetchScheduleRequest
     * @return A Java Future containing the result of the GetPrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailorAsync.GetPrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPrefetchScheduleResult> getPrefetchScheduleAsync(GetPrefetchScheduleRequest getPrefetchScheduleRequest);

    /**
     * <p>
     * Retrieves a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to
     * fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param getPrefetchScheduleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.GetPrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPrefetchScheduleResult> getPrefetchScheduleAsync(GetPrefetchScheduleRequest getPrefetchScheduleRequest,
            com.amazonaws.handlers.AsyncHandler<GetPrefetchScheduleRequest, GetPrefetchScheduleResult> asyncHandler);

    /**
     * <p>
     * Lists the alerts that are associated with a MediaTailor channel assembly resource.
     * </p>
     * 
     * @param listAlertsRequest
     * @return A Java Future containing the result of the ListAlerts operation returned by the service.
     * @sample AWSMediaTailorAsync.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(ListAlertsRequest listAlertsRequest);

    /**
     * <p>
     * Lists the alerts that are associated with a MediaTailor channel assembly resource.
     * </p>
     * 
     * @param listAlertsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAlerts operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAlertsResult> listAlertsAsync(ListAlertsRequest listAlertsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAlertsRequest, ListAlertsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the channels that are associated with the current AWS account.
     * </p>
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaTailorAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Retrieves information about the channels that are associated with the current AWS account.
     * </p>
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * <p>
     * Lists the live sources contained in a source location. A source represents a piece of content.
     * </p>
     * 
     * @param listLiveSourcesRequest
     * @return A Java Future containing the result of the ListLiveSources operation returned by the service.
     * @sample AWSMediaTailorAsync.ListLiveSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListLiveSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLiveSourcesResult> listLiveSourcesAsync(ListLiveSourcesRequest listLiveSourcesRequest);

    /**
     * <p>
     * Lists the live sources contained in a source location. A source represents a piece of content.
     * </p>
     * 
     * @param listLiveSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLiveSources operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListLiveSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListLiveSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLiveSourcesResult> listLiveSourcesAsync(ListLiveSourcesRequest listLiveSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListLiveSourcesRequest, ListLiveSourcesResult> asyncHandler);

    /**
     * <p>
     * Retrieves existing playback configurations. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with Configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @return A Java Future containing the result of the ListPlaybackConfigurations operation returned by the service.
     * @sample AWSMediaTailorAsync.ListPlaybackConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPlaybackConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(
            ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest);

    /**
     * <p>
     * Retrieves existing playback configurations. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with Configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlaybackConfigurations operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListPlaybackConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPlaybackConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPlaybackConfigurationsResult> listPlaybackConfigurationsAsync(
            ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPlaybackConfigurationsRequest, ListPlaybackConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists the prefetch schedules for a playback configuration.
     * </p>
     * 
     * @param listPrefetchSchedulesRequest
     * @return A Java Future containing the result of the ListPrefetchSchedules operation returned by the service.
     * @sample AWSMediaTailorAsync.ListPrefetchSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPrefetchSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPrefetchSchedulesResult> listPrefetchSchedulesAsync(ListPrefetchSchedulesRequest listPrefetchSchedulesRequest);

    /**
     * <p>
     * Lists the prefetch schedules for a playback configuration.
     * </p>
     * 
     * @param listPrefetchSchedulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPrefetchSchedules operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListPrefetchSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPrefetchSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPrefetchSchedulesResult> listPrefetchSchedulesAsync(ListPrefetchSchedulesRequest listPrefetchSchedulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPrefetchSchedulesRequest, ListPrefetchSchedulesResult> asyncHandler);

    /**
     * <p>
     * Lists the source locations for a channel. A source location defines the host server URL, and contains a list of
     * sources.
     * </p>
     * 
     * @param listSourceLocationsRequest
     * @return A Java Future containing the result of the ListSourceLocations operation returned by the service.
     * @sample AWSMediaTailorAsync.ListSourceLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListSourceLocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceLocationsResult> listSourceLocationsAsync(ListSourceLocationsRequest listSourceLocationsRequest);

    /**
     * <p>
     * Lists the source locations for a channel. A source location defines the host server URL, and contains a list of
     * sources.
     * </p>
     * 
     * @param listSourceLocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSourceLocations operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListSourceLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListSourceLocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSourceLocationsResult> listSourceLocationsAsync(ListSourceLocationsRequest listSourceLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSourceLocationsRequest, ListSourceLocationsResult> asyncHandler);

    /**
     * <p>
     * A list of tags that are associated with this resource. Tags are key-value pairs that you can associate with
     * Amazon resources to help with organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaTailorAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * A list of tags that are associated with this resource. Tags are key-value pairs that you can associate with
     * Amazon resources to help with organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the VOD sources contained in a source location. A source represents a piece of content.
     * </p>
     * 
     * @param listVodSourcesRequest
     * @return A Java Future containing the result of the ListVodSources operation returned by the service.
     * @sample AWSMediaTailorAsync.ListVodSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListVodSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVodSourcesResult> listVodSourcesAsync(ListVodSourcesRequest listVodSourcesRequest);

    /**
     * <p>
     * Lists the VOD sources contained in a source location. A source represents a piece of content.
     * </p>
     * 
     * @param listVodSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVodSources operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.ListVodSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListVodSources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVodSourcesResult> listVodSourcesAsync(ListVodSourcesRequest listVodSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVodSourcesRequest, ListVodSourcesResult> asyncHandler);

    /**
     * <p>
     * Creates an IAM policy for the channel. IAM policies are used to control access to your channel.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @return A Java Future containing the result of the PutChannelPolicy operation returned by the service.
     * @sample AWSMediaTailorAsync.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(PutChannelPolicyRequest putChannelPolicyRequest);

    /**
     * <p>
     * Creates an IAM policy for the channel. IAM policies are used to control access to your channel.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutChannelPolicy operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutChannelPolicyResult> putChannelPolicyAsync(PutChannelPolicyRequest putChannelPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutChannelPolicyRequest, PutChannelPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @return A Java Future containing the result of the PutPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsync.PutPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest putPlaybackConfigurationRequest);

    /**
     * <p>
     * Creates a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.PutPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutPlaybackConfigurationResult> putPlaybackConfigurationAsync(PutPlaybackConfigurationRequest putPlaybackConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutPlaybackConfigurationRequest, PutPlaybackConfigurationResult> asyncHandler);

    /**
     * <p>
     * Starts a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param startChannelRequest
     * @return A Java Future containing the result of the StartChannel operation returned by the service.
     * @sample AWSMediaTailorAsync.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest startChannelRequest);

    /**
     * <p>
     * Starts a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param startChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartChannel operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartChannelResult> startChannelAsync(StartChannelRequest startChannelRequest,
            com.amazonaws.handlers.AsyncHandler<StartChannelRequest, StartChannelResult> asyncHandler);

    /**
     * <p>
     * Stops a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param stopChannelRequest
     * @return A Java Future containing the result of the StopChannel operation returned by the service.
     * @sample AWSMediaTailorAsync.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest stopChannelRequest);

    /**
     * <p>
     * Stops a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param stopChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopChannel operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopChannelResult> stopChannelAsync(StopChannelRequest stopChannelRequest,
            com.amazonaws.handlers.AsyncHandler<StopChannelRequest, StopChannelResult> asyncHandler);

    /**
     * <p>
     * The resource to tag. Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaTailorAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The resource to tag. Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * The resource to untag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaTailorAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * The resource to untag.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param updateChannelRequest
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaTailorAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param updateChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

    /**
     * <p>
     * Updates a live source's configuration.
     * </p>
     * 
     * @param updateLiveSourceRequest
     * @return A Java Future containing the result of the UpdateLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsync.UpdateLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLiveSourceResult> updateLiveSourceAsync(UpdateLiveSourceRequest updateLiveSourceRequest);

    /**
     * <p>
     * Updates a live source's configuration.
     * </p>
     * 
     * @param updateLiveSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLiveSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.UpdateLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLiveSourceResult> updateLiveSourceAsync(UpdateLiveSourceRequest updateLiveSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLiveSourceRequest, UpdateLiveSourceResult> asyncHandler);

    /**
     * <p>
     * Updates a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param updateSourceLocationRequest
     * @return A Java Future containing the result of the UpdateSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsync.UpdateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSourceLocationResult> updateSourceLocationAsync(UpdateSourceLocationRequest updateSourceLocationRequest);

    /**
     * <p>
     * Updates a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param updateSourceLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSourceLocation operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.UpdateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSourceLocationResult> updateSourceLocationAsync(UpdateSourceLocationRequest updateSourceLocationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSourceLocationRequest, UpdateSourceLocationResult> asyncHandler);

    /**
     * <p>
     * Updates a VOD source's configuration.
     * </p>
     * 
     * @param updateVodSourceRequest
     * @return A Java Future containing the result of the UpdateVodSource operation returned by the service.
     * @sample AWSMediaTailorAsync.UpdateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVodSourceResult> updateVodSourceAsync(UpdateVodSourceRequest updateVodSourceRequest);

    /**
     * <p>
     * Updates a VOD source's configuration.
     * </p>
     * 
     * @param updateVodSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVodSource operation returned by the service.
     * @sample AWSMediaTailorAsyncHandler.UpdateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVodSourceResult> updateVodSourceAsync(UpdateVodSourceRequest updateVodSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVodSourceRequest, UpdateVodSourceResult> asyncHandler);

}
