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
package com.amazonaws.services.codestarconnections;

import javax.annotation.Generated;

import com.amazonaws.services.codestarconnections.model.*;

/**
 * Abstract implementation of {@code AWSCodeStarconnectionsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCodeStarconnectionsAsync extends AbstractAWSCodeStarconnections implements AWSCodeStarconnectionsAsync {

    protected AbstractAWSCodeStarconnectionsAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateHostResult> createHostAsync(CreateHostRequest request) {

        return createHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateHostResult> createHostAsync(CreateHostRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateHostRequest, CreateHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(DeleteHostRequest request) {

        return deleteHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHostResult> deleteHostAsync(DeleteHostRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteHostRequest, DeleteHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest request) {

        return getConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResult> getConnectionAsync(GetConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetConnectionRequest, GetConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetHostResult> getHostAsync(GetHostRequest request) {

        return getHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetHostResult> getHostAsync(GetHostRequest request,
            com.amazonaws.handlers.AsyncHandler<GetHostRequest, GetHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request) {

        return listConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConnectionsRequest, ListConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListHostsResult> listHostsAsync(ListHostsRequest request) {

        return listHostsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHostsResult> listHostsAsync(ListHostsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListHostsRequest, ListHostsResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateHostResult> updateHostAsync(UpdateHostRequest request) {

        return updateHostAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateHostResult> updateHostAsync(UpdateHostRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateHostRequest, UpdateHostResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
