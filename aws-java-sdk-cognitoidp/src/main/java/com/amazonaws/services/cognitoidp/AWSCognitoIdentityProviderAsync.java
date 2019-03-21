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
package com.amazonaws.services.cognitoidp;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;

/**
 * Interface for accessing Amazon Cognito Identity Provider asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cognitoidp.AbstractAWSCognitoIdentityProviderAsync} instead.
 * </p>
 * <p>
 * <p>
 * Using the Amazon Cognito User Pools API, you can create a user pool to manage directories and users. You can
 * authenticate a user to obtain tokens related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito User Pools.
 * </p>
 * <p>
 * For more information, see the Amazon Cognito Documentation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCognitoIdentityProviderAsync extends AWSCognitoIdentityProvider {

    /**
     * <p>
     * Adds additional user attributes to the user pool schema.
     * </p>
     * 
     * @param addCustomAttributesRequest
     *        Represents the request to add custom attributes.
     * @return A Java Future containing the result of the AddCustomAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AddCustomAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AddCustomAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddCustomAttributesResult> addCustomAttributesAsync(AddCustomAttributesRequest addCustomAttributesRequest);

    /**
     * <p>
     * Adds additional user attributes to the user pool schema.
     * </p>
     * 
     * @param addCustomAttributesRequest
     *        Represents the request to add custom attributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddCustomAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AddCustomAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AddCustomAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddCustomAttributesResult> addCustomAttributesAsync(AddCustomAttributesRequest addCustomAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<AddCustomAttributesRequest, AddCustomAttributesResult> asyncHandler);

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminAddUserToGroupRequest
     * @return A Java Future containing the result of the AdminAddUserToGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminAddUserToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminAddUserToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminAddUserToGroupResult> adminAddUserToGroupAsync(AdminAddUserToGroupRequest adminAddUserToGroupRequest);

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminAddUserToGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminAddUserToGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminAddUserToGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminAddUserToGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminAddUserToGroupResult> adminAddUserToGroupAsync(AdminAddUserToGroupRequest adminAddUserToGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AdminAddUserToGroupRequest, AdminAddUserToGroupResult> asyncHandler);

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminConfirmSignUpRequest
     *        Represents the request to confirm user registration.
     * @return A Java Future containing the result of the AdminConfirmSignUp operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminConfirmSignUp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(AdminConfirmSignUpRequest adminConfirmSignUpRequest);

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminConfirmSignUpRequest
     *        Represents the request to confirm user registration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminConfirmSignUp operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminConfirmSignUp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(AdminConfirmSignUpRequest adminConfirmSignUpRequest,
            com.amazonaws.handlers.AsyncHandler<AdminConfirmSignUpRequest, AdminConfirmSignUpResult> asyncHandler);

    /**
     * <p>
     * Creates a new user in the specified user pool.
     * </p>
     * <p>
     * If <code>MessageAction</code> is not set, the default is to send a welcome message via email or phone (SMS).
     * </p>
     * <note>
     * <p>
     * This message is based on a template that you configured in your call to or . This template includes your custom
     * sign-up instructions and placeholders for user name and temporary password.
     * </p>
     * </note>
     * <p>
     * Alternatively, you can call AdminCreateUser with “SUPPRESS” for the <code>MessageAction</code> parameter, and
     * Amazon Cognito will not send any email.
     * </p>
     * <p>
     * In either case, the user will be in the <code>FORCE_CHANGE_PASSWORD</code> state until they sign in and change
     * their password.
     * </p>
     * <p>
     * AdminCreateUser requires developer credentials.
     * </p>
     * 
     * @param adminCreateUserRequest
     *        Represents the request to create a user in the specified user pool.
     * @return A Java Future containing the result of the AdminCreateUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminCreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminCreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminCreateUserResult> adminCreateUserAsync(AdminCreateUserRequest adminCreateUserRequest);

    /**
     * <p>
     * Creates a new user in the specified user pool.
     * </p>
     * <p>
     * If <code>MessageAction</code> is not set, the default is to send a welcome message via email or phone (SMS).
     * </p>
     * <note>
     * <p>
     * This message is based on a template that you configured in your call to or . This template includes your custom
     * sign-up instructions and placeholders for user name and temporary password.
     * </p>
     * </note>
     * <p>
     * Alternatively, you can call AdminCreateUser with “SUPPRESS” for the <code>MessageAction</code> parameter, and
     * Amazon Cognito will not send any email.
     * </p>
     * <p>
     * In either case, the user will be in the <code>FORCE_CHANGE_PASSWORD</code> state until they sign in and change
     * their password.
     * </p>
     * <p>
     * AdminCreateUser requires developer credentials.
     * </p>
     * 
     * @param adminCreateUserRequest
     *        Represents the request to create a user in the specified user pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminCreateUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminCreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminCreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminCreateUserResult> adminCreateUserAsync(AdminCreateUserRequest adminCreateUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminCreateUserRequest, AdminCreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserRequest
     *        Represents the request to delete a user as an administrator.
     * @return A Java Future containing the result of the AdminDeleteUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminDeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(AdminDeleteUserRequest adminDeleteUserRequest);

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserRequest
     *        Represents the request to delete a user as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminDeleteUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminDeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(AdminDeleteUserRequest adminDeleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminDeleteUserRequest, AdminDeleteUserResult> asyncHandler);

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserAttributesRequest
     *        Represents the request to delete user attributes as an administrator.
     * @return A Java Future containing the result of the AdminDeleteUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminDeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(
            AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest);

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDeleteUserAttributesRequest
     *        Represents the request to delete user attributes as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminDeleteUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminDeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(
            AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<AdminDeleteUserAttributesRequest, AdminDeleteUserAttributesResult> asyncHandler);

    /**
     * <p>
     * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to
     * disable is a Cognito User Pools native username + password user, they are not permitted to use their password to
     * sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is
     * removed. The next time the external user (no longer attached to the previously linked
     * <code>DestinationUser</code>) signs in, they must create a new user account. See .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer credentials.
     * </p>
     * <p>
     * The <code>ProviderName</code> must match the value specified when creating an IdP for the pool.
     * </p>
     * <p>
     * To disable a native username + password user, the <code>ProviderName</code> value must be <code>Cognito</code>
     * and the <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code>, with the
     * <code>ProviderAttributeValue</code> being the name that is used in the user pool for the user.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> must always be <code>Cognito_Subject</code> for social identity providers.
     * The <code>ProviderAttributeValue</code> must always be the exact subject that was used when the user was
     * originally linked as a source user.
     * </p>
     * <p>
     * For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in,
     * the <code>ProviderAttributeName</code> and <code>ProviderAttributeValue</code> must be the same values that were
     * used for the <code>SourceUser</code> when the identities were originally linked in the call. (If the linking was
     * done with <code>ProviderAttributeName</code> set to <code>Cognito_Subject</code>, the same applies here).
     * However, if the user has already signed in, the <code>ProviderAttributeName</code> must be
     * <code>Cognito_Subject</code> and <code>ProviderAttributeValue</code> must be the subject of the SAML assertion.
     * </p>
     * 
     * @param adminDisableProviderForUserRequest
     * @return A Java Future containing the result of the AdminDisableProviderForUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminDisableProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminDisableProviderForUserResult> adminDisableProviderForUserAsync(
            AdminDisableProviderForUserRequest adminDisableProviderForUserRequest);

    /**
     * <p>
     * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to
     * disable is a Cognito User Pools native username + password user, they are not permitted to use their password to
     * sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is
     * removed. The next time the external user (no longer attached to the previously linked
     * <code>DestinationUser</code>) signs in, they must create a new user account. See .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer credentials.
     * </p>
     * <p>
     * The <code>ProviderName</code> must match the value specified when creating an IdP for the pool.
     * </p>
     * <p>
     * To disable a native username + password user, the <code>ProviderName</code> value must be <code>Cognito</code>
     * and the <code>ProviderAttributeName</code> must be <code>Cognito_Subject</code>, with the
     * <code>ProviderAttributeValue</code> being the name that is used in the user pool for the user.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> must always be <code>Cognito_Subject</code> for social identity providers.
     * The <code>ProviderAttributeValue</code> must always be the exact subject that was used when the user was
     * originally linked as a source user.
     * </p>
     * <p>
     * For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in,
     * the <code>ProviderAttributeName</code> and <code>ProviderAttributeValue</code> must be the same values that were
     * used for the <code>SourceUser</code> when the identities were originally linked in the call. (If the linking was
     * done with <code>ProviderAttributeName</code> set to <code>Cognito_Subject</code>, the same applies here).
     * However, if the user has already signed in, the <code>ProviderAttributeName</code> must be
     * <code>Cognito_Subject</code> and <code>ProviderAttributeValue</code> must be the subject of the SAML assertion.
     * </p>
     * 
     * @param adminDisableProviderForUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminDisableProviderForUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminDisableProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminDisableProviderForUserResult> adminDisableProviderForUserAsync(
            AdminDisableProviderForUserRequest adminDisableProviderForUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminDisableProviderForUserRequest, AdminDisableProviderForUserResult> asyncHandler);

    /**
     * <p>
     * Disables the specified user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDisableUserRequest
     *        Represents the request to disable any user as an administrator.
     * @return A Java Future containing the result of the AdminDisableUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminDisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(AdminDisableUserRequest adminDisableUserRequest);

    /**
     * <p>
     * Disables the specified user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminDisableUserRequest
     *        Represents the request to disable any user as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminDisableUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminDisableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminDisableUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(AdminDisableUserRequest adminDisableUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminDisableUserRequest, AdminDisableUserResult> asyncHandler);

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminEnableUserRequest
     *        Represents the request that enables the user as an administrator.
     * @return A Java Future containing the result of the AdminEnableUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminEnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminEnableUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(AdminEnableUserRequest adminEnableUserRequest);

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminEnableUserRequest
     *        Represents the request that enables the user as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminEnableUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminEnableUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminEnableUser" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(AdminEnableUserRequest adminEnableUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminEnableUserRequest, AdminEnableUserResult> asyncHandler);

    /**
     * <p>
     * Forgets the device, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminForgetDeviceRequest
     *        Sends the forgot device request, as an administrator.
     * @return A Java Future containing the result of the AdminForgetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminForgetDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminForgetDeviceResult> adminForgetDeviceAsync(AdminForgetDeviceRequest adminForgetDeviceRequest);

    /**
     * <p>
     * Forgets the device, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminForgetDeviceRequest
     *        Sends the forgot device request, as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminForgetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminForgetDevice" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminForgetDeviceResult> adminForgetDeviceAsync(AdminForgetDeviceRequest adminForgetDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<AdminForgetDeviceRequest, AdminForgetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets the device, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminGetDeviceRequest
     *        Represents the request to get the device, as an administrator.
     * @return A Java Future containing the result of the AdminGetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminGetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AdminGetDeviceResult> adminGetDeviceAsync(AdminGetDeviceRequest adminGetDeviceRequest);

    /**
     * <p>
     * Gets the device, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminGetDeviceRequest
     *        Represents the request to get the device, as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminGetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminGetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AdminGetDeviceResult> adminGetDeviceAsync(AdminGetDeviceRequest adminGetDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<AdminGetDeviceRequest, AdminGetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminGetUserRequest
     *        Represents the request to get the specified user as an administrator.
     * @return A Java Future containing the result of the AdminGetUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminGetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(AdminGetUserRequest adminGetUserRequest);

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminGetUserRequest
     *        Represents the request to get the specified user as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminGetUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminGetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminGetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(AdminGetUserRequest adminGetUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminGetUserRequest, AdminGetUserResult> asyncHandler);

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminInitiateAuthRequest
     *        Initiates the authorization request, as an administrator.
     * @return A Java Future containing the result of the AdminInitiateAuth operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminInitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminInitiateAuth" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminInitiateAuthResult> adminInitiateAuthAsync(AdminInitiateAuthRequest adminInitiateAuthRequest);

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminInitiateAuthRequest
     *        Initiates the authorization request, as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminInitiateAuth operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminInitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminInitiateAuth" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminInitiateAuthResult> adminInitiateAuthAsync(AdminInitiateAuthRequest adminInitiateAuthRequest,
            com.amazonaws.handlers.AsyncHandler<AdminInitiateAuthRequest, AdminInitiateAuthResult> asyncHandler);

    /**
     * <p>
     * Links an existing user account in a user pool (<code>DestinationUser</code>) to an identity from an external
     * identity provider (<code>SourceUser</code>) based on a specified attribute name and value from the external
     * identity provider. This allows you to create a link from the existing user account to an external federated user
     * identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the
     * existing user account.
     * </p>
     * <p>
     * For example, if there is an existing user with a username and password, this API links that user to a federated
     * user identity, so that when the federated user identity is used, the user signs in as the existing user account.
     * </p>
     * <important>
     * <p>
     * Because this API allows a user with an external federated identity to sign in as an existing user in the user
     * pool, it is critical that it only be used with external identity providers and provider attributes that have been
     * trusted by the application owner.
     * </p>
     * </important>
     * <p>
     * See also .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer credentials.
     * </p>
     * 
     * @param adminLinkProviderForUserRequest
     * @return A Java Future containing the result of the AdminLinkProviderForUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminLinkProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminLinkProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminLinkProviderForUserResult> adminLinkProviderForUserAsync(AdminLinkProviderForUserRequest adminLinkProviderForUserRequest);

    /**
     * <p>
     * Links an existing user account in a user pool (<code>DestinationUser</code>) to an identity from an external
     * identity provider (<code>SourceUser</code>) based on a specified attribute name and value from the external
     * identity provider. This allows you to create a link from the existing user account to an external federated user
     * identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the
     * existing user account.
     * </p>
     * <p>
     * For example, if there is an existing user with a username and password, this API links that user to a federated
     * user identity, so that when the federated user identity is used, the user signs in as the existing user account.
     * </p>
     * <important>
     * <p>
     * Because this API allows a user with an external federated identity to sign in as an existing user in the user
     * pool, it is critical that it only be used with external identity providers and provider attributes that have been
     * trusted by the application owner.
     * </p>
     * </important>
     * <p>
     * See also .
     * </p>
     * <p>
     * This action is enabled only for admin access and requires developer credentials.
     * </p>
     * 
     * @param adminLinkProviderForUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminLinkProviderForUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminLinkProviderForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminLinkProviderForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminLinkProviderForUserResult> adminLinkProviderForUserAsync(AdminLinkProviderForUserRequest adminLinkProviderForUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminLinkProviderForUserRequest, AdminLinkProviderForUserResult> asyncHandler);

    /**
     * <p>
     * Lists devices, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminListDevicesRequest
     *        Represents the request to list devices, as an administrator.
     * @return A Java Future containing the result of the AdminListDevices operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminListDevicesResult> adminListDevicesAsync(AdminListDevicesRequest adminListDevicesRequest);

    /**
     * <p>
     * Lists devices, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminListDevicesRequest
     *        Represents the request to list devices, as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminListDevices operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AdminListDevicesResult> adminListDevicesAsync(AdminListDevicesRequest adminListDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<AdminListDevicesRequest, AdminListDevicesResult> asyncHandler);

    /**
     * <p>
     * Lists the groups that the user belongs to.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminListGroupsForUserRequest
     * @return A Java Future containing the result of the AdminListGroupsForUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminListGroupsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListGroupsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminListGroupsForUserResult> adminListGroupsForUserAsync(AdminListGroupsForUserRequest adminListGroupsForUserRequest);

    /**
     * <p>
     * Lists the groups that the user belongs to.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminListGroupsForUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminListGroupsForUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminListGroupsForUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListGroupsForUser"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminListGroupsForUserResult> adminListGroupsForUserAsync(AdminListGroupsForUserRequest adminListGroupsForUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminListGroupsForUserRequest, AdminListGroupsForUserResult> asyncHandler);

    /**
     * <p>
     * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminListUserAuthEventsRequest
     * @return A Java Future containing the result of the AdminListUserAuthEvents operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminListUserAuthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListUserAuthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminListUserAuthEventsResult> adminListUserAuthEventsAsync(AdminListUserAuthEventsRequest adminListUserAuthEventsRequest);

    /**
     * <p>
     * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminListUserAuthEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminListUserAuthEvents operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminListUserAuthEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListUserAuthEvents"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminListUserAuthEventsResult> adminListUserAuthEventsAsync(AdminListUserAuthEventsRequest adminListUserAuthEventsRequest,
            com.amazonaws.handlers.AsyncHandler<AdminListUserAuthEventsRequest, AdminListUserAuthEventsResult> asyncHandler);

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminRemoveUserFromGroupRequest
     * @return A Java Future containing the result of the AdminRemoveUserFromGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminRemoveUserFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRemoveUserFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminRemoveUserFromGroupResult> adminRemoveUserFromGroupAsync(AdminRemoveUserFromGroupRequest adminRemoveUserFromGroupRequest);

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminRemoveUserFromGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminRemoveUserFromGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminRemoveUserFromGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRemoveUserFromGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminRemoveUserFromGroupResult> adminRemoveUserFromGroupAsync(AdminRemoveUserFromGroupRequest adminRemoveUserFromGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AdminRemoveUserFromGroupRequest, AdminRemoveUserFromGroupResult> asyncHandler);

    /**
     * <p>
     * Resets the specified user's password in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to
     * sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should
     * direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition,
     * if the user pool has phone verification selected and a verified phone number exists for the user, or if email
     * verification is selected and a verified email exists for the user, calling this API will also result in sending a
     * message to the end user with the code to change their password.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an administrator.
     * @return A Java Future containing the result of the AdminResetUserPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminResetUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminResetUserPasswordResult> adminResetUserPasswordAsync(AdminResetUserPasswordRequest adminResetUserPasswordRequest);

    /**
     * <p>
     * Resets the specified user's password in a user pool as an administrator. Works on any user.
     * </p>
     * <p>
     * When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to
     * sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should
     * direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition,
     * if the user pool has phone verification selected and a verified phone number exists for the user, or if email
     * verification is selected and a verified email exists for the user, calling this API will also result in sending a
     * message to the end user with the code to change their password.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminResetUserPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminResetUserPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminResetUserPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminResetUserPasswordResult> adminResetUserPasswordAsync(AdminResetUserPasswordRequest adminResetUserPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<AdminResetUserPasswordRequest, AdminResetUserPasswordResult> asyncHandler);

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminRespondToAuthChallengeRequest
     *        The request to respond to the authentication challenge, as an administrator.
     * @return A Java Future containing the result of the AdminRespondToAuthChallenge operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminRespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminRespondToAuthChallengeResult> adminRespondToAuthChallengeAsync(
            AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest);

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminRespondToAuthChallengeRequest
     *        The request to respond to the authentication challenge, as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminRespondToAuthChallenge operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminRespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminRespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminRespondToAuthChallengeResult> adminRespondToAuthChallengeAsync(
            AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest,
            com.amazonaws.handlers.AsyncHandler<AdminRespondToAuthChallengeRequest, AdminRespondToAuthChallengeResult> asyncHandler);

    /**
     * <p>
     * Sets the user's multi-factor authentication (MFA) preference.
     * </p>
     * 
     * @param adminSetUserMFAPreferenceRequest
     * @return A Java Future containing the result of the AdminSetUserMFAPreference operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminSetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminSetUserMFAPreferenceResult> adminSetUserMFAPreferenceAsync(
            AdminSetUserMFAPreferenceRequest adminSetUserMFAPreferenceRequest);

    /**
     * <p>
     * Sets the user's multi-factor authentication (MFA) preference.
     * </p>
     * 
     * @param adminSetUserMFAPreferenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminSetUserMFAPreference operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminSetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminSetUserMFAPreferenceResult> adminSetUserMFAPreferenceAsync(
            AdminSetUserMFAPreferenceRequest adminSetUserMFAPreferenceRequest,
            com.amazonaws.handlers.AsyncHandler<AdminSetUserMFAPreferenceRequest, AdminSetUserMFAPreferenceResult> asyncHandler);

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminSetUserSettingsRequest
     *        Represents the request to set user settings as an administrator.
     * @return A Java Future containing the result of the AdminSetUserSettings operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminSetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(AdminSetUserSettingsRequest adminSetUserSettingsRequest);

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any user.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminSetUserSettingsRequest
     *        Represents the request to set user settings as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminSetUserSettings operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminSetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminSetUserSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(AdminSetUserSettingsRequest adminSetUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<AdminSetUserSettingsRequest, AdminSetUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for
     * improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminUpdateAuthEventFeedbackRequest
     * @return A Java Future containing the result of the AdminUpdateAuthEventFeedback operation returned by the
     *         service.
     * @sample AWSCognitoIdentityProviderAsync.AdminUpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUpdateAuthEventFeedbackResult> adminUpdateAuthEventFeedbackAsync(
            AdminUpdateAuthEventFeedbackRequest adminUpdateAuthEventFeedbackRequest);

    /**
     * <p>
     * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for
     * improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param adminUpdateAuthEventFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminUpdateAuthEventFeedback operation returned by the
     *         service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminUpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUpdateAuthEventFeedbackResult> adminUpdateAuthEventFeedbackAsync(
            AdminUpdateAuthEventFeedbackRequest adminUpdateAuthEventFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<AdminUpdateAuthEventFeedbackRequest, AdminUpdateAuthEventFeedbackResult> asyncHandler);

    /**
     * <p>
     * Updates the device status as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUpdateDeviceStatusRequest
     *        The request to update the device status, as an administrator.
     * @return A Java Future containing the result of the AdminUpdateDeviceStatus operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminUpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateDeviceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUpdateDeviceStatusResult> adminUpdateDeviceStatusAsync(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest);

    /**
     * <p>
     * Updates the device status as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUpdateDeviceStatusRequest
     *        The request to update the device status, as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminUpdateDeviceStatus operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminUpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateDeviceStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUpdateDeviceStatusResult> adminUpdateDeviceStatusAsync(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<AdminUpdateDeviceStatusRequest, AdminUpdateDeviceStatusResult> asyncHandler);

    /**
     * <p>
     * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * In addition to updating user attributes, this API can also be used to mark phone and email as verified.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUpdateUserAttributesRequest
     *        Represents the request to update the user's attributes as an administrator.
     * @return A Java Future containing the result of the AdminUpdateUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminUpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(
            AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest);

    /**
     * <p>
     * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix to the attribute name.
     * </p>
     * <p>
     * In addition to updating user attributes, this API can also be used to mark phone and email as verified.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUpdateUserAttributesRequest
     *        Represents the request to update the user's attributes as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminUpdateUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminUpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(
            AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<AdminUpdateUserAttributesRequest, AdminUpdateUserAttributesResult> asyncHandler);

    /**
     * <p>
     * Signs out users from all devices, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUserGlobalSignOutRequest
     *        The request to sign out of all devices, as an administrator.
     * @return A Java Future containing the result of the AdminUserGlobalSignOut operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminUserGlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUserGlobalSignOut"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUserGlobalSignOutResult> adminUserGlobalSignOutAsync(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest);

    /**
     * <p>
     * Signs out users from all devices, as an administrator.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminUserGlobalSignOutRequest
     *        The request to sign out of all devices, as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminUserGlobalSignOut operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminUserGlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUserGlobalSignOut"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AdminUserGlobalSignOutResult> adminUserGlobalSignOutAsync(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest,
            com.amazonaws.handlers.AsyncHandler<AdminUserGlobalSignOutRequest, AdminUserGlobalSignOutResult> asyncHandler);

    /**
     * <p>
     * Returns a unique generated shared secret key code for the user account. The request takes an access token or a
     * session string, but not both.
     * </p>
     * 
     * @param associateSoftwareTokenRequest
     * @return A Java Future containing the result of the AssociateSoftwareToken operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AssociateSoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AssociateSoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSoftwareTokenResult> associateSoftwareTokenAsync(AssociateSoftwareTokenRequest associateSoftwareTokenRequest);

    /**
     * <p>
     * Returns a unique generated shared secret key code for the user account. The request takes an access token or a
     * session string, but not both.
     * </p>
     * 
     * @param associateSoftwareTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateSoftwareToken operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AssociateSoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AssociateSoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateSoftwareTokenResult> associateSoftwareTokenAsync(AssociateSoftwareTokenRequest associateSoftwareTokenRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateSoftwareTokenRequest, AssociateSoftwareTokenResult> asyncHandler);

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     * 
     * @param changePasswordRequest
     *        Represents the request to change a user password.
     * @return A Java Future containing the result of the ChangePassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ChangePassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ChangePassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ChangePasswordResult> changePasswordAsync(ChangePasswordRequest changePasswordRequest);

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     * 
     * @param changePasswordRequest
     *        Represents the request to change a user password.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ChangePassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ChangePassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ChangePassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ChangePasswordResult> changePasswordAsync(ChangePasswordRequest changePasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ChangePasswordRequest, ChangePasswordResult> asyncHandler);

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that begins device tracking.
     * </p>
     * 
     * @param confirmDeviceRequest
     *        Confirms the device request.
     * @return A Java Future containing the result of the ConfirmDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ConfirmDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmDeviceResult> confirmDeviceAsync(ConfirmDeviceRequest confirmDeviceRequest);

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that begins device tracking.
     * </p>
     * 
     * @param confirmDeviceRequest
     *        Confirms the device request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ConfirmDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmDeviceResult> confirmDeviceAsync(ConfirmDeviceRequest confirmDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmDeviceRequest, ConfirmDeviceResult> asyncHandler);

    /**
     * <p>
     * Allows a user to enter a confirmation code to reset a forgotten password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest
     *        The request representing the confirmation for a password reset.
     * @return A Java Future containing the result of the ConfirmForgotPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ConfirmForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmForgotPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmForgotPasswordResult> confirmForgotPasswordAsync(ConfirmForgotPasswordRequest confirmForgotPasswordRequest);

    /**
     * <p>
     * Allows a user to enter a confirmation code to reset a forgotten password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest
     *        The request representing the confirmation for a password reset.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmForgotPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ConfirmForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmForgotPassword"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ConfirmForgotPasswordResult> confirmForgotPasswordAsync(ConfirmForgotPasswordRequest confirmForgotPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmForgotPasswordRequest, ConfirmForgotPasswordResult> asyncHandler);

    /**
     * <p>
     * Confirms registration of a user and handles the existing alias from a previous user.
     * </p>
     * 
     * @param confirmSignUpRequest
     *        Represents the request to confirm registration of a user.
     * @return A Java Future containing the result of the ConfirmSignUp operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmSignUp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmSignUpResult> confirmSignUpAsync(ConfirmSignUpRequest confirmSignUpRequest);

    /**
     * <p>
     * Confirms registration of a user and handles the existing alias from a previous user.
     * </p>
     * 
     * @param confirmSignUpRequest
     *        Represents the request to confirm registration of a user.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ConfirmSignUp operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ConfirmSignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmSignUp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ConfirmSignUpResult> confirmSignUpAsync(ConfirmSignUpRequest confirmSignUpRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmSignUpRequest, ConfirmSignUpResult> asyncHandler);

    /**
     * <p>
     * Creates a new group in the specified user pool.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a new group in the specified user pool.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.CreateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Creates an identity provider for a user pool.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @return A Java Future containing the result of the CreateIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(CreateIdentityProviderRequest createIdentityProviderRequest);

    /**
     * <p>
     * Creates an identity provider for a user pool.
     * </p>
     * 
     * @param createIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.CreateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateIdentityProviderResult> createIdentityProviderAsync(CreateIdentityProviderRequest createIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIdentityProviderRequest, CreateIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Creates a new OAuth2.0 resource server and defines custom scopes in it.
     * </p>
     * 
     * @param createResourceServerRequest
     * @return A Java Future containing the result of the CreateResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceServerResult> createResourceServerAsync(CreateResourceServerRequest createResourceServerRequest);

    /**
     * <p>
     * Creates a new OAuth2.0 resource server and defines custom scopes in it.
     * </p>
     * 
     * @param createResourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.CreateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceServerResult> createResourceServerAsync(CreateResourceServerRequest createResourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceServerRequest, CreateResourceServerResult> asyncHandler);

    /**
     * <p>
     * Creates the user import job.
     * </p>
     * 
     * @param createUserImportJobRequest
     *        Represents the request to create the user import job.
     * @return A Java Future containing the result of the CreateUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserImportJobResult> createUserImportJobAsync(CreateUserImportJobRequest createUserImportJobRequest);

    /**
     * <p>
     * Creates the user import job.
     * </p>
     * 
     * @param createUserImportJobRequest
     *        Represents the request to create the user import job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.CreateUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserImportJobResult> createUserImportJobAsync(CreateUserImportJobRequest createUserImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserImportJobRequest, CreateUserImportJobResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
     * </p>
     * 
     * @param createUserPoolRequest
     *        Represents the request to create a user pool.
     * @return A Java Future containing the result of the CreateUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserPoolResult> createUserPoolAsync(CreateUserPoolRequest createUserPoolRequest);

    /**
     * <p>
     * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
     * </p>
     * 
     * @param createUserPoolRequest
     *        Represents the request to create a user pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.CreateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserPoolResult> createUserPoolAsync(CreateUserPoolRequest createUserPoolRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserPoolRequest, CreateUserPoolResult> asyncHandler);

    /**
     * <p>
     * Creates the user pool client.
     * </p>
     * 
     * @param createUserPoolClientRequest
     *        Represents the request to create a user pool client.
     * @return A Java Future containing the result of the CreateUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserPoolClientResult> createUserPoolClientAsync(CreateUserPoolClientRequest createUserPoolClientRequest);

    /**
     * <p>
     * Creates the user pool client.
     * </p>
     * 
     * @param createUserPoolClientRequest
     *        Represents the request to create a user pool client.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.CreateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserPoolClientResult> createUserPoolClientAsync(CreateUserPoolClientRequest createUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserPoolClientRequest, CreateUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Creates a new domain for a user pool.
     * </p>
     * 
     * @param createUserPoolDomainRequest
     * @return A Java Future containing the result of the CreateUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserPoolDomainResult> createUserPoolDomainAsync(CreateUserPoolDomainRequest createUserPoolDomainRequest);

    /**
     * <p>
     * Creates a new domain for a user pool.
     * </p>
     * 
     * @param createUserPoolDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.CreateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateUserPoolDomainResult> createUserPoolDomainAsync(CreateUserPoolDomainRequest createUserPoolDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserPoolDomainRequest, CreateUserPoolDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes a group. Currently only groups with no members can be deleted.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes a group. Currently only groups with no members can be deleted.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an identity provider for a user pool.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @return A Java Future containing the result of the DeleteIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(DeleteIdentityProviderRequest deleteIdentityProviderRequest);

    /**
     * <p>
     * Deletes an identity provider for a user pool.
     * </p>
     * 
     * @param deleteIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteIdentityProviderResult> deleteIdentityProviderAsync(DeleteIdentityProviderRequest deleteIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityProviderRequest, DeleteIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Deletes a resource server.
     * </p>
     * 
     * @param deleteResourceServerRequest
     * @return A Java Future containing the result of the DeleteResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceServerResult> deleteResourceServerAsync(DeleteResourceServerRequest deleteResourceServerRequest);

    /**
     * <p>
     * Deletes a resource server.
     * </p>
     * 
     * @param deleteResourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceServerResult> deleteResourceServerAsync(DeleteResourceServerRequest deleteResourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceServerRequest, DeleteResourceServerResult> asyncHandler);

    /**
     * <p>
     * Allows a user to delete himself or herself.
     * </p>
     * 
     * @param deleteUserRequest
     *        Represents the request to delete a user.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Allows a user to delete himself or herself.
     * </p>
     * 
     * @param deleteUserRequest
     *        Represents the request to delete a user.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler);

    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     * 
     * @param deleteUserAttributesRequest
     *        Represents the request to delete user attributes.
     * @return A Java Future containing the result of the DeleteUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserAttributesResult> deleteUserAttributesAsync(DeleteUserAttributesRequest deleteUserAttributesRequest);

    /**
     * <p>
     * Deletes the attributes for a user.
     * </p>
     * 
     * @param deleteUserAttributesRequest
     *        Represents the request to delete user attributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserAttributesResult> deleteUserAttributesAsync(DeleteUserAttributesRequest deleteUserAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserAttributesRequest, DeleteUserAttributesResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param deleteUserPoolRequest
     *        Represents the request to delete a user pool.
     * @return A Java Future containing the result of the DeleteUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserPoolResult> deleteUserPoolAsync(DeleteUserPoolRequest deleteUserPoolRequest);

    /**
     * <p>
     * Deletes the specified Amazon Cognito user pool.
     * </p>
     * 
     * @param deleteUserPoolRequest
     *        Represents the request to delete a user pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserPoolResult> deleteUserPoolAsync(DeleteUserPoolRequest deleteUserPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPoolRequest, DeleteUserPoolResult> asyncHandler);

    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     * 
     * @param deleteUserPoolClientRequest
     *        Represents the request to delete a user pool client.
     * @return A Java Future containing the result of the DeleteUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserPoolClientResult> deleteUserPoolClientAsync(DeleteUserPoolClientRequest deleteUserPoolClientRequest);

    /**
     * <p>
     * Allows the developer to delete the user pool client.
     * </p>
     * 
     * @param deleteUserPoolClientRequest
     *        Represents the request to delete a user pool client.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserPoolClientResult> deleteUserPoolClientAsync(DeleteUserPoolClientRequest deleteUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPoolClientRequest, DeleteUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Deletes a domain for a user pool.
     * </p>
     * 
     * @param deleteUserPoolDomainRequest
     * @return A Java Future containing the result of the DeleteUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserPoolDomainResult> deleteUserPoolDomainAsync(DeleteUserPoolDomainRequest deleteUserPoolDomainRequest);

    /**
     * <p>
     * Deletes a domain for a user pool.
     * </p>
     * 
     * @param deleteUserPoolDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DeleteUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeleteUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserPoolDomainResult> deleteUserPoolDomainAsync(DeleteUserPoolDomainRequest deleteUserPoolDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPoolDomainRequest, DeleteUserPoolDomainResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific identity provider.
     * </p>
     * 
     * @param describeIdentityProviderRequest
     * @return A Java Future containing the result of the DescribeIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityProviderResult> describeIdentityProviderAsync(DescribeIdentityProviderRequest describeIdentityProviderRequest);

    /**
     * <p>
     * Gets information about a specific identity provider.
     * </p>
     * 
     * @param describeIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DescribeIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeIdentityProviderResult> describeIdentityProviderAsync(DescribeIdentityProviderRequest describeIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeIdentityProviderRequest, DescribeIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Describes a resource server.
     * </p>
     * 
     * @param describeResourceServerRequest
     * @return A Java Future containing the result of the DescribeResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceServerResult> describeResourceServerAsync(DescribeResourceServerRequest describeResourceServerRequest);

    /**
     * <p>
     * Describes a resource server.
     * </p>
     * 
     * @param describeResourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DescribeResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceServerResult> describeResourceServerAsync(DescribeResourceServerRequest describeResourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceServerRequest, DescribeResourceServerResult> asyncHandler);

    /**
     * <p>
     * Describes the risk configuration.
     * </p>
     * 
     * @param describeRiskConfigurationRequest
     * @return A Java Future containing the result of the DescribeRiskConfiguration operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRiskConfigurationResult> describeRiskConfigurationAsync(
            DescribeRiskConfigurationRequest describeRiskConfigurationRequest);

    /**
     * <p>
     * Describes the risk configuration.
     * </p>
     * 
     * @param describeRiskConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRiskConfiguration operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DescribeRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRiskConfigurationResult> describeRiskConfigurationAsync(
            DescribeRiskConfigurationRequest describeRiskConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRiskConfigurationRequest, DescribeRiskConfigurationResult> asyncHandler);

    /**
     * <p>
     * Describes the user import job.
     * </p>
     * 
     * @param describeUserImportJobRequest
     *        Represents the request to describe the user import job.
     * @return A Java Future containing the result of the DescribeUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserImportJobResult> describeUserImportJobAsync(DescribeUserImportJobRequest describeUserImportJobRequest);

    /**
     * <p>
     * Describes the user import job.
     * </p>
     * 
     * @param describeUserImportJobRequest
     *        Represents the request to describe the user import job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DescribeUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserImportJobResult> describeUserImportJobAsync(DescribeUserImportJobRequest describeUserImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserImportJobRequest, DescribeUserImportJobResult> asyncHandler);

    /**
     * <p>
     * Returns the configuration information and metadata of the specified user pool.
     * </p>
     * 
     * @param describeUserPoolRequest
     *        Represents the request to describe the user pool.
     * @return A Java Future containing the result of the DescribeUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserPoolResult> describeUserPoolAsync(DescribeUserPoolRequest describeUserPoolRequest);

    /**
     * <p>
     * Returns the configuration information and metadata of the specified user pool.
     * </p>
     * 
     * @param describeUserPoolRequest
     *        Represents the request to describe the user pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DescribeUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPool" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserPoolResult> describeUserPoolAsync(DescribeUserPoolRequest describeUserPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserPoolRequest, DescribeUserPoolResult> asyncHandler);

    /**
     * <p>
     * Client method for returning the configuration information and metadata of the specified user pool app client.
     * </p>
     * 
     * @param describeUserPoolClientRequest
     *        Represents the request to describe a user pool client.
     * @return A Java Future containing the result of the DescribeUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(DescribeUserPoolClientRequest describeUserPoolClientRequest);

    /**
     * <p>
     * Client method for returning the configuration information and metadata of the specified user pool app client.
     * </p>
     * 
     * @param describeUserPoolClientRequest
     *        Represents the request to describe a user pool client.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DescribeUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(DescribeUserPoolClientRequest describeUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserPoolClientRequest, DescribeUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Gets information about a domain.
     * </p>
     * 
     * @param describeUserPoolDomainRequest
     * @return A Java Future containing the result of the DescribeUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserPoolDomainResult> describeUserPoolDomainAsync(DescribeUserPoolDomainRequest describeUserPoolDomainRequest);

    /**
     * <p>
     * Gets information about a domain.
     * </p>
     * 
     * @param describeUserPoolDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.DescribeUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DescribeUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserPoolDomainResult> describeUserPoolDomainAsync(DescribeUserPoolDomainRequest describeUserPoolDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserPoolDomainRequest, DescribeUserPoolDomainResult> asyncHandler);

    /**
     * <p>
     * Forgets the specified device.
     * </p>
     * 
     * @param forgetDeviceRequest
     *        Represents the request to forget the device.
     * @return A Java Future containing the result of the ForgetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ForgetDeviceResult> forgetDeviceAsync(ForgetDeviceRequest forgetDeviceRequest);

    /**
     * <p>
     * Forgets the specified device.
     * </p>
     * 
     * @param forgetDeviceRequest
     *        Represents the request to forget the device.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ForgetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ForgetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ForgetDeviceResult> forgetDeviceAsync(ForgetDeviceRequest forgetDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<ForgetDeviceRequest, ForgetDeviceResult> asyncHandler);

    /**
     * <p>
     * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change
     * the user's password. For the <code>Username</code> parameter, you can use the username or user alias. If a
     * verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a
     * verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a
     * verified email exists, <code>InvalidParameterException</code> is thrown. To use the confirmation code for
     * resetting the password, call .
     * </p>
     * 
     * @param forgotPasswordRequest
     *        Represents the request to reset a user's password.
     * @return A Java Future containing the result of the ForgotPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgotPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ForgotPasswordResult> forgotPasswordAsync(ForgotPasswordRequest forgotPasswordRequest);

    /**
     * <p>
     * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change
     * the user's password. For the <code>Username</code> parameter, you can use the username or user alias. If a
     * verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a
     * verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a
     * verified email exists, <code>InvalidParameterException</code> is thrown. To use the confirmation code for
     * resetting the password, call .
     * </p>
     * 
     * @param forgotPasswordRequest
     *        Represents the request to reset a user's password.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ForgotPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ForgotPassword
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ForgotPassword" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ForgotPasswordResult> forgotPasswordAsync(ForgotPasswordRequest forgotPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ForgotPasswordRequest, ForgotPasswordResult> asyncHandler);

    /**
     * <p>
     * Gets the header information for the .csv file to be used as input for the user import job.
     * </p>
     * 
     * @param getCSVHeaderRequest
     *        Represents the request to get the header information for the .csv file for the user import job.
     * @return A Java Future containing the result of the GetCSVHeader operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetCSVHeader
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetCSVHeader" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCSVHeaderResult> getCSVHeaderAsync(GetCSVHeaderRequest getCSVHeaderRequest);

    /**
     * <p>
     * Gets the header information for the .csv file to be used as input for the user import job.
     * </p>
     * 
     * @param getCSVHeaderRequest
     *        Represents the request to get the header information for the .csv file for the user import job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCSVHeader operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetCSVHeader
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetCSVHeader" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCSVHeaderResult> getCSVHeaderAsync(GetCSVHeaderRequest getCSVHeaderRequest,
            com.amazonaws.handlers.AsyncHandler<GetCSVHeaderRequest, GetCSVHeaderResult> asyncHandler);

    /**
     * <p>
     * Gets the device.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents the request to get the device.
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Gets the device.
     * </p>
     * 
     * @param getDeviceRequest
     *        Represents the request to get the device.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets a group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param getGroupRequest
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Gets a group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param getGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(GetGroupRequest getGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler);

    /**
     * <p>
     * Gets the specified identity provider.
     * </p>
     * 
     * @param getIdentityProviderByIdentifierRequest
     * @return A Java Future containing the result of the GetIdentityProviderByIdentifier operation returned by the
     *         service.
     * @sample AWSCognitoIdentityProviderAsync.GetIdentityProviderByIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetIdentityProviderByIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityProviderByIdentifierResult> getIdentityProviderByIdentifierAsync(
            GetIdentityProviderByIdentifierRequest getIdentityProviderByIdentifierRequest);

    /**
     * <p>
     * Gets the specified identity provider.
     * </p>
     * 
     * @param getIdentityProviderByIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIdentityProviderByIdentifier operation returned by the
     *         service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetIdentityProviderByIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetIdentityProviderByIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetIdentityProviderByIdentifierResult> getIdentityProviderByIdentifierAsync(
            GetIdentityProviderByIdentifierRequest getIdentityProviderByIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<GetIdentityProviderByIdentifierRequest, GetIdentityProviderByIdentifierResult> asyncHandler);

    /**
     * <p>
     * This method takes a user pool ID, and returns the signing certificate.
     * </p>
     * 
     * @param getSigningCertificateRequest
     *        Request to get a signing certificate from Cognito.
     * @return A Java Future containing the result of the GetSigningCertificate operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetSigningCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetSigningCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSigningCertificateResult> getSigningCertificateAsync(GetSigningCertificateRequest getSigningCertificateRequest);

    /**
     * <p>
     * This method takes a user pool ID, and returns the signing certificate.
     * </p>
     * 
     * @param getSigningCertificateRequest
     *        Request to get a signing certificate from Cognito.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSigningCertificate operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetSigningCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetSigningCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSigningCertificateResult> getSigningCertificateAsync(GetSigningCertificateRequest getSigningCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetSigningCertificateRequest, GetSigningCertificateResult> asyncHandler);

    /**
     * <p>
     * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing
     * is set for the particular client, but there is an existing pool level customization (app <code>clientId</code>
     * will be <code>ALL</code>), then that is returned. If nothing is present, then an empty shape is returned.
     * </p>
     * 
     * @param getUICustomizationRequest
     * @return A Java Future containing the result of the GetUICustomization operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUICustomizationResult> getUICustomizationAsync(GetUICustomizationRequest getUICustomizationRequest);

    /**
     * <p>
     * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing
     * is set for the particular client, but there is an existing pool level customization (app <code>clientId</code>
     * will be <code>ALL</code>), then that is returned. If nothing is present, then an empty shape is returned.
     * </p>
     * 
     * @param getUICustomizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUICustomization operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUICustomizationResult> getUICustomizationAsync(GetUICustomizationRequest getUICustomizationRequest,
            com.amazonaws.handlers.AsyncHandler<GetUICustomizationRequest, GetUICustomizationResult> asyncHandler);

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * 
     * @param getUserRequest
     *        Represents the request to get information about the user.
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest);

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * 
     * @param getUserRequest
     *        Represents the request to get information about the user.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest getUserRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler);

    /**
     * <p>
     * Gets the user attribute verification code for the specified attribute name.
     * </p>
     * 
     * @param getUserAttributeVerificationCodeRequest
     *        Represents the request to get user attribute verification.
     * @return A Java Future containing the result of the GetUserAttributeVerificationCode operation returned by the
     *         service.
     * @sample AWSCognitoIdentityProviderAsync.GetUserAttributeVerificationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserAttributeVerificationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUserAttributeVerificationCodeResult> getUserAttributeVerificationCodeAsync(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest);

    /**
     * <p>
     * Gets the user attribute verification code for the specified attribute name.
     * </p>
     * 
     * @param getUserAttributeVerificationCodeRequest
     *        Represents the request to get user attribute verification.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserAttributeVerificationCode operation returned by the
     *         service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetUserAttributeVerificationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserAttributeVerificationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUserAttributeVerificationCodeResult> getUserAttributeVerificationCodeAsync(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserAttributeVerificationCodeRequest, GetUserAttributeVerificationCodeResult> asyncHandler);

    /**
     * <p>
     * Gets the user pool multi-factor authentication (MFA) configuration.
     * </p>
     * 
     * @param getUserPoolMfaConfigRequest
     * @return A Java Future containing the result of the GetUserPoolMfaConfig operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUserPoolMfaConfigResult> getUserPoolMfaConfigAsync(GetUserPoolMfaConfigRequest getUserPoolMfaConfigRequest);

    /**
     * <p>
     * Gets the user pool multi-factor authentication (MFA) configuration.
     * </p>
     * 
     * @param getUserPoolMfaConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserPoolMfaConfig operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetUserPoolMfaConfigResult> getUserPoolMfaConfigAsync(GetUserPoolMfaConfigRequest getUserPoolMfaConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserPoolMfaConfigRequest, GetUserPoolMfaConfigResult> asyncHandler);

    /**
     * <p>
     * Signs out users from all devices.
     * </p>
     * 
     * @param globalSignOutRequest
     *        Represents the request to sign out all devices.
     * @return A Java Future containing the result of the GlobalSignOut operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GlobalSignOut" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalSignOutResult> globalSignOutAsync(GlobalSignOutRequest globalSignOutRequest);

    /**
     * <p>
     * Signs out users from all devices.
     * </p>
     * 
     * @param globalSignOutRequest
     *        Represents the request to sign out all devices.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GlobalSignOut operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.GlobalSignOut
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GlobalSignOut" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GlobalSignOutResult> globalSignOutAsync(GlobalSignOutRequest globalSignOutRequest,
            com.amazonaws.handlers.AsyncHandler<GlobalSignOutRequest, GlobalSignOutResult> asyncHandler);

    /**
     * <p>
     * Initiates the authentication flow.
     * </p>
     * 
     * @param initiateAuthRequest
     *        Initiates the authentication request.
     * @return A Java Future containing the result of the InitiateAuth operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.InitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/InitiateAuth" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitiateAuthResult> initiateAuthAsync(InitiateAuthRequest initiateAuthRequest);

    /**
     * <p>
     * Initiates the authentication flow.
     * </p>
     * 
     * @param initiateAuthRequest
     *        Initiates the authentication request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateAuth operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.InitiateAuth
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/InitiateAuth" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InitiateAuthResult> initiateAuthAsync(InitiateAuthRequest initiateAuthRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateAuthRequest, InitiateAuthResult> asyncHandler);

    /**
     * <p>
     * Lists the devices.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the request to list the devices.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Lists the devices.
     * </p>
     * 
     * @param listDevicesRequest
     *        Represents the request to list the devices.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Lists the groups associated with a user pool.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists the groups associated with a user pool.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists information about all identity providers for a user pool.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @return A Java Future containing the result of the ListIdentityProviders operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest listIdentityProvidersRequest);

    /**
     * <p>
     * Lists information about all identity providers for a user pool.
     * </p>
     * 
     * @param listIdentityProvidersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIdentityProviders operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListIdentityProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListIdentityProviders"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIdentityProvidersResult> listIdentityProvidersAsync(ListIdentityProvidersRequest listIdentityProvidersRequest,
            com.amazonaws.handlers.AsyncHandler<ListIdentityProvidersRequest, ListIdentityProvidersResult> asyncHandler);

    /**
     * <p>
     * Lists the resource servers for a user pool.
     * </p>
     * 
     * @param listResourceServersRequest
     * @return A Java Future containing the result of the ListResourceServers operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListResourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListResourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceServersResult> listResourceServersAsync(ListResourceServersRequest listResourceServersRequest);

    /**
     * <p>
     * Lists the resource servers for a user pool.
     * </p>
     * 
     * @param listResourceServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceServers operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListResourceServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListResourceServers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceServersResult> listResourceServersAsync(ListResourceServersRequest listResourceServersRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceServersRequest, ListResourceServersResult> asyncHandler);

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito user pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by
     * purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags that are assigned to an Amazon Cognito user pool.
     * </p>
     * <p>
     * A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by
     * purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * You can use this action up to 10 times per second, per account.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the user import jobs.
     * </p>
     * 
     * @param listUserImportJobsRequest
     *        Represents the request to list the user import jobs.
     * @return A Java Future containing the result of the ListUserImportJobs operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListUserImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListUserImportJobsResult> listUserImportJobsAsync(ListUserImportJobsRequest listUserImportJobsRequest);

    /**
     * <p>
     * Lists the user import jobs.
     * </p>
     * 
     * @param listUserImportJobsRequest
     *        Represents the request to list the user import jobs.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserImportJobs operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListUserImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListUserImportJobsResult> listUserImportJobsAsync(ListUserImportJobsRequest listUserImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserImportJobsRequest, ListUserImportJobsResult> asyncHandler);

    /**
     * <p>
     * Lists the clients that have been created for the specified user pool.
     * </p>
     * 
     * @param listUserPoolClientsRequest
     *        Represents the request to list the user pool clients.
     * @return A Java Future containing the result of the ListUserPoolClients operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListUserPoolClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPoolClients"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserPoolClientsResult> listUserPoolClientsAsync(ListUserPoolClientsRequest listUserPoolClientsRequest);

    /**
     * <p>
     * Lists the clients that have been created for the specified user pool.
     * </p>
     * 
     * @param listUserPoolClientsRequest
     *        Represents the request to list the user pool clients.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserPoolClients operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListUserPoolClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPoolClients"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListUserPoolClientsResult> listUserPoolClientsAsync(ListUserPoolClientsRequest listUserPoolClientsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserPoolClientsRequest, ListUserPoolClientsResult> asyncHandler);

    /**
     * <p>
     * Lists the user pools associated with an AWS account.
     * </p>
     * 
     * @param listUserPoolsRequest
     *        Represents the request to list user pools.
     * @return A Java Future containing the result of the ListUserPools operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListUserPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPools" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserPoolsResult> listUserPoolsAsync(ListUserPoolsRequest listUserPoolsRequest);

    /**
     * <p>
     * Lists the user pools associated with an AWS account.
     * </p>
     * 
     * @param listUserPoolsRequest
     *        Represents the request to list user pools.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserPools operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListUserPools
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUserPools" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUserPoolsResult> listUserPoolsAsync(ListUserPoolsRequest listUserPoolsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserPoolsRequest, ListUserPoolsResult> asyncHandler);

    /**
     * <p>
     * Lists the users in the Amazon Cognito user pool.
     * </p>
     * 
     * @param listUsersRequest
     *        Represents the request to list users.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists the users in the Amazon Cognito user pool.
     * </p>
     * 
     * @param listUsersRequest
     *        Represents the request to list users.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Lists the users in the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param listUsersInGroupRequest
     * @return A Java Future containing the result of the ListUsersInGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListUsersInGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsersInGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListUsersInGroupResult> listUsersInGroupAsync(ListUsersInGroupRequest listUsersInGroupRequest);

    /**
     * <p>
     * Lists the users in the specified group.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param listUsersInGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsersInGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ListUsersInGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ListUsersInGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListUsersInGroupResult> listUsersInGroupAsync(ListUsersInGroupRequest listUsersInGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersInGroupRequest, ListUsersInGroupResult> asyncHandler);

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
     * </p>
     * 
     * @param resendConfirmationCodeRequest
     *        Represents the request to resend the confirmation code.
     * @return A Java Future containing the result of the ResendConfirmationCode operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ResendConfirmationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ResendConfirmationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResendConfirmationCodeResult> resendConfirmationCodeAsync(ResendConfirmationCodeRequest resendConfirmationCodeRequest);

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
     * </p>
     * 
     * @param resendConfirmationCodeRequest
     *        Represents the request to resend the confirmation code.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResendConfirmationCode operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.ResendConfirmationCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ResendConfirmationCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResendConfirmationCodeResult> resendConfirmationCodeAsync(ResendConfirmationCodeRequest resendConfirmationCodeRequest,
            com.amazonaws.handlers.AsyncHandler<ResendConfirmationCodeRequest, ResendConfirmationCodeResult> asyncHandler);

    /**
     * <p>
     * Responds to the authentication challenge.
     * </p>
     * 
     * @param respondToAuthChallengeRequest
     *        The request to respond to an authentication challenge.
     * @return A Java Future containing the result of the RespondToAuthChallenge operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.RespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RespondToAuthChallengeResult> respondToAuthChallengeAsync(RespondToAuthChallengeRequest respondToAuthChallengeRequest);

    /**
     * <p>
     * Responds to the authentication challenge.
     * </p>
     * 
     * @param respondToAuthChallengeRequest
     *        The request to respond to an authentication challenge.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RespondToAuthChallenge operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.RespondToAuthChallenge
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/RespondToAuthChallenge"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RespondToAuthChallengeResult> respondToAuthChallengeAsync(RespondToAuthChallengeRequest respondToAuthChallengeRequest,
            com.amazonaws.handlers.AsyncHandler<RespondToAuthChallengeRequest, RespondToAuthChallengeResult> asyncHandler);

    /**
     * <p>
     * Configures actions on detected risks. To delete the risk configuration for <code>UserPoolId</code> or
     * <code>ClientId</code>, pass null values for all four configuration types.
     * </p>
     * <p>
     * To enable Amazon Cognito advanced security features, update the user pool to include the
     * <code>UserPoolAddOns</code> key<code>AdvancedSecurityMode</code>.
     * </p>
     * <p>
     * See .
     * </p>
     * 
     * @param setRiskConfigurationRequest
     * @return A Java Future containing the result of the SetRiskConfiguration operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.SetRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetRiskConfigurationResult> setRiskConfigurationAsync(SetRiskConfigurationRequest setRiskConfigurationRequest);

    /**
     * <p>
     * Configures actions on detected risks. To delete the risk configuration for <code>UserPoolId</code> or
     * <code>ClientId</code>, pass null values for all four configuration types.
     * </p>
     * <p>
     * To enable Amazon Cognito advanced security features, update the user pool to include the
     * <code>UserPoolAddOns</code> key<code>AdvancedSecurityMode</code>.
     * </p>
     * <p>
     * See .
     * </p>
     * 
     * @param setRiskConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetRiskConfiguration operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.SetRiskConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetRiskConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetRiskConfigurationResult> setRiskConfigurationAsync(SetRiskConfigurationRequest setRiskConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<SetRiskConfigurationRequest, SetRiskConfigurationResult> asyncHandler);

    /**
     * <p>
     * Sets the UI customization information for a user pool's built-in app UI.
     * </p>
     * <p>
     * You can specify app UI customization settings for a single client (with a specific <code>clientId</code>) or for
     * all clients (by setting the <code>clientId</code> to <code>ALL</code>). If you specify <code>ALL</code>, the
     * default configuration will be used for every client that has no UI customization set previously. If you specify
     * UI customization settings for a particular client, it will no longer fall back to the <code>ALL</code>
     * configuration.
     * </p>
     * <note>
     * <p>
     * To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the
     * app's pages, and the service will throw an error.
     * </p>
     * </note>
     * 
     * @param setUICustomizationRequest
     * @return A Java Future containing the result of the SetUICustomization operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.SetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetUICustomizationResult> setUICustomizationAsync(SetUICustomizationRequest setUICustomizationRequest);

    /**
     * <p>
     * Sets the UI customization information for a user pool's built-in app UI.
     * </p>
     * <p>
     * You can specify app UI customization settings for a single client (with a specific <code>clientId</code>) or for
     * all clients (by setting the <code>clientId</code> to <code>ALL</code>). If you specify <code>ALL</code>, the
     * default configuration will be used for every client that has no UI customization set previously. If you specify
     * UI customization settings for a particular client, it will no longer fall back to the <code>ALL</code>
     * configuration.
     * </p>
     * <note>
     * <p>
     * To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the
     * app's pages, and the service will throw an error.
     * </p>
     * </note>
     * 
     * @param setUICustomizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetUICustomization operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.SetUICustomization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUICustomization" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetUICustomizationResult> setUICustomizationAsync(SetUICustomizationRequest setUICustomizationRequest,
            com.amazonaws.handlers.AsyncHandler<SetUICustomizationRequest, SetUICustomizationResult> asyncHandler);

    /**
     * <p>
     * Set the user's multi-factor authentication (MFA) method preference.
     * </p>
     * 
     * @param setUserMFAPreferenceRequest
     * @return A Java Future containing the result of the SetUserMFAPreference operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.SetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetUserMFAPreferenceResult> setUserMFAPreferenceAsync(SetUserMFAPreferenceRequest setUserMFAPreferenceRequest);

    /**
     * <p>
     * Set the user's multi-factor authentication (MFA) method preference.
     * </p>
     * 
     * @param setUserMFAPreferenceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetUserMFAPreference operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.SetUserMFAPreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserMFAPreference"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetUserMFAPreferenceResult> setUserMFAPreferenceAsync(SetUserMFAPreferenceRequest setUserMFAPreferenceRequest,
            com.amazonaws.handlers.AsyncHandler<SetUserMFAPreferenceRequest, SetUserMFAPreferenceResult> asyncHandler);

    /**
     * <p>
     * Set the user pool MFA configuration.
     * </p>
     * 
     * @param setUserPoolMfaConfigRequest
     * @return A Java Future containing the result of the SetUserPoolMfaConfig operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.SetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetUserPoolMfaConfigResult> setUserPoolMfaConfigAsync(SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest);

    /**
     * <p>
     * Set the user pool MFA configuration.
     * </p>
     * 
     * @param setUserPoolMfaConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetUserPoolMfaConfig operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.SetUserPoolMfaConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserPoolMfaConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetUserPoolMfaConfigResult> setUserPoolMfaConfigAsync(SetUserPoolMfaConfigRequest setUserPoolMfaConfigRequest,
            com.amazonaws.handlers.AsyncHandler<SetUserPoolMfaConfigRequest, SetUserPoolMfaConfigResult> asyncHandler);

    /**
     * <p>
     * Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute
     * pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.
     * </p>
     * 
     * @param setUserSettingsRequest
     *        Represents the request to set user settings.
     * @return A Java Future containing the result of the SetUserSettings operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.SetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetUserSettingsResult> setUserSettingsAsync(SetUserSettingsRequest setUserSettingsRequest);

    /**
     * <p>
     * Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute
     * pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.
     * </p>
     * 
     * @param setUserSettingsRequest
     *        Represents the request to set user settings.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetUserSettings operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.SetUserSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SetUserSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SetUserSettingsResult> setUserSettingsAsync(SetUserSettingsRequest setUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<SetUserSettingsRequest, SetUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user name, password, and user attributes.
     * </p>
     * 
     * @param signUpRequest
     *        Represents the request to register a user.
     * @return A Java Future containing the result of the SignUp operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.SignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SignUp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SignUpResult> signUpAsync(SignUpRequest signUpRequest);

    /**
     * <p>
     * Registers the user in the specified user pool and creates a user name, password, and user attributes.
     * </p>
     * 
     * @param signUpRequest
     *        Represents the request to register a user.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SignUp operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.SignUp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SignUp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SignUpResult> signUpAsync(SignUpRequest signUpRequest,
            com.amazonaws.handlers.AsyncHandler<SignUpRequest, SignUpResult> asyncHandler);

    /**
     * <p>
     * Starts the user import.
     * </p>
     * 
     * @param startUserImportJobRequest
     *        Represents the request to start the user import job.
     * @return A Java Future containing the result of the StartUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.StartUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StartUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartUserImportJobResult> startUserImportJobAsync(StartUserImportJobRequest startUserImportJobRequest);

    /**
     * <p>
     * Starts the user import.
     * </p>
     * 
     * @param startUserImportJobRequest
     *        Represents the request to start the user import job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.StartUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StartUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartUserImportJobResult> startUserImportJobAsync(StartUserImportJobRequest startUserImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartUserImportJobRequest, StartUserImportJobResult> asyncHandler);

    /**
     * <p>
     * Stops the user import job.
     * </p>
     * 
     * @param stopUserImportJobRequest
     *        Represents the request to stop the user import job.
     * @return A Java Future containing the result of the StopUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.StopUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StopUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopUserImportJobResult> stopUserImportJobAsync(StopUserImportJobRequest stopUserImportJobRequest);

    /**
     * <p>
     * Stops the user import job.
     * </p>
     * 
     * @param stopUserImportJobRequest
     *        Represents the request to stop the user import job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.StopUserImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/StopUserImportJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopUserImportJobResult> stopUserImportJobAsync(StopUserImportJobRequest stopUserImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopUserImportJobRequest, StopUserImportJobResult> asyncHandler);

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is a general category for more specific
     * values. For example, if you have two versions of a user pool, one for testing and another for production, you
     * might assign an <code>Environment</code> tag key to both user pools. The value of this key might be
     * <code>Test</code> for one user pool and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
     * Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM
     * policy, you can constrain permissions for user pools based on specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage
     * user pools in different ways, such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Each tag consists of a key and value, both of which you define. A key is a general category for more specific
     * values. For example, if you have two versions of a user pool, one for testing and another for production, you
     * might assign an <code>Environment</code> tag key to both user pools. The value of this key might be
     * <code>Test</code> for one user pool and <code>Production</code> for the other.
     * </p>
     * <p>
     * Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the
     * Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM
     * policy, you can constrain permissions for user pools based on specific tags or tag values.
     * </p>
     * <p>
     * You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second,
     * per account
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second,
     * per account
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used
     * for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param updateAuthEventFeedbackRequest
     * @return A Java Future containing the result of the UpdateAuthEventFeedback operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAuthEventFeedbackResult> updateAuthEventFeedbackAsync(UpdateAuthEventFeedbackRequest updateAuthEventFeedbackRequest);

    /**
     * <p>
     * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used
     * for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
     * </p>
     * 
     * @param updateAuthEventFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAuthEventFeedback operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateAuthEventFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateAuthEventFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAuthEventFeedbackResult> updateAuthEventFeedbackAsync(UpdateAuthEventFeedbackRequest updateAuthEventFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAuthEventFeedbackRequest, UpdateAuthEventFeedbackResult> asyncHandler);

    /**
     * <p>
     * Updates the device status.
     * </p>
     * 
     * @param updateDeviceStatusRequest
     *        Represents the request to update the device status.
     * @return A Java Future containing the result of the UpdateDeviceStatus operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateDeviceStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceStatusResult> updateDeviceStatusAsync(UpdateDeviceStatusRequest updateDeviceStatusRequest);

    /**
     * <p>
     * Updates the device status.
     * </p>
     * 
     * @param updateDeviceStatusRequest
     *        Represents the request to update the device status.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeviceStatus operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateDeviceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateDeviceStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceStatusResult> updateDeviceStatusAsync(UpdateDeviceStatusRequest updateDeviceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceStatusRequest, UpdateDeviceStatusResult> asyncHandler);

    /**
     * <p>
     * Updates the specified group with the specified attributes.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param updateGroupRequest
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Updates the specified group with the specified attributes.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param updateGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGroup operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest updateGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler);

    /**
     * <p>
     * Updates identity provider information for a user pool.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @return A Java Future containing the result of the UpdateIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(UpdateIdentityProviderRequest updateIdentityProviderRequest);

    /**
     * <p>
     * Updates identity provider information for a user pool.
     * </p>
     * 
     * @param updateIdentityProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIdentityProvider operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateIdentityProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateIdentityProvider"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateIdentityProviderResult> updateIdentityProviderAsync(UpdateIdentityProviderRequest updateIdentityProviderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIdentityProviderRequest, UpdateIdentityProviderResult> asyncHandler);

    /**
     * <p>
     * Updates the name and scopes of resource server. All other fields are read-only.
     * </p>
     * 
     * @param updateResourceServerRequest
     * @return A Java Future containing the result of the UpdateResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceServerResult> updateResourceServerAsync(UpdateResourceServerRequest updateResourceServerRequest);

    /**
     * <p>
     * Updates the name and scopes of resource server. All other fields are read-only.
     * </p>
     * 
     * @param updateResourceServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceServer operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateResourceServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateResourceServer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceServerResult> updateResourceServerAsync(UpdateResourceServerRequest updateResourceServerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceServerRequest, UpdateResourceServerResult> asyncHandler);

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     * 
     * @param updateUserAttributesRequest
     *        Represents the request to update user attributes.
     * @return A Java Future containing the result of the UpdateUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserAttributesResult> updateUserAttributesAsync(UpdateUserAttributesRequest updateUserAttributesRequest);

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     * 
     * @param updateUserAttributesRequest
     *        Represents the request to update user attributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateUserAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserAttributesResult> updateUserAttributesAsync(UpdateUserAttributesRequest updateUserAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserAttributesRequest, UpdateUserAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it
     * will be set to the default value. You can get a list of the current user pool settings with .
     * </p>
     * 
     * @param updateUserPoolRequest
     *        Represents the request to update the user pool.
     * @return A Java Future containing the result of the UpdateUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(UpdateUserPoolRequest updateUserPoolRequest);

    /**
     * <p>
     * Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it
     * will be set to the default value. You can get a list of the current user pool settings with .
     * </p>
     * 
     * @param updateUserPoolRequest
     *        Represents the request to update the user pool.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateUserPool
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPool" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(UpdateUserPoolRequest updateUserPoolRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPoolRequest, UpdateUserPoolResult> asyncHandler);

    /**
     * <p>
     * Updates the specified user pool app client with the specified attributes. If you don't provide a value for an
     * attribute, it will be set to the default value. You can get a list of the current user pool app client settings
     * with .
     * </p>
     * 
     * @param updateUserPoolClientRequest
     *        Represents the request to update the user pool client.
     * @return A Java Future containing the result of the UpdateUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(UpdateUserPoolClientRequest updateUserPoolClientRequest);

    /**
     * <p>
     * Updates the specified user pool app client with the specified attributes. If you don't provide a value for an
     * attribute, it will be set to the default value. You can get a list of the current user pool app client settings
     * with .
     * </p>
     * 
     * @param updateUserPoolClientRequest
     *        Represents the request to update the user pool client.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateUserPoolClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolClient"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(UpdateUserPoolClientRequest updateUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPoolClientRequest, UpdateUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool.
     * </p>
     * <p>
     * You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You
     * cannot use it to change the domain for a user pool.
     * </p>
     * <p>
     * A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your
     * application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate
     * Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your
     * custom domain.
     * </p>
     * <p>
     * Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing
     * certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new
     * certificate automatically.
     * </p>
     * <p>
     * However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To
     * apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito.
     * </p>
     * <p>
     * When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region.
     * </p>
     * <p>
     * After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your
     * custom domain.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     * 
     * @param updateUserPoolDomainRequest
     *        The UpdateUserPoolDomain request input.
     * @return A Java Future containing the result of the UpdateUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPoolDomainResult> updateUserPoolDomainAsync(UpdateUserPoolDomainRequest updateUserPoolDomainRequest);

    /**
     * <p>
     * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool.
     * </p>
     * <p>
     * You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You
     * cannot use it to change the domain for a user pool.
     * </p>
     * <p>
     * A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your
     * application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate
     * Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your
     * custom domain.
     * </p>
     * <p>
     * Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing
     * certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new
     * certificate automatically.
     * </p>
     * <p>
     * However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To
     * apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito.
     * </p>
     * <p>
     * When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region.
     * </p>
     * <p>
     * After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your
     * custom domain.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html">Using
     * Your Own Domain for the Hosted UI</a>.
     * </p>
     * 
     * @param updateUserPoolDomainRequest
     *        The UpdateUserPoolDomain request input.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserPoolDomain operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.UpdateUserPoolDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UpdateUserPoolDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserPoolDomainResult> updateUserPoolDomainAsync(UpdateUserPoolDomainRequest updateUserPoolDomainRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPoolDomainRequest, UpdateUserPoolDomainResult> asyncHandler);

    /**
     * <p>
     * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified"
     * if successful. The request takes an access token or a session string, but not both.
     * </p>
     * 
     * @param verifySoftwareTokenRequest
     * @return A Java Future containing the result of the VerifySoftwareToken operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.VerifySoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifySoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VerifySoftwareTokenResult> verifySoftwareTokenAsync(VerifySoftwareTokenRequest verifySoftwareTokenRequest);

    /**
     * <p>
     * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified"
     * if successful. The request takes an access token or a session string, but not both.
     * </p>
     * 
     * @param verifySoftwareTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifySoftwareToken operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.VerifySoftwareToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifySoftwareToken"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VerifySoftwareTokenResult> verifySoftwareTokenAsync(VerifySoftwareTokenRequest verifySoftwareTokenRequest,
            com.amazonaws.handlers.AsyncHandler<VerifySoftwareTokenRequest, VerifySoftwareTokenResult> asyncHandler);

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     * 
     * @param verifyUserAttributeRequest
     *        Represents the request to verify user attributes.
     * @return A Java Future containing the result of the VerifyUserAttribute operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.VerifyUserAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifyUserAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VerifyUserAttributeResult> verifyUserAttributeAsync(VerifyUserAttributeRequest verifyUserAttributeRequest);

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     * 
     * @param verifyUserAttributeRequest
     *        Represents the request to verify user attributes.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the VerifyUserAttribute operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.VerifyUserAttribute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/VerifyUserAttribute"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<VerifyUserAttributeResult> verifyUserAttributeAsync(VerifyUserAttributeRequest verifyUserAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyUserAttributeRequest, VerifyUserAttributeResult> asyncHandler);

}
