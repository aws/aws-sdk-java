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
package com.amazonaws.services.lexruntime;

import javax.annotation.Generated;

import com.amazonaws.services.lexruntime.model.*;

/**
 * Abstract implementation of {@code AmazonLexRuntimeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonLexRuntimeAsync extends AbstractAmazonLexRuntime implements AmazonLexRuntimeAsync {

    protected AbstractAmazonLexRuntimeAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(DeleteSessionRequest request) {

        return deleteSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSessionResult> deleteSessionAsync(DeleteSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSessionRequest, DeleteSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request) {

        return getSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionResult> getSessionAsync(GetSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSessionRequest, GetSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PostContentResult> postContentAsync(PostContentRequest request) {

        return postContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostContentResult> postContentAsync(PostContentRequest request,
            com.amazonaws.handlers.AsyncHandler<PostContentRequest, PostContentResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PostTextResult> postTextAsync(PostTextRequest request) {

        return postTextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PostTextResult> postTextAsync(PostTextRequest request,
            com.amazonaws.handlers.AsyncHandler<PostTextRequest, PostTextResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutSessionResult> putSessionAsync(PutSessionRequest request) {

        return putSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutSessionResult> putSessionAsync(PutSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutSessionRequest, PutSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
