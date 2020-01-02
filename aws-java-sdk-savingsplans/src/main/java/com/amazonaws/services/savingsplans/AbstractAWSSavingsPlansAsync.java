/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.savingsplans;

import javax.annotation.Generated;

import com.amazonaws.services.savingsplans.model.*;

/**
 * Abstract implementation of {@code AWSSavingsPlansAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSSavingsPlansAsync extends AbstractAWSSavingsPlans implements AWSSavingsPlansAsync {

    protected AbstractAWSSavingsPlansAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateSavingsPlanResult> createSavingsPlanAsync(CreateSavingsPlanRequest request) {

        return createSavingsPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSavingsPlanResult> createSavingsPlanAsync(CreateSavingsPlanRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSavingsPlanRequest, CreateSavingsPlanResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlanRatesResult> describeSavingsPlanRatesAsync(DescribeSavingsPlanRatesRequest request) {

        return describeSavingsPlanRatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlanRatesResult> describeSavingsPlanRatesAsync(DescribeSavingsPlanRatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlanRatesRequest, DescribeSavingsPlanRatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansResult> describeSavingsPlansAsync(DescribeSavingsPlansRequest request) {

        return describeSavingsPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansResult> describeSavingsPlansAsync(DescribeSavingsPlansRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansRequest, DescribeSavingsPlansResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingRatesResult> describeSavingsPlansOfferingRatesAsync(
            DescribeSavingsPlansOfferingRatesRequest request) {

        return describeSavingsPlansOfferingRatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingRatesResult> describeSavingsPlansOfferingRatesAsync(
            DescribeSavingsPlansOfferingRatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansOfferingRatesRequest, DescribeSavingsPlansOfferingRatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingsResult> describeSavingsPlansOfferingsAsync(DescribeSavingsPlansOfferingsRequest request) {

        return describeSavingsPlansOfferingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSavingsPlansOfferingsResult> describeSavingsPlansOfferingsAsync(DescribeSavingsPlansOfferingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansOfferingsRequest, DescribeSavingsPlansOfferingsResult> asyncHandler) {

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
