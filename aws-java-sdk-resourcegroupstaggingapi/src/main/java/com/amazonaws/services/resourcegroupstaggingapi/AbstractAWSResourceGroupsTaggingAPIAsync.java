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
package com.amazonaws.services.resourcegroupstaggingapi;

import javax.annotation.Generated;

import com.amazonaws.services.resourcegroupstaggingapi.model.*;

/**
 * Abstract implementation of {@code AWSResourceGroupsTaggingAPIAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSResourceGroupsTaggingAPIAsync extends AbstractAWSResourceGroupsTaggingAPI implements AWSResourceGroupsTaggingAPIAsync {

    protected AbstractAWSResourceGroupsTaggingAPIAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest request) {

        return getResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcesResult> getResourcesAsync(GetResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourcesRequest, GetResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(GetTagKeysRequest request) {

        return getTagKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagKeysResult> getTagKeysAsync(GetTagKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTagKeysRequest, GetTagKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(GetTagValuesRequest request) {

        return getTagValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTagValuesResult> getTagValuesAsync(GetTagValuesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTagValuesRequest, GetTagValuesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(TagResourcesRequest request) {

        return tagResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourcesResult> tagResourcesAsync(TagResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourcesRequest, TagResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(UntagResourcesRequest request) {

        return untagResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourcesResult> untagResourcesAsync(UntagResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourcesRequest, UntagResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
