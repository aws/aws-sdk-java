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
     * <p>
     * If the human loop was deleted, this operation will return a <code>ResourceNotFoundException</code>.
     * </p>
     * 
     * @param deleteHumanLoopRequest
     * @return Result of the DeleteHumanLoop operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @sample AmazonAugmentedAIRuntime.DeleteHumanLoop
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/DeleteHumanLoop"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteHumanLoopResult deleteHumanLoop(DeleteHumanLoopRequest deleteHumanLoopRequest);

    /**
     * <p>
     * Returns information about the specified human loop. If the human loop was deleted, this operation will return a
     * <code>ResourceNotFoundException</code> error.
     * </p>
     * 
     * @param describeHumanLoopRequest
     * @return Result of the DescribeHumanLoop operation returned by the service.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
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
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
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
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws ServiceQuotaExceededException
     *         You exceeded your service quota. Service quotas, also referred to as limits, are the maximum number of
     *         service resources or operations for your AWS account. For a list of Amazon A2I service quotes, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/a2i.html">Amazon Augmented AI Service Quotes</a>.
     *         Delete some resources or request an increase in your service quota. You can request a quota increase
     *         using Service Quotas or the AWS Support Center. To request an increase, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Quotas</a> in
     *         the <i>AWS General Reference</i>.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
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
     *         The request isn't valid. Check the syntax and try again.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         AWS Region as your request, and try your request again.
     * @throws ThrottlingException
     *         You exceeded the maximum number of requests.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
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
