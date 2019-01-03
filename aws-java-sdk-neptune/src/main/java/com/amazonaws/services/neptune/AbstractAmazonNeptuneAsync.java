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
package com.amazonaws.services.neptune;

import javax.annotation.Generated;

import com.amazonaws.services.neptune.model.*;

/**
 * Abstract implementation of {@code AmazonNeptuneAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonNeptuneAsync extends AbstractAmazonNeptune implements AmazonNeptuneAsync {

    protected AbstractAmazonNeptuneAsync() {
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
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest request) {

        return createDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> createDBClusterAsync(CreateDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBClusterRequest, DBCluster> asyncHandler) {

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
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest request) {

        return createDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBParameterGroup> createDBParameterGroupAsync(CreateDBParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDBParameterGroupRequest, DBParameterGroup> asyncHandler) {

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
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest request) {

        return deleteDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> deleteDBClusterAsync(DeleteDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBClusterRequest, DBCluster> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest request) {

        return deleteDBParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDBParameterGroupResult> deleteDBParameterGroupAsync(DeleteDBParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDBParameterGroupRequest, DeleteDBParameterGroupResult> asyncHandler) {

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

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest request) {

        return describeDBClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBClustersResult> describeDBClustersAsync(DescribeDBClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBClustersRequest, DescribeDBClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest request) {

        return describeDBInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBInstancesResult> describeDBInstancesAsync(DescribeDBInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBInstancesRequest, DescribeDBInstancesResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest request) {

        return describeDBSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDBSubnetGroupsResult> describeDBSubnetGroupsAsync(DescribeDBSubnetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDBSubnetGroupsRequest, DescribeDBSubnetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request) {

        return describeEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSubscriptionsResult> describeEventSubscriptionsAsync(DescribeEventSubscriptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSubscriptionsRequest, DescribeEventSubscriptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest request) {

        return failoverDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> failoverDBClusterAsync(FailoverDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<FailoverDBClusterRequest, DBCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest request) {

        return modifyDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> modifyDBClusterAsync(ModifyDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyDBClusterRequest, DBCluster> asyncHandler) {

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
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest request) {

        return promoteReadReplicaDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DBCluster> promoteReadReplicaDBClusterAsync(PromoteReadReplicaDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<PromoteReadReplicaDBClusterRequest, DBCluster> asyncHandler) {

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
    public java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(RemoveRoleFromDBClusterRequest request) {

        return removeRoleFromDBClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveRoleFromDBClusterResult> removeRoleFromDBClusterAsync(RemoveRoleFromDBClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveRoleFromDBClusterRequest, RemoveRoleFromDBClusterResult> asyncHandler) {

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

}
