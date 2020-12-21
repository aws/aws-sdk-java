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

import com.amazonaws.services.connectparticipant.model.*;

/**
 * Interface for accessing Amazon Connect Participant asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectparticipant.AbstractAmazonConnectParticipantAsync} instead.
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
public interface AmazonConnectParticipantAsync extends AmazonConnectParticipant {

    /**
     * <p>
     * Allows you to confirm that the attachment has been uploaded using the pre-signed URL provided in
     * StartAttachmentUpload API.
     * </p>
     * 
     * @param completeAttachmentUploadRequest
     * @return A Java Future containing the result of the CompleteAttachmentUpload operation returned by the service.
     * @sample AmazonConnectParticipantAsync.CompleteAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CompleteAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CompleteAttachmentUploadResult> completeAttachmentUploadAsync(CompleteAttachmentUploadRequest completeAttachmentUploadRequest);

    /**
     * <p>
     * Allows you to confirm that the attachment has been uploaded using the pre-signed URL provided in
     * StartAttachmentUpload API.
     * </p>
     * 
     * @param completeAttachmentUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteAttachmentUpload operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.CompleteAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CompleteAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CompleteAttachmentUploadResult> completeAttachmentUploadAsync(CompleteAttachmentUploadRequest completeAttachmentUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteAttachmentUploadRequest, CompleteAttachmentUploadResult> asyncHandler);

    /**
     * <p>
     * Creates the participant's connection. Note that ParticipantToken is used for invoking this API instead of
     * ConnectionToken.
     * </p>
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
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * </note>
     * 
     * @param createParticipantConnectionRequest
     * @return A Java Future containing the result of the CreateParticipantConnection operation returned by the service.
     * @sample AmazonConnectParticipantAsync.CreateParticipantConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CreateParticipantConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(
            CreateParticipantConnectionRequest createParticipantConnectionRequest);

    /**
     * <p>
     * Creates the participant's connection. Note that ParticipantToken is used for invoking this API instead of
     * ConnectionToken.
     * </p>
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
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * </note>
     * 
     * @param createParticipantConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateParticipantConnection operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.CreateParticipantConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/CreateParticipantConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(
            CreateParticipantConnectionRequest createParticipantConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateParticipantConnectionRequest, CreateParticipantConnectionResult> asyncHandler);

    /**
     * <p>
     * Disconnects a participant. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @return A Java Future containing the result of the DisconnectParticipant operation returned by the service.
     * @sample AmazonConnectParticipantAsync.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest disconnectParticipantRequest);

    /**
     * <p>
     * Disconnects a participant. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param disconnectParticipantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectParticipant operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.DisconnectParticipant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/DisconnectParticipant"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest disconnectParticipantRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler);

    /**
     * <p>
     * Provides a pre-signed URL for download of a completed attachment. This is an asynchronous API for use with active
     * contacts.
     * </p>
     * 
     * @param getAttachmentRequest
     * @return A Java Future containing the result of the GetAttachment operation returned by the service.
     * @sample AmazonConnectParticipantAsync.GetAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAttachmentResult> getAttachmentAsync(GetAttachmentRequest getAttachmentRequest);

    /**
     * <p>
     * Provides a pre-signed URL for download of a completed attachment. This is an asynchronous API for use with active
     * contacts.
     * </p>
     * 
     * @param getAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAttachment operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.GetAttachment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetAttachment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAttachmentResult> getAttachmentAsync(GetAttachmentRequest getAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetAttachmentRequest, GetAttachmentResult> asyncHandler);

    /**
     * <p>
     * Retrieves a transcript of the session, including details about any attachments. Note that ConnectionToken is used
     * for invoking this API instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param getTranscriptRequest
     * @return A Java Future containing the result of the GetTranscript operation returned by the service.
     * @sample AmazonConnectParticipantAsync.GetTranscript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetTranscript"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTranscriptResult> getTranscriptAsync(GetTranscriptRequest getTranscriptRequest);

    /**
     * <p>
     * Retrieves a transcript of the session, including details about any attachments. Note that ConnectionToken is used
     * for invoking this API instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param getTranscriptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTranscript operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.GetTranscript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/GetTranscript"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTranscriptResult> getTranscriptAsync(GetTranscriptRequest getTranscriptRequest,
            com.amazonaws.handlers.AsyncHandler<GetTranscriptRequest, GetTranscriptResult> asyncHandler);

    /**
     * <p>
     * Sends an event. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param sendEventRequest
     * @return A Java Future containing the result of the SendEvent operation returned by the service.
     * @sample AmazonConnectParticipantAsync.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendEvent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest);

    /**
     * <p>
     * Sends an event. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * 
     * @param sendEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendEvent operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendEvent" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest,
            com.amazonaws.handlers.AsyncHandler<SendEventRequest, SendEventResult> asyncHandler);

    /**
     * <p>
     * Sends a message. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * </note>
     * 
     * @param sendMessageRequest
     * @return A Java Future containing the result of the SendMessage operation returned by the service.
     * @sample AmazonConnectParticipantAsync.SendMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest);

    /**
     * <p>
     * Sends a message. Note that ConnectionToken is used for invoking this API instead of ParticipantToken.
     * </p>
     * <note>
     * <p>
     * The Amazon Connect Participant Service APIs do not use <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4
     * authentication</a>.
     * </p>
     * </note>
     * 
     * @param sendMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendMessage operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.SendMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/SendMessage" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest sendMessageRequest,
            com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler);

    /**
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading the file directly to S3.
     * </p>
     * 
     * @param startAttachmentUploadRequest
     * @return A Java Future containing the result of the StartAttachmentUpload operation returned by the service.
     * @sample AmazonConnectParticipantAsync.StartAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/StartAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAttachmentUploadResult> startAttachmentUploadAsync(StartAttachmentUploadRequest startAttachmentUploadRequest);

    /**
     * <p>
     * Provides a pre-signed Amazon S3 URL in response for uploading the file directly to S3.
     * </p>
     * 
     * @param startAttachmentUploadRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAttachmentUpload operation returned by the service.
     * @sample AmazonConnectParticipantAsyncHandler.StartAttachmentUpload
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectparticipant-2018-09-07/StartAttachmentUpload"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartAttachmentUploadResult> startAttachmentUploadAsync(StartAttachmentUploadRequest startAttachmentUploadRequest,
            com.amazonaws.handlers.AsyncHandler<StartAttachmentUploadRequest, StartAttachmentUploadResult> asyncHandler);

}
