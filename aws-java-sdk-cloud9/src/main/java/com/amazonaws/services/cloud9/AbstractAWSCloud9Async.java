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
package com.amazonaws.services.cloud9;

import javax.annotation.Generated;

import com.amazonaws.services.cloud9.model.*;

/**
 * Abstract implementation of {@code AWSCloud9Async}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloud9Async extends AbstractAWSCloud9 implements AWSCloud9Async {

    protected AbstractAWSCloud9Async() {
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentEC2Result> createEnvironmentEC2Async(CreateEnvironmentEC2Request request) {

        return createEnvironmentEC2Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentEC2Result> createEnvironmentEC2Async(CreateEnvironmentEC2Request request,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentEC2Request, CreateEnvironmentEC2Result> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentMembershipResult> createEnvironmentMembershipAsync(CreateEnvironmentMembershipRequest request) {

        return createEnvironmentMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEnvironmentMembershipResult> createEnvironmentMembershipAsync(CreateEnvironmentMembershipRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentMembershipRequest, CreateEnvironmentMembershipResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request) {

        return deleteEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentMembershipResult> deleteEnvironmentMembershipAsync(DeleteEnvironmentMembershipRequest request) {

        return deleteEnvironmentMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEnvironmentMembershipResult> deleteEnvironmentMembershipAsync(DeleteEnvironmentMembershipRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentMembershipRequest, DeleteEnvironmentMembershipResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentMembershipsResult> describeEnvironmentMembershipsAsync(DescribeEnvironmentMembershipsRequest request) {

        return describeEnvironmentMembershipsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentMembershipsResult> describeEnvironmentMembershipsAsync(DescribeEnvironmentMembershipsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentMembershipsRequest, DescribeEnvironmentMembershipsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentStatusResult> describeEnvironmentStatusAsync(DescribeEnvironmentStatusRequest request) {

        return describeEnvironmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentStatusResult> describeEnvironmentStatusAsync(DescribeEnvironmentStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentStatusRequest, DescribeEnvironmentStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest request) {

        return describeEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request) {

        return listEnvironmentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request) {

        return updateEnvironmentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentMembershipResult> updateEnvironmentMembershipAsync(UpdateEnvironmentMembershipRequest request) {

        return updateEnvironmentMembershipAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnvironmentMembershipResult> updateEnvironmentMembershipAsync(UpdateEnvironmentMembershipRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentMembershipRequest, UpdateEnvironmentMembershipResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
