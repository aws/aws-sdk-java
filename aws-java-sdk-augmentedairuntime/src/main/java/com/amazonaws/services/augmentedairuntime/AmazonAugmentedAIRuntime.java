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
package com.amazonaws.services.augmentedairuntime;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.augmentedairuntime.model.*;

/**
 * Interface for accessing Amazon Augmented AI Runtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.augmentedairuntime.AbstractAmazonAugmentedAIRuntime} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Augmented AI (Augmented AI) (Preview) is a service that adds human judgment to any machine learning
 * application. Human reviewers can take over when an AI application can't evaluate data with a high degree of
 * confidence.
 * </p>
 * <p>
 * From fraudulent bank transaction identification to document processing to image analysis, machine learning models can
 * be trained to make decisions as well as or better than a human. Nevertheless, some decisions require contextual
 * interpretation, such as when you need to decide whether an image is appropriate for a given audience. Content
 * moderation guidelines are nuanced and highly dependent on context, and they vary between countries. When trying to
 * apply AI in these situations, you can be forced to choose between "ML only" systems with unacceptably high error
 * rates or "human only" systems that are expensive and difficult to scale, and that slow down decision making.
 * </p>
 * <p>
 * This API reference includes information about API actions and data types you can use to interact with Augmented AI
 * programmatically.
 * </p>
 * <p>
 * You can create a flow definition against the Augmented AI API. Provide the Amazon Resource Name (ARN) of a flow
 * definition to integrate AI service APIs, such as <code>Textract.AnalyzeDocument</code> and
 * <code>Rekognition.DetectModerationLabels</code>. These AI services, in turn, invoke the <a>StartHumanLoop</a> API,
 * which evaluates conditions under which humans will be invoked. If humans are required, Augmented AI creates a human
 * loop. Results of human work are available asynchronously in Amazon Simple Storage Service (Amazon S3). You can use
 * Amazon CloudWatch Events to detect human work results.
 * </p>
 * <p>
 * You can find additional Augmented AI API documentation in the following reference guides: <a
 * href="https://docs.aws.amazon.com/rekognition/latest/dg/API_Reference.html">Amazon Rekognition</a>, <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_Reference.html">Amazon SageMaker</a>, and <a
 * href="https://docs.aws.amazon.com/textract/latest/dg/API_Reference.html">Amazon Textract</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAugmentedAIRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "a2i-runtime.sagemaker";

    /**
     * <p>
     * Deletes the specified human loop for a flow definition.
     * </p>
     * 
     * @param deleteHumanLoopRequest
     * @return Result of the DeleteHumanLoop operation returned by the service.
     * @throws ValidationException
     *         Your request was not valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We were unable to find the requested resource.
     * @throws ThrottlingException
     *         Your request has exceeded the allowed amount of requests.
     * @throws InternalServerException
     *         Your request could not be processed.
     * @sample AmazonAugmentedAIRuntime.DeleteHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DeleteHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteHumanLoopResult deleteHumanLoop(DeleteHumanLoopRequest deleteHumanLoopRequest);

    /**
     * <p>
     * Returns information about the specified human loop.
     * </p>
     * 
     * @param describeHumanLoopRequest
     * @return Result of the DescribeHumanLoop operation returned by the service.
     * @throws ValidationException
     *         Your request was not valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We were unable to find the requested resource.
     * @throws ThrottlingException
     *         Your request has exceeded the allowed amount of requests.
     * @throws InternalServerException
     *         Your request could not be processed.
     * @sample AmazonAugmentedAIRuntime.DescribeHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DescribeHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeHumanLoopResult describeHumanLoop(DescribeHumanLoopRequest describeHumanLoopRequest);

    /**
     * <p>
     * Returns information about human loops, given the specified parameters. If a human loop was deleted, it will not
     * be included.
     * </p>
     * 
     * @param listHumanLoopsRequest
     * @return Result of the ListHumanLoops operation returned by the service.
     * @throws ValidationException
     *         Your request was not valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         Your request has exceeded the allowed amount of requests.
     * @throws InternalServerException
     *         Your request could not be processed.
     * @sample AmazonAugmentedAIRuntime.ListHumanLoops
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/ListHumanLoops"
     *      target="_top">AWS API Documentation</a>
     */
    ListHumanLoopsResult listHumanLoops(ListHumanLoopsRequest listHumanLoopsRequest);

    /**
     * <p>
     * Starts a human loop, provided that at least one activation condition is met.
     * </p>
     * 
     * @param startHumanLoopRequest
     * @return Result of the StartHumanLoop operation returned by the service.
     * @throws ValidationException
     *         Your request was not valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         Your request has exceeded the allowed amount of requests.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or request a service quota increase.
     * @throws InternalServerException
     *         Your request could not be processed.
     * @throws ConflictException
     *         Your request has the same name as another active human loop but has different input data. You cannot
     *         start two human loops with the same name and different input data.
     * @sample AmazonAugmentedAIRuntime.StartHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StartHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    StartHumanLoopResult startHumanLoop(StartHumanLoopRequest startHumanLoopRequest);

    /**
     * <p>
     * Stops the specified human loop.
     * </p>
     * 
     * @param stopHumanLoopRequest
     * @return Result of the StopHumanLoop operation returned by the service.
     * @throws ValidationException
     *         Your request was not valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We were unable to find the requested resource.
     * @throws ThrottlingException
     *         Your request has exceeded the allowed amount of requests.
     * @throws InternalServerException
     *         Your request could not be processed.
     * @sample AmazonAugmentedAIRuntime.StopHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StopHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    StopHumanLoopResult stopHumanLoop(StopHumanLoopRequest stopHumanLoopRequest);

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
