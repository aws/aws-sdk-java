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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.honeycode.model.*;

/**
 * Interface for accessing Honeycode.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.honeycode.AbstractAmazonHoneycode} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Honeycode is a fully managed service that allows you to quickly build mobile and web apps for teams—without
 * programming. Build Honeycode apps for managing almost anything, like projects, customers, operations, approvals,
 * resources, and even your team.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonHoneycode {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "honeycode";

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
     * @return Result of the BatchCreateTableRows operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceQuotaExceededException
     *         The request caused service quota to be breached.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.BatchCreateTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchCreateTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    BatchCreateTableRowsResult batchCreateTableRows(BatchCreateTableRowsRequest batchCreateTableRowsRequest);

    /**
     * <p>
     * The BatchDeleteTableRows API allows you to delete one or more rows from a table in a workbook. You need to
     * specify the ids of the rows that you want to delete from the table.
     * </p>
     * 
     * @param batchDeleteTableRowsRequest
     * @return Result of the BatchDeleteTableRows operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @sample AmazonHoneycode.BatchDeleteTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchDeleteTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDeleteTableRowsResult batchDeleteTableRows(BatchDeleteTableRowsRequest batchDeleteTableRowsRequest);

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
     * @return Result of the BatchUpdateTableRows operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @sample AmazonHoneycode.BatchUpdateTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpdateTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    BatchUpdateTableRowsResult batchUpdateTableRows(BatchUpdateTableRowsRequest batchUpdateTableRowsRequest);

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
     * @return Result of the BatchUpsertTableRows operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceQuotaExceededException
     *         The request caused service quota to be breached.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.BatchUpsertTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/BatchUpsertTableRows" target="_top">AWS
     *      API Documentation</a>
     */
    BatchUpsertTableRowsResult batchUpsertTableRows(BatchUpsertTableRowsRequest batchUpsertTableRowsRequest);

    /**
     * <p>
     * The DescribeTableDataImportJob API allows you to retrieve the status and details of a table data import job.
     * </p>
     * 
     * @param describeTableDataImportJobRequest
     * @return Result of the DescribeTableDataImportJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.DescribeTableDataImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/DescribeTableDataImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTableDataImportJobResult describeTableDataImportJob(DescribeTableDataImportJobRequest describeTableDataImportJobRequest);

    /**
     * <p>
     * The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local
     * variables in the screen to filter, sort or otherwise affect what will be displayed on the screen.
     * </p>
     * 
     * @param getScreenDataRequest
     * @return Result of the GetScreenData operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.GetScreenData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/GetScreenData" target="_top">AWS API
     *      Documentation</a>
     */
    GetScreenDataResult getScreenData(GetScreenDataRequest getScreenDataRequest);

    /**
     * <p>
     * The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows
     * setting local variables, which can then be used in the automation being invoked. This allows automating the
     * Honeycode app interactions to write, update or delete data in the workbook.
     * </p>
     * 
     * @param invokeScreenAutomationRequest
     * @return Result of the InvokeScreenAutomation operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws AutomationExecutionException
     *         The automation execution did not end successfully.
     * @throws AutomationExecutionTimeoutException
     *         The automation execution timed out.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @sample AmazonHoneycode.InvokeScreenAutomation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/InvokeScreenAutomation"
     *      target="_top">AWS API Documentation</a>
     */
    InvokeScreenAutomationResult invokeScreenAutomation(InvokeScreenAutomationRequest invokeScreenAutomationRequest);

    /**
     * <p>
     * The ListTableColumns API allows you to retrieve a list of all the columns in a table in a workbook.
     * </p>
     * 
     * @param listTableColumnsRequest
     * @return Result of the ListTableColumns operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.ListTableColumns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableColumns" target="_top">AWS API
     *      Documentation</a>
     */
    ListTableColumnsResult listTableColumns(ListTableColumnsRequest listTableColumnsRequest);

    /**
     * <p>
     * The ListTableRows API allows you to retrieve a list of all the rows in a table in a workbook.
     * </p>
     * 
     * @param listTableRowsRequest
     * @return Result of the ListTableRows operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @sample AmazonHoneycode.ListTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTableRows" target="_top">AWS API
     *      Documentation</a>
     */
    ListTableRowsResult listTableRows(ListTableRowsRequest listTableRowsRequest);

    /**
     * <p>
     * The ListTables API allows you to retrieve a list of all the tables in a workbook.
     * </p>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    ListTablesResult listTables(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * The QueryTableRows API allows you to use a filter formula to query for specific rows in a table.
     * </p>
     * 
     * @param queryTableRowsRequest
     * @return Result of the QueryTableRows operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws RequestTimeoutException
     *         The request timed out.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.QueryTableRows
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/QueryTableRows" target="_top">AWS API
     *      Documentation</a>
     */
    QueryTableRowsResult queryTableRows(QueryTableRowsRequest queryTableRowsRequest);

    /**
     * <p>
     * The StartTableDataImportJob API allows you to start an import job on a table. This API will only return the id of
     * the job that was started. To find out the status of the import request, you need to call the
     * DescribeTableDataImportJob API.
     * </p>
     * 
     * @param startTableDataImportJobRequest
     * @return Result of the StartTableDataImportJob operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action. Check that the workbook is owned by you and
     *         your IAM policy allows access to the resource in the request.
     * @throws InternalServerException
     *         There were unexpected errors from the server.
     * @throws ResourceNotFoundException
     *         A Workbook, Table, App, Screen or Screen Automation was not found with the given ID.
     * @throws ServiceUnavailableException
     *         Remote service is unreachable.
     * @throws ThrottlingException
     *         Tps(transactions per second) rate reached.
     * @throws ValidationException
     *         Request is invalid. The message in the response contains details on why the request is invalid.
     * @sample AmazonHoneycode.StartTableDataImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/StartTableDataImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartTableDataImportJobResult startTableDataImportJob(StartTableDataImportJobRequest startTableDataImportJobRequest);

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
