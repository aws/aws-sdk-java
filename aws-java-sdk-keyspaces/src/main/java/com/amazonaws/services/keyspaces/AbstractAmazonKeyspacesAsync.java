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
package com.amazonaws.services.keyspaces;

import javax.annotation.Generated;

import com.amazonaws.services.keyspaces.model.*;

/**
 * Abstract implementation of {@code AmazonKeyspacesAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonKeyspacesAsync extends AbstractAmazonKeyspaces implements AmazonKeyspacesAsync {

    protected AbstractAmazonKeyspacesAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateKeyspaceResult> createKeyspaceAsync(CreateKeyspaceRequest request) {

        return createKeyspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyspaceResult> createKeyspaceAsync(CreateKeyspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateKeyspaceRequest, CreateKeyspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request) {

        return createTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTableResult> createTableAsync(CreateTableRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTableRequest, CreateTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyspaceResult> deleteKeyspaceAsync(DeleteKeyspaceRequest request) {

        return deleteKeyspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyspaceResult> deleteKeyspaceAsync(DeleteKeyspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyspaceRequest, DeleteKeyspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request) {

        return deleteTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTableResult> deleteTableAsync(DeleteTableRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTableRequest, DeleteTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKeyspaceResult> getKeyspaceAsync(GetKeyspaceRequest request) {

        return getKeyspaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyspaceResult> getKeyspaceAsync(GetKeyspaceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyspaceRequest, GetKeyspaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest request) {

        return getTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableResult> getTableAsync(GetTableRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTableRequest, GetTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTableAutoScalingSettingsResult> getTableAutoScalingSettingsAsync(GetTableAutoScalingSettingsRequest request) {

        return getTableAutoScalingSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTableAutoScalingSettingsResult> getTableAutoScalingSettingsAsync(GetTableAutoScalingSettingsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTableAutoScalingSettingsRequest, GetTableAutoScalingSettingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeyspacesResult> listKeyspacesAsync(ListKeyspacesRequest request) {

        return listKeyspacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyspacesResult> listKeyspacesAsync(ListKeyspacesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeyspacesRequest, ListKeyspacesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request) {

        return listTablesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTablesResult> listTablesAsync(ListTablesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTablesRequest, ListTablesResult> asyncHandler) {

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
    public java.util.concurrent.Future<RestoreTableResult> restoreTableAsync(RestoreTableRequest request) {

        return restoreTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreTableResult> restoreTableAsync(RestoreTableRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreTableRequest, RestoreTableResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request) {

        return updateTableAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTableResult> updateTableAsync(UpdateTableRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTableRequest, UpdateTableResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
