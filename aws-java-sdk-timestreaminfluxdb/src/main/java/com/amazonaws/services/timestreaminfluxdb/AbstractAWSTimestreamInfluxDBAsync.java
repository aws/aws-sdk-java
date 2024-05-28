/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreaminfluxdb;

import javax.annotation.Generated;

import com.amazonaws.services.timestreaminfluxdb.model.*;

/**
 * Abstract implementation of {@code AWSTimestreamInfluxDBAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSTimestreamInfluxDBAsync extends AbstractAWSTimestreamInfluxDB implements AWSTimestreamInfluxDBAsync {

    protected AbstractAWSTimestreamInfluxDBAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateDbInstanceResult> createDbInstanceAsync(CreateDbInstanceRequest request) {

        return createDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDbInstanceResult> createDbInstanceAsync(CreateDbInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDbInstanceRequest, CreateDbInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateDbParameterGroupResult> createDbParameterGroupAsync(CreateDbParameterGroupRequest request) {

        return createDbParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDbParameterGroupResult> createDbParameterGroupAsync(CreateDbParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateDbParameterGroupRequest, CreateDbParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteDbInstanceResult> deleteDbInstanceAsync(DeleteDbInstanceRequest request) {

        return deleteDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDbInstanceResult> deleteDbInstanceAsync(DeleteDbInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDbInstanceRequest, DeleteDbInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDbInstanceResult> getDbInstanceAsync(GetDbInstanceRequest request) {

        return getDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDbInstanceResult> getDbInstanceAsync(GetDbInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDbInstanceRequest, GetDbInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetDbParameterGroupResult> getDbParameterGroupAsync(GetDbParameterGroupRequest request) {

        return getDbParameterGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDbParameterGroupResult> getDbParameterGroupAsync(GetDbParameterGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDbParameterGroupRequest, GetDbParameterGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDbInstancesResult> listDbInstancesAsync(ListDbInstancesRequest request) {

        return listDbInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDbInstancesResult> listDbInstancesAsync(ListDbInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDbInstancesRequest, ListDbInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDbParameterGroupsResult> listDbParameterGroupsAsync(ListDbParameterGroupsRequest request) {

        return listDbParameterGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDbParameterGroupsResult> listDbParameterGroupsAsync(ListDbParameterGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDbParameterGroupsRequest, ListDbParameterGroupsResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateDbInstanceResult> updateDbInstanceAsync(UpdateDbInstanceRequest request) {

        return updateDbInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDbInstanceResult> updateDbInstanceAsync(UpdateDbInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateDbInstanceRequest, UpdateDbInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
