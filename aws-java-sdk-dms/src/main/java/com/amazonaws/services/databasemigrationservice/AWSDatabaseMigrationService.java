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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters;

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
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "dms.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "dms.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and
     * migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS
     * resources, or used in a Condition statement in an IAM policy for DMS.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Applies a pending maintenance action to a resource (for example, to a replication instance).
     * </p>
     * 
     * @param applyPendingMaintenanceActionRequest
     * @return Result of the ApplyPendingMaintenanceAction operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.ApplyPendingMaintenanceAction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ApplyPendingMaintenanceAction"
     *      target="_top">AWS API Documentation</a>
     */
    ApplyPendingMaintenanceActionResult applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest applyPendingMaintenanceActionRequest);

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
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.CreateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    CreateEndpointResult createEndpoint(CreateEndpointRequest createEndpointRequest);

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
     * @return Result of the CreateEventSubscription operation returned by the service.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws SNSInvalidTopicException
     *         The SNS topic is invalid.
     * @throws SNSNoAuthorizationException
     *         You are not authorized for the SNS subscription.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or DMS account doesn't have an access to
     * @throws KMSDisabledException
     *         The specified master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The state of the specified KMS resource isn't valid for this request.
     * @throws KMSNotFoundException
     *         The specified KMS entity or resource can't be found.
     * @throws KMSThrottlingException
     *         This request triggered KMS request throttling.
     * @sample AWSDatabaseMigrationService.CreateEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEventSubscriptionResult createEventSubscription(CreateEventSubscriptionRequest createEventSubscriptionRequest);

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * 
     * @param createReplicationInstanceRequest
     * @return Result of the CreateReplicationInstance operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationInstance" target="_top">AWS
     *      API Documentation</a>
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
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateReplicationSubnetGroupResult createReplicationSubnetGroup(CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest);

    /**
     * <p>
     * Creates a replication task using the specified parameters.
     * </p>
     * 
     * @param createReplicationTaskRequest
     * @return Result of the CreateReplicationTask operation returned by the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/CreateReplicationTask" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteCertificate" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest deleteEndpointRequest);

    /**
     * <p>
     * Deletes an AWS DMS event subscription.
     * </p>
     * 
     * @param deleteEventSubscriptionRequest
     * @return Result of the DeleteEventSubscription operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DeleteEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEventSubscriptionResult deleteEventSubscription(DeleteEventSubscriptionRequest deleteEventSubscriptionRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationInstance" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DeleteReplicationTask" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeAccountAttributes" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeCertificates" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeConnections" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpointTypes" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEndpoints" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEndpointsResult describeEndpoints(DescribeEndpointsRequest describeEndpointsRequest);

    /**
     * <p>
     * Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of
     * the event categories and source types in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration Service User Guide.</i>
     * </p>
     * 
     * @param describeEventCategoriesRequest
     * @return Result of the DescribeEventCategories operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEventCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventCategories" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest describeEventCategoriesRequest);

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
     * @return Result of the DescribeEventSubscriptions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeEventSubscriptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEventSubscriptions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeEventSubscriptionsResult describeEventSubscriptions(DescribeEventSubscriptionsRequest describeEventSubscriptionsRequest);

    /**
     * <p>
     * Lists events for a given source identifier and source type. You can also specify a start and end time. For more
     * information on AWS DMS events, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Events.html">Working with Events and
     * Notifications</a> in the <i>AWS Database Migration User Guide.</i>
     * </p>
     * 
     * @param describeEventsRequest
     * @return Result of the DescribeEvents operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeEvents" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeEventsResult describeEvents(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns information about the replication instance types that can be created in the specified region.
     * </p>
     * 
     * @param describeOrderableReplicationInstancesRequest
     * @return Result of the DescribeOrderableReplicationInstances operation returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeOrderableReplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeOrderableReplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrderableReplicationInstancesResult describeOrderableReplicationInstances(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest);

    /**
     * <p>
     * For internal use only
     * </p>
     * 
     * @param describePendingMaintenanceActionsRequest
     * @return Result of the DescribePendingMaintenanceActions operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribePendingMaintenanceActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribePendingMaintenanceActions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest describePendingMaintenanceActionsRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeRefreshSchemasStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRefreshSchemasStatusResult describeRefreshSchemasStatus(DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest);

    /**
     * <p>
     * Returns information about the task logs for the specified task.
     * </p>
     * 
     * @param describeReplicationInstanceTaskLogsRequest
     * @return Result of the DescribeReplicationInstanceTaskLogs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeReplicationInstanceTaskLogs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstanceTaskLogs"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReplicationInstanceTaskLogsResult describeReplicationInstanceTaskLogs(
            DescribeReplicationInstanceTaskLogsRequest describeReplicationInstanceTaskLogsRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationInstances"
     *      target="_top">AWS API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationSubnetGroups"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReplicationSubnetGroupsResult describeReplicationSubnetGroups(DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest);

    /**
     * <p>
     * Returns the task assessment results from Amazon S3. This action always returns the latest results.
     * </p>
     * 
     * @param describeReplicationTaskAssessmentResultsRequest
     * @return Result of the DescribeReplicationTaskAssessmentResults operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTaskAssessmentResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentResults"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeReplicationTaskAssessmentResultsResult describeReplicationTaskAssessmentResults(
            DescribeReplicationTaskAssessmentResultsRequest describeReplicationTaskAssessmentResultsRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTasks" target="_top">AWS
     *      API Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSchemasResult describeSchemas(DescribeSchemasRequest describeSchemasRequest);

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
     * @return Result of the DescribeTableStatistics operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.DescribeTableStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeTableStatistics" target="_top">AWS
     *      API Documentation</a>
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
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.ImportCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ImportCertificate" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
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
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.ModifyEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyEndpointResult modifyEndpoint(ModifyEndpointRequest modifyEndpointRequest);

    /**
     * <p>
     * Modifies an existing AWS DMS event notification subscription.
     * </p>
     * 
     * @param modifyEventSubscriptionRequest
     * @return Result of the ModifyEventSubscription operation returned by the service.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws SNSInvalidTopicException
     *         The SNS topic is invalid.
     * @throws SNSNoAuthorizationException
     *         You are not authorized for the SNS subscription.
     * @throws KMSAccessDeniedException
     *         The ciphertext references a key that doesn't exist or DMS account doesn't have an access to
     * @throws KMSDisabledException
     *         The specified master key (CMK) isn't enabled.
     * @throws KMSInvalidStateException
     *         The state of the specified KMS resource isn't valid for this request.
     * @throws KMSNotFoundException
     *         The specified KMS entity or resource can't be found.
     * @throws KMSThrottlingException
     *         This request triggered KMS request throttling.
     * @sample AWSDatabaseMigrationService.ModifyEventSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEventSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyEventSubscriptionResult modifyEventSubscription(ModifyEventSubscriptionRequest modifyEventSubscriptionRequest);

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
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationInstance" target="_top">AWS
     *      API Documentation</a>
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
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationSubnetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ModifyReplicationSubnetGroupResult modifyReplicationSubnetGroup(ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest);

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
     * @return Result of the ModifyReplicationTask operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @sample AWSDatabaseMigrationService.ModifyReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyReplicationTaskResult modifyReplicationTask(ModifyReplicationTaskRequest modifyReplicationTaskRequest);

    /**
     * <p>
     * Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes
     * available again.
     * </p>
     * 
     * @param rebootReplicationInstanceRequest
     * @return Result of the RebootReplicationInstance operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.RebootReplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RebootReplicationInstance" target="_top">AWS
     *      API Documentation</a>
     */
    RebootReplicationInstanceResult rebootReplicationInstance(RebootReplicationInstanceRequest rebootReplicationInstanceRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RefreshSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    RefreshSchemasResult refreshSchemas(RefreshSchemasRequest refreshSchemasRequest);

    /**
     * <p>
     * Reloads the target database table with the source data.
     * </p>
     * 
     * @param reloadTablesRequest
     * @return Result of the ReloadTables operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @sample AWSDatabaseMigrationService.ReloadTables
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReloadTables" target="_top">AWS API
     *      Documentation</a>
     */
    ReloadTablesResult reloadTables(ReloadTablesRequest reloadTablesRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RemoveTagsFromResource" target="_top">AWS API
     *      Documentation</a>
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

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
     * @return Result of the StartReplicationTask operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint. Check that the role is correctly configured.
     * @sample AWSDatabaseMigrationService.StartReplicationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTask" target="_top">AWS API
     *      Documentation</a>
     */
    StartReplicationTaskResult startReplicationTask(StartReplicationTaskRequest startReplicationTaskRequest);

    /**
     * <p>
     * Starts the replication task assessment for unsupported data types in the source database.
     * </p>
     * 
     * @param startReplicationTaskAssessmentRequest
     * @return Result of the StartReplicationTaskAssessment operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.StartReplicationTaskAssessment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartReplicationTaskAssessment"
     *      target="_top">AWS API Documentation</a>
     */
    StartReplicationTaskAssessmentResult startReplicationTaskAssessment(StartReplicationTaskAssessmentRequest startReplicationTaskAssessmentRequest);

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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StopReplicationTask" target="_top">AWS API
     *      Documentation</a>
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
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/TestConnection" target="_top">AWS API
     *      Documentation</a>
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

    AWSDatabaseMigrationServiceWaiters waiters();

}
