/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Compute Optimizer is a service that analyzes the configuration and utilization metrics of your Amazon Web Services
 * compute resources, such as Amazon EC2 instances, Amazon EC2 Auto Scaling groups, Lambda functions, Amazon EBS
 * volumes, and Amazon ECS services on Fargate. It reports whether your resources are optimal, and generates
 * optimization recommendations to reduce the cost and improve the performance of your workloads. Compute Optimizer also
 * provides recent utilization metric data, in addition to projected utilization metric data for the recommendations,
 * which you can use to evaluate which recommendation provides the best price-performance trade-off. The analysis of
 * your usage patterns can help you decide when to move or resize your running resources, and still meet your
 * performance and capacity requirements. For more information about Compute Optimizer, including the required
 * permissions to use the service, see the <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/">Compute
 * Optimizer User Guide</a>.
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
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Compute Optimizer using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSComputeOptimizerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<DeleteRecommendationPreferencesResult> deleteRecommendationPreferencesAsync(
            DeleteRecommendationPreferencesRequest request) {

        return deleteRecommendationPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRecommendationPreferencesResult> deleteRecommendationPreferencesAsync(
            final DeleteRecommendationPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRecommendationPreferencesRequest, DeleteRecommendationPreferencesResult> asyncHandler) {
        final DeleteRecommendationPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRecommendationPreferencesResult>() {
            @Override
            public DeleteRecommendationPreferencesResult call() throws Exception {
                DeleteRecommendationPreferencesResult result = null;

                try {
                    result = executeDeleteRecommendationPreferences(finalRequest);
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
    public java.util.concurrent.Future<DescribeRecommendationExportJobsResult> describeRecommendationExportJobsAsync(
            DescribeRecommendationExportJobsRequest request) {

        return describeRecommendationExportJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationExportJobsResult> describeRecommendationExportJobsAsync(
            final DescribeRecommendationExportJobsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecommendationExportJobsRequest, DescribeRecommendationExportJobsResult> asyncHandler) {
        final DescribeRecommendationExportJobsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecommendationExportJobsResult>() {
            @Override
            public DescribeRecommendationExportJobsResult call() throws Exception {
                DescribeRecommendationExportJobsResult result = null;

                try {
                    result = executeDescribeRecommendationExportJobs(finalRequest);
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
    public java.util.concurrent.Future<ExportAutoScalingGroupRecommendationsResult> exportAutoScalingGroupRecommendationsAsync(
            ExportAutoScalingGroupRecommendationsRequest request) {

        return exportAutoScalingGroupRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportAutoScalingGroupRecommendationsResult> exportAutoScalingGroupRecommendationsAsync(
            final ExportAutoScalingGroupRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportAutoScalingGroupRecommendationsRequest, ExportAutoScalingGroupRecommendationsResult> asyncHandler) {
        final ExportAutoScalingGroupRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportAutoScalingGroupRecommendationsResult>() {
            @Override
            public ExportAutoScalingGroupRecommendationsResult call() throws Exception {
                ExportAutoScalingGroupRecommendationsResult result = null;

                try {
                    result = executeExportAutoScalingGroupRecommendations(finalRequest);
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
    public java.util.concurrent.Future<ExportEBSVolumeRecommendationsResult> exportEBSVolumeRecommendationsAsync(ExportEBSVolumeRecommendationsRequest request) {

        return exportEBSVolumeRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportEBSVolumeRecommendationsResult> exportEBSVolumeRecommendationsAsync(
            final ExportEBSVolumeRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportEBSVolumeRecommendationsRequest, ExportEBSVolumeRecommendationsResult> asyncHandler) {
        final ExportEBSVolumeRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportEBSVolumeRecommendationsResult>() {
            @Override
            public ExportEBSVolumeRecommendationsResult call() throws Exception {
                ExportEBSVolumeRecommendationsResult result = null;

                try {
                    result = executeExportEBSVolumeRecommendations(finalRequest);
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
    public java.util.concurrent.Future<ExportEC2InstanceRecommendationsResult> exportEC2InstanceRecommendationsAsync(
            ExportEC2InstanceRecommendationsRequest request) {

        return exportEC2InstanceRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportEC2InstanceRecommendationsResult> exportEC2InstanceRecommendationsAsync(
            final ExportEC2InstanceRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportEC2InstanceRecommendationsRequest, ExportEC2InstanceRecommendationsResult> asyncHandler) {
        final ExportEC2InstanceRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportEC2InstanceRecommendationsResult>() {
            @Override
            public ExportEC2InstanceRecommendationsResult call() throws Exception {
                ExportEC2InstanceRecommendationsResult result = null;

                try {
                    result = executeExportEC2InstanceRecommendations(finalRequest);
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
    public java.util.concurrent.Future<ExportECSServiceRecommendationsResult> exportECSServiceRecommendationsAsync(
            ExportECSServiceRecommendationsRequest request) {

        return exportECSServiceRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportECSServiceRecommendationsResult> exportECSServiceRecommendationsAsync(
            final ExportECSServiceRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportECSServiceRecommendationsRequest, ExportECSServiceRecommendationsResult> asyncHandler) {
        final ExportECSServiceRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportECSServiceRecommendationsResult>() {
            @Override
            public ExportECSServiceRecommendationsResult call() throws Exception {
                ExportECSServiceRecommendationsResult result = null;

                try {
                    result = executeExportECSServiceRecommendations(finalRequest);
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
    public java.util.concurrent.Future<ExportLambdaFunctionRecommendationsResult> exportLambdaFunctionRecommendationsAsync(
            ExportLambdaFunctionRecommendationsRequest request) {

        return exportLambdaFunctionRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ExportLambdaFunctionRecommendationsResult> exportLambdaFunctionRecommendationsAsync(
            final ExportLambdaFunctionRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ExportLambdaFunctionRecommendationsRequest, ExportLambdaFunctionRecommendationsResult> asyncHandler) {
        final ExportLambdaFunctionRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ExportLambdaFunctionRecommendationsResult>() {
            @Override
            public ExportLambdaFunctionRecommendationsResult call() throws Exception {
                ExportLambdaFunctionRecommendationsResult result = null;

                try {
                    result = executeExportLambdaFunctionRecommendations(finalRequest);
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
    public java.util.concurrent.Future<GetEBSVolumeRecommendationsResult> getEBSVolumeRecommendationsAsync(GetEBSVolumeRecommendationsRequest request) {

        return getEBSVolumeRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEBSVolumeRecommendationsResult> getEBSVolumeRecommendationsAsync(final GetEBSVolumeRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEBSVolumeRecommendationsRequest, GetEBSVolumeRecommendationsResult> asyncHandler) {
        final GetEBSVolumeRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEBSVolumeRecommendationsResult>() {
            @Override
            public GetEBSVolumeRecommendationsResult call() throws Exception {
                GetEBSVolumeRecommendationsResult result = null;

                try {
                    result = executeGetEBSVolumeRecommendations(finalRequest);
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
    public java.util.concurrent.Future<GetECSServiceRecommendationProjectedMetricsResult> getECSServiceRecommendationProjectedMetricsAsync(
            GetECSServiceRecommendationProjectedMetricsRequest request) {

        return getECSServiceRecommendationProjectedMetricsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetECSServiceRecommendationProjectedMetricsResult> getECSServiceRecommendationProjectedMetricsAsync(
            final GetECSServiceRecommendationProjectedMetricsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetECSServiceRecommendationProjectedMetricsRequest, GetECSServiceRecommendationProjectedMetricsResult> asyncHandler) {
        final GetECSServiceRecommendationProjectedMetricsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetECSServiceRecommendationProjectedMetricsResult>() {
            @Override
            public GetECSServiceRecommendationProjectedMetricsResult call() throws Exception {
                GetECSServiceRecommendationProjectedMetricsResult result = null;

                try {
                    result = executeGetECSServiceRecommendationProjectedMetrics(finalRequest);
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
    public java.util.concurrent.Future<GetECSServiceRecommendationsResult> getECSServiceRecommendationsAsync(GetECSServiceRecommendationsRequest request) {

        return getECSServiceRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetECSServiceRecommendationsResult> getECSServiceRecommendationsAsync(final GetECSServiceRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetECSServiceRecommendationsRequest, GetECSServiceRecommendationsResult> asyncHandler) {
        final GetECSServiceRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetECSServiceRecommendationsResult>() {
            @Override
            public GetECSServiceRecommendationsResult call() throws Exception {
                GetECSServiceRecommendationsResult result = null;

                try {
                    result = executeGetECSServiceRecommendations(finalRequest);
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
    public java.util.concurrent.Future<GetEffectiveRecommendationPreferencesResult> getEffectiveRecommendationPreferencesAsync(
            GetEffectiveRecommendationPreferencesRequest request) {

        return getEffectiveRecommendationPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEffectiveRecommendationPreferencesResult> getEffectiveRecommendationPreferencesAsync(
            final GetEffectiveRecommendationPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEffectiveRecommendationPreferencesRequest, GetEffectiveRecommendationPreferencesResult> asyncHandler) {
        final GetEffectiveRecommendationPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEffectiveRecommendationPreferencesResult>() {
            @Override
            public GetEffectiveRecommendationPreferencesResult call() throws Exception {
                GetEffectiveRecommendationPreferencesResult result = null;

                try {
                    result = executeGetEffectiveRecommendationPreferences(finalRequest);
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
    public java.util.concurrent.Future<GetEnrollmentStatusesForOrganizationResult> getEnrollmentStatusesForOrganizationAsync(
            GetEnrollmentStatusesForOrganizationRequest request) {

        return getEnrollmentStatusesForOrganizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnrollmentStatusesForOrganizationResult> getEnrollmentStatusesForOrganizationAsync(
            final GetEnrollmentStatusesForOrganizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnrollmentStatusesForOrganizationRequest, GetEnrollmentStatusesForOrganizationResult> asyncHandler) {
        final GetEnrollmentStatusesForOrganizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnrollmentStatusesForOrganizationResult>() {
            @Override
            public GetEnrollmentStatusesForOrganizationResult call() throws Exception {
                GetEnrollmentStatusesForOrganizationResult result = null;

                try {
                    result = executeGetEnrollmentStatusesForOrganization(finalRequest);
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
    public java.util.concurrent.Future<GetLambdaFunctionRecommendationsResult> getLambdaFunctionRecommendationsAsync(
            GetLambdaFunctionRecommendationsRequest request) {

        return getLambdaFunctionRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLambdaFunctionRecommendationsResult> getLambdaFunctionRecommendationsAsync(
            final GetLambdaFunctionRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLambdaFunctionRecommendationsRequest, GetLambdaFunctionRecommendationsResult> asyncHandler) {
        final GetLambdaFunctionRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLambdaFunctionRecommendationsResult>() {
            @Override
            public GetLambdaFunctionRecommendationsResult call() throws Exception {
                GetLambdaFunctionRecommendationsResult result = null;

                try {
                    result = executeGetLambdaFunctionRecommendations(finalRequest);
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
    public java.util.concurrent.Future<GetRecommendationPreferencesResult> getRecommendationPreferencesAsync(GetRecommendationPreferencesRequest request) {

        return getRecommendationPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecommendationPreferencesResult> getRecommendationPreferencesAsync(final GetRecommendationPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecommendationPreferencesRequest, GetRecommendationPreferencesResult> asyncHandler) {
        final GetRecommendationPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRecommendationPreferencesResult>() {
            @Override
            public GetRecommendationPreferencesResult call() throws Exception {
                GetRecommendationPreferencesResult result = null;

                try {
                    result = executeGetRecommendationPreferences(finalRequest);
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
    public java.util.concurrent.Future<PutRecommendationPreferencesResult> putRecommendationPreferencesAsync(PutRecommendationPreferencesRequest request) {

        return putRecommendationPreferencesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecommendationPreferencesResult> putRecommendationPreferencesAsync(final PutRecommendationPreferencesRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecommendationPreferencesRequest, PutRecommendationPreferencesResult> asyncHandler) {
        final PutRecommendationPreferencesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRecommendationPreferencesResult>() {
            @Override
            public PutRecommendationPreferencesResult call() throws Exception {
                PutRecommendationPreferencesResult result = null;

                try {
                    result = executePutRecommendationPreferences(finalRequest);
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
