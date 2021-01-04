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
package com.amazonaws.services.honeycode;

import javax.annotation.Generated;

import com.amazonaws.services.honeycode.model.*;

/**
 * Abstract implementation of {@code AmazonHoneycodeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonHoneycodeAsync extends AbstractAmazonHoneycode implements AmazonHoneycodeAsync {

    protected AbstractAmazonHoneycodeAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchCreateTableRowsResult> batchCreateTableRowsAsync(BatchCreateTableRowsRequest request) {

        return batchCreateTableRowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateTableRowsResult> batchCreateTableRowsAsync(BatchCreateTableRowsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchCreateTableRowsRequest, BatchCreateTableRowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteTableRowsResult> batchDeleteTableRowsAsync(BatchDeleteTableRowsRequest request) {

        return batchDeleteTableRowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteTableRowsResult> batchDeleteTableRowsAsync(BatchDeleteTableRowsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteTableRowsRequest, BatchDeleteTableRowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateTableRowsResult> batchUpdateTableRowsAsync(BatchUpdateTableRowsRequest request) {

        return batchUpdateTableRowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateTableRowsResult> batchUpdateTableRowsAsync(BatchUpdateTableRowsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateTableRowsRequest, BatchUpdateTableRowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchUpsertTableRowsResult> batchUpsertTableRowsAsync(BatchUpsertTableRowsRequest request) {

        return batchUpsertTableRowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpsertTableRowsResult> batchUpsertTableRowsAsync(BatchUpsertTableRowsRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUpsertTableRowsRequest, BatchUpsertTableRowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTableDataImportJobResult> describeTableDataImportJobAsync(DescribeTableDataImportJobRequest request) {

        return describeTableDataImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableDataImportJobResult> describeTableDataImportJobAsync(DescribeTableDataImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTableDataImportJobRequest, DescribeTableDataImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest request) {

        return getScreenDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetScreenDataRequest, GetScreenDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest request) {

        return invokeScreenAutomationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest request,
            com.amazonaws.handlers.AsyncHandler<InvokeScreenAutomationRequest, InvokeScreenAutomationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTableColumnsResult> listTableColumnsAsync(ListTableColumnsRequest request) {

        return listTableColumnsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTableColumnsResult> listTableColumnsAsync(ListTableColumnsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTableColumnsRequest, ListTableColumnsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTableRowsResult> listTableRowsAsync(ListTableRowsRequest request) {

        return listTableRowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTableRowsResult> listTableRowsAsync(ListTableRowsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTableRowsRequest, ListTableRowsResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<QueryTableRowsResult> queryTableRowsAsync(QueryTableRowsRequest request) {

        return queryTableRowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<QueryTableRowsResult> queryTableRowsAsync(QueryTableRowsRequest request,
            com.amazonaws.handlers.AsyncHandler<QueryTableRowsRequest, QueryTableRowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartTableDataImportJobResult> startTableDataImportJobAsync(StartTableDataImportJobRequest request) {

        return startTableDataImportJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartTableDataImportJobResult> startTableDataImportJobAsync(StartTableDataImportJobRequest request,
            com.amazonaws.handlers.AsyncHandler<StartTableDataImportJobRequest, StartTableDataImportJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
