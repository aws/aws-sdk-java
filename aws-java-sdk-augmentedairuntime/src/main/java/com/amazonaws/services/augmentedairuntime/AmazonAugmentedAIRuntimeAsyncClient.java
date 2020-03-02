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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon Augmented AI Runtime asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
        super(asyncClientParams);
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
