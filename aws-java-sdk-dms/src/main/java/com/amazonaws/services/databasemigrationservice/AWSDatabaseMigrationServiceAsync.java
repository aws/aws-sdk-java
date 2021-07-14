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
 * <fullname>Database Migration Service</fullname>
 * <p>
 * Database Migration Service (DMS) can migrate your data to and from the most widely used commercial and open-source
 * databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, MySQL, and SAP
 * Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to Oracle, as well as
 * heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.
 * </p>
 * <p>
 * For more information about DMS, see <a href="https://docs.aws.amazon.com/dms/latest/userguide/Welcome.html">What Is
 * Database Migration Service?</a> in the <i>Database Migration Service User Guide.</i>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSDatabaseMigrationServiceAsync extends AWSDatabaseMigrationService {

    /**
     * <p>
     * Adds metadata tags to an DMS resource, including replication instance, endpoint, security group, and migration
     * task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or
     * used in a Condition statement in an IAM policy for DMS. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Associates a set of tags with an DMS resource.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds metadata tags to an DMS resource, including replication instance, endpoint, security group, and migration
     * task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or
     * used in a Condition statement in an IAM policy for DMS. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
     * </p>
     * 
     * @param addTagsToResourceRequest
     *        Associates a set of tags with an DMS resource.
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
     * Cancels a single premigration assessment run.
     * </p>
     * <p>
     * This operation prevents any individual assessments from running if they haven't started running. It also attempts
     * to cancel any individual assessments that are currently running.
     * </p>
     * 
     * @param cancelReplicationTaskAssessmentRunRequest
     * @return A Java Future containing the result of the CancelReplicationTaskAssessmentRun operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.CancelReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CancelReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelReplicationTaskAssessmentRunResult> cancelReplicationTaskAssessmentRunAsync(
            CancelReplicationTaskAssessmentRunRequest cancelReplicationTaskAssessmentRunRequest);

    /**
     * <p>
     * Cancels a single premigration assessment run.
     * </p>
     * <p>
     * This operation prevents any individual assessments from running if they haven't started running. It also attempts
     * to cancel any individual assessments that are currently running.
     * </p>
     * 
     * @param cancelReplicationTaskAssessmentRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelReplicationTaskAssessmentRun operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.CancelReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CancelReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelReplicationTaskAssessmentRunResult> cancelReplicationTaskAssessmentRunAsync(
            CancelReplicationTaskAssessmentRunRequest cancelReplicationTaskAssessmentRunRequest,
            com.amazonaws.handlers.AsyncHandler<CancelReplicationTaskAssessmentRunRequest, CancelReplicationTaskAssessmentRunResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * <note>
     * <p>
     * For a MySQL source or target endpoint, don't explicitly specify the database using the <code>DatabaseName</code>
     * request parameter on the <code>CreateEndpoint</code> API call. Specifying <code>DatabaseName</code> when you
     * create a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     * the database only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * For a MySQL source or target endpoint, don't explicitly specify the database using the <code>DatabaseName</code>
     * request parameter on the <code>CreateEndpoint</code> API call. Specifying <code>DatabaseName</code> when you
     * create a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     * the database only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * </note>
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
     * Creates an DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to be notified of, provide a list of DMS
     * source IDs (<code>SourceIds</code>) that triggers the events, and provide a list of event categories (
     * <code>EventCategories</code>) for events you want to be notified of. If you specify both the
     * <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of all the replication instance events for
     * the specified source. If you specify a <code>SourceType</code> but don't specify a <code>SourceIdentifier</code>,
     * you receive notice of the events for that source type for all your DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be notified of events generated from all DMS
     * sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
     * Creates an DMS event notification subscription.
     * </p>
     * <p>
     * You can specify the type of source (<code>SourceType</code>) you want to be notified of, provide a list of DMS
     * source IDs (<code>SourceIds</code>) that triggers the events, and provide a list of event categories (
     * <code>EventCategories</code>) for events you want to be notified of. If you specify both the
     * <code>SourceType</code> and <code>SourceIds</code>, such as <code>SourceType = replication-instance</code> and
     * <code>SourceIdentifier = my-replinstance</code>, you will be notified of all the replication instance events for
     * the specified source. If you specify a <code>SourceType</code> but don't specify a <code>SourceIdentifier</code>,
     * you receive notice of the events for that source type for all your DMS sources. If you don't specify either
     * <code>SourceType</code> nor <code>SourceIdentifier</code>, you will be notified of events generated from all DMS
     * sources belonging to your customer account.
     * </p>
     * <p>
     * For more information about DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
     * <p>
     * DMS requires that your account have certain roles with appropriate permissions before you can create a
     * replication instance. For information on the required roles, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.APIRole">Creating the IAM
     * Roles to Use With the CLI and DMS API</a>. For information on the required permissions, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.IAMPermissions">IAM
     * Permissions Needed to Use DMS</a>.
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
     * <p>
     * DMS requires that your account have certain roles with appropriate permissions before you can create a
     * replication instance. For information on the required roles, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.APIRole">Creating the IAM
     * Roles to Use With the CLI and DMS API</a>. For information on the required permissions, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#CHAP_Security.IAMPermissions">IAM
     * Permissions Needed to Use DMS</a>.
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
     * Deletes the connection between a replication instance and an endpoint.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Deletes the connection between a replication instance and an endpoint.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler);

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
     * Deletes an DMS event subscription.
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
     * Deletes an DMS event subscription.
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
     * Deletes the record of a single premigration assessment run.
     * </p>
     * <p>
     * This operation removes all metadata that DMS maintains about this assessment run. However, the operation leaves
     * untouched all information about this assessment run that is stored in your Amazon S3 bucket.
     * </p>
     * 
     * @param deleteReplicationTaskAssessmentRunRequest
     * @return A Java Future containing the result of the DeleteReplicationTaskAssessmentRun operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DeleteReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationTaskAssessmentRunResult> deleteReplicationTaskAssessmentRunAsync(
            DeleteReplicationTaskAssessmentRunRequest deleteReplicationTaskAssessmentRunRequest);

    /**
     * <p>
     * Deletes the record of a single premigration assessment run.
     * </p>
     * <p>
     * This operation removes all metadata that DMS maintains about this assessment run. However, the operation leaves
     * untouched all information about this assessment run that is stored in your Amazon S3 bucket.
     * </p>
     * 
     * @param deleteReplicationTaskAssessmentRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReplicationTaskAssessmentRun operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DeleteReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReplicationTaskAssessmentRunResult> deleteReplicationTaskAssessmentRunAsync(
            DeleteReplicationTaskAssessmentRunRequest deleteReplicationTaskAssessmentRunRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationTaskAssessmentRunRequest, DeleteReplicationTaskAssessmentRunResult> asyncHandler);

    /**
     * <p>
     * Lists all of the DMS attributes for a customer account. These attributes include DMS quotas for the account and a
     * unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas supported by
     * the account, such as the number of replication instances allowed. The description for each resource quota,
     * includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the unique
     * account identifier to name each artifact used by DMS in the given region.
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
     * Lists all of the DMS attributes for a customer account. These attributes include DMS quotas for the account and a
     * unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas supported by
     * the account, such as the number of replication instances allowed. The description for each resource quota,
     * includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the unique
     * account identifier to name each artifact used by DMS in the given region.
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
     * Provides a list of individual assessments that you can specify for a new premigration assessment run, given one
     * or more parameters.
     * </p>
     * <p>
     * If you specify an existing migration task, this operation provides the default individual assessments you can
     * specify for that task. Otherwise, the specified parameters model elements of a possible migration task on which
     * to base a premigration assessment run.
     * </p>
     * <p>
     * To use these migration task modeling parameters, you must specify an existing replication instance, a source
     * database engine, a target database engine, and a migration type. This combination of parameters potentially
     * limits the default individual assessments available for an assessment run created for a corresponding migration
     * task.
     * </p>
     * <p>
     * If you specify no parameters, this operation provides a list of all possible individual assessments that you can
     * specify for an assessment run. If you specify any one of the task modeling parameters, you must specify all of
     * them or the operation cannot provide a list of individual assessments. The only parameter that you can specify
     * alone is for an existing migration task. The specified task definition then determines the default list of
     * individual assessments that you can specify in an assessment run for the task.
     * </p>
     * 
     * @param describeApplicableIndividualAssessmentsRequest
     * @return A Java Future containing the result of the DescribeApplicableIndividualAssessments operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeApplicableIndividualAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeApplicableIndividualAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicableIndividualAssessmentsResult> describeApplicableIndividualAssessmentsAsync(
            DescribeApplicableIndividualAssessmentsRequest describeApplicableIndividualAssessmentsRequest);

    /**
     * <p>
     * Provides a list of individual assessments that you can specify for a new premigration assessment run, given one
     * or more parameters.
     * </p>
     * <p>
     * If you specify an existing migration task, this operation provides the default individual assessments you can
     * specify for that task. Otherwise, the specified parameters model elements of a possible migration task on which
     * to base a premigration assessment run.
     * </p>
     * <p>
     * To use these migration task modeling parameters, you must specify an existing replication instance, a source
     * database engine, a target database engine, and a migration type. This combination of parameters potentially
     * limits the default individual assessments available for an assessment run created for a corresponding migration
     * task.
     * </p>
     * <p>
     * If you specify no parameters, this operation provides a list of all possible individual assessments that you can
     * specify for an assessment run. If you specify any one of the task modeling parameters, you must specify all of
     * them or the operation cannot provide a list of individual assessments. The only parameter that you can specify
     * alone is for an existing migration task. The specified task definition then determines the default list of
     * individual assessments that you can specify in an assessment run for the task.
     * </p>
     * 
     * @param describeApplicableIndividualAssessmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicableIndividualAssessments operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeApplicableIndividualAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeApplicableIndividualAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicableIndividualAssessmentsResult> describeApplicableIndividualAssessmentsAsync(
            DescribeApplicableIndividualAssessmentsRequest describeApplicableIndividualAssessmentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicableIndividualAssessmentsRequest, DescribeApplicableIndividualAssessmentsResult> asyncHandler);

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
     * Returns information about the possible endpoint settings available when you create an endpoint for a specific
     * database engine.
     * </p>
     * 
     * @param describeEndpointSettingsRequest
     * @return A Java Future containing the result of the DescribeEndpointSettings operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeEndpointSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointSettingsResult> describeEndpointSettingsAsync(DescribeEndpointSettingsRequest describeEndpointSettingsRequest);

    /**
     * <p>
     * Returns information about the possible endpoint settings available when you create an endpoint for a specific
     * database engine.
     * </p>
     * 
     * @param describeEndpointSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEndpointSettings operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeEndpointSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointSettings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEndpointSettingsResult> describeEndpointSettingsAsync(DescribeEndpointSettingsRequest describeEndpointSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointSettingsRequest, DescribeEndpointSettingsResult> asyncHandler);

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
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
     * information on DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
     * information on DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>Database Migration Service User Guide.</i>
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
     * Returns the task assessment results from the Amazon S3 bucket that DMS creates in your account. This action
     * always returns the latest results.
     * </p>
     * <p>
     * For more information about DMS task assessments, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Creating a task
     * assessment report</a> in the <a
     * href="https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/Welcome.html"> Database
     * Migration Service User Guide</a>.
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
     * Returns the task assessment results from the Amazon S3 bucket that DMS creates in your account. This action
     * always returns the latest results.
     * </p>
     * <p>
     * For more information about DMS task assessments, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.AssessmentReport.html">Creating a task
     * assessment report</a> in the <a
     * href="https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/Welcome.html"> Database
     * Migration Service User Guide</a>.
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
     * Returns a paginated list of premigration assessment runs based on filter settings.
     * </p>
     * <p>
     * These filter settings can specify a combination of premigration assessment runs, migration tasks, replication
     * instances, and assessment run status values.
     * </p>
     * <note>
     * <p>
     * This operation doesn't return information about individual assessments. For this information, see the
     * <code>DescribeReplicationTaskIndividualAssessments</code> operation.
     * </p>
     * </note>
     * 
     * @param describeReplicationTaskAssessmentRunsRequest
     * @return A Java Future containing the result of the DescribeReplicationTaskAssessmentRuns operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationTaskAssessmentRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentRuns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTaskAssessmentRunsResult> describeReplicationTaskAssessmentRunsAsync(
            DescribeReplicationTaskAssessmentRunsRequest describeReplicationTaskAssessmentRunsRequest);

    /**
     * <p>
     * Returns a paginated list of premigration assessment runs based on filter settings.
     * </p>
     * <p>
     * These filter settings can specify a combination of premigration assessment runs, migration tasks, replication
     * instances, and assessment run status values.
     * </p>
     * <note>
     * <p>
     * This operation doesn't return information about individual assessments. For this information, see the
     * <code>DescribeReplicationTaskIndividualAssessments</code> operation.
     * </p>
     * </note>
     * 
     * @param describeReplicationTaskAssessmentRunsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationTaskAssessmentRuns operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeReplicationTaskAssessmentRuns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentRuns"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTaskAssessmentRunsResult> describeReplicationTaskAssessmentRunsAsync(
            DescribeReplicationTaskAssessmentRunsRequest describeReplicationTaskAssessmentRunsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationTaskAssessmentRunsRequest, DescribeReplicationTaskAssessmentRunsResult> asyncHandler);

    /**
     * <p>
     * Returns a paginated list of individual assessments based on filter settings.
     * </p>
     * <p>
     * These filter settings can specify a combination of premigration assessment runs, migration tasks, and assessment
     * status values.
     * </p>
     * 
     * @param describeReplicationTaskIndividualAssessmentsRequest
     * @return A Java Future containing the result of the DescribeReplicationTaskIndividualAssessments operation
     *         returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationTaskIndividualAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskIndividualAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTaskIndividualAssessmentsResult> describeReplicationTaskIndividualAssessmentsAsync(
            DescribeReplicationTaskIndividualAssessmentsRequest describeReplicationTaskIndividualAssessmentsRequest);

    /**
     * <p>
     * Returns a paginated list of individual assessments based on filter settings.
     * </p>
     * <p>
     * These filter settings can specify a combination of premigration assessment runs, migration tasks, and assessment
     * status values.
     * </p>
     * 
     * @param describeReplicationTaskIndividualAssessmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeReplicationTaskIndividualAssessments operation
     *         returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeReplicationTaskIndividualAssessments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskIndividualAssessments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeReplicationTaskIndividualAssessmentsResult> describeReplicationTaskIndividualAssessmentsAsync(
            DescribeReplicationTaskIndividualAssessmentsRequest describeReplicationTaskIndividualAssessmentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationTaskIndividualAssessmentsRequest, DescribeReplicationTaskIndividualAssessmentsResult> asyncHandler);

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
     * Note that the "last updated" column the DMS console only indicates the time that DMS last updated the table
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
     * Note that the "last updated" column the DMS console only indicates the time that DMS last updated the table
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
     * Lists all metadata tags attached to an DMS resource, including replication instance, endpoint, security group,
     * and migration task. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
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
     * Lists all metadata tags attached to an DMS resource, including replication instance, endpoint, security group,
     * and migration task. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
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
     * <note>
     * <p>
     * For a MySQL source or target endpoint, don't explicitly specify the database using the <code>DatabaseName</code>
     * request parameter on the <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you
     * modify a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     * the database only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * </note>
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
     * <note>
     * <p>
     * For a MySQL source or target endpoint, don't explicitly specify the database using the <code>DatabaseName</code>
     * request parameter on the <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you
     * modify a MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     * the database only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * </note>
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
     * Modifies an existing DMS event notification subscription.
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
     * Modifies an existing DMS event notification subscription.
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
     * For more information about DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks</a> in the
     * <i>Database Migration Service User Guide</i>.
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
     * For more information about DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks</a> in the
     * <i>Database Migration Service User Guide</i>.
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
     * Moves a replication task from its current replication instance to a different target replication instance using
     * the specified parameters. The target replication instance must be created with the same or later DMS version as
     * the current replication instance.
     * </p>
     * 
     * @param moveReplicationTaskRequest
     * @return A Java Future containing the result of the MoveReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.MoveReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MoveReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MoveReplicationTaskResult> moveReplicationTaskAsync(MoveReplicationTaskRequest moveReplicationTaskRequest);

    /**
     * <p>
     * Moves a replication task from its current replication instance to a different target replication instance using
     * the specified parameters. The target replication instance must be created with the same or later DMS version as
     * the current replication instance.
     * </p>
     * 
     * @param moveReplicationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the MoveReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.MoveReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MoveReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<MoveReplicationTaskResult> moveReplicationTaskAsync(MoveReplicationTaskRequest moveReplicationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<MoveReplicationTaskRequest, MoveReplicationTaskResult> asyncHandler);

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
     * Removes metadata tags from an DMS resource, including replication instance, endpoint, security group, and
     * migration task. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Removes one or more tags from an DMS resource.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Removes metadata tags from an DMS resource, including replication instance, endpoint, security group, and
     * migration task. For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/APIReference/API_Tag.html"> <code>Tag</code> </a> data type
     * description.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     *        Removes one or more tags from an DMS resource.
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
     * For more information about DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks </a> in the
     * <i>Database Migration Service User Guide.</i>
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
     * For more information about DMS tasks, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.html">Working with Migration Tasks </a> in the
     * <i>Database Migration Service User Guide.</i>
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
     * Starts a new premigration assessment run for one or more individual assessments of a migration task.
     * </p>
     * <p>
     * The assessments that you can specify depend on the source and target database engine and the migration type
     * defined for the given task. To run this operation, your migration task must already be created. After you run
     * this operation, you can review the status of each individual assessment. You can also run the migration task
     * manually after the assessment run and its individual assessments complete.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRunRequest
     * @return A Java Future containing the result of the StartReplicationTaskAssessmentRun operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.StartReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationTaskAssessmentRunResult> startReplicationTaskAssessmentRunAsync(
            StartReplicationTaskAssessmentRunRequest startReplicationTaskAssessmentRunRequest);

    /**
     * <p>
     * Starts a new premigration assessment run for one or more individual assessments of a migration task.
     * </p>
     * <p>
     * The assessments that you can specify depend on the source and target database engine and the migration type
     * defined for the given task. To run this operation, your migration task must already be created. After you run
     * this operation, you can review the status of each individual assessment. You can also run the migration task
     * manually after the assessment run and its individual assessments complete.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRunRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReplicationTaskAssessmentRun operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.StartReplicationTaskAssessmentRun
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessmentRun"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartReplicationTaskAssessmentRunResult> startReplicationTaskAssessmentRunAsync(
            StartReplicationTaskAssessmentRunRequest startReplicationTaskAssessmentRunRequest,
            com.amazonaws.handlers.AsyncHandler<StartReplicationTaskAssessmentRunRequest, StartReplicationTaskAssessmentRunResult> asyncHandler);

    /**
     * <p>
     * Stops the replication task.
     * </p>
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
