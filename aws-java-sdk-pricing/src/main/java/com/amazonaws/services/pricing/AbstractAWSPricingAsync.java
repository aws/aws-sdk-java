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
package com.amazonaws.services.pricing;

import javax.annotation.Generated;

import com.amazonaws.services.pricing.model.*;

/**
 * Abstract implementation of {@code AWSPricingAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSPricingAsync extends AbstractAWSPricing implements AWSPricingAsync {

    protected AbstractAWSPricingAsync() {
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request) {

        return describeServicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAttributeValuesResult> getAttributeValuesAsync(GetAttributeValuesRequest request) {

        return getAttributeValuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttributeValuesResult> getAttributeValuesAsync(GetAttributeValuesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAttributeValuesRequest, GetAttributeValuesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetProductsResult> getProductsAsync(GetProductsRequest request) {

        return getProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetProductsResult> getProductsAsync(GetProductsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetProductsRequest, GetProductsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
