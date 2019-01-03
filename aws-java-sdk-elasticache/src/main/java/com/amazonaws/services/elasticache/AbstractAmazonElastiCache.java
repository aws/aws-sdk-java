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
package com.amazonaws.services.elasticache;

import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.*;
import com.amazonaws.services.elasticache.waiters.AmazonElastiCacheWaiters;

/**
 * Abstract implementation of {@code AmazonElastiCache}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElastiCache implements AmazonElastiCache {

    protected AbstractAmazonElastiCache() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheSecurityGroup authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot copySnapshot(CopySnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheCluster createCacheCluster(CreateCacheClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheParameterGroup createCacheParameterGroup(CreateCacheParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheSecurityGroup createCacheSecurityGroup(CreateCacheSecurityGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheSubnetGroup createCacheSubnetGroup(CreateCacheSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplicationGroup createReplicationGroup(CreateReplicationGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot createSnapshot(CreateSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplicationGroup decreaseReplicaCount(DecreaseReplicaCountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheCluster deleteCacheCluster(DeleteCacheClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCacheParameterGroupResult deleteCacheParameterGroup(DeleteCacheParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCacheSecurityGroupResult deleteCacheSecurityGroup(DeleteCacheSecurityGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteCacheSubnetGroupResult deleteCacheSubnetGroup(DeleteCacheSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplicationGroup deleteReplicationGroup(DeleteReplicationGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Snapshot deleteSnapshot(DeleteSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCacheClustersResult describeCacheClusters(DescribeCacheClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCacheClustersResult describeCacheClusters() {
        return describeCacheClusters(new DescribeCacheClustersRequest());
    }

    @Override
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions(DescribeCacheEngineVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCacheEngineVersionsResult describeCacheEngineVersions() {
        return describeCacheEngineVersions(new DescribeCacheEngineVersionsRequest());
    }

    @Override
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups(DescribeCacheParameterGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCacheParameterGroupsResult describeCacheParameterGroups() {
        return describeCacheParameterGroups(new DescribeCacheParameterGroupsRequest());
    }

    @Override
    public DescribeCacheParametersResult describeCacheParameters(DescribeCacheParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCacheSecurityGroupsResult describeCacheSecurityGroups() {
        return describeCacheSecurityGroups(new DescribeCacheSecurityGroupsRequest());
    }

    @Override
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups(DescribeCacheSubnetGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCacheSubnetGroupsResult describeCacheSubnetGroups() {
        return describeCacheSubnetGroups(new DescribeCacheSubnetGroupsRequest());
    }

    @Override
    public EngineDefaults describeEngineDefaultParameters(DescribeEngineDefaultParametersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventsResult describeEvents(DescribeEventsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEventsResult describeEvents() {
        return describeEvents(new DescribeEventsRequest());
    }

    @Override
    public DescribeReplicationGroupsResult describeReplicationGroups(DescribeReplicationGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReplicationGroupsResult describeReplicationGroups() {
        return describeReplicationGroups(new DescribeReplicationGroupsRequest());
    }

    @Override
    public DescribeReservedCacheNodesResult describeReservedCacheNodes(DescribeReservedCacheNodesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedCacheNodesResult describeReservedCacheNodes() {
        return describeReservedCacheNodes(new DescribeReservedCacheNodesRequest());
    }

    @Override
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings(DescribeReservedCacheNodesOfferingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReservedCacheNodesOfferingsResult describeReservedCacheNodesOfferings() {
        return describeReservedCacheNodesOfferings(new DescribeReservedCacheNodesOfferingsRequest());
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots() {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }

    @Override
    public ReplicationGroup increaseReplicaCount(IncreaseReplicaCountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications(ListAllowedNodeTypeModificationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAllowedNodeTypeModificationsResult listAllowedNodeTypeModifications() {
        return listAllowedNodeTypeModifications(new ListAllowedNodeTypeModificationsRequest());
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheCluster modifyCacheCluster(ModifyCacheClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyCacheParameterGroupResult modifyCacheParameterGroup(ModifyCacheParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheSubnetGroup modifyCacheSubnetGroup(ModifyCacheSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplicationGroup modifyReplicationGroup(ModifyReplicationGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplicationGroup modifyReplicationGroupShardConfiguration(ModifyReplicationGroupShardConfigurationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReservedCacheNode purchaseReservedCacheNodesOffering(PurchaseReservedCacheNodesOfferingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheCluster rebootCacheCluster(RebootCacheClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ResetCacheParameterGroupResult resetCacheParameterGroup(ResetCacheParameterGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CacheSecurityGroup revokeCacheSecurityGroupIngress(RevokeCacheSecurityGroupIngressRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReplicationGroup testFailover(TestFailoverRequest request) {
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
    public AmazonElastiCacheWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
