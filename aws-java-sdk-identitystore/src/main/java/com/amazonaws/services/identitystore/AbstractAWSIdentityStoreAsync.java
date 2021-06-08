/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitystore;

import javax.annotation.Generated;

import com.amazonaws.services.identitystore.model.*;

/**
 * Abstract implementation of {@code AWSIdentityStoreAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIdentityStoreAsync extends AbstractAWSIdentityStore implements AWSIdentityStoreAsync {

    protected AbstractAWSIdentityStoreAsync() {
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
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(ListGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {

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

}
