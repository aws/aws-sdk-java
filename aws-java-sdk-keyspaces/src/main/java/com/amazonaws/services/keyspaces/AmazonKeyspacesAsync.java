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
package com.amazonaws.services.keyspaces;

import javax.annotation.Generated;

import com.amazonaws.services.keyspaces.model.*;

/**
 * Interface for accessing Amazon Keyspaces asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.keyspaces.AbstractAmazonKeyspacesAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Keyspaces (for Apache Cassandra) is a scalable, highly available, and managed Apache Cassandra-compatible
 * database service. Amazon Keyspaces makes it easy to migrate, run, and scale Cassandra workloads in the Amazon Web
 * Services Cloud. With just a few clicks on the Amazon Web Services Management Console or a few lines of code, you can
 * create keyspaces and tables in Amazon Keyspaces, without deploying any infrastructure or installing software.
 * </p>
 * <p>
 * In addition to supporting Cassandra Query Language (CQL) requests via open-source Cassandra drivers, Amazon Keyspaces
 * supports data definition language (DDL) operations to manage keyspaces and tables using the Amazon Web Services SDK
 * and CLI. This API reference describes the supported DDL operations in detail.
 * </p>
 * <p>
 * For the list of all supported CQL APIs, see <a
 * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cassandra-apis.html">Supported Cassandra APIs,
 * operations, and data types in Amazon Keyspaces</a> in the <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * <p>
 * To learn how Amazon Keyspaces API actions are recorded with CloudTrail, see <a href=
 * "https://docs.aws.amazon.com/keyspaces/latest/devguide/logging-using-cloudtrail.html#service-name-info-in-cloudtrail"
 * >Amazon Keyspaces information in CloudTrail</a> in the <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * <p>
 * For more information about Amazon Web Services APIs, for example how to implement retry logic or how to sign Amazon
 * Web Services API requests, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-apis.html">Amazon Web
 * Services APIs</a> in the <i>General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKeyspacesAsync extends AmazonKeyspaces {

    /**
     * <p>
     * The <code>CreateKeyspace</code> operation adds a new keyspace to your account. In an Amazon Web Services account,
     * keyspace names must be unique within each Region.
     * </p>
     * <p>
     * <code>CreateKeyspace</code> is an asynchronous operation. You can monitor the creation status of the new keyspace
     * by using the <code>GetKeyspace</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-keyspaces.html#keyspaces-create"
     * >Creating keyspaces</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param createKeyspaceRequest
     * @return A Java Future containing the result of the CreateKeyspace operation returned by the service.
     * @sample AmazonKeyspacesAsync.CreateKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyspaceResult> createKeyspaceAsync(CreateKeyspaceRequest createKeyspaceRequest);

    /**
     * <p>
     * The <code>CreateKeyspace</code> operation adds a new keyspace to your account. In an Amazon Web Services account,
     * keyspace names must be unique within each Region.
     * </p>
     * <p>
     * <code>CreateKeyspace</code> is an asynchronous operation. You can monitor the creation status of the new keyspace
     * by using the <code>GetKeyspace</code> operation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-keyspaces.html#keyspaces-create"
     * >Creating keyspaces</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param createKeyspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKeyspace operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.CreateKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyspaceResult> createKeyspaceAsync(CreateKeyspaceRequest createKeyspaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyspaceRequest, CreateKeyspaceResult> asyncHandler);

    /**
     * <p>
     * The <code>CreateTable</code> operation adds a new table to the specified keyspace. Within a keyspace, table names
     * must be unique.
     * </p>
     * <p>
     * <code>CreateTable</code> is an asynchronous operation. When the request is received, the status of the table is
     * set to <code>CREATING</code>. You can monitor the creation status of the new table by using the
     * <code>GetTable</code> operation, which returns the current <code>status</code> of the table. You can start using
     * a table when the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html#tables-create">Creating
     * tables</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param createTableRequest
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AmazonKeyspacesAsync.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest);

    /**
     * <p>
     * The <code>CreateTable</code> operation adds a new table to the specified keyspace. Within a keyspace, table names
     * must be unique.
     * </p>
     * <p>
     * <code>CreateTable</code> is an asynchronous operation. When the request is received, the status of the table is
     * set to <code>CREATING</code>. You can monitor the creation status of the new table by using the
     * <code>GetTable</code> operation, which returns the current <code>status</code> of the table. You can start using
     * a table when the status is <code>ACTIVE</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/working-with-tables.html#tables-create">Creating
     * tables</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param createTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTable operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest createTableRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler);

    /**
     * <p>
     * The <code>DeleteKeyspace</code> operation deletes a keyspace and all of its tables.
     * </p>
     * 
     * @param deleteKeyspaceRequest
     * @return A Java Future containing the result of the DeleteKeyspace operation returned by the service.
     * @sample AmazonKeyspacesAsync.DeleteKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyspaceResult> deleteKeyspaceAsync(DeleteKeyspaceRequest deleteKeyspaceRequest);

    /**
     * <p>
     * The <code>DeleteKeyspace</code> operation deletes a keyspace and all of its tables.
     * </p>
     * 
     * @param deleteKeyspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKeyspace operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.DeleteKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyspaceResult> deleteKeyspaceAsync(DeleteKeyspaceRequest deleteKeyspaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyspaceRequest, DeleteKeyspaceResult> asyncHandler);

    /**
     * <p>
     * The <code>DeleteTable</code> operation deletes a table and all of its data. After a <code>DeleteTable</code>
     * request is received, the specified table is in the <code>DELETING</code> state until Amazon Keyspaces completes
     * the deletion. If the table is in the <code>ACTIVE</code> state, you can delete it. If a table is either in the
     * <code>CREATING</code> or <code>UPDATING</code> states, then Amazon Keyspaces returns a
     * <code>ResourceInUseException</code>. If the specified table does not exist, Amazon Keyspaces returns a
     * <code>ResourceNotFoundException</code>. If the table is already in the <code>DELETING</code> state, no error is
     * returned.
     * </p>
     * 
     * @param deleteTableRequest
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AmazonKeyspacesAsync.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest);

    /**
     * <p>
     * The <code>DeleteTable</code> operation deletes a table and all of its data. After a <code>DeleteTable</code>
     * request is received, the specified table is in the <code>DELETING</code> state until Amazon Keyspaces completes
     * the deletion. If the table is in the <code>ACTIVE</code> state, you can delete it. If a table is either in the
     * <code>CREATING</code> or <code>UPDATING</code> states, then Amazon Keyspaces returns a
     * <code>ResourceInUseException</code>. If the specified table does not exist, Amazon Keyspaces returns a
     * <code>ResourceNotFoundException</code>. If the table is already in the <code>DELETING</code> state, no error is
     * returned.
     * </p>
     * 
     * @param deleteTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTable operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest deleteTableRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler);

    /**
     * <p>
     * Returns the name and the Amazon Resource Name (ARN) of the specified table.
     * </p>
     * 
     * @param getKeyspaceRequest
     * @return A Java Future containing the result of the GetKeyspace operation returned by the service.
     * @sample AmazonKeyspacesAsync.GetKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyspaceResult> getKeyspaceAsync(GetKeyspaceRequest getKeyspaceRequest);

    /**
     * <p>
     * Returns the name and the Amazon Resource Name (ARN) of the specified table.
     * </p>
     * 
     * @param getKeyspaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyspace operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.GetKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetKeyspaceResult> getKeyspaceAsync(GetKeyspaceRequest getKeyspaceRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyspaceRequest, GetKeyspaceResult> asyncHandler);

    /**
     * <p>
     * Returns information about the table, including the table's name and current status, the keyspace name,
     * configuration settings, and metadata.
     * </p>
     * <p>
     * To read table metadata using <code>GetTable</code>, <code>Select</code> action permissions for the table and
     * system tables are required to complete the operation.
     * </p>
     * 
     * @param getTableRequest
     * @return A Java Future containing the result of the GetTable operation returned by the service.
     * @sample AmazonKeyspacesAsync.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest getTableRequest);

    /**
     * <p>
     * Returns information about the table, including the table's name and current status, the keyspace name,
     * configuration settings, and metadata.
     * </p>
     * <p>
     * To read table metadata using <code>GetTable</code>, <code>Select</code> action permissions for the table and
     * system tables are required to complete the operation.
     * </p>
     * 
     * @param getTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTable operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest getTableRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableRequest, GetTableResult> asyncHandler);

    /**
     * <p>
     * Returns a list of keyspaces.
     * </p>
     * 
     * @param listKeyspacesRequest
     * @return A Java Future containing the result of the ListKeyspaces operation returned by the service.
     * @sample AmazonKeyspacesAsync.ListKeyspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListKeyspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeyspacesResult> listKeyspacesAsync(ListKeyspacesRequest listKeyspacesRequest);

    /**
     * <p>
     * Returns a list of keyspaces.
     * </p>
     * 
     * @param listKeyspacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeyspaces operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.ListKeyspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListKeyspaces" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListKeyspacesResult> listKeyspacesAsync(ListKeyspacesRequest listKeyspacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeyspacesRequest, ListKeyspacesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tables for a specified keyspace.
     * </p>
     * 
     * @param listTablesRequest
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonKeyspacesAsync.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * Returns a list of tables for a specified keyspace.
     * </p>
     * 
     * @param listTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTables operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest listTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Keyspaces resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonKeyspacesAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Keyspaces resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Restores the specified table to the specified point in time within the <code>earliest_restorable_timestamp</code>
     * and the current time. For more information about restore points, see <a href=
     * "https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery_HowItWorks.html#howitworks_backup_window"
     * > Time window for PITR continuous backups</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.
     * </p>
     * <p>
     * When you restore using point in time recovery, Amazon Keyspaces restores your source table's schema and data to
     * the state based on the selected timestamp <code>(day:hour:minute:second)</code> to a new table. The Time to Live
     * (TTL) settings are also restored to the state based on the selected timestamp.
     * </p>
     * <p>
     * In addition to the table's schema, data, and TTL settings, <code>RestoreTable</code> restores the capacity mode,
     * encryption, and point-in-time recovery settings from the source table. Unlike the table's schema data and TTL
     * settings, which are restored based on the selected timestamp, these settings are always restored based on the
     * table's settings as of the current time or when the table was deleted.
     * </p>
     * <p>
     * You can also overwrite these settings during restore:
     * </p>
     * <p>
     * • Read/write capacity mode
     * </p>
     * <p>
     * • Provisioned throughput capacity settings
     * </p>
     * <p>
     * • Point-in-time (PITR) settings
     * </p>
     * <p>
     * • Tags
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery_HowItWorks.html#howitworks_backup_settings"
     * >PITR restore settings</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * Note that the following settings are not restored, and you must configure them manually for the new table:
     * </p>
     * <p>
     * • Automatic scaling policies (for tables that use provisioned capacity mode)
     * </p>
     * <p>
     * • Identity and Access Management (IAM) policies
     * </p>
     * <p>
     * • Amazon CloudWatch metrics and alarms
     * </p>
     * 
     * @param restoreTableRequest
     * @return A Java Future containing the result of the RestoreTable operation returned by the service.
     * @sample AmazonKeyspacesAsync.RestoreTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/RestoreTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableResult> restoreTableAsync(RestoreTableRequest restoreTableRequest);

    /**
     * <p>
     * Restores the specified table to the specified point in time within the <code>earliest_restorable_timestamp</code>
     * and the current time. For more information about restore points, see <a href=
     * "https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery_HowItWorks.html#howitworks_backup_window"
     * > Time window for PITR continuous backups</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * Any number of users can execute up to 4 concurrent restores (any type of restore) in a given account.
     * </p>
     * <p>
     * When you restore using point in time recovery, Amazon Keyspaces restores your source table's schema and data to
     * the state based on the selected timestamp <code>(day:hour:minute:second)</code> to a new table. The Time to Live
     * (TTL) settings are also restored to the state based on the selected timestamp.
     * </p>
     * <p>
     * In addition to the table's schema, data, and TTL settings, <code>RestoreTable</code> restores the capacity mode,
     * encryption, and point-in-time recovery settings from the source table. Unlike the table's schema data and TTL
     * settings, which are restored based on the selected timestamp, these settings are always restored based on the
     * table's settings as of the current time or when the table was deleted.
     * </p>
     * <p>
     * You can also overwrite these settings during restore:
     * </p>
     * <p>
     * • Read/write capacity mode
     * </p>
     * <p>
     * • Provisioned throughput capacity settings
     * </p>
     * <p>
     * • Point-in-time (PITR) settings
     * </p>
     * <p>
     * • Tags
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery_HowItWorks.html#howitworks_backup_settings"
     * >PITR restore settings</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * Note that the following settings are not restored, and you must configure them manually for the new table:
     * </p>
     * <p>
     * • Automatic scaling policies (for tables that use provisioned capacity mode)
     * </p>
     * <p>
     * • Identity and Access Management (IAM) policies
     * </p>
     * <p>
     * • Amazon CloudWatch metrics and alarms
     * </p>
     * 
     * @param restoreTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreTable operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.RestoreTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/RestoreTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RestoreTableResult> restoreTableAsync(RestoreTableRequest restoreTableRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreTableRequest, RestoreTableResult> asyncHandler);

    /**
     * <p>
     * Associates a set of tags with a Amazon Keyspaces resource. You can then activate these user-defined tags so that
     * they appear on the Cost Management Console for cost allocation tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * For IAM policy examples that show how to control access to Amazon Keyspaces resources based on tags, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/security_iam_id-based-policy-examples-tags">Amazon
     * Keyspaces resource access based on tags</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonKeyspacesAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates a set of tags with a Amazon Keyspaces resource. You can then activate these user-defined tags so that
     * they appear on the Cost Management Console for cost allocation tracking. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * For IAM policy examples that show how to control access to Amazon Keyspaces resources based on tags, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/security_iam_id-based-policy-examples-tags">Amazon
     * Keyspaces resource access based on tags</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the association of tags from a Amazon Keyspaces resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonKeyspacesAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a Amazon Keyspaces resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Adds new columns to the table or updates one of the table's settings, for example capacity mode, encryption,
     * point-in-time recovery, or ttl settings. Note that you can only update one specific table setting per update
     * operation.
     * </p>
     * 
     * @param updateTableRequest
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AmazonKeyspacesAsync.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest);

    /**
     * <p>
     * Adds new columns to the table or updates one of the table's settings, for example capacity mode, encryption,
     * point-in-time recovery, or ttl settings. Note that you can only update one specific table setting per update
     * operation.
     * </p>
     * 
     * @param updateTableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTable operation returned by the service.
     * @sample AmazonKeyspacesAsyncHandler.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest updateTableRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler);

}
