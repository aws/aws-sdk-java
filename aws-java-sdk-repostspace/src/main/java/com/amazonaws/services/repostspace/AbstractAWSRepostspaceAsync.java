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
package com.amazonaws.services.repostspace;

import javax.annotation.Generated;

import com.amazonaws.services.repostspace.model.*;

/**
 * Abstract implementation of {@code AWSRepostspaceAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRepostspaceAsync extends AbstractAWSRepostspace implements AWSRepostspaceAsync {

    protected AbstractAWSRepostspaceAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateSpaceResult> createSpaceAsync(CreateSpaceRequest request) {

        return createSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSpaceResult> createSpaceAsync(CreateSpaceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSpaceRequest, CreateSpaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSpaceResult> deleteSpaceAsync(DeleteSpaceRequest request) {

        return deleteSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSpaceResult> deleteSpaceAsync(DeleteSpaceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSpaceRequest, DeleteSpaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeregisterAdminResult> deregisterAdminAsync(DeregisterAdminRequest request) {

        return deregisterAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeregisterAdminResult> deregisterAdminAsync(DeregisterAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<DeregisterAdminRequest, DeregisterAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSpaceResult> getSpaceAsync(GetSpaceRequest request) {

        return getSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSpaceResult> getSpaceAsync(GetSpaceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSpaceRequest, GetSpaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSpacesResult> listSpacesAsync(ListSpacesRequest request) {

        return listSpacesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpacesResult> listSpacesAsync(ListSpacesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSpacesRequest, ListSpacesResult> asyncHandler) {

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
    public java.util.concurrent.Future<RegisterAdminResult> registerAdminAsync(RegisterAdminRequest request) {

        return registerAdminAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RegisterAdminResult> registerAdminAsync(RegisterAdminRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterAdminRequest, RegisterAdminResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendInvitesResult> sendInvitesAsync(SendInvitesRequest request) {

        return sendInvitesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendInvitesResult> sendInvitesAsync(SendInvitesRequest request,
            com.amazonaws.handlers.AsyncHandler<SendInvitesRequest, SendInvitesResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateSpaceResult> updateSpaceAsync(UpdateSpaceRequest request) {

        return updateSpaceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSpaceResult> updateSpaceAsync(UpdateSpaceRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSpaceRequest, UpdateSpaceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
