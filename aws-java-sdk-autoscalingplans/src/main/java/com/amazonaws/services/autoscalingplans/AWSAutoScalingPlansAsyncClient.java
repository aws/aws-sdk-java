/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscalingplans;

import javax.annotation.Generated;

import com.amazonaws.services.autoscalingplans.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Auto Scaling Plans asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSAutoScalingPlansAsyncClient extends AWSAutoScalingPlansClient implements AWSAutoScalingPlansAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSAutoScalingPlansAsyncClientBuilder asyncBuilder() {
        return AWSAutoScalingPlansAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Auto Scaling Plans using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSAutoScalingPlansAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateScalingPlanResult> createScalingPlanAsync(CreateScalingPlanRequest request) {

        return createScalingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateScalingPlanResult> createScalingPlanAsync(final CreateScalingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateScalingPlanRequest, CreateScalingPlanResult> asyncHandler) {
        final CreateScalingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateScalingPlanResult>() {
            @Override
            public CreateScalingPlanResult call() throws Exception {
                CreateScalingPlanResult result = null;

                try {
                    result = executeCreateScalingPlan(finalRequest);
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
    public java.util.concurrent.Future<DeleteScalingPlanResult> deleteScalingPlanAsync(DeleteScalingPlanRequest request) {

        return deleteScalingPlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScalingPlanResult> deleteScalingPlanAsync(final DeleteScalingPlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScalingPlanRequest, DeleteScalingPlanResult> asyncHandler) {
        final DeleteScalingPlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScalingPlanResult>() {
            @Override
            public DeleteScalingPlanResult call() throws Exception {
                DeleteScalingPlanResult result = null;

                try {
                    result = executeDeleteScalingPlan(finalRequest);
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
    public java.util.concurrent.Future<DescribeScalingPlanResourcesResult> describeScalingPlanResourcesAsync(DescribeScalingPlanResourcesRequest request) {

        return describeScalingPlanResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPlanResourcesResult> describeScalingPlanResourcesAsync(final DescribeScalingPlanResourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingPlanResourcesRequest, DescribeScalingPlanResourcesResult> asyncHandler) {
        final DescribeScalingPlanResourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalingPlanResourcesResult>() {
            @Override
            public DescribeScalingPlanResourcesResult call() throws Exception {
                DescribeScalingPlanResourcesResult result = null;

                try {
                    result = executeDescribeScalingPlanResources(finalRequest);
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
    public java.util.concurrent.Future<DescribeScalingPlansResult> describeScalingPlansAsync(DescribeScalingPlansRequest request) {

        return describeScalingPlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPlansResult> describeScalingPlansAsync(final DescribeScalingPlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingPlansRequest, DescribeScalingPlansResult> asyncHandler) {
        final DescribeScalingPlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalingPlansResult>() {
            @Override
            public DescribeScalingPlansResult call() throws Exception {
                DescribeScalingPlansResult result = null;

                try {
                    result = executeDescribeScalingPlans(finalRequest);
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
