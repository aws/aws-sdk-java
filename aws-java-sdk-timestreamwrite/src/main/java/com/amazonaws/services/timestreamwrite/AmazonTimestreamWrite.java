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
package com.amazonaws.services.timestreamwrite;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.timestreamwrite.model.*;

/**
 * Interface for accessing Timestream Write.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.timestreamwrite.AbstractAmazonTimestreamWrite} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Timestream is a fast, scalable, fully managed time series database service that makes it easy to store and
 * analyze trillions of time series data points per day. With Timestream, you can easily store and analyze IoT sensor
 * data to derive insights from your IoT applications. You can analyze industrial telemetry to streamline equipment
 * management and maintenance. You can also store and analyze log data and metrics to improve the performance and
 * availability of your applications. Timestream is built from the ground up to effectively ingest, process, and store
 * time series data. It organizes data to optimize query processing. It automatically scales based on the volume of data
 * ingested and on the query volume to ensure you receive optimal performance while inserting and querying data. As your
 * data grows over time, Timestream’s adaptive query processing engine spans across storage tiers to provide fast
 * analysis while reducing costs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTimestreamWrite {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "ingest.timestream";

    /**
     * <p>
     * Creates a new Timestream database. If the KMS key is not specified, the database will be encrypted with a
     * Timestream managed KMS key located in your account. Refer to <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">AWS managed KMS
     * keys</a> for more info. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return Result of the CreateDatabase operation returned by the service.
     * @throws ConflictException
     *         Timestream was unable to process this request because it contains resource that already exists.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @sample AmazonTimestreamWrite.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatabaseResult createDatabase(CreateDatabaseRequest createDatabaseRequest);

    /**
     * <p>
     * The CreateTable operation adds a new table to an existing database in your account. In an AWS account, table
     * names must be at least unique within each Region if they are in the same database. You may have identical table
     * names in the same Region if the tables are in seperate databases. While creating the table, you must specify the
     * table name, database name, and the retention properties. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param createTableRequest
     * @return Result of the CreateTable operation returned by the service.
     * @throws ConflictException
     *         Timestream was unable to process this request because it contains resource that already exists.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateTable" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTableResult createTable(CreateTableRequest createTableRequest);

    /**
     * <p>
     * Deletes a given Timestream database. <i>This is an irreversible operation. After a database is deleted, the time
     * series data from its tables cannot be recovered.</i>
     * </p>
     * <p>
     * All tables in the database must be deleted first, or a ValidationException error will be thrown.
     * </p>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * 
     * @param deleteDatabaseRequest
     * @return Result of the DeleteDatabase operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDatabaseResult deleteDatabase(DeleteDatabaseRequest deleteDatabaseRequest);

    /**
     * <p>
     * Deletes a given Timestream table. This is an irreversible operation. After a Timestream database table is
     * deleted, the time series data stored in the table cannot be recovered.
     * </p>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * 
     * @param deleteTableRequest
     * @return Result of the DeleteTable operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteTable" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest);

    /**
     * <p>
     * Returns information about the database, including the database name, time that the database was created, and the
     * total number of tables found within the database. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param describeDatabaseRequest
     * @return Result of the DescribeDatabase operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DescribeDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeDatabaseResult describeDatabase(DescribeDatabaseRequest describeDatabaseRequest);

    /**
     * <p>
     * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is
     * available through both Write and Query.
     * </p>
     * <p>
     * Because Timestream’s SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>it is not recommended that you use this API unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your application uses a programming language that does not yet have SDK support
     * </p>
     * </li>
     * <li>
     * <p>
     * You require better control over the client-side implementation
     * </p>
     * </li>
     * </ul>
     * <p>
     * For detailed information on how to use DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using-API.endpoint-discovery.html">The
     * Endpoint Discovery Pattern and REST APIs</a>.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @sample AmazonTimestreamWrite.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Returns information about the table, including the table name, database name, retention duration of the memory
     * store and the magnetic store. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param describeTableRequest
     * @return Result of the DescribeTable operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeTable" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeTableResult describeTable(DescribeTableRequest describeTableRequest);

    /**
     * <p>
     * Returns a list of your Timestream databases. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return Result of the ListDatabases operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    ListDatabasesResult listDatabases(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * A list of tables, along with the name, status and retention properties of each table.
     * </p>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTables" target="_top">AWS
     *      API Documentation</a>
     */
    ListTablesResult listTables(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * List all tags on a Timestream resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a Timestream resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Modifies the KMS key for an existing database. While updating the database, you must specify the database name
     * and the identifier of the new KMS key to be used (<code>KmsKeyId</code>). If there are any concurrent
     * <code>UpdateDatabase</code> requests, first writer wins.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return Result of the UpdateDatabase operation returned by the service.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws ServiceQuotaExceededException
     *         Instance quota of resource exceeded for this account.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDatabaseResult updateDatabase(UpdateDatabaseRequest updateDatabaseRequest);

    /**
     * <p>
     * Modifies the retention duration of the memory store and magnetic store for your Timestream table. Note that the
     * change in retention duration takes effect immediately. For example, if the retention period of the memory store
     * was initially set to 2 hours and then changed to 24 hours, the memory store will be capable of holding 24 hours
     * of data, but will be populated with 24 hours of data 22 hours after this change was made. Timestream does not
     * retrieve data from the magnetic store to populate the memory store.
     * </p>
     * <p>
     * Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param updateTableRequest
     * @return Result of the UpdateTable operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateTable" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTableResult updateTable(UpdateTableRequest updateTableRequest);

    /**
     * <p>
     * The WriteRecords operation enables you to write your time series data into Timestream. You can specify a single
     * data point or a batch of data points to be inserted into the system. Timestream offers you with a flexible schema
     * that auto detects the column names and data types for your Timestream tables based on the dimension names and
     * data types of the data points you specify when invoking writes into the database. Timestream support eventual
     * consistency read semantics. This means that when you query data immediately after writing a batch of data into
     * Timestream, the query results might not reflect the results of a recently completed write operation. The results
     * may also include some stale data. If you repeat the query request after a short time, the results should return
     * the latest data. Service quotas apply. For more information, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a> in the
     * Timestream Developer Guide.
     * </p>
     * 
     * @param writeRecordsRequest
     * @return Result of the WriteRecords operation returned by the service.
     * @throws InternalServerException
     *         Timestream was unable to fully process this request because of an internal server error.
     * @throws ThrottlingException
     *         Too many requests were made by a user exceeding service quotas. The request was throttled.
     * @throws ValidationException
     *         Invalid or malformed request.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent resource. The resource might not be specified correctly, or
     *         its status might not be ACTIVE.
     * @throws AccessDeniedException
     *         You are not authorized to perform this action.
     * @throws RejectedRecordsException
     *         WriteRecords would throw this exception in the following cases: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Records with duplicate data where there are multiple records with the same dimensions, timestamps, and
     *         measure names but different measure values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Records with timestamps that lie outside the retention duration of the memory store
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Records with dimensions or measures that exceed the Timestream defined limits.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Access Management</a>
     *         in the Timestream Developer Guide.
     * @throws InvalidEndpointException
     *         The requested endpoint was invalid.
     * @sample AmazonTimestreamWrite.WriteRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/WriteRecords" target="_top">AWS
     *      API Documentation</a>
     */
    WriteRecordsResult writeRecords(WriteRecordsRequest writeRecordsRequest);

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
