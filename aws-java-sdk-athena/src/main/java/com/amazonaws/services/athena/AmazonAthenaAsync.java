/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * For code samples using the Amazon Web Services SDK for Java, see <a
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
     *        Contains an array of named query IDs.
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
     *        Contains an array of named query IDs.
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
     * Returns the details of a single prepared statement or a list of up to 256 prepared statements for the array of
     * prepared statement names that you provide. Requires you to have access to the workgroup to which the prepared
     * statements belong. If a prepared statement cannot be retrieved for the name specified, the statement is listed in
     * <code>UnprocessedPreparedStatementNames</code>.
     * </p>
     * 
     * @param batchGetPreparedStatementRequest
     * @return A Java Future containing the result of the BatchGetPreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsync.BatchGetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetPreparedStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetPreparedStatementResult> batchGetPreparedStatementAsync(
            BatchGetPreparedStatementRequest batchGetPreparedStatementRequest);

    /**
     * <p>
     * Returns the details of a single prepared statement or a list of up to 256 prepared statements for the array of
     * prepared statement names that you provide. Requires you to have access to the workgroup to which the prepared
     * statements belong. If a prepared statement cannot be retrieved for the name specified, the statement is listed in
     * <code>UnprocessedPreparedStatementNames</code>.
     * </p>
     * 
     * @param batchGetPreparedStatementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetPreparedStatement operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.BatchGetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetPreparedStatement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetPreparedStatementResult> batchGetPreparedStatementAsync(
            BatchGetPreparedStatementRequest batchGetPreparedStatementRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetPreparedStatementRequest, BatchGetPreparedStatementResult> asyncHandler);

    /**
     * <p>
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an
     * array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To
     * get a list of query execution IDs, use <a>ListQueryExecutionsInput$WorkGroup</a>. Query executions differ from
     * named (saved) queries. Use <a>BatchGetNamedQueryInput</a> to get details about named queries.
     * </p>
     * 
     * @param batchGetQueryExecutionRequest
     *        Contains an array of query execution IDs.
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
     *        Contains an array of query execution IDs.
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
     * users of the same Amazon Web Services account.
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
     * users of the same Amazon Web Services account.
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * Creates an empty <code>ipynb</code> file in the specified Apache Spark enabled workgroup. Throws an error if a
     * file in the workgroup with the same name already exists.
     * </p>
     * 
     * @param createNotebookRequest
     * @return A Java Future containing the result of the CreateNotebook operation returned by the service.
     * @sample AmazonAthenaAsync.CreateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookResult> createNotebookAsync(CreateNotebookRequest createNotebookRequest);

    /**
     * <p>
     * Creates an empty <code>ipynb</code> file in the specified Apache Spark enabled workgroup. Throws an error if a
     * file in the workgroup with the same name already exists.
     * </p>
     * 
     * @param createNotebookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNotebook operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.CreateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateNotebookResult> createNotebookAsync(CreateNotebookRequest createNotebookRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNotebookRequest, CreateNotebookResult> asyncHandler);

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
     * Gets an authentication token and the URL at which the notebook can be accessed. During programmatic access,
     * <code>CreatePresignedNotebookUrl</code> must be called every 10 minutes to refresh the authentication token.
     * </p>
     * 
     * @param createPresignedNotebookUrlRequest
     * @return A Java Future containing the result of the CreatePresignedNotebookUrl operation returned by the service.
     * @sample AmazonAthenaAsync.CreatePresignedNotebookUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePresignedNotebookUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedNotebookUrlResult> createPresignedNotebookUrlAsync(
            CreatePresignedNotebookUrlRequest createPresignedNotebookUrlRequest);

    /**
     * <p>
     * Gets an authentication token and the URL at which the notebook can be accessed. During programmatic access,
     * <code>CreatePresignedNotebookUrl</code> must be called every 10 minutes to refresh the authentication token.
     * </p>
     * 
     * @param createPresignedNotebookUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePresignedNotebookUrl operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.CreatePresignedNotebookUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePresignedNotebookUrl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePresignedNotebookUrlResult> createPresignedNotebookUrlAsync(
            CreatePresignedNotebookUrlRequest createPresignedNotebookUrlRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePresignedNotebookUrlRequest, CreatePresignedNotebookUrlResult> asyncHandler);

    /**
     * <p>
     * Creates a workgroup with the specified name. Only one of <code>Configurations</code> or
     * <code>Configuration</code> can be specified; <code>Configurations</code> for a workgroup with multi engine
     * support (for example, an Apache Spark enabled workgroup) or <code>Configuration</code> for an Athena SQL
     * workgroup.
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
     * Creates a workgroup with the specified name. Only one of <code>Configurations</code> or
     * <code>Configuration</code> can be specified; <code>Configurations</code> for a workgroup with multi engine
     * support (for example, an Apache Spark enabled workgroup) or <code>Configuration</code> for an Athena SQL
     * workgroup.
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * Deletes the specified notebook.
     * </p>
     * 
     * @param deleteNotebookRequest
     * @return A Java Future containing the result of the DeleteNotebook operation returned by the service.
     * @sample AmazonAthenaAsync.DeleteNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookResult> deleteNotebookAsync(DeleteNotebookRequest deleteNotebookRequest);

    /**
     * <p>
     * Deletes the specified notebook.
     * </p>
     * 
     * @param deleteNotebookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotebook operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.DeleteNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotebookResult> deleteNotebookAsync(DeleteNotebookRequest deleteNotebookRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotebookRequest, DeleteNotebookResult> asyncHandler);

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
     * Exports the specified notebook and its metadata.
     * </p>
     * 
     * @param exportNotebookRequest
     * @return A Java Future containing the result of the ExportNotebook operation returned by the service.
     * @sample AmazonAthenaAsync.ExportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ExportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportNotebookResult> exportNotebookAsync(ExportNotebookRequest exportNotebookRequest);

    /**
     * <p>
     * Exports the specified notebook and its metadata.
     * </p>
     * 
     * @param exportNotebookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportNotebook operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ExportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ExportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportNotebookResult> exportNotebookAsync(ExportNotebookRequest exportNotebookRequest,
            com.amazonaws.handlers.AsyncHandler<ExportNotebookRequest, ExportNotebookResult> asyncHandler);

    /**
     * <p>
     * Describes a previously submitted calculation execution.
     * </p>
     * 
     * @param getCalculationExecutionRequest
     * @return A Java Future containing the result of the GetCalculationExecution operation returned by the service.
     * @sample AmazonAthenaAsync.GetCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCalculationExecutionResult> getCalculationExecutionAsync(GetCalculationExecutionRequest getCalculationExecutionRequest);

    /**
     * <p>
     * Describes a previously submitted calculation execution.
     * </p>
     * 
     * @param getCalculationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCalculationExecution operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCalculationExecutionResult> getCalculationExecutionAsync(GetCalculationExecutionRequest getCalculationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetCalculationExecutionRequest, GetCalculationExecutionResult> asyncHandler);

    /**
     * <p>
     * Retrieves a pre-signed URL to a copy of the code that was executed for the calculation.
     * </p>
     * 
     * @param getCalculationExecutionCodeRequest
     * @return A Java Future containing the result of the GetCalculationExecutionCode operation returned by the service.
     * @sample AmazonAthenaAsync.GetCalculationExecutionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCalculationExecutionCodeResult> getCalculationExecutionCodeAsync(
            GetCalculationExecutionCodeRequest getCalculationExecutionCodeRequest);

    /**
     * <p>
     * Retrieves a pre-signed URL to a copy of the code that was executed for the calculation.
     * </p>
     * 
     * @param getCalculationExecutionCodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCalculationExecutionCode operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetCalculationExecutionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionCode"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCalculationExecutionCodeResult> getCalculationExecutionCodeAsync(
            GetCalculationExecutionCodeRequest getCalculationExecutionCodeRequest,
            com.amazonaws.handlers.AsyncHandler<GetCalculationExecutionCodeRequest, GetCalculationExecutionCodeResult> asyncHandler);

    /**
     * <p>
     * Gets the status of a current calculation.
     * </p>
     * 
     * @param getCalculationExecutionStatusRequest
     * @return A Java Future containing the result of the GetCalculationExecutionStatus operation returned by the
     *         service.
     * @sample AmazonAthenaAsync.GetCalculationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCalculationExecutionStatusResult> getCalculationExecutionStatusAsync(
            GetCalculationExecutionStatusRequest getCalculationExecutionStatusRequest);

    /**
     * <p>
     * Gets the status of a current calculation.
     * </p>
     * 
     * @param getCalculationExecutionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCalculationExecutionStatus operation returned by the
     *         service.
     * @sample AmazonAthenaAsyncHandler.GetCalculationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCalculationExecutionStatusResult> getCalculationExecutionStatusAsync(
            GetCalculationExecutionStatusRequest getCalculationExecutionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetCalculationExecutionStatusRequest, GetCalculationExecutionStatusResult> asyncHandler);

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
     * Retrieves notebook metadata for the specified notebook ID.
     * </p>
     * 
     * @param getNotebookMetadataRequest
     * @return A Java Future containing the result of the GetNotebookMetadata operation returned by the service.
     * @sample AmazonAthenaAsync.GetNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNotebookMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNotebookMetadataResult> getNotebookMetadataAsync(GetNotebookMetadataRequest getNotebookMetadataRequest);

    /**
     * <p>
     * Retrieves notebook metadata for the specified notebook ID.
     * </p>
     * 
     * @param getNotebookMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNotebookMetadata operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNotebookMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNotebookMetadataResult> getNotebookMetadataAsync(GetNotebookMetadataRequest getNotebookMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetNotebookMetadataRequest, GetNotebookMetadataResult> asyncHandler);

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
     * Returns query execution runtime statistics related to a single execution of a query if you have access to the
     * workgroup in which the query ran. Query execution runtime statistics are returned only when
     * <a>QueryExecutionStatus$State</a> is in a SUCCEEDED or FAILED state. Stage-level input and output row count and
     * data size statistics are not shown when a query has row-level filters defined in Lake Formation.
     * </p>
     * 
     * @param getQueryRuntimeStatisticsRequest
     * @return A Java Future containing the result of the GetQueryRuntimeStatistics operation returned by the service.
     * @sample AmazonAthenaAsync.GetQueryRuntimeStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryRuntimeStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryRuntimeStatisticsResult> getQueryRuntimeStatisticsAsync(
            GetQueryRuntimeStatisticsRequest getQueryRuntimeStatisticsRequest);

    /**
     * <p>
     * Returns query execution runtime statistics related to a single execution of a query if you have access to the
     * workgroup in which the query ran. Query execution runtime statistics are returned only when
     * <a>QueryExecutionStatus$State</a> is in a SUCCEEDED or FAILED state. Stage-level input and output row count and
     * data size statistics are not shown when a query has row-level filters defined in Lake Formation.
     * </p>
     * 
     * @param getQueryRuntimeStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryRuntimeStatistics operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetQueryRuntimeStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryRuntimeStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryRuntimeStatisticsResult> getQueryRuntimeStatisticsAsync(
            GetQueryRuntimeStatisticsRequest getQueryRuntimeStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryRuntimeStatisticsRequest, GetQueryRuntimeStatisticsResult> asyncHandler);

    /**
     * <p>
     * Gets the full details of a previously created session, including the session status and configuration.
     * </p>
     * 
     * @param getSessionRequest
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AmazonAthenaAsync.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Gets the full details of a previously created session, including the session status and configuration.
     * </p>
     * 
     * @param getSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSession operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest getSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler);

    /**
     * <p>
     * Gets the current status of a session.
     * </p>
     * 
     * @param getSessionStatusRequest
     * @return A Java Future containing the result of the GetSessionStatus operation returned by the service.
     * @sample AmazonAthenaAsync.GetSessionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSessionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionStatusResult> getSessionStatusAsync(GetSessionStatusRequest getSessionStatusRequest);

    /**
     * <p>
     * Gets the current status of a session.
     * </p>
     * 
     * @param getSessionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSessionStatus operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.GetSessionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSessionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSessionStatusResult> getSessionStatusAsync(GetSessionStatusRequest getSessionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetSessionStatusRequest, GetSessionStatusResult> asyncHandler);

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
     * Imports a single <code>ipynb</code> file to a Spark enabled workgroup. The maximum file size that can be imported
     * is 10 megabytes. If an <code>ipynb</code> file with the same name already exists in the workgroup, throws an
     * error.
     * </p>
     * 
     * @param importNotebookRequest
     * @return A Java Future containing the result of the ImportNotebook operation returned by the service.
     * @sample AmazonAthenaAsync.ImportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ImportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportNotebookResult> importNotebookAsync(ImportNotebookRequest importNotebookRequest);

    /**
     * <p>
     * Imports a single <code>ipynb</code> file to a Spark enabled workgroup. The maximum file size that can be imported
     * is 10 megabytes. If an <code>ipynb</code> file with the same name already exists in the workgroup, throws an
     * error.
     * </p>
     * 
     * @param importNotebookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportNotebook operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ImportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ImportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportNotebookResult> importNotebookAsync(ImportNotebookRequest importNotebookRequest,
            com.amazonaws.handlers.AsyncHandler<ImportNotebookRequest, ImportNotebookResult> asyncHandler);

    /**
     * <p>
     * Returns the supported DPU sizes for the supported application runtimes (for example, <code>Jupyter 1.0</code>).
     * </p>
     * 
     * @param listApplicationDPUSizesRequest
     * @return A Java Future containing the result of the ListApplicationDPUSizes operation returned by the service.
     * @sample AmazonAthenaAsync.ListApplicationDPUSizes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListApplicationDPUSizes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationDPUSizesResult> listApplicationDPUSizesAsync(ListApplicationDPUSizesRequest listApplicationDPUSizesRequest);

    /**
     * <p>
     * Returns the supported DPU sizes for the supported application runtimes (for example, <code>Jupyter 1.0</code>).
     * </p>
     * 
     * @param listApplicationDPUSizesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationDPUSizes operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListApplicationDPUSizes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListApplicationDPUSizes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationDPUSizesResult> listApplicationDPUSizesAsync(ListApplicationDPUSizesRequest listApplicationDPUSizesRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationDPUSizesRequest, ListApplicationDPUSizesResult> asyncHandler);

    /**
     * <p>
     * Lists the calculations that have been submitted to a session in descending order. Newer calculations are listed
     * first; older calculations are listed later.
     * </p>
     * 
     * @param listCalculationExecutionsRequest
     * @return A Java Future containing the result of the ListCalculationExecutions operation returned by the service.
     * @sample AmazonAthenaAsync.ListCalculationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListCalculationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCalculationExecutionsResult> listCalculationExecutionsAsync(
            ListCalculationExecutionsRequest listCalculationExecutionsRequest);

    /**
     * <p>
     * Lists the calculations that have been submitted to a session in descending order. Newer calculations are listed
     * first; older calculations are listed later.
     * </p>
     * 
     * @param listCalculationExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCalculationExecutions operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListCalculationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListCalculationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCalculationExecutionsResult> listCalculationExecutionsAsync(
            ListCalculationExecutionsRequest listCalculationExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCalculationExecutionsRequest, ListCalculationExecutionsResult> asyncHandler);

    /**
     * <p>
     * Lists the data catalogs in the current Amazon Web Services account.
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
     * Lists the data catalogs in the current Amazon Web Services account.
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
     * Lists, in descending order, the executors that have been submitted to a session. Newer executors are listed
     * first; older executors are listed later. The result can be optionally filtered by state.
     * </p>
     * 
     * @param listExecutorsRequest
     * @return A Java Future containing the result of the ListExecutors operation returned by the service.
     * @sample AmazonAthenaAsync.ListExecutors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListExecutors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExecutorsResult> listExecutorsAsync(ListExecutorsRequest listExecutorsRequest);

    /**
     * <p>
     * Lists, in descending order, the executors that have been submitted to a session. Newer executors are listed
     * first; older executors are listed later. The result can be optionally filtered by state.
     * </p>
     * 
     * @param listExecutorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExecutors operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListExecutors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListExecutors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExecutorsResult> listExecutorsAsync(ListExecutorsRequest listExecutorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExecutorsRequest, ListExecutorsResult> asyncHandler);

    /**
     * <p>
     * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have
     * access to the specified workgroup. If a workgroup is not specified, lists the saved queries for the primary
     * workgroup.
     * </p>
     * <p>
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * Displays the notebook files for the specified workgroup in paginated format.
     * </p>
     * 
     * @param listNotebookMetadataRequest
     * @return A Java Future containing the result of the ListNotebookMetadata operation returned by the service.
     * @sample AmazonAthenaAsync.ListNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookMetadataResult> listNotebookMetadataAsync(ListNotebookMetadataRequest listNotebookMetadataRequest);

    /**
     * <p>
     * Displays the notebook files for the specified workgroup in paginated format.
     * </p>
     * 
     * @param listNotebookMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotebookMetadata operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookMetadataResult> listNotebookMetadataAsync(ListNotebookMetadataRequest listNotebookMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotebookMetadataRequest, ListNotebookMetadataResult> asyncHandler);

    /**
     * <p>
     * Lists, in descending order, the sessions that have been created in a notebook that are in an active state like
     * <code>CREATING</code>, <code>CREATED</code>, <code>IDLE</code> or <code>BUSY</code>. Newer sessions are listed
     * first; older sessions are listed later.
     * </p>
     * 
     * @param listNotebookSessionsRequest
     * @return A Java Future containing the result of the ListNotebookSessions operation returned by the service.
     * @sample AmazonAthenaAsync.ListNotebookSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookSessionsResult> listNotebookSessionsAsync(ListNotebookSessionsRequest listNotebookSessionsRequest);

    /**
     * <p>
     * Lists, in descending order, the sessions that have been created in a notebook that are in an active state like
     * <code>CREATING</code>, <code>CREATED</code>, <code>IDLE</code> or <code>BUSY</code>. Newer sessions are listed
     * first; older sessions are listed later.
     * </p>
     * 
     * @param listNotebookSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNotebookSessions operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListNotebookSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListNotebookSessionsResult> listNotebookSessionsAsync(ListNotebookSessionsRequest listNotebookSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNotebookSessionsRequest, ListNotebookSessionsResult> asyncHandler);

    /**
     * <p>
     * Lists the prepared statements in the specified workgroup.
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
     * Lists the prepared statements in the specified workgroup.
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * Lists the sessions in a workgroup that are in an active state like <code>CREATING</code>, <code>CREATED</code>,
     * <code>IDLE</code>, or <code>BUSY</code>. Newer sessions are listed first; older sessions are listed later.
     * </p>
     * 
     * @param listSessionsRequest
     * @return A Java Future containing the result of the ListSessions operation returned by the service.
     * @sample AmazonAthenaAsync.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(ListSessionsRequest listSessionsRequest);

    /**
     * <p>
     * Lists the sessions in a workgroup that are in an active state like <code>CREATING</code>, <code>CREATED</code>,
     * <code>IDLE</code>, or <code>BUSY</code>. Newer sessions are listed first; older sessions are listed later.
     * </p>
     * 
     * @param listSessionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSessions operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSessionsResult> listSessionsAsync(ListSessionsRequest listSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSessionsRequest, ListSessionsResult> asyncHandler);

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
     * Submits calculations for execution within a session. You can supply the code to run as an inline code block
     * within the request or as an Amazon S3 URL.
     * </p>
     * 
     * @param startCalculationExecutionRequest
     * @return A Java Future containing the result of the StartCalculationExecution operation returned by the service.
     * @sample AmazonAthenaAsync.StartCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartCalculationExecutionResult> startCalculationExecutionAsync(
            StartCalculationExecutionRequest startCalculationExecutionRequest);

    /**
     * <p>
     * Submits calculations for execution within a session. You can supply the code to run as an inline code block
     * within the request or as an Amazon S3 URL.
     * </p>
     * 
     * @param startCalculationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartCalculationExecution operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.StartCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartCalculationExecutionResult> startCalculationExecutionAsync(
            StartCalculationExecutionRequest startCalculationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartCalculationExecutionRequest, StartCalculationExecutionResult> asyncHandler);

    /**
     * <p>
     * Runs the SQL query statements contained in the <code>Query</code>. Requires you to have access to the workgroup
     * in which the query ran. Running queries against an external catalog requires <a>GetDataCatalog</a> permission to
     * the catalog. For code samples using the Amazon Web Services SDK for Java, see <a
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
     * the catalog. For code samples using the Amazon Web Services SDK for Java, see <a
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
     * Creates a session for running calculations within a workgroup. The session is ready when it reaches an
     * <code>IDLE</code> state.
     * </p>
     * 
     * @param startSessionRequest
     * @return A Java Future containing the result of the StartSession operation returned by the service.
     * @sample AmazonAthenaAsync.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSessionResult> startSessionAsync(StartSessionRequest startSessionRequest);

    /**
     * <p>
     * Creates a session for running calculations within a workgroup. The session is ready when it reaches an
     * <code>IDLE</code> state.
     * </p>
     * 
     * @param startSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSession operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSessionResult> startSessionAsync(StartSessionRequest startSessionRequest,
            com.amazonaws.handlers.AsyncHandler<StartSessionRequest, StartSessionResult> asyncHandler);

    /**
     * <p>
     * Requests the cancellation of a calculation. A <code>StopCalculationExecution</code> call on a calculation that is
     * already in a terminal state (for example, <code>STOPPED</code>, <code>FAILED</code>, or <code>COMPLETED</code>)
     * succeeds but has no effect.
     * </p>
     * <note>
     * <p>
     * Cancelling a calculation is done on a best effort basis. If a calculation cannot be cancelled, you can be charged
     * for its completion. If you are concerned about being charged for a calculation that cannot be cancelled, consider
     * terminating the session in which the calculation is running.
     * </p>
     * </note>
     * 
     * @param stopCalculationExecutionRequest
     * @return A Java Future containing the result of the StopCalculationExecution operation returned by the service.
     * @sample AmazonAthenaAsync.StopCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopCalculationExecutionResult> stopCalculationExecutionAsync(StopCalculationExecutionRequest stopCalculationExecutionRequest);

    /**
     * <p>
     * Requests the cancellation of a calculation. A <code>StopCalculationExecution</code> call on a calculation that is
     * already in a terminal state (for example, <code>STOPPED</code>, <code>FAILED</code>, or <code>COMPLETED</code>)
     * succeeds but has no effect.
     * </p>
     * <note>
     * <p>
     * Cancelling a calculation is done on a best effort basis. If a calculation cannot be cancelled, you can be charged
     * for its completion. If you are concerned about being charged for a calculation that cannot be cancelled, consider
     * terminating the session in which the calculation is running.
     * </p>
     * </note>
     * 
     * @param stopCalculationExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopCalculationExecution operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.StopCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopCalculationExecutionResult> stopCalculationExecutionAsync(StopCalculationExecutionRequest stopCalculationExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StopCalculationExecutionRequest, StopCalculationExecutionResult> asyncHandler);

    /**
     * <p>
     * Stops a query execution. Requires you to have access to the workgroup in which the query ran.
     * </p>
     * <p>
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * For code samples using the Amazon Web Services SDK for Java, see <a
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
     * Terminates an active session. A <code>TerminateSession</code> call on a session that is already inactive (for
     * example, in a <code>FAILED</code>, <code>TERMINATED</code> or <code>TERMINATING</code> state) succeeds but has no
     * effect. Calculations running in the session when <code>TerminateSession</code> is called are forcefully stopped,
     * but may display as <code>FAILED</code> instead of <code>STOPPED</code>.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return A Java Future containing the result of the TerminateSession operation returned by the service.
     * @sample AmazonAthenaAsync.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(TerminateSessionRequest terminateSessionRequest);

    /**
     * <p>
     * Terminates an active session. A <code>TerminateSession</code> call on a session that is already inactive (for
     * example, in a <code>FAILED</code>, <code>TERMINATED</code> or <code>TERMINATING</code> state) succeeds but has no
     * effect. Calculations running in the session when <code>TerminateSession</code> is called are forcefully stopped,
     * but may display as <code>FAILED</code> instead of <code>STOPPED</code>.
     * </p>
     * 
     * @param terminateSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateSession operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TerminateSessionResult> terminateSessionAsync(TerminateSessionRequest terminateSessionRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateSessionRequest, TerminateSessionResult> asyncHandler);

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
     * Updates a <a>NamedQuery</a> object. The database or workgroup cannot be updated.
     * </p>
     * 
     * @param updateNamedQueryRequest
     * @return A Java Future containing the result of the UpdateNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsync.UpdateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNamedQueryResult> updateNamedQueryAsync(UpdateNamedQueryRequest updateNamedQueryRequest);

    /**
     * <p>
     * Updates a <a>NamedQuery</a> object. The database or workgroup cannot be updated.
     * </p>
     * 
     * @param updateNamedQueryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNamedQuery operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.UpdateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNamedQueryResult> updateNamedQueryAsync(UpdateNamedQueryRequest updateNamedQueryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNamedQueryRequest, UpdateNamedQueryResult> asyncHandler);

    /**
     * <p>
     * Updates the contents of a Spark notebook.
     * </p>
     * 
     * @param updateNotebookRequest
     * @return A Java Future containing the result of the UpdateNotebook operation returned by the service.
     * @sample AmazonAthenaAsync.UpdateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookResult> updateNotebookAsync(UpdateNotebookRequest updateNotebookRequest);

    /**
     * <p>
     * Updates the contents of a Spark notebook.
     * </p>
     * 
     * @param updateNotebookRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotebook operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.UpdateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookResult> updateNotebookAsync(UpdateNotebookRequest updateNotebookRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookRequest, UpdateNotebookResult> asyncHandler);

    /**
     * <p>
     * Updates the metadata for a notebook.
     * </p>
     * 
     * @param updateNotebookMetadataRequest
     * @return A Java Future containing the result of the UpdateNotebookMetadata operation returned by the service.
     * @sample AmazonAthenaAsync.UpdateNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookMetadataResult> updateNotebookMetadataAsync(UpdateNotebookMetadataRequest updateNotebookMetadataRequest);

    /**
     * <p>
     * Updates the metadata for a notebook.
     * </p>
     * 
     * @param updateNotebookMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateNotebookMetadata operation returned by the service.
     * @sample AmazonAthenaAsyncHandler.UpdateNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateNotebookMetadataResult> updateNotebookMetadataAsync(UpdateNotebookMetadataRequest updateNotebookMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateNotebookMetadataRequest, UpdateNotebookMetadataResult> asyncHandler);

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
     * Updates the workgroup with the specified name. The workgroup's name cannot be changed. Only one of
     * <code>ConfigurationsUpdates</code> or <code>ConfigurationUpdates</code> can be specified;
     * <code>ConfigurationsUpdates</code> for a workgroup with multi engine support (for example, an Apache Spark
     * enabled workgroup) or <code>ConfigurationUpdates</code> for an Athena SQL workgroup.
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
     * Updates the workgroup with the specified name. The workgroup's name cannot be changed. Only one of
     * <code>ConfigurationsUpdates</code> or <code>ConfigurationUpdates</code> can be specified;
     * <code>ConfigurationsUpdates</code> for a workgroup with multi engine support (for example, an Apache Spark
     * enabled workgroup) or <code>ConfigurationUpdates</code> for an Athena SQL workgroup.
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
