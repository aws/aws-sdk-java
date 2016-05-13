/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidp;

import com.amazonaws.services.cognitoidp.model.*;

/**
 * Abstract implementation of {@code AWSCognitoIdentityProviderAsync}.
 * Convenient method forms pass through to the corresponding overload that takes
 * a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSCognitoIdentityProviderAsync extends
        AbstractAWSCognitoIdentityProvider implements
        AWSCognitoIdentityProviderAsync {

    protected AbstractAWSCognitoIdentityProviderAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddCustomAttributesResult> addCustomAttributesAsync(
            AddCustomAttributesRequest request) {

        return addCustomAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddCustomAttributesResult> addCustomAttributesAsync(
            AddCustomAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<AddCustomAttributesRequest, AddCustomAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(
            AdminConfirmSignUpRequest request) {

        return adminConfirmSignUpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminConfirmSignUpResult> adminConfirmSignUpAsync(
            AdminConfirmSignUpRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminConfirmSignUpRequest, AdminConfirmSignUpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(
            AdminDeleteUserRequest request) {

        return adminDeleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserResult> adminDeleteUserAsync(
            AdminDeleteUserRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminDeleteUserRequest, AdminDeleteUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(
            AdminDeleteUserAttributesRequest request) {

        return adminDeleteUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminDeleteUserAttributesResult> adminDeleteUserAttributesAsync(
            AdminDeleteUserAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminDeleteUserAttributesRequest, AdminDeleteUserAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(
            AdminDisableUserRequest request) {

        return adminDisableUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminDisableUserResult> adminDisableUserAsync(
            AdminDisableUserRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminDisableUserRequest, AdminDisableUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(
            AdminEnableUserRequest request) {

        return adminEnableUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminEnableUserResult> adminEnableUserAsync(
            AdminEnableUserRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminEnableUserRequest, AdminEnableUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(
            AdminGetUserRequest request) {

        return adminGetUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminGetUserResult> adminGetUserAsync(
            AdminGetUserRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminGetUserRequest, AdminGetUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminResetUserPasswordResult> adminResetUserPasswordAsync(
            AdminResetUserPasswordRequest request) {

        return adminResetUserPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminResetUserPasswordResult> adminResetUserPasswordAsync(
            AdminResetUserPasswordRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminResetUserPasswordRequest, AdminResetUserPasswordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(
            AdminSetUserSettingsRequest request) {

        return adminSetUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminSetUserSettingsResult> adminSetUserSettingsAsync(
            AdminSetUserSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminSetUserSettingsRequest, AdminSetUserSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(
            AdminUpdateUserAttributesRequest request) {

        return adminUpdateUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AdminUpdateUserAttributesResult> adminUpdateUserAttributesAsync(
            AdminUpdateUserAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<AdminUpdateUserAttributesRequest, AdminUpdateUserAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ChangePasswordResult> changePasswordAsync(
            ChangePasswordRequest request) {

        return changePasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ChangePasswordResult> changePasswordAsync(
            ChangePasswordRequest request,
            com.amazonaws.handlers.AsyncHandler<ChangePasswordRequest, ChangePasswordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfirmForgotPasswordResult> confirmForgotPasswordAsync(
            ConfirmForgotPasswordRequest request) {

        return confirmForgotPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmForgotPasswordResult> confirmForgotPasswordAsync(
            ConfirmForgotPasswordRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfirmForgotPasswordRequest, ConfirmForgotPasswordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ConfirmSignUpResult> confirmSignUpAsync(
            ConfirmSignUpRequest request) {

        return confirmSignUpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmSignUpResult> confirmSignUpAsync(
            ConfirmSignUpRequest request,
            com.amazonaws.handlers.AsyncHandler<ConfirmSignUpRequest, ConfirmSignUpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolResult> createUserPoolAsync(
            CreateUserPoolRequest request) {

        return createUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolResult> createUserPoolAsync(
            CreateUserPoolRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUserPoolRequest, CreateUserPoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolClientResult> createUserPoolClientAsync(
            CreateUserPoolClientRequest request) {

        return createUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserPoolClientResult> createUserPoolClientAsync(
            CreateUserPoolClientRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUserPoolClientRequest, CreateUserPoolClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(
            DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(
            DeleteUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAttributesResult> deleteUserAttributesAsync(
            DeleteUserAttributesRequest request) {

        return deleteUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserAttributesResult> deleteUserAttributesAsync(
            DeleteUserAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserAttributesRequest, DeleteUserAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolResult> deleteUserPoolAsync(
            DeleteUserPoolRequest request) {

        return deleteUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolResult> deleteUserPoolAsync(
            DeleteUserPoolRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPoolRequest, DeleteUserPoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolClientResult> deleteUserPoolClientAsync(
            DeleteUserPoolClientRequest request) {

        return deleteUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserPoolClientResult> deleteUserPoolClientAsync(
            DeleteUserPoolClientRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPoolClientRequest, DeleteUserPoolClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolResult> describeUserPoolAsync(
            DescribeUserPoolRequest request) {

        return describeUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolResult> describeUserPoolAsync(
            DescribeUserPoolRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeUserPoolRequest, DescribeUserPoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(
            DescribeUserPoolClientRequest request) {

        return describeUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserPoolClientResult> describeUserPoolClientAsync(
            DescribeUserPoolClientRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeUserPoolClientRequest, DescribeUserPoolClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ForgotPasswordResult> forgotPasswordAsync(
            ForgotPasswordRequest request) {

        return forgotPasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ForgotPasswordResult> forgotPasswordAsync(
            ForgotPasswordRequest request,
            com.amazonaws.handlers.AsyncHandler<ForgotPasswordRequest, ForgotPasswordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(
            GetUserRequest request) {

        return getUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(
            GetUserRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUserAttributeVerificationCodeResult> getUserAttributeVerificationCodeAsync(
            GetUserAttributeVerificationCodeRequest request) {

        return getUserAttributeVerificationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserAttributeVerificationCodeResult> getUserAttributeVerificationCodeAsync(
            GetUserAttributeVerificationCodeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUserAttributeVerificationCodeRequest, GetUserAttributeVerificationCodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolClientsResult> listUserPoolClientsAsync(
            ListUserPoolClientsRequest request) {

        return listUserPoolClientsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolClientsResult> listUserPoolClientsAsync(
            ListUserPoolClientsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUserPoolClientsRequest, ListUserPoolClientsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolsResult> listUserPoolsAsync(
            ListUserPoolsRequest request) {

        return listUserPoolsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoolsResult> listUserPoolsAsync(
            ListUserPoolsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUserPoolsRequest, ListUserPoolsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            ListUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResendConfirmationCodeResult> resendConfirmationCodeAsync(
            ResendConfirmationCodeRequest request) {

        return resendConfirmationCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResendConfirmationCodeResult> resendConfirmationCodeAsync(
            ResendConfirmationCodeRequest request,
            com.amazonaws.handlers.AsyncHandler<ResendConfirmationCodeRequest, ResendConfirmationCodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetUserSettingsResult> setUserSettingsAsync(
            SetUserSettingsRequest request) {

        return setUserSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetUserSettingsResult> setUserSettingsAsync(
            SetUserSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<SetUserSettingsRequest, SetUserSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SignUpResult> signUpAsync(
            SignUpRequest request) {

        return signUpAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SignUpResult> signUpAsync(
            SignUpRequest request,
            com.amazonaws.handlers.AsyncHandler<SignUpRequest, SignUpResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAttributesResult> updateUserAttributesAsync(
            UpdateUserAttributesRequest request) {

        return updateUserAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserAttributesResult> updateUserAttributesAsync(
            UpdateUserAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateUserAttributesRequest, UpdateUserAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(
            UpdateUserPoolRequest request) {

        return updateUserPoolAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolResult> updateUserPoolAsync(
            UpdateUserPoolRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPoolRequest, UpdateUserPoolResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(
            UpdateUserPoolClientRequest request) {

        return updateUserPoolClientAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserPoolClientResult> updateUserPoolClientAsync(
            UpdateUserPoolClientRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateUserPoolClientRequest, UpdateUserPoolClientResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyUserAttributeResult> verifyUserAttributeAsync(
            VerifyUserAttributeRequest request) {

        return verifyUserAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyUserAttributeResult> verifyUserAttributeAsync(
            VerifyUserAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyUserAttributeRequest, VerifyUserAttributeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
