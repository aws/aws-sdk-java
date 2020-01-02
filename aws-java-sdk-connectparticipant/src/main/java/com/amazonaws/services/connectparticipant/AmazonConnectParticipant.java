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
package com.amazonaws.services.connectparticipant;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connectparticipant.model.*;

/**
 * Interface for accessing Amazon Connect Participant.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectparticipant.AbstractAmazonConnectParticipant} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Connect is a cloud-based contact center solution that makes it easy to set up and manage a customer contact
 * center and provide reliable customer engagement at any scale.
 * </p>
 * <p>
 * Amazon Connect enables customer contacts through voice or chat.
 * </p>
 * <p>
 * The APIs described here are used by chat participants, such as agents and customers.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectParticipant {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "participant.connect";

    /**
     * <p>
     * Creates the participant's connection. Note that ParticipantToken is used for invoking this API instead of
     * ConnectionToken.
     * </p>
     * <p>
     * The participant token is valid for the lifetime of the participant – until the they are part of a contact.
     * </p>
     * <p>
     * The response URL for <code>WEBSOCKET</code> Type has a connect expiry timeout of 100s. Clients must manually
     * connect to the returned websocket URL and subscribe to the desired topic.
     * </p>
     * <p>
     * For chat, you need to publish the following on the established websocket connection:
     * </p>
     * <p>
     * <code>{"topic":"aws/subscribe","content":{"topics":["aws/chat"]}}</code>
     * </p>
     * <p>
     * Upon websocket URL expiry, as specified in the response ConnectionExpiry parameter, clients need to call this API
     * again to obtain a new websocket URL and perform the same steps as before.
     * </p>
     * 
     * @param createParticipantConnectionRequest
     * @return Result of the CreateParticipantConnection operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.CreateParticipantConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CreateParticipantConnection"
     *      target="_top">AWS API Documentation</a>
     */
    CreateParticipantConnectionResult createParticipantConnection(CreateParticipantConnectionRequest createParticipantConnectionRequest);

    /**
     * <p>
     * Disconnects a participant. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return Result of the DisconnectParticipant operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    DisconnectParticipantResult disconnectParticipant(DisconnectParticipantRequest disconnectParticipantRequest);

    /**
     * <p>
     * Retrieves a transcript of the session. Note that ConnectionToken is used for invoking this API instead of
     * ParticipantToken.
     * </p>
     * 
     * @param getTranscriptRequest
     * @return Result of the GetTranscript operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.GetTranscript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetTranscript"
     *      target="_top">AWS API Documentation</a>
     */
    GetTranscriptResult getTranscript(GetTranscriptRequest getTranscriptRequest);

    /**
     * <p>
     * Sends an event. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * 
     * @param sendEventRequest
     * @return Result of the SendEvent operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendEvent" target="_top">AWS
     *      API Documentation</a>
     */
    SendEventResult sendEvent(SendEventRequest sendEventRequest);

    /**
     * <p>
     * Sends a message. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * 
     * @param sendMessageRequest
     * @return Result of the SendMessage operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.SendMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendMessage" target="_top">AWS
     *      API Documentation</a>
     */
    SendMessageResult sendMessage(SendMessageRequest sendMessageRequest);

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
