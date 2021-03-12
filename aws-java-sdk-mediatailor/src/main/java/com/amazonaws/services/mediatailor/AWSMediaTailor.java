/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Creates a channel.
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
     * Creates a program.
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
     * Creates a source location on a specific channel.
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
     * Creates name for a specific VOD source in a source location.
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
     * Deletes a channel. You must stop the channel before it can be deleted.
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
     * Deletes a channel's IAM policy.
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
     * Deletes the playback configuration for the specified name.
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
     * Deletes a specific program on a specific channel.
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
     * Deletes a source location on a specific channel.
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
     * Deletes a specific VOD source in a specific source location.
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
     * Describes the properties of a specific channel.
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
     * Retrieves the properties of the requested program.
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
     * Retrieves the properties of the requested source location.
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
     * Provides details about a specific VOD source in a specific source location.
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
     * Retrieves information about a channel's IAM policy.
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
     * Returns the playback configuration for the specified name.
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
     * Retrieves a list of channels that are associated with this account.
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
     * Returns a list of the playback configurations defined in AWS Elemental MediaTailor. You can specify a maximum
     * number of configurations to return at a time. The default maximum is 50. Results are returned in pagefuls. If
     * MediaTailor has more configurations than the specified maximum, it provides parameters in the response that you
     * can use to retrieve the next pageful.
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
     * Retrieves a list of programs on a specific channel.
     * </p>
     * 
     * @param listProgramsRequest
     * @return Result of the ListPrograms operation returned by the service.
     * @sample AWSMediaTailor.ListPrograms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListPrograms" target="_top">AWS API
     *      Documentation</a>
     */
    ListProgramsResult listPrograms(ListProgramsRequest listProgramsRequest);

    /**
     * <p>
     * Retrieves a list of source locations.
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
     * Returns a list of the tags assigned to the specified playback configuration resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all the VOD sources in a source location.
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
     * Creates an IAM policy for the channel.
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
     * Adds a new playback configuration to AWS Elemental MediaTailor.
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
     * Starts a specific channel.
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
     * Stops a specific channel.
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
     * Adds tags to the specified playback configuration resource. You can specify one or more tags to add.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from the specified playback configuration resource. You can specify one or more tags to remove.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         Invalid request parameters.
     * @sample AWSMediaTailor.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing channel.
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
     * Updates a source location on a specific channel.
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
     * Updates a specific VOD source in a specific source location.
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
