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
package com.amazonaws.services.timestreamwrite;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamwrite.model.*;

/**
 * Interface for accessing Timestream Write asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.timestreamwrite.AbstractAmazonTimestreamWriteAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Timestream Write</fullname>
 * <p>
 * Amazon Timestream is a fast, scalable, fully managed time-series database service that makes it easy to store and
 * analyze trillions of time-series data points per day. With Timestream, you can easily store and analyze IoT sensor
 * data to derive insights from your IoT applications. You can analyze industrial telemetry to streamline equipment
 * management and maintenance. You can also store and analyze log data and metrics to improve the performance and
 * availability of your applications.
 * </p>
 * <p>
 * Timestream is built from the ground up to effectively ingest, process, and store time-series data. It organizes data
 * to optimize query processing. It automatically scales based on the volume of data ingested and on the query volume to
 * ensure you receive optimal performance while inserting and querying data. As your data grows over time, Timestream’s
 * adaptive query processing engine spans across storage tiers to provide fast analysis while reducing costs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonTimestreamWriteAsync extends AmazonTimestreamWrite {

    /**
     * <p>
     * Creates a new Timestream batch load task. A batch load task processes data from a CSV source in an S3 location
     * and writes to a Timestream table. A mapping from source to target is defined in a batch load task. Errors and
     * events are written to a report at an S3 location. For the report, if the KMS key is not specified, the report
     * will be encrypted with an S3 managed key when <code>SSE_S3</code> is the option. Otherwise an error is thrown.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed keys</a>. <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service
     * quotas apply</a>. For details, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-batch-load.html">code
     * sample</a>.
     * </p>
     * 
     * @param createBatchLoadTaskRequest
     * @return A Java Future containing the result of the CreateBatchLoadTask operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.CreateBatchLoadTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateBatchLoadTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchLoadTaskResult> createBatchLoadTaskAsync(CreateBatchLoadTaskRequest createBatchLoadTaskRequest);

    /**
     * <p>
     * Creates a new Timestream batch load task. A batch load task processes data from a CSV source in an S3 location
     * and writes to a Timestream table. A mapping from source to target is defined in a batch load task. Errors and
     * events are written to a report at an S3 location. For the report, if the KMS key is not specified, the report
     * will be encrypted with an S3 managed key when <code>SSE_S3</code> is the option. Otherwise an error is thrown.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed keys</a>. <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service
     * quotas apply</a>. For details, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-batch-load.html">code
     * sample</a>.
     * </p>
     * 
     * @param createBatchLoadTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBatchLoadTask operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.CreateBatchLoadTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateBatchLoadTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateBatchLoadTaskResult> createBatchLoadTaskAsync(CreateBatchLoadTaskRequest createBatchLoadTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBatchLoadTaskRequest, CreateBatchLoadTaskResult> asyncHandler);

    /**
     * <p>
     * Creates a new Timestream database. If the KMS key is not specified, the database will be encrypted with a
     * Timestream managed KMS key located in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed keys</a>. <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service
     * quotas apply</a>. For details, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-db.html">code sample</a>.
     * </p>
     * 
     * @param createDatabaseRequest
     * @return A Java Future containing the result of the CreateDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest createDatabaseRequest);

    /**
     * <p>
     * Creates a new Timestream database. If the KMS key is not specified, the database will be encrypted with a
     * Timestream managed KMS key located in your account. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk">Amazon Web Services
     * managed keys</a>. <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service
     * quotas apply</a>. For details, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-db.html">code sample</a>.
     * </p>
     * 
     * @param createDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.CreateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatabaseResult> createDatabaseAsync(CreateDatabaseRequest createDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatabaseRequest, CreateDatabaseResult> asyncHandler);

    /**
     * <p>
     * Adds a new table to an existing database in your account. In an Amazon Web Services account, table names must be
     * at least unique within each Region if they are in the same database. You might have identical table names in the
     * same Region if the tables are in separate databases. While creating the table, you must specify the table name,
     * database name, and the retention properties. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param createTableRequest
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest);

    /**
     * <p>
     * Adds a new table to an existing database in your account. In an Amazon Web Services account, table names must be
     * at least unique within each Region if they are in the same database. You might have identical table names in the
     * same Region if the tables are in separate databases. While creating the table, you must specify the table name,
     * database name, and the retention properties. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param createTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/CreateTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler);

    /**
     * <p>
     * Deletes a given Timestream database. <i>This is an irreversible operation. After a database is deleted, the
     * time-series data from its tables cannot be recovered.</i>
     * </p>
     * <note>
     * <p>
     * All tables in the database must be deleted first, or a ValidationException error will be thrown.
     * </p>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * </note>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.delete-db.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param deleteDatabaseRequest
     * @return A Java Future containing the result of the DeleteDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest deleteDatabaseRequest);

    /**
     * <p>
     * Deletes a given Timestream database. <i>This is an irreversible operation. After a database is deleted, the
     * time-series data from its tables cannot be recovered.</i>
     * </p>
     * <note>
     * <p>
     * All tables in the database must be deleted first, or a ValidationException error will be thrown.
     * </p>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * </note>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.delete-db.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param deleteDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.DeleteDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatabaseResult> deleteDatabaseAsync(DeleteDatabaseRequest deleteDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatabaseRequest, DeleteDatabaseResult> asyncHandler);

    /**
     * <p>
     * Deletes a given Timestream table. This is an irreversible operation. After a Timestream database table is
     * deleted, the time-series data stored in the table cannot be recovered.
     * </p>
     * <note>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * </note>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.delete-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param deleteTableRequest
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest);

    /**
     * <p>
     * Deletes a given Timestream table. This is an irreversible operation. After a Timestream database table is
     * deleted, the time-series data stored in the table cannot be recovered.
     * </p>
     * <note>
     * <p>
     * Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException.
     * Clients should consider them equivalent.
     * </p>
     * </note>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.delete-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param deleteTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DeleteTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler);

    /**
     * <p>
     * Returns information about the batch load task, including configurations, mappings, progress, and other details.
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>.
     * See <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.describe-batch-load.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param describeBatchLoadTaskRequest
     * @return A Java Future containing the result of the DescribeBatchLoadTask operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.DescribeBatchLoadTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeBatchLoadTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBatchLoadTaskResult> describeBatchLoadTaskAsync(DescribeBatchLoadTaskRequest describeBatchLoadTaskRequest);

    /**
     * <p>
     * Returns information about the batch load task, including configurations, mappings, progress, and other details.
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>.
     * See <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.describe-batch-load.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param describeBatchLoadTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBatchLoadTask operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.DescribeBatchLoadTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeBatchLoadTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeBatchLoadTaskResult> describeBatchLoadTaskAsync(DescribeBatchLoadTaskRequest describeBatchLoadTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBatchLoadTaskRequest, DescribeBatchLoadTaskResult> asyncHandler);

    /**
     * <p>
     * Returns information about the database, including the database name, time that the database was created, and the
     * total number of tables found within the database. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.describe-db.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param describeDatabaseRequest
     * @return A Java Future containing the result of the DescribeDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.DescribeDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatabaseResult> describeDatabaseAsync(DescribeDatabaseRequest describeDatabaseRequest);

    /**
     * <p>
     * Returns information about the database, including the database name, time that the database was created, and the
     * total number of tables found within the database. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.describe-db.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param describeDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.DescribeDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatabaseResult> describeDatabaseAsync(DescribeDatabaseRequest describeDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatabaseRequest, DescribeDatabaseResult> asyncHandler);

    /**
     * <p>
     * Returns a list of available endpoints to make Timestream API calls against. This API operation is available
     * through both the Write and Query APIs.
     * </p>
     * <p>
     * Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>we don't recommend that you use this API operation
     * unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/VPCEndpoints">VPC endpoints
     * (Amazon Web Services PrivateLink) with Timestream</a>
     * </p>
     * </li>
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
     * For detailed information on how and when to use and implement DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using.API.html#Using-API.endpoint-discovery"
     * >The Endpoint Discovery Pattern</a>.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Returns a list of available endpoints to make Timestream API calls against. This API operation is available
     * through both the Write and Query APIs.
     * </p>
     * <p>
     * Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the
     * management and mapping of the service endpoints, <i>we don't recommend that you use this API operation
     * unless</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You are using <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/VPCEndpoints">VPC endpoints
     * (Amazon Web Services PrivateLink) with Timestream</a>
     * </p>
     * </li>
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
     * For detailed information on how and when to use and implement DescribeEndpoints, see <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/Using.API.html#Using-API.endpoint-discovery"
     * >The Endpoint Discovery Pattern</a>.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeEndpoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the table, including the table name, database name, retention duration of the memory
     * store and the magnetic store. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.describe-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param describeTableRequest
     * @return A Java Future containing the result of the DescribeTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest);

    /**
     * <p>
     * Returns information about the table, including the table name, database name, retention duration of the memory
     * store and the magnetic store. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.describe-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param describeTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.DescribeTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableResult> describeTableAsync(DescribeTableRequest describeTableRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTableRequest, DescribeTableResult> asyncHandler);

    /**
     * <p>
     * Provides a list of batch load tasks, along with the name, status, when the task is resumable until, and other
     * details. See <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.list-batch-load-tasks.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param listBatchLoadTasksRequest
     * @return A Java Future containing the result of the ListBatchLoadTasks operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.ListBatchLoadTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListBatchLoadTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBatchLoadTasksResult> listBatchLoadTasksAsync(ListBatchLoadTasksRequest listBatchLoadTasksRequest);

    /**
     * <p>
     * Provides a list of batch load tasks, along with the name, status, when the task is resumable until, and other
     * details. See <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.list-batch-load-tasks.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param listBatchLoadTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBatchLoadTasks operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.ListBatchLoadTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListBatchLoadTasks"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListBatchLoadTasksResult> listBatchLoadTasksAsync(ListBatchLoadTasksRequest listBatchLoadTasksRequest,
            com.amazonaws.handlers.AsyncHandler<ListBatchLoadTasksRequest, ListBatchLoadTasksResult> asyncHandler);

    /**
     * <p>
     * Returns a list of your Timestream databases. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.list-db.html">code sample</a>
     * for details.
     * </p>
     * 
     * @param listDatabasesRequest
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest);

    /**
     * <p>
     * Returns a list of your Timestream databases. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>. See
     * <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.list-db.html">code sample</a>
     * for details.
     * </p>
     * 
     * @param listDatabasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatabases operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.ListDatabases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListDatabases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatabasesResult> listDatabasesAsync(ListDatabasesRequest listDatabasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatabasesRequest, ListDatabasesResult> asyncHandler);

    /**
     * <p>
     * Provides a list of tables, along with the name, status, and retention properties of each table. See <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.list-table.html">code sample</a>
     * for details.
     * </p>
     * 
     * @param listTablesRequest
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTables" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * Provides a list of tables, along with the name, status, and retention properties of each table. See <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.list-table.html">code sample</a>
     * for details.
     * </p>
     * 
     * @param listTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTables" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * <p>
     * Lists all tags on a Timestream resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on a Timestream resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * </p>
     * 
     * @param resumeBatchLoadTaskRequest
     * @return A Java Future containing the result of the ResumeBatchLoadTask operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.ResumeBatchLoadTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ResumeBatchLoadTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResumeBatchLoadTaskResult> resumeBatchLoadTaskAsync(ResumeBatchLoadTaskRequest resumeBatchLoadTaskRequest);

    /**
     * <p>
     * </p>
     * 
     * @param resumeBatchLoadTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeBatchLoadTask operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.ResumeBatchLoadTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/ResumeBatchLoadTask"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ResumeBatchLoadTaskResult> resumeBatchLoadTaskAsync(ResumeBatchLoadTaskRequest resumeBatchLoadTaskRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeBatchLoadTaskRequest, ResumeBatchLoadTaskResult> asyncHandler);

    /**
     * <p>
     * Associates a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates a set of tags with a Timestream resource. You can then activate these user-defined tags so that they
     * appear on the Billing and Cost Management console for cost allocation tracking.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the association of tags from a Timestream resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a Timestream resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the KMS key for an existing database. While updating the database, you must specify the database name
     * and the identifier of the new KMS key to be used (<code>KmsKeyId</code>). If there are any concurrent
     * <code>UpdateDatabase</code> requests, first writer wins.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.update-db.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @return A Java Future containing the result of the UpdateDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest updateDatabaseRequest);

    /**
     * <p>
     * Modifies the KMS key for an existing database. While updating the database, you must specify the database name
     * and the identifier of the new KMS key to be used (<code>KmsKeyId</code>). If there are any concurrent
     * <code>UpdateDatabase</code> requests, first writer wins.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.update-db.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param updateDatabaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatabase operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.UpdateDatabase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateDatabase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatabaseResult> updateDatabaseAsync(UpdateDatabaseRequest updateDatabaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatabaseRequest, UpdateDatabaseResult> asyncHandler);

    /**
     * <p>
     * Modifies the retention duration of the memory store and magnetic store for your Timestream table. Note that the
     * change in retention duration takes effect immediately. For example, if the retention period of the memory store
     * was initially set to 2 hours and then changed to 24 hours, the memory store will be capable of holding 24 hours
     * of data, but will be populated with 24 hours of data 22 hours after this change was made. Timestream does not
     * retrieve data from the magnetic store to populate the memory store.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.update-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param updateTableRequest
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest);

    /**
     * <p>
     * Modifies the retention duration of the memory store and magnetic store for your Timestream table. Note that the
     * change in retention duration takes effect immediately. For example, if the retention period of the memory store
     * was initially set to 2 hours and then changed to 24 hours, the memory store will be capable of holding 24 hours
     * of data, but will be populated with 24 hours of data 22 hours after this change was made. Timestream does not
     * retrieve data from the magnetic store to populate the memory store.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.update-table.html">code
     * sample</a> for details.
     * </p>
     * 
     * @param updateTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UpdateTable" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler);

    /**
     * <p>
     * Enables you to write your time-series data into Timestream. You can specify a single data point or a batch of
     * data points to be inserted into the system. Timestream offers you a flexible schema that auto detects the column
     * names and data types for your Timestream tables based on the dimension names and data types of the data points
     * you specify when invoking writes into the database.
     * </p>
     * <p>
     * Timestream supports eventual consistency read semantics. This means that when you query data immediately after
     * writing a batch of data into Timestream, the query results might not reflect the results of a recently completed
     * write operation. The results may also include some stale data. If you repeat the query request after a short
     * time, the results should return the latest data. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.write.html">code
     * sample</a> for details.
     * </p>
     * <p>
     * <b>Upserts</b>
     * </p>
     * <p>
     * You can use the <code>Version</code> parameter in a <code>WriteRecords</code> request to update data points.
     * Timestream tracks a version number with each record. <code>Version</code> defaults to <code>1</code> when it's
     * not specified for the record in the request. Timestream updates an existing record’s measure value along with its
     * <code>Version</code> when it receives a write request with a higher <code>Version</code> number for that record.
     * When it receives an update request where the measure value is the same as that of the existing record, Timestream
     * still updates <code>Version</code>, if it is greater than the existing value of <code>Version</code>. You can
     * update a data point as many times as desired, as long as the value of <code>Version</code> continuously
     * increases.
     * </p>
     * <p>
     * For example, suppose you write a new record without indicating <code>Version</code> in the request. Timestream
     * stores this record, and set <code>Version</code> to <code>1</code>. Now, suppose you try to update this record
     * with a <code>WriteRecords</code> request of the same record with a different measure value but, like before, do
     * not provide <code>Version</code>. In this case, Timestream will reject this update with a
     * <code>RejectedRecordsException</code> since the updated record’s version is not greater than the existing value
     * of Version.
     * </p>
     * <p>
     * However, if you were to resend the update request with <code>Version</code> set to <code>2</code>, Timestream
     * would then succeed in updating the record’s value, and the <code>Version</code> would be set to <code>2</code>.
     * Next, suppose you sent a <code>WriteRecords</code> request with this same record and an identical measure value,
     * but with <code>Version</code> set to <code>3</code>. In this case, Timestream would only update
     * <code>Version</code> to <code>3</code>. Any further updates would need to send a version number greater than
     * <code>3</code>, or the update requests would receive a <code>RejectedRecordsException</code>.
     * </p>
     * 
     * @param writeRecordsRequest
     * @return A Java Future containing the result of the WriteRecords operation returned by the service.
     * @sample AmazonTimestreamWriteAsync.WriteRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/WriteRecords" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<WriteRecordsResult> writeRecordsAsync(WriteRecordsRequest writeRecordsRequest);

    /**
     * <p>
     * Enables you to write your time-series data into Timestream. You can specify a single data point or a batch of
     * data points to be inserted into the system. Timestream offers you a flexible schema that auto detects the column
     * names and data types for your Timestream tables based on the dimension names and data types of the data points
     * you specify when invoking writes into the database.
     * </p>
     * <p>
     * Timestream supports eventual consistency read semantics. This means that when you query data immediately after
     * writing a batch of data into Timestream, the query results might not reflect the results of a recently completed
     * write operation. The results may also include some stale data. If you repeat the query request after a short
     * time, the results should return the latest data. <a
     * href="https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html">Service quotas apply</a>.
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.write.html">code
     * sample</a> for details.
     * </p>
     * <p>
     * <b>Upserts</b>
     * </p>
     * <p>
     * You can use the <code>Version</code> parameter in a <code>WriteRecords</code> request to update data points.
     * Timestream tracks a version number with each record. <code>Version</code> defaults to <code>1</code> when it's
     * not specified for the record in the request. Timestream updates an existing record’s measure value along with its
     * <code>Version</code> when it receives a write request with a higher <code>Version</code> number for that record.
     * When it receives an update request where the measure value is the same as that of the existing record, Timestream
     * still updates <code>Version</code>, if it is greater than the existing value of <code>Version</code>. You can
     * update a data point as many times as desired, as long as the value of <code>Version</code> continuously
     * increases.
     * </p>
     * <p>
     * For example, suppose you write a new record without indicating <code>Version</code> in the request. Timestream
     * stores this record, and set <code>Version</code> to <code>1</code>. Now, suppose you try to update this record
     * with a <code>WriteRecords</code> request of the same record with a different measure value but, like before, do
     * not provide <code>Version</code>. In this case, Timestream will reject this update with a
     * <code>RejectedRecordsException</code> since the updated record’s version is not greater than the existing value
     * of Version.
     * </p>
     * <p>
     * However, if you were to resend the update request with <code>Version</code> set to <code>2</code>, Timestream
     * would then succeed in updating the record’s value, and the <code>Version</code> would be set to <code>2</code>.
     * Next, suppose you sent a <code>WriteRecords</code> request with this same record and an identical measure value,
     * but with <code>Version</code> set to <code>3</code>. In this case, Timestream would only update
     * <code>Version</code> to <code>3</code>. Any further updates would need to send a version number greater than
     * <code>3</code>, or the update requests would receive a <code>RejectedRecordsException</code>.
     * </p>
     * 
     * @param writeRecordsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the WriteRecords operation returned by the service.
     * @sample AmazonTimestreamWriteAsyncHandler.WriteRecords
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/WriteRecords" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<WriteRecordsResult> writeRecordsAsync(WriteRecordsRequest writeRecordsRequest,
            com.amazonaws.handlers.AsyncHandler<WriteRecordsRequest, WriteRecordsResult> asyncHandler);

}
