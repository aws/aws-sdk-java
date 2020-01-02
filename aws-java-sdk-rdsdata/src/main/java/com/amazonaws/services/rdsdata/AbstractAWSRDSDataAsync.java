/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata;

import javax.annotation.Generated;

import com.amazonaws.services.rdsdata.model.*;

/**
 * Abstract implementation of {@code AWSRDSDataAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRDSDataAsync extends AbstractAWSRDSData implements AWSRDSDataAsync {

    protected AbstractAWSRDSDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchExecuteStatementResult> batchExecuteStatementAsync(BatchExecuteStatementRequest request) {

        return batchExecuteStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchExecuteStatementResult> batchExecuteStatementAsync(BatchExecuteStatementRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchExecuteStatementRequest, BatchExecuteStatementResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BeginTransactionResult> beginTransactionAsync(BeginTransactionRequest request) {

        return beginTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BeginTransactionResult> beginTransactionAsync(BeginTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<BeginTransactionRequest, BeginTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest request) {

        return commitTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<CommitTransactionRequest, CommitTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(ExecuteSqlRequest request) {

        return executeSqlAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(ExecuteSqlRequest request,
            com.amazonaws.handlers.AsyncHandler<ExecuteSqlRequest, ExecuteSqlResult> asyncHandler) {

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
    public java.util.concurrent.Future<RollbackTransactionResult> rollbackTransactionAsync(RollbackTransactionRequest request) {

        return rollbackTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RollbackTransactionResult> rollbackTransactionAsync(RollbackTransactionRequest request,
            com.amazonaws.handlers.AsyncHandler<RollbackTransactionRequest, RollbackTransactionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
