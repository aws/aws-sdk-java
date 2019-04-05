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
package com.amazonaws.services.quicksight;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;

/**
 * Abstract implementation of {@code AmazonQuickSightAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonQuickSightAsync extends AbstractAmazonQuickSight implements AmazonQuickSightAsync {

    protected AbstractAmazonQuickSightAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(CreateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest request) {

        return createGroupMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupMembershipResult> createGroupMembershipAsync(CreateGroupMembershipRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGroupMembershipRequest, CreateGroupMembershipResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupResult> deleteGroupAsync(DeleteGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, DeleteGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest request) {

        return deleteGroupMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGroupMembershipResult> deleteGroupMembershipAsync(DeleteGroupMembershipRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupMembershipRequest, DeleteGroupMembershipResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteUserByPrincipalIdResult> deleteUserByPrincipalIdAsync(DeleteUserByPrincipalIdRequest request) {

        return deleteUserByPrincipalIdAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserByPrincipalIdResult> deleteUserByPrincipalIdAsync(DeleteUserByPrincipalIdRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserByPrincipalIdRequest, DeleteUserByPrincipalIdResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest request) {

        return describeGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGroupResult> describeGroupAsync(DescribeGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeGroupRequest, DescribeGroupResult> asyncHandler) {

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
    public java.util.concurrent.Future<GetDashboardEmbedUrlResult> getDashboardEmbedUrlAsync(GetDashboardEmbedUrlRequest request) {

        return getDashboardEmbedUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDashboardEmbedUrlResult> getDashboardEmbedUrlAsync(GetDashboardEmbedUrlRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDashboardEmbedUrlRequest, GetDashboardEmbedUrlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest request) {

        return listGroupMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupMembershipsResult> listGroupMembershipsAsync(ListGroupMembershipsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupMembershipsRequest, ListGroupMembershipsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupsResult> listUserGroupsAsync(ListUserGroupsRequest request) {

        return listUserGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserGroupsResult> listUserGroupsAsync(ListUserGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUserGroupsRequest, ListUserGroupsResult> asyncHandler) {

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
    public java.util.concurrent.Future<RegisterUserResult> registerUserAsync(RegisterUserRequest request) {

        return registerUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterUserResult> registerUserAsync(RegisterUserRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterUserRequest, RegisterUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGroupResult> updateGroupAsync(UpdateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, UpdateGroupResult> asyncHandler) {

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
