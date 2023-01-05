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
package com.amazonaws.services.docdbelastic;

import javax.annotation.Generated;

import com.amazonaws.services.docdbelastic.model.*;

/**
 * Abstract implementation of {@code AmazonDocDBElasticAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDocDBElasticAsync extends AbstractAmazonDocDBElastic implements AmazonDocDBElasticAsync {

    protected AbstractAmazonDocDBElasticAsync() {
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
    public java.util.concurrent.Future<CreateClusterSnapshotResult> createClusterSnapshotAsync(CreateClusterSnapshotRequest request) {

        return createClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterSnapshotResult> createClusterSnapshotAsync(CreateClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateClusterSnapshotRequest, CreateClusterSnapshotResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteClusterSnapshotResult> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest request) {

        return deleteClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterSnapshotResult> deleteClusterSnapshotAsync(DeleteClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterSnapshotRequest, DeleteClusterSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetClusterResult> getClusterAsync(GetClusterRequest request) {

        return getClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClusterResult> getClusterAsync(GetClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<GetClusterRequest, GetClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetClusterSnapshotResult> getClusterSnapshotAsync(GetClusterSnapshotRequest request) {

        return getClusterSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetClusterSnapshotResult> getClusterSnapshotAsync(GetClusterSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<GetClusterSnapshotRequest, GetClusterSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClusterSnapshotsResult> listClusterSnapshotsAsync(ListClusterSnapshotsRequest request) {

        return listClusterSnapshotsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClusterSnapshotsResult> listClusterSnapshotsAsync(ListClusterSnapshotsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClusterSnapshotsRequest, ListClusterSnapshotsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

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
    public java.util.concurrent.Future<RestoreClusterFromSnapshotResult> restoreClusterFromSnapshotAsync(RestoreClusterFromSnapshotRequest request) {

        return restoreClusterFromSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreClusterFromSnapshotResult> restoreClusterFromSnapshotAsync(RestoreClusterFromSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreClusterFromSnapshotRequest, RestoreClusterFromSnapshotResult> asyncHandler) {

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

}
