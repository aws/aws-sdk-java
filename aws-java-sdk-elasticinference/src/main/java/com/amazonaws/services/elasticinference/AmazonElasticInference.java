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
package com.amazonaws.services.elasticinference;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.elasticinference.model.*;

/**
 * Interface for accessing Amazon Elastic Inference.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticinference.AbstractAmazonElasticInference} instead.
 * </p>
 * <p>
 * <p>
 * Elastic Inference public APIs.
 * </p>
 * <p>
 * February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and
 * will help current customers migrate their workloads to options that offer better price and performance. After April
 * 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon
 * ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are
 * considered current customers and will be able to continue using the service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonElasticInference {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.elastic-inference";

    /**
     * <p>
     * Describes the locations in which a given accelerator type or set of types is present in a given region.
     * </p>
     * <p>
     * February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and performance. After
     * April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon
     * SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past
     * 30-day period are considered current customers and will be able to continue using the service.
     * </p>
     * 
     * @param describeAcceleratorOfferingsRequest
     * @return Result of the DescribeAcceleratorOfferings operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.DescribeAcceleratorOfferings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorOfferings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAcceleratorOfferingsResult describeAcceleratorOfferings(DescribeAcceleratorOfferingsRequest describeAcceleratorOfferingsRequest);

    /**
     * <p>
     * Describes the accelerator types available in a given region, as well as their characteristics, such as memory and
     * throughput.
     * </p>
     * <p>
     * February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and performance. After
     * April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon
     * SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past
     * 30-day period are considered current customers and will be able to continue using the service.
     * </p>
     * 
     * @param describeAcceleratorTypesRequest
     * @return Result of the DescribeAcceleratorTypes operation returned by the service.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.DescribeAcceleratorTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorTypes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAcceleratorTypesResult describeAcceleratorTypes(DescribeAcceleratorTypesRequest describeAcceleratorTypesRequest);

    /**
     * <p>
     * Describes information over a provided set of accelerators belonging to an account.
     * </p>
     * <p>
     * February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and performance. After
     * April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon
     * SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past
     * 30-day period are considered current customers and will be able to continue using the service.
     * </p>
     * 
     * @param describeAcceleratorsRequest
     * @return Result of the DescribeAccelerators operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.DescribeAccelerators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAccelerators"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAcceleratorsResult describeAccelerators(DescribeAcceleratorsRequest describeAcceleratorsRequest);

    /**
     * <p>
     * Returns all tags of an Elastic Inference Accelerator.
     * </p>
     * <p>
     * February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and performance. After
     * April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon
     * SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past
     * 30-day period are considered current customers and will be able to continue using the service.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds the specified tags to an Elastic Inference Accelerator.
     * </p>
     * <p>
     * February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and performance. After
     * April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon
     * SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past
     * 30-day period are considered current customers and will be able to continue using the service.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from an Elastic Inference Accelerator.
     * </p>
     * <p>
     * February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI),
     * and will help current customers migrate their workloads to options that offer better price and performance. After
     * April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon
     * SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past
     * 30-day period are considered current customers and will be able to continue using the service.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         Raised when a malformed input has been provided to the API.
     * @throws ResourceNotFoundException
     *         Raised when the requested resource cannot be found.
     * @throws InternalServerException
     *         Raised when an unexpected error occurred during request processing.
     * @sample AmazonElasticInference.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
