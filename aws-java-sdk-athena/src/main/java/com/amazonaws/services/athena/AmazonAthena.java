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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.athena.model.*;

/**
 * Interface for accessing Amazon Athena.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.athena.AbstractAmazonAthena} instead.
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
public interface AmazonAthena {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "athena";

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
     * @return Result of the BatchGetNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetNamedQueryResult batchGetNamedQuery(BatchGetNamedQueryRequest batchGetNamedQueryRequest);

    /**
     * <p>
     * Returns the details of a single prepared statement or a list of up to 256 prepared statements for the array of
     * prepared statement names that you provide. Requires you to have access to the workgroup to which the prepared
     * statements belong. If a prepared statement cannot be retrieved for the name specified, the statement is listed in
     * <code>UnprocessedPreparedStatementNames</code>.
     * </p>
     * 
     * @param batchGetPreparedStatementRequest
     * @return Result of the BatchGetPreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetPreparedStatement"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetPreparedStatementResult batchGetPreparedStatement(BatchGetPreparedStatementRequest batchGetPreparedStatementRequest);

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
     * @return Result of the BatchGetQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.BatchGetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/BatchGetQueryExecution" target="_top">AWS
     *      API Documentation</a>
     */
    BatchGetQueryExecutionResult batchGetQueryExecution(BatchGetQueryExecutionRequest batchGetQueryExecutionRequest);

    /**
     * <p>
     * Creates (registers) a data catalog with the specified name and properties. Catalogs created are visible to all
     * users of the same Amazon Web Services account.
     * </p>
     * 
     * @param createDataCatalogRequest
     * @return Result of the CreateDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataCatalogResult createDataCatalog(CreateDataCatalogRequest createDataCatalogRequest);

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
     * @return Result of the CreateNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNamedQueryResult createNamedQuery(CreateNamedQueryRequest createNamedQueryRequest);

    /**
     * <p>
     * Creates an empty <code>ipynb</code> file in the specified Apache Spark enabled workgroup. Throws an error if a
     * file in the workgroup with the same name already exists.
     * </p>
     * 
     * @param createNotebookRequest
     * @return Result of the CreateNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.CreateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    CreateNotebookResult createNotebook(CreateNotebookRequest createNotebookRequest);

    /**
     * <p>
     * Creates a prepared statement for use with SQL queries in Athena.
     * </p>
     * 
     * @param createPreparedStatementRequest
     * @return Result of the CreatePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePreparedStatementResult createPreparedStatement(CreatePreparedStatementRequest createPreparedStatementRequest);

    /**
     * <p>
     * Gets an authentication token and the URL at which the notebook can be accessed. During programmatic access,
     * <code>CreatePresignedNotebookUrl</code> must be called every 10 minutes to refresh the authentication token.
     * </p>
     * 
     * @param createPresignedNotebookUrlRequest
     * @return Result of the CreatePresignedNotebookUrl operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.CreatePresignedNotebookUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreatePresignedNotebookUrl"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePresignedNotebookUrlResult createPresignedNotebookUrl(CreatePresignedNotebookUrlRequest createPresignedNotebookUrlRequest);

    /**
     * <p>
     * Creates a workgroup with the specified name. Only one of <code>Configurations</code> or
     * <code>Configuration</code> can be specified; <code>Configurations</code> for a workgroup with multi engine
     * support (for example, an Apache Spark enabled workgroup) or <code>Configuration</code> for an Athena SQL
     * workgroup.
     * </p>
     * 
     * @param createWorkGroupRequest
     * @return Result of the CreateWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.CreateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CreateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWorkGroupResult createWorkGroup(CreateWorkGroupRequest createWorkGroupRequest);

    /**
     * <p>
     * Deletes a data catalog.
     * </p>
     * 
     * @param deleteDataCatalogRequest
     * @return Result of the DeleteDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDataCatalogResult deleteDataCatalog(DeleteDataCatalogRequest deleteDataCatalogRequest);

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
     * @return Result of the DeleteNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNamedQueryResult deleteNamedQuery(DeleteNamedQueryRequest deleteNamedQueryRequest);

    /**
     * <p>
     * Deletes the specified notebook.
     * </p>
     * 
     * @param deleteNotebookRequest
     * @return Result of the DeleteNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.DeleteNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteNotebookResult deleteNotebook(DeleteNotebookRequest deleteNotebookRequest);

    /**
     * <p>
     * Deletes the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param deletePreparedStatementRequest
     * @return Result of the DeletePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.DeletePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeletePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePreparedStatementResult deletePreparedStatement(DeletePreparedStatementRequest deletePreparedStatementRequest);

    /**
     * <p>
     * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
     * </p>
     * 
     * @param deleteWorkGroupRequest
     * @return Result of the DeleteWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.DeleteWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/DeleteWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWorkGroupResult deleteWorkGroup(DeleteWorkGroupRequest deleteWorkGroupRequest);

    /**
     * <p>
     * Exports the specified notebook and its metadata.
     * </p>
     * 
     * @param exportNotebookRequest
     * @return Result of the ExportNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ExportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ExportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    ExportNotebookResult exportNotebook(ExportNotebookRequest exportNotebookRequest);

    /**
     * <p>
     * Describes a previously submitted calculation execution.
     * </p>
     * 
     * @param getCalculationExecutionRequest
     * @return Result of the GetCalculationExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    GetCalculationExecutionResult getCalculationExecution(GetCalculationExecutionRequest getCalculationExecutionRequest);

    /**
     * <p>
     * Retrieves a pre-signed URL to a copy of the code that was executed for the calculation.
     * </p>
     * 
     * @param getCalculationExecutionCodeRequest
     * @return Result of the GetCalculationExecutionCode operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetCalculationExecutionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionCode"
     *      target="_top">AWS API Documentation</a>
     */
    GetCalculationExecutionCodeResult getCalculationExecutionCode(GetCalculationExecutionCodeRequest getCalculationExecutionCodeRequest);

    /**
     * <p>
     * Gets the status of a current calculation.
     * </p>
     * 
     * @param getCalculationExecutionStatusRequest
     * @return Result of the GetCalculationExecutionStatus operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetCalculationExecutionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetCalculationExecutionStatusResult getCalculationExecutionStatus(GetCalculationExecutionStatusRequest getCalculationExecutionStatusRequest);

    /**
     * <p>
     * Returns the specified data catalog.
     * </p>
     * 
     * @param getDataCatalogRequest
     * @return Result of the GetDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataCatalogResult getDataCatalog(GetDataCatalogRequest getDataCatalogRequest);

    /**
     * <p>
     * Returns a database object for the specified database and data catalog.
     * </p>
     * 
     * @param getDatabaseRequest
     * @return Result of the GetDatabase operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.GetDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetDatabase" target="_top">AWS API
     *      Documentation</a>
     */
    GetDatabaseResult getDatabase(GetDatabaseRequest getDatabaseRequest);

    /**
     * <p>
     * Returns information about a single query. Requires that you have access to the workgroup in which the query was
     * saved.
     * </p>
     * 
     * @param getNamedQueryRequest
     * @return Result of the GetNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    GetNamedQueryResult getNamedQuery(GetNamedQueryRequest getNamedQueryRequest);

    /**
     * <p>
     * Retrieves notebook metadata for the specified notebook ID.
     * </p>
     * 
     * @param getNotebookMetadataRequest
     * @return Result of the GetNotebookMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.GetNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetNotebookMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    GetNotebookMetadataResult getNotebookMetadata(GetNotebookMetadataRequest getNotebookMetadataRequest);

    /**
     * <p>
     * Retrieves the prepared statement with the specified name from the specified workgroup.
     * </p>
     * 
     * @param getPreparedStatementRequest
     * @return Result of the GetPreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetPreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetPreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    GetPreparedStatementResult getPreparedStatement(GetPreparedStatementRequest getPreparedStatementRequest);

    /**
     * <p>
     * Returns information about a single execution of a query if you have access to the workgroup in which the query
     * ran. Each time a query executes, information about the query execution is saved with a unique ID.
     * </p>
     * 
     * @param getQueryExecutionRequest
     * @return Result of the GetQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    GetQueryExecutionResult getQueryExecution(GetQueryExecutionRequest getQueryExecutionRequest);

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
     * @return Result of the GetQueryResults operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.GetQueryResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryResults" target="_top">AWS API
     *      Documentation</a>
     */
    GetQueryResultsResult getQueryResults(GetQueryResultsRequest getQueryResultsRequest);

    /**
     * <p>
     * Returns query execution runtime statistics related to a single execution of a query if you have access to the
     * workgroup in which the query ran. Query execution runtime statistics are returned only when
     * <a>QueryExecutionStatus$State</a> is in a SUCCEEDED or FAILED state. Stage-level input and output row count and
     * data size statistics are not shown when a query has row-level filters defined in Lake Formation.
     * </p>
     * 
     * @param getQueryRuntimeStatisticsRequest
     * @return Result of the GetQueryRuntimeStatistics operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetQueryRuntimeStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetQueryRuntimeStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetQueryRuntimeStatisticsResult getQueryRuntimeStatistics(GetQueryRuntimeStatisticsRequest getQueryRuntimeStatisticsRequest);

    /**
     * <p>
     * Gets the full details of a previously created session, including the session status and configuration.
     * </p>
     * 
     * @param getSessionRequest
     * @return Result of the GetSession operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSession" target="_top">AWS API
     *      Documentation</a>
     */
    GetSessionResult getSession(GetSessionRequest getSessionRequest);

    /**
     * <p>
     * Gets the current status of a session.
     * </p>
     * 
     * @param getSessionStatusRequest
     * @return Result of the GetSessionStatus operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.GetSessionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetSessionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    GetSessionStatusResult getSessionStatus(GetSessionStatusRequest getSessionStatusRequest);

    /**
     * <p>
     * Returns table metadata for the specified catalog, database, and table.
     * </p>
     * 
     * @param getTableMetadataRequest
     * @return Result of the GetTableMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.GetTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    GetTableMetadataResult getTableMetadata(GetTableMetadataRequest getTableMetadataRequest);

    /**
     * <p>
     * Returns information about the workgroup with the specified name.
     * </p>
     * 
     * @param getWorkGroupRequest
     * @return Result of the GetWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.GetWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkGroupResult getWorkGroup(GetWorkGroupRequest getWorkGroupRequest);

    /**
     * <p>
     * Imports a single <code>ipynb</code> file to a Spark enabled workgroup. The maximum file size that can be imported
     * is 10 megabytes. If an <code>ipynb</code> file with the same name already exists in the workgroup, throws an
     * error.
     * </p>
     * 
     * @param importNotebookRequest
     * @return Result of the ImportNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ImportNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ImportNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    ImportNotebookResult importNotebook(ImportNotebookRequest importNotebookRequest);

    /**
     * <p>
     * Returns the supported DPU sizes for the supported application runtimes (for example, <code>Jupyter 1.0</code>).
     * </p>
     * 
     * @param listApplicationDPUSizesRequest
     * @return Result of the ListApplicationDPUSizes operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ListApplicationDPUSizes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListApplicationDPUSizes" target="_top">AWS
     *      API Documentation</a>
     */
    ListApplicationDPUSizesResult listApplicationDPUSizes(ListApplicationDPUSizesRequest listApplicationDPUSizesRequest);

    /**
     * <p>
     * Lists the calculations that have been submitted to a session in descending order. Newer calculations are listed
     * first; older calculations are listed later.
     * </p>
     * 
     * @param listCalculationExecutionsRequest
     * @return Result of the ListCalculationExecutions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListCalculationExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListCalculationExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListCalculationExecutionsResult listCalculationExecutions(ListCalculationExecutionsRequest listCalculationExecutionsRequest);

    /**
     * <p>
     * Lists the data catalogs in the current Amazon Web Services account.
     * </p>
     * 
     * @param listDataCatalogsRequest
     * @return Result of the ListDataCatalogs operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListDataCatalogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDataCatalogs" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataCatalogsResult listDataCatalogs(ListDataCatalogsRequest listDataCatalogsRequest);

    /**
     * <p>
     * Lists the databases in the specified data catalog.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListDatabases" target="_top">AWS API
     *      Documentation</a>
     */
    ListDatabasesResult listDatabases(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * Returns a list of engine versions that are available to choose from, including the Auto option.
     * </p>
     * 
     * @param listEngineVersionsRequest
     * @return Result of the ListEngineVersions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListEngineVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListEngineVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListEngineVersionsResult listEngineVersions(ListEngineVersionsRequest listEngineVersionsRequest);

    /**
     * <p>
     * Lists, in descending order, the executors that have been submitted to a session. Newer executors are listed
     * first; older executors are listed later. The result can be optionally filtered by state.
     * </p>
     * 
     * @param listExecutorsRequest
     * @return Result of the ListExecutors operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListExecutors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListExecutors" target="_top">AWS API
     *      Documentation</a>
     */
    ListExecutorsResult listExecutors(ListExecutorsRequest listExecutorsRequest);

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
     * @return Result of the ListNamedQueries operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListNamedQueries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNamedQueries" target="_top">AWS API
     *      Documentation</a>
     */
    ListNamedQueriesResult listNamedQueries(ListNamedQueriesRequest listNamedQueriesRequest);

    /**
     * <p>
     * Displays the notebook files for the specified workgroup in paginated format.
     * </p>
     * 
     * @param listNotebookMetadataRequest
     * @return Result of the ListNotebookMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.ListNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    ListNotebookMetadataResult listNotebookMetadata(ListNotebookMetadataRequest listNotebookMetadataRequest);

    /**
     * <p>
     * Lists, in descending order, the sessions that have been created in a notebook that are in an active state like
     * <code>CREATING</code>, <code>CREATED</code>, <code>IDLE</code> or <code>BUSY</code>. Newer sessions are listed
     * first; older sessions are listed later.
     * </p>
     * 
     * @param listNotebookSessionsRequest
     * @return Result of the ListNotebookSessions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListNotebookSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListNotebookSessions" target="_top">AWS
     *      API Documentation</a>
     */
    ListNotebookSessionsResult listNotebookSessions(ListNotebookSessionsRequest listNotebookSessionsRequest);

    /**
     * <p>
     * Lists the prepared statements in the specified workgroup.
     * </p>
     * 
     * @param listPreparedStatementsRequest
     * @return Result of the ListPreparedStatements operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListPreparedStatements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListPreparedStatements" target="_top">AWS
     *      API Documentation</a>
     */
    ListPreparedStatementsResult listPreparedStatements(ListPreparedStatementsRequest listPreparedStatementsRequest);

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
     * @return Result of the ListQueryExecutions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListQueryExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListQueryExecutions" target="_top">AWS API
     *      Documentation</a>
     */
    ListQueryExecutionsResult listQueryExecutions(ListQueryExecutionsRequest listQueryExecutionsRequest);

    /**
     * <p>
     * Lists the sessions in a workgroup that are in an active state like <code>CREATING</code>, <code>CREATED</code>,
     * <code>IDLE</code>, or <code>BUSY</code>. Newer sessions are listed first; older sessions are listed later.
     * </p>
     * 
     * @param listSessionsRequest
     * @return Result of the ListSessions operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListSessions" target="_top">AWS API
     *      Documentation</a>
     */
    ListSessionsResult listSessions(ListSessionsRequest listSessionsRequest);

    /**
     * <p>
     * Lists the metadata for the tables in the specified data catalog database.
     * </p>
     * 
     * @param listTableMetadataRequest
     * @return Result of the ListTableMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws MetadataException
     *         An exception that Athena received when it called a custom metastore. Occurs if the error is not caused by
     *         user input (<code>InvalidRequestException</code>) or from the Athena platform (
     *         <code>InternalServerException</code>). For example, if a user-created Lambda function is missing
     *         permissions, the Lambda <code>4XX</code> exception is returned in a <code>MetadataException</code>.
     * @sample AmazonAthena.ListTableMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTableMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    ListTableMetadataResult listTableMetadata(ListTableMetadataRequest listTableMetadataRequest);

    /**
     * <p>
     * Lists the tags associated with an Athena workgroup or data catalog resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists available workgroups for the account.
     * </p>
     * 
     * @param listWorkGroupsRequest
     * @return Result of the ListWorkGroups operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.ListWorkGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListWorkGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListWorkGroupsResult listWorkGroups(ListWorkGroupsRequest listWorkGroupsRequest);

    /**
     * <p>
     * Submits calculations for execution within a session. You can supply the code to run as an inline code block
     * within the request or as an Amazon S3 URL.
     * </p>
     * 
     * @param startCalculationExecutionRequest
     * @return Result of the StartCalculationExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.StartCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    StartCalculationExecutionResult startCalculationExecution(StartCalculationExecutionRequest startCalculationExecutionRequest);

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
     * @return Result of the StartQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.StartQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    StartQueryExecutionResult startQueryExecution(StartQueryExecutionRequest startQueryExecutionRequest);

    /**
     * <p>
     * Creates a session for running calculations within a workgroup. The session is ready when it reaches an
     * <code>IDLE</code> state.
     * </p>
     * 
     * @param startSessionRequest
     * @return Result of the StartSession operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @throws SessionAlreadyExistsException
     *         The specified session already exists.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.StartSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StartSession" target="_top">AWS API
     *      Documentation</a>
     */
    StartSessionResult startSession(StartSessionRequest startSessionRequest);

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
     * @return Result of the StopCalculationExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.StopCalculationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopCalculationExecution"
     *      target="_top">AWS API Documentation</a>
     */
    StopCalculationExecutionResult stopCalculationExecution(StopCalculationExecutionRequest stopCalculationExecutionRequest);

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
     * @return Result of the StopQueryExecution operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.StopQueryExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/StopQueryExecution" target="_top">AWS API
     *      Documentation</a>
     */
    StopQueryExecutionResult stopQueryExecution(StopQueryExecutionRequest stopQueryExecutionRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Terminates an active session. A <code>TerminateSession</code> call on a session that is already inactive (for
     * example, in a <code>FAILED</code>, <code>TERMINATED</code> or <code>TERMINATING</code> state) succeeds but has no
     * effect. Calculations running in the session when <code>TerminateSession</code> is called are forcefully stopped,
     * but may display as <code>FAILED</code> instead of <code>STOPPED</code>.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return Result of the TerminateSession operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    TerminateSessionResult terminateSession(TerminateSessionRequest terminateSessionRequest);

    /**
     * <p>
     * Removes one or more tags from a data catalog or workgroup resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the data catalog that has the specified name.
     * </p>
     * 
     * @param updateDataCatalogRequest
     * @return Result of the UpdateDataCatalog operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateDataCatalog
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateDataCatalog" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDataCatalogResult updateDataCatalog(UpdateDataCatalogRequest updateDataCatalogRequest);

    /**
     * <p>
     * Updates a <a>NamedQuery</a> object. The database or workgroup cannot be updated.
     * </p>
     * 
     * @param updateNamedQueryRequest
     * @return Result of the UpdateNamedQuery operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateNamedQuery
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNamedQuery" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateNamedQueryResult updateNamedQuery(UpdateNamedQueryRequest updateNamedQueryRequest);

    /**
     * <p>
     * Updates the contents of a Spark notebook.
     * </p>
     * 
     * @param updateNotebookRequest
     * @return Result of the UpdateNotebook operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.UpdateNotebook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebook" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateNotebookResult updateNotebook(UpdateNotebookRequest updateNotebookRequest);

    /**
     * <p>
     * Updates the metadata for a notebook.
     * </p>
     * 
     * @param updateNotebookMetadataRequest
     * @return Result of the UpdateNotebookMetadata operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws TooManyRequestsException
     *         Indicates that the request was throttled.
     * @sample AmazonAthena.UpdateNotebookMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateNotebookMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateNotebookMetadataResult updateNotebookMetadata(UpdateNotebookMetadataRequest updateNotebookMetadataRequest);

    /**
     * <p>
     * Updates a prepared statement.
     * </p>
     * 
     * @param updatePreparedStatementRequest
     * @return Result of the UpdatePreparedStatement operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @throws ResourceNotFoundException
     *         A resource, such as a workgroup, was not found.
     * @sample AmazonAthena.UpdatePreparedStatement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdatePreparedStatement" target="_top">AWS
     *      API Documentation</a>
     */
    UpdatePreparedStatementResult updatePreparedStatement(UpdatePreparedStatementRequest updatePreparedStatementRequest);

    /**
     * <p>
     * Updates the workgroup with the specified name. The workgroup's name cannot be changed. Only one of
     * <code>ConfigurationsUpdates</code> or <code>ConfigurationUpdates</code> can be specified;
     * <code>ConfigurationsUpdates</code> for a workgroup with multi engine support (for example, an Apache Spark
     * enabled workgroup) or <code>ConfigurationUpdates</code> for an Athena SQL workgroup.
     * </p>
     * 
     * @param updateWorkGroupRequest
     * @return Result of the UpdateWorkGroup operation returned by the service.
     * @throws InternalServerException
     *         Indicates a platform issue, which may be due to a transient condition or outage.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a required parameter may be
     *         missing or out of range.
     * @sample AmazonAthena.UpdateWorkGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateWorkGroup" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWorkGroupResult updateWorkGroup(UpdateWorkGroupRequest updateWorkGroupRequest);

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
