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
package com.amazonaws.services.dax;

import javax.annotation.Generated;

import com.amazonaws.services.dax.model.*;

/**
 * Abstract implementation of {@code AmazonDaxAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDaxAsync extends AbstractAmazonDax implements AmazonDaxAsync {

    protected AbstractAmazonDaxAsync() {
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
    public java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest request) {

        return createSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSubnetGroupResult> createSubnetGroupAsync(CreateSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSubnetGroupRequest, CreateSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DecreaseReplicationFactorResult> decreaseReplicationFactorAsync(DecreaseReplicationFactorRequest request) {

        return decreaseReplicationFactorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecreaseReplicationFactorResult> decreaseReplicationFactorAsync(DecreaseReplicationFactorRequest request,
            com.amazonaws.handlers.AsyncHandler<DecreaseReplicationFactorRequest, DecreaseReplicationFactorResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest request) {

        return deleteSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSubnetGroupResult> deleteSubnetGroupAsync(DeleteSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSubnetGroupRequest, DeleteSubnetGroupResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeDefaultParametersResult> describeDefaultParametersAsync(DescribeDefaultParametersRequest request) {

        return describeDefaultParametersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDefaultParametersResult> describeDefaultParametersAsync(DescribeDefaultParametersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDefaultParametersRequest, DescribeDefaultParametersResult> asyncHandler) {

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
    public java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest request) {

        return describeSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubnetGroupsResult> describeSubnetGroupsAsync(DescribeSubnetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSubnetGroupsRequest, DescribeSubnetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<IncreaseReplicationFactorResult> increaseReplicationFactorAsync(IncreaseReplicationFactorRequest request) {

        return increaseReplicationFactorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<IncreaseReplicationFactorResult> increaseReplicationFactorAsync(IncreaseReplicationFactorRequest request,
            com.amazonaws.handlers.AsyncHandler<IncreaseReplicationFactorRequest, IncreaseReplicationFactorResult> asyncHandler) {

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
    public java.util.concurrent.Future<RebootNodeResult> rebootNodeAsync(RebootNodeRequest request) {

        return rebootNodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RebootNodeResult> rebootNodeAsync(RebootNodeRequest request,
            com.amazonaws.handlers.AsyncHandler<RebootNodeRequest, RebootNodeResult> asyncHandler) {

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

}
