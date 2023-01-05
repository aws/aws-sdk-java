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
package com.amazonaws.services.oam;

import javax.annotation.Generated;

import com.amazonaws.services.oam.model.*;

/**
 * Abstract implementation of {@code AWSOAMAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSOAMAsync extends AbstractAWSOAM implements AWSOAMAsync {

    protected AbstractAWSOAMAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest request) {

        return createLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLinkRequest, CreateLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSinkResult> createSinkAsync(CreateSinkRequest request) {

        return createSinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSinkResult> createSinkAsync(CreateSinkRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSinkRequest, CreateSinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest request) {

        return deleteLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLinkRequest, DeleteLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSinkResult> deleteSinkAsync(DeleteSinkRequest request) {

        return deleteSinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSinkResult> deleteSinkAsync(DeleteSinkRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSinkRequest, DeleteSinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLinkResult> getLinkAsync(GetLinkRequest request) {

        return getLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLinkResult> getLinkAsync(GetLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLinkRequest, GetLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSinkResult> getSinkAsync(GetSinkRequest request) {

        return getSinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSinkResult> getSinkAsync(GetSinkRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSinkRequest, GetSinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSinkPolicyResult> getSinkPolicyAsync(GetSinkPolicyRequest request) {

        return getSinkPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSinkPolicyResult> getSinkPolicyAsync(GetSinkPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSinkPolicyRequest, GetSinkPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttachedLinksResult> listAttachedLinksAsync(ListAttachedLinksRequest request) {

        return listAttachedLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedLinksResult> listAttachedLinksAsync(ListAttachedLinksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttachedLinksRequest, ListAttachedLinksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLinksResult> listLinksAsync(ListLinksRequest request) {

        return listLinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLinksResult> listLinksAsync(ListLinksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLinksRequest, ListLinksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSinksResult> listSinksAsync(ListSinksRequest request) {

        return listSinksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSinksResult> listSinksAsync(ListSinksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSinksRequest, ListSinksResult> asyncHandler) {

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
    public java.util.concurrent.Future<PutSinkPolicyResult> putSinkPolicyAsync(PutSinkPolicyRequest request) {

        return putSinkPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSinkPolicyResult> putSinkPolicyAsync(PutSinkPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutSinkPolicyRequest, PutSinkPolicyResult> asyncHandler) {

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
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest request) {

        return updateLinkAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLinkRequest, UpdateLinkResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
