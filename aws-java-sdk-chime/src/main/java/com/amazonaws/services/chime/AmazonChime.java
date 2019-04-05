/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The Amazon Chime API (application programming interface) is designed for administrators to use to perform key tasks,
 * such as creating and managing Amazon Chime accounts and users. This guide provides detailed information about the
 * Amazon Chime API, including operations, types, inputs and outputs, and error codes.
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
 * <a href="https://docs.aws.amazon.com/chime/latest/ag/control-access.html">Control Access to the Amazon Chime
 * Console</a> in the <i>Amazon Chime Administration Guide</i>.
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
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
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
     * Associates a phone number with the specified Amazon Chime Voice Connector.
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
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
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
     *         account from an unsupported region.
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
     * Users suspended from a <code>Team</code> account are dissociated from the account, but they can continue to use
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector
     * product types.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime
     * Voice Connector product types.
     * </p>
     * 
     * @param createPhoneNumberOrderRequest
     * @return Result of the CreatePhoneNumberOrder operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
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
     * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling
     * <a>CreateVoiceConnectorRequest$RequireEncryption</a> configures your Amazon Chime Voice Connector to use TLS
     * transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted
     * outbound calls are blocked.
     * </p>
     * 
     * @param createVoiceConnectorRequest
     * @return Result of the CreateVoiceConnector operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     * Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice
     * Connector must be unassigned from it before it can be deleted.
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
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime <code>Team</code>
     * account. Only <code>Team</code> account types are currently supported for this action.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     * Lists the phone number orders for the administrator's Amazon Chime account.
     * </p>
     * 
     * @param listPhoneNumberOrdersRequest
     * @return Result of the ListPhoneNumberOrders operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
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
     * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice
     * Connector.
     * </p>
     * 
     * @param listPhoneNumbersRequest
     * @return Result of the ListPhoneNumbers operation returned by the service.
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
     * @throws ThrottledClientException
     *         The client exceeded its request rate limit.
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
     * @throws UnauthorizedClientException
     *         The client is not currently authorized to make the request.
     * @throws ForbiddenException
     *         The client is permanently forbidden from making the request. For example, when a user tries to create an
     *         account from an unsupported region.
     * @throws BadRequestException
     *         The input parameters don't match the service's restrictions.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     * Updates phone number details, such as product type, for the specified phone number ID.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
     *         account from an unsupported region.
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
