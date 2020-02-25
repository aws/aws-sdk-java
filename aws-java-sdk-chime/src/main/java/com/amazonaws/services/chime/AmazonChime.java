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
package com.amazonaws.services.chime;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.chime.model.*;

/**
 * Interface for accessing Amazon Chime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.chime.AbstractAmazonChime} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Chime API (application programming interface) is designed for developers to perform key tasks, such as
 * creating and managing Amazon Chime accounts, users, and Voice Connectors. This guide provides detailed information
 * about the Amazon Chime API, including operations, types, inputs and outputs, and error codes. It also includes some
 * server-side API actions to use with the Amazon Chime SDK. For more information about the Amazon Chime SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the <i>Amazon
 * Chime Developer Guide</i>.
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
 * <dt>Using REST API</dt>
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
public interface AmazonChime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "chime";

    /**
     * <p>
     * Associates a phone number with the specified Amazon Chime user.
     * </p>
     * 
     * @param associatePhoneNumberWithUserRequest
     * @return Result of the AssociatePhoneNumberWithUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.AssociatePhoneNumberWithUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumberWithUser"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumberWithUserResult associatePhoneNumberWithUser(AssociatePhoneNumberWithUserRequest associatePhoneNumberWithUserRequest);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.AssociatePhoneNumbersWithVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumbersWithVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumbersWithVoiceConnectorResult associatePhoneNumbersWithVoiceConnector(
            AssociatePhoneNumbersWithVoiceConnectorRequest associatePhoneNumbersWithVoiceConnectorRequest);

    /**
     * <p>
     * Associates phone numbers with the specified Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param associatePhoneNumbersWithVoiceConnectorGroupRequest
     * @return Result of the AssociatePhoneNumbersWithVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.AssociatePhoneNumbersWithVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociatePhoneNumbersWithVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    AssociatePhoneNumbersWithVoiceConnectorGroupResult associatePhoneNumbersWithVoiceConnectorGroup(
            AssociatePhoneNumbersWithVoiceConnectorGroupRequest associatePhoneNumbersWithVoiceConnectorGroupRequest);

    /**
     * <p>
     * Associates the specified sign-in delegate groups with the specified Amazon Chime account.
     * </p>
     * 
     * @param associateSigninDelegateGroupsWithAccountRequest
     * @return Result of the AssociateSigninDelegateGroupsWithAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.AssociateSigninDelegateGroupsWithAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AssociateSigninDelegateGroupsWithAccount"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateSigninDelegateGroupsWithAccountResult associateSigninDelegateGroupsWithAccount(
            AssociateSigninDelegateGroupsWithAccountRequest associateSigninDelegateGroupsWithAccountRequest);

    /**
     * <p>
     * Creates up to 100 new attendees for an active Amazon Chime SDK meeting. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param batchCreateAttendeeRequest
     * @return Result of the BatchCreateAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchCreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    BatchCreateAttendeeResult batchCreateAttendee(BatchCreateAttendeeRequest batchCreateAttendeeRequest);

    /**
     * <p>
     * Adds up to 50 members to a chat room in an Amazon Chime Enterprise account. Members can be either users or bots.
     * The member role designates whether the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param batchCreateRoomMembershipRequest
     * @return Result of the BatchCreateRoomMembership operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchCreateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchCreateRoomMembership"
     *      target="_top">AWS API Documentation</a>
     */
    BatchCreateRoomMembershipResult batchCreateRoomMembership(BatchCreateRoomMembershipRequest batchCreateRoomMembershipRequest);

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
     * @return Result of the BatchDeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchDeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchDeletePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDeletePhoneNumberResult batchDeletePhoneNumber(BatchDeletePhoneNumberRequest batchDeletePhoneNumberRequest);

    /**
     * <p>
     * Suspends up to 50 users from a <code>Team</code> or <code>EnterpriseLWA</code> Amazon Chime account. For more
     * information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * <p>
     * Users suspended from a <code>Team</code> account are disassociated from the account, but they can continue to use
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
     * @return Result of the BatchSuspendUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchSuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchSuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    BatchSuspendUserResult batchSuspendUser(BatchSuspendUserRequest batchSuspendUserRequest);

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
     * @return Result of the BatchUnsuspendUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchUnsuspendUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUnsuspendUser" target="_top">AWS API
     *      Documentation</a>
     */
    BatchUnsuspendUserResult batchUnsuspendUser(BatchUnsuspendUserRequest batchUnsuspendUserRequest);

    /**
     * <p>
     * Updates phone number product types or calling names. You can update one attribute at a time for each
     * <code>UpdatePhoneNumberRequestItem</code>. For example, you can update either the product type or the calling
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
     * @return Result of the BatchUpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchUpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdatePhoneNumber" target="_top">AWS
     *      API Documentation</a>
     */
    BatchUpdatePhoneNumberResult batchUpdatePhoneNumber(BatchUpdatePhoneNumberRequest batchUpdatePhoneNumberRequest);

    /**
     * <p>
     * Updates user details within the <a>UpdateUserRequestItem</a> object for up to 20 users for the specified Amazon
     * Chime account. Currently, only <code>LicenseType</code> updates are supported for this action.
     * </p>
     * 
     * @param batchUpdateUserRequest
     * @return Result of the BatchUpdateUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.BatchUpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchUpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    BatchUpdateUserResult batchUpdateUser(BatchUpdateUserRequest batchUpdateUserRequest);

    /**
     * <p>
     * Creates an Amazon Chime account under the administrator's AWS account. Only <code>Team</code> account types are
     * currently supported for this action. For more information about different account types, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/manage-chime-account.html">Managing Your Amazon Chime
     * Accounts</a> in the <i>Amazon Chime Administration Guide</i>.
     * </p>
     * 
     * @param createAccountRequest
     * @return Result of the CreateAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAccountResult createAccount(CreateAccountRequest createAccountRequest);

    /**
     * <p>
     * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createAttendeeRequest
     * @return Result of the CreateAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAttendeeResult createAttendee(CreateAttendeeRequest createAttendeeRequest);

    /**
     * <p>
     * Creates a bot for an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createBotRequest
     * @return Result of the CreateBot operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @sample AmazonChime.CreateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateBot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBotResult createBot(CreateBotRequest createBotRequest);

    /**
     * <p>
     * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more
     * information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param createMeetingRequest
     * @return Result of the CreateMeeting operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMeetingResult createMeeting(CreateMeetingRequest createMeetingRequest);

    /**
     * <p>
     * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime
     * Voice Connector product types. For toll-free numbers, you must use the Amazon Chime Voice Connector product type.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return Result of the CreatePhoneNumberOrder operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreatePhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreatePhoneNumberOrder" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePhoneNumberOrderResult createPhoneNumberOrder(CreatePhoneNumberOrderRequest createPhoneNumberOrderRequest);

    /**
     * <p>
     * Creates a chat room for the specified Amazon Chime Enterprise account.
     * </p>
     * 
     * @param createRoomRequest
     * @return Result of the CreateRoom operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
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
     * @sample AmazonChime.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRoomResult createRoom(CreateRoomRequest createRoomRequest);

    /**
     * <p>
     * Adds a member to a chat room in an Amazon Chime Enterprise account. A member can be either a user or a bot. The
     * member role designates whether the member is a chat room administrator or a general chat room member.
     * </p>
     * 
     * @param createRoomMembershipRequest
     * @return Result of the CreateRoomMembership operation returned by the service.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRoomMembershipResult createRoomMembership(CreateRoomMembershipRequest createRoomMembershipRequest);

    /**
     * <p>
     * Creates a user under the specified Amazon Chime account.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

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
     * @return Result of the CreateVoiceConnector operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    CreateVoiceConnectorResult createVoiceConnector(CreateVoiceConnectorRequest createVoiceConnectorRequest);

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
     * @return Result of the CreateVoiceConnectorGroup operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.CreateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVoiceConnectorGroupResult createVoiceConnectorGroup(CreateVoiceConnectorGroupRequest createVoiceConnectorGroupRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime account. You must suspend all users before deleting a <code>Team</code>
     * account. You can use the <a>BatchSuspendUser</a> action to do so.
     * </p>
     * <p>
     * For <code>EnterpriseLWA</code> and <code>EnterpriseAD</code> accounts, you must release the claimed domains for
     * your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are
     * suspended.
     * </p>
     * <p>
     * Deleted accounts appear in your <code>Disabled</code> accounts list for 90 days. To restore a deleted account
     * from your <code>Disabled</code> accounts list, you must contact AWS Support.
     * </p>
     * <p>
     * After 90 days, deleted accounts are permanently removed from your <code>Disabled</code> accounts list.
     * </p>
     * 
     * @param deleteAccountRequest
     * @return Result of the DeleteAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnprocessableEntityException
     *         The request was well-formed but was unable to be followed due to semantic errors.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAccount" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAccountResult deleteAccount(DeleteAccountRequest deleteAccountRequest);

    /**
     * <p>
     * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their <code>JoinToken</code>.
     * Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the
     * Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon
     * Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteAttendeeRequest
     * @return Result of the DeleteAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAttendeeResult deleteAttendee(DeleteAttendeeRequest deleteAttendeeRequest);

    /**
     * <p>
     * Deletes the events configuration that allows a bot to receive outgoing events.
     * </p>
     * 
     * @param deleteEventsConfigurationRequest
     * @return Result of the DeleteEventsConfiguration operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @sample AmazonChime.DeleteEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteEventsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventsConfigurationResult deleteEventsConfiguration(DeleteEventsConfigurationRequest deleteEventsConfigurationRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime SDK meeting. When a meeting is deleted, its attendees are also deleted and
     * clients can no longer join it. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param deleteMeetingRequest
     * @return Result of the DeleteMeeting operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMeetingResult deleteMeeting(DeleteMeetingRequest deleteMeetingRequest);

    /**
     * <p>
     * Moves the specified phone number into the <b>Deletion queue</b>. A phone number must be disassociated from any
     * users or Amazon Chime Voice Connectors before it can be deleted.
     * </p>
     * <p>
     * Deleted phone numbers remain in the <b>Deletion queue</b> for 7 days before they are deleted permanently.
     * </p>
     * 
     * @param deletePhoneNumberRequest
     * @return Result of the DeletePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeletePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeletePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePhoneNumberResult deletePhoneNumber(DeletePhoneNumberRequest deletePhoneNumberRequest);

    /**
     * <p>
     * Deletes a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return Result of the DeleteRoom operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
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
     * @sample AmazonChime.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRoomResult deleteRoom(DeleteRoomRequest deleteRoomRequest);

    /**
     * <p>
     * Removes a member from a chat room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param deleteRoomMembershipRequest
     * @return Result of the DeleteRoomMembership operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRoomMembershipResult deleteRoomMembership(DeleteRoomMembershipRequest deleteRoomMembershipRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector. Any phone numbers associated with the Amazon Chime Voice
     * Connector must be disassociated from it before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorRequest
     * @return Result of the DeleteVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteVoiceConnectorResult deleteVoiceConnector(DeleteVoiceConnectorRequest deleteVoiceConnectorRequest);

    /**
     * <p>
     * Deletes the specified Amazon Chime Voice Connector group. Any <code>VoiceConnectorItems</code> and phone numbers
     * associated with the group must be removed before it can be deleted.
     * </p>
     * 
     * @param deleteVoiceConnectorGroupRequest
     * @return Result of the DeleteVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorGroupResult deleteVoiceConnectorGroup(DeleteVoiceConnectorGroupRequest deleteVoiceConnectorGroupRequest);

    /**
     * <p>
     * Deletes the origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorOriginationRequest
     * @return Result of the DeleteVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorOriginationResult deleteVoiceConnectorOrigination(DeleteVoiceConnectorOriginationRequest deleteVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Deletes the streaming configuration for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorStreamingConfigurationRequest
     * @return Result of the DeleteVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorStreamingConfigurationResult deleteVoiceConnectorStreamingConfiguration(
            DeleteVoiceConnectorStreamingConfigurationRequest deleteVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Deletes the termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationRequest
     * @return Result of the DeleteVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorTerminationResult deleteVoiceConnectorTermination(DeleteVoiceConnectorTerminationRequest deleteVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
     * </p>
     * 
     * @param deleteVoiceConnectorTerminationCredentialsRequest
     * @return Result of the DeleteVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DeleteVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DeleteVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVoiceConnectorTerminationCredentialsResult deleteVoiceConnectorTerminationCredentials(
            DeleteVoiceConnectorTerminationCredentialsRequest deleteVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
     * </p>
     * 
     * @param disassociatePhoneNumberFromUserRequest
     * @return Result of the DisassociatePhoneNumberFromUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DisassociatePhoneNumberFromUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumberFromUser"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumberFromUserResult disassociatePhoneNumberFromUser(DisassociatePhoneNumberFromUserRequest disassociatePhoneNumberFromUserRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DisassociatePhoneNumbersFromVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnector"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumbersFromVoiceConnectorResult disassociatePhoneNumbersFromVoiceConnector(
            DisassociatePhoneNumbersFromVoiceConnectorRequest disassociatePhoneNumbersFromVoiceConnectorRequest);

    /**
     * <p>
     * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param disassociatePhoneNumbersFromVoiceConnectorGroupRequest
     * @return Result of the DisassociatePhoneNumbersFromVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DisassociatePhoneNumbersFromVoiceConnectorGroup
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociatePhoneNumbersFromVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociatePhoneNumbersFromVoiceConnectorGroupResult disassociatePhoneNumbersFromVoiceConnectorGroup(
            DisassociatePhoneNumbersFromVoiceConnectorGroupRequest disassociatePhoneNumbersFromVoiceConnectorGroupRequest);

    /**
     * <p>
     * Disassociates the specified sign-in delegate groups from the specified Amazon Chime account.
     * </p>
     * 
     * @param disassociateSigninDelegateGroupsFromAccountRequest
     * @return Result of the DisassociateSigninDelegateGroupsFromAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.DisassociateSigninDelegateGroupsFromAccount
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/DisassociateSigninDelegateGroupsFromAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateSigninDelegateGroupsFromAccountResult disassociateSigninDelegateGroupsFromAccount(
            DisassociateSigninDelegateGroupsFromAccountRequest disassociateSigninDelegateGroupsFromAccountRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
     * </p>
     * 
     * @param getAccountRequest
     * @return Result of the GetAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccount" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountResult getAccount(GetAccountRequest getAccountRequest);

    /**
     * <p>
     * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out
     * settings. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about
     * the Amazon Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the
     * Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getAttendeeRequest
     * @return Result of the GetAttendee operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetAttendee
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetAttendee" target="_top">AWS API
     *      Documentation</a>
     */
    GetAttendeeResult getAttendee(GetAttendeeRequest getAttendeeRequest);

    /**
     * <p>
     * Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.
     * </p>
     * 
     * @param getBotRequest
     * @return Result of the GetBot operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @sample AmazonChime.GetBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetBot" target="_top">AWS API
     *      Documentation</a>
     */
    GetBotResult getBot(GetBotRequest getBotRequest);

    /**
     * <p>
     * Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint
     * or Lambda function ARN.
     * </p>
     * 
     * @param getEventsConfigurationRequest
     * @return Result of the GetEventsConfiguration operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @sample AmazonChime.GetEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetEventsConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetEventsConfigurationResult getEventsConfiguration(GetEventsConfigurationRequest getEventsConfigurationRequest);

    /**
     * <p>
     * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param getGlobalSettingsRequest
     * @return Result of the GetGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetGlobalSettingsResult getGlobalSettings(GetGlobalSettingsRequest getGlobalSettingsRequest);

    /**
     * <p>
     * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon
     * Chime SDK, see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime
     * SDK</a> in the <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param getMeetingRequest
     * @return Result of the GetMeeting operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetMeeting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetMeeting" target="_top">AWS API
     *      Documentation</a>
     */
    GetMeetingResult getMeeting(GetMeetingRequest getMeetingRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
     * </p>
     * 
     * @param getPhoneNumberRequest
     * @return Result of the GetPhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetPhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    GetPhoneNumberResult getPhoneNumber(GetPhoneNumberRequest getPhoneNumberRequest);

    /**
     * <p>
     * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164
     * format, product type, and order status.
     * </p>
     * 
     * @param getPhoneNumberOrderRequest
     * @return Result of the GetPhoneNumberOrder operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetPhoneNumberOrder
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberOrder" target="_top">AWS API
     *      Documentation</a>
     */
    GetPhoneNumberOrderResult getPhoneNumberOrder(GetPhoneNumberOrderRequest getPhoneNumberOrderRequest);

    /**
     * <p>
     * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling
     * name.
     * </p>
     * 
     * @param getPhoneNumberSettingsRequest
     * @return Result of the GetPhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetPhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetPhoneNumberSettings" target="_top">AWS
     *      API Documentation</a>
     */
    GetPhoneNumberSettingsResult getPhoneNumberSettings(GetPhoneNumberSettingsRequest getPhoneNumberSettingsRequest);

    /**
     * <p>
     * Retrieves room details, such as the room name, for a room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param getRoomRequest
     * @return Result of the GetRoom operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
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
     * @sample AmazonChime.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    GetRoomResult getRoom(GetRoomRequest getRoomRequest);

    /**
     * <p>
     * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting
     * PIN.
     * </p>
     * <p>
     * To retrieve user details with an email address instead of a user ID, use the <a>ListUsers</a> action, and then
     * filter by email address.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserResult getUser(GetUserRequest getUserRequest);

    /**
     * <p>
     * Retrieves settings for the specified user ID, such as any associated phone number settings.
     * </p>
     * 
     * @param getUserSettingsRequest
     * @return Result of the GetUserSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserSettingsResult getUserSettings(GetUserSettingsRequest getUserSettingsRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and
     * encryption requirements.
     * </p>
     * 
     * @param getVoiceConnectorRequest
     * @return Result of the GetVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    GetVoiceConnectorResult getVoiceConnector(GetVoiceConnectorRequest getVoiceConnectorRequest);

    /**
     * <p>
     * Retrieves details for the specified Amazon Chime Voice Connector group, such as timestamps, name, and associated
     * <code>VoiceConnectorItems</code>.
     * </p>
     * 
     * @param getVoiceConnectorGroupRequest
     * @return Result of the GetVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorGroup" target="_top">AWS
     *      API Documentation</a>
     */
    GetVoiceConnectorGroupResult getVoiceConnectorGroup(GetVoiceConnectorGroupRequest getVoiceConnectorGroupRequest);

    /**
     * <p>
     * Retrieves the logging configuration details for the specified Amazon Chime Voice Connector. Shows whether SIP
     * message logs are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param getVoiceConnectorLoggingConfigurationRequest
     * @return Result of the GetVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorLoggingConfigurationResult getVoiceConnectorLoggingConfiguration(
            GetVoiceConnectorLoggingConfigurationRequest getVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorOriginationRequest
     * @return Result of the GetVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorOriginationResult getVoiceConnectorOrigination(GetVoiceConnectorOriginationRequest getVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Retrieves the streaming configuration details for the specified Amazon Chime Voice Connector. Shows whether media
     * streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the Amazon
     * Kinesis data.
     * </p>
     * 
     * @param getVoiceConnectorStreamingConfigurationRequest
     * @return Result of the GetVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorStreamingConfigurationResult getVoiceConnectorStreamingConfiguration(
            GetVoiceConnectorStreamingConfigurationRequest getVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationRequest
     * @return Result of the GetVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorTerminationResult getVoiceConnectorTermination(GetVoiceConnectorTerminationRequest getVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Retrieves information about the last time a SIP <code>OPTIONS</code> ping was received from your SIP
     * infrastructure for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param getVoiceConnectorTerminationHealthRequest
     * @return Result of the GetVoiceConnectorTerminationHealth operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.GetVoiceConnectorTerminationHealth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetVoiceConnectorTerminationHealth"
     *      target="_top">AWS API Documentation</a>
     */
    GetVoiceConnectorTerminationHealthResult getVoiceConnectorTerminationHealth(
            GetVoiceConnectorTerminationHealthRequest getVoiceConnectorTerminationHealthRequest);

    /**
     * <p>
     * Sends email to a maximum of 50 users, inviting them to the specified Amazon Chime <code>Team</code> account. Only
     * <code>Team</code> account types are currently supported for this action.
     * </p>
     * 
     * @param inviteUsersRequest
     * @return Result of the InviteUsers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.InviteUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/InviteUsers" target="_top">AWS API
     *      Documentation</a>
     */
    InviteUsersResult inviteUsers(InviteUsersRequest inviteUsersRequest);

    /**
     * <p>
     * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name
     * prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address,
     * which returns one account result.
     * </p>
     * 
     * @param listAccountsRequest
     * @return Result of the ListAccounts operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    ListAccountsResult listAccounts(ListAccountsRequest listAccountsRequest);

    /**
     * <p>
     * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK,
     * see <a href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param listAttendeesRequest
     * @return Result of the ListAttendees operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListAttendees
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAttendees" target="_top">AWS API
     *      Documentation</a>
     */
    ListAttendeesResult listAttendees(ListAttendeesRequest listAttendeesRequest);

    /**
     * <p>
     * Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.
     * </p>
     * 
     * @param listBotsRequest
     * @return Result of the ListBots operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @sample AmazonChime.ListBots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListBots" target="_top">AWS API
     *      Documentation</a>
     */
    ListBotsResult listBots(ListBotsRequest listBotsRequest);

    /**
     * <p>
     * Lists up to 100 active Amazon Chime SDK meetings. For more information about the Amazon Chime SDK, see <a
     * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using the Amazon Chime SDK</a> in the
     * <i>Amazon Chime Developer Guide</i>.
     * </p>
     * 
     * @param listMeetingsRequest
     * @return Result of the ListMeetings operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListMeetings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListMeetings" target="_top">AWS API
     *      Documentation</a>
     */
    ListMeetingsResult listMeetings(ListMeetingsRequest listMeetingsRequest);

    /**
     * <p>
     * Lists the phone number orders for the administrator's Amazon Chime account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return Result of the ListPhoneNumberOrders operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListPhoneNumberOrders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumberOrders" target="_top">AWS
     *      API Documentation</a>
     */
    ListPhoneNumberOrdersResult listPhoneNumberOrders(ListPhoneNumberOrdersRequest listPhoneNumberOrdersRequest);

    /**
     * <p>
     * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, Amazon Chime Voice Connector,
     * or Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListPhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListPhoneNumbers" target="_top">AWS API
     *      Documentation</a>
     */
    ListPhoneNumbersResult listPhoneNumbers(ListPhoneNumbersRequest listPhoneNumbersRequest);

    /**
     * <p>
     * Lists the membership details for the specified room in an Amazon Chime Enterprise account, such as the members'
     * IDs, email addresses, and names.
     * </p>
     * 
     * @param listRoomMembershipsRequest
     * @return Result of the ListRoomMemberships operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListRoomMemberships
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRoomMemberships" target="_top">AWS API
     *      Documentation</a>
     */
    ListRoomMembershipsResult listRoomMemberships(ListRoomMembershipsRequest listRoomMembershipsRequest);

    /**
     * <p>
     * Lists the room details for the specified Amazon Chime Enterprise account. Optionally, filter the results by a
     * member ID (user ID or bot ID) to see a list of rooms that the member belongs to.
     * </p>
     * 
     * @param listRoomsRequest
     * @return Result of the ListRooms operation returned by the service.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    ListRoomsResult listRooms(ListRoomsRequest listRoomsRequest);

    /**
     * <p>
     * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only
     * the user that the email address belongs to.
     * </p>
     * 
     * @param listUsersRequest
     * @return Result of the ListUsers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsersResult listUsers(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists the Amazon Chime Voice Connector groups for the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorGroupsRequest
     * @return Result of the ListVoiceConnectorGroups operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListVoiceConnectorGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectorGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListVoiceConnectorGroupsResult listVoiceConnectorGroups(ListVoiceConnectorGroupsRequest listVoiceConnectorGroupsRequest);

    /**
     * <p>
     * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param listVoiceConnectorTerminationCredentialsRequest
     * @return Result of the ListVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    ListVoiceConnectorTerminationCredentialsResult listVoiceConnectorTerminationCredentials(
            ListVoiceConnectorTerminationCredentialsRequest listVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
     * </p>
     * 
     * @param listVoiceConnectorsRequest
     * @return Result of the ListVoiceConnectors operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ListVoiceConnectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListVoiceConnectors" target="_top">AWS API
     *      Documentation</a>
     */
    ListVoiceConnectorsResult listVoiceConnectors(ListVoiceConnectorsRequest listVoiceConnectorsRequest);

    /**
     * <p>
     * Logs out the specified user from all of the devices they are currently logged into.
     * </p>
     * 
     * @param logoutUserRequest
     * @return Result of the LogoutUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.LogoutUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/LogoutUser" target="_top">AWS API
     *      Documentation</a>
     */
    LogoutUserResult logoutUser(LogoutUserRequest logoutUserRequest);

    /**
     * <p>
     * Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either
     * an HTTPS endpoint or a Lambda function ARN. For more information, see <a>Bot</a>.
     * </p>
     * 
     * @param putEventsConfigurationRequest
     * @return Result of the PutEventsConfiguration operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @sample AmazonChime.PutEventsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutEventsConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    PutEventsConfigurationResult putEventsConfiguration(PutEventsConfigurationRequest putEventsConfigurationRequest);

    /**
     * <p>
     * Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies
     * whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param putVoiceConnectorLoggingConfigurationRequest
     * @return Result of the PutVoiceConnectorLoggingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorLoggingConfigurationResult putVoiceConnectorLoggingConfiguration(
            PutVoiceConnectorLoggingConfigurationRequest putVoiceConnectorLoggingConfigurationRequest);

    /**
     * <p>
     * Adds origination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorOriginationRequest
     * @return Result of the PutVoiceConnectorOrigination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorOrigination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorOrigination"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorOriginationResult putVoiceConnectorOrigination(PutVoiceConnectorOriginationRequest putVoiceConnectorOriginationRequest);

    /**
     * <p>
     * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration
     * specifies whether media streaming is enabled for sending to Amazon Kinesis. It also sets the retention period, in
     * hours, for the Amazon Kinesis data.
     * </p>
     * 
     * @param putVoiceConnectorStreamingConfigurationRequest
     * @return Result of the PutVoiceConnectorStreamingConfiguration operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorStreamingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorStreamingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorStreamingConfigurationResult putVoiceConnectorStreamingConfiguration(
            PutVoiceConnectorStreamingConfigurationRequest putVoiceConnectorStreamingConfigurationRequest);

    /**
     * <p>
     * Adds termination settings for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationRequest
     * @return Result of the PutVoiceConnectorTermination operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorTermination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTermination"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorTerminationResult putVoiceConnectorTermination(PutVoiceConnectorTerminationRequest putVoiceConnectorTerminationRequest);

    /**
     * <p>
     * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param putVoiceConnectorTerminationCredentialsRequest
     * @return Result of the PutVoiceConnectorTerminationCredentials operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.PutVoiceConnectorTerminationCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutVoiceConnectorTerminationCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    PutVoiceConnectorTerminationCredentialsResult putVoiceConnectorTerminationCredentials(
            PutVoiceConnectorTerminationCredentialsRequest putVoiceConnectorTerminationCredentialsRequest);

    /**
     * <p>
     * Regenerates the security token for a bot.
     * </p>
     * 
     * @param regenerateSecurityTokenRequest
     * @return Result of the RegenerateSecurityToken operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @sample AmazonChime.RegenerateSecurityToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RegenerateSecurityToken" target="_top">AWS
     *      API Documentation</a>
     */
    RegenerateSecurityTokenResult regenerateSecurityToken(RegenerateSecurityTokenRequest regenerateSecurityTokenRequest);

    /**
     * <p>
     * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the <a>User</a> object
     * with the updated personal meeting PIN.
     * </p>
     * 
     * @param resetPersonalPINRequest
     * @return Result of the ResetPersonalPIN operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.ResetPersonalPIN
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ResetPersonalPIN" target="_top">AWS API
     *      Documentation</a>
     */
    ResetPersonalPINResult resetPersonalPIN(ResetPersonalPINRequest resetPersonalPINRequest);

    /**
     * <p>
     * Moves a phone number from the <b>Deletion queue</b> back into the phone number <b>Inventory</b>.
     * </p>
     * 
     * @param restorePhoneNumberRequest
     * @return Result of the RestorePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ResourceLimitExceededException
     *         The request exceeds the resource limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.RestorePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RestorePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    RestorePhoneNumberResult restorePhoneNumber(RestorePhoneNumberRequest restorePhoneNumberRequest);

    /**
     * <p>
     * Searches phone numbers that can be ordered.
     * </p>
     * 
     * @param searchAvailablePhoneNumbersRequest
     * @return Result of the SearchAvailablePhoneNumbers operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws AccessDeniedException
     *         You don't have permissions to perform the requested operation.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.SearchAvailablePhoneNumbers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SearchAvailablePhoneNumbers"
     *      target="_top">AWS API Documentation</a>
     */
    SearchAvailablePhoneNumbersResult searchAvailablePhoneNumbers(SearchAvailablePhoneNumbersRequest searchAvailablePhoneNumbersRequest);

    /**
     * <p>
     * Updates account details for the specified Amazon Chime account. Currently, only account name updates are
     * supported for this action.
     * </p>
     * 
     * @param updateAccountRequest
     * @return Result of the UpdateAccount operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccount" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAccountResult updateAccount(UpdateAccountRequest updateAccountRequest);

    /**
     * <p>
     * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared
     * screens, or for the dial-out option. For more information about these settings, see <a
     * href="https://docs.aws.amazon.com/chime/latest/ag/policies.html">Use the Policies Page</a> in the <i>Amazon Chime
     * Administration Guide</i>.
     * </p>
     * 
     * @param updateAccountSettingsRequest
     * @return Result of the UpdateAccountSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateAccountSettings" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAccountSettingsResult updateAccountSettings(UpdateAccountSettingsRequest updateAccountSettingsRequest);

    /**
     * <p>
     * Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime
     * Enterprise account.
     * </p>
     * 
     * @param updateBotRequest
     * @return Result of the UpdateBot operation returned by the service.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @sample AmazonChime.UpdateBot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateBot" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBotResult updateBot(UpdateBotRequest updateBotRequest);

    /**
     * <p>
     * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon
     * Chime Voice Connector settings.
     * </p>
     * 
     * @param updateGlobalSettingsRequest
     * @return Result of the UpdateGlobalSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateGlobalSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateGlobalSettings" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGlobalSettingsResult updateGlobalSettings(UpdateGlobalSettingsRequest updateGlobalSettingsRequest);

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
     * @return Result of the UpdatePhoneNumber operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdatePhoneNumber
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumber" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePhoneNumberResult updatePhoneNumber(UpdatePhoneNumberRequest updatePhoneNumberRequest);

    /**
     * <p>
     * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name.
     * You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72
     * hours to update.
     * </p>
     * 
     * @param updatePhoneNumberSettingsRequest
     * @return Result of the UpdatePhoneNumberSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdatePhoneNumberSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdatePhoneNumberSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePhoneNumberSettingsResult updatePhoneNumberSettings(UpdatePhoneNumberSettingsRequest updatePhoneNumberSettingsRequest);

    /**
     * <p>
     * Updates room details, such as the room name, for a room in an Amazon Chime Enterprise account.
     * </p>
     * 
     * @param updateRoomRequest
     * @return Result of the UpdateRoom operation returned by the service.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
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
     * @sample AmazonChime.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRoomResult updateRoom(UpdateRoomRequest updateRoomRequest);

    /**
     * <p>
     * Updates room membership details, such as the member role, for a room in an Amazon Chime Enterprise account. The
     * member role designates whether the member is a chat room administrator or a general chat room member. The member
     * role can be updated only for user IDs.
     * </p>
     * 
     * @param updateRoomMembershipRequest
     * @return Result of the UpdateRoomMembership operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateRoomMembership
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateRoomMembership" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRoomMembershipResult updateRoomMembership(UpdateRoomMembershipRequest updateRoomMembershipRequest);

    /**
     * <p>
     * Updates user details for a specified user ID. Currently, only <code>LicenseType</code> updates are supported for
     * this action.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Updates the settings for the specified user, such as phone number settings.
     * </p>
     * 
     * @param updateUserSettingsRequest
     * @return Result of the UpdateUserSettings operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateUserSettings" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserSettingsResult updateUserSettings(UpdateUserSettingsRequest updateUserSettingsRequest);

    /**
     * <p>
     * Updates details for the specified Amazon Chime Voice Connector.
     * </p>
     * 
     * @param updateVoiceConnectorRequest
     * @return Result of the UpdateVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateVoiceConnector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnector" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateVoiceConnectorResult updateVoiceConnector(UpdateVoiceConnectorRequest updateVoiceConnectorRequest);

    /**
     * <p>
     * Updates details for the specified Amazon Chime Voice Connector group, such as the name and Amazon Chime Voice
     * Connector priority ranking.
     * </p>
     * 
     * @param updateVoiceConnectorGroupRequest
     * @return Result of the UpdateVoiceConnectorGroup operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws NotFoundException
     *         One or more of the resources in the request does not exist in the system.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported Region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ConflictException
     *         The request could not be processed because of conflict in the current state of the resource.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
     * @throws ServiceUnavailableException
     *         The service is currently unavailable.
     * @throws ServiceFailureException
     *         The service encountered an unexpected error.
     * @sample AmazonChime.UpdateVoiceConnectorGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateVoiceConnectorGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateVoiceConnectorGroupResult updateVoiceConnectorGroup(UpdateVoiceConnectorGroupRequest updateVoiceConnectorGroupRequest);

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
