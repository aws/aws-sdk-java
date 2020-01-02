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
package com.amazonaws.services.kinesisvideosignalingchannels;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideosignalingchannels.model.*;

/**
 * Interface for accessing Amazon Kinesis Video Signaling Channels asynchronously. Each asynchronous method will return
 * a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideosignalingchannels.AbstractAmazonKinesisVideoSignalingChannelsAsync}
 * instead.
 * </p>
 * <p>
 * <p>
 * Kinesis Video Streams Signaling Service is a intermediate service that establishes a communication channel for
 * discovering peers, transmitting offers and answers in order to establish peer-to-peer connection in webRTC
 * technology.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoSignalingChannelsAsync extends AmazonKinesisVideoSignalingChannels {

    /**
     * <p>
     * Gets the Interactive Connectivity Establishment (ICE) server configuration information, including URIs, username,
     * and password which can be used to configure the WebRTC connection. The ICE component uses this configuration
     * information to setup the WebRTC connection, including authenticating with the Traversal Using Relays around NAT
     * (TURN) relay server.
     * </p>
     * <p>
     * TURN is a protocol that is used to improve the connectivity of peer-to-peer applications. By providing a
     * cloud-based relay service, TURN ensures that a connection can be established even when one or more peers are
     * incapable of a direct peer-to-peer connection. For more information, see <a
     * href="https://tools.ietf.org/html/draft-uberti-rtcweb-turn-rest-00">A REST API For Access To TURN Services</a>.
     * </p>
     * <p>
     * You can invoke this API to establish a fallback mechanism in case either of the peers is unable to establish a
     * direct peer-to-peer connection over a signaling channel. You must specify either a signaling channel ARN or the
     * client ID in order to invoke this API.
     * </p>
     * 
     * @param getIceServerConfigRequest
     * @return A Java Future containing the result of the GetIceServerConfig operation returned by the service.
     * @sample AmazonKinesisVideoSignalingChannelsAsync.GetIceServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/GetIceServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIceServerConfigResult> getIceServerConfigAsync(GetIceServerConfigRequest getIceServerConfigRequest);

    /**
     * <p>
     * Gets the Interactive Connectivity Establishment (ICE) server configuration information, including URIs, username,
     * and password which can be used to configure the WebRTC connection. The ICE component uses this configuration
     * information to setup the WebRTC connection, including authenticating with the Traversal Using Relays around NAT
     * (TURN) relay server.
     * </p>
     * <p>
     * TURN is a protocol that is used to improve the connectivity of peer-to-peer applications. By providing a
     * cloud-based relay service, TURN ensures that a connection can be established even when one or more peers are
     * incapable of a direct peer-to-peer connection. For more information, see <a
     * href="https://tools.ietf.org/html/draft-uberti-rtcweb-turn-rest-00">A REST API For Access To TURN Services</a>.
     * </p>
     * <p>
     * You can invoke this API to establish a fallback mechanism in case either of the peers is unable to establish a
     * direct peer-to-peer connection over a signaling channel. You must specify either a signaling channel ARN or the
     * client ID in order to invoke this API.
     * </p>
     * 
     * @param getIceServerConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIceServerConfig operation returned by the service.
     * @sample AmazonKinesisVideoSignalingChannelsAsyncHandler.GetIceServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/GetIceServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIceServerConfigResult> getIceServerConfigAsync(GetIceServerConfigRequest getIceServerConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetIceServerConfigRequest, GetIceServerConfigResult> asyncHandler);

    /**
     * <p>
     * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the
     * Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master
     * is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If
     * the master is not connected to the signaling channel, redelivery requests are made until the message expires.
     * </p>
     * 
     * @param sendAlexaOfferToMasterRequest
     * @return A Java Future containing the result of the SendAlexaOfferToMaster operation returned by the service.
     * @sample AmazonKinesisVideoSignalingChannelsAsync.SendAlexaOfferToMaster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/SendAlexaOfferToMaster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendAlexaOfferToMasterResult> sendAlexaOfferToMasterAsync(SendAlexaOfferToMasterRequest sendAlexaOfferToMasterRequest);

    /**
     * <p>
     * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the
     * Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master
     * is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If
     * the master is not connected to the signaling channel, redelivery requests are made until the message expires.
     * </p>
     * 
     * @param sendAlexaOfferToMasterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendAlexaOfferToMaster operation returned by the service.
     * @sample AmazonKinesisVideoSignalingChannelsAsyncHandler.SendAlexaOfferToMaster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/SendAlexaOfferToMaster"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendAlexaOfferToMasterResult> sendAlexaOfferToMasterAsync(SendAlexaOfferToMasterRequest sendAlexaOfferToMasterRequest,
            com.amazonaws.handlers.AsyncHandler<SendAlexaOfferToMasterRequest, SendAlexaOfferToMasterResult> asyncHandler);

}
