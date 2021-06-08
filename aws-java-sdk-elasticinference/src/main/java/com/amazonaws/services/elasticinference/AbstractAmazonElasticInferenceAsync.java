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
package com.amazonaws.services.elasticinference;

import javax.annotation.Generated;

import com.amazonaws.services.elasticinference.model.*;

/**
 * Abstract implementation of {@code AmazonElasticInferenceAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonElasticInferenceAsync extends AbstractAmazonElasticInference implements AmazonElasticInferenceAsync {

    protected AbstractAmazonElasticInferenceAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorOfferingsResult> describeAcceleratorOfferingsAsync(DescribeAcceleratorOfferingsRequest request) {

        return describeAcceleratorOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorOfferingsResult> describeAcceleratorOfferingsAsync(DescribeAcceleratorOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorOfferingsRequest, DescribeAcceleratorOfferingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorTypesResult> describeAcceleratorTypesAsync(DescribeAcceleratorTypesRequest request) {

        return describeAcceleratorTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorTypesResult> describeAcceleratorTypesAsync(DescribeAcceleratorTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorTypesRequest, DescribeAcceleratorTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorsResult> describeAcceleratorsAsync(DescribeAcceleratorsRequest request) {

        return describeAcceleratorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAcceleratorsResult> describeAcceleratorsAsync(DescribeAcceleratorsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorsRequest, DescribeAcceleratorsResult> asyncHandler) {

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

}
