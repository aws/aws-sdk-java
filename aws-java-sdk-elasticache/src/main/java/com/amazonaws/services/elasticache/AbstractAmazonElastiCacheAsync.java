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

/**
 * Abstract implementation of {@code AmazonElastiCacheAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElastiCacheAsync extends AbstractAmazonElastiCache implements AmazonElastiCacheAsync {

    protected AbstractAmazonElastiCacheAsync() {
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
    public java.util.concurrent.Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(AuthorizeCacheSecurityGroupIngressRequest request) {

        return authorizeCacheSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheSecurityGroup> authorizeCacheSecurityGroupIngressAsync(AuthorizeCacheSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<AuthorizeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> copySnapshotAsync(CopySnapshotRequest request) {

        return copySnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> copySnapshotAsync(CopySnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheCluster> createCacheClusterAsync(CreateCacheClusterRequest request) {

        return createCacheClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheCluster> createCacheClusterAsync(CreateCacheClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCacheClusterRequest, CacheCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheParameterGroup> createCacheParameterGroupAsync(CreateCacheParameterGroupRequest request) {

        return createCacheParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheParameterGroup> createCacheParameterGroupAsync(CreateCacheParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCacheParameterGroupRequest, CacheParameterGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheSecurityGroup> createCacheSecurityGroupAsync(CreateCacheSecurityGroupRequest request) {

        return createCacheSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheSecurityGroup> createCacheSecurityGroupAsync(CreateCacheSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCacheSecurityGroupRequest, CacheSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheSubnetGroup> createCacheSubnetGroupAsync(CreateCacheSubnetGroupRequest request) {

        return createCacheSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheSubnetGroup> createCacheSubnetGroupAsync(CreateCacheSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> createReplicationGroupAsync(CreateReplicationGroupRequest request) {

        return createReplicationGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> createReplicationGroupAsync(CreateReplicationGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationGroupRequest, ReplicationGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> createSnapshotAsync(CreateSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> decreaseReplicaCountAsync(DecreaseReplicaCountRequest request) {

        return decreaseReplicaCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> decreaseReplicaCountAsync(DecreaseReplicaCountRequest request,
            com.amazonaws.handlers.AsyncHandler<DecreaseReplicaCountRequest, ReplicationGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheCluster> deleteCacheClusterAsync(DeleteCacheClusterRequest request) {

        return deleteCacheClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheCluster> deleteCacheClusterAsync(DeleteCacheClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheClusterRequest, CacheCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCacheParameterGroupResult> deleteCacheParameterGroupAsync(DeleteCacheParameterGroupRequest request) {

        return deleteCacheParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCacheParameterGroupResult> deleteCacheParameterGroupAsync(DeleteCacheParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheParameterGroupRequest, DeleteCacheParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCacheSecurityGroupResult> deleteCacheSecurityGroupAsync(DeleteCacheSecurityGroupRequest request) {

        return deleteCacheSecurityGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCacheSecurityGroupResult> deleteCacheSecurityGroupAsync(DeleteCacheSecurityGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheSecurityGroupRequest, DeleteCacheSecurityGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteCacheSubnetGroupResult> deleteCacheSubnetGroupAsync(DeleteCacheSubnetGroupRequest request) {

        return deleteCacheSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteCacheSubnetGroupResult> deleteCacheSubnetGroupAsync(DeleteCacheSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCacheSubnetGroupRequest, DeleteCacheSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> deleteReplicationGroupAsync(DeleteReplicationGroupRequest request) {

        return deleteReplicationGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> deleteReplicationGroupAsync(DeleteReplicationGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationGroupRequest, ReplicationGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Snapshot> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Snapshot> deleteSnapshotAsync(DeleteSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, Snapshot> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(DescribeCacheClustersRequest request) {

        return describeCacheClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(DescribeCacheClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheClustersRequest, DescribeCacheClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation.
     *
     * @see #describeCacheClustersAsync(DescribeCacheClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync() {

        return describeCacheClustersAsync(new DescribeCacheClustersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCacheClusters operation with an AsyncHandler.
     *
     * @see #describeCacheClustersAsync(DescribeCacheClustersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheClustersResult> describeCacheClustersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheClustersRequest, DescribeCacheClustersResult> asyncHandler) {

        return describeCacheClustersAsync(new DescribeCacheClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest request) {

        return describeCacheEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheEngineVersionsRequest, DescribeCacheEngineVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions operation.
     *
     * @see #describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync() {

        return describeCacheEngineVersionsAsync(new DescribeCacheEngineVersionsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCacheEngineVersions operation with an AsyncHandler.
     *
     * @see #describeCacheEngineVersionsAsync(DescribeCacheEngineVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheEngineVersionsResult> describeCacheEngineVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheEngineVersionsRequest, DescribeCacheEngineVersionsResult> asyncHandler) {

        return describeCacheEngineVersionsAsync(new DescribeCacheEngineVersionsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest request) {

        return describeCacheParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParameterGroupsRequest, DescribeCacheParameterGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups operation.
     *
     * @see #describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync() {

        return describeCacheParameterGroupsAsync(new DescribeCacheParameterGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCacheParameterGroups operation with an AsyncHandler.
     *
     * @see #describeCacheParameterGroupsAsync(DescribeCacheParameterGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheParameterGroupsResult> describeCacheParameterGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParameterGroupsRequest, DescribeCacheParameterGroupsResult> asyncHandler) {

        return describeCacheParameterGroupsAsync(new DescribeCacheParameterGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheParametersResult> describeCacheParametersAsync(DescribeCacheParametersRequest request) {

        return describeCacheParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheParametersResult> describeCacheParametersAsync(DescribeCacheParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheParametersRequest, DescribeCacheParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest request) {

        return describeCacheSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSecurityGroupsRequest, DescribeCacheSecurityGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups operation.
     *
     * @see #describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync() {

        return describeCacheSecurityGroupsAsync(new DescribeCacheSecurityGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCacheSecurityGroups operation with an AsyncHandler.
     *
     * @see #describeCacheSecurityGroupsAsync(DescribeCacheSecurityGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheSecurityGroupsResult> describeCacheSecurityGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSecurityGroupsRequest, DescribeCacheSecurityGroupsResult> asyncHandler) {

        return describeCacheSecurityGroupsAsync(new DescribeCacheSecurityGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest request) {

        return describeCacheSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSubnetGroupsRequest, DescribeCacheSubnetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups operation.
     *
     * @see #describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync() {

        return describeCacheSubnetGroupsAsync(new DescribeCacheSubnetGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeCacheSubnetGroups operation with an AsyncHandler.
     *
     * @see #describeCacheSubnetGroupsAsync(DescribeCacheSubnetGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeCacheSubnetGroupsResult> describeCacheSubnetGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCacheSubnetGroupsRequest, DescribeCacheSubnetGroupsResult> asyncHandler) {

        return describeCacheSubnetGroupsAsync(new DescribeCacheSubnetGroupsRequest(), asyncHandler);
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
    public java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(DescribeReplicationGroupsRequest request) {

        return describeReplicationGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(DescribeReplicationGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReplicationGroups operation.
     *
     * @see #describeReplicationGroupsAsync(DescribeReplicationGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync() {

        return describeReplicationGroupsAsync(new DescribeReplicationGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReplicationGroups operation with an AsyncHandler.
     *
     * @see #describeReplicationGroupsAsync(DescribeReplicationGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReplicationGroupsResult> describeReplicationGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationGroupsRequest, DescribeReplicationGroupsResult> asyncHandler) {

        return describeReplicationGroupsAsync(new DescribeReplicationGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest request) {

        return describeReservedCacheNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesRequest, DescribeReservedCacheNodesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes operation.
     *
     * @see #describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync() {

        return describeReservedCacheNodesAsync(new DescribeReservedCacheNodesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodes operation with an AsyncHandler.
     *
     * @see #describeReservedCacheNodesAsync(DescribeReservedCacheNodesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesResult> describeReservedCacheNodesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesRequest, DescribeReservedCacheNodesResult> asyncHandler) {

        return describeReservedCacheNodesAsync(new DescribeReservedCacheNodesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            DescribeReservedCacheNodesOfferingsRequest request) {

        return describeReservedCacheNodesOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            DescribeReservedCacheNodesOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesOfferingsRequest, DescribeReservedCacheNodesOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodesOfferings operation.
     *
     * @see #describeReservedCacheNodesOfferingsAsync(DescribeReservedCacheNodesOfferingsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync() {

        return describeReservedCacheNodesOfferingsAsync(new DescribeReservedCacheNodesOfferingsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeReservedCacheNodesOfferings operation with an AsyncHandler.
     *
     * @see #describeReservedCacheNodesOfferingsAsync(DescribeReservedCacheNodesOfferingsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeReservedCacheNodesOfferingsResult> describeReservedCacheNodesOfferingsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeReservedCacheNodesOfferingsRequest, DescribeReservedCacheNodesOfferingsResult> asyncHandler) {

        return describeReservedCacheNodesOfferingsAsync(new DescribeReservedCacheNodesOfferingsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request) {

        return describeSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync() {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeSnapshots operation with an AsyncHandler.
     *
     * @see #describeSnapshotsAsync(DescribeSnapshotsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeSnapshotsResult> describeSnapshotsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler) {

        return describeSnapshotsAsync(new DescribeSnapshotsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> increaseReplicaCountAsync(IncreaseReplicaCountRequest request) {

        return increaseReplicaCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> increaseReplicaCountAsync(IncreaseReplicaCountRequest request,
            com.amazonaws.handlers.AsyncHandler<IncreaseReplicaCountRequest, ReplicationGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            ListAllowedNodeTypeModificationsRequest request) {

        return listAllowedNodeTypeModificationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            ListAllowedNodeTypeModificationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeModificationsRequest, ListAllowedNodeTypeModificationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications operation.
     *
     * @see #listAllowedNodeTypeModificationsAsync(ListAllowedNodeTypeModificationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync() {

        return listAllowedNodeTypeModificationsAsync(new ListAllowedNodeTypeModificationsRequest());
    }

    /**
     * Simplified method form for invoking the ListAllowedNodeTypeModifications operation with an AsyncHandler.
     *
     * @see #listAllowedNodeTypeModificationsAsync(ListAllowedNodeTypeModificationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListAllowedNodeTypeModificationsResult> listAllowedNodeTypeModificationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeModificationsRequest, ListAllowedNodeTypeModificationsResult> asyncHandler) {

        return listAllowedNodeTypeModificationsAsync(new ListAllowedNodeTypeModificationsRequest(), asyncHandler);
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
    public java.util.concurrent.Future<CacheCluster> modifyCacheClusterAsync(ModifyCacheClusterRequest request) {

        return modifyCacheClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheCluster> modifyCacheClusterAsync(ModifyCacheClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheClusterRequest, CacheCluster> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(ModifyCacheParameterGroupRequest request) {

        return modifyCacheParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyCacheParameterGroupResult> modifyCacheParameterGroupAsync(ModifyCacheParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheParameterGroupRequest, ModifyCacheParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(ModifyCacheSubnetGroupRequest request) {

        return modifyCacheSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheSubnetGroup> modifyCacheSubnetGroupAsync(ModifyCacheSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyCacheSubnetGroupRequest, CacheSubnetGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupAsync(ModifyReplicationGroupRequest request) {

        return modifyReplicationGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupAsync(ModifyReplicationGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationGroupRequest, ReplicationGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupShardConfigurationAsync(ModifyReplicationGroupShardConfigurationRequest request) {

        return modifyReplicationGroupShardConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> modifyReplicationGroupShardConfigurationAsync(ModifyReplicationGroupShardConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationGroupShardConfigurationRequest, ReplicationGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(PurchaseReservedCacheNodesOfferingRequest request) {

        return purchaseReservedCacheNodesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReservedCacheNode> purchaseReservedCacheNodesOfferingAsync(PurchaseReservedCacheNodesOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedCacheNodesOfferingRequest, ReservedCacheNode> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheCluster> rebootCacheClusterAsync(RebootCacheClusterRequest request) {

        return rebootCacheClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheCluster> rebootCacheClusterAsync(RebootCacheClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootCacheClusterRequest, CacheCluster> asyncHandler) {

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
    public java.util.concurrent.Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(ResetCacheParameterGroupRequest request) {

        return resetCacheParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetCacheParameterGroupResult> resetCacheParameterGroupAsync(ResetCacheParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetCacheParameterGroupRequest, ResetCacheParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(RevokeCacheSecurityGroupIngressRequest request) {

        return revokeCacheSecurityGroupIngressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CacheSecurityGroup> revokeCacheSecurityGroupIngressAsync(RevokeCacheSecurityGroupIngressRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeCacheSecurityGroupIngressRequest, CacheSecurityGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> testFailoverAsync(TestFailoverRequest request) {

        return testFailoverAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReplicationGroup> testFailoverAsync(TestFailoverRequest request,
            com.amazonaws.handlers.AsyncHandler<TestFailoverRequest, ReplicationGroup> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
