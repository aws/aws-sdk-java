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
package com.amazonaws.services.eks;

import javax.annotation.Generated;

import com.amazonaws.services.eks.model.*;

/**
 * Abstract implementation of {@code AmazonEKSAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEKSAsync extends AbstractAmazonEKS implements AmazonEKSAsync {

    protected AbstractAmazonEKSAsync() {
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
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request) {

        return describeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeUpdateResult> describeUpdateAsync(DescribeUpdateRequest request) {

        return describeUpdateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeUpdateResult> describeUpdateAsync(DescribeUpdateRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeUpdateRequest, DescribeUpdateResult> asyncHandler) {

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
    public java.util.concurrent.Future<ListUpdatesResult> listUpdatesAsync(ListUpdatesRequest request) {

        return listUpdatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUpdatesResult> listUpdatesAsync(ListUpdatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUpdatesRequest, ListUpdatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterConfigResult> updateClusterConfigAsync(UpdateClusterConfigRequest request) {

        return updateClusterConfigAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterConfigResult> updateClusterConfigAsync(UpdateClusterConfigRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterConfigRequest, UpdateClusterConfigResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterVersionResult> updateClusterVersionAsync(UpdateClusterVersionRequest request) {

        return updateClusterVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateClusterVersionResult> updateClusterVersionAsync(UpdateClusterVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateClusterVersionRequest, UpdateClusterVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
