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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.keyspaces.model.*;

/**
 * Interface for accessing Amazon Keyspaces.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.keyspaces.AbstractAmazonKeyspaces} instead.
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
public interface AmazonKeyspaces {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cassandra";

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
     * @return Result of the CreateKeyspace operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonKeyspaces.CreateKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    CreateKeyspaceResult createKeyspace(CreateKeyspaceRequest createKeyspaceRequest);

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
     * @return Result of the CreateTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.CreateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateTable" target="_top">AWS API
     *      Documentation</a>
     */
    CreateTableResult createTable(CreateTableRequest createTableRequest);

    /**
     * <p>
     * The <code>DeleteKeyspace</code> operation deletes a keyspace and all of its tables.
     * </p>
     * 
     * @param deleteKeyspaceRequest
     * @return Result of the DeleteKeyspace operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.DeleteKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteKeyspaceResult deleteKeyspace(DeleteKeyspaceRequest deleteKeyspaceRequest);

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
     * @return Result of the DeleteTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.DeleteTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/DeleteTable" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest);

    /**
     * <p>
     * Returns the name and the Amazon Resource Name (ARN) of the specified table.
     * </p>
     * 
     * @param getKeyspaceRequest
     * @return Result of the GetKeyspace operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.GetKeyspace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetKeyspace" target="_top">AWS API
     *      Documentation</a>
     */
    GetKeyspaceResult getKeyspace(GetKeyspaceRequest getKeyspaceRequest);

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
     * @return Result of the GetTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.GetTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/GetTable" target="_top">AWS API
     *      Documentation</a>
     */
    GetTableResult getTable(GetTableRequest getTableRequest);

    /**
     * <p>
     * Returns a list of keyspaces.
     * </p>
     * 
     * @param listKeyspacesRequest
     * @return Result of the ListKeyspaces operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.ListKeyspaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListKeyspaces" target="_top">AWS API
     *      Documentation</a>
     */
    ListKeyspacesResult listKeyspaces(ListKeyspacesRequest listKeyspacesRequest);

    /**
     * <p>
     * Returns a list of tables for a specified keyspace.
     * </p>
     * 
     * @param listTablesRequest
     * @return Result of the ListTables operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.ListTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTables" target="_top">AWS API
     *      Documentation</a>
     */
    ListTablesResult listTables(ListTablesRequest listTablesRequest);

    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Keyspaces resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the RestoreTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.RestoreTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/RestoreTable" target="_top">AWS API
     *      Documentation</a>
     */
    RestoreTableResult restoreTable(RestoreTableRequest restoreTableRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the association of tags from a Amazon Keyspaces resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Adds new columns to the table or updates one of the table's settings, for example capacity mode, encryption,
     * point-in-time recovery, or ttl settings. Note that you can only update one specific table setting per update
     * operation.
     * </p>
     * 
     * @param updateTableRequest
     * @return Result of the UpdateTable operation returned by the service.
     * @throws ValidationException
     *         The operation failed due to an invalid or malformed request.
     * @throws ServiceQuotaExceededException
     *         The operation exceeded the service quota for this resource. For more information on service quotas, see
     *         <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/quotas.html">Quotas</a> in the <i>Amazon
     *         Keyspaces Developer Guide</i>.
     * @throws InternalServerException
     *         Amazon Keyspaces was unable to fully process this request because of an internal server error.
     * @throws ConflictException
     *         Amazon Keyspaces could not complete the requested action. This error may occur if you try to perform an
     *         action and the same or a different action is already in progress, or if you try to create a resource that
     *         already exists.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access a keyspace or table that doesn't exist. The resource might not be specified
     *         correctly, or its status might not be <code>ACTIVE</code>.
     * @sample AmazonKeyspaces.UpdateTable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/UpdateTable" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateTableResult updateTable(UpdateTableRequest updateTableRequest);

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
