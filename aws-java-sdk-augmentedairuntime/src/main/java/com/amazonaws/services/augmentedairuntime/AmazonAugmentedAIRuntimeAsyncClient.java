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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Augmented AI Runtime asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAugmentedAIRuntimeAsyncClient extends AmazonAugmentedAIRuntimeClient implements AmazonAugmentedAIRuntimeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonAugmentedAIRuntimeAsyncClientBuilder asyncBuilder() {
        return AmazonAugmentedAIRuntimeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Augmented AI Runtime using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonAugmentedAIRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon Augmented AI Runtime using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonAugmentedAIRuntimeAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<DeleteHumanLoopResult> deleteHumanLoopAsync(DeleteHumanLoopRequest request) {

        return deleteHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteHumanLoopResult> deleteHumanLoopAsync(final DeleteHumanLoopRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteHumanLoopRequest, DeleteHumanLoopResult> asyncHandler) {
        final DeleteHumanLoopRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteHumanLoopResult>() {
            @Override
            public DeleteHumanLoopResult call() throws Exception {
                DeleteHumanLoopResult result = null;

                try {
                    result = executeDeleteHumanLoop(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeHumanLoopResult> describeHumanLoopAsync(DescribeHumanLoopRequest request) {

        return describeHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHumanLoopResult> describeHumanLoopAsync(final DescribeHumanLoopRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHumanLoopRequest, DescribeHumanLoopResult> asyncHandler) {
        final DescribeHumanLoopRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHumanLoopResult>() {
            @Override
            public DescribeHumanLoopResult call() throws Exception {
                DescribeHumanLoopResult result = null;

                try {
                    result = executeDescribeHumanLoop(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListHumanLoopsResult> listHumanLoopsAsync(ListHumanLoopsRequest request) {

        return listHumanLoopsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListHumanLoopsResult> listHumanLoopsAsync(final ListHumanLoopsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListHumanLoopsRequest, ListHumanLoopsResult> asyncHandler) {
        final ListHumanLoopsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListHumanLoopsResult>() {
            @Override
            public ListHumanLoopsResult call() throws Exception {
                ListHumanLoopsResult result = null;

                try {
                    result = executeListHumanLoops(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartHumanLoopResult> startHumanLoopAsync(StartHumanLoopRequest request) {

        return startHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartHumanLoopResult> startHumanLoopAsync(final StartHumanLoopRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartHumanLoopRequest, StartHumanLoopResult> asyncHandler) {
        final StartHumanLoopRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartHumanLoopResult>() {
            @Override
            public StartHumanLoopResult call() throws Exception {
                StartHumanLoopResult result = null;

                try {
                    result = executeStartHumanLoop(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopHumanLoopResult> stopHumanLoopAsync(StopHumanLoopRequest request) {

        return stopHumanLoopAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopHumanLoopResult> stopHumanLoopAsync(final StopHumanLoopRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopHumanLoopRequest, StopHumanLoopResult> asyncHandler) {
        final StopHumanLoopRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopHumanLoopResult>() {
            @Override
            public StopHumanLoopResult call() throws Exception {
                StopHumanLoopResult result = null;

                try {
                    result = executeStopHumanLoop(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
