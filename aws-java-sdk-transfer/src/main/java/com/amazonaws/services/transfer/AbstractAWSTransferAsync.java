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
package com.amazonaws.services.transfer;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;

/**
 * Abstract implementation of {@code AWSTransferAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSTransferAsync extends AbstractAWSTransfer implements AWSTransferAsync {

    protected AbstractAWSTransferAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest request) {

        return createServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateServerResult> createServerAsync(CreateServerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateServerRequest, CreateServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest request) {

        return deleteServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteServerResult> deleteServerAsync(DeleteServerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteServerRequest, DeleteServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSshPublicKeyResult> deleteSshPublicKeyAsync(DeleteSshPublicKeyRequest request) {

        return deleteSshPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSshPublicKeyResult> deleteSshPublicKeyAsync(DeleteSshPublicKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSshPublicKeyRequest, DeleteSshPublicKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeServerResult> describeServerAsync(DescribeServerRequest request) {

        return describeServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServerResult> describeServerAsync(DescribeServerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServerRequest, DescribeServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request) {

        return describeUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUserResult> describeUserAsync(DescribeUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeUserRequest, DescribeUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ImportSshPublicKeyResult> importSshPublicKeyAsync(ImportSshPublicKeyRequest request) {

        return importSshPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ImportSshPublicKeyResult> importSshPublicKeyAsync(ImportSshPublicKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<ImportSshPublicKeyRequest, ImportSshPublicKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest request) {

        return listServersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServersResult> listServersAsync(ListServersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServersRequest, ListServersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartServerResult> startServerAsync(StartServerRequest request) {

        return startServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartServerResult> startServerAsync(StartServerRequest request,
            com.amazonaws.handlers.AsyncHandler<StartServerRequest, StartServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopServerResult> stopServerAsync(StopServerRequest request) {

        return stopServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopServerResult> stopServerAsync(StopServerRequest request,
            com.amazonaws.handlers.AsyncHandler<StopServerRequest, StopServerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TestIdentityProviderResult> testIdentityProviderAsync(TestIdentityProviderRequest request) {

        return testIdentityProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestIdentityProviderResult> testIdentityProviderAsync(TestIdentityProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<TestIdentityProviderRequest, TestIdentityProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest request) {

        return updateServerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateServerResult> updateServerAsync(UpdateServerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServerRequest, UpdateServerResult> asyncHandler) {

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
