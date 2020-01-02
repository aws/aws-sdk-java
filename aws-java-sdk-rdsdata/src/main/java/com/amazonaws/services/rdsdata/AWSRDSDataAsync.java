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
 * Interface for accessing AWS RDS DataService asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rdsdata.AbstractAWSRDSDataAsync} instead.
 * </p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRDSDataAsync extends AWSRDSData {

    /**
     * <p>
     * Runs a batch SQL statement over an array of data.
     * </p>
     * <p>
     * You can run bulk update and insert operations for multiple records using a DML statement with different parameter
     * sets. Bulk operations can provide a significant performance improvement over individual insert and update
     * operations.
     * </p>
     * <important>
     * <p>
     * If a call isn't part of a transaction because it doesn't include the <code>transactionID</code> parameter,
     * changes that result from the call are committed automatically.
     * </p>
     * </important>
     * 
     * @param batchExecuteStatementRequest
     *        The request parameters represent the input of a SQL statement over an array of data.
     * @return A Java Future containing the result of the BatchExecuteStatement operation returned by the service.
     * @sample AWSRDSDataAsync.BatchExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BatchExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchExecuteStatementResult> batchExecuteStatementAsync(BatchExecuteStatementRequest batchExecuteStatementRequest);

    /**
     * <p>
     * Runs a batch SQL statement over an array of data.
     * </p>
     * <p>
     * You can run bulk update and insert operations for multiple records using a DML statement with different parameter
     * sets. Bulk operations can provide a significant performance improvement over individual insert and update
     * operations.
     * </p>
     * <important>
     * <p>
     * If a call isn't part of a transaction because it doesn't include the <code>transactionID</code> parameter,
     * changes that result from the call are committed automatically.
     * </p>
     * </important>
     * 
     * @param batchExecuteStatementRequest
     *        The request parameters represent the input of a SQL statement over an array of data.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchExecuteStatement operation returned by the service.
     * @sample AWSRDSDataAsyncHandler.BatchExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BatchExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchExecuteStatementResult> batchExecuteStatementAsync(BatchExecuteStatementRequest batchExecuteStatementRequest,
            com.amazonaws.handlers.AsyncHandler<BatchExecuteStatementRequest, BatchExecuteStatementResult> asyncHandler);

    /**
     * <p>
     * Starts a SQL transaction.
     * </p>
     * 
     * <pre>
     * <code> &lt;important&gt; &lt;p&gt;A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after 24 hours.&lt;/p&gt; &lt;p&gt;A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before it's committed, it's rolled back automatically.&lt;/p&gt; &lt;p&gt;DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a separate &lt;code&gt;ExecuteStatement&lt;/code&gt; call with &lt;code&gt;continueAfterTimeout&lt;/code&gt; enabled.&lt;/p&gt; &lt;/important&gt; </code>
     * </pre>
     * 
     * @param beginTransactionRequest
     *        The request parameters represent the input of a request to start a SQL transaction.
     * @return A Java Future containing the result of the BeginTransaction operation returned by the service.
     * @sample AWSRDSDataAsync.BeginTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BeginTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BeginTransactionResult> beginTransactionAsync(BeginTransactionRequest beginTransactionRequest);

    /**
     * <p>
     * Starts a SQL transaction.
     * </p>
     * 
     * <pre>
     * <code> &lt;important&gt; &lt;p&gt;A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after 24 hours.&lt;/p&gt; &lt;p&gt;A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before it's committed, it's rolled back automatically.&lt;/p&gt; &lt;p&gt;DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a separate &lt;code&gt;ExecuteStatement&lt;/code&gt; call with &lt;code&gt;continueAfterTimeout&lt;/code&gt; enabled.&lt;/p&gt; &lt;/important&gt; </code>
     * </pre>
     * 
     * @param beginTransactionRequest
     *        The request parameters represent the input of a request to start a SQL transaction.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BeginTransaction operation returned by the service.
     * @sample AWSRDSDataAsyncHandler.BeginTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BeginTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BeginTransactionResult> beginTransactionAsync(BeginTransactionRequest beginTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<BeginTransactionRequest, BeginTransactionResult> asyncHandler);

    /**
     * <p>
     * Ends a SQL transaction started with the <code>BeginTransaction</code> operation and commits the changes.
     * </p>
     * 
     * @param commitTransactionRequest
     *        The request parameters represent the input of a commit transaction request.
     * @return A Java Future containing the result of the CommitTransaction operation returned by the service.
     * @sample AWSRDSDataAsync.CommitTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/CommitTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest commitTransactionRequest);

    /**
     * <p>
     * Ends a SQL transaction started with the <code>BeginTransaction</code> operation and commits the changes.
     * </p>
     * 
     * @param commitTransactionRequest
     *        The request parameters represent the input of a commit transaction request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CommitTransaction operation returned by the service.
     * @sample AWSRDSDataAsyncHandler.CommitTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/CommitTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest commitTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<CommitTransactionRequest, CommitTransactionResult> asyncHandler);

    /**
     * <p>
     * Runs one or more SQL statements.
     * </p>
     * <important>
     * <p>
     * This operation is deprecated. Use the <code>BatchExecuteStatement</code> or <code>ExecuteStatement</code>
     * operation.
     * </p>
     * </important>
     * 
     * @param executeSqlRequest
     *        The request parameters represent the input of a request to run one or more SQL statements.
     * @return A Java Future containing the result of the ExecuteSql operation returned by the service.
     * @sample AWSRDSDataAsync.ExecuteSql
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(ExecuteSqlRequest executeSqlRequest);

    /**
     * <p>
     * Runs one or more SQL statements.
     * </p>
     * <important>
     * <p>
     * This operation is deprecated. Use the <code>BatchExecuteStatement</code> or <code>ExecuteStatement</code>
     * operation.
     * </p>
     * </important>
     * 
     * @param executeSqlRequest
     *        The request parameters represent the input of a request to run one or more SQL statements.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteSql operation returned by the service.
     * @sample AWSRDSDataAsyncHandler.ExecuteSql
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<ExecuteSqlResult> executeSqlAsync(ExecuteSqlRequest executeSqlRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteSqlRequest, ExecuteSqlResult> asyncHandler);

    /**
     * <p>
     * Runs a SQL statement against a database.
     * </p>
     * <important>
     * <p>
     * If a call isn't part of a transaction because it doesn't include the <code>transactionID</code> parameter,
     * changes that result from the call are committed automatically.
     * </p>
     * </important>
     * <p>
     * The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over
     * 1,000 records, the call is terminated.
     * </p>
     * 
     * @param executeStatementRequest
     *        The request parameters represent the input of a request to run a SQL statement against a database.
     * @return A Java Future containing the result of the ExecuteStatement operation returned by the service.
     * @sample AWSRDSDataAsync.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteStatement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(ExecuteStatementRequest executeStatementRequest);

    /**
     * <p>
     * Runs a SQL statement against a database.
     * </p>
     * <important>
     * <p>
     * If a call isn't part of a transaction because it doesn't include the <code>transactionID</code> parameter,
     * changes that result from the call are committed automatically.
     * </p>
     * </important>
     * <p>
     * The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over
     * 1,000 records, the call is terminated.
     * </p>
     * 
     * @param executeStatementRequest
     *        The request parameters represent the input of a request to run a SQL statement against a database.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteStatement operation returned by the service.
     * @sample AWSRDSDataAsyncHandler.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteStatement" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(ExecuteStatementRequest executeStatementRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteStatementRequest, ExecuteStatementResult> asyncHandler);

    /**
     * <p>
     * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
     * </p>
     * 
     * @param rollbackTransactionRequest
     *        The request parameters represent the input of a request to perform a rollback of a transaction.
     * @return A Java Future containing the result of the RollbackTransaction operation returned by the service.
     * @sample AWSRDSDataAsync.RollbackTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/RollbackTransaction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RollbackTransactionResult> rollbackTransactionAsync(RollbackTransactionRequest rollbackTransactionRequest);

    /**
     * <p>
     * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
     * </p>
     * 
     * @param rollbackTransactionRequest
     *        The request parameters represent the input of a request to perform a rollback of a transaction.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RollbackTransaction operation returned by the service.
     * @sample AWSRDSDataAsyncHandler.RollbackTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/RollbackTransaction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RollbackTransactionResult> rollbackTransactionAsync(RollbackTransactionRequest rollbackTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<RollbackTransactionRequest, RollbackTransactionResult> asyncHandler);

}
