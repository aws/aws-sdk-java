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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.databasemigrationservice.model.*;

/**
 * Interface for accessing AWS Database Migration Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.databasemigrationservice.AbstractAWSDatabaseMigrationService} instead.
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
public interface AWSDatabaseMigrationService {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "dms";

    /**
     * Overrides the default endpoint for this client ("dms.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "dms.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "dms.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "dms.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "dms.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSDatabaseMigrationService#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Adds metadata tags to a DMS resource, including replication instance, endpoint, security group, and migration
     * task. These tags can also be used with cost allocation reporting to track cost associated with DMS resources, or
     * used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.AddTagsToResource
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Creates an endpoint using the provided settings.
     * </p>
     * 
     * @param createEndpointRequest
     * @return Result of the CreateEndpoint operation returned by the service.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.CreateEndpoint
     */
    CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest);

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * 
     * @param createReplicationInstanceRequest
     * @return Result of the CreateReplicationInstance operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws InsufficientResourceCapacityException
     *         There are not enough resources allocated to the database migration.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws StorageQuotaExceededException
     *         The storage quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @sample AWSDatabaseMigrationService.CreateReplicationInstance
     */
    CreateReplicationInstanceResult createReplicationInstance(CreateReplicationInstanceRequest createReplicationInstanceRequest);

    /**
     * <p>
     * Creates a replication subnet group given a list of the subnet IDs in a VPC.
     * </p>
     * 
     * @param createReplicationSubnetGroupRequest
     * @return Result of the CreateReplicationSubnetGroup operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @sample AWSDatabaseMigrationService.CreateReplicationSubnetGroup
     */
    CreateReplicationSubnetGroupResult createReplicationSubnetGroup(CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest);

    /**
     * <p>
     * Creates a replication task using the specified parameters.
     * </p>
     * 
     * @param createReplicationTaskRequest
     * @return Result of the CreateReplicationTask operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.CreateReplicationTask
     */
    CreateReplicationTaskResult createReplicationTask(CreateReplicationTaskRequest createReplicationTaskRequest);

    /**
     * <p>
     * Deletes the specified certificate.
     * </p>
     * 
     * @param deleteCertificateRequest
     * @return Result of the DeleteCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteCertificate
     */
    DeleteCertificateResult deleteCertificate(DeleteCertificateRequest deleteCertificateRequest);

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
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteEndpoint
     */
    DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

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
     * @return Result of the DeleteReplicationInstance operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DeleteReplicationInstance
     */
    DeleteReplicationInstanceResult deleteReplicationInstance(DeleteReplicationInstanceRequest deleteReplicationInstanceRequest);

    /**
     * <p>
     * Deletes a subnet group.
     * </p>
     * 
     * @param deleteReplicationSubnetGroupRequest
     * @return Result of the DeleteReplicationSubnetGroup operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DeleteReplicationSubnetGroup
     */
    DeleteReplicationSubnetGroupResult deleteReplicationSubnetGroup(DeleteReplicationSubnetGroupRequest deleteReplicationSubnetGroupRequest);

    /**
     * <p>
     * Deletes the specified replication task.
     * </p>
     * 
     * @param deleteReplicationTaskRequest
     * @return Result of the DeleteReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteReplicationTask
     */
    DeleteReplicationTaskResult deleteReplicationTask(DeleteReplicationTaskRequest deleteReplicationTaskRequest);

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
     * @return Result of the DescribeAccountAttributes operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeAccountAttributes
     */
    DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest);

    /**
     * <p>
     * Provides a description of the certificate.
     * </p>
     * 
     * @param describeCertificatesRequest
     * @return Result of the DescribeCertificates operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeCertificates
     */
    DescribeCertificatesResult describeCertificates(DescribeCertificatesRequest describeCertificatesRequest);

    /**
     * <p>
     * Describes the status of the connections that have been made between the replication instance and an endpoint.
     * Connections are created when you test an endpoint.
     * </p>
     * 
     * @param describeConnectionsRequest
     * @return Result of the DescribeConnections operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeConnections
     */
    DescribeConnectionsResult describeConnections(DescribeConnectionsRequest describeConnectionsRequest);

    /**
     * <p>
     * Returns information about the type of endpoints available.
     * </p>
     * 
     * @param describeEndpointTypesRequest
     * @return Result of the DescribeEndpointTypes operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEndpointTypes
     */
    DescribeEndpointTypesResult describeEndpointTypes(DescribeEndpointTypesRequest describeEndpointTypesRequest);

    /**
     * <p>
     * Returns information about the endpoints for your account in the current region.
     * </p>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeEndpoints
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Returns information about the replication instance types that can be created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest
     * @return Result of the DescribeOrderableReplicationInstances operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeOrderableReplicationInstances
     */
    DescribeOrderableReplicationInstancesResult describeOrderableReplicationInstances(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest);

    /**
     * <p>
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * 
     * @param describeRefreshSchemasStatusRequest
     * @return Result of the DescribeRefreshSchemasStatus operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeRefreshSchemasStatus
     */
    DescribeRefreshSchemasStatusResult describeRefreshSchemasStatus(DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest);

    /**
     * <p>
     * Returns information about replication instances for your account in the current region.
     * </p>
     * 
     * @param describeReplicationInstancesRequest
     * @return Result of the DescribeReplicationInstances operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationInstances
     */
    DescribeReplicationInstancesResult describeReplicationInstances(DescribeReplicationInstancesRequest describeReplicationInstancesRequest);

    /**
     * <p>
     * Returns information about the replication subnet groups.
     * </p>
     * 
     * @param describeReplicationSubnetGroupsRequest
     * @return Result of the DescribeReplicationSubnetGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationSubnetGroups
     */
    DescribeReplicationSubnetGroupsResult describeReplicationSubnetGroups(DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest);

    /**
     * <p>
     * Returns information about replication tasks for your account in the current region.
     * </p>
     * 
     * @param describeReplicationTasksRequest
     * @return Result of the DescribeReplicationTasks operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTasks
     */
    DescribeReplicationTasksResult describeReplicationTasks(DescribeReplicationTasksRequest describeReplicationTasksRequest);

    /**
     * <p>
     * Returns information about the schema for the specified endpoint.
     * </p>
     * <p/>
     * 
     * @param describeSchemasRequest
     * @return Result of the DescribeSchemas operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeSchemas
     */
    DescribeSchemasResult describeSchemas(DescribeSchemasRequest describeSchemasRequest);

    /**
     * <p>
     * Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
     * rows deleted.
     * </p>
     * 
     * @param describeTableStatisticsRequest
     * @return Result of the DescribeTableStatistics operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeTableStatistics
     */
    DescribeTableStatisticsResult describeTableStatistics(DescribeTableStatisticsRequest describeTableStatisticsRequest);

    /**
     * <p>
     * Uploads the specified certificate.
     * </p>
     * 
     * @param importCertificateRequest
     * @return Result of the ImportCertificate operation returned by the service.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws InvalidCertificateException
     *         The certificate was not valid.
     * @sample AWSDatabaseMigrationService.ImportCertificate
     */
    ImportCertificateResult importCertificate(ImportCertificateRequest importCertificateRequest);

    /**
     * <p>
     * Lists all tags for an AWS DMS resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Modifies the specified endpoint.
     * </p>
     * 
     * @param modifyEndpointRequest
     * @return Result of the ModifyEndpoint operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @sample AWSDatabaseMigrationService.ModifyEndpoint
     */
    ModifyEndpointResult modifyEndpoint(ModifyEndpointRequest modifyEndpointRequest);

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
     * @return Result of the ModifyReplicationInstance operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InsufficientResourceCapacityException
     *         There are not enough resources allocated to the database migration.
     * @throws StorageQuotaExceededException
     *         The storage quota has been exceeded.
     * @throws UpgradeDependencyFailureException
     *         An upgrade dependency is preventing the database migration.
     * @sample AWSDatabaseMigrationService.ModifyReplicationInstance
     */
    ModifyReplicationInstanceResult modifyReplicationInstance(ModifyReplicationInstanceRequest modifyReplicationInstanceRequest);

    /**
     * <p>
     * Modifies the settings for the specified replication subnet group.
     * </p>
     * 
     * @param modifyReplicationSubnetGroupRequest
     * @return Result of the ModifyReplicationSubnetGroup operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws SubnetAlreadyInUseException
     *         The specified subnet is already in use.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability Zones (AZs). Edit the replication subnet
     *         group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @sample AWSDatabaseMigrationService.ModifyReplicationSubnetGroup
     */
    ModifyReplicationSubnetGroupResult modifyReplicationSubnetGroup(ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest);

    /**
     * <p>
     * Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
     * You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * 
     * @param refreshSchemasRequest
     * @return Result of the RefreshSchemas operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.RefreshSchemas
     */
    RefreshSchemasResult refreshSchemas(RefreshSchemasRequest refreshSchemasRequest);

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.RemoveTagsFromResource
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * Starts the replication task.
     * </p>
     * 
     * @param startReplicationTaskRequest
     * @return Result of the StartReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.StartReplicationTask
     */
    StartReplicationTaskResult startReplicationTask(StartReplicationTaskRequest startReplicationTaskRequest);

    /**
     * <p>
     * Stops the replication task.
     * </p>
     * <p/>
     * 
     * @param stopReplicationTaskRequest
     * @return Result of the StopReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.StopReplicationTask
     */
    StopReplicationTaskResult stopReplicationTask(StopReplicationTaskRequest stopReplicationTaskRequest);

    /**
     * <p>
     * Tests the connection between the replication instance and the endpoint.
     * </p>
     * 
     * @param testConnectionRequest
     * @return Result of the TestConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.TestConnection
     */
    TestConnectionResult testConnection(TestConnectionRequest testConnectionRequest);

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
