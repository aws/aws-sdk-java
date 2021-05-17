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
 * Amazon Augmented AI (Amazon A2I) adds the benefit of human judgment to any machine learning application. When an AI
 * application can't evaluate data with a high degree of confidence, human reviewers can take over. This human review is
 * called a human review workflow. To create and start a human review workflow, you need three resources: a <i>worker
 * task template</i>, a <i>flow definition</i>, and a <i>human loop</i>.
 * </p>
 * <p>
 * For information about these resources and prerequisites for using Amazon A2I, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-getting-started.html">Get Started with Amazon Augmented
 * AI</a> in the Amazon SageMaker Developer Guide.
 * </p>
 * <p>
 * This API reference includes information about API actions and data types that you can use to interact with Amazon A2I
 * programmatically. Use this guide to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Start a human loop with the <code>StartHumanLoop</code> operation when using Amazon A2I with a <i>custom task
 * type</i>. To learn more about the difference between custom and built-in task types, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-task-types-general.html">Use Task Types </a>. To learn how
 * to start a human loop using this API, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-start-human-loop.html#a2i-instructions-starthumanloop"
 * >Create and Start a Human Loop for a Custom Task Type </a> in the Amazon SageMaker Developer Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * Manage your human loops. You can list all human loops that you have created, describe individual human loops, and
 * stop and delete human loops. To learn more, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-monitor-humanloop-results.html">Monitor and Manage Your
 * Human Loop </a> in the Amazon SageMaker Developer Guide.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Amazon A2I integrates APIs from various AWS services to create and start human review workflows for those services.
 * To learn how Amazon A2I uses these APIs, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/a2i-api-references.html">Use APIs in Amazon A2I</a> in the
 * Amazon SageMaker Developer Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAugmentedAIRuntimeAsync extends AmazonAugmentedAIRuntime {

    /**
     * <p>
     * Deletes the specified human loop for a flow definition.
     * </p>
     * <p>
     * If the human loop was deleted, this operation will return a <code>ResourceNotFoundException</code>.
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
     * <p>
     * If the human loop was deleted, this operation will return a <code>ResourceNotFoundException</code>.
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
     * Returns information about the specified human loop. If the human loop was deleted, this operation will return a
     * <code>ResourceNotFoundException</code> error.
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
     * Returns information about the specified human loop. If the human loop was deleted, this operation will return a
     * <code>ResourceNotFoundException</code> error.
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
