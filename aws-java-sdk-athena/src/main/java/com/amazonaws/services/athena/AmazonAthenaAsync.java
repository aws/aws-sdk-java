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
package com.amazonaws.services.athena;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;

/**
 * Interface for accessing Amazon Athena asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.athena.AbstractAmazonAthenaAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Athena is an interactive query service that lets you use standard SQL to analyze data directly in Amazon S3.
 * You can point Athena at your data in Amazon S3 and run ad-hoc queries and get results in seconds. Athena is
 * serverless, so there is no infrastructure to set up or manage. You pay only for the queries you run. Athena scales
 * automatically—executing queries in parallel—so results are fast, even with large datasets and complex queries. For
 * more information, see <a href="http://docs.aws.amazon.com/athena/latest/ug/what-is.html">What is Amazon Athena</a> in
 * the <i>Amazon Athena User Guide</i>.
 * </p>
 * <p>
 * If you connect to Athena using the JDBC driver, use version 1.1.0 of the driver or later with the Amazon Athena API.
 * Earlier version drivers do not support the API. For more information and to download the driver, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/connect-with-jdbc.html">Accessing Amazon Athena with JDBC</a>.
 * </p>
 * <p>
 * For code samples using the AWS SDK for Java, see <a
 * href="https://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the <i>Amazon
 * Athena User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAthenaAsync extends AmazonAthena {

    /**
     * <p>
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query
     * ID strings. Requires you to have access to the workgroup in which the queries were saved. Use
     * <a>ListNamedQueriesInput</a> to get the list of named query IDs in the specified workgroup. If information could
     * not be retrieved for a submitted query ID, information about the query ID submitted is listed under
     * <a>UnprocessedNamedQueryId</a>. Named queries differ from executed queries. Use
     * <a>BatchGetQueryExecutionInput</a> to get details about each unique query execution, and
     * <a>ListQueryExecutionsInput</a> to get a list of query execution IDs.
     * </p>
     * 
     * @param batchGetNamedQueryRequest
     * @return A Java Future containing the result of the BatchGetNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsync.BatchGetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetNamedQueryResult> batchGetNamedQueryAsync(BatchGetNamedQueryRequest batchGetNamedQueryRequest);

    /**
     * <p>
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query
     * ID strings. Requires you to have access to the workgroup in which the queries were saved. Use
     * <a>ListNamedQueriesInput</a> to get the list of named query IDs in the specified workgroup. If information could
     * not be retrieved for a submitted query ID, information about the query ID submitted is listed under
     * <a>UnprocessedNamedQueryId</a>. Named queries differ from executed queries. Use
     * <a>BatchGetQueryExecutionInput</a> to get details about each unique query execution, and
     * <a>ListQueryExecutionsInput</a> to get a list of query execution IDs.
     * </p>
     * 
     * @param batchGetNamedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.BatchGetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchGetNamedQueryResult> batchGetNamedQueryAsync(BatchGetNamedQueryRequest batchGetNamedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetNamedQueryRequest, BatchGetNamedQueryResult> asyncHandler);

    /**
     * <p>
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
     * array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
     * get a list of query execution IDs, use <a>ListQueryExecutionsInput$WorkGroup</a>. Query executions differ from
     * named (saved) queries. Use <a>BatchGetNamedQueryInput</a> to get details about named queries.
     * </p>
     * 
     * @param batchGetQueryExecutionRequest
     * @return A Java Future containing the result of the BatchGetQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsync.BatchGetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetQueryExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetQueryExecutionResult> batchGetQueryExecutionAsync(BatchGetQueryExecutionRequest batchGetQueryExecutionRequest);

    /**
     * <p>
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
     * array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
     * get a list of query execution IDs, use <a>ListQueryExecutionsInput$WorkGroup</a>. Query executions differ from
     * named (saved) queries. Use <a>BatchGetNamedQueryInput</a> to get details about named queries.
     * </p>
     * 
     * @param batchGetQueryExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.BatchGetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetQueryExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetQueryExecutionResult> batchGetQueryExecutionAsync(BatchGetQueryExecutionRequest batchGetQueryExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetQueryExecutionRequest, BatchGetQueryExecutionResult> asyncHandler);

    /**
     * <p>
     * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all
     * users of the same AWS account.
     * </p>
     * 
     * @param createDataCatalogRequest
     * @return A Java Future containing the result of the CreateDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsync.CreateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataCatalogResult> createDataCatalogAsync(CreateDataCatalogRequest createDataCatalogRequest);

    /**
     * <p>
     * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all
     * users of the same AWS account.
     * </p>
     * 
     * @param createDataCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.CreateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDataCatalogResult> createDataCatalogAsync(CreateDataCatalogRequest createDataCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataCatalogRequest, CreateDataCatalogResult> asyncHandler);

    /**
     * <p>
     * Creates a named query in the specified workgroup. Requires that you have access to the workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param createNamedQueryRequest
     * @return A Java Future containing the result of the CreateNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsync.CreateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNamedQueryResult> createNamedQueryAsync(CreateNamedQueryRequest createNamedQueryRequest);

    /**
     * <p>
     * Creates a named query in the specified workgroup. Requires that you have access to the workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param createNamedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.CreateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNamedQueryResult> createNamedQueryAsync(CreateNamedQueryRequest createNamedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNamedQueryRequest, CreateNamedQueryResult> asyncHandler);

    /**
     * <p>
     * Creates a prepared statement for use with SQL queries in Athena.
     * </p>
     * 
     * @param createPreparedStatementRequest
     * @return A Java Future containing the result of the CreatePreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsync.CreatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePreparedStatementResult> createPreparedStatementAsync(CreatePreparedStatementRequest createPreparedStatementRequest);

    /**
     * <p>
     * Creates a prepared statement for use with SQL queries in Athena.
     * </p>
     * 
     * @param createPreparedStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.CreatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePreparedStatementResult> createPreparedStatementAsync(CreatePreparedStatementRequest createPreparedStatementRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePreparedStatementRequest, CreatePreparedStatementResult> asyncHandler);

    /**
     * <p>
     * Creates a workgroup with the specified name.
     * </p>
     * 
     * @param createWorkGroupRequest
     * @return A Java Future containing the result of the CreateWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsync.CreateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkGroupResult> createWorkGroupAsync(CreateWorkGroupRequest createWorkGroupRequest);

    /**
     * <p>
     * Creates a workgroup with the specified name.
     * </p>
     * 
     * @param createWorkGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.CreateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWorkGroupResult> createWorkGroupAsync(CreateWorkGroupRequest createWorkGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWorkGroupRequest, CreateWorkGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a data catalog.
     * </p>
     * 
     * @param deleteDataCatalogRequest
     * @return A Java Future containing the result of the DeleteDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsync.DeleteDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataCatalogResult> deleteDataCatalogAsync(DeleteDataCatalogRequest deleteDataCatalogRequest);

    /**
     * <p>
     * Deletes a data catalog.
     * </p>
     * 
     * @param deleteDataCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.DeleteDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataCatalogResult> deleteDataCatalogAsync(DeleteDataCatalogRequest deleteDataCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataCatalogRequest, DeleteDataCatalogResult> asyncHandler);

    /**
     * <p>
     * Deletes the named query if you have access to the workgroup in which the query was saved.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param deleteNamedQueryRequest
     * @return A Java Future containing the result of the DeleteNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsync.DeleteNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamedQueryResult> deleteNamedQueryAsync(DeleteNamedQueryRequest deleteNamedQueryRequest);

    /**
     * <p>
     * Deletes the named query if you have access to the workgroup in which the query was saved.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param deleteNamedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.DeleteNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamedQueryResult> deleteNamedQueryAsync(DeleteNamedQueryRequest deleteNamedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNamedQueryRequest, DeleteNamedQueryResult> asyncHandler);

    /**
     * <p>
     * Deletes the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param deletePreparedStatementRequest
     * @return A Java Future containing the result of the DeletePreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsync.DeletePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeletePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePreparedStatementResult> deletePreparedStatementAsync(DeletePreparedStatementRequest deletePreparedStatementRequest);

    /**
     * <p>
     * Deletes the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param deletePreparedStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.DeletePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeletePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeletePreparedStatementResult> deletePreparedStatementAsync(DeletePreparedStatementRequest deletePreparedStatementRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePreparedStatementRequest, DeletePreparedStatementResult> asyncHandler);

    /**
     * <p>
     * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
     * </p>
     * 
     * @param deleteWorkGroupRequest
     * @return A Java Future containing the result of the DeleteWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsync.DeleteWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkGroupResult> deleteWorkGroupAsync(DeleteWorkGroupRequest deleteWorkGroupRequest);

    /**
     * <p>
     * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
     * </p>
     * 
     * @param deleteWorkGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.DeleteWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWorkGroupResult> deleteWorkGroupAsync(DeleteWorkGroupRequest deleteWorkGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWorkGroupRequest, DeleteWorkGroupResult> asyncHandler);

    /**
     * <p>
     * Returns the specified data catalog.
     * </p>
     * 
     * @param getDataCatalogRequest
     * @return A Java Future containing the result of the GetDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsync.GetDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataCatalogResult> getDataCatalogAsync(GetDataCatalogRequest getDataCatalogRequest);

    /**
     * <p>
     * Returns the specified data catalog.
     * </p>
     * 
     * @param getDataCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataCatalogResult> getDataCatalogAsync(GetDataCatalogRequest getDataCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataCatalogRequest, GetDataCatalogResult> asyncHandler);

    /**
     * <p>
     * Returns a database object for the specified database and data catalog.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return A Java Future containing the result of the GetDatabase operation returned by the service.
     * @sample AmazonAthenaAsync.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest getDatabaseRequest);

    /**
     * <p>
     * Returns a database object for the specified database and data catalog.
     * </p>
     * 
     * @param getDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDatabase operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDatabaseResult> getDatabaseAsync(GetDatabaseRequest getDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetDatabaseRequest, GetDatabaseResult> asyncHandler);

    /**
     * <p>
     * Returns information about a single query. Requires that you have access to the workgroup in which the query was
     * saved.
     * </p>
     * 
     * @param getNamedQueryRequest
     * @return A Java Future containing the result of the GetNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsync.GetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNamedQueryResult> getNamedQueryAsync(GetNamedQueryRequest getNamedQueryRequest);

    /**
     * <p>
     * Returns information about a single query. Requires that you have access to the workgroup in which the query was
     * saved.
     * </p>
     * 
     * @param getNamedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNamedQueryResult> getNamedQueryAsync(GetNamedQueryRequest getNamedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<GetNamedQueryRequest, GetNamedQueryResult> asyncHandler);

    /**
     * <p>
     * Retrieves the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param getPreparedStatementRequest
     * @return A Java Future containing the result of the GetPreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsync.GetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetPreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPreparedStatementResult> getPreparedStatementAsync(GetPreparedStatementRequest getPreparedStatementRequest);

    /**
     * <p>
     * Retrieves the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param getPreparedStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetPreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPreparedStatementResult> getPreparedStatementAsync(GetPreparedStatementRequest getPreparedStatementRequest,
            com.amazonaws.handlers.AsyncHandler<GetPreparedStatementRequest, GetPreparedStatementResult> asyncHandler);

    /**
     * <p>
     * Returns information about a single execution of a query if you have access to the workgroup in which the query
     * ran. Each time a query executes, information about the query execution is saved with a unique ID.
     * </p>
     * 
     * @param getQueryExecutionRequest
     * @return A Java Future containing the result of the GetQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsync.GetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryExecutionResult> getQueryExecutionAsync(GetQueryExecutionRequest getQueryExecutionRequest);

    /**
     * <p>
     * Returns information about a single execution of a query if you have access to the workgroup in which the query
     * ran. Each time a query executes, information about the query execution is saved with a unique ID.
     * </p>
     * 
     * @param getQueryExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryExecutionResult> getQueryExecutionAsync(GetQueryExecutionRequest getQueryExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryExecutionRequest, GetQueryExecutionResult> asyncHandler);

    /**
     * <p>
     * Streams the results of a single query execution specified by <code>QueryExecutionId</code> from the Athena query
     * results location in Amazon S3. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a> in the <i>Amazon Athena User
     * Guide</i>. This request does not execute the query but returns results. Use <a>StartQueryExecution</a> to run a
     * query.
     * </p>
     * <p>
     * To stream query results successfully, the IAM principal with permission to call <code>GetQueryResults</code> also
     * must have permissions to the Amazon S3 <code>GetObject</code> action for the Athena query results location.
     * </p>
     * <important>
     * <p>
     * IAM principals with permission to the Amazon S3 <code>GetObject</code> action for the query results location are
     * able to retrieve query results from Amazon S3 even if permission to the <code>GetQueryResults</code> action is
     * denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are
     * denied.
     * </p>
     * </important>
     * 
     * @param getQueryResultsRequest
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AmazonAthenaAsync.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest);

    /**
     * <p>
     * Streams the results of a single query execution specified by <code>QueryExecutionId</code> from the Athena query
     * results location in Amazon S3. For more information, see <a
     * href="https://docs.aws.amazon.com/athena/latest/ug/querying.html">Query Results</a> in the <i>Amazon Athena User
     * Guide</i>. This request does not execute the query but returns results. Use <a>StartQueryExecution</a> to run a
     * query.
     * </p>
     * <p>
     * To stream query results successfully, the IAM principal with permission to call <code>GetQueryResults</code> also
     * must have permissions to the Amazon S3 <code>GetObject</code> action for the Athena query results location.
     * </p>
     * <important>
     * <p>
     * IAM principals with permission to the Amazon S3 <code>GetObject</code> action for the query results location are
     * able to retrieve query results from Amazon S3 even if permission to the <code>GetQueryResults</code> action is
     * denied. To restrict user or role access, ensure that Amazon S3 permissions to the Athena query location are
     * denied.
     * </p>
     * </important>
     * 
     * @param getQueryResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryResults operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest getQueryResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler);

    /**
     * <p>
     * Returns table metadata for the specified catalog, database, and table.
     * </p>
     * 
     * @param getTableMetadataRequest
     * @return A Java Future containing the result of the GetTableMetadata operation returned by the service.
     * @sample AmazonAthenaAsync.GetTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableMetadataResult> getTableMetadataAsync(GetTableMetadataRequest getTableMetadataRequest);

    /**
     * <p>
     * Returns table metadata for the specified catalog, database, and table.
     * </p>
     * 
     * @param getTableMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTableMetadata operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableMetadataResult> getTableMetadataAsync(GetTableMetadataRequest getTableMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableMetadataRequest, GetTableMetadataResult> asyncHandler);

    /**
     * <p>
     * Returns information about the workgroup with the specified name.
     * </p>
     * 
     * @param getWorkGroupRequest
     * @return A Java Future containing the result of the GetWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsync.GetWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkGroupResult> getWorkGroupAsync(GetWorkGroupRequest getWorkGroupRequest);

    /**
     * <p>
     * Returns information about the workgroup with the specified name.
     * </p>
     * 
     * @param getWorkGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkGroupResult> getWorkGroupAsync(GetWorkGroupRequest getWorkGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkGroupRequest, GetWorkGroupResult> asyncHandler);

    /**
     * <p>
     * Lists the data catalogs in the current AWS account.
     * </p>
     * 
     * @param listDataCatalogsRequest
     * @return A Java Future containing the result of the ListDataCatalogs operation returned by the service.
     * @sample AmazonAthenaAsync.ListDataCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDataCatalogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataCatalogsResult> listDataCatalogsAsync(ListDataCatalogsRequest listDataCatalogsRequest);

    /**
     * <p>
     * Lists the data catalogs in the current AWS account.
     * </p>
     * 
     * @param listDataCatalogsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataCatalogs operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListDataCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDataCatalogs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDataCatalogsResult> listDataCatalogsAsync(ListDataCatalogsRequest listDataCatalogsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataCatalogsRequest, ListDataCatalogsResult> asyncHandler);

    /**
     * <p>
     * Lists the databases in the specified data catalog.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AmazonAthenaAsync.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * Lists the databases in the specified data catalog.
     * </p>
     * 
     * @param listDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of engine versions that are available to choose from, including the Auto option.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @return A Java Future containing the result of the ListEngineVersions operation returned by the service.
     * @sample AmazonAthenaAsync.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest listEngineVersionsRequest);

    /**
     * <p>
     * Returns a list of engine versions that are available to choose from, including the Auto option.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEngineVersions operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEngineVersionsResult> listEngineVersionsAsync(ListEngineVersionsRequest listEngineVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEngineVersionsRequest, ListEngineVersionsResult> asyncHandler);

    /**
     * <p>
     * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
     * access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary
     * workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listNamedQueriesRequest
     * @return A Java Future containing the result of the ListNamedQueries operation returned by the service.
     * @sample AmazonAthenaAsync.ListNamedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNamedQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNamedQueriesResult> listNamedQueriesAsync(ListNamedQueriesRequest listNamedQueriesRequest);

    /**
     * <p>
     * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
     * access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary
     * workgroup.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listNamedQueriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNamedQueries operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListNamedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNamedQueries" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNamedQueriesResult> listNamedQueriesAsync(ListNamedQueriesRequest listNamedQueriesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNamedQueriesRequest, ListNamedQueriesResult> asyncHandler);

    /**
     * <p>
     * Lists the prepared statements in the specfied workgroup.
     * </p>
     * 
     * @param listPreparedStatementsRequest
     * @return A Java Future containing the result of the ListPreparedStatements operation returned by the service.
     * @sample AmazonAthenaAsync.ListPreparedStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListPreparedStatements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPreparedStatementsResult> listPreparedStatementsAsync(ListPreparedStatementsRequest listPreparedStatementsRequest);

    /**
     * <p>
     * Lists the prepared statements in the specfied workgroup.
     * </p>
     * 
     * @param listPreparedStatementsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPreparedStatements operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListPreparedStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListPreparedStatements" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPreparedStatementsResult> listPreparedStatementsAsync(ListPreparedStatementsRequest listPreparedStatementsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPreparedStatementsRequest, ListPreparedStatementsResult> asyncHandler);

    /**
     * <p>
     * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is
     * not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to
     * the workgroup in which the queries ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listQueryExecutionsRequest
     * @return A Java Future containing the result of the ListQueryExecutions operation returned by the service.
     * @sample AmazonAthenaAsync.ListQueryExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListQueryExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueryExecutionsResult> listQueryExecutionsAsync(ListQueryExecutionsRequest listQueryExecutionsRequest);

    /**
     * <p>
     * Provides a list of available query execution IDs for the queries in the specified workgroup. If a workgroup is
     * not specified, returns a list of query execution IDs for the primary workgroup. Requires you to have access to
     * the workgroup in which the queries ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param listQueryExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueryExecutions operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListQueryExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListQueryExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListQueryExecutionsResult> listQueryExecutionsAsync(ListQueryExecutionsRequest listQueryExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueryExecutionsRequest, ListQueryExecutionsResult> asyncHandler);

    /**
     * <p>
     * Lists the metadata for the tables in the specified data catalog database.
     * </p>
     * 
     * @param listTableMetadataRequest
     * @return A Java Future containing the result of the ListTableMetadata operation returned by the service.
     * @sample AmazonAthenaAsync.ListTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTableMetadataResult> listTableMetadataAsync(ListTableMetadataRequest listTableMetadataRequest);

    /**
     * <p>
     * Lists the metadata for the tables in the specified data catalog database.
     * </p>
     * 
     * @param listTableMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTableMetadata operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTableMetadataResult> listTableMetadataAsync(ListTableMetadataRequest listTableMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<ListTableMetadataRequest, ListTableMetadataResult> asyncHandler);

    /**
     * <p>
     * Lists the tags associated with an Athena workgroup or data catalog resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAthenaAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags associated with an Athena workgroup or data catalog resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists available workgroups for the account.
     * </p>
     * 
     * @param listWorkGroupsRequest
     * @return A Java Future containing the result of the ListWorkGroups operation returned by the service.
     * @sample AmazonAthenaAsync.ListWorkGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListWorkGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkGroupsResult> listWorkGroupsAsync(ListWorkGroupsRequest listWorkGroupsRequest);

    /**
     * <p>
     * Lists available workgroups for the account.
     * </p>
     * 
     * @param listWorkGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkGroups operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListWorkGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListWorkGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWorkGroupsResult> listWorkGroupsAsync(ListWorkGroupsRequest listWorkGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkGroupsRequest, ListWorkGroupsResult> asyncHandler);

    /**
     * <p>
     * Runs the SQL query statements contained in the <code>Query</code>. Requires you to have access to the workgroup
     * in which the query ran. Running queries against an external catalog requires <a>GetDataCatalog</a> permission to
     * the catalog. For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param startQueryExecutionRequest
     * @return A Java Future containing the result of the StartQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsync.StartQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryExecutionResult> startQueryExecutionAsync(StartQueryExecutionRequest startQueryExecutionRequest);

    /**
     * <p>
     * Runs the SQL query statements contained in the <code>Query</code>. Requires you to have access to the workgroup
     * in which the query ran. Running queries against an external catalog requires <a>GetDataCatalog</a> permission to
     * the catalog. For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param startQueryExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.StartQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartQueryExecutionResult> startQueryExecutionAsync(StartQueryExecutionRequest startQueryExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartQueryExecutionRequest, StartQueryExecutionResult> asyncHandler);

    /**
     * <p>
     * Stops a query execution. Requires you to have access to the workgroup in which the query ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param stopQueryExecutionRequest
     * @return A Java Future containing the result of the StopQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsync.StopQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopQueryExecutionResult> stopQueryExecutionAsync(StopQueryExecutionRequest stopQueryExecutionRequest);

    /**
     * <p>
     * Stops a query execution. Requires you to have access to the workgroup in which the query ran.
     * </p>
     * <p>
     * For code samples using the AWS SDK for Java, see <a
     * href="http://docs.aws.amazon.com/athena/latest/ug/code-samples.html">Examples and Code Samples</a> in the
     * <i>Amazon Athena User Guide</i>.
     * </p>
     * 
     * @param stopQueryExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopQueryExecution operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.StopQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopQueryExecutionResult> stopQueryExecutionAsync(StopQueryExecutionRequest stopQueryExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StopQueryExecutionRequest, StopQueryExecutionResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. In Athena, a
     * resource can be a workgroup or data catalog. Each tag consists of a key and an optional value, both of which you
     * define. For example, you can use tags to categorize Athena workgroups or data catalogs by purpose, owner, or
     * environment. Use a consistent set of tag keys to make it easier to search and filter workgroups or data catalogs
     * in your account. For best practices, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">Tagging Best Practices</a>. Tag
     * keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
     * Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys
     * and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate
     * them by commas.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAthenaAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to an Athena resource. A tag is a label that you assign to a resource. In Athena, a
     * resource can be a workgroup or data catalog. Each tag consists of a key and an optional value, both of which you
     * define. For example, you can use tags to categorize Athena workgroups or data catalogs by purpose, owner, or
     * environment. Use a consistent set of tag keys to make it easier to search and filter workgroups or data catalogs
     * in your account. For best practices, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">Tagging Best Practices</a>. Tag
     * keys can be from 1 to 128 UTF-8 Unicode characters, and tag values can be from 0 to 256 UTF-8 Unicode characters.
     * Tags can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys
     * and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one tag, separate
     * them by commas.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a data catalog or workgroup resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAthenaAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a data catalog or workgroup resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the data catalog that has the specified name.
     * </p>
     * 
     * @param updateDataCatalogRequest
     * @return A Java Future containing the result of the UpdateDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsync.UpdateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataCatalogResult> updateDataCatalogAsync(UpdateDataCatalogRequest updateDataCatalogRequest);

    /**
     * <p>
     * Updates the data catalog that has the specified name.
     * </p>
     * 
     * @param updateDataCatalogRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataCatalog operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.UpdateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataCatalogResult> updateDataCatalogAsync(UpdateDataCatalogRequest updateDataCatalogRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataCatalogRequest, UpdateDataCatalogResult> asyncHandler);

    /**
     * <p>
     * Updates a prepared statement.
     * </p>
     * 
     * @param updatePreparedStatementRequest
     * @return A Java Future containing the result of the UpdatePreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsync.UpdatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePreparedStatementResult> updatePreparedStatementAsync(UpdatePreparedStatementRequest updatePreparedStatementRequest);

    /**
     * <p>
     * Updates a prepared statement.
     * </p>
     * 
     * @param updatePreparedStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.UpdatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePreparedStatementResult> updatePreparedStatementAsync(UpdatePreparedStatementRequest updatePreparedStatementRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePreparedStatementRequest, UpdatePreparedStatementResult> asyncHandler);

    /**
     * <p>
     * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
     * </p>
     * 
     * @param updateWorkGroupRequest
     * @return A Java Future containing the result of the UpdateWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsync.UpdateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkGroupResult> updateWorkGroupAsync(UpdateWorkGroupRequest updateWorkGroupRequest);

    /**
     * <p>
     * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
     * </p>
     * 
     * @param updateWorkGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWorkGroup operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.UpdateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWorkGroupResult> updateWorkGroupAsync(UpdateWorkGroupRequest updateWorkGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWorkGroupRequest, UpdateWorkGroupResult> asyncHandler);

}
