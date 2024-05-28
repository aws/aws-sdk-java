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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bcmdataexports.model.*;

/**
 * Interface for accessing AWS Billing and Cost Management Data Exports.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bcmdataexports.AbstractAWSBCMDataExports} instead.
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
public interface AWSBCMDataExports {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bcm-data-exports";

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
     * @return Result of the CreateExport operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You've reached the limit on the number of resources you can create, or exceeded the size of an individual
     *         resource.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.CreateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/CreateExport" target="_top">AWS
     *      API Documentation</a>
     */
    CreateExportResult createExport(CreateExportRequest createExportRequest);

    /**
     * <p>
     * Deletes an existing data export.
     * </p>
     * 
     * @param deleteExportRequest
     * @return Result of the DeleteExport operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.DeleteExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/DeleteExport" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteExportResult deleteExport(DeleteExportRequest deleteExportRequest);

    /**
     * <p>
     * Exports data based on the source data update.
     * </p>
     * 
     * @param getExecutionRequest
     * @return Result of the GetExecution operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.GetExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExecution" target="_top">AWS
     *      API Documentation</a>
     */
    GetExecutionResult getExecution(GetExecutionRequest getExecutionRequest);

    /**
     * <p>
     * Views the definition of an existing data export.
     * </p>
     * 
     * @param getExportRequest
     * @return Result of the GetExport operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.GetExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetExport" target="_top">AWS API
     *      Documentation</a>
     */
    GetExportResult getExport(GetExportRequest getExportRequest);

    /**
     * <p>
     * Returns the metadata for the specified table and table properties. This includes the list of columns in the table
     * schema, their data types, and column descriptions.
     * </p>
     * 
     * @param getTableRequest
     * @return Result of the GetTable operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    GetTableResult getTable(GetTableRequest getTableRequest);

    /**
     * <p>
     * Lists the historical executions for the export.
     * </p>
     * 
     * @param listExecutionsRequest
     * @return Result of the ListExecutions operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.ListExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    ListExecutionsResult listExecutions(ListExecutionsRequest listExecutionsRequest);

    /**
     * <p>
     * Lists all data export definitions.
     * </p>
     * 
     * @param listExportsRequest
     * @return Result of the ListExports operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.ListExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListExports" target="_top">AWS
     *      API Documentation</a>
     */
    ListExportsResult listExports(ListExportsRequest listExportsRequest);

    /**
     * <p>
     * Lists all available tables in data exports.
     * </p>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListTables" target="_top">AWS
     *      API Documentation</a>
     */
    ListTablesResult listTables(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * List tags associated with an existing data export.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds tags for an existing data export definition.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Deletes tags associated with an existing data export definition.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing data export by overwriting all export parameters. All export parameters must be provided in
     * the UpdateExport request.
     * </p>
     * 
     * @param updateExportRequest
     * @return Result of the UpdateExport operation returned by the service.
     * @throws InternalServerException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws ResourceNotFoundException
     *         The specified Amazon Resource Name (ARN) in the request doesn't exist.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ValidationException
     *         The input fails to satisfy the constraints specified by an Amazon Web Services service.
     * @sample AWSBCMDataExports.UpdateExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bcm-data-exports-2023-11-26/UpdateExport" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateExportResult updateExport(UpdateExportRequest updateExportRequest);

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
