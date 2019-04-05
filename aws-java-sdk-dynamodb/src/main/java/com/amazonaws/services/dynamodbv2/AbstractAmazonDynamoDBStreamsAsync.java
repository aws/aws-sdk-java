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
package com.amazonaws.services.dynamodbv2;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;

/**
 * Abstract implementation of {@code AmazonDynamoDBStreamsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDynamoDBStreamsAsync extends AbstractAmazonDynamoDBStreams implements AmazonDynamoDBStreamsAsync {

    protected AbstractAmazonDynamoDBStreamsAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(DescribeStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest request) {

        return getRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(GetRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest request) {

        return getShardIteratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(GetShardIteratorRequest request,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(ListStreamsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
