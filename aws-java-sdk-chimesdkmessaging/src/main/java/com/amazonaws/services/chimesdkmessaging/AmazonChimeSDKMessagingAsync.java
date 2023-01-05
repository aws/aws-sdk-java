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
package com.amazonaws.services.chimesdkmessaging;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmessaging.model.*;

/**
 * Interface for accessing Amazon Chime SDK Messaging asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmessaging.AbstractAmazonChimeSDKMessagingAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime SDK Messaging APIs in this section allow software developers to send and receive messages in custom
 * messaging applications. These APIs depend on the frameworks provided by the Amazon Chime SDK Identity APIs. For more
 * information about the messaging APIs, see <a
 * href="https://docs.aws.amazon.com/chime/latest/APIReference/API_Operations_Amazon_Chime_SDK_Messaging.html">Amazon
 * Chime SDK messaging</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeSDKMessagingAsync extends AmazonChimeSDKMessaging {

    /**
     * <p>
     * Associates a channel flow with a channel. Once associated, all messages to that channel go through channel flow
     * processors. To stop processing, use the <code>DisassociateChannelFlow</code> API.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can associate a channel flow. The <code>x-amz-chime-bearer</code>
     * request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that makes the API call as the
     * value in the header.
     * </p>
     * </note>
     * 
     * @param associateChannelFlowRequest
     * @return A Java Future containing the result of the AssociateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.AssociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/AssociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateChannelFlowResult> associateChannelFlowAsync(AssociateChannelFlowRequest associateChannelFlowRequest);

    /**
     * <p>
     * Associates a channel flow with a channel. Once associated, all messages to that channel go through channel flow
     * processors. To stop processing, use the <code>DisassociateChannelFlow</code> API.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can associate a channel flow. The <code>x-amz-chime-bearer</code>
     * request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that makes the API call as the
     * value in the header.
     * </p>
     * </note>
     * 
     * @param associateChannelFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.AssociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/AssociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateChannelFlowResult> associateChannelFlowAsync(AssociateChannelFlowRequest associateChannelFlowRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateChannelFlowRequest, AssociateChannelFlowResult> asyncHandler);

    /**
     * <p>
     * Adds a specified number of users to a channel.
     * </p>
     * 
     * @param batchCreateChannelMembershipRequest
     * @return A Java Future containing the result of the BatchCreateChannelMembership operation returned by the
     *         service.
     * @sample AmazonChimeSDKMessagingAsync.BatchCreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/BatchCreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateChannelMembershipResult> batchCreateChannelMembershipAsync(
            BatchCreateChannelMembershipRequest batchCreateChannelMembershipRequest);

    /**
     * <p>
     * Adds a specified number of users to a channel.
     * </p>
     * 
     * @param batchCreateChannelMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateChannelMembership operation returned by the
     *         service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.BatchCreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/BatchCreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateChannelMembershipResult> batchCreateChannelMembershipAsync(
            BatchCreateChannelMembershipRequest batchCreateChannelMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateChannelMembershipRequest, BatchCreateChannelMembershipResult> asyncHandler);

    /**
     * <p>
     * Calls back Chime SDK Messaging with a processing response message. This should be invoked from the processor
     * Lambda. This is a developer API.
     * </p>
     * <p>
     * You can return one of the following processing responses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update message content or metadata
     * </p>
     * </li>
     * <li>
     * <p>
     * Deny a message
     * </p>
     * </li>
     * <li>
     * <p>
     * Make no changes to the message
     * </p>
     * </li>
     * </ul>
     * 
     * @param channelFlowCallbackRequest
     * @return A Java Future containing the result of the ChannelFlowCallback operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ChannelFlowCallback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelFlowCallback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ChannelFlowCallbackResult> channelFlowCallbackAsync(ChannelFlowCallbackRequest channelFlowCallbackRequest);

    /**
     * <p>
     * Calls back Chime SDK Messaging with a processing response message. This should be invoked from the processor
     * Lambda. This is a developer API.
     * </p>
     * <p>
     * You can return one of the following processing responses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Update message content or metadata
     * </p>
     * </li>
     * <li>
     * <p>
     * Deny a message
     * </p>
     * </li>
     * <li>
     * <p>
     * Make no changes to the message
     * </p>
     * </li>
     * </ul>
     * 
     * @param channelFlowCallbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ChannelFlowCallback operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ChannelFlowCallback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelFlowCallback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ChannelFlowCallbackResult> channelFlowCallbackAsync(ChannelFlowCallbackRequest channelFlowCallbackRequest,
            com.amazonaws.handlers.AsyncHandler<ChannelFlowCallbackRequest, ChannelFlowCallbackResult> asyncHandler);

    /**
     * <p>
     * Creates a channel to which you can add users and send messages.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelRequest
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest);

    /**
     * <p>
     * Creates a channel to which you can add users and send messages.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelResult> createChannelAsync(CreateChannelRequest createChannelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelRequest, CreateChannelResult> asyncHandler);

    /**
     * <p>
     * Permanently bans a member from a channel. Moderators can't add banned members to a channel. To undo a ban, you
     * first have to <code>DeleteChannelBan</code>, and then <code>CreateChannelMembership</code>. Bans are cleaned up
     * when you delete users or channels.
     * </p>
     * <p>
     * If you ban a user who is already part of a channel, that user is automatically kicked from the channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelBanRequest
     * @return A Java Future containing the result of the CreateChannelBan operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.CreateChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelBanResult> createChannelBanAsync(CreateChannelBanRequest createChannelBanRequest);

    /**
     * <p>
     * Permanently bans a member from a channel. Moderators can't add banned members to a channel. To undo a ban, you
     * first have to <code>DeleteChannelBan</code>, and then <code>CreateChannelMembership</code>. Bans are cleaned up
     * when you delete users or channels.
     * </p>
     * <p>
     * If you ban a user who is already part of a channel, that user is automatically kicked from the channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelBanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannelBan operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.CreateChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelBanResult> createChannelBanAsync(CreateChannelBanRequest createChannelBanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelBanRequest, CreateChannelBanResult> asyncHandler);

    /**
     * <p>
     * Creates a channel flow, a container for processors. Processors are AWS Lambda functions that perform actions on
     * chat messages, such as stripping out profanity. You can associate channel flows with channels, and the processors
     * in the channel flow then take action on all messages sent to that channel. This is a developer API.
     * </p>
     * <p>
     * Channel flows process the following items:
     * </p>
     * <ol>
     * <li>
     * <p>
     * New and updated messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Persistent and non-persistent messages
     * </p>
     * </li>
     * <li>
     * <p>
     * The Standard message type
     * </p>
     * </li>
     * </ol>
     * <note>
     * <p>
     * Channel flows don't process Control or System messages. For more information about the message types provided by
     * Chime SDK Messaging, refer to <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/using-the-messaging-sdk.html#msg-types">Message types</a> in
     * the <i>Amazon Chime developer guide</i>.
     * </p>
     * </note>
     * 
     * @param createChannelFlowRequest
     * @return A Java Future containing the result of the CreateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.CreateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelFlowResult> createChannelFlowAsync(CreateChannelFlowRequest createChannelFlowRequest);

    /**
     * <p>
     * Creates a channel flow, a container for processors. Processors are AWS Lambda functions that perform actions on
     * chat messages, such as stripping out profanity. You can associate channel flows with channels, and the processors
     * in the channel flow then take action on all messages sent to that channel. This is a developer API.
     * </p>
     * <p>
     * Channel flows process the following items:
     * </p>
     * <ol>
     * <li>
     * <p>
     * New and updated messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Persistent and non-persistent messages
     * </p>
     * </li>
     * <li>
     * <p>
     * The Standard message type
     * </p>
     * </li>
     * </ol>
     * <note>
     * <p>
     * Channel flows don't process Control or System messages. For more information about the message types provided by
     * Chime SDK Messaging, refer to <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/using-the-messaging-sdk.html#msg-types">Message types</a> in
     * the <i>Amazon Chime developer guide</i>.
     * </p>
     * </note>
     * 
     * @param createChannelFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.CreateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelFlowResult> createChannelFlowAsync(CreateChannelFlowRequest createChannelFlowRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelFlowRequest, CreateChannelFlowResult> asyncHandler);

    /**
     * <p>
     * Adds a user to a channel. The <code>InvitedBy</code> field in <code>ChannelMembership</code> is derived from the
     * request header. A channel member can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Send messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Receive messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Edit their own messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Leave the channel
     * </p>
     * </li>
     * </ul>
     * <p>
     * Privacy settings impact this action as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Public Channels: You do not need to be a member to list messages, but you must be a member to send messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Private Channels: You must be a member to list or send messages.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelMembershipRequest
     * @return A Java Future containing the result of the CreateChannelMembership operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.CreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelMembershipResult> createChannelMembershipAsync(CreateChannelMembershipRequest createChannelMembershipRequest);

    /**
     * <p>
     * Adds a user to a channel. The <code>InvitedBy</code> field in <code>ChannelMembership</code> is derived from the
     * request header. A channel member can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * List messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Send messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Receive messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Edit their own messages
     * </p>
     * </li>
     * <li>
     * <p>
     * Leave the channel
     * </p>
     * </li>
     * </ul>
     * <p>
     * Privacy settings impact this action as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Public Channels: You do not need to be a member to list messages, but you must be a member to send messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * Private Channels: You must be a member to list or send messages.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannelMembership operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.CreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelMembershipResult> createChannelMembershipAsync(CreateChannelMembershipRequest createChannelMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelMembershipRequest, CreateChannelMembershipResult> asyncHandler);

    /**
     * <p>
     * Creates a new <code>ChannelModerator</code>. A channel moderator can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add and remove other members of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove other moderators of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove user bans for the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redact messages in the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * List messages in the channel.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelModeratorRequest
     * @return A Java Future containing the result of the CreateChannelModerator operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.CreateChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelModeratorResult> createChannelModeratorAsync(CreateChannelModeratorRequest createChannelModeratorRequest);

    /**
     * <p>
     * Creates a new <code>ChannelModerator</code>. A channel moderator can:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add and remove other members of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove other moderators of the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Add and remove user bans for the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * Redact messages in the channel.
     * </p>
     * </li>
     * <li>
     * <p>
     * List messages in the channel.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param createChannelModeratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChannelModerator operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.CreateChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelModeratorResult> createChannelModeratorAsync(CreateChannelModeratorRequest createChannelModeratorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelModeratorRequest, CreateChannelModeratorResult> asyncHandler);

    /**
     * <p>
     * Immediately makes a channel and its memberships inaccessible and marks them for deletion. This is an irreversible
     * process.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelRequest
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest);

    /**
     * <p>
     * Immediately makes a channel and its memberships inaccessible and marks them for deletion. This is an irreversible
     * process.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelResult> deleteChannelAsync(DeleteChannelRequest deleteChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelRequest, DeleteChannelResult> asyncHandler);

    /**
     * <p>
     * Removes a user from a channel's ban list.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelBanRequest
     * @return A Java Future containing the result of the DeleteChannelBan operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DeleteChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelBanResult> deleteChannelBanAsync(DeleteChannelBanRequest deleteChannelBanRequest);

    /**
     * <p>
     * Removes a user from a channel's ban list.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelBanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelBan operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DeleteChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelBanResult> deleteChannelBanAsync(DeleteChannelBanRequest deleteChannelBanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelBanRequest, DeleteChannelBanResult> asyncHandler);

    /**
     * <p>
     * Deletes a channel flow, an irreversible process. This is a developer API.
     * </p>
     * <note>
     * <p>
     * This API works only when the channel flow is not associated with any channel. To get a list of all channels that
     * a channel flow is associated with, use the <code>ListChannelsAssociatedWithChannelFlow</code> API. Use the
     * <code>DisassociateChannelFlow</code> API to disassociate a channel flow from all channels.
     * </p>
     * </note>
     * 
     * @param deleteChannelFlowRequest
     * @return A Java Future containing the result of the DeleteChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DeleteChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelFlowResult> deleteChannelFlowAsync(DeleteChannelFlowRequest deleteChannelFlowRequest);

    /**
     * <p>
     * Deletes a channel flow, an irreversible process. This is a developer API.
     * </p>
     * <note>
     * <p>
     * This API works only when the channel flow is not associated with any channel. To get a list of all channels that
     * a channel flow is associated with, use the <code>ListChannelsAssociatedWithChannelFlow</code> API. Use the
     * <code>DisassociateChannelFlow</code> API to disassociate a channel flow from all channels.
     * </p>
     * </note>
     * 
     * @param deleteChannelFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DeleteChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelFlowResult> deleteChannelFlowAsync(DeleteChannelFlowRequest deleteChannelFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelFlowRequest, DeleteChannelFlowResult> asyncHandler);

    /**
     * <p>
     * Removes a member from a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMembershipRequest
     * @return A Java Future containing the result of the DeleteChannelMembership operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DeleteChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelMembershipResult> deleteChannelMembershipAsync(DeleteChannelMembershipRequest deleteChannelMembershipRequest);

    /**
     * <p>
     * Removes a member from a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelMembership operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DeleteChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelMembershipResult> deleteChannelMembershipAsync(DeleteChannelMembershipRequest deleteChannelMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelMembershipRequest, DeleteChannelMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes a channel message. Only admins can perform this action. Deletion makes messages inaccessible immediately.
     * A background process deletes any revisions created by <code>UpdateChannelMessage</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMessageRequest
     * @return A Java Future containing the result of the DeleteChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DeleteChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelMessageResult> deleteChannelMessageAsync(DeleteChannelMessageRequest deleteChannelMessageRequest);

    /**
     * <p>
     * Deletes a channel message. Only admins can perform this action. Deletion makes messages inaccessible immediately.
     * A background process deletes any revisions created by <code>UpdateChannelMessage</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DeleteChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelMessageResult> deleteChannelMessageAsync(DeleteChannelMessageRequest deleteChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelMessageRequest, DeleteChannelMessageResult> asyncHandler);

    /**
     * <p>
     * Deletes a channel moderator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelModeratorRequest
     * @return A Java Future containing the result of the DeleteChannelModerator operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DeleteChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelModeratorResult> deleteChannelModeratorAsync(DeleteChannelModeratorRequest deleteChannelModeratorRequest);

    /**
     * <p>
     * Deletes a channel moderator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param deleteChannelModeratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChannelModerator operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DeleteChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelModeratorResult> deleteChannelModeratorAsync(DeleteChannelModeratorRequest deleteChannelModeratorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelModeratorRequest, DeleteChannelModeratorResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of a channel in an Amazon Chime <code>AppInstance</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelRequest
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest);

    /**
     * <p>
     * Returns the full details of a channel in an Amazon Chime <code>AppInstance</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelResult> describeChannelAsync(DescribeChannelRequest describeChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelRequest, DescribeChannelResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of a channel ban.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelBanRequest
     * @return A Java Future containing the result of the DescribeChannelBan operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DescribeChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelBanResult> describeChannelBanAsync(DescribeChannelBanRequest describeChannelBanRequest);

    /**
     * <p>
     * Returns the full details of a channel ban.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelBanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannelBan operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DescribeChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelBanResult> describeChannelBanAsync(DescribeChannelBanRequest describeChannelBanRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelBanRequest, DescribeChannelBanResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of a channel flow in an Amazon Chime <code>AppInstance</code>. This is a developer API.
     * </p>
     * 
     * @param describeChannelFlowRequest
     * @return A Java Future containing the result of the DescribeChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DescribeChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelFlowResult> describeChannelFlowAsync(DescribeChannelFlowRequest describeChannelFlowRequest);

    /**
     * <p>
     * Returns the full details of a channel flow in an Amazon Chime <code>AppInstance</code>. This is a developer API.
     * </p>
     * 
     * @param describeChannelFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DescribeChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelFlowResult> describeChannelFlowAsync(DescribeChannelFlowRequest describeChannelFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelFlowRequest, DescribeChannelFlowResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of a user's channel membership.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipRequest
     * @return A Java Future containing the result of the DescribeChannelMembership operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DescribeChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelMembershipResult> describeChannelMembershipAsync(
            DescribeChannelMembershipRequest describeChannelMembershipRequest);

    /**
     * <p>
     * Returns the full details of a user's channel membership.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannelMembership operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DescribeChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelMembershipResult> describeChannelMembershipAsync(
            DescribeChannelMembershipRequest describeChannelMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelMembershipRequest, DescribeChannelMembershipResult> asyncHandler);

    /**
     * <p>
     * Returns the details of a channel based on the membership of the specified <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipForAppInstanceUserRequest
     * @return A Java Future containing the result of the DescribeChannelMembershipForAppInstanceUser operation returned
     *         by the service.
     * @sample AmazonChimeSDKMessagingAsync.DescribeChannelMembershipForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembershipForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelMembershipForAppInstanceUserResult> describeChannelMembershipForAppInstanceUserAsync(
            DescribeChannelMembershipForAppInstanceUserRequest describeChannelMembershipForAppInstanceUserRequest);

    /**
     * <p>
     * Returns the details of a channel based on the membership of the specified <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelMembershipForAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannelMembershipForAppInstanceUser operation returned
     *         by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DescribeChannelMembershipForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembershipForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelMembershipForAppInstanceUserResult> describeChannelMembershipForAppInstanceUserAsync(
            DescribeChannelMembershipForAppInstanceUserRequest describeChannelMembershipForAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelMembershipForAppInstanceUserRequest, DescribeChannelMembershipForAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of a channel moderated by the specified <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratedByAppInstanceUserRequest
     * @return A Java Future containing the result of the DescribeChannelModeratedByAppInstanceUser operation returned
     *         by the service.
     * @sample AmazonChimeSDKMessagingAsync.DescribeChannelModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelModeratedByAppInstanceUserResult> describeChannelModeratedByAppInstanceUserAsync(
            DescribeChannelModeratedByAppInstanceUserRequest describeChannelModeratedByAppInstanceUserRequest);

    /**
     * <p>
     * Returns the full details of a channel moderated by the specified <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratedByAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannelModeratedByAppInstanceUser operation returned
     *         by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DescribeChannelModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelModeratedByAppInstanceUserResult> describeChannelModeratedByAppInstanceUserAsync(
            DescribeChannelModeratedByAppInstanceUserRequest describeChannelModeratedByAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelModeratedByAppInstanceUserRequest, DescribeChannelModeratedByAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of a single ChannelModerator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratorRequest
     * @return A Java Future containing the result of the DescribeChannelModerator operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DescribeChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelModeratorResult> describeChannelModeratorAsync(DescribeChannelModeratorRequest describeChannelModeratorRequest);

    /**
     * <p>
     * Returns the full details of a single ChannelModerator.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param describeChannelModeratorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChannelModerator operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DescribeChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelModeratorResult> describeChannelModeratorAsync(DescribeChannelModeratorRequest describeChannelModeratorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelModeratorRequest, DescribeChannelModeratorResult> asyncHandler);

    /**
     * <p>
     * Disassociates a channel flow from all its channels. Once disassociated, all messages to that channel stop going
     * through the channel flow processor.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can disassociate a channel flow. The <code>x-amz-chime-bearer</code>
     * request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that makes the API call as the
     * value in the header.
     * </p>
     * </note>
     * 
     * @param disassociateChannelFlowRequest
     * @return A Java Future containing the result of the DisassociateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.DisassociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DisassociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateChannelFlowResult> disassociateChannelFlowAsync(DisassociateChannelFlowRequest disassociateChannelFlowRequest);

    /**
     * <p>
     * Disassociates a channel flow from all its channels. Once disassociated, all messages to that channel stop going
     * through the channel flow processor.
     * </p>
     * <note>
     * <p>
     * Only administrators or channel moderators can disassociate a channel flow. The <code>x-amz-chime-bearer</code>
     * request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that makes the API call as the
     * value in the header.
     * </p>
     * </note>
     * 
     * @param disassociateChannelFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.DisassociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DisassociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateChannelFlowResult> disassociateChannelFlowAsync(DisassociateChannelFlowRequest disassociateChannelFlowRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateChannelFlowRequest, DisassociateChannelFlowResult> asyncHandler);

    /**
     * <p>
     * Gets the membership preferences of an <code>AppInstanceUser</code> for the specified channel. The
     * <code>AppInstanceUser</code> must be a member of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can retrieve preferences. Users in the <code>AppInstanceAdmin</code> and channel moderator roles can't
     * retrieve preferences for other users. Banned users can't retrieve membership preferences for the channel from
     * which they are banned.
     * </p>
     * 
     * @param getChannelMembershipPreferencesRequest
     * @return A Java Future containing the result of the GetChannelMembershipPreferences operation returned by the
     *         service.
     * @sample AmazonChimeSDKMessagingAsync.GetChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelMembershipPreferencesResult> getChannelMembershipPreferencesAsync(
            GetChannelMembershipPreferencesRequest getChannelMembershipPreferencesRequest);

    /**
     * <p>
     * Gets the membership preferences of an <code>AppInstanceUser</code> for the specified channel. The
     * <code>AppInstanceUser</code> must be a member of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can retrieve preferences. Users in the <code>AppInstanceAdmin</code> and channel moderator roles can't
     * retrieve preferences for other users. Banned users can't retrieve membership preferences for the channel from
     * which they are banned.
     * </p>
     * 
     * @param getChannelMembershipPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannelMembershipPreferences operation returned by the
     *         service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.GetChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelMembershipPreferencesResult> getChannelMembershipPreferencesAsync(
            GetChannelMembershipPreferencesRequest getChannelMembershipPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelMembershipPreferencesRequest, GetChannelMembershipPreferencesResult> asyncHandler);

    /**
     * <p>
     * Gets the full details of a channel message.
     * </p>
     * <note>
     * <p>
     * The x-amz-chime-bearer request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that
     * makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param getChannelMessageRequest
     * @return A Java Future containing the result of the GetChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.GetChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelMessageResult> getChannelMessageAsync(GetChannelMessageRequest getChannelMessageRequest);

    /**
     * <p>
     * Gets the full details of a channel message.
     * </p>
     * <note>
     * <p>
     * The x-amz-chime-bearer request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user that
     * makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param getChannelMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.GetChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelMessageResult> getChannelMessageAsync(GetChannelMessageRequest getChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelMessageRequest, GetChannelMessageResult> asyncHandler);

    /**
     * <p>
     * Gets message status for a specified <code>messageId</code>. Use this API to determine the intermediate status of
     * messages going through channel flow processing. The API provides an alternative to retrieving message status if
     * the event was not received because a client wasn't connected to a websocket.
     * </p>
     * <p>
     * Messages can have any one of these statuses.
     * </p>
     * <dl>
     * <dt>SENT</dt>
     * <dd>
     * <p>
     * Message processed successfully
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * Ongoing processing
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * Processing failed
     * </p>
     * </dd>
     * <dt>DENIED</dt>
     * <dd>
     * <p>
     * Messasge denied by the processor
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API does not return statuses for denied messages, because we don't store them once the processor denies
     * them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only the message sender can invoke this API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getChannelMessageStatusRequest
     * @return A Java Future containing the result of the GetChannelMessageStatus operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.GetChannelMessageStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessageStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelMessageStatusResult> getChannelMessageStatusAsync(GetChannelMessageStatusRequest getChannelMessageStatusRequest);

    /**
     * <p>
     * Gets message status for a specified <code>messageId</code>. Use this API to determine the intermediate status of
     * messages going through channel flow processing. The API provides an alternative to retrieving message status if
     * the event was not received because a client wasn't connected to a websocket.
     * </p>
     * <p>
     * Messages can have any one of these statuses.
     * </p>
     * <dl>
     * <dt>SENT</dt>
     * <dd>
     * <p>
     * Message processed successfully
     * </p>
     * </dd>
     * <dt>PENDING</dt>
     * <dd>
     * <p>
     * Ongoing processing
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * Processing failed
     * </p>
     * </dd>
     * <dt>DENIED</dt>
     * <dd>
     * <p>
     * Messasge denied by the processor
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <ul>
     * <li>
     * <p>
     * This API does not return statuses for denied messages, because we don't store them once the processor denies
     * them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only the message sender can invoke this API.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param getChannelMessageStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChannelMessageStatus operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.GetChannelMessageStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessageStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetChannelMessageStatusResult> getChannelMessageStatusAsync(GetChannelMessageStatusRequest getChannelMessageStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelMessageStatusRequest, GetChannelMessageStatusResult> asyncHandler);

    /**
     * <p>
     * The details of the endpoint for the messaging session.
     * </p>
     * 
     * @param getMessagingSessionEndpointRequest
     * @return A Java Future containing the result of the GetMessagingSessionEndpoint operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.GetMessagingSessionEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetMessagingSessionEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMessagingSessionEndpointResult> getMessagingSessionEndpointAsync(
            GetMessagingSessionEndpointRequest getMessagingSessionEndpointRequest);

    /**
     * <p>
     * The details of the endpoint for the messaging session.
     * </p>
     * 
     * @param getMessagingSessionEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMessagingSessionEndpoint operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.GetMessagingSessionEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetMessagingSessionEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMessagingSessionEndpointResult> getMessagingSessionEndpointAsync(
            GetMessagingSessionEndpointRequest getMessagingSessionEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetMessagingSessionEndpointRequest, GetMessagingSessionEndpointResult> asyncHandler);

    /**
     * <p>
     * Lists all the users banned from a particular channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelBansRequest
     * @return A Java Future containing the result of the ListChannelBans operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelBans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelBans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelBansResult> listChannelBansAsync(ListChannelBansRequest listChannelBansRequest);

    /**
     * <p>
     * Lists all the users banned from a particular channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelBansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelBans operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelBans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelBans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelBansResult> listChannelBansAsync(ListChannelBansRequest listChannelBansRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelBansRequest, ListChannelBansResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated lists of all the channel flows created under a single Chime. This is a developer API.
     * </p>
     * 
     * @param listChannelFlowsRequest
     * @return A Java Future containing the result of the ListChannelFlows operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelFlows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelFlowsResult> listChannelFlowsAsync(ListChannelFlowsRequest listChannelFlowsRequest);

    /**
     * <p>
     * Returns a paginated lists of all the channel flows created under a single Chime. This is a developer API.
     * </p>
     * 
     * @param listChannelFlowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelFlows operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelFlows"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelFlowsResult> listChannelFlowsAsync(ListChannelFlowsRequest listChannelFlowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelFlowsRequest, ListChannelFlowsResult> asyncHandler);

    /**
     * <p>
     * Lists all channel memberships in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * <p>
     * If you want to list the channels to which a specific app instance user belongs, see the <a href=
     * "https://docs.aws.amazon.com/chime/latest/APIReference/API_messaging-chime_ListChannelMembershipsForAppInstanceUser.html"
     * >ListChannelMembershipsForAppInstanceUser</a> API.
     * </p>
     * 
     * @param listChannelMembershipsRequest
     * @return A Java Future containing the result of the ListChannelMemberships operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMembershipsResult> listChannelMembershipsAsync(ListChannelMembershipsRequest listChannelMembershipsRequest);

    /**
     * <p>
     * Lists all channel memberships in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * <p>
     * If you want to list the channels to which a specific app instance user belongs, see the <a href=
     * "https://docs.aws.amazon.com/chime/latest/APIReference/API_messaging-chime_ListChannelMembershipsForAppInstanceUser.html"
     * >ListChannelMembershipsForAppInstanceUser</a> API.
     * </p>
     * 
     * @param listChannelMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelMemberships operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMembershipsResult> listChannelMembershipsAsync(ListChannelMembershipsRequest listChannelMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelMembershipsRequest, ListChannelMembershipsResult> asyncHandler);

    /**
     * <p>
     * Lists all channels that a particular <code>AppInstanceUser</code> is a part of. Only an
     * <code>AppInstanceAdmin</code> can call the API with a user ARN that is not their own.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMembershipsForAppInstanceUserRequest
     * @return A Java Future containing the result of the ListChannelMembershipsForAppInstanceUser operation returned by
     *         the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelMembershipsForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMembershipsForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMembershipsForAppInstanceUserResult> listChannelMembershipsForAppInstanceUserAsync(
            ListChannelMembershipsForAppInstanceUserRequest listChannelMembershipsForAppInstanceUserRequest);

    /**
     * <p>
     * Lists all channels that a particular <code>AppInstanceUser</code> is a part of. Only an
     * <code>AppInstanceAdmin</code> can call the API with a user ARN that is not their own.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMembershipsForAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelMembershipsForAppInstanceUser operation returned by
     *         the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelMembershipsForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMembershipsForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMembershipsForAppInstanceUserResult> listChannelMembershipsForAppInstanceUserAsync(
            ListChannelMembershipsForAppInstanceUserRequest listChannelMembershipsForAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelMembershipsForAppInstanceUserRequest, ListChannelMembershipsForAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * List all the messages in a channel. Returns a paginated list of <code>ChannelMessages</code>. By default, sorted
     * by creation timestamp in descending order.
     * </p>
     * <note>
     * <p>
     * Redacted messages appear in the results as empty, since they are only redacted, not deleted. Deleted messages do
     * not appear in the results. This action always returns the latest version of an edited message.
     * </p>
     * <p>
     * Also, the x-amz-chime-bearer request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user
     * that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMessagesRequest
     * @return A Java Future containing the result of the ListChannelMessages operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMessages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMessagesResult> listChannelMessagesAsync(ListChannelMessagesRequest listChannelMessagesRequest);

    /**
     * <p>
     * List all the messages in a channel. Returns a paginated list of <code>ChannelMessages</code>. By default, sorted
     * by creation timestamp in descending order.
     * </p>
     * <note>
     * <p>
     * Redacted messages appear in the results as empty, since they are only redacted, not deleted. Deleted messages do
     * not appear in the results. This action always returns the latest version of an edited message.
     * </p>
     * <p>
     * Also, the x-amz-chime-bearer request header is mandatory. Use the <code>AppInstanceUserArn</code> of the user
     * that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelMessages operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMessages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMessagesResult> listChannelMessagesAsync(ListChannelMessagesRequest listChannelMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelMessagesRequest, ListChannelMessagesResult> asyncHandler);

    /**
     * <p>
     * Lists all the moderators for a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelModeratorsRequest
     * @return A Java Future containing the result of the ListChannelModerators operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelModerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelModerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelModeratorsResult> listChannelModeratorsAsync(ListChannelModeratorsRequest listChannelModeratorsRequest);

    /**
     * <p>
     * Lists all the moderators for a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelModeratorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelModerators operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelModerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelModerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelModeratorsResult> listChannelModeratorsAsync(ListChannelModeratorsRequest listChannelModeratorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelModeratorsRequest, ListChannelModeratorsResult> asyncHandler);

    /**
     * <p>
     * Lists all Channels created under a single Chime App as a paginated list. You can specify filters to narrow
     * results.
     * </p>
     * <p class="title">
     * <b>Functionality &amp; restrictions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use privacy = <code>PUBLIC</code> to retrieve all public channels in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only an <code>AppInstanceAdmin</code> can set privacy = <code>PRIVATE</code> to list the private channels in an
     * account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsRequest
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Lists all Channels created under a single Chime App as a paginated list. You can specify filters to narrow
     * results.
     * </p>
     * <p class="title">
     * <b>Functionality &amp; restrictions</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use privacy = <code>PUBLIC</code> to retrieve all public channels in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Only an <code>AppInstanceAdmin</code> can set privacy = <code>PRIVATE</code> to list the private channels in an
     * account.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannels operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

    /**
     * <p>
     * Lists all channels associated with a specified channel flow. You can associate a channel flow with multiple
     * channels, but you can only associate a channel with one channel flow. This is a developer API.
     * </p>
     * 
     * @param listChannelsAssociatedWithChannelFlowRequest
     * @return A Java Future containing the result of the ListChannelsAssociatedWithChannelFlow operation returned by
     *         the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelsAssociatedWithChannelFlow
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsAssociatedWithChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsAssociatedWithChannelFlowResult> listChannelsAssociatedWithChannelFlowAsync(
            ListChannelsAssociatedWithChannelFlowRequest listChannelsAssociatedWithChannelFlowRequest);

    /**
     * <p>
     * Lists all channels associated with a specified channel flow. You can associate a channel flow with multiple
     * channels, but you can only associate a channel with one channel flow. This is a developer API.
     * </p>
     * 
     * @param listChannelsAssociatedWithChannelFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelsAssociatedWithChannelFlow operation returned by
     *         the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelsAssociatedWithChannelFlow
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsAssociatedWithChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsAssociatedWithChannelFlowResult> listChannelsAssociatedWithChannelFlowAsync(
            ListChannelsAssociatedWithChannelFlowRequest listChannelsAssociatedWithChannelFlowRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsAssociatedWithChannelFlowRequest, ListChannelsAssociatedWithChannelFlowResult> asyncHandler);

    /**
     * <p>
     * A list of the channels moderated by an <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsModeratedByAppInstanceUserRequest
     * @return A Java Future containing the result of the ListChannelsModeratedByAppInstanceUser operation returned by
     *         the service.
     * @sample AmazonChimeSDKMessagingAsync.ListChannelsModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsModeratedByAppInstanceUserResult> listChannelsModeratedByAppInstanceUserAsync(
            ListChannelsModeratedByAppInstanceUserRequest listChannelsModeratedByAppInstanceUserRequest);

    /**
     * <p>
     * A list of the channels moderated by an <code>AppInstanceUser</code>.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param listChannelsModeratedByAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelsModeratedByAppInstanceUser operation returned by
     *         the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListChannelsModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsModeratedByAppInstanceUserResult> listChannelsModeratedByAppInstanceUserAsync(
            ListChannelsModeratedByAppInstanceUserRequest listChannelsModeratedByAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsModeratedByAppInstanceUserRequest, ListChannelsModeratedByAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Lists all the SubChannels in an elastic channel when given a channel ID. Available only to the app instance
     * admins and channel moderators of elastic channels.
     * </p>
     * 
     * @param listSubChannelsRequest
     * @return A Java Future containing the result of the ListSubChannels operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListSubChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListSubChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubChannelsResult> listSubChannelsAsync(ListSubChannelsRequest listSubChannelsRequest);

    /**
     * <p>
     * Lists all the SubChannels in an elastic channel when given a channel ID. Available only to the app instance
     * admins and channel moderators of elastic channels.
     * </p>
     * 
     * @param listSubChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubChannels operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListSubChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListSubChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSubChannelsResult> listSubChannelsAsync(ListSubChannelsRequest listSubChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubChannelsRequest, ListSubChannelsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sets the membership preferences of an <code>AppInstanceUser</code> for the specified channel. The
     * <code>AppInstanceUser</code> must be a member of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can set preferences. Users in the <code>AppInstanceAdmin</code> and channel moderator roles can't set
     * preferences for other users. Banned users can't set membership preferences for the channel from which they are
     * banned.
     * </p>
     * 
     * @param putChannelMembershipPreferencesRequest
     * @return A Java Future containing the result of the PutChannelMembershipPreferences operation returned by the
     *         service.
     * @sample AmazonChimeSDKMessagingAsync.PutChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutChannelMembershipPreferencesResult> putChannelMembershipPreferencesAsync(
            PutChannelMembershipPreferencesRequest putChannelMembershipPreferencesRequest);

    /**
     * <p>
     * Sets the membership preferences of an <code>AppInstanceUser</code> for the specified channel. The
     * <code>AppInstanceUser</code> must be a member of the channel. Only the <code>AppInstanceUser</code> who owns the
     * membership can set preferences. Users in the <code>AppInstanceAdmin</code> and channel moderator roles can't set
     * preferences for other users. Banned users can't set membership preferences for the channel from which they are
     * banned.
     * </p>
     * 
     * @param putChannelMembershipPreferencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutChannelMembershipPreferences operation returned by the
     *         service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.PutChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutChannelMembershipPreferencesResult> putChannelMembershipPreferencesAsync(
            PutChannelMembershipPreferencesRequest putChannelMembershipPreferencesRequest,
            com.amazonaws.handlers.AsyncHandler<PutChannelMembershipPreferencesRequest, PutChannelMembershipPreferencesResult> asyncHandler);

    /**
     * <p>
     * Redacts message content, but not metadata. The message exists in the back end, but the action returns null
     * content, and the state shows as redacted.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param redactChannelMessageRequest
     * @return A Java Future containing the result of the RedactChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.RedactChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/RedactChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RedactChannelMessageResult> redactChannelMessageAsync(RedactChannelMessageRequest redactChannelMessageRequest);

    /**
     * <p>
     * Redacts message content, but not metadata. The message exists in the back end, but the action returns null
     * content, and the state shows as redacted.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param redactChannelMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RedactChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.RedactChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/RedactChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RedactChannelMessageResult> redactChannelMessageAsync(RedactChannelMessageRequest redactChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<RedactChannelMessageRequest, RedactChannelMessageResult> asyncHandler);

    /**
     * <p>
     * Allows <code>ChimeBearer</code> to search channels by channel members. AppInstanceUsers can search across the
     * channels that they belong to. AppInstanceAdmins can search across all channels.
     * </p>
     * 
     * @param searchChannelsRequest
     * @return A Java Future containing the result of the SearchChannels operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.SearchChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SearchChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchChannelsResult> searchChannelsAsync(SearchChannelsRequest searchChannelsRequest);

    /**
     * <p>
     * Allows <code>ChimeBearer</code> to search channels by channel members. AppInstanceUsers can search across the
     * channels that they belong to. AppInstanceAdmins can search across all channels.
     * </p>
     * 
     * @param searchChannelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchChannels operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.SearchChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SearchChannels"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchChannelsResult> searchChannelsAsync(SearchChannelsRequest searchChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchChannelsRequest, SearchChannelsResult> asyncHandler);

    /**
     * <p>
     * Sends a message to a particular channel that the member is a part of.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * <p>
     * Also, <code>STANDARD</code> messages can contain 4KB of data and the 1KB of metadata. <code>CONTROL</code>
     * messages can contain 30 bytes of data and no metadata.
     * </p>
     * </note>
     * 
     * @param sendChannelMessageRequest
     * @return A Java Future containing the result of the SendChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.SendChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SendChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendChannelMessageResult> sendChannelMessageAsync(SendChannelMessageRequest sendChannelMessageRequest);

    /**
     * <p>
     * Sends a message to a particular channel that the member is a part of.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * <p>
     * Also, <code>STANDARD</code> messages can contain 4KB of data and the 1KB of metadata. <code>CONTROL</code>
     * messages can contain 30 bytes of data and no metadata.
     * </p>
     * </note>
     * 
     * @param sendChannelMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.SendChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SendChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SendChannelMessageResult> sendChannelMessageAsync(SendChannelMessageRequest sendChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<SendChannelMessageRequest, SendChannelMessageResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update a channel's attributes.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelRequest
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Update a channel's attributes.
     * </p>
     * <p>
     * <b>Restriction</b>: You can't change a channel's privacy.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannel operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

    /**
     * <p>
     * Updates channel flow attributes. This is a developer API.
     * </p>
     * 
     * @param updateChannelFlowRequest
     * @return A Java Future containing the result of the UpdateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.UpdateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelFlowResult> updateChannelFlowAsync(UpdateChannelFlowRequest updateChannelFlowRequest);

    /**
     * <p>
     * Updates channel flow attributes. This is a developer API.
     * </p>
     * 
     * @param updateChannelFlowRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannelFlow operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.UpdateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelFlowResult> updateChannelFlowAsync(UpdateChannelFlowRequest updateChannelFlowRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelFlowRequest, UpdateChannelFlowResult> asyncHandler);

    /**
     * <p>
     * Updates the content of a message.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelMessageRequest
     * @return A Java Future containing the result of the UpdateChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.UpdateChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelMessageResult> updateChannelMessageAsync(UpdateChannelMessageRequest updateChannelMessageRequest);

    /**
     * <p>
     * Updates the content of a message.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannelMessage operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.UpdateChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelMessageResult> updateChannelMessageAsync(UpdateChannelMessageRequest updateChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelMessageRequest, UpdateChannelMessageResult> asyncHandler);

    /**
     * <p>
     * The details of the time when a user last read messages in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelReadMarkerRequest
     * @return A Java Future containing the result of the UpdateChannelReadMarker operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsync.UpdateChannelReadMarker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelReadMarker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelReadMarkerResult> updateChannelReadMarkerAsync(UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest);

    /**
     * <p>
     * The details of the time when a user last read messages in a channel.
     * </p>
     * <note>
     * <p>
     * The <code>x-amz-chime-bearer</code> request header is mandatory. Use the <code>AppInstanceUserArn</code> of the
     * user that makes the API call as the value in the header.
     * </p>
     * </note>
     * 
     * @param updateChannelReadMarkerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateChannelReadMarker operation returned by the service.
     * @sample AmazonChimeSDKMessagingAsyncHandler.UpdateChannelReadMarker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelReadMarker"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelReadMarkerResult> updateChannelReadMarkerAsync(UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelReadMarkerRequest, UpdateChannelReadMarkerResult> asyncHandler);

}
