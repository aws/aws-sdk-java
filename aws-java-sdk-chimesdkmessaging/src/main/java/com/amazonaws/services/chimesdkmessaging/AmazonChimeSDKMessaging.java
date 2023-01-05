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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chimesdkmessaging.model.*;

/**
 * Interface for accessing Amazon Chime SDK Messaging.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chimesdkmessaging.AbstractAmazonChimeSDKMessaging} instead.
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
public interface AmazonChimeSDKMessaging {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "messaging-chime";

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
     * @return Result of the AssociateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.AssociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/AssociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateChannelFlowResult associateChannelFlow(AssociateChannelFlowRequest associateChannelFlowRequest);

    /**
     * <p>
     * Adds a specified number of users to a channel.
     * </p>
     * 
     * @param batchCreateChannelMembershipRequest
     * @return Result of the BatchCreateChannelMembership operation returned by the service.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @sample AmazonChimeSDKMessaging.BatchCreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/BatchCreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCreateChannelMembershipResult batchCreateChannelMembership(BatchCreateChannelMembershipRequest batchCreateChannelMembershipRequest);

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
     * @return Result of the ChannelFlowCallback operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ChannelFlowCallback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ChannelFlowCallback"
     *      target="_top">AWS API Documentation</a>
     */
    ChannelFlowCallbackResult channelFlowCallback(ChannelFlowCallbackRequest channelFlowCallbackRequest);

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
     * @return Result of the CreateChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    CreateChannelResult createChannel(CreateChannelRequest createChannelRequest);

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
     * @return Result of the CreateChannelBan operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    CreateChannelBanResult createChannelBan(CreateChannelBanRequest createChannelBanRequest);

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
     * @return Result of the CreateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    CreateChannelFlowResult createChannelFlow(CreateChannelFlowRequest createChannelFlowRequest);

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
     * @return Result of the CreateChannelMembership operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    CreateChannelMembershipResult createChannelMembership(CreateChannelMembershipRequest createChannelMembershipRequest);

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
     * @return Result of the CreateChannelModerator operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.CreateChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/CreateChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    CreateChannelModeratorResult createChannelModerator(CreateChannelModeratorRequest createChannelModeratorRequest);

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
     * @return Result of the DeleteChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelResult deleteChannel(DeleteChannelRequest deleteChannelRequest);

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
     * @return Result of the DeleteChannelBan operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelBanResult deleteChannelBan(DeleteChannelBanRequest deleteChannelBanRequest);

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
     * @return Result of the DeleteChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelFlowResult deleteChannelFlow(DeleteChannelFlowRequest deleteChannelFlowRequest);

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
     * @return Result of the DeleteChannelMembership operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelMembershipResult deleteChannelMembership(DeleteChannelMembershipRequest deleteChannelMembershipRequest);

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
     * @return Result of the DeleteChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelMessageResult deleteChannelMessage(DeleteChannelMessageRequest deleteChannelMessageRequest);

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
     * @return Result of the DeleteChannelModerator operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DeleteChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DeleteChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChannelModeratorResult deleteChannelModerator(DeleteChannelModeratorRequest deleteChannelModeratorRequest);

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
     * @return Result of the DescribeChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChannelResult describeChannel(DescribeChannelRequest describeChannelRequest);

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
     * @return Result of the DescribeChannelBan operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelBan"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChannelBanResult describeChannelBan(DescribeChannelBanRequest describeChannelBanRequest);

    /**
     * <p>
     * Returns the full details of a channel flow in an Amazon Chime <code>AppInstance</code>. This is a developer API.
     * </p>
     * 
     * @param describeChannelFlowRequest
     * @return Result of the DescribeChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChannelFlowResult describeChannelFlow(DescribeChannelFlowRequest describeChannelFlowRequest);

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
     * @return Result of the DescribeChannelMembership operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChannelMembershipResult describeChannelMembership(DescribeChannelMembershipRequest describeChannelMembershipRequest);

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
     * @return Result of the DescribeChannelMembershipForAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelMembershipForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelMembershipForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChannelMembershipForAppInstanceUserResult describeChannelMembershipForAppInstanceUser(
            DescribeChannelMembershipForAppInstanceUserRequest describeChannelMembershipForAppInstanceUserRequest);

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
     * @return Result of the DescribeChannelModeratedByAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChannelModeratedByAppInstanceUserResult describeChannelModeratedByAppInstanceUser(
            DescribeChannelModeratedByAppInstanceUserRequest describeChannelModeratedByAppInstanceUserRequest);

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
     * @return Result of the DescribeChannelModerator operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DescribeChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DescribeChannelModerator"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeChannelModeratorResult describeChannelModerator(DescribeChannelModeratorRequest describeChannelModeratorRequest);

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
     * @return Result of the DisassociateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.DisassociateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/DisassociateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateChannelFlowResult disassociateChannelFlow(DisassociateChannelFlowRequest disassociateChannelFlowRequest);

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
     * @return Result of the GetChannelMembershipPreferences operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    GetChannelMembershipPreferencesResult getChannelMembershipPreferences(GetChannelMembershipPreferencesRequest getChannelMembershipPreferencesRequest);

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
     * @return Result of the GetChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    GetChannelMessageResult getChannelMessage(GetChannelMessageRequest getChannelMessageRequest);

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
     * @return Result of the GetChannelMessageStatus operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetChannelMessageStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetChannelMessageStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetChannelMessageStatusResult getChannelMessageStatus(GetChannelMessageStatusRequest getChannelMessageStatusRequest);

    /**
     * <p>
     * The details of the endpoint for the messaging session.
     * </p>
     * 
     * @param getMessagingSessionEndpointRequest
     * @return Result of the GetMessagingSessionEndpoint operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.GetMessagingSessionEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/GetMessagingSessionEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    GetMessagingSessionEndpointResult getMessagingSessionEndpoint(GetMessagingSessionEndpointRequest getMessagingSessionEndpointRequest);

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
     * @return Result of the ListChannelBans operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelBans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelBans"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelBansResult listChannelBans(ListChannelBansRequest listChannelBansRequest);

    /**
     * <p>
     * Returns a paginated lists of all the channel flows created under a single Chime. This is a developer API.
     * </p>
     * 
     * @param listChannelFlowsRequest
     * @return Result of the ListChannelFlows operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelFlows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelFlows"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelFlowsResult listChannelFlows(ListChannelFlowsRequest listChannelFlowsRequest);

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
     * @return Result of the ListChannelMemberships operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMemberships"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelMembershipsResult listChannelMemberships(ListChannelMembershipsRequest listChannelMembershipsRequest);

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
     * @return Result of the ListChannelMembershipsForAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelMembershipsForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMembershipsForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelMembershipsForAppInstanceUserResult listChannelMembershipsForAppInstanceUser(
            ListChannelMembershipsForAppInstanceUserRequest listChannelMembershipsForAppInstanceUserRequest);

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
     * @return Result of the ListChannelMessages operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelMessages"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelMessagesResult listChannelMessages(ListChannelMessagesRequest listChannelMessagesRequest);

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
     * @return Result of the ListChannelModerators operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelModerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelModerators"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelModeratorsResult listChannelModerators(ListChannelModeratorsRequest listChannelModeratorsRequest);

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
     * @return Result of the ListChannels operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannels"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelsResult listChannels(ListChannelsRequest listChannelsRequest);

    /**
     * <p>
     * Lists all channels associated with a specified channel flow. You can associate a channel flow with multiple
     * channels, but you can only associate a channel with one channel flow. This is a developer API.
     * </p>
     * 
     * @param listChannelsAssociatedWithChannelFlowRequest
     * @return Result of the ListChannelsAssociatedWithChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelsAssociatedWithChannelFlow
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsAssociatedWithChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelsAssociatedWithChannelFlowResult listChannelsAssociatedWithChannelFlow(
            ListChannelsAssociatedWithChannelFlowRequest listChannelsAssociatedWithChannelFlowRequest);

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
     * @return Result of the ListChannelsModeratedByAppInstanceUser operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListChannelsModeratedByAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListChannelsModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    ListChannelsModeratedByAppInstanceUserResult listChannelsModeratedByAppInstanceUser(
            ListChannelsModeratedByAppInstanceUserRequest listChannelsModeratedByAppInstanceUserRequest);

    /**
     * <p>
     * Lists all the SubChannels in an elastic channel when given a channel ID. Available only to the app instance
     * admins and channel moderators of elastic channels.
     * </p>
     * 
     * @param listSubChannelsRequest
     * @return Result of the ListSubChannels operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListSubChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListSubChannels"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubChannelsResult listSubChannels(ListSubChannelsRequest listSubChannelsRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the PutChannelMembershipPreferences operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.PutChannelMembershipPreferences
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelMembershipPreferences"
     *      target="_top">AWS API Documentation</a>
     */
    PutChannelMembershipPreferencesResult putChannelMembershipPreferences(PutChannelMembershipPreferencesRequest putChannelMembershipPreferencesRequest);

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
     * @return Result of the RedactChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.RedactChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/RedactChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    RedactChannelMessageResult redactChannelMessage(RedactChannelMessageRequest redactChannelMessageRequest);

    /**
     * <p>
     * Allows <code>ChimeBearer</code> to search channels by channel members. AppInstanceUsers can search across the
     * channels that they belong to. AppInstanceAdmins can search across all channels.
     * </p>
     * 
     * @param searchChannelsRequest
     * @return Result of the SearchChannels operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.SearchChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SearchChannels"
     *      target="_top">AWS API Documentation</a>
     */
    SearchChannelsResult searchChannels(SearchChannelsRequest searchChannelsRequest);

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
     * @return Result of the SendChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.SendChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/SendChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    SendChannelMessageResult sendChannelMessage(SendChannelMessageRequest sendChannelMessageRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified Amazon Chime SDK messaging resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateChannel operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateChannelResult updateChannel(UpdateChannelRequest updateChannelRequest);

    /**
     * <p>
     * Updates channel flow attributes. This is a developer API.
     * </p>
     * 
     * @param updateChannelFlowRequest
     * @return Result of the UpdateChannelFlow operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannelFlow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelFlow"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateChannelFlowResult updateChannelFlow(UpdateChannelFlowRequest updateChannelFlowRequest);

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
     * @return Result of the UpdateChannelMessage operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelMessage"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateChannelMessageResult updateChannelMessage(UpdateChannelMessageRequest updateChannelMessageRequest);

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
     * @return Result of the UpdateChannelReadMarker operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChimeSDKMessaging.UpdateChannelReadMarker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/UpdateChannelReadMarker"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateChannelReadMarkerResult updateChannelReadMarker(UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest);

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
