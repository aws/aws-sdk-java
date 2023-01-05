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
package com.amazonaws.services.kinesisvideo;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Interface for accessing Kinesis Video.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideo} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideo {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kinesisvideo";

    /**
     * <p>
     * Creates a signaling channel.
     * </p>
     * <p>
     * <code>CreateSignalingChannel</code> is an asynchronous operation.
     * </p>
     * 
     * @param createSignalingChannelRequest
     * @return Result of the CreateSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws AccountChannelLimitExceededException
     *         You have reached the maximum limit of active signaling channels for this Amazon Web Services account in
     *         this region.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.CreateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSignalingChannelResult createSignalingChannel(CreateSignalingChannelRequest createSignalingChannelRequest);

    /**
     * <p>
     * Creates a new Kinesis video stream.
     * </p>
     * <p>
     * When you create a new stream, Kinesis Video Streams assigns it a version number. When you change the stream's
     * metadata, Kinesis Video Streams updates the version.
     * </p>
     * <p>
     * <code>CreateStream</code> is an asynchronous operation.
     * </p>
     * <p>
     * For information about how the service works, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/how-it-works.html">How it Works</a>.
     * </p>
     * <p>
     * You must have permissions for the <code>KinesisVideo:CreateStream</code> action.
     * </p>
     * 
     * @param createStreamRequest
     * @return Result of the CreateStream operation returned by the service.
     * @throws AccountStreamLimitExceededException
     *         The number of streams created for the account is too high.
     * @throws DeviceStreamLimitExceededException
     *         Not implemented.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws InvalidDeviceException
     *         Not implemented.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.CreateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateStream" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStreamResult createStream(CreateStreamRequest createStreamRequest);

    /**
     * <p>
     * Deletes a specified signaling channel. <code>DeleteSignalingChannel</code> is an asynchronous operation. If you
     * don't specify the channel's current version, the most recent version is deleted.
     * </p>
     * 
     * @param deleteSignalingChannelRequest
     * @return Result of the DeleteSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @sample AmazonKinesisVideo.DeleteSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSignalingChannelResult deleteSignalingChannel(DeleteSignalingChannelRequest deleteSignalingChannelRequest);

    /**
     * <p>
     * Deletes a Kinesis video stream and the data contained in the stream.
     * </p>
     * <p>
     * This method marks the stream for deletion, and makes the data in the stream inaccessible immediately.
     * </p>
     * <p>
     * </p>
     * <p>
     * To ensure that you have the latest version of the stream before deleting it, you can specify the stream version.
     * Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams assigns a
     * new version number. To get the latest stream version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * This operation requires permission for the <code>KinesisVideo:DeleteStream</code> action.
     * </p>
     * 
     * @param deleteStreamRequest
     * @return Result of the DeleteStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @sample AmazonKinesisVideo.DeleteStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteStream" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStreamResult deleteStream(DeleteStreamRequest deleteStreamRequest);

    /**
     * <p>
     * Describes a stream’s edge configuration that was set using the <code>StartEdgeConfigurationUpdate</code> API. Use
     * this API to get the status of the configuration if the configuration is in sync with the Edge Agent.
     * </p>
     * 
     * @param describeEdgeConfigurationRequest
     * @return Result of the DescribeEdgeConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws StreamEdgeConfigurationNotFoundException
     *         The Exception rendered when the Amazon Kinesis Video Stream can't find a stream's edge configuration that
     *         you specified.
     * @sample AmazonKinesisVideo.DescribeEdgeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeEdgeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEdgeConfigurationResult describeEdgeConfiguration(DescribeEdgeConfigurationRequest describeEdgeConfigurationRequest);

    /**
     * <p>
     * Gets the <code>ImageGenerationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeImageGenerationConfigurationRequest
     * @return Result of the DescribeImageGenerationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.DescribeImageGenerationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeImageGenerationConfigurationResult describeImageGenerationConfiguration(
            DescribeImageGenerationConfigurationRequest describeImageGenerationConfigurationRequest);

    /**
     * <p>
     * Returns the most current information about the stream. Either streamName or streamARN should be provided in the
     * input.
     * </p>
     * <p>
     * Returns the most current information about the stream. The <code>streamName</code> or <code>streamARN</code>
     * should be provided in the input.
     * </p>
     * 
     * @param describeMappedResourceConfigurationRequest
     * @return Result of the DescribeMappedResourceConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @sample AmazonKinesisVideo.DescribeMappedResourceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMappedResourceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMappedResourceConfigurationResult describeMappedResourceConfiguration(
            DescribeMappedResourceConfigurationRequest describeMappedResourceConfigurationRequest);

    /**
     * <p>
     * Returns the most current information about the channel. Specify the <code>ChannelName</code> or
     * <code>ChannelARN</code> in the input.
     * </p>
     * 
     * @param describeMediaStorageConfigurationRequest
     * @return Result of the DescribeMediaStorageConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @sample AmazonKinesisVideo.DescribeMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMediaStorageConfigurationResult describeMediaStorageConfiguration(DescribeMediaStorageConfigurationRequest describeMediaStorageConfigurationRequest);

    /**
     * <p>
     * Gets the <code>NotificationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeNotificationConfigurationRequest
     * @return Result of the DescribeNotificationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.DescribeNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNotificationConfigurationResult describeNotificationConfiguration(DescribeNotificationConfigurationRequest describeNotificationConfigurationRequest);

    /**
     * <p>
     * Returns the most current information about the signaling channel. You must specify either the name or the Amazon
     * Resource Name (ARN) of the channel that you want to describe.
     * </p>
     * 
     * @param describeSignalingChannelRequest
     * @return Result of the DescribeSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.DescribeSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSignalingChannelResult describeSignalingChannel(DescribeSignalingChannelRequest describeSignalingChannelRequest);

    /**
     * <p>
     * Returns the most current information about the specified stream. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param describeStreamRequest
     * @return Result of the DescribeStream operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideo.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeStream" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeStreamResult describeStream(DescribeStreamRequest describeStreamRequest);

    /**
     * <p>
     * Gets an endpoint for a specified stream for either reading or writing. Use this endpoint in your application to
     * read from the specified stream (using the <code>GetMedia</code> or <code>GetMediaForFragmentList</code>
     * operations) or write to it (using the <code>PutMedia</code> operation).
     * </p>
     * <note>
     * <p>
     * The returned endpoint does not have the API name appended. The client needs to add the API name to the returned
     * endpoint.
     * </p>
     * </note>
     * <p>
     * In the request, specify the stream either by <code>StreamName</code> or <code>StreamARN</code>.
     * </p>
     * 
     * @param getDataEndpointRequest
     * @return Result of the GetDataEndpoint operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideo.GetDataEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetDataEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    GetDataEndpointResult getDataEndpoint(GetDataEndpointRequest getDataEndpointRequest);

    /**
     * <p>
     * Provides an endpoint for the specified signaling channel to send and receive messages. This API uses the
     * <code>SingleMasterChannelEndpointConfiguration</code> input parameter, which consists of the
     * <code>Protocols</code> and <code>Role</code> properties.
     * </p>
     * <p>
     * <code>Protocols</code> is used to determine the communication mechanism. For example, if you specify
     * <code>WSS</code> as the protocol, this API produces a secure websocket endpoint. If you specify
     * <code>HTTPS</code> as the protocol, this API generates an HTTPS endpoint.
     * </p>
     * <p>
     * <code>Role</code> determines the messaging permissions. A <code>MASTER</code> role results in this API generating
     * an endpoint that a client can use to communicate with any of the viewers on the channel. A <code>VIEWER</code>
     * role results in this API generating an endpoint that a client can use to communicate only with a
     * <code>MASTER</code>.
     * </p>
     * 
     * @param getSignalingChannelEndpointRequest
     * @return Result of the GetSignalingChannelEndpoint operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.GetSignalingChannelEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetSignalingChannelEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    GetSignalingChannelEndpointResult getSignalingChannelEndpoint(GetSignalingChannelEndpointRequest getSignalingChannelEndpointRequest);

    /**
     * <p>
     * Returns an array of <code>ChannelInfo</code> objects. Each object describes a signaling channel. To retrieve only
     * those channels that satisfy a specific condition, you can specify a <code>ChannelNameCondition</code>.
     * </p>
     * 
     * @param listSignalingChannelsRequest
     * @return Result of the ListSignalingChannels operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.ListSignalingChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListSignalingChannels"
     *      target="_top">AWS API Documentation</a>
     */
    ListSignalingChannelsResult listSignalingChannels(ListSignalingChannelsRequest listSignalingChannelsRequest);

    /**
     * <p>
     * Returns an array of <code>StreamInfo</code> objects. Each object describes a stream. To retrieve only streams
     * that satisfy a specific condition, you can specify a <code>StreamNameCondition</code>.
     * </p>
     * 
     * @param listStreamsRequest
     * @return Result of the ListStreams operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @sample AmazonKinesisVideo.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Returns a list of tags associated with the specified signaling channel.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags associated with the specified stream.
     * </p>
     * <p>
     * In the request, you must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param listTagsForStreamRequest
     * @return Result of the ListTagsForStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws InvalidResourceFormatException
     *         The format of the <code>StreamARN</code> is invalid.
     * @sample AmazonKinesisVideo.ListTagsForStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForStream" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForStreamResult listTagsForStream(ListTagsForStreamRequest listTagsForStreamRequest);

    /**
     * <p>
     * An asynchronous API that updates a stream’s existing edge configuration. The Kinesis Video Stream will sync the
     * stream’s edge configuration with the Edge Agent IoT Greengrass component that runs on an IoT Hub Device, setup at
     * your premise. The time to sync can vary and depends on the connectivity of the Hub Device. The
     * <code>SyncStatus</code> will be updated as the edge configuration is acknowledged, and synced with the Edge
     * Agent.
     * </p>
     * <p>
     * If this API is invoked for the first time, a new edge configuration will be created for the stream, and the sync
     * status will be set to <code>SYNCING</code>. You will have to wait for the sync status to reach a terminal state
     * such as: <code>IN_SYNC</code>, or <code>SYNC_FAILED</code>, before using this API again. If you invoke this API
     * during the syncing process, a <code>ResourceInUseException</code> will be thrown. The connectivity of the
     * stream’s edge configuration and the Edge Agent will be retried for 15 minutes. After 15 minutes, the status will
     * transition into the <code>SYNC_FAILED</code> state.
     * </p>
     * 
     * @param startEdgeConfigurationUpdateRequest
     * @return Result of the StartEdgeConfigurationUpdate operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @sample AmazonKinesisVideo.StartEdgeConfigurationUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/StartEdgeConfigurationUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    StartEdgeConfigurationUpdateResult startEdgeConfigurationUpdate(StartEdgeConfigurationUpdateRequest startEdgeConfigurationUpdateRequest);

    /**
     * <p>
     * Adds one or more tags to a signaling channel. A <i>tag</i> is a key-value pair (the value is optional) that you
     * can define and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value
     * is replaced with the value that you specify in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>Billing and Cost Management and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a stream. A <i>tag</i> is a key-value pair (the value is optional) that you can define
     * and assign to Amazon Web Services resources. If you specify a tag that already exists, the tag value is replaced
     * with the value that you specify in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>Billing and Cost Management and Cost Management User Guide</i>.
     * </p>
     * <p>
     * You must provide either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * This operation requires permission for the <code>KinesisVideo:TagStream</code> action.
     * </p>
     * <p>
     * A Kinesis video stream can support up to 50 tags.
     * </p>
     * 
     * @param tagStreamRequest
     * @return Result of the TagStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws InvalidResourceFormatException
     *         The format of the <code>StreamARN</code> is invalid.
     * @throws TagsPerResourceExceededLimitException
     *         You have exceeded the limit of tags that you can associate with the resource. A Kinesis video stream can
     *         support up to 50 tags.
     * @sample AmazonKinesisVideo.TagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagStream" target="_top">AWS API
     *      Documentation</a>
     */
    TagStreamResult tagStream(TagStreamRequest tagStreamRequest);

    /**
     * <p>
     * Removes one or more tags from a signaling channel. In the request, specify only a tag key or keys; don't specify
     * the value. If you specify a tag key that does not exist, it's ignored.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @sample AmazonKinesisVideo.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a stream. In the request, specify only a tag key or keys; don't specify the value.
     * If you specify a tag key that does not exist, it's ignored.
     * </p>
     * <p>
     * In the request, you must provide the <code>StreamName</code> or <code>StreamARN</code>.
     * </p>
     * 
     * @param untagStreamRequest
     * @return Result of the UntagStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws InvalidResourceFormatException
     *         The format of the <code>StreamARN</code> is invalid.
     * @sample AmazonKinesisVideo.UntagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagStream" target="_top">AWS API
     *      Documentation</a>
     */
    UntagStreamResult untagStream(UntagStreamRequest untagStreamRequest);

    /**
     * <p>
     * Increases or decreases the stream's data retention period by the value that you specify. To indicate whether you
     * want to increase or decrease the data retention period, specify the <code>Operation</code> parameter in the
     * request body. In the request, you must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <note>
     * <p>
     * The retention period that you specify replaces the current value.
     * </p>
     * </note>
     * <p>
     * This operation requires permission for the <code>KinesisVideo:UpdateDataRetention</code> action.
     * </p>
     * <p>
     * Changing the data retention period affects the data in the stream as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the data retention period is increased, existing data is retained for the new retention period. For example,
     * if the data retention period is increased from one hour to seven hours, all existing data is retained for seven
     * hours.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the data retention period is decreased, existing data is retained for the new retention period. For example,
     * if the data retention period is decreased from seven hours to one hour, all existing data is retained for one
     * hour, and any data older than one hour is deleted immediately.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateDataRetentionRequest
     * @return Result of the UpdateDataRetention operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @sample AmazonKinesisVideo.UpdateDataRetention
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateDataRetention"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDataRetentionResult updateDataRetention(UpdateDataRetentionRequest updateDataRetentionRequest);

    /**
     * <p>
     * Updates the <code>StreamInfo</code> and <code>ImageProcessingConfiguration</code> fields.
     * </p>
     * 
     * @param updateImageGenerationConfigurationRequest
     * @return Result of the UpdateImageGenerationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @sample AmazonKinesisVideo.UpdateImageGenerationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateImageGenerationConfigurationResult updateImageGenerationConfiguration(
            UpdateImageGenerationConfigurationRequest updateImageGenerationConfigurationRequest);

    /**
     * <p>
     * Associates a <code>SignalingChannel</code> to a stream to store the media. There are two signaling modes that can
     * specified :
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the <code>StorageStatus</code> is disabled, no data will be stored, and the <code>StreamARN</code> parameter
     * will not be needed.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageStatus</code> is enabled, the data will be stored in the <code>StreamARN</code> provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateMediaStorageConfigurationRequest
     * @return Result of the UpdateMediaStorageConfiguration operation returned by the service.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @sample AmazonKinesisVideo.UpdateMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMediaStorageConfigurationResult updateMediaStorageConfiguration(UpdateMediaStorageConfigurationRequest updateMediaStorageConfigurationRequest);

    /**
     * <p>
     * Updates the notification information for a stream.
     * </p>
     * 
     * @param updateNotificationConfigurationRequest
     * @return Result of the UpdateNotificationConfiguration operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NoDataRetentionException
     *         The Stream data retention in hours is equal to zero.
     * @sample AmazonKinesisVideo.UpdateNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNotificationConfigurationResult updateNotificationConfiguration(UpdateNotificationConfigurationRequest updateNotificationConfigurationRequest);

    /**
     * <p>
     * Updates the existing signaling channel. This is an asynchronous operation and takes time to complete.
     * </p>
     * <p>
     * If the <code>MessageTtlSeconds</code> value is updated (either increased or reduced), it only applies to new
     * messages sent via this channel after it's been updated. Existing messages are still expired as per the previous
     * <code>MessageTtlSeconds</code> value.
     * </p>
     * 
     * @param updateSignalingChannelRequest
     * @return Result of the UpdateSignalingChannel operation returned by the service.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         You do not have required permissions to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @sample AmazonKinesisVideo.UpdateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSignalingChannelResult updateSignalingChannel(UpdateSignalingChannelRequest updateSignalingChannelRequest);

    /**
     * <p>
     * Updates stream metadata, such as the device name and media type.
     * </p>
     * <p>
     * You must provide the stream name or the Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * To make sure that you have the latest version of the stream before updating it, you can specify the stream
     * version. Kinesis Video Streams assigns a version to each stream. When you update a stream, Kinesis Video Streams
     * assigns a new version number. To get the latest stream version, use the <code>DescribeStream</code> API.
     * </p>
     * <p>
     * <code>UpdateStream</code> is an asynchronous operation, and takes time to complete.
     * </p>
     * 
     * @param updateStreamRequest
     * @return Result of the UpdateStream operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws ResourceNotFoundException
     *         Amazon Kinesis Video Streams can't find the stream that you specified.
     * @throws ResourceInUseException
     *         When the input <code>StreamARN</code> or <code>ChannelARN</code> in <code>CLOUD_STORAGE_MODE</code> is
     *         already mapped to a different Kinesis Video Stream resource, or if the provided input
     *         <code>StreamARN</code> or <code>ChannelARN</code> is not in Active status, try one of the following :
     *         </p>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>DescribeMediaStorageConfiguration</code> API to determine what the stream given channel is
     *         mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeMappedResourceConfiguration</code> API to determine the channel that the given stream
     *         is mapped to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DescribeStream</code> or <code>DescribeSignalingChannel</code> API to determine the status of
     *         the resource.
     *         </p>
     *         </li>
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @throws VersionMismatchException
     *         The stream version that you specified is not the latest version. To get the latest version, use the <a
     *         href
     *         ="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_DescribeStream.html">DescribeStream</a>
     *         API.
     * @sample AmazonKinesisVideo.UpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateStream" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStreamResult updateStream(UpdateStreamRequest updateStreamRequest);

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
