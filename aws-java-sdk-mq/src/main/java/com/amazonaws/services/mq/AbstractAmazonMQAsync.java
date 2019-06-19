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
package com.amazonaws.services.mq;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;

/**
 * Abstract implementation of {@code AmazonMQAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMQAsync extends AbstractAmazonMQ implements AmazonMQAsync {

    protected AbstractAmazonMQAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateBrokerResult> createBrokerAsync(CreateBrokerRequest request) {

        return createBrokerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBrokerResult> createBrokerAsync(CreateBrokerRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBrokerRequest, CreateBrokerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest request) {

        return createConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationResult> createConfigurationAsync(CreateConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationRequest, CreateConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteBrokerResult> deleteBrokerAsync(DeleteBrokerRequest request) {

        return deleteBrokerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBrokerResult> deleteBrokerAsync(DeleteBrokerRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBrokerRequest, DeleteBrokerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeBrokerResult> describeBrokerAsync(DescribeBrokerRequest request) {

        return describeBrokerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBrokerResult> describeBrokerAsync(DescribeBrokerRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBrokerRequest, DescribeBrokerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBrokerEngineTypesResult> describeBrokerEngineTypesAsync(DescribeBrokerEngineTypesRequest request) {

        return describeBrokerEngineTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBrokerEngineTypesResult> describeBrokerEngineTypesAsync(DescribeBrokerEngineTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBrokerEngineTypesRequest, DescribeBrokerEngineTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBrokerInstanceOptionsResult> describeBrokerInstanceOptionsAsync(DescribeBrokerInstanceOptionsRequest request) {

        return describeBrokerInstanceOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBrokerInstanceOptionsResult> describeBrokerInstanceOptionsAsync(DescribeBrokerInstanceOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBrokerInstanceOptionsRequest, DescribeBrokerInstanceOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest request) {

        return describeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationResult> describeConfigurationAsync(DescribeConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRequest, DescribeConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(DescribeConfigurationRevisionRequest request) {

        return describeConfigurationRevisionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRevisionResult> describeConfigurationRevisionAsync(DescribeConfigurationRevisionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRevisionRequest, DescribeConfigurationRevisionResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListBrokersResult> listBrokersAsync(ListBrokersRequest request) {

        return listBrokersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBrokersResult> listBrokersAsync(ListBrokersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBrokersRequest, ListBrokersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(ListConfigurationRevisionsRequest request) {

        return listConfigurationRevisionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationRevisionsResult> listConfigurationRevisionsAsync(ListConfigurationRevisionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationRevisionsRequest, ListConfigurationRevisionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request) {

        return listConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationsResult> listConfigurationsAsync(ListConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationsRequest, ListConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {

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
    public java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(RebootBrokerRequest request) {

        return rebootBrokerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootBrokerResult> rebootBrokerAsync(RebootBrokerRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootBrokerRequest, RebootBrokerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerResult> updateBrokerAsync(UpdateBrokerRequest request) {

        return updateBrokerAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBrokerResult> updateBrokerAsync(UpdateBrokerRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateBrokerRequest, UpdateBrokerResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request) {

        return updateConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationRequest, UpdateConfigurationResult> asyncHandler) {

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
