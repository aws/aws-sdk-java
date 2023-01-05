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

import com.amazonaws.services.kinesisvideo.model.*;

/**
 * Interface for accessing Kinesis Video asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideo.AbstractAmazonKinesisVideoAsync} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoAsync extends AmazonKinesisVideo {

    /**
     * <p>
     * Creates a signaling channel.
     * </p>
     * <p>
     * <code>CreateSignalingChannel</code> is an asynchronous operation.
     * </p>
     * 
     * @param createSignalingChannelRequest
     * @return A Java Future containing the result of the CreateSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsync.CreateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSignalingChannelResult> createSignalingChannelAsync(CreateSignalingChannelRequest createSignalingChannelRequest);

    /**
     * <p>
     * Creates a signaling channel.
     * </p>
     * <p>
     * <code>CreateSignalingChannel</code> is an asynchronous operation.
     * </p>
     * 
     * @param createSignalingChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.CreateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSignalingChannelResult> createSignalingChannelAsync(CreateSignalingChannelRequest createSignalingChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSignalingChannelRequest, CreateSignalingChannelResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateStream operation returned by the service.
     * @sample AmazonKinesisVideoAsync.CreateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest createStreamRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStream operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.CreateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/CreateStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamResult> createStreamAsync(CreateStreamRequest createStreamRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, CreateStreamResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified signaling channel. <code>DeleteSignalingChannel</code> is an asynchronous operation. If you
     * don't specify the channel's current version, the most recent version is deleted.
     * </p>
     * 
     * @param deleteSignalingChannelRequest
     * @return A Java Future containing the result of the DeleteSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsync.DeleteSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSignalingChannelResult> deleteSignalingChannelAsync(DeleteSignalingChannelRequest deleteSignalingChannelRequest);

    /**
     * <p>
     * Deletes a specified signaling channel. <code>DeleteSignalingChannel</code> is an asynchronous operation. If you
     * don't specify the channel's current version, the most recent version is deleted.
     * </p>
     * 
     * @param deleteSignalingChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.DeleteSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSignalingChannelResult> deleteSignalingChannelAsync(DeleteSignalingChannelRequest deleteSignalingChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSignalingChannelRequest, DeleteSignalingChannelResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteStream operation returned by the service.
     * @sample AmazonKinesisVideoAsync.DeleteStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest deleteStreamRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStream operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.DeleteStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DeleteStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamResult> deleteStreamAsync(DeleteStreamRequest deleteStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, DeleteStreamResult> asyncHandler);

    /**
     * <p>
     * Describes a stream’s edge configuration that was set using the <code>StartEdgeConfigurationUpdate</code> API. Use
     * this API to get the status of the configuration if the configuration is in sync with the Edge Agent.
     * </p>
     * 
     * @param describeEdgeConfigurationRequest
     * @return A Java Future containing the result of the DescribeEdgeConfiguration operation returned by the service.
     * @sample AmazonKinesisVideoAsync.DescribeEdgeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeEdgeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEdgeConfigurationResult> describeEdgeConfigurationAsync(
            DescribeEdgeConfigurationRequest describeEdgeConfigurationRequest);

    /**
     * <p>
     * Describes a stream’s edge configuration that was set using the <code>StartEdgeConfigurationUpdate</code> API. Use
     * this API to get the status of the configuration if the configuration is in sync with the Edge Agent.
     * </p>
     * 
     * @param describeEdgeConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEdgeConfiguration operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.DescribeEdgeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeEdgeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEdgeConfigurationResult> describeEdgeConfigurationAsync(
            DescribeEdgeConfigurationRequest describeEdgeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEdgeConfigurationRequest, DescribeEdgeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets the <code>ImageGenerationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeImageGenerationConfigurationRequest
     * @return A Java Future containing the result of the DescribeImageGenerationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.DescribeImageGenerationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageGenerationConfigurationResult> describeImageGenerationConfigurationAsync(
            DescribeImageGenerationConfigurationRequest describeImageGenerationConfigurationRequest);

    /**
     * <p>
     * Gets the <code>ImageGenerationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeImageGenerationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeImageGenerationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.DescribeImageGenerationConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeImageGenerationConfigurationResult> describeImageGenerationConfigurationAsync(
            DescribeImageGenerationConfigurationRequest describeImageGenerationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeImageGenerationConfigurationRequest, DescribeImageGenerationConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeMappedResourceConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.DescribeMappedResourceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMappedResourceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMappedResourceConfigurationResult> describeMappedResourceConfigurationAsync(
            DescribeMappedResourceConfigurationRequest describeMappedResourceConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMappedResourceConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.DescribeMappedResourceConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMappedResourceConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMappedResourceConfigurationResult> describeMappedResourceConfigurationAsync(
            DescribeMappedResourceConfigurationRequest describeMappedResourceConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMappedResourceConfigurationRequest, DescribeMappedResourceConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the most current information about the channel. Specify the <code>ChannelName</code> or
     * <code>ChannelARN</code> in the input.
     * </p>
     * 
     * @param describeMediaStorageConfigurationRequest
     * @return A Java Future containing the result of the DescribeMediaStorageConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.DescribeMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMediaStorageConfigurationResult> describeMediaStorageConfigurationAsync(
            DescribeMediaStorageConfigurationRequest describeMediaStorageConfigurationRequest);

    /**
     * <p>
     * Returns the most current information about the channel. Specify the <code>ChannelName</code> or
     * <code>ChannelARN</code> in the input.
     * </p>
     * 
     * @param describeMediaStorageConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMediaStorageConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.DescribeMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMediaStorageConfigurationResult> describeMediaStorageConfigurationAsync(
            DescribeMediaStorageConfigurationRequest describeMediaStorageConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMediaStorageConfigurationRequest, DescribeMediaStorageConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets the <code>NotificationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeNotificationConfigurationRequest
     * @return A Java Future containing the result of the DescribeNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.DescribeNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationResult> describeNotificationConfigurationAsync(
            DescribeNotificationConfigurationRequest describeNotificationConfigurationRequest);

    /**
     * <p>
     * Gets the <code>NotificationConfiguration</code> for a given Kinesis video stream.
     * </p>
     * 
     * @param describeNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.DescribeNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationResult> describeNotificationConfigurationAsync(
            DescribeNotificationConfigurationRequest describeNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationRequest, DescribeNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the most current information about the signaling channel. You must specify either the name or the Amazon
     * Resource Name (ARN) of the channel that you want to describe.
     * </p>
     * 
     * @param describeSignalingChannelRequest
     * @return A Java Future containing the result of the DescribeSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsync.DescribeSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSignalingChannelResult> describeSignalingChannelAsync(DescribeSignalingChannelRequest describeSignalingChannelRequest);

    /**
     * <p>
     * Returns the most current information about the signaling channel. You must specify either the name or the Amazon
     * Resource Name (ARN) of the channel that you want to describe.
     * </p>
     * 
     * @param describeSignalingChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.DescribeSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSignalingChannelResult> describeSignalingChannelAsync(DescribeSignalingChannelRequest describeSignalingChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSignalingChannelRequest, DescribeSignalingChannelResult> asyncHandler);

    /**
     * <p>
     * Returns the most current information about the specified stream. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param describeStreamRequest
     * @return A Java Future containing the result of the DescribeStream operation returned by the service.
     * @sample AmazonKinesisVideoAsync.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest);

    /**
     * <p>
     * Returns the most current information about the specified stream. You must specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param describeStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStream operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.DescribeStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/DescribeStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest describeStreamRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDataEndpoint operation returned by the service.
     * @sample AmazonKinesisVideoAsync.GetDataEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetDataEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDataEndpointResult> getDataEndpointAsync(GetDataEndpointRequest getDataEndpointRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataEndpoint operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.GetDataEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetDataEndpoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDataEndpointResult> getDataEndpointAsync(GetDataEndpointRequest getDataEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataEndpointRequest, GetDataEndpointResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSignalingChannelEndpoint operation returned by the service.
     * @sample AmazonKinesisVideoAsync.GetSignalingChannelEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetSignalingChannelEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSignalingChannelEndpointResult> getSignalingChannelEndpointAsync(
            GetSignalingChannelEndpointRequest getSignalingChannelEndpointRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSignalingChannelEndpoint operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.GetSignalingChannelEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/GetSignalingChannelEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSignalingChannelEndpointResult> getSignalingChannelEndpointAsync(
            GetSignalingChannelEndpointRequest getSignalingChannelEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetSignalingChannelEndpointRequest, GetSignalingChannelEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>ChannelInfo</code> objects. Each object describes a signaling channel. To retrieve only
     * those channels that satisfy a specific condition, you can specify a <code>ChannelNameCondition</code>.
     * </p>
     * 
     * @param listSignalingChannelsRequest
     * @return A Java Future containing the result of the ListSignalingChannels operation returned by the service.
     * @sample AmazonKinesisVideoAsync.ListSignalingChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListSignalingChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSignalingChannelsResult> listSignalingChannelsAsync(ListSignalingChannelsRequest listSignalingChannelsRequest);

    /**
     * <p>
     * Returns an array of <code>ChannelInfo</code> objects. Each object describes a signaling channel. To retrieve only
     * those channels that satisfy a specific condition, you can specify a <code>ChannelNameCondition</code>.
     * </p>
     * 
     * @param listSignalingChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSignalingChannels operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.ListSignalingChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListSignalingChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSignalingChannelsResult> listSignalingChannelsAsync(ListSignalingChannelsRequest listSignalingChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSignalingChannelsRequest, ListSignalingChannelsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>StreamInfo</code> objects. Each object describes a stream. To retrieve only streams
     * that satisfy a specific condition, you can specify a <code>StreamNameCondition</code>.
     * </p>
     * 
     * @param listStreamsRequest
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonKinesisVideoAsync.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Returns an array of <code>StreamInfo</code> objects. Each object describes a stream. To retrieve only streams
     * that satisfy a specific condition, you can specify a <code>StreamNameCondition</code>.
     * </p>
     * 
     * @param listStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags associated with the specified signaling channel.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonKinesisVideoAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags associated with the specified signaling channel.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags associated with the specified stream.
     * </p>
     * <p>
     * In the request, you must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param listTagsForStreamRequest
     * @return A Java Future containing the result of the ListTagsForStream operation returned by the service.
     * @sample AmazonKinesisVideoAsync.ListTagsForStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest listTagsForStreamRequest);

    /**
     * <p>
     * Returns a list of tags associated with the specified stream.
     * </p>
     * <p>
     * In the request, you must specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * 
     * @param listTagsForStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForStream operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.ListTagsForStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/ListTagsForStream" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(ListTagsForStreamRequest listTagsForStreamRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartEdgeConfigurationUpdate operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.StartEdgeConfigurationUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/StartEdgeConfigurationUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEdgeConfigurationUpdateResult> startEdgeConfigurationUpdateAsync(
            StartEdgeConfigurationUpdateRequest startEdgeConfigurationUpdateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartEdgeConfigurationUpdate operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.StartEdgeConfigurationUpdate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/StartEdgeConfigurationUpdate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartEdgeConfigurationUpdateResult> startEdgeConfigurationUpdateAsync(
            StartEdgeConfigurationUpdateRequest startEdgeConfigurationUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<StartEdgeConfigurationUpdateRequest, StartEdgeConfigurationUpdateResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonKinesisVideoAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the TagStream operation returned by the service.
     * @sample AmazonKinesisVideoAsync.TagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagStreamResult> tagStreamAsync(TagStreamRequest tagStreamRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagStream operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.TagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/TagStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagStreamResult> tagStreamAsync(TagStreamRequest tagStreamRequest,
            com.amazonaws.handlers.AsyncHandler<TagStreamRequest, TagStreamResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a signaling channel. In the request, specify only a tag key or keys; don't specify
     * the value. If you specify a tag key that does not exist, it's ignored.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonKinesisVideoAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a signaling channel. In the request, specify only a tag key or keys; don't specify
     * the value. If you specify a tag key that does not exist, it's ignored.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UntagStream operation returned by the service.
     * @sample AmazonKinesisVideoAsync.UntagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagStreamResult> untagStreamAsync(UntagStreamRequest untagStreamRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagStream operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.UntagStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UntagStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagStreamResult> untagStreamAsync(UntagStreamRequest untagStreamRequest,
            com.amazonaws.handlers.AsyncHandler<UntagStreamRequest, UntagStreamResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateDataRetention operation returned by the service.
     * @sample AmazonKinesisVideoAsync.UpdateDataRetention
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateDataRetention"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataRetentionResult> updateDataRetentionAsync(UpdateDataRetentionRequest updateDataRetentionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataRetention operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.UpdateDataRetention
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateDataRetention"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataRetentionResult> updateDataRetentionAsync(UpdateDataRetentionRequest updateDataRetentionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataRetentionRequest, UpdateDataRetentionResult> asyncHandler);

    /**
     * <p>
     * Updates the <code>StreamInfo</code> and <code>ImageProcessingConfiguration</code> fields.
     * </p>
     * 
     * @param updateImageGenerationConfigurationRequest
     * @return A Java Future containing the result of the UpdateImageGenerationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.UpdateImageGenerationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImageGenerationConfigurationResult> updateImageGenerationConfigurationAsync(
            UpdateImageGenerationConfigurationRequest updateImageGenerationConfigurationRequest);

    /**
     * <p>
     * Updates the <code>StreamInfo</code> and <code>ImageProcessingConfiguration</code> fields.
     * </p>
     * 
     * @param updateImageGenerationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateImageGenerationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.UpdateImageGenerationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateImageGenerationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateImageGenerationConfigurationResult> updateImageGenerationConfigurationAsync(
            UpdateImageGenerationConfigurationRequest updateImageGenerationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateImageGenerationConfigurationRequest, UpdateImageGenerationConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateMediaStorageConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.UpdateMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaStorageConfigurationResult> updateMediaStorageConfigurationAsync(
            UpdateMediaStorageConfigurationRequest updateMediaStorageConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMediaStorageConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.UpdateMediaStorageConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateMediaStorageConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMediaStorageConfigurationResult> updateMediaStorageConfigurationAsync(
            UpdateMediaStorageConfigurationRequest updateMediaStorageConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMediaStorageConfigurationRequest, UpdateMediaStorageConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the notification information for a stream.
     * </p>
     * 
     * @param updateNotificationConfigurationRequest
     * @return A Java Future containing the result of the UpdateNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsync.UpdateNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotificationConfigurationResult> updateNotificationConfigurationAsync(
            UpdateNotificationConfigurationRequest updateNotificationConfigurationRequest);

    /**
     * <p>
     * Updates the notification information for a stream.
     * </p>
     * 
     * @param updateNotificationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonKinesisVideoAsyncHandler.UpdateNotificationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateNotificationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotificationConfigurationResult> updateNotificationConfigurationAsync(
            UpdateNotificationConfigurationRequest updateNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotificationConfigurationRequest, UpdateNotificationConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsync.UpdateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSignalingChannelResult> updateSignalingChannelAsync(UpdateSignalingChannelRequest updateSignalingChannelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSignalingChannel operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.UpdateSignalingChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateSignalingChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSignalingChannelResult> updateSignalingChannelAsync(UpdateSignalingChannelRequest updateSignalingChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSignalingChannelRequest, UpdateSignalingChannelResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateStream operation returned by the service.
     * @sample AmazonKinesisVideoAsync.UpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest updateStreamRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStream operation returned by the service.
     * @sample AmazonKinesisVideoAsyncHandler.UpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStreamResult> updateStreamAsync(UpdateStreamRequest updateStreamRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStreamRequest, UpdateStreamResult> asyncHandler);

}
