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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisvideosignalingchannels.model.*;

/**
 * Interface for accessing Amazon Kinesis Video Signaling Channels.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideosignalingchannels.AbstractAmazonKinesisVideoSignalingChannels} instead.
 * </p>
 * <p>
 * <p>
 * Kinesis Video Streams Signaling Service is a intermediate service that establishes a communication channel for
 * discovering peers, transmitting offers and answers in order to establish peer-to-peer connection in webRTC
 * technology.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoSignalingChannels {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kinesisvideo";

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
     * @return Result of the GetIceServerConfig operation returned by the service.
     * @throws InvalidClientException
     *         The specified client is invalid.
     * @throws SessionExpiredException
     *         If the client session is expired. Once the client is connected, the session is valid for 45 minutes.
     *         Client should reconnect to the channel to continue sending/receiving messages.
     * @throws ClientLimitExceededException
     *         Your request was throttled because you have exceeded the limit of allowed client calls. Try making the
     *         call later.
     * @throws ResourceNotFoundException
     *         The specified resource is not found.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideoSignalingChannels.GetIceServerConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/GetIceServerConfig"
     *      target="_top">AWS API Documentation</a>
     */
    GetIceServerConfigResult getIceServerConfig(GetIceServerConfigRequest getIceServerConfigRequest);

    /**
     * <p>
     * This API allows you to connect WebRTC-enabled devices with Alexa display devices. When invoked, it sends the
     * Alexa Session Description Protocol (SDP) offer to the master peer. The offer is delivered as soon as the master
     * is connected to the specified signaling channel. This API returns the SDP answer from the connected master. If
     * the master is not connected to the signaling channel, redelivery requests are made until the message expires.
     * </p>
     * 
     * @param sendAlexaOfferToMasterRequest
     * @return Result of the SendAlexaOfferToMaster operation returned by the service.
     * @throws ClientLimitExceededException
     *         Your request was throttled because you have exceeded the limit of allowed client calls. Try making the
     *         call later.
     * @throws ResourceNotFoundException
     *         The specified resource is not found.
     * @throws InvalidArgumentException
     *         The value for this input parameter is invalid.
     * @throws NotAuthorizedException
     *         The caller is not authorized to perform this operation.
     * @sample AmazonKinesisVideoSignalingChannels.SendAlexaOfferToMaster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/SendAlexaOfferToMaster"
     *      target="_top">AWS API Documentation</a>
     */
    SendAlexaOfferToMasterResult sendAlexaOfferToMaster(SendAlexaOfferToMasterRequest sendAlexaOfferToMasterRequest);

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
