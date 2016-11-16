/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Using the Amazon Cognito Your User Pools API, you can create a user pool to manage directories and users. You can
 * authenticate a user to obtain tokens related to user identity and access policies.
 * </p>
 * <p>
 * This API reference provides information about user pools in Amazon Cognito Your User Pools.
 * </p>
 * <p>
 * For more information, see the Amazon Cognito Documentation.
 * </p>
 */
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
     */
    java.util.concurrent.Future<AddCustomAttributesResult> addCustomAttributesAsync(AddCustomAttributesRequest addCustomAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<AddCustomAttributesRequest, AddCustomAttributesResult> asyncHandler);

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code. Works on any user.
     * </p>
     * 
     * @param adminConfirmSignUpRequest
     *        Represents the request to confirm user registration.
     * @return A Java Future containing the result of the AdminConfirmSignUp operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminConfirmSignUp
     */
    java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(AdminConfirmSignUpRequest adminConfirmSignUpRequest);

    /**
     * <p>
     * Confirms user registration as an admin without using a confirmation code. Works on any user.
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
     */
    java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(AdminConfirmSignUpRequest adminConfirmSignUpRequest,
            com.amazonaws.handlers.AsyncHandler<AdminConfirmSignUpRequest, AdminConfirmSignUpResult> asyncHandler);

    /**
     * <p>
     * Creates a new user in the specified user pool and sends a welcome message via email or phone (SMS). This message
     * is based on a template that you configured in your call to CreateUserPool or UpdateUserPool. This template
     * includes your custom sign-up instructions and placeholders for user name and temporary password.
     * </p>
     * <p>
     * Requires developer credentials.
     * </p>
     * 
     * @param adminCreateUserRequest
     *        Represents the request to create a user in the specified user pool.
     * @return A Java Future containing the result of the AdminCreateUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminCreateUser
     */
    java.util.concurrent.Future<AdminCreateUserResult> adminCreateUserAsync(AdminCreateUserRequest adminCreateUserRequest);

    /**
     * <p>
     * Creates a new user in the specified user pool and sends a welcome message via email or phone (SMS). This message
     * is based on a template that you configured in your call to CreateUserPool or UpdateUserPool. This template
     * includes your custom sign-up instructions and placeholders for user name and temporary password.
     * </p>
     * <p>
     * Requires developer credentials.
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
     */
    java.util.concurrent.Future<AdminCreateUserResult> adminCreateUserAsync(AdminCreateUserRequest adminCreateUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminCreateUserRequest, AdminCreateUserResult> asyncHandler);

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
     * </p>
     * 
     * @param adminDeleteUserRequest
     *        Represents the request to delete a user as an administrator.
     * @return A Java Future containing the result of the AdminDeleteUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminDeleteUser
     */
    java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(AdminDeleteUserRequest adminDeleteUserRequest);

    /**
     * <p>
     * Deletes a user as an administrator. Works on any user.
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
     */
    java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(AdminDeleteUserRequest adminDeleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminDeleteUserRequest, AdminDeleteUserResult> asyncHandler);

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on any user.
     * </p>
     * 
     * @param adminDeleteUserAttributesRequest
     *        Represents the request to delete user attributes as an administrator.
     * @return A Java Future containing the result of the AdminDeleteUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminDeleteUserAttributes
     */
    java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(
            AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest);

    /**
     * <p>
     * Deletes the user attributes in a user pool as an administrator. Works on any user.
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
     */
    java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(
            AdminDeleteUserAttributesRequest adminDeleteUserAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<AdminDeleteUserAttributesRequest, AdminDeleteUserAttributesResult> asyncHandler);

    /**
     * <p>
     * Disables the specified user as an administrator. Works on any user.
     * </p>
     * 
     * @param adminDisableUserRequest
     *        Represents the request to disable any user as an administrator.
     * @return A Java Future containing the result of the AdminDisableUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminDisableUser
     */
    java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(AdminDisableUserRequest adminDisableUserRequest);

    /**
     * <p>
     * Disables the specified user as an administrator. Works on any user.
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
     */
    java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(AdminDisableUserRequest adminDisableUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminDisableUserRequest, AdminDisableUserResult> asyncHandler);

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
     * </p>
     * 
     * @param adminEnableUserRequest
     *        Represents the request that enables the user as an administrator.
     * @return A Java Future containing the result of the AdminEnableUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminEnableUser
     */
    java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(AdminEnableUserRequest adminEnableUserRequest);

    /**
     * <p>
     * Enables the specified user as an administrator. Works on any user.
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
     */
    java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(AdminEnableUserRequest adminEnableUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminEnableUserRequest, AdminEnableUserResult> asyncHandler);

    /**
     * <p>
     * Forgets the device, as an administrator.
     * </p>
     * 
     * @param adminForgetDeviceRequest
     *        Sends the forgot device request, as an administrator.
     * @return A Java Future containing the result of the AdminForgetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminForgetDevice
     */
    java.util.concurrent.Future<AdminForgetDeviceResult> adminForgetDeviceAsync(AdminForgetDeviceRequest adminForgetDeviceRequest);

    /**
     * <p>
     * Forgets the device, as an administrator.
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
     */
    java.util.concurrent.Future<AdminForgetDeviceResult> adminForgetDeviceAsync(AdminForgetDeviceRequest adminForgetDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<AdminForgetDeviceRequest, AdminForgetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets the device, as an administrator.
     * </p>
     * 
     * @param adminGetDeviceRequest
     *        Represents the request to get the device, as an administrator.
     * @return A Java Future containing the result of the AdminGetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminGetDevice
     */
    java.util.concurrent.Future<AdminGetDeviceResult> adminGetDeviceAsync(AdminGetDeviceRequest adminGetDeviceRequest);

    /**
     * <p>
     * Gets the device, as an administrator.
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
     */
    java.util.concurrent.Future<AdminGetDeviceResult> adminGetDeviceAsync(AdminGetDeviceRequest adminGetDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<AdminGetDeviceRequest, AdminGetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator. Works on any user.
     * </p>
     * 
     * @param adminGetUserRequest
     *        Represents the request to get the specified user as an administrator.
     * @return A Java Future containing the result of the AdminGetUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminGetUser
     */
    java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(AdminGetUserRequest adminGetUserRequest);

    /**
     * <p>
     * Gets the specified user by user name in a user pool as an administrator. Works on any user.
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
     */
    java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(AdminGetUserRequest adminGetUserRequest,
            com.amazonaws.handlers.AsyncHandler<AdminGetUserRequest, AdminGetUserResult> asyncHandler);

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
     * </p>
     * 
     * @param adminInitiateAuthRequest
     *        Initiates the authorization request, as an administrator.
     * @return A Java Future containing the result of the AdminInitiateAuth operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminInitiateAuth
     */
    java.util.concurrent.Future<AdminInitiateAuthResult> adminInitiateAuthAsync(AdminInitiateAuthRequest adminInitiateAuthRequest);

    /**
     * <p>
     * Initiates the authentication flow, as an administrator.
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
     */
    java.util.concurrent.Future<AdminInitiateAuthResult> adminInitiateAuthAsync(AdminInitiateAuthRequest adminInitiateAuthRequest,
            com.amazonaws.handlers.AsyncHandler<AdminInitiateAuthRequest, AdminInitiateAuthResult> asyncHandler);

    /**
     * <p>
     * Lists devices, as an administrator.
     * </p>
     * 
     * @param adminListDevicesRequest
     *        Represents the request to list devices, as an administrator.
     * @return A Java Future containing the result of the AdminListDevices operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminListDevices
     */
    java.util.concurrent.Future<AdminListDevicesResult> adminListDevicesAsync(AdminListDevicesRequest adminListDevicesRequest);

    /**
     * <p>
     * Lists devices, as an administrator.
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
     */
    java.util.concurrent.Future<AdminListDevicesResult> adminListDevicesAsync(AdminListDevicesRequest adminListDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<AdminListDevicesRequest, AdminListDevicesResult> asyncHandler);

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
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an administrator.
     * @return A Java Future containing the result of the AdminResetUserPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminResetUserPassword
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
     * 
     * @param adminResetUserPasswordRequest
     *        Represents the request to reset a user's password as an administrator.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AdminResetUserPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsyncHandler.AdminResetUserPassword
     */
    java.util.concurrent.Future<AdminResetUserPasswordResult> adminResetUserPasswordAsync(AdminResetUserPasswordRequest adminResetUserPasswordRequest,
            com.amazonaws.handlers.AsyncHandler<AdminResetUserPasswordRequest, AdminResetUserPasswordResult> asyncHandler);

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
     * </p>
     * 
     * @param adminRespondToAuthChallengeRequest
     *        The request to respond to the authentication challenge, as an administrator.
     * @return A Java Future containing the result of the AdminRespondToAuthChallenge operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminRespondToAuthChallenge
     */
    java.util.concurrent.Future<AdminRespondToAuthChallengeResult> adminRespondToAuthChallengeAsync(
            AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest);

    /**
     * <p>
     * Responds to an authentication challenge, as an administrator.
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
     */
    java.util.concurrent.Future<AdminRespondToAuthChallengeResult> adminRespondToAuthChallengeAsync(
            AdminRespondToAuthChallengeRequest adminRespondToAuthChallengeRequest,
            com.amazonaws.handlers.AsyncHandler<AdminRespondToAuthChallengeRequest, AdminRespondToAuthChallengeResult> asyncHandler);

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any user.
     * </p>
     * 
     * @param adminSetUserSettingsRequest
     *        Represents the request to set user settings as an administrator.
     * @return A Java Future containing the result of the AdminSetUserSettings operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminSetUserSettings
     */
    java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(AdminSetUserSettingsRequest adminSetUserSettingsRequest);

    /**
     * <p>
     * Sets all the user settings for a specified user name. Works on any user.
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
     */
    java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(AdminSetUserSettingsRequest adminSetUserSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<AdminSetUserSettingsRequest, AdminSetUserSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates the device status as an administrator.
     * </p>
     * 
     * @param adminUpdateDeviceStatusRequest
     *        The request to update the device status, as an administrator.
     * @return A Java Future containing the result of the AdminUpdateDeviceStatus operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminUpdateDeviceStatus
     */
    java.util.concurrent.Future<AdminUpdateDeviceStatusResult> adminUpdateDeviceStatusAsync(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest);

    /**
     * <p>
     * Updates the device status as an administrator.
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
     */
    java.util.concurrent.Future<AdminUpdateDeviceStatusResult> adminUpdateDeviceStatusAsync(AdminUpdateDeviceStatusRequest adminUpdateDeviceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<AdminUpdateDeviceStatusRequest, AdminUpdateDeviceStatusResult> asyncHandler);

    /**
     * <p>
     * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.
     * </p>
     * 
     * @param adminUpdateUserAttributesRequest
     *        Represents the request to update the user's attributes as an administrator.
     * @return A Java Future containing the result of the AdminUpdateUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminUpdateUserAttributes
     */
    java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(
            AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest);

    /**
     * <p>
     * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user.
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
     */
    java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(
            AdminUpdateUserAttributesRequest adminUpdateUserAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<AdminUpdateUserAttributesRequest, AdminUpdateUserAttributesResult> asyncHandler);

    /**
     * <p>
     * Signs out users from all devices, as an administrator.
     * </p>
     * 
     * @param adminUserGlobalSignOutRequest
     *        The request to sign out of all devices, as an administrator.
     * @return A Java Future containing the result of the AdminUserGlobalSignOut operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.AdminUserGlobalSignOut
     */
    java.util.concurrent.Future<AdminUserGlobalSignOutResult> adminUserGlobalSignOutAsync(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest);

    /**
     * <p>
     * Signs out users from all devices, as an administrator.
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
     */
    java.util.concurrent.Future<AdminUserGlobalSignOutResult> adminUserGlobalSignOutAsync(AdminUserGlobalSignOutRequest adminUserGlobalSignOutRequest,
            com.amazonaws.handlers.AsyncHandler<AdminUserGlobalSignOutRequest, AdminUserGlobalSignOutResult> asyncHandler);

    /**
     * <p>
     * Changes the password for a specified user in a user pool.
     * </p>
     * 
     * @param changePasswordRequest
     *        Represents the request to change a user password.
     * @return A Java Future containing the result of the ChangePassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ChangePassword
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
     */
    java.util.concurrent.Future<ChangePasswordResult> changePasswordAsync(ChangePasswordRequest changePasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ChangePasswordRequest, ChangePasswordResult> asyncHandler);

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that beings device tracking.
     * </p>
     * 
     * @param confirmDeviceRequest
     *        Confirms the device request.
     * @return A Java Future containing the result of the ConfirmDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ConfirmDevice
     */
    java.util.concurrent.Future<ConfirmDeviceResult> confirmDeviceAsync(ConfirmDeviceRequest confirmDeviceRequest);

    /**
     * <p>
     * Confirms tracking of the device. This API call is the call that beings device tracking.
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
     */
    java.util.concurrent.Future<ConfirmDeviceResult> confirmDeviceAsync(ConfirmDeviceRequest confirmDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmDeviceRequest, ConfirmDeviceResult> asyncHandler);

    /**
     * <p>
     * Allows a user to enter a code provided when they reset their password to update their password.
     * </p>
     * 
     * @param confirmForgotPasswordRequest
     *        The request representing the confirmation for a password reset.
     * @return A Java Future containing the result of the ConfirmForgotPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ConfirmForgotPassword
     */
    java.util.concurrent.Future<ConfirmForgotPasswordResult> confirmForgotPasswordAsync(ConfirmForgotPasswordRequest confirmForgotPasswordRequest);

    /**
     * <p>
     * Allows a user to enter a code provided when they reset their password to update their password.
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
     */
    java.util.concurrent.Future<ConfirmSignUpResult> confirmSignUpAsync(ConfirmSignUpRequest confirmSignUpRequest,
            com.amazonaws.handlers.AsyncHandler<ConfirmSignUpRequest, ConfirmSignUpResult> asyncHandler);

    /**
     * <p>
     * Creates the user import job.
     * </p>
     * 
     * @param createUserImportJobRequest
     *        Represents the request to create the user import job.
     * @return A Java Future containing the result of the CreateUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.CreateUserImportJob
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
     */
    java.util.concurrent.Future<CreateUserPoolClientResult> createUserPoolClientAsync(CreateUserPoolClientRequest createUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserPoolClientRequest, CreateUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Allows a user to delete one's self.
     * </p>
     * 
     * @param deleteUserRequest
     *        Represents the request to delete a user.
     * @return A Java Future containing the result of the DeleteUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DeleteUser
     */
    java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Allows a user to delete one's self.
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
     */
    java.util.concurrent.Future<DeleteUserPoolClientResult> deleteUserPoolClientAsync(DeleteUserPoolClientRequest deleteUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPoolClientRequest, DeleteUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Describes the user import job.
     * </p>
     * 
     * @param describeUserImportJobRequest
     *        Represents the request to describe the user import job.
     * @return A Java Future containing the result of the DescribeUserImportJob operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeUserImportJob
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
     */
    java.util.concurrent.Future<DescribeUserPoolResult> describeUserPoolAsync(DescribeUserPoolRequest describeUserPoolRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserPoolRequest, DescribeUserPoolResult> asyncHandler);

    /**
     * <p>
     * Client method for returning the configuration information and metadata of the specified user pool client.
     * </p>
     * 
     * @param describeUserPoolClientRequest
     *        Represents the request to describe a user pool client.
     * @return A Java Future containing the result of the DescribeUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.DescribeUserPoolClient
     */
    java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(DescribeUserPoolClientRequest describeUserPoolClientRequest);

    /**
     * <p>
     * Client method for returning the configuration information and metadata of the specified user pool client.
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
     */
    java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(DescribeUserPoolClientRequest describeUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserPoolClientRequest, DescribeUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Forgets the specified device.
     * </p>
     * 
     * @param forgetDeviceRequest
     *        Represents the request to forget the device.
     * @return A Java Future containing the result of the ForgetDevice operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ForgetDevice
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
     */
    java.util.concurrent.Future<ForgetDeviceResult> forgetDeviceAsync(ForgetDeviceRequest forgetDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<ForgetDeviceRequest, ForgetDeviceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the password for the specified client ID or username.
     * </p>
     * 
     * @param forgotPasswordRequest
     *        Represents the request to reset a user's password.
     * @return A Java Future containing the result of the ForgotPassword operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ForgotPassword
     */
    java.util.concurrent.Future<ForgotPasswordResult> forgotPasswordAsync(ForgotPasswordRequest forgotPasswordRequest);

    /**
     * <p>
     * Retrieves the password for the specified client ID or username.
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
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Gets the user attributes and metadata for a user.
     * </p>
     * 
     * @param getUserRequest
     *        Represents the request to get information about the user.
     * @return A Java Future containing the result of the GetUser operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GetUser
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
     */
    java.util.concurrent.Future<GetUserAttributeVerificationCodeResult> getUserAttributeVerificationCodeAsync(
            GetUserAttributeVerificationCodeRequest getUserAttributeVerificationCodeRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserAttributeVerificationCodeRequest, GetUserAttributeVerificationCodeResult> asyncHandler);

    /**
     * <p>
     * Signs out users from all devices.
     * </p>
     * 
     * @param globalSignOutRequest
     *        Represents the request to sign out all devices.
     * @return A Java Future containing the result of the GlobalSignOut operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.GlobalSignOut
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
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Lists the user import jobs.
     * </p>
     * 
     * @param listUserImportJobsRequest
     *        Represents the request to list the user import jobs.
     * @return A Java Future containing the result of the ListUserImportJobs operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ListUserImportJobs
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
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
     * </p>
     * 
     * @param resendConfirmationCodeRequest
     *        Represents the request to resend the confirmation code.
     * @return A Java Future containing the result of the ResendConfirmationCode operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.ResendConfirmationCode
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
     */
    java.util.concurrent.Future<RespondToAuthChallengeResult> respondToAuthChallengeAsync(RespondToAuthChallengeRequest respondToAuthChallengeRequest,
            com.amazonaws.handlers.AsyncHandler<RespondToAuthChallengeRequest, RespondToAuthChallengeResult> asyncHandler);

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
     */
    java.util.concurrent.Future<StopUserImportJobResult> stopUserImportJobAsync(StopUserImportJobRequest stopUserImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopUserImportJobRequest, StopUserImportJobResult> asyncHandler);

    /**
     * <p>
     * Updates the device status.
     * </p>
     * 
     * @param updateDeviceStatusRequest
     *        Represents the request to update the device status.
     * @return A Java Future containing the result of the UpdateDeviceStatus operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateDeviceStatus
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
     */
    java.util.concurrent.Future<UpdateDeviceStatusResult> updateDeviceStatusAsync(UpdateDeviceStatusRequest updateDeviceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceStatusRequest, UpdateDeviceStatusResult> asyncHandler);

    /**
     * <p>
     * Allows a user to update a specific attribute (one at a time).
     * </p>
     * 
     * @param updateUserAttributesRequest
     *        Represents the request to update user attributes.
     * @return A Java Future containing the result of the UpdateUserAttributes operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateUserAttributes
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
     */
    java.util.concurrent.Future<UpdateUserAttributesResult> updateUserAttributesAsync(UpdateUserAttributesRequest updateUserAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserAttributesRequest, UpdateUserAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates the specified user pool with the specified attributes.
     * </p>
     * 
     * @param updateUserPoolRequest
     *        Represents the request to update the user pool.
     * @return A Java Future containing the result of the UpdateUserPool operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateUserPool
     */
    java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(UpdateUserPoolRequest updateUserPoolRequest);

    /**
     * <p>
     * Updates the specified user pool with the specified attributes.
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
     */
    java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(UpdateUserPoolRequest updateUserPoolRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPoolRequest, UpdateUserPoolResult> asyncHandler);

    /**
     * <p>
     * Allows the developer to update the specified user pool client and password policy.
     * </p>
     * 
     * @param updateUserPoolClientRequest
     *        Represents the request to update the user pool client.
     * @return A Java Future containing the result of the UpdateUserPoolClient operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.UpdateUserPoolClient
     */
    java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(UpdateUserPoolClientRequest updateUserPoolClientRequest);

    /**
     * <p>
     * Allows the developer to update the specified user pool client and password policy.
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
     */
    java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(UpdateUserPoolClientRequest updateUserPoolClientRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPoolClientRequest, UpdateUserPoolClientResult> asyncHandler);

    /**
     * <p>
     * Verifies the specified user attributes in the user pool.
     * </p>
     * 
     * @param verifyUserAttributeRequest
     *        Represents the request to verify user attributes.
     * @return A Java Future containing the result of the VerifyUserAttribute operation returned by the service.
     * @sample AWSCognitoIdentityProviderAsync.VerifyUserAttribute
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
     */
    java.util.concurrent.Future<VerifyUserAttributeResult> verifyUserAttributeAsync(VerifyUserAttributeRequest verifyUserAttributeRequest,
            com.amazonaws.handlers.AsyncHandler<VerifyUserAttributeRequest, VerifyUserAttributeResult> asyncHandler);

}
