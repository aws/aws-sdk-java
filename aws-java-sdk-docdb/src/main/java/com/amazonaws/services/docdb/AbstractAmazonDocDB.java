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
package com.amazonaws.services.docdb;

import javax.annotation.Generated;

import com.amazonaws.services.docdb.model.*;
import com.amazonaws.*;
import com.amazonaws.services.docdb.waiters.AmazonDocDBWaiters;

/**
 * Abstract implementation of {@code AmazonDocDB}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDocDB implements AmazonDocDB {

    protected AbstractAmazonDocDB() {
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResourcePendingMaintenanceActions applyPendingMaintenanceAction(ApplyPendingMaintenanceActionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBClusterParameterGroup copyDBClusterParameterGroup(CopyDBClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshot copyDBClusterSnapshot(CopyDBClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBCluster createDBCluster(CreateDBClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBClusterParameterGroup createDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshot createDBClusterSnapshot(CreateDBClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBInstance createDBInstance(CreateDBInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBSubnetGroup createDBSubnetGroup(CreateDBSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBCluster deleteDBCluster(DeleteDBClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDBClusterParameterGroupResult deleteDBClusterParameterGroup(DeleteDBClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshot deleteDBClusterSnapshot(DeleteDBClusterSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBInstance deleteDBInstance(DeleteDBInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDBSubnetGroupResult deleteDBSubnetGroup(DeleteDBSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterParametersResult describeDBClusterParameters(DescribeDBClusterParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshotAttributesResult describeDBClusterSnapshotAttributes(DescribeDBClusterSnapshotAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDBClusterSnapshotsResult describeDBClusterSnapshots(DescribeDBClusterSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDBClustersResult describeDBClusters(DescribeDBClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDBEngineVersionsResult describeDBEngineVersions(DescribeDBEngineVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDBInstancesResult describeDBInstances(DescribeDBInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDBSubnetGroupsResult describeDBSubnetGroups(DescribeDBSubnetGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EngineDefaults describeEngineDefaultClusterParameters(DescribeEngineDefaultClusterParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventCategoriesResult describeEventCategories(DescribeEventCategoriesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeOrderableDBInstanceOptionsResult describeOrderableDBInstanceOptions(DescribeOrderableDBInstanceOptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePendingMaintenanceActionsResult describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBCluster failoverDBCluster(FailoverDBClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBCluster modifyDBCluster(ModifyDBClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyDBClusterParameterGroupResult modifyDBClusterParameterGroup(ModifyDBClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBClusterSnapshotAttributesResult modifyDBClusterSnapshotAttribute(ModifyDBClusterSnapshotAttributeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBInstance modifyDBInstance(ModifyDBInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBSubnetGroup modifyDBSubnetGroup(ModifyDBSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBInstance rebootDBInstance(RebootDBInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetDBClusterParameterGroupResult resetDBClusterParameterGroup(ResetDBClusterParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBCluster restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AmazonDocDBWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
