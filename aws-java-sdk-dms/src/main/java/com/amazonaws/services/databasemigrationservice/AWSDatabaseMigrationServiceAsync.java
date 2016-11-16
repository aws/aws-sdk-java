/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora, and
 * MySQL. The service supports homogeneous migrations such as Oracle to Oracle, as well as heterogeneous migrations
 * between different database platforms, such as Oracle to MySQL or SQL Server to PostgreSQL.
 * </p>
 */
public interface AWSDatabaseMigrationServiceAsync extends AWSDatabaseMigrationService {

    /**
     * <p>
     * Adds metadata tags to a DMS resource, including replication instance, endpoint, security group, and migration
     * task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or
     * used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Adds metadata tags to a DMS resource, including replication instance, endpoint, security group, and migration
     * task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or
     * used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.AddTagsToResource
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * 
     * @param createEndpointRequest
     * @return A Java Future containing the result of the CreateEndpoint operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.CreateEndpoint
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
     */
    java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(CreateEndpointRequest createEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler);

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * 
     * @param createReplicationInstanceRequest
     * @return A Java Future containing the result of the CreateReplicationInstance operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.CreateReplicationInstance
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
     */
    java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(DeleteEndpointRequest deleteEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler);

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
     */
    java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(DescribeEndpointsRequest describeEndpointsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the replication instance types that can be created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest
     * @return A Java Future containing the result of the DescribeOrderableReplicationInstances operation returned by
     *         the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeOrderableReplicationInstances
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
     */
    java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableReplicationInstancesRequest, DescribeOrderableReplicationInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * 
     * @param describeRefreshSchemasStatusRequest
     * @return A Java Future containing the result of the DescribeRefreshSchemasStatus operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeRefreshSchemasStatus
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
     */
    java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(
            DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRefreshSchemasStatusRequest, DescribeRefreshSchemasStatusResult> asyncHandler);

    /**
     * <p>
     * Returns information about replication instances for your account in the current region.
     * </p>
     * 
     * @param describeReplicationInstancesRequest
     * @return A Java Future containing the result of the DescribeReplicationInstances operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationInstances
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
     */
    java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationSubnetGroupsRequest, DescribeReplicationSubnetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns information about replication tasks for your account in the current region.
     * </p>
     * 
     * @param describeReplicationTasksRequest
     * @return A Java Future containing the result of the DescribeReplicationTasks operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeReplicationTasks
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
     */
    java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(DescribeSchemasRequest describeSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSchemasRequest, DescribeSchemasResult> asyncHandler);

    /**
     * <p>
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
     * rows deleted.
     * </p>
     * 
     * @param describeTableStatisticsRequest
     * @return A Java Future containing the result of the DescribeTableStatistics operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.DescribeTableStatistics
     */
    java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(DescribeTableStatisticsRequest describeTableStatisticsRequest);

    /**
     * <p>
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
     * rows deleted.
     * </p>
     * 
     * @param describeTableStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTableStatistics operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.DescribeTableStatistics
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
     */
    java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(ModifyEndpointRequest modifyEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyEndpointRequest, ModifyEndpointResult> asyncHandler);

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
     */
    java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(
            ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationSubnetGroupRequest, ModifyReplicationSubnetGroupResult> asyncHandler);

    /**
     * <p>
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
     * You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * 
     * @param refreshSchemasRequest
     * @return A Java Future containing the result of the RefreshSchemas operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.RefreshSchemas
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
     */
    java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(RefreshSchemasRequest refreshSchemasRequest,
            com.amazonaws.handlers.AsyncHandler<RefreshSchemasRequest, RefreshSchemasResult> asyncHandler);

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.RemoveTagsFromResource
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
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Starts the replication task.
     * </p>
     * 
     * @param startReplicationTaskRequest
     * @return A Java Future containing the result of the StartReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.StartReplicationTask
     */
    java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(StartReplicationTaskRequest startReplicationTaskRequest);

    /**
     * <p>
     * Starts the replication task.
     * </p>
     * 
     * @param startReplicationTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsyncHandler.StartReplicationTask
     */
    java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(StartReplicationTaskRequest startReplicationTaskRequest,
            com.amazonaws.handlers.AsyncHandler<StartReplicationTaskRequest, StartReplicationTaskResult> asyncHandler);

    /**
     * <p>
     * Stops the replication task.
     * </p>
     * <p/>
     * 
     * @param stopReplicationTaskRequest
     * @return A Java Future containing the result of the StopReplicationTask operation returned by the service.
     * @sample AWSDatabaseMigrationServiceAsync.StopReplicationTask
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
     */
    java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(TestConnectionRequest testConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<TestConnectionRequest, TestConnectionResult> asyncHandler);

}
