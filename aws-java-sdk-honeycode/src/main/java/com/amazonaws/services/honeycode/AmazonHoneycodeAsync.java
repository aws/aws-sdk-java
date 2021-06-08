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

/**
 * Interface for accessing Honeycode asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.honeycode.AbstractAmazonHoneycodeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without
 * programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals,
 * resources, and even your team.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonHoneycodeAsync extends AmazonHoneycode {

    /**
     * <p>
     * The BatchCreateTableRows API allows you to create one or more rows at the end of a table in a workbook. The API
     * allows you to specify the values to set in some or all of the columns in the new rows.
     * </p>
     * <p>
     * If a column is not explicitly set in a specific row, then the column level formula specified in the table will be
     * applied to the new row. If there is no column level formula but the last row of the table has a formula, then
     * that formula will be copied down to the new row. If there is no column level formula and no formula in the last
     * row of the table, then that column will be left blank for the new rows.
     * </p>
     * 
     * @param batchCreateTableRowsRequest
     * @return A Java Future containing the result of the BatchCreateTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsync.BatchCreateTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchCreateTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateTableRowsResult> batchCreateTableRowsAsync(BatchCreateTableRowsRequest batchCreateTableRowsRequest);

    /**
     * <p>
     * The BatchCreateTableRows API allows you to create one or more rows at the end of a table in a workbook. The API
     * allows you to specify the values to set in some or all of the columns in the new rows.
     * </p>
     * <p>
     * If a column is not explicitly set in a specific row, then the column level formula specified in the table will be
     * applied to the new row. If there is no column level formula but the last row of the table has a formula, then
     * that formula will be copied down to the new row. If there is no column level formula and no formula in the last
     * row of the table, then that column will be left blank for the new rows.
     * </p>
     * 
     * @param batchCreateTableRowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchCreateTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.BatchCreateTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchCreateTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchCreateTableRowsResult> batchCreateTableRowsAsync(BatchCreateTableRowsRequest batchCreateTableRowsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchCreateTableRowsRequest, BatchCreateTableRowsResult> asyncHandler);

    /**
     * <p>
     * The BatchDeleteTableRows API allows you to delete one or more rows from a table in a workbook. You need to
     * specify the ids of the rows that you want to delete from the table.
     * </p>
     * 
     * @param batchDeleteTableRowsRequest
     * @return A Java Future containing the result of the BatchDeleteTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsync.BatchDeleteTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchDeleteTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteTableRowsResult> batchDeleteTableRowsAsync(BatchDeleteTableRowsRequest batchDeleteTableRowsRequest);

    /**
     * <p>
     * The BatchDeleteTableRows API allows you to delete one or more rows from a table in a workbook. You need to
     * specify the ids of the rows that you want to delete from the table.
     * </p>
     * 
     * @param batchDeleteTableRowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.BatchDeleteTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchDeleteTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteTableRowsResult> batchDeleteTableRowsAsync(BatchDeleteTableRowsRequest batchDeleteTableRowsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteTableRowsRequest, BatchDeleteTableRowsResult> asyncHandler);

    /**
     * <p>
     * The BatchUpdateTableRows API allows you to update one or more rows in a table in a workbook.
     * </p>
     * <p>
     * You can specify the values to set in some or all of the columns in the table for the specified rows. If a column
     * is not explicitly specified in a particular row, then that column will not be updated for that row. To clear out
     * the data in a specific cell, you need to set the value as an empty string ("").
     * </p>
     * 
     * @param batchUpdateTableRowsRequest
     * @return A Java Future containing the result of the BatchUpdateTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsync.BatchUpdateTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpdateTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateTableRowsResult> batchUpdateTableRowsAsync(BatchUpdateTableRowsRequest batchUpdateTableRowsRequest);

    /**
     * <p>
     * The BatchUpdateTableRows API allows you to update one or more rows in a table in a workbook.
     * </p>
     * <p>
     * You can specify the values to set in some or all of the columns in the table for the specified rows. If a column
     * is not explicitly specified in a particular row, then that column will not be updated for that row. To clear out
     * the data in a specific cell, you need to set the value as an empty string ("").
     * </p>
     * 
     * @param batchUpdateTableRowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.BatchUpdateTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpdateTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateTableRowsResult> batchUpdateTableRowsAsync(BatchUpdateTableRowsRequest batchUpdateTableRowsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateTableRowsRequest, BatchUpdateTableRowsResult> asyncHandler);

    /**
     * <p>
     * The BatchUpsertTableRows API allows you to upsert one or more rows in a table. The upsert operation takes a
     * filter expression as input and evaluates it to find matching rows on the destination table. If matching rows are
     * found, it will update the cells in the matching rows to new values specified in the request. If no matching rows
     * are found, a new row is added at the end of the table and the cells in that row are set to the new values
     * specified in the request.
     * </p>
     * <p>
     * You can specify the values to set in some or all of the columns in the table for the matching or newly appended
     * rows. If a column is not explicitly specified for a particular row, then that column will not be updated for that
     * row. To clear out the data in a specific cell, you need to set the value as an empty string ("").
     * </p>
     * 
     * @param batchUpsertTableRowsRequest
     * @return A Java Future containing the result of the BatchUpsertTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsync.BatchUpsertTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpsertTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpsertTableRowsResult> batchUpsertTableRowsAsync(BatchUpsertTableRowsRequest batchUpsertTableRowsRequest);

    /**
     * <p>
     * The BatchUpsertTableRows API allows you to upsert one or more rows in a table. The upsert operation takes a
     * filter expression as input and evaluates it to find matching rows on the destination table. If matching rows are
     * found, it will update the cells in the matching rows to new values specified in the request. If no matching rows
     * are found, a new row is added at the end of the table and the cells in that row are set to the new values
     * specified in the request.
     * </p>
     * <p>
     * You can specify the values to set in some or all of the columns in the table for the matching or newly appended
     * rows. If a column is not explicitly specified for a particular row, then that column will not be updated for that
     * row. To clear out the data in a specific cell, you need to set the value as an empty string ("").
     * </p>
     * 
     * @param batchUpsertTableRowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpsertTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.BatchUpsertTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpsertTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpsertTableRowsResult> batchUpsertTableRowsAsync(BatchUpsertTableRowsRequest batchUpsertTableRowsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpsertTableRowsRequest, BatchUpsertTableRowsResult> asyncHandler);

    /**
     * <p>
     * The DescribeTableDataImportJob API allows you to retrieve the status and details of a table data import job.
     * </p>
     * 
     * @param describeTableDataImportJobRequest
     * @return A Java Future containing the result of the DescribeTableDataImportJob operation returned by the service.
     * @sample AmazonHoneycodeAsync.DescribeTableDataImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/DescribeTableDataImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableDataImportJobResult> describeTableDataImportJobAsync(
            DescribeTableDataImportJobRequest describeTableDataImportJobRequest);

    /**
     * <p>
     * The DescribeTableDataImportJob API allows you to retrieve the status and details of a table data import job.
     * </p>
     * 
     * @param describeTableDataImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTableDataImportJob operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.DescribeTableDataImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/DescribeTableDataImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableDataImportJobResult> describeTableDataImportJobAsync(
            DescribeTableDataImportJobRequest describeTableDataImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTableDataImportJobRequest, DescribeTableDataImportJobResult> asyncHandler);

    /**
     * <p>
     * The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local
     * variables in the screen to filter, sort or otherwise affect what will be displayed on the screen.
     * </p>
     * 
     * @param getScreenDataRequest
     * @return A Java Future containing the result of the GetScreenData operation returned by the service.
     * @sample AmazonHoneycodeAsync.GetScreenData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest getScreenDataRequest);

    /**
     * <p>
     * The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local
     * variables in the screen to filter, sort or otherwise affect what will be displayed on the screen.
     * </p>
     * 
     * @param getScreenDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetScreenData operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.GetScreenData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest getScreenDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetScreenDataRequest, GetScreenDataResult> asyncHandler);

    /**
     * <p>
     * The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows
     * setting local variables, which can then be used in the automation being invoked. This allows automating the
     * Honeycode app interactions to write, update or delete data in the workbook.
     * </p>
     * 
     * @param invokeScreenAutomationRequest
     * @return A Java Future containing the result of the InvokeScreenAutomation operation returned by the service.
     * @sample AmazonHoneycodeAsync.InvokeScreenAutomation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest invokeScreenAutomationRequest);

    /**
     * <p>
     * The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows
     * setting local variables, which can then be used in the automation being invoked. This allows automating the
     * Honeycode app interactions to write, update or delete data in the workbook.
     * </p>
     * 
     * @param invokeScreenAutomationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InvokeScreenAutomation operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.InvokeScreenAutomation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest invokeScreenAutomationRequest,
            com.amazonaws.handlers.AsyncHandler<InvokeScreenAutomationRequest, InvokeScreenAutomationResult> asyncHandler);

    /**
     * <p>
     * The ListTableColumns API allows you to retrieve a list of all the columns in a table in a workbook.
     * </p>
     * 
     * @param listTableColumnsRequest
     * @return A Java Future containing the result of the ListTableColumns operation returned by the service.
     * @sample AmazonHoneycodeAsync.ListTableColumns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableColumns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTableColumnsResult> listTableColumnsAsync(ListTableColumnsRequest listTableColumnsRequest);

    /**
     * <p>
     * The ListTableColumns API allows you to retrieve a list of all the columns in a table in a workbook.
     * </p>
     * 
     * @param listTableColumnsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTableColumns operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.ListTableColumns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableColumns" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTableColumnsResult> listTableColumnsAsync(ListTableColumnsRequest listTableColumnsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTableColumnsRequest, ListTableColumnsResult> asyncHandler);

    /**
     * <p>
     * The ListTableRows API allows you to retrieve a list of all the rows in a table in a workbook.
     * </p>
     * 
     * @param listTableRowsRequest
     * @return A Java Future containing the result of the ListTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsync.ListTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableRows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTableRowsResult> listTableRowsAsync(ListTableRowsRequest listTableRowsRequest);

    /**
     * <p>
     * The ListTableRows API allows you to retrieve a list of all the rows in a table in a workbook.
     * </p>
     * 
     * @param listTableRowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.ListTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableRows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTableRowsResult> listTableRowsAsync(ListTableRowsRequest listTableRowsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTableRowsRequest, ListTableRowsResult> asyncHandler);

    /**
     * <p>
     * The ListTables API allows you to retrieve a list of all the tables in a workbook.
     * </p>
     * 
     * @param listTablesRequest
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonHoneycodeAsync.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * The ListTables API allows you to retrieve a list of all the tables in a workbook.
     * </p>
     * 
     * @param listTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * <p>
     * The QueryTableRows API allows you to use a filter formula to query for specific rows in a table.
     * </p>
     * 
     * @param queryTableRowsRequest
     * @return A Java Future containing the result of the QueryTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsync.QueryTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/QueryTableRows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryTableRowsResult> queryTableRowsAsync(QueryTableRowsRequest queryTableRowsRequest);

    /**
     * <p>
     * The QueryTableRows API allows you to use a filter formula to query for specific rows in a table.
     * </p>
     * 
     * @param queryTableRowsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the QueryTableRows operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.QueryTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/QueryTableRows" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<QueryTableRowsResult> queryTableRowsAsync(QueryTableRowsRequest queryTableRowsRequest,
            com.amazonaws.handlers.AsyncHandler<QueryTableRowsRequest, QueryTableRowsResult> asyncHandler);

    /**
     * <p>
     * The StartTableDataImportJob API allows you to start an import job on a table. This API will only return the id of
     * the job that was started. To find out the status of the import request, you need to call the
     * DescribeTableDataImportJob API.
     * </p>
     * 
     * @param startTableDataImportJobRequest
     * @return A Java Future containing the result of the StartTableDataImportJob operation returned by the service.
     * @sample AmazonHoneycodeAsync.StartTableDataImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/StartTableDataImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTableDataImportJobResult> startTableDataImportJobAsync(StartTableDataImportJobRequest startTableDataImportJobRequest);

    /**
     * <p>
     * The StartTableDataImportJob API allows you to start an import job on a table. This API will only return the id of
     * the job that was started. To find out the status of the import request, you need to call the
     * DescribeTableDataImportJob API.
     * </p>
     * 
     * @param startTableDataImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTableDataImportJob operation returned by the service.
     * @sample AmazonHoneycodeAsyncHandler.StartTableDataImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/StartTableDataImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartTableDataImportJobResult> startTableDataImportJobAsync(StartTableDataImportJobRequest startTableDataImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartTableDataImportJobRequest, StartTableDataImportJobResult> asyncHandler);

}
