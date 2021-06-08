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
 * Interface for accessing Amazon Elastic Inference asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticinference.AbstractAmazonElasticInferenceAsync} instead.
 * </p>
 * <p>
 * <p>
 * Elastic Inference public APIs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticInferenceAsync extends AmazonElasticInference {

    /**
     * <p>
     * Describes the locations in which a given accelerator type or set of types is present in a given region.
     * </p>
     * 
     * @param describeAcceleratorOfferingsRequest
     * @return A Java Future containing the result of the DescribeAcceleratorOfferings operation returned by the
     *         service.
     * @sample AmazonElasticInferenceAsync.DescribeAcceleratorOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorOfferingsResult> describeAcceleratorOfferingsAsync(
            DescribeAcceleratorOfferingsRequest describeAcceleratorOfferingsRequest);

    /**
     * <p>
     * Describes the locations in which a given accelerator type or set of types is present in a given region.
     * </p>
     * 
     * @param describeAcceleratorOfferingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAcceleratorOfferings operation returned by the
     *         service.
     * @sample AmazonElasticInferenceAsyncHandler.DescribeAcceleratorOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorOfferingsResult> describeAcceleratorOfferingsAsync(
            DescribeAcceleratorOfferingsRequest describeAcceleratorOfferingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorOfferingsRequest, DescribeAcceleratorOfferingsResult> asyncHandler);

    /**
     * <p>
     * Describes the accelerator types available in a given region, as well as their characteristics, such as memory and
     * throughput.
     * </p>
     * 
     * @param describeAcceleratorTypesRequest
     * @return A Java Future containing the result of the DescribeAcceleratorTypes operation returned by the service.
     * @sample AmazonElasticInferenceAsync.DescribeAcceleratorTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorTypesResult> describeAcceleratorTypesAsync(DescribeAcceleratorTypesRequest describeAcceleratorTypesRequest);

    /**
     * <p>
     * Describes the accelerator types available in a given region, as well as their characteristics, such as memory and
     * throughput.
     * </p>
     * 
     * @param describeAcceleratorTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAcceleratorTypes operation returned by the service.
     * @sample AmazonElasticInferenceAsyncHandler.DescribeAcceleratorTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorTypesResult> describeAcceleratorTypesAsync(DescribeAcceleratorTypesRequest describeAcceleratorTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorTypesRequest, DescribeAcceleratorTypesResult> asyncHandler);

    /**
     * <p>
     * Describes information over a provided set of accelerators belonging to an account.
     * </p>
     * 
     * @param describeAcceleratorsRequest
     * @return A Java Future containing the result of the DescribeAccelerators operation returned by the service.
     * @sample AmazonElasticInferenceAsync.DescribeAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorsResult> describeAcceleratorsAsync(DescribeAcceleratorsRequest describeAcceleratorsRequest);

    /**
     * <p>
     * Describes information over a provided set of accelerators belonging to an account.
     * </p>
     * 
     * @param describeAcceleratorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccelerators operation returned by the service.
     * @sample AmazonElasticInferenceAsyncHandler.DescribeAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAcceleratorsResult> describeAcceleratorsAsync(DescribeAcceleratorsRequest describeAcceleratorsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAcceleratorsRequest, DescribeAcceleratorsResult> asyncHandler);

    /**
     * <p>
     * Returns all tags of an Elastic Inference Accelerator.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonElasticInferenceAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns all tags of an Elastic Inference Accelerator.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonElasticInferenceAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds the specified tags to an Elastic Inference Accelerator.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonElasticInferenceAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds the specified tags to an Elastic Inference Accelerator.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonElasticInferenceAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from an Elastic Inference Accelerator.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonElasticInferenceAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from an Elastic Inference Accelerator.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonElasticInferenceAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
