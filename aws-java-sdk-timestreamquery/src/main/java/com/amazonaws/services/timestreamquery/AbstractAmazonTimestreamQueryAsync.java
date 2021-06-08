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
package com.amazonaws.services.timestreamquery;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;

/**
 * Abstract implementation of {@code AmazonTimestreamQueryAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonTimestreamQueryAsync extends AbstractAmazonTimestreamQuery implements AmazonTimestreamQueryAsync {

    protected AbstractAmazonTimestreamQueryAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request) {

        return cancelQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelQueryRequest, CancelQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request) {

        return queryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryResult> queryAsync(QueryRequest request, com.amazonaws.handlers.AsyncHandler<QueryRequest, QueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
