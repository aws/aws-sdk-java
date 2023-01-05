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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediatailor.model.*;

/**
 * Interface for accessing MediaTailor.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediatailor.AbstractAWSMediaTailor} instead.
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
public interface AWSMediaTailor {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.mediatailor";

    /**
     * <p>
     * Amazon CloudWatch log settings for a playback configuration.
     * </p>
     * 
     * @param configureLogsForPlaybackConfigurationRequest
     *        Configures Amazon CloudWatch log settings for a playback configuration.
     * @return Result of the ConfigureLogsForPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.ConfigureLogsForPlaybackConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ConfigureLogsForPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ConfigureLogsForPlaybackConfigurationResult configureLogsForPlaybackConfiguration(
            ConfigureLogsForPlaybackConfigurationRequest configureLogsForPlaybackConfigurationRequest);

    /**
     * <p>
     * Creates a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createChannelRequest
     * @return Result of the CreateChannel operation returned by the service.
     * @sample AWSMediaTailor.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * The live source configuration.
     * </p>
     * 
     * @param createLiveSourceRequest
     * @return Result of the CreateLiveSource operation returned by the service.
     * @sample AWSMediaTailor.CreateLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    CreateLiveSourceResult createLiveSource(CreateLiveSourceRequest createLiveSourceRequest);

    /**
     * <p>
     * Creates a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to
     * fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createPrefetchScheduleRequest
     * @return Result of the CreatePrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailor.CreatePrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreatePrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePrefetchScheduleResult createPrefetchSchedule(CreatePrefetchScheduleRequest createPrefetchScheduleRequest);

    /**
     * <p>
     * Creates a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createProgramRequest
     * @return Result of the CreateProgram operation returned by the service.
     * @sample AWSMediaTailor.CreateProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateProgram" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProgramResult createProgram(CreateProgramRequest createProgramRequest);

    /**
     * <p>
     * Creates a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param createSourceLocationRequest
     * @return Result of the CreateSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.CreateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSourceLocationResult createSourceLocation(CreateSourceLocationRequest createSourceLocationRequest);

    /**
     * <p>
     * The VOD source configuration parameters.
     * </p>
     * 
     * @param createVodSourceRequest
     * @return Result of the CreateVodSource operation returned by the service.
     * @sample AWSMediaTailor.CreateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CreateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    CreateVodSourceResult createVodSource(CreateVodSourceRequest createVodSourceRequest);

    /**
     * <p>
     * Deletes a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return Result of the DeleteChannel operation returned by the service.
     * @sample AWSMediaTailor.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * The channel policy to delete.
     * </p>
     * 
     * @param deleteChannelPolicyRequest
     * @return Result of the DeleteChannelPolicy operation returned by the service.
     * @sample AWSMediaTailor.DeleteChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteChannelPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelPolicyResult deleteChannelPolicy(DeleteChannelPolicyRequest deleteChannelPolicyRequest);

    /**
     * <p>
     * The live source to delete.
     * </p>
     * 
     * @param deleteLiveSourceRequest
     * @return Result of the DeleteLiveSource operation returned by the service.
     * @sample AWSMediaTailor.DeleteLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLiveSourceResult deleteLiveSource(DeleteLiveSourceRequest deleteLiveSourceRequest);

    /**
     * <p>
     * Deletes a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param deletePlaybackConfigurationRequest
     * @return Result of the DeletePlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.DeletePlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePlaybackConfigurationResult deletePlaybackConfiguration(DeletePlaybackConfigurationRequest deletePlaybackConfigurationRequest);

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
     * @return Result of the DeletePrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailor.DeletePrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeletePrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePrefetchScheduleResult deletePrefetchSchedule(DeletePrefetchScheduleRequest deletePrefetchScheduleRequest);

    /**
     * <p>
     * Deletes a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteProgramRequest
     * @return Result of the DeleteProgram operation returned by the service.
     * @sample AWSMediaTailor.DeleteProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteProgram" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProgramResult deleteProgram(DeleteProgramRequest deleteProgramRequest);

    /**
     * <p>
     * Deletes a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param deleteSourceLocationRequest
     * @return Result of the DeleteSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.DeleteSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSourceLocationResult deleteSourceLocation(DeleteSourceLocationRequest deleteSourceLocationRequest);

    /**
     * <p>
     * The video on demand (VOD) source to delete.
     * </p>
     * 
     * @param deleteVodSourceRequest
     * @return Result of the DeleteVodSource operation returned by the service.
     * @sample AWSMediaTailor.DeleteVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DeleteVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteVodSourceResult deleteVodSource(DeleteVodSourceRequest deleteVodSourceRequest);

    /**
     * <p>
     * Describes a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeChannelRequest
     * @return Result of the DescribeChannel operation returned by the service.
     * @sample AWSMediaTailor.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest);

    /**
     * <p>
     * The live source to describe.
     * </p>
     * 
     * @param describeLiveSourceRequest
     * @return Result of the DescribeLiveSource operation returned by the service.
     * @sample AWSMediaTailor.DescribeLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLiveSourceResult describeLiveSource(DescribeLiveSourceRequest describeLiveSourceRequest);

    /**
     * <p>
     * Describes a program within a channel. For information about programs, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-programs.html">Working with programs</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeProgramRequest
     * @return Result of the DescribeProgram operation returned by the service.
     * @sample AWSMediaTailor.DescribeProgram
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeProgram" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeProgramResult describeProgram(DescribeProgramRequest describeProgramRequest);

    /**
     * <p>
     * Describes a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param describeSourceLocationRequest
     * @return Result of the DescribeSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.DescribeSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSourceLocationResult describeSourceLocation(DescribeSourceLocationRequest describeSourceLocationRequest);

    /**
     * <p>
     * Provides details about a specific video on demand (VOD) source in a specific source location.
     * </p>
     * 
     * @param describeVodSourceRequest
     * @return Result of the DescribeVodSource operation returned by the service.
     * @sample AWSMediaTailor.DescribeVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DescribeVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeVodSourceResult describeVodSource(DescribeVodSourceRequest describeVodSourceRequest);

    /**
     * <p>
     * Returns the channel's IAM policy. IAM policies are used to control access to your channel.
     * </p>
     * 
     * @param getChannelPolicyRequest
     * @return Result of the GetChannelPolicy operation returned by the service.
     * @sample AWSMediaTailor.GetChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    GetChannelPolicyResult getChannelPolicy(GetChannelPolicyRequest getChannelPolicyRequest);

    /**
     * <p>
     * Retrieves information about your channel's schedule.
     * </p>
     * 
     * @param getChannelScheduleRequest
     * @return Result of the GetChannelSchedule operation returned by the service.
     * @sample AWSMediaTailor.GetChannelSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetChannelSchedule" target="_top">AWS
     *      API Documentation</a>
     */
    GetChannelScheduleResult getChannelSchedule(GetChannelScheduleRequest getChannelScheduleRequest);

    /**
     * <p>
     * Retrieves a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param getPlaybackConfigurationRequest
     * @return Result of the GetPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.GetPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetPlaybackConfigurationResult getPlaybackConfiguration(GetPlaybackConfigurationRequest getPlaybackConfigurationRequest);

    /**
     * <p>
     * Retrieves a prefetch schedule for a playback configuration. A prefetch schedule allows you to tell MediaTailor to
     * fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html">Using ad prefetching</a> in the
     * <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param getPrefetchScheduleRequest
     * @return Result of the GetPrefetchSchedule operation returned by the service.
     * @sample AWSMediaTailor.GetPrefetchSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/GetPrefetchSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    GetPrefetchScheduleResult getPrefetchSchedule(GetPrefetchScheduleRequest getPrefetchScheduleRequest);

    /**
     * <p>
     * Lists the alerts that are associated with a MediaTailor channel assembly resource.
     * </p>
     * 
     * @param listAlertsRequest
     * @return Result of the ListAlerts operation returned by the service.
     * @sample AWSMediaTailor.ListAlerts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListAlerts" target="_top">AWS API
     *      Documentation</a>
     */
    ListAlertsResult listAlerts(ListAlertsRequest listAlertsRequest);

    /**
     * <p>
     * Retrieves information about the channels that are associated with the current AWS account.
     * </p>
     * 
     * @param listChannelsRequest
     * @return Result of the ListChannels operation returned by the service.
     * @sample AWSMediaTailor.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Lists the live sources contained in a source location. A source represents a piece of content.
     * </p>
     * 
     * @param listLiveSourcesRequest
     * @return Result of the ListLiveSources operation returned by the service.
     * @sample AWSMediaTailor.ListLiveSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListLiveSources" target="_top">AWS
     *      API Documentation</a>
     */
    ListLiveSourcesResult listLiveSources(ListLiveSourcesRequest listLiveSourcesRequest);

    /**
     * <p>
     * Retrieves existing playback configurations. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with Configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param listPlaybackConfigurationsRequest
     * @return Result of the ListPlaybackConfigurations operation returned by the service.
     * @sample AWSMediaTailor.ListPlaybackConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPlaybackConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListPlaybackConfigurationsResult listPlaybackConfigurations(ListPlaybackConfigurationsRequest listPlaybackConfigurationsRequest);

    /**
     * <p>
     * Lists the prefetch schedules for a playback configuration.
     * </p>
     * 
     * @param listPrefetchSchedulesRequest
     * @return Result of the ListPrefetchSchedules operation returned by the service.
     * @sample AWSMediaTailor.ListPrefetchSchedules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPrefetchSchedules"
     *      target="_top">AWS API Documentation</a>
     */
    ListPrefetchSchedulesResult listPrefetchSchedules(ListPrefetchSchedulesRequest listPrefetchSchedulesRequest);

    /**
     * <p>
     * Lists the source locations for a channel. A source location defines the host server URL, and contains a list of
     * sources.
     * </p>
     * 
     * @param listSourceLocationsRequest
     * @return Result of the ListSourceLocations operation returned by the service.
     * @sample AWSMediaTailor.ListSourceLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListSourceLocations"
     *      target="_top">AWS API Documentation</a>
     */
    ListSourceLocationsResult listSourceLocations(ListSourceLocationsRequest listSourceLocationsRequest);

    /**
     * <p>
     * A list of tags that are associated with this resource. Tags are key-value pairs that you can associate with
     * Amazon resources to help with organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @sample AWSMediaTailor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the VOD sources contained in a source location. A source represents a piece of content.
     * </p>
     * 
     * @param listVodSourcesRequest
     * @return Result of the ListVodSources operation returned by the service.
     * @sample AWSMediaTailor.ListVodSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListVodSources" target="_top">AWS API
     *      Documentation</a>
     */
    ListVodSourcesResult listVodSources(ListVodSourcesRequest listVodSourcesRequest);

    /**
     * <p>
     * Creates an IAM policy for the channel. IAM policies are used to control access to your channel.
     * </p>
     * 
     * @param putChannelPolicyRequest
     * @return Result of the PutChannelPolicy operation returned by the service.
     * @sample AWSMediaTailor.PutChannelPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutChannelPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    PutChannelPolicyResult putChannelPolicy(PutChannelPolicyRequest putChannelPolicyRequest);

    /**
     * <p>
     * Creates a playback configuration. For information about MediaTailor configurations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html">Working with configurations in AWS
     * Elemental MediaTailor</a>.
     * </p>
     * 
     * @param putPlaybackConfigurationRequest
     * @return Result of the PutPlaybackConfiguration operation returned by the service.
     * @sample AWSMediaTailor.PutPlaybackConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutPlaybackConfigurationResult putPlaybackConfiguration(PutPlaybackConfigurationRequest putPlaybackConfigurationRequest);

    /**
     * <p>
     * Starts a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param startChannelRequest
     * @return Result of the StartChannel operation returned by the service.
     * @sample AWSMediaTailor.StartChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StartChannel" target="_top">AWS API
     *      Documentation</a>
     */
    StartChannelResult startChannel(StartChannelRequest startChannelRequest);

    /**
     * <p>
     * Stops a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param stopChannelRequest
     * @return Result of the StopChannel operation returned by the service.
     * @sample AWSMediaTailor.StopChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/StopChannel" target="_top">AWS API
     *      Documentation</a>
     */
    StopChannelResult stopChannel(StopChannelRequest stopChannelRequest);

    /**
     * <p>
     * The resource to tag. Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html">Tagging AWS Elemental MediaTailor
     * Resources</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @sample AWSMediaTailor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * The resource to untag.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         A request contains unexpected data.
     * @sample AWSMediaTailor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a channel. For information about MediaTailor channels, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html">Working with channels</a>
     * in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param updateChannelRequest
     * @return Result of the UpdateChannel operation returned by the service.
     * @sample AWSMediaTailor.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates a live source's configuration.
     * </p>
     * 
     * @param updateLiveSourceRequest
     * @return Result of the UpdateLiveSource operation returned by the service.
     * @sample AWSMediaTailor.UpdateLiveSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateLiveSource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateLiveSourceResult updateLiveSource(UpdateLiveSourceRequest updateLiveSourceRequest);

    /**
     * <p>
     * Updates a source location. A source location is a container for sources. For more information about source
     * locations, see <a
     * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html">Working with
     * source locations</a> in the <i>MediaTailor User Guide</i>.
     * </p>
     * 
     * @param updateSourceLocationRequest
     * @return Result of the UpdateSourceLocation operation returned by the service.
     * @sample AWSMediaTailor.UpdateSourceLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateSourceLocation"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSourceLocationResult updateSourceLocation(UpdateSourceLocationRequest updateSourceLocationRequest);

    /**
     * <p>
     * Updates a VOD source's configuration.
     * </p>
     * 
     * @param updateVodSourceRequest
     * @return Result of the UpdateVodSource operation returned by the service.
     * @sample AWSMediaTailor.UpdateVodSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UpdateVodSource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateVodSourceResult updateVodSource(UpdateVodSourceRequest updateVodSourceRequest);

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
