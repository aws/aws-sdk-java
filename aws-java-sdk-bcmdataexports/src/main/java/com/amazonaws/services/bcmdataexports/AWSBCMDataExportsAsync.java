/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bcmdataexports;

import javax.annotation.Generated;

import com.amazonaws.services.bcmdataexports.model.*;

/**
 * Interface for accessing AWS Billing and Cost Management Data Exports asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler}
 * can be used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bcmdataexports.AbstractAWSBCMDataExportsAsync} instead.
 * </p>
 * <p>
 * <p>
 * You can use the Data Exports API to create customized exports from multiple Amazon Web Services cost management and
 * billing datasets, such as cost and usage data and cost optimization recommendations.
 * </p>
 * <p>
 * The Data Exports API provides the following endpoint:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://bcm-data-exports.us-east-1.api.aws
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBCMDataExportsAsync extends AWSBCMDataExports {

    /**
     * <p>
     * Creates a data export and specifies the data query, the delivery preference, and any optional resource tags.
     * </p>
     * <p>
     * A <code>DataQuery</code> consists of both a <code>QueryStatement</code> and <code>TableConfigurations</code>.
     * </p>
     * <p>
     * The <code>QueryStatement</code> is an SQL statement. Data Exports only supports a limited subset of the SQL
     * syntax. For more information on the SQL syntax that is supported, see <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-data-query.html">Data query</a>. To view the available
     * tables and columns, see the <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-table-dictionary.html">Data Exports table
     * dictionary</a>.
     * </p>
     * <p>
     * The <code>TableConfigurations</code> is a collection of specified <code>TableProperties</code> for the table
     * being queried in the <code>QueryStatement</code>. TableProperties are additional configurations you can provide
     * to change the data and schema of a table. Each table can have different TableProperties. However, tables are not
     * required to have any TableProperties. Each table property has a default value that it assumes if not specified.
     * For more information on table configurations, see <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-data-query.html">Data query</a>. To view the table
     * properties available for each table, see the <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-table-dictionary.html">Data Exports table
     * dictionary</a> or use the <code>ListTables</code> API to get a response of all tables and their available
     * properties.
     * </p>
     * 
     * @param createExportRequest
     * @return A Java Future containing the result of the CreateExport operation returned by the service.
     * @sample AWSBCMDataExportsAsync.CreateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/CreateExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest createExportRequest);

    /**
     * <p>
     * Creates a data export and specifies the data query, the delivery preference, and any optional resource tags.
     * </p>
     * <p>
     * A <code>DataQuery</code> consists of both a <code>QueryStatement</code> and <code>TableConfigurations</code>.
     * </p>
     * <p>
     * The <code>QueryStatement</code> is an SQL statement. Data Exports only supports a limited subset of the SQL
     * syntax. For more information on the SQL syntax that is supported, see <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-data-query.html">Data query</a>. To view the available
     * tables and columns, see the <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-table-dictionary.html">Data Exports table
     * dictionary</a>.
     * </p>
     * <p>
     * The <code>TableConfigurations</code> is a collection of specified <code>TableProperties</code> for the table
     * being queried in the <code>QueryStatement</code>. TableProperties are additional configurations you can provide
     * to change the data and schema of a table. Each table can have different TableProperties. However, tables are not
     * required to have any TableProperties. Each table property has a default value that it assumes if not specified.
     * For more information on table configurations, see <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-data-query.html">Data query</a>. To view the table
     * properties available for each table, see the <a
     * href="https://docs.aws.amazon.com/cur/latest/userguide/de-table-dictionary.html">Data Exports table
     * dictionary</a> or use the <code>ListTables</code> API to get a response of all tables and their available
     * properties.
     * </p>
     * 
     * @param createExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExport operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.CreateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/CreateExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExportResult> createExportAsync(CreateExportRequest createExportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExportRequest, CreateExportResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing data export.
     * </p>
     * 
     * @param deleteExportRequest
     * @return A Java Future containing the result of the DeleteExport operation returned by the service.
     * @sample AWSBCMDataExportsAsync.DeleteExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/DeleteExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest deleteExportRequest);

    /**
     * <p>
     * Deletes an existing data export.
     * </p>
     * 
     * @param deleteExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExport operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.DeleteExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/DeleteExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExportResult> deleteExportAsync(DeleteExportRequest deleteExportRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExportRequest, DeleteExportResult> asyncHandler);

    /**
     * <p>
     * Exports data based on the source data update.
     * </p>
     * 
     * @param getExecutionRequest
     * @return A Java Future containing the result of the GetExecution operation returned by the service.
     * @sample AWSBCMDataExportsAsync.GetExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExecutionResult> getExecutionAsync(GetExecutionRequest getExecutionRequest);

    /**
     * <p>
     * Exports data based on the source data update.
     * </p>
     * 
     * @param getExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExecution operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.GetExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExecutionResult> getExecutionAsync(GetExecutionRequest getExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<GetExecutionRequest, GetExecutionResult> asyncHandler);

    /**
     * <p>
     * Views the definition of an existing data export.
     * </p>
     * 
     * @param getExportRequest
     * @return A Java Future containing the result of the GetExport operation returned by the service.
     * @sample AWSBCMDataExportsAsync.GetExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest getExportRequest);

    /**
     * <p>
     * Views the definition of an existing data export.
     * </p>
     * 
     * @param getExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExport operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.GetExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExport" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExportResult> getExportAsync(GetExportRequest getExportRequest,
            com.amazonaws.handlers.AsyncHandler<GetExportRequest, GetExportResult> asyncHandler);

    /**
     * <p>
     * Returns the metadata for the specified table and table properties. This includes the list of columns in the table
     * schema, their data types, and column descriptions.
     * </p>
     * 
     * @param getTableRequest
     * @return A Java Future containing the result of the GetTable operation returned by the service.
     * @sample AWSBCMDataExportsAsync.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest getTableRequest);

    /**
     * <p>
     * Returns the metadata for the specified table and table properties. This includes the list of columns in the table
     * schema, their data types, and column descriptions.
     * </p>
     * 
     * @param getTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTable operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest getTableRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableRequest, GetTableResult> asyncHandler);

    /**
     * <p>
     * Lists the historical executions for the export.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSBCMDataExportsAsync.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Lists the historical executions for the export.
     * </p>
     * 
     * @param listExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExecutions operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExecutionsResult> listExecutionsAsync(ListExecutionsRequest listExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExecutionsRequest, ListExecutionsResult> asyncHandler);

    /**
     * <p>
     * Lists all data export definitions.
     * </p>
     * 
     * @param listExportsRequest
     * @return A Java Future containing the result of the ListExports operation returned by the service.
     * @sample AWSBCMDataExportsAsync.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListExports" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest listExportsRequest);

    /**
     * <p>
     * Lists all data export definitions.
     * </p>
     * 
     * @param listExportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExports operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListExports" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExportsResult> listExportsAsync(ListExportsRequest listExportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExportsRequest, ListExportsResult> asyncHandler);

    /**
     * <p>
     * Lists all available tables in data exports.
     * </p>
     * 
     * @param listTablesRequest
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AWSBCMDataExportsAsync.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListTables" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * Lists all available tables in data exports.
     * </p>
     * 
     * @param listTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListTables" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * <p>
     * List tags associated with an existing data export.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBCMDataExportsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags associated with an existing data export.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds tags for an existing data export definition.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBCMDataExportsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags for an existing data export definition.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes tags associated with an existing data export definition.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBCMDataExportsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes tags associated with an existing data export definition.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing data export by overwriting all export parameters. All export parameters must be provided in
     * the UpdateExport request.
     * </p>
     * 
     * @param updateExportRequest
     * @return A Java Future containing the result of the UpdateExport operation returned by the service.
     * @sample AWSBCMDataExportsAsync.UpdateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/UpdateExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest updateExportRequest);

    /**
     * <p>
     * Updates an existing data export by overwriting all export parameters. All export parameters must be provided in
     * the UpdateExport request.
     * </p>
     * 
     * @param updateExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateExport operation returned by the service.
     * @sample AWSBCMDataExportsAsyncHandler.UpdateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/UpdateExport" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateExportResult> updateExportAsync(UpdateExportRequest updateExportRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateExportRequest, UpdateExportResult> asyncHandler);

}
