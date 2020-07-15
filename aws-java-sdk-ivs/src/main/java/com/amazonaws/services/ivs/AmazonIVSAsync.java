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
package com.amazonaws.services.ivs;

import javax.annotation.Generated;

import com.amazonaws.services.ivs.model.*;

/**
 * Interface for accessing Amazon IVS asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivs.AbstractAmazonIVSAsync} instead.
 * </p>
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon Interactive Video Service (IVS) API is REST compatible, using a standard HTTP API and an <a
 * href="http://aws.amazon.com/sns">AWS SNS</a> event stream for responses. JSON is used for both requests and
 * responses, including errors.
 * </p>
 * <p>
 * The API is an AWS regional service, currently in these regions: us-west-2, us-east-2, and eu-west-1.
 * </p>
 * <p>
 * <i> <b>All API request parameters and URLs are case sensitive. </b> </i>
 * </p>
 * <p>
 * For a summary of notable documentation changes in each release, see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/doc-history.html"> Document History</a>.
 * </p>
 * <p>
 * <b>Allowed Header Values</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code> <b>Accept:</b> </code> application/json
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Accept-Encoding:</b> </code> gzip, deflate
 * </p>
 * </li>
 * <li>
 * <p>
 * <code> <b>Content-Type:</b> </code>application/json
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources contain information about your IVS live stream (see <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/GSIVS.html"> Getting Started with Amazon IVS</a>):
 * </p>
 * <ul>
 * <li>
 * <p>
 * Channel — Stores configuration data related to your live stream. You first create a channel and then use the
 * channel’s stream key to start your live stream. See the <a>Channel</a> endpoints for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * Stream key — An identifier assigned by Amazon IVS when you create a channel, which is then used to authorize
 * streaming. See the <a>StreamKey</a> endpoints for more information. <i> <b>Treat the stream key like a secret, since
 * it allows anyone to stream to the channel.</b> </i>
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
 * information, including restrictions that apply to tags.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html"> Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resources support tagging: Channels and Stream Keys.
 * </p>
 * <p>
 * <b>API Endpoints</b>
 * </p>
 * <p>
 * <a>Channel</a>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateChannel</a> — Creates a new channel and an associated stream key to start streaming.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetChannel</a> — Gets the channel configuration for a specified channel ARN (Amazon Resource Name).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetChannel</a> — Performs <a>GetChannel</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListChannels</a> — Gets summary information about channels. This list can be filtered to match a specified string.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateChannel</a> — Updates a channel's configuration. This does not affect an ongoing stream of this channel. You
 * must stop and restart the stream for the changes to take effect.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteChannel</a> — Deletes a specified channel.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <a>StreamKey</a>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateStreamKey</a> — Creates a stream key, used to initiate a stream, for a specified channel ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetStreamKey</a> — Gets stream key information for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>BatchGetStreamKey</a> — Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreamKeys</a> — Gets a list of stream keys. The list can be filtered to a particular channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteStreamKey</a> — Deletes the stream key for a specified ARN, so it can no longer be used to stream.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <a>Stream</a>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetStream</a> — Gets information about the active (live) stream on a specified channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListStreams</a> — Gets summary information about live streams.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopStream</a> — Disconnects a streamer on a specified channel. This disconnects the incoming RTMP stream from the
 * client. Can be used in conjunction with <a>DeleteStreamKey</a> to prevent further streaming to a channel.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutMetadata</a> Inserts metadata into an RTMP stream for a specified channel. A maximum of 5 requests per second
 * per channel is allowed, each with a maximum 1KB payload.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> AWS Tags</a>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for an AWS resource with a specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from a resource with a specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for a specified ARN.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonIVSAsync extends AmazonIVS {

    /**
     * <p>
     * Performs <a>GetChannel</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetChannelRequest
     * @return A Java Future containing the result of the BatchGetChannel operation returned by the service.
     * @sample AmazonIVSAsync.BatchGetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(BatchGetChannelRequest batchGetChannelRequest);

    /**
     * <p>
     * Performs <a>GetChannel</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.BatchGetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetChannelResult> batchGetChannelAsync(BatchGetChannelRequest batchGetChannelRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetChannelRequest, BatchGetChannelResult> asyncHandler);

    /**
     * <p>
     * Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetStreamKeyRequest
     * @return A Java Future containing the result of the BatchGetStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.BatchGetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(BatchGetStreamKeyRequest batchGetStreamKeyRequest);

    /**
     * <p>
     * Performs <a>GetStreamKey</a> on multiple ARNs simultaneously.
     * </p>
     * 
     * @param batchGetStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.BatchGetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/BatchGetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetStreamKeyResult> batchGetStreamKeyAsync(BatchGetStreamKeyRequest batchGetStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetStreamKeyRequest, BatchGetStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Creates a new channel and an associated stream key to start streaming.
     * </p>
     * 
     * @param createChannelRequest
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AmazonIVSAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Creates a new channel and an associated stream key to start streaming.
     * </p>
     * 
     * @param createChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * <p>
     * Creates a stream key, used to initiate a stream, for a specified channel ARN.
     * </p>
     * <p>
     * Note that <a>CreateChannel</a> creates a stream key. If you subsequently use CreateStreamKey on the same channel,
     * it will fail because a stream key already exists and there is a limit of 1 stream key per channel. To reset the
     * stream key on a channel, use <a>DeleteStreamKey</a> and then CreateStreamKey.
     * </p>
     * 
     * @param createStreamKeyRequest
     * @return A Java Future containing the result of the CreateStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.CreateStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(CreateStreamKeyRequest createStreamKeyRequest);

    /**
     * <p>
     * Creates a stream key, used to initiate a stream, for a specified channel ARN.
     * </p>
     * <p>
     * Note that <a>CreateChannel</a> creates a stream key. If you subsequently use CreateStreamKey on the same channel,
     * it will fail because a stream key already exists and there is a limit of 1 stream key per channel. To reset the
     * stream key on a channel, use <a>DeleteStreamKey</a> and then CreateStreamKey.
     * </p>
     * 
     * @param createStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.CreateStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/CreateStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStreamKeyResult> createStreamKeyAsync(CreateStreamKeyRequest createStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStreamKeyRequest, CreateStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified channel and its associated stream keys.
     * </p>
     * 
     * @param deleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AmazonIVSAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Deletes a specified channel and its associated stream keys.
     * </p>
     * 
     * @param deleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * <p>
     * Deletes the stream key for a specified ARN, so it can no longer be used to stream.
     * </p>
     * 
     * @param deleteStreamKeyRequest
     * @return A Java Future containing the result of the DeleteStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.DeleteStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(DeleteStreamKeyRequest deleteStreamKeyRequest);

    /**
     * <p>
     * Deletes the stream key for a specified ARN, so it can no longer be used to stream.
     * </p>
     * 
     * @param deleteStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.DeleteStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/DeleteStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStreamKeyResult> deleteStreamKeyAsync(DeleteStreamKeyRequest deleteStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamKeyRequest, DeleteStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Gets the channel configuration for a specified channel ARN. See also <a>BatchGetChannel</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AmazonIVSAsync.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest);

    /**
     * <p>
     * Gets the channel configuration for a specified channel ARN. See also <a>BatchGetChannel</a>.
     * </p>
     * 
     * @param getChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest getChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler);

    /**
     * <p>
     * Gets information about the active (live) stream on a specified channel.
     * </p>
     * 
     * @param getStreamRequest
     * @return A Java Future containing the result of the GetStream operation returned by the service.
     * @sample AmazonIVSAsync.GetStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamResult> getStreamAsync(GetStreamRequest getStreamRequest);

    /**
     * <p>
     * Gets information about the active (live) stream on a specified channel.
     * </p>
     * 
     * @param getStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStream operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamResult> getStreamAsync(GetStreamRequest getStreamRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamRequest, GetStreamResult> asyncHandler);

    /**
     * <p>
     * Gets stream-key information for a specified ARN.
     * </p>
     * 
     * @param getStreamKeyRequest
     * @return A Java Future containing the result of the GetStreamKey operation returned by the service.
     * @sample AmazonIVSAsync.GetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(GetStreamKeyRequest getStreamKeyRequest);

    /**
     * <p>
     * Gets stream-key information for a specified ARN.
     * </p>
     * 
     * @param getStreamKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStreamKey operation returned by the service.
     * @sample AmazonIVSAsyncHandler.GetStreamKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/GetStreamKey" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStreamKeyResult> getStreamKeyAsync(GetStreamKeyRequest getStreamKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetStreamKeyRequest, GetStreamKeyResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about channels. This list can be filtered to match a specified string.
     * </p>
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AmazonIVSAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Gets summary information about channels. This list can be filtered to match a specified string.
     * </p>
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about stream keys. The list can be filtered to a particular channel.
     * </p>
     * 
     * @param listStreamKeysRequest
     * @return A Java Future containing the result of the ListStreamKeys operation returned by the service.
     * @sample AmazonIVSAsync.ListStreamKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreamKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(ListStreamKeysRequest listStreamKeysRequest);

    /**
     * <p>
     * Gets summary information about stream keys. The list can be filtered to a particular channel.
     * </p>
     * 
     * @param listStreamKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreamKeys operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListStreamKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreamKeys" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamKeysResult> listStreamKeysAsync(ListStreamKeysRequest listStreamKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamKeysRequest, ListStreamKeysResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about live streams.
     * </p>
     * 
     * @param listStreamsRequest
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonIVSAsync.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest);

    /**
     * <p>
     * Gets summary information about live streams.
     * </p>
     * 
     * @param listStreamsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStreams operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListStreams" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest listStreamsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler);

    /**
     * <p>
     * Gets information about the tags for a specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonIVSAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about the tags for a specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonIVSAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Inserts metadata into an RTMP stream for a specified channel. A maximum of 5 requests per second per channel is
     * allowed, each with a maximum 1KB payload.
     * </p>
     * 
     * @param putMetadataRequest
     * @return A Java Future containing the result of the PutMetadata operation returned by the service.
     * @sample AmazonIVSAsync.PutMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PutMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(PutMetadataRequest putMetadataRequest);

    /**
     * <p>
     * Inserts metadata into an RTMP stream for a specified channel. A maximum of 5 requests per second per channel is
     * allowed, each with a maximum 1KB payload.
     * </p>
     * 
     * @param putMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMetadata operation returned by the service.
     * @sample AmazonIVSAsyncHandler.PutMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PutMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutMetadataResult> putMetadataAsync(PutMetadataRequest putMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<PutMetadataRequest, PutMetadataResult> asyncHandler);

    /**
     * <p>
     * Disconnects the stream for the specified channel. This disconnects the incoming RTMP stream from the client. Can
     * be used in conjunction with <a>DeleteStreamKey</a> to prevent further streaming to a channel.
     * </p>
     * <note>
     * <p>
     * Many streaming client-software libraries automatically reconnect a dropped RTMP session, so to stop the stream
     * permanently, you may want to first revoke the <code>streamKey</code> attached to the channel.
     * </p>
     * </note>
     * 
     * @param stopStreamRequest
     * @return A Java Future containing the result of the StopStream operation returned by the service.
     * @sample AmazonIVSAsync.StopStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StopStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopStreamResult> stopStreamAsync(StopStreamRequest stopStreamRequest);

    /**
     * <p>
     * Disconnects the stream for the specified channel. This disconnects the incoming RTMP stream from the client. Can
     * be used in conjunction with <a>DeleteStreamKey</a> to prevent further streaming to a channel.
     * </p>
     * <note>
     * <p>
     * Many streaming client-software libraries automatically reconnect a dropped RTMP session, so to stop the stream
     * permanently, you may want to first revoke the <code>streamKey</code> attached to the channel.
     * </p>
     * </note>
     * 
     * @param stopStreamRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopStream operation returned by the service.
     * @sample AmazonIVSAsyncHandler.StopStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StopStream" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopStreamResult> stopStreamAsync(StopStreamRequest stopStreamRequest,
            com.amazonaws.handlers.AsyncHandler<StopStreamRequest, StopStreamResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for a resource with a specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonIVSAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for a resource with a specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonIVSAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags for a resource with a specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonIVSAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags for a resource with a specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonIVSAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and
     * restart the stream for the changes to take effect.
     * </p>
     * 
     * @param updateChannelRequest
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AmazonIVSAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates a channel's configuration. This does not affect an ongoing stream of this channel. You must stop and
     * restart the stream for the changes to take effect.
     * </p>
     * 
     * @param updateChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AmazonIVSAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

}
