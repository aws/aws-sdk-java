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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing ivschat asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonivschatAsyncClient extends AmazonivschatClient implements AmazonivschatAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonivschatAsyncClientBuilder asyncBuilder() {
        return AmazonivschatAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ivschat using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonivschatAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on ivschat using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonivschatAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(CreateChatTokenRequest request) {

        return createChatTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(final CreateChatTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateChatTokenRequest, CreateChatTokenResult> asyncHandler) {
        final CreateChatTokenRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateChatTokenResult>() {
            @Override
            public CreateChatTokenResult call() throws Exception {
                CreateChatTokenResult result = null;

                try {
                    result = executeCreateChatToken(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(CreateLoggingConfigurationRequest request) {

        return createLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoggingConfigurationResult> createLoggingConfigurationAsync(final CreateLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLoggingConfigurationRequest, CreateLoggingConfigurationResult> asyncHandler) {
        final CreateLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateLoggingConfigurationResult>() {
            @Override
            public CreateLoggingConfigurationResult call() throws Exception {
                CreateLoggingConfigurationResult result = null;

                try {
                    result = executeCreateLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest request) {

        return createRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoomResult> createRoomAsync(final CreateRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoomRequest, CreateRoomResult> asyncHandler) {
        final CreateRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoomResult>() {
            @Override
            public CreateRoomResult call() throws Exception {
                CreateRoomResult result = null;

                try {
                    result = executeCreateRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request) {

        return deleteLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(final DeleteLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler) {
        final DeleteLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoggingConfigurationResult>() {
            @Override
            public DeleteLoggingConfigurationResult call() throws Exception {
                DeleteLoggingConfigurationResult result = null;

                try {
                    result = executeDeleteLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest request) {

        return deleteMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(final DeleteMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler) {
        final DeleteMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMessageResult>() {
            @Override
            public DeleteMessageResult call() throws Exception {
                DeleteMessageResult result = null;

                try {
                    result = executeDeleteMessage(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest request) {

        return deleteRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(final DeleteRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoomRequest, DeleteRoomResult> asyncHandler) {
        final DeleteRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoomResult>() {
            @Override
            public DeleteRoomResult call() throws Exception {
                DeleteRoomResult result = null;

                try {
                    result = executeDeleteRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(DisconnectUserRequest request) {

        return disconnectUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(final DisconnectUserRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisconnectUserRequest, DisconnectUserResult> asyncHandler) {
        final DisconnectUserRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisconnectUserResult>() {
            @Override
            public DisconnectUserResult call() throws Exception {
                DisconnectUserResult result = null;

                try {
                    result = executeDisconnectUser(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest request) {

        return getLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(final GetLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler) {
        final GetLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoggingConfigurationResult>() {
            @Override
            public GetLoggingConfigurationResult call() throws Exception {
                GetLoggingConfigurationResult result = null;

                try {
                    result = executeGetLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest request) {

        return getRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoomResult> getRoomAsync(final GetRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRoomRequest, GetRoomResult> asyncHandler) {
        final GetRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRoomResult>() {
            @Override
            public GetRoomResult call() throws Exception {
                GetRoomResult result = null;

                try {
                    result = executeGetRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(ListLoggingConfigurationsRequest request) {

        return listLoggingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(final ListLoggingConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler) {
        final ListLoggingConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLoggingConfigurationsResult>() {
            @Override
            public ListLoggingConfigurationsResult call() throws Exception {
                ListLoggingConfigurationsResult result = null;

                try {
                    result = executeListLoggingConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest request) {

        return listRoomsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(final ListRoomsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoomsRequest, ListRoomsResult> asyncHandler) {
        final ListRoomsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoomsResult>() {
            @Override
            public ListRoomsResult call() throws Exception {
                ListRoomsResult result = null;

                try {
                    result = executeListRooms(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest request) {

        return sendEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(final SendEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<SendEventRequest, SendEventResult> asyncHandler) {
        final SendEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SendEventResult>() {
            @Override
            public SendEventResult call() throws Exception {
                SendEventResult result = null;

                try {
                    result = executeSendEvent(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(UpdateLoggingConfigurationRequest request) {

        return updateLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLoggingConfigurationResult> updateLoggingConfigurationAsync(final UpdateLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateLoggingConfigurationRequest, UpdateLoggingConfigurationResult> asyncHandler) {
        final UpdateLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateLoggingConfigurationResult>() {
            @Override
            public UpdateLoggingConfigurationResult call() throws Exception {
                UpdateLoggingConfigurationResult result = null;

                try {
                    result = executeUpdateLoggingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest request) {

        return updateRoomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(final UpdateRoomRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoomRequest, UpdateRoomResult> asyncHandler) {
        final UpdateRoomRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoomResult>() {
            @Override
            public UpdateRoomResult call() throws Exception {
                UpdateRoomResult result = null;

                try {
                    result = executeUpdateRoom(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
