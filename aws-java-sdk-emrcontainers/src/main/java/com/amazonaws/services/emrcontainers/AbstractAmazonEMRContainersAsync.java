/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers;

import javax.annotation.Generated;

import com.amazonaws.services.emrcontainers.model.*;

/**
 * Abstract implementation of {@code AmazonEMRContainersAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEMRContainersAsync extends AbstractAmazonEMRContainers implements AmazonEMRContainersAsync {

    protected AbstractAmazonEMRContainersAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest request) {

        return cancelJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobRunResult> cancelJobRunAsync(CancelJobRunRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelJobRunRequest, CancelJobRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateManagedEndpointResult> createManagedEndpointAsync(CreateManagedEndpointRequest request) {

        return createManagedEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateManagedEndpointResult> createManagedEndpointAsync(CreateManagedEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateManagedEndpointRequest, CreateManagedEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualClusterResult> createVirtualClusterAsync(CreateVirtualClusterRequest request) {

        return createVirtualClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualClusterResult> createVirtualClusterAsync(CreateVirtualClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualClusterRequest, CreateVirtualClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedEndpointResult> deleteManagedEndpointAsync(DeleteManagedEndpointRequest request) {

        return deleteManagedEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteManagedEndpointResult> deleteManagedEndpointAsync(DeleteManagedEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteManagedEndpointRequest, DeleteManagedEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualClusterResult> deleteVirtualClusterAsync(DeleteVirtualClusterRequest request) {

        return deleteVirtualClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVirtualClusterResult> deleteVirtualClusterAsync(DeleteVirtualClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualClusterRequest, DeleteVirtualClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(DescribeJobRunRequest request) {

        return describeJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobRunResult> describeJobRunAsync(DescribeJobRunRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRunRequest, DescribeJobRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeManagedEndpointResult> describeManagedEndpointAsync(DescribeManagedEndpointRequest request) {

        return describeManagedEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeManagedEndpointResult> describeManagedEndpointAsync(DescribeManagedEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeManagedEndpointRequest, DescribeManagedEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualClusterResult> describeVirtualClusterAsync(DescribeVirtualClusterRequest request) {

        return describeVirtualClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVirtualClusterResult> describeVirtualClusterAsync(DescribeVirtualClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVirtualClusterRequest, DescribeVirtualClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest request) {

        return listJobRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobRunsResult> listJobRunsAsync(ListJobRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobRunsRequest, ListJobRunsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListManagedEndpointsResult> listManagedEndpointsAsync(ListManagedEndpointsRequest request) {

        return listManagedEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListManagedEndpointsResult> listManagedEndpointsAsync(ListManagedEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListManagedEndpointsRequest, ListManagedEndpointsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListVirtualClustersResult> listVirtualClustersAsync(ListVirtualClustersRequest request) {

        return listVirtualClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualClustersResult> listVirtualClustersAsync(ListVirtualClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVirtualClustersRequest, ListVirtualClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request) {

        return startJobRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartJobRunResult> startJobRunAsync(StartJobRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StartJobRunRequest, StartJobRunResult> asyncHandler) {

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

}
