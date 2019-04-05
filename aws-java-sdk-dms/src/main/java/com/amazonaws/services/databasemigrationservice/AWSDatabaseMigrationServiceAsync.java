/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;

/**
 * Interface for accessing AWS Database Migration Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.databasemigrationservice.AbstractAWSDatabaseMigrationServiceAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Database Migration Service</fullname>
 * <p>
 * AWS Database Migration Service (AWS DMS) can migrate your data to and from the most widely used commercial and
 * open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora,
 * MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to
 * Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL
 * Server to PostgreSQL.
 * </p>
 * <p>
 * For more information about AWS DMS, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html">What
 * Is AWS Database Migration Service?</a> in the <i>AWS Database Migration User Guide.</i>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDatabaseMigrationServiceAsync extends AWSDatabaseMigrationService {

    /**
     * <p>
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and
     * migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS
     * resources, or used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and
     * migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS
     * resources, or used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a replication instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @return A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ApplyPendingMaintenanceActionResult> applyPendingMaintenanceActionAsync(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a replication instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ApplyPendingMaintenanceActionResult> applyPendingMaintenanceActionAsync(
            ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest,
            com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ApplyPendingMaintenanceActionResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * 
     * @param createEndpointRequest
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest);

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * 
     * @param createEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates an AWS DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to be notified of, provide a list of AWS
     * DMS source IDs (<code>SourceIds</code>) that triggers the events, and provide a list of event categories (
     * <code>EventCategories</code>) for events you want to be notified of. If you specify both the
     * <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of all the replication instance events for
     * the specified source. If you specify a <code>SourceType</code> but don't specify a <code>SourceIdentifier</code>,
     * you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be notified of events generated from all AWS
     * DMS sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about AWS DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventSubscriptionResult> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates an AWS DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to be notified of, provide a list of AWS
     * DMS source IDs (<code>SourceIds</code>) that triggers the events, and provide a list of event categories (
     * <code>EventCategories</code>) for events you want to be notified of. If you specify both the
     * <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of all the replication instance events for
     * the specified source. If you specify a <code>SourceType</code> but don't specify a <code>SourceIdentifier</code>,
     * you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be notified of events generated from all AWS
     * DMS sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about AWS DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param createEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventSubscription operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEventSubscriptionResult> createEventSubscriptionAsync(CreateEventSubscriptionRequest createEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, CreateEventSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * 
     * @param createReplicationInstanceRequest
     * @return A Java Future containing the result of the CreateReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.CreateReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(
            CreateReplicationInstanceRequest createReplicationInstanceRequest);

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * 
     * @param createReplicationInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.CreateReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(
            CreateReplicationInstanceRequest createReplicationInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationInstanceRequest, CreateReplicationInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     * </p>
     * 
     * @param createReplicationSubnetGroupRequest
     * @return A Java Future containing the result of the CreateReplicationSubnetGroup operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.CreateReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(
            CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest);

    /**
     * <p>
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     * </p>
     * 
     * @param createReplicationSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationSubnetGroup operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.CreateReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(
            CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationSubnetGroupRequest, CreateReplicationSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a replication task using the specified parameters.
     * </p>
     * 
     * @param createReplicationTaskRequest
     * @return A Java Future containing the result of the CreateReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.CreateReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(CreateReplicationTaskRequest createReplicationTaskRequest);

    /**
     * <p>
     * Creates a replication task using the specified parameters.
     * </p>
     * 
     * @param createReplicationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.CreateReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(CreateReplicationTaskRequest createReplicationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationTaskRequest, CreateReplicationTaskResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCertificate operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteCertificateResult> deleteCertificateAsync(DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, DeleteCertificateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified endpoint.
     * </p>
     * <note>
     * <p>
     * All tasks associated with the endpoint must be deleted before you can delete the endpoint.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteEndpointRequest
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * Deletes the specified endpoint.
     * </p>
     * <note>
     * <p>
     * All tasks associated with the endpoint must be deleted before you can delete the endpoint.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEndpoint operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS DMS event subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

    /**
     * <p>
     * Deletes an AWS DMS event subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventSubscription operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventSubscriptionResult> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, DeleteEventSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified replication instance.
     * </p>
     * <note>
     * <p>
     * You must delete any migration tasks that are associated with the replication instance before you can delete it.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteReplicationInstanceRequest
     * @return A Java Future containing the result of the DeleteReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(
            DeleteReplicationInstanceRequest deleteReplicationInstanceRequest);

    /**
     * <p>
     * Deletes the specified replication instance.
     * </p>
     * <note>
     * <p>
     * You must delete any migration tasks that are associated with the replication instance before you can delete it.
     * </p>
     * </note>
     * <p/>
     * 
     * @param deleteReplicationInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(
            DeleteReplicationInstanceRequest deleteReplicationInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationInstanceRequest, DeleteReplicationInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * 
     * @param deleteReplicationSubnetGroupRequest
     * @return A Java Future containing the result of the DeleteReplicationSubnetGroup operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(
            DeleteReplicationSubnetGroupRequest deleteReplicationSubnetGroupRequest);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * 
     * @param deleteReplicationSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationSubnetGroup operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(
            DeleteReplicationSubnetGroupRequest deleteReplicationSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationSubnetGroupRequest, DeleteReplicationSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified replication task.
     * </p>
     * 
     * @param deleteReplicationTaskRequest
     * @return A Java Future containing the result of the DeleteReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(DeleteReplicationTaskRequest deleteReplicationTaskRequest);

    /**
     * <p>
     * Deletes the specified replication task.
     * </p>
     * 
     * @param deleteReplicationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(DeleteReplicationTaskRequest deleteReplicationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationTaskRequest, DeleteReplicationTaskResult> asyncHandler);

    /**
     * <p>
     * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the
     * account, such as the number of replication instances allowed. The description for a quota includes the quota
     * name, current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Lists all of the AWS DMS attributes for a customer account. The attributes include AWS DMS quotas for the
     * account, such as the number of replication instances allowed. The description for a quota includes the quota
     * name, current usage toward that quota, and the quota's maximum value.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * 
     * @param describeAccountAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeAccountAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest describeAccountAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler);

    /**
     * <p>
     * Provides a description of the certificate.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return A Java Future containing the result of the DescribeCertificates operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest describeCertificatesRequest);

    /**
     * <p>
     * Provides a description of the certificate.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificates operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeCertificates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest describeCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler);

    /**
     * <p>
     * Describes the status of the connections that have been made between the replication instance and an endpoint.
     * Connections are created when you test an endpoint.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @return A Java Future containing the result of the DescribeConnections operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest describeConnectionsRequest);

    /**
     * <p>
     * Describes the status of the connections that have been made between the replication instance and an endpoint.
     * Connections are created when you test an endpoint.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConnections operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(DescribeConnectionsRequest describeConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the type of endpoints available.
     * </p>
     * 
     * @param describeEndpointTypesRequest
     * @return A Java Future containing the result of the DescribeEndpointTypes operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeEndpointTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(DescribeEndpointTypesRequest describeEndpointTypesRequest);

    /**
     * <p>
     * Returns information about the type of endpoints available.
     * </p>
     * 
     * @param describeEndpointTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpointTypes operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeEndpointTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(DescribeEndpointTypesRequest describeEndpointTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointTypesRequest, DescribeEndpointTypesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the endpoints for your account in the current region.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Returns information about the endpoints for your account in the current region.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpoints operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeEndpoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler);

    /**
     * <p>
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of
     * the event categories and source types in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest describeEventCategoriesRequest);

    /**
     * <p>
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of
     * the event categories and source types in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventCategories operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest describeEventCategoriesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler);

    /**
     * <p>
     * Lists all the event subscriptions for a customer account. The description of a subscription includes
     * <code>SubscriptionName</code>, <code>SNSTopicARN</code>, <code>CustomerID</code>, <code>SourceType</code>,
     * <code>SourceID</code>, <code>CreationTime</code>, and <code>Status</code>.
     * </p>
     * <p>
     * If you specify <code>SubscriptionName</code>, this action lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * <p>
     * Lists all the event subscriptions for a customer account. The description of a subscription includes
     * <code>SubscriptionName</code>, <code>SNSTopicARN</code>, <code>CustomerID</code>, <code>SourceType</code>,
     * <code>SourceID</code>, <code>CreationTime</code>, and <code>Status</code>.
     * </p>
     * <p>
     * If you specify <code>SubscriptionName</code>, this action lists the description for that subscription.
     * </p>
     * 
     * @param describeEventSubscriptionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler);

    /**
     * <p>
     * Lists events for a given source identifier and source type. You can also specify a start and end time. For more
     * information on AWS DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration User Guide.</i>
     * </p>
     * 
     * @param describeEventsRequest
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Lists events for a given source identifier and source type. You can also specify a start and end time. For more
     * information on AWS DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration User Guide.</i>
     * </p>
     * 
     * @param describeEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the replication instance types that can be created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest
     * @return A Java Future containing the result of the DescribeOrderableReplicationInstances operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeOrderableReplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeOrderableReplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest);

    /**
     * <p>
     * Returns information about the replication instance types that can be created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrderableReplicationInstances operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeOrderableReplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeOrderableReplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableReplicationInstancesRequest, DescribeOrderableReplicationInstancesResult> asyncHandler);

    /**
     * <p>
     * For internal use only
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @return A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

    /**
     * <p>
     * For internal use only
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler);

    /**
     * <p>
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * 
     * @param describeRefreshSchemasStatusRequest
     * @return A Java Future containing the result of the DescribeRefreshSchemasStatus operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeRefreshSchemasStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeRefreshSchemasStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(
            DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest);

    /**
     * <p>
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * 
     * @param describeRefreshSchemasStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRefreshSchemasStatus operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeRefreshSchemasStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeRefreshSchemasStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(
            DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRefreshSchemasStatusRequest, DescribeRefreshSchemasStatusResult> asyncHandler);

    /**
     * <p>
     * Returns information about the task logs for the specified task.
     * </p>
     * 
     * @param describeReplicationInstanceTaskLogsRequest
     * @return A Java Future containing the result of the DescribeReplicationInstanceTaskLogs operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationInstanceTaskLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstanceTaskLogs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationInstanceTaskLogsResult> describeReplicationInstanceTaskLogsAsync(
            DescribeReplicationInstanceTaskLogsRequest describeReplicationInstanceTaskLogsRequest);

    /**
     * <p>
     * Returns information about the task logs for the specified task.
     * </p>
     * 
     * @param describeReplicationInstanceTaskLogsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationInstanceTaskLogs operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeReplicationInstanceTaskLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstanceTaskLogs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationInstanceTaskLogsResult> describeReplicationInstanceTaskLogsAsync(
            DescribeReplicationInstanceTaskLogsRequest describeReplicationInstanceTaskLogsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationInstanceTaskLogsRequest, DescribeReplicationInstanceTaskLogsResult> asyncHandler);

    /**
     * <p>
     * Returns information about replication instances for your account in the current region.
     * </p>
     * 
     * @param describeReplicationInstancesRequest
     * @return A Java Future containing the result of the DescribeReplicationInstances operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(
            DescribeReplicationInstancesRequest describeReplicationInstancesRequest);

    /**
     * <p>
     * Returns information about replication instances for your account in the current region.
     * </p>
     * 
     * @param describeReplicationInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationInstances operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeReplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(
            DescribeReplicationInstancesRequest describeReplicationInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationInstancesRequest, DescribeReplicationInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the replication subnet groups.
     * </p>
     * 
     * @param describeReplicationSubnetGroupsRequest
     * @return A Java Future containing the result of the DescribeReplicationSubnetGroups operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest);

    /**
     * <p>
     * Returns information about the replication subnet groups.
     * </p>
     * 
     * @param describeReplicationSubnetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationSubnetGroups operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeReplicationSubnetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationSubnetGroupsRequest, DescribeReplicationSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     * </p>
     * 
     * @param describeReplicationTaskAssessmentResultsRequest
     * @return A Java Future containing the result of the DescribeReplicationTaskAssessmentResults operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationTaskAssessmentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTaskAssessmentResultsResult> describeReplicationTaskAssessmentResultsAsync(
            DescribeReplicationTaskAssessmentResultsRequest describeReplicationTaskAssessmentResultsRequest);

    /**
     * <p>
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     * </p>
     * 
     * @param describeReplicationTaskAssessmentResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationTaskAssessmentResults operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeReplicationTaskAssessmentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTaskAssessmentResultsResult> describeReplicationTaskAssessmentResultsAsync(
            DescribeReplicationTaskAssessmentResultsRequest describeReplicationTaskAssessmentResultsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationTaskAssessmentResultsRequest, DescribeReplicationTaskAssessmentResultsResult> asyncHandler);

    /**
     * <p>
     * Returns information about replication tasks for your account in the current region.
     * </p>
     * 
     * @param describeReplicationTasksRequest
     * @return A Java Future containing the result of the DescribeReplicationTasks operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(DescribeReplicationTasksRequest describeReplicationTasksRequest);

    /**
     * <p>
     * Returns information about replication tasks for your account in the current region.
     * </p>
     * 
     * @param describeReplicationTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationTasks operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeReplicationTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(DescribeReplicationTasksRequest describeReplicationTasksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationTasksRequest, DescribeReplicationTasksResult> asyncHandler);

    /**
     * <p>
     * Returns information about the schema for the specified endpoint.
     * </p>
     * <p/>
     * 
     * @param describeSchemasRequest
     * @return A Java Future containing the result of the DescribeSchemas operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(DescribeSchemasRequest describeSchemasRequest);

    /**
     * <p>
     * Returns information about the schema for the specified endpoint.
     * </p>
     * <p/>
     * 
     * @param describeSchemasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSchemas operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(DescribeSchemasRequest describeSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSchemasRequest, DescribeSchemasResult> asyncHandler);

    /**
     * <p>
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
     * rows deleted.
     * </p>
     * <p>
     * Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table
     * statistics record for a table. It does not indicate the time of the last update to the table.
     * </p>
     * 
     * @param describeTableStatisticsRequest
     * @return A Java Future containing the result of the DescribeTableStatistics operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeTableStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeTableStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(DescribeTableStatisticsRequest describeTableStatisticsRequest);

    /**
     * <p>
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
     * rows deleted.
     * </p>
     * <p>
     * Note that the "last updated" column the DMS console only indicates the time that AWS DMS last updated the table
     * statistics record for a table. It does not indicate the time of the last update to the table.
     * </p>
     * 
     * @param describeTableStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTableStatistics operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeTableStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeTableStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(DescribeTableStatisticsRequest describeTableStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTableStatisticsRequest, DescribeTableStatisticsResult> asyncHandler);

    /**
     * <p>
     * Uploads the specified certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return A Java Future containing the result of the ImportCertificate operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest);

    /**
     * <p>
     * Uploads the specified certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportCertificate operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ImportCertificateResult> importCertificateAsync(ImportCertificateRequest importCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<ImportCertificateRequest, ImportCertificateResult> asyncHandler);

    /**
     * <p>
     * Lists all tags for an AWS DMS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags for an AWS DMS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified endpoint.
     * </p>
     * 
     * @param modifyEndpointRequest
     * @return A Java Future containing the result of the ModifyEndpoint operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.ModifyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(ModifyEndpointRequest modifyEndpointRequest);

    /**
     * <p>
     * Modifies the specified endpoint.
     * </p>
     * 
     * @param modifyEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyEndpoint operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ModifyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(ModifyEndpointRequest modifyEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyEndpointRequest, ModifyEndpointResult> asyncHandler);

    /**
     * <p>
     * Modifies an existing AWS DMS event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyEventSubscriptionResult> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

    /**
     * <p>
     * Modifies an existing AWS DMS event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyEventSubscription operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyEventSubscriptionResult> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, ModifyEventSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying
     * these parameters and the new values in the request.
     * </p>
     * <p>
     * Some settings are applied during the maintenance window.
     * </p>
     * <p/>
     * 
     * @param modifyReplicationInstanceRequest
     * @return A Java Future containing the result of the ModifyReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.ModifyReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(
            ModifyReplicationInstanceRequest modifyReplicationInstanceRequest);

    /**
     * <p>
     * Modifies the replication instance to apply new settings. You can change one or more parameters by specifying
     * these parameters and the new values in the request.
     * </p>
     * <p>
     * Some settings are applied during the maintenance window.
     * </p>
     * <p/>
     * 
     * @param modifyReplicationInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ModifyReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(
            ModifyReplicationInstanceRequest modifyReplicationInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationInstanceRequest, ModifyReplicationInstanceResult> asyncHandler);

    /**
     * <p>
     * Modifies the settings for the specified replication subnet group.
     * </p>
     * 
     * @param modifyReplicationSubnetGroupRequest
     * @return A Java Future containing the result of the ModifyReplicationSubnetGroup operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.ModifyReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(
            ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest);

    /**
     * <p>
     * Modifies the settings for the specified replication subnet group.
     * </p>
     * 
     * @param modifyReplicationSubnetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReplicationSubnetGroup operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ModifyReplicationSubnetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(
            ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationSubnetGroupRequest, ModifyReplicationSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Modifies the specified replication task.
     * </p>
     * <p>
     * You can't modify the task endpoints. The task must be stopped before you can modify it.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks</a> in the
     * <i>AWS Database Migration Service User Guide</i>.
     * </p>
     * 
     * @param modifyReplicationTaskRequest
     * @return A Java Future containing the result of the ModifyReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.ModifyReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyReplicationTaskResult> modifyReplicationTaskAsync(ModifyReplicationTaskRequest modifyReplicationTaskRequest);

    /**
     * <p>
     * Modifies the specified replication task.
     * </p>
     * <p>
     * You can't modify the task endpoints. The task must be stopped before you can modify it.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks</a> in the
     * <i>AWS Database Migration Service User Guide</i>.
     * </p>
     * 
     * @param modifyReplicationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ModifyReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyReplicationTaskResult> modifyReplicationTaskAsync(ModifyReplicationTaskRequest modifyReplicationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationTaskRequest, ModifyReplicationTaskResult> asyncHandler);

    /**
     * <p>
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes
     * available again.
     * </p>
     * 
     * @param rebootReplicationInstanceRequest
     * @return A Java Future containing the result of the RebootReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.RebootReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RebootReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebootReplicationInstanceResult> rebootReplicationInstanceAsync(
            RebootReplicationInstanceRequest rebootReplicationInstanceRequest);

    /**
     * <p>
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes
     * available again.
     * </p>
     * 
     * @param rebootReplicationInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.RebootReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RebootReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RebootReplicationInstanceResult> rebootReplicationInstanceAsync(
            RebootReplicationInstanceRequest rebootReplicationInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootReplicationInstanceRequest, RebootReplicationInstanceResult> asyncHandler);

    /**
     * <p>
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
     * You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * 
     * @param refreshSchemasRequest
     * @return A Java Future containing the result of the RefreshSchemas operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.RefreshSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RefreshSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(RefreshSchemasRequest refreshSchemasRequest);

    /**
     * <p>
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
     * You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * 
     * @param refreshSchemasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RefreshSchemas operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.RefreshSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RefreshSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(RefreshSchemasRequest refreshSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<RefreshSchemasRequest, RefreshSchemasResult> asyncHandler);

    /**
     * <p>
     * Reloads the target database table with the source data.
     * </p>
     * 
     * @param reloadTablesRequest
     * @return A Java Future containing the result of the ReloadTables operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.ReloadTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReloadTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReloadTablesResult> reloadTablesAsync(ReloadTablesRequest reloadTablesRequest);

    /**
     * <p>
     * Reloads the target database table with the source data.
     * </p>
     * 
     * @param reloadTablesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReloadTables operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.ReloadTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReloadTables" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ReloadTablesResult> reloadTablesAsync(ReloadTablesRequest reloadTablesRequest,
            com.amazonaws.handlers.AsyncHandler<ReloadTablesRequest, ReloadTablesResult> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Starts the replication task.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks </a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param startReplicationTaskRequest
     * @return A Java Future containing the result of the StartReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.StartReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(StartReplicationTaskRequest startReplicationTaskRequest);

    /**
     * <p>
     * Starts the replication task.
     * </p>
     * <p>
     * For more information about AWS DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks </a> in the
     * <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param startReplicationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.StartReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(StartReplicationTaskRequest startReplicationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartReplicationTaskRequest, StartReplicationTaskResult> asyncHandler);

    /**
     * <p>
     * Starts the replication task assessment for unsupported data types in the source database.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRequest
     * @return A Java Future containing the result of the StartReplicationTaskAssessment operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.StartReplicationTaskAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationTaskAssessmentResult> startReplicationTaskAssessmentAsync(
            StartReplicationTaskAssessmentRequest startReplicationTaskAssessmentRequest);

    /**
     * <p>
     * Starts the replication task assessment for unsupported data types in the source database.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReplicationTaskAssessment operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.StartReplicationTaskAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationTaskAssessmentResult> startReplicationTaskAssessmentAsync(
            StartReplicationTaskAssessmentRequest startReplicationTaskAssessmentRequest,
            com.amazonaws.handlers.AsyncHandler<StartReplicationTaskAssessmentRequest, StartReplicationTaskAssessmentResult> asyncHandler);

    /**
     * <p>
     * Stops the replication task.
     * </p>
     * <p/>
     * 
     * @param stopReplicationTaskRequest
     * @return A Java Future containing the result of the StopReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.StopReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StopReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(StopReplicationTaskRequest stopReplicationTaskRequest);

    /**
     * <p>
     * Stops the replication task.
     * </p>
     * <p/>
     * 
     * @param stopReplicationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.StopReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StopReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(StopReplicationTaskRequest stopReplicationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StopReplicationTaskRequest, StopReplicationTaskResult> asyncHandler);

    /**
     * <p>
     * Tests the connection between the replication instance and the endpoint.
     * </p>
     * 
     * @param testConnectionRequest
     * @return A Java Future containing the result of the TestConnection operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.TestConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/TestConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(TestConnectionRequest testConnectionRequest);

    /**
     * <p>
     * Tests the connection between the replication instance and the endpoint.
     * </p>
     * 
     * @param testConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestConnection operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.TestConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/TestConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(TestConnectionRequest testConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<TestConnectionRequest, TestConnectionResult> asyncHandler);

}
