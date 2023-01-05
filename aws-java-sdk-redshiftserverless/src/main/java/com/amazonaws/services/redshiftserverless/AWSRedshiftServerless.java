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
package com.amazonaws.services.redshiftserverless;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.redshiftserverless.model.*;

/**
 * Interface for accessing Redshift Serverless.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.redshiftserverless.AbstractAWSRedshiftServerless} instead.
 * </p>
 * <p>
 * <p>
 * This is an interface reference for Amazon Redshift Serverless. It contains documentation for one of the programming
 * or command line interfaces you can use to manage Amazon Redshift Serverless.
 * </p>
 * <p>
 * Amazon Redshift Serverless automatically provisions data warehouse capacity and intelligently scales the underlying
 * resources based on workload demands. Amazon Redshift Serverless adjusts capacity in seconds to deliver consistently
 * high performance and simplified operations for even the most demanding and volatile workloads. Amazon Redshift
 * Serverless lets you focus on using your data to acquire new insights for your business and customers.
 * </p>
 * <p>
 * To learn more about Amazon Redshift Serverless, see <a
 * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-whatis.html">What is Amazon Redshift
 * Serverless</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRedshiftServerless {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "redshift-serverless";

    /**
     * <p>
     * Converts a recovery point to a snapshot. For more information about recovery points and snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html">Working with snapshots
     * and recovery points</a>.
     * </p>
     * 
     * @param convertRecoveryPointToSnapshotRequest
     * @return Result of the ConvertRecoveryPointToSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.ConvertRecoveryPointToSnapshot
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ConvertRecoveryPointToSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    ConvertRecoveryPointToSnapshotResult convertRecoveryPointToSnapshot(ConvertRecoveryPointToSnapshotRequest convertRecoveryPointToSnapshotRequest);

    /**
     * <p>
     * Creates an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param createEndpointAccessRequest
     * @return Result of the CreateEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.CreateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEndpointAccessResult createEndpointAccess(CreateEndpointAccessRequest createEndpointAccessRequest);

    /**
     * <p>
     * Creates a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createNamespaceRequest
     * @return Result of the CreateNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @sample AWSRedshiftServerless.CreateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNamespaceResult createNamespace(CreateNamespaceRequest createNamespaceRequest);

    /**
     * <p>
     * Creates a snapshot of all databases in a namespace. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/redshift/latest/mgmt/serverless-snapshots-recovery.html"> Working with
     * snapshots and recovery points</a>.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a usage limit for a specified Amazon Redshift Serverless usage type. The usage limit is identified by the
     * returned usage limit identifier.
     * </p>
     * 
     * @param createUsageLimitRequest
     * @return Result of the CreateUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.CreateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    CreateUsageLimitResult createUsageLimit(CreateUsageLimitRequest createUsageLimitRequest);

    /**
     * <p>
     * Creates an workgroup in Amazon Redshift Serverless.
     * </p>
     * 
     * @param createWorkgroupRequest
     * @return Result of the CreateWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InsufficientCapacityException
     *         There is an insufficient capacity to perform the action.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @sample AWSRedshiftServerless.CreateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/CreateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateWorkgroupResult createWorkgroup(CreateWorkgroupRequest createWorkgroupRequest);

    /**
     * <p>
     * Deletes an Amazon Redshift Serverless managed VPC endpoint.
     * </p>
     * 
     * @param deleteEndpointAccessRequest
     * @return Result of the DeleteEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEndpointAccessResult deleteEndpointAccess(DeleteEndpointAccessRequest deleteEndpointAccessRequest);

    /**
     * <p>
     * Deletes a namespace from Amazon Redshift Serverless. Before you delete the namespace, you can create a final
     * snapshot that has all of the data within the namespace.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes the specified resource policy.
     * </p>
     * 
     * @param deleteResourcePolicyRequest
     * @return Result of the DeleteResourcePolicy operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteResourcePolicyResult deleteResourcePolicy(DeleteResourcePolicyRequest deleteResourcePolicyRequest);

    /**
     * <p>
     * Deletes a snapshot from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest);

    /**
     * <p>
     * Deletes a usage limit from Amazon Redshift Serverless.
     * </p>
     * 
     * @param deleteUsageLimitRequest
     * @return Result of the DeleteUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteUsageLimitResult deleteUsageLimit(DeleteUsageLimitRequest deleteUsageLimitRequest);

    /**
     * <p>
     * Deletes a workgroup.
     * </p>
     * 
     * @param deleteWorkgroupRequest
     * @return Result of the DeleteWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.DeleteWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/DeleteWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteWorkgroupResult deleteWorkgroup(DeleteWorkgroupRequest deleteWorkgroupRequest);

    /**
     * <p>
     * Returns a database user name and temporary password with temporary authorization to log in to Amazon Redshift
     * Serverless.
     * </p>
     * <p>
     * By default, the temporary credentials expire in 900 seconds. You can optionally specify a duration between 900
     * seconds (15 minutes) and 3600 seconds (60 minutes).
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;The Identity and Access Management (IAM) user or role that runs GetCredentials must have an IAM policy attached that allows access to all necessary actions and resources.&lt;/p&gt; &lt;p&gt;If the &lt;code&gt;DbName&lt;/code&gt; parameter is specified, the IAM policy must allow access to the resource dbname for the specified database name.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param getCredentialsRequest
     * @return Result of the GetCredentials operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    GetCredentialsResult getCredentials(GetCredentialsRequest getCredentialsRequest);

    /**
     * <p>
     * Returns information, such as the name, about a VPC endpoint.
     * </p>
     * 
     * @param getEndpointAccessRequest
     * @return Result of the GetEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    GetEndpointAccessResult getEndpointAccess(GetEndpointAccessRequest getEndpointAccessRequest);

    /**
     * <p>
     * Returns information about a namespace in Amazon Redshift Serverless.
     * </p>
     * 
     * @param getNamespaceRequest
     * @return Result of the GetNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    GetNamespaceResult getNamespace(GetNamespaceRequest getNamespaceRequest);

    /**
     * <p>
     * Returns information about a recovery point.
     * </p>
     * 
     * @param getRecoveryPointRequest
     * @return Result of the GetRecoveryPoint operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecoveryPointResult getRecoveryPoint(GetRecoveryPointRequest getRecoveryPointRequest);

    /**
     * <p>
     * Returns a resource policy.
     * </p>
     * 
     * @param getResourcePolicyRequest
     * @return Result of the GetResourcePolicy operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourcePolicyResult getResourcePolicy(GetResourcePolicyRequest getResourcePolicyRequest);

    /**
     * <p>
     * Returns information about a specific snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @return Result of the GetSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    GetSnapshotResult getSnapshot(GetSnapshotRequest getSnapshotRequest);

    /**
     * <p>
     * Returns information about a <code>TableRestoreStatus</code> object.
     * </p>
     * 
     * @param getTableRestoreStatusRequest
     * @return Result of the GetTableRestoreStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetTableRestoreStatusResult getTableRestoreStatus(GetTableRestoreStatusRequest getTableRestoreStatusRequest);

    /**
     * <p>
     * Returns information about a usage limit.
     * </p>
     * 
     * @param getUsageLimitRequest
     * @return Result of the GetUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    GetUsageLimitResult getUsageLimit(GetUsageLimitRequest getUsageLimitRequest);

    /**
     * <p>
     * Returns information about a specific workgroup.
     * </p>
     * 
     * @param getWorkgroupRequest
     * @return Result of the GetWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.GetWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/GetWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetWorkgroupResult getWorkgroup(GetWorkgroupRequest getWorkgroupRequest);

    /**
     * <p>
     * Returns an array of <code>EndpointAccess</code> objects and relevant information.
     * </p>
     * 
     * @param listEndpointAccessRequest
     * @return Result of the ListEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    ListEndpointAccessResult listEndpointAccess(ListEndpointAccessRequest listEndpointAccessRequest);

    /**
     * <p>
     * Returns information about a list of specified namespaces.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return Result of the ListNamespaces operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    ListNamespacesResult listNamespaces(ListNamespacesRequest listNamespacesRequest);

    /**
     * <p>
     * Returns an array of recovery points.
     * </p>
     * 
     * @param listRecoveryPointsRequest
     * @return Result of the ListRecoveryPoints operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListRecoveryPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListRecoveryPoints"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecoveryPointsResult listRecoveryPoints(ListRecoveryPointsRequest listRecoveryPointsRequest);

    /**
     * <p>
     * Returns a list of snapshots.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @return Result of the ListSnapshots operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    ListSnapshotsResult listSnapshots(ListSnapshotsRequest listSnapshotsRequest);

    /**
     * <p>
     * Returns information about an array of <code>TableRestoreStatus</code> objects.
     * </p>
     * 
     * @param listTableRestoreStatusRequest
     * @return Result of the ListTableRestoreStatus operation returned by the service.
     * @throws InvalidPaginationException
     *         The provided pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListTableRestoreStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTableRestoreStatus"
     *      target="_top">AWS API Documentation</a>
     */
    ListTableRestoreStatusResult listTableRestoreStatus(ListTableRestoreStatusRequest listTableRestoreStatusRequest);

    /**
     * <p>
     * Lists the tags assigned to a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSRedshiftServerless.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all usage limits within Amazon Redshift Serverless.
     * </p>
     * 
     * @param listUsageLimitsRequest
     * @return Result of the ListUsageLimits operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InvalidPaginationException
     *         The provided pagination token is invalid.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListUsageLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListUsageLimits"
     *      target="_top">AWS API Documentation</a>
     */
    ListUsageLimitsResult listUsageLimits(ListUsageLimitsRequest listUsageLimitsRequest);

    /**
     * <p>
     * Returns information about a list of specified workgroups.
     * </p>
     * 
     * @param listWorkgroupsRequest
     * @return Result of the ListWorkgroups operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.ListWorkgroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListWorkgroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListWorkgroupsResult listWorkgroups(ListWorkgroupsRequest listWorkgroupsRequest);

    /**
     * <p>
     * Creates or updates a resource policy. Currently, you can use policies to share snapshots across Amazon Web
     * Services accounts.
     * </p>
     * 
     * @param putResourcePolicyRequest
     * @return Result of the PutResourcePolicy operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.PutResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/PutResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutResourcePolicyResult putResourcePolicy(PutResourcePolicyRequest putResourcePolicyRequest);

    /**
     * <p>
     * Restore the data from a recovery point.
     * </p>
     * 
     * @param restoreFromRecoveryPointRequest
     * @return Result of the RestoreFromRecoveryPoint operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.RestoreFromRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromRecoveryPoint"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreFromRecoveryPointResult restoreFromRecoveryPoint(RestoreFromRecoveryPointRequest restoreFromRecoveryPointRequest);

    /**
     * <p>
     * Restores a namespace from a snapshot.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     * @return Result of the RestoreFromSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ServiceQuotaExceededException
     *         The service limit was exceeded.
     * @sample AWSRedshiftServerless.RestoreFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreFromSnapshotResult restoreFromSnapshot(RestoreFromSnapshotRequest restoreFromSnapshotRequest);

    /**
     * <p>
     * Restores a table from a snapshot to your Amazon Redshift Serverless instance.
     * </p>
     * 
     * @param restoreTableFromSnapshotRequest
     * @return Result of the RestoreTableFromSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.RestoreTableFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreTableFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    RestoreTableFromSnapshotResult restoreTableFromSnapshot(RestoreTableFromSnapshotRequest restoreTableFromSnapshotRequest);

    /**
     * <p>
     * Assigns one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws TooManyTagsException
     *         The request exceeded the number of tags allowed for a resource.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSRedshiftServerless.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag or set of tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSRedshiftServerless.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an Amazon Redshift Serverless managed endpoint.
     * </p>
     * 
     * @param updateEndpointAccessRequest
     * @return Result of the UpdateEndpointAccess operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AWSRedshiftServerless.UpdateEndpointAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateEndpointAccess"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEndpointAccessResult updateEndpointAccess(UpdateEndpointAccessRequest updateEndpointAccessRequest);

    /**
     * <p>
     * Updates a namespace with the specified settings.
     * </p>
     * 
     * @param updateNamespaceRequest
     * @return Result of the UpdateNamespace operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateNamespaceResult updateNamespace(UpdateNamespaceRequest updateNamespaceRequest);

    /**
     * <p>
     * Updates a snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return Result of the UpdateSnapshot operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSnapshotResult updateSnapshot(UpdateSnapshotRequest updateSnapshotRequest);

    /**
     * <p>
     * Update a usage limit in Amazon Redshift Serverless. You can't update the usage type or period of a usage limit.
     * </p>
     * 
     * @param updateUsageLimitRequest
     * @return Result of the UpdateUsageLimit operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateUsageLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateUsageLimit"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateUsageLimitResult updateUsageLimit(UpdateUsageLimitRequest updateUsageLimitRequest);

    /**
     * <p>
     * Updates a workgroup with the specified configuration settings.
     * </p>
     * 
     * @param updateWorkgroupRequest
     * @return Result of the UpdateWorkgroup operation returned by the service.
     * @throws InternalServerException
     *         The request processing has failed because of an unknown error, exception or failure.
     * @throws InsufficientCapacityException
     *         There is an insufficient capacity to perform the action.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ConflictException
     *         The submitted action has conflicts.
     * @throws ValidationException
     *         The input failed to satisfy the constraints specified by an AWS service.
     * @sample AWSRedshiftServerless.UpdateWorkgroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateWorkgroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateWorkgroupResult updateWorkgroup(UpdateWorkgroupRequest updateWorkgroupRequest);

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
