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

import com.amazonaws.services.augmentedairuntime.model.*;

/**
 * Interface for accessing Amazon Augmented AI Runtime asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.augmentedairuntime.AbstractAmazonAugmentedAIRuntimeAsync} instead.
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
public interface AmazonAugmentedAIRuntimeAsync extends AmazonAugmentedAIRuntime {

    /**
     * <p>
     * Deletes the specified human loop for a flow definition.
     * </p>
     * 
     * @param deleteHumanLoopRequest
     * @return A Java Future containing the result of the DeleteHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsync.DeleteHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DeleteHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHumanLoopResult> deleteHumanLoopAsync(DeleteHumanLoopRequest deleteHumanLoopRequest);

    /**
     * <p>
     * Deletes the specified human loop for a flow definition.
     * </p>
     * 
     * @param deleteHumanLoopRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsyncHandler.DeleteHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DeleteHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteHumanLoopResult> deleteHumanLoopAsync(DeleteHumanLoopRequest deleteHumanLoopRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHumanLoopRequest, DeleteHumanLoopResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified human loop.
     * </p>
     * 
     * @param describeHumanLoopRequest
     * @return A Java Future containing the result of the DescribeHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsync.DescribeHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DescribeHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHumanLoopResult> describeHumanLoopAsync(DescribeHumanLoopRequest describeHumanLoopRequest);

    /**
     * <p>
     * Returns information about the specified human loop.
     * </p>
     * 
     * @param describeHumanLoopRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsyncHandler.DescribeHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DescribeHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeHumanLoopResult> describeHumanLoopAsync(DescribeHumanLoopRequest describeHumanLoopRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHumanLoopRequest, DescribeHumanLoopResult> asyncHandler);

    /**
     * <p>
     * Returns information about human loops, given the specified parameters. If a human loop was deleted, it will not
     * be included.
     * </p>
     * 
     * @param listHumanLoopsRequest
     * @return A Java Future containing the result of the ListHumanLoops operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsync.ListHumanLoops
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/ListHumanLoops"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHumanLoopsResult> listHumanLoopsAsync(ListHumanLoopsRequest listHumanLoopsRequest);

    /**
     * <p>
     * Returns information about human loops, given the specified parameters. If a human loop was deleted, it will not
     * be included.
     * </p>
     * 
     * @param listHumanLoopsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHumanLoops operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsyncHandler.ListHumanLoops
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/ListHumanLoops"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListHumanLoopsResult> listHumanLoopsAsync(ListHumanLoopsRequest listHumanLoopsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHumanLoopsRequest, ListHumanLoopsResult> asyncHandler);

    /**
     * <p>
     * Starts a human loop, provided that at least one activation condition is met.
     * </p>
     * 
     * @param startHumanLoopRequest
     * @return A Java Future containing the result of the StartHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsync.StartHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StartHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartHumanLoopResult> startHumanLoopAsync(StartHumanLoopRequest startHumanLoopRequest);

    /**
     * <p>
     * Starts a human loop, provided that at least one activation condition is met.
     * </p>
     * 
     * @param startHumanLoopRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsyncHandler.StartHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StartHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartHumanLoopResult> startHumanLoopAsync(StartHumanLoopRequest startHumanLoopRequest,
            com.amazonaws.handlers.AsyncHandler<StartHumanLoopRequest, StartHumanLoopResult> asyncHandler);

    /**
     * <p>
     * Stops the specified human loop.
     * </p>
     * 
     * @param stopHumanLoopRequest
     * @return A Java Future containing the result of the StopHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsync.StopHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StopHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopHumanLoopResult> stopHumanLoopAsync(StopHumanLoopRequest stopHumanLoopRequest);

    /**
     * <p>
     * Stops the specified human loop.
     * </p>
     * 
     * @param stopHumanLoopRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopHumanLoop operation returned by the service.
     * @sample AmazonAugmentedAIRuntimeAsyncHandler.StopHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StopHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopHumanLoopResult> stopHumanLoopAsync(StopHumanLoopRequest stopHumanLoopRequest,
            com.amazonaws.handlers.AsyncHandler<StopHumanLoopRequest, StopHumanLoopResult> asyncHandler);

}
