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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.rdsdata.model.*;

/**
 * Interface for accessing AWS RDS DataService.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.rdsdata.AbstractAWSRDSData} instead.
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
public interface AWSRDSData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "rds-data";

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
     * @return Result of the BatchExecuteStatement operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.BatchExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BatchExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    BatchExecuteStatementResult batchExecuteStatement(BatchExecuteStatementRequest batchExecuteStatementRequest);

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
     * @return Result of the BeginTransaction operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.BeginTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/BeginTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    BeginTransactionResult beginTransaction(BeginTransactionRequest beginTransactionRequest);

    /**
     * <p>
     * Ends a SQL transaction started with the <code>BeginTransaction</code> operation and commits the changes.
     * </p>
     * 
     * @param commitTransactionRequest
     *        The request parameters represent the input of a commit transaction request.
     * @return Result of the CommitTransaction operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @throws NotFoundException
     *         The <code>resourceArn</code>, <code>secretArn</code>, or <code>transactionId</code> value can't be found.
     * @sample AWSRDSData.CommitTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/CommitTransaction" target="_top">AWS API
     *      Documentation</a>
     */
    CommitTransactionResult commitTransaction(CommitTransactionRequest commitTransactionRequest);

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
     * @return Result of the ExecuteSql operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.ExecuteSql
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteSql" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    ExecuteSqlResult executeSql(ExecuteSqlRequest executeSqlRequest);

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
     * @return Result of the ExecuteStatement operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @sample AWSRDSData.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ExecuteStatement" target="_top">AWS API
     *      Documentation</a>
     */
    ExecuteStatementResult executeStatement(ExecuteStatementRequest executeStatementRequest);

    /**
     * <p>
     * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
     * </p>
     * 
     * @param rollbackTransactionRequest
     *        The request parameters represent the input of a request to perform a rollback of a transaction.
     * @return Result of the RollbackTransaction operation returned by the service.
     * @throws BadRequestException
     *         There is an error in the call or in a SQL statement.
     * @throws StatementTimeoutException
     *         The execution of the SQL statement timed out.
     * @throws InternalServerErrorException
     *         An internal error occurred.
     * @throws ForbiddenException
     *         There are insufficient privileges to make the call.
     * @throws ServiceUnavailableErrorException
     *         The service specified by the <code>resourceArn</code> parameter is not available.
     * @throws NotFoundException
     *         The <code>resourceArn</code>, <code>secretArn</code>, or <code>transactionId</code> value can't be found.
     * @sample AWSRDSData.RollbackTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/RollbackTransaction" target="_top">AWS
     *      API Documentation</a>
     */
    RollbackTransactionResult rollbackTransaction(RollbackTransactionRequest rollbackTransactionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
