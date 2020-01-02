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
 * Interface for accessing AWSSavingsPlans asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.savingsplans.AbstractAWSSavingsPlansAsync} instead.
 * </p>
 * <p>
 * <p>
 * Savings Plans are a pricing model that offer significant savings on AWS usage (for example, on Amazon EC2 instances).
 * You commit to a consistent amount of usage, in USD per hour, for a term of 1 or 3 years, and receive a lower price
 * for that usage. For more information, see the <a
 * href="https://docs.aws.amazon.com/savingsplans/latest/userguide/">AWS Savings Plans User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSavingsPlansAsync extends AWSSavingsPlans {

    /**
     * <p>
     * Creates a Savings Plan.
     * </p>
     * 
     * @param createSavingsPlanRequest
     * @return A Java Future containing the result of the CreateSavingsPlan operation returned by the service.
     * @sample AWSSavingsPlansAsync.CreateSavingsPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/CreateSavingsPlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSavingsPlanResult> createSavingsPlanAsync(CreateSavingsPlanRequest createSavingsPlanRequest);

    /**
     * <p>
     * Creates a Savings Plan.
     * </p>
     * 
     * @param createSavingsPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSavingsPlan operation returned by the service.
     * @sample AWSSavingsPlansAsyncHandler.CreateSavingsPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/CreateSavingsPlan" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSavingsPlanResult> createSavingsPlanAsync(CreateSavingsPlanRequest createSavingsPlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSavingsPlanRequest, CreateSavingsPlanResult> asyncHandler);

    /**
     * <p>
     * Describes the specified Savings Plans rates.
     * </p>
     * 
     * @param describeSavingsPlanRatesRequest
     * @return A Java Future containing the result of the DescribeSavingsPlanRates operation returned by the service.
     * @sample AWSSavingsPlansAsync.DescribeSavingsPlanRates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlanRates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlanRatesResult> describeSavingsPlanRatesAsync(DescribeSavingsPlanRatesRequest describeSavingsPlanRatesRequest);

    /**
     * <p>
     * Describes the specified Savings Plans rates.
     * </p>
     * 
     * @param describeSavingsPlanRatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSavingsPlanRates operation returned by the service.
     * @sample AWSSavingsPlansAsyncHandler.DescribeSavingsPlanRates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlanRates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlanRatesResult> describeSavingsPlanRatesAsync(DescribeSavingsPlanRatesRequest describeSavingsPlanRatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlanRatesRequest, DescribeSavingsPlanRatesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified Savings Plans.
     * </p>
     * 
     * @param describeSavingsPlansRequest
     * @return A Java Future containing the result of the DescribeSavingsPlans operation returned by the service.
     * @sample AWSSavingsPlansAsync.DescribeSavingsPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlansResult> describeSavingsPlansAsync(DescribeSavingsPlansRequest describeSavingsPlansRequest);

    /**
     * <p>
     * Describes the specified Savings Plans.
     * </p>
     * 
     * @param describeSavingsPlansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSavingsPlans operation returned by the service.
     * @sample AWSSavingsPlansAsyncHandler.DescribeSavingsPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlans"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlansResult> describeSavingsPlansAsync(DescribeSavingsPlansRequest describeSavingsPlansRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansRequest, DescribeSavingsPlansResult> asyncHandler);

    /**
     * <p>
     * Describes the specified Savings Plans offering rates.
     * </p>
     * 
     * @param describeSavingsPlansOfferingRatesRequest
     * @return A Java Future containing the result of the DescribeSavingsPlansOfferingRates operation returned by the
     *         service.
     * @sample AWSSavingsPlansAsync.DescribeSavingsPlansOfferingRates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferingRates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlansOfferingRatesResult> describeSavingsPlansOfferingRatesAsync(
            DescribeSavingsPlansOfferingRatesRequest describeSavingsPlansOfferingRatesRequest);

    /**
     * <p>
     * Describes the specified Savings Plans offering rates.
     * </p>
     * 
     * @param describeSavingsPlansOfferingRatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSavingsPlansOfferingRates operation returned by the
     *         service.
     * @sample AWSSavingsPlansAsyncHandler.DescribeSavingsPlansOfferingRates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferingRates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlansOfferingRatesResult> describeSavingsPlansOfferingRatesAsync(
            DescribeSavingsPlansOfferingRatesRequest describeSavingsPlansOfferingRatesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansOfferingRatesRequest, DescribeSavingsPlansOfferingRatesResult> asyncHandler);

    /**
     * <p>
     * Describes the specified Savings Plans offerings.
     * </p>
     * 
     * @param describeSavingsPlansOfferingsRequest
     * @return A Java Future containing the result of the DescribeSavingsPlansOfferings operation returned by the
     *         service.
     * @sample AWSSavingsPlansAsync.DescribeSavingsPlansOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlansOfferingsResult> describeSavingsPlansOfferingsAsync(
            DescribeSavingsPlansOfferingsRequest describeSavingsPlansOfferingsRequest);

    /**
     * <p>
     * Describes the specified Savings Plans offerings.
     * </p>
     * 
     * @param describeSavingsPlansOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSavingsPlansOfferings operation returned by the
     *         service.
     * @sample AWSSavingsPlansAsyncHandler.DescribeSavingsPlansOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlansOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSavingsPlansOfferingsResult> describeSavingsPlansOfferingsAsync(
            DescribeSavingsPlansOfferingsRequest describeSavingsPlansOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSavingsPlansOfferingsRequest, DescribeSavingsPlansOfferingsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSavingsPlansAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for the specified resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSavingsPlansAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSavingsPlansAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSavingsPlansAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSavingsPlansAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSavingsPlansAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
