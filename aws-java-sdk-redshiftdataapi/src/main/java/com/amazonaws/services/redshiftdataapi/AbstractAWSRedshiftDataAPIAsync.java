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
package com.amazonaws.services.redshiftdataapi;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftdataapi.model.*;

/**
 * Abstract implementation of {@code AWSRedshiftDataAPIAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRedshiftDataAPIAsync extends AbstractAWSRedshiftDataAPI implements AWSRedshiftDataAPIAsync {

    protected AbstractAWSRedshiftDataAPIAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelStatementResult> cancelStatementAsync(CancelStatementRequest request) {

        return cancelStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelStatementResult> cancelStatementAsync(CancelStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelStatementRequest, CancelStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeStatementResult> describeStatementAsync(DescribeStatementRequest request) {

        return describeStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStatementResult> describeStatementAsync(DescribeStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStatementRequest, DescribeStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request) {

        return describeTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(ExecuteStatementRequest request) {

        return executeStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(ExecuteStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<ExecuteStatementRequest, ExecuteStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetStatementResultResult> getStatementResultAsync(GetStatementResultRequest request) {

        return getStatementResultAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetStatementResultResult> getStatementResultAsync(GetStatementResultRequest request,
            com.amazonaws.handlers.AsyncHandler<GetStatementResultRequest, GetStatementResultResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request) {

        return listDatabasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request) {

        return listSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStatementsResult> listStatementsAsync(ListStatementsRequest request) {

        return listStatementsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStatementsResult> listStatementsAsync(ListStatementsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStatementsRequest, ListStatementsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request) {

        return listTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
