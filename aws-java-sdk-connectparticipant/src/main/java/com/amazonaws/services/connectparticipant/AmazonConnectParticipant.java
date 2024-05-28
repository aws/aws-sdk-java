/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Connect is an easy-to-use omnichannel cloud contact center service that enables companies of any size to
 * deliver superior customer service at a lower cost. Amazon Connect communications capabilities make it easy for
 * companies to deliver personalized interactions across communication channels, including chat.
 * </p>
 * <p>
 * Use the Amazon Connect Participant Service to manage participants (for example, agents, customers, and managers
 * listening in), and to send messages and events within a chat contact. The APIs in the service enable the following:
 * sending chat messages, attachment sharing, managing a participant's connection state and message events, and
 * retrieving chat transcripts.
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
     * Allows you to confirm that the attachment has been uploaded using the pre-signed URL provided in
     * StartAttachmentUpload API. A conflict exception is thrown when an attachment with that identifier is already
     * being uploaded.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param completeAttachmentUploadRequest
     * @return Result of the CompleteAttachmentUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @throws ServiceQuotaExceededException
     *         The number of attachments per contact exceeds the quota.
     * @throws ConflictException
     *         The requested operation conflicts with the current state of a service resource associated with the
     *         request.
     * @sample AmazonConnectParticipant.CompleteAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CompleteAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    CompleteAttachmentUploadResult completeAttachmentUpload(CompleteAttachmentUploadRequest completeAttachmentUploadRequest);

    /**
     * <p>
     * Creates the participant's connection.
     * </p>
     * <note>
     * <p>
     * <code>ParticipantToken</code> is used for invoking this API instead of <code>ConnectionToken</code>.
     * </p>
     * </note>
     * <p>
     * The participant token is valid for the lifetime of the participant – until they are part of a contact.
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
     * <p>
     * <b>Message streaming support</b>: This API can also be used together with the <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_StartContactStreaming.html"
     * >StartContactStreaming</a> API to create a participant connection for chat contacts that are not using a
     * websocket. For more information about message streaming, <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-message-streaming.html">Enable real-time chat
     * message streaming</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * <b>Feature specifications</b>: For information about feature specifications, such as the allowed number of open
     * websocket connections per participant, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits"
     * >Feature specifications</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * </note>
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
     * Retrieves the view for the specified view token.
     * </p>
     * 
     * @param describeViewRequest
     * @return Result of the DescribeView operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The resource was not found.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.DescribeView
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/DescribeView"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeViewResult describeView(DescribeViewRequest describeViewRequest);

    /**
     * <p>
     * Disconnects a participant.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
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
     * Provides a pre-signed URL for download of a completed attachment. This is an asynchronous API for use with active
     * contacts.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param getAttachmentRequest
     * @return Result of the GetAttachment operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @sample AmazonConnectParticipant.GetAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    GetAttachmentResult getAttachment(GetAttachmentRequest getAttachmentRequest);

    /**
     * <p>
     * Retrieves a transcript of the session, including details about any attachments. For information about accessing
     * past chat contact transcripts for a persistent chat, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable persistent chat</a>.
     * </p>
     * <p>
     * If you have a process that consumes events in the transcript of an chat that has ended, note that chat
     * transcripts contain the following event content types if the event has occurred during the chat session:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.participant.left</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.participant.joined</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.chat.ended</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.transfer.succeeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application/vnd.amazonaws.connect.event.transfer.failed</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
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
     * <note>
     * <p>
     * The <code>application/vnd.amazonaws.connect.event.connection.acknowledged</code> ContentType will no longer be
     * supported starting December 31, 2024. This event has been migrated to the <a
     * href="https://docs.aws.amazon.com/connect-participant/latest/APIReference/API_CreateParticipantConnection.html"
     * >CreateParticipantConnection</a> API using the <code>ConnectParticipant</code> field.
     * </p>
     * </note>
     * <p>
     * Sends an event. Message receipts are not supported when there are more than two active participants in the chat.
     * Using the SendEvent API for message receipts when a supervisor is barged-in will result in a conflict exception.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
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
     * @throws ConflictException
     *         The requested operation conflicts with the current state of a service resource associated with the
     *         request.
     * @sample AmazonConnectParticipant.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendEvent" target="_top">AWS
     *      API Documentation</a>
     */
    SendEventResult sendEvent(SendEventRequest sendEventRequest);

    /**
     * <p>
     * Sends a message.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
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
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading the file directly to S3.
     * </p>
     * <note>
     * <p>
     * <code>ConnectionToken</code> is used for invoking this API instead of <code>ParticipantToken</code>.
     * </p>
     * </note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param startAttachmentUploadRequest
     * @return Result of the StartAttachmentUpload operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerException
     *         This exception occurs when there is an internal failure in the Amazon Connect service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by Amazon Connect.
     * @throws ServiceQuotaExceededException
     *         The number of attachments per contact exceeds the quota.
     * @sample AmazonConnectParticipant.StartAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/StartAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    StartAttachmentUploadResult startAttachmentUpload(StartAttachmentUploadRequest startAttachmentUploadRequest);

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
