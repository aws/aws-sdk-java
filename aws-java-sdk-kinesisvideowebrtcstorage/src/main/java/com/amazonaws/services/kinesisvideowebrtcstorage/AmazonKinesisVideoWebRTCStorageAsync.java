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
package com.amazonaws.services.kinesisvideowebrtcstorage;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideowebrtcstorage.model.*;

/**
 * Interface for accessing Amazon Kinesis Video WebRTC Storage asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideowebrtcstorage.AbstractAmazonKinesisVideoWebRTCStorageAsync} instead.
 * </p>
 * <p>
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoWebRTCStorageAsync extends AmazonKinesisVideoWebRTCStorage {

    /**
     * <p>
     * Join the ongoing one way-video and/or multi-way audio WebRTC session as a video producing device for an input
     * channel. If there’s no existing session for the channel, a new streaming session needs to be created, and the
     * Amazon Resource Name (ARN) of the signaling channel must be provided.
     * </p>
     * <p>
     * Currently for the <code>SINGLE_MASTER</code> type, a video producing device is able to ingest both audio and
     * video media into a stream, while viewers can only ingest audio. Both a video producing device and viewers can
     * join the session first, and wait for other participants.
     * </p>
     * <p>
     * While participants are having peer to peer conversations through webRTC, the ingested media session will be
     * stored into the Kinesis Video Stream. Multiple viewers are able to playback real-time media.
     * </p>
     * <p>
     * Customers can also use existing Kinesis Video Streams features like <code>HLS</code> or <code>DASH</code>
     * playback, Image generation, and more with ingested WebRTC media.
     * </p>
     * <note>
     * <p>
     * Assume that only one video producing device client can be associated with a session for the channel. If more than
     * one client joins the session of a specific channel as a video producing device, the most recent client request
     * takes precedence.
     * </p>
     * </note>
     * 
     * @param joinStorageSessionRequest
     * @return A Java Future containing the result of the JoinStorageSession operation returned by the service.
     * @sample AmazonKinesisVideoWebRTCStorageAsync.JoinStorageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-webrtc-storage-2018-05-10/JoinStorageSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<JoinStorageSessionResult> joinStorageSessionAsync(JoinStorageSessionRequest joinStorageSessionRequest);

    /**
     * <p>
     * Join the ongoing one way-video and/or multi-way audio WebRTC session as a video producing device for an input
     * channel. If there’s no existing session for the channel, a new streaming session needs to be created, and the
     * Amazon Resource Name (ARN) of the signaling channel must be provided.
     * </p>
     * <p>
     * Currently for the <code>SINGLE_MASTER</code> type, a video producing device is able to ingest both audio and
     * video media into a stream, while viewers can only ingest audio. Both a video producing device and viewers can
     * join the session first, and wait for other participants.
     * </p>
     * <p>
     * While participants are having peer to peer conversations through webRTC, the ingested media session will be
     * stored into the Kinesis Video Stream. Multiple viewers are able to playback real-time media.
     * </p>
     * <p>
     * Customers can also use existing Kinesis Video Streams features like <code>HLS</code> or <code>DASH</code>
     * playback, Image generation, and more with ingested WebRTC media.
     * </p>
     * <note>
     * <p>
     * Assume that only one video producing device client can be associated with a session for the channel. If more than
     * one client joins the session of a specific channel as a video producing device, the most recent client request
     * takes precedence.
     * </p>
     * </note>
     * 
     * @param joinStorageSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the JoinStorageSession operation returned by the service.
     * @sample AmazonKinesisVideoWebRTCStorageAsyncHandler.JoinStorageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-webrtc-storage-2018-05-10/JoinStorageSession"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<JoinStorageSessionResult> joinStorageSessionAsync(JoinStorageSessionRequest joinStorageSessionRequest,
            com.amazonaws.handlers.AsyncHandler<JoinStorageSessionRequest, JoinStorageSessionResult> asyncHandler);

}
