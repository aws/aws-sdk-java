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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonHoneycode}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonHoneycode implements AmazonHoneycode {

    protected AbstractAmazonHoneycode() {
    }

    @Override
    public BatchCreateTableRowsResult batchCreateTableRows(BatchCreateTableRowsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchDeleteTableRowsResult batchDeleteTableRows(BatchDeleteTableRowsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchUpdateTableRowsResult batchUpdateTableRows(BatchUpdateTableRowsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public BatchUpsertTableRowsResult batchUpsertTableRows(BatchUpsertTableRowsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTableDataImportJobResult describeTableDataImportJob(DescribeTableDataImportJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetScreenDataResult getScreenData(GetScreenDataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public InvokeScreenAutomationResult invokeScreenAutomation(InvokeScreenAutomationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTableColumnsResult listTableColumns(ListTableColumnsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTableRowsResult listTableRows(ListTableRowsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTablesResult listTables(ListTablesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public QueryTableRowsResult queryTableRows(QueryTableRowsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartTableDataImportJobResult startTableDataImportJob(StartTableDataImportJobRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
