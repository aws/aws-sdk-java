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

import com.amazonaws.services.chime.model.*;

/**
 * Abstract implementation of {@code AmazonChimeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonChimeAsync extends AbstractAmazonChime implements AmazonChimeAsync {

    protected AbstractAmazonChimeAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchSuspendUserResult> batchSuspendUserAsync(BatchSuspendUserRequest request) {

        return batchSuspendUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchSuspendUserResult> batchSuspendUserAsync(BatchSuspendUserRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchSuspendUserRequest, BatchSuspendUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchUnsuspendUserResult> batchUnsuspendUserAsync(BatchUnsuspendUserRequest request) {

        return batchUnsuspendUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUnsuspendUserResult> batchUnsuspendUserAsync(BatchUnsuspendUserRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUnsuspendUserRequest, BatchUnsuspendUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateUserResult> batchUpdateUserAsync(BatchUpdateUserRequest request) {

        return batchUpdateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateUserResult> batchUpdateUserAsync(BatchUpdateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateUserRequest, BatchUpdateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest request) {

        return createAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccountResult> createAccountAsync(CreateAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAccountRequest, CreateAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountResult> deleteAccountAsync(DeleteAccountRequest request) {

        return deleteAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccountResult> deleteAccountAsync(DeleteAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountRequest, DeleteAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest request) {

        return getAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountResult> getAccountAsync(GetAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountRequest, GetAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request) {

        return getAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSettingsResult> getAccountSettingsAsync(GetAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountSettingsRequest, GetAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest request) {

        return getUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(GetUserRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InviteUsersResult> inviteUsersAsync(InviteUsersRequest request) {

        return inviteUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InviteUsersResult> inviteUsersAsync(InviteUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<InviteUsersRequest, InviteUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest request) {

        return listAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountsResult> listAccountsAsync(ListAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountsRequest, ListAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(ListUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<LogoutUserResult> logoutUserAsync(LogoutUserRequest request) {

        return logoutUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LogoutUserResult> logoutUserAsync(LogoutUserRequest request,
            com.amazonaws.handlers.AsyncHandler<LogoutUserRequest, LogoutUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetPersonalPINResult> resetPersonalPINAsync(ResetPersonalPINRequest request) {

        return resetPersonalPINAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetPersonalPINResult> resetPersonalPINAsync(ResetPersonalPINRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetPersonalPINRequest, ResetPersonalPINResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest request) {

        return updateAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountResult> updateAccountAsync(UpdateAccountRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountRequest, UpdateAccountResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest request) {

        return updateAccountSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAccountSettingsResult> updateAccountSettingsAsync(UpdateAccountSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountSettingsRequest, UpdateAccountSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
