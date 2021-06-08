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
 * Interface for accessing Redshift Data API Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.redshiftdataapi.AbstractAWSRedshiftDataAPIAsync} instead.
 * </p>
 * <p>
 * <p>
 * You can use the Amazon Redshift Data API to run queries on Amazon Redshift tables. You can run individual SQL
 * statements, which are committed if the statement succeeds.
 * </p>
 * <p>
 * For more information about the Amazon Redshift Data API, see <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/data-api.html">Using the Amazon Redshift Data API</a> in the
 * <i>Amazon Redshift Cluster Management Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRedshiftDataAPIAsync extends AWSRedshiftDataAPI {

    /**
     * <p>
     * Cancels a running query. To be canceled, a query must be running.
     * </p>
     * 
     * @param cancelStatementRequest
     * @return A Java Future containing the result of the CancelStatement operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.CancelStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/CancelStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelStatementResult> cancelStatementAsync(CancelStatementRequest cancelStatementRequest);

    /**
     * <p>
     * Cancels a running query. To be canceled, a query must be running.
     * </p>
     * 
     * @param cancelStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelStatement operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.CancelStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/CancelStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelStatementResult> cancelStatementAsync(CancelStatementRequest cancelStatementRequest,
            com.amazonaws.handlers.AsyncHandler<CancelStatementRequest, CancelStatementResult> asyncHandler);

    /**
     * <p>
     * Describes the details about a specific instance when a query was run by the Amazon Redshift Data API. The
     * information includes when the query started, when it finished, the query status, the number of rows returned, and
     * the SQL statement.
     * </p>
     * 
     * @param describeStatementRequest
     * @return A Java Future containing the result of the DescribeStatement operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.DescribeStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStatementResult> describeStatementAsync(DescribeStatementRequest describeStatementRequest);

    /**
     * <p>
     * Describes the details about a specific instance when a query was run by the Amazon Redshift Data API. The
     * information includes when the query started, when it finished, the query status, the number of rows returned, and
     * the SQL statement.
     * </p>
     * 
     * @param describeStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStatement operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.DescribeStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStatementResult> describeStatementAsync(DescribeStatementRequest describeStatementRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStatementRequest, DescribeStatementResult> asyncHandler);

    /**
     * <p>
     * Describes the detailed information about a table from metadata in the cluster. The information includes its
     * columns. A token is returned to page through the column list. Depending on the authorization method, use one of
     * the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeTableRequest
     * @return A Java Future containing the result of the DescribeTable operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest);

    /**
     * <p>
     * Describes the detailed information about a table from metadata in the cluster. The information includes its
     * columns. A token is returned to page through the column list. Depending on the authorization method, use one of
     * the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTable operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/DescribeTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler);

    /**
     * <p>
     * Runs an SQL statement, which can be data manipulation language (DML) or data definition language (DDL). This
     * statement must be a single SQL statement. Depending on the authorization method, use one of the following
     * combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executeStatementRequest
     * @return A Java Future containing the result of the ExecuteStatement operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(ExecuteStatementRequest executeStatementRequest);

    /**
     * <p>
     * Runs an SQL statement, which can be data manipulation language (DML) or data definition language (DDL). This
     * statement must be a single SQL statement. Depending on the authorization method, use one of the following
     * combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param executeStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteStatement operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.ExecuteStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ExecuteStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExecuteStatementResult> executeStatementAsync(ExecuteStatementRequest executeStatementRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteStatementRequest, ExecuteStatementResult> asyncHandler);

    /**
     * <p>
     * Fetches the temporarily cached result of an SQL statement. A token is returned to page through the statement
     * results.
     * </p>
     * 
     * @param getStatementResultRequest
     * @return A Java Future containing the result of the GetStatementResult operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.GetStatementResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/GetStatementResult"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStatementResultResult> getStatementResultAsync(GetStatementResultRequest getStatementResultRequest);

    /**
     * <p>
     * Fetches the temporarily cached result of an SQL statement. A token is returned to page through the statement
     * results.
     * </p>
     * 
     * @param getStatementResultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStatementResult operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.GetStatementResult
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/GetStatementResult"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStatementResultResult> getStatementResultAsync(GetStatementResultRequest getStatementResultRequest,
            com.amazonaws.handlers.AsyncHandler<GetStatementResultRequest, GetStatementResultResult> asyncHandler);

    /**
     * <p>
     * List the databases in a cluster. A token is returned to page through the database list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listDatabasesRequest
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * List the databases in a cluster. A token is returned to page through the database list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler);

    /**
     * <p>
     * Lists the schemas in a database. A token is returned to page through the schema list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listSchemasRequest
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest);

    /**
     * <p>
     * Lists the schemas in a database. A token is returned to page through the schema list. Depending on the
     * authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listSchemasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSchemas operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSchemasResult> listSchemasAsync(ListSchemasRequest listSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<ListSchemasRequest, ListSchemasResult> asyncHandler);

    /**
     * <p>
     * List of SQL statements. By default, only finished statements are shown. A token is returned to page through the
     * statement list.
     * </p>
     * 
     * @param listStatementsRequest
     * @return A Java Future containing the result of the ListStatements operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.ListStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListStatements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStatementsResult> listStatementsAsync(ListStatementsRequest listStatementsRequest);

    /**
     * <p>
     * List of SQL statements. By default, only finished statements are shown. A token is returned to page through the
     * statement list.
     * </p>
     * 
     * @param listStatementsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStatements operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.ListStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListStatements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListStatementsResult> listStatementsAsync(ListStatementsRequest listStatementsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStatementsRequest, ListStatementsResult> asyncHandler);

    /**
     * <p>
     * List the tables in a database. If neither <code>SchemaPattern</code> nor <code>TablePattern</code> are specified,
     * then all tables in the database are returned. A token is returned to page through the table list. Depending on
     * the authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTablesRequest
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AWSRedshiftDataAPIAsync.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * List the tables in a database. If neither <code>SchemaPattern</code> nor <code>TablePattern</code> are specified,
     * then all tables in the database are returned. A token is returned to page through the table list. Depending on
     * the authorization method, use one of the following combinations of request parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Secrets Manager - specify the Amazon Resource Name (ARN) of the secret and the cluster identifier that
     * matches the cluster in the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * Temporary credentials - specify the cluster identifier, the database name, and the database user name. Permission
     * to call the <code>redshift:GetClusterCredentials</code> operation is required to use this method.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AWSRedshiftDataAPIAsyncHandler.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

}
