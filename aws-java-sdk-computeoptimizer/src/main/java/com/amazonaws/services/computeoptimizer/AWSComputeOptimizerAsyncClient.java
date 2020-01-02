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
package com.amazonaws.services.computeoptimizer;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Compute Optimizer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Compute Optimizer is a service that analyzes the configuration and utilization metrics of your AWS resources,
 * such as EC2 instances and Auto Scaling groups. It reports whether your resources are optimal, and generates
 * optimization recommendations to reduce the cost and improve the performance of your workloads. Compute Optimizer also
 * provides recent utilization metric data, as well as projected utilization metric data for the recommendations, which
 * you can use to evaluate which recommendation provides the best price-performance trade-off. The analysis of your
 * usage patterns can help you decide when to move or resize your running resources, and still meet your performance and
 * capacity requirements. For more information about Compute Optimizer, see the <a
 * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">AWS Compute Optimizer User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSComputeOptimizerAsyncClient extends AWSComputeOptimizerClient implements AWSComputeOptimizerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSComputeOptimizerAsyncClientBuilder asyncBuilder() {
        return AWSComputeOptimizerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Compute Optimizer using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSComputeOptimizerAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<GetAutoScalingGroupRecommendationsResult> getAutoScalingGroupRecommendationsAsync(
            GetAutoScalingGroupRecommendationsRequest request) {

        return getAutoScalingGroupRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAutoScalingGroupRecommendationsResult> getAutoScalingGroupRecommendationsAsync(
            final GetAutoScalingGroupRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAutoScalingGroupRecommendationsRequest, GetAutoScalingGroupRecommendationsResult> asyncHandler) {
        final GetAutoScalingGroupRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAutoScalingGroupRecommendationsResult>() {
            @Override
            public GetAutoScalingGroupRecommendationsResult call() throws Exception {
                GetAutoScalingGroupRecommendationsResult result = null;

                try {
                    result = executeGetAutoScalingGroupRecommendations(finalRequest);
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
    public java.util.concurrent.Future<GetEC2InstanceRecommendationsResult> getEC2InstanceRecommendationsAsync(GetEC2InstanceRecommendationsRequest request) {

        return getEC2InstanceRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEC2InstanceRecommendationsResult> getEC2InstanceRecommendationsAsync(
            final GetEC2InstanceRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEC2InstanceRecommendationsRequest, GetEC2InstanceRecommendationsResult> asyncHandler) {
        final GetEC2InstanceRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEC2InstanceRecommendationsResult>() {
            @Override
            public GetEC2InstanceRecommendationsResult call() throws Exception {
                GetEC2InstanceRecommendationsResult result = null;

                try {
                    result = executeGetEC2InstanceRecommendations(finalRequest);
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
    public java.util.concurrent.Future<GetEC2RecommendationProjectedMetricsResult> getEC2RecommendationProjectedMetricsAsync(
            GetEC2RecommendationProjectedMetricsRequest request) {

        return getEC2RecommendationProjectedMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEC2RecommendationProjectedMetricsResult> getEC2RecommendationProjectedMetricsAsync(
            final GetEC2RecommendationProjectedMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEC2RecommendationProjectedMetricsRequest, GetEC2RecommendationProjectedMetricsResult> asyncHandler) {
        final GetEC2RecommendationProjectedMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEC2RecommendationProjectedMetricsResult>() {
            @Override
            public GetEC2RecommendationProjectedMetricsResult call() throws Exception {
                GetEC2RecommendationProjectedMetricsResult result = null;

                try {
                    result = executeGetEC2RecommendationProjectedMetrics(finalRequest);
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
    public java.util.concurrent.Future<GetEnrollmentStatusResult> getEnrollmentStatusAsync(GetEnrollmentStatusRequest request) {

        return getEnrollmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnrollmentStatusResult> getEnrollmentStatusAsync(final GetEnrollmentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnrollmentStatusRequest, GetEnrollmentStatusResult> asyncHandler) {
        final GetEnrollmentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnrollmentStatusResult>() {
            @Override
            public GetEnrollmentStatusResult call() throws Exception {
                GetEnrollmentStatusResult result = null;

                try {
                    result = executeGetEnrollmentStatus(finalRequest);
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
    public java.util.concurrent.Future<GetRecommendationSummariesResult> getRecommendationSummariesAsync(GetRecommendationSummariesRequest request) {

        return getRecommendationSummariesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationSummariesResult> getRecommendationSummariesAsync(final GetRecommendationSummariesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecommendationSummariesRequest, GetRecommendationSummariesResult> asyncHandler) {
        final GetRecommendationSummariesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecommendationSummariesResult>() {
            @Override
            public GetRecommendationSummariesResult call() throws Exception {
                GetRecommendationSummariesResult result = null;

                try {
                    result = executeGetRecommendationSummaries(finalRequest);
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
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(UpdateEnrollmentStatusRequest request) {

        return updateEnrollmentStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEnrollmentStatusResult> updateEnrollmentStatusAsync(final UpdateEnrollmentStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateEnrollmentStatusRequest, UpdateEnrollmentStatusResult> asyncHandler) {
        final UpdateEnrollmentStatusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateEnrollmentStatusResult>() {
            @Override
            public UpdateEnrollmentStatusResult call() throws Exception {
                UpdateEnrollmentStatusResult result = null;

                try {
                    result = executeUpdateEnrollmentStatus(finalRequest);
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
