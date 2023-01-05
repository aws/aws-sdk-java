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
package com.amazonaws.services.ivschat;

import javax.annotation.Generated;

import com.amazonaws.services.ivschat.model.*;

/**
 * Interface for accessing ivschat asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivschat.AbstractAmazonivschatAsync} instead.
 * </p>
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon IVS Chat control-plane API enables you to create and manage Amazon IVS Chat resources. You also need to
 * integrate with the <a href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html">
 * Amazon IVS Chat Messaging API</a>, to enable users to interact with chat rooms in real time.
 * </p>
 * <p>
 * The API is an AWS regional service. For a list of supported regions and Amazon IVS Chat HTTPS service endpoints, see
 * the Amazon IVS Chat information on the <a href="https://docs.aws.amazon.com/general/latest/gr/ivs.html">Amazon IVS
 * page</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Notes on terminology:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * You create service applications using the Amazon IVS Chat API. We refer to these as <i>applications</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You create front-end client applications (browser and Android/iOS apps) using the Amazon IVS Chat Messaging API. We
 * refer to these as <i>clients</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Resources</b>
 * </p>
 * <p>
 * The following resources are part of Amazon IVS Chat:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>LoggingConfiguration</b> — A configuration that allows customers to store and record sent messages in a chat room.
 * See the Logging Configuration endpoints for more information.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Room</b> — The central Amazon IVS Chat resource through which clients connect to and exchange chat messages. See
 * the Room endpoints for more information.
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
 * information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS Chat has
 * no service-specific constraints beyond what is documented there.
 * </p>
 * <p>
 * Tags can help you identify and organize your AWS resources. For example, you can use the same tag for different
 * resources to indicate that they are related. You can also use tags to manage access (see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html">Access Tags</a>).
 * </p>
 * <p>
 * The Amazon IVS Chat API has these tag-related endpoints: <a>TagResource</a>, <a>UntagResource</a>, and
 * <a>ListTagsForResource</a>. The following resource supports tagging: Room.
 * </p>
 * <p>
 * At most 50 tags can be applied to a resource.
 * </p>
 * <p>
 * <b>API Access Security</b>
 * </p>
 * <p>
 * Your Amazon IVS Chat applications (service applications and clients) must be authenticated and authorized to access
 * Amazon IVS Chat resources. Note the differences between these concepts:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>Authentication</i> is about verifying identity. Requests to the Amazon IVS Chat API must be signed to verify your
 * identity.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Authorization</i> is about granting permissions. Your IAM roles need to have permissions for Amazon IVS Chat API
 * requests.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Users (viewers) connect to a room using secure access tokens that you create using the <a>CreateChatToken</a>
 * endpoint through the AWS SDK. You call CreateChatToken for every user’s chat session, passing identity and
 * authorization information about the user.
 * </p>
 * <p>
 * <b>Signing API Requests</b>
 * </p>
 * <p>
 * HTTP API requests must be signed with an AWS SigV4 signature using your AWS security credentials. The AWS Command
 * Line Interface (CLI) and the AWS SDKs take care of signing the underlying API calls for you. However, if your
 * application calls the Amazon IVS Chat HTTP API directly, it’s your responsibility to sign the requests.
 * </p>
 * <p>
 * You generate a signature using valid AWS credentials for an IAM role that has permission to perform the requested
 * action. For example, DeleteMessage requests must be made using an IAM role that has the
 * <code>ivschat:DeleteMessage</code> permission.
 * </p>
 * <p>
 * For more information:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Authentication and generating signatures — See <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html">Authenticating Requests
 * (Amazon Web Services Signature Version 4)</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Managing Amazon IVS permissions — See <a
 * href="https://docs.aws.amazon.com/ivs/latest/userguide/security-iam.html">Identity and Access Management</a> on the
 * Security page of the <i>Amazon IVS User Guide</i>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon Resource Names (ARNs)</b>
 * </p>
 * <p>
 * ARNs uniquely identify AWS resources. An ARN is required when you need to specify a resource unambiguously across all
 * of AWS, such as in IAM policies and API calls. For more information, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Messaging Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteMessage</a> — Sends an event to a specific room which directs clients to delete a specific message; that is,
 * unrender it from view and delete it from the client’s chat history. This event’s <code>EventName</code> is
 * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
 * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DisconnectUser</a> — Disconnects all connections using a specified user ID from a room. This replicates the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
 * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>SendEvent</a> — Sends an event to a room. Use this within your application’s business logic to send events to
 * clients of a room; e.g., to notify clients to change the way the chat UI is rendered.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Chat Token Endpoint</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateChatToken</a> — Creates an encrypted token that is used by a chat participant to establish an individual
 * WebSocket chat connection to a room. When the token is used to connect to chat, the connection is valid for the
 * session duration specified in the request. The token becomes invalid at the token-expiration timestamp included in
 * the response.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Room Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateRoom</a> — Creates a room that allows clients to connect and pass messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteRoom</a> — Deletes the specified room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetRoom</a> — Gets the specified room.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListRooms</a> — Gets summary information about all your rooms in the AWS region where the API request is
 * processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRoom</a> — Updates a room’s configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Logging Configuration Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateLoggingConfiguration</a> — Creates a logging configuration that allows clients to store and record sent
 * messages.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteLoggingConfiguration</a> — Deletes the specified logging configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetLoggingConfiguration</a> — Gets the specified logging configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListLoggingConfigurations</a> — Gets summary information about all your logging configurations in the AWS region
 * where the API request is processed.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateLoggingConfiguration</a> — Updates a specified logging configuration.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Tags Endpoints</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a> — Gets information about AWS tags for the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a> — Adds or updates tags for the AWS resource with the specified ARN.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a> — Removes tags from the resource with the specified ARN.
 * </p>
 * </li>
 * </ul>
 * <p>
 * All the above are HTTP operations. There is a separate <i>messaging</i> API for managing Chat resources; see the <a
 * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html"> Amazon IVS Chat Messaging
 * API Reference</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonivschatAsync extends Amazonivschat {

    /**
     * <p>
     * Creates an encrypted token that is used by a chat participant to establish an individual WebSocket chat
     * connection to a room. When the token is used to connect to chat, the connection is valid for the session duration
     * specified in the request. The token becomes invalid at the token-expiration timestamp included in the response.
     * </p>
     * <p>
     * Use the <code>capabilities</code> field to permit an end user to send messages or moderate a room.
     * </p>
     * <p>
     * The <code>attributes</code> field securely attaches structured data to the chat session; the data is included
     * within each message sent by the end user and received by other participants in the room. Common use cases for
     * attributes include passing end-user profile data like an icon, display name, colors, badges, and other display
     * features.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS Chat and never used directly by your application.
     * </p>
     * 
     * @param createChatTokenRequest
     * @return A Java Future containing the result of the CreateChatToken operation returned by the service.
     * @sample AmazonivschatAsync.CreateChatToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateChatToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(CreateChatTokenRequest createChatTokenRequest);

    /**
     * <p>
     * Creates an encrypted token that is used by a chat participant to establish an individual WebSocket chat
     * connection to a room. When the token is used to connect to chat, the connection is valid for the session duration
     * specified in the request. The token becomes invalid at the token-expiration timestamp included in the response.
     * </p>
     * <p>
     * Use the <code>capabilities</code> field to permit an end user to send messages or moderate a room.
     * </p>
     * <p>
     * The <code>attributes</code> field securely attaches structured data to the chat session; the data is included
     * within each message sent by the end user and received by other participants in the room. Common use cases for
     * attributes include passing end-user profile data like an icon, display name, colors, badges, and other display
     * features.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS Chat and never used directly by your application.
     * </p>
     * 
     * @param createChatTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChatToken operation returned by the service.
     * @sample AmazonivschatAsyncHandler.CreateChatToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateChatToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(CreateChatTokenRequest createChatTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChatTokenRequest, CreateChatTokenResult> asyncHandler);

    /**
     * <p>
     * Creates a logging configuration that allows clients to store and record sent messages.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     * @return A Java Future containing the result of the CreateLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsync.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(
            CreateLoggingConfigurationRequest createLoggingConfigurationRequest);

    /**
     * <p>
     * Creates a logging configuration that allows clients to store and record sent messages.
     * </p>
     * 
     * @param createLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsyncHandler.CreateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(
            CreateLoggingConfigurationRequest createLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoggingConfigurationRequest, CreateLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a room that allows clients to connect and pass messages.
     * </p>
     * 
     * @param createRoomRequest
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonivschatAsync.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest);

    /**
     * <p>
     * Creates a room that allows clients to connect and pass messages.
     * </p>
     * 
     * @param createRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoomRequest, CreateRoomResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified logging configuration.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsync.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Deletes the specified logging configuration.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsyncHandler.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from
     * view and delete it from the client’s chat history. This event’s <code>EventName</code> is
     * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
     * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param deleteMessageRequest
     * @return A Java Future containing the result of the DeleteMessage operation returned by the service.
     * @sample AmazonivschatAsync.DeleteMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest);

    /**
     * <p>
     * Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from
     * view and delete it from the client’s chat history. This event’s <code>EventName</code> is
     * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
     * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param deleteMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMessage operation returned by the service.
     * @sample AmazonivschatAsyncHandler.DeleteMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified room.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonivschatAsync.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest);

    /**
     * <p>
     * Deletes the specified room.
     * </p>
     * 
     * @param deleteRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoomRequest, DeleteRoomResult> asyncHandler);

    /**
     * <p>
     * Disconnects all connections using a specified user ID from a room. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
     * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param disconnectUserRequest
     * @return A Java Future containing the result of the DisconnectUser operation returned by the service.
     * @sample AmazonivschatAsync.DisconnectUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DisconnectUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(DisconnectUserRequest disconnectUserRequest);

    /**
     * <p>
     * Disconnects all connections using a specified user ID from a room. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
     * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param disconnectUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectUser operation returned by the service.
     * @sample AmazonivschatAsyncHandler.DisconnectUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DisconnectUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(DisconnectUserRequest disconnectUserRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectUserRequest, DisconnectUserResult> asyncHandler);

    /**
     * <p>
     * Gets the specified logging configuration.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsync.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest);

    /**
     * <p>
     * Gets the specified logging configuration.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsyncHandler.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets the specified room.
     * </p>
     * 
     * @param getRoomRequest
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonivschatAsync.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest);

    /**
     * <p>
     * Gets the specified room.
     * </p>
     * 
     * @param getRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoomRequest, GetRoomResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all your logging configurations in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AmazonivschatAsync.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest);

    /**
     * <p>
     * Gets summary information about all your logging configurations in the AWS region where the API request is
     * processed.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AmazonivschatAsyncHandler.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all your rooms in the AWS region where the API request is processed. Results are
     * sorted in descending order of <code>updateTime</code>.
     * </p>
     * 
     * @param listRoomsRequest
     * @return A Java Future containing the result of the ListRooms operation returned by the service.
     * @sample AmazonivschatAsync.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest listRoomsRequest);

    /**
     * <p>
     * Gets summary information about all your rooms in the AWS region where the API request is processed. Results are
     * sorted in descending order of <code>updateTime</code>.
     * </p>
     * 
     * @param listRoomsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRooms operation returned by the service.
     * @sample AmazonivschatAsyncHandler.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest listRoomsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoomsRequest, ListRoomsResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonivschatAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonivschatAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sends an event to a room. Use this within your application’s business logic to send events to clients of a room;
     * e.g., to notify clients to change the way the chat UI is rendered.
     * </p>
     * 
     * @param sendEventRequest
     * @return A Java Future containing the result of the SendEvent operation returned by the service.
     * @sample AmazonivschatAsync.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/SendEvent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest);

    /**
     * <p>
     * Sends an event to a room. Use this within your application’s business logic to send events to clients of a room;
     * e.g., to notify clients to change the way the chat UI is rendered.
     * </p>
     * 
     * @param sendEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendEvent operation returned by the service.
     * @sample AmazonivschatAsyncHandler.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/SendEvent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest,
            com.amazonaws.handlers.AsyncHandler<SendEventRequest, SendEventResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonivschatAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonivschatAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonivschatAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonivschatAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a specified logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     * @return A Java Future containing the result of the UpdateLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsync.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(
            UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest);

    /**
     * <p>
     * Updates a specified logging configuration.
     * </p>
     * 
     * @param updateLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLoggingConfiguration operation returned by the service.
     * @sample AmazonivschatAsyncHandler.UpdateLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(
            UpdateLoggingConfigurationRequest updateLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates a room’s configuration.
     * </p>
     * 
     * @param updateRoomRequest
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonivschatAsync.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest);

    /**
     * <p>
     * Updates a room’s configuration.
     * </p>
     * 
     * @param updateRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoomRequest, UpdateRoomResult> asyncHandler);

}
