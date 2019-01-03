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
package com.amazonaws.services.cloudhsmv2;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsmv2.model.*;

/**
 * Abstract implementation of {@code AWSCloudHSMV2Async}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudHSMV2Async extends AbstractAWSCloudHSMV2 implements AWSCloudHSMV2Async {

    protected AbstractAWSCloudHSMV2Async() {
    }

    @Override
    public java.util.concurrent.Future<CopyBackupToRegionResult> copyBackupToRegionAsync(CopyBackupToRegionRequest request) {

        return copyBackupToRegionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CopyBackupToRegionResult> copyBackupToRegionAsync(CopyBackupToRegionRequest request,
            com.amazonaws.handlers.AsyncHandler<CopyBackupToRegionRequest, CopyBackupToRegionResult> asyncHandler) {

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
    public java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest request) {

        return createHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request) {

        return deleteBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBackupResult> deleteBackupAsync(DeleteBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupRequest, DeleteBackupResult> asyncHandler) {

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
    public java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest request) {

        return deleteHsmAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request) {

        return describeBackupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBackupsResult> describeBackupsAsync(DescribeBackupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupsRequest, DescribeBackupsResult> asyncHandler) {

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
    public java.util.concurrent.Future<InitializeClusterResult> initializeClusterAsync(InitializeClusterRequest request) {

        return initializeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InitializeClusterResult> initializeClusterAsync(InitializeClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<InitializeClusterRequest, InitializeClusterResult> asyncHandler) {

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
    public java.util.concurrent.Future<RestoreBackupResult> restoreBackupAsync(RestoreBackupRequest request) {

        return restoreBackupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreBackupResult> restoreBackupAsync(RestoreBackupRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreBackupRequest, RestoreBackupResult> asyncHandler) {

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
