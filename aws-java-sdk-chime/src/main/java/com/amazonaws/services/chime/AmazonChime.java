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
     * Users suspended from an <code>EnterpriseLWA</code> account are immediately signed out of Amazon Chime and are no
     * longer able to sign in. To remove the suspension from suspended <code>EnterpriseLWA</code> account users, use the
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
