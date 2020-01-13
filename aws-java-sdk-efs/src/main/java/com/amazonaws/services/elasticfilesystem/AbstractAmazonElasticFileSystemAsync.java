/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem;

import javax.annotation.Generated;

import com.amazonaws.services.elasticfilesystem.model.*;

/**
 * Abstract implementation of {@code AmazonElasticFileSystemAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticFileSystemAsync extends AbstractAmazonElasticFileSystem implements AmazonElasticFileSystemAsync {

    protected AbstractAmazonElasticFileSystemAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest request) {

        return createAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPointRequest, CreateAccessPointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request) {

        return createFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(CreateFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(CreateMountTargetRequest request) {

        return createMountTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(CreateMountTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMountTargetRequest, CreateMountTargetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<CreateTagsResult> createTagsAsync(CreateTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, CreateTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest request) {

        return deleteAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointRequest, DeleteAccessPointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request) {

        return deleteFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemResult> deleteFileSystemAsync(DeleteFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, DeleteFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemPolicyResult> deleteFileSystemPolicyAsync(DeleteFileSystemPolicyRequest request) {

        return deleteFileSystemPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFileSystemPolicyResult> deleteFileSystemPolicyAsync(DeleteFileSystemPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteFileSystemPolicyRequest, DeleteFileSystemPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMountTargetResult> deleteMountTargetAsync(DeleteMountTargetRequest request) {

        return deleteMountTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMountTargetResult> deleteMountTargetAsync(DeleteMountTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMountTargetRequest, DeleteMountTargetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccessPointsResult> describeAccessPointsAsync(DescribeAccessPointsRequest request) {

        return describeAccessPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccessPointsResult> describeAccessPointsAsync(DescribeAccessPointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccessPointsRequest, DescribeAccessPointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemPolicyResult> describeFileSystemPolicyAsync(DescribeFileSystemPolicyRequest request) {

        return describeFileSystemPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemPolicyResult> describeFileSystemPolicyAsync(DescribeFileSystemPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemPolicyRequest, DescribeFileSystemPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request) {

        return describeFileSystemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(DescribeFileSystemsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeFileSystems operation.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync() {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeFileSystems operation with an AsyncHandler.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleConfigurationResult> describeLifecycleConfigurationAsync(DescribeLifecycleConfigurationRequest request) {

        return describeLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLifecycleConfigurationResult> describeLifecycleConfigurationAsync(DescribeLifecycleConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleConfigurationRequest, DescribeLifecycleConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest request) {

        return describeMountTargetSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMountTargetSecurityGroupsRequest, DescribeMountTargetSecurityGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(DescribeMountTargetsRequest request) {

        return describeMountTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(DescribeMountTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeMountTargetsRequest, DescribeMountTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

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
    public java.util.concurrent.Future<ModifyMountTargetSecurityGroupsResult> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest request) {

        return modifyMountTargetSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyMountTargetSecurityGroupsResult> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyMountTargetSecurityGroupsRequest, ModifyMountTargetSecurityGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutFileSystemPolicyResult> putFileSystemPolicyAsync(PutFileSystemPolicyRequest request) {

        return putFileSystemPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutFileSystemPolicyResult> putFileSystemPolicyAsync(PutFileSystemPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutFileSystemPolicyRequest, PutFileSystemPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleConfigurationResult> putLifecycleConfigurationAsync(PutLifecycleConfigurationRequest request) {

        return putLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLifecycleConfigurationResult> putLifecycleConfigurationAsync(PutLifecycleConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleConfigurationRequest, PutLifecycleConfigurationResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request) {

        return updateFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFileSystemResult> updateFileSystemAsync(UpdateFileSystemRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateFileSystemRequest, UpdateFileSystemResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
