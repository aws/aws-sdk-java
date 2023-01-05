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
package com.amazonaws.services.chimesdkidentity;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkidentity.model.*;

/**
 * Abstract implementation of {@code AmazonChimeSDKIdentityAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonChimeSDKIdentityAsync extends AbstractAmazonChimeSDKIdentity implements AmazonChimeSDKIdentityAsync {

    protected AbstractAmazonChimeSDKIdentityAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(CreateAppInstanceRequest request) {

        return createAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceResult> createAppInstanceAsync(CreateAppInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceRequest, CreateAppInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(CreateAppInstanceAdminRequest request) {

        return createAppInstanceAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceAdminResult> createAppInstanceAdminAsync(CreateAppInstanceAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceAdminRequest, CreateAppInstanceAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(CreateAppInstanceUserRequest request) {

        return createAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAppInstanceUserResult> createAppInstanceUserAsync(CreateAppInstanceUserRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAppInstanceUserRequest, CreateAppInstanceUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(DeleteAppInstanceRequest request) {

        return deleteAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceResult> deleteAppInstanceAsync(DeleteAppInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceRequest, DeleteAppInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(DeleteAppInstanceAdminRequest request) {

        return deleteAppInstanceAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceAdminResult> deleteAppInstanceAdminAsync(DeleteAppInstanceAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceAdminRequest, DeleteAppInstanceAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(DeleteAppInstanceUserRequest request) {

        return deleteAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAppInstanceUserResult> deleteAppInstanceUserAsync(DeleteAppInstanceUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAppInstanceUserRequest, DeleteAppInstanceUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterAppInstanceUserEndpointResult> deregisterAppInstanceUserEndpointAsync(
            DeregisterAppInstanceUserEndpointRequest request) {

        return deregisterAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterAppInstanceUserEndpointResult> deregisterAppInstanceUserEndpointAsync(
            DeregisterAppInstanceUserEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterAppInstanceUserEndpointRequest, DeregisterAppInstanceUserEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(DescribeAppInstanceRequest request) {

        return describeAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceResult> describeAppInstanceAsync(DescribeAppInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceRequest, DescribeAppInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(DescribeAppInstanceAdminRequest request) {

        return describeAppInstanceAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceAdminResult> describeAppInstanceAdminAsync(DescribeAppInstanceAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceAdminRequest, DescribeAppInstanceAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(DescribeAppInstanceUserRequest request) {

        return describeAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserResult> describeAppInstanceUserAsync(DescribeAppInstanceUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceUserRequest, DescribeAppInstanceUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserEndpointResult> describeAppInstanceUserEndpointAsync(
            DescribeAppInstanceUserEndpointRequest request) {

        return describeAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAppInstanceUserEndpointResult> describeAppInstanceUserEndpointAsync(
            DescribeAppInstanceUserEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAppInstanceUserEndpointRequest, DescribeAppInstanceUserEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            GetAppInstanceRetentionSettingsRequest request) {

        return getAppInstanceRetentionSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAppInstanceRetentionSettingsResult> getAppInstanceRetentionSettingsAsync(
            GetAppInstanceRetentionSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAppInstanceRetentionSettingsRequest, GetAppInstanceRetentionSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(ListAppInstanceAdminsRequest request) {

        return listAppInstanceAdminsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceAdminsResult> listAppInstanceAdminsAsync(ListAppInstanceAdminsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceAdminsRequest, ListAppInstanceAdminsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUserEndpointsResult> listAppInstanceUserEndpointsAsync(ListAppInstanceUserEndpointsRequest request) {

        return listAppInstanceUserEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUserEndpointsResult> listAppInstanceUserEndpointsAsync(ListAppInstanceUserEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceUserEndpointsRequest, ListAppInstanceUserEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(ListAppInstanceUsersRequest request) {

        return listAppInstanceUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstanceUsersResult> listAppInstanceUsersAsync(ListAppInstanceUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppInstanceUsersRequest, ListAppInstanceUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(ListAppInstancesRequest request) {

        return listAppInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAppInstancesResult> listAppInstancesAsync(ListAppInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAppInstancesRequest, ListAppInstancesResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            PutAppInstanceRetentionSettingsRequest request) {

        return putAppInstanceRetentionSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAppInstanceRetentionSettingsResult> putAppInstanceRetentionSettingsAsync(
            PutAppInstanceRetentionSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAppInstanceRetentionSettingsRequest, PutAppInstanceRetentionSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RegisterAppInstanceUserEndpointResult> registerAppInstanceUserEndpointAsync(
            RegisterAppInstanceUserEndpointRequest request) {

        return registerAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAppInstanceUserEndpointResult> registerAppInstanceUserEndpointAsync(
            RegisterAppInstanceUserEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterAppInstanceUserEndpointRequest, RegisterAppInstanceUserEndpointResult> asyncHandler) {

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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(UpdateAppInstanceRequest request) {

        return updateAppInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceResult> updateAppInstanceAsync(UpdateAppInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceRequest, UpdateAppInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(UpdateAppInstanceUserRequest request) {

        return updateAppInstanceUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserResult> updateAppInstanceUserAsync(UpdateAppInstanceUserRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceUserRequest, UpdateAppInstanceUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserEndpointResult> updateAppInstanceUserEndpointAsync(UpdateAppInstanceUserEndpointRequest request) {

        return updateAppInstanceUserEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAppInstanceUserEndpointResult> updateAppInstanceUserEndpointAsync(UpdateAppInstanceUserEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAppInstanceUserEndpointRequest, UpdateAppInstanceUserEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
