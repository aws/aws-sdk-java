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
package com.amazonaws.services.memorydb;

import javax.annotation.Generated;

import com.amazonaws.services.memorydb.model.*;

/**
 * Abstract implementation of {@code AmazonMemoryDBAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonMemoryDBAsync extends AbstractAmazonMemoryDB implements AmazonMemoryDBAsync {

    protected AbstractAmazonMemoryDBAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateClusterResult> batchUpdateClusterAsync(BatchUpdateClusterRequest request) {

        return batchUpdateClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateClusterResult> batchUpdateClusterAsync(BatchUpdateClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateClusterRequest, BatchUpdateClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request) {

        return copySnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateACLResult> createACLAsync(CreateACLRequest request) {

        return createACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateACLResult> createACLAsync(CreateACLRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateACLRequest, CreateACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(CreateParameterGroupRequest request) {

        return createParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParameterGroupResult> createParameterGroupAsync(CreateParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateParameterGroupRequest, CreateParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request) {

        return createSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest request) {

        return createSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSubnetGroupRequest, CreateSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(CreateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteACLResult> deleteACLAsync(DeleteACLRequest request) {

        return deleteACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteACLResult> deleteACLAsync(DeleteACLRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteACLRequest, DeleteACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(DeleteParameterGroupRequest request) {

        return deleteParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteParameterGroupResult> deleteParameterGroupAsync(DeleteParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteParameterGroupRequest, DeleteParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request) {

        return deleteSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSnapshotResult> deleteSnapshotAsync(DeleteSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSnapshotRequest, DeleteSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest request) {

        return deleteSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubnetGroupRequest, DeleteSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteUserResult> deleteUserAsync(DeleteUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, DeleteUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeACLsResult> describeACLsAsync(DescribeACLsRequest request) {

        return describeACLsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeACLsResult> describeACLsAsync(DescribeACLsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeACLsRequest, DescribeACLsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest request) {

        return describeClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClustersResult> describeClustersAsync(DescribeClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClustersRequest, DescribeClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(DescribeEngineVersionsRequest request) {

        return describeEngineVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEngineVersionsResult> describeEngineVersionsAsync(DescribeEngineVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEngineVersionsRequest, DescribeEngineVersionsResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(DescribeParameterGroupsRequest request) {

        return describeParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeParameterGroupsResult> describeParameterGroupsAsync(DescribeParameterGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeParameterGroupsRequest, DescribeParameterGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest request) {

        return describeParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeParametersResult> describeParametersAsync(DescribeParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeParametersRequest, DescribeParametersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest request) {

        return describeReservedNodesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesResult> describeReservedNodesAsync(DescribeReservedNodesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesRequest, DescribeReservedNodesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesOfferingsResult> describeReservedNodesOfferingsAsync(DescribeReservedNodesOfferingsRequest request) {

        return describeReservedNodesOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReservedNodesOfferingsResult> describeReservedNodesOfferingsAsync(DescribeReservedNodesOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReservedNodesOfferingsRequest, DescribeReservedNodesOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceUpdatesResult> describeServiceUpdatesAsync(DescribeServiceUpdatesRequest request) {

        return describeServiceUpdatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServiceUpdatesResult> describeServiceUpdatesAsync(DescribeServiceUpdatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceUpdatesRequest, DescribeServiceUpdatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
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

    @Override
    public java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest request) {

        return describeSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetGroupsRequest, DescribeSubnetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest request) {

        return describeUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUsersResult> describeUsersAsync(DescribeUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeUsersRequest, DescribeUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<FailoverShardResult> failoverShardAsync(FailoverShardRequest request) {

        return failoverShardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FailoverShardResult> failoverShardAsync(FailoverShardRequest request,
            com.amazonaws.handlers.AsyncHandler<FailoverShardRequest, FailoverShardResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAllowedNodeTypeUpdatesResult> listAllowedNodeTypeUpdatesAsync(ListAllowedNodeTypeUpdatesRequest request) {

        return listAllowedNodeTypeUpdatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAllowedNodeTypeUpdatesResult> listAllowedNodeTypeUpdatesAsync(ListAllowedNodeTypeUpdatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAllowedNodeTypeUpdatesRequest, ListAllowedNodeTypeUpdatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedNodesOfferingResult> purchaseReservedNodesOfferingAsync(PurchaseReservedNodesOfferingRequest request) {

        return purchaseReservedNodesOfferingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PurchaseReservedNodesOfferingResult> purchaseReservedNodesOfferingAsync(PurchaseReservedNodesOfferingRequest request,
            com.amazonaws.handlers.AsyncHandler<PurchaseReservedNodesOfferingRequest, PurchaseReservedNodesOfferingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ResetParameterGroupResult> resetParameterGroupAsync(ResetParameterGroupRequest request) {

        return resetParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResetParameterGroupResult> resetParameterGroupAsync(ResetParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ResetParameterGroupRequest, ResetParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateACLResult> updateACLAsync(UpdateACLRequest request) {

        return updateACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateACLResult> updateACLAsync(UpdateACLRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateACLRequest, UpdateACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest request) {

        return updateClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterResult> updateClusterAsync(UpdateClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterRequest, UpdateClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(UpdateParameterGroupRequest request) {

        return updateParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateParameterGroupResult> updateParameterGroupAsync(UpdateParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateParameterGroupRequest, UpdateParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(UpdateSubnetGroupRequest request) {

        return updateSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSubnetGroupResult> updateSubnetGroupAsync(UpdateSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSubnetGroupRequest, UpdateSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateUserResult> updateUserAsync(UpdateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, UpdateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
