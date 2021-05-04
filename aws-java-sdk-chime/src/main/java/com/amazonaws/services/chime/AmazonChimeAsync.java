/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;

/**
 * Interface for accessing Amazon Chime asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chime.AbstractAmazonChimeAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime API (application programming interface) is designed for developers to perform key tasks, such as
 * creating and managing Amazon Chime accounts, users, and Voice Connectors. This guide provides detailed information
 * about the Amazon Chime API, including operations, types, inputs and outputs, and error codes. It also includes some
 * server-side API actions to use with the Amazon Chime SDK. For more information about the Amazon Chime SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html"> Using the Amazon Chime SDK </a> in the
 * <i>Amazon Chime Developer Guide</i>.
 * </p>
 * <p>
 * You can use an AWS SDK, the AWS Command Line Interface (AWS CLI), or the REST API to make API calls. We recommend
 * using an AWS SDK or the AWS CLI. Each API operation includes links to information about using it with a
 * language-specific AWS SDK or the AWS CLI.
 * </p>
 * <dl>
 * <dt>Using an AWS SDK</dt>
 * <dd>
 * <p>
 * You don't need to write code to calculate a signature for request authentication. The SDK clients authenticate your
 * requests by using access keys that you provide. For more information about AWS SDKs, see the <a
 * href="http://aws.amazon.com/developer/">AWS Developer Center</a>.
 * </p>
 * </dd>
 * <dt>Using the AWS CLI</dt>
 * <dd>
 * <p>
 * Use your access keys with the AWS CLI to make API calls. For information about setting up the AWS CLI, see <a
 * href="https://docs.aws.amazon.com/cli/latest/userguide/installing.html">Installing the AWS Command Line Interface</a>
 * in the <i>AWS Command Line Interface User Guide</i>. For a list of available Amazon Chime commands, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/chime/index.html">Amazon Chime commands</a> in the <i>AWS CLI
 * Command Reference</i>.
 * </p>
 * </dd>
 * <dt>Using REST APIs</dt>
 * <dd>
 * <p>
 * If you use REST to make API calls, you must authenticate your request by providing a signature. Amazon Chime supports
 * signature version 4. For more information, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing Process</a>
 * in the <i>Amazon Web Services General Reference</i>.
 * </p>
 * <p>
 * When making REST API calls, use the service name <code>chime</code> and REST endpoint
 * <code>https://service.chime.aws.amazon.com</code>.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * Administrative permissions are controlled using AWS Identity and Access Management (IAM). For more information, see
 * <a href="https://docs.aws.amazon.com/chime/latest/ag/security-iam.html">Identity and Access Management for Amazon
 * Chime</a> in the <i>Amazon Chime Administration Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonChimeAsync extends AmazonChime {

    /**
     * <p>
     * Associates a phone number with the specified Amazon Chime user.
     * </p>
     * 
     * @param associatePhoneNumberWithUserRequest
     * @return A Java Future containing the result of the AssociatePhoneNumberWithUser operation returned by the
     *         service.
     * @sample AmazonChimeAsync.AssociatePhoneNumberWithUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumberWithUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumberWithUserResult> associatePhoneNumberWithUserAsync(
            AssociatePhoneNumberWithUserRequest associatePhoneNumberWithUserRequest);

    /**
     * <p>
     * Associates a phone number with the specified Amazon Chime user.
     * </p>
     * 
     * @param associatePhoneNumberWithUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePhoneNumberWithUser operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.AssociatePhoneNumberWithUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumberWithUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumberWithUserResult> associatePhoneNumberWithUserAsync(
            AssociatePhoneNumberWithUserRequest associatePhoneNumberWithUserRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumberWithUserRequest, AssociatePhoneNumberWithUserResult> asyncHandler);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnector operation returned by
     *         the service.
     * @sample AmazonChimeAsync.AssociatePhoneNumbersWithVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnector operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.AssociatePhoneNumbersWithVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorResult> associatePhoneNumbersWithVoiceConnectorAsync(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorRequest, AssociatePhoneNumbersWithVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeAsync.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeAsyncHandler.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociatePhoneNumbersWithVoiceConnectorGroupResult> associatePhoneNumbersWithVoiceConnectorGroupAsync(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AssociatePhoneNumbersWithVoiceConnectorGroupRequest, AssociatePhoneNumbersWithVoiceConnectorGroupResult> asyncHandler);

    /**
     * <p>
     * Associates the specified sign-in delegate groups with the specified Amazon Chime account.
     * </p>
     * 
     * @param associateSigninDelegateGroupsWithAccountRequest
     * @return A Java Future containing the result of the AssociateSigninDelegateGroupsWithAccount operation returned by
     *         the service.
     * @sample AmazonChimeAsync.AssociateSigninDelegateGroupsWithAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociateSigninDelegateGroupsWithAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSigninDelegateGroupsWithAccountResult> associateSigninDelegateGroupsWithAccountAsync(
            AssociateSigninDelegateGroupsWithAccountRequest associateSigninDelegateGroupsWithAccountRequest);

    /**
     * <p>
     * Associates the specified sign-in delegate groups with the specified Amazon Chime account.
     * </p>
     * 
     * @param associateSigninDelegateGroupsWithAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSigninDelegateGroupsWithAccount operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.AssociateSigninDelegateGroupsWithAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociateSigninDelegateGroupsWithAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSigninDelegateGroupsWithAccountResult> associateSigninDelegateGroupsWithAccountAsync(
            AssociateSigninDelegateGroupsWithAccountRequest associateSigninDelegateGroupsWithAccountRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSigninDelegateGroupsWithAccountRequest, AssociateSigninDelegateGroupsWithAccountResult> asyncHandler);

    /**
     * <p>
     * Creates up to 100 new attendees for an active Amazon Chime SDK meeting. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @return A Java Future containing the result of the BatchCreateAttendee operation returned by the service.
     * @sample AmazonChimeAsync.BatchCreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest batchCreateAttendeeRequest);

    /**
     * <p>
     * Creates up to 100 new attendees for an active Amazon Chime SDK meeting. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateAttendee operation returned by the service.
     * @sample AmazonChimeAsyncHandler.BatchCreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest batchCreateAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateAttendeeRequest, BatchCreateAttendeeResult> asyncHandler);

    /**
     * <p>
     * Adds a specified number of users to a channel.
     * </p>
     * 
     * @param batchCreateChannelMembershipRequest
     * @return A Java Future containing the result of the BatchCreateChannelMembership operation returned by the
     *         service.
     * @sample AmazonChimeAsync.BatchCreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateChannelMembership"
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
     * @sample AmazonChimeAsyncHandler.BatchCreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateChannelMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateChannelMembershipResult> batchCreateChannelMembershipAsync(
            BatchCreateChannelMembershipRequest batchCreateChannelMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateChannelMembershipRequest, BatchCreateChannelMembershipResult> asyncHandler);

    /**
     * <p>
     * Adds up to 50 members to a chat room in an Amazon Chime Enterprise account. Members can be users or bots. The
     * member role designates whether the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param batchCreateRoomMembershipRequest
     * @return A Java Future containing the result of the BatchCreateRoomMembership operation returned by the service.
     * @sample AmazonChimeAsync.BatchCreateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateRoomMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateRoomMembershipResult> batchCreateRoomMembershipAsync(
            BatchCreateRoomMembershipRequest batchCreateRoomMembershipRequest);

    /**
     * <p>
     * Adds up to 50 members to a chat room in an Amazon Chime Enterprise account. Members can be users or bots. The
     * member role designates whether the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param batchCreateRoomMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateRoomMembership operation returned by the service.
     * @sample AmazonChimeAsyncHandler.BatchCreateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateRoomMembership"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateRoomMembershipResult> batchCreateRoomMembershipAsync(
            BatchCreateRoomMembershipRequest batchCreateRoomMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateRoomMembershipRequest, BatchCreateRoomMembershipResult> asyncHandler);

    /**
     * <p>
     * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be disassociated from any users or Amazon
     * Chime Voice Connectors before they can be deleted.
     * </p>
     * <p>
     * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param batchDeletePhoneNumberRequest
     * @return A Java Future containing the result of the BatchDeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsync.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchDeletePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest);

    /**
     * <p>
     * Moves phone numbers into the <b>Deletion queue</b>. Phone numbers must be disassociated from any users or Amazon
     * Chime Voice Connectors before they can be deleted.
     * </p>
     * <p>
     * Phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param batchDeletePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsyncHandler.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchDeletePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeletePhoneNumberResult> batchDeletePhoneNumberAsync(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeletePhoneNumberRequest, BatchDeletePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Suspends up to 50 users from a <code>Team</code> or <code>EnterpriseLWA</code> Amazon Chime account. For more
     * information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * <p>
     * Users suspended from a <code>Team</code> account are disassociated from the account,but they can continue to use
     * Amazon Chime as free users. To remove the suspension from suspended <code>Team</code> account users, invite them
     * to the <code>Team</code> account again. You can use the <a>InviteUsers</a> action to do so.
     * </p>
     * <p>
     * Users suspended from an <code>EnterpriseLWA</code> account are immediately signed out of Amazon Chime and can no
     * longer sign in. To remove the suspension from suspended <code>EnterpriseLWA</code> account users, use the
     * <a>BatchUnsuspendUser</a> action.
     * </p>
     * <p>
     * To sign out users without suspending them, use the <a>LogoutUser</a> action.
     * </p>
     * 
     * @param batchSuspendUserRequest
     * @return A Java Future containing the result of the BatchSuspendUser operation returned by the service.
     * @sample AmazonChimeAsync.BatchSuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchSuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchSuspendUserResult> batchSuspendUserAsync(BatchSuspendUserRequest batchSuspendUserRequest);

    /**
     * <p>
     * Suspends up to 50 users from a <code>Team</code> or <code>EnterpriseLWA</code> Amazon Chime account. For more
     * information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * <p>
     * Users suspended from a <code>Team</code> account are disassociated from the account,but they can continue to use
     * Amazon Chime as free users. To remove the suspension from suspended <code>Team</code> account users, invite them
     * to the <code>Team</code> account again. You can use the <a>InviteUsers</a> action to do so.
     * </p>
     * <p>
     * Users suspended from an <code>EnterpriseLWA</code> account are immediately signed out of Amazon Chime and can no
     * longer sign in. To remove the suspension from suspended <code>EnterpriseLWA</code> account users, use the
     * <a>BatchUnsuspendUser</a> action.
     * </p>
     * <p>
     * To sign out users without suspending them, use the <a>LogoutUser</a> action.
     * </p>
     * 
     * @param batchSuspendUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchSuspendUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.BatchSuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchSuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchSuspendUserResult> batchSuspendUserAsync(BatchSuspendUserRequest batchSuspendUserRequest,
            com.amazonaws.handlers.AsyncHandler<BatchSuspendUserRequest, BatchSuspendUserResult> asyncHandler);

    /**
     * <p>
     * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime
     * <code>EnterpriseLWA</code> account. Only users on <code>EnterpriseLWA</code> accounts can be unsuspended using
     * this action. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * <p>
     * Previously suspended users who are unsuspended using this action are returned to <code>Registered</code> status.
     * Users who are not previously suspended are ignored.
     * </p>
     * 
     * @param batchUnsuspendUserRequest
     * @return A Java Future containing the result of the BatchUnsuspendUser operation returned by the service.
     * @sample AmazonChimeAsync.BatchUnsuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUnsuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchUnsuspendUserResult> batchUnsuspendUserAsync(BatchUnsuspendUserRequest batchUnsuspendUserRequest);

    /**
     * <p>
     * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime
     * <code>EnterpriseLWA</code> account. Only users on <code>EnterpriseLWA</code> accounts can be unsuspended using
     * this action. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * <p>
     * Previously suspended users who are unsuspended using this action are returned to <code>Registered</code> status.
     * Users who are not previously suspended are ignored.
     * </p>
     * 
     * @param batchUnsuspendUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUnsuspendUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.BatchUnsuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUnsuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchUnsuspendUserResult> batchUnsuspendUserAsync(BatchUnsuspendUserRequest batchUnsuspendUserRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUnsuspendUserRequest, BatchUnsuspendUserResult> asyncHandler);

    /**
     * <p>
     * Updates phone number product types or calling names. You can update one attribute at a time for each
     * <code>UpdatePhoneNumberRequestItem</code> . For example, you can update either the product type or the calling
     * name.
     * </p>
     * <p>
     * For product types, choose from Amazon Chime Business Calling and Amazon Chime Voice Connector. For toll-free
     * numbers, you must use the Amazon Chime Voice Connector product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names
     * must be complete before you can request another update.
     * </p>
     * 
     * @param batchUpdatePhoneNumberRequest
     * @return A Java Future containing the result of the BatchUpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsync.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdatePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest);

    /**
     * <p>
     * Updates phone number product types or calling names. You can update one attribute at a time for each
     * <code>UpdatePhoneNumberRequestItem</code> . For example, you can update either the product type or the calling
     * name.
     * </p>
     * <p>
     * For product types, choose from Amazon Chime Business Calling and Amazon Chime Voice Connector. For toll-free
     * numbers, you must use the Amazon Chime Voice Connector product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names
     * must be complete before you can request another update.
     * </p>
     * 
     * @param batchUpdatePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsyncHandler.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdatePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdatePhoneNumberResult> batchUpdatePhoneNumberAsync(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdatePhoneNumberRequest, BatchUpdatePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Updates user details within the <a>UpdateUserRequestItem</a> object for up to 20 users for the specified Amazon
     * Chime account. Currently, only <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param batchUpdateUserRequest
     * @return A Java Future containing the result of the BatchUpdateUser operation returned by the service.
     * @sample AmazonChimeAsync.BatchUpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateUserResult> batchUpdateUserAsync(BatchUpdateUserRequest batchUpdateUserRequest);

    /**
     * <p>
     * Updates user details within the <a>UpdateUserRequestItem</a> object for up to 20 users for the specified Amazon
     * Chime account. Currently, only <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param batchUpdateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.BatchUpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateUserResult> batchUpdateUserAsync(BatchUpdateUserRequest batchUpdateUserRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateUserRequest, BatchUpdateUserResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Chime account under the administrator's AWS account. Only <code>Team</code> account types are
     * currently supported for this action. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param createAccountRequest
     * @return A Java Future containing the result of the CreateAccount operation returned by the service.
     * @sample AmazonChimeAsync.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest createAccountRequest);

    /**
     * <p>
     * Creates an Amazon Chime account under the administrator's AWS account. Only <code>Team</code> account types are
     * currently supported for this action. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param createAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccount operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest createAccountRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccountRequest, CreateAccountResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Chime SDK messaging <code>AppInstance</code> under an AWS account. Only SDK messaging customers
     * use this API. <code>CreateAppInstance</code> supports idempotency behavior as described in the AWS API Standard.
     * </p>
     * 
     * @param createAppInstanceRequest
     * @return A Java Future containing the result of the CreateAppInstance operation returned by the service.
     * @sample AmazonChimeAsync.CreateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(CreateAppInstanceRequest createAppInstanceRequest);

    /**
     * <p>
     * Creates an Amazon Chime SDK messaging <code>AppInstance</code> under an AWS account. Only SDK messaging customers
     * use this API. <code>CreateAppInstance</code> supports idempotency behavior as described in the AWS API Standard.
     * </p>
     * 
     * @param createAppInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppInstance operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(CreateAppInstanceRequest createAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceRequest, CreateAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Promotes an <code>AppInstanceUser</code> to an <code>AppInstanceAdmin</code>. The promoted user can perform the
     * following actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChannelModerator</code> actions across all channels in the <code>AppInstance</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteChannelMessage</code> actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only an <code>AppInstanceUser</code> can be promoted to an <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @return A Java Future containing the result of the CreateAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeAsync.CreateAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstanceAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(CreateAppInstanceAdminRequest createAppInstanceAdminRequest);

    /**
     * <p>
     * Promotes an <code>AppInstanceUser</code> to an <code>AppInstanceAdmin</code>. The promoted user can perform the
     * following actions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ChannelModerator</code> actions across all channels in the <code>AppInstance</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DeleteChannelMessage</code> actions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Only an <code>AppInstanceUser</code> can be promoted to an <code>AppInstanceAdmin</code> role.
     * </p>
     * 
     * @param createAppInstanceAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstanceAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(CreateAppInstanceAdminRequest createAppInstanceAdminRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceAdminRequest, CreateAppInstanceAdminResult> asyncHandler);

    /**
     * <p>
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The request consists of a unique
     * <code>appInstanceUserId</code> and <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @return A Java Future containing the result of the CreateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsync.CreateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(CreateAppInstanceUserRequest createAppInstanceUserRequest);

    /**
     * <p>
     * Creates a user under an Amazon Chime <code>AppInstance</code>. The request consists of a unique
     * <code>appInstanceUserId</code> and <code>Name</code> for that user.
     * </p>
     * 
     * @param createAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(CreateAppInstanceUserRequest createAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceUserRequest, CreateAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @return A Java Future containing the result of the CreateAttendee operation returned by the service.
     * @sample AmazonChimeAsync.CreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest createAttendeeRequest);

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAttendee operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest createAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAttendeeRequest, CreateAttendeeResult> asyncHandler);

    /**
     * <p>
     * Creates a bot for an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createBotRequest
     * @return A Java Future containing the result of the CreateBot operation returned by the service.
     * @sample AmazonChimeAsync.CreateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBotResult> createBotAsync(CreateBotRequest createBotRequest);

    /**
     * <p>
     * Creates a bot for an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBot operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBotResult> createBotAsync(CreateBotRequest createBotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBotRequest, CreateBotResult> asyncHandler);

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
     * @sample AmazonChimeAsync.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannel" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.CreateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannel" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsync.CreateChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelBan" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.CreateChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelBan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelBanResult> createChannelBanAsync(CreateChannelBanRequest createChannelBanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelBanRequest, CreateChannelBanResult> asyncHandler);

    /**
     * <p>
     * Adds a user to a channel. The <code>InvitedBy</code> response field is derived from the request header. A channel
     * member can:
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
     * @sample AmazonChimeAsync.CreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelMembership" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelMembershipResult> createChannelMembershipAsync(CreateChannelMembershipRequest createChannelMembershipRequest);

    /**
     * <p>
     * Adds a user to a channel. The <code>InvitedBy</code> response field is derived from the request header. A channel
     * member can:
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
     * @sample AmazonChimeAsyncHandler.CreateChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelMembership" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsync.CreateChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelModerator" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.CreateChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateChannelModerator" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateChannelModeratorResult> createChannelModeratorAsync(CreateChannelModeratorRequest createChannelModeratorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChannelModeratorRequest, CreateChannelModeratorResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more
     * information about specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i> . For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param createMeetingRequest
     * @return A Java Future containing the result of the CreateMeeting operation returned by the service.
     * @sample AmazonChimeAsync.CreateMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest createMeetingRequest);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more
     * information about specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i> . For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param createMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMeeting operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest createMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMeetingRequest, CreateMeetingResult> asyncHandler);

    /**
     * <p>
     * Uses the join token and call metadata in a meeting request (From number, To number, and so forth) to initiate an
     * outbound call to a public switched telephone network (PSTN) and join them into a Chime meeting. Also ensures that
     * the From number belongs to the customer.
     * </p>
     * <p>
     * To play welcome audio or implement an interactive voice response (IVR), use the
     * <code>CreateSipMediaApplicationCall</code> action with the corresponding SIP media application ID.
     * </p>
     * 
     * @param createMeetingDialOutRequest
     * @return A Java Future containing the result of the CreateMeetingDialOut operation returned by the service.
     * @sample AmazonChimeAsync.CreateMeetingDialOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeetingDialOut" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingDialOutResult> createMeetingDialOutAsync(CreateMeetingDialOutRequest createMeetingDialOutRequest);

    /**
     * <p>
     * Uses the join token and call metadata in a meeting request (From number, To number, and so forth) to initiate an
     * outbound call to a public switched telephone network (PSTN) and join them into a Chime meeting. Also ensures that
     * the From number belongs to the customer.
     * </p>
     * <p>
     * To play welcome audio or implement an interactive voice response (IVR), use the
     * <code>CreateSipMediaApplicationCall</code> action with the corresponding SIP media application ID.
     * </p>
     * 
     * @param createMeetingDialOutRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMeetingDialOut operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateMeetingDialOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeetingDialOut" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingDialOutResult> createMeetingDialOutAsync(CreateMeetingDialOutRequest createMeetingDialOutRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMeetingDialOutRequest, CreateMeetingDialOutResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about
     * specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i> . For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param createMeetingWithAttendeesRequest
     * @return A Java Future containing the result of the CreateMeetingWithAttendees operation returned by the service.
     * @sample AmazonChimeAsync.CreateMeetingWithAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeetingWithAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(
            CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region, with attendees. For more information about
     * specifying media Regions, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html">Amazon Chime SDK Media
     * Regions</a> in the <i>Amazon Chime Developer Guide</i> . For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param createMeetingWithAttendeesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMeetingWithAttendees operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateMeetingWithAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeetingWithAttendees"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(
            CreateMeetingWithAttendeesRequest createMeetingWithAttendeesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMeetingWithAttendeesRequest, CreateMeetingWithAttendeesResult> asyncHandler);

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime
     * Voice Connector product types. For toll-free numbers, you must use the Amazon Chime Voice Connector product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return A Java Future containing the result of the CreatePhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeAsync.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreatePhoneNumberOrder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest);

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime
     * Voice Connector product types. For toll-free numbers, you must use the Amazon Chime Voice Connector product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreatePhoneNumberOrder" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePhoneNumberOrderResult> createPhoneNumberOrderAsync(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePhoneNumberOrderRequest, CreatePhoneNumberOrderResult> asyncHandler);

    /**
     * <p>
     * Creates a proxy session on the specified Amazon Chime Voice Connector for the specified participant phone
     * numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @return A Java Future containing the result of the CreateProxySession operation returned by the service.
     * @sample AmazonChimeAsync.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProxySessionResult> createProxySessionAsync(CreateProxySessionRequest createProxySessionRequest);

    /**
     * <p>
     * Creates a proxy session on the specified Amazon Chime Voice Connector for the specified participant phone
     * numbers.
     * </p>
     * 
     * @param createProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProxySession operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProxySessionResult> createProxySessionAsync(CreateProxySessionRequest createProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProxySessionRequest, CreateProxySessionResult> asyncHandler);

    /**
     * <p>
     * Creates a chat room for the specified Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createRoomRequest
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonChimeAsync.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest);

    /**
     * <p>
     * Creates a chat room for the specified Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoomRequest, CreateRoomResult> asyncHandler);

    /**
     * <p>
     * Adds a member to a chat room in an Amazon Chime Enterprise account. A member can be either a user or a bot. The
     * member role designates whether the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param createRoomMembershipRequest
     * @return A Java Future containing the result of the CreateRoomMembership operation returned by the service.
     * @sample AmazonChimeAsync.CreateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomMembershipResult> createRoomMembershipAsync(CreateRoomMembershipRequest createRoomMembershipRequest);

    /**
     * <p>
     * Adds a member to a chat room in an Amazon Chime Enterprise account. A member can be either a user or a bot. The
     * member role designates whether the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param createRoomMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoomMembership operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomMembershipResult> createRoomMembershipAsync(CreateRoomMembershipRequest createRoomMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoomMembershipRequest, CreateRoomMembershipResult> asyncHandler);

    /**
     * <p>
     * Creates a SIP media application.
     * </p>
     * 
     * @param createSipMediaApplicationRequest
     * @return A Java Future containing the result of the CreateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsync.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationResult> createSipMediaApplicationAsync(
            CreateSipMediaApplicationRequest createSipMediaApplicationRequest);

    /**
     * <p>
     * Creates a SIP media application.
     * </p>
     * 
     * @param createSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationResult> createSipMediaApplicationAsync(
            CreateSipMediaApplicationRequest createSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSipMediaApplicationRequest, CreateSipMediaApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the
     * endpoint of the specified <code>sipMediaApplicationId</code>.
     * </p>
     * 
     * @param createSipMediaApplicationCallRequest
     * @return A Java Future containing the result of the CreateSipMediaApplicationCall operation returned by the
     *         service.
     * @sample AmazonChimeAsync.CreateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationCallResult> createSipMediaApplicationCallAsync(
            CreateSipMediaApplicationCallRequest createSipMediaApplicationCallRequest);

    /**
     * <p>
     * Creates an outbound call to a phone number from the phone number specified in the request, and it invokes the
     * endpoint of the specified <code>sipMediaApplicationId</code>.
     * </p>
     * 
     * @param createSipMediaApplicationCallRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSipMediaApplicationCall operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.CreateSipMediaApplicationCall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipMediaApplicationCall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSipMediaApplicationCallResult> createSipMediaApplicationCallAsync(
            CreateSipMediaApplicationCallRequest createSipMediaApplicationCallRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSipMediaApplicationCallRequest, CreateSipMediaApplicationCallResult> asyncHandler);

    /**
     * <p>
     * Creates a SIP rule which can be used to run a SIP media application as a target for a specific trigger type.
     * </p>
     * 
     * @param createSipRuleRequest
     * @return A Java Future containing the result of the CreateSipRule operation returned by the service.
     * @sample AmazonChimeAsync.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSipRuleResult> createSipRuleAsync(CreateSipRuleRequest createSipRuleRequest);

    /**
     * <p>
     * Creates a SIP rule which can be used to run a SIP media application as a target for a specific trigger type.
     * </p>
     * 
     * @param createSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSipRule operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSipRuleResult> createSipRuleAsync(CreateSipRuleRequest createSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSipRuleRequest, CreateSipRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a user under the specified Amazon Chime account.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonChimeAsync.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a user under the specified Amazon Chime account.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Chime Voice Connector under the administrator's AWS account. You can choose to create an Amazon
     * Chime Voice Connector in a specific AWS Region.
     * </p>
     * <p>
     * Enabling <a>CreateVoiceConnectorRequest$RequireEncryption</a> configures your Amazon Chime Voice Connector to use
     * TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted
     * outbound calls are blocked.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return A Java Future containing the result of the CreateVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsync.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(CreateVoiceConnectorRequest createVoiceConnectorRequest);

    /**
     * <p>
     * Creates an Amazon Chime Voice Connector under the administrator's AWS account. You can choose to create an Amazon
     * Chime Voice Connector in a specific AWS Region.
     * </p>
     * <p>
     * Enabling <a>CreateVoiceConnectorRequest$RequireEncryption</a> configures your Amazon Chime Voice Connector to use
     * TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted
     * outbound calls are blocked.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorResult> createVoiceConnectorAsync(CreateVoiceConnectorRequest createVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorRequest, CreateVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Chime Voice Connector group under the administrator's AWS account. You can associate Amazon
     * Chime Voice Connectors with the Amazon Chime Voice Connector group by including <code>VoiceConnectorItems</code>
     * in the request.
     * </p>
     * <p>
     * You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault
     * tolerant mechanism for fallback in case of availability events.
     * </p>
     * 
     * @param createVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the CreateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsync.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(
            CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest);

    /**
     * <p>
     * Creates an Amazon Chime Voice Connector group under the administrator's AWS account. You can associate Amazon
     * Chime Voice Connectors with the Amazon Chime Voice Connector group by including <code>VoiceConnectorItems</code>
     * in the request.
     * </p>
     * <p>
     * You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault
     * tolerant mechanism for fallback in case of availability events.
     * </p>
     * 
     * @param createVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsyncHandler.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVoiceConnectorGroupResult> createVoiceConnectorGroupAsync(
            CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVoiceConnectorGroupRequest, CreateVoiceConnectorGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon Chime account. You must suspend all users before deleting <code>Team</code> account.
     * You can use the <a>BatchSuspendUser</a> action to dodo.
     * </p>
     * <p>
     * For <code>EnterpriseLWA</code> and <code>EnterpriseAD</code> accounts, you must release the claimed domains for
     * your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are
     * suspended.
     * </p>
     * <p>
     * Deleted accounts appear in your <code>Disabled</code> accounts list for 90 days. To restore deleted account from
     * your <code>Disabled</code> accounts list, you must contact AWS Support.
     * </p>
     * <p>
     * After 90 days, deleted accounts are permanently removed from your <code>Disabled</code> accounts list.
     * </p>
     * 
     * @param deleteAccountRequest
     * @return A Java Future containing the result of the DeleteAccount operation returned by the service.
     * @sample AmazonChimeAsync.DeleteAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountResult> deleteAccountAsync(DeleteAccountRequest deleteAccountRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime account. You must suspend all users before deleting <code>Team</code> account.
     * You can use the <a>BatchSuspendUser</a> action to dodo.
     * </p>
     * <p>
     * For <code>EnterpriseLWA</code> and <code>EnterpriseAD</code> accounts, you must release the claimed domains for
     * your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are
     * suspended.
     * </p>
     * <p>
     * Deleted accounts appear in your <code>Disabled</code> accounts list for 90 days. To restore deleted account from
     * your <code>Disabled</code> accounts list, you must contact AWS Support.
     * </p>
     * <p>
     * After 90 days, deleted accounts are permanently removed from your <code>Disabled</code> accounts list.
     * </p>
     * 
     * @param deleteAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccount operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccountResult> deleteAccountAsync(DeleteAccountRequest deleteAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountRequest, DeleteAccountResult> asyncHandler);

    /**
     * <p>
     * Deletes an <code>AppInstance</code> and all associated data asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @return A Java Future containing the result of the DeleteAppInstance operation returned by the service.
     * @sample AmazonChimeAsync.DeleteAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(DeleteAppInstanceRequest deleteAppInstanceRequest);

    /**
     * <p>
     * Deletes an <code>AppInstance</code> and all associated data asynchronously.
     * </p>
     * 
     * @param deleteAppInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInstance operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(DeleteAppInstanceRequest deleteAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceRequest, DeleteAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Demotes an <code>AppInstanceAdmin</code> to an <code>AppInstanceUser</code>. This action does not delete the
     * user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @return A Java Future containing the result of the DeleteAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeAsync.DeleteAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstanceAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest);

    /**
     * <p>
     * Demotes an <code>AppInstanceAdmin</code> to an <code>AppInstanceUser</code>. This action does not delete the
     * user.
     * </p>
     * 
     * @param deleteAppInstanceAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstanceAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(DeleteAppInstanceAdminRequest deleteAppInstanceAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceAdminRequest, DeleteAppInstanceAdminResult> asyncHandler);

    /**
     * <p>
     * Deletes the streaming configurations of an <code>AppInstance</code>.
     * </p>
     * 
     * @param deleteAppInstanceStreamingConfigurationsRequest
     * @return A Java Future containing the result of the DeleteAppInstanceStreamingConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeAsync.DeleteAppInstanceStreamingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstanceStreamingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceStreamingConfigurationsResult> deleteAppInstanceStreamingConfigurationsAsync(
            DeleteAppInstanceStreamingConfigurationsRequest deleteAppInstanceStreamingConfigurationsRequest);

    /**
     * <p>
     * Deletes the streaming configurations of an <code>AppInstance</code>.
     * </p>
     * 
     * @param deleteAppInstanceStreamingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInstanceStreamingConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.DeleteAppInstanceStreamingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstanceStreamingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceStreamingConfigurationsResult> deleteAppInstanceStreamingConfigurationsAsync(
            DeleteAppInstanceStreamingConfigurationsRequest deleteAppInstanceStreamingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceStreamingConfigurationsRequest, DeleteAppInstanceStreamingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @return A Java Future containing the result of the DeleteAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsync.DeleteAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest);

    /**
     * <p>
     * Deletes an <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param deleteAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(DeleteAppInstanceUserRequest deleteAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceUserRequest, DeleteAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their <code>JoinToken</code>.
     * Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the
     * Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon
     * Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @return A Java Future containing the result of the DeleteAttendee operation returned by the service.
     * @sample AmazonChimeAsync.DeleteAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest deleteAttendeeRequest);

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their <code>JoinToken</code>.
     * Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the
     * Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon
     * Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAttendee operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest deleteAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAttendeeRequest, DeleteAttendeeResult> asyncHandler);

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
     * @sample AmazonChimeAsync.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DeleteChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannel" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsync.DeleteChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelBan" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DeleteChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelBan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelBanResult> deleteChannelBanAsync(DeleteChannelBanRequest deleteChannelBanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelBanRequest, DeleteChannelBanResult> asyncHandler);

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
     * @sample AmazonChimeAsync.DeleteChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelMembership" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DeleteChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelMembership" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsync.DeleteChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelMessage" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DeleteChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelMessage" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsync.DeleteChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelModerator" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DeleteChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteChannelModerator" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteChannelModeratorResult> deleteChannelModeratorAsync(DeleteChannelModeratorRequest deleteChannelModeratorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChannelModeratorRequest, DeleteChannelModeratorResult> asyncHandler);

    /**
     * <p>
     * Deletes the events configuration that allows a bot to receive outgoing events.
     * </p>
     * 
     * @param deleteEventsConfigurationRequest
     * @return A Java Future containing the result of the DeleteEventsConfiguration operation returned by the service.
     * @sample AmazonChimeAsync.DeleteEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteEventsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventsConfigurationResult> deleteEventsConfigurationAsync(
            DeleteEventsConfigurationRequest deleteEventsConfigurationRequest);

    /**
     * <p>
     * Deletes the events configuration that allows a bot to receive outgoing events.
     * </p>
     * 
     * @param deleteEventsConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventsConfiguration operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteEventsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventsConfigurationResult> deleteEventsConfigurationAsync(
            DeleteEventsConfigurationRequest deleteEventsConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventsConfigurationRequest, DeleteEventsConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and
     * prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @return A Java Future containing the result of the DeleteMeeting operation returned by the service.
     * @sample AmazonChimeAsync.DeleteMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest deleteMeetingRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. The operation deletes all attendees, disconnects all clients, and
     * prevents new clients from joining the meeting. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMeeting operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest deleteMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMeetingRequest, DeleteMeetingResult> asyncHandler);

    /**
     * <p>
     * Moves the specified phone number into the <b>Deletionqueue</b>. A phone number must be disassociated from any
     * users or Amazon Chime Voice Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @return A Java Future containing the result of the DeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsync.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeletePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(DeletePhoneNumberRequest deletePhoneNumberRequest);

    /**
     * <p>
     * Moves the specified phone number into the <b>Deletionqueue</b>. A phone number must be disassociated from any
     * users or Amazon Chime Voice Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeletePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePhoneNumberResult> deletePhoneNumberAsync(DeletePhoneNumberRequest deletePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePhoneNumberRequest, DeletePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified proxy session from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @return A Java Future containing the result of the DeleteProxySession operation returned by the service.
     * @sample AmazonChimeAsync.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProxySessionResult> deleteProxySessionAsync(DeleteProxySessionRequest deleteProxySessionRequest);

    /**
     * <p>
     * Deletes the specified proxy session from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProxySession operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProxySessionResult> deleteProxySessionAsync(DeleteProxySessionRequest deleteProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProxySessionRequest, DeleteProxySessionResult> asyncHandler);

    /**
     * <p>
     * Deletes a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonChimeAsync.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest);

    /**
     * <p>
     * Deletes a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoomRequest, DeleteRoomResult> asyncHandler);

    /**
     * <p>
     * Removes a member from a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomMembershipRequest
     * @return A Java Future containing the result of the DeleteRoomMembership operation returned by the service.
     * @sample AmazonChimeAsync.DeleteRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomMembershipResult> deleteRoomMembershipAsync(DeleteRoomMembershipRequest deleteRoomMembershipRequest);

    /**
     * <p>
     * Removes a member from a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoomMembership operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomMembershipResult> deleteRoomMembershipAsync(DeleteRoomMembershipRequest deleteRoomMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoomMembershipRequest, DeleteRoomMembershipResult> asyncHandler);

    /**
     * <p>
     * Deletes a SIP media application.
     * </p>
     * 
     * @param deleteSipMediaApplicationRequest
     * @return A Java Future containing the result of the DeleteSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsync.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipMediaApplicationResult> deleteSipMediaApplicationAsync(
            DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest);

    /**
     * <p>
     * Deletes a SIP media application.
     * </p>
     * 
     * @param deleteSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipMediaApplicationResult> deleteSipMediaApplicationAsync(
            DeleteSipMediaApplicationRequest deleteSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSipMediaApplicationRequest, DeleteSipMediaApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a SIP rule. You must disable a SIP rule before you can delete it.
     * </p>
     * 
     * @param deleteSipRuleRequest
     * @return A Java Future containing the result of the DeleteSipRule operation returned by the service.
     * @sample AmazonChimeAsync.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipRuleResult> deleteSipRuleAsync(DeleteSipRuleRequest deleteSipRuleRequest);

    /**
     * <p>
     * Deletes a SIP rule. You must disable a SIP rule before you can delete it.
     * </p>
     * 
     * @param deleteSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSipRule operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSipRuleResult> deleteSipRuleAsync(DeleteSipRuleRequest deleteSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSipRuleRequest, DeleteSipRuleResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector. Any phone numbers associated with the Amazon Chime Voice
     * Connector must be disassociated from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @return A Java Future containing the result of the DeleteVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsync.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector. Any phone numbers associated with the Amazon Chime Voice
     * Connector must be disassociated from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorResult> deleteVoiceConnectorAsync(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorRequest, DeleteVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Deletes the emergency calling configuration details from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorEmergencyCallingConfigurationRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeAsync.DeleteVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorEmergencyCallingConfigurationResult> deleteVoiceConnectorEmergencyCallingConfigurationAsync(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest deleteVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Deletes the emergency calling configuration details from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorEmergencyCallingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorEmergencyCallingConfigurationResult> deleteVoiceConnectorEmergencyCallingConfigurationAsync(
            DeleteVoiceConnectorEmergencyCallingConfigurationRequest deleteVoiceConnectorEmergencyCallingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorEmergencyCallingConfigurationRequest, DeleteVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector group. Any <code>VoiceConnectorItems</code> and phone numbers
     * associated with the group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsync.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(
            DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector group. Any <code>VoiceConnectorItems</code> and phone numbers
     * associated with the group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorGroupResult> deleteVoiceConnectorGroupAsync(
            DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorGroupRequest, DeleteVoiceConnectorGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to deleting the
     * origination settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeAsync.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Deletes the origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to deleting the
     * origination settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorOriginationResult> deleteVoiceConnectorOriginationAsync(
            DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorOriginationRequest, DeleteVoiceConnectorOriginationResult> asyncHandler);

    /**
     * <p>
     * Deletes the proxy configuration from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeAsync.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorProxyResult> deleteVoiceConnectorProxyAsync(
            DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest);

    /**
     * <p>
     * Deletes the proxy configuration from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorProxy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorProxyResult> deleteVoiceConnectorProxyAsync(
            DeleteVoiceConnectorProxyRequest deleteVoiceConnectorProxyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorProxyRequest, DeleteVoiceConnectorProxyResult> asyncHandler);

    /**
     * <p>
     * Deletes the streaming configuration for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorStreamingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeAsync.DeleteVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Deletes the streaming configuration for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorStreamingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorStreamingConfigurationResult> deleteVoiceConnectorStreamingConfigurationAsync(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorStreamingConfigurationRequest, DeleteVoiceConnectorStreamingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to deleting the
     * termination settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeAsync.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Deletes the termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to deleting the
     * termination settings.
     * </p>
     * </note>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationResult> deleteVoiceConnectorTerminationAsync(
            DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationRequest, DeleteVoiceConnectorTerminationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @return A Java Future containing the result of the DeleteVoiceConnectorTerminationCredentials operation returned
     *         by the service.
     * @sample AmazonChimeAsync.DeleteVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVoiceConnectorTerminationCredentials operation returned
     *         by the service.
     * @sample AmazonChimeAsyncHandler.DeleteVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVoiceConnectorTerminationCredentialsResult> deleteVoiceConnectorTerminationCredentialsAsync(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVoiceConnectorTerminationCredentialsRequest, DeleteVoiceConnectorTerminationCredentialsResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @return A Java Future containing the result of the DescribeAppInstance operation returned by the service.
     * @sample AmazonChimeAsync.DescribeAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(DescribeAppInstanceRequest describeAppInstanceRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstance</code>.
     * </p>
     * 
     * @param describeAppInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppInstance operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DescribeAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(DescribeAppInstanceRequest describeAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceRequest, DescribeAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @return A Java Future containing the result of the DescribeAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeAsync.DescribeAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeAppInstanceAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceAdmin</code>.
     * </p>
     * 
     * @param describeAppInstanceAdminRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppInstanceAdmin operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DescribeAppInstanceAdmin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeAppInstanceAdmin" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(DescribeAppInstanceAdminRequest describeAppInstanceAdminRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceAdminRequest, DescribeAppInstanceAdminResult> asyncHandler);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUser</code> .
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @return A Java Future containing the result of the DescribeAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsync.DescribeAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(DescribeAppInstanceUserRequest describeAppInstanceUserRequest);

    /**
     * <p>
     * Returns the full details of an <code>AppInstanceUser</code> .
     * </p>
     * 
     * @param describeAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.DescribeAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(DescribeAppInstanceUserRequest describeAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceUserRequest, DescribeAppInstanceUserResult> asyncHandler);

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
     * @sample AmazonChimeAsync.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DescribeChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannel" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsync.DescribeChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelBan" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DescribeChannelBan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelBan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelBanResult> describeChannelBanAsync(DescribeChannelBanRequest describeChannelBanRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelBanRequest, DescribeChannelBanResult> asyncHandler);

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
     * @sample AmazonChimeAsync.DescribeChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelMembership"
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
     * @sample AmazonChimeAsyncHandler.DescribeChannelMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelMembership"
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
     * @sample AmazonChimeAsync.DescribeChannelMembershipForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelMembershipForAppInstanceUser"
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
     * @sample AmazonChimeAsyncHandler.DescribeChannelMembershipForAppInstanceUser
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelMembershipForAppInstanceUser"
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
     * @sample AmazonChimeAsync.DescribeChannelModeratedByAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelModeratedByAppInstanceUser"
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
     * @sample AmazonChimeAsyncHandler.DescribeChannelModeratedByAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelModeratedByAppInstanceUser"
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
     * @sample AmazonChimeAsync.DescribeChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelModerator" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.DescribeChannelModerator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DescribeChannelModerator" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeChannelModeratorResult> describeChannelModeratorAsync(DescribeChannelModeratorRequest describeChannelModeratorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChannelModeratorRequest, DescribeChannelModeratorResult> asyncHandler);

    /**
     * <p>
     * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
     * </p>
     * 
     * @param disassociatePhoneNumberFromUserRequest
     * @return A Java Future containing the result of the DisassociatePhoneNumberFromUser operation returned by the
     *         service.
     * @sample AmazonChimeAsync.DisassociatePhoneNumberFromUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumberFromUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumberFromUserResult> disassociatePhoneNumberFromUserAsync(
            DisassociatePhoneNumberFromUserRequest disassociatePhoneNumberFromUserRequest);

    /**
     * <p>
     * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
     * </p>
     * 
     * @param disassociatePhoneNumberFromUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePhoneNumberFromUser operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.DisassociatePhoneNumberFromUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumberFromUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumberFromUserResult> disassociatePhoneNumberFromUserAsync(
            DisassociatePhoneNumberFromUserRequest disassociatePhoneNumberFromUserRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumberFromUserRequest, DisassociatePhoneNumberFromUserResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnector operation returned
     *         by the service.
     * @sample AmazonChimeAsync.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnector operation returned
     *         by the service.
     * @sample AmazonChimeAsyncHandler.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorResult> disassociatePhoneNumbersFromVoiceConnectorAsync(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorRequest, DisassociatePhoneNumbersFromVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeAsync.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation
     *         returned by the service.
     * @sample AmazonChimeAsyncHandler.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociatePhoneNumbersFromVoiceConnectorGroupResult> disassociatePhoneNumbersFromVoiceConnectorGroupAsync(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociatePhoneNumbersFromVoiceConnectorGroupRequest, DisassociatePhoneNumbersFromVoiceConnectorGroupResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified sign-in delegate groups from the specified Amazon Chime account.
     * </p>
     * 
     * @param disassociateSigninDelegateGroupsFromAccountRequest
     * @return A Java Future containing the result of the DisassociateSigninDelegateGroupsFromAccount operation returned
     *         by the service.
     * @sample AmazonChimeAsync.DisassociateSigninDelegateGroupsFromAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociateSigninDelegateGroupsFromAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSigninDelegateGroupsFromAccountResult> disassociateSigninDelegateGroupsFromAccountAsync(
            DisassociateSigninDelegateGroupsFromAccountRequest disassociateSigninDelegateGroupsFromAccountRequest);

    /**
     * <p>
     * Disassociates the specified sign-in delegate groups from the specified Amazon Chime account.
     * </p>
     * 
     * @param disassociateSigninDelegateGroupsFromAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateSigninDelegateGroupsFromAccount operation returned
     *         by the service.
     * @sample AmazonChimeAsyncHandler.DisassociateSigninDelegateGroupsFromAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociateSigninDelegateGroupsFromAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateSigninDelegateGroupsFromAccountResult> disassociateSigninDelegateGroupsFromAccountAsync(
            DisassociateSigninDelegateGroupsFromAccountRequest disassociateSigninDelegateGroupsFromAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateSigninDelegateGroupsFromAccountRequest, DisassociateSigninDelegateGroupsFromAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
     * </p>
     * 
     * @param getAccountRequest
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonChimeAsync.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
     * </p>
     * 
     * @param getAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccount operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest getAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dialout
     * settings. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AmazonChimeAsync.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dialout
     * settings. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest getAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @return A Java Future containing the result of the GetAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeAsync.GetAppInstanceRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest);

    /**
     * <p>
     * Gets the retention settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceRetentionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.GetAppInstanceRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            GetAppInstanceRetentionSettingsRequest getAppInstanceRetentionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppInstanceRetentionSettingsRequest, GetAppInstanceRetentionSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets the streaming settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceStreamingConfigurationsRequest
     * @return A Java Future containing the result of the GetAppInstanceStreamingConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeAsync.GetAppInstanceStreamingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAppInstanceStreamingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppInstanceStreamingConfigurationsResult> getAppInstanceStreamingConfigurationsAsync(
            GetAppInstanceStreamingConfigurationsRequest getAppInstanceStreamingConfigurationsRequest);

    /**
     * <p>
     * Gets the streaming settings for an <code>AppInstance</code>.
     * </p>
     * 
     * @param getAppInstanceStreamingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppInstanceStreamingConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.GetAppInstanceStreamingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAppInstanceStreamingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAppInstanceStreamingConfigurationsResult> getAppInstanceStreamingConfigurationsAsync(
            GetAppInstanceStreamingConfigurationsRequest getAppInstanceStreamingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppInstanceStreamingConfigurationsRequest, GetAppInstanceStreamingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about
     * the Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param getAttendeeRequest
     * @return A Java Future containing the result of the GetAttendee operation returned by the service.
     * @sample AmazonChimeAsync.GetAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest getAttendeeRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about
     * the Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param getAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAttendee operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest getAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<GetAttendeeRequest, GetAttendeeResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.
     * </p>
     * 
     * @param getBotRequest
     * @return A Java Future containing the result of the GetBot operation returned by the service.
     * @sample AmazonChimeAsync.GetBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotResult> getBotAsync(GetBotRequest getBotRequest);

    /**
     * <p>
     * Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.
     * </p>
     * 
     * @param getBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBot operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBotResult> getBotAsync(GetBotRequest getBotRequest,
            com.amazonaws.handlers.AsyncHandler<GetBotRequest, GetBotResult> asyncHandler);

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
     * @sample AmazonChimeAsync.GetChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetChannelMessage" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.GetChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetChannelMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChannelMessageResult> getChannelMessageAsync(GetChannelMessageRequest getChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<GetChannelMessageRequest, GetChannelMessageResult> asyncHandler);

    /**
     * <p>
     * Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint
     * or Lambda function ARN.
     * </p>
     * 
     * @param getEventsConfigurationRequest
     * @return A Java Future containing the result of the GetEventsConfiguration operation returned by the service.
     * @sample AmazonChimeAsync.GetEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetEventsConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventsConfigurationResult> getEventsConfigurationAsync(GetEventsConfigurationRequest getEventsConfigurationRequest);

    /**
     * <p>
     * Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint
     * or Lambda function ARN.
     * </p>
     * 
     * @param getEventsConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEventsConfiguration operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetEventsConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetEventsConfigurationResult> getEventsConfigurationAsync(GetEventsConfigurationRequest getEventsConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetEventsConfigurationRequest, GetEventsConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return A Java Future containing the result of the GetGlobalSettings operation returned by the service.
     * @sample AmazonChimeAsync.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest getGlobalSettingsRequest);

    /**
     * <p>
     * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGlobalSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGlobalSettingsResult> getGlobalSettingsAsync(GetGlobalSettingsRequest getGlobalSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetGlobalSettingsRequest, GetGlobalSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param getMeetingRequest
     * @return A Java Future containing the result of the GetMeeting operation returned by the service.
     * @sample AmazonChimeAsync.GetMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest getMeetingRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param getMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMeeting operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest getMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<GetMeetingRequest, GetMeetingResult> asyncHandler);

    /**
     * <p>
     * The details of the endpoint for the messaging session.
     * </p>
     * 
     * @param getMessagingSessionEndpointRequest
     * @return A Java Future containing the result of the GetMessagingSessionEndpoint operation returned by the service.
     * @sample AmazonChimeAsync.GetMessagingSessionEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetMessagingSessionEndpoint"
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
     * @sample AmazonChimeAsyncHandler.GetMessagingSessionEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetMessagingSessionEndpoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMessagingSessionEndpointResult> getMessagingSessionEndpointAsync(
            GetMessagingSessionEndpointRequest getMessagingSessionEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<GetMessagingSessionEndpointRequest, GetMessagingSessionEndpointResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return A Java Future containing the result of the GetPhoneNumber operation returned by the service.
     * @sample AmazonChimeAsync.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(GetPhoneNumberRequest getPhoneNumberRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPhoneNumber operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberResult> getPhoneNumberAsync(GetPhoneNumberRequest getPhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<GetPhoneNumberRequest, GetPhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in
     * E.164 format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return A Java Future containing the result of the GetPhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeAsync.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as the order creation timestamp, phone numbers in
     * E.164 format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPhoneNumberOrder operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberOrder" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberOrderResult> getPhoneNumberOrderAsync(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest,
            com.amazonaws.handlers.AsyncHandler<GetPhoneNumberOrderRequest, GetPhoneNumberOrderResult> asyncHandler);

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling
     * name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @return A Java Future containing the result of the GetPhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeAsync.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest);

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling
     * name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPhoneNumberSettingsResult> getPhoneNumberSettingsAsync(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetPhoneNumberSettingsRequest, GetPhoneNumberSettingsResult> asyncHandler);

    /**
     * <p>
     * Gets the specified proxy session details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @return A Java Future containing the result of the GetProxySession operation returned by the service.
     * @sample AmazonChimeAsync.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProxySessionResult> getProxySessionAsync(GetProxySessionRequest getProxySessionRequest);

    /**
     * <p>
     * Gets the specified proxy session details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProxySession operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProxySessionResult> getProxySessionAsync(GetProxySessionRequest getProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetProxySessionRequest, GetProxySessionResult> asyncHandler);

    /**
     * <p>
     * Gets the retention settings for the specified Amazon Chime Enterprise account. For more information about
     * retention settings, see <a href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html">Managing Chat
     * Retention Policies</a> in the <i>Amazon Chime Administration Guide</i> .
     * </p>
     * 
     * @param getRetentionSettingsRequest
     * @return A Java Future containing the result of the GetRetentionSettings operation returned by the service.
     * @sample AmazonChimeAsync.GetRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetRetentionSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRetentionSettingsResult> getRetentionSettingsAsync(GetRetentionSettingsRequest getRetentionSettingsRequest);

    /**
     * <p>
     * Gets the retention settings for the specified Amazon Chime Enterprise account. For more information about
     * retention settings, see <a href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html">Managing Chat
     * Retention Policies</a> in the <i>Amazon Chime Administration Guide</i> .
     * </p>
     * 
     * @param getRetentionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRetentionSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetRetentionSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRetentionSettingsResult> getRetentionSettingsAsync(GetRetentionSettingsRequest getRetentionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRetentionSettingsRequest, GetRetentionSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves room details, such as the room name, for a room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param getRoomRequest
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonChimeAsync.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest);

    /**
     * <p>
     * Retrieves room details, such as the room name, for a room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param getRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoomRequest, GetRoomResult> asyncHandler);

    /**
     * <p>
     * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
     * </p>
     * 
     * @param getSipMediaApplicationRequest
     * @return A Java Future containing the result of the GetSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsync.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipMediaApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationResult> getSipMediaApplicationAsync(GetSipMediaApplicationRequest getSipMediaApplicationRequest);

    /**
     * <p>
     * Retrieves the information for a SIP media application, including name, AWS Region, and endpoints.
     * </p>
     * 
     * @param getSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipMediaApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationResult> getSipMediaApplicationAsync(GetSipMediaApplicationRequest getSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationRequest, GetSipMediaApplicationResult> asyncHandler);

    /**
     * <p>
     * Returns the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param getSipMediaApplicationLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeAsync.GetSipMediaApplicationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationLoggingConfigurationResult> getSipMediaApplicationLoggingConfigurationAsync(
            GetSipMediaApplicationLoggingConfigurationRequest getSipMediaApplicationLoggingConfigurationRequest);

    /**
     * <p>
     * Returns the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param getSipMediaApplicationLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeAsyncHandler.GetSipMediaApplicationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSipMediaApplicationLoggingConfigurationResult> getSipMediaApplicationLoggingConfigurationAsync(
            GetSipMediaApplicationLoggingConfigurationRequest getSipMediaApplicationLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipMediaApplicationLoggingConfigurationRequest, GetSipMediaApplicationLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
     * </p>
     * 
     * @param getSipRuleRequest
     * @return A Java Future containing the result of the GetSipRule operation returned by the service.
     * @sample AmazonChimeAsync.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSipRuleResult> getSipRuleAsync(GetSipRuleRequest getSipRuleRequest);

    /**
     * <p>
     * Retrieves the details of a SIP rule, such as the rule ID, name, triggers, and target endpoints.
     * </p>
     * 
     * @param getSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSipRule operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSipRuleResult> getSipRuleAsync(GetSipRuleRequest getSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetSipRuleRequest, GetSipRuleResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified user ID, such as primary email address, license type,and personal meeting
     * PIN.
     * </p>
     * <p>
     * To retrieve user details with an email address instead of a user ID, use the <a>ListUsers</a> action, and then
     * filter by email address.
     * </p>
     * 
     * @param getUserRequest
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AmazonChimeAsync.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest);

    /**
     * <p>
     * Retrieves details for the specified user ID, such as primary email address, license type,and personal meeting
     * PIN.
     * </p>
     * <p>
     * To retrieve user details with an email address instead of a user ID, use the <a>ListUsers</a> action, and then
     * filter by email address.
     * </p>
     * 
     * @param getUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler);

    /**
     * <p>
     * Retrieves settings for the specified user ID, such as any associated phone number settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return A Java Future containing the result of the GetUserSettings operation returned by the service.
     * @sample AmazonChimeAsync.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserSettingsResult> getUserSettingsAsync(GetUserSettingsRequest getUserSettingsRequest);

    /**
     * <p>
     * Retrieves settings for the specified user ID, such as any associated phone number settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserSettingsResult> getUserSettingsAsync(GetUserSettingsRequest getUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserSettingsRequest, GetUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps,name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return A Java Future containing the result of the GetVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsync.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(GetVoiceConnectorRequest getVoiceConnectorRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps,name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorResult> getVoiceConnectorAsync(GetVoiceConnectorRequest getVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorRequest, GetVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Gets the emergency calling configuration details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorEmergencyCallingConfigurationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeAsync.GetVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorEmergencyCallingConfigurationResult> getVoiceConnectorEmergencyCallingConfigurationAsync(
            GetVoiceConnectorEmergencyCallingConfigurationRequest getVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Gets the emergency calling configuration details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorEmergencyCallingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorEmergencyCallingConfigurationResult> getVoiceConnectorEmergencyCallingConfigurationAsync(
            GetVoiceConnectorEmergencyCallingConfigurationRequest getVoiceConnectorEmergencyCallingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorEmergencyCallingConfigurationRequest, GetVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector group, such as timestamps,name, and associated
     * <code>VoiceConnectorItems</code> .
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the GetVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsync.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector group, such as timestamps,name, and associated
     * <code>VoiceConnectorItems</code> .
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorGroupResult> getVoiceConnectorGroupAsync(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorGroupRequest, GetVoiceConnectorGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the logging configuration details for the specified Amazon Chime Voice Connector. Shows whether SIP
     * message logs are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsync.GetVoiceConnectorLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Retrieves the logging configuration details for the specified Amazon Chime Voice Connector. Shows whether SIP
     * message logs are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorLoggingConfigurationResult> getVoiceConnectorLoggingConfigurationAsync(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorLoggingConfigurationRequest, GetVoiceConnectorLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeAsync.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(
            GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorOriginationResult> getVoiceConnectorOriginationAsync(
            GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorOriginationRequest, GetVoiceConnectorOriginationResult> asyncHandler);

    /**
     * <p>
     * Gets the proxy configuration details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the GetVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeAsync.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorProxy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorProxyResult> getVoiceConnectorProxyAsync(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest);

    /**
     * <p>
     * Gets the proxy configuration details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorProxy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorProxyResult> getVoiceConnectorProxyAsync(GetVoiceConnectorProxyRequest getVoiceConnectorProxyRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorProxyRequest, GetVoiceConnectorProxyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon Chime Voice Connector. Shows whether media
     * streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the Amazon
     * Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsync.GetVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon Chime Voice Connector. Shows whether media
     * streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the Amazon
     * Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorStreamingConfigurationResult> getVoiceConnectorStreamingConfigurationAsync(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorStreamingConfigurationRequest, GetVoiceConnectorStreamingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return A Java Future containing the result of the GetVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeAsync.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(
            GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationResult> getVoiceConnectorTerminationAsync(
            GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationRequest, GetVoiceConnectorTerminationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the last time a SIP <code>OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return A Java Future containing the result of the GetVoiceConnectorTerminationHealth operation returned by the
     *         service.
     * @sample AmazonChimeAsync.GetVoiceConnectorTerminationHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest);

    /**
     * <p>
     * Retrieves information about the last time a SIP <code>OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVoiceConnectorTerminationHealth operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.GetVoiceConnectorTerminationHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetVoiceConnectorTerminationHealthResult> getVoiceConnectorTerminationHealthAsync(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest,
            com.amazonaws.handlers.AsyncHandler<GetVoiceConnectorTerminationHealthRequest, GetVoiceConnectorTerminationHealthResult> asyncHandler);

    /**
     * <p>
     * Sends email to a maximum of 50 users, inviting them to the specified Amazon Chime <code>Team</code> account. Only
     * <code>Team</code> account types are currently supported for this action.
     * </p>
     * 
     * @param inviteUsersRequest
     * @return A Java Future containing the result of the InviteUsers operation returned by the service.
     * @sample AmazonChimeAsync.InviteUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/InviteUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteUsersResult> inviteUsersAsync(InviteUsersRequest inviteUsersRequest);

    /**
     * <p>
     * Sends email to a maximum of 50 users, inviting them to the specified Amazon Chime <code>Team</code> account. Only
     * <code>Team</code> account types are currently supported for this action.
     * </p>
     * 
     * @param inviteUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InviteUsers operation returned by the service.
     * @sample AmazonChimeAsyncHandler.InviteUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/InviteUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteUsersResult> inviteUsersAsync(InviteUsersRequest inviteUsersRequest,
            com.amazonaws.handlers.AsyncHandler<InviteUsersRequest, InviteUsersResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name
     * prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address,
     * which returns one account result.
     * </p>
     * 
     * @param listAccountsRequest
     * @return A Java Future containing the result of the ListAccounts operation returned by the service.
     * @sample AmazonChimeAsync.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest listAccountsRequest);

    /**
     * <p>
     * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name
     * prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address,
     * which returns one account result.
     * </p>
     * 
     * @param listAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccounts operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest listAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountsRequest, ListAccountsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @return A Java Future containing the result of the ListAppInstanceAdmins operation returned by the service.
     * @sample AmazonChimeAsync.ListAppInstanceAdmins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstanceAdmins" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(ListAppInstanceAdminsRequest listAppInstanceAdminsRequest);

    /**
     * <p>
     * Returns a list of the administrators in the <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceAdminsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInstanceAdmins operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListAppInstanceAdmins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstanceAdmins" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(ListAppInstanceAdminsRequest listAppInstanceAdminsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceAdminsRequest, ListAppInstanceAdminsResult> asyncHandler);

    /**
     * <p>
     * List all <code>AppInstanceUsers</code> created under a single <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @return A Java Future containing the result of the ListAppInstanceUsers operation returned by the service.
     * @sample AmazonChimeAsync.ListAppInstanceUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstanceUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(ListAppInstanceUsersRequest listAppInstanceUsersRequest);

    /**
     * <p>
     * List all <code>AppInstanceUsers</code> created under a single <code>AppInstance</code>.
     * </p>
     * 
     * @param listAppInstanceUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInstanceUsers operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListAppInstanceUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstanceUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(ListAppInstanceUsersRequest listAppInstanceUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceUsersRequest, ListAppInstanceUsersResult> asyncHandler);

    /**
     * <p>
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @return A Java Future containing the result of the ListAppInstances operation returned by the service.
     * @sample AmazonChimeAsync.ListAppInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(ListAppInstancesRequest listAppInstancesRequest);

    /**
     * <p>
     * Lists all Amazon Chime <code>AppInstance</code>s created under a single AWS account.
     * </p>
     * 
     * @param listAppInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppInstances operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListAppInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAppInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(ListAppInstancesRequest listAppInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppInstancesRequest, ListAppInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK attendee resource.
     * </p>
     * 
     * @param listAttendeeTagsRequest
     * @return A Java Future containing the result of the ListAttendeeTags operation returned by the service.
     * @sample AmazonChimeAsync.ListAttendeeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAttendeeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttendeeTagsResult> listAttendeeTagsAsync(ListAttendeeTagsRequest listAttendeeTagsRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK attendee resource.
     * </p>
     * 
     * @param listAttendeeTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttendeeTags operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListAttendeeTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAttendeeTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttendeeTagsResult> listAttendeeTagsAsync(ListAttendeeTagsRequest listAttendeeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttendeeTagsRequest, ListAttendeeTagsResult> asyncHandler);

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param listAttendeesRequest
     * @return A Java Future containing the result of the ListAttendees operation returned by the service.
     * @sample AmazonChimeAsync.ListAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAttendees" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest listAttendeesRequest);

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param listAttendeesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttendees operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAttendees" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest listAttendeesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttendeesRequest, ListAttendeesResult> asyncHandler);

    /**
     * <p>
     * Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.
     * </p>
     * 
     * @param listBotsRequest
     * @return A Java Future containing the result of the ListBots operation returned by the service.
     * @sample AmazonChimeAsync.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest);

    /**
     * <p>
     * Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.
     * </p>
     * 
     * @param listBotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBots operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBotsResult> listBotsAsync(ListBotsRequest listBotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBotsRequest, ListBotsResult> asyncHandler);

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
     * @sample AmazonChimeAsync.ListChannelBans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelBans" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.ListChannelBans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelBans" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelBansResult> listChannelBansAsync(ListChannelBansRequest listChannelBansRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelBansRequest, ListChannelBansResult> asyncHandler);

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
     * 
     * @param listChannelMembershipsRequest
     * @return A Java Future containing the result of the ListChannelMemberships operation returned by the service.
     * @sample AmazonChimeAsync.ListChannelMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMemberships" target="_top">AWS
     *      API Documentation</a>
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
     * 
     * @param listChannelMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChannelMemberships operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListChannelMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMemberships" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsync.ListChannelMembershipsForAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMembershipsForAppInstanceUser"
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
     * @sample AmazonChimeAsyncHandler.ListChannelMembershipsForAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMembershipsForAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMembershipsForAppInstanceUserResult> listChannelMembershipsForAppInstanceUserAsync(
            ListChannelMembershipsForAppInstanceUserRequest listChannelMembershipsForAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelMembershipsForAppInstanceUserRequest, ListChannelMembershipsForAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * List all the messages in a channel. Returns a paginated list of <code>ChannelMessages</code>. By default, sorted
     * by creation timestamp in descending order .
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
     * @sample AmazonChimeAsync.ListChannelMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMessages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelMessagesResult> listChannelMessagesAsync(ListChannelMessagesRequest listChannelMessagesRequest);

    /**
     * <p>
     * List all the messages in a channel. Returns a paginated list of <code>ChannelMessages</code>. By default, sorted
     * by creation timestamp in descending order .
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
     * @sample AmazonChimeAsyncHandler.ListChannelMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMessages" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsync.ListChannelModerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelModerators" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.ListChannelModerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelModerators" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsync.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannels" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.ListChannels
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannels" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest listChannelsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler);

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
     * @sample AmazonChimeAsync.ListChannelsModeratedByAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelsModeratedByAppInstanceUser"
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
     * @sample AmazonChimeAsyncHandler.ListChannelsModeratedByAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelsModeratedByAppInstanceUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListChannelsModeratedByAppInstanceUserResult> listChannelsModeratedByAppInstanceUserAsync(
            ListChannelsModeratedByAppInstanceUserRequest listChannelsModeratedByAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<ListChannelsModeratedByAppInstanceUserRequest, ListChannelsModeratedByAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listMeetingTagsRequest
     * @return A Java Future containing the result of the ListMeetingTags operation returned by the service.
     * @sample AmazonChimeAsync.ListMeetingTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListMeetingTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMeetingTagsResult> listMeetingTagsAsync(ListMeetingTagsRequest listMeetingTagsRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listMeetingTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMeetingTags operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListMeetingTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListMeetingTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMeetingTagsResult> listMeetingTagsAsync(ListMeetingTagsRequest listMeetingTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMeetingTagsRequest, ListMeetingTagsResult> asyncHandler);

    /**
     * <p>
     * Lists up to 100 active Amazon Chime SDK meetings. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param listMeetingsRequest
     * @return A Java Future containing the result of the ListMeetings operation returned by the service.
     * @sample AmazonChimeAsync.ListMeetings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListMeetings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMeetingsResult> listMeetingsAsync(ListMeetingsRequest listMeetingsRequest);

    /**
     * <p>
     * Lists up to 100 active Amazon Chime SDK meetings. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i> .
     * </p>
     * 
     * @param listMeetingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMeetings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListMeetings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListMeetings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMeetingsResult> listMeetingsAsync(ListMeetingsRequest listMeetingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMeetingsRequest, ListMeetingsResult> asyncHandler);

    /**
     * <p>
     * Lists the phone number orders for the administrator's Amazon Chime account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return A Java Future containing the result of the ListPhoneNumberOrders operation returned by the service.
     * @sample AmazonChimeAsync.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumberOrders" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest);

    /**
     * <p>
     * Lists the phone number orders for the administrator's Amazon Chime account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPhoneNumberOrders operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumberOrders" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumberOrdersResult> listPhoneNumberOrdersAsync(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumberOrdersRequest, ListPhoneNumberOrdersResult> asyncHandler);

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, Amazon Chime Voice Connector,
     * or Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return A Java Future containing the result of the ListPhoneNumbers operation returned by the service.
     * @sample AmazonChimeAsync.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, Amazon Chime Voice Connector,
     * or Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPhoneNumbers operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPhoneNumbersResult> listPhoneNumbersAsync(ListPhoneNumbersRequest listPhoneNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<ListPhoneNumbersRequest, ListPhoneNumbersResult> asyncHandler);

    /**
     * <p>
     * Lists the proxy sessions for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @return A Java Future containing the result of the ListProxySessions operation returned by the service.
     * @sample AmazonChimeAsync.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListProxySessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProxySessionsResult> listProxySessionsAsync(ListProxySessionsRequest listProxySessionsRequest);

    /**
     * <p>
     * Lists the proxy sessions for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listProxySessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProxySessions operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListProxySessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListProxySessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProxySessionsResult> listProxySessionsAsync(ListProxySessionsRequest listProxySessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProxySessionsRequest, ListProxySessionsResult> asyncHandler);

    /**
     * <p>
     * Lists the membership details for the specified room in an Amazon Chime Enterprise account, such as the members'
     * IDs, email addresses, and names.
     * </p>
     * 
     * @param listRoomMembershipsRequest
     * @return A Java Future containing the result of the ListRoomMemberships operation returned by the service.
     * @sample AmazonChimeAsync.ListRoomMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRoomMemberships" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomMembershipsResult> listRoomMembershipsAsync(ListRoomMembershipsRequest listRoomMembershipsRequest);

    /**
     * <p>
     * Lists the membership details for the specified room in an Amazon Chime Enterprise account, such as the members'
     * IDs, email addresses, and names.
     * </p>
     * 
     * @param listRoomMembershipsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoomMemberships operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListRoomMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRoomMemberships" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomMembershipsResult> listRoomMembershipsAsync(ListRoomMembershipsRequest listRoomMembershipsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoomMembershipsRequest, ListRoomMembershipsResult> asyncHandler);

    /**
     * <p>
     * Lists the room details for the specified Amazon Chime Enterprise account. Optionally, filter the results by a
     * member ID (user ID or bot ID) to see a list of rooms that the member belongs to.
     * </p>
     * 
     * @param listRoomsRequest
     * @return A Java Future containing the result of the ListRooms operation returned by the service.
     * @sample AmazonChimeAsync.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest listRoomsRequest);

    /**
     * <p>
     * Lists the room details for the specified Amazon Chime Enterprise account. Optionally, filter the results by a
     * member ID (user ID or bot ID) to see a list of rooms that the member belongs to.
     * </p>
     * 
     * @param listRoomsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRooms operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest listRoomsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoomsRequest, ListRoomsResult> asyncHandler);

    /**
     * <p>
     * Lists the SIP media applications under the administrator's AWS account.
     * </p>
     * 
     * @param listSipMediaApplicationsRequest
     * @return A Java Future containing the result of the ListSipMediaApplications operation returned by the service.
     * @sample AmazonChimeAsync.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListSipMediaApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSipMediaApplicationsResult> listSipMediaApplicationsAsync(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest);

    /**
     * <p>
     * Lists the SIP media applications under the administrator's AWS account.
     * </p>
     * 
     * @param listSipMediaApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSipMediaApplications operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListSipMediaApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListSipMediaApplications" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSipMediaApplicationsResult> listSipMediaApplicationsAsync(ListSipMediaApplicationsRequest listSipMediaApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSipMediaApplicationsRequest, ListSipMediaApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists the SIP rules under the administrator's AWS account.
     * </p>
     * 
     * @param listSipRulesRequest
     * @return A Java Future containing the result of the ListSipRules operation returned by the service.
     * @sample AmazonChimeAsync.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListSipRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSipRulesResult> listSipRulesAsync(ListSipRulesRequest listSipRulesRequest);

    /**
     * <p>
     * Lists the SIP rules under the administrator's AWS account.
     * </p>
     * 
     * @param listSipRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSipRules operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListSipRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListSipRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSipRulesResult> listSipRulesAsync(ListSipRulesRequest listSipRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSipRulesRequest, ListSipRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags applied to an Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only
     * the user that the email address belongs to.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonChimeAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only
     * the user that the email address belongs to.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Chime Voice Connector groups for the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @return A Java Future containing the result of the ListVoiceConnectorGroups operation returned by the service.
     * @sample AmazonChimeAsync.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectorGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest);

    /**
     * <p>
     * Lists the Amazon Chime Voice Connector groups for the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceConnectorGroups operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectorGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorGroupsResult> listVoiceConnectorGroupsAsync(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorGroupsRequest, ListVoiceConnectorGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return A Java Future containing the result of the ListVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeAsync.ListVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.ListVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorTerminationCredentialsResult> listVoiceConnectorTerminationCredentialsAsync(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorTerminationCredentialsRequest, ListVoiceConnectorTerminationCredentialsResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return A Java Future containing the result of the ListVoiceConnectors operation returned by the service.
     * @sample AmazonChimeAsync.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(ListVoiceConnectorsRequest listVoiceConnectorsRequest);

    /**
     * <p>
     * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVoiceConnectors operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListVoiceConnectorsResult> listVoiceConnectorsAsync(ListVoiceConnectorsRequest listVoiceConnectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVoiceConnectorsRequest, ListVoiceConnectorsResult> asyncHandler);

    /**
     * <p>
     * Logs out the specified user from all of the devices they are currently logged into.
     * </p>
     * 
     * @param logoutUserRequest
     * @return A Java Future containing the result of the LogoutUser operation returned by the service.
     * @sample AmazonChimeAsync.LogoutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/LogoutUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LogoutUserResult> logoutUserAsync(LogoutUserRequest logoutUserRequest);

    /**
     * <p>
     * Logs out the specified user from all of the devices they are currently logged into.
     * </p>
     * 
     * @param logoutUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LogoutUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.LogoutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/LogoutUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<LogoutUserResult> logoutUserAsync(LogoutUserRequest logoutUserRequest,
            com.amazonaws.handlers.AsyncHandler<LogoutUserRequest, LogoutUserResult> asyncHandler);

    /**
     * <p>
     * Sets the amount of time in days that a given <code>AppInstance</code> retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @return A Java Future containing the result of the PutAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeAsync.PutAppInstanceRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest);

    /**
     * <p>
     * Sets the amount of time in days that a given <code>AppInstance</code> retains data.
     * </p>
     * 
     * @param putAppInstanceRetentionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAppInstanceRetentionSettings operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.PutAppInstanceRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutAppInstanceRetentionSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            PutAppInstanceRetentionSettingsRequest putAppInstanceRetentionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutAppInstanceRetentionSettingsRequest, PutAppInstanceRetentionSettingsResult> asyncHandler);

    /**
     * <p>
     * The data streaming configurations of an <code>AppInstance</code>.
     * </p>
     * 
     * @param putAppInstanceStreamingConfigurationsRequest
     * @return A Java Future containing the result of the PutAppInstanceStreamingConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeAsync.PutAppInstanceStreamingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutAppInstanceStreamingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppInstanceStreamingConfigurationsResult> putAppInstanceStreamingConfigurationsAsync(
            PutAppInstanceStreamingConfigurationsRequest putAppInstanceStreamingConfigurationsRequest);

    /**
     * <p>
     * The data streaming configurations of an <code>AppInstance</code>.
     * </p>
     * 
     * @param putAppInstanceStreamingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAppInstanceStreamingConfigurations operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.PutAppInstanceStreamingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutAppInstanceStreamingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAppInstanceStreamingConfigurationsResult> putAppInstanceStreamingConfigurationsAsync(
            PutAppInstanceStreamingConfigurationsRequest putAppInstanceStreamingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<PutAppInstanceStreamingConfigurationsRequest, PutAppInstanceStreamingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either
     * an HTTPS endpoint or a Lambda function ARN. For more information, see <a>Bot</a>.
     * </p>
     * 
     * @param putEventsConfigurationRequest
     * @return A Java Future containing the result of the PutEventsConfiguration operation returned by the service.
     * @sample AmazonChimeAsync.PutEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutEventsConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEventsConfigurationResult> putEventsConfigurationAsync(PutEventsConfigurationRequest putEventsConfigurationRequest);

    /**
     * <p>
     * Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either
     * an HTTPS endpoint or a Lambda function ARN. For more information, see <a>Bot</a>.
     * </p>
     * 
     * @param putEventsConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEventsConfiguration operation returned by the service.
     * @sample AmazonChimeAsyncHandler.PutEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutEventsConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutEventsConfigurationResult> putEventsConfigurationAsync(PutEventsConfigurationRequest putEventsConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventsConfigurationRequest, PutEventsConfigurationResult> asyncHandler);

    /**
     * <p>
     * Puts retention settings for the specified Amazon Chime Enterprise account. We recommend using AWS CloudTrail to
     * monitor usage of this API for your account. For more information, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/cloudtrail.html">Logging Amazon Chime API Calls with AWS
     * CloudTrail</a> in the <i>Amazon Chime Administration Guide</i> .
     * </p>
     * <p>
     * To turn off existing retention settings, remove the number of days from the corresponding <b>RetentionDays</b>
     * field in the <b>RetentionSettings</b> object. For more information about retention settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html">Managing Chat Retention Policies</a> in
     * the <i>Amazon Chime Administration Guide</i> .
     * </p>
     * 
     * @param putRetentionSettingsRequest
     * @return A Java Future containing the result of the PutRetentionSettings operation returned by the service.
     * @sample AmazonChimeAsync.PutRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutRetentionSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionSettingsResult> putRetentionSettingsAsync(PutRetentionSettingsRequest putRetentionSettingsRequest);

    /**
     * <p>
     * Puts retention settings for the specified Amazon Chime Enterprise account. We recommend using AWS CloudTrail to
     * monitor usage of this API for your account. For more information, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/cloudtrail.html">Logging Amazon Chime API Calls with AWS
     * CloudTrail</a> in the <i>Amazon Chime Administration Guide</i> .
     * </p>
     * <p>
     * To turn off existing retention settings, remove the number of days from the corresponding <b>RetentionDays</b>
     * field in the <b>RetentionSettings</b> object. For more information about retention settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/chat-retention.html">Managing Chat Retention Policies</a> in
     * the <i>Amazon Chime Administration Guide</i> .
     * </p>
     * 
     * @param putRetentionSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRetentionSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.PutRetentionSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutRetentionSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRetentionSettingsResult> putRetentionSettingsAsync(PutRetentionSettingsRequest putRetentionSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutRetentionSettingsRequest, PutRetentionSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param putSipMediaApplicationLoggingConfigurationRequest
     * @return A Java Future containing the result of the PutSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeAsync.PutSipMediaApplicationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSipMediaApplicationLoggingConfigurationResult> putSipMediaApplicationLoggingConfigurationAsync(
            PutSipMediaApplicationLoggingConfigurationRequest putSipMediaApplicationLoggingConfigurationRequest);

    /**
     * <p>
     * Updates the logging configuration for the specified SIP media application.
     * </p>
     * 
     * @param putSipMediaApplicationLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSipMediaApplicationLoggingConfiguration operation returned
     *         by the service.
     * @sample AmazonChimeAsyncHandler.PutSipMediaApplicationLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutSipMediaApplicationLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutSipMediaApplicationLoggingConfigurationResult> putSipMediaApplicationLoggingConfigurationAsync(
            PutSipMediaApplicationLoggingConfigurationRequest putSipMediaApplicationLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutSipMediaApplicationLoggingConfigurationRequest, PutSipMediaApplicationLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Puts emergency calling configuration details to the specified Amazon Chime Voice Connector, such as emergency
     * phone numbers and calling countries. Origination and termination settings must be enabled for the Amazon Chime
     * Voice Connector before emergency calling can be configured.
     * </p>
     * 
     * @param putVoiceConnectorEmergencyCallingConfigurationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeAsync.PutVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorEmergencyCallingConfigurationResult> putVoiceConnectorEmergencyCallingConfigurationAsync(
            PutVoiceConnectorEmergencyCallingConfigurationRequest putVoiceConnectorEmergencyCallingConfigurationRequest);

    /**
     * <p>
     * Puts emergency calling configuration details to the specified Amazon Chime Voice Connector, such as emergency
     * phone numbers and calling countries. Origination and termination settings must be enabled for the Amazon Chime
     * Voice Connector before emergency calling can be configured.
     * </p>
     * 
     * @param putVoiceConnectorEmergencyCallingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorEmergencyCallingConfiguration operation
     *         returned by the service.
     * @sample AmazonChimeAsyncHandler.PutVoiceConnectorEmergencyCallingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorEmergencyCallingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorEmergencyCallingConfigurationResult> putVoiceConnectorEmergencyCallingConfigurationAsync(
            PutVoiceConnectorEmergencyCallingConfigurationRequest putVoiceConnectorEmergencyCallingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorEmergencyCallingConfigurationRequest, PutVoiceConnectorEmergencyCallingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies
     * whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsync.PutVoiceConnectorLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies
     * whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorLoggingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.PutVoiceConnectorLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorLoggingConfigurationResult> putVoiceConnectorLoggingConfigurationAsync(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorLoggingConfigurationRequest, PutVoiceConnectorLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to turning off
     * origination settings.
     * </p>
     * </note>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeAsync.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(
            PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Adds origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to turning off
     * origination settings.
     * </p>
     * </note>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorOrigination operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorOriginationResult> putVoiceConnectorOriginationAsync(
            PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorOriginationRequest, PutVoiceConnectorOriginationResult> asyncHandler);

    /**
     * <p>
     * Puts the specified proxy configuration to the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @return A Java Future containing the result of the PutVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeAsync.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorProxy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorProxyResult> putVoiceConnectorProxyAsync(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest);

    /**
     * <p>
     * Puts the specified proxy configuration to the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorProxyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorProxy operation returned by the service.
     * @sample AmazonChimeAsyncHandler.PutVoiceConnectorProxy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorProxy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorProxyResult> putVoiceConnectorProxyAsync(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorProxyRequest, PutVoiceConnectorProxyResult> asyncHandler);

    /**
     * <p>
     * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration
     * specifies whether media streaming is enabled for sending to Indonesians. It also sets the retention period, in
     * hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsync.PutVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration
     * specifies whether media streaming is enabled for sending to Indonesians. It also sets the retention period, in
     * hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorStreamingConfiguration operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.PutVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorStreamingConfigurationResult> putVoiceConnectorStreamingConfigurationAsync(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorStreamingConfigurationRequest, PutVoiceConnectorStreamingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to turning off
     * termination settings.
     * </p>
     * </note>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return A Java Future containing the result of the PutVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeAsync.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(
            PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Adds termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * <note>
     * <p>
     * If emergency calling is configured for the Amazon Chime Voice Connector, it must be deleted prior to turning off
     * termination settings.
     * </p>
     * </note>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorTermination operation returned by the
     *         service.
     * @sample AmazonChimeAsyncHandler.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationResult> putVoiceConnectorTerminationAsync(
            PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationRequest, PutVoiceConnectorTerminationResult> asyncHandler);

    /**
     * <p>
     * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @return A Java Future containing the result of the PutVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeAsync.PutVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutVoiceConnectorTerminationCredentials operation returned by
     *         the service.
     * @sample AmazonChimeAsyncHandler.PutVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutVoiceConnectorTerminationCredentialsResult> putVoiceConnectorTerminationCredentialsAsync(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<PutVoiceConnectorTerminationCredentialsRequest, PutVoiceConnectorTerminationCredentialsResult> asyncHandler);

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
     * @sample AmazonChimeAsync.RedactChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RedactChannelMessage" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.RedactChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RedactChannelMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RedactChannelMessageResult> redactChannelMessageAsync(RedactChannelMessageRequest redactChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<RedactChannelMessageRequest, RedactChannelMessageResult> asyncHandler);

    /**
     * <p>
     * Redacts the specified message from the specified Amazon Chime conversation.
     * </p>
     * 
     * @param redactConversationMessageRequest
     * @return A Java Future containing the result of the RedactConversationMessage operation returned by the service.
     * @sample AmazonChimeAsync.RedactConversationMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RedactConversationMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RedactConversationMessageResult> redactConversationMessageAsync(
            RedactConversationMessageRequest redactConversationMessageRequest);

    /**
     * <p>
     * Redacts the specified message from the specified Amazon Chime conversation.
     * </p>
     * 
     * @param redactConversationMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RedactConversationMessage operation returned by the service.
     * @sample AmazonChimeAsyncHandler.RedactConversationMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RedactConversationMessage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RedactConversationMessageResult> redactConversationMessageAsync(
            RedactConversationMessageRequest redactConversationMessageRequest,
            com.amazonaws.handlers.AsyncHandler<RedactConversationMessageRequest, RedactConversationMessageResult> asyncHandler);

    /**
     * <p>
     * Redacts the specified message from the specified Amazon Chime channel.
     * </p>
     * 
     * @param redactRoomMessageRequest
     * @return A Java Future containing the result of the RedactRoomMessage operation returned by the service.
     * @sample AmazonChimeAsync.RedactRoomMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RedactRoomMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RedactRoomMessageResult> redactRoomMessageAsync(RedactRoomMessageRequest redactRoomMessageRequest);

    /**
     * <p>
     * Redacts the specified message from the specified Amazon Chime channel.
     * </p>
     * 
     * @param redactRoomMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RedactRoomMessage operation returned by the service.
     * @sample AmazonChimeAsyncHandler.RedactRoomMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RedactRoomMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RedactRoomMessageResult> redactRoomMessageAsync(RedactRoomMessageRequest redactRoomMessageRequest,
            com.amazonaws.handlers.AsyncHandler<RedactRoomMessageRequest, RedactRoomMessageResult> asyncHandler);

    /**
     * <p>
     * Regenerates the security token for a bot.
     * </p>
     * 
     * @param regenerateSecurityTokenRequest
     * @return A Java Future containing the result of the RegenerateSecurityToken operation returned by the service.
     * @sample AmazonChimeAsync.RegenerateSecurityToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RegenerateSecurityToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegenerateSecurityTokenResult> regenerateSecurityTokenAsync(RegenerateSecurityTokenRequest regenerateSecurityTokenRequest);

    /**
     * <p>
     * Regenerates the security token for a bot.
     * </p>
     * 
     * @param regenerateSecurityTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegenerateSecurityToken operation returned by the service.
     * @sample AmazonChimeAsyncHandler.RegenerateSecurityToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RegenerateSecurityToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegenerateSecurityTokenResult> regenerateSecurityTokenAsync(RegenerateSecurityTokenRequest regenerateSecurityTokenRequest,
            com.amazonaws.handlers.AsyncHandler<RegenerateSecurityTokenRequest, RegenerateSecurityTokenResult> asyncHandler);

    /**
     * <p>
     * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the <a>User</a> object
     * with the updated personal meeting PIN.
     * </p>
     * 
     * @param resetPersonalPINRequest
     * @return A Java Future containing the result of the ResetPersonalPIN operation returned by the service.
     * @sample AmazonChimeAsync.ResetPersonalPIN
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ResetPersonalPIN" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetPersonalPINResult> resetPersonalPINAsync(ResetPersonalPINRequest resetPersonalPINRequest);

    /**
     * <p>
     * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the <a>User</a> object
     * with the updated personal meeting PIN.
     * </p>
     * 
     * @param resetPersonalPINRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResetPersonalPIN operation returned by the service.
     * @sample AmazonChimeAsyncHandler.ResetPersonalPIN
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ResetPersonalPIN" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResetPersonalPINResult> resetPersonalPINAsync(ResetPersonalPINRequest resetPersonalPINRequest,
            com.amazonaws.handlers.AsyncHandler<ResetPersonalPINRequest, ResetPersonalPINResult> asyncHandler);

    /**
     * <p>
     * Moves a phone number from the <b>Deletion queue</b> back into the phone number <b>Inventory</b>.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return A Java Future containing the result of the RestorePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsync.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RestorePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(RestorePhoneNumberRequest restorePhoneNumberRequest);

    /**
     * <p>
     * Moves a phone number from the <b>Deletion queue</b> back into the phone number <b>Inventory</b>.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestorePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsyncHandler.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RestorePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestorePhoneNumberResult> restorePhoneNumberAsync(RestorePhoneNumberRequest restorePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<RestorePhoneNumberRequest, RestorePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Searches phone numbers that can be ordered.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @sample AmazonChimeAsync.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
     * <p>
     * Searches phone numbers that can be ordered.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @sample AmazonChimeAsyncHandler.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchAvailablePhoneNumbersResult> searchAvailablePhoneNumbersAsync(
            SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest,
            com.amazonaws.handlers.AsyncHandler<SearchAvailablePhoneNumbersRequest, SearchAvailablePhoneNumbersResult> asyncHandler);

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
     * @sample AmazonChimeAsync.SendChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SendChannelMessage" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.SendChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SendChannelMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendChannelMessageResult> sendChannelMessageAsync(SendChannelMessageRequest sendChannelMessageRequest,
            com.amazonaws.handlers.AsyncHandler<SendChannelMessageRequest, SendChannelMessageResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param tagAttendeeRequest
     * @return A Java Future containing the result of the TagAttendee operation returned by the service.
     * @sample AmazonChimeAsync.TagAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/TagAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagAttendeeResult> tagAttendeeAsync(TagAttendeeRequest tagAttendeeRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param tagAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagAttendee operation returned by the service.
     * @sample AmazonChimeAsyncHandler.TagAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/TagAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagAttendeeResult> tagAttendeeAsync(TagAttendeeRequest tagAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<TagAttendeeRequest, TagAttendeeResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param tagMeetingRequest
     * @return A Java Future containing the result of the TagMeeting operation returned by the service.
     * @sample AmazonChimeAsync.TagMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/TagMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagMeetingResult> tagMeetingAsync(TagMeetingRequest tagMeetingRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param tagMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagMeeting operation returned by the service.
     * @sample AmazonChimeAsyncHandler.TagMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/TagMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagMeetingResult> tagMeetingAsync(TagMeetingRequest tagMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<TagMeetingRequest, TagMeetingResult> asyncHandler);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Applies the specified tags to the specified Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonChimeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param untagAttendeeRequest
     * @return A Java Future containing the result of the UntagAttendee operation returned by the service.
     * @sample AmazonChimeAsync.UntagAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UntagAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagAttendeeResult> untagAttendeeAsync(UntagAttendeeRequest untagAttendeeRequest);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK attendee.
     * </p>
     * 
     * @param untagAttendeeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagAttendee operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UntagAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UntagAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagAttendeeResult> untagAttendeeAsync(UntagAttendeeRequest untagAttendeeRequest,
            com.amazonaws.handlers.AsyncHandler<UntagAttendeeRequest, UntagAttendeeResult> asyncHandler);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param untagMeetingRequest
     * @return A Java Future containing the result of the UntagMeeting operation returned by the service.
     * @sample AmazonChimeAsync.UntagMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UntagMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagMeetingResult> untagMeetingAsync(UntagMeetingRequest untagMeetingRequest);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK meeting.
     * </p>
     * 
     * @param untagMeetingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagMeeting operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UntagMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UntagMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagMeetingResult> untagMeetingAsync(UntagMeetingRequest untagMeetingRequest,
            com.amazonaws.handlers.AsyncHandler<UntagMeetingRequest, UntagMeetingResult> asyncHandler);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untags the specified tags from the specified Amazon Chime SDK meeting resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates account details for the specified Amazon Chime account. Currently, only account name updates are
     * supported for this action.
     * </p>
     * 
     * @param updateAccountRequest
     * @return A Java Future containing the result of the UpdateAccount operation returned by the service.
     * @sample AmazonChimeAsync.UpdateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest updateAccountRequest);

    /**
     * <p>
     * Updates account details for the specified Amazon Chime account. Currently, only account name updates are
     * supported for this action.
     * </p>
     * 
     * @param updateAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccount operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest updateAccountRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared
     * screens, or for the dial-out option. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AmazonChimeAsync.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared
     * screens, or for the dial-out option. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccountSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest updateAccountSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @return A Java Future containing the result of the UpdateAppInstance operation returned by the service.
     * @sample AmazonChimeAsync.UpdateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(UpdateAppInstanceRequest updateAppInstanceRequest);

    /**
     * <p>
     * Updates <code>AppInstance</code> metadata.
     * </p>
     * 
     * @param updateAppInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppInstance operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateAppInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAppInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(UpdateAppInstanceRequest updateAppInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceRequest, UpdateAppInstanceResult> asyncHandler);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUser</code>. You can update names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @return A Java Future containing the result of the UpdateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsync.UpdateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(UpdateAppInstanceUserRequest updateAppInstanceUserRequest);

    /**
     * <p>
     * Updates the details of an <code>AppInstanceUser</code>. You can update names and metadata.
     * </p>
     * 
     * @param updateAppInstanceUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAppInstanceUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateAppInstanceUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAppInstanceUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(UpdateAppInstanceUserRequest updateAppInstanceUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceUserRequest, UpdateAppInstanceUserResult> asyncHandler);

    /**
     * <p>
     * Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime
     * Enterprise account.
     * </p>
     * 
     * @param updateBotRequest
     * @return A Java Future containing the result of the UpdateBot operation returned by the service.
     * @sample AmazonChimeAsync.UpdateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotResult> updateBotAsync(UpdateBotRequest updateBotRequest);

    /**
     * <p>
     * Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime
     * Enterprise account.
     * </p>
     * 
     * @param updateBotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBot operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateBot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBotResult> updateBotAsync(UpdateBotRequest updateBotRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBotRequest, UpdateBotResult> asyncHandler);

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
     * @sample AmazonChimeAsync.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.UpdateChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelResult> updateChannelAsync(UpdateChannelRequest updateChannelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelRequest, UpdateChannelResult> asyncHandler);

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
     * @sample AmazonChimeAsync.UpdateChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateChannelMessage" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.UpdateChannelMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateChannelMessage" target="_top">AWS API
     *      Documentation</a>
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
     * @sample AmazonChimeAsync.UpdateChannelReadMarker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateChannelReadMarker" target="_top">AWS
     *      API Documentation</a>
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
     * @sample AmazonChimeAsyncHandler.UpdateChannelReadMarker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateChannelReadMarker" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateChannelReadMarkerResult> updateChannelReadMarkerAsync(UpdateChannelReadMarkerRequest updateChannelReadMarkerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateChannelReadMarkerRequest, UpdateChannelReadMarkerResult> asyncHandler);

    /**
     * <p>
     * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return A Java Future containing the result of the UpdateGlobalSettings operation returned by the service.
     * @sample AmazonChimeAsync.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

    /**
     * <p>
     * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGlobalSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGlobalSettingsResult> updateGlobalSettingsAsync(UpdateGlobalSettingsRequest updateGlobalSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGlobalSettingsRequest, UpdateGlobalSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates phone number details, such as product type or calling name, for the specified phone number ID. You can
     * update one phone number detail at a time. For example, you can update either the product type or the calling name
     * in one action.
     * </p>
     * <p>
     * For toll-free numbers, you must use the Amazon Chime Voice Connector product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names
     * must be complete before you can request another update.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsync.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
     * <p>
     * Updates phone number details, such as product type or calling name, for the specified phone number ID. You can
     * update one phone number detail at a time. For example, you can update either the product type or the calling name
     * in one action.
     * </p>
     * <p>
     * For toll-free numbers, you must use the Amazon Chime Voice Connector product type.
     * </p>
     * <p>
     * Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names
     * must be complete before you can request another update.
     * </p>
     * 
     * @param updatePhoneNumberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePhoneNumber operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberResult> updatePhoneNumberAsync(UpdatePhoneNumberRequest updatePhoneNumberRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberRequest, UpdatePhoneNumberResult> asyncHandler);

    /**
     * <p>
     * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name.
     * You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72
     * hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @return A Java Future containing the result of the UpdatePhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeAsync.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(
            UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest);

    /**
     * <p>
     * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name.
     * You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72
     * hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePhoneNumberSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePhoneNumberSettingsResult> updatePhoneNumberSettingsAsync(
            UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePhoneNumberSettingsRequest, UpdatePhoneNumberSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates the specified proxy session details, such as voice or SMS capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @return A Java Future containing the result of the UpdateProxySession operation returned by the service.
     * @sample AmazonChimeAsync.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProxySessionResult> updateProxySessionAsync(UpdateProxySessionRequest updateProxySessionRequest);

    /**
     * <p>
     * Updates the specified proxy session details, such as voice or SMS capabilities.
     * </p>
     * 
     * @param updateProxySessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProxySession operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateProxySession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateProxySession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateProxySessionResult> updateProxySessionAsync(UpdateProxySessionRequest updateProxySessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProxySessionRequest, UpdateProxySessionResult> asyncHandler);

    /**
     * <p>
     * Updates room details, such as the room name, for a room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param updateRoomRequest
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonChimeAsync.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest);

    /**
     * <p>
     * Updates room details, such as the room name, for a room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param updateRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoomRequest, UpdateRoomResult> asyncHandler);

    /**
     * <p>
     * Updates room membership details, such as the member role, for a room in an Amazon Chime Enterprise account. The
     * member role designates whether the member is a chat room administrator or a general chat room member. The member
     * role can be updated only for user IDs.
     * </p>
     * 
     * @param updateRoomMembershipRequest
     * @return A Java Future containing the result of the UpdateRoomMembership operation returned by the service.
     * @sample AmazonChimeAsync.UpdateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomMembershipResult> updateRoomMembershipAsync(UpdateRoomMembershipRequest updateRoomMembershipRequest);

    /**
     * <p>
     * Updates room membership details, such as the member role, for a room in an Amazon Chime Enterprise account. The
     * member role designates whether the member is a chat room administrator or a general chat room member. The member
     * role can be updated only for user IDs.
     * </p>
     * 
     * @param updateRoomMembershipRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoomMembership operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomMembershipResult> updateRoomMembershipAsync(UpdateRoomMembershipRequest updateRoomMembershipRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoomMembershipRequest, UpdateRoomMembershipResult> asyncHandler);

    /**
     * <p>
     * Updates the details of the specified SIP media application.
     * </p>
     * 
     * @param updateSipMediaApplicationRequest
     * @return A Java Future containing the result of the UpdateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsync.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipMediaApplicationResult> updateSipMediaApplicationAsync(
            UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest);

    /**
     * <p>
     * Updates the details of the specified SIP media application.
     * </p>
     * 
     * @param updateSipMediaApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSipMediaApplication operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateSipMediaApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateSipMediaApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipMediaApplicationResult> updateSipMediaApplicationAsync(
            UpdateSipMediaApplicationRequest updateSipMediaApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSipMediaApplicationRequest, UpdateSipMediaApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates the details of the specified SIP rule.
     * </p>
     * 
     * @param updateSipRuleRequest
     * @return A Java Future containing the result of the UpdateSipRule operation returned by the service.
     * @sample AmazonChimeAsync.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipRuleResult> updateSipRuleAsync(UpdateSipRuleRequest updateSipRuleRequest);

    /**
     * <p>
     * Updates the details of the specified SIP rule.
     * </p>
     * 
     * @param updateSipRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSipRule operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateSipRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateSipRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSipRuleResult> updateSipRuleAsync(UpdateSipRuleRequest updateSipRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSipRuleRequest, UpdateSipRuleResult> asyncHandler);

    /**
     * <p>
     * Updates user details for a specified user ID. Currently, only <code>LicenseType</code> updates are supported for
     * this action.
     * </p>
     * 
     * @param updateUserRequest
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonChimeAsync.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Updates user details for a specified user ID. Currently, only <code>LicenseType</code> updates are supported for
     * this action.
     * </p>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUser operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for the specified user, such as phone number settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @return A Java Future containing the result of the UpdateUserSettings operation returned by the service.
     * @sample AmazonChimeAsync.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserSettingsResult> updateUserSettingsAsync(UpdateUserSettingsRequest updateUserSettingsRequest);

    /**
     * <p>
     * Updates the settings for the specified user, such as phone number settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserSettings operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserSettingsResult> updateUserSettingsAsync(UpdateUserSettingsRequest updateUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserSettingsRequest, UpdateUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return A Java Future containing the result of the UpdateVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsync.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(UpdateVoiceConnectorRequest updateVoiceConnectorRequest);

    /**
     * <p>
     * Updates details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceConnector operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorResult> updateVoiceConnectorAsync(UpdateVoiceConnectorRequest updateVoiceConnectorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorRequest, UpdateVoiceConnectorResult> asyncHandler);

    /**
     * <p>
     * Updates details of the specified Amazon Chime Voice Connector group, such as the name and Amazon Chime Voice
     * Connector priority ranking.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @return A Java Future containing the result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsync.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(
            UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest);

    /**
     * <p>
     * Updates details of the specified Amazon Chime Voice Connector group, such as the name and Amazon Chime Voice
     * Connector priority ranking.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @sample AmazonChimeAsyncHandler.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateVoiceConnectorGroupResult> updateVoiceConnectorGroupAsync(
            UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVoiceConnectorGroupRequest, UpdateVoiceConnectorGroupResult> asyncHandler);

}
