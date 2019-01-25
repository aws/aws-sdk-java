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
package com.amazonaws.services.rds;

import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;

/**
 * Abstract implementation of {@code AmazonRDSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonRDSAsync extends AbstractAmazonRDS implements AmazonRDSAsync {

    protected AbstractAmazonRDSAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddRoleToDBClusterResult> addRoleToDBClusterAsync(AddRoleToDBClusterRequest request) {

        return addRoleToDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddRoleToDBClusterResult> addRoleToDBClusterAsync(AddRoleToDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<AddRoleToDBClusterRequest, AddRoleToDBClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddRoleToDBInstanceResult> addRoleToDBInstanceAsync(AddRoleToDBInstanceRequest request) {

        return addRoleToDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddRoleToDBInstanceResult> addRoleToDBInstanceAsync(AddRoleToDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<AddRoleToDBInstanceRequest, AddRoleToDBInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(AddSourceIdentifierToSubscriptionRequest request) {

        return addSourceIdentifierToSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> addSourceIdentifierToSubscriptionAsync(AddSourceIdentifierToSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<AddSourceIdentifierToSubscriptionRequest, EventSubscription> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(ApplyPendingMaintenanceActionRequest request) {

        return applyPendingMaintenanceActionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResourcePendingMaintenanceActions> applyPendingMaintenanceActionAsync(ApplyPendingMaintenanceActionRequest request,
            com.amazonaws.handlers.AsyncHandler<ApplyPendingMaintenanceActionRequest, ResourcePendingMaintenanceActions> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(AuthorizeDBSecurityGroupIngressRequest request) {

        return authorizeDBSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> authorizeDBSecurityGroupIngressAsync(AuthorizeDBSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BacktrackDBClusterResult> backtrackDBClusterAsync(BacktrackDBClusterRequest request) {

        return backtrackDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BacktrackDBClusterResult> backtrackDBClusterAsync(BacktrackDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<BacktrackDBClusterRequest, BacktrackDBClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(CopyDBClusterParameterGroupRequest request) {

        return copyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> copyDBClusterParameterGroupAsync(CopyDBClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest request) {

        return copyDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> copyDBClusterSnapshotAsync(CopyDBClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(CopyDBParameterGroupRequest request) {

        return copyDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> copyDBParameterGroupAsync(CopyDBParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyDBParameterGroupRequest, DBParameterGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> copyDBSnapshotAsync(CopyDBSnapshotRequest request) {

        return copyDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> copyDBSnapshotAsync(CopyDBSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyDBSnapshotRequest, DBSnapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> copyOptionGroupAsync(CopyOptionGroupRequest request) {

        return copyOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> copyOptionGroupAsync(CopyOptionGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyOptionGroupRequest, OptionGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest request) {

        return createDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDBClusterEndpointResult> createDBClusterEndpointAsync(CreateDBClusterEndpointRequest request) {

        return createDBClusterEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDBClusterEndpointResult> createDBClusterEndpointAsync(CreateDBClusterEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterEndpointRequest, CreateDBClusterEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(CreateDBClusterParameterGroupRequest request) {

        return createDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterParameterGroup> createDBClusterParameterGroupAsync(CreateDBClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterParameterGroupRequest, DBClusterParameterGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest request) {

        return createDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> createDBClusterSnapshotAsync(CreateDBClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest request) {

        return createDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceAsync(CreateDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBInstanceRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceReadReplicaAsync(CreateDBInstanceReadReplicaRequest request) {

        return createDBInstanceReadReplicaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> createDBInstanceReadReplicaAsync(CreateDBInstanceReadReplicaRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBInstanceReadReplicaRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest request) {

        return createDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBParameterGroupRequest, DBParameterGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> createDBSecurityGroupAsync(CreateDBSecurityGroupRequest request) {

        return createDBSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> createDBSecurityGroupAsync(CreateDBSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBSecurityGroupRequest, DBSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> createDBSnapshotAsync(CreateDBSnapshotRequest request) {

        return createDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> createDBSnapshotAsync(CreateDBSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBSnapshotRequest, DBSnapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest request) {

        return createDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> createDBSubnetGroupAsync(CreateDBSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest request) {

        return createEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> createEventSubscriptionAsync(CreateEventSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEventSubscriptionRequest, EventSubscription> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> createGlobalClusterAsync(CreateGlobalClusterRequest request) {

        return createGlobalClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> createGlobalClusterAsync(CreateGlobalClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGlobalClusterRequest, GlobalCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> createOptionGroupAsync(CreateOptionGroupRequest request) {

        return createOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> createOptionGroupAsync(CreateOptionGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateOptionGroupRequest, OptionGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest request) {

        return deleteDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterEndpointResult> deleteDBClusterEndpointAsync(DeleteDBClusterEndpointRequest request) {

        return deleteDBClusterEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterEndpointResult> deleteDBClusterEndpointAsync(DeleteDBClusterEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterEndpointRequest, DeleteDBClusterEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(DeleteDBClusterParameterGroupRequest request) {

        return deleteDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBClusterParameterGroupResult> deleteDBClusterParameterGroupAsync(DeleteDBClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterParameterGroupRequest, DeleteDBClusterParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest request) {

        return deleteDBClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshot> deleteDBClusterSnapshotAsync(DeleteDBClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterSnapshotRequest, DBClusterSnapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest request) {

        return deleteDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> deleteDBInstanceAsync(DeleteDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstanceAutomatedBackup> deleteDBInstanceAutomatedBackupAsync(DeleteDBInstanceAutomatedBackupRequest request) {

        return deleteDBInstanceAutomatedBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstanceAutomatedBackup> deleteDBInstanceAutomatedBackupAsync(DeleteDBInstanceAutomatedBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBInstanceAutomatedBackupRequest, DBInstanceAutomatedBackup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest request) {

        return deleteDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBParameterGroupRequest, DeleteDBParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSecurityGroupResult> deleteDBSecurityGroupAsync(DeleteDBSecurityGroupRequest request) {

        return deleteDBSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSecurityGroupResult> deleteDBSecurityGroupAsync(DeleteDBSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBSecurityGroupRequest, DeleteDBSecurityGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> deleteDBSnapshotAsync(DeleteDBSnapshotRequest request) {

        return deleteDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> deleteDBSnapshotAsync(DeleteDBSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBSnapshotRequest, DBSnapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest request) {

        return deleteDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBSubnetGroupResult> deleteDBSubnetGroupAsync(DeleteDBSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBSubnetGroupRequest, DeleteDBSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request) {

        return deleteEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> deleteEventSubscriptionAsync(DeleteEventSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventSubscriptionRequest, EventSubscription> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> deleteGlobalClusterAsync(DeleteGlobalClusterRequest request) {

        return deleteGlobalClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> deleteGlobalClusterAsync(DeleteGlobalClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGlobalClusterRequest, GlobalCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteOptionGroupResult> deleteOptionGroupAsync(DeleteOptionGroupRequest request) {

        return deleteOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteOptionGroupResult> deleteOptionGroupAsync(DeleteOptionGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteOptionGroupRequest, DeleteOptionGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync() {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeAccountAttributes operation with an AsyncHandler.
     *
     * @see #describeAccountAttributesAsync(DescribeAccountAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        return describeAccountAttributesAsync(new DescribeAccountAttributesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest request) {

        return describeCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(DescribeCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCertificates operation.
     *
     * @see #describeCertificatesAsync(DescribeCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync() {

        return describeCertificatesAsync(new DescribeCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCertificates operation with an AsyncHandler.
     *
     * @see #describeCertificatesAsync(DescribeCertificatesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCertificatesResult> describeCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCertificatesRequest, DescribeCertificatesResult> asyncHandler) {

        return describeCertificatesAsync(new DescribeCertificatesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterBacktracksResult> describeDBClusterBacktracksAsync(DescribeDBClusterBacktracksRequest request) {

        return describeDBClusterBacktracksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterBacktracksResult> describeDBClusterBacktracksAsync(DescribeDBClusterBacktracksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterBacktracksRequest, DescribeDBClusterBacktracksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterEndpointsResult> describeDBClusterEndpointsAsync(DescribeDBClusterEndpointsRequest request) {

        return describeDBClusterEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterEndpointsResult> describeDBClusterEndpointsAsync(DescribeDBClusterEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterEndpointsRequest, DescribeDBClusterEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest request) {

        return describeDBClusterParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            DescribeDBClusterParameterGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation.
     *
     * @see #describeDBClusterParameterGroupsAsync(DescribeDBClusterParameterGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync() {

        return describeDBClusterParameterGroupsAsync(new DescribeDBClusterParameterGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBClusterParameterGroups operation with an AsyncHandler.
     *
     * @see #describeDBClusterParameterGroupsAsync(DescribeDBClusterParameterGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClusterParameterGroupsResult> describeDBClusterParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParameterGroupsRequest, DescribeDBClusterParameterGroupsResult> asyncHandler) {

        return describeDBClusterParameterGroupsAsync(new DescribeDBClusterParameterGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(DescribeDBClusterParametersRequest request) {

        return describeDBClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterParametersResult> describeDBClusterParametersAsync(DescribeDBClusterParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterParametersRequest, DescribeDBClusterParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest request) {

        return describeDBClusterSnapshotAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> describeDBClusterSnapshotAttributesAsync(
            DescribeDBClusterSnapshotAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotAttributesRequest, DBClusterSnapshotAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest request) {

        return describeDBClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation.
     *
     * @see #describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync() {

        return describeDBClusterSnapshotsAsync(new DescribeDBClusterSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBClusterSnapshots operation with an AsyncHandler.
     *
     * @see #describeDBClusterSnapshotsAsync(DescribeDBClusterSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClusterSnapshotsResult> describeDBClusterSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClusterSnapshotsRequest, DescribeDBClusterSnapshotsResult> asyncHandler) {

        return describeDBClusterSnapshotsAsync(new DescribeDBClusterSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest request) {

        return describeDBClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBClusters operation.
     *
     * @see #describeDBClustersAsync(DescribeDBClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync() {

        return describeDBClustersAsync(new DescribeDBClustersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBClusters operation with an AsyncHandler.
     *
     * @see #describeDBClustersAsync(DescribeDBClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler) {

        return describeDBClustersAsync(new DescribeDBClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest request) {

        return describeDBEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBEngineVersions operation.
     *
     * @see #describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync() {

        return describeDBEngineVersionsAsync(new DescribeDBEngineVersionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBEngineVersions operation with an AsyncHandler.
     *
     * @see #describeDBEngineVersionsAsync(DescribeDBEngineVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBEngineVersionsResult> describeDBEngineVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBEngineVersionsRequest, DescribeDBEngineVersionsResult> asyncHandler) {

        return describeDBEngineVersionsAsync(new DescribeDBEngineVersionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstanceAutomatedBackupsResult> describeDBInstanceAutomatedBackupsAsync(
            DescribeDBInstanceAutomatedBackupsRequest request) {

        return describeDBInstanceAutomatedBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstanceAutomatedBackupsResult> describeDBInstanceAutomatedBackupsAsync(
            DescribeDBInstanceAutomatedBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstanceAutomatedBackupsRequest, DescribeDBInstanceAutomatedBackupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest request) {

        return describeDBInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBInstances operation.
     *
     * @see #describeDBInstancesAsync(DescribeDBInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync() {

        return describeDBInstancesAsync(new DescribeDBInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBInstances operation with an AsyncHandler.
     *
     * @see #describeDBInstancesAsync(DescribeDBInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler) {

        return describeDBInstancesAsync(new DescribeDBInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(DescribeDBLogFilesRequest request) {

        return describeDBLogFilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBLogFilesResult> describeDBLogFilesAsync(DescribeDBLogFilesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBLogFilesRequest, DescribeDBLogFilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest request) {

        return describeDBParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBParameterGroups operation.
     *
     * @see #describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync() {

        return describeDBParameterGroupsAsync(new DescribeDBParameterGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBParameterGroups operation with an AsyncHandler.
     *
     * @see #describeDBParameterGroupsAsync(DescribeDBParameterGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBParameterGroupsResult> describeDBParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBParameterGroupsRequest, DescribeDBParameterGroupsResult> asyncHandler) {

        return describeDBParameterGroupsAsync(new DescribeDBParameterGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(DescribeDBParametersRequest request) {

        return describeDBParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBParametersResult> describeDBParametersAsync(DescribeDBParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBParametersRequest, DescribeDBParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest request) {

        return describeDBSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBSecurityGroups operation.
     *
     * @see #describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync() {

        return describeDBSecurityGroupsAsync(new DescribeDBSecurityGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeDBSecurityGroupsAsync(DescribeDBSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSecurityGroupsResult> describeDBSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSecurityGroupsRequest, DescribeDBSecurityGroupsResult> asyncHandler) {

        return describeDBSecurityGroupsAsync(new DescribeDBSecurityGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest request) {

        return describeDBSnapshotAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation.
     *
     * @see #describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync() {

        return describeDBSnapshotAttributesAsync(new DescribeDBSnapshotAttributesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSnapshotAttributes operation with an AsyncHandler.
     *
     * @see #describeDBSnapshotAttributesAsync(DescribeDBSnapshotAttributesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> describeDBSnapshotAttributesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotAttributesRequest, DBSnapshotAttributesResult> asyncHandler) {

        return describeDBSnapshotAttributesAsync(new DescribeDBSnapshotAttributesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(DescribeDBSnapshotsRequest request) {

        return describeDBSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(DescribeDBSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBSnapshots operation.
     *
     * @see #describeDBSnapshotsAsync(DescribeDBSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync() {

        return describeDBSnapshotsAsync(new DescribeDBSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSnapshots operation with an AsyncHandler.
     *
     * @see #describeDBSnapshotsAsync(DescribeDBSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSnapshotsResult> describeDBSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSnapshotsRequest, DescribeDBSnapshotsResult> asyncHandler) {

        return describeDBSnapshotsAsync(new DescribeDBSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest request) {

        return describeDBSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDBSubnetGroups operation.
     *
     * @see #describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync() {

        return describeDBSubnetGroupsAsync(new DescribeDBSubnetGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDBSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler) {

        return describeDBSubnetGroupsAsync(new DescribeDBSubnetGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(DescribeEngineDefaultClusterParametersRequest request) {

        return describeEngineDefaultClusterParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultClusterParametersAsync(DescribeEngineDefaultClusterParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultClusterParametersRequest, EngineDefaults> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(DescribeEngineDefaultParametersRequest request) {

        return describeEngineDefaultParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EngineDefaults> describeEngineDefaultParametersAsync(DescribeEngineDefaultParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineDefaultParametersRequest, EngineDefaults> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request) {

        return describeEventCategoriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(DescribeEventCategoriesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEventCategories operation.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync() {

        return describeEventCategoriesAsync(new DescribeEventCategoriesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEventCategories operation with an AsyncHandler.
     *
     * @see #describeEventCategoriesAsync(DescribeEventCategoriesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventCategoriesResult> describeEventCategoriesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventCategoriesRequest, DescribeEventCategoriesResult> asyncHandler) {

        return describeEventCategoriesAsync(new DescribeEventCategoriesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request) {

        return describeEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync() {

        return describeEventSubscriptionsAsync(new DescribeEventSubscriptionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEventSubscriptions operation with an AsyncHandler.
     *
     * @see #describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {

        return describeEventSubscriptionsAsync(new DescribeEventSubscriptionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request) {

        return describeEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync() {

        return describeEventsAsync(new DescribeEventsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeEvents operation with an AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler) {

        return describeEventsAsync(new DescribeEventsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalClustersResult> describeGlobalClustersAsync(DescribeGlobalClustersRequest request) {

        return describeGlobalClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGlobalClustersResult> describeGlobalClustersAsync(DescribeGlobalClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeGlobalClustersRequest, DescribeGlobalClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(DescribeOptionGroupOptionsRequest request) {

        return describeOptionGroupOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptionGroupOptionsResult> describeOptionGroupOptionsAsync(DescribeOptionGroupOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupOptionsRequest, DescribeOptionGroupOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(DescribeOptionGroupsRequest request) {

        return describeOptionGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(DescribeOptionGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupsRequest, DescribeOptionGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeOptionGroups operation.
     *
     * @see #describeOptionGroupsAsync(DescribeOptionGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync() {

        return describeOptionGroupsAsync(new DescribeOptionGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeOptionGroups operation with an AsyncHandler.
     *
     * @see #describeOptionGroupsAsync(DescribeOptionGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeOptionGroupsResult> describeOptionGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeOptionGroupsRequest, DescribeOptionGroupsResult> asyncHandler) {

        return describeOptionGroupsAsync(new DescribeOptionGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest request) {

        return describeOrderableDBInstanceOptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableDBInstanceOptionsResult> describeOrderableDBInstanceOptionsAsync(
            DescribeOrderableDBInstanceOptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableDBInstanceOptionsRequest, DescribeOrderableDBInstanceOptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest request) {

        return describePendingMaintenanceActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            DescribePendingMaintenanceActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation.
     *
     * @see #describePendingMaintenanceActionsAsync(DescribePendingMaintenanceActionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync() {

        return describePendingMaintenanceActionsAsync(new DescribePendingMaintenanceActionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribePendingMaintenanceActions operation with an AsyncHandler.
     *
     * @see #describePendingMaintenanceActionsAsync(DescribePendingMaintenanceActionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribePendingMaintenanceActionsResult> describePendingMaintenanceActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePendingMaintenanceActionsRequest, DescribePendingMaintenanceActionsResult> asyncHandler) {

        return describePendingMaintenanceActionsAsync(new DescribePendingMaintenanceActionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest request) {

        return describeReservedDBInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedDBInstances operation.
     *
     * @see #describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync() {

        return describeReservedDBInstancesAsync(new DescribeReservedDBInstancesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedDBInstances operation with an AsyncHandler.
     *
     * @see #describeReservedDBInstancesAsync(DescribeReservedDBInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesResult> describeReservedDBInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesRequest, DescribeReservedDBInstancesResult> asyncHandler) {

        return describeReservedDBInstancesAsync(new DescribeReservedDBInstancesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            DescribeReservedDBInstancesOfferingsRequest request) {

        return describeReservedDBInstancesOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            DescribeReservedDBInstancesOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation.
     *
     * @see #describeReservedDBInstancesOfferingsAsync(DescribeReservedDBInstancesOfferingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync() {

        return describeReservedDBInstancesOfferingsAsync(new DescribeReservedDBInstancesOfferingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedDBInstancesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedDBInstancesOfferingsAsync(DescribeReservedDBInstancesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedDBInstancesOfferingsResult> describeReservedDBInstancesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedDBInstancesOfferingsRequest, DescribeReservedDBInstancesOfferingsResult> asyncHandler) {

        return describeReservedDBInstancesOfferingsAsync(new DescribeReservedDBInstancesOfferingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceRegionsResult> describeSourceRegionsAsync(DescribeSourceRegionsRequest request) {

        return describeSourceRegionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSourceRegionsResult> describeSourceRegionsAsync(DescribeSourceRegionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSourceRegionsRequest, DescribeSourceRegionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ValidDBInstanceModificationsMessage> describeValidDBInstanceModificationsAsync(
            DescribeValidDBInstanceModificationsRequest request) {

        return describeValidDBInstanceModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidDBInstanceModificationsMessage> describeValidDBInstanceModificationsAsync(
            DescribeValidDBInstanceModificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeValidDBInstanceModificationsRequest, ValidDBInstanceModificationsMessage> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(DownloadDBLogFilePortionRequest request) {

        return downloadDBLogFilePortionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DownloadDBLogFilePortionResult> downloadDBLogFilePortionAsync(DownloadDBLogFilePortionRequest request,
            com.amazonaws.handlers.AsyncHandler<DownloadDBLogFilePortionRequest, DownloadDBLogFilePortionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest request) {

        return failoverDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the FailoverDBCluster operation.
     *
     * @see #failoverDBClusterAsync(FailoverDBClusterRequest)
     */
    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync() {

        return failoverDBClusterAsync(new FailoverDBClusterRequest());
    }

    /**
     * Simplified method form for invoking the FailoverDBCluster operation with an AsyncHandler.
     *
     * @see #failoverDBClusterAsync(FailoverDBClusterRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler) {

        return failoverDBClusterAsync(new FailoverDBClusterRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyCurrentDBClusterCapacityResult> modifyCurrentDBClusterCapacityAsync(ModifyCurrentDBClusterCapacityRequest request) {

        return modifyCurrentDBClusterCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyCurrentDBClusterCapacityResult> modifyCurrentDBClusterCapacityAsync(ModifyCurrentDBClusterCapacityRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyCurrentDBClusterCapacityRequest, ModifyCurrentDBClusterCapacityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest request) {

        return modifyDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterEndpointResult> modifyDBClusterEndpointAsync(ModifyDBClusterEndpointRequest request) {

        return modifyDBClusterEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterEndpointResult> modifyDBClusterEndpointAsync(ModifyDBClusterEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterEndpointRequest, ModifyDBClusterEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(ModifyDBClusterParameterGroupRequest request) {

        return modifyDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBClusterParameterGroupResult> modifyDBClusterParameterGroupAsync(ModifyDBClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterParameterGroupRequest, ModifyDBClusterParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(ModifyDBClusterSnapshotAttributeRequest request) {

        return modifyDBClusterSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBClusterSnapshotAttributesResult> modifyDBClusterSnapshotAttributeAsync(
            ModifyDBClusterSnapshotAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterSnapshotAttributeRequest, DBClusterSnapshotAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest request) {

        return modifyDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> modifyDBInstanceAsync(ModifyDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBInstanceRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(ModifyDBParameterGroupRequest request) {

        return modifyDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyDBParameterGroupResult> modifyDBParameterGroupAsync(ModifyDBParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBParameterGroupRequest, ModifyDBParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> modifyDBSnapshotAsync(ModifyDBSnapshotRequest request) {

        return modifyDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshot> modifyDBSnapshotAsync(ModifyDBSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBSnapshotRequest, DBSnapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> modifyDBSnapshotAttributeAsync(ModifyDBSnapshotAttributeRequest request) {

        return modifyDBSnapshotAttributeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSnapshotAttributesResult> modifyDBSnapshotAttributeAsync(ModifyDBSnapshotAttributeRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBSnapshotAttributeRequest, DBSnapshotAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest request) {

        return modifyDBSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSubnetGroup> modifyDBSubnetGroupAsync(ModifyDBSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBSubnetGroupRequest, DBSubnetGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request) {

        return modifyEventSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> modifyEventSubscriptionAsync(ModifyEventSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyEventSubscriptionRequest, EventSubscription> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> modifyGlobalClusterAsync(ModifyGlobalClusterRequest request) {

        return modifyGlobalClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> modifyGlobalClusterAsync(ModifyGlobalClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyGlobalClusterRequest, GlobalCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> modifyOptionGroupAsync(ModifyOptionGroupRequest request) {

        return modifyOptionGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<OptionGroup> modifyOptionGroupAsync(ModifyOptionGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyOptionGroupRequest, OptionGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> promoteReadReplicaAsync(PromoteReadReplicaRequest request) {

        return promoteReadReplicaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> promoteReadReplicaAsync(PromoteReadReplicaRequest request,
            com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest request) {

        return promoteReadReplicaDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(PurchaseReservedDBInstancesOfferingRequest request) {

        return purchaseReservedDBInstancesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedDBInstance> purchaseReservedDBInstancesOfferingAsync(PurchaseReservedDBInstancesOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedDBInstancesOfferingRequest, ReservedDBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest request) {

        return rebootDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> rebootDBInstanceAsync(RebootDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootDBInstanceRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> removeFromGlobalClusterAsync(RemoveFromGlobalClusterRequest request) {

        return removeFromGlobalClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GlobalCluster> removeFromGlobalClusterAsync(RemoveFromGlobalClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveFromGlobalClusterRequest, GlobalCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(RemoveRoleFromDBClusterRequest request) {

        return removeRoleFromDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(RemoveRoleFromDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveRoleFromDBClusterRequest, RemoveRoleFromDBClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromDBInstanceResult> removeRoleFromDBInstanceAsync(RemoveRoleFromDBInstanceRequest request) {

        return removeRoleFromDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromDBInstanceResult> removeRoleFromDBInstanceAsync(RemoveRoleFromDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveRoleFromDBInstanceRequest, RemoveRoleFromDBInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(RemoveSourceIdentifierFromSubscriptionRequest request) {

        return removeSourceIdentifierFromSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EventSubscription> removeSourceIdentifierFromSubscriptionAsync(RemoveSourceIdentifierFromSubscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveSourceIdentifierFromSubscriptionRequest, EventSubscription> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(ResetDBClusterParameterGroupRequest request) {

        return resetDBClusterParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDBClusterParameterGroupResult> resetDBClusterParameterGroupAsync(ResetDBClusterParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetDBClusterParameterGroupRequest, ResetDBClusterParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(ResetDBParameterGroupRequest request) {

        return resetDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetDBParameterGroupResult> resetDBParameterGroupAsync(ResetDBParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetDBParameterGroupRequest, ResetDBParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromS3Async(RestoreDBClusterFromS3Request request) {

        return restoreDBClusterFromS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromS3Async(RestoreDBClusterFromS3Request request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromS3Request, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest request) {

        return restoreDBClusterFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterFromSnapshotAsync(RestoreDBClusterFromSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterFromSnapshotRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest request) {

        return restoreDBClusterToPointInTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> restoreDBClusterToPointInTimeAsync(RestoreDBClusterToPointInTimeRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBClusterToPointInTimeRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(RestoreDBInstanceFromDBSnapshotRequest request) {

        return restoreDBInstanceFromDBSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceFromDBSnapshotAsync(RestoreDBInstanceFromDBSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceFromDBSnapshotRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceFromS3Async(RestoreDBInstanceFromS3Request request) {

        return restoreDBInstanceFromS3Async(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceFromS3Async(RestoreDBInstanceFromS3Request request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceFromS3Request, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceToPointInTimeAsync(RestoreDBInstanceToPointInTimeRequest request) {

        return restoreDBInstanceToPointInTimeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> restoreDBInstanceToPointInTimeAsync(RestoreDBInstanceToPointInTimeRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreDBInstanceToPointInTimeRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(RevokeDBSecurityGroupIngressRequest request) {

        return revokeDBSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBSecurityGroup> revokeDBSecurityGroupIngressAsync(RevokeDBSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeDBSecurityGroupIngressRequest, DBSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> startDBClusterAsync(StartDBClusterRequest request) {

        return startDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> startDBClusterAsync(StartDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> startDBInstanceAsync(StartDBInstanceRequest request) {

        return startDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> startDBInstanceAsync(StartDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StartDBInstanceRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBCluster> stopDBClusterAsync(StopDBClusterRequest request) {

        return stopDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> stopDBClusterAsync(StopDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DBInstance> stopDBInstanceAsync(StopDBInstanceRequest request) {

        return stopDBInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBInstance> stopDBInstanceAsync(StopDBInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<StopDBInstanceRequest, DBInstance> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
