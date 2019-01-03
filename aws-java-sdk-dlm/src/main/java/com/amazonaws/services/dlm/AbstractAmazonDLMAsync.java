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
package com.amazonaws.services.dlm;

import javax.annotation.Generated;

import com.amazonaws.services.dlm.model.*;

/**
 * Abstract implementation of {@code AmazonDLMAsync}. Convenient method forms pass through to the corresponding overload
 * that takes a request object and an {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonDLMAsync extends AbstractAmazonDLM implements AmazonDLMAsync {

    protected AbstractAmazonDLMAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateLifecyclePolicyResult> createLifecyclePolicyAsync(CreateLifecyclePolicyRequest request) {

        return createLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLifecyclePolicyResult> createLifecyclePolicyAsync(CreateLifecyclePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLifecyclePolicyRequest, CreateLifecyclePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest request) {

        return deleteLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecyclePolicyRequest, DeleteLifecyclePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLifecyclePoliciesResult> getLifecyclePoliciesAsync(GetLifecyclePoliciesRequest request) {

        return getLifecyclePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLifecyclePoliciesResult> getLifecyclePoliciesAsync(GetLifecyclePoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLifecyclePoliciesRequest, GetLifecyclePoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest request) {

        return getLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLifecyclePolicyRequest, GetLifecyclePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateLifecyclePolicyResult> updateLifecyclePolicyAsync(UpdateLifecyclePolicyRequest request) {

        return updateLifecyclePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateLifecyclePolicyResult> updateLifecyclePolicyAsync(UpdateLifecyclePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLifecyclePolicyRequest, UpdateLifecyclePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
