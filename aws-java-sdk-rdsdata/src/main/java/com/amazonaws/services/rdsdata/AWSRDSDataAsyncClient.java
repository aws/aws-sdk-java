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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS RDS DataService asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>Amazon RDS Data Service</fullname>
 * <p>
 * Amazon RDS provides an HTTP endpoint to run SQL statements on an Amazon Aurora Serverless DB cluster. To run these
 * statements, you work with the Data Service API.
 * </p>
 * <p>
 * For more information about the Data Service API, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
 * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * <note>
 * <p>
 * If you have questions or comments related to the Data API, send email to <a
 * href="mailto:Rds-data-api-feedback@amazon.com">Rds-data-api-feedback@amazon.com</a>.
 * </p>
 * </note></p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRDSDataAsyncClient extends AWSRDSDataClient implements AWSRDSDataAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRDSDataAsyncClientBuilder asyncBuilder() {
        return AWSRDSDataAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS RDS DataService using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRDSDataAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<BatchExecuteStatementResult> batchExecuteStatementAsync(BatchExecuteStatementRequest request) {

        return batchExecuteStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchExecuteStatementResult> batchExecuteStatementAsync(final BatchExecuteStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchExecuteStatementRequest, BatchExecuteStatementResult> asyncHandler) {
        final BatchExecuteStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchExecuteStatementResult>() {
            @Override
            public BatchExecuteStatementResult call() throws Exception {
                BatchExecuteStatementResult result = null;

                try {
                    result = executeBatchExecuteStatement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BeginTransactionResult> beginTransactionAsync(BeginTransactionRequest request) {

        return beginTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BeginTransactionResult> beginTransactionAsync(final BeginTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<BeginTransactionRequest, BeginTransactionResult> asyncHandler) {
        final BeginTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BeginTransactionResult>() {
            @Override
            public BeginTransactionResult call() throws Exception {
                BeginTransactionResult result = null;

                try {
                    result = executeBeginTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest request) {

        return commitTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(final CommitTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CommitTransactionRequest, CommitTransactionResult> asyncHandler) {
        final CommitTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CommitTransactionResult>() {
            @Override
            public CommitTransactionResult call() throws Exception {
                CommitTransactionResult result = null;

                try {
                    result = executeCommitTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(ExecuteSqlRequest request) {

        return executeSqlAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(final ExecuteSqlRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteSqlRequest, ExecuteSqlResult> asyncHandler) {
        final ExecuteSqlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteSqlResult>() {
            @Override
            public ExecuteSqlResult call() throws Exception {
                ExecuteSqlResult result = null;

                try {
                    result = executeExecuteSql(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(ExecuteStatementRequest request) {

        return executeStatementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(final ExecuteStatementRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExecuteStatementRequest, ExecuteStatementResult> asyncHandler) {
        final ExecuteStatementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExecuteStatementResult>() {
            @Override
            public ExecuteStatementResult call() throws Exception {
                ExecuteStatementResult result = null;

                try {
                    result = executeExecuteStatement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RollbackTransactionResult> rollbackTransactionAsync(RollbackTransactionRequest request) {

        return rollbackTransactionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RollbackTransactionResult> rollbackTransactionAsync(final RollbackTransactionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RollbackTransactionRequest, RollbackTransactionResult> asyncHandler) {
        final RollbackTransactionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RollbackTransactionResult>() {
            @Override
            public RollbackTransactionResult call() throws Exception {
                RollbackTransactionResult result = null;

                try {
                    result = executeRollbackTransaction(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
